package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fvf extends ebc implements bvf {
    public final String a;
    public final String b;
    public final fbc c;
    public boolean d;
    public int e = -1;
    public int f;
    public avf g;
    public int h;
    public final /* synthetic */ gvf i;

    public fvf(gvf gvfVar, String str, String str2, fbc fbcVar) {
        this.i = gvfVar;
        this.a = str;
        this.b = str2;
        this.c = fbcVar;
    }

    @Override // defpackage.bvf
    public final void a(avf avfVar) {
        this.g = avfVar;
        int i = avfVar.e;
        avfVar.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        bundle.putParcelable("routeControllerOptions", this.c.a);
        int i2 = avfVar.d;
        avfVar.d = i2 + 1;
        avfVar.b(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            avfVar.a(i);
            int i3 = this.e;
            if (i3 >= 0) {
                avfVar.c(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                avfVar.d(this.h, i4);
                this.f = 0;
            }
        }
    }

    @Override // defpackage.bvf
    public final int b() {
        return this.h;
    }

    @Override // defpackage.bvf
    public final void c() {
        avf avfVar = this.g;
        if (avfVar != null) {
            int i = this.h;
            int i2 = avfVar.d;
            avfVar.d = i2 + 1;
            avfVar.b(4, i2, i, null, null);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.ebc
    public final void d() {
        gvf gvfVar = this.i;
        gvfVar.k.remove(this);
        c();
        gvfVar.p();
    }

    @Override // defpackage.ebc
    public final void e() {
        this.d = true;
        avf avfVar = this.g;
        if (avfVar != null) {
            avfVar.a(this.h);
        }
    }

    @Override // defpackage.ebc
    public final void f(int i) {
        avf avfVar = this.g;
        if (avfVar != null) {
            avfVar.c(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.ebc
    public final void g() {
        h(0);
    }

    @Override // defpackage.ebc
    public final void h(int i) {
        this.d = false;
        avf avfVar = this.g;
        if (avfVar != null) {
            int i2 = this.h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = avfVar.d;
            avfVar.d = i3 + 1;
            avfVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.ebc
    public final void i(int i) {
        avf avfVar = this.g;
        if (avfVar != null) {
            avfVar.d(this.h, i);
        } else {
            this.f += i;
        }
    }
}
