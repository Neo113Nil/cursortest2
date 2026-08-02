package com.vk.lists;

import androidx.recyclerview.widget.m;
import com.vk.lists.ListDataSet;
import java.util.List;
import xsna.ggz;
import xsna.ozl;
import xsna.u250;

/* compiled from: DiffListDataSet.kt */
@ozl
/* loaded from: classes3.dex */
public final class b<T> extends ListDataSet<T> implements ggz {
    public final a<T> e;

    /* compiled from: DiffListDataSet.kt */
    public static abstract class a<T> extends m.b {
        public List<? extends T> b;
        public List<? extends T> c;

        public abstract boolean a(T t, T t2);

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return a(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return b(this.b.get(i), this.c.get(i2));
        }

        public abstract boolean b(T t, T t2);

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    public b(u250.a aVar) {
        this.e = aVar;
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk, xsna.vic, com.vk.lists.c.i
    public final void clear() {
        if (this.e == null) {
            super.clear();
            return;
        }
        ListDataSet.ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        n(0, size);
        arrayListImpl.clear();
        o(0, size);
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk
    public final void setItems(List<? extends T> list) {
        if (list == null) {
            clear();
            return;
        }
        b();
        ListDataSet.ArrayListImpl<T> arrayListImpl = this.d;
        a<T> aVar = this.e;
        if (aVar == null) {
            arrayListImpl.clear();
            arrayListImpl.addAll(list);
            a();
            return;
        }
        aVar.b = arrayListImpl;
        aVar.c = list;
        m.d a2 = m.a(aVar, true);
        aVar.b = null;
        aVar.c = null;
        arrayListImpl.clear();
        arrayListImpl.addAll(list);
        a2.c(this);
    }
}
