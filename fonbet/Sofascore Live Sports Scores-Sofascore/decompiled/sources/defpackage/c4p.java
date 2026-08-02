package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class c4p extends j3p implements Set {
    public static final /* synthetic */ int c = 0;
    public transient q3p b;

    public static c4p s(int i, Object... objArr) {
        if (i == 0) {
            return j5p.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p5p(obj);
        }
        int u = u(i);
        Object[] objArr2 = new Object[u];
        int i2 = u - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            pea.I(i5, obj2);
            int hashCode = obj2.hashCode();
            int S = bea.S(hashCode);
            while (true) {
                int i6 = S & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    S++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p5p(obj4);
        }
        if (u(i4) < u / 2) {
            return s(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new j5p(i3, i2, i4, objArr, objArr2);
    }

    public static int u(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            jca.d0("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c4p) && t() && ((c4p) obj).t() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return qea.M(this);
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.j3p
    public q3p p() {
        q3p q3pVar = this.b;
        if (q3pVar != null) {
            return q3pVar;
        }
        q3p v = v();
        this.b = v;
        return v;
    }

    public boolean t() {
        return this instanceof j5p;
    }

    public q3p v() {
        Object[] array = toArray(j3p.a);
        m3p m3pVar = q3p.b;
        return q3p.v(array.length, array);
    }
}
