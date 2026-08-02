package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class aw9 extends vv9 implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    public final transient Comparator d;
    public transient aw9 e;

    public aw9(Comparator comparator) {
        this.d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static fwf y(Comparator comparator) {
        if (x5d.a == comparator) {
            return fwf.h;
        }
        av9 av9Var = hv9.b;
        return new fwf(vvf.e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        aw9 aw9Var = this.e;
        if (aw9Var == null) {
            fwf fwfVar = (fwf) this;
            Comparator reverseOrder = Collections.reverseOrder(fwfVar.d);
            aw9Var = fwfVar.isEmpty() ? y(reverseOrder) : new fwf(fwfVar.g.C(), reverseOrder);
            this.e = aw9Var;
            aw9Var.e = this;
        }
        return aw9Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        fwf fwfVar = (fwf) this;
        return fwfVar.A(0, fwfVar.B(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        fwf fwfVar = (fwf) this;
        return fwfVar.A(fwfVar.C(obj, true), fwfVar.g.size());
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return new zv9(this.d, toArray(wu9.a));
    }

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final fwf subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        z1a.s(this.d.compare(obj, obj2) <= 0);
        fwf fwfVar = (fwf) this;
        fwf A = fwfVar.A(fwfVar.C(obj, z), fwfVar.g.size());
        return A.A(0, A.B(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        fwf fwfVar = (fwf) this;
        return fwfVar.A(0, fwfVar.B(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        fwf fwfVar = (fwf) this;
        return fwfVar.A(fwfVar.C(obj, z), fwfVar.g.size());
    }
}
