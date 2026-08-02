package com.vk.lists;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.List;
import xsna.ggz;
import xsna.ozl;

/* compiled from: CompatDiffListDataSet.kt */
/* loaded from: classes3.dex */
public final class a<T> extends ListDataSet<T> implements ggz {
    public final m.e<T> e;

    /* compiled from: CompatDiffListDataSet.kt */
    /* renamed from: com.vk.lists.a$a, reason: collision with other inner class name */
    public static final class C1257a<T> extends m.b {
        public final ArrayList b;
        public final List<T> c;
        public final m.e<T> d;

        public C1257a(ArrayList arrayList, List list, m.e eVar) {
            this.b = arrayList;
            this.c = list;
            this.d = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return this.d.areContentsTheSame(this.b.get(i), this.c.get(i2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return this.d.areItemsTheSame(this.b.get(i), this.c.get(i2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.m.b
        public final Object getChangePayload(int i, int i2) {
            return this.d.getChangePayload(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            List<T> list = this.c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }
    }

    @ozl
    public a() {
        throw null;
    }

    public a(m.e<T> eVar) {
        this.e = eVar;
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk, xsna.vic, com.vk.lists.c.i
    public final void clear() {
        ListDataSet.ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        n(0, size);
        arrayListImpl.clear();
        o(0, size);
    }

    @Override // xsna.hg6, xsna.ggz
    public final void onChanged(int i, int i2, Object obj) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).d(i, i2, obj);
        }
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk
    public final void setItems(List<? extends T> list) {
        if (list == null) {
            clear();
            return;
        }
        b();
        ListDataSet.ArrayListImpl<T> arrayListImpl = this.d;
        m.d a = m.a(new C1257a(new ArrayList(arrayListImpl), list, this.e), true);
        arrayListImpl.clear();
        arrayListImpl.addAll(list);
        a.c(this);
    }
}
