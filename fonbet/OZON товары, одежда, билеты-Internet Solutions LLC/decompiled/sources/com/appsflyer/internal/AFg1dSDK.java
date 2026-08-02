package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJG\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ1\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\nJ'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/appsflyer/internal/AFg1dSDK;", "Lcom/appsflyer/internal/AFg1hSDK;", "Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "AFKeystoreWrapper", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "valueOf", "<init>", "()V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AFg1dSDK extends AFg1hSDK {

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            values = iArr;
        }
    }

    private final void AFKeystoreWrapper(AFLogger.LogLevel p02, AFg1gSDK p12, String p22, Throwable p32) {
        if (AFKeystoreWrapper(p02)) {
            String AFInAppEventParameterName = AFInAppEventParameterName(p22, p12);
            int i11 = AFa1vSDK.values[p02.ordinal()];
            if (i11 == 1) {
                Log.d("AppsFlyer_6.13.1", AFInAppEventParameterName);
                return;
            }
            if (i11 == 2) {
                Log.i("AppsFlyer_6.13.1", AFInAppEventParameterName);
                return;
            }
            if (i11 == 3) {
                Log.w("AppsFlyer_6.13.1", AFInAppEventParameterName);
            } else if (i11 == 4) {
                Log.v("AppsFlyer_6.13.1", AFInAppEventParameterName);
            } else {
                if (i11 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.13.1", AFInAppEventParameterName, p32);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1gSDK p02, @NotNull String p12, @NotNull Throwable p22, boolean p32, boolean p42, boolean p52, boolean p62) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
        if (p42) {
            AFKeystoreWrapper(AFLogger.LogLevel.ERROR, p02, p12, p22);
        } else if (p32) {
            AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, p02, p12, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1gSDK p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.13.1", withTag$SDK_prodRelease(p12, p02));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AFKeystoreWrapper(AFLogger.LogLevel.INFO, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AFKeystoreWrapper(AFLogger.LogLevel.VERBOSE, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AFKeystoreWrapper(AFLogger.LogLevel.WARNING, p02, p12, null);
    }

    private static boolean AFKeystoreWrapper(AFLogger.LogLevel p02) {
        return p02.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }
}
