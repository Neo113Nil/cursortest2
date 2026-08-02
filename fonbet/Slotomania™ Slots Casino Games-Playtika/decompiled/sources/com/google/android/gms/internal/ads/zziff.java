package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zziff<T> implements zzifu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzigo.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzigh zzm;
    private final zzidc zzn;

    private zziff(int[] iArr, Object[] objArr, int i, int i2, zzifc zzifcVar, boolean z, int[] iArr2, int i3, int i4, zzifi zzifiVar, zzieo zzieoVar, zzigh zzighVar, zzidc zzidcVar, zziex zziexVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzifcVar instanceof zzidr;
        boolean z2 = false;
        if (zzidcVar != null && (zzifcVar instanceof zzidn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzighVar;
        this.zzn = zzidcVar;
        this.zzg = zzifcVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzidr) {
            return ((zzidr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zzigo.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zzigo.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zzigo.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zzigo.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zzigo.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zzigo.zzd(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzigo.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzigo.zzj(obj, j2)) != 0;
            case 2:
                return zzigo.zzf(obj, j2) != 0;
            case 3:
                return zzigo.zzf(obj, j2) != 0;
            case 4:
                return zzigo.zzd(obj, j2) != 0;
            case 5:
                return zzigo.zzf(obj, j2) != 0;
            case 6:
                return zzigo.zzd(obj, j2) != 0;
            case 7:
                return zzigo.zzh(obj, j2);
            case 8:
                Object zzn = zzigo.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzicn) {
                    return !zzicn.zza.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzigo.zzn(obj, j2) != null;
            case 10:
                return !zzicn.zza.equals(zzigo.zzn(obj, j2));
            case 11:
                return zzigo.zzd(obj, j2) != 0;
            case 12:
                return zzigo.zzd(obj, j2) != 0;
            case 13:
                return zzigo.zzd(obj, j2) != 0;
            case 14:
                return zzigo.zzf(obj, j2) != 0;
            case 15:
                return zzigo.zzd(obj, j2) != 0;
            case 16:
                return zzigo.zzf(obj, j2) != 0;
            case 17:
                return zzigo.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zzigo.zze(obj, j, (1 << (zzB >>> 20)) | zzigo.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zzigo.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zzigo.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static final int zzT(byte[] bArr, int i, int i2, zzigu zziguVar, Class cls, zzicb zzicbVar) throws IOException {
        zzigu zziguVar2 = zzigu.DOUBLE;
        switch (zziguVar) {
            case DOUBLE:
                int i3 = i + 8;
                zzicbVar.zzc = Double.valueOf(Double.longBitsToDouble(zzicc.zze(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zzicbVar.zzc = Float.valueOf(Float.intBitsToFloat(zzicc.zzd(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int zzc = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Long.valueOf(zzicbVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = zzicc.zza(bArr, i, zzicbVar);
                zzicbVar.zzc = Integer.valueOf(zzicbVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                zzicbVar.zzc = Long.valueOf(zzicc.zze(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zzicbVar.zzc = Integer.valueOf(zzicc.zzd(bArr, i));
                return i6;
            case BOOL:
                int zzc2 = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Boolean.valueOf(zzicbVar.zzb != 0);
                return zzc2;
            case STRING:
                return zzicc.zzf(bArr, i, zzicbVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzicc.zzh(zzifm.zza().zzb(cls), bArr, i, i2, zzicbVar);
            case BYTES:
                return zzicc.zzg(bArr, i, zzicbVar);
            case SINT32:
                int zza3 = zzicc.zza(bArr, i, zzicbVar);
                zzicbVar.zzc = Integer.valueOf(zzicr.zzM(zzicbVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = zzicc.zzc(bArr, i, zzicbVar);
                zzicbVar.zzc = Long.valueOf(zzicr.zzN(zzicbVar.zzb));
                return zzc3;
        }
    }

    private static final void zzU(int i, Object obj, zzigw zzigwVar) throws IOException {
        if (obj instanceof String) {
            zzigwVar.zzm(i, (String) obj);
        } else {
            zzigwVar.zzn(i, (zzicn) obj);
        }
    }

    static zzigi zzh(Object obj) {
        zzidr zzidrVar = (zzidr) obj;
        zzigi zzigiVar = zzidrVar.zzt;
        if (zzigiVar != zzigi.zza()) {
            return zzigiVar;
        }
        zzigi zzb2 = zzigi.zzb();
        zzidrVar.zzt = zzb2;
        return zzb2;
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
    static zziff zzm(Class cls, zziez zziezVar, zzifi zzifiVar, zzieo zzieoVar, zzigh zzighVar, zzidc zzidcVar, zziex zziexVar) {
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
        Field zzn;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zziezVar instanceof zzifo)) {
            throw null;
        }
        zzifo zzifoVar = (zzifo) zziezVar;
        String zzd = zzifoVar.zzd();
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
        Object[] zze = zzifoVar.zze();
        Class<?> cls2 = zzifoVar.zzb().getClass();
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
            zzifo zzifoVar2 = zzifoVar;
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
                        if (zzifoVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzn2 = (Field) obj;
                            } else {
                                zzn2 = zzn(cls2, (String) obj);
                                zze[i88] = zzn2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzn3 = (Field) obj2;
                            } else {
                                zzn3 = zzn(cls2, (String) obj2);
                                zze[i91] = zzn3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzn3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzn3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzn3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzn4.getType();
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
                        if (zzifoVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                                    zzn = (Field) obj3;
                                } else {
                                    zzn = zzn(cls2, (String) obj3);
                                    zze[i98] = zzn;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
            zzifoVar = zzifoVar2;
            length = i18;
            i7 = i19;
        }
        return new zziff(iArr3, objArr, i2, i4, zzifoVar.zzb(), false, iArr, i5, i64, zzifiVar, zzieoVar, zzighVar, zzidcVar, zziexVar);
    }

    private static Field zzn(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzifu zzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzifu zzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zzifu zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzifu zzifuVar = (zzifu) objArr[i3];
        if (zzifuVar != null) {
            return zzifuVar;
        }
        zzifu zzb2 = zzifm.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzidx zzs(int i) {
        int i2 = i / 3;
        return (zzidx) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzifu zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzifu zzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzigh zzighVar, Object obj3) {
        zzidx zzs;
        int i2 = this.zzc[i];
        Object zzn = zzigo.zzn(obj, zzA(i) & 1048575);
        if (zzn == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        zzieu zze = ((zziev) zzr(i)).zze();
        Iterator it = ((zziew) zzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzighVar.zzh(obj3);
                }
                int zzc = zziev.zzc(zze, entry.getKey(), entry.getValue());
                zzicn zzicnVar = zzicn.zza;
                byte[] bArr = new byte[zzc];
                int i3 = zzicw.zzb;
                zzict zzictVar = new zzict(bArr, 0, zzc);
                try {
                    zziev.zzb(zzictVar, zze, entry.getKey(), entry.getValue());
                    zzighVar.zzd(obj2, i2, zzicj.zza(zzictVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzifu zzifuVar) {
        return zzifuVar.zzl(zzigo.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzifp zzifpVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzigo.zzo(obj, j, zzifpVar.zzn());
        } else if (this.zzi) {
            zzigo.zzo(obj, j, zzifpVar.zzm());
        } else {
            zzigo.zzo(obj, j, zzifpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final Object zza() {
        return ((zzidr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            long j = zzA & 1048575;
            switch (zzC(zzA)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzigo.zzl(obj, j)) == Double.doubleToLongBits(zzigo.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzigo.zzj(obj, j)) == Float.floatToIntBits(zzigo.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzigo.zzf(obj, j) == zzigo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzigo.zzf(obj, j) == zzigo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzigo.zzf(obj, j) == zzigo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzigo.zzh(obj, j) == zzigo.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzigo.zzf(obj, j) == zzigo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzigo.zzd(obj, j) == zzigo.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzigo.zzf(obj, j) == zzigo.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
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
                    zzG = zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j));
                    break;
                case 50:
                    zzG = zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j));
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
                    long zzB = zzB(i) & 1048575;
                    if (zzigo.zzd(obj, zzB) == zzigo.zzd(obj2, zzB) && zzifw.zzG(zzigo.zzn(obj, j), zzigo.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!((zzidr) obj).zzt.equals(((zzidr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzidn) obj).zza.equals(((zzidn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzidr) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzidn) obj).zza.zza.hashCode() : hashCode;
            }
            int zzA = zzA(i3);
            int i5 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzC) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzigo.zzl(obj, j));
                    byte[] bArr = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzigo.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr2 = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr3 = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr4 = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zziee.zzb(zzigo.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzigo.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zzigo.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr5 = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzigo.zzf(obj, j);
                    byte[] bArr6 = zziee.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zzigo.zzn(obj, j);
                    if (zzn2 != null) {
                        i7 = zzn2.hashCode();
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
                    floatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzigo.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zziee.zzb(zzK(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzigo.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zziee.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzigo.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzifw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzifw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzm(obj, j, zzigo.zzl(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzk(obj, j, zzigo.zzj(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzi(obj, j, zzigo.zzh(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zze(obj, j, zzigo.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzigo.zzg(obj, j, zzigo.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzied zziedVar = (zzied) zzigo.zzn(obj, j);
                    zzied zziedVar2 = (zzied) zzigo.zzn(obj2, j);
                    int size = zziedVar.size();
                    int size2 = zziedVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zziedVar.zza()) {
                            zziedVar = zziedVar.zzh(size2 + size);
                        }
                        zziedVar.addAll(zziedVar2);
                    }
                    if (size > 0) {
                        zziedVar2 = zziedVar;
                    }
                    zzigo.zzo(obj, j, zziedVar2);
                    break;
                case 50:
                    int i4 = zzifw.zza;
                    zzigo.zzo(obj, j, zziex.zzb(zzigo.zzn(obj, j), zzigo.zzn(obj2, j)));
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
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzigo.zzo(obj, j, zzigo.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zze(Object obj) {
        int i;
        int zzF;
        int zzF2;
        int zzG;
        int zzF3;
        int zzF4;
        int zzF5;
        int zzc;
        int zzF6;
        int zzD;
        int zzs;
        int size;
        int zzt;
        int zzF7;
        int zzc2;
        int zzF8;
        int zzc3;
        int zzF9;
        int zzF10;
        int zzaT;
        int zzF11;
        int zzF12;
        int i2;
        int zzB;
        int zzF13;
        int zzF14;
        int i3;
        int zzF15;
        int zzF16;
        int zzF17;
        int zzc4;
        int zzF18;
        zziff<T> zziffVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zziffVar.zzc;
            if (i4 >= iArr.length) {
                int zzi = i6 + ((zzidr) obj).zzt.zzi();
                if (!zziffVar.zzh) {
                    return zzi;
                }
                zzigb zzigbVar = ((zzidn) obj).zza.zza;
                int zzc5 = zzigbVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc5; i9++) {
                    Map.Entry zzd = zzigbVar.zzd(i9);
                    i8 += zzidg.zzj((zzidf) ((zzify) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzigbVar.zze()) {
                    i8 += zzidg.zzj((zzidf) entry.getKey(), entry.getValue());
                }
                return zzi + i8;
            }
            int zzA = zziffVar.zzA(i4);
            int zzC = zzC(zzA);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzC <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzA & 1048575;
            if (zzC >= zzidh.DOUBLE_LIST_PACKED.zza()) {
                zzidh.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzC) {
                case 0:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        i6 += zzicw.zzF(i10 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF = zzicw.zzF(i10 << 3);
                        zzF4 = zzF + 4;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 2:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzG(j2);
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 3:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzG(j3);
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 4:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzG(j4);
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 5:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF3 = zzicw.zzF(i10 << 3);
                        zzF4 = zzF3 + 8;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 6:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF = zzicw.zzF(i10 << 3);
                        zzF4 = zzF + 4;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 7:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF4 = zzicw.zzF(i10 << 3) + 1;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 8:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzicn) {
                            zzF5 = zzicw.zzF(i14);
                            zzc = ((zzicn) object).zzb();
                            zzF6 = zzicw.zzF(zzc);
                        } else {
                            zzF5 = zzicw.zzF(i14);
                            zzc = zzigt.zzc((String) object);
                            zzF6 = zzicw.zzF(zzc);
                        }
                        zzF4 = zzF5 + zzF6 + zzc;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 9:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzD = zzifw.zzD(i10, unsafe.getObject(obj2, j), zziffVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzicn zzicnVar = (zzicn) unsafe.getObject(obj2, j);
                        zzF5 = zzicw.zzF(i10 << 3);
                        zzc = zzicnVar.zzb();
                        zzF6 = zzicw.zzF(zzc);
                        zzF4 = zzF5 + zzF6 + zzc;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 11:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzF(i15);
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 12:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzG(j5);
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 13:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF = zzicw.zzF(i10 << 3);
                        zzF4 = zzF + 4;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 14:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzF3 = zzicw.zzF(i10 << 3);
                        zzF4 = zzF3 + 8;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 15:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzF((i16 >> 31) ^ (i16 + i16));
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 16:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzF2 = zzicw.zzF(i10 << 3);
                        zzG = zzicw.zzG((j6 >> 63) ^ (j6 + j6));
                        zzF4 = zzF2 + zzG;
                        i6 += zzF4;
                    }
                    zziffVar = this;
                    break;
                case 17:
                    if (zziffVar.zzM(obj2, i4, i7, i5, i)) {
                        zzD = zzifw.zzE(i10, (zzifc) unsafe.getObject(obj2, j), zziffVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzD = zzifw.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 19:
                    zzD = zzifw.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzifw.zza;
                    if (list.size() != 0) {
                        zzs = zzifw.zzs(list) + (list.size() * zzicw.zzF(i10 << 3));
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzifw.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzt = zzifw.zzt(list2);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzifw.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzt = zzifw.zzw(list3);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 23:
                    zzD = zzifw.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 24:
                    zzD = zzifw.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzifw.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzD = size2 * (zzicw.zzF(i10 << 3) + 1);
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzifw.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzs = zzicw.zzF(i10 << 3) * size3;
                        if (list5 instanceof zzien) {
                            zzien zzienVar = (zzien) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc6 = zzienVar.zzc();
                                if (zzc6 instanceof zzicn) {
                                    zzc3 = ((zzicn) zzc6).zzb();
                                    zzF9 = zzicw.zzF(zzc3);
                                } else {
                                    zzc3 = zzigt.zzc((String) zzc6);
                                    zzF9 = zzicw.zzF(zzc3);
                                }
                                zzs += zzF9 + zzc3;
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzicn) {
                                    zzc2 = ((zzicn) obj3).zzb();
                                    zzF8 = zzicw.zzF(zzc2);
                                } else {
                                    zzc2 = zzigt.zzc((String) obj3);
                                    zzF8 = zzicw.zzF(zzc2);
                                }
                                zzs += zzF8 + zzc2;
                            }
                        }
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzifu zzq = zziffVar.zzq(i4);
                    int i24 = zzifw.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzF10 = 0;
                    } else {
                        zzF10 = zzicw.zzF(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zziem) {
                                zzaT = ((zziem) obj4).zzb();
                                zzF11 = zzicw.zzF(zzaT);
                            } else {
                                zzaT = ((zzibw) obj4).zzaT(zzq);
                                zzF11 = zzicw.zzF(zzaT);
                            }
                            zzF10 += zzF11 + zzaT;
                        }
                    }
                    i6 += zzF10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzifw.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzF12 = 0;
                    } else {
                        zzF12 = size5 * zzicw.zzF(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzb2 = ((zzicn) list7.get(i27)).zzb();
                            zzF12 += zzicw.zzF(zzb2) + zzb2;
                        }
                    }
                    i6 += zzF12;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzifw.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzt = zzifw.zzx(list8);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzifw.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzt = zzifw.zzv(list9);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 31:
                    zzD = zzifw.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 32:
                    zzD = zzifw.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzifw.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzt = zzifw.zzy(list10);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzifw.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzt = zzifw.zzu(list11);
                        zzF7 = zzicw.zzF(i10 << 3);
                        i2 = size * zzF7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 35:
                    zzB = zzifw.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB = zzifw.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB = zzifw.zzs((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB = zzifw.zzt((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB = zzifw.zzw((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB = zzifw.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB = zzifw.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzifw.zza;
                    zzB = list12.size();
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB = zzifw.zzx((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB = zzifw.zzv((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB = zzifw.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB = zzifw.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB = zzifw.zzy((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB = zzifw.zzu((List) unsafe.getObject(obj2, j));
                    if (zzB > 0) {
                        zzF13 = zzicw.zzF(i10 << 3);
                        zzF14 = zzicw.zzF(zzB);
                        zzF12 = zzF13 + zzF14 + zzB;
                        i6 += zzF12;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzifu zzq2 = zziffVar.zzq(i4);
                    int i33 = zzifw.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzifw.zzE(i10, (zzifc) list13.get(i34), zzq2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    zziew zziewVar = (zziew) unsafe.getObject(obj2, j);
                    zziev zzievVar = (zziev) zziffVar.zzr(i4);
                    if (!zziewVar.isEmpty()) {
                        zzs = 0;
                        for (Map.Entry entry2 : zziewVar.entrySet()) {
                            zzs += zzievVar.zzd(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case 51:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF15 = zzicw.zzF(i10 << 3);
                        zzD = zzF15 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF16 = zzicw.zzF(i10 << 3);
                        zzD = zzF16 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        long zzJ = zzJ(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzG(zzJ);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        long zzJ2 = zzJ(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzG(zzJ2);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        long zzI = zzI(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzG(zzI);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case AD_VISIBILITY_VALUE:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF15 = zzicw.zzF(i10 << 3);
                        zzD = zzF15 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF16 = zzicw.zzF(i10 << 3);
                        zzD = zzF16 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzD = zzicw.zzF(i10 << 3) + 1;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzicn) {
                            zzF17 = zzicw.zzF(i35);
                            zzc4 = ((zzicn) object2).zzb();
                            zzF18 = zzicw.zzF(zzc4);
                        } else {
                            zzF17 = zzicw.zzF(i35);
                            zzc4 = zzigt.zzc((String) object2);
                            zzF18 = zzicw.zzF(zzc4);
                        }
                        zzD = zzF17 + zzF18 + zzc4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzD = zzifw.zzD(i10, unsafe.getObject(obj2, j), zziffVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzicn zzicnVar2 = (zzicn) unsafe.getObject(obj2, j);
                        zzF17 = zzicw.zzF(i10 << 3);
                        zzc4 = zzicnVar2.zzb();
                        zzF18 = zzicw.zzF(zzc4);
                        zzD = zzF17 + zzF18 + zzc4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        int zzI2 = zzI(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzF(zzI2);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        long zzI3 = zzI(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzG(zzI3);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF16 = zzicw.zzF(i10 << 3);
                        zzD = zzF16 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzF15 = zzicw.zzF(i10 << 3);
                        zzD = zzF15 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        int zzI4 = zzI(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzF((zzI4 >> 31) ^ (zzI4 + zzI4));
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        long zzJ3 = zzJ(obj2, j);
                        zzt = zzicw.zzF(i10 << 3);
                        i2 = zzicw.zzG((zzJ3 >> 63) ^ (zzJ3 + zzJ3));
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zziffVar.zzP(obj2, i10, i4)) {
                        zzD = zzifw.zzE(i10, (zzifc) unsafe.getObject(obj2, j), zziffVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzifu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzigw zzigwVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        boolean z;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        zziff<T> zziffVar = this;
        if (zziffVar.zzh) {
            zzidg zzidgVar = ((zzidn) obj).zza;
            if (!zzidgVar.zza.isEmpty()) {
                Iterator zzc = zzidgVar.zzc();
                entry = (Map.Entry) zzc.next();
                it = zzc;
                iArr = zziffVar.zzc;
                Unsafe unsafe = zzb;
                int i6 = 1048575;
                int i7 = 1048575;
                i = 0;
                int i8 = 0;
                while (i < iArr.length) {
                    int zzA = zziffVar.zzA(i);
                    int zzC = zzC(zzA);
                    int i9 = iArr[i];
                    if (zzC <= 17) {
                        int i10 = iArr[i + 2];
                        z = true;
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        int i12 = 1 << (i10 >>> 20);
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = i12;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzidc zzidcVar = zziffVar.zzn;
                            i5 = i6;
                            if (((zzido) entry2.getKey()).zza <= i9) {
                                zzidcVar.zzb(zzigwVar, entry2);
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                    i6 = i5;
                                } else {
                                    i6 = i5;
                                    entry2 = null;
                                }
                            }
                        } else {
                            i5 = i6;
                        }
                    }
                    long j = zzA & i5;
                    switch (zzC) {
                        case 0:
                            if (!zziffVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzigwVar.zzf(i9, zzigo.zzl(obj, j));
                                break;
                            }
                        case 1:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zze(i9, zzigo.zzj(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 2:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzc(i9, unsafe.getLong(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 3:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzh(i9, unsafe.getLong(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 4:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzi(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 5:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzj(i9, unsafe.getLong(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 6:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzk(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 7:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzl(i9, zzigo.zzh(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 8:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzU(i9, unsafe.getObject(obj, j), zzigwVar);
                            }
                            zziffVar = this;
                            break;
                        case 9:
                            if (!zziffVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzigwVar.zzr(i9, unsafe.getObject(obj, j), zziffVar.zzq(i));
                                break;
                            }
                        case 10:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzn(i9, (zzicn) unsafe.getObject(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 11:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzo(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 12:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzg(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 13:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzb(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 14:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzd(i9, unsafe.getLong(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 15:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzp(i9, unsafe.getInt(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 16:
                            if (zziffVar.zzM(obj, i, i2, i3, i4)) {
                                zzigwVar.zzq(i9, unsafe.getLong(obj, j));
                            }
                            zziffVar = this;
                            break;
                        case 17:
                            if (!zziffVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzigwVar.zzs(i9, unsafe.getObject(obj, j), zziffVar.zzq(i));
                                break;
                            }
                        case 18:
                            zzifw.zza(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 19:
                            zzifw.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 20:
                            zzifw.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 21:
                            zzifw.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 22:
                            zzifw.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 23:
                            zzifw.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 24:
                            zzifw.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 25:
                            zzifw.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 26:
                            zzifw.zzo(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar);
                            break;
                        case 27:
                            zzifw.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, zziffVar.zzq(i));
                            break;
                        case 28:
                            zzifw.zzp(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar);
                            break;
                        case 29:
                            zzifw.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 30:
                            zzifw.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 31:
                            zzifw.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 32:
                            zzifw.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 33:
                            zzifw.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 34:
                            zzifw.zze(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, false);
                            break;
                        case 35:
                            zzifw.zza(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 36:
                            zzifw.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 37:
                            zzifw.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 38:
                            zzifw.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 39:
                            zzifw.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 40:
                            zzifw.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 41:
                            zzifw.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 42:
                            zzifw.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 43:
                            zzifw.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 44:
                            zzifw.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 45:
                            zzifw.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 46:
                            zzifw.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 47:
                            zzifw.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 48:
                            zzifw.zze(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, z);
                            break;
                        case 49:
                            zzifw.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzigwVar, zziffVar.zzq(i));
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzigwVar.zzM(i9, ((zziev) zziffVar.zzr(i)).zze(), (zziew) object);
                            }
                            break;
                        case 51:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzf(i9, zzG(obj, j));
                            }
                            break;
                        case 52:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zze(i9, zzH(obj, j));
                            }
                            break;
                        case 53:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzc(i9, zzJ(obj, j));
                            }
                            break;
                        case 54:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzh(i9, zzJ(obj, j));
                            }
                            break;
                        case 55:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzi(i9, zzI(obj, j));
                            }
                            break;
                        case AD_VISIBILITY_VALUE:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzj(i9, zzJ(obj, j));
                            }
                            break;
                        case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzk(i9, zzI(obj, j));
                            }
                            break;
                        case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzl(i9, zzK(obj, j));
                            }
                            break;
                        case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzU(i9, unsafe.getObject(obj, j), zzigwVar);
                            }
                            break;
                        case 60:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzr(i9, unsafe.getObject(obj, j), zziffVar.zzq(i));
                            }
                            break;
                        case 61:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzn(i9, (zzicn) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzo(i9, zzI(obj, j));
                            }
                            break;
                        case 63:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzg(i9, zzI(obj, j));
                            }
                            break;
                        case 64:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzb(i9, zzI(obj, j));
                            }
                            break;
                        case 65:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzd(i9, zzJ(obj, j));
                            }
                            break;
                        case 66:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzp(i9, zzI(obj, j));
                            }
                            break;
                        case 67:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzq(i9, zzJ(obj, j));
                            }
                            break;
                        case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                            if (zziffVar.zzP(obj, i9, i)) {
                                zzigwVar.zzs(i9, unsafe.getObject(obj, j), zziffVar.zzq(i));
                            }
                            break;
                    }
                    i += 3;
                    i8 = i3;
                    i6 = i5;
                    i7 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    zziffVar.zzn.zzb(zzigwVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzidr) obj).zzt.zzg(zzigwVar);
            }
        }
        entry = null;
        it = null;
        iArr = zziffVar.zzc;
        Unsafe unsafe2 = zzb;
        int i62 = 1048575;
        int i72 = 1048575;
        i = 0;
        int i82 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzidr) obj).zzt.zzg(zzigwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x05a8 A[LOOP:1: B:36:0x05a4->B:38:0x05a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x057e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0570 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzifu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzifp zzifpVar, zzidb zzidbVar) throws IOException {
        zziff<T> zziffVar;
        Object obj2;
        Throwable th;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        zziff<T> zziffVar2;
        List zza2;
        zzidbVar.getClass();
        zzF(obj);
        zzigh zzighVar = this.zzm;
        Object obj6 = null;
        while (true) {
            try {
                int zzb2 = zzifpVar.zzb();
                int zzR = zzR(zzb2);
                if (zzR >= 0) {
                    obj5 = obj;
                    zziffVar2 = this;
                    try {
                        int zzA = zzA(zzR);
                        try {
                        } catch (zzief unused) {
                            zziffVar = zziffVar2;
                            obj2 = obj5;
                        }
                        switch (zzC(zzA)) {
                            case 0:
                                obj2 = obj5;
                                zzigo.zzm(obj2, zzA & 1048575, zzifpVar.zze());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 1:
                                obj2 = obj5;
                                zzigo.zzk(obj2, zzA & 1048575, zzifpVar.zzf());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 2:
                                obj2 = obj5;
                                zzigo.zzg(obj2, zzA & 1048575, zzifpVar.zzh());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 3:
                                obj2 = obj5;
                                zzigo.zzg(obj2, zzA & 1048575, zzifpVar.zzg());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 4:
                                obj2 = obj5;
                                zzigo.zze(obj2, zzA & 1048575, zzifpVar.zzi());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 5:
                                obj2 = obj5;
                                zzigo.zzg(obj2, zzA & 1048575, zzifpVar.zzj());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 6:
                                obj2 = obj5;
                                zzigo.zze(obj2, zzA & 1048575, zzifpVar.zzk());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 7:
                                obj2 = obj5;
                                zzigo.zzi(obj2, zzA & 1048575, zzifpVar.zzl());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 8:
                                obj2 = obj5;
                                zzz(obj2, zzA, zzifpVar);
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 9:
                                obj2 = obj5;
                                zzifc zzifcVar = (zzifc) zzt(obj2, zzR);
                                zzifpVar.zzo(zzifcVar, zzq(zzR), zzidbVar);
                                zzu(obj2, zzR, zzifcVar);
                                obj = obj2;
                                break;
                            case 10:
                                obj2 = obj5;
                                zzigo.zzo(obj2, zzA & 1048575, zzifpVar.zzq());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 11:
                                obj2 = obj5;
                                zzigo.zze(obj2, zzA & 1048575, zzifpVar.zzr());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 12:
                                obj2 = obj5;
                                int zzs = zzifpVar.zzs();
                                zzidx zzs2 = zzs(zzR);
                                if (zzs2 != null && !zzs2.zza(zzs)) {
                                    obj6 = zzifw.zzK(obj2, zzb2, zzs, obj6, zzighVar);
                                    obj = obj2;
                                    break;
                                }
                                zzigo.zze(obj2, zzA & 1048575, zzs);
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                zzigo.zze(obj2, zzA & 1048575, zzifpVar.zzt());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 14:
                                obj2 = obj5;
                                zzigo.zzg(obj2, zzA & 1048575, zzifpVar.zzu());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 15:
                                obj2 = obj5;
                                zzigo.zze(obj2, zzA & 1048575, zzifpVar.zzv());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 16:
                                obj2 = obj5;
                                zzigo.zzg(obj2, zzA & 1048575, zzifpVar.zzw());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 17:
                                obj2 = obj5;
                                zzifc zzifcVar2 = (zzifc) zzt(obj2, zzR);
                                zzifpVar.zzp(zzifcVar2, zzq(zzR), zzidbVar);
                                zzu(obj2, zzR, zzifcVar2);
                                obj = obj2;
                                break;
                            case 18:
                                obj2 = obj5;
                                zzifpVar.zzx(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 19:
                                obj2 = obj5;
                                zzifpVar.zzy(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 20:
                                obj2 = obj5;
                                zzifpVar.zzA(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 21:
                                obj2 = obj5;
                                zzifpVar.zzz(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 22:
                                obj2 = obj5;
                                zzifpVar.zzB(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 23:
                                obj2 = obj5;
                                zzifpVar.zzC(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 24:
                                obj2 = obj5;
                                zzifpVar.zzD(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 25:
                                obj2 = obj5;
                                zzifpVar.zzE(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 26:
                                obj2 = obj5;
                                if (zzD(zzA)) {
                                    ((zzics) zzifpVar).zzF(zzieo.zza(obj2, zzA & 1048575), true);
                                } else {
                                    ((zzics) zzifpVar).zzF(zzieo.zza(obj2, zzA & 1048575), false);
                                }
                                obj = obj2;
                                break;
                            case 27:
                                obj2 = obj5;
                                zzifpVar.zzG(zzieo.zza(obj2, zzA & 1048575), zzq(zzR), zzidbVar);
                                obj = obj2;
                                break;
                            case 28:
                                obj2 = obj5;
                                zzifpVar.zzI(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 29:
                                obj2 = obj5;
                                zzifpVar.zzJ(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 30:
                                List zza3 = zzieo.zza(obj5, zzA & 1048575);
                                zzifpVar.zzK(zza3);
                                obj6 = zzifw.zzJ(obj5, zzb2, zza3, zzs(zzR), obj6, zzighVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                zzifpVar.zzL(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 32:
                                obj2 = obj5;
                                zzifpVar.zzM(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 33:
                                obj2 = obj5;
                                zzifpVar.zzN(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 34:
                                obj2 = obj5;
                                zzifpVar.zzO(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 35:
                                obj2 = obj5;
                                zzifpVar.zzx(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 36:
                                obj2 = obj5;
                                zzifpVar.zzy(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 37:
                                obj2 = obj5;
                                zzifpVar.zzA(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 38:
                                obj2 = obj5;
                                zzifpVar.zzz(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 39:
                                obj2 = obj5;
                                zzifpVar.zzB(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 40:
                                obj2 = obj5;
                                zzifpVar.zzC(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 41:
                                obj2 = obj5;
                                zzifpVar.zzD(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 42:
                                obj2 = obj5;
                                zzifpVar.zzE(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 43:
                                obj2 = obj5;
                                zzifpVar.zzJ(zzieo.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 44:
                                try {
                                    zza2 = zzieo.zza(obj5, zzA & 1048575);
                                    zzifpVar.zzK(zza2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj5;
                                }
                                try {
                                    obj6 = zzifw.zzJ(obj5, zzb2, zza2, zzs(zzR), obj6, zzighVar);
                                    obj2 = obj5;
                                } catch (zzief unused2) {
                                    obj2 = obj5;
                                    zziffVar = zziffVar2;
                                    if (obj6 == null) {
                                    }
                                    if (!zzighVar.zzk(obj6, zzifpVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    th = th;
                                    zziffVar = zziffVar2;
                                    i = zziffVar.zzk;
                                    obj3 = obj6;
                                    while (i < zziffVar.zzl) {
                                    }
                                    zzigh zzighVar2 = zzighVar;
                                    if (obj3 != null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzifpVar.zzL(zzieo.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 46:
                                zzifpVar.zzM(zzieo.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 47:
                                zzifpVar.zzN(zzieo.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 48:
                                zzifpVar.zzO(zzieo.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 49:
                                zzifpVar.zzH(zzieo.zza(obj5, zzA & 1048575), zzq(zzR), zzidbVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 50:
                                Object zzr = zzr(zzR);
                                long zzA2 = zzA(zzR) & 1048575;
                                Object zzn = zzigo.zzn(obj5, zzA2);
                                if (zzn == null) {
                                    zzn = zziew.zza().zzc();
                                    zzigo.zzo(obj5, zzA2, zzn);
                                } else if (zziex.zza(zzn)) {
                                    Object zzc = zziew.zza().zzc();
                                    zziex.zzb(zzc, zzn);
                                    zzigo.zzo(obj5, zzA2, zzc);
                                    zzn = zzc;
                                }
                                zzifpVar.zzP((zziew) zzn, ((zziev) zzr).zze(), zzidbVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 51:
                                zzigo.zzo(obj5, zzA & 1048575, Double.valueOf(zzifpVar.zze()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 52:
                                zzigo.zzo(obj5, zzA & 1048575, Float.valueOf(zzifpVar.zzf()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 53:
                                zzigo.zzo(obj5, zzA & 1048575, Long.valueOf(zzifpVar.zzh()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 54:
                                zzigo.zzo(obj5, zzA & 1048575, Long.valueOf(zzifpVar.zzg()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 55:
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzifpVar.zzi()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case AD_VISIBILITY_VALUE:
                                zzigo.zzo(obj5, zzA & 1048575, Long.valueOf(zzifpVar.zzj()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzifpVar.zzk()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                zzigo.zzo(obj5, zzA & 1048575, Boolean.valueOf(zzifpVar.zzl()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                zzz(obj5, zzA, zzifpVar);
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 60:
                                zzifc zzifcVar3 = (zzifc) zzv(obj5, zzb2, zzR);
                                zzifpVar.zzo(zzifcVar3, zzq(zzR), zzidbVar);
                                zzw(obj5, zzb2, zzR, zzifcVar3);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 61:
                                zzigo.zzo(obj5, zzA & 1048575, zzifpVar.zzq());
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 62:
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzifpVar.zzr()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 63:
                                int zzs3 = zzifpVar.zzs();
                                zzidx zzs4 = zzs(zzR);
                                if (zzs4 != null && !zzs4.zza(zzs3)) {
                                    obj6 = zzifw.zzK(obj5, zzb2, zzs3, obj6, zzighVar);
                                    obj = obj5;
                                    break;
                                }
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzs3));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 64:
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzifpVar.zzt()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 65:
                                zzigo.zzo(obj5, zzA & 1048575, Long.valueOf(zzifpVar.zzu()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 66:
                                zzigo.zzo(obj5, zzA & 1048575, Integer.valueOf(zzifpVar.zzv()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 67:
                                zzigo.zzo(obj5, zzA & 1048575, Long.valueOf(zzifpVar.zzw()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                                try {
                                    zzifc zzifcVar4 = (zzifc) zzv(obj5, zzb2, zzR);
                                    zzifpVar.zzp(zzifcVar4, zzq(zzR), zzidbVar);
                                    zzw(obj5, zzb2, zzR, zzifcVar4);
                                    obj2 = obj5;
                                    obj = obj2;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    zziffVar = zziffVar2;
                                    obj2 = obj5;
                                    i = zziffVar.zzk;
                                    obj3 = obj6;
                                    while (i < zziffVar.zzl) {
                                        zzigh zzighVar3 = zzighVar;
                                        obj3 = zziffVar.zzx(obj2, zziffVar.zzj[i], obj3, zzighVar3, obj2);
                                        i++;
                                        zziffVar = this;
                                        zzighVar = zzighVar3;
                                    }
                                    zzigh zzighVar22 = zzighVar;
                                    if (obj3 != null) {
                                        throw th;
                                    }
                                    zzighVar22.zzi(obj2, obj3);
                                    throw th;
                                }
                            default:
                                obj2 = obj5;
                                if (obj6 == null) {
                                    try {
                                        try {
                                            obj6 = zzighVar.zzh(obj2);
                                        } catch (zzief unused3) {
                                            zziffVar = zziffVar2;
                                            if (obj6 == null) {
                                                try {
                                                    obj6 = zzighVar.zzh(obj2);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th = th;
                                                    i = zziffVar.zzk;
                                                    obj3 = obj6;
                                                    while (i < zziffVar.zzl) {
                                                    }
                                                    zzigh zzighVar222 = zzighVar;
                                                    if (obj3 != null) {
                                                    }
                                                }
                                            }
                                            if (!zzighVar.zzk(obj6, zzifpVar, 0)) {
                                                obj4 = obj6;
                                                for (int i2 = zziffVar.zzk; i2 < zziffVar.zzl; i2++) {
                                                    zzigh zzighVar4 = zzighVar;
                                                    obj4 = zziffVar.zzx(obj2, zziffVar.zzj[i2], obj4, zzighVar4, obj2);
                                                    zzighVar = zzighVar4;
                                                }
                                                if (obj4 == null) {
                                                }
                                            }
                                            obj = obj2;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        zziffVar = zziffVar2;
                                        i = zziffVar.zzk;
                                        obj3 = obj6;
                                        while (i < zziffVar.zzl) {
                                        }
                                        zzigh zzighVar2222 = zzighVar;
                                        if (obj3 != null) {
                                        }
                                    }
                                }
                                try {
                                    if (zzighVar.zzk(obj6, zzifpVar, 0)) {
                                        obj = obj2;
                                    } else {
                                        obj4 = obj6;
                                        for (int i3 = zziffVar2.zzk; i3 < zziffVar2.zzl; i3++) {
                                            zzigh zzighVar5 = zzighVar;
                                            obj4 = zziffVar2.zzx(obj2, zziffVar2.zzj[i3], obj4, zzighVar5, obj2);
                                            zzighVar = zzighVar5;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    zziffVar = zziffVar2;
                                    th = th;
                                    i = zziffVar.zzk;
                                    obj3 = obj6;
                                    while (i < zziffVar.zzl) {
                                    }
                                    zzigh zzighVar22222 = zzighVar;
                                    if (obj3 != null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zziffVar = zziffVar2;
                        obj2 = obj5;
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj4 = obj6;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzigh zzighVar6 = zzighVar;
                        obj4 = zzx(obj, this.zzj[i4], obj4, zzighVar6, obj);
                        zzighVar = zzighVar6;
                    }
                    obj2 = obj;
                } else {
                    zziffVar = this;
                    try {
                        if ((!zziffVar.zzh ? null : zzidbVar.zzc(zziffVar.zzg, zzb2)) != null) {
                            obj5 = obj;
                            zziffVar2 = zziffVar;
                            throw null;
                        }
                        if (obj6 == null) {
                            try {
                                obj6 = zzighVar.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i = zziffVar.zzk;
                                obj3 = obj6;
                                while (i < zziffVar.zzl) {
                                }
                                zzigh zzighVar222222 = zzighVar;
                                if (obj3 != null) {
                                }
                            }
                        }
                        try {
                            if (zzighVar.zzk(obj6, zzifpVar, 0)) {
                                obj5 = obj;
                                obj = obj5;
                            } else {
                                int i5 = zziffVar.zzk;
                                obj4 = obj6;
                                while (i5 < zziffVar.zzl) {
                                    zzigh zzighVar7 = zzighVar;
                                    Object obj7 = obj;
                                    obj4 = zziffVar.zzx(obj7, zziffVar.zzj[i5], obj4, zzighVar7, obj);
                                    zzighVar = zzighVar7;
                                    i5++;
                                    obj = obj7;
                                }
                                obj2 = obj;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj5 = obj;
                            zziffVar2 = zziffVar;
                            th = th;
                            zziffVar = zziffVar2;
                            obj2 = obj5;
                            i = zziffVar.zzk;
                            obj3 = obj6;
                            while (i < zziffVar.zzl) {
                            }
                            zzigh zzighVar2222222 = zzighVar;
                            if (obj3 != null) {
                            }
                        }
                    } catch (Throwable th11) {
                        obj5 = obj;
                        th = th11;
                        obj2 = obj5;
                        i = zziffVar.zzk;
                        obj3 = obj6;
                        while (i < zziffVar.zzl) {
                        }
                        zzigh zzighVar22222222 = zzighVar;
                        if (obj3 != null) {
                        }
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                zziffVar = this;
                obj2 = obj;
            }
        }
        if (obj4 == null) {
            zzighVar.zzi(obj2, obj4);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zzicb r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziff.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzicb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzicb zzicbVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzicbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzidr) {
                zzidr zzidrVar = (zzidr) obj;
                zzidrVar.zzbq();
                zzidrVar.zzbb();
                zzidrVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzA = zzA(i);
                int i2 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j = i2;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
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
                                ((zzied) zzigo.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zziew) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzP(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzA = zzA(i7);
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
            if ((268435456 & zzA) != 0 && !zzM(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzP(obj, i8, i2) && !zzy(obj, zzA, zzq(i2))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            zziew zziewVar = (zziew) zzigo.zzn(obj, zzA & 1048575);
                            if (!zziewVar.isEmpty() && ((zziev) zzr(i2)).zze().zzc.zza() == zzigv.MESSAGE) {
                                zzifu zzifuVar = null;
                                for (Object obj2 : zziewVar.values()) {
                                    if (zzifuVar == null) {
                                        zzifuVar = zzifm.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzifuVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzigo.zzn(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzifu zzq = zzq(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzq.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzM(obj, i2, i, i3, i11) && !zzy(obj, zzA, zzq(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzidn) obj).zza.zze();
    }
}
