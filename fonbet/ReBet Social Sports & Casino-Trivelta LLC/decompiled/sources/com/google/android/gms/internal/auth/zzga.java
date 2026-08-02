package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int zzl = zzl(i10);
        long j10 = zzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i10);
        long j11 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object zzf = zzhj.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzE(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
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
        zzgh zzghVar;
        int i27;
        int i28;
        int i29;
        String str;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zzv;
        char charAt10;
        int i34;
        int i35;
        Object obj;
        Field zzv2;
        Object obj2;
        Field zzv3;
        int i36;
        char charAt11;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        int i39;
        char charAt14;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String zzd = zzghVar2.zzd();
        int length = zzd.length();
        char c10 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (zzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int charAt15 = zzd.charAt(i10);
        if (charAt15 >= 55296) {
            int i42 = charAt15 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                charAt14 = zzd.charAt(i41);
                if (charAt14 < 55296) {
                    break;
                }
                i42 |= (charAt14 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            charAt15 = i42 | (charAt14 << i43);
            i41 = i39;
        }
        if (charAt15 == 0) {
            i13 = 0;
            charAt = 0;
            i12 = 0;
            i14 = 0;
            i11 = 0;
            i15 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt16 = zzd.charAt(i41);
            if (charAt16 >= 55296) {
                int i45 = charAt16 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    charAt9 = zzd.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                charAt16 = i45 | (charAt9 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int charAt17 = zzd.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    charAt8 = zzd.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                charAt17 = i48 | (charAt8 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int charAt18 = zzd.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    charAt7 = zzd.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                charAt18 = i51 | (charAt7 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int charAt19 = zzd.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    charAt6 = zzd.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                charAt19 = i54 | (charAt6 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            charAt = zzd.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    charAt5 = zzd.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                charAt = i57 | (charAt5 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int charAt20 = zzd.charAt(i56);
            if (charAt20 >= 55296) {
                int i60 = charAt20 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    charAt4 = zzd.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                charAt20 = i60 | (charAt4 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int charAt21 = zzd.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    charAt3 = zzd.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                charAt21 = i63 | (charAt3 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int charAt22 = zzd.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    charAt2 = zzd.charAt(i65);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i66 |= (charAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                charAt22 = i66 | (charAt2 << i67);
                i65 = i17;
            }
            i11 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = charAt20;
            i12 = charAt18;
            i13 = i68;
            iArr = iArr2;
            i14 = charAt19;
            i15 = charAt22;
            i16 = charAt16;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i69 = i15 + i13;
        int i70 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = 0;
        int i72 = 0;
        int i73 = i15;
        int i74 = i69;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            if (charAt23 >= c10) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    charAt13 = zzd.charAt(i77);
                    if (charAt13 < c10) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i38;
            } else {
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = zzd.charAt(i25);
            if (charAt24 >= c10) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    charAt12 = zzd.charAt(i81);
                    if (charAt12 < c10) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                }
                charAt24 = i80 | (charAt12 << i82);
                i26 = i37;
            } else {
                i26 = i79;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i83 = charAt24 & 255;
            if (i83 >= 51) {
                int i84 = i26 + 1;
                int charAt25 = zzd.charAt(i26);
                zzghVar = zzghVar2;
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        charAt11 = zzd.charAt(i84);
                        if (charAt11 < c11) {
                            break;
                        }
                        i85 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt11 << i86);
                    i84 = i36;
                }
                int i87 = i83 - 51;
                i27 = length;
                if (i87 == 9 || i87 == 17) {
                    int i88 = i72 / 3;
                    i35 = i11 + 1;
                    objArr[i88 + i88 + 1] = zze[i11];
                } else {
                    if (i87 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i89 = i72 / 3;
                        i35 = i11 + 1;
                        objArr[i89 + i89 + 1] = zze[i11];
                    }
                    int i90 = charAt25 + charAt25;
                    obj = zze[i90];
                    if (obj instanceof Field) {
                        zzv2 = zzv(cls2, (String) obj);
                        zze[i90] = zzv2;
                    } else {
                        zzv2 = (Field) obj;
                    }
                    i28 = charAt23;
                    int i91 = i84;
                    i32 = (int) unsafe.objectFieldOffset(zzv2);
                    int i92 = i90 + 1;
                    obj2 = zze[i92];
                    if (obj2 instanceof Field) {
                        zzv3 = zzv(cls2, (String) obj2);
                        zze[i92] = zzv3;
                    } else {
                        zzv3 = (Field) obj2;
                    }
                    i33 = (int) unsafe.objectFieldOffset(zzv3);
                    str = zzd;
                    i30 = i91;
                    i31 = 0;
                }
                i11 = i35;
                int i902 = charAt25 + charAt25;
                obj = zze[i902];
                if (obj instanceof Field) {
                }
                i28 = charAt23;
                int i912 = i84;
                i32 = (int) unsafe.objectFieldOffset(zzv2);
                int i922 = i902 + 1;
                obj2 = zze[i922];
                if (obj2 instanceof Field) {
                }
                i33 = (int) unsafe.objectFieldOffset(zzv3);
                str = zzd;
                i30 = i912;
                i31 = 0;
            } else {
                zzghVar = zzghVar2;
                i27 = length;
                i28 = charAt23;
                int i93 = i11 + 1;
                Field zzv4 = zzv(cls2, (String) zze[i11]);
                if (i83 == 9 || i83 == 17) {
                    i29 = i93;
                    int i94 = i72 / 3;
                    objArr[i94 + i94 + 1] = zzv4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        int i95 = i72 / 3;
                        i34 = i11 + 2;
                        objArr[i95 + i95 + 1] = zze[i93];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i29 = i93;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i96 = i72 / 3;
                            i34 = i11 + 2;
                            objArr[i96 + i96 + 1] = zze[i29];
                        }
                    } else if (i83 == 50) {
                        int i97 = i73 + 1;
                        iArr[i73] = i72;
                        int i98 = i72 / 3;
                        i29 = i11 + 2;
                        int i99 = i98 + i98;
                        objArr[i99] = zze[i93];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i99 + 1] = zze[i29];
                            i29 = i11 + 3;
                        }
                        i73 = i97;
                    } else {
                        i29 = i93;
                    }
                    i29 = i34;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                int i100 = 1048575;
                if ((charAt24 & 4096) == 0 || i83 > 17) {
                    str = zzd;
                    i30 = i26;
                    i31 = 0;
                } else {
                    int i101 = i26 + 1;
                    int charAt26 = zzd.charAt(i26);
                    if (charAt26 >= 55296) {
                        int i102 = charAt26 & 8191;
                        int i103 = 13;
                        while (true) {
                            i30 = i101 + 1;
                            charAt10 = zzd.charAt(i101);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i102 |= (charAt10 & 8191) << i103;
                            i103 += 13;
                            i101 = i30;
                        }
                        charAt26 = i102 | (charAt10 << i103);
                    } else {
                        i30 = i101;
                    }
                    int i104 = i16 + i16 + (charAt26 / 32);
                    Object obj3 = zze[i104];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzv = (Field) obj3;
                    } else {
                        zzv = zzv(cls2, (String) obj3);
                        zze[i104] = zzv;
                    }
                    i31 = charAt26 % 32;
                    i100 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i83 >= 18 && i83 <= 49) {
                    iArr[i74] = objectFieldOffset;
                    i74++;
                }
                i32 = objectFieldOffset;
                i33 = i100;
                i11 = i29;
            }
            int i105 = i72 + 1;
            iArr3[i72] = i28;
            int i106 = i72 + 2;
            iArr3[i105] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i32;
            i72 += 3;
            iArr3[i106] = (i31 << 20) | i33;
            i41 = i30;
            zzghVar2 = zzghVar;
            zzd = str;
            length = i27;
            c10 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i12, i14, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i15, i69, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
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

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzr = zzr(i10);
        int zzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int zzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j10, zzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j10, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int zzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j10, zzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j10, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int zzl = zzl(i10);
        long j10 = 1048575 & zzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzo = zzo(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzo;
            int i14 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i10 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j10));
                    byte[] bArr = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr2 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr3 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr4 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j10));
                    i11 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr5 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr6 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i10 + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j10);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
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
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j10)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j10)).floatValue());
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j10)).booleanValue());
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzk(obj, j10);
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        doubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i11 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzb(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.auth.zzdt r41) {
        /*
            Method dump skipped, instructions count: 3684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzo = zzo(i10);
                int i11 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j10 = i11;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
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
                                this.zzk.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i10], i10)) {
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    }
                }
                if (zzE(obj, i10)) {
                    zzr(i10).zze(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i10)) {
                        zzhj.zzl(obj, j10, zzhj.zza(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i10)) {
                        zzhj.zzm(obj, j10, zzhj.zzb(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i10)) {
                        zzhj.zzk(obj, j10, zzhj.zzt(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i10);
                    break;
                case 10:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i10);
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
                    this.zzk.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgk.zza;
                    zzhj.zzp(obj, j10, zzfs.zza(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10)));
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
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i10);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzo = zzo(i10);
            long j10 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i10) && Double.doubleToLongBits(zzhj.zza(obj, j10)) == Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i10) && Float.floatToIntBits(zzhj.zzb(obj, j10)) == Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i10) && zzhj.zzt(obj, j10) == zzhj.zzt(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    zzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
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
                    long zzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzi) {
            int i15 = this.zzh[i12];
            int i16 = this.zzc[i15];
            int zzo = zzo(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i13;
            }
            Object obj2 = obj;
            if ((268435456 & zzo) != 0 && !zzF(obj2, i15, i10, i11, i19)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj2, i16, i15) && !zzG(obj2, zzo, zzr(i15))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzfr) zzhj.zzf(obj2, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhj.zzf(obj2, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzr.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj2, i15, i10, i11, i19) && !zzG(obj2, zzo, zzr(i15))) {
                return false;
            }
            i12++;
            obj = obj2;
            i14 = i10;
            i13 = i11;
        }
        return true;
    }
}
