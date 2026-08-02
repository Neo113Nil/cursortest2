package L2;

import L2.AbstractC1388m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;

/* renamed from: L2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1377b extends AbstractC1388m {

    /* renamed from: L, reason: collision with root package name */
    public boolean f6806L = false;
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O, reason: collision with root package name */
    public static final Property f6800O = new a(PointF.class, "topLeft");

    /* renamed from: P, reason: collision with root package name */
    public static final Property f6801P = new C0143b(PointF.class, "bottomRight");

    /* renamed from: R, reason: collision with root package name */
    public static final Property f6802R = new c(PointF.class, "bottomRight");

    /* renamed from: T, reason: collision with root package name */
    public static final Property f6803T = new d(PointF.class, "topLeft");

    /* renamed from: V, reason: collision with root package name */
    public static final Property f6804V = new e(PointF.class, ViewProps.POSITION);

    /* renamed from: W, reason: collision with root package name */
    public static final C1384i f6805W = new C1384i();

    /* renamed from: L2.b$a */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: L2.b$b, reason: collision with other inner class name */
    public class C0143b extends Property {
        public C0143b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: L2.b$c */
    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            F.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: L2.b$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            F.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: L2.b$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            F.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: L2.b$f */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f6807a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f6807a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: L2.b$g */
    public static class g extends AnimatorListenerAdapter implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final View f6809a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f6810b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6811c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f6812d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6813e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6814f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6815g;

        /* renamed from: h, reason: collision with root package name */
        public final int f6816h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6817i;

        /* renamed from: j, reason: collision with root package name */
        public final int f6818j;

        /* renamed from: k, reason: collision with root package name */
        public final int f6819k;

        /* renamed from: l, reason: collision with root package name */
        public final int f6820l;

        /* renamed from: m, reason: collision with root package name */
        public final int f6821m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f6822n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f6809a = view;
            this.f6810b = rect;
            this.f6811c = z10;
            this.f6812d = rect2;
            this.f6813e = z11;
            this.f6814f = i10;
            this.f6815g = i11;
            this.f6816h = i12;
            this.f6817i = i13;
            this.f6818j = i14;
            this.f6819k = i15;
            this.f6820l = i16;
            this.f6821m = i17;
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
            this.f6809a.setTag(AbstractC1383h.f6854b, this.f6809a.getClipBounds());
            this.f6809a.setClipBounds(this.f6813e ? null : this.f6812d);
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            this.f6822n = true;
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
            Rect rect = (Rect) this.f6809a.getTag(AbstractC1383h.f6854b);
            this.f6809a.setTag(AbstractC1383h.f6854b, null);
            this.f6809a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f6822n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f6811c) {
                    rect = this.f6810b;
                }
            } else if (!this.f6813e) {
                rect = this.f6812d;
            }
            this.f6809a.setClipBounds(rect);
            if (z10) {
                F.d(this.f6809a, this.f6814f, this.f6815g, this.f6816h, this.f6817i);
            } else {
                F.d(this.f6809a, this.f6818j, this.f6819k, this.f6820l, this.f6821m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int max = Math.max(this.f6816h - this.f6814f, this.f6820l - this.f6818j);
            int max2 = Math.max(this.f6817i - this.f6815g, this.f6821m - this.f6819k);
            int i10 = z10 ? this.f6818j : this.f6814f;
            int i11 = z10 ? this.f6819k : this.f6815g;
            F.d(this.f6809a, i10, i11, max + i10, max2 + i11);
            this.f6809a.setClipBounds(z10 ? this.f6812d : this.f6810b);
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }
    }

    /* renamed from: L2.b$h */
    public static class h extends u {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6823a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f6824b;

        public h(ViewGroup viewGroup) {
            this.f6824b = viewGroup;
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
            E.b(this.f6824b, false);
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            E.b(this.f6824b, false);
            this.f6823a = true;
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
            E.b(this.f6824b, true);
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            if (!this.f6823a) {
                E.b(this.f6824b, false);
            }
            abstractC1388m.b0(this);
        }
    }

    /* renamed from: L2.b$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f6825a;

        /* renamed from: b, reason: collision with root package name */
        public int f6826b;

        /* renamed from: c, reason: collision with root package name */
        public int f6827c;

        /* renamed from: d, reason: collision with root package name */
        public int f6828d;

        /* renamed from: e, reason: collision with root package name */
        public final View f6829e;

        /* renamed from: f, reason: collision with root package name */
        public int f6830f;

        /* renamed from: g, reason: collision with root package name */
        public int f6831g;

        public i(View view) {
            this.f6829e = view;
        }

        public void a(PointF pointF) {
            this.f6827c = Math.round(pointF.x);
            this.f6828d = Math.round(pointF.y);
            int i10 = this.f6831g + 1;
            this.f6831g = i10;
            if (this.f6830f == i10) {
                b();
            }
        }

        public final void b() {
            F.d(this.f6829e, this.f6825a, this.f6826b, this.f6827c, this.f6828d);
            this.f6830f = 0;
            this.f6831g = 0;
        }

        public void c(PointF pointF) {
            this.f6825a = Math.round(pointF.x);
            this.f6826b = Math.round(pointF.y);
            int i10 = this.f6830f + 1;
            this.f6830f = i10;
            if (i10 == this.f6831g) {
                b();
            }
        }
    }

    @Override // L2.AbstractC1388m
    public String[] K() {
        return sTransitionProperties;
    }

    @Override // L2.AbstractC1388m
    public boolean N() {
        return true;
    }

    @Override // L2.AbstractC1388m
    public void h(A a10) {
        p0(a10);
    }

    @Override // L2.AbstractC1388m
    public void k(A a10) {
        Rect rect;
        p0(a10);
        if (!this.f6806L || (rect = (Rect) a10.f6757b.getTag(AbstractC1383h.f6854b)) == null) {
            return;
        }
        a10.f6756a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L2.AbstractC1388m
    public Animator o(ViewGroup viewGroup, A a10, A a11) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator a12;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (a10 == null || a11 == null) {
            return null;
        }
        Map map = a10.f6756a;
        Map map2 = a11.f6756a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = a11.f6757b;
        Rect rect2 = (Rect) a10.f6756a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) a11.f6756a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) a10.f6756a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) a11.f6756a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.f6806L) {
            F.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                a12 = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                a12 = AbstractC1381f.a(view, f6804V, A().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", f6805W, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimator.addListener(gVar);
                c(gVar);
            }
            c10 = z.c(a12, objectAnimator);
        } else {
            F.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                c10 = (i15 == i16 && i17 == i18) ? AbstractC1381f.a(view, f6802R, A().a(i19, i21, i20, i22)) : AbstractC1381f.a(view, f6803T, A().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                c10 = AbstractC1381f.a(view, f6804V, A().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator a13 = AbstractC1381f.a(iVar, f6800O, A().a(i15, i17, i16, i18));
                ObjectAnimator a14 = AbstractC1381f.a(iVar, f6801P, A().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a13, a14);
                animatorSet.addListener(new f(iVar));
                c10 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            E.b(viewGroup4, true);
            C().c(new h(viewGroup4));
        }
        return c10;
    }

    public final void p0(A a10) {
        View view = a10.f6757b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        a10.f6756a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        a10.f6756a.put("android:changeBounds:parent", a10.f6757b.getParent());
        if (this.f6806L) {
            a10.f6756a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }
}
