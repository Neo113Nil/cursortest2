package rj;

import Ae.C2406m0;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC3999a;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rj.AbstractC9286a;

@InterfaceC3999a
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f83580f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f83581g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f83582a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Network> f83583b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<AbstractC9286a> f83584c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2406m0 f83585d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Integer[] f83586e;

    public static final class a {
        @NotNull
        public final b a(@NotNull ConnectivityManager connectivityManager) {
            b bVar;
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            b bVar2 = b.f83581g;
            if (bVar2 != null) {
                return bVar2;
            }
            synchronized (this) {
                bVar = b.f83581g;
                if (bVar == null) {
                    bVar = new b(connectivityManager);
                    b.f83581g = bVar;
                }
            }
            return bVar;
        }
    }

    @InterfaceC3999a
    public b(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Set<Network> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        this.f83583b = synchronizedSet;
        x0<AbstractC9286a> a11 = O0.a(null);
        this.f83584c = a11;
        this.f83585d = new C2406m0(a11);
        this.f83586e = new Integer[]{1, 0, 4};
        this.f83582a = connectivityManager;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            synchronizedSet.add(activeNetwork);
        }
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().removeCapability(15).addCapability(12).addCapability(16).build(), new c(this));
        a11.setValue(e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r0.isConnectedOrConnecting() == true) goto L29;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC9286a e() {
        int i11 = Build.VERSION.SDK_INT;
        ConnectivityManager connectivityManager = this.f83582a;
        if (i11 < 29) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
            }
            return AbstractC9286a.b.f83579a;
        }
        Set<Network> validNetworks = this.f83583b;
        Intrinsics.checkNotNullExpressionValue(validNetworks, "validNetworks");
        Set<Network> set = validNetworks;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (Network network : set) {
                Intrinsics.f(network);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    for (Integer num : this.f83586e) {
                        if (networkCapabilities.hasTransport(num.intValue())) {
                            return AbstractC9286a.C1429a.f83578a;
                        }
                    }
                }
            }
        }
        return AbstractC9286a.b.f83579a;
    }

    @NotNull
    public final C2406m0 f() {
        return this.f83585d;
    }
}
