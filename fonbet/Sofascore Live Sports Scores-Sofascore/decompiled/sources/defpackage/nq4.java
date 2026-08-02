package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nq4 extends m {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((u) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.m
    public final boolean a(u uVar, u uVar2, drf drfVar, drf drfVar2) {
        int i;
        int i2;
        int i3 = drfVar.a;
        int i4 = drfVar.b;
        if (uVar2.shouldIgnore()) {
            int i5 = drfVar.a;
            i2 = drfVar.b;
            i = i5;
        } else {
            i = drfVar2.a;
            i2 = drfVar2.b;
        }
        if (uVar == uVar2) {
            return g(uVar, i3, i4, i, i2);
        }
        float translationX = uVar.itemView.getTranslationX();
        float translationY = uVar.itemView.getTranslationY();
        float alpha = uVar.itemView.getAlpha();
        l(uVar);
        uVar.itemView.setTranslationX(translationX);
        uVar.itemView.setTranslationY(translationY);
        uVar.itemView.setAlpha(alpha);
        l(uVar2);
        uVar2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        uVar2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        uVar2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.k;
        lq4 lq4Var = new lq4();
        lq4Var.a = uVar;
        lq4Var.b = uVar2;
        lq4Var.c = i3;
        lq4Var.d = i4;
        lq4Var.e = i;
        lq4Var.f = i2;
        arrayList.add(lq4Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public final void d(u uVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = uVar.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((mq4) arrayList4.get(size)).a == uVar) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c(uVar);
                arrayList4.remove(size);
            }
        }
        j(this.k, uVar);
        if (this.h.remove(uVar)) {
            view.setAlpha(1.0f);
            c(uVar);
        }
        if (this.i.remove(uVar)) {
            view.setAlpha(1.0f);
            c(uVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, uVar);
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
                if (((mq4) arrayList6.get(size4)).a == uVar) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(uVar);
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
            if (arrayList7.remove(uVar)) {
                view.setAlpha(1.0f);
                c(uVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(uVar);
        this.o.remove(uVar);
        this.r.remove(uVar);
        this.p.remove(uVar);
        i();
    }

    @Override // androidx.recyclerview.widget.m
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mq4 mq4Var = (mq4) arrayList7.get(size);
            View view = mq4Var.a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c(mq4Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((u) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            u uVar = (u) arrayList5.get(size3);
            uVar.itemView.setAlpha(1.0f);
            c(uVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            lq4 lq4Var = (lq4) arrayList.get(size4);
            u uVar2 = lq4Var.a;
            if (uVar2 != null) {
                k(lq4Var, uVar2);
            }
            u uVar3 = lq4Var.b;
            if (uVar3 != null) {
                k(lq4Var, uVar3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    mq4 mq4Var2 = (mq4) arrayList8.get(size6);
                    View view2 = mq4Var2.a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(mq4Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    u uVar4 = (u) arrayList9.get(size8);
                    uVar4.itemView.setAlpha(1.0f);
                    c(uVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    lq4 lq4Var2 = (lq4) arrayList10.get(size10);
                    u uVar5 = lq4Var2.a;
                    if (uVar5 != null) {
                        k(lq4Var2, uVar5);
                    }
                    u uVar6 = lq4Var2.b;
                    if (uVar6 != null) {
                        k(lq4Var2, uVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                pvd.j();
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(u uVar, int i, int i2, int i3, int i4) {
        View view = uVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) uVar.itemView.getTranslationY());
        l(uVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(uVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        mq4 mq4Var = new mq4();
        mq4Var.a = uVar;
        mq4Var.b = translationX;
        mq4Var.c = translationY;
        mq4Var.d = i3;
        mq4Var.e = i4;
        arrayList.add(mq4Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            pvd.j();
        }
    }

    public final void j(ArrayList arrayList, u uVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lq4 lq4Var = (lq4) arrayList.get(size);
            if (k(lq4Var, uVar) && lq4Var.a == null && lq4Var.b == null) {
                arrayList.remove(lq4Var);
            }
        }
    }

    public final boolean k(lq4 lq4Var, u uVar) {
        if (lq4Var.b == uVar) {
            lq4Var.b = null;
        } else {
            if (lq4Var.a != uVar) {
                return false;
            }
            lq4Var.a = null;
        }
        uVar.itemView.setAlpha(1.0f);
        uVar.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        uVar.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(uVar);
        return true;
    }

    public final void l(u uVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        uVar.itemView.animate().setInterpolator(s);
        d(uVar);
    }
}
