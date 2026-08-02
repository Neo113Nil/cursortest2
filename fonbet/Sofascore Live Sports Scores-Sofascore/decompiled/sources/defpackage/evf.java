package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class evf extends dbc implements bvf {
    public final String f;
    public final fbc g;
    public String h;
    public String i;
    public boolean j;
    public int l;
    public avf m;
    public final /* synthetic */ gvf o;
    public int k = -1;
    public int n = -1;

    public evf(gvf gvfVar, String str, fbc fbcVar) {
        this.o = gvfVar;
        this.f = str;
        this.g = fbcVar;
    }

    @Override // defpackage.bvf
    public final void a(avf avfVar) {
        dvf dvfVar = new dvf(this);
        this.m = avfVar;
        int i = avfVar.e;
        avfVar.e = i + 1;
        int i2 = avfVar.d;
        avfVar.d = i2 + 1;
        Bundle f = bf3.f("memberRouteId", this.f);
        f.putParcelable("routeControllerOptions", this.g.a);
        avfVar.b(11, i2, i, null, f);
        avfVar.h.put(i2, dvfVar);
        this.n = i;
        if (this.j) {
            avfVar.a(i);
            int i3 = this.k;
            if (i3 >= 0) {
                avfVar.c(this.n, i3);
                this.k = -1;
            }
            int i4 = this.l;
            if (i4 != 0) {
                avfVar.d(this.n, i4);
                this.l = 0;
            }
        }
    }

    @Override // defpackage.bvf
    public final int b() {
        return this.n;
    }

    @Override // defpackage.bvf
    public final void c() {
        avf avfVar = this.m;
        if (avfVar != null) {
            int i = this.n;
            int i2 = avfVar.d;
            avfVar.d = i2 + 1;
            avfVar.b(4, i2, i, null, null);
            this.m = null;
            this.n = 0;
        }
    }

    @Override // defpackage.ebc
    public final void d() {
        gvf gvfVar = this.o;
        gvfVar.k.remove(this);
        c();
        gvfVar.p();
    }

    @Override // defpackage.ebc
    public final void e() {
        this.j = true;
        avf avfVar = this.m;
        if (avfVar != null) {
            avfVar.a(this.n);
        }
    }

    @Override // defpackage.ebc
    public final void f(int i) {
        avf avfVar = this.m;
        if (avfVar != null) {
            avfVar.c(this.n, i);
        } else {
            this.k = i;
            this.l = 0;
        }
    }

    @Override // defpackage.ebc
    public final void g() {
        h(0);
    }

    @Override // defpackage.ebc
    public final void h(int i) {
        this.j = false;
        avf avfVar = this.m;
        if (avfVar != null) {
            int i2 = this.n;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = avfVar.d;
            avfVar.d = i3 + 1;
            avfVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.ebc
    public final void i(int i) {
        avf avfVar = this.m;
        if (avfVar != null) {
            avfVar.d(this.n, i);
        } else {
            this.l += i;
        }
    }

    @Override // defpackage.dbc
    public final String j() {
        return this.h;
    }

    @Override // defpackage.dbc
    public final String k() {
        return this.i;
    }

    @Override // defpackage.dbc
    public final void m(String str) {
        avf avfVar = this.m;
        if (avfVar != null) {
            int i = this.n;
            Bundle f = bf3.f("memberRouteId", str);
            int i2 = avfVar.d;
            avfVar.d = i2 + 1;
            avfVar.b(12, i2, i, null, f);
        }
    }

    @Override // defpackage.dbc
    public final void n(String str) {
        avf avfVar = this.m;
        if (avfVar != null) {
            int i = this.n;
            Bundle f = bf3.f("memberRouteId", str);
            int i2 = avfVar.d;
            avfVar.d = i2 + 1;
            avfVar.b(13, i2, i, null, f);
        }
    }

    @Override // defpackage.dbc
    public final void o(ArrayList arrayList) {
        avf avfVar = this.m;
        if (avfVar != null) {
            int i = this.n;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i2 = avfVar.d;
            avfVar.d = i2 + 1;
            avfVar.b(14, i2, i, null, bundle);
        }
    }
}
