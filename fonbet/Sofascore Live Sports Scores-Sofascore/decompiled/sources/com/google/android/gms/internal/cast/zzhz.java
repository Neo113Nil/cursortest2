package com.google.android.gms.internal.cast;

import defpackage.a70;
import defpackage.b6a;
import defpackage.sno;
import defpackage.wqo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhz extends zzhr implements Set {
    public static final /* synthetic */ int c = 0;
    public transient zzhv b;

    public static int r(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        a70.p("collection too large");
        return 0;
    }

    public static zzhz t(int i, Object... objArr) {
        if (i == 0) {
            return b.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new wqo(obj);
        }
        int r = r(i);
        Object[] objArr2 = new Object[r];
        int i2 = r - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzib.a(i5, obj2);
            int hashCode = obj2.hashCode();
            int F = b6a.F(hashCode);
            while (true) {
                int i6 = F & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    F++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new wqo(obj4);
        }
        if (r(i4) < r / 2) {
            return t(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new b(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzhz) && (this instanceof b) && (((zzhz) obj) instanceof b) && hashCode() != obj.hashCode()) {
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

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public zzhv q() {
        zzhv zzhvVar = this.b;
        if (zzhvVar != null) {
            return zzhvVar;
        }
        zzhv s = s();
        this.b = s;
        return s;
    }

    public zzhv s() {
        Object[] array = toArray(zzhr.a);
        sno snoVar = zzhv.b;
        return zzhv.r(array.length, array);
    }
}
