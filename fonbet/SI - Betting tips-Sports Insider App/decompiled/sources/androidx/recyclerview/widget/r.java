package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends f1 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2523s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2524g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2525h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2526i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2527k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2528l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2529m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2530n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2531o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2532p;
    public ArrayList q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2533r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((d2) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean a(d2 d2Var, d2 d2Var2, e1 e1Var, e1 e1Var2) {
        int i5;
        int i10;
        int i11 = e1Var.f2375a;
        int i12 = e1Var.f2376b;
        if (d2Var2.shouldIgnore()) {
            int i13 = e1Var.f2375a;
            i10 = e1Var.f2376b;
            i5 = i13;
        } else {
            i5 = e1Var2.f2375a;
            i10 = e1Var2.f2376b;
        }
        if (d2Var == d2Var2) {
            return g(d2Var, i11, i12, i5, i10);
        }
        float translationX = d2Var.itemView.getTranslationX();
        float translationY = d2Var.itemView.getTranslationY();
        float alpha = d2Var.itemView.getAlpha();
        l(d2Var);
        d2Var.itemView.setTranslationX(translationX);
        d2Var.itemView.setTranslationY(translationY);
        d2Var.itemView.setAlpha(alpha);
        l(d2Var2);
        d2Var2.itemView.setTranslationX(-((int) ((i5 - i11) - translationX)));
        d2Var2.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        d2Var2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f2527k;
        p pVar = new p();
        pVar.f2502a = d2Var;
        pVar.f2503b = d2Var2;
        pVar.f2504c = i11;
        pVar.f2505d = i12;
        pVar.f2506e = i5;
        pVar.f2507f = i10;
        arrayList.add(pVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.f1
    public final void d(d2 d2Var) {
        ArrayList arrayList = this.f2528l;
        ArrayList arrayList2 = this.f2529m;
        ArrayList arrayList3 = this.f2530n;
        View view = d2Var.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((q) arrayList4.get(size)).f2509a == d2Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(d2Var);
                arrayList4.remove(size);
            }
        }
        j(this.f2527k, d2Var);
        if (this.f2525h.remove(d2Var)) {
            view.setAlpha(1.0f);
            c(d2Var);
        }
        if (this.f2526i.remove(d2Var)) {
            view.setAlpha(1.0f);
            c(d2Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, d2Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((q) arrayList6.get(size4)).f2509a == d2Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(d2Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(d2Var)) {
                view.setAlpha(1.0f);
                c(d2Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(d2Var);
        this.f2531o.remove(d2Var);
        this.f2533r.remove(d2Var);
        this.f2532p.remove(d2Var);
        i();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void e() {
        ArrayList arrayList = this.f2530n;
        ArrayList arrayList2 = this.f2528l;
        ArrayList arrayList3 = this.f2529m;
        ArrayList arrayList4 = this.f2527k;
        ArrayList arrayList5 = this.f2526i;
        ArrayList arrayList6 = this.f2525h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q qVar = (q) arrayList7.get(size);
            View view = qVar.f2509a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(qVar.f2509a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((d2) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            d2 d2Var = (d2) arrayList5.get(size3);
            d2Var.itemView.setAlpha(1.0f);
            c(d2Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            p pVar = (p) arrayList4.get(size4);
            d2 d2Var2 = pVar.f2502a;
            if (d2Var2 != null) {
                k(pVar, d2Var2);
            }
            d2 d2Var3 = pVar.f2503b;
            if (d2Var3 != null) {
                k(pVar, d2Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    q qVar2 = (q) arrayList8.get(size6);
                    View view2 = qVar2.f2509a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(qVar2.f2509a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    d2 d2Var4 = (d2) arrayList9.get(size8);
                    d2Var4.itemView.setAlpha(1.0f);
                    c(d2Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    p pVar2 = (p) arrayList10.get(size10);
                    d2 d2Var5 = pVar2.f2502a;
                    if (d2Var5 != null) {
                        k(pVar2, d2Var5);
                    }
                    d2 d2Var6 = pVar2.f2503b;
                    if (d2Var6 != null) {
                        k(pVar2, d2Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.f2532p);
            h(this.f2531o);
            h(this.f2533r);
            ArrayList arrayList11 = this.f2391b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean f() {
        return (this.f2526i.isEmpty() && this.f2527k.isEmpty() && this.j.isEmpty() && this.f2525h.isEmpty() && this.f2532p.isEmpty() && this.q.isEmpty() && this.f2531o.isEmpty() && this.f2533r.isEmpty() && this.f2529m.isEmpty() && this.f2528l.isEmpty() && this.f2530n.isEmpty()) ? false : true;
    }

    public final boolean g(d2 d2Var, int i5, int i10, int i11, int i12) {
        View view = d2Var.itemView;
        int translationX = i5 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) d2Var.itemView.getTranslationY());
        l(d2Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(d2Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        q qVar = new q();
        qVar.f2509a = d2Var;
        qVar.f2510b = translationX;
        qVar.f2511c = translationY;
        qVar.f2512d = i11;
        qVar.f2513e = i12;
        arrayList.add(qVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2391b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, d2 d2Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar = (p) arrayList.get(size);
            if (k(pVar, d2Var) && pVar.f2502a == null && pVar.f2503b == null) {
                arrayList.remove(pVar);
            }
        }
    }

    public final boolean k(p pVar, d2 d2Var) {
        if (pVar.f2503b == d2Var) {
            pVar.f2503b = null;
        } else {
            if (pVar.f2502a != d2Var) {
                return false;
            }
            pVar.f2502a = null;
        }
        d2Var.itemView.setAlpha(1.0f);
        d2Var.itemView.setTranslationX(0.0f);
        d2Var.itemView.setTranslationY(0.0f);
        c(d2Var);
        return true;
    }

    public final void l(d2 d2Var) {
        if (f2523s == null) {
            f2523s = new ValueAnimator().getInterpolator();
        }
        d2Var.itemView.animate().setInterpolator(f2523s);
        d(d2Var);
    }
}
