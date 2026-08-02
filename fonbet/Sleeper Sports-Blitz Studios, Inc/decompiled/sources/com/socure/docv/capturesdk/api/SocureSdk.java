package com.socure.docv.capturesdk.api;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.gson.Gson;
import com.socure.docv.capturesdk.BuildConfig;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.ResultListener;
import com.socure.docv.capturesdk.common.utils.SocureDocVFailure;
import com.socure.docv.capturesdk.common.utils.SocureDocVSuccess;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureSdk.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0015H\u0007J\b\u0010\u001e\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/api/SocureSdk;", "", "()V", "docVContext", "Lcom/socure/docv/capturesdk/api/SocureDocVContext;", "getConfigJson", "", "configMap", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getResult", "", "data", "resultListener", "Lcom/socure/docv/capturesdk/common/utils/ResultListener;", "initSdk", "printDetailedLog", "flag", "", "printPiiInDebugLog", "print", "setSource", "platform", "Lcom/socure/docv/capturesdk/api/Platform;", "showDebugScanStages", "silenceDebugLog", "silence", "version", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SocureSdk {
    private static SocureDocVContext docVContext;
    public static final SocureSdk INSTANCE = new SocureSdk();
    public static final int $stable = 8;

    private SocureSdk() {
    }

    @JvmStatic
    public static final void initSdk(SocureDocVContext docVContext2) {
        Intrinsics.checkNotNullParameter(docVContext2, "docVContext");
        docVContext = docVContext2;
    }

    @JvmStatic
    public static final Intent getIntent(Context context, SocureDocVContext docVContext2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(docVContext2, "docVContext");
        Intent intent = new Intent(context, (Class<?>) OrchestratorActivity.class);
        intent.putExtra(Keys.KEY_DOCV_CONTEXT, docVContext2);
        return intent;
    }

    @JvmStatic
    public static final Intent getIntent(Context context) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        SocureDocVContext socureDocVContext = docVContext;
        if (socureDocVContext == null || (intent = getIntent(context, socureDocVContext)) == null) {
            throw new IllegalStateException("SocureDocVContext is not set");
        }
        return intent;
    }

    @JvmStatic
    public static final String version() {
        return BuildConfig.SDK_VERSION;
    }

    @JvmStatic
    public static final void showDebugScanStages(boolean flag) {
        ConstantsKt.setSHOW_DEBUG_SCAN_STAGE(flag);
    }

    @JvmStatic
    public static final void printDetailedLog(boolean flag) {
        ConstantsKt.setPRINT_DETAILED_LOG(flag);
    }

    @JvmStatic
    public static final void printPiiInDebugLog(boolean print) {
        ConstantsKt.setPRINT_PII_IN_DEBUG_LOG(print);
    }

    @JvmStatic
    public static final void silenceDebugLog(boolean silence) {
        ConstantsKt.setSILENCE_DEBUG_LOG(silence);
    }

    @JvmStatic
    public static final void setSource(Platform platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        ConstantsKt.setSOURCE_PLATFORM(platform);
    }

    @JvmStatic
    public static final void getResult(Intent data, ResultListener resultListener) {
        SocureDocVError socureDocVError;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        if (data.getBooleanExtra("result", false)) {
            resultListener.onResult(new SocureDocVSuccess(SessionManager.INSTANCE.getDeviceSessionToken()));
            SessionManager.INSTANCE.clear();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            socureDocVError = data.getSerializableExtra("error", SocureDocVError.class);
        } else {
            Serializable serializableExtra = data.getSerializableExtra("error");
            if (!(serializableExtra instanceof SocureDocVError)) {
                serializableExtra = null;
            }
            socureDocVError = (SocureDocVError) serializableExtra;
        }
        Intrinsics.checkNotNull(socureDocVError);
        resultListener.onResult(new SocureDocVFailure((SocureDocVError) socureDocVError, SessionManager.INSTANCE.getDeviceSessionToken()));
        SessionManager.INSTANCE.clear();
    }

    @JvmStatic
    public static final String getConfigJson(Map<String, ? extends Object> configMap) {
        Intrinsics.checkNotNullParameter(configMap, "configMap");
        try {
            return new Gson().toJson(configMap);
        } catch (Throwable th) {
            LoggerKt.logE$default(SocureSdkKt.TAG, "Ex trying to save 'raw': " + Log.getStackTraceString(th), null, 4, null);
            return th.getLocalizedMessage();
        }
    }
}
