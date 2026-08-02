package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes5.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i, int i2, zzrq zzrqVar, boolean z, int[] iArr2, int i3, int i4, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzsw.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzsw.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i, (String) obj);
        } else {
            zztbVar.zzd(i, (zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
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
        Field zzs;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzs2;
        Object obj2;
        Field zzs3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String zzd = zzrzVar.zzd();
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
        Object[] zze = zzrzVar.zze();
        Class<?> cls2 = zzrzVar.zza().getClass();
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
            zzrz zzrzVar2 = zzrzVar;
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
                        if (zzrzVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzs2 = (Field) obj;
                            } else {
                                zzs2 = zzs(cls2, (String) obj);
                                zze[i88] = zzs2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzs3 = (Field) obj2;
                            } else {
                                zzs3 = zzs(cls2, (String) obj2);
                                zze[i91] = zzs3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzs3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzs3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzs3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzs4 = zzs(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzs4.getType();
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
                        if (zzrzVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
                                int i98 = i19 + i19 + (charAt26 / 32);
                                Object obj3 = zze[i98];
                                if (obj3 instanceof Field) {
                                    zzs = (Field) obj3;
                                } else {
                                    zzs = zzs(cls2, (String) obj3);
                                    zze[i98] = zzs;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzs);
                                i22 = charAt26 % 32;
                                i17 = i24;
                                c = 55296;
                                i21 = objectFieldOffset2;
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
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
            iArr3[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zzrzVar = zzrzVar2;
            length = i18;
            i7 = i19;
        }
        return new zzrt(iArr3, objArr, i2, i4, zzrzVar.zza(), false, iArr, i5, i64, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzsw.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzsw.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzsw.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzsw.zzf(obj, j)).longValue();
    }

    private final zzsa zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzsa zzsaVar = (zzsa) objArr[i3];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzb2 = zzrx.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final void zzt(Object obj, Object obj2, int i) {
        if (zzy(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        zzsw.zzq(obj, j, (1 << (zzm >>> 20)) | zzsw.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzsw.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j != 1048575) {
            return (zzsw.zzc(obj, j) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j2)) != 0;
            case 2:
                return zzsw.zzd(obj, j2) != 0;
            case 3:
                return zzsw.zzd(obj, j2) != 0;
            case 4:
                return zzsw.zzc(obj, j2) != 0;
            case 5:
                return zzsw.zzd(obj, j2) != 0;
            case 6:
                return zzsw.zzc(obj, j2) != 0;
            case 7:
                return zzsw.zzw(obj, j2);
            case 8:
                Object zzf = zzsw.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzpm) {
                    return !zzpm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j2) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j2));
            case 11:
                return zzsw.zzc(obj, j2) != 0;
            case 12:
                return zzsw.zzc(obj, j2) != 0;
            case 13:
                return zzsw.zzc(obj, j2) != 0;
            case 14:
                return zzsw.zzd(obj, j2) != 0;
            case 15:
                return zzsw.zzc(obj, j2) != 0;
            case 16:
                return zzsw.zzd(obj, j2) != 0;
            case 17:
                return zzsw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzy(obj, i) : (i3 & i4) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i;
        int zzC;
        int zzC2;
        int zzD;
        int zzC3;
        int zzC4;
        int zzC5;
        int zzd;
        int zzC6;
        int zzi;
        int zzh;
        int size;
        int zzm;
        int zzC7;
        int zzC8;
        int zzj;
        int zzC9;
        int zzC10;
        int i2;
        int zzf;
        int zzC11;
        int zzC12;
        int i3;
        int zzC13;
        int zzC14;
        int zzC15;
        int zzd2;
        int zzC16;
        zzrt<T> zzrtVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zzrtVar.zzc;
            if (i4 >= iArr.length) {
                int zza2 = i6 + ((zzqm) obj).zzc.zza();
                if (!zzrtVar.zzf) {
                    return zza2;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int zzc = zzsiVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc; i9++) {
                    Map.Entry zzg = zzsiVar.zzg(i9);
                    i8 += zzqf.zzc((zzqe) ((zzse) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    i8 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return zza2 + i8;
            }
            int zzo = zzrtVar.zzo(i4);
            int zzn = zzn(zzo);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzn <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzo & 1048575;
            if (zzn >= zzqg.DOUBLE_LIST_PACKED.zza()) {
                zzqg.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzn) {
                case 0:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        i6 += zzpv.zzC(i10 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC = zzpv.zzC(i10 << 3);
                        zzC4 = zzC + 4;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzD(j2);
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzD(j3);
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzD(j4);
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC3 = zzpv.zzC(i10 << 3);
                        zzC4 = zzC3 + 8;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC = zzpv.zzC(i10 << 3);
                        zzC4 = zzC + 4;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC4 = zzpv.zzC(i10 << 3) + 1;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzpm) {
                            zzC5 = zzpv.zzC(i14);
                            zzd = ((zzpm) object).zzd();
                            zzC6 = zzpv.zzC(zzd);
                            zzC4 = zzC5 + zzC6 + zzd;
                            i6 += zzC4;
                        } else {
                            zzC2 = zzpv.zzC(i14);
                            zzD = zzpv.zzB((String) object);
                            zzC4 = zzC2 + zzD;
                            i6 += zzC4;
                        }
                    }
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzi = zzsc.zzi(i10, unsafe.getObject(obj2, j), zzrtVar.zzq(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj2, j);
                        zzC5 = zzpv.zzC(i10 << 3);
                        zzd = zzpmVar.zzd();
                        zzC6 = zzpv.zzC(zzd);
                        zzC4 = zzC5 + zzC6 + zzd;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzC(i15);
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzD(j5);
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC = zzpv.zzC(i10 << 3);
                        zzC4 = zzC + 4;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzC3 = zzpv.zzC(i10 << 3);
                        zzC4 = zzC3 + 8;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzC((i16 >> 31) ^ (i16 + i16));
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzC2 = zzpv.zzC(i10 << 3);
                        zzD = zzpv.zzD((j6 >> 63) ^ (j6 + j6));
                        zzC4 = zzC2 + zzD;
                        i6 += zzC4;
                    }
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj2, i4, i7, i5, i)) {
                        zzi = zzsc.zza(i10, (zzrq) unsafe.getObject(obj2, j), zzrtVar.zzq(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzi = zzsc.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 19:
                    zzi = zzsc.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzsc.zza;
                    if (list.size() != 0) {
                        zzh = zzsc.zzh(list) + (list.size() * zzpv.zzC(i10 << 3));
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzsc.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzm = zzsc.zzm(list2);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzsc.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzm = zzsc.zzg(list3);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 23:
                    zzi = zzsc.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 24:
                    zzi = zzsc.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzi = size2 * (zzpv.zzC(i10 << 3) + 1);
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzsc.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzh = zzpv.zzC(i10 << 3) * size3;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zza3 = zzrbVar.zza();
                                if (zza3 instanceof zzpm) {
                                    int zzd3 = ((zzpm) zza3).zzd();
                                    zzh += zzpv.zzC(zzd3) + zzd3;
                                } else {
                                    zzh += zzpv.zzB((String) zza3);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzpm) {
                                    int zzd4 = ((zzpm) obj3).zzd();
                                    zzh += zzpv.zzC(zzd4) + zzd4;
                                } else {
                                    zzh += zzpv.zzB((String) obj3);
                                }
                            }
                        }
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzsa zzq = zzrtVar.zzq(i4);
                    int i24 = zzsc.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzC8 = 0;
                    } else {
                        zzC8 = zzpv.zzC(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzra) {
                                zzj = ((zzra) obj4).zza();
                                zzC9 = zzpv.zzC(zzj);
                            } else {
                                zzj = ((zzpa) obj4).zzj(zzq);
                                zzC9 = zzpv.zzC(zzj);
                            }
                            zzC8 += zzC9 + zzj;
                        }
                    }
                    i6 += zzC8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzsc.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzC10 = 0;
                    } else {
                        zzC10 = size5 * zzpv.zzC(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzpm) list7.get(i27)).zzd();
                            zzC10 += zzpv.zzC(zzd5) + zzd5;
                        }
                    }
                    i6 += zzC10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzsc.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzm = zzsc.zzl(list8);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzsc.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzm = zzsc.zzb(list9);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 31:
                    zzi = zzsc.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 32:
                    zzi = zzsc.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzsc.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzm = zzsc.zzj(list10);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzsc.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzm = zzsc.zzk(list11);
                        zzC7 = zzpv.zzC(i10 << 3);
                        i2 = size * zzC7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 35:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = zzsc.zzh((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzf = zzsc.zzm((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = zzsc.zzg((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzsc.zza;
                    zzf = list12.size();
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzf = zzsc.zzl((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = zzsc.zzb((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzf = zzsc.zzj((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = zzsc.zzk((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzC11 = zzpv.zzC(i10 << 3);
                        zzC12 = zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i6 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzsa zzq2 = zzrtVar.zzq(i4);
                    int i33 = zzsc.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzsc.zza(i10, (zzrq) list13.get(i34), zzq2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj2, j);
                    zzrj zzrjVar = (zzrj) zzrtVar.zzr(i4);
                    if (!zzrkVar.isEmpty()) {
                        zzh = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            zzh += zzrjVar.zza(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 51:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC13 = zzpv.zzC(i10 << 3);
                        zzi = zzC13 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC14 = zzpv.zzC(i10 << 3);
                        zzi = zzC14 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        long zzp = zzp(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzD(zzp);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        long zzp2 = zzp(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzD(zzp2);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        long zzl = zzl(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzD(zzl);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC13 = zzpv.zzC(i10 << 3);
                        zzi = zzC13 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC14 = zzpv.zzC(i10 << 3);
                        zzi = zzC14 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzi = zzpv.zzC(i10 << 3) + 1;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!zzrtVar.zzC(obj2, i10, i4)) {
                        break;
                    } else {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzpm) {
                            zzC15 = zzpv.zzC(i35);
                            zzd2 = ((zzpm) object2).zzd();
                            zzC16 = zzpv.zzC(zzd2);
                            zzi = zzC15 + zzC16 + zzd2;
                            i6 += zzi;
                            break;
                        } else {
                            zzm = zzpv.zzC(i35);
                            i2 = zzpv.zzB((String) object2);
                            zzi = zzm + i2;
                            i6 += zzi;
                        }
                    }
                case 60:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzi = zzsc.zzi(i10, unsafe.getObject(obj2, j), zzrtVar.zzq(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj2, j);
                        zzC15 = zzpv.zzC(i10 << 3);
                        zzd2 = zzpmVar2.zzd();
                        zzC16 = zzpv.zzC(zzd2);
                        zzi = zzC15 + zzC16 + zzd2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        int zzl2 = zzl(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzC(zzl2);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        long zzl3 = zzl(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzD(zzl3);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC14 = zzpv.zzC(i10 << 3);
                        zzi = zzC14 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzC13 = zzpv.zzC(i10 << 3);
                        zzi = zzC13 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        int zzl4 = zzl(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzC((zzl4 >> 31) ^ (zzl4 + zzl4));
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        long zzp3 = zzp(obj2, j);
                        zzm = zzpv.zzC(i10 << 3);
                        i2 = zzpv.zzD((zzp3 >> 63) ^ (zzp3 + zzp3));
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj2, i10, i4)) {
                        zzi = zzsc.zza(i10, (zzrq) unsafe.getObject(obj2, j), zzrtVar.zzq(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (hashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzo = zzo(i3);
            int i5 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzn) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j));
                    byte[] bArr = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr2 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr3 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr4 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzqs.zza(zzsw.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzsw.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr5 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr6 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzsw.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i4 = i2 + i7;
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
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzqs.zza(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
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
                                ((zzqr) zzsw.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, iArr[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzo(obj, j, zzsw.zza(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzp(obj, j, zzsw.zzb(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzm(obj, j, zzsw.zzw(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i);
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
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj, j);
                    zzqr zzqrVar2 = (zzqr) zzsw.zzf(obj2, j);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.zzd(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    zzsw.zzs(obj, j, zzqrVar2);
                    break;
                case 50:
                    int i4 = zzsc.zza;
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj, j);
                    zzrk zzrkVar2 = (zzrk) zzsw.zzf(obj2, j);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.zze()) {
                            zzrkVar = zzrkVar.zzb();
                        }
                        zzrkVar.zzd(zzrkVar2);
                    }
                    zzsw.zzs(obj, j, zzrkVar);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case AD_VISIBILITY_VALUE:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i);
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
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzu(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zztb zztbVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zzrt<T> zzrtVar = this;
        if (zzrtVar.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (!zzqfVar.zza.isEmpty()) {
                entry = (Map.Entry) zzqfVar.zzf().next();
                iArr = zzrtVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzo = zzrtVar.zzo(i);
                    int zzn = zzn(zzo);
                    int i7 = iArr[i];
                    if (zzn <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        i2 = zzo;
                        i3 = 1 << (i8 >>> 20);
                    } else {
                        i2 = zzo;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = i2 & i4;
                    switch (zzn) {
                        case 0:
                            if (!zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                break;
                            } else {
                                zztbVar.zzf(i7, zzsw.zza(obj, j));
                                continue;
                            }
                        case 1:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzn(i7, zzsw.zzb(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzs(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzJ(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzq(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzl(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzj(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzb(i7, zzsw.zzw(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zzE(i7, unsafe.getObject(obj, j), zztbVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzv(i7, unsafe.getObject(obj, j), zzrtVar.zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzd(i7, (zzpm) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzH(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzh(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzx(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzz(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzB(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzD(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zzrtVar.zzz(obj, i, i5, i6, i3)) {
                                zztbVar.zzp(i7, unsafe.getObject(obj, j), zzrtVar.zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzsc.zzr(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 19:
                            zzsc.zzv(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 20:
                            zzsc.zzx(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 21:
                            zzsc.zzD(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 22:
                            zzsc.zzw(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 23:
                            zzsc.zzu(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 24:
                            zzsc.zzt(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 25:
                            zzsc.zzq(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 26:
                            int i10 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zzsc.zza;
                            if (list != null && !list.isEmpty()) {
                                zztbVar.zzG(i10, list);
                                break;
                            }
                            break;
                        case 27:
                            int i12 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzsa zzq = zzrtVar.zzq(i);
                            int i13 = zzsc.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzpw) zztbVar).zzv(i12, list2.get(i14), zzq);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i15 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zzsc.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zztbVar.zze(i15, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzsc.zzC(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 30:
                            zzsc.zzs(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 31:
                            zzsc.zzy(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 32:
                            zzsc.zzz(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 33:
                            zzsc.zzA(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 34:
                            zzsc.zzB(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            continue;
                        case 35:
                            zzsc.zzr(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 36:
                            zzsc.zzv(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 37:
                            zzsc.zzx(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 38:
                            zzsc.zzD(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 39:
                            zzsc.zzw(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 40:
                            zzsc.zzu(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 41:
                            zzsc.zzt(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 42:
                            zzsc.zzq(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 43:
                            zzsc.zzC(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 44:
                            zzsc.zzs(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 45:
                            zzsc.zzy(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 46:
                            zzsc.zzz(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 47:
                            zzsc.zzA(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 48:
                            zzsc.zzB(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 49:
                            int i17 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzsa zzq2 = zzrtVar.zzq(i);
                            int i18 = zzsc.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzpw) zztbVar).zzp(i17, list4.get(i19), zzq2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zztbVar.zzu(i7, ((zzrj) zzrtVar.zzr(i)).zzc(), (zzrk) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzf(i7, zzj(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzn(i7, zzk(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzs(i7, zzp(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzJ(i7, zzp(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzq(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case AD_VISIBILITY_VALUE:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzl(i7, zzp(obj, j));
                                break;
                            }
                            break;
                        case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzj(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzb(i7, zzD(obj, j));
                                break;
                            }
                            break;
                        case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zzE(i7, unsafe.getObject(obj, j), zztbVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzv(i7, unsafe.getObject(obj, j), zzrtVar.zzq(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzd(i7, (zzpm) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzH(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzh(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzx(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzz(i7, zzp(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzB(i7, zzl(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzD(i7, zzp(obj, j));
                                break;
                            }
                            break;
                        case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                            if (zzrtVar.zzC(obj, i7, i)) {
                                zztbVar.zzp(i7, unsafe.getObject(obj, j), zzrtVar.zzq(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zzrtVar = this;
                }
                if (entry != null) {
                    zzsq zzsqVar = ((zzqm) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzrtVar.zzc;
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

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzsw.zza(obj, j)) == Double.doubleToLongBits(zzsw.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzsw.zzb(obj, j)) == Float.floatToIntBits(zzsw.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzsw.zzw(obj, j) == zzsw.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
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
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case AD_VISIBILITY_VALUE:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    long zzm = zzm(i) & 1048575;
                    if (zzsw.zzc(obj, zzm) == zzsw.zzc(obj2, zzm) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
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
            int zzo = zzo(i7);
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
            if ((268435456 & zzo) != 0 && !zzz(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i8, i2) && !zzA(obj, zzo, zzq(i2))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn != 50) {
                            continue;
                        } else {
                            zzrk zzrkVar = (zzrk) zzsw.zzf(obj, zzo & 1048575);
                            if (!zzrkVar.isEmpty() && ((zzrj) zzr(i2)).zzc().zzb.zzb() == zzta.MESSAGE) {
                                zzsa zzsaVar = null;
                                for (Object obj2 : zzrkVar.values()) {
                                    if (zzsaVar == null) {
                                        zzsaVar = zzrx.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzsaVar.zzh(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzsw.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsa zzq = zzq(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzq.zzh(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i2, i, i3, i11) && !zzA(obj, zzo, zzq(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
