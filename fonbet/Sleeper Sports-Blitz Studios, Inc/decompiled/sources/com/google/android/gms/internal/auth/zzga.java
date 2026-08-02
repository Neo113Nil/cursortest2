package com.google.android.gms.internal.auth;

import androidx.media3.common.C;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes7.dex */
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

    private zzga(int[] iArr, Object[] objArr, int i, int i2, zzfx zzfxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = iArr2;
        this.zzi = i4;
        this.zzj = i5;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i, int i2) {
        zzhj.zzn(obj, zzl(i2) & 1048575, i);
    }

    private final void zzB(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzo(i) & 1048575, obj2);
        zzz(obj, i);
    }

    private final void zzC(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzo(i2) & 1048575, obj2);
        zzA(obj, i, i2);
    }

    private final boolean zzD(Object obj, Object obj2, int i) {
        return zzE(obj, i) == zzE(obj2, i);
    }

    private final boolean zzE(Object obj, int i) {
        int zzl = zzl(i);
        long j = zzl & 1048575;
        if (j != 1048575) {
            return (zzhj.zzc(obj, j) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j2)) != 0;
            case 2:
                return zzhj.zzd(obj, j2) != 0;
            case 3:
                return zzhj.zzd(obj, j2) != 0;
            case 4:
                return zzhj.zzc(obj, j2) != 0;
            case 5:
                return zzhj.zzd(obj, j2) != 0;
            case 6:
                return zzhj.zzc(obj, j2) != 0;
            case 7:
                return zzhj.zzt(obj, j2);
            case 8:
                Object zzf = zzhj.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j2) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j2));
            case 11:
                return zzhj.zzc(obj, j2) != 0;
            case 12:
                return zzhj.zzc(obj, j2) != 0;
            case 13:
                return zzhj.zzc(obj, j2) != 0;
            case 14:
                return zzhj.zzd(obj, j2) != 0;
            case 15:
                return zzhj.zzc(obj, j2) != 0;
            case 16:
                return zzhj.zzd(obj, j2) != 0;
            case 17:
                return zzhj.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzE(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzG(Object obj, int i, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i & 1048575));
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

    private final boolean zzI(Object obj, int i, int i2) {
        return zzhj.zzc(obj, (long) (zzl(i2) & 1048575)) == i;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        zzgh zzghVar;
        int i18;
        int i19;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzv;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field zzv2;
        Object obj2;
        Field zzv3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String zzd = zzghVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i33 = charAt15 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt14 = zzd.charAt(i32);
                if (charAt14 < 55296) {
                    break;
                }
                i33 |= (charAt14 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt15 = i33 | (charAt14 << i34);
            i32 = i30;
        }
        if (charAt15 == 0) {
            i4 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt16 = zzd.charAt(i32);
            if (charAt16 >= 55296) {
                int i36 = charAt16 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    charAt9 = zzd.charAt(i35);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i36 |= (charAt9 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                charAt16 = i36 | (charAt9 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt8 = zzd.charAt(i38);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i39 |= (charAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt8 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt7 = zzd.charAt(i41);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i42 |= (charAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt7 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt6 = zzd.charAt(i44);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i45 |= (charAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt6 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            charAt = zzd.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt5 = zzd.charAt(i47);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i48 |= (charAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt = i48 | (charAt5 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt4 = zzd.charAt(i50);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i51 |= (charAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt20 = i51 | (charAt4 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int charAt21 = zzd.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt3 = zzd.charAt(i53);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i54 |= (charAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt21 = i54 | (charAt3 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt22 = zzd.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt2 = zzd.charAt(i56);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i57 |= (charAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt22 = i57 | (charAt2 << i58);
                i56 = i8;
            }
            i2 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i59 = charAt20;
            i3 = charAt18;
            i4 = i59;
            iArr = iArr2;
            i5 = charAt19;
            i6 = charAt22;
            i7 = charAt16;
            i32 = i56;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i60 = i6 + i4;
        int i61 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = 0;
        int i63 = 0;
        int i64 = i6;
        int i65 = i60;
        while (i32 < length) {
            int i66 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    charAt13 = zzd.charAt(i68);
                    if (charAt13 < c) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                charAt23 = i67 | (charAt13 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    charAt12 = zzd.charAt(i72);
                    if (charAt12 < c) {
                        break;
                    }
                    i71 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                }
                charAt24 = i71 | (charAt12 << i73);
                i17 = i28;
            } else {
                i17 = i70;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = charAt24 & 255;
            if (i74 >= 51) {
                int i75 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                zzghVar = zzghVar2;
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        charAt11 = zzd.charAt(i75);
                        if (charAt11 < c2) {
                            break;
                        }
                        i76 |= (charAt11 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i76 | (charAt11 << i77);
                    i75 = i27;
                }
                int i78 = i74 - 51;
                i18 = length;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i63 / 3;
                    i26 = i2 + 1;
                    objArr[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i78 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i80 = i63 / 3;
                        i26 = i2 + 1;
                        objArr[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = zze[i81];
                    if (obj instanceof Field) {
                        zzv2 = zzv(cls2, (String) obj);
                        zze[i81] = zzv2;
                    } else {
                        zzv2 = (Field) obj;
                    }
                    i19 = charAt23;
                    int i82 = i75;
                    i23 = (int) unsafe.objectFieldOffset(zzv2);
                    int i83 = i81 + 1;
                    obj2 = zze[i83];
                    if (obj2 instanceof Field) {
                        zzv3 = zzv(cls2, (String) obj2);
                        zze[i83] = zzv3;
                    } else {
                        zzv3 = (Field) obj2;
                    }
                    i24 = (int) unsafe.objectFieldOffset(zzv3);
                    str = zzd;
                    i21 = i82;
                    i22 = 0;
                }
                i2 = i26;
                int i812 = charAt25 + charAt25;
                obj = zze[i812];
                if (obj instanceof Field) {
                }
                i19 = charAt23;
                int i822 = i75;
                i23 = (int) unsafe.objectFieldOffset(zzv2);
                int i832 = i812 + 1;
                obj2 = zze[i832];
                if (obj2 instanceof Field) {
                }
                i24 = (int) unsafe.objectFieldOffset(zzv3);
                str = zzd;
                i21 = i822;
                i22 = 0;
            } else {
                zzghVar = zzghVar2;
                i18 = length;
                i19 = charAt23;
                int i84 = i2 + 1;
                Field zzv4 = zzv(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    i20 = i84;
                    int i85 = i63 / 3;
                    objArr[i85 + i85 + 1] = zzv4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        int i86 = i63 / 3;
                        i25 = i2 + 2;
                        objArr[i86 + i86 + 1] = zze[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i20 = i84;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i87 = i63 / 3;
                            i25 = i2 + 2;
                            objArr[i87 + i87 + 1] = zze[i20];
                        }
                    } else if (i74 == 50) {
                        int i88 = i64 + 1;
                        iArr[i64] = i63;
                        int i89 = i63 / 3;
                        i20 = i2 + 2;
                        int i90 = i89 + i89;
                        objArr[i90] = zze[i84];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i90 + 1] = zze[i20];
                            i20 = i2 + 3;
                        }
                        i64 = i88;
                    } else {
                        i20 = i84;
                    }
                    i20 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                int i91 = 1048575;
                if ((charAt24 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i21 = i17;
                    i22 = 0;
                } else {
                    int i92 = i17 + 1;
                    int charAt26 = zzd.charAt(i17);
                    if (charAt26 >= 55296) {
                        int i93 = charAt26 & 8191;
                        int i94 = 13;
                        while (true) {
                            i21 = i92 + 1;
                            charAt10 = zzd.charAt(i92);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i93 |= (charAt10 & 8191) << i94;
                            i94 += 13;
                            i92 = i21;
                        }
                        charAt26 = i93 | (charAt10 << i94);
                    } else {
                        i21 = i92;
                    }
                    int i95 = i7 + i7 + (charAt26 / 32);
                    Object obj3 = zze[i95];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzv = (Field) obj3;
                    } else {
                        zzv = zzv(cls2, (String) obj3);
                        zze[i95] = zzv;
                    }
                    i22 = charAt26 % 32;
                    i91 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
                i23 = objectFieldOffset;
                i24 = i91;
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr3[i63] = i19;
            int i97 = i63 + 2;
            iArr3[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i23;
            i63 += 3;
            iArr3[i97] = (i22 << 20) | i24;
            i32 = i21;
            zzghVar2 = zzghVar;
            zzd = str;
            length = i18;
            c = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i3, i5, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i6, i60, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j) {
        return ((Integer) zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i) {
        return this.zzc[i + 2];
    }

    private final int zzm(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzhj.zzf(obj, j)).longValue();
    }

    private final zzey zzq(int i) {
        int i2 = i / 3;
        return (zzey) this.zzd[i2 + i2 + 1];
    }

    private final zzgi zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgi zzgiVar = (zzgi) this.zzd[i3];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzt(Object obj, int i) {
        zzgi zzr = zzr(i);
        int zzo = zzo(i) & 1048575;
        if (!zzE(obj, i)) {
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

    private final Object zzu(Object obj, int i, int i2) {
        zzgi zzr = zzr(i2);
        if (!zzI(obj, i, i2)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i2) & 1048575);
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
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzx(Object obj, Object obj2, int i) {
        if (zzE(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i);
            if (!zzE(obj, i)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzI(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i);
            if (!zzI(obj, i2, i)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzA(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i) {
        int zzl = zzl(i);
        long j = 1048575 & zzl;
        if (j == 1048575) {
            return;
        }
        zzhj.zzn(obj, j, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzo = zzo(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzo;
            int i5 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j));
                    byte[] bArr = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr2 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr3 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr4 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr5 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr6 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j)).floatValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j)).booleanValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cb8, code lost:
    
        if (r14 == 1048575) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0cba, code lost:
    
        r29.putInt(r10, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0cc0, code lost:
    
        r1 = r34.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0cc6, code lost:
    
        if (r1 >= r34.zzj) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0cc8, code lost:
    
        r2 = r34.zzh[r1];
        r5 = r34.zzc[r2];
        r5 = com.google.android.gms.internal.auth.zzhj.zzf(r10, zzo(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0cde, code lost:
    
        if (r5 != null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0ce5, code lost:
    
        if (zzq(r2) != null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0cea, code lost:
    
        r5 = (com.google.android.gms.internal.auth.zzfr) r5;
        r0 = (com.google.android.gms.internal.auth.zzfq) zzs(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0cf2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0ce7, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0cf3, code lost:
    
        if (r0 != 0) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0cf5, code lost:
    
        if (r3 != r4) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0cfc, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d01, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0cfd, code lost:
    
        if (r3 > r4) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0cff, code lost:
    
        if (r6 != r0) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0d06, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a17 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0c83 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0c6a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0c7b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzdt zzdtVar) throws IOException {
        int i4;
        Unsafe unsafe;
        Object obj2;
        int i5;
        int zzm;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        zzdt zzdtVar2;
        int i9;
        int i10;
        zzdt zzdtVar3;
        int i11;
        int i12;
        int i13;
        zzdt zzdtVar4;
        int zza2;
        int i14;
        int zzh;
        int i15;
        zzga<T> zzgaVar;
        int i16;
        int i17;
        int zzf;
        int i18;
        int zzj;
        int i19;
        int i20;
        int zzh2;
        int i21;
        int i22;
        int i23;
        Object obj3;
        int i24;
        Unsafe unsafe2;
        int i25;
        Unsafe unsafe3;
        byte[] bArr3;
        Object obj4;
        int i26;
        zzdt zzdtVar5;
        int i27;
        Unsafe unsafe4;
        Object obj5;
        int i28;
        int i29;
        zzga<T> zzgaVar2 = this;
        Object obj6 = obj;
        byte[] bArr4 = bArr;
        int i30 = i2;
        zzdt zzdtVar6 = zzdtVar;
        zzw(obj6);
        Unsafe unsafe5 = zzb;
        int i31 = 0;
        int i32 = i;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                int i39 = bArr4[i32];
                if (i39 < 0) {
                    i38 = zzdu.zzi(i39, bArr4, i38, zzdtVar6);
                    i39 = zzdtVar6.zza;
                }
                int i40 = i38;
                int i41 = i39;
                i32 = i40;
                int i42 = i41 >>> 3;
                if (i42 > i36) {
                    int i43 = i33 / 3;
                    if (i42 >= zzgaVar2.zze && i42 <= zzgaVar2.zzf) {
                        zzm = zzgaVar2.zzm(i42, i43);
                        if (zzm != -1) {
                            i4 = i3;
                            unsafe = unsafe5;
                            i6 = i41;
                            bArr2 = bArr4;
                            i7 = i31;
                            i8 = i37;
                            zzdtVar2 = zzdtVar6;
                            obj2 = obj6;
                        } else {
                            int i44 = i41 & 7;
                            int[] iArr = zzgaVar2.zzc;
                            int i45 = iArr[zzm + 1];
                            int i46 = zzm;
                            int zzn = zzn(i45);
                            int i47 = i41;
                            long j = i45 & 1048575;
                            if (zzn <= 17) {
                                int i48 = iArr[i46 + 2];
                                int i49 = 1 << (i48 >>> 20);
                                int i50 = i48 & 1048575;
                                if (i50 != i37) {
                                    int i51 = 1048575;
                                    if (i37 != 1048575) {
                                        unsafe5.putInt(obj6, i37, i35);
                                        i51 = 1048575;
                                    }
                                    i35 = i50 == i51 ? 0 : unsafe5.getInt(obj6, i50);
                                    i37 = i50;
                                }
                                switch (zzn) {
                                    case 0:
                                        zzdtVar6 = zzdtVar;
                                        i21 = i32;
                                        i22 = i37;
                                        i7 = i46;
                                        i23 = 0;
                                        obj3 = obj6;
                                        i24 = i35;
                                        unsafe2 = unsafe5;
                                        if (i44 != 1) {
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzhj.zzl(obj3, j, Double.longBitsToDouble(zzdu.zzn(bArr4, i21)));
                                            i32 = i21 + 8;
                                            Unsafe unsafe6 = unsafe2;
                                            i35 = i24 | i49;
                                            unsafe5 = unsafe6;
                                            i31 = i23;
                                            i33 = i7;
                                            i36 = i42;
                                            obj6 = obj3;
                                            i34 = i47;
                                            i37 = i22;
                                            i30 = i2;
                                        }
                                    case 1:
                                        zzdtVar6 = zzdtVar;
                                        i21 = i32;
                                        i22 = i37;
                                        i7 = i46;
                                        i23 = 0;
                                        obj3 = obj6;
                                        i24 = i35;
                                        unsafe2 = unsafe5;
                                        if (i44 != 5) {
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzhj.zzm(obj3, j, Float.intBitsToFloat(zzdu.zzb(bArr4, i21)));
                                            i32 = i21 + 4;
                                            Unsafe unsafe62 = unsafe2;
                                            i35 = i24 | i49;
                                            unsafe5 = unsafe62;
                                            i31 = i23;
                                            i33 = i7;
                                            i36 = i42;
                                            obj6 = obj3;
                                            i34 = i47;
                                            i37 = i22;
                                            i30 = i2;
                                        }
                                    case 2:
                                    case 3:
                                        zzdtVar6 = zzdtVar;
                                        i21 = i32;
                                        i22 = i37;
                                        i7 = i46;
                                        i24 = i35;
                                        if (i44 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            int zzk = zzdu.zzk(bArr4, i21, zzdtVar6);
                                            unsafe5.putLong(obj6, j, zzdtVar6.zzb);
                                            i35 = i24 | i49;
                                            unsafe5 = unsafe5;
                                            i33 = i7;
                                            i32 = zzk;
                                            i36 = i42;
                                            obj6 = obj6;
                                            i34 = i47;
                                            i37 = i22;
                                            i31 = 0;
                                            i30 = i2;
                                        }
                                    case 4:
                                    case 11:
                                        zzdtVar6 = zzdtVar;
                                        i21 = i32;
                                        i22 = i37;
                                        i7 = i46;
                                        i25 = 0;
                                        i24 = i35;
                                        if (i44 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            int zzh3 = zzdu.zzh(bArr4, i21, zzdtVar6);
                                            unsafe5.putInt(obj6, j, zzdtVar6.zza);
                                            i35 = i24 | i49;
                                            i37 = i22;
                                            i32 = zzh3;
                                            i31 = i25;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i30 = i2;
                                        }
                                    case 5:
                                    case 14:
                                        Unsafe unsafe7 = unsafe5;
                                        byte[] bArr5 = bArr4;
                                        i22 = i37;
                                        i7 = i46;
                                        i25 = 0;
                                        Object obj7 = obj6;
                                        i24 = i35;
                                        if (i44 != 1) {
                                            i21 = i32;
                                            obj6 = obj7;
                                            unsafe5 = unsafe7;
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            long zzn2 = zzdu.zzn(bArr5, i32);
                                            obj6 = obj7;
                                            bArr4 = bArr5;
                                            unsafe5 = unsafe7;
                                            zzdtVar6 = zzdtVar;
                                            unsafe5.putLong(obj6, j, zzn2);
                                            i32 += 8;
                                            i35 = i24 | i49;
                                            i37 = i22;
                                            i31 = i25;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i30 = i2;
                                        }
                                    case 6:
                                    case 13:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i22 = i37;
                                        i7 = i46;
                                        i25 = 0;
                                        obj4 = obj6;
                                        i26 = i32;
                                        i24 = i35;
                                        zzdtVar5 = zzdtVar;
                                        if (i44 != 5) {
                                            i32 = i26;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            unsafe3.putInt(obj4, j, zzdu.zzb(bArr3, i26));
                                            i27 = i26 + 4;
                                            i35 = i24 | i49;
                                            Object obj8 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i32 = i27;
                                            obj6 = obj8;
                                            i37 = i22;
                                            i31 = i25;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i30 = i2;
                                        }
                                    case 7:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i22 = i37;
                                        i7 = i46;
                                        i25 = 0;
                                        obj4 = obj6;
                                        i26 = i32;
                                        i24 = i35;
                                        zzdtVar5 = zzdtVar;
                                        if (i44 != 0) {
                                            i32 = i26;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i27 = zzdu.zzk(bArr3, i26, zzdtVar5);
                                            zzhj.zzk(obj4, j, zzdtVar5.zzb != 0);
                                            i35 = i24 | i49;
                                            Object obj82 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i32 = i27;
                                            obj6 = obj82;
                                            i37 = i22;
                                            i31 = i25;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i30 = i2;
                                        }
                                    case 8:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i22 = i37;
                                        int i52 = i35;
                                        i7 = i46;
                                        obj4 = obj6;
                                        i26 = i32;
                                        zzdtVar5 = zzdtVar;
                                        if (i44 != 2) {
                                            i24 = i52;
                                            i32 = i26;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            if ((i45 & C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
                                                i27 = zzdu.zzh(bArr3, i26, zzdtVar5);
                                                int i53 = zzdtVar5.zza;
                                                if (i53 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i53 == 0) {
                                                    zzdtVar5.zzc = "";
                                                    i24 = i52;
                                                    i25 = 0;
                                                } else {
                                                    int i54 = zzhn.zza;
                                                    int length = bArr3.length;
                                                    if ((((length - i27) - i53) | i27 | i53) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i27), Integer.valueOf(i53)));
                                                    }
                                                    int i55 = i27 + i53;
                                                    char[] cArr = new char[i53];
                                                    int i56 = 0;
                                                    while (i27 < i55) {
                                                        byte b = bArr3[i27];
                                                        if (zzhk.zzd(b)) {
                                                            i27++;
                                                            cArr[i56] = (char) b;
                                                            i56++;
                                                        } else {
                                                            while (i27 < i55) {
                                                                int i57 = i27 + 1;
                                                                int i58 = i27;
                                                                byte b2 = bArr3[i58];
                                                                if (zzhk.zzd(b2)) {
                                                                    int i59 = i56 + 1;
                                                                    cArr[i56] = (char) b2;
                                                                    i27 = i57;
                                                                    while (true) {
                                                                        i56 = i59;
                                                                        if (i27 < i55) {
                                                                            byte b3 = bArr3[i27];
                                                                            if (zzhk.zzd(b3)) {
                                                                                i27++;
                                                                                i59 = i56 + 1;
                                                                                cArr[i56] = (char) b3;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i60 = i52;
                                                                    if (b2 < -32) {
                                                                        if (i57 >= i55) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        zzhk.zzc(b2, bArr3[i57], cArr, i56);
                                                                        i27 = i58 + 2;
                                                                        i56++;
                                                                    } else if (b2 < -16) {
                                                                        if (i57 >= i55 - 1) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        zzhk.zzb(b2, bArr3[i57], bArr3[i58 + 2], cArr, i56);
                                                                        i27 = i58 + 3;
                                                                        i52 = i60;
                                                                        i56++;
                                                                    } else {
                                                                        if (i57 >= i55 - 2) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        char[] cArr2 = cArr;
                                                                        zzhk.zza(b2, bArr3[i57], bArr3[i58 + 2], bArr3[i58 + 3], cArr2, i56);
                                                                        i56 += 2;
                                                                        cArr = cArr2;
                                                                        i27 = i58 + 4;
                                                                    }
                                                                    i52 = i60;
                                                                }
                                                            }
                                                            i24 = i52;
                                                            i25 = 0;
                                                            zzdtVar5.zzc = new String(cArr, 0, i56);
                                                            i27 = i55;
                                                        }
                                                    }
                                                    while (i27 < i55) {
                                                    }
                                                    i24 = i52;
                                                    i25 = 0;
                                                    zzdtVar5.zzc = new String(cArr, 0, i56);
                                                    i27 = i55;
                                                }
                                            } else {
                                                i24 = i52;
                                                i25 = 0;
                                                i27 = zzdu.zzh(bArr3, i26, zzdtVar5);
                                                int i61 = zzdtVar5.zza;
                                                if (i61 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i61 == 0) {
                                                    zzdtVar5.zzc = "";
                                                } else {
                                                    zzdtVar5.zzc = new String(bArr3, i27, i61, zzfa.zzb);
                                                    i27 += i61;
                                                }
                                            }
                                            unsafe3.putObject(obj4, j, zzdtVar5.zzc);
                                            i35 = i24 | i49;
                                            Object obj822 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i32 = i27;
                                            obj6 = obj822;
                                            i37 = i22;
                                            i31 = i25;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i30 = i2;
                                        }
                                        break;
                                    case 9:
                                        Object obj9 = obj6;
                                        Unsafe unsafe8 = unsafe5;
                                        i22 = i37;
                                        int i62 = i35;
                                        i7 = i46;
                                        if (i44 != 2) {
                                            i47 = i47;
                                            i32 = i32;
                                            obj3 = obj9;
                                            i24 = i62;
                                            unsafe2 = unsafe8;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            Object zzt = zzgaVar2.zzt(obj9, i7);
                                            i47 = i47;
                                            byte[] bArr6 = bArr4;
                                            int zzm2 = zzdu.zzm(zzt, zzgaVar2.zzr(i7), bArr6, i32, i2, zzdtVar);
                                            zzgaVar2.zzB(obj9, i7, zzt);
                                            i35 = i62 | i49;
                                            bArr4 = bArr6;
                                            unsafe5 = unsafe8;
                                            zzdtVar6 = zzdtVar;
                                            i32 = zzm2;
                                            obj6 = obj9;
                                            i37 = i22;
                                            i30 = i2;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i31 = 0;
                                        }
                                    case 10:
                                        Object obj10 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj10;
                                        zzdtVar6 = zzdtVar;
                                        i22 = i37;
                                        i28 = i35;
                                        i7 = i46;
                                        i29 = i47;
                                        if (i44 != 2) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i47 = i29;
                                            i24 = i28;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i32 = zzdu.zza(bArr4, i32, zzdtVar6);
                                            unsafe4.putObject(obj5, j, zzdtVar6.zzc);
                                            i35 = i28 | i49;
                                            Unsafe unsafe9 = unsafe4;
                                            obj6 = obj5;
                                            unsafe5 = unsafe9;
                                            i37 = i22;
                                            i30 = i2;
                                            i34 = i29;
                                            i33 = i7;
                                            i36 = i42;
                                            i31 = 0;
                                        }
                                    case 12:
                                        Object obj11 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj11;
                                        zzdtVar6 = zzdtVar;
                                        i22 = i37;
                                        i28 = i35;
                                        i7 = i46;
                                        i29 = i47;
                                        if (i44 != 0) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i47 = i29;
                                            i24 = i28;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i32 = zzdu.zzh(bArr4, i32, zzdtVar6);
                                            int i63 = zzdtVar6.zza;
                                            zzey zzq = zzgaVar2.zzq(i7);
                                            if ((i45 & Integer.MIN_VALUE) == 0 || zzq == null || zzq.zza()) {
                                                unsafe4.putInt(obj5, j, i63);
                                                i35 = i28 | i49;
                                                Unsafe unsafe92 = unsafe4;
                                                obj6 = obj5;
                                                unsafe5 = unsafe92;
                                                i37 = i22;
                                                i30 = i2;
                                                i34 = i29;
                                                i33 = i7;
                                                i36 = i42;
                                                i31 = 0;
                                            } else {
                                                zzc(obj5).zzh(i29, Long.valueOf(i63));
                                                obj6 = obj5;
                                                unsafe5 = unsafe4;
                                                i37 = i22;
                                                i34 = i29;
                                                i35 = i28;
                                                i33 = i7;
                                                i36 = i42;
                                                i31 = 0;
                                                i30 = i2;
                                            }
                                        }
                                        break;
                                    case 15:
                                        Object obj12 = obj6;
                                        Unsafe unsafe10 = unsafe5;
                                        zzdtVar6 = zzdtVar;
                                        i22 = i37;
                                        i28 = i35;
                                        i7 = i46;
                                        if (i44 != 0) {
                                            obj3 = obj12;
                                            unsafe2 = unsafe10;
                                            i24 = i28;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i32 = zzdu.zzh(bArr4, i32, zzdtVar6);
                                            unsafe10.putInt(obj12, j, zzej.zzb(zzdtVar6.zza));
                                            i35 = i28 | i49;
                                            obj6 = obj12;
                                            unsafe5 = unsafe10;
                                            i37 = i22;
                                            i30 = i2;
                                            i33 = i7;
                                            i36 = i42;
                                            i34 = i47;
                                            i31 = 0;
                                        }
                                    case 16:
                                        if (i44 != 0) {
                                            i7 = i46;
                                            i22 = i37;
                                            i24 = i35;
                                            obj3 = obj6;
                                            unsafe2 = unsafe5;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzdtVar6 = zzdtVar;
                                            int zzk2 = zzdu.zzk(bArr4, i32, zzdtVar6);
                                            unsafe5.putLong(obj6, j, zzej.zzc(zzdtVar6.zzb));
                                            i35 |= i49;
                                            obj6 = obj6;
                                            unsafe5 = unsafe5;
                                            i32 = zzk2;
                                            i33 = i46;
                                            i36 = i42;
                                            i34 = i47;
                                            i31 = 0;
                                            i30 = i2;
                                        }
                                    default:
                                        i21 = i32;
                                        i22 = i37;
                                        i7 = i46;
                                        i23 = 0;
                                        obj3 = obj6;
                                        i24 = i35;
                                        unsafe2 = unsafe5;
                                        if (i44 != 3) {
                                            i32 = i21;
                                            bArr2 = bArr;
                                            i8 = i22;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i35 = i24;
                                            i6 = i47;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            Object zzt2 = zzgaVar2.zzt(obj3, i7);
                                            int zzl = zzdu.zzl(zzt2, zzgaVar2.zzr(i7), bArr4, i21, i2, (i42 << 3) | 4, zzdtVar);
                                            zzgaVar2.zzB(obj3, i7, zzt2);
                                            i35 = i24 | i49;
                                            unsafe5 = unsafe2;
                                            bArr4 = bArr;
                                            zzdtVar6 = zzdtVar;
                                            i32 = zzl;
                                            i31 = i23;
                                            i33 = i7;
                                            i36 = i42;
                                            obj6 = obj3;
                                            i34 = i47;
                                            i37 = i22;
                                            i30 = i2;
                                        }
                                }
                            } else {
                                Unsafe unsafe11 = unsafe5;
                                obj2 = obj6;
                                i7 = i46;
                                if (zzn != 27) {
                                    unsafe = unsafe11;
                                    i8 = i37;
                                    i9 = i35;
                                    i10 = i32;
                                    zzdtVar3 = zzdtVar;
                                    if (zzn > 49) {
                                        zzga<T> zzgaVar3 = zzgaVar2;
                                        i6 = i47;
                                        if (zzn != 50) {
                                            Unsafe unsafe12 = zzb;
                                            long j2 = iArr[i7 + 2] & 1048575;
                                            switch (zzn) {
                                                case 51:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 1) {
                                                        unsafe12.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr2, i12))));
                                                        i13 = i12 + 8;
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                            i4 = i3;
                                                            i7 = i11;
                                                            break;
                                                        } else {
                                                            zzgaVar2 = this;
                                                            bArr4 = bArr2;
                                                            i34 = i6;
                                                            obj6 = obj2;
                                                            i36 = i42;
                                                            zzdtVar6 = zzdtVar2;
                                                            i33 = i11;
                                                            i37 = i8;
                                                            i35 = i9;
                                                            unsafe5 = unsafe;
                                                            i31 = 0;
                                                            i30 = i2;
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                case 52:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 5) {
                                                        unsafe12.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr2, i12))));
                                                        i13 = i12 + 4;
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 0) {
                                                        i13 = zzdu.zzk(bArr2, i12, zzdtVar2);
                                                        unsafe12.putObject(obj2, j, Long.valueOf(zzdtVar2.zzb));
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 0) {
                                                        i13 = zzdu.zzh(bArr2, i12, zzdtVar2);
                                                        unsafe12.putObject(obj2, j, Integer.valueOf(zzdtVar2.zza));
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 1) {
                                                        unsafe12.putObject(obj2, j, Long.valueOf(zzdu.zzn(bArr2, i12)));
                                                        i13 = i12 + 8;
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 5) {
                                                        unsafe12.putObject(obj2, j, Integer.valueOf(zzdu.zzb(bArr2, i12)));
                                                        i13 = i12 + 4;
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 58:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 0) {
                                                        i13 = zzdu.zzk(bArr2, i12, zzdtVar2);
                                                        unsafe12.putObject(obj2, j, Boolean.valueOf(zzdtVar2.zzb != 0));
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 59:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    if (i44 == 2) {
                                                        i13 = zzdu.zzh(bArr2, i12, zzdtVar2);
                                                        int i64 = zzdtVar2.zza;
                                                        if (i64 == 0) {
                                                            unsafe12.putObject(obj2, j, "");
                                                        } else {
                                                            if ((i45 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzhn.zzc(bArr2, i13, i13 + i64)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            unsafe12.putObject(obj2, j, new String(bArr2, i13, i64, zzfa.zzb));
                                                            i13 += i64;
                                                        }
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = i13;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 60:
                                                    bArr2 = bArr;
                                                    if (i44 == 2) {
                                                        Object zzu = zzgaVar3.zzu(obj2, i42, i7);
                                                        int zzm3 = zzdu.zzm(zzu, zzgaVar3.zzr(i7), bArr2, i10, i2, zzdtVar);
                                                        zzdtVar2 = zzdtVar;
                                                        bArr2 = bArr2;
                                                        zzgaVar3.zzC(obj2, i42, i7, zzu);
                                                        i32 = zzm3;
                                                        i11 = i7;
                                                        i12 = i10;
                                                        if (i32 != i12) {
                                                        }
                                                    } else {
                                                        zzdtVar2 = zzdtVar;
                                                        i11 = i7;
                                                        i12 = i10;
                                                        i32 = i12;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    bArr2 = bArr;
                                                    zzdtVar4 = zzdtVar;
                                                    if (i44 == 2) {
                                                        zza2 = zzdu.zza(bArr2, i10, zzdtVar4);
                                                        unsafe12.putObject(obj2, j, zzdtVar4.zzc);
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = zza2;
                                                        i11 = i7;
                                                        i12 = i10;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar4;
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr2 = bArr;
                                                    zzdtVar4 = zzdtVar;
                                                    i11 = i7;
                                                    if (i44 == 0) {
                                                        zza2 = zzdu.zzh(bArr2, i10, zzdtVar4);
                                                        int i65 = zzdtVar4.zza;
                                                        i7 = i11;
                                                        zzey zzq2 = zzgaVar3.zzq(i7);
                                                        if (zzq2 == null || zzq2.zza()) {
                                                            i6 = i6;
                                                            unsafe12.putObject(obj2, j, Integer.valueOf(i65));
                                                            unsafe12.putInt(obj2, j2, i42);
                                                        } else {
                                                            i6 = i6;
                                                            zzc(obj2).zzh(i6, Long.valueOf(i65));
                                                        }
                                                        i32 = zza2;
                                                        i11 = i7;
                                                        i12 = i10;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i32 != i12) {
                                                        }
                                                    } else {
                                                        i6 = i6;
                                                        i12 = i10;
                                                        zzdtVar2 = zzdtVar4;
                                                        i32 = i12;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    break;
                                                case 66:
                                                    bArr2 = bArr;
                                                    zzdtVar4 = zzdtVar;
                                                    i14 = i6;
                                                    i11 = i7;
                                                    if (i44 == 0) {
                                                        zzh = zzdu.zzh(bArr2, i10, zzdtVar4);
                                                        unsafe12.putObject(obj2, j, Integer.valueOf(zzej.zzb(zzdtVar4.zza)));
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = zzh;
                                                        i12 = i10;
                                                        i6 = i14;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i32 != i12) {
                                                        }
                                                    } else {
                                                        i12 = i10;
                                                        i6 = i14;
                                                        zzdtVar2 = zzdtVar4;
                                                        i32 = i12;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                    bArr2 = bArr;
                                                    zzdtVar4 = zzdtVar;
                                                    if (i44 == 0) {
                                                        zzh = zzdu.zzk(bArr2, i10, zzdtVar4);
                                                        i14 = i6;
                                                        i11 = i7;
                                                        unsafe12.putObject(obj2, j, Long.valueOf(zzej.zzc(zzdtVar4.zzb)));
                                                        unsafe12.putInt(obj2, j2, i42);
                                                        i32 = zzh;
                                                        i12 = i10;
                                                        i6 = i14;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar4;
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i44 == 3) {
                                                        Object zzu2 = zzgaVar3.zzu(obj2, i42, i7);
                                                        zza2 = zzdu.zzl(zzu2, zzgaVar3.zzr(i7), bArr, i10, i2, (i6 & (-8)) | 4, zzdtVar);
                                                        zzdtVar4 = zzdtVar;
                                                        bArr2 = bArr;
                                                        zzgaVar3.zzC(obj2, i42, i7, zzu2);
                                                        i32 = zza2;
                                                        i11 = i7;
                                                        i12 = i10;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i32 != i12) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bArr2 = bArr;
                                                    i11 = i7;
                                                    i12 = i10;
                                                    zzdtVar2 = zzdtVar;
                                                    i32 = i12;
                                                    if (i32 != i12) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i44 == 2) {
                                                Unsafe unsafe13 = zzb;
                                                Object zzs = zzgaVar3.zzs(i7);
                                                Object object = unsafe13.getObject(obj2, j);
                                                if (!((zzfr) object).zze()) {
                                                    zzfr zzb2 = zzfr.zza().zzb();
                                                    zzfs.zza(zzb2, object);
                                                    unsafe13.putObject(obj2, j, zzb2);
                                                }
                                                throw null;
                                            }
                                            bArr2 = bArr;
                                            i4 = i3;
                                            i32 = i10;
                                            i35 = i9;
                                            zzdtVar2 = zzdtVar3;
                                        }
                                    } else {
                                        long j3 = i45;
                                        Unsafe unsafe14 = zzb;
                                        zzez zzezVar = (zzez) unsafe14.getObject(obj2, j);
                                        if (!zzezVar.zzc()) {
                                            int size = zzezVar.size();
                                            zzezVar = zzezVar.zzd(size != 0 ? size + size : 10);
                                            unsafe14.putObject(obj2, j, zzezVar);
                                        }
                                        switch (zzn) {
                                            case 18:
                                            case 35:
                                                zzez zzezVar2 = zzezVar;
                                                i6 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 != 2) {
                                                    if (i44 == 1) {
                                                        zzek zzekVar = (zzek) zzezVar2;
                                                        zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i15)));
                                                        i16 = i15 + 8;
                                                        while (i16 < i2) {
                                                            int zzh4 = zzdu.zzh(bArr, i16, zzdtVar3);
                                                            if (i6 == zzdtVar3.zza) {
                                                                zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, zzh4)));
                                                                i16 = zzh4 + 8;
                                                            }
                                                        }
                                                    }
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                        bArr2 = bArr;
                                                        i4 = i3;
                                                        zzdtVar2 = zzdtVar3;
                                                        break;
                                                    } else {
                                                        bArr4 = bArr;
                                                        i33 = i7;
                                                        obj6 = obj2;
                                                        zzgaVar2 = zzgaVar;
                                                        i36 = i42;
                                                        i37 = i8;
                                                        i35 = i9;
                                                        unsafe5 = unsafe;
                                                        i31 = 0;
                                                        zzdtVar6 = zzdtVar3;
                                                        i34 = i6;
                                                        i30 = i2;
                                                    }
                                                } else {
                                                    zzek zzekVar2 = (zzek) zzezVar2;
                                                    i16 = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i66 = zzdtVar3.zza + i16;
                                                    while (i16 < i66) {
                                                        zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i16)));
                                                        i16 += 8;
                                                    }
                                                    if (i16 != i66) {
                                                        throw zzfb.zzf();
                                                    }
                                                }
                                                i32 = i16;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                            case 19:
                                            case 36:
                                                zzez zzezVar3 = zzezVar;
                                                i6 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzer zzerVar = (zzer) zzezVar3;
                                                    i16 = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i67 = zzdtVar3.zza + i16;
                                                    while (i16 < i67) {
                                                        zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i16)));
                                                        i16 += 4;
                                                    }
                                                    if (i16 != i67) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 5) {
                                                        zzer zzerVar2 = (zzer) zzezVar3;
                                                        zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i15)));
                                                        i16 = i15 + 4;
                                                        while (i16 < i2) {
                                                            int zzh5 = zzdu.zzh(bArr, i16, zzdtVar3);
                                                            if (i6 == zzdtVar3.zza) {
                                                                zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, zzh5)));
                                                                i16 = zzh5 + 4;
                                                            }
                                                        }
                                                    }
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i32 = i16;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                zzez zzezVar4 = zzezVar;
                                                i6 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzfm zzfmVar = (zzfm) zzezVar4;
                                                    i16 = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i68 = zzdtVar3.zza + i16;
                                                    while (i16 < i68) {
                                                        i16 = zzdu.zzk(bArr, i16, zzdtVar3);
                                                        zzfmVar.zze(zzdtVar3.zzb);
                                                    }
                                                    if (i16 != i68) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 0) {
                                                        zzfm zzfmVar2 = (zzfm) zzezVar4;
                                                        i16 = zzdu.zzk(bArr, i15, zzdtVar3);
                                                        zzfmVar2.zze(zzdtVar3.zzb);
                                                        while (i16 < i2) {
                                                            int zzh6 = zzdu.zzh(bArr, i16, zzdtVar3);
                                                            if (i6 == zzdtVar3.zza) {
                                                                i16 = zzdu.zzk(bArr, zzh6, zzdtVar3);
                                                                zzfmVar2.zze(zzdtVar3.zzb);
                                                            }
                                                        }
                                                    }
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i32 = i16;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzf = zzdu.zzf(bArr, i15, zzezVar, zzdtVar3);
                                                    i32 = zzf;
                                                    i6 = i17;
                                                    i10 = i15;
                                                    if (i32 == i10) {
                                                    }
                                                } else {
                                                    if (i44 == 0) {
                                                        int zzj2 = zzdu.zzj(i17, bArr, i15, i2, zzezVar, zzdtVar3);
                                                        i6 = i17;
                                                        i32 = zzj2;
                                                        i10 = i15;
                                                        if (i32 == i10) {
                                                        }
                                                    }
                                                    i6 = i17;
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzfm zzfmVar3 = (zzfm) zzezVar;
                                                    zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i69 = zzdtVar3.zza + zzf;
                                                    while (zzf < i69) {
                                                        zzfmVar3.zze(zzdu.zzn(bArr, zzf));
                                                        zzf += 8;
                                                    }
                                                    if (zzf != i69) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 1) {
                                                        zzfm zzfmVar4 = (zzfm) zzezVar;
                                                        zzfmVar4.zze(zzdu.zzn(bArr, i15));
                                                        zzf = i15 + 8;
                                                        while (zzf < i2) {
                                                            int zzh7 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                            if (i17 == zzdtVar3.zza) {
                                                                zzfmVar4.zze(zzdu.zzn(bArr, zzh7));
                                                                zzf = zzh7 + 8;
                                                            }
                                                        }
                                                    }
                                                    i6 = i17;
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i32 = zzf;
                                                i6 = i17;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzew zzewVar = (zzew) zzezVar;
                                                    zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i70 = zzdtVar3.zza + zzf;
                                                    while (zzf < i70) {
                                                        zzewVar.zze(zzdu.zzb(bArr, zzf));
                                                        zzf += 4;
                                                    }
                                                    if (zzf != i70) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 5) {
                                                        zzew zzewVar2 = (zzew) zzezVar;
                                                        zzewVar2.zze(zzdu.zzb(bArr, i15));
                                                        zzf = i15 + 4;
                                                        while (zzf < i2) {
                                                            int zzh8 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                            if (i17 == zzdtVar3.zza) {
                                                                zzewVar2.zze(zzdu.zzb(bArr, zzh8));
                                                                zzf = zzh8 + 4;
                                                            }
                                                        }
                                                    }
                                                    i6 = i17;
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i32 = zzf;
                                                i6 = i17;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    zzdv zzdvVar = (zzdv) zzezVar;
                                                    zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i71 = zzdtVar3.zza + zzf;
                                                    while (zzf < i71) {
                                                        zzf = zzdu.zzk(bArr, zzf, zzdtVar3);
                                                        zzdvVar.zze(zzdtVar3.zzb != 0);
                                                    }
                                                    if (zzf != i71) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 0) {
                                                        zzdv zzdvVar2 = (zzdv) zzezVar;
                                                        zzf = zzdu.zzk(bArr, i15, zzdtVar3);
                                                        zzdvVar2.zze(zzdtVar3.zzb != 0);
                                                        while (zzf < i2) {
                                                            int zzh9 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                            if (i17 == zzdtVar3.zza) {
                                                                zzf = zzdu.zzk(bArr, zzh9, zzdtVar3);
                                                                zzdvVar2.zze(zzdtVar3.zzb != 0);
                                                            }
                                                        }
                                                    }
                                                    i6 = i17;
                                                    i10 = i15;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i32 = zzf;
                                                i6 = i17;
                                                i10 = i15;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 26:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 2) {
                                                    if ((j3 & 536870912) == 0) {
                                                        zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                        int i72 = zzdtVar3.zza;
                                                        if (i72 < 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i72 == 0) {
                                                            zzezVar.add("");
                                                        } else {
                                                            zzezVar.add(new String(bArr, zzf, i72, zzfa.zzb));
                                                            zzf += i72;
                                                        }
                                                        while (zzf < i2) {
                                                            int zzh10 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                            if (i17 == zzdtVar3.zza) {
                                                                zzf = zzdu.zzh(bArr, zzh10, zzdtVar3);
                                                                int i73 = zzdtVar3.zza;
                                                                if (i73 < 0) {
                                                                    throw zzfb.zzc();
                                                                }
                                                                if (i73 == 0) {
                                                                    zzezVar.add("");
                                                                } else {
                                                                    zzezVar.add(new String(bArr, zzf, i73, zzfa.zzb));
                                                                    zzf += i73;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                        int i74 = zzdtVar3.zza;
                                                        if (i74 < 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i74 == 0) {
                                                            zzezVar.add("");
                                                        } else {
                                                            int i75 = zzf + i74;
                                                            if (!zzhn.zzc(bArr, zzf, i75)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            zzezVar.add(new String(bArr, zzf, i74, zzfa.zzb));
                                                            zzf = i75;
                                                        }
                                                        while (zzf < i2) {
                                                            int zzh11 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                            if (i17 == zzdtVar3.zza) {
                                                                zzf = zzdu.zzh(bArr, zzh11, zzdtVar3);
                                                                int i76 = zzdtVar3.zza;
                                                                if (i76 < 0) {
                                                                    throw zzfb.zzc();
                                                                }
                                                                if (i76 == 0) {
                                                                    zzezVar.add("");
                                                                } else {
                                                                    int i77 = zzf + i76;
                                                                    if (!zzhn.zzc(bArr, zzf, i77)) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    zzezVar.add(new String(bArr, zzf, i76, zzfa.zzb));
                                                                    zzf = i77;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i32 = zzf;
                                                    i6 = i17;
                                                    i10 = i15;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i6 = i17;
                                                i10 = i15;
                                                i32 = i10;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 27:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                if (i44 == 2) {
                                                    zzgaVar = this;
                                                    i32 = zzdu.zze(zzgaVar.zzr(i7), i17, bArr, i15, i2, zzezVar, zzdtVar3);
                                                    i6 = i17;
                                                    zzdtVar3 = zzdtVar3;
                                                    i10 = i15;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                zzgaVar = this;
                                                i6 = i17;
                                                i10 = i15;
                                                i32 = i10;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 28:
                                                i17 = i47;
                                                i15 = i10;
                                                i7 = i7;
                                                if (i44 == 2) {
                                                    zzf = zzdu.zzh(bArr, i15, zzdtVar3);
                                                    int i78 = zzdtVar3.zza;
                                                    if (i78 < 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i78 > bArr.length - zzf) {
                                                        throw zzfb.zzf();
                                                    }
                                                    if (i78 == 0) {
                                                        zzezVar.add(zzef.zzb);
                                                    } else {
                                                        zzezVar.add(zzef.zzk(bArr, zzf, i78));
                                                        zzf += i78;
                                                    }
                                                    while (zzf < i2) {
                                                        int zzh12 = zzdu.zzh(bArr, zzf, zzdtVar3);
                                                        if (i17 == zzdtVar3.zza) {
                                                            zzf = zzdu.zzh(bArr, zzh12, zzdtVar3);
                                                            int i79 = zzdtVar3.zza;
                                                            if (i79 < 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i79 > bArr.length - zzf) {
                                                                throw zzfb.zzf();
                                                            }
                                                            if (i79 == 0) {
                                                                zzezVar.add(zzef.zzb);
                                                            } else {
                                                                zzezVar.add(zzef.zzk(bArr, zzf, i79));
                                                                zzf += i79;
                                                            }
                                                        } else {
                                                            zzgaVar = this;
                                                            i32 = zzf;
                                                            i6 = i17;
                                                            i10 = i15;
                                                            if (i32 == i10) {
                                                            }
                                                        }
                                                    }
                                                    zzgaVar = this;
                                                    i32 = zzf;
                                                    i6 = i17;
                                                    i10 = i15;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                zzgaVar = this;
                                                i6 = i17;
                                                i10 = i15;
                                                i32 = i10;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                if (i44 == 2) {
                                                    zzj = zzdu.zzf(bArr, i10, zzezVar, zzdtVar3);
                                                    i18 = i47;
                                                    i19 = i10;
                                                } else if (i44 == 0) {
                                                    i18 = i47;
                                                    zzj = zzdu.zzj(i18, bArr, i10, i2, zzezVar, zzdtVar3);
                                                    i19 = i10;
                                                } else {
                                                    i7 = i7;
                                                    zzgaVar = this;
                                                    i6 = i47;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i7 = i7;
                                                zzey zzq3 = zzgaVar2.zzq(i7);
                                                zzgz zzgzVar = zzgaVar2.zzl;
                                                int i80 = zzgk.zza;
                                                if (zzq3 == null) {
                                                    i20 = zzj;
                                                } else if (zzezVar instanceof RandomAccess) {
                                                    int size2 = zzezVar.size();
                                                    Object obj13 = null;
                                                    int i81 = 0;
                                                    int i82 = 0;
                                                    while (i81 < size2) {
                                                        int i83 = zzj;
                                                        Integer num = (Integer) zzezVar.get(i81);
                                                        int intValue = num.intValue();
                                                        if (zzq3.zza()) {
                                                            if (i81 != i82) {
                                                                zzezVar.set(i82, num);
                                                            }
                                                            i82++;
                                                        } else {
                                                            obj13 = zzgk.zzc(obj2, i42, intValue, obj13, zzgzVar);
                                                        }
                                                        i81++;
                                                        zzj = i83;
                                                    }
                                                    i20 = zzj;
                                                    if (i82 != size2) {
                                                        zzezVar.subList(i82, size2).clear();
                                                    }
                                                } else {
                                                    i20 = zzj;
                                                    Iterator it = zzezVar.iterator();
                                                    Object obj14 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzq3.zza()) {
                                                            obj14 = zzgk.zzc(obj2, i42, intValue2, obj14, zzgzVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzgaVar = this;
                                                i6 = i18;
                                                i10 = i19;
                                                i32 = i20;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                if (i44 == 2) {
                                                    zzew zzewVar3 = (zzew) zzezVar;
                                                    zzh2 = zzdu.zzh(bArr, i10, zzdtVar3);
                                                    int i84 = zzdtVar3.zza + zzh2;
                                                    while (zzh2 < i84) {
                                                        zzh2 = zzdu.zzh(bArr, zzh2, zzdtVar3);
                                                        zzewVar3.zze(zzej.zzb(zzdtVar3.zza));
                                                    }
                                                    if (zzh2 != i84) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 0) {
                                                        zzew zzewVar4 = (zzew) zzezVar;
                                                        zzh2 = zzdu.zzh(bArr, i10, zzdtVar3);
                                                        zzewVar4.zze(zzej.zzb(zzdtVar3.zza));
                                                        while (zzh2 < i2) {
                                                            int zzh13 = zzdu.zzh(bArr, zzh2, zzdtVar3);
                                                            if (i47 == zzdtVar3.zza) {
                                                                zzh2 = zzdu.zzh(bArr, zzh13, zzdtVar3);
                                                                zzewVar4.zze(zzej.zzb(zzdtVar3.zza));
                                                            }
                                                        }
                                                    }
                                                    zzgaVar = zzgaVar2;
                                                    i6 = i47;
                                                    i7 = i7;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                zzgaVar = zzgaVar2;
                                                i6 = i47;
                                                i7 = i7;
                                                i32 = zzh2;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                if (i44 == 2) {
                                                    zzfm zzfmVar5 = (zzfm) zzezVar;
                                                    zzh2 = zzdu.zzh(bArr, i10, zzdtVar3);
                                                    int i85 = zzdtVar3.zza + zzh2;
                                                    while (zzh2 < i85) {
                                                        zzh2 = zzdu.zzk(bArr, zzh2, zzdtVar3);
                                                        zzfmVar5.zze(zzej.zzc(zzdtVar3.zzb));
                                                    }
                                                    if (zzh2 != i85) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i44 == 0) {
                                                        zzfm zzfmVar6 = (zzfm) zzezVar;
                                                        zzh2 = zzdu.zzk(bArr, i10, zzdtVar3);
                                                        zzfmVar6.zze(zzej.zzc(zzdtVar3.zzb));
                                                        while (zzh2 < i2) {
                                                            int zzh14 = zzdu.zzh(bArr, zzh2, zzdtVar3);
                                                            if (i47 == zzdtVar3.zza) {
                                                                zzh2 = zzdu.zzk(bArr, zzh14, zzdtVar3);
                                                                zzfmVar6.zze(zzej.zzc(zzdtVar3.zzb));
                                                            }
                                                        }
                                                    }
                                                    zzgaVar = zzgaVar2;
                                                    i6 = i47;
                                                    i7 = i7;
                                                    i32 = i10;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                zzgaVar = zzgaVar2;
                                                i6 = i47;
                                                i7 = i7;
                                                i32 = zzh2;
                                                if (i32 == i10) {
                                                }
                                                break;
                                            default:
                                                zzez zzezVar5 = zzezVar;
                                                i6 = i47;
                                                int i86 = i2;
                                                i15 = i10;
                                                i7 = i7;
                                                zzgaVar = zzgaVar2;
                                                if (i44 == 3) {
                                                    zzgi zzr = zzgaVar.zzr(i7);
                                                    int i87 = (i6 & (-8)) | 4;
                                                    int zzc = zzdu.zzc(zzr, bArr, i15, i86, i87, zzdtVar3);
                                                    i10 = i15;
                                                    zzezVar5.add(zzdtVar3.zzc);
                                                    while (zzc < i86) {
                                                        int zzh15 = zzdu.zzh(bArr, zzc, zzdtVar3);
                                                        if (i6 == zzdtVar3.zza) {
                                                            zzc = zzdu.zzc(zzr, bArr, zzh15, i86, i87, zzdtVar3);
                                                            zzezVar5.add(zzdtVar3.zzc);
                                                            i86 = i2;
                                                        } else {
                                                            i32 = zzc;
                                                            if (i32 == i10) {
                                                            }
                                                        }
                                                    }
                                                    i32 = zzc;
                                                    if (i32 == i10) {
                                                    }
                                                }
                                                i10 = i15;
                                                i32 = i10;
                                                if (i32 == i10) {
                                                }
                                                break;
                                        }
                                    }
                                    i35 = i9;
                                } else if (i44 == 2) {
                                    zzez zzezVar6 = (zzez) unsafe11.getObject(obj2, j);
                                    if (!zzezVar6.zzc()) {
                                        int size3 = zzezVar6.size();
                                        zzezVar6 = zzezVar6.zzd(size3 != 0 ? size3 + size3 : 10);
                                        unsafe11.putObject(obj2, j, zzezVar6);
                                    }
                                    int zze = zzdu.zze(zzgaVar2.zzr(i7), i47, bArr, i32, i2, zzezVar6, zzdtVar);
                                    bArr4 = bArr;
                                    i34 = i47;
                                    i33 = i7;
                                    obj6 = obj2;
                                    i36 = i42;
                                    i31 = 0;
                                    zzdtVar6 = zzdtVar;
                                    i32 = zze;
                                    unsafe5 = unsafe11;
                                    i30 = i2;
                                } else {
                                    zzdtVar3 = zzdtVar;
                                    unsafe = unsafe11;
                                    i8 = i37;
                                    i9 = i35;
                                    i6 = i47;
                                    i10 = i32;
                                    bArr2 = bArr;
                                    i4 = i3;
                                    i32 = i10;
                                    i35 = i9;
                                    zzdtVar2 = zzdtVar3;
                                }
                            }
                        }
                        if (i6 == i4 || i4 == 0) {
                            int i88 = i6;
                            i32 = zzdu.zzg(i88, bArr2, i32, i2, zzc(obj2), zzdtVar2);
                            zzgaVar2 = this;
                            bArr4 = bArr;
                            i34 = i88;
                            i30 = i2;
                            i33 = i7;
                            obj6 = obj2;
                            i36 = i42;
                            i37 = i8;
                            unsafe5 = unsafe;
                            i31 = 0;
                            zzdtVar6 = zzdtVar;
                        } else {
                            i5 = i2;
                            i34 = i6;
                            i37 = i8;
                        }
                    }
                    zzm = -1;
                    if (zzm != -1) {
                    }
                    if (i6 == i4) {
                    }
                    int i882 = i6;
                    i32 = zzdu.zzg(i882, bArr2, i32, i2, zzc(obj2), zzdtVar2);
                    zzgaVar2 = this;
                    bArr4 = bArr;
                    i34 = i882;
                    i30 = i2;
                    i33 = i7;
                    obj6 = obj2;
                    i36 = i42;
                    i37 = i8;
                    unsafe5 = unsafe;
                    i31 = 0;
                    zzdtVar6 = zzdtVar;
                } else {
                    if (i42 >= zzgaVar2.zze && i42 <= zzgaVar2.zzf) {
                        zzm = zzgaVar2.zzm(i42, i31);
                        if (zzm != -1) {
                        }
                        if (i6 == i4) {
                        }
                        int i8822 = i6;
                        i32 = zzdu.zzg(i8822, bArr2, i32, i2, zzc(obj2), zzdtVar2);
                        zzgaVar2 = this;
                        bArr4 = bArr;
                        i34 = i8822;
                        i30 = i2;
                        i33 = i7;
                        obj6 = obj2;
                        i36 = i42;
                        i37 = i8;
                        unsafe5 = unsafe;
                        i31 = 0;
                        zzdtVar6 = zzdtVar;
                    }
                    zzm = -1;
                    if (zzm != -1) {
                    }
                    if (i6 == i4) {
                    }
                    int i88222 = i6;
                    i32 = zzdu.zzg(i88222, bArr2, i32, i2, zzc(obj2), zzdtVar2);
                    zzgaVar2 = this;
                    bArr4 = bArr;
                    i34 = i88222;
                    i30 = i2;
                    i33 = i7;
                    obj6 = obj2;
                    i36 = i42;
                    i37 = i8;
                    unsafe5 = unsafe;
                    i31 = 0;
                    zzdtVar6 = zzdtVar;
                }
            } else {
                i4 = i3;
                unsafe = unsafe5;
                obj2 = obj6;
                i5 = i30;
            }
        }
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
            for (int i = 0; i < length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
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
                                this.zzk.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i], i)) {
                        zzr(i).zze(zzb.getObject(obj, j));
                    }
                }
                if (zzE(obj, i)) {
                    zzr(i).zze(zzb.getObject(obj, j));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i)) {
                        zzhj.zzl(obj, j, zzhj.zza(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i)) {
                        zzhj.zzm(obj, j, zzhj.zzb(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i)) {
                        zzhj.zzk(obj, j, zzhj.zzt(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i);
                    break;
                case 10:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i);
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
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzgk.zza;
                    zzhj.zzp(obj, j, zzfs.zza(zzhj.zzf(obj, j), zzhj.zzf(obj2, j)));
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
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i, i2, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i) && Double.doubleToLongBits(zzhj.zza(obj, j)) == Double.doubleToLongBits(zzhj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i) && Float.floatToIntBits(zzhj.zzb(obj, j)) == Float.floatToIntBits(zzhj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i) && zzhj.zzt(obj, j) == zzhj.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
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
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
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
                    long zzl = zzl(i) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
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
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzi) {
            int i6 = this.zzh[i3];
            int i7 = this.zzc[i6];
            int zzo = zzo(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & zzo) != 0 && !zzF(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj2, i7, i6) && !zzG(obj2, zzo, zzr(i6))) {
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
                    zzgi zzr = zzr(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzr.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj2, i6, i, i2, i10) && !zzG(obj2, zzo, zzr(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return true;
    }
}
