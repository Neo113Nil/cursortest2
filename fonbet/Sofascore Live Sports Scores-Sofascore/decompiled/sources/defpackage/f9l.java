package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class f9l extends l9l {
    public final WindowInsets.Builder e;

    public f9l(x9l x9lVar) {
        super(x9lVar);
        WindowInsets g = x9lVar.g();
        this.e = g != null ? by1.h(g) : by1.g();
    }

    @Override // defpackage.l9l
    public x9l b() {
        a();
        x9l h = x9l.h(null, this.e.build());
        u4a[] u4aVarArr = this.b;
        u9l u9lVar = h.a;
        u9lVar.w(u4aVarArr);
        u9lVar.v(null);
        u9lVar.B(this.c);
        u9lVar.C(this.d);
        return h;
    }

    @Override // defpackage.l9l
    public void e(u4a u4aVar) {
        this.e.setMandatorySystemGestureInsets(u4aVar.e());
    }

    @Override // defpackage.l9l
    public void f(u4a u4aVar) {
        this.e.setStableInsets(u4aVar.e());
    }

    @Override // defpackage.l9l
    public void g(u4a u4aVar) {
        this.e.setSystemGestureInsets(u4aVar.e());
    }

    @Override // defpackage.l9l
    public void h(u4a u4aVar) {
        this.e.setSystemWindowInsets(u4aVar.e());
    }

    @Override // defpackage.l9l
    public void i(u4a u4aVar) {
        this.e.setTappableElementInsets(u4aVar.e());
    }

    public f9l() {
        this.e = by1.g();
    }
}
