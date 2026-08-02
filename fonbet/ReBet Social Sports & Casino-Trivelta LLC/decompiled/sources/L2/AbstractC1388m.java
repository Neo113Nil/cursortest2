package L2;

import L2.AbstractC1388m;
import O0.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.AbstractC2082d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import x0.InterfaceC6772a;
import z.C6900a;
import z.C6907h;

/* renamed from: L2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1388m implements Cloneable {

    /* renamed from: C, reason: collision with root package name */
    public w f6875C;

    /* renamed from: D, reason: collision with root package name */
    public f f6876D;

    /* renamed from: E, reason: collision with root package name */
    public C6900a f6877E;

    /* renamed from: G, reason: collision with root package name */
    public long f6879G;

    /* renamed from: H, reason: collision with root package name */
    public h f6880H;

    /* renamed from: I, reason: collision with root package name */
    public long f6881I;
    private i[] mListenersCache;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f6900s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f6901t;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};

    /* renamed from: J, reason: collision with root package name */
    public static final AbstractC1382g f6871J = new a();

    /* renamed from: K, reason: collision with root package name */
    public static ThreadLocal f6872K = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public String f6882a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f6883b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f6884c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f6885d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6886e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f6887f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f6888g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f6889h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f6890i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6891j = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f6892k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f6893l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f6894m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f6895n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f6896o = null;

    /* renamed from: p, reason: collision with root package name */
    public B f6897p = new B();

    /* renamed from: q, reason: collision with root package name */
    public B f6898q = new B();

    /* renamed from: r, reason: collision with root package name */
    public y f6899r = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6902u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f6903v = new ArrayList();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;

    /* renamed from: w, reason: collision with root package name */
    public int f6904w = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6905x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6906y = false;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC1388m f6907z = null;

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f6873A = null;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f6874B = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    public AbstractC1382g f6878F = f6871J;

    /* renamed from: L2.m$a */
    public class a extends AbstractC1382g {
        @Override // L2.AbstractC1382g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: L2.m$b */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C6900a f6908a;

        public b(C6900a c6900a) {
            this.f6908a = c6900a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6908a.remove(animator);
            AbstractC1388m.this.f6903v.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1388m.this.f6903v.add(animator);
        }
    }

    /* renamed from: L2.m$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1388m.this.r();
            animator.removeListener(this);
        }
    }

    /* renamed from: L2.m$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f6911a;

        /* renamed from: b, reason: collision with root package name */
        public String f6912b;

        /* renamed from: c, reason: collision with root package name */
        public A f6913c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f6914d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC1388m f6915e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f6916f;

        public d(View view, String str, AbstractC1388m abstractC1388m, WindowId windowId, A a10, Animator animator) {
            this.f6911a = view;
            this.f6912b = str;
            this.f6913c = a10;
            this.f6914d = windowId;
            this.f6915e = abstractC1388m;
            this.f6916f = animator;
        }
    }

    /* renamed from: L2.m$e */
    public static class e {
        public static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: L2.m$f */
    public static abstract class f {
        public abstract Rect a(AbstractC1388m abstractC1388m);
    }

    /* renamed from: L2.m$g */
    public static class g {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* renamed from: L2.m$h */
    public class h extends u implements x, h.r {

        /* renamed from: d, reason: collision with root package name */
        public boolean f6920d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6921e;

        /* renamed from: g, reason: collision with root package name */
        public O0.l f6923g;

        /* renamed from: i, reason: collision with root package name */
        public Runnable f6925i;

        /* renamed from: a, reason: collision with root package name */
        public long f6917a = -1;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f6918b = null;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f6919c = null;

        /* renamed from: f, reason: collision with root package name */
        public int f6922f = 0;
        private InterfaceC6772a[] mListenerCache = null;

        /* renamed from: h, reason: collision with root package name */
        public final D f6924h = new D();

        public h() {
        }

        public static /* synthetic */ void n(h hVar, O0.h hVar2, boolean z10, float f10, float f11) {
            if (z10) {
                hVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                AbstractC1388m.this.X(j.f6928b, false);
                return;
            }
            long h10 = hVar.h();
            AbstractC1388m t02 = ((y) AbstractC1388m.this).t0(0);
            AbstractC1388m abstractC1388m = t02.f6907z;
            t02.f6907z = null;
            AbstractC1388m.this.g0(-1L, hVar.f6917a);
            AbstractC1388m.this.g0(h10, -1L);
            hVar.f6917a = h10;
            Runnable runnable = hVar.f6925i;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC1388m.this.f6874B.clear();
            if (abstractC1388m != null) {
                abstractC1388m.X(j.f6928b, true);
            }
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            this.f6921e = true;
        }

        @Override // L2.x
        public boolean c() {
            return this.f6920d;
        }

        @Override // L2.x
        public void d() {
            if (this.f6920d) {
                p();
                this.f6923g.t(h() + 1);
            } else {
                this.f6922f = 1;
                this.f6925i = null;
            }
        }

        @Override // L2.x
        public long h() {
            return AbstractC1388m.this.J();
        }

        @Override // L2.x
        public void i(long j10) {
            if (this.f6923g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f6917a || !c()) {
                return;
            }
            if (!this.f6921e) {
                if (j10 != 0 || this.f6917a <= 0) {
                    long h10 = h();
                    if (j10 == h10 && this.f6917a < h10) {
                        j10 = 1 + h10;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f6917a;
                if (j10 != j11) {
                    AbstractC1388m.this.g0(j10, j11);
                    this.f6917a = j10;
                }
            }
            o();
            this.f6924h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // O0.h.r
        public void j(O0.h hVar, float f10, float f11) {
            long max = Math.max(-1L, Math.min(h() + 1, Math.round(f10)));
            AbstractC1388m.this.g0(max, this.f6917a);
            this.f6917a = max;
            o();
        }

        @Override // L2.x
        public void k(Runnable runnable) {
            this.f6925i = runnable;
            if (!this.f6920d) {
                this.f6922f = 2;
            } else {
                p();
                this.f6923g.t(0.0f);
            }
        }

        public final void o() {
            ArrayList arrayList = this.f6919c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f6919c.size();
            if (this.mListenerCache == null) {
                this.mListenerCache = new InterfaceC6772a[size];
            }
            InterfaceC6772a[] interfaceC6772aArr = (InterfaceC6772a[]) this.f6919c.toArray(this.mListenerCache);
            this.mListenerCache = null;
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC6772aArr[i10].accept(this);
                interfaceC6772aArr[i10] = null;
            }
            this.mListenerCache = interfaceC6772aArr;
        }

        public final void p() {
            if (this.f6923g != null) {
                return;
            }
            this.f6924h.a(AnimationUtils.currentAnimationTimeMillis(), this.f6917a);
            this.f6923g = new O0.l(new O0.j());
            O0.m mVar = new O0.m();
            mVar.f(1.0f);
            mVar.h(200.0f);
            this.f6923g.x(mVar);
            this.f6923g.n(this.f6917a);
            this.f6923g.c(this);
            this.f6923g.o(this.f6924h.b());
            this.f6923g.j(h() + 1);
            this.f6923g.k(-1.0f);
            this.f6923g.l(4.0f);
            this.f6923g.b(new h.q() { // from class: L2.o
                @Override // O0.h.q
                public final void a(O0.h hVar, boolean z10, float f10, float f11) {
                    AbstractC1388m.h.n(AbstractC1388m.h.this, hVar, z10, f10, f11);
                }
            });
        }

        public void q() {
            long j10 = h() == 0 ? 1L : 0L;
            AbstractC1388m.this.g0(j10, this.f6917a);
            this.f6917a = j10;
        }

        public void r() {
            this.f6920d = true;
            ArrayList arrayList = this.f6918b;
            if (arrayList != null) {
                this.f6918b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((InterfaceC6772a) arrayList.get(i10)).accept(this);
                }
            }
            o();
            int i11 = this.f6922f;
            if (i11 == 1) {
                this.f6922f = 0;
                d();
            } else if (i11 == 2) {
                this.f6922f = 0;
                k(this.f6925i);
            }
        }
    }

    /* renamed from: L2.m$i */
    public interface i {
        void a(AbstractC1388m abstractC1388m);

        void b(AbstractC1388m abstractC1388m);

        default void e(AbstractC1388m abstractC1388m, boolean z10) {
            l(abstractC1388m);
        }

        void f(AbstractC1388m abstractC1388m);

        void g(AbstractC1388m abstractC1388m);

        void l(AbstractC1388m abstractC1388m);

        default void m(AbstractC1388m abstractC1388m, boolean z10) {
            g(abstractC1388m);
        }
    }

    /* renamed from: L2.m$j */
    public interface j {

        /* renamed from: a, reason: collision with root package name */
        public static final j f6927a = new j() { // from class: L2.p
            @Override // L2.AbstractC1388m.j
            public final void d(AbstractC1388m.i iVar, AbstractC1388m abstractC1388m, boolean z10) {
                iVar.e(abstractC1388m, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final j f6928b = new j() { // from class: L2.q
            @Override // L2.AbstractC1388m.j
            public final void d(AbstractC1388m.i iVar, AbstractC1388m abstractC1388m, boolean z10) {
                iVar.m(abstractC1388m, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final j f6929c = new j() { // from class: L2.r
            @Override // L2.AbstractC1388m.j
            public final void d(AbstractC1388m.i iVar, AbstractC1388m abstractC1388m, boolean z10) {
                iVar.b(abstractC1388m);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final j f6930d = new j() { // from class: L2.s
            @Override // L2.AbstractC1388m.j
            public final void d(AbstractC1388m.i iVar, AbstractC1388m abstractC1388m, boolean z10) {
                iVar.a(abstractC1388m);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final j f6931e = new j() { // from class: L2.t
            @Override // L2.AbstractC1388m.j
            public final void d(AbstractC1388m.i iVar, AbstractC1388m abstractC1388m, boolean z10) {
                iVar.f(abstractC1388m);
            }
        };

        void d(i iVar, AbstractC1388m abstractC1388m, boolean z10);
    }

    public static C6900a D() {
        C6900a c6900a = (C6900a) f6872K.get();
        if (c6900a != null) {
            return c6900a;
        }
        C6900a c6900a2 = new C6900a();
        f6872K.set(c6900a2);
        return c6900a2;
    }

    public static boolean Q(A a10, A a11, String str) {
        Object obj = a10.f6756a.get(str);
        Object obj2 = a11.f6756a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void f(B b10, View view, A a10) {
        b10.f6759a.put(view, a10);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (b10.f6760b.indexOfKey(id2) >= 0) {
                b10.f6760b.put(id2, null);
            } else {
                b10.f6760b.put(id2, view);
            }
        }
        String I10 = AbstractC2082d0.I(view);
        if (I10 != null) {
            if (b10.f6762d.containsKey(I10)) {
                b10.f6762d.put(I10, null);
            } else {
                b10.f6762d.put(I10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (b10.f6761c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    b10.f6761c.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) b10.f6761c.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    b10.f6761c.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public AbstractC1382g A() {
        return this.f6878F;
    }

    public w B() {
        return this.f6875C;
    }

    public final AbstractC1388m C() {
        y yVar = this.f6899r;
        return yVar != null ? yVar.C() : this;
    }

    public long E() {
        return this.f6883b;
    }

    public List F() {
        return this.f6886e;
    }

    public List G() {
        return this.f6888g;
    }

    public List H() {
        return this.f6889h;
    }

    public List I() {
        return this.f6887f;
    }

    public final long J() {
        return this.f6879G;
    }

    public String[] K() {
        return null;
    }

    public A L(View view, boolean z10) {
        y yVar = this.f6899r;
        if (yVar != null) {
            return yVar.L(view, z10);
        }
        return (A) (z10 ? this.f6897p : this.f6898q).f6759a.get(view);
    }

    public boolean M() {
        return !this.f6903v.isEmpty();
    }

    public boolean N() {
        return false;
    }

    public boolean O(A a10, A a11) {
        if (a10 != null && a11 != null) {
            String[] K10 = K();
            if (K10 != null) {
                for (String str : K10) {
                    if (Q(a10, a11, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = a10.f6756a.keySet().iterator();
                while (it.hasNext()) {
                    if (Q(a10, a11, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean P(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f6890i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f6891j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f6892k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f6892k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6893l != null && AbstractC2082d0.I(view) != null && this.f6893l.contains(AbstractC2082d0.I(view))) {
            return false;
        }
        if ((this.f6886e.size() == 0 && this.f6887f.size() == 0 && (((arrayList = this.f6889h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6888g) == null || arrayList2.isEmpty()))) || this.f6886e.contains(Integer.valueOf(id2)) || this.f6887f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f6888g;
        if (arrayList6 != null && arrayList6.contains(AbstractC2082d0.I(view))) {
            return true;
        }
        if (this.f6889h != null) {
            for (int i11 = 0; i11 < this.f6889h.size(); i11++) {
                if (((Class) this.f6889h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void R(C6900a c6900a, C6900a c6900a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && P(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && P(view)) {
                A a10 = (A) c6900a.get(view2);
                A a11 = (A) c6900a2.get(view);
                if (a10 != null && a11 != null) {
                    this.f6900s.add(a10);
                    this.f6901t.add(a11);
                    c6900a.remove(view2);
                    c6900a2.remove(view);
                }
            }
        }
    }

    public final void S(C6900a c6900a, C6900a c6900a2) {
        A a10;
        for (int size = c6900a.size() - 1; size >= 0; size--) {
            View view = (View) c6900a.f(size);
            if (view != null && P(view) && (a10 = (A) c6900a2.remove(view)) != null && P(a10.f6757b)) {
                this.f6900s.add((A) c6900a.h(size));
                this.f6901t.add(a10);
            }
        }
    }

    public final void T(C6900a c6900a, C6900a c6900a2, C6907h c6907h, C6907h c6907h2) {
        View view;
        int j10 = c6907h.j();
        for (int i10 = 0; i10 < j10; i10++) {
            View view2 = (View) c6907h.k(i10);
            if (view2 != null && P(view2) && (view = (View) c6907h2.d(c6907h.f(i10))) != null && P(view)) {
                A a10 = (A) c6900a.get(view2);
                A a11 = (A) c6900a2.get(view);
                if (a10 != null && a11 != null) {
                    this.f6900s.add(a10);
                    this.f6901t.add(a11);
                    c6900a.remove(view2);
                    c6900a2.remove(view);
                }
            }
        }
    }

    public final void U(C6900a c6900a, C6900a c6900a2, C6900a c6900a3, C6900a c6900a4) {
        View view;
        int size = c6900a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c6900a3.j(i10);
            if (view2 != null && P(view2) && (view = (View) c6900a4.get((String) c6900a3.f(i10))) != null && P(view)) {
                A a10 = (A) c6900a.get(view2);
                A a11 = (A) c6900a2.get(view);
                if (a10 != null && a11 != null) {
                    this.f6900s.add(a10);
                    this.f6901t.add(a11);
                    c6900a.remove(view2);
                    c6900a2.remove(view);
                }
            }
        }
    }

    public final void V(B b10, B b11) {
        C6900a c6900a = new C6900a(b10.f6759a);
        C6900a c6900a2 = new C6900a(b11.f6759a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i10 >= iArr.length) {
                e(c6900a, c6900a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                S(c6900a, c6900a2);
            } else if (i11 == 2) {
                U(c6900a, c6900a2, b10.f6762d, b11.f6762d);
            } else if (i11 == 3) {
                R(c6900a, c6900a2, b10.f6760b, b11.f6760b);
            } else if (i11 == 4) {
                T(c6900a, c6900a2, b10.f6761c, b11.f6761c);
            }
            i10++;
        }
    }

    public final void W(AbstractC1388m abstractC1388m, j jVar, boolean z10) {
        AbstractC1388m abstractC1388m2 = this.f6907z;
        if (abstractC1388m2 != null) {
            abstractC1388m2.W(abstractC1388m, jVar, z10);
        }
        ArrayList arrayList = this.f6873A;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f6873A.size();
        i[] iVarArr = this.mListenersCache;
        if (iVarArr == null) {
            iVarArr = new i[size];
        }
        this.mListenersCache = null;
        i[] iVarArr2 = (i[]) this.f6873A.toArray(iVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            jVar.d(iVarArr2[i10], abstractC1388m, z10);
            iVarArr2[i10] = null;
        }
        this.mListenersCache = iVarArr2;
    }

    public void X(j jVar, boolean z10) {
        W(this, jVar, z10);
    }

    public void Y(View view) {
        if (this.f6906y) {
            return;
        }
        int size = this.f6903v.size();
        Animator[] animatorArr = (Animator[]) this.f6903v.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        X(j.f6930d, false);
        this.f6905x = true;
    }

    public void Z(ViewGroup viewGroup) {
        d dVar;
        this.f6900s = new ArrayList();
        this.f6901t = new ArrayList();
        V(this.f6897p, this.f6898q);
        C6900a D10 = D();
        int size = D10.size();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) D10.f(i10);
            if (animator != null && (dVar = (d) D10.get(animator)) != null && dVar.f6911a != null && Objects.equals(windowId, dVar.f6914d)) {
                A a10 = dVar.f6913c;
                View view = dVar.f6911a;
                A L10 = L(view, true);
                A y10 = y(view, true);
                if (L10 == null && y10 == null) {
                    y10 = (A) this.f6898q.f6759a.get(view);
                }
                if ((L10 != null || y10 != null) && dVar.f6915e.O(a10, y10)) {
                    AbstractC1388m abstractC1388m = dVar.f6915e;
                    if (abstractC1388m.C().f6880H != null) {
                        animator.cancel();
                        abstractC1388m.f6903v.remove(animator);
                        D10.h(i10);
                        if (abstractC1388m.f6903v.size() == 0) {
                            arrayList.add(abstractC1388m);
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        D10.h(i10);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC1388m abstractC1388m2 = (AbstractC1388m) arrayList.get(i11);
            abstractC1388m2.X(j.f6929c, false);
            if (!abstractC1388m2.f6906y) {
                abstractC1388m2.f6906y = true;
                abstractC1388m2.X(j.f6928b, false);
            }
        }
        p(viewGroup, this.f6897p, this.f6898q, this.f6900s, this.f6901t);
        if (this.f6880H == null) {
            f0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            a0();
            this.f6880H.q();
            this.f6880H.r();
        }
    }

    public void a0() {
        C6900a D10 = D();
        this.f6879G = 0L;
        for (int i10 = 0; i10 < this.f6874B.size(); i10++) {
            Animator animator = (Animator) this.f6874B.get(i10);
            d dVar = (d) D10.get(animator);
            if (animator != null && dVar != null) {
                if (u() >= 0) {
                    dVar.f6916f.setDuration(u());
                }
                if (E() >= 0) {
                    dVar.f6916f.setStartDelay(E() + dVar.f6916f.getStartDelay());
                }
                if (x() != null) {
                    dVar.f6916f.setInterpolator(x());
                }
                this.f6903v.add(animator);
                this.f6879G = Math.max(this.f6879G, g.a(animator));
            }
        }
        this.f6874B.clear();
    }

    public AbstractC1388m b0(i iVar) {
        AbstractC1388m abstractC1388m;
        ArrayList arrayList = this.f6873A;
        if (arrayList != null) {
            if (!arrayList.remove(iVar) && (abstractC1388m = this.f6907z) != null) {
                abstractC1388m.b0(iVar);
            }
            if (this.f6873A.size() == 0) {
                this.f6873A = null;
            }
        }
        return this;
    }

    public AbstractC1388m c(i iVar) {
        if (this.f6873A == null) {
            this.f6873A = new ArrayList();
        }
        this.f6873A.add(iVar);
        return this;
    }

    public AbstractC1388m c0(View view) {
        this.f6887f.remove(view);
        return this;
    }

    public void cancel() {
        int size = this.f6903v.size();
        Animator[] animatorArr = (Animator[]) this.f6903v.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        X(j.f6929c, false);
    }

    public AbstractC1388m d(View view) {
        this.f6887f.add(view);
        return this;
    }

    public void d0(View view) {
        if (this.f6905x) {
            if (!this.f6906y) {
                int size = this.f6903v.size();
                Animator[] animatorArr = (Animator[]) this.f6903v.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                X(j.f6931e, false);
            }
            this.f6905x = false;
        }
    }

    public final void e(C6900a c6900a, C6900a c6900a2) {
        for (int i10 = 0; i10 < c6900a.size(); i10++) {
            A a10 = (A) c6900a.j(i10);
            if (P(a10.f6757b)) {
                this.f6900s.add(a10);
                this.f6901t.add(null);
            }
        }
        for (int i11 = 0; i11 < c6900a2.size(); i11++) {
            A a11 = (A) c6900a2.j(i11);
            if (P(a11.f6757b)) {
                this.f6901t.add(a11);
                this.f6900s.add(null);
            }
        }
    }

    public final void e0(Animator animator, C6900a c6900a) {
        if (animator != null) {
            animator.addListener(new b(c6900a));
            g(animator);
        }
    }

    public void f0() {
        n0();
        C6900a D10 = D();
        Iterator it = this.f6874B.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (D10.containsKey(animator)) {
                n0();
                e0(animator, D10);
            }
        }
        this.f6874B.clear();
        r();
    }

    public void g(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void g0(long j10, long j11) {
        long J10 = J();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > J10 && j10 <= J10)) {
            this.f6906y = false;
            X(j.f6927a, z10);
        }
        int size = this.f6903v.size();
        Animator[] animatorArr = (Animator[]) this.f6903v.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            g.b(animator, Math.min(Math.max(0L, j10), g.a(animator)));
            i10++;
            J10 = J10;
        }
        long j12 = J10;
        this.mAnimatorCache = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f6906y = true;
        }
        X(j.f6928b, z10);
    }

    public abstract void h(A a10);

    public AbstractC1388m h0(long j10) {
        this.f6884c = j10;
        return this;
    }

    public final void i(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f6890i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f6891j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f6892k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f6892k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    A a10 = new A(view);
                    if (z10) {
                        k(a10);
                    } else {
                        h(a10);
                    }
                    a10.f6758c.add(this);
                    j(a10);
                    if (z10) {
                        f(this.f6897p, view, a10);
                    } else {
                        f(this.f6898q, view, a10);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f6894m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f6895n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f6896o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f6896o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                i(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void i0(f fVar) {
        this.f6876D = fVar;
    }

    public void j(A a10) {
        String[] b10;
        if (this.f6875C == null || a10.f6756a.isEmpty() || (b10 = this.f6875C.b()) == null) {
            return;
        }
        for (String str : b10) {
            if (!a10.f6756a.containsKey(str)) {
                this.f6875C.a(a10);
                return;
            }
        }
    }

    public AbstractC1388m j0(TimeInterpolator timeInterpolator) {
        this.f6885d = timeInterpolator;
        return this;
    }

    public abstract void k(A a10);

    public void k0(AbstractC1382g abstractC1382g) {
        if (abstractC1382g == null) {
            this.f6878F = f6871J;
        } else {
            this.f6878F = abstractC1382g;
        }
    }

    public void l(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C6900a c6900a;
        m(z10);
        if ((this.f6886e.size() > 0 || this.f6887f.size() > 0) && (((arrayList = this.f6888g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6889h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f6886e.size(); i10++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f6886e.get(i10)).intValue());
                if (findViewById != null) {
                    A a10 = new A(findViewById);
                    if (z10) {
                        k(a10);
                    } else {
                        h(a10);
                    }
                    a10.f6758c.add(this);
                    j(a10);
                    if (z10) {
                        f(this.f6897p, findViewById, a10);
                    } else {
                        f(this.f6898q, findViewById, a10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f6887f.size(); i11++) {
                View view = (View) this.f6887f.get(i11);
                A a11 = new A(view);
                if (z10) {
                    k(a11);
                } else {
                    h(a11);
                }
                a11.f6758c.add(this);
                j(a11);
                if (z10) {
                    f(this.f6897p, view, a11);
                } else {
                    f(this.f6898q, view, a11);
                }
            }
        } else {
            i(viewGroup, z10);
        }
        if (z10 || (c6900a = this.f6877E) == null) {
            return;
        }
        int size = c6900a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f6897p.f6762d.remove((String) this.f6877E.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f6897p.f6762d.put((String) this.f6877E.j(i13), view2);
            }
        }
    }

    public void l0(w wVar) {
        this.f6875C = wVar;
    }

    public void m(boolean z10) {
        if (z10) {
            this.f6897p.f6759a.clear();
            this.f6897p.f6760b.clear();
            this.f6897p.f6761c.a();
        } else {
            this.f6898q.f6759a.clear();
            this.f6898q.f6760b.clear();
            this.f6898q.f6761c.a();
        }
    }

    public AbstractC1388m m0(long j10) {
        this.f6883b = j10;
        return this;
    }

    @Override // 
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC1388m clone() {
        try {
            AbstractC1388m abstractC1388m = (AbstractC1388m) super.clone();
            abstractC1388m.f6874B = new ArrayList();
            abstractC1388m.f6897p = new B();
            abstractC1388m.f6898q = new B();
            abstractC1388m.f6900s = null;
            abstractC1388m.f6901t = null;
            abstractC1388m.f6880H = null;
            abstractC1388m.f6907z = this;
            abstractC1388m.f6873A = null;
            return abstractC1388m;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void n0() {
        if (this.f6904w == 0) {
            X(j.f6927a, false);
            this.f6906y = false;
        }
        this.f6904w++;
    }

    public Animator o(ViewGroup viewGroup, A a10, A a11) {
        return null;
    }

    public String o0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f6884c != -1) {
            sb2.append("dur(");
            sb2.append(this.f6884c);
            sb2.append(") ");
        }
        if (this.f6883b != -1) {
            sb2.append("dly(");
            sb2.append(this.f6883b);
            sb2.append(") ");
        }
        if (this.f6885d != null) {
            sb2.append("interp(");
            sb2.append(this.f6885d);
            sb2.append(") ");
        }
        if (this.f6886e.size() > 0 || this.f6887f.size() > 0) {
            sb2.append("tgts(");
            if (this.f6886e.size() > 0) {
                for (int i10 = 0; i10 < this.f6886e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f6886e.get(i10));
                }
            }
            if (this.f6887f.size() > 0) {
                for (int i11 = 0; i11 < this.f6887f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f6887f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void p(ViewGroup viewGroup, B b10, B b11, ArrayList arrayList, ArrayList arrayList2) {
        Animator o10;
        Animator animator;
        int i10;
        boolean z10;
        int i11;
        View view;
        A a10;
        Animator animator2;
        View view2;
        Animator animator3;
        C6900a D10 = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = C().f6880H != null;
        long j10 = LongCompanionObject.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            A a11 = (A) arrayList.get(i12);
            A a12 = (A) arrayList2.get(i12);
            if (a11 != null && !a11.f6758c.contains(this)) {
                a11 = null;
            }
            if (a12 != null && !a12.f6758c.contains(this)) {
                a12 = null;
            }
            if (!(a11 == null && a12 == null) && ((a11 == null || a12 == null || O(a11, a12)) && (o10 = o(viewGroup, a11, a12)) != null)) {
                if (a12 != null) {
                    View view3 = a12.f6757b;
                    String[] K10 = K();
                    if (K10 != null && K10.length > 0) {
                        a10 = new A(view3);
                        i10 = size;
                        z10 = z11;
                        A a13 = (A) b11.f6759a.get(view3);
                        i11 = i12;
                        if (a13 != null) {
                            int i13 = 0;
                            while (i13 < K10.length) {
                                Map map = a10.f6756a;
                                int i14 = i13;
                                String str = K10[i14];
                                map.put(str, a13.f6756a.get(str));
                                i13 = i14 + 1;
                                K10 = K10;
                            }
                        }
                        int size2 = D10.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator3 = o10;
                                break;
                            }
                            d dVar = (d) D10.get((Animator) D10.f(i15));
                            if (dVar.f6913c != null && dVar.f6911a == view3) {
                                view2 = view3;
                                if (dVar.f6912b.equals(z()) && dVar.f6913c.equals(a10)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator3 = o10;
                        a10 = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = o10;
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = a11.f6757b;
                    a10 = null;
                }
                if (animator != null) {
                    w wVar = this.f6875C;
                    if (wVar != null) {
                        long c10 = wVar.c(viewGroup, this, a11, a12);
                        sparseIntArray.put(this.f6874B.size(), (int) c10);
                        j10 = Math.min(c10, j10);
                    }
                    long j11 = j10;
                    View view4 = view;
                    A a14 = a10;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, z(), this, viewGroup.getWindowId(), a14, animator4);
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    D10.put(animator2, dVar2);
                    this.f6874B.add(animator2);
                    j10 = j11;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = (d) D10.get((Animator) this.f6874B.get(sparseIntArray.keyAt(i16)));
                dVar3.f6916f.setStartDelay((sparseIntArray.valueAt(i16) - j10) + dVar3.f6916f.getStartDelay());
            }
        }
    }

    public x q() {
        h hVar = new h();
        this.f6880H = hVar;
        c(hVar);
        return this.f6880H;
    }

    public void r() {
        int i10 = this.f6904w - 1;
        this.f6904w = i10;
        if (i10 == 0) {
            X(j.f6928b, false);
            for (int i11 = 0; i11 < this.f6897p.f6761c.j(); i11++) {
                View view = (View) this.f6897p.f6761c.k(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f6898q.f6761c.j(); i12++) {
                View view2 = (View) this.f6898q.f6761c.k(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f6906y = true;
        }
    }

    public AbstractC1388m s(Class cls, boolean z10) {
        this.f6892k = t(this.f6892k, cls, z10);
        return this;
    }

    public final ArrayList t(ArrayList arrayList, Class cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public String toString() {
        return o0("");
    }

    public long u() {
        return this.f6884c;
    }

    public Rect v() {
        f fVar = this.f6876D;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public f w() {
        return this.f6876D;
    }

    public TimeInterpolator x() {
        return this.f6885d;
    }

    public A y(View view, boolean z10) {
        y yVar = this.f6899r;
        if (yVar != null) {
            return yVar.y(view, z10);
        }
        ArrayList arrayList = z10 ? this.f6900s : this.f6901t;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            A a10 = (A) arrayList.get(i10);
            if (a10 == null) {
                return null;
            }
            if (a10.f6757b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (A) (z10 ? this.f6901t : this.f6900s).get(i10);
        }
        return null;
    }

    public String z() {
        return this.f6882a;
    }
}
