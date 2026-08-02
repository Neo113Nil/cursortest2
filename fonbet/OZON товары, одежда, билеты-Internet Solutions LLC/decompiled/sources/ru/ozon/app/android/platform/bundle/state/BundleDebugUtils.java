package ru.ozon.app.android.platform.bundle.state;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sj.d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\u00020\u000f8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/BundleDebugUtils;", "", "<init>", "()V", "", "text", "", "log", "(Ljava/lang/String;)V", "", "isRemoteErrorLoggingEnabled", "Z", "()Z", "setRemoteErrorLoggingEnabled", "(Z)V", "Lsj/d;", "logger$delegate", "LSc/j;", "getLogger", "()Lsj/d;", "getLogger$annotations", "logger", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BundleDebugUtils {
    private static boolean isRemoteErrorLoggingEnabled;

    @NotNull
    public static final BundleDebugUtils INSTANCE = new BundleDebugUtils();

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j logger = k.b(BundleDebugUtils$logger$2.INSTANCE);

    private BundleDebugUtils() {
    }

    @NotNull
    public final d getLogger() {
        return (d) logger.getValue();
    }

    public final boolean isRemoteErrorLoggingEnabled() {
        return isRemoteErrorLoggingEnabled;
    }

    public final void log(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public final void setRemoteErrorLoggingEnabled(boolean z11) {
        isRemoteErrorLoggingEnabled = z11;
    }
}
