package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g7 extends l implements ysk {
    public final /* synthetic */ ejg a;
    public final Context b;
    public int c;
    public int d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final mqi j;
    public RecyclerView k;

    public g7(Context context) {
        context.getClass();
        this.a = new ejg(context);
        this.b = context;
        this.c = -20000;
        this.d = -10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = ypa.b(new z0(this, 2));
    }

    public static void o(g7 g7Var, View view, int i) {
        int size = (i & 4) != 0 ? g7Var.h.size() : 0;
        ArrayList arrayList = g7Var.f;
        view.getClass();
        int size2 = g7Var.i.size() + g7Var.g.size();
        ArrayList arrayList2 = g7Var.h;
        if (arrayList2.indexOf(view) == -1) {
            g7Var.t();
            arrayList2.add(size, view);
            int i2 = g7Var.d;
            g7Var.d = i2 + 1;
            arrayList.add(size, Integer.valueOf(i2));
            g7Var.notifyItemInserted(size2 + size);
        }
    }

    public void A() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        F(CollectionsKt.S0(arrayList));
    }

    public final void B(View view) {
        view.getClass();
        ArrayList arrayList = this.h;
        Integer valueOf = Integer.valueOf(arrayList.indexOf(view));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            t();
            arrayList.remove(intValue);
            this.f.remove(intValue);
            notifyItemRemoved(this.i.size() + this.g.size() + intValue);
        }
    }

    public final void C(View view) {
        view.getClass();
        ArrayList arrayList = this.g;
        int indexOf = arrayList.indexOf(view);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            t();
            arrayList.remove(intValue);
            this.e.remove(intValue);
            notifyItemRemoved(intValue);
        }
    }

    public final void D(Object obj) {
        ArrayList arrayList = this.i;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf > -1) {
            arrayList.remove(indexOf);
            notifyItemRemoved(this.g.size() + indexOf);
        }
    }

    public boolean E(u uVar, u uVar2) {
        uVar.getClass();
        if (uVar.getItemViewType() != uVar2.getItemViewType()) {
            return false;
        }
        int absoluteAdapterPosition = uVar.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = uVar2.getAbsoluteAdapterPosition();
        ArrayList arrayList = this.g;
        int size = absoluteAdapterPosition - arrayList.size();
        int size2 = absoluteAdapterPosition2 - arrayList.size();
        ArrayList arrayList2 = this.i;
        if (size < size2) {
            while (size < size2) {
                int i = size + 1;
                Collections.swap(arrayList2, size, i);
                size = i;
            }
        } else {
            int i2 = size2 + 1;
            if (i2 <= size) {
                while (true) {
                    Collections.swap(arrayList2, size, size - 1);
                    if (size == i2) {
                        break;
                    }
                    size--;
                }
            }
        }
        notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        return true;
    }

    public void F(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = this.i;
        boolean isEmpty = arrayList2.isEmpty();
        f3 u = (isEmpty || arrayList.isEmpty()) ? null : u(arrayList);
        boolean isEmpty2 = arrayList.isEmpty();
        ArrayList arrayList3 = this.g;
        if (isEmpty2) {
            int size = arrayList2.size();
            if (size > 0) {
                arrayList2.clear();
                notifyItemRangeRemoved(arrayList3.size(), size);
                return;
            }
            return;
        }
        if (isEmpty) {
            arrayList2.addAll(arrayList);
            notifyItemRangeInserted(arrayList3.size(), arrayList.size());
            return;
        }
        if (u != null) {
            i25 v = j72.v(u);
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            v.b((p45) this.j.getValue());
            return;
        }
        boolean z = arrayList2.size() > 0;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeInserted(arrayList3.size(), arrayList.size());
        }
    }

    @Override // defpackage.ysk
    public final int d() {
        return this.h.size();
    }

    @Override // defpackage.ysk
    public final int e(int i) {
        return i - this.g.size();
    }

    @Override // defpackage.ysk
    public final Object g(int i) {
        return this.i.get(i);
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.h.size() + this.i.size() + this.g.size();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.g;
        if (i < arrayList.size()) {
            Object obj = this.e.get(i);
            obj.getClass();
            return ((Number) obj).intValue();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        if (i < arrayList2.size() + size) {
            return v(arrayList2.get(i - arrayList.size()));
        }
        Object obj2 = this.f.get((i - arrayList.size()) - arrayList2.size());
        obj2.getClass();
        return ((Number) obj2).intValue();
    }

    @Override // defpackage.ysk
    public final int l() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.l
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        onBindViewHolder(p8Var, i, km5.a);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2;
        m itemAnimator;
        m itemAnimator2;
        viewGroup.getClass();
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.e;
        if (arrayList.contains(valueOf)) {
            int indexOf = arrayList.indexOf(Integer.valueOf(i));
            ArrayList arrayList2 = this.g;
            View view = (View) arrayList2.get(indexOf);
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null && (itemAnimator2 = recyclerView.getItemAnimator()) != null) {
                itemAnimator2.e();
            }
            ViewParent parent2 = view.getParent();
            viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            }
            Object obj = arrayList2.get(indexOf);
            obj.getClass();
            return new r71((View) obj, false);
        }
        Integer valueOf2 = Integer.valueOf(i);
        ArrayList arrayList3 = this.f;
        if (!arrayList3.contains(valueOf2)) {
            return z(viewGroup, i);
        }
        int indexOf2 = arrayList3.indexOf(Integer.valueOf(i));
        ArrayList arrayList4 = this.h;
        View view2 = (View) arrayList4.get(indexOf2);
        ViewParent parent3 = view2.getParent();
        RecyclerView recyclerView2 = parent3 instanceof RecyclerView ? (RecyclerView) parent3 : null;
        if (recyclerView2 != null && (itemAnimator = recyclerView2.getItemAnimator()) != null) {
            itemAnimator.e();
        }
        ViewParent parent4 = view2.getParent();
        viewGroup2 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view2);
        }
        Object obj2 = arrayList4.get(indexOf2);
        obj2.getClass();
        return new r71(8, (View) obj2);
    }

    @Override // androidx.recyclerview.widget.l
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = null;
    }

    public final void p(int i, View view) {
        view.getClass();
        ArrayList arrayList = this.g;
        if (arrayList.contains(view)) {
            return;
        }
        t();
        arrayList.add(i, view);
        int i2 = this.c;
        this.c = i2 + 1;
        this.e.add(i, Integer.valueOf(i2));
        notifyItemInserted(i);
    }

    public final void r(Object obj) {
        this.i.add(obj);
        notifyItemInserted((r0.size() + this.g.size()) - 1);
    }

    public void s() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        arrayList.clear();
        notifyItemRangeRemoved(this.g.size(), size);
    }

    public final void t() {
        m itemAnimator;
        RecyclerView recyclerView = this.k;
        if (recyclerView == null || (itemAnimator = recyclerView.getItemAnimator()) == null) {
            return;
        }
        itemAnimator.e();
    }

    public abstract f3 u(ArrayList arrayList);

    public abstract int v(Object obj);

    public final void w(Object obj) {
        notifyItemChanged(CollectionsKt.c0(this.i, obj) + this.g.size());
    }

    public void x(g7 g7Var, p8 p8Var, int i, List list) {
        p8Var.getClass();
        list.getClass();
        this.a.y(g7Var, p8Var, i, list);
    }

    @Override // androidx.recyclerview.widget.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(p8 p8Var, int i, List list) {
        p8Var.getClass();
        list.getClass();
        x(this, p8Var, i, list);
    }

    public abstract p8 z(ViewGroup viewGroup, int i);
}
