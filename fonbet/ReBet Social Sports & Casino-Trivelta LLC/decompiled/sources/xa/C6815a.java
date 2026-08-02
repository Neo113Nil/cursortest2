package xa;

import Ca.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.plaid.internal.EnumC3631g;
import ja.AbstractC5104a;
import s0.AbstractC6307a;
import sa.AbstractC6344a;

/* renamed from: xa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6815a {

    /* renamed from: A, reason: collision with root package name */
    public Typeface f67974A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f67975B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f67976C;

    /* renamed from: D, reason: collision with root package name */
    public Typeface f67977D;

    /* renamed from: E, reason: collision with root package name */
    public Ca.a f67978E;

    /* renamed from: F, reason: collision with root package name */
    public Ca.a f67979F;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f67981H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f67982I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f67983J;

    /* renamed from: L, reason: collision with root package name */
    public float f67985L;

    /* renamed from: M, reason: collision with root package name */
    public float f67986M;

    /* renamed from: N, reason: collision with root package name */
    public float f67987N;

    /* renamed from: O, reason: collision with root package name */
    public float f67988O;

    /* renamed from: P, reason: collision with root package name */
    public float f67989P;

    /* renamed from: Q, reason: collision with root package name */
    public int f67990Q;

    /* renamed from: R, reason: collision with root package name */
    public int f67991R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f67992S;

    /* renamed from: T, reason: collision with root package name */
    public final TextPaint f67993T;

    /* renamed from: U, reason: collision with root package name */
    public final TextPaint f67994U;

    /* renamed from: V, reason: collision with root package name */
    public TimeInterpolator f67995V;

    /* renamed from: W, reason: collision with root package name */
    public TimeInterpolator f67996W;

    /* renamed from: X, reason: collision with root package name */
    public float f67997X;

    /* renamed from: Y, reason: collision with root package name */
    public float f67998Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f67999Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f68000a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f68001a0;

    /* renamed from: b, reason: collision with root package name */
    public float f68002b;

    /* renamed from: b0, reason: collision with root package name */
    public float f68003b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68004c;

    /* renamed from: c0, reason: collision with root package name */
    public float f68005c0;

    /* renamed from: d, reason: collision with root package name */
    public float f68006d;

    /* renamed from: d0, reason: collision with root package name */
    public float f68007d0;

    /* renamed from: e, reason: collision with root package name */
    public float f68008e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f68009e0;

    /* renamed from: f, reason: collision with root package name */
    public int f68010f;

    /* renamed from: f0, reason: collision with root package name */
    public float f68011f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f68012g;

    /* renamed from: g0, reason: collision with root package name */
    public float f68013g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f68014h;

    /* renamed from: h0, reason: collision with root package name */
    public float f68015h0;

    /* renamed from: i, reason: collision with root package name */
    public Rect f68016i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f68017i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f68018j;

    /* renamed from: j0, reason: collision with root package name */
    public float f68019j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f68021k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f68023l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f68025m0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f68028o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f68030p;

    /* renamed from: q, reason: collision with root package name */
    public int f68032q;

    /* renamed from: r, reason: collision with root package name */
    public float f68034r;

    /* renamed from: s, reason: collision with root package name */
    public float f68036s;

    /* renamed from: s0, reason: collision with root package name */
    public h f68037s0;
    private int[] state;

    /* renamed from: t, reason: collision with root package name */
    public float f68038t;

    /* renamed from: u, reason: collision with root package name */
    public float f68040u;

    /* renamed from: v, reason: collision with root package name */
    public float f68042v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f68043v0;

    /* renamed from: w, reason: collision with root package name */
    public float f68044w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f68045x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f68046y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f68047z;

    /* renamed from: k, reason: collision with root package name */
    public int f68020k = 16;

    /* renamed from: l, reason: collision with root package name */
    public int f68022l = 16;

    /* renamed from: m, reason: collision with root package name */
    public float f68024m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f68026n = 15.0f;

    /* renamed from: G, reason: collision with root package name */
    public TextUtils.TruncateAt f67980G = TextUtils.TruncateAt.END;

    /* renamed from: K, reason: collision with root package name */
    public boolean f67984K = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f68027n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public int f68029o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    public float f68031p0 = 0.0f;

    /* renamed from: q0, reason: collision with root package name */
    public float f68033q0 = 1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f68035r0 = g.f68058o;

    /* renamed from: t0, reason: collision with root package name */
    public int f68039t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f68041u0 = -1;

    /* renamed from: xa.a$a, reason: collision with other inner class name */
    public class C0968a implements a.InterfaceC0036a {
        public C0968a() {
        }

        @Override // Ca.a.InterfaceC0036a
        public void a(Typeface typeface) {
            C6815a.this.o0(typeface);
        }
    }

    /* renamed from: xa.a$b */
    public class b implements a.InterfaceC0036a {
        public b() {
        }

        @Override // Ca.a.InterfaceC0036a
        public void a(Typeface typeface) {
            C6815a.this.B0(typeface);
        }
    }

    public C6815a(View view) {
        this.f68000a = view;
        TextPaint textPaint = new TextPaint(EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        this.f67993T = textPaint;
        this.f67994U = new TextPaint(textPaint);
        this.f68014h = new Rect();
        this.f68012g = new Rect();
        this.f68018j = new RectF();
        this.f68008e = e();
        Z(view.getContext().getResources().getConfiguration());
    }

    public static boolean U(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    public static float Y(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AbstractC5104a.a(f10, f11, f12);
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public static boolean d0(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public int A() {
        return this.f68027n0;
    }

    public void A0(float f10) {
        if (this.f68024m != f10) {
            this.f68024m = f10;
            b0();
        }
    }

    public float B() {
        R(this.f67994U);
        return (-this.f67994U.ascent()) + this.f67994U.descent();
    }

    public void B0(Typeface typeface) {
        if (C0(typeface)) {
            b0();
        }
    }

    public int C() {
        return this.f68020k;
    }

    public final boolean C0(Typeface typeface) {
        Ca.a aVar = this.f67978E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f67976C == typeface) {
            return false;
        }
        this.f67976C = typeface;
        Typeface b10 = Ca.i.b(this.f68000a.getContext().getResources().getConfiguration(), typeface);
        this.f67975B = b10;
        if (b10 == null) {
            b10 = this.f67976C;
        }
        this.f67974A = b10;
        return true;
    }

    public float D() {
        int i10 = this.f68041u0;
        return i10 != -1 ? i10 : E();
    }

    public void D0(float f10) {
        float a10 = AbstractC6307a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f68002b) {
            this.f68002b = a10;
            c();
        }
    }

    public float E() {
        R(this.f67994U);
        return -this.f67994U.ascent();
    }

    public void E0(boolean z10) {
        this.f68004c = z10;
    }

    public float F() {
        return this.f68024m;
    }

    public void F0(float f10) {
        this.f68006d = f10;
        this.f68008e = e();
    }

    public Typeface G() {
        Typeface typeface = this.f67974A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void G0(int i10) {
        this.f68035r0 = i10;
    }

    public float H() {
        return this.f68002b;
    }

    public final void H0(float f10) {
        h(f10);
        this.f68000a.postInvalidateOnAnimation();
    }

    public float I() {
        return this.f68008e;
    }

    public void I0(float f10) {
        this.f68031p0 = f10;
    }

    public int J() {
        return this.f68035r0;
    }

    public void J0(float f10) {
        this.f68033q0 = f10;
    }

    public int K() {
        StaticLayout staticLayout = this.f68017i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void K0(TimeInterpolator timeInterpolator) {
        this.f67995V = timeInterpolator;
        b0();
    }

    public float L() {
        return this.f68017i0.getSpacingAdd();
    }

    public void L0(boolean z10) {
        this.f67984K = z10;
    }

    public float M() {
        return this.f68017i0.getSpacingMultiplier();
    }

    public final boolean M0(int[] iArr) {
        this.state = iArr;
        if (!W()) {
            return false;
        }
        b0();
        return true;
    }

    public final Layout.Alignment N() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f68020k, this.f67983J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f67983J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f67983J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public void N0(h hVar) {
        if (this.f68037s0 != hVar) {
            this.f68037s0 = hVar;
            c0(true);
        }
    }

    public TimeInterpolator O() {
        return this.f67995V;
    }

    public void O0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f67981H, charSequence)) {
            this.f67981H = charSequence;
            this.f67982I = null;
            b0();
        }
    }

    public CharSequence P() {
        return this.f67981H;
    }

    public void P0(TimeInterpolator timeInterpolator) {
        this.f67996W = timeInterpolator;
        b0();
    }

    public final void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f68026n);
        textPaint.setTypeface(this.f68045x);
        textPaint.setLetterSpacing(this.f68011f0);
    }

    public void Q0(TextUtils.TruncateAt truncateAt) {
        this.f67980G = truncateAt;
        b0();
    }

    public final void R(TextPaint textPaint) {
        textPaint.setTextSize(this.f68024m);
        textPaint.setTypeface(this.f67974A);
        textPaint.setLetterSpacing(this.f68013g0);
    }

    public void R0(Typeface typeface) {
        boolean p02 = p0(typeface);
        boolean C02 = C0(typeface);
        if (p02 || C02) {
            b0();
        }
    }

    public TextUtils.TruncateAt S() {
        return this.f67980G;
    }

    public final boolean S0() {
        if (this.f68027n0 > 1 || this.f68029o0 > 1) {
            return !this.f67983J || this.f68004c;
        }
        return false;
    }

    public final void T(float f10) {
        if (this.f68004c) {
            this.f68018j.set(f10 < this.f68008e ? this.f68012g : this.f68014h);
            return;
        }
        this.f68018j.left = Y(this.f68012g.left, this.f68014h.left, f10, this.f67995V);
        this.f68018j.top = Y(this.f68034r, this.f68036s, f10, this.f67995V);
        this.f68018j.right = Y(this.f68012g.right, this.f68014h.right, f10, this.f67995V);
        this.f68018j.bottom = Y(this.f68012g.bottom, this.f68014h.bottom, f10, this.f67995V);
    }

    public final boolean T0() {
        return this.f68029o0 == 1;
    }

    public void U0(int i10) {
        Q(this.f67994U);
        float f10 = i10;
        this.f68039t0 = j(this.f68029o0, this.f67994U, this.f67981H, f10 * (this.f68026n / this.f68024m), this.f67983J).getHeight();
        R(this.f67994U);
        this.f68041u0 = j(this.f68027n0, this.f67994U, this.f67981H, f10, this.f67983J).getHeight();
    }

    public final boolean V() {
        return this.f68000a.getLayoutDirection() == 1;
    }

    public final boolean W() {
        ColorStateList colorStateList = this.f68030p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f68028o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean X(CharSequence charSequence, boolean z10) {
        return (z10 ? w0.p.f67247d : w0.p.f67246c).isRtl(charSequence, 0, charSequence.length());
    }

    public void Z(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f68047z;
            if (typeface != null) {
                this.f68046y = Ca.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.f67976C;
            if (typeface2 != null) {
                this.f67975B = Ca.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f68046y;
            if (typeface3 == null) {
                typeface3 = this.f68047z;
            }
            this.f68045x = typeface3;
            Typeface typeface4 = this.f67975B;
            if (typeface4 == null) {
                typeface4 = this.f67976C;
            }
            this.f67974A = typeface4;
            c0(true);
        }
    }

    public final float a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void b(boolean z10) {
        float a02;
        i(1.0f, z10);
        if (this.f67982I != null && this.f68017i0 != null) {
            this.f68025m0 = T0() ? TextUtils.ellipsize(this.f67982I, this.f67993T, this.f68017i0.getWidth(), this.f67980G) : this.f67982I;
        }
        CharSequence charSequence = this.f68025m0;
        if (charSequence != null) {
            this.f68019j0 = a0(this.f67993T, charSequence);
        } else {
            this.f68019j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f68022l, this.f67983J ? 1 : 0);
        Rect rect = this.f68016i;
        if (rect == null) {
            rect = this.f68014h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f68036s = rect.top;
        } else if (i10 != 80) {
            this.f68036s = rect.centerY() - ((this.f67993T.descent() - this.f67993T.ascent()) / 2.0f);
        } else {
            this.f68036s = rect.bottom + this.f67993T.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f68040u = rect.centerX() - (this.f68019j0 / 2.0f);
        } else if (i11 != 5) {
            this.f68040u = rect.left;
        } else {
            this.f68040u = rect.right - this.f68019j0;
        }
        if (this.f68019j0 <= this.f68014h.width()) {
            float f10 = this.f68040u;
            float max = f10 + Math.max(0.0f, this.f68014h.left - f10);
            this.f68040u = max;
            this.f68040u = max + Math.min(0.0f, this.f68014h.right - (this.f68019j0 + max));
        }
        if (m() <= this.f68014h.height()) {
            float f11 = this.f68036s;
            float max2 = f11 + Math.max(0.0f, this.f68014h.top - f11);
            this.f68036s = max2;
            this.f68036s = max2 + Math.min(0.0f, this.f68014h.bottom - (r() + max2));
        }
        i(0.0f, z10);
        float height = this.f68017i0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f68017i0;
        if (staticLayout == null || this.f68027n0 <= 1) {
            CharSequence charSequence2 = this.f67982I;
            a02 = charSequence2 != null ? a0(this.f67993T, charSequence2) : 0.0f;
        } else {
            a02 = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f68017i0;
        this.f68032q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f68020k, this.f67983J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f68034r = this.f68012g.top;
        } else if (i12 != 80) {
            this.f68034r = this.f68012g.centerY() - (height / 2.0f);
        } else {
            this.f68034r = (this.f68012g.bottom - height) + (this.f68043v0 ? this.f67993T.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f68038t = this.f68012g.centerX() - (a02 / 2.0f);
        } else if (i13 != 5) {
            this.f68038t = this.f68012g.left;
        } else {
            this.f68038t = this.f68012g.right - a02;
        }
        H0(this.f68002b);
    }

    public void b0() {
        c0(false);
    }

    public final void c() {
        g(this.f68002b);
    }

    public void c0(boolean z10) {
        if ((this.f68000a.getHeight() <= 0 || this.f68000a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public final float d(float f10) {
        float f11 = this.f68008e;
        return f10 <= f11 ? AbstractC5104a.b(1.0f, 0.0f, this.f68006d, f11, f10) : AbstractC5104a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public final float e() {
        float f10 = this.f68006d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    public void e0(ColorStateList colorStateList) {
        if (this.f68030p == colorStateList && this.f68028o == colorStateList) {
            return;
        }
        this.f68030p = colorStateList;
        this.f68028o = colorStateList;
        b0();
    }

    public final boolean f(CharSequence charSequence) {
        boolean V10 = V();
        return this.f67984K ? X(charSequence, V10) : V10;
    }

    public void f0(int i10, int i11, int i12, int i13) {
        if (d0(this.f68014h, i10, i11, i12, i13)) {
            return;
        }
        this.f68014h.set(i10, i11, i12, i13);
        this.f67992S = true;
    }

    public final void g(float f10) {
        float f11;
        T(f10);
        if (!this.f68004c) {
            this.f68042v = Y(this.f68038t, this.f68040u, f10, this.f67995V);
            this.f68044w = Y(this.f68034r, this.f68036s, f10, this.f67995V);
            H0(f10);
            f11 = f10;
        } else if (f10 < this.f68008e) {
            this.f68042v = this.f68038t;
            this.f68044w = this.f68034r;
            H0(0.0f);
            f11 = 0.0f;
        } else {
            this.f68042v = this.f68040u;
            this.f68044w = this.f68036s - Math.max(0, this.f68010f);
            H0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC5104a.f53859b;
        k0(1.0f - Y(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        x0(Y(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f68030p != this.f68028o) {
            this.f67993T.setColor(a(y(), w(), f11));
        } else {
            this.f67993T.setColor(w());
        }
        float f12 = this.f68011f0;
        float f13 = this.f68013g0;
        if (f12 != f13) {
            this.f67993T.setLetterSpacing(Y(f13, f12, f10, timeInterpolator));
        } else {
            this.f67993T.setLetterSpacing(f12);
        }
        this.f67987N = Y(this.f68003b0, this.f67997X, f10, null);
        this.f67988O = Y(this.f68005c0, this.f67998Y, f10, null);
        this.f67989P = Y(this.f68007d0, this.f67999Z, f10, null);
        int a10 = a(x(this.f68009e0), x(this.f68001a0), f10);
        this.f67990Q = a10;
        this.f67993T.setShadowLayer(this.f67987N, this.f67988O, this.f67989P, a10);
        if (this.f68004c) {
            this.f67993T.setAlpha((int) (d(f10) * this.f67993T.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f67993T;
                textPaint.setShadowLayer(this.f67987N, this.f67988O, this.f67989P, AbstractC6344a.a(this.f67990Q, textPaint.getAlpha()));
            }
        }
        this.f68000a.postInvalidateOnAnimation();
    }

    public void g0(Rect rect) {
        f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void h(float f10) {
        i(f10, false);
    }

    public void h0(int i10, int i11, int i12, int i13) {
        if (this.f68016i == null) {
            this.f68016i = new Rect(i10, i11, i12, i13);
            this.f67992S = true;
        }
        if (d0(this.f68016i, i10, i11, i12, i13)) {
            return;
        }
        this.f68016i.set(i10, i11, i12, i13);
        this.f67992S = true;
    }

    public final void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.f67981H == null) {
            return;
        }
        float width = this.f68014h.width();
        float width2 = this.f68012g.width();
        if (U(f10, 1.0f)) {
            f11 = T0() ? this.f68026n : this.f68024m;
            f12 = T0() ? this.f68011f0 : this.f68013g0;
            this.f67985L = T0() ? 1.0f : Y(this.f68024m, this.f68026n, f10, this.f67996W) / this.f68024m;
            if (!T0()) {
                width = width2;
            }
            typeface = this.f68045x;
            width2 = width;
        } else {
            float f13 = this.f68024m;
            float f14 = this.f68013g0;
            typeface = this.f67974A;
            if (U(f10, 0.0f)) {
                this.f67985L = 1.0f;
            } else {
                this.f67985L = Y(this.f68024m, this.f68026n, f10, this.f67996W) / this.f68024m;
            }
            float f15 = this.f68026n / this.f68024m;
            float f16 = width2 * f15;
            if (!z10 && !this.f68004c && f16 > width && T0()) {
                width2 = Math.min(width / f15, width2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f68027n0 : this.f68029o0;
        if (width2 > 0.0f) {
            boolean z11 = this.f67986M != f11;
            boolean z12 = this.f68015h0 != f12;
            boolean z13 = this.f67977D != typeface;
            StaticLayout staticLayout = this.f68017i0;
            boolean z14 = z11 || z12 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.f67991R != i10) || this.f67992S;
            this.f67986M = f11;
            this.f68015h0 = f12;
            this.f67977D = typeface;
            this.f67992S = false;
            this.f67991R = i10;
            this.f67993T.setLinearText(this.f67985L != 1.0f);
            r5 = z14;
        }
        if (this.f67982I == null || r5) {
            this.f67993T.setTextSize(this.f67986M);
            this.f67993T.setTypeface(this.f67977D);
            this.f67993T.setLetterSpacing(this.f68015h0);
            this.f67983J = f(this.f67981H);
            StaticLayout j10 = j(S0() ? i10 : 1, this.f67993T, this.f67981H, width2 * (T0() ? 1.0f : this.f67985L), this.f67983J);
            this.f68017i0 = j10;
            this.f67982I = j10.getText();
        }
    }

    public void i0(int i10) {
        if (i10 != this.f68029o0) {
            this.f68029o0 = i10;
            b0();
        }
    }

    public final StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        return (StaticLayout) x0.f.g(g.b(charSequence, textPaint, (int) f10).d(this.f67980G).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : N()).f(false).i(i10).h(this.f68031p0, this.f68033q0).e(this.f68035r0).j(this.f68037s0).a());
    }

    public void j0(int i10) {
        Ca.e eVar = new Ca.e(this.f68000a.getContext(), i10);
        if (eVar.j() != null) {
            this.f68030p = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.f68026n = eVar.k();
        }
        ColorStateList colorStateList = eVar.f1544c;
        if (colorStateList != null) {
            this.f68001a0 = colorStateList;
        }
        this.f67998Y = eVar.f1550i;
        this.f67999Z = eVar.f1551j;
        this.f67997X = eVar.f1552k;
        this.f68011f0 = eVar.f1554m;
        Ca.a aVar = this.f67979F;
        if (aVar != null) {
            aVar.c();
        }
        this.f67979F = new Ca.a(new C0968a(), eVar.e());
        eVar.g(this.f68000a.getContext(), this.f67979F);
        b0();
    }

    public void k(Canvas canvas) {
        int save = canvas.save();
        if (this.f67982I == null || this.f68018j.width() <= 0.0f || this.f68018j.height() <= 0.0f) {
            return;
        }
        this.f67993T.setTextSize(this.f67986M);
        float f10 = this.f68042v;
        float f11 = this.f68044w;
        float f12 = this.f67985L;
        if (f12 != 1.0f && !this.f68004c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (S0() && T0() && (!this.f68004c || this.f68002b > this.f68008e)) {
            l(canvas, this.f68042v - this.f68017i0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f68017i0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public final void k0(float f10) {
        this.f68021k0 = f10;
        this.f68000a.postInvalidateOnAnimation();
    }

    public final void l(Canvas canvas, float f10, float f11) {
        int alpha = this.f67993T.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f68004c) {
            this.f67993T.setAlpha((int) (this.f68023l0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f67993T;
                textPaint.setShadowLayer(this.f67987N, this.f67988O, this.f67989P, AbstractC6344a.a(this.f67990Q, textPaint.getAlpha()));
            }
            this.f68017i0.draw(canvas);
        }
        if (!this.f68004c) {
            this.f67993T.setAlpha((int) (this.f68021k0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f67993T;
            textPaint2.setShadowLayer(this.f67987N, this.f67988O, this.f67989P, AbstractC6344a.a(this.f67990Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f68017i0.getLineBaseline(0);
        CharSequence charSequence = this.f68025m0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f67993T);
        if (i10 >= 31) {
            this.f67993T.setShadowLayer(this.f67987N, this.f67988O, this.f67989P, this.f67990Q);
        }
        if (this.f68004c) {
            return;
        }
        String trim = this.f68025m0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f67993T.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f68017i0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f67993T);
    }

    public void l0(ColorStateList colorStateList) {
        if (this.f68030p != colorStateList) {
            this.f68030p = colorStateList;
            b0();
        }
    }

    public float m() {
        Q(this.f67994U);
        return (-this.f67994U.ascent()) + this.f67994U.descent();
    }

    public void m0(int i10) {
        if (this.f68022l != i10) {
            this.f68022l = i10;
            b0();
        }
    }

    public float n() {
        Q(this.f67994U);
        return -this.f67994U.ascent();
    }

    public void n0(float f10) {
        if (this.f68026n != f10) {
            this.f68026n = f10;
            b0();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f67983J = f(this.f67981H);
        rectF.left = Math.max(s(i10, i11), this.f68014h.left);
        rectF.top = this.f68014h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f68014h.right);
        rectF.bottom = this.f68014h.top + r();
        if (this.f68017i0 == null || T0()) {
            return;
        }
        float lineWidth = this.f68017i0.getLineWidth(r4.getLineCount() - 1) * (this.f68026n / this.f68024m);
        if (this.f67983J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(Typeface typeface) {
        if (p0(typeface)) {
            b0();
        }
    }

    public ColorStateList p() {
        return this.f68030p;
    }

    public final boolean p0(Typeface typeface) {
        Ca.a aVar = this.f67979F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f68047z == typeface) {
            return false;
        }
        this.f68047z = typeface;
        Typeface b10 = Ca.i.b(this.f68000a.getContext().getResources().getConfiguration(), typeface);
        this.f68046y = b10;
        if (b10 == null) {
            b10 = this.f68047z;
        }
        this.f68045x = b10;
        return true;
    }

    public int q() {
        return this.f68022l;
    }

    public void q0(int i10) {
        this.f68010f = i10;
    }

    public float r() {
        int i10 = this.f68039t0;
        return i10 != -1 ? i10 : n();
    }

    public void r0(int i10, int i11, int i12, int i13) {
        s0(i10, i11, i12, i13, true);
    }

    public final float s(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f68019j0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f67983J ? this.f68014h.left : this.f68014h.right - this.f68019j0 : this.f67983J ? this.f68014h.right - this.f68019j0 : this.f68014h.left;
    }

    public void s0(int i10, int i11, int i12, int i13, boolean z10) {
        if (d0(this.f68012g, i10, i11, i12, i13) && z10 == this.f68043v0) {
            return;
        }
        this.f68012g.set(i10, i11, i12, i13);
        this.f67992S = true;
        this.f68043v0 = z10;
    }

    public final float t(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f68019j0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f67983J ? rectF.left + this.f68019j0 : this.f68014h.right : this.f67983J ? this.f68014h.right : rectF.left + this.f68019j0;
    }

    public void t0(Rect rect) {
        r0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float u() {
        return this.f68026n;
    }

    public void u0(float f10) {
        if (this.f68013g0 != f10) {
            this.f68013g0 = f10;
            b0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f68045x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(int i10) {
        if (i10 != this.f68027n0) {
            this.f68027n0 = i10;
            b0();
        }
    }

    public int w() {
        return x(this.f68030p);
    }

    public void w0(int i10) {
        Ca.e eVar = new Ca.e(this.f68000a.getContext(), i10);
        if (eVar.j() != null) {
            this.f68028o = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.f68024m = eVar.k();
        }
        ColorStateList colorStateList = eVar.f1544c;
        if (colorStateList != null) {
            this.f68009e0 = colorStateList;
        }
        this.f68005c0 = eVar.f1550i;
        this.f68007d0 = eVar.f1551j;
        this.f68003b0 = eVar.f1552k;
        this.f68013g0 = eVar.f1554m;
        Ca.a aVar = this.f67978E;
        if (aVar != null) {
            aVar.c();
        }
        this.f67978E = new Ca.a(new b(), eVar.e());
        eVar.g(this.f68000a.getContext(), this.f67978E);
        b0();
    }

    public final int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void x0(float f10) {
        this.f68023l0 = f10;
        this.f68000a.postInvalidateOnAnimation();
    }

    public final int y() {
        return x(this.f68028o);
    }

    public void y0(ColorStateList colorStateList) {
        if (this.f68028o != colorStateList) {
            this.f68028o = colorStateList;
            b0();
        }
    }

    public int z() {
        return this.f68032q;
    }

    public void z0(int i10) {
        if (this.f68020k != i10) {
            this.f68020k = i10;
            b0();
        }
    }
}
