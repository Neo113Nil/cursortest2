package io.sentry.android.core.internal.tombstone;

import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.a3;
import io.sentry.android.core.internal.util.l;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f67165a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f67166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f67167c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67168d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f67169e;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f67170a;

        /* renamed from: b, reason: collision with root package name */
        String f67171b;

        /* renamed from: c, reason: collision with root package name */
        long f67172c;

        /* renamed from: d, reason: collision with root package name */
        long f67173d;

        final DebugImage a() {
            String str = this.f67171b;
            if (str.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(str);
            debugImage.setCodeFile(this.f67170a);
            String a11 = l.a(str);
            if (a11 != null) {
                str = a11;
            }
            debugImage.setDebugId(str);
            long j11 = this.f67172c;
            debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j11)));
            debugImage.setImageSize(this.f67173d - j11);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    public b(@NonNull InputStream inputStream, @NotNull List<String> list, @NotNull List<String> list2, String str) {
        HashMap hashMap = new HashMap();
        this.f67169e = hashMap;
        this.f67165a = inputStream;
        this.f67166b = list;
        this.f67167c = list2;
        this.f67168d = str;
        hashMap.put("SIGILL", "IllegalInstruction");
        hashMap.put("SIGTRAP", "Trap");
        hashMap.put("SIGABRT", "Abort");
        hashMap.put("SIGBUS", "BusError");
        hashMap.put("SIGFPE", "FloatingPointException");
        hashMap.put("SIGSEGV", "Segfault");
    }

    @NonNull
    public final C7230z2 c() throws IOException {
        DebugImage a11;
        DebugImage a12;
        TombstoneProtos$Tombstone parseFrom = TombstoneProtos$Tombstone.parseFrom(this.f67165a);
        C7230z2 c7230z2 = new C7230z2();
        c7230z2.z0(I2.FATAL);
        c7230z2.W("native");
        m mVar = new m();
        TombstoneProtos$Signal signalInfo = parseFrom.getSignalInfo();
        String join = String.join(" ", parseFrom.getCommandLineList());
        if (parseFrom.hasSignalInfo()) {
            String abortMessage = parseFrom.getAbortMessage();
            Locale locale = Locale.ROOT;
            String concat = !abortMessage.isEmpty() ? abortMessage.concat(": ") : "";
            mVar.f(concat + "Fatal signal " + signalInfo.getName() + " (" + signalInfo.getNumber() + "), " + signalInfo.getCodeName() + " (" + signalInfo.getCode() + "), pid = " + parseFrom.getPid() + " (" + join + ")");
        } else {
            Locale locale2 = Locale.ROOT;
            mVar.f(Nh.a.c(parseFrom.getPid(), "Fatal exit pid = ", " (", join, ")"));
        }
        c7230z2.B0(mVar);
        ArrayList arrayList = new ArrayList();
        Iterator<TombstoneProtos$MemoryMapping> it = parseFrom.getMemoryMappingsList().iterator();
        a aVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TombstoneProtos$MemoryMapping next = it.next();
            if (next.getRead()) {
                String mappingName = next.getMappingName();
                if (!mappingName.isEmpty() && !mappingName.startsWith("/dev/")) {
                    boolean isEmpty = next.getBuildId().isEmpty();
                    boolean z11 = next.getOffset() == 0;
                    if (isEmpty || !z11) {
                        if (aVar != null && mappingName.equals(aVar.f67170a)) {
                            aVar.f67173d = next.getEndAddress();
                        }
                    } else if (aVar == null || !mappingName.equals(aVar.f67170a)) {
                        if (aVar != null && (a12 = aVar.a()) != null) {
                            arrayList.add(a12);
                        }
                        aVar = new a();
                        aVar.f67170a = next.getMappingName();
                        aVar.f67171b = next.getBuildId();
                        aVar.f67172c = next.getBeginAddress();
                        aVar.f67173d = next.getEndAddress();
                    } else {
                        aVar.f67173d = next.getEndAddress();
                    }
                }
            }
        }
        if (aVar != null && (a11 = aVar.a()) != null) {
            arrayList.add(a11);
        }
        C7188d c7188d = new C7188d();
        c7188d.e(arrayList);
        c7230z2.R(c7188d);
        s sVar = new s();
        if (parseFrom.hasSignalInfo()) {
            TombstoneProtos$Signal signalInfo2 = parseFrom.getSignalInfo();
            sVar.p(signalInfo2.getName());
            sVar.r((String) this.f67169e.get(signalInfo2.getName()));
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            lVar.r(io.sentry.android.core.internal.tombstone.a.TOMBSTONE.getValue());
            lVar.n();
            lVar.q();
            HashMap hashMap = new HashMap();
            hashMap.put("number", Integer.valueOf(signalInfo2.getNumber()));
            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, signalInfo2.getName());
            hashMap.put("code", Integer.valueOf(signalInfo2.getCode()));
            hashMap.put("code_name", signalInfo2.getCodeName());
            lVar.o(hashMap);
            sVar.l(lVar);
        }
        sVar.o(Long.valueOf(parseFrom.getTid()));
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(sVar);
        c7230z2.x0(arrayList2);
        ArrayList n02 = c7230z2.n0();
        Objects.requireNonNull(n02);
        s sVar2 = (s) n02.get(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator<Map.Entry<Integer, TombstoneProtos$Thread>> it2 = parseFrom.getThreadsMap().entrySet().iterator();
        while (it2.hasNext()) {
            TombstoneProtos$Thread value = it2.next().getValue();
            z zVar = new z();
            zVar.u(Long.valueOf(r6.getKey().intValue()));
            zVar.w(value.getName());
            ArrayList arrayList4 = new ArrayList();
            for (TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame : value.getCurrentBacktraceList()) {
                if (!tombstoneProtos$BacktraceFrame.getFileName().endsWith("libart.so") && (!tombstoneProtos$BacktraceFrame.getFileName().startsWith("<anonymous") || !tombstoneProtos$BacktraceFrame.getFunctionName().isEmpty())) {
                    x xVar = new x();
                    xVar.F(tombstoneProtos$BacktraceFrame.getFileName());
                    xVar.y(tombstoneProtos$BacktraceFrame.getFunctionName());
                    xVar.A(String.format("0x%x", Long.valueOf(tombstoneProtos$BacktraceFrame.getPc())));
                    String functionName = tombstoneProtos$BacktraceFrame.getFunctionName();
                    Boolean c11 = functionName.isEmpty() ? Boolean.FALSE : a3.c(functionName, this.f67166b, this.f67167c);
                    String str = this.f67168d;
                    xVar.z(Boolean.valueOf((c11 != null && c11.booleanValue()) || (str != null && tombstoneProtos$BacktraceFrame.getFileName().startsWith(str))));
                    arrayList4.add(0, xVar);
                }
            }
            y yVar = new y();
            yVar.f(arrayList4);
            yVar.g(y.b.NONE);
            HashMap hashMap2 = new HashMap();
            for (TombstoneProtos$Register tombstoneProtos$Register : value.getRegistersList()) {
                hashMap2.put(tombstoneProtos$Register.getName(), String.format("0x%x", Long.valueOf(tombstoneProtos$Register.getU64())));
            }
            yVar.h(hashMap2);
            zVar.y(yVar);
            if (parseFrom.getTid() == value.getId()) {
                zVar.q(Boolean.TRUE);
                sVar2.n(yVar);
            }
            arrayList3.add(zVar);
        }
        c7230z2.D0(arrayList3);
        return c7230z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67165a.close();
    }
}
