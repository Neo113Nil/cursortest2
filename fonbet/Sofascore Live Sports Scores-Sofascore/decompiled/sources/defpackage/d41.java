package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class d41 extends wp8 {
    public final ViewPager2 j;
    public final HashMap k;
    public final ArrayList l;
    public final joa m;
    public boolean n;
    public jta o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(ViewPager2 viewPager2, s sVar, g6b g6bVar) {
        super(sVar, g6bVar);
        viewPager2.getClass();
        sVar.getClass();
        g6bVar.getClass();
        this.j = viewPager2;
        this.k = new HashMap();
        this.l = new ArrayList();
        joa a = ypa.a(ysa.c, new z0(this, 22));
        this.m = a;
        this.n = true;
        viewPager2.a((c41) a.getValue());
    }

    public static void w(d41 d41Var, Enum r2) {
        d41Var.v(r2, d41Var.l.size());
    }

    public final Optional A(Enum r3) {
        r3.getClass();
        Reference reference = (Reference) this.k.get(Long.valueOf(r3.ordinal()));
        Optional ofNullable = Optional.ofNullable(reference != null ? (Fragment) reference.get() : null);
        ofNullable.getClass();
        return ofNullable;
    }

    public final ArrayList B() {
        Collection values = this.k.values();
        ArrayList arrayList = new ArrayList(k13.r(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add((Fragment) ((Reference) it.next()).get());
        }
        return arrayList;
    }

    public abstract Fragment C(Enum r1);

    public final int D(Enum r3) {
        r3.getClass();
        Iterator it = this.l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.c((Enum) it.next(), r3)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Enum E(int i) {
        Object obj = this.l.get(i);
        obj.getClass();
        return (Enum) obj;
    }

    public final void F() {
        Iterator it = B().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof AbstractFragment) {
                AbstractFragment abstractFragment = (AbstractFragment) fragment;
                if (abstractFragment.getContext() != null) {
                    abstractFragment.u();
                }
            }
        }
    }

    public final void G(boolean z) {
        this.n = z;
        if (z) {
            ((c41) this.m.getValue()).c(this.j.getCurrentItem());
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.l.size();
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public long getItemId(int i) {
        return ((Enum) this.l.get(i)).ordinal();
    }

    @Override // defpackage.wp8
    public boolean p(long j) {
        Object obj;
        Iterator it = this.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Enum) obj).ordinal() == j) {
                break;
            }
        }
        return obj != null;
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        Object obj = this.l.get(i);
        obj.getClass();
        Fragment C = C((Enum) obj);
        this.k.put(Long.valueOf(getItemId(i)), new WeakReference(C));
        return C;
    }

    public void v(Enum r4, int i) {
        r4.getClass();
        boolean p = p(r4.ordinal());
        ArrayList arrayList = this.l;
        if (p) {
            o13.A(arrayList, new u2(r4, 13));
        }
        arrayList.add(Math.min(i, arrayList.size()), r4);
        notifyItemInserted(i);
        wrf.d(this.j, Math.max(1, arrayList.size() - 1));
    }

    public final void x(List list) {
        list.getClass();
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Enum) it.next()).ordinal()));
        }
        ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((Enum) it2.next()).ordinal()));
        }
        if (arrayList3.equals(arrayList2)) {
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!arrayList3.contains(Integer.valueOf(((Enum) it3.next()).ordinal()))) {
                this.k.remove(Long.valueOf(r2.ordinal()));
            }
        }
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
        wrf.d(this.j, Math.max(1, arrayList.size() - 1));
    }

    public final Context y() {
        Context context = this.j.getContext();
        context.getClass();
        return context;
    }

    public final Fragment z(int i) {
        Reference reference = (Reference) this.k.get(Long.valueOf(getItemId(i)));
        if (reference != null) {
            return (Fragment) reference.get();
        }
        return null;
    }
}
