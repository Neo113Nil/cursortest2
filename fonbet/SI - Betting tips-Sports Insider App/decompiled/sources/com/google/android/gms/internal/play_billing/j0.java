package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j0 extends y implements Set, j$.util.Set {

    /* renamed from: b, reason: collision with root package name */
    public transient d0 f5486b;

    public static int g(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static j0 i(int i5, Object... objArr) {
        if (i5 == 0) {
            return y0.f5645i;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a1(obj);
        }
        int g10 = g(i5);
        Object[] objArr2 = new Object[g10];
        int i10 = g10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(androidx.appcompat.widget.c1.i(i13, "at index "));
            }
            int hashCode = obj2.hashCode();
            int c2 = d3.c(hashCode);
            while (true) {
                int i14 = c2 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    c2++;
                }
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a1(obj4);
        }
        if (g(i12) < g10 / 2) {
            return i(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new y0(i11, i10, i12, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public d0 d() {
        d0 d0Var = this.f5486b;
        if (d0Var != null) {
            return d0Var;
        }
        d0 h10 = h();
        this.f5486b = h10;
        return h10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j0) && (this instanceof y0) && (((j0) obj) instanceof y0) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public d0 h() {
        Object[] array = toArray(y.f5643a);
        a0 a0Var = d0.f5420b;
        return d0.i(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 += next != null ? next.hashCode() : 0;
        }
        return i5;
    }
}
