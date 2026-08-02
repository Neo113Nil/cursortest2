package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzih extends zzhy {
    static final zzhy zza = new zzih(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzih(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
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
    public static zzih zzh(int i, Object[] objArr, zzhx zzhxVar) {
        boolean z;
        int i2;
        int i3;
        short[] sArr;
        boolean z2;
        byte[] bArr;
        boolean z3;
        ?? r16;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzih) zza;
        }
        Object obj = null;
        boolean z4 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzhm.zza(obj2, obj3);
            return new zzih(null, objArr2, 1);
        }
        zzhd.zzc(i4, objArr2.length >> 1, "index");
        int zzi = zzhz.zzi(i4);
        if (i4 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzhm.zza(obj4, obj5);
            r16 = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = zzi - 1;
            if (zzi <= 128) {
                byte[] bArr2 = new byte[zzi];
                Arrays.fill(bArr2, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj6 = objArr2[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i10 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzhm.zza(obj6, obj7);
                    int zza2 = zzho.zza(obj6.hashCode());
                    while (true) {
                        int i11 = zza2 & i6;
                        z3 = z4;
                        int i12 = bArr2[i11] & 255;
                        if (i12 == 255) {
                            bArr2[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = obj6;
                                objArr2[i9 ^ 1] = obj7;
                            }
                            i8++;
                        } else {
                            if (obj6.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj8 = objArr2[i13];
                                Objects.requireNonNull(obj8);
                                zzhw zzhwVar = new zzhw(obj6, obj7, obj8);
                                objArr2[i13] = obj7;
                                obj = zzhwVar;
                                break;
                            }
                            zza2 = i11 + 1;
                            z4 = z3;
                        }
                    }
                    i7++;
                    z4 = z3;
                }
                z = z4;
                bArr = bArr2;
                z2 = z;
                if (i8 != i4) {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr2;
                    sArr[1] = Integer.valueOf(i8);
                    sArr[2] = obj;
                    obj = sArr;
                    i2 = 1;
                    r16 = z;
                }
                i2 = 1;
                obj = bArr;
                r16 = z2;
            } else {
                z = false;
                if (zzi <= 32768) {
                    sArr = new short[zzi];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj9 = objArr2[i17];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i17 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzhm.zza(obj9, obj10);
                        int zza3 = zzho.zza(obj9.hashCode());
                        while (true) {
                            int i18 = zza3 & i6;
                            char c = (char) sArr[i18];
                            if (c == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArr2[i16] = obj9;
                                    objArr2[i16 ^ 1] = obj10;
                                }
                                i14++;
                            } else {
                                if (obj9.equals(objArr2[c])) {
                                    int i19 = c ^ 1;
                                    Object obj11 = objArr2[i19];
                                    Objects.requireNonNull(obj11);
                                    zzhw zzhwVar2 = new zzhw(obj9, obj10, obj11);
                                    objArr2[i19] = obj10;
                                    obj = zzhwVar2;
                                    break;
                                }
                                zza3 = i18 + 1;
                            }
                        }
                    }
                    if (i14 != i4) {
                        bArr = new Object[]{sArr, Integer.valueOf(i14), obj};
                        z2 = z;
                        i2 = 1;
                        obj = bArr;
                        r16 = z2;
                    }
                    obj = sArr;
                    i2 = 1;
                    r16 = z;
                } else {
                    int[] iArr = new int[zzi];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj12 = objArr2[i23];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i23 ^ i5];
                        Objects.requireNonNull(obj13);
                        zzhm.zza(obj12, obj13);
                        int zza4 = zzho.zza(obj12.hashCode());
                        while (true) {
                            int i24 = zza4 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArr2[i22] = obj12;
                                    objArr2[i22 ^ 1] = obj13;
                                }
                                i21++;
                                i3 = i5;
                            } else {
                                i3 = i5;
                                if (obj12.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj14 = objArr2[i26];
                                    Objects.requireNonNull(obj14);
                                    zzhw zzhwVar3 = new zzhw(obj12, obj13, obj14);
                                    objArr2[i26] = obj13;
                                    obj = zzhwVar3;
                                    break;
                                }
                                zza4 = i24 + 1;
                                i5 = i3;
                            }
                        }
                        i20++;
                        i5 = i3;
                    }
                    i2 = i5;
                    if (i21 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[i2] = Integer.valueOf(i21);
                        objArr3[2] = obj;
                        obj = objArr3;
                        r16 = z;
                    }
                }
            }
        }
        boolean z5 = obj instanceof Object[];
        Object obj15 = obj;
        if (z5) {
            Object[] objArr4 = (Object[]) obj;
            zzhxVar.zzc = (zzhw) objArr4[2];
            Object obj16 = objArr4[r16];
            int intValue = ((Integer) objArr4[i2]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i4 = intValue;
        }
        return new zzih(obj15, objArr2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.zzhy, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
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
                        int zza2 = zzho.zza(obj.hashCode());
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
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzho.zza(obj.hashCode());
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
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzho.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.cast.zzhy
    public final zzhz zzd() {
        return new zzie(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzhy
    public final zzhz zze() {
        return new zzif(this, new zzig(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.cast.zzhy
    public final zzhr zzg() {
        return new zzig(this.zzb, 1, this.zzd);
    }
}
