package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;

/* loaded from: classes2.dex */
final class zzbv extends zzbn {
    static final zzbn zza = new zzbv(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbv(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    public static zzbv zzg(int i10, Object[] objArr, zzbm zzbmVar) {
        boolean z10;
        int i11;
        int i12;
        short[] sArr;
        boolean z11;
        byte[] bArr;
        boolean z12;
        ?? r16;
        int i13 = i10;
        Object[] objArr2 = objArr;
        if (i13 == 0) {
            return (zzbv) zza;
        }
        Object obj = null;
        boolean z13 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzbf.zza(obj2, obj3);
            return new zzbv(null, objArr2, 1);
        }
        zzbc.zzb(i13, objArr2.length >> 1, "index");
        int zzf = zzbo.zzf(i13);
        if (i13 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzbf.zza(obj4, obj5);
            r16 = 0;
            i13 = 1;
            i11 = 1;
        } else {
            int i15 = zzf - 1;
            if (zzf <= 128) {
                byte[] bArr2 = new byte[zzf];
                Arrays.fill(bArr2, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj6 = objArr2[i19];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i19 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbf.zza(obj6, obj7);
                    int zza2 = zzbg.zza(obj6.hashCode());
                    while (true) {
                        int i20 = zza2 & i15;
                        z12 = z13;
                        int i21 = bArr2[i20] & UByte.MAX_VALUE;
                        if (i21 == 255) {
                            bArr2[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArr2[i18] = obj6;
                                objArr2[i18 ^ 1] = obj7;
                            }
                            i17++;
                        } else {
                            if (obj6.equals(objArr2[i21])) {
                                int i22 = i21 ^ 1;
                                Object obj8 = objArr2[i22];
                                Objects.requireNonNull(obj8);
                                zzbl zzblVar = new zzbl(obj6, obj7, obj8);
                                objArr2[i22] = obj7;
                                obj = zzblVar;
                                break;
                            }
                            zza2 = i20 + 1;
                            z13 = z12;
                        }
                    }
                    i16++;
                    z13 = z12;
                }
                z10 = z13;
                bArr = bArr2;
                z11 = z10;
                if (i17 != i13) {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr2;
                    sArr[1] = Integer.valueOf(i17);
                    sArr[2] = obj;
                    obj = sArr;
                    i11 = 1;
                    r16 = z10;
                }
                i11 = 1;
                obj = bArr;
                r16 = z11;
            } else {
                z10 = false;
                if (zzf <= 32768) {
                    sArr = new short[zzf];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj9 = objArr2[i26];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i26 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbf.zza(obj9, obj10);
                        int zza3 = zzbg.zza(obj9.hashCode());
                        while (true) {
                            int i27 = zza3 & i15;
                            char c10 = (char) sArr[i27];
                            if (c10 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArr2[i25] = obj9;
                                    objArr2[i25 ^ 1] = obj10;
                                }
                                i23++;
                            } else {
                                if (obj9.equals(objArr2[c10])) {
                                    int i28 = c10 ^ 1;
                                    Object obj11 = objArr2[i28];
                                    Objects.requireNonNull(obj11);
                                    zzbl zzblVar2 = new zzbl(obj9, obj10, obj11);
                                    objArr2[i28] = obj10;
                                    obj = zzblVar2;
                                    break;
                                }
                                zza3 = i27 + 1;
                            }
                        }
                    }
                    if (i23 != i13) {
                        bArr = new Object[]{sArr, Integer.valueOf(i23), obj};
                        z11 = z10;
                        i11 = 1;
                        obj = bArr;
                        r16 = z11;
                    }
                    obj = sArr;
                    i11 = 1;
                    r16 = z10;
                } else {
                    int[] iArr = new int[zzf];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj12 = objArr2[i32];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i32 ^ i14];
                        Objects.requireNonNull(obj13);
                        zzbf.zza(obj12, obj13);
                        int zza4 = zzbg.zza(obj12.hashCode());
                        while (true) {
                            int i33 = zza4 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArr2[i31] = obj12;
                                    objArr2[i31 ^ 1] = obj13;
                                }
                                i30++;
                                i12 = i14;
                            } else {
                                i12 = i14;
                                if (obj12.equals(objArr2[i34])) {
                                    int i35 = i34 ^ 1;
                                    Object obj14 = objArr2[i35];
                                    Objects.requireNonNull(obj14);
                                    zzbl zzblVar3 = new zzbl(obj12, obj13, obj14);
                                    objArr2[i35] = obj13;
                                    obj = zzblVar3;
                                    break;
                                }
                                zza4 = i33 + 1;
                                i14 = i12;
                            }
                        }
                        i29++;
                        i14 = i12;
                    }
                    i11 = i14;
                    if (i30 == i13) {
                        obj = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[i11] = Integer.valueOf(i30);
                        objArr3[2] = obj;
                        obj = objArr3;
                        r16 = z10;
                    }
                }
            }
        }
        boolean z14 = obj instanceof Object[];
        Object obj15 = obj;
        if (z14) {
            Object[] objArr4 = (Object[]) obj;
            zzbmVar.zzc = (zzbl) objArr4[2];
            Object obj16 = objArr4[r16];
            int intValue = ((Integer) objArr4[i11]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i13 = intValue;
        }
        return new zzbv(obj15, objArr2, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.maps.zzbn, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i10 = this.zzd;
            Object[] objArr = this.zzb;
            if (i10 == 1) {
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
                        int zza2 = zzbg.zza(obj.hashCode());
                        while (true) {
                            int i11 = zza2 & length;
                            int i12 = bArr[i11] & UByte.MAX_VALUE;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            zza2 = i11 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzbg.zza(obj.hashCode());
                        while (true) {
                            int i13 = zza3 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            zza3 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzbg.zza(obj.hashCode());
                        while (true) {
                            int i14 = zza4 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            }
                            zza4 = i14 + 1;
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

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbh zza() {
        return new zzbu(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zzd() {
        return new zzbs(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zze() {
        return new zzbt(this, new zzbu(this.zzb, 0, this.zzd));
    }
}
