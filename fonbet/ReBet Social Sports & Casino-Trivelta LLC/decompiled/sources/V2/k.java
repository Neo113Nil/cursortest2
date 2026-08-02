package V2;

import Q2.AbstractC1508t;
import Y2.p;
import Y2.q;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC6376a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12383a;

    static {
        String i10 = AbstractC1508t.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f12383a = i10;
    }

    public static final h a(Context context, Z2.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final androidx.work.impl.constraints.e c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e10 = e(connectivityManager);
        boolean a10 = AbstractC6376a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new androidx.work.impl.constraints.e(z11, e10, a10, z10);
    }

    public static final androidx.work.impl.constraints.e d(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return new androidx.work.impl.constraints.e(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static final boolean e(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = p.a(connectivityManager, q.a(connectivityManager));
            if (a10 != null) {
                return p.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC1508t.e().d(f12383a, "Unable to validate active network", e10);
            return false;
        }
    }
}
