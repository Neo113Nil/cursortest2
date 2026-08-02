package f8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j extends a implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9512c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient e f9513b;

    public static int g(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static j h(int i5, Object... objArr) {
        if (i5 == 0) {
            return r.j;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new s(obj);
        }
        int g10 = g(i5);
        Object[] objArr2 = new Object[g10];
        int i10 = g10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i13);
                throw new NullPointerException(sb2.toString());
            }
            int hashCode = obj2.hashCode();
            int y5 = m4.g.y(hashCode);
            while (true) {
                int i14 = y5 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                y5++;
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new s(obj4);
        }
        if (g(i12) < g10 / 2) {
            return h(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new r(i11, i10, i12, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j) && (this instanceof r) && (((j) obj) instanceof r) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public e f() {
        e eVar = this.f9513b;
        if (eVar != null) {
            return eVar;
        }
        e i5 = i();
        this.f9513b = i5;
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 = ~(~(i5 + (next != null ? next.hashCode() : 0)));
        }
        return i5;
    }

    public e i() {
        Object[] array = toArray(a.f9494a);
        b bVar = e.f9502b;
        return e.f(array.length, array);
    }

    @Override // f8.a
    public Object writeReplace() {
        return new i(toArray(a.f9494a));
    }
}
