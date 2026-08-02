package L2;

import L2.AbstractC1388m;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import u0.d;

/* renamed from: L2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1380e extends androidx.fragment.app.Q {

    /* renamed from: L2.e$a */
    public class a extends AbstractC1388m.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f6837a;

        public a(Rect rect) {
            this.f6837a = rect;
        }

        @Override // L2.AbstractC1388m.f
        public Rect a(AbstractC1388m abstractC1388m) {
            return this.f6837a;
        }
    }

    /* renamed from: L2.e$c */
    public class c extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f6842a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f6843b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f6844c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f6845d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f6846e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f6847f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6842a = obj;
            this.f6843b = arrayList;
            this.f6844c = obj2;
            this.f6845d = arrayList2;
            this.f6846e = obj3;
            this.f6847f = arrayList3;
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            abstractC1388m.b0(this);
        }

        @Override // L2.u, L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
            Object obj = this.f6842a;
            if (obj != null) {
                C1380e.this.E(obj, this.f6843b, null);
            }
            Object obj2 = this.f6844c;
            if (obj2 != null) {
                C1380e.this.E(obj2, this.f6845d, null);
            }
            Object obj3 = this.f6846e;
            if (obj3 != null) {
                C1380e.this.E(obj3, this.f6847f, null);
            }
        }
    }

    /* renamed from: L2.e$e, reason: collision with other inner class name */
    public class C0144e extends AbstractC1388m.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f6851a;

        public C0144e(Rect rect) {
            this.f6851a = rect;
        }

        @Override // L2.AbstractC1388m.f
        public Rect a(AbstractC1388m abstractC1388m) {
            Rect rect = this.f6851a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6851a;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, AbstractC1388m abstractC1388m, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC1388m.cancel();
            runnable2.run();
        }
    }

    public static boolean D(AbstractC1388m abstractC1388m) {
        return (androidx.fragment.app.Q.l(abstractC1388m.F()) && androidx.fragment.app.Q.l(abstractC1388m.G()) && androidx.fragment.app.Q.l(abstractC1388m.H())) ? false : true;
    }

    @Override // androidx.fragment.app.Q
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y yVar = (y) obj;
        if (yVar != null) {
            yVar.I().clear();
            yVar.I().addAll(arrayList2);
            E(yVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.Q
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        y yVar = new y();
        yVar.r0((AbstractC1388m) obj);
        return yVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1388m abstractC1388m = (AbstractC1388m) obj;
        int i10 = 0;
        if (abstractC1388m instanceof y) {
            y yVar = (y) abstractC1388m;
            int u02 = yVar.u0();
            while (i10 < u02) {
                E(yVar.t0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(abstractC1388m)) {
            return;
        }
        List I10 = abstractC1388m.I();
        if (I10.size() == arrayList.size() && I10.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC1388m.d((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1388m.c0((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.Q
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1388m) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.Q
    public void b(Object obj, ArrayList arrayList) {
        AbstractC1388m abstractC1388m = (AbstractC1388m) obj;
        if (abstractC1388m == null) {
            return;
        }
        int i10 = 0;
        if (abstractC1388m instanceof y) {
            y yVar = (y) abstractC1388m;
            int u02 = yVar.u0();
            while (i10 < u02) {
                b(yVar.t0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(abstractC1388m) || !androidx.fragment.app.Q.l(abstractC1388m.I())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC1388m.d((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.Q
    public void c(Object obj) {
        ((x) obj).d();
    }

    @Override // androidx.fragment.app.Q
    public void d(Object obj, Runnable runnable) {
        ((x) obj).k(runnable);
    }

    @Override // androidx.fragment.app.Q
    public void e(ViewGroup viewGroup, Object obj) {
        v.a(viewGroup, (AbstractC1388m) obj);
    }

    @Override // androidx.fragment.app.Q
    public boolean g(Object obj) {
        return obj instanceof AbstractC1388m;
    }

    @Override // androidx.fragment.app.Q
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC1388m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.Q
    public Object j(ViewGroup viewGroup, Object obj) {
        return v.b(viewGroup, (AbstractC1388m) obj);
    }

    @Override // androidx.fragment.app.Q
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.Q
    public boolean n(Object obj) {
        boolean N10 = ((AbstractC1388m) obj).N();
        if (!N10) {
            Objects.toString(obj);
        }
        return N10;
    }

    @Override // androidx.fragment.app.Q
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC1388m abstractC1388m = (AbstractC1388m) obj;
        AbstractC1388m abstractC1388m2 = (AbstractC1388m) obj2;
        AbstractC1388m abstractC1388m3 = (AbstractC1388m) obj3;
        if (abstractC1388m != null && abstractC1388m2 != null) {
            abstractC1388m = new y().r0(abstractC1388m).r0(abstractC1388m2).B0(1);
        } else if (abstractC1388m == null) {
            abstractC1388m = abstractC1388m2 != null ? abstractC1388m2 : null;
        }
        if (abstractC1388m3 == null) {
            return abstractC1388m;
        }
        y yVar = new y();
        if (abstractC1388m != null) {
            yVar.r0(abstractC1388m);
        }
        yVar.r0(abstractC1388m3);
        return yVar;
    }

    @Override // androidx.fragment.app.Q
    public Object p(Object obj, Object obj2, Object obj3) {
        y yVar = new y();
        if (obj != null) {
            yVar.r0((AbstractC1388m) obj);
        }
        if (obj2 != null) {
            yVar.r0((AbstractC1388m) obj2);
        }
        if (obj3 != null) {
            yVar.r0((AbstractC1388m) obj3);
        }
        return yVar;
    }

    @Override // androidx.fragment.app.Q
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1388m) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.Q
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC1388m) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.Q
    public void t(Object obj, float f10) {
        x xVar = (x) obj;
        if (xVar.c()) {
            long h10 = (long) (f10 * xVar.h());
            if (h10 == 0) {
                h10 = 1;
            }
            if (h10 == xVar.h()) {
                h10 = xVar.h() - 1;
            }
            xVar.i(h10);
        }
    }

    @Override // androidx.fragment.app.Q
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1388m) obj).i0(new C0144e(rect));
        }
    }

    @Override // androidx.fragment.app.Q
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC1388m) obj).i0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.Q
    public void w(Fragment fragment, Object obj, u0.d dVar, Runnable runnable) {
        x(fragment, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.Q
    public void x(Fragment fragment, Object obj, u0.d dVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC1388m abstractC1388m = (AbstractC1388m) obj;
        dVar.c(new d.a() { // from class: L2.d
            @Override // u0.d.a
            public final void onCancel() {
                C1380e.C(runnable, abstractC1388m, runnable2);
            }
        });
        abstractC1388m.c(new d(runnable2));
    }

    @Override // androidx.fragment.app.Q
    public void z(Object obj, View view, ArrayList arrayList) {
        y yVar = (y) obj;
        List I10 = yVar.I();
        I10.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.Q.f(I10, (View) arrayList.get(i10));
        }
        I10.add(view);
        arrayList.add(view);
        b(yVar, arrayList);
    }

    /* renamed from: L2.e$b */
    public class b implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f6839a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f6840b;

        public b(View view, ArrayList arrayList) {
            this.f6839a = view;
            this.f6840b = arrayList;
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            abstractC1388m.b0(this);
            this.f6839a.setVisibility(8);
            int size = this.f6840b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f6840b.get(i10)).setVisibility(0);
            }
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
            abstractC1388m.b0(this);
            abstractC1388m.c(this);
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
        }
    }

    /* renamed from: L2.e$d */
    public class d implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f6849a;

        public d(Runnable runnable) {
            this.f6849a = runnable;
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            this.f6849a.run();
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }
    }
}
