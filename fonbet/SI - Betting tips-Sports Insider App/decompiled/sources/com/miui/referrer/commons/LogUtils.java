package com.miui.referrer.commons;

import android.util.Log;
import com.miui.referrer.api.GetAppsReferrerClientImpl;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import io.sentry.android.core.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"Lcom/miui/referrer/commons/LogUtils;", "", "()V", "log", "", "strMess", "", "response", "", "stateListener", "Lcom/miui/referrer/api/GetAppsReferrerStateListener;", "logVerbose", "tag", "logWarn", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogUtils {

    @NotNull
    public static final LogUtils INSTANCE = new LogUtils();

    private LogUtils() {
    }

    public static final void log(@NotNull String strMess, int response, @NotNull GetAppsReferrerStateListener stateListener) {
        Intrinsics.checkNotNullParameter(strMess, "strMess");
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        logVerbose(GetAppsReferrerClientImpl.TAG, strMess);
        stateListener.onGetAppsReferrerSetupFinished(response);
    }

    public static final void logVerbose(@NotNull String tag, @NotNull String strMess) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(strMess, "strMess");
        if (Log.isLoggable(tag, 2)) {
            Log.v(tag, strMess);
        }
    }

    public static final void logWarn(@NotNull String tag, @NotNull String strMess) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(strMess, "strMess");
        if (Log.isLoggable(tag, 5)) {
            w0.m(tag, strMess);
        }
    }

    public static final void logWarn(@NotNull String strMess, int response, @NotNull GetAppsReferrerStateListener stateListener) {
        Intrinsics.checkNotNullParameter(strMess, "strMess");
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        logWarn(GetAppsReferrerClientImpl.TAG, strMess);
        stateListener.onGetAppsReferrerSetupFinished(response);
    }
}
