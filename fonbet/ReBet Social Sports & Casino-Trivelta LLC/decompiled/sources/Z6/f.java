package Z6;

import Z6.e;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.C3016g;
import com.facebook.drawee.drawable.InterfaceC3012c;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.k;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.r;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Drawable f14724a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), eVar.i());
            b(kVar, eVar);
            return kVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            b(oVar, eVar);
            return oVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            E6.a.M("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        l g10 = l.g((ColorDrawable) drawable);
        b(g10, eVar);
        return g10;
    }

    public static void b(j jVar, e eVar) {
        jVar.a(eVar.j());
        jVar.h(eVar.d());
        jVar.setBorder(eVar.b(), eVar.c());
        jVar.b(eVar.g());
        jVar.f(eVar.l());
        jVar.e(eVar.h());
        jVar.d(eVar.i());
    }

    public static InterfaceC3012c c(InterfaceC3012c interfaceC3012c) {
        while (true) {
            Object drawable = interfaceC3012c.getDrawable();
            if (drawable == interfaceC3012c || !(drawable instanceof InterfaceC3012c)) {
                break;
            }
            interfaceC3012c = (InterfaceC3012c) drawable;
        }
        return interfaceC3012c;
    }

    public static Drawable d(Drawable drawable, e eVar, Resources resources) {
        try {
            if (N7.b.d()) {
                N7.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.BITMAP_ONLY) {
                if (drawable instanceof C3016g) {
                    InterfaceC3012c c10 = c((C3016g) drawable);
                    c10.setDrawable(a(c10.setDrawable(f14724a), eVar, resources));
                    return drawable;
                }
                Drawable a10 = a(drawable, eVar, resources);
                if (N7.b.d()) {
                    N7.b.b();
                }
                return a10;
            }
            if (N7.b.d()) {
                N7.b.b();
            }
            return drawable;
        } finally {
            if (N7.b.d()) {
                N7.b.b();
            }
        }
    }

    public static Drawable e(Drawable drawable, e eVar) {
        try {
            if (N7.b.d()) {
                N7.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && eVar != null && eVar.k() == e.a.OVERLAY_COLOR) {
                m mVar = new m(drawable);
                b(mVar, eVar);
                mVar.j(eVar.f());
                return mVar;
            }
            if (N7.b.d()) {
                N7.b.b();
            }
            return drawable;
        } finally {
            if (N7.b.d()) {
                N7.b.b();
            }
        }
    }

    public static Drawable f(Drawable drawable, r rVar) {
        return g(drawable, rVar, null);
    }

    public static Drawable g(Drawable drawable, r rVar, PointF pointF) {
        if (N7.b.d()) {
            N7.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || rVar == null) {
            if (N7.b.d()) {
                N7.b.b();
            }
            return drawable;
        }
        p pVar = new p(drawable, rVar);
        if (pointF != null) {
            pVar.m(pointF);
        }
        if (N7.b.d()) {
            N7.b.b();
        }
        return pVar;
    }

    public static void h(j jVar) {
        jVar.a(false);
        jVar.c(0.0f);
        jVar.setBorder(0, 0.0f);
        jVar.b(0.0f);
        jVar.f(false);
        jVar.e(false);
        jVar.d(k.n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(InterfaceC3012c interfaceC3012c, e eVar, Resources resources) {
        InterfaceC3012c c10 = c(interfaceC3012c);
        Drawable drawable = c10.getDrawable();
        if (eVar == null || eVar.k() != e.a.BITMAP_ONLY) {
            if (drawable instanceof j) {
                h((j) drawable);
            }
        } else if (drawable instanceof j) {
            b((j) drawable, eVar);
        } else if (drawable != 0) {
            c10.setDrawable(f14724a);
            c10.setDrawable(a(drawable, eVar, resources));
        }
    }

    public static void j(InterfaceC3012c interfaceC3012c, e eVar) {
        Drawable drawable = interfaceC3012c.getDrawable();
        if (eVar == null || eVar.k() != e.a.OVERLAY_COLOR) {
            if (drawable instanceof m) {
                Drawable drawable2 = f14724a;
                interfaceC3012c.setDrawable(((m) drawable).setCurrent(drawable2));
                drawable2.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawable instanceof m)) {
            interfaceC3012c.setDrawable(e(interfaceC3012c.setDrawable(f14724a), eVar));
            return;
        }
        m mVar = (m) drawable;
        b(mVar, eVar);
        mVar.j(eVar.f());
    }

    public static p k(InterfaceC3012c interfaceC3012c, r rVar) {
        Drawable f10 = f(interfaceC3012c.setDrawable(f14724a), rVar);
        interfaceC3012c.setDrawable(f10);
        D6.k.h(f10, "Parent has no child drawable!");
        return (p) f10;
    }
}
