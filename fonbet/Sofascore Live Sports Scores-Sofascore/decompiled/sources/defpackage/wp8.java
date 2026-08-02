package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wp8 extends l implements udi {
    public final g6b a;
    public final s b;
    public final nkb c;
    public final nkb d;
    public final nkb e;
    public ei3 f;
    public final iz0 g;
    public boolean h;
    public boolean i;

    public wp8(s sVar, g6b g6bVar) {
        this.c = new nkb((Object) null);
        this.d = new nkb((Object) null);
        this.e = new nkb((Object) null);
        iz0 iz0Var = new iz0();
        iz0Var.a = new CopyOnWriteArrayList();
        this.g = iz0Var;
        this.h = false;
        this.i = false;
        this.b = sVar;
        this.a = g6bVar;
        super.setHasStableIds(true);
    }

    public static void o(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            a70.r("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.l
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.l
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.f != null) {
            ilg.c();
            return;
        }
        ei3 ei3Var = new ei3();
        ei3Var.f = this;
        ei3Var.a = -1L;
        this.f = ei3Var;
        ViewPager2 c = ei3.c(recyclerView);
        ei3Var.e = c;
        j41 j41Var = new j41(ei3Var, 8);
        ei3Var.b = j41Var;
        c.a(j41Var);
        vp8 vp8Var = new vp8(ei3Var, 0);
        ei3Var.c = vp8Var;
        registerAdapterDataObserver(vp8Var);
        nqf nqfVar = new nqf(ei3Var, 4);
        ei3Var.d = nqfVar;
        this.a.a(nqfVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        vq8 vq8Var = (vq8) uVar;
        long itemId = vq8Var.getItemId();
        int id = ((FrameLayout) vq8Var.itemView).getId();
        Long s = s(id);
        nkb nkbVar = this.e;
        if (s != null && s.longValue() != itemId) {
            u(s.longValue());
            nkbVar.h(s.longValue());
        }
        nkbVar.g(Integer.valueOf(id), itemId);
        long itemId2 = getItemId(i);
        nkb nkbVar2 = this.c;
        if (!nkbVar2.b(itemId2)) {
            Fragment q = q(i);
            q.setInitialSavedState((Fragment.SavedState) this.d.c(itemId2));
            nkbVar2.g(q, itemId2);
        }
        FrameLayout frameLayout = (FrameLayout) vq8Var.itemView;
        WeakHashMap weakHashMap = bsk.a;
        if (frameLayout.isAttachedToWindow()) {
            t(vq8Var);
        }
        r();
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = vq8.b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = bsk.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new vq8(frameLayout);
    }

    @Override // androidx.recyclerview.widget.l
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        ei3 ei3Var = this.f;
        ei3Var.getClass();
        ei3.c(recyclerView).e((j41) ei3Var.b);
        wp8 wp8Var = (wp8) ei3Var.f;
        wp8Var.unregisterAdapterDataObserver((vp8) ei3Var.c);
        wp8Var.a.d((nqf) ei3Var.d);
        ei3Var.e = null;
        this.f = null;
    }

    @Override // androidx.recyclerview.widget.l
    public final boolean onFailedToRecycleView(u uVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        t((vq8) uVar);
        r();
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        Long s = s(((FrameLayout) ((vq8) uVar).itemView).getId());
        if (s != null) {
            u(s.longValue());
            this.e.h(s.longValue());
        }
    }

    public boolean p(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public abstract Fragment q(int i);

    public final void r() {
        nkb nkbVar;
        nkb nkbVar2;
        Fragment fragment;
        View view;
        if (!this.i || this.b.S()) {
            return;
        }
        gh0 gh0Var = new gh0(0);
        int i = 0;
        while (true) {
            nkbVar = this.c;
            int i2 = nkbVar.i();
            nkbVar2 = this.e;
            if (i >= i2) {
                break;
            }
            long f = nkbVar.f(i);
            if (!p(f)) {
                gh0Var.add(Long.valueOf(f));
                nkbVar2.h(f);
            }
            i++;
        }
        if (!this.h) {
            this.i = false;
            for (int i3 = 0; i3 < nkbVar.i(); i3++) {
                long f2 = nkbVar.f(i3);
                if (!nkbVar2.b(f2) && ((fragment = (Fragment) nkbVar.c(f2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    gh0Var.add(Long.valueOf(f2));
                }
            }
        }
        zg0 zg0Var = new zg0(gh0Var);
        while (zg0Var.hasNext()) {
            u(((Long) zg0Var.next()).longValue());
        }
    }

    public final Long s(int i) {
        int i2 = 0;
        Long l = null;
        while (true) {
            nkb nkbVar = this.e;
            if (i2 >= nkbVar.i()) {
                return l;
            }
            if (((Integer) nkbVar.j(i2)).intValue() == i) {
                if (l != null) {
                    a70.r("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                l = Long.valueOf(nkbVar.f(i2));
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public final void t(vq8 vq8Var) {
        Fragment fragment = (Fragment) this.c.c(vq8Var.getItemId());
        if (fragment == null) {
            a70.r("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) vq8Var.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            a70.r("Design assumption violated.");
            return;
        }
        boolean isAdded = fragment.isAdded();
        s sVar = this.b;
        if (isAdded && view == null) {
            sVar.Z(new up8(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                o(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            o(view, frameLayout);
            return;
        }
        if (sVar.S()) {
            if (sVar.K) {
                return;
            }
            this.a.a(new tq4(this, vq8Var));
            return;
        }
        sVar.Z(new up8(this, fragment, frameLayout), false);
        iz0 iz0Var = this.g;
        iz0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iz0Var.a.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        try {
            fragment.setMenuVisibility(false);
            a aVar = new a(sVar);
            aVar.i(0, fragment, InneractiveMediationDefs.GENDER_FEMALE + vq8Var.getItemId(), 1);
            aVar.m(fragment, e6b.d);
            if (aVar.i) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.j = false;
            aVar.t.A(aVar, false);
            this.f.h(false);
        } finally {
            iz0.a(arrayList);
        }
    }

    public final void u(long j) {
        ViewParent parent;
        nkb nkbVar = this.c;
        Fragment fragment = (Fragment) nkbVar.c(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean p = p(j);
        nkb nkbVar2 = this.d;
        if (!p) {
            nkbVar2.h(j);
        }
        if (!fragment.isAdded()) {
            nkbVar.h(j);
            return;
        }
        s sVar = this.b;
        if (sVar.S()) {
            this.i = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        iz0 iz0Var = this.g;
        if (isAdded && p(j)) {
            iz0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = iz0Var.a.iterator();
            if (it.hasNext()) {
                throw lnb.i(it);
            }
            Fragment.SavedState e0 = sVar.e0(fragment);
            iz0.a(arrayList);
            nkbVar2.g(e0, j);
        }
        iz0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iz0Var.a.iterator();
        if (it2.hasNext()) {
            throw lnb.i(it2);
        }
        try {
            a aVar = new a(sVar);
            aVar.k(fragment);
            if (aVar.i) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.j = false;
            aVar.t.A(aVar, false);
            nkbVar.h(j);
        } finally {
            iz0.a(arrayList2);
        }
    }

    public wp8(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public wp8(AppCompatActivity appCompatActivity) {
        this(appCompatActivity.k(), appCompatActivity.getLifecycle());
    }
}
