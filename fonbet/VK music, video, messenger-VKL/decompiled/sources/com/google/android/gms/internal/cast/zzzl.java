package com.google.android.gms.internal.cast;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.proto.PublisherConfiguration;
import sun.misc.Unsafe;
import xsna.caf0;
import xsna.i5s;
import xsna.n6j;
import xsna.zy60;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzzl<T> implements zzzs<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaak.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzzi zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzaad zzi;
    private final zzxs zzj;

    private zzzl(int[] iArr, Object[] objArr, int i, int i2, zzzi zzziVar, boolean z, int[] iArr2, int i3, int i4, zzzn zzznVar, zzyv zzyvVar, zzaad zzaadVar, zzxs zzxsVar, zzzd zzzdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzxsVar != null && (zzziVar instanceof zzyb)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzaadVar;
        this.zzj = zzxsVar;
        this.zze = zzziVar;
    }

    private final boolean zzA(Object obj, int i) {
        int zzq = zzq(i);
        long j = zzq & 1048575;
        if (j != PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return (zzaak.zzd(obj, j) & (1 << (zzq >>> 20))) != 0;
        }
        int zzp = zzp(i);
        long j2 = zzp & 1048575;
        switch (zzr(zzp)) {
            case 0:
                return Double.doubleToRawLongBits(zzaak.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaak.zzj(obj, j2)) != 0;
            case 2:
                return zzaak.zzf(obj, j2) != 0;
            case 3:
                return zzaak.zzf(obj, j2) != 0;
            case 4:
                return zzaak.zzd(obj, j2) != 0;
            case 5:
                return zzaak.zzf(obj, j2) != 0;
            case 6:
                return zzaak.zzd(obj, j2) != 0;
            case 7:
                return zzaak.zzh(obj, j2);
            case 8:
                Object zzn = zzaak.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzxk) {
                    return !zzxk.zza.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaak.zzn(obj, j2) != null;
            case 10:
                return !zzxk.zza.equals(zzaak.zzn(obj, j2));
            case 11:
                return zzaak.zzd(obj, j2) != 0;
            case 12:
                return zzaak.zzd(obj, j2) != 0;
            case 13:
                return zzaak.zzd(obj, j2) != 0;
            case 14:
                return zzaak.zzf(obj, j2) != 0;
            case 15:
                return zzaak.zzd(obj, j2) != 0;
            case 16:
                return zzaak.zzf(obj, j2) != 0;
            case 17:
                return zzaak.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzB(Object obj, int i) {
        int zzq = zzq(i);
        long j = 1048575 & zzq;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return;
        }
        zzaak.zze(obj, j, (1 << (zzq >>> 20)) | zzaak.zzd(obj, j));
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzaak.zzd(obj, (long) (zzq(i2) & 1048575)) == i;
    }

    private final void zzD(Object obj, int i, int i2) {
        zzaak.zze(obj, zzq(i2) & 1048575, i);
    }

    private static final void zzE(int i, Object obj, zzaar zzaarVar) throws IOException {
        if (obj instanceof String) {
            zzaarVar.zzm(i, (String) obj);
        } else {
            zzaarVar.zzn(i, (zzxk) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzzl zzi(Class cls, zzzf zzzfVar, zzzn zzznVar, zzyv zzyvVar, zzaad zzaadVar, zzxs zzxsVar, zzzd zzzdVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
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
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzj;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzj2;
        Object obj2;
        Field zzj3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzzfVar instanceof zzzr)) {
            throw null;
        }
        zzzr zzzrVar = (zzzr) zzzfVar;
        String zzd = zzzrVar.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt14 = zzd.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i33;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = zzd.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = zzd.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = zzd.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = zzd.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = zzd.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = zzd.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = zzd.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = zzd.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = zzd.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = zzd.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = zzd.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i2 = charAt18;
            i3 = i63;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i62;
            iArr = iArr2;
            i7 = charAt16;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzzrVar.zze();
        Class<?> cls2 = zzzrVar.zzb().getClass();
        int i64 = i5 + i3;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = i5;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c2) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c2) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i32;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt12 = zzd.charAt(i76);
                    if (charAt12 < c2) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                }
                charAt24 = i75 | (charAt12 << i77);
                i17 = i31;
            } else {
                i17 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            zzzr zzzrVar2 = zzzrVar;
            int i79 = charAt24 & 2048;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c3 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i30 = i82 + 1;
                        charAt11 = zzd.charAt(i82);
                        if (charAt11 < c3) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i30;
                        c3 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i27 = i30;
                } else {
                    i27 = i80;
                }
                int i84 = i27;
                int i85 = i78 - 51;
                i18 = length;
                if (i85 == 9 || i85 == 17) {
                    i28 = i6 + 1;
                    int i86 = i69 / 3;
                    objArr[i86 + i86 + 1] = zze[i6];
                } else {
                    if (i85 == 12) {
                        if (zzzrVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzj2 = (Field) obj;
                            } else {
                                zzj2 = zzj(cls2, (String) obj);
                                zze[i88] = zzj2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzj3 = (Field) obj2;
                            } else {
                                zzj3 = zzj(cls2, (String) obj2);
                                zze[i91] = zzj3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzj3);
                            str = zzd;
                            i23 = i89;
                            i17 = i84;
                            i22 = 0;
                            c = 55296;
                        }
                    }
                    i29 = i79;
                    int i882 = charAt25 + charAt25;
                    obj = zze[i882];
                    int i892 = i29;
                    if (obj instanceof Field) {
                    }
                    int i902 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzj2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzj3);
                    str = zzd;
                    i23 = i892;
                    i17 = i84;
                    i22 = 0;
                    c = 55296;
                }
                i6 = i28;
                i29 = i79;
                int i8822 = charAt25 + charAt25;
                obj = zze[i8822];
                int i8922 = i29;
                if (obj instanceof Field) {
                }
                int i9022 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzj2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzj3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzj4 = zzj(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzj4.getType();
                } else {
                    if (i78 == 27) {
                        i25 = i92;
                        i26 = 1;
                        i6 += 2;
                    } else if (i78 == 49) {
                        i6 += 2;
                        i25 = i92;
                        i26 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (zzzrVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                            if ((charAt24 & 4096) != 0 || i78 > 17) {
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i95 = i17 + 1;
                                int charAt26 = str.charAt(i17);
                                if (charAt26 >= 55296) {
                                    int i96 = charAt26 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i24 = i95 + 1;
                                        charAt10 = str.charAt(i95);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i96 |= (charAt10 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i24;
                                    }
                                    charAt26 = i96 | (charAt10 << i97);
                                } else {
                                    i24 = i95;
                                }
                                int i98 = (charAt26 / 32) + i19 + i19;
                                Object obj3 = zze[i98];
                                if (obj3 instanceof Field) {
                                    zzj = (Field) obj3;
                                } else {
                                    zzj = zzj(cls2, (String) obj3);
                                    zze[i98] = zzj;
                                }
                                i22 = charAt26 % 32;
                                i17 = i24;
                                c = 55296;
                                i21 = (int) unsafe.objectFieldOffset(zzj);
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        } else {
                            str = zzd;
                            i6 = i92;
                            i79 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        }
                    } else if (i78 == 50) {
                        int i99 = i6 + 2;
                        int i100 = i66 + 1;
                        iArr[i66] = i69;
                        int i101 = i69 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = zze[i92];
                        if (i79 != 0) {
                            objArr[i102 + 1] = zze[i99];
                            i6 += 3;
                            str = zzd;
                            i66 = i100;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        } else {
                            i6 = i99;
                            i66 = i100;
                            i79 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        }
                    } else {
                        i20 = i92;
                    }
                    int i103 = i69 / 3;
                    objArr[i103 + i103 + i26] = zze[i25];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i78 >= 18) {
                    }
                    i23 = i79;
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                if ((charAt24 & 4096) != 0) {
                }
                c = 55296;
                i21 = 1048575;
                i22 = 0;
                if (i78 >= 18) {
                }
                i23 = i79;
            }
            int i104 = i69 + 1;
            iArr3[i69] = charAt23;
            int i105 = i69 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zzzrVar = zzzrVar2;
            length = i18;
            i7 = i19;
        }
        return new zzzl(iArr3, objArr, i2, i4, zzzrVar.zzb(), false, iArr, i5, i64, zzznVar, zzyvVar, zzaadVar, zzxsVar, zzzdVar);
    }

    private static Field zzj(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            n6j.b(sb, "Field ", str, " for ", name);
            throw new RuntimeException(i5s.a(sb, " not found. Known fields are ", arrays), e);
        }
    }

    private final void zzk(Object obj, Object obj2, int i) {
        if (zzA(obj2, i)) {
            int zzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzzs zzm = zzm(i);
            if (!zzA(obj, i)) {
                if (zzs(object)) {
                    Object zza2 = zzm.zza();
                    zzm.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzB(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzs(object2)) {
                Object zza3 = zzm.zza();
                zzm.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzm.zzd(object2, object);
        }
    }

    private final void zzl(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int zzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzzs zzm = zzm(i);
            if (!zzC(obj, i2, i)) {
                if (zzs(object)) {
                    Object zza2 = zzm.zza();
                    zzm.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzs(object2)) {
                Object zza3 = zzm.zza();
                zzm.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzm.zzd(object2, object);
        }
    }

    private final zzzs zzm(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzzs zzzsVar = (zzzs) objArr[i3];
        if (zzzsVar != null) {
            return zzzsVar;
        }
        zzzs zzb2 = zzzp.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzn(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static boolean zzo(Object obj, int i, zzzs zzzsVar) {
        return zzzsVar.zzh(zzaak.zzn(obj, i & 1048575));
    }

    private final int zzp(int i) {
        return this.zzc[i + 1];
    }

    private final int zzq(int i) {
        return this.zzc[i + 2];
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzs(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzyd) {
            return ((zzyd) obj).zzv();
        }
        return true;
    }

    private static double zzt(Object obj, long j) {
        return ((Double) zzaak.zzn(obj, j)).doubleValue();
    }

    private static float zzu(Object obj, long j) {
        return ((Float) zzaak.zzn(obj, j)).floatValue();
    }

    private static int zzv(Object obj, long j) {
        return ((Integer) zzaak.zzn(obj, j)).intValue();
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzaak.zzn(obj, j)).longValue();
    }

    private static boolean zzx(Object obj, long j) {
        return ((Boolean) zzaak.zzn(obj, j)).booleanValue();
    }

    private final boolean zzy(Object obj, Object obj2, int i) {
        return zzA(obj, i) == zzA(obj2, i);
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzA(obj, i) : (i3 & i4) != 0;
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final Object zza() {
        return ((zzyd) this.zze).zzy();
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzC;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzp = zzp(i);
            long j = zzp & 1048575;
            switch (zzr(zzp)) {
                case 0:
                    if (zzy(obj, obj2, i) && Double.doubleToLongBits(zzaak.zzl(obj, j)) == Double.doubleToLongBits(zzaak.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzy(obj, obj2, i) && Float.floatToIntBits(zzaak.zzj(obj, j)) == Float.floatToIntBits(zzaak.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzy(obj, obj2, i) && zzaak.zzf(obj, j) == zzaak.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzy(obj, obj2, i) && zzaak.zzf(obj, j) == zzaak.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzy(obj, obj2, i) && zzaak.zzf(obj, j) == zzaak.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzy(obj, obj2, i) && zzaak.zzh(obj, j) == zzaak.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzy(obj, obj2, i) && zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzy(obj, obj2, i) && zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzy(obj, obj2, i) && zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzy(obj, obj2, i) && zzaak.zzf(obj, j) == zzaak.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzy(obj, obj2, i) && zzaak.zzd(obj, j) == zzaak.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzy(obj, obj2, i) && zzaak.zzf(obj, j) == zzaak.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzy(obj, obj2, i) && zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j))) {
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
                    zzC = zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j));
                    break;
                case 50:
                    zzC = zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j));
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
                    long zzq = zzq(i) & 1048575;
                    if (zzaak.zzd(obj, zzq) == zzaak.zzd(obj2, zzq) && zzzu.zzC(zzaak.zzn(obj, j), zzaak.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzC) {
                return false;
            }
        }
        if (!((zzyd) obj).zzc.equals(((zzyd) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzyb) obj).zzb.equals(((zzyb) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzd;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = ((zzyd) obj).zzc.hashCode() + (i5 * 53);
                return this.zzf ? (hashCode * 53) + ((zzyb) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzp = zzp(i4);
            int i6 = 1048575 & zzp;
            int zzr = zzr(zzp);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzaak.zzl(obj, j));
                    byte[] bArr = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzaak.zzj(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzaak.zzf(obj, j);
                    byte[] bArr2 = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzaak.zzf(obj, j);
                    byte[] bArr3 = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 4:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzaak.zzf(obj, j);
                    byte[] bArr4 = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 6:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzym.zza(zzaak.zzh(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzaak.zzn(obj, j)).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object zzn = zzaak.zzn(obj, j);
                    if (zzn != null) {
                        i8 = zzn.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = zzaak.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 12:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 13:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzaak.zzf(obj, j);
                    byte[] bArr5 = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 15:
                    i = i5 * 53;
                    zzd = zzaak.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzaak.zzf(obj, j);
                    byte[] bArr6 = zzym.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object zzn2 = zzaak.zzn(obj, j);
                    if (zzn2 != null) {
                        i8 = zzn2.hashCode();
                    }
                    i5 = i3 + i8;
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
                    i2 = i5 * 53;
                    floatToIntBits = zzaak.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzaak.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzt(obj, j));
                        byte[] bArr7 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzu(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzw(obj, j);
                        byte[] bArr8 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzw(obj, j);
                        byte[] bArr9 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 55:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzw(obj, j);
                        byte[] bArr10 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 57:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzym.zza(zzx(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzaak.zzn(obj, j)).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzaak.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzaak.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzw(obj, j);
                        byte[] bArr11 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzv(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzw(obj, j);
                        byte[] bArr12 = zzym.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 68:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzaak.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final void zzd(Object obj, Object obj2) {
        if (!zzs(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzzu.zzE(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzzu.zzD(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzp = zzp(i);
            int i2 = 1048575 & zzp;
            int zzr = zzr(zzp);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzm(obj, j, zzaak.zzl(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 1:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzk(obj, j, zzaak.zzj(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 2:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzg(obj, j, zzaak.zzf(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 3:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzg(obj, j, zzaak.zzf(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 4:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 5:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzg(obj, j, zzaak.zzf(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 6:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 7:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzi(obj, j, zzaak.zzh(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 8:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzo(obj, j, zzaak.zzn(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 9:
                    zzk(obj, obj2, i);
                    break;
                case 10:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzo(obj, j, zzaak.zzn(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 11:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 12:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 13:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 14:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzg(obj, j, zzaak.zzf(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 15:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zze(obj, j, zzaak.zzd(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 16:
                    if (!zzA(obj2, i)) {
                        break;
                    } else {
                        zzaak.zzg(obj, j, zzaak.zzf(obj2, j));
                        zzB(obj, i);
                        break;
                    }
                case 17:
                    zzk(obj, obj2, i);
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
                    zzyl zzylVar = (zzyl) zzaak.zzn(obj, j);
                    zzyl zzylVar2 = (zzyl) zzaak.zzn(obj2, j);
                    int size = zzylVar.size();
                    int size2 = zzylVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzylVar.zza()) {
                            zzylVar = zzylVar.zzf(size2 + size);
                        }
                        zzylVar.addAll(zzylVar2);
                    }
                    if (size > 0) {
                        zzylVar2 = zzylVar;
                    }
                    zzaak.zzo(obj, j, zzylVar2);
                    break;
                case 50:
                    int i4 = zzzu.zza;
                    zzzc zzzcVar = (zzzc) zzaak.zzn(obj, j);
                    zzzc zzzcVar2 = (zzzc) zzaak.zzn(obj2, j);
                    if (!zzzcVar2.isEmpty()) {
                        if (!zzzcVar.zzd()) {
                            zzzcVar = zzzcVar.zzb();
                        }
                        zzzcVar.zza(zzzcVar2);
                    }
                    zzaak.zzo(obj, j, zzzcVar);
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
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzaak.zzo(obj, j, zzaak.zzn(obj2, j));
                        zzD(obj, i3, i);
                        break;
                    }
                case 60:
                    zzl(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzaak.zzo(obj, j, zzaak.zzn(obj2, j));
                        zzD(obj, i3, i);
                        break;
                    }
                case 68:
                    zzl(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final int zze(Object obj) {
        int i;
        int zzv;
        int zzw;
        int zzz;
        int zzv2;
        int size;
        int zzp;
        int zzv3;
        int zzv4;
        int zzv5;
        int i2;
        int zzv6;
        int zzw2;
        zzzl<T> zzzlVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zzzlVar.zzc;
            if (i4 >= iArr.length) {
                int zzf = ((zzyd) obj).zzc.zzf() + i6;
                if (!zzzlVar.zzf) {
                    return zzf;
                }
                zzzz zzzzVar = ((zzyb) obj).zzb.zza;
                int zzc = zzzzVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc; i9++) {
                    Map.Entry zzd = zzzzVar.zzd(i9);
                    i8 += zzxw.zzg((zzxv) ((zzzw) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzzzVar.zze()) {
                    i8 += zzxw.zzg((zzxv) entry.getKey(), entry.getValue());
                }
                return zzf + i8;
            }
            int zzp2 = zzzlVar.zzp(i4);
            int zzr = zzr(zzp2);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & i3;
            if (zzr <= 17) {
                if (i12 != i7) {
                    i5 = i12 == i3 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzp2 & i3;
            if (zzr >= zzxx.zzJ.zza()) {
                zzxx.zzW.zza();
            }
            long j = i13;
            switch (zzr) {
                case 0:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 1:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 2:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzv = zzxp.zzv(i10 << 3);
                        zzw = zzxp.zzw(j2);
                        i6 += zzw + zzv;
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 3:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzv = zzxp.zzv(i10 << 3);
                        zzw = zzxp.zzw(j3);
                        i6 += zzw + zzv;
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 4:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzv = zzxp.zzv(i10 << 3);
                        zzw = zzxp.zzw(j4);
                        i6 += zzw + zzv;
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 5:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 6:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 7:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 1, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 8:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzxk) {
                            int zzv7 = zzxp.zzv(i14);
                            int zzc2 = ((zzxk) object).zzc();
                            i6 = caf0.a(zzc2, zzc2, zzv7, i6);
                        } else {
                            int zzv8 = zzxp.zzv(i14);
                            int zza2 = zzaao.zza((String) object);
                            i6 = caf0.a(zza2, zza2, zzv8, i6);
                        }
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 9:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        zzz = zzzu.zzz(i10, unsafe.getObject(obj2, j), zzzlVar.zzm(i4));
                        i6 += zzz;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        zzxk zzxkVar = (zzxk) unsafe.getObject(obj2, j);
                        int zzv9 = zzxp.zzv(i10 << 3);
                        int zzc3 = zzxkVar.zzc();
                        i6 = caf0.a(zzc3, zzc3, zzv9, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 11:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(unsafe.getInt(obj2, j), zzxp.zzv(i10 << 3), i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 12:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzv = zzxp.zzv(i10 << 3);
                        zzw = zzxp.zzw(j5);
                        i6 += zzw + zzv;
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 13:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 14:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 15:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        i6 = zy60.b((i15 >> 31) ^ (i15 + i15), zzxp.zzv(i10 << 3), i6);
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 16:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzv = zzxp.zzv(i10 << 3);
                        zzw = zzxp.zzw((j6 >> 63) ^ (j6 + j6));
                        i6 += zzw + zzv;
                    }
                    zzzlVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 17:
                    if (zzzlVar.zzz(obj2, i4, i7, i5, i)) {
                        zzz = zzzu.zzA(i10, (zzzi) unsafe.getObject(obj2, j), zzzlVar.zzm(i4));
                        i6 += zzz;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 18:
                    zzz = zzzu.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 19:
                    zzz = zzzu.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i16 = zzzu.zza;
                    if (list.size() != 0) {
                        zzv2 = (zzxp.zzv(i10 << 3) * list.size()) + zzzu.zzo(list);
                        i6 += zzv2;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv2 = 0;
                    i6 += zzv2;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzzu.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zzzu.zzp(list2);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzzu.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zzzu.zzs(list3);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 23:
                    zzz = zzzu.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 24:
                    zzz = zzzu.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzzu.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzv2 = (zzxp.zzv(i10 << 3) + 1) * size2;
                        i6 += zzv2;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv2 = 0;
                    i6 += zzv2;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzzu.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzv4 = zzxp.zzv(i10 << 3) * size3;
                        if (list5 instanceof zzyu) {
                            zzyu zzyuVar = (zzyu) list5;
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object zza3 = zzyuVar.zza();
                                if (zza3 instanceof zzxk) {
                                    int zzc4 = ((zzxk) zza3).zzc();
                                    zzv4 = zy60.b(zzc4, zzc4, zzv4);
                                } else {
                                    int zza4 = zzaao.zza((String) zza3);
                                    zzv4 = zy60.b(zza4, zza4, zzv4);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj3 = list5.get(i22);
                                if (obj3 instanceof zzxk) {
                                    int zzc5 = ((zzxk) obj3).zzc();
                                    zzv4 = zy60.b(zzc5, zzc5, zzv4);
                                } else {
                                    int zza5 = zzaao.zza((String) obj3);
                                    zzv4 = zy60.b(zza5, zza5, zzv4);
                                }
                            }
                        }
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzzs zzm = zzzlVar.zzm(i4);
                    int i23 = zzzu.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzv5 = 0;
                    } else {
                        zzv5 = zzxp.zzv(i10 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj4 = list6.get(i24);
                            if (obj4 instanceof zzyt) {
                                int zzb2 = ((zzyt) obj4).zzb();
                                zzv5 = zy60.b(zzb2, zzb2, zzv5);
                            } else {
                                int zzt = ((zzwz) obj4).zzt(zzm);
                                zzv5 = zy60.b(zzt, zzt, zzv5);
                            }
                        }
                    }
                    i6 += zzv5;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzzu.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzv4 = zzxp.zzv(i10 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int zzc6 = ((zzxk) list7.get(i26)).zzc();
                            zzv4 = zy60.b(zzc6, zzc6, zzv4);
                        }
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzzu.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zzzu.zzt(list8);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzzu.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zzzu.zzr(list9);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 31:
                    zzz = zzzu.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 32:
                    zzz = zzzu.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzzu.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zzzu.zzu(list10);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzzu.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zzzu.zzq(list11);
                        zzv3 = zzxp.zzv(i10 << 3);
                        zzv4 = (zzv3 * size) + zzp;
                        i6 += zzv4;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    zzv4 = 0;
                    i6 += zzv4;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 35:
                    int zzx = zzzu.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        i6 = caf0.a(zzx, zzxp.zzv(i10 << 3), zzx, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 36:
                    int zzv10 = zzzu.zzv((List) unsafe.getObject(obj2, j));
                    if (zzv10 > 0) {
                        i6 = caf0.a(zzv10, zzxp.zzv(i10 << 3), zzv10, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 37:
                    int zzo = zzzu.zzo((List) unsafe.getObject(obj2, j));
                    if (zzo > 0) {
                        i6 = caf0.a(zzo, zzxp.zzv(i10 << 3), zzo, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 38:
                    int zzp3 = zzzu.zzp((List) unsafe.getObject(obj2, j));
                    if (zzp3 > 0) {
                        i6 = caf0.a(zzp3, zzxp.zzv(i10 << 3), zzp3, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 39:
                    int zzs = zzzu.zzs((List) unsafe.getObject(obj2, j));
                    if (zzs > 0) {
                        i6 = caf0.a(zzs, zzxp.zzv(i10 << 3), zzs, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 40:
                    int zzx2 = zzzu.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx2 > 0) {
                        i6 = caf0.a(zzx2, zzxp.zzv(i10 << 3), zzx2, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 41:
                    int zzv11 = zzzu.zzv((List) unsafe.getObject(obj2, j));
                    if (zzv11 > 0) {
                        i6 = caf0.a(zzv11, zzxp.zzv(i10 << 3), zzv11, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzzu.zza;
                    int size6 = list12.size();
                    if (size6 > 0) {
                        i6 = caf0.a(size6, zzxp.zzv(i10 << 3), size6, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 43:
                    int zzt2 = zzzu.zzt((List) unsafe.getObject(obj2, j));
                    if (zzt2 > 0) {
                        i6 = caf0.a(zzt2, zzxp.zzv(i10 << 3), zzt2, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 44:
                    int zzr2 = zzzu.zzr((List) unsafe.getObject(obj2, j));
                    if (zzr2 > 0) {
                        i6 = caf0.a(zzr2, zzxp.zzv(i10 << 3), zzr2, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 45:
                    int zzv12 = zzzu.zzv((List) unsafe.getObject(obj2, j));
                    if (zzv12 > 0) {
                        i6 = caf0.a(zzv12, zzxp.zzv(i10 << 3), zzv12, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 46:
                    int zzx3 = zzzu.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx3 > 0) {
                        i6 = caf0.a(zzx3, zzxp.zzv(i10 << 3), zzx3, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 47:
                    int zzu = zzzu.zzu((List) unsafe.getObject(obj2, j));
                    if (zzu > 0) {
                        i6 = caf0.a(zzu, zzxp.zzv(i10 << 3), zzu, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 48:
                    int zzq = zzzu.zzq((List) unsafe.getObject(obj2, j));
                    if (zzq > 0) {
                        i6 = caf0.a(zzq, zzxp.zzv(i10 << 3), zzq, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzzs zzm2 = zzzlVar.zzm(i4);
                    int i32 = zzzu.zza;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i33 = 0; i33 < size7; i33++) {
                            i2 += zzzu.zzA(i10, (zzzi) list13.get(i33), zzm2);
                        }
                    }
                    i6 += i2;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 50:
                    zzzc zzzcVar = (zzzc) unsafe.getObject(obj2, j);
                    if (zzzcVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzzcVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 51:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 52:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 53:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        long zzw3 = zzw(obj2, j);
                        zzv6 = zzxp.zzv(i10 << 3);
                        zzw2 = zzxp.zzw(zzw3);
                        i6 += zzw2 + zzv6;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 54:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        long zzw4 = zzw(obj2, j);
                        zzv6 = zzxp.zzv(i10 << 3);
                        zzw2 = zzxp.zzw(zzw4);
                        i6 += zzw2 + zzv6;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 55:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        long zzv13 = zzv(obj2, j);
                        zzv6 = zzxp.zzv(i10 << 3);
                        zzw2 = zzxp.zzw(zzv13);
                        i6 += zzw2 + zzv6;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 57:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 58:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 1, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 59:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        int i34 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzxk) {
                            int zzv14 = zzxp.zzv(i34);
                            int zzc7 = ((zzxk) object2).zzc();
                            i6 = caf0.a(zzc7, zzc7, zzv14, i6);
                        } else {
                            int zzv15 = zzxp.zzv(i34);
                            int zza6 = zzaao.zza((String) object2);
                            i6 = caf0.a(zza6, zza6, zzv15, i6);
                        }
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 60:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        zzz = zzzu.zzz(i10, unsafe.getObject(obj2, j), zzzlVar.zzm(i4));
                        i6 += zzz;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 61:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        zzxk zzxkVar2 = (zzxk) unsafe.getObject(obj2, j);
                        int zzv16 = zzxp.zzv(i10 << 3);
                        int zzc8 = zzxkVar2.zzc();
                        i6 = caf0.a(zzc8, zzc8, zzv16, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 62:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(zzv(obj2, j), zzxp.zzv(i10 << 3), i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 63:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        long zzv17 = zzv(obj2, j);
                        zzv6 = zzxp.zzv(i10 << 3);
                        zzw2 = zzxp.zzw(zzv17);
                        i6 += zzw2 + zzv6;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 4, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 65:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        i6 = zy60.b(i10 << 3, 8, i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 66:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        int zzv18 = zzv(obj2, j);
                        i6 = zy60.b((zzv18 >> 31) ^ (zzv18 + zzv18), zzxp.zzv(i10 << 3), i6);
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 67:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        long zzw5 = zzw(obj2, j);
                        zzv6 = zzxp.zzv(i10 << 3);
                        zzw2 = zzxp.zzw((zzw5 >> 63) ^ (zzw5 + zzw5));
                        i6 += zzw2 + zzv6;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzzlVar.zzC(obj2, i10, i4)) {
                        zzz = zzzu.zzA(i10, (zzzi) unsafe.getObject(obj2, j), zzzlVar.zzm(i4));
                        i6 += zzz;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1048575;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.cast.zzzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzaar zzaarVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zzzl<T> zzzlVar = this;
        if (zzzlVar.zzf) {
            zzxw zzxwVar = ((zzyb) obj).zzb;
            if (!zzxwVar.zza.isEmpty()) {
                entry = (Map.Entry) zzxwVar.zzc().next();
                iArr = zzzlVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzp = zzzlVar.zzp(i);
                    int zzr = zzr(zzp);
                    int i7 = iArr[i];
                    if (zzr <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        i2 = zzp;
                        i3 = 1 << (i8 >>> 20);
                    } else {
                        i2 = zzp;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = i2 & i4;
                    switch (zzr) {
                        case 0:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzf(i7, zzaak.zzl(obj, j));
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 1:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zze(i7, zzaak.zzj(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 2:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzc(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 3:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzh(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 4:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzi(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 5:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzj(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 6:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzk(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 7:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzl(i7, zzaak.zzh(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 8:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzE(i7, unsafe.getObject(obj, j), zzaarVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 9:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzr(i7, unsafe.getObject(obj, j), zzzlVar.zzm(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 10:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzn(i7, (zzxk) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 11:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzo(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 12:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzg(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 13:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzb(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 14:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzd(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 15:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzp(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 16:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzq(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 17:
                            if (zzzlVar.zzz(obj, i, i5, i6, i3)) {
                                zzaarVar.zzs(i7, unsafe.getObject(obj, j), zzzlVar.zzm(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 18:
                            zzzu.zza(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 19:
                            zzzu.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 20:
                            zzzu.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 21:
                            zzzu.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 22:
                            zzzu.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 23:
                            zzzu.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 24:
                            zzzu.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 25:
                            zzzu.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 26:
                            int i10 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zzzu.zza;
                            if (list != null && !list.isEmpty()) {
                                zzaarVar.zzD(i10, list);
                                break;
                            }
                            break;
                        case 27:
                            int i12 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzzs zzm = zzzlVar.zzm(i);
                            int i13 = zzzu.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzxq) zzaarVar).zzr(i12, list2.get(i14), zzm);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i15 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zzzu.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzaarVar.zzE(i15, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzzu.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 30:
                            zzzu.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 31:
                            zzzu.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 32:
                            zzzu.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 33:
                            zzzu.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 34:
                            zzzu.zze(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzzlVar = this;
                        case 35:
                            zzzu.zza(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 36:
                            zzzu.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 37:
                            zzzu.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 38:
                            zzzu.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 39:
                            zzzu.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 40:
                            zzzu.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 41:
                            zzzu.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 42:
                            zzzu.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 43:
                            zzzu.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 44:
                            zzzu.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 45:
                            zzzu.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 46:
                            zzzu.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 47:
                            zzzu.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 48:
                            zzzu.zze(iArr[i], (List) unsafe.getObject(obj, j), zzaarVar, true);
                            break;
                        case 49:
                            int i17 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzzs zzm2 = zzzlVar.zzm(i);
                            int i18 = zzzu.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzxq) zzaarVar).zzs(i17, list4.get(i19), zzm2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            break;
                        case 51:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzf(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zze(i7, zzu(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzc(i7, zzw(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzh(i7, zzw(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzi(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzj(i7, zzw(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzk(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzl(i7, zzx(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzE(i7, unsafe.getObject(obj, j), zzaarVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzr(i7, unsafe.getObject(obj, j), zzzlVar.zzm(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzn(i7, (zzxk) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzo(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzg(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzb(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzd(i7, zzw(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzp(i7, zzv(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzq(i7, zzw(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzzlVar.zzC(obj, i7, i)) {
                                zzaarVar.zzs(i7, unsafe.getObject(obj, j), zzzlVar.zzm(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zzzlVar = this;
                }
                if (entry != null) {
                    zzaae zzaaeVar = ((zzyd) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzzlVar.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        i = 0;
        int i62 = 0;
        while (i < iArr.length) {
        }
        if (entry != null) {
        }
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final void zzg(Object obj) {
        if (zzs(obj)) {
            if (obj instanceof zzyd) {
                zzyd zzydVar = (zzyd) obj;
                zzydVar.zzC(Integer.MAX_VALUE);
                zzydVar.zza = 0;
                zzydVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzp = zzp(i);
                int i2 = 1048575 & zzp;
                int zzr = zzr(zzp);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzyl) zzaak.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzzc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, iArr[i], i)) {
                        zzm(i).zzg(zzb.getObject(obj, j));
                    }
                }
                if (zzA(obj, i)) {
                    zzm(i).zzg(zzb.getObject(obj, j));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzzs
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzp = zzp(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzp) != 0 && !zzz(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzr = zzr(zzp);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzC(obj, i8, i2) && !zzo(obj, zzp, zzm(i2))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzzc) zzaak.zzn(obj, zzp & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzaak.zzn(obj, zzp & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzzs zzm = zzm(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzm.zzh(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i2, i, i3, i11) && !zzo(obj, zzp, zzm(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzf || ((zzyb) obj).zzb.zze();
    }
}
