package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6834a implements c {
    @Override // y.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.a(new d(colorStateList, f10));
        View f13 = bVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        d(bVar, f12);
    }

    @Override // y.c
    public void b(b bVar) {
        d(bVar, g(bVar));
    }

    @Override // y.c
    public void c(b bVar, float f10) {
        o(bVar).h(f10);
    }

    @Override // y.c
    public void d(b bVar, float f10) {
        o(bVar).g(f10, bVar.c(), bVar.e());
        p(bVar);
    }

    @Override // y.c
    public float e(b bVar) {
        return i(bVar) * 2.0f;
    }

    @Override // y.c
    public void f(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // y.c
    public float g(b bVar) {
        return o(bVar).c();
    }

    @Override // y.c
    public ColorStateList h(b bVar) {
        return o(bVar).b();
    }

    @Override // y.c
    public float i(b bVar) {
        return o(bVar).d();
    }

    @Override // y.c
    public void j(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // y.c
    public float k(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // y.c
    public float m(b bVar) {
        return i(bVar) * 2.0f;
    }

    @Override // y.c
    public void n(b bVar) {
        d(bVar, g(bVar));
    }

    public final d o(b bVar) {
        return (d) bVar.d();
    }

    public void p(b bVar) {
        if (!bVar.c()) {
            bVar.b(0, 0, 0, 0);
            return;
        }
        float g10 = g(bVar);
        float i10 = i(bVar);
        int ceil = (int) Math.ceil(e.a(g10, i10, bVar.e()));
        int ceil2 = (int) Math.ceil(e.b(g10, i10, bVar.e()));
        bVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // y.c
    public void l() {
    }
}
