package defpackage;

import com.google.android.gms.internal.ads.zzgub;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aeb extends AbstractList implements RandomAccess, Serializable {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final Object c;

    public aeb(List list, zzgub zzgubVar) {
        list.getClass();
        this.b = list;
        this.c = zzgubVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                return ((xs8) obj).apply(list.get(i));
            default:
                return ((zzgub) obj).apply(list.get(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
        }
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new zdb(this, this.b.listIterator(i), 0);
            default:
                return new yio(this, this.b.listIterator(i), 0);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Object obj = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                return ((xs8) obj).apply(list.remove(i));
            default:
                return ((zzgub) obj).apply(list.remove(i));
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.subList(i, i2).clear();
                break;
            default:
                this.b.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public aeb(List list, xs8 xs8Var) {
        list.getClass();
        this.b = list;
        this.c = xs8Var;
    }
}
