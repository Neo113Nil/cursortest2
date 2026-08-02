package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes6.dex */
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i, int i2, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i) {
        int i2 = i / 3;
        return (zzlf) this.zzd[i2 + i2 + 1];
    }

    private final zzmt zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzmt zzmtVar = (zzmt) this.zzd[i3];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzmt zzB = zzB(i2);
        if (!zzT(obj, i, i2)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i2) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzy;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzT(obj2, i2, i)) {
            int zzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzy;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j = 1048575 & zzv;
        if (j == 1048575) {
            return;
        }
        zznu.zzq(obj, j, (1 << (zzv >>> 20)) | zznu.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zznu.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j != 1048575) {
            return (zznu.zzc(obj, j) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i);
        long j2 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j2)) != 0;
            case 2:
                return zznu.zzd(obj, j2) != 0;
            case 3:
                return zznu.zzd(obj, j2) != 0;
            case 4:
                return zznu.zzc(obj, j2) != 0;
            case 5:
                return zznu.zzd(obj, j2) != 0;
            case 6:
                return zznu.zzc(obj, j2) != 0;
            case 7:
                return zznu.zzw(obj, j2);
            case 8:
                Object zzf = zznu.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j2) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j2));
            case 11:
                return zznu.zzc(obj, j2) != 0;
            case 12:
                return zznu.zzc(obj, j2) != 0;
            case 13:
                return zznu.zzc(obj, j2) != 0;
            case 14:
                return zznu.zzd(obj, j2) != 0;
            case 15:
                return zznu.zzc(obj, j2) != 0;
            case 16:
                return zznu.zzd(obj, j2) != 0;
            case 17:
                return zznu.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzP(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zznu.zzc(obj, (long) (zzv(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zznu.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zzf = zznl.zzf();
        zzlbVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzml zzl(Class cls, zzmf zzmfVar, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        int i;
        int charAt;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt2;
        int i8;
        char charAt3;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        boolean z;
        zzms zzmsVar;
        int i16;
        int i17;
        int objectFieldOffset;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzF;
        char charAt10;
        int i24;
        int i25;
        Object obj;
        Field zzF2;
        Object obj2;
        Field zzF3;
        int i26;
        char charAt11;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        if (!(zzmfVar instanceof zzms)) {
            throw null;
        }
        zzms zzmsVar2 = (zzms) zzmfVar;
        int zzc = zzmsVar2.zzc();
        String zzd = zzmsVar2.zzd();
        int length = zzd.length();
        int i30 = 0;
        int i31 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i29 = i33 + 1;
                charAt14 = zzd.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i29;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i29;
        }
        if (charAt15 == 0) {
            i5 = 0;
            charAt = 0;
            i4 = 0;
            i6 = 0;
            i3 = 0;
            iArr = zza;
            i2 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = zzd.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt9 = zzd.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt8 = zzd.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt7 = zzd.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt6 = zzd.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt5 = zzd.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int charAt20 = zzd.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt4 = zzd.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt21 = zzd.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    charAt3 = zzd.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int charAt22 = zzd.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt2 = zzd.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i59 = i7;
                }
                charAt22 = i58 | (charAt2 << i60);
                i57 = i7;
            }
            int i61 = charAt22 + charAt20 + charAt21;
            int i62 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[i61];
            i30 = charAt16;
            iArr = iArr2;
            i2 = charAt20;
            i3 = charAt22;
            i33 = i57;
            i4 = charAt18;
            i5 = i62;
            i6 = charAt19;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzmsVar2.zze();
        Class<?> cls2 = zzmsVar2.zza().getClass();
        int i63 = i3 + i2;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (true) {
            if (zzc == 2) {
                i15 = i67;
                z = true;
            } else {
                i15 = i67;
                z = false;
            }
            if (i33 >= length) {
                return new zzml(iArr3, objArr, i4, i6, zzmsVar2.zza(), z, false, iArr, i3, i63, zzmnVar, zzlwVar, zznkVar, zzkoVar, zzmdVar);
            }
            int i69 = i33 + 1;
            int charAt23 = zzd.charAt(i33);
            if (charAt23 >= i31) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt13 = zzd.charAt(i71);
                    zzmsVar = zzmsVar2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    zzmsVar2 = zzmsVar;
                }
                charAt23 = i70 | (charAt13 << i72);
                i16 = i28;
            } else {
                zzmsVar = zzmsVar2;
                i16 = i69;
            }
            int i73 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            int i74 = zzc;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i27 = i73 + 1;
                    charAt12 = zzd.charAt(i73);
                    if (charAt12 < c) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i73 = i27;
                    c = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i73 = i27;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i15] = i68;
                i15++;
            }
            int i77 = charAt24 & 255;
            int i78 = length;
            if (i77 >= 51) {
                int i79 = i73 + 1;
                int charAt25 = zzd.charAt(i73);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i26 = i81 + 1;
                        charAt11 = zzd.charAt(i81);
                        if (charAt11 < c2) {
                            break;
                        }
                        i80 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i81 = i26;
                        c2 = 55296;
                    }
                    charAt25 = i80 | (charAt11 << i82);
                    i24 = i26;
                } else {
                    i24 = i79;
                }
                int i83 = i24;
                int i84 = i77 - 51;
                i17 = i30;
                if (i84 == 9 || i84 == 17) {
                    int i85 = i68 / 3;
                    i25 = i5 + 1;
                    objArr[i85 + i85 + 1] = zze[i5];
                } else {
                    if (i84 == 12 && !z) {
                        int i86 = i68 / 3;
                        i25 = i5 + 1;
                        objArr[i86 + i86 + 1] = zze[i5];
                    }
                    int i87 = charAt25 + charAt25;
                    obj = zze[i87];
                    if (obj instanceof Field) {
                        zzF2 = zzF(cls2, (String) obj);
                        zze[i87] = zzF2;
                    } else {
                        zzF2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzF2);
                    int i88 = i87 + 1;
                    obj2 = zze[i88];
                    if (obj2 instanceof Field) {
                        zzF3 = zzF(cls2, (String) obj2);
                        zze[i88] = zzF3;
                    } else {
                        zzF3 = (Field) obj2;
                    }
                    str = zzd;
                    i21 = (int) unsafe.objectFieldOffset(zzF3);
                    i22 = objectFieldOffset2;
                    i73 = i83;
                    i20 = 0;
                    i18 = 55296;
                }
                i5 = i25;
                int i872 = charAt25 + charAt25;
                obj = zze[i872];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzF2);
                int i882 = i872 + 1;
                obj2 = zze[i882];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                i21 = (int) unsafe.objectFieldOffset(zzF3);
                i22 = objectFieldOffset22;
                i73 = i83;
                i20 = 0;
                i18 = 55296;
            } else {
                i17 = i30;
                int i89 = i5 + 1;
                Field zzF4 = zzF(cls2, (String) zze[i5]);
                if (i77 == 9 || i77 == 17) {
                    int i90 = i68 / 3;
                    objArr[i90 + i90 + 1] = zzF4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        int i91 = i68 / 3;
                        i5 += 2;
                        objArr[i91 + i91 + 1] = zze[i89];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (!z) {
                            int i92 = i68 / 3;
                            i5 += 2;
                            objArr[i92 + i92 + 1] = zze[i89];
                        }
                    } else if (i77 == 50) {
                        int i93 = i65 + 1;
                        iArr[i65] = i68;
                        int i94 = i68 / 3;
                        int i95 = i5 + 2;
                        int i96 = i94 + i94;
                        objArr[i96] = zze[i89];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i96 + 1] = zze[i95];
                            i5 += 3;
                        } else {
                            i5 = i95;
                        }
                        i65 = i93;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                    if ((charAt24 & 4096) == 4096 || i77 > 17) {
                        str = zzd;
                        i18 = 55296;
                        i19 = 1048575;
                        i20 = 0;
                    } else {
                        int i97 = i73 + 1;
                        int charAt26 = zzd.charAt(i73);
                        if (charAt26 >= 55296) {
                            int i98 = charAt26 & 8191;
                            int i99 = 13;
                            while (true) {
                                i23 = i97 + 1;
                                charAt10 = zzd.charAt(i97);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i98 |= (charAt10 & 8191) << i99;
                                i99 += 13;
                                i97 = i23;
                            }
                            charAt26 = i98 | (charAt10 << i99);
                        } else {
                            i23 = i97;
                        }
                        int i100 = i17 + i17 + (charAt26 / 32);
                        Object obj3 = zze[i100];
                        str = zzd;
                        if (obj3 instanceof Field) {
                            zzF = (Field) obj3;
                        } else {
                            zzF = zzF(cls2, (String) obj3);
                            zze[i100] = zzF;
                        }
                        i20 = charAt26 % 32;
                        i19 = (int) unsafe.objectFieldOffset(zzF);
                        i73 = i23;
                        i18 = 55296;
                    }
                    if (i77 >= 18 && i77 <= 49) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i21 = i19;
                    i22 = objectFieldOffset;
                }
                i5 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i18 = 55296;
                i19 = 1048575;
                i20 = 0;
                if (i77 >= 18) {
                    iArr[i66] = objectFieldOffset;
                    i66++;
                }
                i21 = i19;
                i22 = objectFieldOffset;
            }
            int i101 = i68 + 1;
            iArr3[i68] = charAt23;
            int i102 = i68 + 2;
            iArr3[i101] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i77 << 20) | i22;
            i68 += 3;
            iArr3[i102] = (i20 << 20) | i21;
            i33 = i73;
            i67 = i15;
            zzc = i74;
            i31 = i18;
            length = i78;
            zzmsVar2 = zzmsVar;
            zzd = str;
            i30 = i17;
        }
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zznu.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zznu.zzf(obj, j)).floatValue();
    }

    private final int zzo(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzy3 = zzy(i5);
            int[] iArr = this.zzc;
            int i6 = iArr[i5];
            int zzx10 = zzx(zzy3);
            if (zzx10 <= 17) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                int i9 = i7 >>> 20;
                if (i8 != i4) {
                    i3 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long j = zzy3 & 1048575;
            switch (zzx10) {
                case 0:
                    if ((i3 & i) != 0) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i3 & i) != 0) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i3 & i) != 0) {
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i3 & i) != 0) {
                        zzy = zzki.zzy(unsafe.getLong(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i3 & i) != 0) {
                        zzy = zzki.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i3 & i) != 0) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i3 & i) != 0) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i3 & i) != 0) {
                        zzx4 = zzki.zzx(i6 << 3);
                        zzn = zzx4 + 1;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i3 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzka) {
                            int i10 = i6 << 3;
                            int i11 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i10);
                            zzn = zzx6 + zzx5;
                            i2 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) object);
                            zzx3 = zzki.zzx(i6 << 3);
                            i2 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i3 & i) != 0) {
                        zzn = zzmv.zzn(i6, unsafe.getObject(obj, j), zzB(i5));
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i3 & i) != 0) {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j);
                        int i12 = i6 << 3;
                        int i13 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i12);
                        zzn = zzx6 + zzx5;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i3 & i) != 0) {
                        zzy = zzki.zzx(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i3 & i) != 0) {
                        zzy = zzki.zzu(unsafe.getInt(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i3 & i) != 0) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i3 & i) != 0) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i3 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        zzx3 = zzki.zzx(i6 << 3);
                        zzy = zzki.zzx((i14 >> 31) ^ (i14 + i14));
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i3) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        zzx7 = zzki.zzx(i6 << 3);
                        zzy2 = zzki.zzy((j2 + j2) ^ (j2 >> 63));
                        zzn = zzx7 + zzy2;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i3 & i) != 0) {
                        zzn = zzki.zzt(i6, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i6, (List) unsafe.getObject(obj, j));
                    i2 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i6, (List) unsafe.getObject(obj, j), zzB(i5));
                    i2 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i6, (List) unsafe.getObject(obj, j));
                    i2 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += zzn;
                    break;
                case 35:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i15 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i15);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i16 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i16);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i17 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i17);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i18 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i18);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i19 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i19);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i20 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i20);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i21 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i21);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i22 = zzmv.zza;
                    zzy = list.size();
                    if (zzy > 0) {
                        int i23 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i23);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i24 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i24);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i25 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i25);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i26 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i26);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i27 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i27);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i28 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i28);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i29 = i6 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i29);
                        zzx3 = zzx9 + zzx8;
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i6, (List) unsafe.getObject(obj, j), zzB(i5));
                    i2 += zzn;
                    break;
                case 50:
                    zzmd.zza(i6, unsafe.getObject(obj, j), zzC(i5));
                    break;
                case 51:
                    if (zzT(obj, i6, i5)) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i6, i5)) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i6, i5)) {
                        zzy = zzki.zzy(zzz(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i6, i5)) {
                        zzy = zzki.zzy(zzz(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i6, i5)) {
                        zzy = zzki.zzu(zzp(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (zzT(obj, i6, i5)) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i6, i5)) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i6, i5)) {
                        zzx4 = zzki.zzx(i6 << 3);
                        zzn = zzx4 + 1;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzT(obj, i6, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzka) {
                            int i30 = i6 << 3;
                            int i31 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx5 = zzki.zzx(zzd3) + zzd3;
                            zzx6 = zzki.zzx(i30);
                            zzn = zzx6 + zzx5;
                            i2 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) object2);
                            zzx3 = zzki.zzx(i6 << 3);
                            i2 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i6, i5)) {
                        zzn = zzmv.zzn(i6, unsafe.getObject(obj, j), zzB(i5));
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i6, i5)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j);
                        int i32 = i6 << 3;
                        int i33 = zzki.zzb;
                        int zzd4 = zzkaVar2.zzd();
                        zzx5 = zzki.zzx(zzd4) + zzd4;
                        zzx6 = zzki.zzx(i32);
                        zzn = zzx6 + zzx5;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i6, i5)) {
                        zzy = zzki.zzx(zzp(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i6, i5)) {
                        zzy = zzki.zzu(zzp(obj, j));
                        zzx3 = zzki.zzx(i6 << 3);
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i6, i5)) {
                        zzx2 = zzki.zzx(i6 << 3);
                        zzn = zzx2 + 4;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i6, i5)) {
                        zzx = zzki.zzx(i6 << 3);
                        zzn = zzx + 8;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i6, i5)) {
                        int zzp = zzp(obj, j);
                        zzx3 = zzki.zzx(i6 << 3);
                        zzy = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i2 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i6, i5)) {
                        long zzz = zzz(obj, j);
                        zzx7 = zzki.zzx(i6 << 3);
                        zzy2 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                        zzn = zzx7 + zzy2;
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzT(obj, i6, i5)) {
                        zzn = zzki.zzt(i6, (zzmi) unsafe.getObject(obj, j), zzB(i5));
                        i2 += zzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zznk zznkVar = this.zzn;
        int zza2 = i2 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zznu.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int zzm = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjnVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return zzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int zzj = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjnVar.zza));
                unsafe.putInt(obj, j2, i4);
                return zzj;
            case AD_VISIBILITY_VALUE:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzjo.zzp(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzjo.zzb(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                if (i5 != 0) {
                    return i;
                }
                int zzm2 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzjnVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return zzm2;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                if (i5 != 2) {
                    return i;
                }
                int zzj2 = zzjo.zzj(bArr, i, zzjnVar);
                int i13 = zzjnVar.zza;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i13)) {
                        throw zzll.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzlj.zzb));
                    zzj2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return zzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object zzE = zzE(obj, i4, i8);
                int zzo = zzjo.zzo(zzE, zzB(i8), bArr, i, i2, zzjnVar);
                zzM(obj, i4, i8, zzE);
                return zzo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int zza2 = zzjo.zza(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, zzjnVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return zza2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int zzj3 = zzjo.zzj(bArr, i, zzjnVar);
                int i14 = zzjnVar.zza;
                zzlf zzA = zzA(i8);
                if (zzA != null && !zzA.zza(i14)) {
                    zzd(obj).zzj(i3, Long.valueOf(i14));
                    return zzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return zzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int zzj4 = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return zzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int zzm3 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return zzm3;
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzjo.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzjnVar);
                    zzM(obj, i4, i8, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzjn zzjnVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzl;
        byte[] bArr2 = bArr;
        int i12 = i;
        int i13 = i2;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j2);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzliVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int zzj = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i14 = zzjnVar.zza + zzj;
                    while (zzj < i14) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr2, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i14) {
                        return zzj;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i13) {
                            i12 = zzjo.zzj(bArr2, i8, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr2, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int zzj2 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i15 = zzjnVar.zza + zzj2;
                    while (zzj2 < i15) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr2, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i15) {
                        return zzj2;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i13) {
                            i12 = zzjo.zzj(bArr2, i9, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr2, i12)));
                            }
                        }
                    }
                    return i9;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int zzj3 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i16 = zzjnVar.zza + zzj3;
                    while (zzj3 < i16) {
                        zzj3 = zzjo.zzm(bArr2, zzj3, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj3 == i16) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar;
                    int zzm = zzjo.zzm(bArr2, i12, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i13) {
                        int zzj4 = zzjo.zzj(bArr2, zzm, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr2, zzj4, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzjo.zzf(bArr2, i12, zzliVar, zzjnVar);
                }
                if (i5 == 0) {
                    return zzjo.zzl(i3, bArr2, i12, i13, zzliVar, zzjnVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int zzj5 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i17 = zzjnVar.zza + zzj5;
                    while (zzj5 < i17) {
                        zzlxVar3.zzg(zzjo.zzp(bArr2, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i17) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i13) {
                            i12 = zzjo.zzj(bArr2, i10, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzlxVar4.zzg(zzjo.zzp(bArr2, i12));
                            }
                        }
                    }
                    return i10;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int zzj6 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i18 = zzjnVar.zza + zzj6;
                    while (zzj6 < i18) {
                        zzlcVar.zzh(zzjo.zzb(bArr2, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i18) {
                        return zzj6;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i13) {
                            i12 = zzjo.zzj(bArr2, i11, zzjnVar);
                            if (i3 == zzjnVar.zza) {
                                zzlcVar2.zzh(zzjo.zzb(bArr2, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int zzj7 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i19 = zzjnVar.zza + zzj7;
                    while (zzj7 < i19) {
                        zzj7 = zzjo.zzm(bArr2, zzj7, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj7 == i19) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar;
                    int zzm2 = zzjo.zzm(bArr2, i12, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i13) {
                        int zzj8 = zzjo.zzj(bArr2, zzm2, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr2, zzj8, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzjo.zzj(bArr2, i12, zzjnVar);
                        int i20 = zzjnVar.zza;
                        if (i20 < 0) {
                            throw zzll.zzd();
                        }
                        if (i20 == 0) {
                            zzliVar.add("");
                        } else {
                            zzliVar.add(new String(bArr2, zzj9, i20, zzlj.zzb));
                            zzj9 += i20;
                        }
                        while (zzj9 < i13) {
                            int zzj10 = zzjo.zzj(bArr2, zzj9, zzjnVar);
                            if (i3 != zzjnVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzjo.zzj(bArr2, zzj10, zzjnVar);
                            int i21 = zzjnVar.zza;
                            if (i21 < 0) {
                                throw zzll.zzd();
                            }
                            if (i21 == 0) {
                                zzliVar.add("");
                            } else {
                                zzliVar.add(new String(bArr2, zzj9, i21, zzlj.zzb));
                                zzj9 += i21;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i22 = zzjnVar.zza;
                    if (i22 < 0) {
                        throw zzll.zzd();
                    }
                    if (i22 == 0) {
                        zzliVar.add("");
                    } else {
                        int i23 = zzj11 + i22;
                        if (!zznz.zze(bArr2, zzj11, i23)) {
                            throw zzll.zzc();
                        }
                        zzliVar.add(new String(bArr2, zzj11, i22, zzlj.zzb));
                        zzj11 = i23;
                    }
                    while (zzj11 < i13) {
                        int zzj12 = zzjo.zzj(bArr2, zzj11, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzjo.zzj(bArr2, zzj12, zzjnVar);
                        int i24 = zzjnVar.zza;
                        if (i24 < 0) {
                            throw zzll.zzd();
                        }
                        if (i24 == 0) {
                            zzliVar.add("");
                        } else {
                            int i25 = zzj11 + i24;
                            if (!zznz.zze(bArr2, zzj11, i25)) {
                                throw zzll.zzc();
                            }
                            zzliVar.add(new String(bArr2, zzj11, i24, zzlj.zzb));
                            zzj11 = i25;
                        }
                    }
                    return zzj11;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzjo.zze(zzB(i6), i3, bArr2, i12, i13, zzliVar, zzjnVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i26 = zzjnVar.zza;
                    if (i26 < 0) {
                        throw zzll.zzd();
                    }
                    if (i26 > bArr2.length - zzj13) {
                        throw zzll.zzf();
                    }
                    if (i26 == 0) {
                        zzliVar.add(zzka.zzb);
                    } else {
                        zzliVar.add(zzka.zzl(bArr2, zzj13, i26));
                        zzj13 += i26;
                    }
                    while (zzj13 < i13) {
                        int zzj14 = zzjo.zzj(bArr2, zzj13, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzjo.zzj(bArr2, zzj14, zzjnVar);
                        int i27 = zzjnVar.zza;
                        if (i27 < 0) {
                            throw zzll.zzd();
                        }
                        if (i27 > bArr2.length - zzj13) {
                            throw zzll.zzf();
                        }
                        if (i27 == 0) {
                            zzliVar.add(zzka.zzb);
                        } else {
                            zzliVar.add(zzka.zzl(bArr2, zzj13, i27));
                            zzj13 += i27;
                        }
                    }
                    return zzj13;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzl = zzjo.zzl(i3, bArr2, i12, i13, zzliVar, zzjnVar);
                    }
                    return i;
                }
                zzl = zzjo.zzf(bArr2, i12, zzliVar, zzjnVar);
                zzlf zzA = zzA(i6);
                zznk zznkVar = this.zzn;
                int i28 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar instanceof RandomAccess) {
                        int size2 = zzliVar.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size2; i30++) {
                            int intValue = ((Integer) zzliVar.get(i30)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i30 != i29) {
                                    zzliVar.set(i29, Integer.valueOf(intValue));
                                }
                                i29++;
                            } else {
                                obj2 = zzmv.zzB(obj, i4, intValue, obj2, zznkVar);
                            }
                        }
                        if (i29 != size2) {
                            zzliVar.subList(i29, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzB(obj, i4, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int zzj15 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i31 = zzjnVar.zza + zzj15;
                    while (zzj15 < i31) {
                        zzj15 = zzjo.zzj(bArr2, zzj15, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj15 == i31) {
                        return zzj15;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int zzj16 = zzjo.zzj(bArr2, i12, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj16 < i13) {
                        int zzj17 = zzjo.zzj(bArr2, zzj16, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzjo.zzj(bArr2, zzj17, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj16;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int zzj18 = zzjo.zzj(bArr2, i12, zzjnVar);
                    int i32 = zzjnVar.zza + zzj18;
                    while (zzj18 < i32) {
                        zzj18 = zzjo.zzm(bArr2, zzj18, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj18 == i32) {
                        return zzj18;
                    }
                    throw zzll.zzf();
                }
                if (i5 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int zzm3 = zzjo.zzm(bArr2, i12, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i13) {
                        int zzj19 = zzjo.zzj(bArr2, zzm3, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr2, zzj19, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzmt zzB = zzB(i6);
                    int i33 = (i3 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr2, i12, i13, i33, zzjnVar);
                    zzliVar.add(zzjnVar.zzc);
                    while (zzc < i13) {
                        int zzj20 = zzjo.zzj(bArr2, zzc, zzjnVar);
                        if (i3 != zzjnVar.zza) {
                            return zzc;
                        }
                        zzc = zzjo.zzc(zzB, bArr2, zzj20, i13, i33, zzjnVar);
                        zzliVar.add(zzjnVar.zzc);
                        bArr2 = bArr;
                        i13 = i2;
                    }
                    return zzc;
                }
                return i;
        }
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i2);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
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

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zznu.zzf(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzy3 = zzy(i2);
            int zzx10 = zzx(zzy3);
            int i3 = this.zzc[i2];
            int i4 = zzy3 & 1048575;
            if (zzx10 >= zzkt.DOUBLE_LIST_PACKED.zza() && zzx10 <= zzkt.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (zzx10) {
                case 0:
                    if (zzP(obj, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj, i2)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj, i2)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj, i2)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj, i2)) {
                        zzx4 = zzki.zzx(i3 << 3);
                        zzn = zzx4 + 1;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj, i2)) {
                        Object zzf = zznu.zzf(obj, j);
                        if (zzf instanceof zzka) {
                            int i6 = i3 << 3;
                            int i7 = zzki.zzb;
                            int zzd = ((zzka) zzf).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i6);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf);
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzP(obj, i2)) {
                        zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzP(obj, i2)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i8);
                        zzn = zzx6 + zzx5;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj, i2)) {
                        zzy = zzki.zzx(zznu.zzc(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj, i2)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj, i2)) {
                        int zzc = zznu.zzc(obj, j);
                        zzx3 = zzki.zzx(i3 << 3);
                        zzy = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj, i2)) {
                        long zzd3 = zznu.zzd(obj, j);
                        zzx7 = zzki.zzx(i3 << 3);
                        zzy2 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                        zzn = zzx7 + zzy2;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzP(obj, i2)) {
                        zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i3, (List) zznu.zzf(obj, j));
                    i += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i3, (List) zznu.zzf(obj, j), zzB(i2));
                    i += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i3, (List) zznu.zzf(obj, j));
                    i += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i3, (List) zznu.zzf(obj, j), false);
                    i += zzn;
                    break;
                case 35:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i10 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i10);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i11 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i11);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzmv.zzm((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i12 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i12);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzmv.zzx((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i13 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i13);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzmv.zzk((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i14 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i14);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i15 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i15);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i16 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i16);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzmv.zza;
                    zzy = list.size();
                    if (zzy > 0) {
                        int i18 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i18);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzmv.zzv((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i19 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i19);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzmv.zzd((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i20 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i20);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i21 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i21);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i22 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i22);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzmv.zzq((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i23 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i23);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzmv.zzs((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        int i24 = i3 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i24);
                        zzx3 = zzx9 + zzx8;
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i3, (List) zznu.zzf(obj, j), zzB(i2));
                    i += zzn;
                    break;
                case 50:
                    zzmd.zza(i3, zznu.zzf(obj, j), zzC(i2));
                    break;
                case 51:
                    if (zzT(obj, i3, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i3, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i3, i2)) {
                        zzy = zzki.zzy(zzz(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i3, i2)) {
                        zzy = zzki.zzy(zzz(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i3, i2)) {
                        zzy = zzki.zzu(zzp(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (zzT(obj, i3, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i3, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i3, i2)) {
                        zzx4 = zzki.zzx(i3 << 3);
                        zzn = zzx4 + 1;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzT(obj, i3, i2)) {
                        Object zzf2 = zznu.zzf(obj, j);
                        if (zzf2 instanceof zzka) {
                            int i25 = i3 << 3;
                            int i26 = zzki.zzb;
                            int zzd4 = ((zzka) zzf2).zzd();
                            zzx5 = zzki.zzx(zzd4) + zzd4;
                            zzx6 = zzki.zzx(i25);
                            zzn = zzx6 + zzx5;
                            i += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf2);
                            zzx3 = zzki.zzx(i3 << 3);
                            i += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i3, i2)) {
                        zzn = zzmv.zzn(i3, zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i3, i2)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j);
                        int i27 = i3 << 3;
                        int i28 = zzki.zzb;
                        int zzd5 = zzkaVar2.zzd();
                        zzx5 = zzki.zzx(zzd5) + zzd5;
                        zzx6 = zzki.zzx(i27);
                        zzn = zzx6 + zzx5;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i3, i2)) {
                        zzy = zzki.zzx(zzp(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i3, i2)) {
                        zzy = zzki.zzu(zzp(obj, j));
                        zzx3 = zzki.zzx(i3 << 3);
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i3, i2)) {
                        zzx2 = zzki.zzx(i3 << 3);
                        zzn = zzx2 + 4;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i3, i2)) {
                        zzx = zzki.zzx(i3 << 3);
                        zzn = zzx + 8;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i3, i2)) {
                        int zzp = zzp(obj, j);
                        zzx3 = zzki.zzx(i3 << 3);
                        zzy = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i3, i2)) {
                        long zzz = zzz(obj, j);
                        zzx7 = zzki.zzx(i3 << 3);
                        zzy2 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                        zzn = zzx7 + zzy2;
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzT(obj, i3, i2)) {
                        zzn = zzki.zzt(i3, (zzmi) zznu.zzf(obj, j), zzB(i2));
                        i += zzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zznk zznkVar = this.zzn;
        return i + zznkVar.zza(zznkVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzy = zzy(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzy;
            int i5 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j));
                    byte[] bArr = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr2 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr3 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr4 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr5 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zznu.zzd(obj, j);
                    byte[] bArr6 = zzlj.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j);
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
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zznu.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr8 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr9 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr10 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr11 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzp(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzz(obj, j);
                        byte[] bArr12 = zzlj.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zznu.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0479, code lost:
    
        if (r11 == 1048575) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x047b, code lost:
    
        r25.putInt(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0481, code lost:
    
        r1 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0485, code lost:
    
        if (r1 >= r8.zzl) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0487, code lost:
    
        r2 = r8.zzj[r1];
        r5 = r8.zzc[r2];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r10, r8.zzy(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0499, code lost:
    
        if (r5 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04a0, code lost:
    
        if (r8.zzA(r2) != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04a5, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04a2, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04ae, code lost:
    
        if (r32 != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04b0, code lost:
    
        if (r3 != r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04b7, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04bc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04b8, code lost:
    
        if (r3 > r4) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04ba, code lost:
    
        if (r6 != r32) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04c1, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzjn zzjnVar) throws IOException {
        Object obj2;
        Unsafe unsafe;
        int i4;
        zzml<T> zzmlVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzi;
        int i9;
        zzkn zzknVar;
        int i10;
        byte[] bArr2;
        zzjn zzjnVar2;
        int i11;
        int i12;
        int i13;
        Object obj3;
        Unsafe unsafe2;
        int i14;
        Object obj4;
        zzjn zzjnVar3;
        byte[] bArr3;
        Unsafe unsafe3;
        Object obj5;
        Unsafe unsafe4;
        int i15;
        int i16;
        int i17;
        zzml<T> zzmlVar2 = this;
        Object obj6 = obj;
        byte[] bArr4 = bArr;
        int i18 = i2;
        zzjn zzjnVar4 = zzjnVar;
        zzG(obj6);
        Unsafe unsafe5 = zzb;
        int i19 = -1;
        int i20 = i;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (true) {
            if (i20 < i18) {
                int i26 = i20 + 1;
                int i27 = bArr4[i20];
                if (i27 < 0) {
                    i26 = zzjo.zzk(i27, bArr4, i26, zzjnVar4);
                    i27 = zzjnVar4.zza;
                }
                int i28 = i27;
                int i29 = i26;
                int i30 = i28 >>> 3;
                int zzu = i30 > i21 ? zzmlVar2.zzu(i30, i22 / 3) : zzmlVar2.zzt(i30);
                if (zzu == i19) {
                    zzmlVar = zzmlVar2;
                    obj2 = obj6;
                    unsafe = unsafe5;
                    i5 = i29;
                    i6 = i19;
                    i7 = i28;
                    i8 = 0;
                } else {
                    int i31 = i28 & 7;
                    int[] iArr = zzmlVar2.zzc;
                    int i32 = iArr[zzu + 1];
                    int i33 = zzu;
                    int zzx = zzx(i32);
                    long j = i32 & 1048575;
                    if (zzx <= 17) {
                        int i34 = iArr[i33 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i25) {
                            i10 = i35;
                            if (i25 != 1048575) {
                                unsafe5.putInt(obj6, i25, i24);
                            }
                            i24 = unsafe5.getInt(obj6, i36);
                            i25 = i36;
                        } else {
                            i10 = i35;
                        }
                        switch (zzx) {
                            case 0:
                                zzjn zzjnVar5 = zzjnVar4;
                                bArr2 = bArr4;
                                zzjnVar2 = zzjnVar5;
                                i11 = i29;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                obj3 = obj6;
                                unsafe2 = unsafe5;
                                if (i31 != 1) {
                                    i29 = i11;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    zznu.zzo(obj3, j, Double.longBitsToDouble(zzjo.zzp(bArr2, i11)));
                                    i20 = i11 + 8;
                                    i14 = i13 | i10;
                                    byte[] bArr5 = bArr2;
                                    zzjnVar4 = zzjnVar2;
                                    bArr4 = bArr5;
                                    i18 = i2;
                                    i22 = i8;
                                    unsafe5 = unsafe2;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    i24 = i14;
                                    obj6 = obj3;
                                    i25 = i12;
                                    break;
                                }
                            case 1:
                                zzjn zzjnVar6 = zzjnVar4;
                                bArr2 = bArr4;
                                zzjnVar2 = zzjnVar6;
                                i11 = i29;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                obj3 = obj6;
                                unsafe2 = unsafe5;
                                if (i31 != 5) {
                                    i29 = i11;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    zznu.zzp(obj3, j, Float.intBitsToFloat(zzjo.zzb(bArr2, i11)));
                                    i20 = i11 + 4;
                                    i14 = i13 | i10;
                                    byte[] bArr52 = bArr2;
                                    zzjnVar4 = zzjnVar2;
                                    bArr4 = bArr52;
                                    i18 = i2;
                                    i22 = i8;
                                    unsafe5 = unsafe2;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    i24 = i14;
                                    obj6 = obj3;
                                    i25 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                zzjn zzjnVar7 = zzjnVar4;
                                byte[] bArr6 = bArr4;
                                i11 = i29;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 0) {
                                    obj3 = obj6;
                                    unsafe2 = unsafe5;
                                    i29 = i11;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    int zzm = zzjo.zzm(bArr6, i11, zzjnVar7);
                                    Unsafe unsafe6 = unsafe5;
                                    Object obj7 = obj6;
                                    unsafe6.putLong(obj7, j, zzjnVar7.zzb);
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i14 = i13 | i10;
                                    zzjnVar4 = zzjnVar7;
                                    bArr4 = bArr6;
                                    i18 = i2;
                                    i22 = i8;
                                    i20 = zzm;
                                    unsafe5 = unsafe2;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    i24 = i14;
                                    obj6 = obj3;
                                    i25 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                zzjn zzjnVar8 = zzjnVar4;
                                byte[] bArr7 = bArr4;
                                i11 = i29;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 0) {
                                    obj3 = obj6;
                                    unsafe2 = unsafe5;
                                    i29 = i11;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    int zzj = zzjo.zzj(bArr7, i11, zzjnVar8);
                                    unsafe5.putInt(obj6, j, zzjnVar8.zza);
                                    i24 = i13 | i10;
                                    zzjnVar4 = zzjnVar8;
                                    bArr4 = bArr7;
                                    i25 = i12;
                                    i18 = i2;
                                    i20 = zzj;
                                    i22 = i8;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    break;
                                }
                            case 5:
                            case 14:
                                Object obj8 = obj6;
                                i12 = i25;
                                i13 = i24;
                                zzjn zzjnVar9 = zzjnVar4;
                                i8 = i33;
                                byte[] bArr8 = bArr4;
                                Unsafe unsafe7 = unsafe5;
                                if (i31 != 1) {
                                    unsafe2 = unsafe7;
                                    obj3 = obj8;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    unsafe7.putLong(obj8, j, zzjo.zzp(bArr8, i29));
                                    unsafe5 = unsafe7;
                                    obj6 = obj8;
                                    i20 = i29 + 8;
                                    i24 = i13 | i10;
                                    zzjnVar4 = zzjnVar9;
                                    bArr4 = bArr8;
                                    i25 = i12;
                                    i18 = i2;
                                    i22 = i8;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    break;
                                }
                            case 6:
                            case 13:
                                obj4 = obj6;
                                i12 = i25;
                                i13 = i24;
                                zzjnVar3 = zzjnVar4;
                                i8 = i33;
                                bArr3 = bArr4;
                                unsafe3 = unsafe5;
                                if (i31 != 5) {
                                    obj3 = obj4;
                                    unsafe2 = unsafe3;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    unsafe3.putInt(obj4, j, zzjo.zzb(bArr3, i29));
                                    i20 = i29 + 4;
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    unsafe5 = unsafe3;
                                    i22 = i8;
                                    bArr4 = bArr3;
                                    i23 = i28;
                                    i19 = -1;
                                    zzjnVar4 = zzjnVar3;
                                    obj6 = obj4;
                                    i21 = i30;
                                    break;
                                }
                            case 7:
                                obj4 = obj6;
                                i12 = i25;
                                i13 = i24;
                                zzjnVar3 = zzjnVar4;
                                i8 = i33;
                                bArr3 = bArr4;
                                unsafe3 = unsafe5;
                                if (i31 != 0) {
                                    obj3 = obj4;
                                    unsafe2 = unsafe3;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    i20 = zzjo.zzm(bArr3, i29, zzjnVar3);
                                    zznu.zzm(obj4, j, zzjnVar3.zzb != 0);
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    unsafe5 = unsafe3;
                                    i22 = i8;
                                    bArr4 = bArr3;
                                    i23 = i28;
                                    i19 = -1;
                                    zzjnVar4 = zzjnVar3;
                                    obj6 = obj4;
                                    i21 = i30;
                                    break;
                                }
                            case 8:
                                obj4 = obj6;
                                i12 = i25;
                                i13 = i24;
                                zzjnVar3 = zzjnVar4;
                                i8 = i33;
                                bArr3 = bArr4;
                                unsafe3 = unsafe5;
                                if (i31 != 2) {
                                    obj3 = obj4;
                                    unsafe2 = unsafe3;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    i20 = (536870912 & i32) == 0 ? zzjo.zzg(bArr3, i29, zzjnVar3) : zzjo.zzh(bArr3, i29, zzjnVar3);
                                    unsafe3.putObject(obj4, j, zzjnVar3.zzc);
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    unsafe5 = unsafe3;
                                    i22 = i8;
                                    bArr4 = bArr3;
                                    i23 = i28;
                                    i19 = -1;
                                    zzjnVar4 = zzjnVar3;
                                    obj6 = obj4;
                                    i21 = i30;
                                    break;
                                }
                            case 9:
                                obj5 = obj6;
                                Unsafe unsafe8 = unsafe5;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 2) {
                                    unsafe2 = unsafe8;
                                    obj3 = obj5;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    Object zzD = zzmlVar2.zzD(obj5, i8);
                                    byte[] bArr9 = bArr4;
                                    zzjn zzjnVar10 = zzjnVar4;
                                    int zzo = zzjo.zzo(zzD, zzmlVar2.zzB(i8), bArr9, i29, i2, zzjnVar10);
                                    zzmlVar2.zzL(obj5, i8, zzD);
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    i20 = zzo;
                                    unsafe5 = unsafe8;
                                    i22 = i8;
                                    bArr4 = bArr9;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    zzjnVar4 = zzjnVar10;
                                    obj6 = obj5;
                                    break;
                                }
                            case 10:
                                obj5 = obj6;
                                unsafe4 = unsafe5;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 2) {
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    i20 = zzjo.zza(bArr4, i29, zzjnVar4);
                                    unsafe4.putObject(obj5, j, zzjnVar4.zzc);
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    unsafe5 = unsafe4;
                                    i22 = i8;
                                    obj6 = obj5;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    break;
                                }
                            case 12:
                                obj5 = obj6;
                                unsafe4 = unsafe5;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 0) {
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    i20 = zzjo.zzj(bArr4, i29, zzjnVar4);
                                    int i37 = zzjnVar4.zza;
                                    zzlf zzA = zzmlVar2.zzA(i8);
                                    if (zzA != null && !zzA.zza(i37)) {
                                        zzd(obj5).zzj(i28, Long.valueOf(i37));
                                        i25 = i12;
                                        unsafe5 = unsafe4;
                                        i24 = i13;
                                        i22 = i8;
                                        obj6 = obj5;
                                        i23 = i28;
                                        i21 = i30;
                                        i19 = -1;
                                        i18 = i2;
                                        break;
                                    } else {
                                        unsafe4.putInt(obj5, j, i37);
                                        i24 = i13 | i10;
                                        i25 = i12;
                                        i18 = i2;
                                        unsafe5 = unsafe4;
                                        i22 = i8;
                                        obj6 = obj5;
                                        i23 = i28;
                                        i21 = i30;
                                        i19 = -1;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                obj5 = obj6;
                                unsafe4 = unsafe5;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                if (i31 != 0) {
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    i20 = zzjo.zzj(bArr4, i29, zzjnVar4);
                                    unsafe4.putInt(obj5, j, zzke.zzb(zzjnVar4.zza));
                                    i24 = i13 | i10;
                                    i25 = i12;
                                    i18 = i2;
                                    unsafe5 = unsafe4;
                                    i22 = i8;
                                    obj6 = obj5;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    break;
                                }
                            case 16:
                                if (i31 != 0) {
                                    obj5 = obj6;
                                    i8 = i33;
                                    i12 = i25;
                                    i13 = i24;
                                    unsafe2 = unsafe5;
                                    obj3 = obj5;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    int zzm2 = zzjo.zzm(bArr4, i29, zzjnVar4);
                                    Unsafe unsafe9 = unsafe5;
                                    Object obj9 = obj6;
                                    i8 = i33;
                                    unsafe9.putLong(obj9, j, zzke.zzc(zzjnVar4.zzb));
                                    obj5 = obj9;
                                    i24 |= i10;
                                    unsafe5 = unsafe9;
                                    i20 = zzm2;
                                    i22 = i8;
                                    obj6 = obj5;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    i18 = i2;
                                    break;
                                }
                            default:
                                zzjn zzjnVar11 = zzjnVar4;
                                byte[] bArr10 = bArr4;
                                i11 = i29;
                                i12 = i25;
                                i13 = i24;
                                i8 = i33;
                                obj3 = obj6;
                                unsafe2 = unsafe5;
                                if (i31 != 3) {
                                    i29 = i11;
                                    zzjnVar4 = zzjnVar;
                                    i5 = i29;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i30 = i30;
                                    i6 = -1;
                                    i25 = i12;
                                    i24 = i13;
                                    zzmlVar = zzmlVar2;
                                    i7 = i28;
                                    break;
                                } else {
                                    Object zzD2 = zzmlVar2.zzD(obj3, i8);
                                    int zzn = zzjo.zzn(zzD2, zzmlVar2.zzB(i8), bArr10, i11, i2, (i30 << 3) | 4, zzjnVar11);
                                    zzmlVar2.zzL(obj3, i8, zzD2);
                                    i14 = i13 | i10;
                                    bArr4 = bArr;
                                    i18 = i2;
                                    zzjnVar4 = zzjnVar;
                                    i20 = zzn;
                                    i22 = i8;
                                    unsafe5 = unsafe2;
                                    i23 = i28;
                                    i21 = i30;
                                    i19 = -1;
                                    i24 = i14;
                                    obj6 = obj3;
                                    i25 = i12;
                                    break;
                                }
                        }
                    } else {
                        Object obj10 = obj6;
                        Unsafe unsafe10 = unsafe5;
                        i8 = i33;
                        if (zzx == 27) {
                            if (i31 == 2) {
                                zzli zzliVar = (zzli) unsafe10.getObject(obj10, j);
                                if (!zzliVar.zzc()) {
                                    int size = zzliVar.size();
                                    zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                                    unsafe10.putObject(obj10, j, zzliVar);
                                }
                                i23 = i28;
                                bArr4 = bArr;
                                i20 = zzjo.zze(zzmlVar2.zzB(i8), i28, bArr, i29, i2, zzliVar, zzjnVar);
                                obj6 = obj10;
                                i22 = i8;
                                unsafe5 = unsafe10;
                                i21 = i30;
                                i19 = -1;
                                i18 = i2;
                                zzjnVar4 = zzjnVar;
                            } else {
                                i15 = i25;
                                i16 = i24;
                                unsafe = unsafe10;
                                i17 = i28;
                                i6 = -1;
                                zzmlVar = this;
                                obj2 = obj;
                                zzjnVar4 = zzjnVar;
                                i5 = i29;
                            }
                        } else if (zzx <= 49) {
                            i15 = i25;
                            i16 = i24;
                            unsafe = unsafe10;
                            i6 = -1;
                            int zzs = zzmlVar2.zzs(obj10, bArr, i29, i2, i28, i30, i31, i8, i32, zzx, j, zzjnVar);
                            i17 = i28;
                            i8 = i8;
                            if (zzs != i29) {
                                zzmlVar2 = this;
                                obj6 = obj;
                                i18 = i2;
                                zzjnVar4 = zzjnVar;
                                i20 = zzs;
                                i22 = i8;
                                i23 = i17;
                                i25 = i15;
                                i24 = i16;
                                i19 = -1;
                                i21 = i30;
                                unsafe5 = unsafe;
                                bArr4 = bArr;
                            } else {
                                zzmlVar = this;
                                obj2 = obj;
                                zzjnVar4 = zzjnVar;
                                i5 = zzs;
                            }
                        } else {
                            i15 = i25;
                            i16 = i24;
                            unsafe = unsafe10;
                            i6 = -1;
                            i17 = i28;
                            if (zzx != 50) {
                                zzjnVar4 = zzjnVar;
                                i30 = i30;
                                int zzr = zzr(obj, bArr, i29, i2, i17, i30, i31, i32, zzx, j, i8, zzjnVar4);
                                zzmlVar = this;
                                obj2 = obj;
                                i7 = i17;
                                i8 = i8;
                                if (zzr != i29) {
                                    i21 = i30;
                                    i20 = zzr;
                                    i22 = i8;
                                    obj6 = obj2;
                                    i25 = i15;
                                    i24 = i16;
                                    i19 = -1;
                                    unsafe5 = unsafe;
                                    bArr4 = bArr;
                                    i23 = i7;
                                    zzmlVar2 = zzmlVar;
                                    i18 = i2;
                                } else {
                                    i5 = zzr;
                                    i25 = i15;
                                    i24 = i16;
                                }
                            } else if (i31 == 2) {
                                int zzq = zzq(obj, bArr, i29, i2, i8, j, zzjnVar);
                                i8 = i8;
                                if (zzq != i29) {
                                    zzmlVar2 = this;
                                    obj6 = obj;
                                    bArr4 = bArr;
                                    i18 = i2;
                                    zzjnVar4 = zzjnVar;
                                    i20 = zzq;
                                    i22 = i8;
                                    i23 = i17;
                                    i25 = i15;
                                    i24 = i16;
                                    i19 = -1;
                                    i21 = i30;
                                    unsafe5 = unsafe;
                                } else {
                                    zzmlVar = this;
                                    obj2 = obj;
                                    zzjnVar4 = zzjnVar;
                                    i5 = zzq;
                                }
                            } else {
                                i8 = i8;
                                zzmlVar = this;
                                obj2 = obj;
                                zzjnVar4 = zzjnVar;
                                i5 = i29;
                            }
                        }
                        i7 = i17;
                        i25 = i15;
                        i24 = i16;
                        i30 = i30;
                    }
                }
                if (i7 != i3 || i3 == 0) {
                    if (!zzmlVar.zzh || (zzknVar = zzjnVar4.zzd) == zzkn.zza) {
                        zzi = zzjo.zzi(i7, bArr, i5, i2, zzd(obj2), zzjnVar);
                        i9 = i2;
                    } else {
                        if (zzknVar.zzb(zzmlVar.zzg, i30) != null) {
                            throw null;
                        }
                        zzi = zzjo.zzi(i7, bArr, i5, i2, zzd(obj2), zzjnVar4);
                        i9 = i2;
                    }
                    i20 = zzi;
                    int i38 = i30;
                    i23 = i7;
                    zzmlVar2 = zzmlVar;
                    i18 = i9;
                    i21 = i38;
                    bArr4 = bArr;
                    zzjnVar4 = zzjnVar;
                    i22 = i8;
                    obj6 = obj2;
                    i19 = i6;
                    unsafe5 = unsafe;
                } else {
                    i4 = i2;
                    i23 = i7;
                    i20 = i5;
                }
            } else {
                obj2 = obj6;
                unsafe = unsafe5;
                i4 = i18;
                zzmlVar = zzmlVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzy = zzy(i);
                int i2 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j = i2;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
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
                                this.zzm.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzT(obj, this.zzc[i], i)) {
                        zzB(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzP(obj, i)) {
                    zzB(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zznu.zzo(obj, j, zznu.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j, zznu.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j, zznu.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j, zznu.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j, zznu.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzmv.zza;
                    zznu.zzs(obj, j, zzmd.zzb(zznu.zzf(obj, j), zznu.zzf(obj2, j)));
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
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zznu.zzs(obj, j, zznu.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzmv.zzC(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x0089. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzjn zzjnVar) throws IOException {
        Object obj2;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj3;
        Unsafe unsafe2;
        int i8;
        Unsafe unsafe3;
        int i9;
        Object obj4;
        int i10;
        Unsafe unsafe4;
        int i11;
        int i12;
        int i13;
        int i14;
        zzml<T> zzmlVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i15 = i2;
        zzjn zzjnVar2 = zzjnVar;
        if (!zzmlVar.zzi) {
            zzc(obj5, bArr, i, i15, 0, zzjnVar);
            return;
        }
        zzG(obj5);
        Unsafe unsafe5 = zzb;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        while (i17 < i15) {
            int i22 = i17 + 1;
            int i23 = bArr2[i17];
            if (i23 < 0) {
                i22 = zzjo.zzk(i23, bArr2, i22, zzjnVar2);
                i23 = zzjnVar2.zza;
            }
            int i24 = i23 >>> 3;
            int zzu = i24 > i18 ? zzmlVar.zzu(i24, i19 / 3) : zzmlVar.zzt(i24);
            if (zzu == i16) {
                obj2 = obj5;
                unsafe = unsafe5;
                i3 = i23;
                i4 = i22;
                i5 = i24;
                i6 = 0;
            } else {
                int i25 = i23 & 7;
                int[] iArr = zzmlVar.zzc;
                int i26 = iArr[zzu + 1];
                int zzx = zzx(i26);
                int i27 = i23;
                int i28 = zzu;
                long j = i26 & 1048575;
                if (zzx <= 17) {
                    int i29 = iArr[i28 + 2];
                    int i30 = 1 << (i29 >>> 20);
                    int i31 = i29 & 1048575;
                    int i32 = i22;
                    if (i31 != i21) {
                        if (i21 != 1048575) {
                            unsafe5.putInt(obj5, i21, i20);
                        }
                        if (i31 != 1048575) {
                            i20 = unsafe5.getInt(obj5, i31);
                        }
                        i21 = i31;
                    }
                    switch (zzx) {
                        case 0:
                            i5 = i24;
                            i7 = i32;
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i8 = i28;
                            if (i25 != 1) {
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                zznu.zzo(obj3, j, Double.longBitsToDouble(zzjo.zzp(bArr2, i7)));
                                i17 = i7 + 8;
                                i20 |= i30;
                                i15 = i2;
                                zzjnVar2 = zzjnVar;
                                unsafe5 = unsafe2;
                                i19 = i8;
                                obj5 = obj3;
                                i18 = i5;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            i5 = i24;
                            i7 = i32;
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i8 = i28;
                            if (i25 != 5) {
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                zznu.zzp(obj3, j, Float.intBitsToFloat(zzjo.zzb(bArr2, i7)));
                                i17 = i7 + 4;
                                i20 |= i30;
                                i15 = i2;
                                zzjnVar2 = zzjnVar;
                                unsafe5 = unsafe2;
                                i19 = i8;
                                obj5 = obj3;
                                i18 = i5;
                                i16 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            Unsafe unsafe6 = unsafe5;
                            i7 = i32;
                            i8 = i28;
                            if (i25 != 0) {
                                obj3 = obj5;
                                unsafe2 = unsafe6;
                                i5 = i24;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzm = zzjo.zzm(bArr2, i7, zzjnVar2);
                                Object obj6 = obj5;
                                unsafe6.putLong(obj6, j, zzjnVar2.zzb);
                                i20 |= i30;
                                i15 = i2;
                                unsafe5 = unsafe6;
                                i19 = i8;
                                i18 = i24;
                                i17 = zzm;
                                obj5 = obj6;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe3 = unsafe5;
                            i7 = i32;
                            i8 = i28;
                            if (i25 != 0) {
                                Unsafe unsafe7 = unsafe3;
                                obj3 = obj5;
                                unsafe2 = unsafe7;
                                i5 = i24;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzj = zzjo.zzj(bArr2, i7, zzjnVar2);
                                unsafe3.putInt(obj5, j, zzjnVar2.zza);
                                i20 |= i30;
                                i15 = i2;
                                i17 = zzj;
                                i19 = i8;
                                i18 = i24;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i8 = i28;
                            Object obj7 = obj5;
                            unsafe3 = unsafe5;
                            if (i25 != 1) {
                                obj5 = obj7;
                                i7 = i32;
                                Unsafe unsafe72 = unsafe3;
                                obj3 = obj5;
                                unsafe2 = unsafe72;
                                i5 = i24;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putLong(obj7, j, zzjo.zzp(bArr2, i32));
                                obj5 = obj7;
                                i17 = i32 + 8;
                                i20 |= i30;
                                i15 = i2;
                                i19 = i8;
                                i18 = i24;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i9 = i32;
                            i8 = i28;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i25 != 5) {
                                i5 = i24;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i7 = i9;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putInt(obj4, j, zzjo.zzb(bArr2, i9));
                                i17 = i9 + 4;
                                i20 |= i30;
                                i15 = i2;
                                i19 = i8;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            i9 = i32;
                            i8 = i28;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i25 != 0) {
                                i5 = i24;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i7 = i9;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = zzjo.zzm(bArr2, i9, zzjnVar2);
                                zznu.zzm(obj4, j, zzjnVar2.zzb != 0);
                                i20 |= i30;
                                i15 = i2;
                                i19 = i8;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            i9 = i32;
                            i8 = i28;
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            if (i25 != 2) {
                                i5 = i24;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i7 = i9;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = (i26 & 536870912) == 0 ? zzjo.zzg(bArr2, i9, zzjnVar2) : zzjo.zzh(bArr2, i9, zzjnVar2);
                                unsafe3.putObject(obj4, j, zzjnVar2.zzc);
                                i20 |= i30;
                                i15 = i2;
                                i19 = i8;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            obj4 = obj5;
                            unsafe3 = unsafe5;
                            i10 = i32;
                            i8 = i28;
                            if (i25 != 2) {
                                i5 = i24;
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i7 = i10;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                Object zzD = zzmlVar.zzD(obj4, i8);
                                int zzo = zzjo.zzo(zzD, zzmlVar.zzB(i8), bArr2, i10, i2, zzjnVar2);
                                zzmlVar.zzL(obj4, i8, zzD);
                                i20 |= i30;
                                i15 = i2;
                                i17 = zzo;
                                i19 = i8;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe3;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            i10 = i32;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i25 != 2) {
                                i5 = i24;
                                unsafe2 = unsafe4;
                                i8 = i28;
                                obj3 = obj4;
                                i7 = i10;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = zzjo.zza(bArr2, i10, zzjnVar2);
                                unsafe4.putObject(obj4, j, zzjnVar2.zzc);
                                i20 |= i30;
                                i15 = i2;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i19 = i28;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            i10 = i32;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i25 != 0) {
                                i5 = i24;
                                unsafe2 = unsafe4;
                                i8 = i28;
                                obj3 = obj4;
                                i7 = i10;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = zzjo.zzj(bArr2, i10, zzjnVar2);
                                unsafe4.putInt(obj4, j, zzjnVar2.zza);
                                i20 |= i30;
                                i15 = i2;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i19 = i28;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            i10 = i32;
                            obj4 = obj5;
                            unsafe4 = unsafe5;
                            if (i25 != 0) {
                                i5 = i24;
                                unsafe2 = unsafe4;
                                i8 = i28;
                                obj3 = obj4;
                                i7 = i10;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = zzjo.zzj(bArr2, i10, zzjnVar2);
                                unsafe4.putInt(obj4, j, zzke.zzb(zzjnVar2.zza));
                                i20 |= i30;
                                i15 = i2;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i19 = i28;
                                i16 = -1;
                                break;
                            }
                        case 16:
                            if (i25 != 0) {
                                obj3 = obj5;
                                unsafe2 = unsafe5;
                                i7 = i32;
                                i8 = i28;
                                i5 = i24;
                                i3 = i27;
                                unsafe = unsafe2;
                                i6 = i8;
                                i4 = i7;
                                obj2 = obj3;
                                break;
                            } else {
                                int zzm2 = zzjo.zzm(bArr2, i32, zzjnVar2);
                                Unsafe unsafe8 = unsafe5;
                                Object obj8 = obj5;
                                unsafe8.putLong(obj8, j, zzke.zzc(zzjnVar2.zzb));
                                unsafe4 = unsafe8;
                                obj4 = obj8;
                                i20 |= i30;
                                i15 = i2;
                                i17 = zzm2;
                                i18 = i24;
                                obj5 = obj4;
                                unsafe5 = unsafe4;
                                i19 = i28;
                                i16 = -1;
                                break;
                            }
                        default:
                            obj3 = obj5;
                            unsafe2 = unsafe5;
                            i7 = i32;
                            i8 = i28;
                            i5 = i24;
                            i3 = i27;
                            unsafe = unsafe2;
                            i6 = i8;
                            i4 = i7;
                            obj2 = obj3;
                            break;
                    }
                } else {
                    i5 = i24;
                    Object obj9 = obj5;
                    Unsafe unsafe9 = unsafe5;
                    int i33 = i22;
                    if (zzx != 27) {
                        i6 = i28;
                        i14 = i33;
                        if (zzx <= 49) {
                            long j2 = i26;
                            i13 = i20;
                            unsafe = unsafe9;
                            i12 = i21;
                            int zzs = zzmlVar.zzs(obj9, bArr, i14, i2, i27, i5, i25, i6, j2, zzx, j, zzjnVar);
                            i11 = i27;
                            if (zzs != i14) {
                                zzmlVar = this;
                                obj5 = obj;
                                i15 = i2;
                                zzjnVar2 = zzjnVar;
                                i17 = zzs;
                                i21 = i12;
                                i18 = i5;
                                i19 = i6;
                                i20 = i13;
                                unsafe5 = unsafe;
                                i16 = -1;
                                bArr2 = bArr;
                            } else {
                                obj2 = obj;
                                i4 = zzs;
                                i3 = i11;
                                i21 = i12;
                                i20 = i13;
                            }
                        } else {
                            i12 = i21;
                            i13 = i20;
                            unsafe = unsafe9;
                            i11 = i27;
                            if (zzx != 50) {
                                i3 = i11;
                                int zzr = zzr(obj, bArr, i14, i2, i3, i5, i25, i26, zzx, j, i6, zzjnVar);
                                obj2 = obj;
                                if (zzr != i14) {
                                    zzmlVar = this;
                                    i15 = i2;
                                    zzjnVar2 = zzjnVar;
                                    i17 = zzr;
                                    obj5 = obj2;
                                    i21 = i12;
                                    i18 = i5;
                                    i19 = i6;
                                    i20 = i13;
                                    unsafe5 = unsafe;
                                    i16 = -1;
                                    bArr2 = bArr;
                                } else {
                                    i4 = zzr;
                                    i21 = i12;
                                    i20 = i13;
                                }
                            } else if (i25 == 2) {
                                int zzq = zzq(obj, bArr, i14, i2, i6, j, zzjnVar);
                                if (zzq != i14) {
                                    zzmlVar = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i15 = i2;
                                    zzjnVar2 = zzjnVar;
                                    i17 = zzq;
                                    i21 = i12;
                                    i18 = i5;
                                    i19 = i6;
                                    i20 = i13;
                                    unsafe5 = unsafe;
                                    i16 = -1;
                                } else {
                                    obj2 = obj;
                                    i4 = zzq;
                                    i3 = i11;
                                    i21 = i12;
                                    i20 = i13;
                                }
                            }
                        }
                    } else if (i25 == 2) {
                        zzli zzliVar = (zzli) unsafe9.getObject(obj9, j);
                        if (!zzliVar.zzc()) {
                            int size = zzliVar.size();
                            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                            unsafe9.putObject(obj9, j, zzliVar);
                        }
                        zzmt zzB = zzmlVar.zzB(i28);
                        i28 = i28;
                        byte[] bArr3 = bArr2;
                        bArr2 = bArr;
                        i15 = i2;
                        zzjnVar2 = zzjnVar;
                        i17 = zzjo.zze(zzB, i27, bArr3, i33, i2, zzliVar, zzjnVar);
                        unsafe5 = unsafe9;
                        obj5 = obj9;
                        i18 = i5;
                        i19 = i28;
                        i16 = -1;
                    } else {
                        i11 = i27;
                        unsafe = unsafe9;
                        i6 = i28;
                        i12 = i21;
                        i13 = i20;
                        i14 = i33;
                    }
                    obj2 = obj;
                    i4 = i14;
                    i3 = i11;
                    i21 = i12;
                    i20 = i13;
                }
            }
            int zzi = zzjo.zzi(i3, bArr, i4, i2, zzd(obj2), zzjnVar);
            bArr2 = bArr;
            zzjnVar2 = zzjnVar;
            i15 = i2;
            obj5 = obj2;
            i18 = i5;
            i19 = i6;
            unsafe5 = unsafe;
            i16 = -1;
            i17 = zzi;
            zzmlVar = this;
        }
        Object obj10 = obj5;
        Unsafe unsafe10 = unsafe5;
        int i34 = i15;
        int i35 = i21;
        int i36 = i20;
        if (i35 != 1048575) {
            unsafe10.putInt(obj10, i35, i36);
        }
        if (i17 != i34) {
            throw zzll.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzW;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zznu.zza(obj, j)) == Double.doubleToLongBits(zznu.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zznu.zzb(obj, j)) == Float.floatToIntBits(zznu.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zznu.zzw(obj, j) == zznu.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zznu.zzc(obj, j) == zznu.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zznu.zzd(obj, j) == zznu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
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
                    zzW = zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j));
                    break;
                case 50:
                    zzW = zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j));
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
                    long zzv = zzv(i) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzW(zznu.zzf(obj, j), zznu.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzW) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int i7 = this.zzj[i5];
            int i8 = this.zzc[i7];
            int zzy = zzy(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i = i4;
                i6 = i10;
            } else {
                i = i4;
            }
            if ((268435456 & zzy) != 0) {
                i2 = i7;
                i3 = i6;
                if (!zzQ(obj, i2, i3, i, i11)) {
                    return false;
                }
            } else {
                i2 = i7;
                i3 = i6;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i8, i2) && !zzR(obj, zzy, zzB(i2))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i2);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i2, i3, i, i11) && !zzR(obj, zzy, zzB(i2))) {
                return false;
            }
            i5++;
            i6 = i3;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int zzy = zzy(i5);
                int i6 = this.zzc[i5];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i5)) {
                            zzocVar.zzf(i6, zznu.zza(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i5)) {
                            zzocVar.zzo(i6, zznu.zzb(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i5)) {
                            zzocVar.zzt(i6, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i5)) {
                            zzocVar.zzJ(i6, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i5)) {
                            zzocVar.zzr(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i5)) {
                            zzocVar.zzm(i6, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i5)) {
                            zzocVar.zzk(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i5)) {
                            zzocVar.zzb(i6, zznu.zzw(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i5)) {
                            zzV(i6, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i5)) {
                            zzocVar.zzv(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i5)) {
                            zzocVar.zzd(i6, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i5)) {
                            zzocVar.zzH(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i5)) {
                            zzocVar.zzi(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i5)) {
                            zzocVar.zzw(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i5)) {
                            zzocVar.zzy(i6, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i5)) {
                            zzocVar.zzA(i6, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i5)) {
                            zzocVar.zzC(i6, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i5)) {
                            zzocVar.zzq(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzmv.zzG(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzK(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzN(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzV(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzM(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzJ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzI(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzE(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzT(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzO(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i5));
                        break;
                    case 28:
                        zzmv.zzF(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzU(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzH(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzP(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzQ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzR(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzS(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzG(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzK(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzN(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzV(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzM(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzJ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzI(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzE(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzU(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzH(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzP(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzQ(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzR(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzS(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzL(i6, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i5));
                        break;
                    case 50:
                        zzN(zzocVar, i6, zznu.zzf(obj, zzy & 1048575), i5);
                        break;
                    case 51:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzf(i6, zzm(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzo(i6, zzn(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzt(i6, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzJ(i6, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzr(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case AD_VISIBILITY_VALUE:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzm(i6, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzk(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzb(i6, zzU(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                        if (zzT(obj, i6, i5)) {
                            zzV(i6, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzv(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzd(i6, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzH(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzi(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzw(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzy(i6, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzA(i6, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzC(i6, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                        if (zzT(obj, i6, i5)) {
                            zzocVar.zzq(i6, zznu.zzf(obj, zzy & 1048575), zzB(i5));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < length2) {
            int zzy2 = zzy(i7);
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int zzx = zzx(zzy2);
            if (zzx <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i4;
                if (i12 != i9) {
                    i8 = unsafe.getInt(obj, i12);
                    i9 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = i3;
            }
            long j = zzy2 & i4;
            switch (zzx) {
                case 0:
                    i2 = 0;
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzocVar.zzf(i10, zznu.zza(obj, j));
                        continue;
                    }
                case 1:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzo(i10, zznu.zzb(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzt(i10, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzJ(i10, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzr(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzm(i10, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzk(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzb(i10, zznu.zzw(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzV(i10, unsafe.getObject(obj, j), zzocVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzv(i10, unsafe.getObject(obj, j), zzB(i7));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzd(i10, (zzka) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzH(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzi(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzw(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzy(i10, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzA(i10, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzC(i10, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i2 = 0;
                    if ((i8 & i) != 0) {
                        zzocVar.zzq(i10, unsafe.getObject(obj, j), zzB(i7));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i2 = 0;
                    zzmv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 19:
                    i2 = 0;
                    zzmv.zzK(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 20:
                    i2 = 0;
                    zzmv.zzN(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 21:
                    i2 = 0;
                    zzmv.zzV(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 22:
                    i2 = 0;
                    zzmv.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 23:
                    i2 = 0;
                    zzmv.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 24:
                    i2 = 0;
                    zzmv.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 25:
                    i2 = 0;
                    zzmv.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 26:
                    zzmv.zzT(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar);
                    break;
                case 27:
                    zzmv.zzO(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, zzB(i7));
                    break;
                case 28:
                    zzmv.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar);
                    break;
                case 29:
                    zzmv.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    break;
                case 30:
                    i2 = 0;
                    zzmv.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 31:
                    i2 = 0;
                    zzmv.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 32:
                    i2 = 0;
                    zzmv.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 33:
                    i2 = 0;
                    zzmv.zzR(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 34:
                    i2 = 0;
                    zzmv.zzS(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, false);
                    continue;
                case 35:
                    zzmv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 36:
                    zzmv.zzK(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 37:
                    zzmv.zzN(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 38:
                    zzmv.zzV(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 39:
                    zzmv.zzM(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 40:
                    zzmv.zzJ(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 41:
                    zzmv.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 42:
                    zzmv.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 43:
                    zzmv.zzU(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 44:
                    zzmv.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 45:
                    zzmv.zzP(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 46:
                    zzmv.zzQ(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 47:
                    zzmv.zzR(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 48:
                    zzmv.zzS(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, true);
                    break;
                case 49:
                    zzmv.zzL(this.zzc[i7], (List) unsafe.getObject(obj, j), zzocVar, zzB(i7));
                    break;
                case 50:
                    zzN(zzocVar, i10, unsafe.getObject(obj, j), i7);
                    break;
                case 51:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzf(i10, zzm(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzo(i10, zzn(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzt(i10, zzz(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzJ(i10, zzz(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzr(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzm(i10, zzz(obj, j));
                        break;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzk(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzb(i10, zzU(obj, j));
                        break;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzT(obj, i10, i7)) {
                        zzV(i10, unsafe.getObject(obj, j), zzocVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzv(i10, unsafe.getObject(obj, j), zzB(i7));
                        break;
                    }
                    break;
                case 61:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzd(i10, (zzka) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzH(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzi(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzw(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzy(i10, zzz(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzA(i10, zzp(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzC(i10, zzz(obj, j));
                        break;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzT(obj, i10, i7)) {
                        zzocVar.zzq(i10, unsafe.getObject(obj, j), zzB(i7));
                        break;
                    }
                    break;
            }
            i2 = 0;
            i7 += 3;
            i3 = i2;
            i4 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }
}
