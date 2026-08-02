package com.google.android.gms.internal.auth;

import N3.C3660k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
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

    private zzga(int[] iArr, Object[] objArr, int i11, int i12, zzfx zzfxVar, int i13, boolean z11, int[] iArr2, int i14, int i15, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        this.zzh = iArr2;
        this.zzi = i14;
        this.zzj = i15;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i11, int i12) {
        zzhj.zzn(obj, zzl(i12) & 1048575, i11);
    }

    private final void zzB(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzz(obj, i11);
    }

    private final void zzC(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzo(i12) & 1048575, obj2);
        zzA(obj, i11, i12);
    }

    private final boolean zzD(Object obj, Object obj2, int i11) {
        return zzE(obj, i11) == zzE(obj2, i11);
    }

    private final boolean zzE(Object obj, int i11) {
        int zzl = zzl(i11);
        long j11 = zzl & 1048575;
        if (j11 != 1048575) {
            return (zzhj.zzc(obj, j11) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i11);
        long j12 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j12)) != 0;
            case 2:
                return zzhj.zzd(obj, j12) != 0;
            case 3:
                return zzhj.zzd(obj, j12) != 0;
            case 4:
                return zzhj.zzc(obj, j12) != 0;
            case 5:
                return zzhj.zzd(obj, j12) != 0;
            case 6:
                return zzhj.zzc(obj, j12) != 0;
            case 7:
                return zzhj.zzt(obj, j12);
            case 8:
                Object zzf = zzhj.zzf(obj, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j12) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j12));
            case 11:
                return zzhj.zzc(obj, j12) != 0;
            case 12:
                return zzhj.zzc(obj, j12) != 0;
            case 13:
                return zzhj.zzc(obj, j12) != 0;
            case 14:
                return zzhj.zzd(obj, j12) != 0;
            case 15:
                return zzhj.zzc(obj, j12) != 0;
            case 16:
                return zzhj.zzd(obj, j12) != 0;
            case 17:
                return zzhj.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? zzE(obj, i11) : (i13 & i14) != 0;
    }

    private static boolean zzG(Object obj, int i11, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i11 & 1048575));
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

    private final boolean zzI(Object obj, int i11, int i12) {
        return zzhj.zzc(obj, (long) (zzl(i12) & 1048575)) == i11;
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i11;
        int charAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        char charAt2;
        int i19;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        int i28;
        zzgh zzghVar;
        int i29;
        int i31;
        int i32;
        String str;
        int i33;
        int i34;
        int i35;
        int i36;
        Field zzv;
        char charAt10;
        int i37;
        int i38;
        Object obj;
        Field zzv2;
        Object obj2;
        Field zzv3;
        int i39;
        char charAt11;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43;
        char charAt14;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String zzd = zzghVar2.zzd();
        int length = zzd.length();
        char c11 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i11 = i44 + 1;
                if (zzd.charAt(i44) < 55296) {
                    break;
                }
                i44 = i11;
            }
        } else {
            i11 = 1;
        }
        int i45 = i11 + 1;
        int charAt15 = zzd.charAt(i11);
        if (charAt15 >= 55296) {
            int i46 = charAt15 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                charAt14 = zzd.charAt(i45);
                if (charAt14 < 55296) {
                    break;
                }
                i46 |= (charAt14 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            charAt15 = i46 | (charAt14 << i47);
            i45 = i43;
        }
        if (charAt15 == 0) {
            i14 = 0;
            charAt = 0;
            i13 = 0;
            i15 = 0;
            i12 = 0;
            i16 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt16 = zzd.charAt(i45);
            if (charAt16 >= 55296) {
                int i49 = charAt16 & 8191;
                int i51 = 13;
                while (true) {
                    i26 = i48 + 1;
                    charAt9 = zzd.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i51;
                    i51 += 13;
                    i48 = i26;
                }
                charAt16 = i49 | (charAt9 << i51);
                i48 = i26;
            }
            int i52 = i48 + 1;
            int charAt17 = zzd.charAt(i48);
            if (charAt17 >= 55296) {
                int i53 = charAt17 & 8191;
                int i54 = 13;
                while (true) {
                    i25 = i52 + 1;
                    charAt8 = zzd.charAt(i52);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i53 |= (charAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i25;
                }
                charAt17 = i53 | (charAt8 << i54);
                i52 = i25;
            }
            int i55 = i52 + 1;
            int charAt18 = zzd.charAt(i52);
            if (charAt18 >= 55296) {
                int i56 = charAt18 & 8191;
                int i57 = 13;
                while (true) {
                    i24 = i55 + 1;
                    charAt7 = zzd.charAt(i55);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i56 |= (charAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i24;
                }
                charAt18 = i56 | (charAt7 << i57);
                i55 = i24;
            }
            int i58 = i55 + 1;
            int charAt19 = zzd.charAt(i55);
            if (charAt19 >= 55296) {
                int i59 = charAt19 & 8191;
                int i61 = 13;
                while (true) {
                    i23 = i58 + 1;
                    charAt6 = zzd.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i58 = i23;
                }
                charAt19 = i59 | (charAt6 << i61);
                i58 = i23;
            }
            int i62 = i58 + 1;
            charAt = zzd.charAt(i58);
            if (charAt >= 55296) {
                int i63 = charAt & 8191;
                int i64 = 13;
                while (true) {
                    i22 = i62 + 1;
                    charAt5 = zzd.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i22;
                }
                charAt = i63 | (charAt5 << i64);
                i62 = i22;
            }
            int i65 = i62 + 1;
            int charAt20 = zzd.charAt(i62);
            if (charAt20 >= 55296) {
                int i66 = charAt20 & 8191;
                int i67 = 13;
                while (true) {
                    i21 = i65 + 1;
                    charAt4 = zzd.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i65 = i21;
                }
                charAt20 = i66 | (charAt4 << i67);
                i65 = i21;
            }
            int i68 = i65 + 1;
            int charAt21 = zzd.charAt(i65);
            if (charAt21 >= 55296) {
                int i69 = charAt21 & 8191;
                int i71 = 13;
                while (true) {
                    i19 = i68 + 1;
                    charAt3 = zzd.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i69 |= (charAt3 & 8191) << i71;
                    i71 += 13;
                    i68 = i19;
                }
                charAt21 = i69 | (charAt3 << i71);
                i68 = i19;
            }
            int i72 = i68 + 1;
            int charAt22 = zzd.charAt(i68);
            if (charAt22 >= 55296) {
                int i73 = charAt22 & 8191;
                int i74 = 13;
                while (true) {
                    i18 = i72 + 1;
                    charAt2 = zzd.charAt(i72);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i73 |= (charAt2 & 8191) << i74;
                    i74 += 13;
                    i72 = i18;
                }
                charAt22 = i73 | (charAt2 << i74);
                i72 = i18;
            }
            i12 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i75 = charAt20;
            i13 = charAt18;
            i14 = i75;
            iArr = iArr2;
            i15 = charAt19;
            i16 = charAt22;
            i17 = charAt16;
            i45 = i72;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i76 = i16 + i14;
        int i77 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i77];
        int i78 = 0;
        int i79 = 0;
        int i81 = i16;
        int i82 = i76;
        while (i45 < length) {
            int i83 = i45 + 1;
            int charAt23 = zzd.charAt(i45);
            if (charAt23 >= c11) {
                int i84 = charAt23 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i42 = i85 + 1;
                    charAt13 = zzd.charAt(i85);
                    if (charAt13 < c11) {
                        break;
                    }
                    i84 |= (charAt13 & 8191) << i86;
                    i86 += 13;
                    i85 = i42;
                }
                charAt23 = i84 | (charAt13 << i86);
                i27 = i42;
            } else {
                i27 = i83;
            }
            int i87 = i27 + 1;
            int charAt24 = zzd.charAt(i27);
            if (charAt24 >= c11) {
                int i88 = charAt24 & 8191;
                int i89 = i87;
                int i91 = 13;
                while (true) {
                    i41 = i89 + 1;
                    charAt12 = zzd.charAt(i89);
                    if (charAt12 < c11) {
                        break;
                    }
                    i88 |= (charAt12 & 8191) << i91;
                    i91 += 13;
                    i89 = i41;
                }
                charAt24 = i88 | (charAt12 << i91);
                i28 = i41;
            } else {
                i28 = i87;
            }
            if ((charAt24 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i78] = i79;
                i78++;
            }
            int i92 = charAt24 & 255;
            if (i92 >= 51) {
                int i93 = i28 + 1;
                int charAt25 = zzd.charAt(i28);
                zzghVar = zzghVar2;
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i94 = charAt25 & 8191;
                    int i95 = 13;
                    while (true) {
                        i39 = i93 + 1;
                        charAt11 = zzd.charAt(i93);
                        if (charAt11 < c12) {
                            break;
                        }
                        i94 |= (charAt11 & 8191) << i95;
                        i95 += 13;
                        i93 = i39;
                        c12 = 55296;
                    }
                    charAt25 = i94 | (charAt11 << i95);
                    i93 = i39;
                }
                int i96 = i92 - 51;
                i29 = length;
                if (i96 == 9 || i96 == 17) {
                    int i97 = i79 / 3;
                    i38 = i12 + 1;
                    objArr[i97 + i97 + 1] = zze[i12];
                } else {
                    if (i96 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i98 = i79 / 3;
                        i38 = i12 + 1;
                        objArr[i98 + i98 + 1] = zze[i12];
                    }
                    int i99 = charAt25 + charAt25;
                    obj = zze[i99];
                    if (obj instanceof Field) {
                        zzv2 = zzv(cls2, (String) obj);
                        zze[i99] = zzv2;
                    } else {
                        zzv2 = (Field) obj;
                    }
                    i31 = charAt23;
                    int i100 = i93;
                    i35 = (int) unsafe.objectFieldOffset(zzv2);
                    int i101 = i99 + 1;
                    obj2 = zze[i101];
                    if (obj2 instanceof Field) {
                        zzv3 = zzv(cls2, (String) obj2);
                        zze[i101] = zzv3;
                    } else {
                        zzv3 = (Field) obj2;
                    }
                    i36 = (int) unsafe.objectFieldOffset(zzv3);
                    str = zzd;
                    i33 = i100;
                    i34 = 0;
                }
                i12 = i38;
                int i992 = charAt25 + charAt25;
                obj = zze[i992];
                if (obj instanceof Field) {
                }
                i31 = charAt23;
                int i1002 = i93;
                i35 = (int) unsafe.objectFieldOffset(zzv2);
                int i1012 = i992 + 1;
                obj2 = zze[i1012];
                if (obj2 instanceof Field) {
                }
                i36 = (int) unsafe.objectFieldOffset(zzv3);
                str = zzd;
                i33 = i1002;
                i34 = 0;
            } else {
                zzghVar = zzghVar2;
                i29 = length;
                i31 = charAt23;
                int i102 = i12 + 1;
                Field zzv4 = zzv(cls2, (String) zze[i12]);
                if (i92 == 9 || i92 == 17) {
                    i32 = i102;
                    int i103 = i79 / 3;
                    objArr[i103 + i103 + 1] = zzv4.getType();
                } else {
                    if (i92 == 27 || i92 == 49) {
                        int i104 = i79 / 3;
                        i37 = i12 + 2;
                        objArr[i104 + i104 + 1] = zze[i102];
                    } else if (i92 == 12 || i92 == 30 || i92 == 44) {
                        i32 = i102;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i105 = i79 / 3;
                            i37 = i12 + 2;
                            objArr[i105 + i105 + 1] = zze[i32];
                        }
                    } else if (i92 == 50) {
                        int i106 = i81 + 1;
                        iArr[i81] = i79;
                        int i107 = i79 / 3;
                        i32 = i12 + 2;
                        int i108 = i107 + i107;
                        objArr[i108] = zze[i102];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i108 + 1] = zze[i32];
                            i32 = i12 + 3;
                        }
                        i81 = i106;
                    } else {
                        i32 = i102;
                    }
                    i32 = i37;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                int i109 = 1048575;
                if ((charAt24 & 4096) == 0 || i92 > 17) {
                    str = zzd;
                    i33 = i28;
                    i34 = 0;
                } else {
                    int i110 = i28 + 1;
                    int charAt26 = zzd.charAt(i28);
                    if (charAt26 >= 55296) {
                        int i111 = charAt26 & 8191;
                        int i112 = 13;
                        while (true) {
                            i33 = i110 + 1;
                            charAt10 = zzd.charAt(i110);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i111 |= (charAt10 & 8191) << i112;
                            i112 += 13;
                            i110 = i33;
                        }
                        charAt26 = i111 | (charAt10 << i112);
                    } else {
                        i33 = i110;
                    }
                    int i113 = (charAt26 / 32) + i17 + i17;
                    Object obj3 = zze[i113];
                    if (obj3 instanceof Field) {
                        zzv = (Field) obj3;
                    } else {
                        zzv = zzv(cls2, (String) obj3);
                        zze[i113] = zzv;
                    }
                    str = zzd;
                    i34 = charAt26 % 32;
                    i109 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i92 >= 18 && i92 <= 49) {
                    iArr[i82] = objectFieldOffset;
                    i82++;
                }
                i35 = objectFieldOffset;
                i36 = i109;
                i12 = i32;
            }
            int i114 = i79 + 1;
            iArr3[i79] = i31;
            int i115 = i79 + 2;
            iArr3[i114] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? LinearLayoutManager.INVALID_OFFSET : 0) | (i92 << 20) | i35;
            i79 += 3;
            iArr3[i115] = (i34 << 20) | i36;
            i45 = i33;
            zzghVar2 = zzghVar;
            zzd = str;
            length = i29;
            c11 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i13, i15, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i16, i76, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j11) {
        return ((Integer) zzhj.zzf(obj, j11)).intValue();
    }

    private final int zzl(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzm(int i11, int i12) {
        int length = (this.zzc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzc[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzo(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzp(Object obj, long j11) {
        return ((Long) zzhj.zzf(obj, j11)).longValue();
    }

    private final zzey zzq(int i11) {
        int i12 = i11 / 3;
        return (zzey) this.zzd[i12 + i12 + 1];
    }

    private final zzgi zzr(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzgi zzgiVar = (zzgi) this.zzd[i13];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private final Object zzt(Object obj, int i11) {
        zzgi zzr = zzr(i11);
        int zzo = zzo(i11) & 1048575;
        if (!zzE(obj, i11)) {
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

    private final Object zzu(Object obj, int i11, int i12) {
        zzgi zzr = zzr(i12);
        if (!zzI(obj, i11, i12)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i12) & 1048575);
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
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder d11 = C3660k.d("Field ", str, " for ", name, " not found. Known fields are ");
            d11.append(arrays);
            throw new RuntimeException(d11.toString());
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i11) {
        if (zzE(obj2, i11)) {
            int zzo = zzo(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = zzo;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i11);
            if (!zzE(obj, i11)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j11, zzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzz(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j11, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzI(obj2, i12, i11)) {
            int zzo = zzo(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = zzo;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i11);
            if (!zzI(obj, i12, i11)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j11, zzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzA(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j11, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i11) {
        int zzl = zzl(i11);
        long j11 = 1048575 & zzl;
        if (j11 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j11, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j11));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i11;
        long doubleToLongBits;
        int i12;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int zzo = zzo(i14);
            int i15 = this.zzc[i14];
            long j11 = 1048575 & zzo;
            int i16 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i11 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j11));
                    byte[] bArr = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 1:
                    i12 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j11));
                    i13 = floatToIntBits + i12;
                    break;
                case 2:
                    i11 = i13 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr2 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 3:
                    i11 = i13 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr3 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 4:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 5:
                    i11 = i13 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr4 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 6:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 7:
                    i12 = i13 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j11));
                    i13 = floatToIntBits + i12;
                    break;
                case 8:
                    i12 = i13 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j11)).hashCode();
                    i13 = floatToIntBits + i12;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j11);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 10:
                    i12 = i13 * 53;
                    floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i13 = floatToIntBits + i12;
                    break;
                case 11:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 12:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 13:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 14:
                    i11 = i13 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr5 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 15:
                    i11 = i13 * 53;
                    zzc = zzhj.zzc(obj, j11);
                    i13 = i11 + zzc;
                    break;
                case 16:
                    i11 = i13 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j11);
                    byte[] bArr6 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i11 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j11);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i12 = i13 * 53;
                    floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i13 = floatToIntBits + i12;
                    break;
                case 50:
                    i12 = i13 * 53;
                    floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                    i13 = floatToIntBits + i12;
                    break;
                case 51:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j11)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j11)).floatValue());
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = zzp(obj, j11);
                        byte[] bArr8 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = zzp(obj, j11);
                        byte[] bArr9 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = zzp(obj, j11);
                        byte[] bArr10 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j11)).booleanValue());
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j11)).hashCode();
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = zzp(obj, j11);
                        byte[] bArr11 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzk(obj, j11);
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i15, i14)) {
                        i11 = i13 * 53;
                        doubleToLongBits = zzp(obj, j11);
                        byte[] bArr12 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i15, i14)) {
                        i12 = i13 * 53;
                        floatToIntBits = zzhj.zzf(obj, j11).hashCode();
                        i13 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i13 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3818
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
            for (int i11 = 0; i11 < length; i11 += 3) {
                int zzo = zzo(i11);
                int i12 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j11 = i12;
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
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case 38:
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzk.zza(obj, j11);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j11, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i11], i11)) {
                        zzr(i11).zze(zzb.getObject(obj, j11));
                    }
                }
                if (zzE(obj, i11)) {
                    zzr(i11).zze(zzb.getObject(obj, j11));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzo = zzo(i11);
            int i12 = this.zzc[i11];
            long j11 = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i11)) {
                        zzhj.zzl(obj, j11, zzhj.zza(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i11)) {
                        zzhj.zzm(obj, j11, zzhj.zzb(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i11)) {
                        zzhj.zzk(obj, j11, zzhj.zzt(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i11);
                    break;
                case 10:
                    if (zzE(obj2, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i11)) {
                        zzhj.zzn(obj, j11, zzhj.zzc(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i11)) {
                        zzhj.zzo(obj, j11, zzhj.zzd(obj2, j11));
                        zzz(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j11);
                    break;
                case 50:
                    int i13 = zzgk.zza;
                    zzhj.zzp(obj, j11, zzfs.zza(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11)));
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
                    if (zzI(obj2, i12, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzA(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzI(obj2, i12, i11)) {
                        zzhj.zzp(obj, j11, zzhj.zzf(obj2, j11));
                        zzA(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i11);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i11, int i12, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i11, i12, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzo = zzo(i11);
            long j11 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i11) && Double.doubleToLongBits(zzhj.zza(obj, j11)) == Double.doubleToLongBits(zzhj.zza(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i11) && Float.floatToIntBits(zzhj.zzb(obj, j11)) == Float.floatToIntBits(zzhj.zzb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i11) && zzhj.zzd(obj, j11) == zzhj.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i11) && zzhj.zzd(obj, j11) == zzhj.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i11) && zzhj.zzd(obj, j11) == zzhj.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i11) && zzhj.zzt(obj, j11) == zzhj.zzt(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i11) && zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i11) && zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i11) && zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i11) && zzhj.zzd(obj, j11) == zzhj.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i11) && zzhj.zzc(obj, j11) == zzhj.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i11) && zzhj.zzd(obj, j11) == zzhj.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i11) && zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
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
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11));
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
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                case 68:
                    long zzl = zzl(i11) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j11), zzhj.zzf(obj2, j11))) {
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
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zzi) {
            int i16 = this.zzh[i13];
            int i17 = this.zzc[i16];
            int zzo = zzo(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i15;
                i12 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & zzo) != 0 && !zzF(obj2, i16, i11, i12, i21)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj2, i17, i16) && !zzG(obj2, zzo, zzr(i16))) {
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
                    zzgi zzr = zzr(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzr.zzi(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj2, i16, i11, i12, i21) && !zzG(obj2, zzo, zzr(i16))) {
                return false;
            }
            i13++;
            obj = obj2;
            i15 = i11;
            i14 = i12;
        }
        return true;
    }
}
