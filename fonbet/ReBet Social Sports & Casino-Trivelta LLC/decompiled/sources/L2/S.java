package L2;

import L2.AbstractC1388m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2082d0;

/* loaded from: classes.dex */
public abstract class S extends AbstractC1388m {
    private static final String[] sTransitionProperties = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L, reason: collision with root package name */
    public int f6782L = 3;

    public static class a extends AnimatorListenerAdapter implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final View f6783a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6784b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f6785c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6786d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6787e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6788f = false;

        public a(View view, int i10, boolean z10) {
            this.f6783a = view;
            this.f6784b = i10;
            this.f6785c = (ViewGroup) view.getParent();
            this.f6786d = z10;
            d(true);
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
            d(false);
            if (this.f6788f) {
                return;
            }
            F.f(this.f6783a, this.f6784b);
        }

        public final void c() {
            if (!this.f6788f) {
                F.f(this.f6783a, this.f6784b);
                ViewGroup viewGroup = this.f6785c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        public final void d(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f6786d || this.f6787e == z10 || (viewGroup = this.f6785c) == null) {
                return;
            }
            this.f6787e = z10;
            E.b(viewGroup, z10);
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
            d(true);
            if (this.f6788f) {
                return;
            }
            F.f(this.f6783a, 0);
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            abstractC1388m.b0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6788f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                F.f(this.f6783a, 0);
                ViewGroup viewGroup = this.f6785c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    public class b extends AnimatorListenerAdapter implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f6789a;

        /* renamed from: b, reason: collision with root package name */
        public final View f6790b;

        /* renamed from: c, reason: collision with root package name */
        public final View f6791c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6792d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f6789a = viewGroup;
            this.f6790b = view;
            this.f6791c = view2;
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            if (this.f6792d) {
                c();
            }
        }

        public final void c() {
            this.f6791c.setTag(AbstractC1383h.f6853a, null);
            this.f6789a.getOverlay().remove(this.f6790b);
            this.f6792d = false;
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            abstractC1388m.b0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6789a.getOverlay().remove(this.f6790b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f6790b.getParent() == null) {
                AbstractC2082d0.e(this.f6789a, this.f6790b);
            } else {
                S.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f6791c.setTag(AbstractC1383h.f6853a, this.f6790b);
                AbstractC2082d0.e(this.f6789a, this.f6790b);
                this.f6792d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6794a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6795b;

        /* renamed from: c, reason: collision with root package name */
        public int f6796c;

        /* renamed from: d, reason: collision with root package name */
        public int f6797d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f6798e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f6799f;
    }

    private void p0(A a10) {
        a10.f6756a.put("android:visibility:visibility", Integer.valueOf(a10.f6757b.getVisibility()));
        a10.f6756a.put("android:visibility:parent", a10.f6757b.getParent());
        int[] iArr = new int[2];
        a10.f6757b.getLocationOnScreen(iArr);
        a10.f6756a.put("android:visibility:screenLocation", iArr);
    }

    @Override // L2.AbstractC1388m
    public String[] K() {
        return sTransitionProperties;
    }

    @Override // L2.AbstractC1388m
    public boolean O(A a10, A a11) {
        if (a10 == null && a11 == null) {
            return false;
        }
        if (a10 != null && a11 != null && a11.f6756a.containsKey("android:visibility:visibility") != a10.f6756a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c q02 = q0(a10, a11);
        return q02.f6794a && (q02.f6796c == 0 || q02.f6797d == 0);
    }

    @Override // L2.AbstractC1388m
    public void h(A a10) {
        p0(a10);
    }

    @Override // L2.AbstractC1388m
    public void k(A a10) {
        p0(a10);
    }

    @Override // L2.AbstractC1388m
    public Animator o(ViewGroup viewGroup, A a10, A a11) {
        c q02 = q0(a10, a11);
        if (!q02.f6794a) {
            return null;
        }
        if (q02.f6798e == null && q02.f6799f == null) {
            return null;
        }
        return q02.f6795b ? r0(viewGroup, a10, q02.f6796c, a11, q02.f6797d) : t0(viewGroup, a10, q02.f6796c, a11, q02.f6797d);
    }

    public final c q0(A a10, A a11) {
        c cVar = new c();
        cVar.f6794a = false;
        cVar.f6795b = false;
        if (a10 == null || !a10.f6756a.containsKey("android:visibility:visibility")) {
            cVar.f6796c = -1;
            cVar.f6798e = null;
        } else {
            cVar.f6796c = ((Integer) a10.f6756a.get("android:visibility:visibility")).intValue();
            cVar.f6798e = (ViewGroup) a10.f6756a.get("android:visibility:parent");
        }
        if (a11 == null || !a11.f6756a.containsKey("android:visibility:visibility")) {
            cVar.f6797d = -1;
            cVar.f6799f = null;
        } else {
            cVar.f6797d = ((Integer) a11.f6756a.get("android:visibility:visibility")).intValue();
            cVar.f6799f = (ViewGroup) a11.f6756a.get("android:visibility:parent");
        }
        if (a10 != null && a11 != null) {
            int i10 = cVar.f6796c;
            int i11 = cVar.f6797d;
            if (i10 != i11 || cVar.f6798e != cVar.f6799f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f6795b = false;
                        cVar.f6794a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f6795b = true;
                        cVar.f6794a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f6799f == null) {
                        cVar.f6795b = false;
                        cVar.f6794a = true;
                        return cVar;
                    }
                    if (cVar.f6798e == null) {
                        cVar.f6795b = true;
                        cVar.f6794a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (a10 == null && cVar.f6797d == 0) {
                cVar.f6795b = true;
                cVar.f6794a = true;
                return cVar;
            }
            if (a11 == null && cVar.f6796c == 0) {
                cVar.f6795b = false;
                cVar.f6794a = true;
            }
        }
        return cVar;
    }

    public Animator r0(ViewGroup viewGroup, A a10, int i10, A a11, int i11) {
        if ((this.f6782L & 1) != 1 || a11 == null) {
            return null;
        }
        if (a10 == null) {
            View view = (View) a11.f6757b.getParent();
            if (q0(y(view, false), L(view, false)).f6794a) {
                return null;
            }
        }
        return s0(viewGroup, a11.f6757b, a10, a11);
    }

    public abstract Animator s0(ViewGroup viewGroup, View view, A a10, A a11);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r9.f6902u != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator t0(ViewGroup viewGroup, A a10, int i10, A a11, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.f6782L & 2) != 2 || a10 == null) {
            return null;
        }
        View view3 = a10.f6757b;
        View view4 = a11 != null ? a11.f6757b : null;
        View view5 = (View) view3.getTag(AbstractC1383h.f6853a);
        if (view5 != null) {
            view2 = null;
            z11 = true;
        } else if (view4 == null || view4.getParent() == null) {
            if (view4 != null) {
                view = null;
                z10 = false;
                if (z10) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view6 = (View) view3.getParent();
                            if (q0(L(view6, true), y(view6, true)).f6794a) {
                                int id2 = view6.getId();
                                if (view6.getParent() == null) {
                                    if (id2 != -1) {
                                        if (viewGroup.findViewById(id2) != null) {
                                        }
                                    }
                                }
                            } else {
                                view4 = z.a(viewGroup, view3, view6);
                            }
                        }
                    }
                    view2 = view;
                    z11 = false;
                    view5 = view3;
                }
                View view7 = view;
                view5 = view4;
                view2 = view7;
                z11 = false;
            }
            view4 = null;
            view = null;
            z10 = true;
            if (z10) {
            }
            View view72 = view;
            view5 = view4;
            view2 = view72;
            z11 = false;
        } else {
            if (i11 == 4 || view3 == view4) {
                view = view4;
                z10 = false;
                view4 = null;
                if (z10) {
                }
                View view722 = view;
                view5 = view4;
                view2 = view722;
                z11 = false;
            }
            view4 = null;
            view = null;
            z10 = true;
            if (z10) {
            }
            View view7222 = view;
            view5 = view4;
            view2 = view7222;
            z11 = false;
        }
        if (view5 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            F.f(view2, 0);
            Animator u02 = u0(viewGroup, view2, a10, a11);
            if (u02 == null) {
                F.f(view2, visibility);
                return u02;
            }
            a aVar = new a(view2, i11, true);
            u02.addListener(aVar);
            C().c(aVar);
            return u02;
        }
        if (!z11) {
            int[] iArr = (int[]) a10.f6756a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i12 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i13 - iArr2[1]) - view5.getTop());
            AbstractC2082d0.e(viewGroup, view5);
        }
        Animator u03 = u0(viewGroup, view5, a10, a11);
        if (!z11) {
            if (u03 == null) {
                viewGroup.getOverlay().remove(view5);
                return u03;
            }
            view3.setTag(AbstractC1383h.f6853a, view5);
            b bVar = new b(viewGroup, view5, view3);
            u03.addListener(bVar);
            u03.addPauseListener(bVar);
            C().c(bVar);
        }
        return u03;
    }

    public abstract Animator u0(ViewGroup viewGroup, View view, A a10, A a11);

    public void v0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f6782L = i10;
    }
}
