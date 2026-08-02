package com.google.android.material.chip;

import Ca.c;
import Ca.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.AbstractC2074d;
import com.google.android.material.shape.i;
import ia.m;
import ja.C5110g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import pa.AbstractC6059a;
import sa.AbstractC6344a;
import ua.d;
import w0.C6695a;
import xa.i;
import xa.l;
import xa.o;

/* loaded from: classes3.dex */
public class a extends i implements Drawable.Callback, i.b {
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};

    /* renamed from: u5, reason: collision with root package name */
    public static final ShapeDrawable f35190u5 = new ShapeDrawable(new OvalShape());

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f35191D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f35192E;

    /* renamed from: F, reason: collision with root package name */
    public float f35193F;

    /* renamed from: G, reason: collision with root package name */
    public float f35194G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f35195H;

    /* renamed from: I, reason: collision with root package name */
    public float f35196I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f35197J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f35198K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f35199L;

    /* renamed from: O, reason: collision with root package name */
    public Drawable f35200O;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f35201P;

    /* renamed from: P4, reason: collision with root package name */
    public float f35202P4;

    /* renamed from: Q4, reason: collision with root package name */
    public float f35203Q4;

    /* renamed from: R, reason: collision with root package name */
    public float f35204R;

    /* renamed from: R4, reason: collision with root package name */
    public float f35205R4;

    /* renamed from: S4, reason: collision with root package name */
    public final Context f35206S4;

    /* renamed from: T, reason: collision with root package name */
    public boolean f35207T;

    /* renamed from: T1, reason: collision with root package name */
    public C5110g f35208T1;

    /* renamed from: T4, reason: collision with root package name */
    public final Paint f35209T4;

    /* renamed from: U4, reason: collision with root package name */
    public final Paint f35210U4;

    /* renamed from: V, reason: collision with root package name */
    public boolean f35211V;

    /* renamed from: V1, reason: collision with root package name */
    public C5110g f35212V1;

    /* renamed from: V4, reason: collision with root package name */
    public final Paint.FontMetrics f35213V4;

    /* renamed from: W, reason: collision with root package name */
    public Drawable f35214W;

    /* renamed from: W4, reason: collision with root package name */
    public final RectF f35215W4;

    /* renamed from: X, reason: collision with root package name */
    public Drawable f35216X;

    /* renamed from: X4, reason: collision with root package name */
    public final PointF f35217X4;

    /* renamed from: Y, reason: collision with root package name */
    public ColorStateList f35218Y;

    /* renamed from: Y4, reason: collision with root package name */
    public final Path f35219Y4;

    /* renamed from: Z, reason: collision with root package name */
    public float f35220Z;

    /* renamed from: Z4, reason: collision with root package name */
    public final xa.i f35221Z4;

    /* renamed from: a5, reason: collision with root package name */
    public int f35222a5;

    /* renamed from: b1, reason: collision with root package name */
    public CharSequence f35223b1;

    /* renamed from: b2, reason: collision with root package name */
    public float f35224b2;

    /* renamed from: b5, reason: collision with root package name */
    public int f35225b5;

    /* renamed from: c5, reason: collision with root package name */
    public int f35226c5;
    private int[] closeIconStateSet;

    /* renamed from: d5, reason: collision with root package name */
    public int f35227d5;

    /* renamed from: e5, reason: collision with root package name */
    public int f35228e5;

    /* renamed from: f5, reason: collision with root package name */
    public int f35229f5;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f35230g1;

    /* renamed from: g2, reason: collision with root package name */
    public float f35231g2;

    /* renamed from: g5, reason: collision with root package name */
    public boolean f35232g5;

    /* renamed from: h5, reason: collision with root package name */
    public int f35233h5;

    /* renamed from: i5, reason: collision with root package name */
    public int f35234i5;

    /* renamed from: j5, reason: collision with root package name */
    public ColorFilter f35235j5;

    /* renamed from: k5, reason: collision with root package name */
    public PorterDuffColorFilter f35236k5;

    /* renamed from: l5, reason: collision with root package name */
    public ColorStateList f35237l5;

    /* renamed from: m5, reason: collision with root package name */
    public PorterDuff.Mode f35238m5;

    /* renamed from: n5, reason: collision with root package name */
    public boolean f35239n5;

    /* renamed from: o5, reason: collision with root package name */
    public ColorStateList f35240o5;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f35241p1;

    /* renamed from: p2, reason: collision with root package name */
    public float f35242p2;

    /* renamed from: p5, reason: collision with root package name */
    public WeakReference f35243p5;

    /* renamed from: q5, reason: collision with root package name */
    public TextUtils.TruncateAt f35244q5;

    /* renamed from: r5, reason: collision with root package name */
    public boolean f35245r5;

    /* renamed from: s5, reason: collision with root package name */
    public int f35246s5;

    /* renamed from: t5, reason: collision with root package name */
    public boolean f35247t5;

    /* renamed from: x1, reason: collision with root package name */
    public Drawable f35248x1;

    /* renamed from: x2, reason: collision with root package name */
    public float f35249x2;

    /* renamed from: y1, reason: collision with root package name */
    public ColorStateList f35250y1;

    /* renamed from: y2, reason: collision with root package name */
    public float f35251y2;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0498a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f35194G = -1.0f;
        this.f35209T4 = new Paint(1);
        this.f35213V4 = new Paint.FontMetrics();
        this.f35215W4 = new RectF();
        this.f35217X4 = new PointF();
        this.f35219Y4 = new Path();
        this.f35234i5 = 255;
        this.f35238m5 = PorterDuff.Mode.SRC_IN;
        this.f35243p5 = new WeakReference(null);
        T(context);
        this.f35206S4 = context;
        xa.i iVar = new xa.i(this);
        this.f35221Z4 = iVar;
        this.f35198K = "";
        iVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f35210U4 = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        y2(iArr);
        this.f35245r5 = true;
        f35190u5.setTint(-1);
    }

    public static boolean D1(e eVar) {
        return (eVar == null || eVar.j() == null || !eVar.j().isStateful()) ? false : true;
    }

    public static boolean E1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean F1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static a H0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.G1(attributeSet, i10, i11);
        return aVar;
    }

    public static boolean z1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public final void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f10 = this.f35205R4 + this.f35203Q4;
            if (AbstractC5597a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f35220Z;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f35220Z;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f35220Z;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean A1() {
        return this.f35230g1;
    }

    public void A2(int i10) {
        z2(AbstractC5596a.a(this.f35206S4, i10));
    }

    public final void B0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f10 = this.f35205R4 + this.f35203Q4 + this.f35220Z + this.f35202P4 + this.f35251y2;
            if (AbstractC5597a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean B1() {
        return F1(this.f35214W);
    }

    public void B2(boolean z10) {
        if (this.f35211V != z10) {
            boolean c32 = c3();
            this.f35211V = z10;
            boolean c33 = c3();
            if (c32 != c33) {
                if (c33) {
                    w0(this.f35214W);
                } else {
                    d3(this.f35214W);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public float C0() {
        if (c3()) {
            return this.f35202P4 + this.f35220Z + this.f35203Q4;
        }
        return 0.0f;
    }

    public boolean C1() {
        return this.f35211V;
    }

    public void C2(InterfaceC0498a interfaceC0498a) {
        this.f35243p5 = new WeakReference(interfaceC0498a);
    }

    public final void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f35198K != null) {
            float y02 = this.f35224b2 + y0() + this.f35249x2;
            float C02 = this.f35205R4 + C0() + this.f35251y2;
            if (AbstractC5597a.f(this) == 0) {
                rectF.left = rect.left + y02;
                rectF.right = rect.right - C02;
            } else {
                rectF.left = rect.left + C02;
                rectF.right = rect.right - y02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void D2(TextUtils.TruncateAt truncateAt) {
        this.f35244q5 = truncateAt;
    }

    public final float E0() {
        this.f35221Z4.g().getFontMetrics(this.f35213V4);
        Paint.FontMetrics fontMetrics = this.f35213V4;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void E2(C5110g c5110g) {
        this.f35212V1 = c5110g;
    }

    public Paint.Align F0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f35198K != null) {
            float y02 = this.f35224b2 + y0() + this.f35249x2;
            if (AbstractC5597a.f(this) == 0) {
                pointF.x = rect.left + y02;
            } else {
                pointF.x = rect.right - y02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - E0();
        }
        return align;
    }

    public void F2(int i10) {
        E2(C5110g.c(this.f35206S4, i10));
    }

    public final boolean G0() {
        return this.f35241p1 && this.f35248x1 != null && this.f35230g1;
    }

    public final void G1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray i12 = l.i(this.f35206S4, attributeSet, m.Chip, i10, i11, new int[0]);
        this.f35247t5 = i12.hasValue(m.f48982o1);
        o2(c.a(this.f35206S4, i12, m.f48852b1));
        S1(c.a(this.f35206S4, i12, m.f48729O0));
        g2(i12.getDimension(m.f48805W0, 0.0f));
        if (i12.hasValue(m.f48739P0)) {
            U1(i12.getDimension(m.f48739P0, 0.0f));
        }
        k2(c.a(this.f35206S4, i12, m.f48832Z0));
        m2(i12.getDimension(m.f48842a1, 0.0f));
        L2(c.a(this.f35206S4, i12, m.f48972n1));
        Q2(i12.getText(m.f48669I0));
        e h10 = c.h(this.f35206S4, i12, m.f48629E0);
        h10.o(i12.getDimension(m.f48639F0, h10.k()));
        R2(h10);
        int i13 = i12.getInt(m.f48649G0, 0);
        if (i13 == 1) {
            D2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            D2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            D2(TextUtils.TruncateAt.END);
        }
        f2(i12.getBoolean(m.f48796V0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            f2(i12.getBoolean(m.f48769S0, false));
        }
        Y1(c.e(this.f35206S4, i12, m.f48759R0));
        if (i12.hasValue(m.f48787U0)) {
            c2(c.a(this.f35206S4, i12, m.f48787U0));
        }
        a2(i12.getDimension(m.f48778T0, -1.0f));
        B2(i12.getBoolean(m.f48922i1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            B2(i12.getBoolean(m.f48872d1, false));
        }
        p2(c.e(this.f35206S4, i12, m.f48862c1));
        z2(c.a(this.f35206S4, i12, m.f48912h1));
        u2(i12.getDimension(m.f48892f1, 0.0f));
        K1(i12.getBoolean(m.f48679J0, false));
        R1(i12.getBoolean(m.f48719N0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            R1(i12.getBoolean(m.f48699L0, false));
        }
        M1(c.e(this.f35206S4, i12, m.f48689K0));
        if (i12.hasValue(m.f48709M0)) {
            O1(c.a(this.f35206S4, i12, m.f48709M0));
        }
        O2(C5110g.b(this.f35206S4, i12, m.f48992p1));
        E2(C5110g.b(this.f35206S4, i12, m.f48942k1));
        i2(i12.getDimension(m.f48823Y0, 0.0f));
        I2(i12.getDimension(m.f48962m1, 0.0f));
        G2(i12.getDimension(m.f48952l1, 0.0f));
        W2(i12.getDimension(m.f49012r1, 0.0f));
        T2(i12.getDimension(m.f49002q1, 0.0f));
        w2(i12.getDimension(m.f48902g1, 0.0f));
        r2(i12.getDimension(m.f48882e1, 0.0f));
        W1(i12.getDimension(m.f48749Q0, 0.0f));
        K2(i12.getDimensionPixelSize(m.f48659H0, Integer.MAX_VALUE));
        i12.recycle();
    }

    public void G2(float f10) {
        if (this.f35242p2 != f10) {
            float y02 = y0();
            this.f35242p2 = f10;
            float y03 = y0();
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public void H1() {
        InterfaceC0498a interfaceC0498a = (InterfaceC0498a) this.f35243p5.get();
        if (interfaceC0498a != null) {
            interfaceC0498a.a();
        }
    }

    public void H2(int i10) {
        G2(this.f35206S4.getResources().getDimension(i10));
    }

    public final void I0(Canvas canvas, Rect rect) {
        if (a3()) {
            x0(rect, this.f35215W4);
            RectF rectF = this.f35215W4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f35248x1.setBounds(0, 0, (int) this.f35215W4.width(), (int) this.f35215W4.height());
            this.f35248x1.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean I1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f35191D;
        int q10 = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f35222a5) : 0);
        boolean z11 = true;
        if (this.f35222a5 != q10) {
            this.f35222a5 = q10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f35192E;
        int q11 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f35225b5) : 0);
        if (this.f35225b5 != q11) {
            this.f35225b5 = q11;
            onStateChange = true;
        }
        int i10 = AbstractC6344a.i(q10, q11);
        if ((this.f35226c5 != i10) | (B() == null)) {
            this.f35226c5 = i10;
            f0(ColorStateList.valueOf(i10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f35195H;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f35227d5) : 0;
        if (this.f35227d5 != colorForState) {
            this.f35227d5 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f35240o5 == null || !Da.a.e(iArr)) ? 0 : this.f35240o5.getColorForState(iArr, this.f35228e5);
        if (this.f35228e5 != colorForState2) {
            this.f35228e5 = colorForState2;
            if (this.f35239n5) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f35221Z4.e() == null || this.f35221Z4.e().j() == null) ? 0 : this.f35221Z4.e().j().getColorForState(iArr, this.f35229f5);
        if (this.f35229f5 != colorForState3) {
            this.f35229f5 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = z1(getState(), R.attr.state_checked) && this.f35230g1;
        if (this.f35232g5 == z12 || this.f35248x1 == null) {
            z10 = false;
        } else {
            float y02 = y0();
            this.f35232g5 = z12;
            if (y02 != y0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f35237l5;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f35233h5) : 0;
        if (this.f35233h5 != colorForState4) {
            this.f35233h5 = colorForState4;
            this.f35236k5 = d.m(this, this.f35237l5, this.f35238m5);
        } else {
            z11 = onStateChange;
        }
        if (F1(this.f35200O)) {
            z11 |= this.f35200O.setState(iArr);
        }
        if (F1(this.f35248x1)) {
            z11 |= this.f35248x1.setState(iArr);
        }
        if (F1(this.f35214W)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.f35214W.setState(iArr3);
        }
        if (F1(this.f35216X)) {
            z11 |= this.f35216X.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            H1();
        }
        return z11;
    }

    public void I2(float f10) {
        if (this.f35231g2 != f10) {
            float y02 = y0();
            this.f35231g2 = f10;
            float y03 = y0();
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public final void J0(Canvas canvas, Rect rect) {
        if (this.f35247t5) {
            return;
        }
        this.f35209T4.setColor(this.f35225b5);
        this.f35209T4.setStyle(Paint.Style.FILL);
        this.f35209T4.setColorFilter(x1());
        this.f35215W4.set(rect);
        canvas.drawRoundRect(this.f35215W4, U0(), U0(), this.f35209T4);
    }

    public boolean J1(boolean z10) {
        if (this.f35214W != null) {
            return y2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : DEFAULT_STATE);
        }
        return false;
    }

    public void J2(int i10) {
        I2(this.f35206S4.getResources().getDimension(i10));
    }

    public final void K0(Canvas canvas, Rect rect) {
        if (b3()) {
            x0(rect, this.f35215W4);
            RectF rectF = this.f35215W4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f35200O.setBounds(0, 0, (int) this.f35215W4.width(), (int) this.f35215W4.height());
            this.f35200O.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void K1(boolean z10) {
        if (this.f35230g1 != z10) {
            this.f35230g1 = z10;
            float y02 = y0();
            if (!z10 && this.f35232g5) {
                this.f35232g5 = false;
            }
            float y03 = y0();
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public void K2(int i10) {
        this.f35246s5 = i10;
    }

    public final void L0(Canvas canvas, Rect rect) {
        if (this.f35196I <= 0.0f || this.f35247t5) {
            return;
        }
        this.f35209T4.setColor(this.f35227d5);
        this.f35209T4.setStyle(Paint.Style.STROKE);
        if (!this.f35247t5) {
            this.f35209T4.setColorFilter(x1());
        }
        RectF rectF = this.f35215W4;
        float f10 = rect.left;
        float f11 = this.f35196I;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f35194G - (this.f35196I / 2.0f);
        canvas.drawRoundRect(this.f35215W4, f12, f12, this.f35209T4);
    }

    public void L1(int i10) {
        K1(this.f35206S4.getResources().getBoolean(i10));
    }

    public void L2(ColorStateList colorStateList) {
        if (this.f35197J != colorStateList) {
            this.f35197J = colorStateList;
            e3();
            onStateChange(getState());
        }
    }

    public final void M0(Canvas canvas, Rect rect) {
        if (this.f35247t5) {
            return;
        }
        this.f35209T4.setColor(this.f35222a5);
        this.f35209T4.setStyle(Paint.Style.FILL);
        this.f35215W4.set(rect);
        canvas.drawRoundRect(this.f35215W4, U0(), U0(), this.f35209T4);
    }

    public void M1(Drawable drawable) {
        if (this.f35248x1 != drawable) {
            float y02 = y0();
            this.f35248x1 = drawable;
            float y03 = y0();
            d3(this.f35248x1);
            w0(this.f35248x1);
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public void M2(int i10) {
        L2(AbstractC5596a.a(this.f35206S4, i10));
    }

    public final void N0(Canvas canvas, Rect rect) {
        if (c3()) {
            A0(rect, this.f35215W4);
            RectF rectF = this.f35215W4;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f35214W.setBounds(0, 0, (int) this.f35215W4.width(), (int) this.f35215W4.height());
            this.f35216X.setBounds(this.f35214W.getBounds());
            this.f35216X.jumpToCurrentState();
            this.f35216X.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void N1(int i10) {
        M1(AbstractC5596a.b(this.f35206S4, i10));
    }

    public void N2(boolean z10) {
        this.f35245r5 = z10;
    }

    public final void O0(Canvas canvas, Rect rect) {
        this.f35209T4.setColor(this.f35228e5);
        this.f35209T4.setStyle(Paint.Style.FILL);
        this.f35215W4.set(rect);
        if (!this.f35247t5) {
            canvas.drawRoundRect(this.f35215W4, U0(), U0(), this.f35209T4);
        } else {
            l(new RectF(rect), this.f35219Y4);
            super.u(canvas, this.f35209T4, this.f35219Y4, x());
        }
    }

    public void O1(ColorStateList colorStateList) {
        if (this.f35250y1 != colorStateList) {
            this.f35250y1 = colorStateList;
            if (G0()) {
                this.f35248x1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O2(C5110g c5110g) {
        this.f35208T1 = c5110g;
    }

    public final void P0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f35210U4;
        if (paint != null) {
            paint.setColor(AbstractC2074d.k(-16777216, 127));
            canvas.drawRect(rect, this.f35210U4);
            if (b3() || a3()) {
                x0(rect, this.f35215W4);
                canvas.drawRect(this.f35215W4, this.f35210U4);
            }
            if (this.f35198K != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f35210U4);
            } else {
                canvas2 = canvas;
            }
            if (c3()) {
                A0(rect, this.f35215W4);
                canvas2.drawRect(this.f35215W4, this.f35210U4);
            }
            this.f35210U4.setColor(AbstractC2074d.k(-65536, 127));
            z0(rect, this.f35215W4);
            canvas2.drawRect(this.f35215W4, this.f35210U4);
            this.f35210U4.setColor(AbstractC2074d.k(-16711936, 127));
            B0(rect, this.f35215W4);
            canvas2.drawRect(this.f35215W4, this.f35210U4);
        }
    }

    public void P1(int i10) {
        O1(AbstractC5596a.a(this.f35206S4, i10));
    }

    public void P2(int i10) {
        O2(C5110g.c(this.f35206S4, i10));
    }

    public final void Q0(Canvas canvas, Rect rect) {
        if (this.f35198K != null) {
            Paint.Align F02 = F0(rect, this.f35217X4);
            D0(rect, this.f35215W4);
            if (this.f35221Z4.e() != null) {
                this.f35221Z4.g().drawableState = getState();
                this.f35221Z4.n(this.f35206S4);
            }
            this.f35221Z4.g().setTextAlign(F02);
            int i10 = 0;
            boolean z10 = Math.round(this.f35221Z4.h(t1().toString())) > Math.round(this.f35215W4.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f35215W4);
            }
            CharSequence charSequence = this.f35198K;
            if (z10 && this.f35244q5 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f35221Z4.g(), this.f35215W4.width(), this.f35244q5);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f35217X4;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f35221Z4.g());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void Q1(int i10) {
        R1(this.f35206S4.getResources().getBoolean(i10));
    }

    public void Q2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f35198K, charSequence)) {
            return;
        }
        this.f35198K = charSequence;
        this.f35221Z4.m(true);
        invalidateSelf();
        H1();
    }

    public Drawable R0() {
        return this.f35248x1;
    }

    public void R1(boolean z10) {
        if (this.f35241p1 != z10) {
            boolean a32 = a3();
            this.f35241p1 = z10;
            boolean a33 = a3();
            if (a32 != a33) {
                if (a33) {
                    w0(this.f35248x1);
                } else {
                    d3(this.f35248x1);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public void R2(e eVar) {
        this.f35221Z4.k(eVar, this.f35206S4);
    }

    public ColorStateList S0() {
        return this.f35250y1;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.f35192E != colorStateList) {
            this.f35192E = colorStateList;
            onStateChange(getState());
        }
    }

    public void S2(int i10) {
        R2(new e(this.f35206S4, i10));
    }

    public ColorStateList T0() {
        return this.f35192E;
    }

    public void T1(int i10) {
        S1(AbstractC5596a.a(this.f35206S4, i10));
    }

    public void T2(float f10) {
        if (this.f35251y2 != f10) {
            this.f35251y2 = f10;
            invalidateSelf();
            H1();
        }
    }

    public float U0() {
        return this.f35247t5 ? M() : this.f35194G;
    }

    public void U1(float f10) {
        if (this.f35194G != f10) {
            this.f35194G = f10;
            setShapeAppearanceModel(H().x(f10));
        }
    }

    public void U2(int i10) {
        T2(this.f35206S4.getResources().getDimension(i10));
    }

    public float V0() {
        return this.f35205R4;
    }

    public void V1(int i10) {
        U1(this.f35206S4.getResources().getDimension(i10));
    }

    public void V2(float f10) {
        e u12 = u1();
        if (u12 != null) {
            u12.o(f10);
            this.f35221Z4.g().setTextSize(f10);
            a();
        }
    }

    public Drawable W0() {
        Drawable drawable = this.f35200O;
        if (drawable != null) {
            return AbstractC5597a.q(drawable);
        }
        return null;
    }

    public void W1(float f10) {
        if (this.f35205R4 != f10) {
            this.f35205R4 = f10;
            invalidateSelf();
            H1();
        }
    }

    public void W2(float f10) {
        if (this.f35249x2 != f10) {
            this.f35249x2 = f10;
            invalidateSelf();
            H1();
        }
    }

    public float X0() {
        return this.f35204R;
    }

    public void X1(int i10) {
        W1(this.f35206S4.getResources().getDimension(i10));
    }

    public void X2(int i10) {
        W2(this.f35206S4.getResources().getDimension(i10));
    }

    public ColorStateList Y0() {
        return this.f35201P;
    }

    public void Y1(Drawable drawable) {
        Drawable W02 = W0();
        if (W02 != drawable) {
            float y02 = y0();
            this.f35200O = drawable != null ? AbstractC5597a.r(drawable).mutate() : null;
            float y03 = y0();
            d3(W02);
            if (b3()) {
                w0(this.f35200O);
            }
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public void Y2(boolean z10) {
        if (this.f35239n5 != z10) {
            this.f35239n5 = z10;
            e3();
            onStateChange(getState());
        }
    }

    public float Z0() {
        return this.f35193F;
    }

    public void Z1(int i10) {
        Y1(AbstractC5596a.b(this.f35206S4, i10));
    }

    public boolean Z2() {
        return this.f35245r5;
    }

    @Override // xa.i.b
    public void a() {
        H1();
        invalidateSelf();
    }

    public float a1() {
        return this.f35224b2;
    }

    public void a2(float f10) {
        if (this.f35204R != f10) {
            float y02 = y0();
            this.f35204R = f10;
            float y03 = y0();
            invalidateSelf();
            if (y02 != y03) {
                H1();
            }
        }
    }

    public final boolean a3() {
        return this.f35241p1 && this.f35248x1 != null && this.f35232g5;
    }

    public ColorStateList b1() {
        return this.f35195H;
    }

    public void b2(int i10) {
        a2(this.f35206S4.getResources().getDimension(i10));
    }

    public final boolean b3() {
        return this.f35199L && this.f35200O != null;
    }

    public float c1() {
        return this.f35196I;
    }

    public void c2(ColorStateList colorStateList) {
        this.f35207T = true;
        if (this.f35201P != colorStateList) {
            this.f35201P = colorStateList;
            if (b3()) {
                this.f35200O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean c3() {
        return this.f35211V && this.f35214W != null;
    }

    public Drawable d1() {
        Drawable drawable = this.f35214W;
        if (drawable != null) {
            return AbstractC5597a.q(drawable);
        }
        return null;
    }

    public void d2(int i10) {
        c2(AbstractC5596a.a(this.f35206S4, i10));
    }

    public final void d3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.f35234i5;
        if (i11 < 255) {
            canvas2 = canvas;
            i10 = AbstractC6059a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            i10 = 0;
        }
        M0(canvas2, bounds);
        J0(canvas2, bounds);
        if (this.f35247t5) {
            super.draw(canvas2);
        }
        L0(canvas2, bounds);
        O0(canvas2, bounds);
        K0(canvas2, bounds);
        I0(canvas2, bounds);
        if (this.f35245r5) {
            Q0(canvas2, bounds);
        }
        N0(canvas2, bounds);
        P0(canvas2, bounds);
        if (this.f35234i5 < 255) {
            canvas2.restoreToCount(i10);
        }
    }

    public CharSequence e1() {
        return this.f35223b1;
    }

    public void e2(int i10) {
        f2(this.f35206S4.getResources().getBoolean(i10));
    }

    public final void e3() {
        this.f35240o5 = this.f35239n5 ? Da.a.d(this.f35197J) : null;
    }

    public float f1() {
        return this.f35203Q4;
    }

    public void f2(boolean z10) {
        if (this.f35199L != z10) {
            boolean b32 = b3();
            this.f35199L = z10;
            boolean b33 = b3();
            if (b32 != b33) {
                if (b33) {
                    w0(this.f35200O);
                } else {
                    d3(this.f35200O);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public final void f3() {
        this.f35216X = new RippleDrawable(Da.a.d(r1()), this.f35214W, f35190u5);
    }

    public float g1() {
        return this.f35220Z;
    }

    public void g2(float f10) {
        if (this.f35193F != f10) {
            this.f35193F = f10;
            invalidateSelf();
            H1();
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35234i5;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f35235j5;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f35193F;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f35224b2 + y0() + this.f35249x2 + this.f35221Z4.h(t1().toString()) + this.f35251y2 + C0() + this.f35205R4), this.f35246s5);
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f35247t5) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f35194G);
        } else {
            outline.setRoundRect(bounds, this.f35194G);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f35202P4;
    }

    public void h2(int i10) {
        g2(this.f35206S4.getResources().getDimension(i10));
    }

    public int[] i1() {
        return this.closeIconStateSet;
    }

    public void i2(float f10) {
        if (this.f35224b2 != f10) {
            this.f35224b2 = f10;
            invalidateSelf();
            H1();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (E1(this.f35191D) || E1(this.f35192E) || E1(this.f35195H)) {
            return true;
        }
        return (this.f35239n5 && E1(this.f35240o5)) || D1(this.f35221Z4.e()) || G0() || F1(this.f35200O) || F1(this.f35248x1) || E1(this.f35237l5);
    }

    public ColorStateList j1() {
        return this.f35218Y;
    }

    public void j2(int i10) {
        i2(this.f35206S4.getResources().getDimension(i10));
    }

    public void k1(RectF rectF) {
        B0(getBounds(), rectF);
    }

    public void k2(ColorStateList colorStateList) {
        if (this.f35195H != colorStateList) {
            this.f35195H = colorStateList;
            if (this.f35247t5) {
                o0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final float l1() {
        Drawable drawable = this.f35232g5 ? this.f35248x1 : this.f35200O;
        float f10 = this.f35204R;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(o.d(this.f35206S4, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    public void l2(int i10) {
        k2(AbstractC5596a.a(this.f35206S4, i10));
    }

    public final float m1() {
        Drawable drawable = this.f35232g5 ? this.f35248x1 : this.f35200O;
        float f10 = this.f35204R;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void m2(float f10) {
        if (this.f35196I != f10) {
            this.f35196I = f10;
            this.f35209T4.setStrokeWidth(f10);
            if (this.f35247t5) {
                super.p0(f10);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt n1() {
        return this.f35244q5;
    }

    public void n2(int i10) {
        m2(this.f35206S4.getResources().getDimension(i10));
    }

    public C5110g o1() {
        return this.f35212V1;
    }

    public final void o2(ColorStateList colorStateList) {
        if (this.f35191D != colorStateList) {
            this.f35191D = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (b3()) {
            onLayoutDirectionChanged |= AbstractC5597a.m(this.f35200O, i10);
        }
        if (a3()) {
            onLayoutDirectionChanged |= AbstractC5597a.m(this.f35248x1, i10);
        }
        if (c3()) {
            onLayoutDirectionChanged |= AbstractC5597a.m(this.f35214W, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (b3()) {
            onLevelChange |= this.f35200O.setLevel(i10);
        }
        if (a3()) {
            onLevelChange |= this.f35248x1.setLevel(i10);
        }
        if (c3()) {
            onLevelChange |= this.f35214W.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable, xa.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f35247t5) {
            super.onStateChange(iArr);
        }
        return I1(iArr, i1());
    }

    public float p1() {
        return this.f35242p2;
    }

    public void p2(Drawable drawable) {
        Drawable d12 = d1();
        if (d12 != drawable) {
            float C02 = C0();
            this.f35214W = drawable != null ? AbstractC5597a.r(drawable).mutate() : null;
            f3();
            float C03 = C0();
            d3(d12);
            if (c3()) {
                w0(this.f35214W);
            }
            invalidateSelf();
            if (C02 != C03) {
                H1();
            }
        }
    }

    public float q1() {
        return this.f35231g2;
    }

    public void q2(CharSequence charSequence) {
        if (this.f35223b1 != charSequence) {
            this.f35223b1 = C6695a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList r1() {
        return this.f35197J;
    }

    public void r2(float f10) {
        if (this.f35203Q4 != f10) {
            this.f35203Q4 = f10;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public C5110g s1() {
        return this.f35208T1;
    }

    public void s2(int i10) {
        r2(this.f35206S4.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f35234i5 != i10) {
            this.f35234i5 = i10;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f35235j5 != colorFilter) {
            this.f35235j5 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f35237l5 != colorStateList) {
            this.f35237l5 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f35238m5 != mode) {
            this.f35238m5 = mode;
            this.f35236k5 = d.m(this, this.f35237l5, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (b3()) {
            visible |= this.f35200O.setVisible(z10, z11);
        }
        if (a3()) {
            visible |= this.f35248x1.setVisible(z10, z11);
        }
        if (c3()) {
            visible |= this.f35214W.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public CharSequence t1() {
        return this.f35198K;
    }

    public void t2(int i10) {
        p2(AbstractC5596a.b(this.f35206S4, i10));
    }

    public e u1() {
        return this.f35221Z4.e();
    }

    public void u2(float f10) {
        if (this.f35220Z != f10) {
            this.f35220Z = f10;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.f35251y2;
    }

    public void v2(int i10) {
        u2(this.f35206S4.getResources().getDimension(i10));
    }

    public final void w0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC5597a.m(drawable, AbstractC5597a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f35214W) {
            if (drawable.isStateful()) {
                drawable.setState(i1());
            }
            drawable.setTintList(this.f35218Y);
            return;
        }
        Drawable drawable2 = this.f35200O;
        if (drawable == drawable2 && this.f35207T) {
            drawable2.setTintList(this.f35201P);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float w1() {
        return this.f35249x2;
    }

    public void w2(float f10) {
        if (this.f35202P4 != f10) {
            this.f35202P4 = f10;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public final void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b3() || a3()) {
            float f10 = this.f35224b2 + this.f35231g2;
            float m12 = m1();
            if (AbstractC5597a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + m12;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - m12;
            }
            float l12 = l1();
            float exactCenterY = rect.exactCenterY() - (l12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + l12;
        }
    }

    public final ColorFilter x1() {
        ColorFilter colorFilter = this.f35235j5;
        return colorFilter != null ? colorFilter : this.f35236k5;
    }

    public void x2(int i10) {
        w2(this.f35206S4.getResources().getDimension(i10));
    }

    public float y0() {
        if (b3() || a3()) {
            return this.f35231g2 + m1() + this.f35242p2;
        }
        return 0.0f;
    }

    public boolean y1() {
        return this.f35239n5;
    }

    public boolean y2(int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (c3()) {
            return I1(getState(), iArr);
        }
        return false;
    }

    public final void z0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (c3()) {
            float f10 = this.f35205R4 + this.f35203Q4 + this.f35220Z + this.f35202P4 + this.f35251y2;
            if (AbstractC5597a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void z2(ColorStateList colorStateList) {
        if (this.f35218Y != colorStateList) {
            this.f35218Y = colorStateList;
            if (c3()) {
                this.f35214W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
