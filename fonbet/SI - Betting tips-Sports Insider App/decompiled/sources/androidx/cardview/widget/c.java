package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements e {
    public static f o(d dVar) {
        return (f) ((a) dVar).f1038a;
    }

    @Override // androidx.cardview.widget.e
    public final void a(d dVar, float f6) {
        f o3 = o(dVar);
        if (f6 == o3.f1040a) {
            return;
        }
        o3.f1040a = f6;
        o3.b(null);
        o3.invalidateSelf();
    }

    @Override // androidx.cardview.widget.e
    public final float b(d dVar) {
        return ((a) dVar).f1039b.getElevation();
    }

    @Override // androidx.cardview.widget.e
    public final float c(d dVar) {
        return o(dVar).f1040a;
    }

    @Override // androidx.cardview.widget.e
    public final void d(d dVar) {
        n(dVar, o(dVar).f1044e);
    }

    @Override // androidx.cardview.widget.e
    public final void e(d dVar, float f6) {
        ((a) dVar).f1039b.setElevation(f6);
    }

    @Override // androidx.cardview.widget.e
    public final float f(d dVar) {
        return o(dVar).f1044e;
    }

    @Override // androidx.cardview.widget.e
    public final ColorStateList g(d dVar) {
        return o(dVar).f1047h;
    }

    @Override // androidx.cardview.widget.e
    public final void h(d dVar) {
        a aVar = (a) dVar;
        if (!aVar.f1039b.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f6 = o(dVar).f1044e;
        float f10 = o(dVar).f1040a;
        b bVar = aVar.f1039b;
        int ceil = (int) Math.ceil(g.a(f6, f10, bVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(g.b(f6, f10, bVar.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public final float i(d dVar) {
        return o(dVar).f1040a * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public final float j(d dVar) {
        return o(dVar).f1040a * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public final void k(a aVar, Context context, ColorStateList colorStateList, float f6, float f10, float f11) {
        f fVar = new f(f6, colorStateList);
        aVar.f1038a = fVar;
        b bVar = aVar.f1039b;
        bVar.setBackgroundDrawable(fVar);
        bVar.setClipToOutline(true);
        bVar.setElevation(f10);
        n(aVar, f11);
    }

    @Override // androidx.cardview.widget.e
    public final void l(d dVar) {
        n(dVar, o(dVar).f1044e);
    }

    @Override // androidx.cardview.widget.e
    public final void m(d dVar, ColorStateList colorStateList) {
        f o3 = o(dVar);
        if (colorStateList == null) {
            o3.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        o3.f1047h = colorStateList;
        o3.f1041b.setColor(colorStateList.getColorForState(o3.getState(), o3.f1047h.getDefaultColor()));
        o3.invalidateSelf();
    }

    @Override // androidx.cardview.widget.e
    public final void n(d dVar, float f6) {
        f o3 = o(dVar);
        a aVar = (a) dVar;
        boolean useCompatPadding = aVar.f1039b.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.f1039b.getPreventCornerOverlap();
        if (f6 != o3.f1044e || o3.f1045f != useCompatPadding || o3.f1046g != preventCornerOverlap) {
            o3.f1044e = f6;
            o3.f1045f = useCompatPadding;
            o3.f1046g = preventCornerOverlap;
            o3.b(null);
            o3.invalidateSelf();
        }
        h(dVar);
    }
}
