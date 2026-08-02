package com.google.android.gms.internal.ads;

import defpackage.d2a;
import defpackage.mio;
import defpackage.qio;
import defpackage.u0a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgxw<E> extends zzgxi<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    public transient zzgxm b;

    public static zzgxw s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return y(i, objArr2);
    }

    public static int t(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            zzguk.b("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzgxw u(Set set) {
        if ((set instanceof zzgxw) && !(set instanceof SortedSet)) {
            zzgxw zzgxwVar = (zzgxw) set;
            if (!zzgxwVar.q()) {
                return zzgxwVar;
            }
        }
        Object[] array = set.toArray();
        return y(array.length, array);
    }

    public static zzgxw v(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? y(length, (Object[]) objArr.clone()) : new qio(objArr[0]) : t.j;
    }

    public static zzgxv x(int i) {
        u0a.S(i, "expectedSize");
        zzgxv zzgxvVar = new zzgxv(i);
        zzgxvVar.d = new Object[t(i)];
        return zzgxvVar;
    }

    public static zzgxw y(int i, Object... objArr) {
        if (i == 0) {
            return t.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new qio(obj);
        }
        int t = t(i);
        Object[] objArr2 = new Object[t];
        int i2 = t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzgzf.b(i5, obj2);
            int hashCode = obj2.hashCode();
            int I = d2a.I(hashCode);
            while (true) {
                int i6 = I & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    I++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new qio(obj4);
        }
        if (t(i4) < t / 2) {
            return y(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new t(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgxw) && (this instanceof t) && (((zzgxw) obj) instanceof t) && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgzw.d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgzw.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public zzgxm p() {
        zzgxm zzgxmVar = this.b;
        if (zzgxmVar != null) {
            return zzgxmVar;
        }
        zzgxm w = w();
        this.b = w;
        return w;
    }

    public zzgxm w() {
        Object[] array = toArray(zzgxi.a);
        mio mioVar = zzgxm.b;
        return zzgxm.z(array.length, array);
    }
}
