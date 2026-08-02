package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes9.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i11) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d1  */
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
    static zzaq zzg(int i11, Object[] objArr, zzah zzahVar) {
        int i12;
        boolean z11;
        int i13;
        char c11;
        Object obj;
        char c12;
        short[] sArr;
        boolean z12;
        int i14;
        ?? r16;
        boolean z13;
        boolean z14;
        int i15 = i11;
        Object[] objArr2 = objArr;
        if (i15 == 0) {
            return (zzaq) zza;
        }
        Object obj2 = null;
        boolean z15 = false;
        int i16 = 1;
        if (i15 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            return new zzaq(null, objArr2, 1);
        }
        zzt.zzb(i15, objArr2.length >> 1, "index");
        char c13 = 2;
        int max = Math.max(i15, 2);
        if (max < 751619276) {
            i12 = Integer.highestOneBit(max - 1);
            do {
                i12 += i12;
            } while (i12 * 0.7d < max);
        } else {
            i12 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i15 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzw.zza(obj5, obj6);
            z14 = false;
            i15 = 1;
            i13 = 1;
        } else {
            int i17 = i12 - 1;
            if (i12 <= 128) {
                byte[] bArr = new byte[i12];
                Arrays.fill(bArr, (byte) -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i15) {
                    int i21 = i19 + i19;
                    int i22 = i18 + i18;
                    Object obj7 = objArr2[i22];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i22 ^ i16];
                    Objects.requireNonNull(obj8);
                    zzw.zza(obj7, obj8);
                    int zza2 = zzy.zza(obj7.hashCode());
                    while (true) {
                        int i23 = zza2 & i17;
                        z12 = z15;
                        i14 = i16;
                        int i24 = bArr[i23] & 255;
                        if (i24 == 255) {
                            bArr[i23] = (byte) i21;
                            if (i19 < i18) {
                                objArr2[i21] = obj7;
                                objArr2[i21 ^ 1] = obj8;
                            }
                            i19++;
                        } else {
                            if (obj7.equals(objArr2[i24])) {
                                int i25 = i24 ^ 1;
                                Object obj9 = objArr2[i25];
                                Objects.requireNonNull(obj9);
                                zzag zzagVar = new zzag(obj7, obj8, obj9);
                                objArr2[i25] = obj8;
                                obj2 = zzagVar;
                                break;
                            }
                            zza2 = i23 + 1;
                            z15 = z12;
                            i16 = i14;
                        }
                    }
                    i18++;
                    z15 = z12;
                    i16 = i14;
                }
                z11 = z15;
                i13 = i16;
                if (i19 == i15) {
                    c11 = 2;
                    obj = bArr;
                    r16 = z11;
                    z13 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z13) {
                        Object[] objArr3 = (Object[]) obj;
                        zzag zzagVar2 = (zzag) objArr3[c11];
                        if (zzahVar == null) {
                            throw zzagVar2.zza();
                        }
                        zzahVar.zzc = zzagVar2;
                        Object obj11 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i13]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj10 = obj11;
                        i15 = intValue;
                    }
                    return new zzaq(obj10, objArr2, i15);
                }
                sArr = new Object[3];
                sArr[z11 ? 1 : 0] = bArr;
                sArr[i13] = Integer.valueOf(i19);
                sArr[2] = obj2;
                obj2 = sArr;
                z14 = z11;
            } else {
                z11 = false;
                i13 = 1;
                if (i12 > 32768) {
                    int[] iArr = new int[i12];
                    Arrays.fill(iArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i15) {
                        int i28 = i27 + i27;
                        int i29 = i26 + i26;
                        Object obj12 = objArr2[i29];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i29 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzw.zza(obj12, obj13);
                        int zza3 = zzy.zza(obj12.hashCode());
                        while (true) {
                            int i31 = zza3 & i17;
                            int i32 = iArr[i31];
                            if (i32 == -1) {
                                iArr[i31] = i28;
                                if (i27 < i26) {
                                    objArr2[i28] = obj12;
                                    objArr2[i28 ^ 1] = obj13;
                                }
                                i27++;
                                c12 = c13;
                            } else {
                                c12 = c13;
                                if (obj12.equals(objArr2[i32])) {
                                    int i33 = i32 ^ 1;
                                    Object obj14 = objArr2[i33];
                                    Objects.requireNonNull(obj14);
                                    zzag zzagVar3 = new zzag(obj12, obj13, obj14);
                                    objArr2[i33] = obj13;
                                    obj2 = zzagVar3;
                                    break;
                                }
                                zza3 = i31 + 1;
                                c13 = c12;
                            }
                        }
                        i26++;
                        c13 = c12;
                    }
                    c11 = c13;
                    if (i27 == i15) {
                        obj = iArr;
                        r16 = z11;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i27);
                        objArr4[c11] = obj2;
                        obj = objArr4;
                        r16 = z11;
                    }
                    z13 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z13) {
                    }
                    return new zzaq(obj102, objArr2, i15);
                }
                sArr = new short[i12];
                Arrays.fill(sArr, (short) -1);
                int i34 = 0;
                for (int i35 = 0; i35 < i15; i35++) {
                    int i36 = i34 + i34;
                    int i37 = i35 + i35;
                    Object obj15 = objArr2[i37];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArr2[i37 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzw.zza(obj15, obj16);
                    int zza4 = zzy.zza(obj15.hashCode());
                    while (true) {
                        int i38 = zza4 & i17;
                        char c14 = (char) sArr[i38];
                        if (c14 == 65535) {
                            sArr[i38] = (short) i36;
                            if (i34 < i35) {
                                objArr2[i36] = obj15;
                                objArr2[i36 ^ 1] = obj16;
                            }
                            i34++;
                        } else {
                            if (obj15.equals(objArr2[c14])) {
                                int i39 = c14 ^ 1;
                                Object obj17 = objArr2[i39];
                                Objects.requireNonNull(obj17);
                                zzag zzagVar4 = new zzag(obj15, obj16, obj17);
                                objArr2[i39] = obj16;
                                obj2 = zzagVar4;
                                break;
                            }
                            zza4 = i38 + 1;
                        }
                    }
                }
                if (i34 != i15) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i34), obj2};
                    z14 = z11;
                }
                obj2 = sArr;
                z14 = z11;
            }
        }
        c11 = 2;
        obj = obj2;
        r16 = z14;
        z13 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z13) {
        }
        return new zzaq(obj1022, objArr2, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i11 = this.zzd;
            Object[] objArr = this.zzb;
            if (i11 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i12 = zza2 & length;
                            int i13 = bArr[i12] & 255;
                            if (i13 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            }
                            zza2 = i12 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i14 = zza3 & length2;
                            char c11 = (char) sArr[i14];
                            if (c11 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c11])) {
                                obj2 = objArr[c11 ^ 1];
                                break;
                            }
                            zza3 = i14 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i15 = zza4 & length3;
                            int i16 = iArr[i15];
                            if (i16 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i16])) {
                                obj2 = objArr[i16 ^ 1];
                                break;
                            }
                            zza4 = i15 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
