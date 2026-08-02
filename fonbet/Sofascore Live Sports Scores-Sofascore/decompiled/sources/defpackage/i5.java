package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i5 extends l5 implements NavigableSet {
    public final /* synthetic */ azc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(azc azcVar, NavigableMap navigableMap) {
        super(azcVar, navigableMap);
        this.e = azcVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return c().ceilingKey(obj);
    }

    @Override // defpackage.l5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap c() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((g5) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new i5(this.e, c().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return c().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new i5(this.e, c().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return c().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return c().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        e5 e5Var = (e5) iterator();
        if (!e5Var.hasNext()) {
            return null;
        }
        Object next = e5Var.next();
        e5Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new i5(this.e, c().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new i5(this.e, c().tailMap(obj, z));
    }

    @Override // defpackage.l5, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.l5, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.l5, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
