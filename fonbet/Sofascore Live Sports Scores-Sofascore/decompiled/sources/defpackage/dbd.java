package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dbd extends um3 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final c2a i;

    public dbd(Context context, zbl zblVar) {
        super(context, zblVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new c2a(this, 2);
    }

    @Override // defpackage.um3
    public final Object a() {
        return cbd.a(this.f, this.h);
    }

    @Override // defpackage.um3
    public final void c() {
        try {
            rik o = rik.o();
            int i = cbd.a;
            o.getClass();
            ConnectivityManager connectivityManager = this.f;
            c2a c2aVar = this.i;
            connectivityManager.getClass();
            c2aVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(c2aVar);
        } catch (IllegalArgumentException unused) {
            rik o2 = rik.o();
            int i2 = cbd.a;
            o2.getClass();
        } catch (SecurityException unused2) {
            rik o3 = rik.o();
            int i3 = cbd.a;
            o3.getClass();
        }
    }

    @Override // defpackage.um3
    public final void d() {
        try {
            rik o = rik.o();
            int i = cbd.a;
            o.getClass();
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException unused) {
            rik o2 = rik.o();
            int i2 = cbd.a;
            o2.getClass();
        } catch (SecurityException unused2) {
            rik o3 = rik.o();
            int i3 = cbd.a;
            o3.getClass();
        }
    }
}
