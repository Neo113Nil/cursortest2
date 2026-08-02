package com.unity3d.ads.core.domain.adquality;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.O6;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.drm0;
import xsna.dt;
import xsna.e4;
import xsna.gzs;
import xsna.jvo0;
import xsna.k830;
import xsna.m5k;
import xsna.pn00;
import xsna.s3q0;
import xsna.zno;

/* compiled from: AndroidInitializeAdQuality.kt */
/* loaded from: classes14.dex */
public final class AndroidInitializeAdQuality implements InitializeAdQuality {
    private final Context context;
    private final GetGameId getGameId;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: AndroidInitializeAdQuality.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidInitializeAdQuality(Context context, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, GetGameId getGameId) {
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.getGameId = getGameId;
    }

    /* renamed from: buildConfig-LaDbsBc, reason: not valid java name */
    private final ISAdQualityConfig m72buildConfigLaDbsBc(final long j, ByteString byteString) {
        ISAdQualityConfig.Builder addAdQualityInitListener = new ISAdQualityConfig.Builder().setInitializationSource(O6.H1).setLogLevel(mapLogLevel(this.logger.getLogLevel())).setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null)).addAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$buildConfig$configBuilder$1
            public void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                SendDiagnosticEvent sendDiagnosticEvent;
                Logger logger;
                double e = zno.e(jvo0.a.b(j));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME, Double.valueOf(e), pn00.k(new Pair("reason", iSAdQualityInitError.name()), new Pair("reason_debug", str)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                logger = this.logger;
                Logger.DefaultImpls.error$default(logger, "Ad Quality failed to initialize: ".concat(str), null, 2, null);
            }

            public void adQualitySdkInitSuccess() {
                SendDiagnosticEvent sendDiagnosticEvent;
                double e = zno.e(jvo0.a.b(j));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME, Double.valueOf(e), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
            }
        });
        String userIdentifier = UnityAds.getUserIdentifier();
        if (userIdentifier != null) {
            addAdQualityInitListener.setUserId(userIdentifier);
        }
        return addAdQualityInitListener.build();
    }

    private final ISAdQualityLogLevel mapLogLevel(LogLevelInternal logLevelInternal) {
        int i = WhenMappings.$EnumSwitchMapping$0[logLevelInternal.ordinal()];
        if (i == 1) {
            return ISAdQualityLogLevel.NONE;
        }
        if (i == 2) {
            return ISAdQualityLogLevel.ERROR;
        }
        if (i == 3) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i == 4) {
            return ISAdQualityLogLevel.DEBUG;
        }
        if (i == 5) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void reportLoadFailure(Throwable th, String str) {
        this.logger.debug(new e4(th, 2));
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        String message = th.getMessage();
        if (message != null) {
            str = message;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, dt.b("reason_debug", str), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reportLoadFailure$lambda$3(Throwable th) {
        return m5k.b(th, new StringBuilder("Ad Quality SDK not available: "));
    }

    private final void safeRun(gzs<s3q0> gzsVar) {
        try {
            gzsVar.invoke();
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            String message = th.getMessage();
            if (message == null) {
                message = FyberConstants.Logs.UNKNOWN_ERROR;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, dt.b("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final ISAdQualityConfig startInitialization(ByteString byteString) {
        long b = k830.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        return m72buildConfigLaDbsBc(b, byteString);
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invoke(String str, ByteString byteString) {
        try {
            IronSourceAdQuality.getInstance().initialize(this.context, str, startInitialization(byteString));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            String message = th.getMessage();
            if (message == null) {
                message = FyberConstants.Logs.UNKNOWN_ERROR;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, dt.b("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invokeWithGameId(ByteString byteString) {
        String invoke = this.getGameId.invoke();
        if (invoke == null || drm0.N(invoke)) {
            return;
        }
        try {
            IronSourceAdQuality.getInstance().initializeWithGameId(this.context, invoke, startInitialization(byteString));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            String message = th.getMessage();
            if (message == null) {
                message = FyberConstants.Logs.UNKNOWN_ERROR;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, dt.b("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }
}
