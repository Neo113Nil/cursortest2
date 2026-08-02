package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.r7d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = qq3.class)
/* loaded from: classes.dex */
public final class c6d<T extends r7d> implements List<T>, qdi, RandomAccess, gia {

    @NotNull
    public static final b6d Companion = new b6d();
    public final SnapshotStateList a;

    public c6d(SnapshotStateList snapshotStateList) {
        this.a = snapshotStateList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.add((r7d) obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, collection);
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        SnapshotStateList snapshotStateList = this.a;
        sdiVar.b = snapshotStateList.a;
        snapshotStateList.a = (mdi) sdiVar;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof r7d)) {
            return false;
        }
        return this.a.contains((r7d) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.a.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (r7d) this.a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof r7d)) {
            return -1;
        }
        return this.a.indexOf((r7d) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof r7d)) {
            return -1;
        }
        return this.a.lastIndexOf((r7d) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.getClass();
        return new hc9(snapshotStateList, i);
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        this.a.getClass();
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof r7d)) {
            return false;
        }
        return this.a.remove((r7d) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return (r7d) this.a.set(i, (r7d) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return rfo.M(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return rfo.N(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (r7d) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return (r7d) this.a.remove(i);
    }
}
