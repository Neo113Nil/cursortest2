package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.AbstractC2074d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.h;
import ia.m;
import ja.AbstractC5104a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s0.AbstractC6307a;
import y2.AbstractC6850d;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.q implements com.google.android.material.carousel.b, RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public int f35073A;

    /* renamed from: B, reason: collision with root package name */
    public Map f35074B;

    /* renamed from: C, reason: collision with root package name */
    public e f35075C;

    /* renamed from: D, reason: collision with root package name */
    public final View.OnLayoutChangeListener f35076D;

    /* renamed from: E, reason: collision with root package name */
    public int f35077E;

    /* renamed from: F, reason: collision with root package name */
    public int f35078F;

    /* renamed from: G, reason: collision with root package name */
    public int f35079G;

    /* renamed from: s, reason: collision with root package name */
    public int f35080s;

    /* renamed from: t, reason: collision with root package name */
    public int f35081t;

    /* renamed from: u, reason: collision with root package name */
    public int f35082u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35083v;

    /* renamed from: w, reason: collision with root package name */
    public final c f35084w;

    /* renamed from: x, reason: collision with root package name */
    public f f35085x;

    /* renamed from: y, reason: collision with root package name */
    public i f35086y;

    /* renamed from: z, reason: collision with root package name */
    public h f35087z;

    public class a extends o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.o
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f35086y == null || !CarouselLayoutManager.this.k()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.q2(carouselLayoutManager.s0(view));
        }

        @Override // androidx.recyclerview.widget.o
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f35086y == null || CarouselLayoutManager.this.k()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.q2(carouselLayoutManager.s0(view));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f35089a;

        /* renamed from: b, reason: collision with root package name */
        public final float f35090b;

        /* renamed from: c, reason: collision with root package name */
        public final float f35091c;

        /* renamed from: d, reason: collision with root package name */
        public final d f35092d;

        public b(View view, float f10, float f11, d dVar) {
            this.f35089a = view;
            this.f35090b = f10;
            this.f35091c = f11;
            this.f35092d = dVar;
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f35093a;

        /* renamed from: b, reason: collision with root package name */
        public List f35094b;

        public c() {
            Paint paint = new Paint();
            this.f35093a = paint;
            this.f35094b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void f(List list) {
            this.f35094b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            super.onDrawOver(canvas, recyclerView, b10);
            this.f35093a.setStrokeWidth(recyclerView.getResources().getDimension(ia.e.f48289A));
            for (h.c cVar : this.f35094b) {
                this.f35093a.setColor(AbstractC2074d.c(-65281, -16776961, cVar.f35131c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).k()) {
                    canvas.drawLine(cVar.f35130b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).K2(), cVar.f35130b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).G2(), this.f35093a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).H2(), cVar.f35130b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).I2(), cVar.f35130b, this.f35093a);
                }
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final h.c f35095a;

        /* renamed from: b, reason: collision with root package name */
        public final h.c f35096b;

        public d(h.c cVar, h.c cVar2) {
            x0.f.a(cVar.f35129a <= cVar2.f35129a);
            this.f35095a = cVar;
            this.f35096b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new j());
    }

    public static d O2(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            h.c cVar = (h.c) list.get(i14);
            float f15 = z10 ? cVar.f35130b : cVar.f35129a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((h.c) list.get(i10), (h.c) list.get(i12));
    }

    private int Y2(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (Z() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f35086y == null) {
            V2(xVar);
        }
        if (j() <= A2(this.f35086y).n()) {
            return 0;
        }
        int r22 = r2(i10, this.f35080s, this.f35081t, this.f35082u);
        this.f35080s += r22;
        f3(this.f35086y);
        float g10 = this.f35087z.g() / 2.0f;
        float o22 = o2(s0(Y(0)));
        Rect rect = new Rect();
        float f10 = P2() ? this.f35087z.i().f35130b : this.f35087z.b().f35130b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < Z(); i11++) {
            View Y10 = Y(i11);
            float abs = Math.abs(f10 - U2(Y10, o22, g10, rect));
            if (Y10 != null && abs < f11) {
                this.f35078F = s0(Y10);
                f11 = abs;
            }
            o22 = i2(o22, this.f35087z.g());
        }
        u2(xVar, b10);
        return r22;
    }

    public static /* synthetic */ void b2(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.material.carousel.d
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.W2();
            }
        });
    }

    public static int r2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int t2(int i10) {
        int F22 = F2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (F22 == 0) {
                return P2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return F22 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && F22 == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (F22 == 0) {
            return P2() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A() {
        return k();
    }

    public final h A2(i iVar) {
        return P2() ? iVar.h() : iVar.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B() {
        return !k();
    }

    public final h B2(int i10) {
        h hVar;
        Map map = this.f35074B;
        return (map == null || (hVar = (h) map.get(Integer.valueOf(AbstractC6307a.b(i10, 0, Math.max(0, j() + (-1)))))) == null) ? this.f35086y.g() : hVar;
    }

    public final int C2() {
        if (c0()) {
            return 0;
        }
        return F2() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean D0() {
        return true;
    }

    public final float D2(float f10, d dVar) {
        h.c cVar = dVar.f35095a;
        float f11 = cVar.f35132d;
        h.c cVar2 = dVar.f35096b;
        return AbstractC5104a.b(f11, cVar2.f35132d, cVar.f35130b, cVar2.f35130b, f10);
    }

    public int E2(int i10, h hVar) {
        return M2(i10, hVar) - this.f35080s;
    }

    public int F2() {
        return this.f35075C.f35107a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int G(RecyclerView.B b10) {
        if (Z() == 0 || this.f35086y == null || j() <= 1) {
            return 0;
        }
        return (int) (z0() * (this.f35086y.g().g() / I(b10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean G1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int N22;
        if (this.f35086y == null || (N22 = N2(s0(view), B2(s0(view)))) == 0) {
            return false;
        }
        Z2(recyclerView, N2(s0(view), this.f35086y.j(this.f35080s + r2(N22, this.f35080s, this.f35081t, this.f35082u), this.f35081t, this.f35082u)));
        return true;
    }

    public final int G2() {
        return this.f35075C.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int H(RecyclerView.B b10) {
        return this.f35080s;
    }

    public final int H2() {
        return this.f35075C.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int I(RecyclerView.B b10) {
        return this.f35082u - this.f35081t;
    }

    public final int I2() {
        return this.f35075C.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int J(RecyclerView.B b10) {
        if (Z() == 0 || this.f35086y == null || j() <= 1) {
            return 0;
        }
        return (int) (m0() * (this.f35086y.g().g() / L(b10)));
    }

    public final int J2() {
        return this.f35075C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K(RecyclerView.B b10) {
        return this.f35080s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (A()) {
            return Y2(i10, xVar, b10);
        }
        return 0;
    }

    public final int K2() {
        return this.f35075C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int L(RecyclerView.B b10) {
        return this.f35082u - this.f35081t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L1(int i10) {
        this.f35078F = i10;
        if (this.f35086y == null) {
            return;
        }
        this.f35080s = M2(i10, B2(i10));
        this.f35073A = AbstractC6307a.b(i10, 0, Math.max(0, j() - 1));
        f3(this.f35086y);
        H1();
    }

    public final int L2() {
        if (c0()) {
            return 0;
        }
        return F2() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int M1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (B()) {
            return Y2(i10, xVar, b10);
        }
        return 0;
    }

    public final int M2(int i10, h hVar) {
        return P2() ? (int) (((x2() - hVar.i().f35129a) - (i10 * hVar.g())) - (hVar.g() / 2.0f)) : (int) (((i10 * hVar.g()) - hVar.b().f35129a) + (hVar.g() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int N2(int i10, h hVar) {
        int i11 = Integer.MAX_VALUE;
        for (h.c cVar : hVar.f()) {
            float g10 = (i10 * hVar.g()) + (hVar.g() / 2.0f);
            int x22 = (P2() ? (int) ((x2() - cVar.f35129a) - g10) : (int) (g10 - cVar.f35129a)) - this.f35080s;
            if (Math.abs(i11) > Math.abs(x22)) {
                i11 = x22;
            }
        }
        return i11;
    }

    public boolean P2() {
        return k() && o0() == 1;
    }

    public final boolean Q2(float f10, d dVar) {
        float j22 = j2(f10, D2(f10, dVar) / 2.0f);
        return P2() ? j22 < 0.0f : j22 > ((float) x2());
    }

    public final boolean R2(float f10, d dVar) {
        float i22 = i2(f10, D2(f10, dVar) / 2.0f);
        return P2() ? i22 > ((float) x2()) : i22 < 0.0f;
    }

    public final void S2() {
        if (this.f35083v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i10 = 0; i10 < Z(); i10++) {
                View Y10 = Y(i10);
                y2(Y10);
                s0(Y10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r T() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void T0(RecyclerView recyclerView) {
        super.T0(recyclerView);
        this.f35085x.f(recyclerView.getContext());
        W2();
        recyclerView.addOnLayoutChangeListener(this.f35076D);
    }

    public final b T2(RecyclerView.x xVar, float f10, int i10) {
        View o10 = xVar.o(i10);
        N0(o10, 0, 0);
        float i22 = i2(f10, this.f35087z.g() / 2.0f);
        d O22 = O2(this.f35087z.h(), i22, false);
        return new b(o10, i22, n2(i22, O22), O22);
    }

    public final float U2(View view, float f10, float f11, Rect rect) {
        float i22 = i2(f10, f11);
        d O22 = O2(this.f35087z.h(), i22, false);
        float n22 = n2(i22, O22);
        super.f0(view, rect);
        e3(view, i22, O22);
        this.f35075C.j(view, rect, f11, n22);
        return n22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.V0(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.f35076D);
    }

    public final void V2(RecyclerView.x xVar) {
        View o10 = xVar.o(0);
        N0(o10, 0, 0);
        h g10 = this.f35085x.g(this, o10);
        if (P2()) {
            g10 = h.p(g10, x2());
        }
        this.f35086y = i.f(this, g10, z2(), C2(), L2(), this.f35085x.e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View W0(View view, int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        int t22;
        if (Z() == 0 || (t22 = t2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (t22 == -1) {
            if (s0(view) == 0) {
                return null;
            }
            k2(xVar, s0(Y(0)) - 1, 0);
            return w2();
        }
        if (s0(view) == j() - 1) {
            return null;
        }
        k2(xVar, s0(Y(Z() - 1)) + 1, -1);
        return v2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        X1(aVar);
    }

    public final void W2() {
        this.f35086y = null;
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(AccessibilityEvent accessibilityEvent) {
        super.X0(accessibilityEvent);
        if (Z() > 0) {
            accessibilityEvent.setFromIndex(s0(Y(0)));
            accessibilityEvent.setToIndex(s0(Y(Z() - 1)));
        }
    }

    public final void X2(RecyclerView.x xVar) {
        while (Z() > 0) {
            View Y10 = Y(0);
            float y22 = y2(Y10);
            if (!R2(y22, O2(this.f35087z.h(), y22, true))) {
                break;
            } else {
                A1(Y10, xVar);
            }
        }
        while (Z() - 1 >= 0) {
            View Y11 = Y(Z() - 1);
            float y23 = y2(Y11);
            if (!Q2(y23, O2(this.f35087z.h(), y23, true))) {
                return;
            } else {
                A1(Y11, xVar);
            }
        }
    }

    public final void Z2(RecyclerView recyclerView, int i10) {
        if (k()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    @Override // com.google.android.material.carousel.b
    public int a() {
        return z0();
    }

    public void a3(int i10) {
        this.f35079G = i10;
        W2();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return m0();
    }

    public final void b3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.Carousel);
            a3(obtainStyledAttributes.getInt(m.f48619D0, 0));
            d3(obtainStyledAttributes.getInt(AbstractC6850d.f68257a, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i10) {
        if (this.f35086y == null) {
            return null;
        }
        int E22 = E2(i10, B2(i10));
        return k() ? new PointF(E22, 0.0f) : new PointF(0.0f, E22);
    }

    public void c3(f fVar) {
        this.f35085x = fVar;
        W2();
    }

    public void d3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        w(null);
        e eVar = this.f35075C;
        if (eVar == null || i10 != eVar.f35107a) {
            this.f35075C = e.b(this, i10);
            W2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView recyclerView, int i10, int i11) {
        super.e1(recyclerView, i10, i11);
        g3();
    }

    public final void e3(View view, float f10, d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void f0(View view, Rect rect) {
        super.f0(view, rect);
        float centerY = rect.centerY();
        if (k()) {
            centerY = rect.centerX();
        }
        float D22 = D2(centerY, O2(this.f35087z.h(), centerY, true));
        float width = k() ? (rect.width() - D22) / 2.0f : 0.0f;
        float height = k() ? 0.0f : (rect.height() - D22) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void f1(RecyclerView recyclerView) {
        super.f1(recyclerView);
        g3();
    }

    public final void f3(i iVar) {
        int i10 = this.f35082u;
        int i11 = this.f35081t;
        if (i10 <= i11) {
            this.f35087z = A2(iVar);
        } else {
            this.f35087z = iVar.j(this.f35080s, i11, i10);
        }
        this.f35084w.f(this.f35087z.h());
    }

    public final void g3() {
        int j10 = j();
        int i10 = this.f35077E;
        if (j10 == i10 || this.f35086y == null) {
            return;
        }
        if (this.f35085x.h(this, i10)) {
            W2();
        }
        this.f35077E = j10;
    }

    @Override // com.google.android.material.carousel.b
    public int h() {
        return this.f35079G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        super.h1(recyclerView, i10, i11);
        g3();
    }

    public final void h2(View view, int i10, b bVar) {
        float g10 = this.f35087z.g() / 2.0f;
        u(view, i10);
        N0(view, 0, 0);
        float f10 = bVar.f35091c;
        this.f35075C.i(view, (int) (f10 - g10), (int) (f10 + g10));
        e3(view, bVar.f35090b, bVar.f35092d);
    }

    public final void h3() {
        if (!this.f35083v || Z() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < Z() - 1) {
            int s02 = s0(Y(i10));
            int i11 = i10 + 1;
            int s03 = s0(Y(i11));
            if (s02 > s03) {
                S2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + s02 + "] and child at index [" + i11 + "] had adapter position [" + s03 + "].");
            }
            i10 = i11;
        }
    }

    public final float i2(float f10, float f11) {
        return P2() ? f10 - f11 : f10 + f11;
    }

    public final float j2(float f10, float f11) {
        return P2() ? f10 + f11 : f10 - f11;
    }

    @Override // com.google.android.material.carousel.b
    public boolean k() {
        return this.f35075C.f35107a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void k1(RecyclerView.x xVar, RecyclerView.B b10) {
        if (b10.b() <= 0 || x2() <= 0.0f) {
            y1(xVar);
            this.f35073A = 0;
            return;
        }
        boolean P22 = P2();
        i iVar = this.f35086y;
        boolean z10 = iVar == null;
        if (z10 || iVar.g().a() != x2()) {
            V2(xVar);
        }
        int s22 = s2(this.f35086y);
        int p22 = p2(b10, this.f35086y);
        this.f35081t = P22 ? p22 : s22;
        if (P22) {
            p22 = s22;
        }
        this.f35082u = p22;
        if (z10) {
            this.f35080s = s22;
            this.f35074B = this.f35086y.i(j(), this.f35081t, this.f35082u, P2());
            int i10 = this.f35078F;
            if (i10 != -1) {
                this.f35080s = M2(i10, B2(i10));
            }
        }
        int i11 = this.f35080s;
        this.f35080s = i11 + r2(0, i11, this.f35081t, this.f35082u);
        this.f35073A = AbstractC6307a.b(this.f35073A, 0, b10.b());
        f3(this.f35086y);
        M(xVar);
        u2(xVar, b10);
        this.f35077E = j();
    }

    public final void k2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0 || i10 >= j()) {
            return;
        }
        b T22 = T2(xVar, o2(i10), i10);
        h2(T22.f35089a, i11, T22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l1(RecyclerView.B b10) {
        super.l1(b10);
        if (Z() == 0) {
            this.f35073A = 0;
        } else {
            this.f35073A = s0(Y(0));
        }
        h3();
    }

    public final void l2(RecyclerView.x xVar, RecyclerView.B b10, int i10) {
        float o22 = o2(i10);
        while (i10 < b10.b()) {
            float i22 = i2(o22, this.f35087z.g() / 2.0f);
            d O22 = O2(this.f35087z.h(), i22, false);
            float n22 = n2(i22, O22);
            if (Q2(n22, O22)) {
                return;
            }
            o22 = i2(o22, this.f35087z.g());
            if (!R2(n22, O22)) {
                View o10 = xVar.o(i10);
                h2(o10, -1, new b(o10, i22, n22, O22));
            }
            i10++;
        }
    }

    public final void m2(RecyclerView.x xVar, int i10) {
        float o22 = o2(i10);
        while (i10 >= 0) {
            float i22 = i2(o22, this.f35087z.g() / 2.0f);
            d O22 = O2(this.f35087z.h(), i22, false);
            float n22 = n2(i22, O22);
            if (R2(n22, O22)) {
                return;
            }
            o22 = j2(o22, this.f35087z.g());
            if (!Q2(n22, O22)) {
                View o10 = xVar.o(i10);
                h2(o10, 0, new b(o10, i22, n22, O22));
            }
            i10--;
        }
    }

    public final float n2(float f10, d dVar) {
        h.c cVar = dVar.f35095a;
        float f11 = cVar.f35130b;
        h.c cVar2 = dVar.f35096b;
        float b10 = AbstractC5104a.b(f11, cVar2.f35130b, cVar.f35129a, cVar2.f35129a, f10);
        if (dVar.f35096b != this.f35087z.d() && dVar.f35095a != this.f35087z.k()) {
            return b10;
        }
        h.c cVar3 = dVar.f35096b;
        return b10 + ((f10 - cVar3.f35129a) * (1.0f - cVar3.f35131c));
    }

    public final float o2(int i10) {
        return i2(J2() - this.f35080s, this.f35087z.g() * i10);
    }

    public final int p2(RecyclerView.B b10, i iVar) {
        boolean P22 = P2();
        h l10 = P22 ? iVar.l() : iVar.h();
        h.c b11 = P22 ? l10.b() : l10.i();
        int b12 = (int) (((((b10.b() - 1) * l10.g()) * (P22 ? -1.0f : 1.0f)) - (b11.f35129a - J2())) + (((P22 ? -1 : 1) * b11.f35132d) / 2.0f));
        return P22 ? Math.min(0, b12) : Math.max(0, b12);
    }

    public int q2(int i10) {
        return (int) (this.f35080s - M2(i10, B2(i10)));
    }

    public final int s2(i iVar) {
        boolean P22 = P2();
        h h10 = P22 ? iVar.h() : iVar.l();
        return (int) (J2() - j2((P22 ? h10.i() : h10.b()).f35129a, h10.g() / 2.0f));
    }

    public final void u2(RecyclerView.x xVar, RecyclerView.B b10) {
        X2(xVar);
        if (Z() == 0) {
            m2(xVar, this.f35073A - 1);
            l2(xVar, b10, this.f35073A);
        } else {
            int s02 = s0(Y(0));
            int s03 = s0(Y(Z() - 1));
            m2(xVar, s02 - 1);
            l2(xVar, b10, s03 + 1);
        }
        h3();
    }

    public final View v2() {
        return Y(P2() ? 0 : Z() - 1);
    }

    public final View w2() {
        return Y(P2() ? Z() - 1 : 0);
    }

    public final int x2() {
        return k() ? a() : b();
    }

    public final float y2(View view) {
        super.f0(view, new Rect());
        return k() ? r0.centerX() : r0.centerY();
    }

    public final int z2() {
        int i10;
        int i11;
        if (Z() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) Y(0).getLayoutParams();
        if (this.f35075C.f35107a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    public CarouselLayoutManager(f fVar) {
        this(fVar, 0);
    }

    public CarouselLayoutManager(f fVar, int i10) {
        this.f35083v = false;
        this.f35084w = new c();
        this.f35073A = 0;
        this.f35076D = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.b2(CarouselLayoutManager.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f35078F = -1;
        this.f35079G = 0;
        c3(fVar);
        d3(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f35083v = false;
        this.f35084w = new c();
        this.f35073A = 0;
        this.f35076D = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.b2(CarouselLayoutManager.this, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f35078F = -1;
        this.f35079G = 0;
        c3(new j());
        b3(context, attributeSet);
    }
}
