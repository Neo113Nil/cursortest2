package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i10, int i11, zznm zznmVar, boolean z10, int[] iArr2, int i12, int i13, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j10) {
        return ((Double) zzop.zzn(obj, j10)).doubleValue();
    }

    private static float zzD(Object obj, long j10) {
        return ((Float) zzop.zzn(obj, j10)).floatValue();
    }

    private static int zzE(Object obj, long j10) {
        return ((Integer) zzop.zzn(obj, j10)).intValue();
    }

    private static long zzF(Object obj, long j10) {
        return ((Long) zzop.zzn(obj, j10)).longValue();
    }

    private static boolean zzG(Object obj, long j10) {
        return ((Boolean) zzop.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        return zzJ(obj, i10) == zzJ(obj2, i10);
    }

    private final boolean zzI(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzJ(obj, i10) : (i12 & i13) != 0;
    }

    private final boolean zzJ(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = zzy & 1048575;
        if (j10 != 1048575) {
            return (zzop.zzd(obj, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i10);
        long j11 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j11)) != 0;
            case 2:
                return zzop.zzf(obj, j11) != 0;
            case 3:
                return zzop.zzf(obj, j11) != 0;
            case 4:
                return zzop.zzd(obj, j11) != 0;
            case 5:
                return zzop.zzf(obj, j11) != 0;
            case 6:
                return zzop.zzd(obj, j11) != 0;
            case 7:
                return zzop.zzh(obj, j11);
            case 8:
                Object zzn = zzop.zzn(obj, j11);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzlh) {
                    return !zzlh.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j11) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j11));
            case 11:
                return zzop.zzd(obj, j11) != 0;
            case 12:
                return zzop.zzd(obj, j11) != 0;
            case 13:
                return zzop.zzd(obj, j11) != 0;
            case 14:
                return zzop.zzf(obj, j11) != 0;
            case 15:
                return zzop.zzd(obj, j11) != 0;
            case 16:
                return zzop.zzf(obj, j11) != 0;
            case 17:
                return zzop.zzn(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = 1048575 & zzy;
        if (j10 == 1048575) {
            return;
        }
        zzop.zze(obj, j10, (1 << (zzy >>> 20)) | zzop.zzd(obj, j10));
    }

    private final boolean zzL(Object obj, int i10, int i11) {
        return zzop.zzd(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private final void zzM(Object obj, int i10, int i11) {
        zzop.zze(obj, zzy(i11) & 1048575, i10);
    }

    private final int zzN(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static final int zzO(byte[] bArr, int i10, int i11, zzot zzotVar, Class cls, zzkw zzkwVar) {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int zzc = zzkx.zzc(bArr, i10, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzkx.zza(bArr, i10, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return zza2;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i10));
                return i15;
            case 7:
                int zzc2 = zzkx.zzc(bArr, i10, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return zzc2;
            case 8:
                return zzkx.zzf(bArr, i10, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i10, i11, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i10, zzkwVar);
            case 16:
                int zza3 = zzkx.zza(bArr, i10, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return zza3;
            case 17:
                int zzc3 = zzkx.zzc(bArr, i10, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return zzc3;
        }
    }

    private static final void zzP(int i10, Object obj, zzov zzovVar) {
        if (obj instanceof String) {
            zzovVar.zzm(i10, (String) obj);
        } else {
            zzovVar.zzn(i10, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzb2 = zzoj.zzb();
        zzmfVar.zzc = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        int objectFieldOffset;
        char c10;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zzm;
        char charAt10;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field zzm2;
        Object obj2;
        Field zzm3;
        int i39;
        char charAt11;
        int i40;
        char charAt12;
        int i41;
        char charAt13;
        int i42;
        char charAt14;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String zzd = zznwVar.zzd();
        int length = zzd.length();
        char c11 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (zzd.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int charAt15 = zzd.charAt(i10);
        if (charAt15 >= 55296) {
            int i45 = charAt15 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt14 = zzd.charAt(i44);
                if (charAt14 < 55296) {
                    break;
                }
                i45 |= (charAt14 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt15 = i45 | (charAt14 << i46);
            i44 = i42;
        }
        if (charAt15 == 0) {
            i12 = 0;
            i15 = 0;
            charAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt16 = zzd.charAt(i44);
            if (charAt16 >= 55296) {
                int i48 = charAt16 & 8191;
                int i49 = 13;
                while (true) {
                    i24 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i24;
                }
                charAt16 = i48 | (charAt9 << i49);
                i47 = i24;
            }
            int i50 = i47 + 1;
            int charAt17 = zzd.charAt(i47);
            if (charAt17 >= 55296) {
                int i51 = charAt17 & 8191;
                int i52 = 13;
                while (true) {
                    i23 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i23;
                }
                charAt17 = i51 | (charAt8 << i52);
                i50 = i23;
            }
            int i53 = i50 + 1;
            int charAt18 = zzd.charAt(i50);
            if (charAt18 >= 55296) {
                int i54 = charAt18 & 8191;
                int i55 = 13;
                while (true) {
                    i22 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i22;
                }
                charAt18 = i54 | (charAt7 << i55);
                i53 = i22;
            }
            int i56 = i53 + 1;
            int charAt19 = zzd.charAt(i53);
            if (charAt19 >= 55296) {
                int i57 = charAt19 & 8191;
                int i58 = 13;
                while (true) {
                    i21 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i21;
                }
                charAt19 = i57 | (charAt6 << i58);
                i56 = i21;
            }
            int i59 = i56 + 1;
            charAt = zzd.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i20 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i20;
                }
                charAt = i60 | (charAt5 << i61);
                i59 = i20;
            }
            int i62 = i59 + 1;
            int charAt20 = zzd.charAt(i59);
            if (charAt20 >= 55296) {
                int i63 = charAt20 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                charAt20 = i63 | (charAt4 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int charAt21 = zzd.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    charAt3 = zzd.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                charAt21 = i66 | (charAt3 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int charAt22 = zzd.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i70 = 13;
                while (true) {
                    i17 = i68 + 1;
                    charAt2 = zzd.charAt(i68);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i69 |= (charAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i17;
                }
                charAt22 = i69 | (charAt2 << i70);
                i68 = i17;
            }
            int i71 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i72 = charAt20;
            i11 = charAt18;
            i12 = i72;
            i13 = charAt19;
            i14 = charAt22;
            i15 = i71;
            iArr = iArr2;
            i16 = charAt16;
            i44 = i68;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i73 = i14 + i12;
        int i74 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i74];
        int i75 = i14;
        int i76 = i73;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int charAt23 = zzd.charAt(i44);
            if (charAt23 >= c11) {
                int i80 = charAt23 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i41 = i81 + 1;
                    charAt13 = zzd.charAt(i81);
                    if (charAt13 < c11) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i82;
                    i82 += 13;
                    i81 = i41;
                }
                charAt23 = i80 | (charAt13 << i82);
                i25 = i41;
            } else {
                i25 = i79;
            }
            int i83 = i25 + 1;
            int charAt24 = zzd.charAt(i25);
            if (charAt24 >= c11) {
                int i84 = charAt24 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i40 = i85 + 1;
                    charAt12 = zzd.charAt(i85);
                    if (charAt12 < c11) {
                        break;
                    }
                    i84 |= (charAt12 & 8191) << i86;
                    i86 += 13;
                    i85 = i40;
                }
                charAt24 = i84 | (charAt12 << i86);
                i26 = i40;
            } else {
                i26 = i83;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            int i87 = charAt24 & 255;
            zznw zznwVar2 = zznwVar;
            int i88 = charAt24 & 2048;
            if (i87 >= 51) {
                int i89 = i26 + 1;
                int charAt25 = zzd.charAt(i26);
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i90 = charAt25 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i39 = i91 + 1;
                        charAt11 = zzd.charAt(i91);
                        if (charAt11 < c12) {
                            break;
                        }
                        i90 |= (charAt11 & 8191) << i92;
                        i92 += 13;
                        i91 = i39;
                        c12 = 55296;
                    }
                    charAt25 = i90 | (charAt11 << i92);
                    i36 = i39;
                } else {
                    i36 = i89;
                }
                int i93 = i36;
                int i94 = i87 - 51;
                i27 = length;
                if (i94 == 9 || i94 == 17) {
                    i37 = i15 + 1;
                    int i95 = i78 / 3;
                    objArr[i95 + i95 + 1] = zze[i15];
                } else {
                    if (i94 == 12) {
                        if (zznwVar2.zzc() == 1 || i88 != 0) {
                            i37 = i15 + 1;
                            int i96 = i78 / 3;
                            objArr[i96 + i96 + 1] = zze[i15];
                        } else {
                            i38 = 0;
                            int i97 = charAt25 + charAt25;
                            obj = zze[i97];
                            int i98 = i38;
                            if (obj instanceof Field) {
                                zzm2 = (Field) obj;
                            } else {
                                zzm2 = zzm(cls2, (String) obj);
                                zze[i97] = zzm2;
                            }
                            int i99 = i16;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                            int i100 = i97 + 1;
                            obj2 = zze[i100];
                            i28 = i99;
                            if (obj2 instanceof Field) {
                                zzm3 = (Field) obj2;
                            } else {
                                zzm3 = zzm(cls2, (String) obj2);
                                zze[i100] = zzm3;
                            }
                            i30 = (int) unsafe.objectFieldOffset(zzm3);
                            str = zzd;
                            i32 = i98;
                            i26 = i93;
                            i31 = 0;
                            c10 = 55296;
                        }
                    }
                    i38 = i88;
                    int i972 = charAt25 + charAt25;
                    obj = zze[i972];
                    int i982 = i38;
                    if (obj instanceof Field) {
                    }
                    int i992 = i16;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                    int i1002 = i972 + 1;
                    obj2 = zze[i1002];
                    i28 = i992;
                    if (obj2 instanceof Field) {
                    }
                    i30 = (int) unsafe.objectFieldOffset(zzm3);
                    str = zzd;
                    i32 = i982;
                    i26 = i93;
                    i31 = 0;
                    c10 = 55296;
                }
                i15 = i37;
                i38 = i88;
                int i9722 = charAt25 + charAt25;
                obj = zze[i9722];
                int i9822 = i38;
                if (obj instanceof Field) {
                }
                int i9922 = i16;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                int i10022 = i9722 + 1;
                obj2 = zze[i10022];
                i28 = i9922;
                if (obj2 instanceof Field) {
                }
                i30 = (int) unsafe.objectFieldOffset(zzm3);
                str = zzd;
                i32 = i9822;
                i26 = i93;
                i31 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i16;
                int i101 = i15 + 1;
                Field zzm4 = zzm(cls2, (String) zze[i15]);
                if (i87 == 9 || i87 == 17) {
                    i29 = i101;
                    int i102 = i78 / 3;
                    objArr[i102 + i102 + 1] = zzm4.getType();
                } else {
                    if (i87 == 27) {
                        i34 = i101;
                        i35 = 1;
                        i15 += 2;
                    } else if (i87 == 49) {
                        i15 += 2;
                        i34 = i101;
                        i35 = 1;
                    } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                        if (zznwVar2.zzc() == 1 || i88 != 0) {
                            i15 += 2;
                            int i103 = i78 / 3;
                            objArr[i103 + i103 + 1] = zze[i101];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0 || i87 > 17) {
                                c10 = 55296;
                                i30 = 1048575;
                                i31 = 0;
                            } else {
                                int i104 = i26 + 1;
                                int charAt26 = str.charAt(i26);
                                if (charAt26 >= 55296) {
                                    int i105 = charAt26 & 8191;
                                    int i106 = 13;
                                    while (true) {
                                        i33 = i104 + 1;
                                        charAt10 = str.charAt(i104);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i105 |= (charAt10 & 8191) << i106;
                                        i106 += 13;
                                        i104 = i33;
                                    }
                                    charAt26 = i105 | (charAt10 << i106);
                                } else {
                                    i33 = i104;
                                }
                                int i107 = i28 + i28 + (charAt26 / 32);
                                Object obj3 = zze[i107];
                                if (obj3 instanceof Field) {
                                    zzm = (Field) obj3;
                                } else {
                                    zzm = zzm(cls2, (String) obj3);
                                    zze[i107] = zzm;
                                }
                                int i108 = charAt26;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm);
                                i31 = i108 % 32;
                                i26 = i33;
                                c10 = 55296;
                                i30 = objectFieldOffset2;
                            }
                            if (i87 >= 18 && i87 <= 49) {
                                iArr[i76] = objectFieldOffset;
                                i76++;
                            }
                            i32 = i88;
                        } else {
                            str = zzd;
                            i15 = i101;
                            i88 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c10 = 55296;
                            i30 = 1048575;
                            i31 = 0;
                            if (i87 >= 18) {
                                iArr[i76] = objectFieldOffset;
                                i76++;
                            }
                            i32 = i88;
                        }
                    } else if (i87 == 50) {
                        int i109 = i15 + 2;
                        int i110 = i75 + 1;
                        iArr[i75] = i78;
                        int i111 = i78 / 3;
                        int i112 = i111 + i111;
                        objArr[i112] = zze[i101];
                        if (i88 != 0) {
                            objArr[i112 + 1] = zze[i109];
                            i15 += 3;
                            str = zzd;
                            i75 = i110;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c10 = 55296;
                            i30 = 1048575;
                            i31 = 0;
                            if (i87 >= 18) {
                            }
                            i32 = i88;
                        } else {
                            i15 = i109;
                            i75 = i110;
                            i88 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c10 = 55296;
                            i30 = 1048575;
                            i31 = 0;
                            if (i87 >= 18) {
                            }
                            i32 = i88;
                        }
                    } else {
                        i29 = i101;
                    }
                    int i113 = i78 / 3;
                    objArr[i113 + i113 + i35] = zze[i34];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c10 = 55296;
                    i30 = 1048575;
                    i31 = 0;
                    if (i87 >= 18) {
                    }
                    i32 = i88;
                }
                str = zzd;
                i15 = i29;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                if ((charAt24 & 4096) != 0) {
                }
                c10 = 55296;
                i30 = 1048575;
                i31 = 0;
                if (i87 >= 18) {
                }
                i32 = i88;
            }
            int i114 = i78 + 1;
            iArr3[i78] = charAt23;
            int i115 = i78 + 2;
            iArr3[i114] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i32 != 0 ? Integer.MIN_VALUE : 0) | (i87 << 20) | objectFieldOffset;
            i78 += 3;
            iArr3[i115] = (i31 << 20) | i30;
            i44 = i26;
            zzd = str;
            c11 = c10;
            zznwVar = zznwVar2;
            length = i27;
            i16 = i28;
        }
        return new zznp(iArr3, objArr, i11, i13, zznwVar.zzb(), false, iArr, i14, i73, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzn(Object obj, Object obj2, int i10) {
        if (zzJ(obj2, i10)) {
            int zzx = zzx(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzx;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zznx zzp = zzp(i10);
            if (!zzJ(obj, i10)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j10, zza2);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzK(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j10, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzL(obj2, i11, i10)) {
            int zzx = zzx(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzx;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zznx zzp = zzp(i10);
            if (!zzL(obj, i11, i10)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j10, zza2);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzM(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j10, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zznx zznxVar = (zznx) objArr[i12];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zzb2 = zznu.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzb2;
        return zzb2;
    }

    private final Object zzq(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzmk zzr(int i10) {
        int i11 = i10 / 3;
        return (zzmk) this.zzd[i11 + i11 + 1];
    }

    private final Object zzs(Object obj, int i10) {
        zznx zzp = zzp(i10);
        int zzx = zzx(i10) & 1048575;
        if (!zzJ(obj, i10)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzx(i10) & 1048575, obj2);
        zzK(obj, i10);
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zznx zzp = zzp(i11);
        if (!zzL(obj, i10, i11)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i11) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzx(i11) & 1048575, obj2);
        zzM(obj, i10, i11);
    }

    private static boolean zzw(Object obj, int i10, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i10 & 1048575));
    }

    private final int zzx(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzz(int i10) {
        return (i10 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzB;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzx = zzx(i10);
            long j10 = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzH(obj, obj2, i10) && Double.doubleToLongBits(zzop.zzl(obj, j10)) == Double.doubleToLongBits(zzop.zzl(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i10) && Float.floatToIntBits(zzop.zzj(obj, j10)) == Float.floatToIntBits(zzop.zzj(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i10) && zzop.zzf(obj, j10) == zzop.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i10) && zzop.zzf(obj, j10) == zzop.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i10) && zzop.zzf(obj, j10) == zzop.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i10) && zzop.zzh(obj, j10) == zzop.zzh(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i10) && zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i10) && zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i10) && zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i10) && zzop.zzf(obj, j10) == zzop.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i10) && zzop.zzd(obj, j10) == zzop.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i10) && zzop.zzf(obj, j10) == zzop.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i10) && zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzB = zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10));
                    break;
                case 50:
                    zzB = zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = zzy(i10) & 1048575;
                    if (zzop.zzd(obj, zzy) == zzop.zzd(obj2, zzy) && zznz.zzB(zzop.zzn(obj, j10), zzop.zzn(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int hashCode = (i13 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i12);
            int i14 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i15 = iArr[i12];
            long j10 = i14;
            int i16 = 37;
            switch (zzz) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j10));
                    byte[] bArr = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = zzop.zzf(obj, j10);
                    byte[] bArr2 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = zzop.zzf(obj, j10);
                    byte[] bArr3 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = zzop.zzf(obj, j10);
                    byte[] bArr4 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    floatToIntBits = zzmp.zzb(zzop.zzh(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    floatToIntBits = ((String) zzop.zzn(obj, j10)).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object zzn = zzop.zzn(obj, j10);
                    if (zzn != null) {
                        i16 = zzn.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 10:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzn(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = zzop.zzf(obj, j10);
                    byte[] bArr5 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzd(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = zzop.zzf(obj, j10);
                    byte[] bArr6 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object zzn2 = zzop.zzn(obj, j10);
                    if (zzn2 != null) {
                        i16 = zzn2.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzn(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    floatToIntBits = zzop.zzn(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j10));
                        byte[] bArr7 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = zzF(obj, j10);
                        byte[] bArr8 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = zzF(obj, j10);
                        byte[] bArr9 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = zzF(obj, j10);
                        byte[] bArr10 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzmp.zzb(zzG(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = ((String) zzop.zzn(obj, j10)).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzop.zzn(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzop.zzn(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = zzF(obj, j10);
                        byte[] bArr11 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzE(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = zzF(obj, j10);
                        byte[] bArr12 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzop.zzn(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i10);
            int i11 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzm(obj, j10, zzop.zzl(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzk(obj, j10, zzop.zzj(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzg(obj, j10, zzop.zzf(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzg(obj, j10, zzop.zzf(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzg(obj, j10, zzop.zzf(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzi(obj, j10, zzop.zzh(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzo(obj, j10, zzop.zzn(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzo(obj, j10, zzop.zzn(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzg(obj, j10, zzop.zzf(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zze(obj, j10, zzop.zzd(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i10)) {
                        break;
                    } else {
                        zzop.zzg(obj, j10, zzop.zzf(obj2, j10));
                        zzK(obj, i10);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj, j10);
                    zzmo zzmoVar2 = (zzmo) zzop.zzn(obj2, j10);
                    int size = zzmoVar.size();
                    int size2 = zzmoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVar.zza()) {
                            zzmoVar = zzmoVar.zzg(size2 + size);
                        }
                        zzmoVar.addAll(zzmoVar2);
                    }
                    if (size > 0) {
                        zzmoVar2 = zzmoVar;
                    }
                    zzop.zzo(obj, j10, zzmoVar2);
                    break;
                case 50:
                    int i13 = zznz.zza;
                    zzop.zzo(obj, j10, zznh.zza(zzop.zzn(obj, j10), zzop.zzn(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzL(obj2, i12, i10)) {
                        break;
                    } else {
                        zzop.zzo(obj, j10, zzop.zzn(obj2, j10));
                        zzM(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i12, i10)) {
                        break;
                    } else {
                        zzop.zzo(obj, j10, zzop.zzn(obj2, j10));
                        zzM(obj, i12, i10);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i10;
        int zzz;
        int zzz2;
        int zzA;
        int zzz3;
        int zzz4;
        int zzz5;
        int zzc;
        int zzz6;
        int zzz7;
        int zzo;
        int size;
        int zzp;
        int zzz8;
        int zzz9;
        int zzz10;
        int i11;
        int zzx;
        int zzz11;
        int zzz12;
        int i12;
        int zzz13;
        int zzz14;
        int zzz15;
        int zzc2;
        int zzz16;
        zznp<T> zznpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i13 >= iArr.length) {
                int zzi = i15 + ((zzmf) obj).zzc.zzi();
                if (!zznpVar.zzh) {
                    return zzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int zzc3 = zzoeVar.zzc();
                int i17 = 0;
                for (int i18 = 0; i18 < zzc3; i18++) {
                    Map.Entry zzd = zzoeVar.zzd(i18);
                    i17 += zzlw.zzj((zzlv) ((zzob) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    i17 += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return zzi + i17;
            }
            int zzx2 = zznpVar.zzx(i13);
            int zzz17 = zzz(zzx2);
            int i19 = iArr[i13];
            int i20 = iArr[i13 + 2];
            int i21 = i20 & 1048575;
            if (zzz17 <= 17) {
                if (i21 != i16) {
                    i14 = i21 == 1048575 ? 0 : unsafe.getInt(obj2, i21);
                    i16 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            int i22 = zzx2 & 1048575;
            if (zzz17 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j10 = i22;
            switch (zzz17) {
                case 0:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        i15 += zzlm.zzz(i19 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz = zzlm.zzz(i19 << 3);
                        zzz4 = zzz + 4;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzA(j11);
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzA(j12);
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzA(j13);
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz3 = zzlm.zzz(i19 << 3);
                        zzz4 = zzz3 + 8;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz = zzlm.zzz(i19 << 3);
                        zzz4 = zzz + 4;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz4 = zzlm.zzz(i19 << 3) + 1;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzlh) {
                            zzz5 = zzlm.zzz(i23);
                            zzc = ((zzlh) object).zzc();
                            zzz6 = zzlm.zzz(zzc);
                            zzz4 = zzz5 + zzz6 + zzc;
                            i15 += zzz4;
                        } else {
                            zzz2 = zzlm.zzz(i23);
                            zzA = zzlm.zzB((String) object);
                            zzz4 = zzz2 + zzA;
                            i15 += zzz4;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz7 = zznz.zzz(i19, unsafe.getObject(obj2, j10), zznpVar.zzp(i13));
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj2, j10);
                        zzz5 = zzlm.zzz(i19 << 3);
                        zzc = zzlhVar.zzc();
                        zzz6 = zzlm.zzz(zzc);
                        zzz4 = zzz5 + zzz6 + zzc;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        int i24 = unsafe.getInt(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzz(i24);
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzA(j14);
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz = zzlm.zzz(i19 << 3);
                        zzz4 = zzz + 4;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz3 = zzlm.zzz(i19 << 3);
                        zzz4 = zzz3 + 8;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        int i25 = unsafe.getInt(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzz((i25 >> 31) ^ (i25 + i25));
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        zzz2 = zzlm.zzz(i19 << 3);
                        zzA = zzlm.zzA((j15 >> 63) ^ (j15 + j15));
                        zzz4 = zzz2 + zzA;
                        i15 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj2, i13, i16, i14, i10)) {
                        zzz7 = zzlm.zzG(i19, (zznm) unsafe.getObject(obj2, j10), zznpVar.zzp(i13));
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzz7 = zznz.zzy(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 19:
                    zzz7 = zznz.zzw(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i26 = zznz.zza;
                    if (list.size() != 0) {
                        zzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i19 << 3));
                        i15 += zzo;
                        break;
                    }
                    zzo = 0;
                    i15 += zzo;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i27 = zznz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zznz.zzp(list2);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i28 = zznz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zznz.zzs(list3);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 23:
                    zzz7 = zznz.zzy(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 24:
                    zzz7 = zznz.zzw(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i29 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzz7 = size2 * (zzlm.zzz(i19 << 3) + 1);
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i30 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzo = zzlm.zzz(i19 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object zzc4 = zzmxVar.zzc();
                                if (zzc4 instanceof zzlh) {
                                    int zzc5 = ((zzlh) zzc4).zzc();
                                    zzo += zzlm.zzz(zzc5) + zzc5;
                                } else {
                                    zzo += zzlm.zzB((String) zzc4);
                                }
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj3 = list5.get(i32);
                                if (obj3 instanceof zzlh) {
                                    int zzc6 = ((zzlh) obj3).zzc();
                                    zzo += zzlm.zzz(zzc6) + zzc6;
                                } else {
                                    zzo += zzlm.zzB((String) obj3);
                                }
                            }
                        }
                        i15 += zzo;
                        break;
                    }
                    zzo = 0;
                    i15 += zzo;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zznx zzp2 = zznpVar.zzp(i13);
                    int i33 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = zzlm.zzz(i19 << 3) * size4;
                        for (int i34 = 0; i34 < size4; i34++) {
                            Object obj4 = list6.get(i34);
                            if (obj4 instanceof zzmw) {
                                int zzb2 = ((zzmw) obj4).zzb();
                                zzz9 += zzlm.zzz(zzb2) + zzb2;
                            } else {
                                zzz9 += zzlm.zzD((zznm) obj4, zzp2);
                            }
                        }
                    }
                    i15 += zzz9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzz10 = 0;
                    } else {
                        zzz10 = size5 * zzlm.zzz(i19 << 3);
                        for (int i36 = 0; i36 < list7.size(); i36++) {
                            int zzc7 = ((zzlh) list7.get(i36)).zzc();
                            zzz10 += zzlm.zzz(zzc7) + zzc7;
                        }
                    }
                    i15 += zzz10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zznz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zznz.zzt(list8);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i38 = zznz.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zznz.zzr(list9);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 31:
                    zzz7 = zznz.zzw(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 32:
                    zzz7 = zznz.zzy(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += zzz7;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i39 = zznz.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zznz.zzu(list10);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i40 = zznz.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zznz.zzq(list11);
                        zzz8 = zzlm.zzz(i19 << 3);
                        i11 = size * zzz8;
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i15 += zzz7;
                case 35:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzx = zznz.zzo((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzx = zznz.zzp((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzx = zznz.zzs((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i41 = zznz.zza;
                    zzx = list12.size();
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzx = zznz.zzt((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzx = zznz.zzr((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzx = zznz.zzu((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzx = zznz.zzq((List) unsafe.getObject(obj2, j10));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i19 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i15 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zznx zzp3 = zznpVar.zzp(i13);
                    int i42 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i43 = 0; i43 < size6; i43++) {
                            i12 += zzlm.zzG(i19, (zznm) list13.get(i43), zzp3);
                        }
                    }
                    i15 += i12;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj2, j10);
                    zznf zznfVar = (zznf) zznpVar.zzq(i13);
                    if (!zzngVar.isEmpty()) {
                        zzo = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            zzo += zznfVar.zzd(i19, entry2.getKey(), entry2.getValue());
                        }
                        i15 += zzo;
                        break;
                    }
                    zzo = 0;
                    i15 += zzo;
                case 51:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz13 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz13 + 8;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz14 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz14 + 4;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        long zzF = zzF(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzA(zzF);
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        long zzF2 = zzF(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzA(zzF2);
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        long zzE = zzE(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzA(zzE);
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz13 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz13 + 8;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz14 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz14 + 4;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz7 = zzlm.zzz(i19 << 3) + 1;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zznpVar.zzL(obj2, i19, i13)) {
                        break;
                    } else {
                        int i44 = i19 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzlh) {
                            zzz15 = zzlm.zzz(i44);
                            zzc2 = ((zzlh) object2).zzc();
                            zzz16 = zzlm.zzz(zzc2);
                            zzz7 = zzz15 + zzz16 + zzc2;
                            i15 += zzz7;
                            break;
                        } else {
                            zzp = zzlm.zzz(i44);
                            i11 = zzlm.zzB((String) object2);
                            zzz7 = zzp + i11;
                            i15 += zzz7;
                        }
                    }
                case 60:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz7 = zznz.zzz(i19, unsafe.getObject(obj2, j10), zznpVar.zzp(i13));
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj2, j10);
                        zzz15 = zzlm.zzz(i19 << 3);
                        zzc2 = zzlhVar2.zzc();
                        zzz16 = zzlm.zzz(zzc2);
                        zzz7 = zzz15 + zzz16 + zzc2;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        int zzE2 = zzE(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzz(zzE2);
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        long zzE3 = zzE(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzA(zzE3);
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz14 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz14 + 4;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz13 = zzlm.zzz(i19 << 3);
                        zzz7 = zzz13 + 8;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        int zzE4 = zzE(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzz((zzE4 >> 31) ^ (zzE4 + zzE4));
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        long zzF3 = zzF(obj2, j10);
                        zzp = zzlm.zzz(i19 << 3);
                        i11 = zzlm.zzA((zzF3 >> 63) ^ (zzF3 + zzF3));
                        zzz7 = zzp + i11;
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zznpVar.zzL(obj2, i19, i13)) {
                        zzz7 = zzlm.zzG(i19, (zznm) unsafe.getObject(obj2, j10), zznpVar.zzp(i13));
                        i15 += zzz7;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            obj2 = obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzov zzovVar) {
        Map.Entry entry;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (!zzlwVar.zza.isEmpty()) {
                entry = (Map.Entry) zzlwVar.zzc().next();
                iArr = zznpVar.zzc;
                Unsafe unsafe = zzb;
                int i13 = 1048575;
                int i14 = 1048575;
                i10 = 0;
                int i15 = 0;
                while (i10 < iArr.length) {
                    int zzx = zznpVar.zzx(i10);
                    int zzz = zzz(zzx);
                    int i16 = iArr[i10];
                    if (zzz <= 17) {
                        int i17 = iArr[i10 + 2];
                        int i18 = i17 & i13;
                        if (i18 != i14) {
                            i15 = i18 == i13 ? 0 : unsafe.getInt(obj, i18);
                            i14 = i18;
                        }
                        i11 = zzx;
                        i12 = 1 << (i17 >>> 20);
                    } else {
                        i11 = zzx;
                        i12 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j10 = i11 & i13;
                    switch (zzz) {
                        case 0:
                            if (!zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                break;
                            } else {
                                zzovVar.zzf(i16, zzop.zzl(obj, j10));
                                continue;
                            }
                        case 1:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zze(i16, zzop.zzj(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzc(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzh(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzi(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzj(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzk(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzl(i16, zzop.zzh(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzP(i16, unsafe.getObject(obj, j10), zzovVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzr(i16, unsafe.getObject(obj, j10), zznpVar.zzp(i10));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzn(i16, (zzlh) unsafe.getObject(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzo(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzg(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzb(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzd(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzp(i16, unsafe.getInt(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzq(i16, unsafe.getLong(obj, j10));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zznpVar.zzI(obj, i10, i14, i15, i12)) {
                                zzovVar.zzs(i16, unsafe.getObject(obj, j10), zznpVar.zzp(i10));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zznz.zza(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 19:
                            zznz.zzb(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 20:
                            zznz.zzc(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 21:
                            zznz.zzd(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 22:
                            zznz.zzh(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 23:
                            zznz.zzf(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 24:
                            zznz.zzk(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 25:
                            zznz.zzn(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 26:
                            int i19 = iArr[i10];
                            List list = (List) unsafe.getObject(obj, j10);
                            int i20 = zznz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzovVar.zzF(i19, list);
                                break;
                            }
                            break;
                        case 27:
                            int i21 = iArr[i10];
                            List list2 = (List) unsafe.getObject(obj, j10);
                            zznx zzp = zznpVar.zzp(i10);
                            int i22 = zznz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i23 = 0; i23 < list2.size(); i23++) {
                                    ((zzln) zzovVar).zzr(i21, list2.get(i23), zzp);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i24 = iArr[i10];
                            List list3 = (List) unsafe.getObject(obj, j10);
                            int i25 = zznz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzovVar.zzG(i24, list3);
                                break;
                            }
                            break;
                        case 29:
                            zznz.zzi(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 30:
                            zznz.zzm(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 31:
                            zznz.zzl(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 32:
                            zznz.zzg(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 33:
                            zznz.zzj(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 34:
                            zznz.zze(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, false);
                            continue;
                        case 35:
                            zznz.zza(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 36:
                            zznz.zzb(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 37:
                            zznz.zzc(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 38:
                            zznz.zzd(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 39:
                            zznz.zzh(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 40:
                            zznz.zzf(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 41:
                            zznz.zzk(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 42:
                            zznz.zzn(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 43:
                            zznz.zzi(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 44:
                            zznz.zzm(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 45:
                            zznz.zzl(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 46:
                            zznz.zzg(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 47:
                            zznz.zzj(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 48:
                            zznz.zze(iArr[i10], (List) unsafe.getObject(obj, j10), zzovVar, true);
                            break;
                        case 49:
                            int i26 = iArr[i10];
                            List list4 = (List) unsafe.getObject(obj, j10);
                            zznx zzp2 = zznpVar.zzp(i10);
                            int i27 = zznz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i28 = 0; i28 < list4.size(); i28++) {
                                    ((zzln) zzovVar).zzs(i26, list4.get(i28), zzp2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                zzovVar.zzM(i16, ((zznf) zznpVar.zzq(i10)).zze(), (zzng) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzf(i16, zzC(obj, j10));
                                break;
                            }
                            break;
                        case 52:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zze(i16, zzD(obj, j10));
                                break;
                            }
                            break;
                        case 53:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzc(i16, zzF(obj, j10));
                                break;
                            }
                            break;
                        case 54:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzh(i16, zzF(obj, j10));
                                break;
                            }
                            break;
                        case 55:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzi(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 56:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzj(i16, zzF(obj, j10));
                                break;
                            }
                            break;
                        case 57:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzk(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 58:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzl(i16, zzG(obj, j10));
                                break;
                            }
                            break;
                        case 59:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzP(i16, unsafe.getObject(obj, j10), zzovVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzr(i16, unsafe.getObject(obj, j10), zznpVar.zzp(i10));
                                break;
                            }
                            break;
                        case 61:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzn(i16, (zzlh) unsafe.getObject(obj, j10));
                                break;
                            }
                            break;
                        case 62:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzo(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 63:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzg(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 64:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzb(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 65:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzd(i16, zzF(obj, j10));
                                break;
                            }
                            break;
                        case 66:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzp(i16, zzE(obj, j10));
                                break;
                            }
                            break;
                        case 67:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzq(i16, zzF(obj, j10));
                                break;
                            }
                            break;
                        case 68:
                            if (zznpVar.zzL(obj, i16, i10)) {
                                zzovVar.zzs(i16, unsafe.getObject(obj, j10), zznpVar.zzp(i10));
                                break;
                            }
                            break;
                    }
                    i10 += 3;
                    i13 = 1048575;
                    zznpVar = this;
                }
                if (entry != null) {
                    ((zzmf) obj).zzc.zzg(zzovVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zznpVar.zzc;
        Unsafe unsafe2 = zzb;
        int i132 = 1048575;
        int i142 = 1048575;
        i10 = 0;
        int i152 = 0;
        while (i10 < iArr.length) {
        }
        if (entry != null) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) {
        /*
            Method dump skipped, instructions count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkw zzkwVar) {
        zzh(obj, bArr, i10, i11, 0, zzkwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzx = zzx(i10);
                int i11 = 1048575 & zzx;
                int zzz = zzz(zzx);
                long j10 = i11;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzmo) zzop.zzn(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzL(obj, iArr[i10], i10)) {
                        zzp(i10).zzj(zzb.getObject(obj, j10));
                    }
                }
                if (zzJ(obj, i10)) {
                    zzp(i10).zzj(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int zzx = zzx(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & zzx) != 0 && !zzI(obj, i11, i10, i12, i20)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i17, i11) && !zzw(obj, zzx, zzp(i11))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            zzng zzngVar = (zzng) zzop.zzn(obj, zzx & 1048575);
                            if (!zzngVar.isEmpty() && ((zznf) zzq(i11)).zze().zzc.zza() == zzou.MESSAGE) {
                                zznx zznxVar = null;
                                for (Object obj2 : zzngVar.values()) {
                                    if (zznxVar == null) {
                                        zznxVar = zznu.zza().zzb(obj2.getClass());
                                    }
                                    if (!zznxVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzop.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznx zzp = zzp(i11);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzp.zzk(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i11, i10, i12, i20) && !zzw(obj, zzx, zzp(i11))) {
                return false;
            }
            i14++;
            i15 = i10;
            i13 = i12;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
