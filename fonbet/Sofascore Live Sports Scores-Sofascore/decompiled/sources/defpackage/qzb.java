package defpackage;

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
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class qzb extends Drawable implements ach {
    public static final Paint F;
    public static final pzb[] G;
    public e0i A;
    public final d0i[] B;
    public float[] C;
    public float[] D;
    public kr9 E;
    public final bka a;
    public ozb b;
    public final rbh[] c;
    public final rbh[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final sah q;
    public final d4a r;
    public final qn2 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public int v;
    public final RectF w;
    public boolean x;
    public boolean y;
    public xah z;

    static {
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        G = new pzb[4];
        int i = 0;
        while (true) {
            pzb[] pzbVarArr = G;
            if (i >= pzbVarArr.length) {
                return;
            }
            pzbVarArr[i] = new pzb(i);
            i++;
        }
    }

    public qzb(ozb ozbVar) {
        this.a = new bka(this, 3);
        this.c = new rbh[4];
        this.d = new rbh[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new sah();
        this.s = qn2.k();
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new d0i[4];
        this.b = ozbVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        B(getState());
        this.r = new d4a(this, 5);
    }

    public final void A(float f) {
        this.b.k = f;
        invalidateSelf();
    }

    public final boolean B(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.c == null || color2 == (colorForState2 = this.b.c.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.d == null || color == (colorForState = this.b.d.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int[] iArr, boolean z) {
        boolean z2;
        RectF i = i();
        if (!this.b.a.f() || i.isEmpty()) {
            return;
        }
        int i2 = 0;
        boolean z3 = z | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        xah b = this.b.a.b(iArr);
        float[] fArr = this.C;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i3 = 1; i3 < fArr.length; i3++) {
                if (fArr[i3] != f) {
                    break;
                }
            }
        }
        if (b.l(i())) {
            z2 = true;
            this.y = z2;
            if (!z2) {
                this.f = true;
                this.g = true;
            }
            while (i2 < 4) {
                this.s.getClass();
                float a = (i2 != 1 ? i2 != 2 ? i2 != 3 ? b.f : b.e : b.h : b.g).a(i);
                if (z3) {
                    this.C[i2] = a;
                }
                d0i[] d0iVarArr = this.B;
                d0i d0iVar = d0iVarArr[i2];
                if (d0iVar != null) {
                    d0iVar.a(a);
                    if (z3) {
                        d0iVarArr[i2].e();
                    }
                }
                i2++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.y = z2;
        if (!z2) {
        }
        while (i2 < 4) {
        }
        if (z3) {
        }
    }

    public final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        ozb ozbVar = this.b;
        this.t = d(ozbVar.f, ozbVar.g, this.o, true);
        ozb ozbVar2 = this.b;
        this.u = d(ozbVar2.e, ozbVar2.g, this.p, false);
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter, this.t) && Objects.equals(porterDuffColorFilter2, this.u)) ? false : true;
    }

    public final void E() {
        ozb ozbVar = this.b;
        float f = ozbVar.n + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ozbVar.p = (int) Math.ceil(0.75f * f);
        this.b.q = (int) Math.ceil(f * 0.25f);
        D();
        if (n() || !q()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        this.s.c(this.b.a.d(), this.C, this.b.j, rectF, this.r, path);
        if (this.b.i != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final float c(RectF rectF, xah xahVar, float[] fArr) {
        if (fArr == null) {
            if (xahVar.l(rectF)) {
                return xahVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.y) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = e(colorForState);
            }
            this.v = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int e = e(color);
        this.v = e;
        if (e != color) {
            return new PorterDuffColorFilter(e, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint3 = this.p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.b.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = n() || !q();
        Paint.Style style = this.b.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f;
            paint = paint2;
            Path path = this.i;
            if (z2) {
                if (z) {
                    b(i(), path);
                }
                this.f = false;
            }
            if (n()) {
                canvas.save();
                canvas.translate((int) (this.b.q * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * this.b.q));
                if (this.x) {
                    Rect bounds = getBounds();
                    RectF rectF = this.w;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        zzl.m(lnb.s(width, height, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "), rectF);
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bf3.c(this.b.p, 2, (int) rectF.width(), width), bf3.c(this.b.p, 2, (int) rectF.height(), height), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.b.p;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    f(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    f(canvas);
                    canvas.restore();
                }
            }
            g(canvas, paint, path, this.b.a.d(), this.C, i());
        } else {
            paint = paint2;
        }
        if (o()) {
            if (this.g) {
                xah k = k();
                wah m = k.m();
                ut3 ut3Var = k.e;
                bka bkaVar = this.a;
                m.e = bkaVar.b(ut3Var);
                m.f = bkaVar.b(k.f);
                m.h = bkaVar.b(k.h);
                m.g = bkaVar.b(k.g);
                this.z = m.a();
                float[] fArr = this.C;
                if (fArr != null) {
                    if (this.D == null) {
                        this.D = new float[fArr.length];
                    }
                    float l = l();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.C;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.D[i5] = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr2[i5] - l);
                        i5++;
                    }
                } else {
                    this.D = null;
                }
                if (z) {
                    xah xahVar = this.z;
                    float[] fArr3 = this.D;
                    float f3 = this.b.j;
                    RectF i6 = i();
                    RectF rectF2 = this.l;
                    rectF2.set(i6);
                    float l2 = l();
                    rectF2.inset(l2, l2);
                    this.s.c(xahVar, fArr3, f3, rectF2, null, this.j);
                }
                this.g = false;
            }
            h(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final int e(int i) {
        ozb ozbVar = this.b;
        float f = ozbVar.n + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + ozbVar.m;
        dj5 dj5Var = ozbVar.b;
        return dj5Var != null ? dj5Var.a(f, i) : i;
    }

    public final void f(Canvas canvas) {
        this.e.cardinality();
        int i = this.b.q;
        Path path = this.i;
        sah sahVar = this.q;
        if (i != 0) {
            canvas.drawPath(path, (Paint) sahVar.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            rbh rbhVar = this.c[i2];
            int i3 = this.b.p;
            Matrix matrix = rbh.b;
            rbhVar.a(matrix, sahVar, i3, canvas);
            this.d[i2].a(matrix, sahVar, this.b.p, canvas);
        }
        if (this.x) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.b.q);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.b.q);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, F);
            canvas.translate(sin, cos);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, xah xahVar, float[] fArr, RectF rectF) {
        float c = c(rectF, xahVar, fArr);
        if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawPath(path, paint);
        } else {
            float f = c * this.b.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.b.o == 2) {
            return;
        }
        RectF i = i();
        if (i.isEmpty()) {
            return;
        }
        float c = c(i, this.b.a.d(), this.C);
        if (c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            outline.setRoundRect(getBounds(), c * this.b.j);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            b(i, path);
            this.f = false;
        }
        eq3.S(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF i = i();
        Path path = this.i;
        b(i, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public void h(Canvas canvas) {
        xah xahVar = this.z;
        float[] fArr = this.D;
        RectF i = i();
        RectF rectF = this.l;
        rectF.set(i);
        float l = l();
        rectF.inset(l, l);
        g(canvas, this.p, this.j, xahVar, fArr, rectF);
    }

    public final RectF i() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.b.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.b.c;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.b.a.f();
    }

    public final float j() {
        float[] fArr = this.C;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF i = i();
        xah k = k();
        qn2 qn2Var = this.s;
        qn2Var.getClass();
        float a = k.e.a(i);
        xah k2 = k();
        qn2Var.getClass();
        float a2 = k2.h.a(i) + a;
        xah k3 = k();
        qn2Var.getClass();
        float a3 = a2 - k3.g.a(i);
        xah k4 = k();
        qn2Var.getClass();
        return (a3 - k4.f.a(i)) / 2.0f;
    }

    public final xah k() {
        return this.b.a.d();
    }

    public final float l() {
        return o() ? this.p.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float m() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.b.a.d().e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new ozb(this.b);
        return this;
    }

    public final boolean n() {
        ozb ozbVar = this.b;
        int i = ozbVar.o;
        if (i == 1 || ozbVar.p <= 0) {
            return false;
        }
        return i == 2 || !(q() || this.i.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    public final boolean o() {
        Paint.Style style = this.b.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (!this.b.a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        d0i[] d0iVarArr = this.B;
        int length = d0iVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                d0i d0iVar = d0iVarArr[i];
                if (d0iVar != null && d0iVar.f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        C(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.a.f()) {
            C(iArr, false);
        }
        boolean z = B(iArr) || D();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(Context context) {
        this.b.b = new dj5(context);
        E();
    }

    public final boolean q() {
        if (this.b.a.b(getState()).l(i())) {
            return this.C == null || this.y;
        }
        return false;
    }

    public final void r(e0i e0iVar) {
        if (this.A == e0iVar) {
            return;
        }
        this.A = e0iVar;
        int i = 0;
        while (true) {
            d0i[] d0iVarArr = this.B;
            if (i >= d0iVarArr.length) {
                C(getState(), true);
                invalidateSelf();
                return;
            }
            if (d0iVarArr[i] == null) {
                d0iVarArr[i] = new d0i(this, G[i]);
            }
            d0i d0iVar = d0iVarArr[i];
            e0i e0iVar2 = new e0i();
            e0iVar2.a((float) e0iVar.b);
            double d = e0iVar.a;
            e0iVar2.b((float) (d * d));
            d0iVar.m = e0iVar2;
            i++;
        }
    }

    public final void s(float f) {
        ozb ozbVar = this.b;
        if (ozbVar.n != f) {
            ozbVar.n = f;
            E();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ozb ozbVar = this.b;
        if (ozbVar.l != i) {
            ozbVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.ach
    public final void setShapeAppearanceModel(xah xahVar) {
        this.b.a = xahVar;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.f = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ozb ozbVar = this.b;
        if (ozbVar.g != mode) {
            ozbVar.g = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t(ColorStateList colorStateList) {
        ozb ozbVar = this.b;
        if (ozbVar.c != colorStateList) {
            ozbVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void u(float f) {
        ozb ozbVar = this.b;
        if (ozbVar.j != f) {
            ozbVar.j = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    public final void v() {
        this.q.E(-12303292);
        this.b.getClass();
        super.invalidateSelf();
    }

    public final void w() {
        ozb ozbVar = this.b;
        if (ozbVar.o != 2) {
            ozbVar.o = 2;
            super.invalidateSelf();
        }
    }

    public final void x(vah vahVar) {
        if (vahVar instanceof xah) {
            setShapeAppearanceModel((xah) vahVar);
            return;
        }
        jdi jdiVar = (jdi) vahVar;
        ozb ozbVar = this.b;
        if (ozbVar.a != jdiVar) {
            ozbVar.a = jdiVar;
            C(getState(), true);
            invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        ozb ozbVar = this.b;
        if (ozbVar.d != colorStateList) {
            ozbVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void z(ColorStateList colorStateList) {
        this.b.e = colorStateList;
        D();
        super.invalidateSelf();
    }

    public qzb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(xah.h(context, attributeSet, i, i2).a());
    }

    public qzb(xah xahVar) {
        this(new ozb(xahVar));
    }

    public qzb(vah vahVar) {
        this(new ozb(vahVar));
    }

    public qzb() {
        this(new xah());
    }
}
