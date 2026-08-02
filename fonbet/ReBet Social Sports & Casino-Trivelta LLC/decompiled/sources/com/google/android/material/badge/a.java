package com.google.android.material.badge;

import Ca.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.shape.n;
import ia.c;
import ia.k;
import ia.l;
import ja.AbstractC5104a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import xa.i;

/* loaded from: classes3.dex */
public class a extends Drawable implements i.b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f34837n = l.f48583v;

    /* renamed from: o, reason: collision with root package name */
    public static final int f34838o = c.f48224b;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f34839a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.shape.i f34840b;

    /* renamed from: c, reason: collision with root package name */
    public final i f34841c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f34842d;

    /* renamed from: e, reason: collision with root package name */
    public final BadgeState f34843e;

    /* renamed from: f, reason: collision with root package name */
    public float f34844f;

    /* renamed from: g, reason: collision with root package name */
    public float f34845g;

    /* renamed from: h, reason: collision with root package name */
    public int f34846h;

    /* renamed from: i, reason: collision with root package name */
    public float f34847i;

    /* renamed from: j, reason: collision with root package name */
    public float f34848j;

    /* renamed from: k, reason: collision with root package name */
    public float f34849k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f34850l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f34851m;

    public a(Context context, int i10, int i11, int i12, BadgeState.State state) {
        this.f34839a = new WeakReference(context);
        xa.l.c(context);
        this.f34842d = new Rect();
        i iVar = new i(this);
        this.f34841c = iVar;
        iVar.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f34843e = badgeState;
        this.f34840b = new com.google.android.material.shape.i(n.b(context, D() ? badgeState.o() : badgeState.k(), D() ? badgeState.n() : badgeState.j()).m());
        R();
    }

    public static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public static a g(Context context) {
        return new a(context, 0, f34838o, f34837n, null);
    }

    public static a h(Context context, BadgeState.State state) {
        return new a(context, 0, f34838o, f34837n, state);
    }

    public final float A(float f10) {
        return (this.f34845g - this.f34849k) + f10;
    }

    public final int B() {
        int t10 = D() ? this.f34843e.t() : this.f34843e.u();
        if (this.f34843e.f34804k == 1) {
            t10 += D() ? this.f34843e.f34803j : this.f34843e.f34802i;
        }
        return t10 + this.f34843e.d();
    }

    public final int C() {
        int E10 = this.f34843e.E();
        if (D()) {
            E10 = this.f34843e.D();
            Context context = (Context) this.f34839a.get();
            if (context != null) {
                E10 = AbstractC5104a.c(E10, E10 - this.f34843e.v(), AbstractC5104a.b(0.0f, 1.0f, 0.3f, 1.0f, Ca.c.f(context) - 1.0f));
            }
        }
        if (this.f34843e.f34804k == 0) {
            E10 -= Math.round(this.f34849k);
        }
        return E10 + this.f34843e.e();
    }

    public final boolean D() {
        return F() || E();
    }

    public boolean E() {
        return !this.f34843e.G() && this.f34843e.F();
    }

    public boolean F() {
        return this.f34843e.G();
    }

    public final void G() {
        this.f34841c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void H() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f34843e.g());
        if (this.f34840b.B() != valueOf) {
            this.f34840b.f0(valueOf);
            invalidateSelf();
        }
    }

    public final void I() {
        this.f34841c.l(true);
        K();
        a0();
        invalidateSelf();
    }

    public final void J() {
        WeakReference weakReference = this.f34850l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f34850l.get();
        WeakReference weakReference2 = this.f34851m;
        Z(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    public final void K() {
        Context context = (Context) this.f34839a.get();
        if (context == null) {
            return;
        }
        this.f34840b.setShapeAppearanceModel(n.b(context, D() ? this.f34843e.o() : this.f34843e.k(), D() ? this.f34843e.n() : this.f34843e.j()).m());
        invalidateSelf();
    }

    public final void L() {
        e eVar;
        Context context = (Context) this.f34839a.get();
        if (context == null || this.f34841c.e() == (eVar = new e(context, this.f34843e.C()))) {
            return;
        }
        this.f34841c.k(eVar, context);
        M();
        a0();
        invalidateSelf();
    }

    public final void M() {
        this.f34841c.g().setColor(this.f34843e.l());
        invalidateSelf();
    }

    public final void N() {
        b0();
        this.f34841c.l(true);
        a0();
        invalidateSelf();
    }

    public final void O() {
        if (F()) {
            return;
        }
        I();
    }

    public final void P() {
        I();
    }

    public final void Q() {
        setVisible(this.f34843e.I(), false);
    }

    public final void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    public void S(int i10) {
        this.f34843e.L(i10);
        H();
    }

    public void T(int i10) {
        BadgeState badgeState = this.f34843e;
        if (badgeState.f34805l != i10) {
            badgeState.f34805l = i10;
            a0();
        }
    }

    public void U(int i10) {
        if (this.f34841c.g().getColor() != i10) {
            this.f34843e.M(i10);
            M();
        }
    }

    public void V(int i10) {
        int max = Math.max(0, i10);
        if (this.f34843e.y() != max) {
            this.f34843e.N(max);
            O();
        }
    }

    public void W(String str) {
        if (TextUtils.equals(this.f34843e.B(), str)) {
            return;
        }
        this.f34843e.O(str);
        P();
    }

    public void X(boolean z10) {
        this.f34843e.P(z10);
        Q();
    }

    public void Z(View view, FrameLayout frameLayout) {
        this.f34850l = new WeakReference(view);
        this.f34851m = new WeakReference(frameLayout);
        Y(view);
        a0();
        invalidateSelf();
    }

    @Override // xa.i.b
    public void a() {
        invalidateSelf();
    }

    public final void a0() {
        Context context = (Context) this.f34839a.get();
        WeakReference weakReference = this.f34850l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f34842d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f34851m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        b.g(this.f34842d, this.f34844f, this.f34845g, this.f34848j, this.f34849k);
        float f10 = this.f34847i;
        if (f10 != -1.0f) {
            this.f34840b.b0(f10);
        }
        if (rect.equals(this.f34842d)) {
            return;
        }
        this.f34840b.setBounds(this.f34842d);
    }

    public final void b(View view) {
        ViewParent m10 = m();
        if (m10 == null) {
            m10 = view.getParent();
        }
        if ((m10 instanceof View) && (m10.getParent() instanceof View)) {
            c(view, (View) m10.getParent());
        }
    }

    public final void b0() {
        if (q() != -2) {
            this.f34846h = ((int) Math.pow(10.0d, q() - 1.0d)) - 1;
        } else {
            this.f34846h = r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void c(View view, View view2) {
        float f10;
        float f11;
        View view3;
        boolean z10;
        FrameLayout m10 = m();
        if (m10 == null) {
            float y10 = view.getY();
            f11 = view.getX();
            view3 = view.getParent();
            f10 = y10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            view3 = m10;
        }
        while (true) {
            z10 = view3 instanceof View;
            if (!z10 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f10 += view4.getY();
            f11 += view4.getX();
            view3 = view3.getParent();
        }
        if (z10) {
            float A10 = A(f10);
            float p10 = p(f11);
            View view5 = view3;
            float k10 = k(view5.getHeight(), f10);
            float v10 = v(view5.getWidth(), f11);
            if (A10 < 0.0f) {
                this.f34845g += Math.abs(A10);
            }
            if (p10 < 0.0f) {
                this.f34844f += Math.abs(p10);
            }
            if (k10 > 0.0f) {
                this.f34845g -= Math.abs(k10);
            }
            if (v10 > 0.0f) {
                this.f34844f -= Math.abs(v10);
            }
        }
    }

    public final void d(Rect rect, View view) {
        float f10 = D() ? this.f34843e.f34797d : this.f34843e.f34796c;
        this.f34847i = f10;
        if (f10 != -1.0f) {
            this.f34848j = f10;
            this.f34849k = f10;
        } else {
            this.f34848j = Math.round((D() ? this.f34843e.f34800g : this.f34843e.f34798e) / 2.0f);
            this.f34849k = Math.round((D() ? this.f34843e.f34801h : this.f34843e.f34799f) / 2.0f);
        }
        if (D()) {
            String j10 = j();
            this.f34848j = Math.max(this.f34848j, (this.f34841c.h(j10) / 2.0f) + this.f34843e.i());
            float max = Math.max(this.f34849k, (this.f34841c.f(j10) / 2.0f) + this.f34843e.m());
            this.f34849k = max;
            this.f34848j = Math.max(this.f34848j, max);
        }
        int C10 = C();
        int h10 = this.f34843e.h();
        if (h10 == 8388691 || h10 == 8388693) {
            this.f34845g = rect.bottom - C10;
        } else {
            this.f34845g = rect.top + C10;
        }
        int B10 = B();
        int h11 = this.f34843e.h();
        if (h11 == 8388659 || h11 == 8388691) {
            this.f34844f = this.f34843e.f34805l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f34848j) - ((this.f34849k * 2.0f) - B10) : (rect.right - this.f34848j) + ((this.f34849k * 2.0f) - B10) : view.getLayoutDirection() == 0 ? (rect.left - this.f34848j) + B10 : (rect.right + this.f34848j) - B10;
        } else {
            this.f34844f = this.f34843e.f34805l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f34848j) - B10 : (rect.left - this.f34848j) + B10 : view.getLayoutDirection() == 0 ? (rect.right - this.f34848j) + ((this.f34849k * 2.0f) - B10) : (rect.left + this.f34848j) - ((this.f34849k * 2.0f) - B10);
        }
        if (this.f34843e.H()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f34840b.draw(canvas);
        if (D()) {
            i(canvas);
        }
    }

    public void e() {
        if (this.f34843e.F()) {
            this.f34843e.a();
            O();
        }
    }

    public void f() {
        if (this.f34843e.G()) {
            this.f34843e.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34843e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f34842d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f34842d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void i(Canvas canvas) {
        String j10 = j();
        if (j10 != null) {
            Rect rect = new Rect();
            this.f34841c.g().getTextBounds(j10, 0, j10.length(), rect);
            float exactCenterY = this.f34845g - rect.exactCenterY();
            canvas.drawText(j10, this.f34844f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.f34841c.g());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final String j() {
        if (F()) {
            return y();
        }
        if (E()) {
            return t();
        }
        return null;
    }

    public final float k(float f10, float f11) {
        return ((this.f34845g + this.f34849k) - f10) + f11;
    }

    public CharSequence l() {
        if (isVisible()) {
            return F() ? z() : E() ? u() : n();
        }
        return null;
    }

    public FrameLayout m() {
        WeakReference weakReference = this.f34851m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final CharSequence n() {
        return this.f34843e.r();
    }

    public int o() {
        return this.f34843e.u();
    }

    @Override // android.graphics.drawable.Drawable, xa.i.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float p(float f10) {
        return (this.f34844f - this.f34848j) + f10;
    }

    public int q() {
        return this.f34843e.w();
    }

    public int r() {
        return this.f34843e.x();
    }

    public int s() {
        if (this.f34843e.F()) {
            return this.f34843e.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f34843e.K(i10);
        G();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final String t() {
        if (this.f34846h == -2 || s() <= this.f34846h) {
            return NumberFormat.getInstance(this.f34843e.z()).format(s());
        }
        Context context = (Context) this.f34839a.get();
        return context == null ? "" : String.format(this.f34843e.z(), context.getString(k.f48496B), Integer.valueOf(this.f34846h), "+");
    }

    public final String u() {
        Context context;
        if (this.f34843e.s() == 0 || (context = (Context) this.f34839a.get()) == null) {
            return null;
        }
        return (this.f34846h == -2 || s() <= this.f34846h) ? context.getResources().getQuantityString(this.f34843e.s(), s(), Integer.valueOf(s())) : context.getString(this.f34843e.p(), Integer.valueOf(this.f34846h));
    }

    public final float v(float f10, float f11) {
        return ((this.f34844f + this.f34848j) - f10) + f11;
    }

    public BadgeState.State w() {
        return this.f34843e.A();
    }

    public String x() {
        return this.f34843e.B();
    }

    public final String y() {
        String x10 = x();
        int q10 = q();
        if (q10 == -2 || x10 == null || x10.length() <= q10) {
            return x10;
        }
        Context context = (Context) this.f34839a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(k.f48531i), x10.substring(0, q10 - 1), "…");
    }

    public final CharSequence z() {
        CharSequence q10 = this.f34843e.q();
        return q10 != null ? q10 : x();
    }
}
