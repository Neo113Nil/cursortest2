package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import com.twilio.voice.ConnectOptions;
import com.twilio.voice.Constants;
import com.twilio.voice.PreflightOptions;
import com.twilio.voice.PreflightTest;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class Voice {
    static AudioDevice audioDevice;
    static final Map<String, CallInviteProxy> callInviteProxyMap;
    static Pair<String, String> callSidBridgeTokenPair;
    static final Set<Call> calls;
    private static final LogLevel defaultLogLevel;
    static String edge;
    static boolean enableInsights;
    static boolean isLibraryLoaded;
    static LogLevel level;
    static LoggerInterface logger;
    static Constants.LoggerType loggerType;
    private static long nativeLoggerHandle;
    static String region;
    static final Set<Call> rejects;
    static AtomicInteger networkChangedCount = new AtomicInteger(0);
    static Map<LogModule, LogLevel> moduleLogLevel = new EnumMap(LogModule.class);

    /* renamed from: com.twilio.voice.Voice$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$twilio$voice$LogLevel = iArr;
            try {
                iArr[LogLevel.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum NetworkChangeEvent {
        CONNECTION_LOST,
        CONNECTION_CHANGED
    }

    public enum RegistrationChannel {
        FCM,
        GCM;

        @Override // java.lang.Enum
        public String toString() {
            return name().toLowerCase();
        }
    }

    static {
        LogLevel logLevel = LogLevel.ERROR;
        defaultLogLevel = logLevel;
        level = logLevel;
        logger = new DefaultLogger();
        loggerType = Constants.LoggerType.DEFAULT;
        enableInsights = true;
        region = Constants.GLOBAL_LOW_LATENCY_REGION;
        edge = Constants.EDGE_ROAMING;
        isLibraryLoaded = false;
        calls = new HashSet();
        callInviteProxyMap = new HashMap();
        rejects = new HashSet();
    }

    private static void callNativeHandleMessage(@NonNull final Context context, @NonNull final Map<String, String> map, @NonNull final MessageListener messageListener, final Call.EventListener eventListener, final Call.CallMessageListener callMessageListener) {
        loadLibrary(context);
        final Handler createHandler = Utils.createHandler();
        createHandler.post(new Runnable() { // from class: com.twilio.voice.Voice.1
            @Override // java.lang.Runnable
            public void run() {
                CallInvite create = CallInvite.create(map);
                CancelledCallInvite create2 = CancelledCallInvite.create(map);
                if (create.getBridgeToken() != null) {
                    Voice.callSidBridgeTokenPair = Pair.create(create.getCallSid(), create.getBridgeToken());
                }
                Pair<String[], String[]> mapToArrays = Utils.mapToArrays(map);
                MediaFactory instance = MediaFactory.instance(this, context.getApplicationContext());
                CallInviteProxy callInviteProxy = new CallInviteProxy(context.getApplicationContext(), createHandler, messageListener, eventListener, create);
                Voice.nativeHandleMessage((String[]) mapToArrays.first, (String[]) mapToArrays.second, create, create2, new CallMessageListenerProxy(callInviteProxy.getPublisher(), callMessageListener), callInviteProxy, instance.getNativeMediaFactoryHandle());
                instance.release(this);
            }
        });
    }

    @NonNull
    public static Call connect(@NonNull Context context, @NonNull ConnectOptions connectOptions, @NonNull Call.Listener listener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(connectOptions, "connectOptions must not be null");
        Preconditions.checkNotNull(listener, "listener must not be null");
        if (!Utils.isAudioPermissionGranted(context)) {
            throw new SecurityException("Requires the RECORD_AUDIO permission");
        }
        ConnectOptions.Builder builder = new ConnectOptions.Builder(connectOptions.getAccessToken());
        builder.params(connectOptions.getParams());
        if (connectOptions.getIceOptions() != null) {
            builder.iceOptions(connectOptions.getIceOptions());
        }
        if (connectOptions.getPreferredAudioCodecs() != null) {
            builder.preferAudioCodecs(connectOptions.getPreferredAudioCodecs());
        }
        builder.enableDscp(connectOptions.enableDscp);
        builder.enableIceGatheringOnAnyAddressPorts(connectOptions.enableIceGatheringOnAnyAddressPorts);
        builder.audioTracks(Collections.singletonList(LocalAudioTrack.create(context, true, connectOptions.getAudioOptions())));
        builder.eventListener(connectOptions.getEventListener());
        builder.callMessageListener(connectOptions.getCallMessageListener());
        builder.audioOptions(connectOptions.getAudioOptions());
        ConnectOptions build = builder.build();
        Call call = new Call(context.getApplicationContext(), build.getAccessToken(), listener);
        call.connect(build);
        return call;
    }

    public static void enableInsights(boolean z10) {
        if (isLibraryLoaded) {
            nativeEnableInsights(z10);
        }
        enableInsights = z10;
    }

    @NonNull
    public static AudioDevice getAudioDevice() {
        if (audioDevice == null) {
            audioDevice = new DefaultAudioDevice();
        }
        return audioDevice;
    }

    @NonNull
    public static String getEdge() {
        return edge;
    }

    @NonNull
    public static LogLevel getLogLevel() {
        return level;
    }

    @NonNull
    public static synchronized LoggerInterface getLogger() {
        LoggerInterface loggerInterface;
        synchronized (Voice.class) {
            loggerInterface = logger;
        }
        return loggerInterface;
    }

    @NonNull
    public static LogLevel getModuleLogLevel(LogModule logModule) {
        return moduleLogLevel.containsKey(logModule) ? moduleLogLevel.get(logModule) : defaultLogLevel;
    }

    @NonNull
    @Deprecated
    public static String getRegion() {
        return region;
    }

    @NonNull
    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static synchronized boolean handleMessage(@NonNull Context context, @NonNull Map<String, String> map, @NonNull MessageListener messageListener) {
        boolean handleMessage;
        synchronized (Voice.class) {
            handleMessage = handleMessage(context, map, messageListener, null, null);
        }
        return handleMessage;
    }

    public static boolean isInsightsEnabled() {
        return enableInsights;
    }

    public static void loadLibrary(Context context) {
        if (isLibraryLoaded) {
            return;
        }
        C8.c.a(context, BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
        isLibraryLoaded = true;
        setLogger(getLogger());
        setLogLevel(level);
        if (!edge.equals(Constants.EDGE_ROAMING)) {
            nativeSetEdge(edge);
        }
        if (!region.equals(Constants.GLOBAL_LOW_LATENCY_REGION)) {
            nativeSetRegion(region);
        }
        enableInsights(enableInsights);
        for (LogModule logModule : moduleLogLevel.keySet()) {
            setModuleLogLevel(logModule, moduleLogLevel.get(logModule));
        }
    }

    private static native void nativeEnableInsights(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeHandleMessage(String[] strArr, String[] strArr2, CallInvite callInvite, CancelledCallInvite cancelledCallInvite, Call.CallMessageListener callMessageListener, CallInviteProxy callInviteProxy, long j10);

    private static native void nativeReleaseLogger(long j10);

    private static native void nativeSetEdge(String str);

    private static native long nativeSetLogger(LoggerInterface loggerInterface);

    private static native void nativeSetModuleLevel(int i10, int i11);

    private static native void nativeSetRegion(String str);

    public static void onNetworkChanged(NetworkChangeEvent networkChangeEvent) {
        networkChangedCount.incrementAndGet();
        Iterator<Call> it = calls.iterator();
        while (it.hasNext()) {
            it.next().networkChange(networkChangeEvent);
        }
        Iterator<CallInviteProxy> it2 = callInviteProxyMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().networkChange(networkChangeEvent);
        }
    }

    public static void register(@NonNull String str, @NonNull RegistrationChannel registrationChannel, @NonNull String str2, @NonNull RegistrationListener registrationListener) {
        Preconditions.checkNotNull(str, "accessToken must not be null");
        Preconditions.checkNotNull(registrationChannel, "registrationChannel must not be null");
        Preconditions.checkNotNull(str2, "registrationToken must not be null");
        Preconditions.checkNotNull(registrationListener, "listener must not be null");
        new Registrar(str, registrationChannel.toString(), str2).register(registrationListener);
    }

    public static PreflightTest runPreflight(@NonNull Context context, @NonNull String str, @NonNull PreflightTest.Listener listener) {
        return runPreflight(context, new PreflightOptions.Builder(str).build(), listener);
    }

    public static void setAudioDevice(@NonNull AudioDevice audioDevice2) {
        Preconditions.checkNotNull(audioDevice2, "audioDevice must not be null");
        if (!calls.isEmpty()) {
            throw new UnsupportedOperationException("Changing the audio device during a call is not allowed");
        }
        audioDevice = audioDevice2;
    }

    public static void setEdge(@NonNull String str) {
        Preconditions.checkNotNull(str, "edge must not be null");
        Preconditions.checkArgument(region.equals(Constants.GLOBAL_LOW_LATENCY_REGION), String.format("Non default region value %s has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to.", getRegion()));
        if (isLibraryLoaded) {
            nativeSetEdge(str);
        }
        edge = str;
    }

    public static void setLogLevel(@NonNull LogLevel logLevel) {
        setSDKLogLevel(logLevel);
        if (isLibraryLoaded) {
            nativeSetModuleLevel(LogModule.CORE.ordinal(), logLevel.ordinal());
        }
        level = logLevel;
    }

    public static synchronized void setLogger(@NonNull LoggerInterface loggerInterface) {
        synchronized (Voice.class) {
            try {
                Preconditions.checkNotNull(loggerInterface, "Logger must not be null");
                if (isLibraryLoaded) {
                    long j10 = nativeLoggerHandle;
                    if (j10 != 0) {
                        nativeReleaseLogger(j10);
                        nativeLoggerHandle = 0L;
                    }
                    nativeLoggerHandle = nativeSetLogger(loggerInterface);
                }
                logger = loggerInterface;
                loggerType = loggerInterface instanceof DefaultLogger ? Constants.LoggerType.DEFAULT : Constants.LoggerType.CUSTOM;
                Iterator<Call> it = calls.iterator();
                while (it.hasNext()) {
                    it.next().publishLoggerEventToInsights();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setModuleLogLevel(@NonNull LogModule logModule, @NonNull LogLevel logLevel) {
        if (logModule == LogModule.PLATFORM) {
            setSDKLogLevel(logLevel);
        }
        if (isLibraryLoaded) {
            nativeSetModuleLevel(logModule.ordinal(), logLevel.ordinal());
        }
        moduleLogLevel.put(logModule, logLevel);
    }

    @Deprecated
    public static void setRegion(@NonNull String str) {
        Preconditions.checkNotNull(str, "region must not be null");
        Preconditions.checkArgument(edge.equals(Constants.EDGE_ROAMING), String.format("Non default edge value %s has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to.", getEdge()));
        if (isLibraryLoaded) {
            nativeSetRegion(str);
        }
        region = str;
    }

    private static void setSDKLogLevel(LogLevel logLevel) {
        switch (AnonymousClass2.$SwitchMap$com$twilio$voice$LogLevel[logLevel.ordinal()]) {
            case 1:
                Logger.setLogLevel(7);
                break;
            case 2:
                Logger.setLogLevel(6);
                break;
            case 3:
                Logger.setLogLevel(5);
                break;
            case 4:
                Logger.setLogLevel(4);
                break;
            case 5:
                Logger.setLogLevel(3);
                break;
            case 6:
                Logger.setLogLevel(2);
                break;
            case 7:
                Logger.setLogLevel(2);
                break;
            default:
                Logger.setLogLevel(7);
                break;
        }
    }

    public static void unregister(@NonNull String str, @NonNull RegistrationChannel registrationChannel, @NonNull String str2, @NonNull UnregistrationListener unregistrationListener) {
        Preconditions.checkNotNull(str, "accessToken must not be null");
        Preconditions.checkNotNull(registrationChannel, "registrationChannel must not be null");
        Preconditions.checkNotNull(str2, "registrationToken must not be null");
        Preconditions.checkNotNull(unregistrationListener, "listener must not be null");
        new Registrar(str, registrationChannel.toString(), str2).unregister(unregistrationListener);
    }

    public static synchronized boolean handleMessage(@NonNull Context context, @NonNull Map<String, String> map, @NonNull MessageListener messageListener, Call.CallMessageListener callMessageListener) {
        boolean handleMessage;
        synchronized (Voice.class) {
            handleMessage = handleMessage(context, map, messageListener, null, callMessageListener);
        }
        return handleMessage;
    }

    public static PreflightTest runPreflight(@NonNull Context context, @NonNull PreflightOptions preflightOptions, @NonNull PreflightTest.Listener listener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(preflightOptions, "preflightOptions must not be null");
        Preconditions.checkNotNull(listener, "listener must not be null");
        return new PreflightTest(context, preflightOptions, listener);
    }

    public static boolean handleMessage(@NonNull Context context, @NonNull Bundle bundle, @NonNull MessageListener messageListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        Preconditions.checkNotNull(messageListener, "listener must not be null");
        return handleMessage(context, Utils.bundleToMap(bundle), messageListener, (Call.CallMessageListener) null);
    }

    public static boolean handleMessage(@NonNull Context context, @NonNull Bundle bundle, @NonNull MessageListener messageListener, Call.CallMessageListener callMessageListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        Preconditions.checkNotNull(messageListener, "listener must not be null");
        return handleMessage(context, Utils.bundleToMap(bundle), messageListener, callMessageListener);
    }

    public static synchronized boolean handleMessage(@NonNull Context context, @NonNull Map<String, String> map, @NonNull MessageListener messageListener, Call.EventListener eventListener, Call.CallMessageListener callMessageListener) {
        boolean isValid;
        synchronized (Voice.class) {
            try {
                Preconditions.checkNotNull(context, "context must not be null");
                Preconditions.checkNotNull(map, "data must not be null");
                Preconditions.checkNotNull(messageListener, "messageListener must not be null");
                isValid = CallInvite.isValid(context, map);
                if (!isValid) {
                    if (CancelledCallInvite.isValid(map) && isInsightsEnabled()) {
                    }
                }
                callNativeHandleMessage(context, map, messageListener, eventListener, callMessageListener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return isValid;
    }

    @NonNull
    public static Call connect(@NonNull Context context, @NonNull String str, @NonNull Call.Listener listener) {
        return connect(context, new ConnectOptions.Builder(str).build(), listener);
    }
}
