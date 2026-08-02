package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzhz extends zzhr implements Set {
    private transient zzhv zza;

    public static zzhz zzh() {
        return zzii.zza;
    }

    public static int zzi(int i) {
        int max = Math.max(i, 2);
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

    public static zzhz zzj(Collection collection) {
        Object[] array = collection.toArray();
        return zzm(array.length, array);
    }

    private static zzhz zzm(int i, Object... objArr) {
        if (i == 0) {
            return zzii.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzik(obj);
        }
        int zzi = zzi(i);
        Object[] objArr2 = new Object[zzi];
        int i2 = zzi - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzib.zzb(obj2, i5);
            int hashCode = obj2.hashCode();
            int zza = zzho.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzik(obj4);
        }
        if (zzi(i4) < zzi / 2) {
            return zzm(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzii(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzhz) && zzk() && ((zzhz) obj).zzk() && hashCode() != obj.hashCode()) {
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
        return zzij.zza(this);
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract zzil iterator();

    @Override // com.google.android.gms.internal.cast.zzhr
    public zzhv zze() {
        zzhv zzhvVar = this.zza;
        if (zzhvVar != null) {
            return zzhvVar;
        }
        zzhv zzl = zzl();
        this.zza = zzl;
        return zzl;
    }

    public boolean zzk() {
        return false;
    }

    public zzhv zzl() {
        Object[] array = toArray();
        int i = zzhv.zzd;
        return zzhv.zzk(array, array.length);
    }
}
