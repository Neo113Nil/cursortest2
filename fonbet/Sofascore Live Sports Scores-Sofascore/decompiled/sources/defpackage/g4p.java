package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g4p extends c4p implements NavigableSet, Iterable {
    public final transient Comparator d;
    public transient g4p e;

    public g4p(Comparator comparator) {
        this.d = comparator;
    }

    public static l5p w(Comparator comparator) {
        if (s4p.a.equals(comparator)) {
            return l5p.g;
        }
        m3p m3pVar = q3p.b;
        return new l5p(v4p.e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        l5p l5pVar = (l5p) this;
        return l5pVar.B(0, l5pVar.z(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        l5p l5pVar = (l5p) this;
        return l5pVar.B(l5pVar.A(obj, true), l5pVar.f.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final l5p subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        jca.c0(this.d.compare(obj, obj2) <= 0);
        l5p l5pVar = (l5p) this;
        l5p B = l5pVar.B(l5pVar.A(obj, z), l5pVar.f.size());
        return B.B(0, B.z(obj2, z2));
    }

    @Override // java.util.NavigableSet
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final g4p descendingSet() {
        g4p g4pVar = this.e;
        if (g4pVar == null) {
            l5p l5pVar = (l5p) this;
            Comparator reverseOrder = Collections.reverseOrder(l5pVar.d);
            g4pVar = l5pVar.isEmpty() ? w(reverseOrder) : new l5p(l5pVar.f.s(), reverseOrder);
            this.e = g4pVar;
            g4pVar.e = this;
        }
        return g4pVar;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        l5p l5pVar = (l5p) this;
        return l5pVar.B(0, l5pVar.z(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        l5p l5pVar = (l5p) this;
        return l5pVar.B(l5pVar.A(obj, z), l5pVar.f.size());
    }
}
