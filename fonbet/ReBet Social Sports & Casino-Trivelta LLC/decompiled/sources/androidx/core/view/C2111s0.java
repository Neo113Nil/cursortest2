package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.F0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import k0.AbstractC5144c;

/* renamed from: androidx.core.view.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2111s0 {

    /* renamed from: a, reason: collision with root package name */
    public e f19261a;

    /* renamed from: androidx.core.view.s0$b */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        F0 mDispachedInsets;
        private final int mDispatchMode;

        public b(int i10) {
            this.mDispatchMode = i10;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(C2111s0 c2111s0) {
        }

        public void onPrepare(C2111s0 c2111s0) {
        }

        public abstract F0 onProgress(F0 f02, List list);

        public a onStart(C2111s0 c2111s0, a aVar) {
            return aVar;
        }
    }

    /* renamed from: androidx.core.view.s0$c */
    public static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        public static final Interpolator f19264f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        public static final Interpolator f19265g = new T0.a();

        /* renamed from: h, reason: collision with root package name */
        public static final Interpolator f19266h = new DecelerateInterpolator(1.5f);

        /* renamed from: i, reason: collision with root package name */
        public static final Interpolator f19267i = new AccelerateInterpolator(1.5f);

        /* renamed from: androidx.core.view.s0$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f19268a;

            /* renamed from: b, reason: collision with root package name */
            public F0 f19269b;

            /* renamed from: androidx.core.view.s0$c$a$a, reason: collision with other inner class name */
            public class C0365a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2111s0 f19270a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ F0 f19271b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ F0 f19272c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f19273d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f19274e;

                public C0365a(C2111s0 c2111s0, F0 f02, F0 f03, int i10, View view) {
                    this.f19270a = c2111s0;
                    this.f19271b = f02;
                    this.f19272c = f03;
                    this.f19273d = i10;
                    this.f19274e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f19270a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f19274e, c.o(this.f19271b, this.f19272c, this.f19270a.b(), this.f19273d), Collections.singletonList(this.f19270a));
                }
            }

            /* renamed from: androidx.core.view.s0$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2111s0 f19276a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f19277b;

                public b(C2111s0 c2111s0, View view) {
                    this.f19276a = c2111s0;
                    this.f19277b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f19276a.e(1.0f);
                    c.i(this.f19277b, this.f19276a);
                }
            }

            /* renamed from: androidx.core.view.s0$c$a$c, reason: collision with other inner class name */
            public class RunnableC0366c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f19279a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2111s0 f19280b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f19281c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f19282d;

                public RunnableC0366c(View view, C2111s0 c2111s0, a aVar, ValueAnimator valueAnimator) {
                    this.f19279a = view;
                    this.f19280b = c2111s0;
                    this.f19281c = aVar;
                    this.f19282d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f19279a, this.f19280b, this.f19281c);
                    this.f19282d.start();
                }
            }

            public a(View view, b bVar) {
                this.f19268a = bVar;
                F0 G10 = AbstractC2082d0.G(view);
                this.f19269b = G10 != null ? new F0.a(G10).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f19269b = F0.z(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                F0 z10 = F0.z(windowInsets, view);
                if (this.f19269b == null) {
                    this.f19269b = AbstractC2082d0.G(view);
                }
                if (this.f19269b == null) {
                    this.f19269b = z10;
                    return c.m(view, windowInsets);
                }
                b n10 = c.n(view);
                if (n10 != null && Objects.equals(n10.mDispachedInsets, z10)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(z10, this.f19269b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f19269b = z10;
                    return c.m(view, windowInsets);
                }
                F0 f02 = this.f19269b;
                C2111s0 c2111s0 = new C2111s0(i12, c.g(i10, i11), (F0.p.b() & i12) != 0 ? 160L : 250L);
                c2111s0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2111s0.a());
                a f10 = c.f(z10, f02, i12);
                c.j(view, c2111s0, z10, false);
                duration.addUpdateListener(new C0365a(c2111s0, z10, f02, i12, view));
                duration.addListener(new b(c2111s0, view));
                M.a(view, new RunnableC0366c(view, c2111s0, f10, duration));
                this.f19269b = z10;
                return c.m(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        public static void e(F0 f02, F0 f03, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                androidx.core.graphics.e f10 = f02.f(i10);
                androidx.core.graphics.e f11 = f03.f(i10);
                int i11 = f10.f19098a;
                int i12 = f11.f19098a;
                boolean z10 = i11 > i12 || f10.f19099b > f11.f19099b || f10.f19100c > f11.f19100c || f10.f19101d > f11.f19101d;
                if (z10 != (i11 < i12 || f10.f19099b < f11.f19099b || f10.f19100c < f11.f19100c || f10.f19101d < f11.f19101d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        public static a f(F0 f02, F0 f03, int i10) {
            androidx.core.graphics.e f10 = f02.f(i10);
            androidx.core.graphics.e f11 = f03.f(i10);
            return new a(androidx.core.graphics.e.c(Math.min(f10.f19098a, f11.f19098a), Math.min(f10.f19099b, f11.f19099b), Math.min(f10.f19100c, f11.f19100c), Math.min(f10.f19101d, f11.f19101d)), androidx.core.graphics.e.c(Math.max(f10.f19098a, f11.f19098a), Math.max(f10.f19099b, f11.f19099b), Math.max(f10.f19100c, f11.f19100c), Math.max(f10.f19101d, f11.f19101d)));
        }

        public static Interpolator g(int i10, int i11) {
            if ((F0.p.b() & i10) != 0) {
                return f19264f;
            }
            if ((F0.p.b() & i11) != 0) {
                return f19265g;
            }
            if ((i10 & F0.p.g()) != 0) {
                return f19266h;
            }
            if ((F0.p.g() & i11) != 0) {
                return f19267i;
            }
            return null;
        }

        public static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void i(View view, C2111s0 c2111s0) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onEnd(c2111s0);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c2111s0);
                }
            }
        }

        public static void j(View view, C2111s0 c2111s0, F0 f02, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.mDispachedInsets = f02;
                if (!z10) {
                    n10.onPrepare(c2111s0);
                    z10 = n10.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c2111s0, f02, z10);
                }
            }
        }

        public static void k(View view, F0 f02, List list) {
            b n10 = n(view);
            if (n10 != null) {
                f02 = n10.onProgress(f02, list);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), f02, list);
                }
            }
        }

        public static void l(View view, C2111s0 c2111s0, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onStart(c2111s0, aVar);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c2111s0, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC5144c.f54023M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b n(View view) {
            Object tag = view.getTag(AbstractC5144c.f54030T);
            if (tag instanceof a) {
                return ((a) tag).f19268a;
            }
            return null;
        }

        public static F0 o(F0 f02, F0 f03, float f10, int i10) {
            F0.a aVar = new F0.a(f02);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, f02.f(i11));
                } else {
                    androidx.core.graphics.e f11 = f02.f(i11);
                    androidx.core.graphics.e f12 = f03.f(i11);
                    float f13 = 1.0f - f10;
                    aVar.b(i11, F0.o(f11, (int) (((f11.f19098a - f12.f19098a) * f13) + 0.5d), (int) (((f11.f19099b - f12.f19099b) * f13) + 0.5d), (int) (((f11.f19100c - f12.f19100c) * f13) + 0.5d), (int) (((f11.f19101d - f12.f19101d) * f13) + 0.5d)));
                }
            }
            return aVar.a();
        }

        public static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener h10 = bVar != null ? h(view, bVar) : null;
            view.setTag(AbstractC5144c.f54030T, h10);
            if (view.getTag(AbstractC5144c.f54022L) == null && view.getTag(AbstractC5144c.f54023M) == null) {
                view.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    /* renamed from: androidx.core.view.s0$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f19289a;

        /* renamed from: b, reason: collision with root package name */
        public float f19290b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f19291c;

        /* renamed from: d, reason: collision with root package name */
        public final long f19292d;

        /* renamed from: e, reason: collision with root package name */
        public float f19293e = 1.0f;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f19289a = i10;
            this.f19291c = interpolator;
            this.f19292d = j10;
        }

        public long a() {
            return this.f19292d;
        }

        public float b() {
            Interpolator interpolator = this.f19291c;
            return interpolator != null ? interpolator.getInterpolation(this.f19290b) : this.f19290b;
        }

        public int c() {
            return this.f19289a;
        }

        public void d(float f10) {
            this.f19290b = f10;
        }
    }

    public C2111s0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f19261a = new d(i10, interpolator, j10);
        } else {
            this.f19261a = new c(i10, interpolator, j10);
        }
    }

    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    public static C2111s0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C2111s0(windowInsetsAnimation);
    }

    public long a() {
        return this.f19261a.a();
    }

    public float b() {
        return this.f19261a.b();
    }

    public int c() {
        return this.f19261a.c();
    }

    public void e(float f10) {
        this.f19261a.d(f10);
    }

    /* renamed from: androidx.core.view.s0$d */
    public static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        public final WindowInsetsAnimation f19284f;

        /* renamed from: androidx.core.view.s0$d$a */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f19285a;

            /* renamed from: b, reason: collision with root package name */
            public List f19286b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList f19287c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap f19288d;

            public a(b bVar) {
                super(bVar.getDispatchMode());
                this.f19288d = new HashMap();
                this.f19285a = bVar;
            }

            public final C2111s0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C2111s0 c2111s0 = (C2111s0) this.f19288d.get(windowInsetsAnimation);
                if (c2111s0 != null) {
                    return c2111s0;
                }
                C2111s0 f10 = C2111s0.f(windowInsetsAnimation);
                this.f19288d.put(windowInsetsAnimation, f10);
                return f10;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f19285a.onEnd(a(windowInsetsAnimation));
                this.f19288d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f19285a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f19287c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f19287c = arrayList2;
                    this.f19286b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = D0.a(list.get(size));
                    C2111s0 a11 = a(a10);
                    fraction = a10.getFraction();
                    a11.e(fraction);
                    this.f19287c.add(a11);
                }
                return this.f19285a.onProgress(F0.y(windowInsets), this.f19286b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f19285a.onStart(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f19284f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            A0.a();
            return AbstractC2125z0.a(aVar.a().f(), aVar.b().f());
        }

        public static androidx.core.graphics.e f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.e.e(upperBound);
        }

        public static androidx.core.graphics.e g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.e.e(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.C2111s0.e
        public long a() {
            long durationMillis;
            durationMillis = this.f19284f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C2111s0.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f19284f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C2111s0.e
        public int c() {
            int typeMask;
            typeMask = this.f19284f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.C2111s0.e
        public void d(float f10) {
            this.f19284f.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC2123y0.a(i10, interpolator, j10));
        }
    }

    /* renamed from: androidx.core.view.s0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.core.graphics.e f19262a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.core.graphics.e f19263b;

        public a(androidx.core.graphics.e eVar, androidx.core.graphics.e eVar2) {
            this.f19262a = eVar;
            this.f19263b = eVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.e a() {
            return this.f19262a;
        }

        public androidx.core.graphics.e b() {
            return this.f19263b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f19262a + " upper=" + this.f19263b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f19262a = d.g(bounds);
            this.f19263b = d.f(bounds);
        }
    }

    public C2111s0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f19261a = new d(windowInsetsAnimation);
        }
    }
}
