package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.P;
import androidx.core.graphics.AbstractC2074d;
import l.AbstractC5335a;
import n.AbstractC5596a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053h {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f17309b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C2053h f17310c;

    /* renamed from: a, reason: collision with root package name */
    public P f17311a;

    /* renamed from: androidx.appcompat.widget.h$a */
    public class a implements P.c {
        private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {l.e.f55051R, l.e.f55049P, l.e.f55053a};
        private final int[] TINT_COLOR_CONTROL_NORMAL = {l.e.f55067o, l.e.f55035B, l.e.f55072t, l.e.f55068p, l.e.f55069q, l.e.f55071s, l.e.f55070r};
        private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {l.e.f55048O, l.e.f55050Q, l.e.f55063k, l.e.f55044K, l.e.f55045L, l.e.f55046M, l.e.f55047N};
        private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {l.e.f55075w, l.e.f55061i, l.e.f55074v};
        private final int[] TINT_COLOR_CONTROL_STATE_LIST = {l.e.f55043J, l.e.f55052S};
        private final int[] TINT_CHECKABLE_BUTTON_LIST = {l.e.f55055c, l.e.f55059g, l.e.f55056d, l.e.f55060h};

        @Override // androidx.appcompat.widget.P.c
        public Drawable a(P p10, Context context, int i10) {
            if (i10 == l.e.f55062j) {
                return new LayerDrawable(new Drawable[]{p10.i(context, l.e.f55061i), p10.i(context, l.e.f55063k)});
            }
            if (i10 == l.e.f55077y) {
                return l(p10, context, l.d.f55027g);
            }
            if (i10 == l.e.f55076x) {
                return l(p10, context, l.d.f55028h);
            }
            if (i10 == l.e.f55078z) {
                return l(p10, context, l.d.f55029i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == l.e.f55065m) {
                return AbstractC5596a.a(context, l.c.f55017e);
            }
            if (i10 == l.e.f55042I) {
                return AbstractC5596a.a(context, l.c.f55020h);
            }
            if (i10 == l.e.f55041H) {
                return k(context);
            }
            if (i10 == l.e.f55058f) {
                return j(context);
            }
            if (i10 == l.e.f55054b) {
                return g(context);
            }
            if (i10 == l.e.f55057e) {
                return i(context);
            }
            if (i10 == l.e.f55037D || i10 == l.e.f55038E) {
                return AbstractC5596a.a(context, l.c.f55019g);
            }
            if (f(this.TINT_COLOR_CONTROL_NORMAL, i10)) {
                return W.e(context, AbstractC5335a.f55006u);
            }
            if (f(this.TINT_COLOR_CONTROL_STATE_LIST, i10)) {
                return AbstractC5596a.a(context, l.c.f55016d);
            }
            if (f(this.TINT_CHECKABLE_BUTTON_LIST, i10)) {
                return AbstractC5596a.a(context, l.c.f55015c);
            }
            if (i10 == l.e.f55034A) {
                return AbstractC5596a.a(context, l.c.f55018f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // androidx.appcompat.widget.P.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean c(Context context, int i10, Drawable drawable) {
            PorterDuff.Mode mode;
            int i11;
            boolean z10;
            int round;
            PorterDuff.Mode mode2 = C2053h.f17309b;
            if (f(this.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i10)) {
                i11 = AbstractC5335a.f55006u;
            } else if (f(this.COLORFILTER_COLOR_CONTROL_ACTIVATED, i10)) {
                i11 = AbstractC5335a.f55004s;
            } else {
                if (f(this.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i10)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == l.e.f55073u) {
                        round = Math.round(40.8f);
                        i11 = 16842800;
                        mode = mode2;
                        z10 = true;
                        if (z10) {
                            return false;
                        }
                        Drawable mutate = drawable.mutate();
                        mutate.setColorFilter(C2053h.e(W.c(context, i11), mode));
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                        return true;
                    }
                    if (i10 != l.e.f55064l) {
                        mode = mode2;
                        i11 = 0;
                        z10 = false;
                        round = -1;
                        if (z10) {
                        }
                    }
                }
                mode = mode2;
                round = -1;
                i11 = 16842801;
                z10 = true;
                if (z10) {
                }
            }
            mode = mode2;
            z10 = true;
            round = -1;
            if (z10) {
            }
        }

        @Override // androidx.appcompat.widget.P.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == l.e.f55041H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == l.e.f55036C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), W.c(context, AbstractC5335a.f55006u), C2053h.f17309b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), W.c(context, AbstractC5335a.f55006u), C2053h.f17309b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), W.c(context, AbstractC5335a.f55004s), C2053h.f17309b);
                return true;
            }
            if (i10 != l.e.f55077y && i10 != l.e.f55076x && i10 != l.e.f55078z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), W.b(context, AbstractC5335a.f55006u), C2053h.f17309b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), W.c(context, AbstractC5335a.f55004s), C2053h.f17309b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), W.c(context, AbstractC5335a.f55004s), C2053h.f17309b);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i10) {
            int c10 = W.c(context, AbstractC5335a.f55005t);
            return new ColorStateList(new int[][]{W.DISABLED_STATE_SET, W.PRESSED_STATE_SET, W.FOCUSED_STATE_SET, W.EMPTY_STATE_SET}, new int[]{W.b(context, AbstractC5335a.f55003r), AbstractC2074d.g(c10, i10), AbstractC2074d.g(c10, i10), i10});
        }

        public final ColorStateList i(Context context) {
            return h(context, W.c(context, AbstractC5335a.f55002q));
        }

        public final ColorStateList j(Context context) {
            return h(context, W.c(context, AbstractC5335a.f55003r));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e10 = W.e(context, AbstractC5335a.f55009x);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = W.DISABLED_STATE_SET;
                iArr2[0] = W.b(context, AbstractC5335a.f55009x);
                iArr[1] = W.CHECKED_STATE_SET;
                iArr2[1] = W.c(context, AbstractC5335a.f55004s);
                iArr[2] = W.EMPTY_STATE_SET;
                iArr2[2] = W.c(context, AbstractC5335a.f55009x);
            } else {
                int[] iArr3 = W.DISABLED_STATE_SET;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = W.CHECKED_STATE_SET;
                iArr2[1] = W.c(context, AbstractC5335a.f55004s);
                iArr[2] = W.EMPTY_STATE_SET;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(P p10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = p10.i(context, l.e.f55039F);
            Drawable i12 = p10.i(context, l.e.f55040G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C2053h.f17309b;
            }
            mutate.setColorFilter(C2053h.e(i10, mode));
        }
    }

    public static synchronized C2053h b() {
        C2053h c2053h;
        synchronized (C2053h.class) {
            try {
                if (f17310c == null) {
                    h();
                }
                c2053h = f17310c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2053h;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (C2053h.class) {
            k10 = P.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (C2053h.class) {
            if (f17310c == null) {
                C2053h c2053h = new C2053h();
                f17310c = c2053h;
                c2053h.f17311a = P.g();
                f17310c.f17311a.t(new a());
            }
        }
    }

    public static void i(Drawable drawable, Y y10, int[] iArr) {
        P.v(drawable, y10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f17311a.i(context, i10);
    }

    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f17311a.j(context, i10, z10);
    }

    public synchronized ColorStateList f(Context context, int i10) {
        return this.f17311a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f17311a.r(context);
    }
}
