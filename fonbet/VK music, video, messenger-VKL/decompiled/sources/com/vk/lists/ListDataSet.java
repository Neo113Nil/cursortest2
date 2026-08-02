package com.vk.lists;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import xsna.hg6;
import xsna.izs;
import xsna.l6u;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes3.dex */
public class ListDataSet<T> extends hg6<T> {
    public final ArrayListImpl<T> d = new ArrayListImpl<>();

    public static final class ArrayListImpl<T> extends ArrayList<T> {
        public final void a(int i, int i2) {
            removeRange(i, i2);
        }
    }

    public final void A(int i) {
        k(i);
        this.d.remove(i);
        p(i);
    }

    public final void B(int i, int i2) {
        n(i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.d.remove(i);
        }
        o(i, i2);
    }

    public final void D(T t, T t2) {
        ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i < size) {
                T t3 = arrayListImpl.get(i);
                if ((t3 == null && t == null) || (t3 != null && t3.equals(t))) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            h(i);
            arrayListImpl.set(i, t2);
            d(i);
        }
    }

    public final void E(izs<? super T, Boolean> izsVar, izs<? super T, ? extends T> izsVar2) {
        ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (izsVar.invoke(arrayListImpl.get(i)).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            h(i);
            arrayListImpl.set(i, izsVar2.invoke(arrayListImpl.get(i)));
            d(i);
        }
    }

    public final void F(int i, T t) {
        h(i);
        this.d.set(i, t);
        d(i);
    }

    public final void G(@Nullable Object obj, izs izsVar, izs izsVar2) {
        int i = 0;
        while (true) {
            ArrayListImpl<T> arrayListImpl = this.d;
            if (i >= arrayListImpl.size()) {
                return;
            }
            if (((Boolean) izsVar.invoke(arrayListImpl.get(i))).booleanValue()) {
                i(i, obj);
                arrayListImpl.set(i, izsVar2.invoke(arrayListImpl.get(i)));
                e(i, obj);
            }
            i++;
        }
    }

    public final void H(izs<? super T, Boolean> izsVar, izs<? super T, ? extends T> izsVar2) {
        int i = 0;
        while (true) {
            ArrayListImpl<T> arrayListImpl = this.d;
            if (i >= arrayListImpl.size()) {
                return;
            }
            if (izsVar.invoke(arrayListImpl.get(i)).booleanValue()) {
                h(i);
                arrayListImpl.set(i, izsVar2.invoke(arrayListImpl.get(i)));
                d(i);
            }
            i++;
        }
    }

    @Override // xsna.uuk
    public final boolean J(l6u l6uVar) {
        ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((Boolean) l6uVar.invoke(arrayListImpl.get(i))).booleanValue()) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // xsna.uuk
    public void S(List<T> list) {
        y(0, list);
    }

    @Override // xsna.uuk
    public T c(int i) {
        if (i < 0) {
            return null;
        }
        ArrayListImpl<T> arrayListImpl = this.d;
        if (i < arrayListImpl.size()) {
            return arrayListImpl.get(i);
        }
        return null;
    }

    @Override // xsna.uuk, xsna.vic, com.vk.lists.c.i
    public void clear() {
        b();
        this.d.clear();
        a();
    }

    @Override // xsna.uuk
    public void n0(List<T> list) {
        y(this.d.size(), list);
    }

    @Override // xsna.hg6
    public final void r(int i, T t, @Nullable Object obj) {
        i(i, obj);
        this.d.set(i, t);
        e(i, obj);
    }

    public final void s(T t) {
        ArrayListImpl<T> arrayListImpl = this.d;
        j(arrayListImpl.size());
        arrayListImpl.add(arrayListImpl.size(), t);
        f(arrayListImpl.size());
    }

    @Override // xsna.uuk
    public void setItems(List<? extends T> list) {
        b();
        ArrayListImpl<T> arrayListImpl = this.d;
        arrayListImpl.clear();
        if (list != null) {
            arrayListImpl.addAll(list);
        }
        a();
    }

    public final T t(Predicate<? super T> predicate) {
        ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (predicate.test(arrayListImpl.get(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return c(i);
        }
        return null;
    }

    public final void u(wzs<? super Integer, ? super T, s3q0> wzsVar) {
        int i = 0;
        while (true) {
            ArrayListImpl<T> arrayListImpl = this.d;
            if (i >= arrayListImpl.size()) {
                return;
            }
            wzsVar.invoke(Integer.valueOf(i), arrayListImpl.get(i));
            i++;
        }
    }

    public final int v(T t) {
        int i = 0;
        while (true) {
            ArrayListImpl<T> arrayListImpl = this.d;
            if (i >= arrayListImpl.size()) {
                return -1;
            }
            if (arrayListImpl.get(i).equals(t)) {
                return i;
            }
            i++;
        }
    }

    public final int w(Predicate<? super T> predicate) {
        ArrayListImpl<T> arrayListImpl = this.d;
        int size = arrayListImpl.size();
        for (int i = 0; i < size; i++) {
            if (predicate.test(arrayListImpl.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final void x(int i, T t) {
        j(i);
        this.d.add(i, t);
        f(i);
    }

    public final void y(int i, List<T> list) {
        int size = list.size();
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().e(i, size);
        }
        this.d.addAll(i, list);
        m(i, list.size());
    }

    public final void z(izs izsVar) {
        ArrayListImpl<T> arrayListImpl = this.d;
        BitSet bitSet = new BitSet(arrayListImpl.size());
        int size = arrayListImpl.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t = arrayListImpl.get(i2);
            if (((Boolean) izsVar.invoke(t)).booleanValue()) {
                i++;
                bitSet.set(i2);
                k(i2);
            } else if (i > 0) {
                arrayListImpl.set(i2 - i, t);
            }
        }
        if (i > 0) {
            arrayListImpl.a(size - i, size);
            for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0 && nextSetBit != Integer.MAX_VALUE; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                p(nextSetBit);
            }
        }
    }
}
