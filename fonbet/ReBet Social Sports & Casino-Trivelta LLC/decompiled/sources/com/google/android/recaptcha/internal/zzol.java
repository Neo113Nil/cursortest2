package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i10, int i11, zzoi zzoiVar, boolean z10, int[] iArr2, int i12, int i13, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzoiVar instanceof zznd;
        boolean z11 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzow zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzow zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzov zzovVar) {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzps.zzs(obj, j10, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j10, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j10, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzps.zzq(obj, j10, (1 << (zzr >>> 20)) | zzps.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzps.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzps.zzc(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j11)) != 0;
            case 2:
                return zzps.zzd(obj, j11) != 0;
            case 3:
                return zzps.zzd(obj, j11) != 0;
            case 4:
                return zzps.zzc(obj, j11) != 0;
            case 5:
                return zzps.zzd(obj, j11) != 0;
            case 6:
                return zzps.zzc(obj, j11) != 0;
            case 7:
                return zzps.zzw(obj, j11);
            case 8:
                Object zzf = zzps.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j11) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j11));
            case 11:
                return zzps.zzc(obj, j11) != 0;
            case 12:
                return zzps.zzc(obj, j11) != 0;
            case 13:
                return zzps.zzc(obj, j11) != 0;
            case 14:
                return zzps.zzd(obj, j11) != 0;
            case 15:
                return zzps.zzc(obj, j11) != 0;
            case 16:
                return zzps.zzd(obj, j11) != 0;
            case 17:
                return zzps.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzps.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzps.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i10, (String) obj);
        } else {
            zzpyVar.zzd(i10, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
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
    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
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
        Field zzC;
        char charAt10;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i39;
        char charAt11;
        int i40;
        char charAt12;
        int i41;
        char charAt13;
        int i42;
        char charAt14;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String zzd = zzouVar.zzd();
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
        Object[] zze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
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
            zzou zzouVar2 = zzouVar;
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
                        if (zzouVar2.zzc() == 1 || i88 != 0) {
                            i37 = i15 + 1;
                            int i96 = i78 / 3;
                            objArr[i96 + i96 + 1] = zze[i15];
                        } else {
                            i38 = 0;
                            int i97 = charAt25 + charAt25;
                            obj = zze[i97];
                            int i98 = i38;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i97] = zzC2;
                            }
                            int i99 = i16;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i100 = i97 + 1;
                            obj2 = zze[i100];
                            i28 = i99;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i100] = zzC3;
                            }
                            i30 = (int) unsafe.objectFieldOffset(zzC3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i1002 = i972 + 1;
                    obj2 = zze[i1002];
                    i28 = i992;
                    if (obj2 instanceof Field) {
                    }
                    i30 = (int) unsafe.objectFieldOffset(zzC3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i10022 = i9722 + 1;
                obj2 = zze[i10022];
                i28 = i9922;
                if (obj2 instanceof Field) {
                }
                i30 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i32 = i9822;
                i26 = i93;
                i31 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i16;
                int i101 = i15 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i15]);
                if (i87 == 9 || i87 == 17) {
                    i29 = i101;
                    int i102 = i78 / 3;
                    objArr[i102 + i102 + 1] = zzC4.getType();
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
                        if (zzouVar2.zzc() == 1 || i88 != 0) {
                            i15 += 2;
                            int i103 = i78 / 3;
                            objArr[i103 + i103 + 1] = zze[i101];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i107] = zzC;
                                }
                                int i108 = charAt26;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
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
            zzouVar = zzouVar2;
            length = i27;
            i16 = i28;
        }
        return new zzol(iArr3, objArr, i11, i13, zzouVar.zza(), false, iArr, i14, i73, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzps.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzps.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzps.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzps.zzf(obj, j10)).longValue();
    }

    private final zznh zzw(int i10) {
        int i11 = i10 / 3;
        return (zznh) this.zzd[i11 + i11 + 1];
    }

    private final zzow zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzow zzowVar = (zzow) objArr[i12];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzpl zzplVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzps.zzf(obj, zzu(i10) & 1048575);
        if (zzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i10;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzA7;
        int zzA8;
        int zzA9;
        int i11;
        int zze;
        int zzA10;
        int zzA11;
        int i12;
        int zzA12;
        int zzA13;
        int zzA14;
        int zzd2;
        int zzA15;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < zzolVar.zzc.length) {
            int zzu = zzolVar.zzu(i14);
            int zzt = zzt(zzu);
            int[] iArr = zzolVar.zzc;
            int i18 = iArr[i14];
            int i19 = iArr[i14 + 2];
            int i20 = i19 & i13;
            if (zzt <= 17) {
                if (i20 != i17) {
                    i15 = i20 == i13 ? 0 : unsafe.getInt(obj2, i20);
                    i17 = i20;
                }
                i10 = 1 << (i19 >>> 20);
            } else {
                i10 = 0;
            }
            int i21 = zzu & i13;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            int i22 = i16;
            long j10 = i21;
            switch (zzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        i16 = i22 + zzln.zzA(i18 << 3) + 8;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 1:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA = zzln.zzA(i18 << 3);
                        zzA4 = zzA + 4;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 2:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzB(j11);
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 3:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzB(j12);
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 4:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzB(j13);
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 5:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA3 = zzln.zzA(i18 << 3);
                        zzA4 = zzA3 + 8;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 6:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA = zzln.zzA(i18 << 3);
                        zzA4 = zzA + 4;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 7:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA4 = zzln.zzA(i18 << 3) + 1;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 8:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        int i23 = i18 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzle) {
                            zzA5 = zzln.zzA(i23);
                            zzd = ((zzle) object).zzd();
                            zzA6 = zzln.zzA(zzd);
                            zzA4 = zzA5 + zzA6 + zzd;
                            i16 = i22 + zzA4;
                            zzolVar = this;
                            i14 += 3;
                            obj2 = obj;
                            i13 = 1048575;
                        } else {
                            zzA2 = zzln.zzA(i23);
                            zzB = zzln.zzz((String) object);
                            zzA4 = zzA2 + zzB;
                            i16 = i22 + zzA4;
                            zzolVar = this;
                            i14 += 3;
                            obj2 = obj;
                            i13 = 1048575;
                        }
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 9:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzh = zzoy.zzh(i18, unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 10:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j10);
                        zzA5 = zzln.zzA(i18 << 3);
                        zzd = zzleVar.zzd();
                        zzA6 = zzln.zzA(zzd);
                        zzA4 = zzA5 + zzA6 + zzd;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 11:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        int i24 = unsafe.getInt(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzA(i24);
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 12:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzB(j14);
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 13:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA = zzln.zzA(i18 << 3);
                        zzA4 = zzA + 4;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 14:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzA3 = zzln.zzA(i18 << 3);
                        zzA4 = zzA3 + 8;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 15:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        int i25 = unsafe.getInt(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzA((i25 >> 31) ^ (i25 + i25));
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 16:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        zzA2 = zzln.zzA(i18 << 3);
                        zzB = zzln.zzB((j15 >> 63) ^ (j15 + j15));
                        zzA4 = zzA2 + zzB;
                        i16 = i22 + zzA4;
                        zzolVar = this;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzolVar = this;
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 17:
                    if (zzolVar.zzO(obj2, i14, i17, i15, i10)) {
                        zzh = zzln.zzw(i18, (zzoi) unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 18:
                    zzh = zzoy.zzd(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 19:
                    zzh = zzoy.zzb(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i26 = zzoy.zza;
                    if (list.size() != 0) {
                        zzg = zzoy.zzg(list) + (list.size() * zzln.zzA(i18 << 3));
                        i16 = zzg + i22;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzg = 0;
                    i16 = zzg + i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i27 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i28 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 23:
                    zzh = zzoy.zzd(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 24:
                    zzh = zzoy.zzb(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i29 = zzoy.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzln.zzA(i18 << 3) + 1);
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i30 = zzoy.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzln.zzA(i18 << 3) * size3;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd3 = ((zzle) zzc).zzd();
                                    zzg += zzln.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzln.zzz((String) zzc);
                                }
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj3 = list5.get(i32);
                                if (obj3 instanceof zzle) {
                                    int zzd4 = ((zzle) obj3).zzd();
                                    zzg += zzln.zzA(zzd4) + zzd4;
                                } else {
                                    zzg += zzln.zzz((String) obj3);
                                }
                            }
                        }
                        i16 = zzg + i22;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzg = 0;
                    i16 = zzg + i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzow zzx = zzolVar.zzx(i14);
                    int i33 = zzoy.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzln.zzA(i18 << 3) * size4;
                        for (int i34 = 0; i34 < size4; i34++) {
                            Object obj4 = list6.get(i34);
                            if (obj4 instanceof zznt) {
                                int zza2 = ((zznt) obj4).zza();
                                zzA8 += zzln.zzA(zza2) + zza2;
                            } else {
                                zzA8 += zzln.zzy((zzoi) obj4, zzx);
                            }
                        }
                    }
                    i16 = i22 + zzA8;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zzoy.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzln.zzA(i18 << 3);
                        for (int i36 = 0; i36 < list7.size(); i36++) {
                            int zzd5 = ((zzle) list7.get(i36)).zzd();
                            zzA9 += zzln.zzA(zzd5) + zzd5;
                        }
                    }
                    i16 = i22 + zzA9;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zzoy.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzoy.zzk(list8);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i38 = zzoy.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzoy.zza(list9);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 31:
                    zzh = zzoy.zzb(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 32:
                    zzh = zzoy.zzd(i18, (List) unsafe.getObject(obj2, j10), false);
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i39 = zzoy.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzoy.zzi(list10);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i40 = zzoy.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzoy.zzj(list11);
                        zzA7 = zzln.zzA(i18 << 3);
                        i11 = size * zzA7;
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    zzh = 0;
                    i16 = i22 + zzh;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 35:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 36:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 37:
                    zze = zzoy.zzg((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 38:
                    zze = zzoy.zzl((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 39:
                    zze = zzoy.zzf((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 40:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 41:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i41 = zzoy.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 43:
                    zze = zzoy.zzk((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 44:
                    zze = zzoy.zza((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 45:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 46:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 47:
                    zze = zzoy.zzi((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 48:
                    zze = zzoy.zzj((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i18 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i16 = i22 + zzA9;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzow zzx2 = zzolVar.zzx(i14);
                    int i42 = zzoy.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i43 = 0; i43 < size6; i43++) {
                            i12 += zzln.zzw(i18, (zzoi) list13.get(i43), zzx2);
                        }
                    }
                    i16 = i22 + i12;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j10);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 51:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA12 = zzln.zzA(i18 << 3);
                        zzh = zzA12 + 8;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 52:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA13 = zzln.zzA(i18 << 3);
                        zzh = zzA13 + 4;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 53:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        long zzv = zzv(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzB(zzv);
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 54:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        long zzv2 = zzv(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzB(zzv2);
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 55:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        long zzp = zzp(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzB(zzp);
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 56:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA12 = zzln.zzA(i18 << 3);
                        zzh = zzA12 + 8;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 57:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA13 = zzln.zzA(i18 << 3);
                        zzh = zzA13 + 4;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 58:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzh = zzln.zzA(i18 << 3) + 1;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 59:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        int i44 = i18 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzle) {
                            zzA14 = zzln.zzA(i44);
                            zzd2 = ((zzle) object2).zzd();
                            zzA15 = zzln.zzA(zzd2);
                            zzh = zzA14 + zzA15 + zzd2;
                            i16 = i22 + zzh;
                            i14 += 3;
                            obj2 = obj;
                            i13 = 1048575;
                        } else {
                            zzl = zzln.zzA(i44);
                            i11 = zzln.zzz((String) object2);
                            zzh = zzl + i11;
                            i16 = i22 + zzh;
                            i14 += 3;
                            obj2 = obj;
                            i13 = 1048575;
                        }
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzh = zzoy.zzh(i18, unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 61:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j10);
                        zzA14 = zzln.zzA(i18 << 3);
                        zzd2 = zzleVar2.zzd();
                        zzA15 = zzln.zzA(zzd2);
                        zzh = zzA14 + zzA15 + zzd2;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 62:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        int zzp2 = zzp(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzA(zzp2);
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        long zzp3 = zzp(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzB(zzp3);
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 64:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA13 = zzln.zzA(i18 << 3);
                        zzh = zzA13 + 4;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 65:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzA12 = zzln.zzA(i18 << 3);
                        zzh = zzA12 + 8;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 66:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        int zzp4 = zzp(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 67:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        long zzv3 = zzv(obj2, j10);
                        zzl = zzln.zzA(i18 << 3);
                        i11 = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzh = zzl + i11;
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i18, i14)) {
                        zzh = zzln.zzw(i18, (zzoi) unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        i16 = i22 + zzh;
                        i14 += 3;
                        obj2 = obj;
                        i13 = 1048575;
                    }
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
                default:
                    i16 = i22;
                    i14 += 3;
                    obj2 = obj;
                    i13 = 1048575;
            }
        }
        int zza3 = i16 + ((zznd) obj).zzc.zza();
        if (!zzolVar.zzh) {
            return zza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int zzc2 = zzmtVar.zza.zzc();
        int i45 = 0;
        for (int i46 = 0; i46 < zzc2; i46++) {
            Map.Entry zzg2 = zzmtVar.zza.zzg(i46);
            i45 += zzmt.zza((zzms) ((zzpa) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            i45 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i45;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i15 = iArr[i13];
            long j10 = i14;
            int i16 = 37;
            switch (zzt) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j10));
                    byte[] bArr = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j10));
                    i12 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr2 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr3 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr4 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j10));
                    i12 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object zzf = zzps.zzf(obj, j10);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr5 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr6 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object zzf2 = zzps.zzf(obj, j10);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
                    }
                    i12 = i11 + i16;
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
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzkt r36) {
        /*
            Method dump skipped, instructions count: 3886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                ((zznk) zzps.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzps.zzo(obj, j10, zzps.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzps.zzp(obj, j10, zzps.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzps.zzm(obj, j10, zzps.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j10);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j10);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j10, zznkVar2);
                    break;
                case 50:
                    int i13 = zzoy.zza;
                    zzps.zzs(obj, j10, zzod.zzb(zzps.zzf(obj, j10), zzps.zzf(obj2, j10)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0750 A[LOOP:3: B:52:0x074c->B:54:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object obj2;
        Object obj3;
        zzol<T> zzolVar;
        Throwable th2;
        int i10;
        zzpl zzplVar;
        Object obj4;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar2 = this.zzm;
        Object obj6 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzplVar = zzplVar2;
                    zzolVar = this;
                    obj4 = obj6;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zznm unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzo(obj2, zzu & 1048575, zzovVar.zza());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzp(obj2, zzu & 1048575, zzovVar.zzb());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzl());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzo());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzg());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzk());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzf());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzm(obj2, zzu & 1048575, zzovVar.zzN());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzG(obj2, zzu, zzovVar);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzs(obj2, zzu & 1048575, zzovVar.zzp());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzj());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                int zze2 = zzovVar.zze();
                                zznh zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj6 = zzoy.zzo(obj2, zzc, zze2, obj3, zzplVar2);
                                    obj = obj2;
                                }
                                zzps.zzq(obj2, zzu & 1048575, zze2);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzh());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzm());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzi());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzn());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar2 = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar2);
                                obj6 = obj3;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                if (zzM(zzu)) {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), false);
                                }
                                obj6 = obj3;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzF(zznv.zza(obj2, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzw(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 30:
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    List zza2 = zznv.zza(obj5, zzu & 1048575);
                                    zzovVar.zzy(zza2);
                                    obj6 = zzoy.zzn(obj5, zzc, zza2, zzw(zzq), obj3, zzplVar2);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar2;
                                } catch (zznm unused2) {
                                    obj2 = obj5;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    th2 = th;
                                    obj6 = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzG(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzH(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzI(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzJ(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                    obj6 = obj3;
                                } catch (zznm unused3) {
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zzplVar2.zza(obj2);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            i10 = zzolVar.zzk;
                                            while (i10 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i10], obj6, zzplVar2, obj2);
                                                i10++;
                                                zzolVar = this;
                                            }
                                            if (obj6 == null) {
                                                throw th2;
                                            }
                                            zzplVar2.zzj(obj2, obj6);
                                            throw th2;
                                        }
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                        for (int i11 = zzolVar.zzk; i11 < zzolVar.zzl; i11++) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], obj6, zzplVar2, obj2);
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th2 = th;
                                    obj6 = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List zza3 = zznv.zza(obj5, zzu & 1048575);
                                zzovVar.zzy(zza3);
                                try {
                                    obj6 = zzoy.zzn(obj5, zzc, zza3, zzw(zzq), obj4, zzplVar);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                } catch (zznm unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    th2 = th;
                                    obj6 = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzovVar.zzG(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 46:
                                zzovVar.zzH(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 47:
                                zzovVar.zzI(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 48:
                                zzovVar.zzJ(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 49:
                                zzovVar.zzC(zznv.zza(obj5, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzps.zzf(obj5, zzu2);
                                if (zzf == null) {
                                    zzf = zzoc.zza().zzb();
                                    zzps.zzs(obj5, zzu2, zzf);
                                } else if (zzod.zza(zzf)) {
                                    Object zzb2 = zzoc.zza().zzb();
                                    zzod.zzb(zzb2, zzf);
                                    zzps.zzs(obj5, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzps.zzs(obj5, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 52:
                                zzps.zzs(obj5, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 53:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 54:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 55:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 56:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 57:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 58:
                                zzps.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 59:
                                zzG(obj5, zzu, zzovVar);
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 60:
                                zzoi zzoiVar3 = (zzoi) zzB(obj5, zzc, zzq);
                                zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                                zzK(obj5, zzc, zzq, zzoiVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 61:
                                zzps.zzs(obj5, zzu & 1048575, zzovVar.zzp());
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 62:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 63:
                                int zze3 = zzovVar.zze();
                                zznh zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj6 = zzoy.zzo(obj5, zzc, zze3, obj4, zzplVar);
                                    obj = obj5;
                                    break;
                                }
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zze3));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 65:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 66:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 67:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 68:
                                zzoi zzoiVar4 = (zzoi) zzB(obj5, zzc, zzq);
                                zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                                zzK(obj5, zzc, zzq, zzoiVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj6 = zzplVar.zza(obj5);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzplVar2 = zzplVar;
                                        obj6 = obj3;
                                        i10 = zzolVar.zzk;
                                        while (i10 < zzolVar.zzl) {
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzplVar.zzk(obj6, zzovVar, 0)) {
                                        for (int i12 = zzolVar.zzk; i12 < zzolVar.zzl; i12++) {
                                            zzpl zzplVar3 = zzplVar;
                                            Object obj7 = obj5;
                                            zzolVar.zzy(obj7, zzolVar.zzj[i12], obj6, zzplVar3, obj5);
                                            obj5 = obj7;
                                            zzplVar = zzplVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    break;
                                } catch (zznm unused5) {
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj2 = obj5;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i13 = this.zzk;
                    while (i13 < this.zzl) {
                        zzy(obj, this.zzj[i13], obj6, zzplVar2, obj);
                        i13++;
                        zzplVar2 = zzplVar2;
                    }
                    obj2 = obj;
                    zzplVar2 = zzplVar2;
                } else {
                    zzplVar = zzplVar2;
                    obj4 = obj6;
                    try {
                        zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                        if (zza4 != null) {
                            if (zzmtVar == null) {
                                try {
                                    zzmtVar = ((zzna) obj).zzi();
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    obj2 = obj;
                                    zzolVar = this;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj6 = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                            }
                            zznb zznbVar = zza4.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    valueOf = Double.valueOf(zzovVar.zza());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    }
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 1:
                                    valueOf = Float.valueOf(zzovVar.zzb());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                        break;
                                    }
                                    byte[] bArr2 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzovVar.zzl());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzovVar.zzo());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzovVar.zzg());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzovVar.zzk());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzovVar.zzf());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzovVar.zzN());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 8:
                                    valueOf = zzovVar.zzr();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 9:
                                    Object zze4 = zzmtVar.zze(zza4.zza);
                                    if (!(zze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                    if (!((zznd) zze4).zzL()) {
                                        Object zze5 = zzb3.zze();
                                        zzb3.zzg(zze5, zze4);
                                        zzmtVar.zzi(zza4.zza, zze5);
                                        zze4 = zze5;
                                    }
                                    zzovVar.zzt(zze4, zzb3, zzmoVar);
                                    obj6 = obj4;
                                    break;
                                case 10:
                                    Object zze6 = zzmtVar.zze(zza4.zza);
                                    if (!(zze6 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                    if (!((zznd) zze6).zzL()) {
                                        Object zze7 = zzb4.zze();
                                        zzb4.zzg(zze7, zze6);
                                        zzmtVar.zzi(zza4.zza, zze7);
                                        zze6 = zze7;
                                    }
                                    zzovVar.zzu(zze6, zzb4, zzmoVar);
                                    obj6 = obj4;
                                    break;
                                case 11:
                                    valueOf = zzovVar.zzp();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzovVar.zzj());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    valueOf = Integer.valueOf(zzovVar.zzh());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzovVar.zzm());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzovVar.zzi());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzovVar.zzn());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                default:
                                    valueOf = null;
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                            }
                        } else {
                            obj6 = obj4 == null ? zzplVar.zza(obj) : obj4;
                            try {
                                if (zzplVar.zzk(obj6, zzovVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                } else {
                                    int i14 = this.zzk;
                                    while (i14 < this.zzl) {
                                        zzpl zzplVar4 = zzplVar;
                                        Object obj8 = obj;
                                        zzy(obj8, this.zzj[i14], obj6, zzplVar4, obj);
                                        zzplVar = zzplVar4;
                                        i14++;
                                        obj = obj8;
                                    }
                                    obj5 = obj;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                obj5 = obj;
                                zzolVar = this;
                                th2 = th;
                                obj2 = obj5;
                                zzplVar2 = zzplVar;
                                i10 = zzolVar.zzk;
                                while (i10 < zzolVar.zzl) {
                                }
                                if (obj6 == null) {
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        obj5 = obj;
                        zzolVar = this;
                        th2 = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzplVar2 = zzplVar;
                        obj6 = obj3;
                        i10 = zzolVar.zzk;
                        while (i10 < zzolVar.zzl) {
                        }
                        if (obj6 == null) {
                        }
                    }
                }
                zzplVar2 = zzplVar;
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
                obj3 = obj6;
                zzolVar = this;
            }
        }
        obj2 = obj5;
        zzplVar2 = zzplVar;
        if (obj6 == null) {
            zzplVar2.zzj(obj2, obj6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkt zzktVar) {
        zzc(obj, bArr, i10, i11, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i10;
        int i11;
        Map.Entry entry2;
        int i12;
        int i13;
        int i14;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (!zzmtVar.zza.isEmpty()) {
                Iterator zzf = zzmtVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzolVar.zzc;
                Unsafe unsafe = zzb;
                i10 = 0;
                int i15 = 1048575;
                int i16 = 0;
                while (i10 < iArr.length) {
                    int zzu = zzolVar.zzu(i10);
                    int[] iArr2 = zzolVar.zzc;
                    int zzt = zzt(zzu);
                    int i17 = iArr2[i10];
                    if (zzt <= 17) {
                        int i18 = iArr2[i10 + 2];
                        int i19 = i18 & 1048575;
                        if (i19 != i15) {
                            i11 = 1;
                            i16 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
                            i15 = i19;
                        } else {
                            i11 = 1;
                        }
                        entry2 = entry;
                        i12 = i15;
                        i13 = i16;
                        i14 = i11 << (i18 >>> 20);
                    } else {
                        i11 = 1;
                        entry2 = entry;
                        i12 = i15;
                        i13 = i16;
                        i14 = 0;
                    }
                    while (entry2 != null && ((zznb) entry2.getKey()).zza <= i17) {
                        zzolVar.zzn.zzb(zzpyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j10 = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzf(i17, zzps.zza(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 1:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzo(i17, zzps.zzb(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 2:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzt(i17, unsafe.getLong(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 3:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzK(i17, unsafe.getLong(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 4:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzr(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 5:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzm(i17, unsafe.getLong(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 6:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzk(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 7:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzb(i17, zzps.zzw(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 8:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzT(i17, unsafe.getObject(obj, j10), zzpyVar);
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 9:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzv(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 10:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzd(i17, (zzle) unsafe.getObject(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 11:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzI(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 12:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzi(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 13:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzx(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 14:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzz(i17, unsafe.getLong(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 15:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzB(i17, unsafe.getInt(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 16:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzD(i17, unsafe.getLong(obj, j10));
                            }
                            zzolVar = this;
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 17:
                            if (zzolVar.zzO(obj, i10, i12, i13, i14)) {
                                zzpyVar.zzq(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 18:
                            zzoy.zzs(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 19:
                            zzoy.zzw(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 20:
                            zzoy.zzy(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 21:
                            zzoy.zzE(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 22:
                            zzoy.zzx(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 23:
                            zzoy.zzv(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 24:
                            zzoy.zzu(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 25:
                            zzoy.zzr(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 26:
                            int i20 = zzolVar.zzc[i10];
                            List list = (List) unsafe.getObject(obj, j10);
                            int i21 = zzoy.zza;
                            if (list != null && !list.isEmpty()) {
                                zzpyVar.zzH(i20, list);
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                            break;
                        case 27:
                            int i22 = zzolVar.zzc[i10];
                            List list2 = (List) unsafe.getObject(obj, j10);
                            zzow zzx = zzolVar.zzx(i10);
                            int i23 = zzoy.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i24 = 0; i24 < list2.size(); i24++) {
                                    ((zzlo) zzpyVar).zzv(i22, list2.get(i24), zzx);
                                }
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                            break;
                        case 28:
                            int i25 = zzolVar.zzc[i10];
                            List list3 = (List) unsafe.getObject(obj, j10);
                            int i26 = zzoy.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzpyVar.zze(i25, list3);
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                            break;
                        case 29:
                            zzoy.zzD(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 30:
                            zzoy.zzt(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 31:
                            zzoy.zzz(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 32:
                            zzoy.zzA(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 33:
                            zzoy.zzB(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 34:
                            zzoy.zzC(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 35:
                            zzoy.zzs(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 36:
                            zzoy.zzw(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 37:
                            zzoy.zzy(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 38:
                            zzoy.zzE(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 39:
                            zzoy.zzx(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 40:
                            zzoy.zzv(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 41:
                            zzoy.zzu(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 42:
                            zzoy.zzr(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 43:
                            zzoy.zzD(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 44:
                            zzoy.zzt(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 45:
                            zzoy.zzz(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 46:
                            zzoy.zzA(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 47:
                            zzoy.zzB(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 48:
                            zzoy.zzC(zzolVar.zzc[i10], (List) unsafe.getObject(obj, j10), zzpyVar, i11);
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 49:
                            int i27 = zzolVar.zzc[i10];
                            List list4 = (List) unsafe.getObject(obj, j10);
                            zzow zzx2 = zzolVar.zzx(i10);
                            int i28 = zzoy.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i29 = 0; i29 < list4.size(); i29++) {
                                    ((zzlo) zzpyVar).zzq(i27, list4.get(i29), zzx2);
                                }
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j10) != null) {
                                throw null;
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 51:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzf(i17, zzn(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 52:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzo(i17, zzo(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 53:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzt(i17, zzv(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 54:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzK(i17, zzv(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 55:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzr(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 56:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzm(i17, zzv(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 57:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzk(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 58:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzb(i17, zzS(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 59:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzT(i17, unsafe.getObject(obj, j10), zzpyVar);
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 60:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzv(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 61:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzd(i17, (zzle) unsafe.getObject(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 62:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzI(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 63:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzi(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 64:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzx(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 65:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzz(i17, zzv(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 66:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzB(i17, zzp(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 67:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzD(i17, zzv(obj, j10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        case 68:
                            if (zzolVar.zzR(obj, i17, i10)) {
                                zzpyVar.zzq(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i10));
                            }
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                        default:
                            i10 += 3;
                            i16 = i13;
                            i15 = i12;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzolVar.zzn.zzb(zzpyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zznd) obj).zzc.zzl(zzpyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzolVar.zzc;
        Unsafe unsafe2 = zzb;
        i10 = 0;
        int i152 = 1048575;
        int i162 = 0;
        while (i10 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzps.zza(obj, j10)) == Double.doubleToLongBits(zzps.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzps.zzb(obj, j10)) == Float.floatToIntBits(zzps.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzps.zzw(obj, j10) == zzps.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
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
                    long zzr = zzr(i10) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
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
            if ((268435456 & zzu) != 0 && !zzO(obj2, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj2, i16, i15) && !zzP(obj2, zzu, zzx(i15))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj2, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj2, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj2, i15, i10, i11, i19) && !zzP(obj2, zzu, zzx(i15))) {
                return false;
            }
            i12++;
            obj = obj2;
            i14 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
