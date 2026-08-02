package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rlh extends b7 {
    public static final rlh b = new rlh(new Object[0]);
    public final Object[] a;

    public rlh(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.b7
    public final b7 a(Object obj) {
        int size = size();
        Object[] objArr = this.a;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
            copyOf[size()] = obj;
            return new rlh(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ffe(objArr, objArr2, size() + 1, 0);
    }

    @Override // defpackage.b7
    public final b7 c(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        if (collection.size() + size() > 32) {
            hfe d = d();
            d.addAll(collection);
            return d.d();
        }
        Object[] copyOf = Arrays.copyOf(this.a, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new rlh(copyOf);
    }

    @Override // defpackage.b7
    public final hfe d() {
        return new hfe(this, null, this.a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        tz9.v(i, size());
        return this.a[i];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.u4, java.util.List
    public final int indexOf(Object obj) {
        return ph0.G(obj, this.a);
    }

    @Override // defpackage.u4, java.util.List
    public final int lastIndexOf(Object obj) {
        return ph0.N(obj, this.a);
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator(int i) {
        tz9.w(i, size());
        return new y52(i, size(), this.a);
    }
}
