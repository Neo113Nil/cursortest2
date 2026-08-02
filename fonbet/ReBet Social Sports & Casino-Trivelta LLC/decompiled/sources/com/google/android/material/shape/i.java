package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import java.util.BitSet;
import sa.AbstractC6344a;
import va.C6680a;
import x0.AbstractC6773b;
import ya.AbstractC6866a;

/* loaded from: classes3.dex */
public class i extends Drawable implements q {

    /* renamed from: A, reason: collision with root package name */
    public static final String f35755A = "i";

    /* renamed from: B, reason: collision with root package name */
    public static final n f35756B = n.a().q(0, 0.0f).m();

    /* renamed from: C, reason: collision with root package name */
    public static final Paint f35757C;
    private static final e[] CORNER_SIZES_IN_PX;

    /* renamed from: a, reason: collision with root package name */
    public final n.c f35758a;

    /* renamed from: b, reason: collision with root package name */
    public c f35759b;

    /* renamed from: c, reason: collision with root package name */
    public final BitSet f35760c;
    private final p.g[] cornerShadowOperation;

    @NonNull
    O0.l[] cornerSpringAnimations;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35762e;
    private final p.g[] edgeShadowOperation;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f35763f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f35764g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f35765h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f35766i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f35767j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f35768k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f35769l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f35770m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f35771n;

    /* renamed from: o, reason: collision with root package name */
    public final Ea.a f35772o;

    /* renamed from: p, reason: collision with root package name */
    public final o.b f35773p;

    /* renamed from: q, reason: collision with root package name */
    public final o f35774q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuffColorFilter f35775r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f35776s;
    private float[] springAnimatedCornerSizes;
    private float[] springAnimatedStrokeCornerSizes;

    /* renamed from: t, reason: collision with root package name */
    public int f35777t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f35778u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35779v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35780w;

    /* renamed from: x, reason: collision with root package name */
    public n f35781x;

    /* renamed from: y, reason: collision with root package name */
    public O0.m f35782y;

    /* renamed from: z, reason: collision with root package name */
    public d f35783z;

    public class a implements n.c {
        public a() {
        }

        @Override // com.google.android.material.shape.n.c
        public com.google.android.material.shape.d a(com.google.android.material.shape.d dVar) {
            return dVar instanceof l ? dVar : new com.google.android.material.shape.b(-i.this.J(), dVar);
        }
    }

    public class b implements o.b {
        public b() {
        }

        @Override // com.google.android.material.shape.o.b
        public void a(p pVar, Matrix matrix, int i10) {
            i.this.f35760c.set(i10, pVar.e());
            i.this.cornerShadowOperation[i10] = pVar.f(matrix);
        }

        @Override // com.google.android.material.shape.o.b
        public void b(p pVar, Matrix matrix, int i10) {
            i.this.f35760c.set(i10 + 4, pVar.e());
            i.this.edgeShadowOperation[i10] = pVar.f(matrix);
        }
    }

    public interface d {
        void a(float f10);
    }

    public static class e extends O0.i {

        /* renamed from: b, reason: collision with root package name */
        public final int f35809b;

        public e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f35809b = i10;
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(i iVar) {
            if (iVar.springAnimatedCornerSizes != null) {
                return iVar.springAnimatedCornerSizes[this.f35809b];
            }
            return 0.0f;
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(i iVar, float f10) {
            if (iVar.springAnimatedCornerSizes == null || iVar.springAnimatedCornerSizes[this.f35809b] == f10) {
                return;
            }
            iVar.springAnimatedCornerSizes[this.f35809b] = f10;
            if (iVar.f35783z != null) {
                iVar.f35783z.a(iVar.z());
            }
            iVar.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        f35757C = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        CORNER_SIZES_IN_PX = new e[4];
        while (true) {
            e[] eVarArr = CORNER_SIZES_IN_PX;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public i() {
        this(new n());
    }

    public static int Y(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    public static i r(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC6344a.c(context, ia.c.f48260t, i.class.getSimpleName()));
        }
        i iVar = new i();
        iVar.T(context);
        iVar.f0(colorStateList);
        iVar.e0(f10);
        return iVar;
    }

    public float A() {
        return this.f35759b.f35801p;
    }

    public ColorStateList B() {
        return this.f35759b.f35790e;
    }

    public float C() {
        return this.f35759b.f35797l;
    }

    public float D() {
        return this.f35759b.f35800o;
    }

    public int E() {
        return this.f35777t;
    }

    public int F() {
        c cVar = this.f35759b;
        return (int) (cVar.f35805t * Math.sin(Math.toRadians(cVar.f35806u)));
    }

    public int G() {
        c cVar = this.f35759b;
        return (int) (cVar.f35805t * Math.cos(Math.toRadians(cVar.f35806u)));
    }

    public n H() {
        return this.f35759b.f35786a;
    }

    public ColorStateList I() {
        return this.f35759b.f35791f;
    }

    public final float J() {
        if (S()) {
            return this.f35771n.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float K() {
        return this.f35759b.f35798m;
    }

    public ColorStateList L() {
        return this.f35759b.f35793h;
    }

    public float M() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[3] : this.f35759b.f35786a.r().a(x());
    }

    public float N() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[0] : this.f35759b.f35786a.t().a(x());
    }

    public float O() {
        return this.f35759b.f35802q;
    }

    public float P() {
        return A() + O();
    }

    public final boolean Q() {
        c cVar = this.f35759b;
        int i10 = cVar.f35803r;
        if (i10 == 1 || cVar.f35804s <= 0) {
            return false;
        }
        return i10 == 2 || a0();
    }

    public final boolean R() {
        Paint.Style style = this.f35759b.f35808w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean S() {
        Paint.Style style = this.f35759b.f35808w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f35771n.getStrokeWidth() > 0.0f;
    }

    public void T(Context context) {
        this.f35759b.f35788c = new C6680a(context);
        v0();
    }

    public final void U() {
        super.invalidateSelf();
    }

    public boolean V() {
        C6680a c6680a = this.f35759b.f35788c;
        return c6680a != null && c6680a.e();
    }

    public boolean W() {
        if (this.f35759b.f35786a.v(x())) {
            return true;
        }
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null && AbstractC6866a.a(fArr) && this.f35759b.f35786a.u();
    }

    public final void X(Canvas canvas) {
        if (Q()) {
            canvas.save();
            Z(canvas);
            if (!this.f35779v) {
                s(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f35778u.width() - getBounds().width());
            int height = (int) (this.f35778u.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f35778u.width()) + (this.f35759b.f35804s * 2) + width, ((int) this.f35778u.height()) + (this.f35759b.f35804s * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f35759b.f35804s) - width;
            float f11 = (getBounds().top - this.f35759b.f35804s) - height;
            canvas2.translate(-f10, -f11);
            s(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void Z(Canvas canvas) {
        canvas.translate(F(), G());
    }

    public boolean a0() {
        return (W() || this.f35764g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void b0(float f10) {
        setShapeAppearanceModel(this.f35759b.f35786a.x(f10));
    }

    public void c0(com.google.android.material.shape.d dVar) {
        setShapeAppearanceModel(this.f35759b.f35786a.y(dVar));
    }

    public void d0(O0.m mVar) {
        if (this.f35782y == mVar) {
            return;
        }
        this.f35782y = mVar;
        int i10 = 0;
        while (true) {
            O0.l[] lVarArr = this.cornerSpringAnimations;
            if (i10 >= lVarArr.length) {
                s0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (lVarArr[i10] == null) {
                    lVarArr[i10] = new O0.l(this, CORNER_SIZES_IN_PX[i10]);
                }
                this.cornerSpringAnimations[i10].x(new O0.m().f(mVar.a()).h(mVar.c()));
                i10++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f35770m.setColorFilter(this.f35775r);
        int alpha = this.f35770m.getAlpha();
        this.f35770m.setAlpha(Y(alpha, this.f35759b.f35799n));
        this.f35771n.setColorFilter(this.f35776s);
        this.f35771n.setStrokeWidth(this.f35759b.f35798m);
        int alpha2 = this.f35771n.getAlpha();
        this.f35771n.setAlpha(Y(alpha2, this.f35759b.f35799n));
        if (R()) {
            if (this.f35761d) {
                k(x(), this.f35764g);
                this.f35761d = false;
            }
            X(canvas);
            t(canvas);
        }
        if (S()) {
            if (this.f35762e) {
                n();
                this.f35762e = false;
            }
            w(canvas);
        }
        this.f35770m.setAlpha(alpha);
        this.f35771n.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f35759b;
        if (cVar.f35801p != f10) {
            cVar.f35801p = f10;
            v0();
        }
    }

    public void f0(ColorStateList colorStateList) {
        c cVar = this.f35759b;
        if (cVar.f35790e != colorStateList) {
            cVar.f35790e = colorStateList;
            onStateChange(getState());
        }
    }

    public void g0(float f10) {
        c cVar = this.f35759b;
        if (cVar.f35797l != f10) {
            cVar.f35797l = f10;
            this.f35761d = true;
            this.f35762e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35759b.f35799n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f35759b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f35759b.f35803r == 2) {
            return;
        }
        RectF x10 = x();
        if (x10.isEmpty()) {
            return;
        }
        float m10 = m(x10, this.f35759b.f35786a, this.springAnimatedCornerSizes);
        if (m10 >= 0.0f) {
            outline.setRoundRect(getBounds(), m10 * this.f35759b.f35797l);
            return;
        }
        if (this.f35761d) {
            k(x10, this.f35764g);
            this.f35761d = false;
        }
        ua.d.j(outline, this.f35764g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f35759b.f35795j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f35768k.set(getBounds());
        k(x(), this.f35764g);
        this.f35769l.setPath(this.f35764g, this.f35768k);
        this.f35768k.op(this.f35769l, Region.Op.DIFFERENCE);
        return this.f35768k;
    }

    public void h0(d dVar) {
        this.f35783z = dVar;
    }

    public void i0(int i10, int i11, int i12, int i13) {
        c cVar = this.f35759b;
        if (cVar.f35795j == null) {
            cVar.f35795j = new Rect();
        }
        this.f35759b.f35795j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f35761d = true;
        this.f35762e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f35759b.f35793h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f35759b.f35792g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f35759b.f35791f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f35759b.f35790e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        s sVar = this.f35759b.f35787b;
        return sVar != null && sVar.f();
    }

    public final PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int q10 = q(color);
        this.f35777t = q10;
        if (q10 != color) {
            return new PorterDuffColorFilter(q10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void j0(float f10) {
        c cVar = this.f35759b;
        if (cVar.f35800o != f10) {
            cVar.f35800o = f10;
            v0();
        }
    }

    public final void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f35759b.f35796k != 1.0f) {
            this.f35763f.reset();
            Matrix matrix = this.f35763f;
            float f10 = this.f35759b.f35796k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f35763f);
        }
        path.computeBounds(this.f35778u, true);
    }

    public void k0(int i10) {
        c cVar = this.f35759b;
        if (cVar.f35803r != i10) {
            cVar.f35803r = i10;
            U();
        }
    }

    public final void l(RectF rectF, Path path) {
        o oVar = this.f35774q;
        c cVar = this.f35759b;
        oVar.f(cVar.f35786a, this.springAnimatedCornerSizes, cVar.f35797l, rectF, this.f35773p, path);
    }

    public void l0(s sVar) {
        c cVar = this.f35759b;
        if (cVar.f35787b != sVar) {
            cVar.f35787b = sVar;
            s0(getState(), true);
            invalidateSelf();
        }
    }

    public final float m(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.v(rectF)) {
                return nVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (AbstractC6866a.a(fArr) && nVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public void m0(float f10, int i10) {
        p0(f10);
        o0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f35759b = new c(this.f35759b);
        return this;
    }

    public final void n() {
        t0();
        this.f35774q.f(this.f35781x, this.springAnimatedStrokeCornerSizes, this.f35759b.f35797l, y(), null, this.f35765h);
    }

    public void n0(float f10, ColorStateList colorStateList) {
        p0(f10);
        o0(colorStateList);
    }

    public final PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = q(colorForState);
        }
        this.f35777t = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void o0(ColorStateList colorStateList) {
        c cVar = this.f35759b;
        if (cVar.f35791f != colorStateList) {
            cVar.f35791f = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f35761d = true;
        this.f35762e = true;
        super.onBoundsChange(rect);
        if (this.f35759b.f35787b != null && !rect.isEmpty()) {
            s0(getState(), this.f35780w);
        }
        this.f35780w = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, xa.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f35759b.f35787b != null) {
            r0(iArr);
        }
        boolean z10 = q0(iArr) || u0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : o(colorStateList, mode, z10);
    }

    public void p0(float f10) {
        this.f35759b.f35798m = f10;
        invalidateSelf();
    }

    public int q(int i10) {
        float P10 = P() + D();
        C6680a c6680a = this.f35759b.f35788c;
        return c6680a != null ? c6680a.c(i10, P10) : i10;
    }

    public final boolean q0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f35759b.f35790e == null || color2 == (colorForState2 = this.f35759b.f35790e.getColorForState(iArr, (color2 = this.f35770m.getColor())))) {
            z10 = false;
        } else {
            this.f35770m.setColor(colorForState2);
            z10 = true;
        }
        if (this.f35759b.f35791f == null || color == (colorForState = this.f35759b.f35791f.getColorForState(iArr, (color = this.f35771n.getColor())))) {
            return z10;
        }
        this.f35771n.setColor(colorForState);
        return true;
    }

    public final void r0(int[] iArr) {
        s0(iArr, false);
    }

    public final void s(Canvas canvas) {
        if (this.f35760c.cardinality() > 0) {
            Log.w(f35755A, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f35759b.f35805t != 0) {
            canvas.drawPath(this.f35764g, this.f35772o.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.cornerShadowOperation[i10].a(this.f35772o, this.f35759b.f35804s, canvas);
            this.edgeShadowOperation[i10].a(this.f35772o, this.f35759b.f35804s, canvas);
        }
        if (this.f35779v) {
            int F10 = F();
            int G10 = G();
            canvas.translate(-F10, -G10);
            canvas.drawPath(this.f35764g, f35757C);
            canvas.translate(F10, G10);
        }
    }

    public final void s0(int[] iArr, boolean z10) {
        RectF x10 = x();
        if (this.f35759b.f35787b == null || x10.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.f35782y == null);
        if (this.springAnimatedCornerSizes == null) {
            this.springAnimatedCornerSizes = new float[4];
        }
        n d10 = this.f35759b.f35787b.d(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float a10 = this.f35774q.h(i10, d10).a(x10);
            if (z11) {
                this.springAnimatedCornerSizes[i10] = a10;
            }
            O0.l lVar = this.cornerSpringAnimations[i10];
            if (lVar != null) {
                lVar.t(a10);
                if (z11) {
                    this.cornerSpringAnimations[i10].y();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f35759b;
        if (cVar.f35799n != i10) {
            cVar.f35799n = i10;
            U();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35759b.f35789d = colorFilter;
        U();
    }

    @Override // com.google.android.material.shape.q
    public void setShapeAppearanceModel(n nVar) {
        c cVar = this.f35759b;
        cVar.f35786a = nVar;
        cVar.f35787b = null;
        this.springAnimatedCornerSizes = null;
        this.springAnimatedStrokeCornerSizes = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f35759b.f35793h = colorStateList;
        u0();
        U();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f35759b;
        if (cVar.f35794i != mode) {
            cVar.f35794i = mode;
            u0();
            U();
        }
    }

    public final void t(Canvas canvas) {
        v(canvas, this.f35770m, this.f35764g, this.f35759b.f35786a, this.springAnimatedCornerSizes, x());
    }

    public final void t0() {
        this.f35781x = H().z(this.f35758a);
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr == null) {
            this.springAnimatedStrokeCornerSizes = null;
            return;
        }
        if (this.springAnimatedStrokeCornerSizes == null) {
            this.springAnimatedStrokeCornerSizes = new float[fArr.length];
        }
        float J10 = J();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.springAnimatedCornerSizes;
            if (i10 >= fArr2.length) {
                return;
            }
            this.springAnimatedStrokeCornerSizes[i10] = Math.max(0.0f, fArr2[i10] - J10);
            i10++;
        }
    }

    public void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.f35759b.f35786a, this.springAnimatedCornerSizes, rectF);
    }

    public final boolean u0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f35775r;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f35776s;
        c cVar = this.f35759b;
        this.f35775r = p(cVar.f35793h, cVar.f35794i, this.f35770m, true);
        c cVar2 = this.f35759b;
        this.f35776s = p(cVar2.f35792g, cVar2.f35794i, this.f35771n, false);
        c cVar3 = this.f35759b;
        if (cVar3.f35807v) {
            this.f35772o.d(cVar3.f35793h.getColorForState(getState(), 0));
        }
        return (AbstractC6773b.a(porterDuffColorFilter, this.f35775r) && AbstractC6773b.a(porterDuffColorFilter2, this.f35776s)) ? false : true;
    }

    public final void v(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float m10 = m(rectF, nVar, fArr);
        if (m10 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = m10 * this.f35759b.f35797l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void v0() {
        float P10 = P();
        this.f35759b.f35804s = (int) Math.ceil(0.75f * P10);
        this.f35759b.f35805t = (int) Math.ceil(P10 * 0.25f);
        u0();
        U();
    }

    public void w(Canvas canvas) {
        v(canvas, this.f35771n, this.f35765h, this.f35781x, this.springAnimatedStrokeCornerSizes, y());
    }

    public RectF x() {
        this.f35766i.set(getBounds());
        return this.f35766i;
    }

    public final RectF y() {
        this.f35767j.set(x());
        float J10 = J();
        this.f35767j.inset(J10, J10);
        return this.f35767j;
    }

    public float z() {
        float a10;
        float a11;
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr != null) {
            a10 = (fArr[3] + fArr[2]) - fArr[1];
            a11 = fArr[0];
        } else {
            RectF x10 = x();
            a10 = (this.f35774q.h(3, H()).a(x10) + this.f35774q.h(2, H()).a(x10)) - this.f35774q.h(1, H()).a(x10);
            a11 = this.f35774q.h(0, H()).a(x10);
        }
        return (a10 - a11) / 2.0f;
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(n.e(context, attributeSet, i10, i11).m());
    }

    public i(n nVar) {
        this(new c(nVar, null));
    }

    public i(c cVar) {
        o oVar;
        this.f35758a = new a();
        this.cornerShadowOperation = new p.g[4];
        this.edgeShadowOperation = new p.g[4];
        this.f35760c = new BitSet(8);
        this.f35763f = new Matrix();
        this.f35764g = new Path();
        this.f35765h = new Path();
        this.f35766i = new RectF();
        this.f35767j = new RectF();
        this.f35768k = new Region();
        this.f35769l = new Region();
        Paint paint = new Paint(1);
        this.f35770m = paint;
        Paint paint2 = new Paint(1);
        this.f35771n = paint2;
        this.f35772o = new Ea.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = o.l();
        } else {
            oVar = new o();
        }
        this.f35774q = oVar;
        this.f35778u = new RectF();
        this.f35779v = true;
        this.f35780w = true;
        this.cornerSpringAnimations = new O0.l[4];
        this.f35759b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u0();
        q0(getState());
        this.f35773p = new b();
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public n f35786a;

        /* renamed from: b, reason: collision with root package name */
        public s f35787b;

        /* renamed from: c, reason: collision with root package name */
        public C6680a f35788c;

        /* renamed from: d, reason: collision with root package name */
        public ColorFilter f35789d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f35790e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f35791f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f35792g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f35793h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f35794i;

        /* renamed from: j, reason: collision with root package name */
        public Rect f35795j;

        /* renamed from: k, reason: collision with root package name */
        public float f35796k;

        /* renamed from: l, reason: collision with root package name */
        public float f35797l;

        /* renamed from: m, reason: collision with root package name */
        public float f35798m;

        /* renamed from: n, reason: collision with root package name */
        public int f35799n;

        /* renamed from: o, reason: collision with root package name */
        public float f35800o;

        /* renamed from: p, reason: collision with root package name */
        public float f35801p;

        /* renamed from: q, reason: collision with root package name */
        public float f35802q;

        /* renamed from: r, reason: collision with root package name */
        public int f35803r;

        /* renamed from: s, reason: collision with root package name */
        public int f35804s;

        /* renamed from: t, reason: collision with root package name */
        public int f35805t;

        /* renamed from: u, reason: collision with root package name */
        public int f35806u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f35807v;

        /* renamed from: w, reason: collision with root package name */
        public Paint.Style f35808w;

        public c(n nVar, C6680a c6680a) {
            this.f35790e = null;
            this.f35791f = null;
            this.f35792g = null;
            this.f35793h = null;
            this.f35794i = PorterDuff.Mode.SRC_IN;
            this.f35795j = null;
            this.f35796k = 1.0f;
            this.f35797l = 1.0f;
            this.f35799n = 255;
            this.f35800o = 0.0f;
            this.f35801p = 0.0f;
            this.f35802q = 0.0f;
            this.f35803r = 0;
            this.f35804s = 0;
            this.f35805t = 0;
            this.f35806u = 0;
            this.f35807v = false;
            this.f35808w = Paint.Style.FILL_AND_STROKE;
            this.f35786a = nVar;
            this.f35788c = c6680a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i(this);
            iVar.f35761d = true;
            iVar.f35762e = true;
            return iVar;
        }

        public c(c cVar) {
            this.f35790e = null;
            this.f35791f = null;
            this.f35792g = null;
            this.f35793h = null;
            this.f35794i = PorterDuff.Mode.SRC_IN;
            this.f35795j = null;
            this.f35796k = 1.0f;
            this.f35797l = 1.0f;
            this.f35799n = 255;
            this.f35800o = 0.0f;
            this.f35801p = 0.0f;
            this.f35802q = 0.0f;
            this.f35803r = 0;
            this.f35804s = 0;
            this.f35805t = 0;
            this.f35806u = 0;
            this.f35807v = false;
            this.f35808w = Paint.Style.FILL_AND_STROKE;
            this.f35786a = cVar.f35786a;
            this.f35787b = cVar.f35787b;
            this.f35788c = cVar.f35788c;
            this.f35798m = cVar.f35798m;
            this.f35789d = cVar.f35789d;
            this.f35790e = cVar.f35790e;
            this.f35791f = cVar.f35791f;
            this.f35794i = cVar.f35794i;
            this.f35793h = cVar.f35793h;
            this.f35799n = cVar.f35799n;
            this.f35796k = cVar.f35796k;
            this.f35805t = cVar.f35805t;
            this.f35803r = cVar.f35803r;
            this.f35807v = cVar.f35807v;
            this.f35797l = cVar.f35797l;
            this.f35800o = cVar.f35800o;
            this.f35801p = cVar.f35801p;
            this.f35802q = cVar.f35802q;
            this.f35804s = cVar.f35804s;
            this.f35806u = cVar.f35806u;
            this.f35792g = cVar.f35792g;
            this.f35808w = cVar.f35808w;
            if (cVar.f35795j != null) {
                this.f35795j = new Rect(cVar.f35795j);
            }
        }
    }
}
