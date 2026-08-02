package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.vu5;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class g extends n0 {
    public static TimeInterpolator s;
    public final ArrayList<RecyclerView.e0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> i = new ArrayList<>();
    public final ArrayList<e> j = new ArrayList<>();
    public final ArrayList<d> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.e0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<e>> m = new ArrayList<>();
    public final ArrayList<ArrayList<d>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> q = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes12.dex */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                g gVar = g.this;
                if (!hasNext) {
                    arrayList.clear();
                    gVar.m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.e0 e0Var = eVar.a;
                int i = eVar.b;
                int i2 = eVar.c;
                int i3 = eVar.d;
                int i4 = eVar.e;
                View view = e0Var.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (i6 != 0) {
                    view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ViewPropertyAnimator animate = view.animate();
                gVar.p.add(e0Var);
                animate.setDuration(gVar.e).setListener(new j(gVar, e0Var, i5, view, i6, animate)).start();
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes12.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                g gVar = g.this;
                if (!hasNext) {
                    arrayList.clear();
                    gVar.n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                ArrayList<RecyclerView.e0> arrayList2 = gVar.r;
                RecyclerView.e0 e0Var = dVar.a;
                View view = e0Var == null ? null : e0Var.itemView;
                RecyclerView.e0 e0Var2 = dVar.b;
                View view2 = e0Var2 != null ? e0Var2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(gVar.f);
                    arrayList2.add(dVar.a);
                    duration.translationX(dVar.e - dVar.c);
                    duration.translationY(dVar.f - dVar.d);
                    duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new k(gVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(dVar.b);
                    animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(gVar.f).alpha(1.0f).setListener(new l(gVar, dVar, animate, view2)).start();
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes12.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                g gVar = g.this;
                if (!hasNext) {
                    arrayList.clear();
                    gVar.l.remove(arrayList);
                    return;
                } else {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
                    View view = e0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    gVar.o.add(e0Var);
                    animate.alpha(1.0f).setDuration(gVar.c).setListener(new i(view, animate, gVar, e0Var)).start();
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes12.dex */
    public static class d {
        public RecyclerView.e0 a;
        public RecyclerView.e0 b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public d(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
            this.a = e0Var;
            this.b = e0Var2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return vu5.b(sb, this.f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes12.dex */
    public static class e {
        public final RecyclerView.e0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
            this.a = e0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    final void C(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.e0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    final void D() {
        if (n()) {
            return;
        }
        i();
    }

    public final void E(ArrayList arrayList, RecyclerView.e0 e0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (F(dVar, e0Var) && dVar.a == null && dVar.b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean F(d dVar, RecyclerView.e0 e0Var) {
        if (dVar.b == e0Var) {
            dVar.b = null;
        } else {
            if (dVar.a != e0Var) {
                return false;
            }
            dVar.a = null;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        h(e0Var);
        return true;
    }

    public final void G(RecyclerView.e0 e0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(s);
        j(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@NonNull RecyclerView.e0 e0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || f(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).a == e0Var) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                h(e0Var);
                arrayList.remove(size);
            }
        }
        E(this.k, e0Var);
        if (this.h.remove(e0Var)) {
            view.setAlpha(1.0f);
            A(e0Var);
        }
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            E(arrayList3, e0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).a == e0Var) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(e0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.e0>> arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(e0Var)) {
                view.setAlpha(1.0f);
                h(e0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(e0Var);
        this.o.remove(e0Var);
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        D();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            h(eVar.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.e0> arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            A(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.e0> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = arrayList3.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            h(e0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.e0 e0Var2 = dVar.a;
            if (e0Var2 != null) {
                F(dVar, e0Var2);
            }
            RecyclerView.e0 e0Var3 = dVar.b;
            if (e0Var3 != null) {
                F(dVar, e0Var3);
            }
        }
        arrayList4.clear();
        if (n()) {
            ArrayList<ArrayList<e>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    h(eVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.e0>> arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var4 = arrayList8.get(size8);
                    e0Var4.itemView.setAlpha(1.0f);
                    h(e0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.e0 e0Var5 = dVar2.a;
                    if (e0Var5 != null) {
                        F(dVar2, e0Var5);
                    }
                    RecyclerView.e0 e0Var6 = dVar2.b;
                    if (e0Var6 != null) {
                        F(dVar2, e0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            C(this.q);
            C(this.p);
            C(this.o);
            C(this.r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean n() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void r() {
        ArrayList<RecyclerView.e0> arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.j;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.k;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.e0> arrayList4 = this.i;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator<RecyclerView.e0> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.e0 next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.q.add(next);
            animate.setDuration(this.d).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new h(view, animate, this, next)).start();
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList<e> c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList2);
            this.m.add(c2);
            arrayList2.clear();
            a aVar = new a(c2);
            if (isEmpty) {
                aVar.run();
            } else {
                View view2 = c2.get(0).a.itemView;
                long j = this.d;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view2.postOnAnimationDelayed(aVar, j);
            }
        }
        if (!isEmpty3) {
            ArrayList<d> c3 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList3);
            this.n.add(c3);
            arrayList3.clear();
            b bVar = new b(c3);
            if (isEmpty) {
                bVar.run();
            } else {
                View view3 = c3.get(0).a.itemView;
                long j2 = this.d;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view3.postOnAnimationDelayed(bVar, j2);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.e0> c4 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList4);
        this.l.add(c4);
        arrayList4.clear();
        c cVar = new c(c4);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
            return;
        }
        long max = Math.max(!isEmpty2 ? this.e : 0L, isEmpty3 ? 0L : this.f) + (!isEmpty ? this.d : 0L);
        View view4 = c4.get(0).itemView;
        WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
        view4.postOnAnimationDelayed(cVar, max);
    }

    @Override // androidx.recyclerview.widget.n0
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.e0 e0Var) {
        G(e0Var);
        e0Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return y(e0Var, i, i2, i3, i4);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        G(e0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            G(e0Var2);
            e0Var2.itemView.setTranslationX(-i5);
            e0Var2.itemView.setTranslationY(-i6);
            e0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.k.add(new d(e0Var, e0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.itemView.getTranslationY());
        G(e0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(e0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new e(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.n0
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.e0 e0Var) {
        G(e0Var);
        this.h.add(e0Var);
        return true;
    }
}
