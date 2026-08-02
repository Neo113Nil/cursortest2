package io.sentry.android.core.internal.tombstone;

import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryStackTraceFactory;
import io.sentry.android.core.internal.tombstone.TombstoneProtos;
import io.sentry.android.core.internal.util.NativeEventUtils;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes9.dex */
public class TombstoneParser implements Closeable {
    private final Map<String, String> excTypeValueMap;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final String nativeLibraryDir;
    private final InputStream tombstoneStream;

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatHex(long j) {
        return String.format("0x%x", Long.valueOf(j));
    }

    public TombstoneParser(InputStream inputStream, List<String> list, List<String> list2, String str) {
        HashMap hashMap = new HashMap();
        this.excTypeValueMap = hashMap;
        this.tombstoneStream = inputStream;
        this.inAppIncludes = list;
        this.inAppExcludes = list2;
        this.nativeLibraryDir = str;
        hashMap.put("SIGILL", "IllegalInstruction");
        hashMap.put("SIGTRAP", "Trap");
        hashMap.put("SIGABRT", "Abort");
        hashMap.put("SIGBUS", "BusError");
        hashMap.put("SIGFPE", "FloatingPointException");
        hashMap.put("SIGSEGV", "Segfault");
    }

    public SentryEvent parse() throws IOException {
        TombstoneProtos.Tombstone parseFrom = TombstoneProtos.Tombstone.parseFrom(this.tombstoneStream);
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.setLevel(SentryLevel.FATAL);
        sentryEvent.setPlatform("native");
        sentryEvent.setMessage(constructMessage(parseFrom));
        sentryEvent.setDebugMeta(createDebugMeta(parseFrom));
        sentryEvent.setExceptions(createException(parseFrom));
        sentryEvent.setThreads(createThreads(parseFrom, (SentryException) ((List) Objects.requireNonNull(sentryEvent.getExceptions())).get(0)));
        return sentryEvent;
    }

    private List<SentryThread> createThreads(TombstoneProtos.Tombstone tombstone, SentryException sentryException) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, TombstoneProtos.Thread>> it = tombstone.getThreadsMap().entrySet().iterator();
        while (it.hasNext()) {
            TombstoneProtos.Thread value = it.next().getValue();
            SentryThread sentryThread = new SentryThread();
            sentryThread.setId(Long.valueOf(r2.getKey().intValue()));
            sentryThread.setName(value.getName());
            SentryStackTrace createStackTrace = createStackTrace(value);
            sentryThread.setStacktrace(createStackTrace);
            if (tombstone.getTid() == value.getId()) {
                sentryThread.setCrashed(true);
                sentryException.setStacktrace(createStackTrace);
            }
            arrayList.add(sentryThread);
        }
        return arrayList;
    }

    private SentryStackTrace createStackTrace(TombstoneProtos.Thread thread) {
        Boolean isInApp;
        ArrayList arrayList = new ArrayList();
        for (TombstoneProtos.BacktraceFrame backtraceFrame : thread.getCurrentBacktraceList()) {
            if (!backtraceFrame.getFileName().endsWith("libart.so") && (!backtraceFrame.getFileName().startsWith("<anonymous") || !backtraceFrame.getFunctionName().isEmpty())) {
                SentryStackFrame sentryStackFrame = new SentryStackFrame();
                sentryStackFrame.setPackage(backtraceFrame.getFileName());
                sentryStackFrame.setFunction(backtraceFrame.getFunctionName());
                sentryStackFrame.setInstructionAddr(formatHex(backtraceFrame.getPc()));
                String functionName = backtraceFrame.getFunctionName();
                if (functionName.isEmpty()) {
                    isInApp = Boolean.FALSE;
                } else {
                    isInApp = SentryStackTraceFactory.isInApp(functionName, this.inAppIncludes, this.inAppExcludes);
                }
                boolean z = true;
                boolean z2 = this.nativeLibraryDir != null && backtraceFrame.getFileName().startsWith(this.nativeLibraryDir);
                if ((isInApp == null || !isInApp.booleanValue()) && !z2) {
                    z = false;
                }
                sentryStackFrame.setInApp(Boolean.valueOf(z));
                arrayList.add(0, sentryStackFrame);
            }
        }
        SentryStackTrace sentryStackTrace = new SentryStackTrace();
        sentryStackTrace.setFrames(arrayList);
        sentryStackTrace.setInstructionAddressAdjustment(SentryStackTrace.InstructionAddressAdjustment.NONE);
        HashMap hashMap = new HashMap();
        for (TombstoneProtos.Register register : thread.getRegistersList()) {
            hashMap.put(register.getName(), formatHex(register.getU64()));
        }
        sentryStackTrace.setRegisters(hashMap);
        return sentryStackTrace;
    }

    private List<SentryException> createException(TombstoneProtos.Tombstone tombstone) {
        SentryException sentryException = new SentryException();
        if (tombstone.hasSignalInfo()) {
            TombstoneProtos.Signal signalInfo = tombstone.getSignalInfo();
            sentryException.setType(signalInfo.getName());
            sentryException.setValue(this.excTypeValueMap.get(signalInfo.getName()));
            sentryException.setMechanism(createMechanismFromSignalInfo(signalInfo));
        }
        sentryException.setThreadId(Long.valueOf(tombstone.getTid()));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryException);
        return arrayList;
    }

    private static Mechanism createMechanismFromSignalInfo(TombstoneProtos.Signal signal) {
        Mechanism mechanism = new Mechanism();
        mechanism.setType(NativeExceptionMechanism.TOMBSTONE.getValue());
        mechanism.setHandled(false);
        mechanism.setSynthetic(true);
        HashMap hashMap = new HashMap();
        hashMap.put("number", Integer.valueOf(signal.getNumber()));
        hashMap.put("name", signal.getName());
        hashMap.put("code", Integer.valueOf(signal.getCode()));
        hashMap.put("code_name", signal.getCodeName());
        mechanism.setMeta(hashMap);
        return mechanism;
    }

    private Message constructMessage(TombstoneProtos.Tombstone tombstone) {
        String str;
        Message message = new Message();
        TombstoneProtos.Signal signalInfo = tombstone.getSignalInfo();
        String m = UByte$$ExternalSyntheticBackport0.m((CharSequence) " ", (Iterable) tombstone.getCommandLineList());
        if (tombstone.hasSignalInfo()) {
            String abortMessage = tombstone.getAbortMessage();
            Locale locale = Locale.ROOT;
            if (abortMessage.isEmpty()) {
                str = "";
            } else {
                str = abortMessage + ": ";
            }
            message.setFormatted(String.format(locale, "%sFatal signal %s (%d), %s (%d), pid = %d (%s)", str, signalInfo.getName(), Integer.valueOf(signalInfo.getNumber()), signalInfo.getCodeName(), Integer.valueOf(signalInfo.getCode()), Integer.valueOf(tombstone.getPid()), m));
            return message;
        }
        message.setFormatted(String.format(Locale.ROOT, "Fatal exit pid = %d (%s)", Integer.valueOf(tombstone.getPid()), m));
        return message;
    }

    private static class ModuleAccumulator {
        long beginAddress;
        String buildId;
        long endAddress;
        String mappingName;

        ModuleAccumulator(TombstoneProtos.MemoryMapping memoryMapping) {
            this.mappingName = memoryMapping.getMappingName();
            this.buildId = memoryMapping.getBuildId();
            this.beginAddress = memoryMapping.getBeginAddress();
            this.endAddress = memoryMapping.getEndAddress();
        }

        void extendTo(long j) {
            this.endAddress = j;
        }

        DebugImage toDebugImage() {
            if (this.buildId.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(this.buildId);
            debugImage.setCodeFile(this.mappingName);
            String buildIdToDebugId = NativeEventUtils.buildIdToDebugId(this.buildId);
            if (buildIdToDebugId == null) {
                buildIdToDebugId = this.buildId;
            }
            debugImage.setDebugId(buildIdToDebugId);
            debugImage.setImageAddr(TombstoneParser.formatHex(this.beginAddress));
            debugImage.setImageSize(this.endAddress - this.beginAddress);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    private DebugMeta createDebugMeta(TombstoneProtos.Tombstone tombstone) {
        DebugImage debugImage;
        DebugImage debugImage2;
        ArrayList arrayList = new ArrayList();
        ModuleAccumulator moduleAccumulator = null;
        for (TombstoneProtos.MemoryMapping memoryMapping : tombstone.getMemoryMappingsList()) {
            if (memoryMapping.getRead()) {
                String mappingName = memoryMapping.getMappingName();
                if (!mappingName.isEmpty() && !mappingName.startsWith("/dev/")) {
                    boolean isEmpty = memoryMapping.getBuildId().isEmpty();
                    boolean z = memoryMapping.getOffset() == 0;
                    if (!isEmpty && z) {
                        if (moduleAccumulator != null && mappingName.equals(moduleAccumulator.mappingName)) {
                            moduleAccumulator.extendTo(memoryMapping.getEndAddress());
                        } else {
                            if (moduleAccumulator != null && (debugImage2 = moduleAccumulator.toDebugImage()) != null) {
                                arrayList.add(debugImage2);
                            }
                            moduleAccumulator = new ModuleAccumulator(memoryMapping);
                        }
                    } else if (moduleAccumulator != null && mappingName.equals(moduleAccumulator.mappingName)) {
                        moduleAccumulator.extendTo(memoryMapping.getEndAddress());
                    }
                }
            }
        }
        if (moduleAccumulator != null && (debugImage = moduleAccumulator.toDebugImage()) != null) {
            arrayList.add(debugImage);
        }
        DebugMeta debugMeta = new DebugMeta();
        debugMeta.setImages(arrayList);
        return debugMeta;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.tombstoneStream.close();
    }
}
