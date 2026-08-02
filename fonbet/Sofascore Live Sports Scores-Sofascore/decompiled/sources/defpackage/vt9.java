package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vt9 {
    public static final sl6 a = new sl6(qwj.a);
    public static final sl6 b = new sl6(gjk.b);
    public static final sl6 c = new sl6(null);
    public static final sl6 d;
    public static final sl6 e;
    public static final sl6 f;
    public static final sl6 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new sl6(bool);
        e = new sl6(null);
        f = new sl6(bool);
        g = new sl6(Boolean.FALSE);
    }

    public static final void a(ht9 ht9Var, int i) {
        ht9Var.o = new q13(i, 26);
    }

    public static final void b(ht9 ht9Var, Drawable drawable) {
        ht9Var.o = new yx7(drawable != null ? rfo.u(drawable) : null, 28);
    }

    public static final Bitmap.Config c(tvd tvdVar) {
        return (Bitmap.Config) fqj.x(tvdVar, b);
    }

    public static final ColorSpace d(tvd tvdVar) {
        return (ColorSpace) fqj.x(tvdVar, c);
    }

    public static final void e(ht9 ht9Var, int i) {
        ht9Var.n = new q13(i, 27);
    }

    public static final void f(ht9 ht9Var, ImageView imageView) {
        ht9Var.d = new ju9(imageView);
    }
}
