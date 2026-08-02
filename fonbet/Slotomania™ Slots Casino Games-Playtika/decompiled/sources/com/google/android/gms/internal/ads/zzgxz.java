package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgxz extends zzgwc {
    static final zzgwc zza = new zzgxz(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgxz(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01be  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgxz zzk(int i, Object[] objArr, zzgwb zzgwbVar) {
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzgxz) zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            zzguv.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzgxz(null, objArr2, 1);
        }
        zzgsw.zzn(i4, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzo = zzgwj.zzo(i4);
        char c3 = 2;
        if (i4 == 1) {
            zzguv.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            z4 = false;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = zzo - 1;
            if (zzo <= 128) {
                byte[] bArr = new byte[zzo];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i10]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i10 ^ i5]);
                    zzguv.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzgvs.zza(requireNonNull.hashCode());
                    while (true) {
                        int i11 = zza2 & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = requireNonNull;
                                objArr2[i9 ^ 1] = requireNonNull2;
                            }
                            i8++;
                        } else {
                            if (requireNonNull.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                zzgwa zzgwaVar = new zzgwa(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i13]));
                                objArr2[i13] = requireNonNull2;
                                obj2 = zzgwaVar;
                                break;
                            }
                            zza2 = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (zzo > 32768) {
                    int[] iArr = new int[zzo];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i15 + i15;
                        int i17 = i14 + i14;
                        Object requireNonNull3 = Objects.requireNonNull(objArr2[i17]);
                        Object requireNonNull4 = Objects.requireNonNull(objArr2[i17 ^ 1]);
                        zzguv.zza(requireNonNull3, requireNonNull4);
                        int zza3 = zzgvs.zza(requireNonNull3.hashCode());
                        while (true) {
                            int i18 = zza3 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i16;
                                if (i15 < i14) {
                                    objArr2[i16] = requireNonNull3;
                                    objArr2[i16 ^ 1] = requireNonNull4;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (requireNonNull3.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    zzgwa zzgwaVar2 = new zzgwa(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i20]));
                                    objArr2[i20] = requireNonNull4;
                                    obj2 = zzgwaVar2;
                                    break;
                                }
                                zza3 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj3 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        zzgwa zzgwaVar3 = (zzgwa) objArr4[c];
                        if (zzgwbVar == null) {
                            throw zzgwaVar3.zza();
                        }
                        zzgwbVar.zzc = zzgwaVar3;
                        Object obj4 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj3 = obj4;
                        i4 = intValue;
                    }
                    return new zzgxz(obj3, objArr2, i4);
                }
                sArr = new short[zzo];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i24]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i24 ^ 1]);
                    zzguv.zza(requireNonNull5, requireNonNull6);
                    int zza4 = zzgvs.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i25 = zza4 & i6;
                        char c4 = (char) sArr[i25];
                        if (c4 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArr2[i23] = requireNonNull5;
                                objArr2[i23 ^ 1] = requireNonNull6;
                            }
                            i21++;
                        } else {
                            if (requireNonNull5.equals(objArr2[c4])) {
                                int i26 = c4 ^ 1;
                                zzgwa zzgwaVar4 = new zzgwa(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i26]));
                                objArr2[i26] = requireNonNull6;
                                obj2 = zzgwaVar4;
                                break;
                            }
                            zza4 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
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
        Object obj32 = obj;
        if (z3) {
        }
        return new zzgxz(obj32, objArr2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
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
                        int zza2 = zzgvs.zza(obj.hashCode());
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
                        int zza3 = zzgvs.zza(obj.hashCode());
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
                        int zza4 = zzgvs.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.ads.zzgwc
    final zzgwj zze() {
        return new zzgxw(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    final zzgwj zzg() {
        return new zzgxx(this, new zzgxy(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    final zzgvv zzi() {
        return new zzgxy(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    final boolean zzj() {
        return false;
    }
}
