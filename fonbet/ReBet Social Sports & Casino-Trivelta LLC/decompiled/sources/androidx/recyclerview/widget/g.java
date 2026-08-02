package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g extends w {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f23018s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f23019h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f23020i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f23021j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f23022k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f23023l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f23024m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f23025n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f23026o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f23027p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f23028q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f23029r = new ArrayList();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23030a;

        public a(ArrayList arrayList) {
            this.f23030a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f23030a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.U(jVar.f23064a, jVar.f23065b, jVar.f23066c, jVar.f23067d, jVar.f23068e);
            }
            this.f23030a.clear();
            g.this.f23024m.remove(this.f23030a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23032a;

        public b(ArrayList arrayList) {
            this.f23032a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f23032a.iterator();
            while (it.hasNext()) {
                g.this.T((i) it.next());
            }
            this.f23032a.clear();
            g.this.f23025n.remove(this.f23032a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f23034a;

        public c(ArrayList arrayList) {
            this.f23034a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f23034a.iterator();
            while (it.hasNext()) {
                g.this.S((RecyclerView.F) it.next());
            }
            this.f23034a.clear();
            g.this.f23023l.remove(this.f23034a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.F f23036a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f23037b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f23038c;

        public d(RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f23036a = f10;
            this.f23037b = viewPropertyAnimator;
            this.f23038c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23037b.setListener(null);
            this.f23038c.setAlpha(1.0f);
            g.this.H(this.f23036a);
            g.this.f23028q.remove(this.f23036a);
            g.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.I(this.f23036a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.F f23040a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f23041b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f23042c;

        public e(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f23040a = f10;
            this.f23041b = view;
            this.f23042c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f23041b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23042c.setListener(null);
            g.this.B(this.f23040a);
            g.this.f23026o.remove(this.f23040a);
            g.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.C(this.f23040a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.F f23044a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23045b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f23046c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f23047d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f23048e;

        public f(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f23044a = f10;
            this.f23045b = i10;
            this.f23046c = view;
            this.f23047d = i11;
            this.f23048e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f23045b != 0) {
                this.f23046c.setTranslationX(0.0f);
            }
            if (this.f23047d != 0) {
                this.f23046c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23048e.setListener(null);
            g.this.F(this.f23044a);
            g.this.f23027p.remove(this.f23044a);
            g.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.G(this.f23044a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    public class C0398g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f23050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f23051b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f23052c;

        public C0398g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f23050a = iVar;
            this.f23051b = viewPropertyAnimator;
            this.f23052c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23051b.setListener(null);
            this.f23052c.setAlpha(1.0f);
            this.f23052c.setTranslationX(0.0f);
            this.f23052c.setTranslationY(0.0f);
            g.this.D(this.f23050a.f23058a, true);
            g.this.f23029r.remove(this.f23050a.f23058a);
            g.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.E(this.f23050a.f23058a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f23054a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f23055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f23056c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f23054a = iVar;
            this.f23055b = viewPropertyAnimator;
            this.f23056c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f23055b.setListener(null);
            this.f23056c.setAlpha(1.0f);
            this.f23056c.setTranslationX(0.0f);
            this.f23056c.setTranslationY(0.0f);
            g.this.D(this.f23054a.f23059b, false);
            g.this.f23029r.remove(this.f23054a.f23059b);
            g.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.E(this.f23054a.f23059b, false);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f23064a;

        /* renamed from: b, reason: collision with root package name */
        public int f23065b;

        /* renamed from: c, reason: collision with root package name */
        public int f23066c;

        /* renamed from: d, reason: collision with root package name */
        public int f23067d;

        /* renamed from: e, reason: collision with root package name */
        public int f23068e;

        public j(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f23064a = f10;
            this.f23065b = i10;
            this.f23066c = i11;
            this.f23067d = i12;
            this.f23068e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public boolean A(RecyclerView.F f10) {
        b0(f10);
        this.f23019h.add(f10);
        return true;
    }

    public void S(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f23026o.add(f10);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(f10, view, animate)).start();
    }

    public void T(i iVar) {
        RecyclerView.F f10 = iVar.f23058a;
        View view = f10 == null ? null : f10.itemView;
        RecyclerView.F f11 = iVar.f23059b;
        View view2 = f11 != null ? f11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f23029r.add(iVar.f23058a);
            duration.translationX(iVar.f23062e - iVar.f23060c);
            duration.translationY(iVar.f23063f - iVar.f23061d);
            duration.alpha(0.0f).setListener(new C0398g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f23029r.add(iVar.f23059b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void U(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f23027p.add(f10);
        animate.setDuration(n()).setListener(new f(f10, i14, view, i15, animate)).start();
    }

    public final void V(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f23028q.add(f10);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f10, animate, view)).start();
    }

    public void W(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.F) list.get(size)).itemView.animate().cancel();
        }
    }

    public void X() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Y(List list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (a0(iVar, f10) && iVar.f23058a == null && iVar.f23059b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void Z(i iVar) {
        RecyclerView.F f10 = iVar.f23058a;
        if (f10 != null) {
            a0(iVar, f10);
        }
        RecyclerView.F f11 = iVar.f23059b;
        if (f11 != null) {
            a0(iVar, f11);
        }
    }

    public final boolean a0(i iVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (iVar.f23059b == f10) {
            iVar.f23059b = null;
        } else {
            if (iVar.f23058a != f10) {
                return false;
            }
            iVar.f23058a = null;
            z10 = true;
        }
        f10.itemView.setAlpha(1.0f);
        f10.itemView.setTranslationX(0.0f);
        f10.itemView.setTranslationY(0.0f);
        D(f10, z10);
        return true;
    }

    public final void b0(RecyclerView.F f10) {
        if (f23018s == null) {
            f23018s = new ValueAnimator().getInterpolator();
        }
        f10.itemView.animate().setInterpolator(f23018s);
        j(f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(RecyclerView.F f10, List list) {
        return !list.isEmpty() || super.g(f10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j(RecyclerView.F f10) {
        View view = f10.itemView;
        view.animate().cancel();
        int size = this.f23021j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f23021j.get(size)).f23064a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(f10);
                this.f23021j.remove(size);
            }
        }
        Y(this.f23022k, f10);
        if (this.f23019h.remove(f10)) {
            view.setAlpha(1.0f);
            H(f10);
        }
        if (this.f23020i.remove(f10)) {
            view.setAlpha(1.0f);
            B(f10);
        }
        for (int size2 = this.f23025n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f23025n.get(size2);
            Y(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.f23025n.remove(size2);
            }
        }
        for (int size3 = this.f23024m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f23024m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f23064a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f23024m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f23023l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f23023l.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                B(f10);
                if (arrayList3.isEmpty()) {
                    this.f23023l.remove(size5);
                }
            }
        }
        this.f23028q.remove(f10);
        this.f23026o.remove(f10);
        this.f23029r.remove(f10);
        this.f23027p.remove(f10);
        X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f23021j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f23021j.get(size);
            View view = jVar.f23064a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f23064a);
            this.f23021j.remove(size);
        }
        for (int size2 = this.f23019h.size() - 1; size2 >= 0; size2--) {
            H((RecyclerView.F) this.f23019h.get(size2));
            this.f23019h.remove(size2);
        }
        int size3 = this.f23020i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = (RecyclerView.F) this.f23020i.get(size3);
            f10.itemView.setAlpha(1.0f);
            B(f10);
            this.f23020i.remove(size3);
        }
        for (int size4 = this.f23022k.size() - 1; size4 >= 0; size4--) {
            Z((i) this.f23022k.get(size4));
        }
        this.f23022k.clear();
        if (p()) {
            for (int size5 = this.f23024m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f23024m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f23064a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f23064a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f23024m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f23023l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f23023l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = (RecyclerView.F) arrayList2.get(size8);
                    f11.itemView.setAlpha(1.0f);
                    B(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f23023l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f23025n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f23025n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f23025n.remove(arrayList3);
                    }
                }
            }
            W(this.f23028q);
            W(this.f23027p);
            W(this.f23026o);
            W(this.f23029r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f23020i.isEmpty() && this.f23022k.isEmpty() && this.f23021j.isEmpty() && this.f23019h.isEmpty() && this.f23027p.isEmpty() && this.f23028q.isEmpty() && this.f23026o.isEmpty() && this.f23029r.isEmpty() && this.f23024m.isEmpty() && this.f23023l.isEmpty() && this.f23025n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void v() {
        boolean isEmpty = this.f23019h.isEmpty();
        boolean isEmpty2 = this.f23021j.isEmpty();
        boolean isEmpty3 = this.f23022k.isEmpty();
        boolean isEmpty4 = this.f23020i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f23019h.iterator();
        while (it.hasNext()) {
            V((RecyclerView.F) it.next());
        }
        this.f23019h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f23021j);
            this.f23024m.add(arrayList);
            this.f23021j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                AbstractC2082d0.e0(((j) arrayList.get(0)).f23064a.itemView, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f23022k);
            this.f23025n.add(arrayList2);
            this.f23022k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                AbstractC2082d0.e0(((i) arrayList2.get(0)).f23058a.itemView, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f23020i);
        this.f23023l.add(arrayList3);
        this.f23020i.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            AbstractC2082d0.e0(((RecyclerView.F) arrayList3.get(0)).itemView, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.w
    public boolean x(RecyclerView.F f10) {
        b0(f10);
        f10.itemView.setAlpha(0.0f);
        this.f23020i.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean y(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
        if (f10 == f11) {
            return z(f10, i10, i11, i12, i13);
        }
        float translationX = f10.itemView.getTranslationX();
        float translationY = f10.itemView.getTranslationY();
        float alpha = f10.itemView.getAlpha();
        b0(f10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f10.itemView.setTranslationX(translationX);
        f10.itemView.setTranslationY(translationY);
        f10.itemView.setAlpha(alpha);
        if (f11 != null) {
            b0(f11);
            f11.itemView.setTranslationX(-i14);
            f11.itemView.setTranslationY(-i15);
            f11.itemView.setAlpha(0.0f);
        }
        this.f23022k.add(new i(f10, f11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public boolean z(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f10.itemView.getTranslationY());
        b0(f10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            F(f10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f23021j.add(new j(f10, translationX, translationY, i12, i13));
        return true;
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f23058a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f23059b;

        /* renamed from: c, reason: collision with root package name */
        public int f23060c;

        /* renamed from: d, reason: collision with root package name */
        public int f23061d;

        /* renamed from: e, reason: collision with root package name */
        public int f23062e;

        /* renamed from: f, reason: collision with root package name */
        public int f23063f;

        public i(RecyclerView.F f10, RecyclerView.F f11) {
            this.f23058a = f10;
            this.f23059b = f11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f23058a + ", newHolder=" + this.f23059b + ", fromX=" + this.f23060c + ", fromY=" + this.f23061d + ", toX=" + this.f23062e + ", toY=" + this.f23063f + '}';
        }

        public i(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f23060c = i10;
            this.f23061d = i11;
            this.f23062e = i12;
            this.f23063f = i13;
        }
    }
}
