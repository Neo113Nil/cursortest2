package we;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.lifecycle.n0;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import i3.d;
import kotlin.jvm.internal.Intrinsics;
import lg.e;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public ConnectivityManager f25256l;

    /* renamed from: m, reason: collision with root package name */
    public d f25257m;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        this.f25256l = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
    }

    @Override // androidx.lifecycle.n0
    public final void f() {
        int i5 = 2;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ConnectivityManager connectivityManager = this.f25256l;
                if (connectivityManager != null) {
                    d dVar = this.f25257m;
                    if (dVar == null) {
                        dVar = new d(i5, this);
                        this.f25257m = dVar;
                    }
                    Intrinsics.checkNotNull(dVar);
                    connectivityManager.registerDefaultNetworkCallback(dVar);
                    return;
                }
                return;
            }
            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(0).addTransportType(1);
            ConnectivityManager connectivityManager2 = this.f25256l;
            if (connectivityManager2 != null) {
                NetworkRequest build = addTransportType.build();
                d dVar2 = this.f25257m;
                if (dVar2 == null) {
                    dVar2 = new d(i5, this);
                    this.f25257m = dVar2;
                }
                Intrinsics.checkNotNull(dVar2);
                connectivityManager2.registerNetworkCallback(build, dVar2);
            }
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar3 = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar3, lg.d.f20063c, null, new r(ex, null, 18), 2);
        }
    }

    @Override // androidx.lifecycle.n0
    public final void g() {
        int i5 = 2;
        try {
            d dVar = this.f25257m;
            if (dVar == null) {
                dVar = new d(i5, this);
                this.f25257m = dVar;
            }
            ConnectivityManager connectivityManager = this.f25256l;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(dVar);
            }
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar2 = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar2, lg.d.f20063c, null, new r(ex, null, 18), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        int i5 = 2;
        d dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        try {
            try {
                d dVar2 = this.f25257m;
                if (dVar2 == null) {
                    dVar2 = new d(i5, this);
                    this.f25257m = dVar2;
                }
                ConnectivityManager connectivityManager = this.f25256l;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(dVar2);
                }
            } catch (IllegalArgumentException unused) {
            } catch (Exception ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                jg.d dVar3 = MyApp.f6830c;
                e eVar = m0.f9201a;
                c0.t(dVar3, lg.d.f20063c, null, new r(ex, objArr == true ? 1 : 0, 18), 2);
            }
        } finally {
            this.f25257m = null;
            this.f25256l = null;
        }
    }
}
