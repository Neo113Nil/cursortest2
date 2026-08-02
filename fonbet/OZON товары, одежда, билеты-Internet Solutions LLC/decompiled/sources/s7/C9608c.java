package s7;

import Hj.C3143a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import c3.C5740b;
import j7.C7292a;
import v7.C10266a;

/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9608c {

    /* renamed from: A, reason: collision with root package name */
    private Typeface f98238A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f98239B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f98240C;

    /* renamed from: D, reason: collision with root package name */
    private Typeface f98241D;

    /* renamed from: E, reason: collision with root package name */
    private C10266a f98242E;

    /* renamed from: F, reason: collision with root package name */
    private C10266a f98243F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f98244G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f98245H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f98246I;

    /* renamed from: K, reason: collision with root package name */
    private Bitmap f98248K;

    /* renamed from: L, reason: collision with root package name */
    private float f98249L;

    /* renamed from: M, reason: collision with root package name */
    private float f98250M;

    /* renamed from: N, reason: collision with root package name */
    private float f98251N;

    /* renamed from: O, reason: collision with root package name */
    private float f98252O;

    /* renamed from: P, reason: collision with root package name */
    private float f98253P;

    /* renamed from: Q, reason: collision with root package name */
    private int f98254Q;

    /* renamed from: R, reason: collision with root package name */
    private int[] f98255R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f98256S;

    /* renamed from: T, reason: collision with root package name */
    @NonNull
    private final TextPaint f98257T;

    /* renamed from: U, reason: collision with root package name */
    @NonNull
    private final TextPaint f98258U;

    /* renamed from: V, reason: collision with root package name */
    private Interpolator f98259V;

    /* renamed from: W, reason: collision with root package name */
    private BaseInterpolator f98260W;

    /* renamed from: X, reason: collision with root package name */
    private float f98261X;

    /* renamed from: Y, reason: collision with root package name */
    private float f98262Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f98263Z;

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f98264a;

    /* renamed from: a0, reason: collision with root package name */
    private ColorStateList f98265a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f98266b;

    /* renamed from: b0, reason: collision with root package name */
    private float f98267b0;

    /* renamed from: c, reason: collision with root package name */
    private float f98268c;

    /* renamed from: c0, reason: collision with root package name */
    private float f98269c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f98270d;

    /* renamed from: d0, reason: collision with root package name */
    private float f98271d0;

    /* renamed from: e, reason: collision with root package name */
    private float f98272e;

    /* renamed from: e0, reason: collision with root package name */
    private ColorStateList f98273e0;

    /* renamed from: f, reason: collision with root package name */
    private float f98274f;

    /* renamed from: f0, reason: collision with root package name */
    private float f98275f0;

    /* renamed from: g, reason: collision with root package name */
    private int f98276g;

    /* renamed from: g0, reason: collision with root package name */
    private float f98277g0;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Rect f98278h;

    /* renamed from: h0, reason: collision with root package name */
    private float f98279h0;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final Rect f98280i;

    /* renamed from: i0, reason: collision with root package name */
    private StaticLayout f98281i0;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final RectF f98282j;

    /* renamed from: j0, reason: collision with root package name */
    private float f98283j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f98285k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f98287l0;

    /* renamed from: m0, reason: collision with root package name */
    private CharSequence f98289m0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f98292o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f98293p;

    /* renamed from: q, reason: collision with root package name */
    private int f98294q;

    /* renamed from: r, reason: collision with root package name */
    private float f98295r;

    /* renamed from: s, reason: collision with root package name */
    private float f98296s;

    /* renamed from: t, reason: collision with root package name */
    private float f98297t;

    /* renamed from: u, reason: collision with root package name */
    private float f98298u;

    /* renamed from: v, reason: collision with root package name */
    private float f98299v;

    /* renamed from: w, reason: collision with root package name */
    private float f98300w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f98301x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f98302y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f98303z;

    /* renamed from: k, reason: collision with root package name */
    private int f98284k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f98286l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f98288m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f98290n = 15.0f;

    /* renamed from: J, reason: collision with root package name */
    private boolean f98247J = true;

    /* renamed from: n0, reason: collision with root package name */
    private int f98291n0 = 1;

    /* renamed from: s7.c$a */
    final class a implements C10266a.InterfaceC2224a {
        a() {
        }

        @Override // v7.C10266a.InterfaceC2224a
        public final void a(Typeface typeface) {
            C9608c.this.x(typeface);
        }
    }

    /* renamed from: s7.c$b */
    final class b implements C10266a.InterfaceC2224a {
        b() {
        }

        @Override // v7.C10266a.InterfaceC2224a
        public final void a(Typeface typeface) {
            C9608c.this.G(typeface);
        }
    }

    public C9608c(ViewGroup viewGroup) {
        this.f98264a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f98257T = textPaint;
        this.f98258U = new TextPaint(textPaint);
        this.f98280i = new Rect();
        this.f98278h = new Rect();
        this.f98282j = new RectF();
        float f7 = this.f98272e;
        this.f98274f = C3143a.d(1.0f, f7, 0.5f, f7);
        q(viewGroup.getContext().getResources().getConfiguration());
    }

    private boolean H(Typeface typeface) {
        C10266a c10266a = this.f98242E;
        if (c10266a != null) {
            c10266a.c();
        }
        if (this.f98240C == typeface) {
            return false;
        }
        this.f98240C = typeface;
        Typeface a11 = v7.g.a(this.f98264a.getContext().getResources().getConfiguration(), typeface);
        this.f98239B = a11;
        if (a11 == null) {
            a11 = this.f98240C;
        }
        this.f98238A = a11;
        return true;
    }

    private void L(float f7) {
        c(f7, false);
        int i11 = Y.f42258g;
        this.f98264a.postInvalidateOnAnimation();
    }

    private static int a(float f7, int i11, int i12) {
        float f11 = 1.0f - f7;
        return Color.argb(Math.round((Color.alpha(i12) * f7) + (Color.alpha(i11) * f11)), Math.round((Color.red(i12) * f7) + (Color.red(i11) * f11)), Math.round((Color.green(i12) * f7) + (Color.green(i11) * f11)), Math.round((Color.blue(i12) * f7) + (Color.blue(i11) * f11)));
    }

    private boolean b(@NonNull CharSequence charSequence) {
        int i11 = Y.f42258g;
        boolean z11 = this.f98264a.getLayoutDirection() == 1;
        if (this.f98247J) {
            return (z11 ? androidx.core.text.p.f42222d : androidx.core.text.p.f42221c).a(charSequence.length(), charSequence);
        }
        return z11;
    }

    private void c(float f7, boolean z11) {
        boolean z12;
        float f11;
        float f12;
        boolean z13;
        Layout.Alignment alignment;
        if (this.f98244G == null) {
            return;
        }
        float width = this.f98280i.width();
        float width2 = this.f98278h.width();
        if (Math.abs(f7 - 1.0f) < 1.0E-5f) {
            f11 = this.f98290n;
            f12 = this.f98275f0;
            this.f98249L = 1.0f;
            Typeface typeface = this.f98241D;
            Typeface typeface2 = this.f98301x;
            if (typeface != typeface2) {
                this.f98241D = typeface2;
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            float f13 = this.f98288m;
            float f14 = this.f98277g0;
            Typeface typeface3 = this.f98241D;
            Typeface typeface4 = this.f98238A;
            if (typeface3 != typeface4) {
                this.f98241D = typeface4;
                z12 = true;
            } else {
                z12 = false;
            }
            if (Math.abs(f7 - 0.0f) < 1.0E-5f) {
                this.f98249L = 1.0f;
            } else {
                this.f98249L = p(this.f98288m, this.f98290n, f7, this.f98260W) / this.f98288m;
            }
            float f15 = this.f98290n / this.f98288m;
            width = (!z11 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
            f11 = f13;
            f12 = f14;
            z13 = z12;
        }
        boolean z14 = z13;
        if (width > 0.0f) {
            boolean z15 = ((this.f98250M > f11 ? 1 : (this.f98250M == f11 ? 0 : -1)) != 0) || ((this.f98279h0 > f12 ? 1 : (this.f98279h0 == f12 ? 0 : -1)) != 0) || this.f98256S || z13;
            this.f98250M = f11;
            this.f98279h0 = f12;
            this.f98256S = false;
            z14 = z15;
        }
        if (this.f98245H == null || z14) {
            float f16 = this.f98250M;
            TextPaint textPaint = this.f98257T;
            textPaint.setTextSize(f16);
            textPaint.setTypeface(this.f98241D);
            textPaint.setLetterSpacing(this.f98279h0);
            textPaint.setLinearText(this.f98249L != 1.0f);
            boolean b11 = b(this.f98244G);
            this.f98246I = b11;
            int i11 = this.f98291n0;
            if (i11 <= 1 || (b11 && !this.f98270d)) {
                i11 = 1;
            }
            if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f98284k, b11 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f98246I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f98246I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C9615j b12 = C9615j.b(this.f98244G, textPaint, (int) width);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            b12.d();
            b12.g(b11);
            b12.c(alignment);
            b12.f();
            b12.i(i11);
            b12.h();
            b12.e();
            StaticLayout a11 = b12.a();
            a11.getClass();
            this.f98281i0 = a11;
            this.f98245H = a11.getText();
        }
    }

    private int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f98255R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private static float p(float f7, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C7292a.a(f7, f11, f12);
    }

    private boolean y(Typeface typeface) {
        C10266a c10266a = this.f98243F;
        if (c10266a != null) {
            c10266a.c();
        }
        if (this.f98303z == typeface) {
            return false;
        }
        this.f98303z = typeface;
        Typeface a11 = v7.g.a(this.f98264a.getContext().getResources().getConfiguration(), typeface);
        this.f98302y = a11;
        if (a11 == null) {
            a11 = this.f98303z;
        }
        this.f98301x = a11;
        return true;
    }

    public final void A(int i11, int i12, int i13, int i14) {
        Rect rect = this.f98278h;
        if (rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.set(i11, i12, i13, i14);
        this.f98256S = true;
        r();
    }

    public final void B(float f7) {
        if (this.f98277g0 != f7) {
            this.f98277g0 = f7;
            s(false);
        }
    }

    public final void C(int i11) {
        ViewGroup viewGroup = this.f98264a;
        v7.d dVar = new v7.d(viewGroup.getContext(), i11);
        if (dVar.h() != null) {
            this.f98292o = dVar.h();
        }
        if (dVar.i() != 0.0f) {
            this.f98288m = dVar.i();
        }
        ColorStateList colorStateList = dVar.f102452a;
        if (colorStateList != null) {
            this.f98273e0 = colorStateList;
        }
        this.f98269c0 = dVar.f102456e;
        this.f98271d0 = dVar.f102457f;
        this.f98267b0 = dVar.f102458g;
        this.f98277g0 = dVar.f102460i;
        C10266a c10266a = this.f98242E;
        if (c10266a != null) {
            c10266a.c();
        }
        this.f98242E = new C10266a(new b(), dVar.e());
        dVar.g(viewGroup.getContext(), this.f98242E);
        s(false);
    }

    public final void D(ColorStateList colorStateList) {
        if (this.f98292o != colorStateList) {
            this.f98292o = colorStateList;
            s(false);
        }
    }

    public final void E(int i11) {
        if (this.f98284k != i11) {
            this.f98284k = i11;
            s(false);
        }
    }

    public final void F(float f7) {
        if (this.f98288m != f7) {
            this.f98288m = f7;
            s(false);
        }
    }

    public final void G(Typeface typeface) {
        if (H(typeface)) {
            s(false);
        }
    }

    public final void I(float f7) {
        float f11;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f7 != this.f98268c) {
            this.f98268c = f7;
            boolean z11 = this.f98270d;
            RectF rectF = this.f98282j;
            Rect rect = this.f98280i;
            Rect rect2 = this.f98278h;
            if (z11) {
                if (f7 < this.f98274f) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = p(rect2.left, rect.left, f7, this.f98259V);
                rectF.top = p(this.f98295r, this.f98296s, f7, this.f98259V);
                rectF.right = p(rect2.right, rect.right, f7, this.f98259V);
                rectF.bottom = p(rect2.bottom, rect.bottom, f7, this.f98259V);
            }
            if (!this.f98270d) {
                this.f98299v = p(this.f98297t, this.f98298u, f7, this.f98259V);
                this.f98300w = p(this.f98295r, this.f98296s, f7, this.f98259V);
                L(f7);
                f11 = f7;
            } else if (f7 < this.f98274f) {
                this.f98299v = this.f98297t;
                this.f98300w = this.f98295r;
                L(0.0f);
                f11 = 0.0f;
            } else {
                this.f98299v = this.f98298u;
                this.f98300w = this.f98296s - Math.max(0, this.f98276g);
                L(1.0f);
                f11 = 1.0f;
            }
            C5740b c5740b = C7292a.f69464b;
            this.f98285k0 = 1.0f - p(0.0f, 1.0f, 1.0f - f7, c5740b);
            int i11 = Y.f42258g;
            ViewGroup viewGroup = this.f98264a;
            viewGroup.postInvalidateOnAnimation();
            this.f98287l0 = p(1.0f, 0.0f, f7, c5740b);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f98293p;
            ColorStateList colorStateList2 = this.f98292o;
            TextPaint textPaint = this.f98257T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, h(colorStateList2), h(this.f98293p)));
            } else {
                textPaint.setColor(h(colorStateList));
            }
            float f12 = this.f98275f0;
            float f13 = this.f98277g0;
            if (f12 != f13) {
                textPaint.setLetterSpacing(p(f13, f12, f7, c5740b));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f98251N = C7292a.a(this.f98267b0, this.f98261X, f7);
            this.f98252O = C7292a.a(this.f98269c0, this.f98262Y, f7);
            this.f98253P = C7292a.a(this.f98271d0, this.f98263Z, f7);
            int a11 = a(f7, h(this.f98273e0), h(this.f98265a0));
            this.f98254Q = a11;
            textPaint.setShadowLayer(this.f98251N, this.f98252O, this.f98253P, a11);
            if (this.f98270d) {
                int alpha = textPaint.getAlpha();
                float f14 = this.f98274f;
                textPaint.setAlpha((int) ((f7 <= f14 ? C7292a.b(1.0f, 0.0f, this.f98272e, f14, f7) : C7292a.b(0.0f, 1.0f, f14, 1.0f, f7)) * alpha));
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void J(boolean z11) {
        this.f98270d = z11;
    }

    public final void K(float f7) {
        this.f98272e = f7;
        this.f98274f = C3143a.d(1.0f, f7, 0.5f, f7);
    }

    public final void M(int i11) {
        if (i11 != this.f98291n0) {
            this.f98291n0 = i11;
            Bitmap bitmap = this.f98248K;
            if (bitmap != null) {
                bitmap.recycle();
                this.f98248K = null;
            }
            s(false);
        }
    }

    public final void N(Interpolator interpolator) {
        this.f98259V = interpolator;
        s(false);
    }

    public final void O() {
        this.f98247J = false;
    }

    public final boolean P(int[] iArr) {
        ColorStateList colorStateList;
        this.f98255R = iArr;
        ColorStateList colorStateList2 = this.f98293p;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f98292o) == null || !colorStateList.isStateful())) {
            return false;
        }
        s(false);
        return true;
    }

    public final void Q(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f98244G, charSequence)) {
            this.f98244G = charSequence;
            this.f98245H = null;
            Bitmap bitmap = this.f98248K;
            if (bitmap != null) {
                bitmap.recycle();
                this.f98248K = null;
            }
            s(false);
        }
    }

    public final void R(BaseInterpolator baseInterpolator) {
        this.f98260W = baseInterpolator;
        s(false);
    }

    public final void S(Typeface typeface) {
        boolean y11 = y(typeface);
        boolean H11 = H(typeface);
        if (y11 || H11) {
            s(false);
        }
    }

    public final void d(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (this.f98245H == null || !this.f98266b) {
            return;
        }
        TextPaint textPaint = this.f98257T;
        textPaint.setTextSize(this.f98250M);
        float f7 = this.f98299v;
        float f11 = this.f98300w;
        float f12 = this.f98249L;
        if (f12 != 1.0f && !this.f98270d) {
            canvas.scale(f12, f12, f7, f11);
        }
        if (this.f98291n0 <= 1 || ((this.f98246I && !this.f98270d) || (this.f98270d && this.f98268c <= this.f98274f))) {
            canvas.translate(f7, f11);
            this.f98281i0.draw(canvas);
        } else {
            float lineStart = this.f98299v - this.f98281i0.getLineStart(0);
            int alpha = textPaint.getAlpha();
            canvas.translate(lineStart, f11);
            float f13 = alpha;
            textPaint.setAlpha((int) (this.f98287l0 * f13));
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                float f14 = this.f98251N;
                float f15 = this.f98252O;
                float f16 = this.f98253P;
                int i12 = this.f98254Q;
                textPaint.setShadowLayer(f14, f15, f16, androidx.core.graphics.c.f(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
            }
            this.f98281i0.draw(canvas);
            textPaint.setAlpha((int) (this.f98285k0 * f13));
            if (i11 >= 31) {
                float f17 = this.f98251N;
                float f18 = this.f98252O;
                float f19 = this.f98253P;
                int i13 = this.f98254Q;
                textPaint.setShadowLayer(f17, f18, f19, androidx.core.graphics.c.f(i13, (Color.alpha(i13) * textPaint.getAlpha()) / 255));
            }
            int lineBaseline = this.f98281i0.getLineBaseline(0);
            CharSequence charSequence = this.f98289m0;
            float f21 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f21, textPaint);
            if (i11 >= 31) {
                textPaint.setShadowLayer(this.f98251N, this.f98252O, this.f98253P, this.f98254Q);
            }
            if (!this.f98270d) {
                String trim = this.f98289m0.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                String str = trim;
                textPaint.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.f98281i0.getLineEnd(0), str.length()), 0.0f, f21, (Paint) textPaint);
            }
            canvas = canvas;
        }
        canvas.restoreToCount(save);
    }

    public final void e(@NonNull RectF rectF, int i11, int i12) {
        float f7;
        float f11;
        float f12;
        float f13;
        int i13;
        float f14;
        int i14;
        boolean b11 = b(this.f98244G);
        this.f98246I = b11;
        Rect rect = this.f98280i;
        if (i12 != 17 && (i12 & 7) != 1) {
            if ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) {
                if (b11) {
                    i14 = rect.left;
                    f12 = i14;
                } else {
                    f7 = rect.right;
                    f11 = this.f98283j0;
                }
            } else if (b11) {
                f7 = rect.right;
                f11 = this.f98283j0;
            } else {
                i14 = rect.left;
                f12 = i14;
            }
            rectF.left = f12;
            float f15 = rect.top;
            rectF.top = f15;
            if (i12 != 17 || (i12 & 7) == 1) {
                f13 = (i11 / 2.0f) + (this.f98283j0 / 2.0f);
            } else if ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) {
                if (b11) {
                    f14 = this.f98283j0;
                    f13 = f14 + f12;
                } else {
                    i13 = rect.right;
                    f13 = i13;
                }
            } else if (b11) {
                i13 = rect.right;
                f13 = i13;
            } else {
                f14 = this.f98283j0;
                f13 = f14 + f12;
            }
            rectF.right = f13;
            rectF.bottom = g() + f15;
        }
        f7 = i11 / 2.0f;
        f11 = this.f98283j0 / 2.0f;
        f12 = f7 - f11;
        rectF.left = f12;
        float f152 = rect.top;
        rectF.top = f152;
        if (i12 != 17) {
        }
        f13 = (i11 / 2.0f) + (this.f98283j0 / 2.0f);
        rectF.right = f13;
        rectF.bottom = g() + f152;
    }

    public final ColorStateList f() {
        return this.f98293p;
    }

    public final float g() {
        TextPaint textPaint = this.f98258U;
        textPaint.setTextSize(this.f98290n);
        textPaint.setTypeface(this.f98301x);
        textPaint.setLetterSpacing(this.f98275f0);
        return -textPaint.ascent();
    }

    public final int i() {
        return this.f98294q;
    }

    public final float j() {
        TextPaint textPaint = this.f98258U;
        textPaint.setTextSize(this.f98288m);
        textPaint.setTypeface(this.f98238A);
        textPaint.setLetterSpacing(this.f98277g0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final float k() {
        TextPaint textPaint = this.f98258U;
        textPaint.setTextSize(this.f98288m);
        textPaint.setTypeface(this.f98238A);
        textPaint.setLetterSpacing(this.f98277g0);
        return -textPaint.ascent();
    }

    public final float l() {
        return this.f98268c;
    }

    public final float m() {
        return this.f98274f;
    }

    public final int n() {
        return this.f98291n0;
    }

    public final CharSequence o() {
        return this.f98244G;
    }

    public final void q(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f98303z;
            if (typeface != null) {
                this.f98302y = v7.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.f98240C;
            if (typeface2 != null) {
                this.f98239B = v7.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f98302y;
            if (typeface3 == null) {
                typeface3 = this.f98303z;
            }
            this.f98301x = typeface3;
            Typeface typeface4 = this.f98239B;
            if (typeface4 == null) {
                typeface4 = this.f98240C;
            }
            this.f98238A = typeface4;
            s(true);
        }
    }

    final void r() {
        boolean z11;
        Rect rect = this.f98280i;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.f98278h;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z11 = true;
                this.f98266b = z11;
            }
        }
        z11 = false;
        this.f98266b = z11;
    }

    public final void s(boolean z11) {
        float measureText;
        float f7;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f98264a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z11) {
            return;
        }
        c(1.0f, z11);
        CharSequence charSequence = this.f98245H;
        TextPaint textPaint = this.f98257T;
        if (charSequence != null && (staticLayout = this.f98281i0) != null) {
            this.f98289m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f98289m0;
        if (charSequence2 != null) {
            this.f98283j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f98283j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f98286l, this.f98246I ? 1 : 0);
        int i11 = absoluteGravity & 112;
        Rect rect = this.f98280i;
        if (i11 == 48) {
            this.f98296s = rect.top;
        } else if (i11 != 80) {
            this.f98296s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f98296s = textPaint.ascent() + rect.bottom;
        }
        int i12 = absoluteGravity & 8388615;
        if (i12 == 1) {
            this.f98298u = rect.centerX() - (this.f98283j0 / 2.0f);
        } else if (i12 != 5) {
            this.f98298u = rect.left;
        } else {
            this.f98298u = rect.right - this.f98283j0;
        }
        c(0.0f, z11);
        float height = this.f98281i0 != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f98281i0;
        if (staticLayout2 == null || this.f98291n0 <= 1) {
            CharSequence charSequence3 = this.f98245H;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f98281i0;
        this.f98294q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f98284k, this.f98246I ? 1 : 0);
        int i13 = absoluteGravity2 & 112;
        Rect rect2 = this.f98278h;
        if (i13 == 48) {
            this.f98295r = rect2.top;
        } else if (i13 != 80) {
            this.f98295r = rect2.centerY() - (height / 2.0f);
        } else {
            this.f98295r = textPaint.descent() + (rect2.bottom - height);
        }
        int i14 = absoluteGravity2 & 8388615;
        if (i14 == 1) {
            this.f98297t = rect2.centerX() - (measureText / 2.0f);
        } else if (i14 != 5) {
            this.f98297t = rect2.left;
        } else {
            this.f98297t = rect2.right - measureText;
        }
        Bitmap bitmap = this.f98248K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f98248K = null;
        }
        L(this.f98268c);
        float f11 = this.f98268c;
        boolean z12 = this.f98270d;
        RectF rectF = this.f98282j;
        if (z12) {
            if (f11 < this.f98274f) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = p(rect2.left, rect.left, f11, this.f98259V);
            rectF.top = p(this.f98295r, this.f98296s, f11, this.f98259V);
            rectF.right = p(rect2.right, rect.right, f11, this.f98259V);
            rectF.bottom = p(rect2.bottom, rect.bottom, f11, this.f98259V);
        }
        if (!this.f98270d) {
            this.f98299v = p(this.f98297t, this.f98298u, f11, this.f98259V);
            this.f98300w = p(this.f98295r, this.f98296s, f11, this.f98259V);
            L(f11);
            f7 = f11;
        } else if (f11 < this.f98274f) {
            this.f98299v = this.f98297t;
            this.f98300w = this.f98295r;
            L(0.0f);
            f7 = 0.0f;
        } else {
            this.f98299v = this.f98298u;
            this.f98300w = this.f98296s - Math.max(0, this.f98276g);
            L(1.0f);
            f7 = 1.0f;
        }
        C5740b c5740b = C7292a.f69464b;
        this.f98285k0 = 1.0f - p(0.0f, 1.0f, 1.0f - f11, c5740b);
        int i15 = Y.f42258g;
        viewGroup.postInvalidateOnAnimation();
        this.f98287l0 = p(1.0f, 0.0f, f11, c5740b);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f98293p;
        ColorStateList colorStateList2 = this.f98292o;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f7, h(colorStateList2), h(this.f98293p)));
        } else {
            textPaint.setColor(h(colorStateList));
        }
        float f12 = this.f98275f0;
        float f13 = this.f98277g0;
        if (f12 != f13) {
            textPaint.setLetterSpacing(p(f13, f12, f11, c5740b));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f98251N = C7292a.a(this.f98267b0, this.f98261X, f11);
        this.f98252O = C7292a.a(this.f98269c0, this.f98262Y, f11);
        this.f98253P = C7292a.a(this.f98271d0, this.f98263Z, f11);
        int a11 = a(f11, h(this.f98273e0), h(this.f98265a0));
        this.f98254Q = a11;
        textPaint.setShadowLayer(this.f98251N, this.f98252O, this.f98253P, a11);
        if (this.f98270d) {
            int alpha = textPaint.getAlpha();
            float f14 = this.f98274f;
            textPaint.setAlpha((int) ((f11 <= f14 ? C7292a.b(1.0f, 0.0f, this.f98272e, f14, f11) : C7292a.b(0.0f, 1.0f, f14, 1.0f, f11)) * alpha));
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void t(int i11, int i12, int i13, int i14) {
        Rect rect = this.f98280i;
        if (rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.set(i11, i12, i13, i14);
        this.f98256S = true;
        r();
    }

    public final void u(int i11) {
        ViewGroup viewGroup = this.f98264a;
        v7.d dVar = new v7.d(viewGroup.getContext(), i11);
        if (dVar.h() != null) {
            this.f98293p = dVar.h();
        }
        if (dVar.i() != 0.0f) {
            this.f98290n = dVar.i();
        }
        ColorStateList colorStateList = dVar.f102452a;
        if (colorStateList != null) {
            this.f98265a0 = colorStateList;
        }
        this.f98262Y = dVar.f102456e;
        this.f98263Z = dVar.f102457f;
        this.f98261X = dVar.f102458g;
        this.f98275f0 = dVar.f102460i;
        C10266a c10266a = this.f98243F;
        if (c10266a != null) {
            c10266a.c();
        }
        this.f98243F = new C10266a(new a(), dVar.e());
        dVar.g(viewGroup.getContext(), this.f98243F);
        s(false);
    }

    public final void v(ColorStateList colorStateList) {
        if (this.f98293p != colorStateList) {
            this.f98293p = colorStateList;
            s(false);
        }
    }

    public final void w(int i11) {
        if (this.f98286l != i11) {
            this.f98286l = i11;
            s(false);
        }
    }

    public final void x(Typeface typeface) {
        if (y(typeface)) {
            s(false);
        }
    }

    public final void z(int i11) {
        this.f98276g = i11;
    }
}
