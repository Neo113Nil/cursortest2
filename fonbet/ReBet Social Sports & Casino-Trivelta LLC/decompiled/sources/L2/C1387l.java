package L2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: L2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1387l extends S {

    /* renamed from: R, reason: collision with root package name */
    public static final TimeInterpolator f6861R = new DecelerateInterpolator();

    /* renamed from: T, reason: collision with root package name */
    public static final TimeInterpolator f6862T = new AccelerateInterpolator();

    /* renamed from: V, reason: collision with root package name */
    public static final g f6863V = new a();

    /* renamed from: W, reason: collision with root package name */
    public static final g f6864W = new b();

    /* renamed from: X, reason: collision with root package name */
    public static final g f6865X = new c();

    /* renamed from: Y, reason: collision with root package name */
    public static final g f6866Y = new d();

    /* renamed from: Z, reason: collision with root package name */
    public static final g f6867Z = new e();

    /* renamed from: b1, reason: collision with root package name */
    public static final g f6868b1 = new f();

    /* renamed from: O, reason: collision with root package name */
    public g f6869O = f6868b1;

    /* renamed from: P, reason: collision with root package name */
    public int f6870P = 80;

    /* renamed from: L2.l$a */
    public class a extends h {
        public a() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: L2.l$b */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: L2.l$c */
    public class c extends i {
        public c() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: L2.l$d */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: L2.l$e */
    public class e extends h {
        public e() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: L2.l$f */
    public class f extends i {
        public f() {
            super(null);
        }

        @Override // L2.C1387l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: L2.l$g */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* renamed from: L2.l$h */
    public static abstract class h implements g {
        public h() {
        }

        @Override // L2.C1387l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* renamed from: L2.l$i */
    public static abstract class i implements g {
        public i() {
        }

        @Override // L2.C1387l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public C1387l(int i10) {
        w0(i10);
    }

    private void p0(A a10) {
        int[] iArr = new int[2];
        a10.f6757b.getLocationOnScreen(iArr);
        a10.f6756a.put("android:slide:screenPosition", iArr);
    }

    @Override // L2.AbstractC1388m
    public boolean N() {
        return true;
    }

    @Override // L2.S, L2.AbstractC1388m
    public void h(A a10) {
        super.h(a10);
        p0(a10);
    }

    @Override // L2.S, L2.AbstractC1388m
    public void k(A a10) {
        super.k(a10);
        p0(a10);
    }

    @Override // L2.S
    public Animator s0(ViewGroup viewGroup, View view, A a10, A a11) {
        if (a11 == null) {
            return null;
        }
        int[] iArr = (int[]) a11.f6756a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C.a(view, a11, iArr[0], iArr[1], this.f6869O.b(viewGroup, view), this.f6869O.a(viewGroup, view), translationX, translationY, f6861R, this);
    }

    @Override // L2.S
    public Animator u0(ViewGroup viewGroup, View view, A a10, A a11) {
        if (a10 == null) {
            return null;
        }
        int[] iArr = (int[]) a10.f6756a.get("android:slide:screenPosition");
        return C.a(view, a10, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6869O.b(viewGroup, view), this.f6869O.a(viewGroup, view), f6862T, this);
    }

    public void w0(int i10) {
        if (i10 == 3) {
            this.f6869O = f6863V;
        } else if (i10 == 5) {
            this.f6869O = f6866Y;
        } else if (i10 == 48) {
            this.f6869O = f6865X;
        } else if (i10 == 80) {
            this.f6869O = f6868b1;
        } else if (i10 == 8388611) {
            this.f6869O = f6864W;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f6869O = f6867Z;
        }
        this.f6870P = i10;
        C1386k c1386k = new C1386k();
        c1386k.j(i10);
        l0(c1386k);
    }
}
