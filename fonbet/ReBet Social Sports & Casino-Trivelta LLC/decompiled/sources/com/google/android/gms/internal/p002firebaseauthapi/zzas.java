package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes2.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v10;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        if (obj != null) {
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int zza2 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i11 = zza2 & length;
                        int i12 = bArr[i11] & UByte.MAX_VALUE;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            v10 = (V) objArr[i12 ^ 1];
                            break;
                        }
                        zza2 = i11 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int zza3 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i13 = zza3 & length2;
                        int i14 = sArr[i13] & UShort.MAX_VALUE;
                        if (i14 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            v10 = (V) objArr[i14 ^ 1];
                            break;
                        }
                        zza3 = i13 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int zza4 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i15 = zza4 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            v10 = (V) objArr[i16 ^ 1];
                            break;
                        }
                        zza4 = i15 + 1;
                    }
                }
            }
            if (v10 != null) {
                return null;
            }
            return v10;
        }
        v10 = null;
        if (v10 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d5  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> zzas<K, V> zza(int i10, Object[] objArr, zzao<K, V> zzaoVar) {
        int i11;
        boolean z10;
        int i12;
        char c10;
        Object obj;
        char c11;
        short[] sArr;
        boolean z11;
        int i13;
        ?? r16;
        boolean z12;
        boolean z13;
        int i14 = i10;
        Object[] objArr2 = objArr;
        if (i14 == 0) {
            return (zzas) zza;
        }
        Object obj2 = null;
        boolean z14 = false;
        int i15 = 1;
        if (i14 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            return new zzas<>(null, objArr2, 1);
        }
        zzu.zzb(i14, objArr2.length >> 1);
        char c12 = 2;
        int max = Math.max(i14, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1) << 1;
            while (i11 * 0.7d < max) {
                i11 <<= 1;
            }
        } else {
            i11 = 1073741824;
            zzu.zza(max < 1073741824, "collection too large");
        }
        if (i14 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzae.zza(obj5, obj6);
            z13 = false;
            i12 = 1;
        } else {
            int i16 = i11 - 1;
            if (i11 <= 128) {
                byte[] bArr = new byte[i11];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i17 * 2;
                    int i20 = i18 * 2;
                    Object obj7 = objArr2[i19];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i19 ^ i15];
                    Objects.requireNonNull(obj8);
                    zzae.zza(obj7, obj8);
                    int zza2 = zzad.zza(obj7.hashCode());
                    while (true) {
                        int i21 = zza2 & i16;
                        z11 = z14;
                        i13 = i15;
                        int i22 = bArr[i21] & UByte.MAX_VALUE;
                        if (i22 == 255) {
                            bArr[i21] = (byte) i20;
                            if (i18 < i17) {
                                objArr2[i20] = obj7;
                                objArr2[i20 ^ 1] = obj8;
                            }
                            i18++;
                        } else {
                            if (obj7.equals(objArr2[i22])) {
                                int i23 = i22 ^ 1;
                                Object obj9 = objArr2[i23];
                                Objects.requireNonNull(obj9);
                                obj2 = new zzan(obj7, obj8, obj9);
                                objArr2[i23] = obj8;
                                break;
                            }
                            zza2 = i21 + 1;
                            z14 = z11;
                            i15 = i13;
                        }
                    }
                    i17++;
                    z14 = z11;
                    i15 = i13;
                }
                z10 = z14;
                i12 = i15;
                if (i18 == i14) {
                    c10 = 2;
                    obj = bArr;
                    r16 = z10;
                    z12 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z12) {
                        Object[] objArr3 = (Object[]) obj;
                        zzan zzanVar = (zzan) objArr3[c10];
                        if (zzaoVar == null) {
                            throw zzanVar.zza();
                        }
                        zzaoVar.zza = zzanVar;
                        Object obj11 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i12]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue << 1);
                        obj10 = obj11;
                        i14 = intValue;
                    }
                    return new zzas<>(obj10, objArr2, i14);
                }
                sArr = new Object[3];
                sArr[z10 ? 1 : 0] = bArr;
                sArr[i12] = Integer.valueOf(i18);
                sArr[2] = obj2;
                obj2 = sArr;
                z13 = z10;
            } else {
                z10 = false;
                i12 = 1;
                if (i11 > 32768) {
                    int[] iArr = new int[i11];
                    Arrays.fill(iArr, -1);
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < i14) {
                        int i26 = i24 * 2;
                        int i27 = i25 * 2;
                        Object obj12 = objArr2[i26];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i26 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzae.zza(obj12, obj13);
                        int zza3 = zzad.zza(obj12.hashCode());
                        while (true) {
                            int i28 = zza3 & i16;
                            int i29 = iArr[i28];
                            if (i29 == -1) {
                                iArr[i28] = i27;
                                if (i25 < i24) {
                                    objArr2[i27] = obj12;
                                    objArr2[i27 ^ 1] = obj13;
                                }
                                i25++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj12.equals(objArr2[i29])) {
                                    int i30 = i29 ^ 1;
                                    Object obj14 = objArr2[i30];
                                    Objects.requireNonNull(obj14);
                                    obj2 = new zzan(obj12, obj13, obj14);
                                    objArr2[i30] = obj13;
                                    break;
                                }
                                zza3 = i28 + 1;
                                c12 = c11;
                            }
                        }
                        i24++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i25 == i14) {
                        obj = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i25);
                        objArr4[c10] = obj2;
                        obj = objArr4;
                        r16 = z10;
                    }
                    z12 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z12) {
                    }
                    return new zzas<>(obj102, objArr2, i14);
                }
                sArr = new short[i11];
                Arrays.fill(sArr, (short) -1);
                int i31 = 0;
                for (int i32 = 0; i32 < i14; i32++) {
                    int i33 = i32 * 2;
                    int i34 = i31 * 2;
                    Object obj15 = objArr2[i33];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArr2[i33 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzae.zza(obj15, obj16);
                    int zza4 = zzad.zza(obj15.hashCode());
                    while (true) {
                        int i35 = zza4 & i16;
                        int i36 = sArr[i35] & UShort.MAX_VALUE;
                        if (i36 == 65535) {
                            sArr[i35] = (short) i34;
                            if (i31 < i32) {
                                objArr2[i34] = obj15;
                                objArr2[i34 ^ 1] = obj16;
                            }
                            i31++;
                        } else {
                            if (obj15.equals(objArr2[i36])) {
                                int i37 = i36 ^ 1;
                                Object obj17 = objArr2[i37];
                                Objects.requireNonNull(obj17);
                                obj2 = new zzan(obj15, obj16, obj17);
                                objArr2[i37] = obj16;
                                break;
                            }
                            zza4 = i35 + 1;
                        }
                    }
                }
                if (i31 != i14) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i31), obj2};
                    z13 = z10;
                }
                obj2 = sArr;
                z13 = z10;
            }
        }
        c10 = 2;
        obj = obj2;
        r16 = z13;
        z12 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z12) {
        }
        return new zzas<>(obj1022, objArr2, i14);
    }
}
