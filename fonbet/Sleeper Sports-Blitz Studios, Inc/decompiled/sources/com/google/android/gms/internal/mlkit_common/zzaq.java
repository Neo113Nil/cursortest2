package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.mlkit:common@@18.11.0 */
/* loaded from: classes7.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01de  */
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
    static zzaq zzg(int i, Object[] objArr, zzah zzahVar) {
        int i2;
        boolean z;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        boolean z4;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return (zzaq) zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            zzw.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzaq(null, objArr2, 1);
        }
        zzt.zzb(i5, objArr2.length >> 1, "index");
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i5 == 1) {
            zzw.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            z4 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i11]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i11 ^ i6]);
                    zzw.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzy.zza(requireNonNull.hashCode());
                    while (true) {
                        int i12 = zza2 & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = requireNonNull;
                                objArr2[i10 ^ 1] = requireNonNull2;
                            }
                            i9++;
                        } else {
                            if (requireNonNull.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                zzag zzagVar = new zzag(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i14]));
                                objArr2[i14] = requireNonNull2;
                                obj2 = zzagVar;
                                break;
                            }
                            zza2 = i12 + 1;
                            z5 = z2;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj3 = obj;
                    if (z3) {
                        Object[] objArr3 = (Object[]) obj;
                        zzag zzagVar2 = (zzag) objArr3[c];
                        if (zzahVar == null) {
                            throw zzagVar2.zza();
                        }
                        zzahVar.zzc = zzagVar2;
                        Object obj4 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj3 = obj4;
                        i5 = intValue;
                    }
                    return new zzaq(obj3, objArr2, i5);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i3 = 1;
                if (i2 > 32768) {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i16 + i16;
                        int i18 = i15 + i15;
                        Object requireNonNull3 = Objects.requireNonNull(objArr2[i18]);
                        Object requireNonNull4 = Objects.requireNonNull(objArr2[i18 ^ 1]);
                        zzw.zza(requireNonNull3, requireNonNull4);
                        int zza3 = zzy.zza(requireNonNull3.hashCode());
                        while (true) {
                            int i19 = zza3 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i17;
                                if (i16 < i15) {
                                    objArr2[i17] = requireNonNull3;
                                    objArr2[i17 ^ 1] = requireNonNull4;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (requireNonNull3.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    zzag zzagVar3 = new zzag(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i21]));
                                    objArr2[i21] = requireNonNull4;
                                    obj2 = zzagVar3;
                                    break;
                                }
                                zza3 = i19 + 1;
                                c3 = c2;
                            }
                        }
                        i15++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i16 == i5) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i16);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj32 = obj;
                    if (z3) {
                    }
                    return new zzaq(obj32, objArr2, i5);
                }
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i25]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i25 ^ 1]);
                    zzw.zza(requireNonNull5, requireNonNull6);
                    int zza4 = zzy.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i26 = zza4 & i7;
                        char c4 = (char) sArr[i26];
                        if (c4 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = requireNonNull5;
                                objArr2[i24 ^ 1] = requireNonNull6;
                            }
                            i22++;
                        } else {
                            if (requireNonNull5.equals(objArr2[c4])) {
                                int i27 = c4 ^ 1;
                                zzag zzagVar4 = new zzag(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i27]));
                                objArr2[i27] = requireNonNull6;
                                obj2 = zzagVar4;
                                break;
                            }
                            zza4 = i26 + 1;
                        }
                    }
                }
                if (i22 != i5) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj322 = obj;
        if (z3) {
        }
        return new zzaq(obj322, objArr2, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj3 = this.zzc;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int zza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int zza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int zza4 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = Objects.requireNonNull(objArr[1]);
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
