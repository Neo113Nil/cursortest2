package f5;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import d5.C6087b;
import h5.C6811i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2.C9922a;

/* renamed from: f5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6434l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f62746a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f62747b = 0;

    static {
        String i11 = androidx.work.o.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i11, "tagWithPrefix(\"NetworkStateTracker\")");
        f62746a = i11;
    }

    @NotNull
    public static final C6087b b(@NotNull ConnectivityManager connectivityManager) {
        boolean z11;
        NetworkCapabilities a11;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            a11 = C6811i.a(connectivityManager, h5.j.a(connectivityManager));
        } catch (SecurityException e11) {
            androidx.work.o.e().d(f62746a, "Unable to validate active network", e11);
        }
        if (a11 != null) {
            z11 = C6811i.b(a11, 16);
            return new C6087b(z12, z11, C9922a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z11 = false;
        return new C6087b(z12, z11, C9922a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
