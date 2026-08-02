package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import GZ.e;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i11, int i12, zzfm zzfmVar, boolean z11, int[] iArr2, int i13, int i14, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        boolean z12 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i11) {
        if (zzI(obj2, i11)) {
            int zzs = zzs(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = zzs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzge zzv = zzv(i11);
            if (!zzI(obj, i11)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j11, zze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzD(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzM(obj2, i12, i11)) {
            int zzs = zzs(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = zzs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzge zzv = zzv(i11);
            if (!zzM(obj, i12, i11)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j11, zze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzE(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j11, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i11) {
        int zzp = zzp(i11);
        long j11 = 1048575 & zzp;
        if (j11 == 1048575) {
            return;
        }
        zzgz.zzq(obj, j11, (1 << (zzp >>> 20)) | zzgz.zzc(obj, j11));
    }

    private final void zzE(Object obj, int i11, int i12) {
        zzgz.zzq(obj, zzp(i12) & 1048575, i11);
    }

    private final void zzF(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzD(obj, i11);
    }

    private final void zzG(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzs(i12) & 1048575, obj2);
        zzE(obj, i11, i12);
    }

    private final boolean zzH(Object obj, Object obj2, int i11) {
        return zzI(obj, i11) == zzI(obj2, i11);
    }

    private final boolean zzI(Object obj, int i11) {
        int zzp = zzp(i11);
        long j11 = zzp & 1048575;
        if (j11 != 1048575) {
            return (zzgz.zzc(obj, j11) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i11);
        long j12 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j12)) != 0;
            case 2:
                return zzgz.zzd(obj, j12) != 0;
            case 3:
                return zzgz.zzd(obj, j12) != 0;
            case 4:
                return zzgz.zzc(obj, j12) != 0;
            case 5:
                return zzgz.zzd(obj, j12) != 0;
            case 6:
                return zzgz.zzc(obj, j12) != 0;
            case 7:
                return zzgz.zzw(obj, j12);
            case 8:
                Object zzf = zzgz.zzf(obj, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzdf) {
                    return !zzdf.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j12) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j12));
            case 11:
                return zzgz.zzc(obj, j12) != 0;
            case 12:
                return zzgz.zzc(obj, j12) != 0;
            case 13:
                return zzgz.zzc(obj, j12) != 0;
            case 14:
                return zzgz.zzd(obj, j12) != 0;
            case 15:
                return zzgz.zzc(obj, j12) != 0;
            case 16:
                return zzgz.zzd(obj, j12) != 0;
            case 17:
                return zzgz.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? zzI(obj, i11) : (i13 & i14) != 0;
    }

    private static boolean zzK(Object obj, int i11, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i11 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i11, int i12) {
        return zzgz.zzc(obj, (long) (zzp(i12) & 1048575)) == i11;
    }

    private static boolean zzN(Object obj, long j11) {
        return ((Boolean) zzgz.zzf(obj, j11)).booleanValue();
    }

    private static final void zzO(int i11, Object obj, zzhh zzhhVar) throws IOException {
        if (obj instanceof String) {
            zzhhVar.zzG(i11, (String) obj);
        } else {
            zzhhVar.zzd(i11, (zzdf) obj);
        }
    }

    static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzf = zzgt.zzf();
        zzehVar.zzc = zzf;
        return zzf;
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
    static zzfp zzl(Class cls, zzfj zzfjVar, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        int i11;
        int charAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
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
        int i29;
        int i31;
        int i32;
        String str;
        int objectFieldOffset;
        char c11;
        int i33;
        int i34;
        int i35;
        int i36;
        Field zzz;
        char charAt10;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i43;
        char charAt11;
        int i44;
        char charAt12;
        int i45;
        char charAt13;
        int i46;
        char charAt14;
        if (!(zzfjVar instanceof zzfw)) {
            throw null;
        }
        zzfw zzfwVar = (zzfw) zzfjVar;
        String zzd = zzfwVar.zzd();
        int length = zzd.length();
        char c12 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i47 = 1;
            while (true) {
                i11 = i47 + 1;
                if (zzd.charAt(i47) < 55296) {
                    break;
                }
                i47 = i11;
            }
        } else {
            i11 = 1;
        }
        int i48 = i11 + 1;
        int charAt15 = zzd.charAt(i11);
        if (charAt15 >= 55296) {
            int i49 = charAt15 & 8191;
            int i51 = 13;
            while (true) {
                i46 = i48 + 1;
                charAt14 = zzd.charAt(i48);
                if (charAt14 < 55296) {
                    break;
                }
                i49 |= (charAt14 & 8191) << i51;
                i51 += 13;
                i48 = i46;
            }
            charAt15 = i49 | (charAt14 << i51);
            i48 = i46;
        }
        if (charAt15 == 0) {
            i13 = 0;
            i16 = 0;
            charAt = 0;
            i12 = 0;
            i14 = 0;
            i15 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i52 = i48 + 1;
            int charAt16 = zzd.charAt(i48);
            if (charAt16 >= 55296) {
                int i53 = charAt16 & 8191;
                int i54 = 13;
                while (true) {
                    i26 = i52 + 1;
                    charAt9 = zzd.charAt(i52);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i53 |= (charAt9 & 8191) << i54;
                    i54 += 13;
                    i52 = i26;
                }
                charAt16 = i53 | (charAt9 << i54);
                i52 = i26;
            }
            int i55 = i52 + 1;
            int charAt17 = zzd.charAt(i52);
            if (charAt17 >= 55296) {
                int i56 = charAt17 & 8191;
                int i57 = 13;
                while (true) {
                    i25 = i55 + 1;
                    charAt8 = zzd.charAt(i55);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i56 |= (charAt8 & 8191) << i57;
                    i57 += 13;
                    i55 = i25;
                }
                charAt17 = i56 | (charAt8 << i57);
                i55 = i25;
            }
            int i58 = i55 + 1;
            int charAt18 = zzd.charAt(i55);
            if (charAt18 >= 55296) {
                int i59 = charAt18 & 8191;
                int i61 = 13;
                while (true) {
                    i24 = i58 + 1;
                    charAt7 = zzd.charAt(i58);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i59 |= (charAt7 & 8191) << i61;
                    i61 += 13;
                    i58 = i24;
                }
                charAt18 = i59 | (charAt7 << i61);
                i58 = i24;
            }
            int i62 = i58 + 1;
            int charAt19 = zzd.charAt(i58);
            if (charAt19 >= 55296) {
                int i63 = charAt19 & 8191;
                int i64 = 13;
                while (true) {
                    i23 = i62 + 1;
                    charAt6 = zzd.charAt(i62);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i63 |= (charAt6 & 8191) << i64;
                    i64 += 13;
                    i62 = i23;
                }
                charAt19 = i63 | (charAt6 << i64);
                i62 = i23;
            }
            int i65 = i62 + 1;
            charAt = zzd.charAt(i62);
            if (charAt >= 55296) {
                int i66 = charAt & 8191;
                int i67 = 13;
                while (true) {
                    i22 = i65 + 1;
                    charAt5 = zzd.charAt(i65);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i66 |= (charAt5 & 8191) << i67;
                    i67 += 13;
                    i65 = i22;
                }
                charAt = i66 | (charAt5 << i67);
                i65 = i22;
            }
            int i68 = i65 + 1;
            int charAt20 = zzd.charAt(i65);
            if (charAt20 >= 55296) {
                int i69 = charAt20 & 8191;
                int i71 = 13;
                while (true) {
                    i21 = i68 + 1;
                    charAt4 = zzd.charAt(i68);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i69 |= (charAt4 & 8191) << i71;
                    i71 += 13;
                    i68 = i21;
                }
                charAt20 = i69 | (charAt4 << i71);
                i68 = i21;
            }
            int i72 = i68 + 1;
            int charAt21 = zzd.charAt(i68);
            if (charAt21 >= 55296) {
                int i73 = charAt21 & 8191;
                int i74 = 13;
                while (true) {
                    i19 = i72 + 1;
                    charAt3 = zzd.charAt(i72);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i73 |= (charAt3 & 8191) << i74;
                    i74 += 13;
                    i72 = i19;
                }
                charAt21 = i73 | (charAt3 << i74);
                i72 = i19;
            }
            int i75 = i72 + 1;
            int charAt22 = zzd.charAt(i72);
            if (charAt22 >= 55296) {
                int i76 = charAt22 & 8191;
                int i77 = 13;
                while (true) {
                    i18 = i75 + 1;
                    charAt2 = zzd.charAt(i75);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i76 |= (charAt2 & 8191) << i77;
                    i77 += 13;
                    i75 = i18;
                }
                charAt22 = i76 | (charAt2 << i77);
                i75 = i18;
            }
            int i78 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i79 = charAt20;
            i12 = charAt18;
            i13 = i79;
            i14 = charAt19;
            i15 = charAt22;
            i16 = i78;
            iArr = iArr2;
            i17 = charAt16;
            i48 = i75;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzfwVar.zze();
        Class<?> cls2 = zzfwVar.zza().getClass();
        int i81 = i15 + i13;
        int i82 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i82];
        int i83 = i15;
        int i84 = i81;
        int i85 = 0;
        int i86 = 0;
        while (i48 < length) {
            int i87 = i48 + 1;
            int charAt23 = zzd.charAt(i48);
            if (charAt23 >= c12) {
                int i88 = charAt23 & 8191;
                int i89 = i87;
                int i91 = 13;
                while (true) {
                    i45 = i89 + 1;
                    charAt13 = zzd.charAt(i89);
                    if (charAt13 < c12) {
                        break;
                    }
                    i88 |= (charAt13 & 8191) << i91;
                    i91 += 13;
                    i89 = i45;
                }
                charAt23 = i88 | (charAt13 << i91);
                i27 = i45;
            } else {
                i27 = i87;
            }
            int i92 = i27 + 1;
            int charAt24 = zzd.charAt(i27);
            if (charAt24 >= c12) {
                int i93 = charAt24 & 8191;
                int i94 = i92;
                int i95 = 13;
                while (true) {
                    i44 = i94 + 1;
                    charAt12 = zzd.charAt(i94);
                    if (charAt12 < c12) {
                        break;
                    }
                    i93 |= (charAt12 & 8191) << i95;
                    i95 += 13;
                    i94 = i44;
                }
                charAt24 = i93 | (charAt12 << i95);
                i28 = i44;
            } else {
                i28 = i92;
            }
            if ((charAt24 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i85] = i86;
                i85++;
            }
            int i96 = charAt24 & 255;
            zzfw zzfwVar2 = zzfwVar;
            int i97 = charAt24 & 2048;
            if (i96 >= 51) {
                int i98 = i28 + 1;
                int charAt25 = zzd.charAt(i28);
                char c13 = 55296;
                if (charAt25 >= 55296) {
                    int i99 = charAt25 & 8191;
                    int i100 = i98;
                    int i101 = 13;
                    while (true) {
                        i43 = i100 + 1;
                        charAt11 = zzd.charAt(i100);
                        if (charAt11 < c13) {
                            break;
                        }
                        i99 |= (charAt11 & 8191) << i101;
                        i101 += 13;
                        i100 = i43;
                        c13 = 55296;
                    }
                    charAt25 = i99 | (charAt11 << i101);
                    i39 = i43;
                } else {
                    i39 = i98;
                }
                int i102 = i39;
                int i103 = i96 - 51;
                i29 = length;
                if (i103 == 9 || i103 == 17) {
                    i41 = i16 + 1;
                    int i104 = i86 / 3;
                    objArr[i104 + i104 + 1] = zze[i16];
                } else {
                    if (i103 == 12) {
                        if (zzfwVar2.zzc() == 1 || i97 != 0) {
                            i41 = i16 + 1;
                            int i105 = i86 / 3;
                            objArr[i105 + i105 + 1] = zze[i16];
                        } else {
                            i42 = 0;
                            int i106 = charAt25 + charAt25;
                            obj = zze[i106];
                            int i107 = i42;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i106] = zzz2;
                            }
                            int i108 = i17;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i109 = i106 + 1;
                            obj2 = zze[i109];
                            i31 = i108;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i109] = zzz3;
                            }
                            i33 = (int) unsafe.objectFieldOffset(zzz3);
                            str = zzd;
                            i35 = i107;
                            i28 = i102;
                            i34 = 0;
                            c11 = 55296;
                        }
                    }
                    i42 = i97;
                    int i1062 = charAt25 + charAt25;
                    obj = zze[i1062];
                    int i1072 = i42;
                    if (obj instanceof Field) {
                    }
                    int i1082 = i17;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i1092 = i1062 + 1;
                    obj2 = zze[i1092];
                    i31 = i1082;
                    if (obj2 instanceof Field) {
                    }
                    i33 = (int) unsafe.objectFieldOffset(zzz3);
                    str = zzd;
                    i35 = i1072;
                    i28 = i102;
                    i34 = 0;
                    c11 = 55296;
                }
                i16 = i41;
                i42 = i97;
                int i10622 = charAt25 + charAt25;
                obj = zze[i10622];
                int i10722 = i42;
                if (obj instanceof Field) {
                }
                int i10822 = i17;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i10922 = i10622 + 1;
                obj2 = zze[i10922];
                i31 = i10822;
                if (obj2 instanceof Field) {
                }
                i33 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i35 = i10722;
                i28 = i102;
                i34 = 0;
                c11 = 55296;
            } else {
                i29 = length;
                i31 = i17;
                int i110 = i16 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i16]);
                if (i96 == 9 || i96 == 17) {
                    i32 = i110;
                    int i111 = i86 / 3;
                    objArr[i111 + i111 + 1] = zzz4.getType();
                } else {
                    if (i96 == 27) {
                        i37 = i110;
                        i38 = 1;
                        i16 += 2;
                    } else if (i96 == 49) {
                        i16 += 2;
                        i37 = i110;
                        i38 = 1;
                    } else if (i96 == 12 || i96 == 30 || i96 == 44) {
                        if (zzfwVar2.zzc() == 1 || i97 != 0) {
                            i16 += 2;
                            int i112 = i86 / 3;
                            objArr[i112 + i112 + 1] = zze[i110];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0 || i96 > 17) {
                                c11 = 55296;
                                i33 = 1048575;
                                i34 = 0;
                            } else {
                                int i113 = i28 + 1;
                                int charAt26 = str.charAt(i28);
                                if (charAt26 >= 55296) {
                                    int i114 = charAt26 & 8191;
                                    int i115 = 13;
                                    while (true) {
                                        i36 = i113 + 1;
                                        charAt10 = str.charAt(i113);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i114 |= (charAt10 & 8191) << i115;
                                        i115 += 13;
                                        i113 = i36;
                                    }
                                    charAt26 = i114 | (charAt10 << i115);
                                } else {
                                    i36 = i113;
                                }
                                int i116 = (charAt26 / 32) + i31 + i31;
                                Object obj3 = zze[i116];
                                if (obj3 instanceof Field) {
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i116] = zzz;
                                }
                                i34 = charAt26 % 32;
                                i28 = i36;
                                c11 = 55296;
                                i33 = (int) unsafe.objectFieldOffset(zzz);
                            }
                            if (i96 >= 18 && i96 <= 49) {
                                iArr[i84] = objectFieldOffset;
                                i84++;
                            }
                            i35 = i97;
                        } else {
                            str = zzd;
                            i16 = i110;
                            i97 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c11 = 55296;
                            i33 = 1048575;
                            i34 = 0;
                            if (i96 >= 18) {
                                iArr[i84] = objectFieldOffset;
                                i84++;
                            }
                            i35 = i97;
                        }
                    } else if (i96 == 50) {
                        int i117 = i16 + 2;
                        int i118 = i83 + 1;
                        iArr[i83] = i86;
                        int i119 = i86 / 3;
                        int i120 = i119 + i119;
                        objArr[i120] = zze[i110];
                        if (i97 != 0) {
                            objArr[i120 + 1] = zze[i117];
                            i16 += 3;
                            str = zzd;
                            i83 = i118;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c11 = 55296;
                            i33 = 1048575;
                            i34 = 0;
                            if (i96 >= 18) {
                            }
                            i35 = i97;
                        } else {
                            i16 = i117;
                            i83 = i118;
                            i97 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c11 = 55296;
                            i33 = 1048575;
                            i34 = 0;
                            if (i96 >= 18) {
                            }
                            i35 = i97;
                        }
                    } else {
                        i32 = i110;
                    }
                    int i121 = i86 / 3;
                    objArr[i121 + i121 + i38] = zze[i37];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c11 = 55296;
                    i33 = 1048575;
                    i34 = 0;
                    if (i96 >= 18) {
                    }
                    i35 = i97;
                }
                str = zzd;
                i16 = i32;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                if ((charAt24 & 4096) != 0) {
                }
                c11 = 55296;
                i33 = 1048575;
                i34 = 0;
                if (i96 >= 18) {
                }
                i35 = i97;
            }
            int i122 = i86 + 1;
            iArr3[i86] = charAt23;
            int i123 = i86 + 2;
            iArr3[i122] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i35 != 0 ? LinearLayoutManager.INVALID_OFFSET : 0) | (i96 << 20) | objectFieldOffset;
            i86 += 3;
            iArr3[i123] = (i34 << 20) | i33;
            i48 = i28;
            zzd = str;
            c12 = c11;
            zzfwVar = zzfwVar2;
            length = i29;
            i17 = i31;
        }
        return new zzfp(iArr3, objArr, i12, i14, zzfwVar.zza(), false, iArr, i15, i81, zzfsVar, zzezVar, zzgsVar, zzdtVar, zzfhVar);
    }

    private static double zzm(Object obj, long j11) {
        return ((Double) zzgz.zzf(obj, j11)).doubleValue();
    }

    private static float zzn(Object obj, long j11) {
        return ((Float) zzgz.zzf(obj, j11)).floatValue();
    }

    private static int zzo(Object obj, long j11) {
        return ((Integer) zzgz.zzf(obj, j11)).intValue();
    }

    private final int zzp(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzq(int i11, int i12) {
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

    private static int zzr(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzs(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzt(Object obj, long j11) {
        return ((Long) zzgz.zzf(obj, j11)).longValue();
    }

    private final zzel zzu(int i11) {
        int i12 = i11 / 3;
        return (zzel) this.zzd[i12 + i12 + 1];
    }

    private final zzge zzv(int i11) {
        Object[] objArr = this.zzd;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzge zzgeVar = (zzge) objArr[i13];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzb2 = zzfu.zza().zzb((Class) objArr[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private final Object zzx(Object obj, int i11) {
        zzge zzv = zzv(i11);
        int zzs = zzs(i11) & 1048575;
        if (!zzI(obj, i11)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i11, int i12) {
        zzge zzv = zzv(i12);
        if (!zzM(obj, i11, i12)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i12) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int i11;
        int zzA;
        int zzB;
        int zzA2;
        int zzd;
        int zzA3;
        int zzh;
        int zzA4;
        int size;
        int zzl;
        int zzA5;
        int zzd2;
        boolean z11;
        int zzb2;
        int zzA6;
        int zzA7;
        int size2;
        int zzk;
        int zzA8;
        int size3;
        int zzi;
        int zzA9;
        int zze;
        int zzA10;
        int zzA11;
        int zzA12;
        int zzB2;
        zzfp<T> zzfpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < zzfpVar.zzc.length) {
            int zzs = zzfpVar.zzs(i14);
            int zzr = zzr(zzs);
            int[] iArr = zzfpVar.zzc;
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i12;
            if (zzr <= 17) {
                if (i19 != i13) {
                    i15 = i19 == i12 ? 0 : unsafe.getInt(obj2, i19);
                    i13 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            int i21 = zzs & i12;
            if (zzr >= zzdy.zzJ.zza()) {
                zzdy.zzW.zza();
            }
            long j11 = i21;
            switch (zzr) {
                case 0:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 1:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 2:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        long j12 = unsafe.getLong(obj2, j11);
                        zzA = zzdn.zzA(i17 << 3);
                        zzB = zzdn.zzB(j12);
                        i16 += zzB + zzA;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 3:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        long j13 = unsafe.getLong(obj2, j11);
                        zzA = zzdn.zzA(i17 << 3);
                        zzB = zzdn.zzB(j13);
                        i16 += zzB + zzA;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 4:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        long j14 = unsafe.getInt(obj2, j11);
                        zzA = zzdn.zzA(i17 << 3);
                        zzB = zzdn.zzB(j14);
                        i16 += zzB + zzA;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 5:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 6:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 7:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 1, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 8:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        int i22 = i17 << 3;
                        Object object = unsafe.getObject(obj2, j11);
                        if (object instanceof zzdf) {
                            zzA2 = zzdn.zzA(i22);
                            zzd = ((zzdf) object).zzd();
                            zzA3 = zzdn.zzA(zzd);
                            i16 += zzA3 + zzd + zzA2;
                        } else {
                            zzA = zzdn.zzA(i22);
                            zzB = zzdn.zzz((String) object);
                            i16 += zzB + zzA;
                        }
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 9:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        zzh = zzgg.zzh(i17, unsafe.getObject(obj2, j11), zzfpVar.zzv(i14));
                        i16 += zzh;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 10:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        zzdf zzdfVar = (zzdf) unsafe.getObject(obj2, j11);
                        zzA2 = zzdn.zzA(i17 << 3);
                        zzd = zzdfVar.zzd();
                        zzA3 = zzdn.zzA(zzd);
                        i16 += zzA3 + zzd + zzA2;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 11:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(unsafe.getInt(obj2, j11), zzdn.zzA(i17 << 3), i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 12:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        long j15 = unsafe.getInt(obj2, j11);
                        zzA = zzdn.zzA(i17 << 3);
                        zzB = zzdn.zzB(j15);
                        i16 += zzB + zzA;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 13:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 14:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 15:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        int i23 = unsafe.getInt(obj2, j11);
                        i16 = e.b((i23 >> 31) ^ (i23 + i23), zzdn.zzA(i17 << 3), i16);
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 16:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        long j16 = unsafe.getLong(obj2, j11);
                        zzA = zzdn.zzA(i17 << 3);
                        zzB = zzdn.zzB((j16 >> 63) ^ (j16 + j16));
                        i16 += zzB + zzA;
                    }
                    zzfpVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 17:
                    if (zzfpVar.zzJ(obj2, i14, i13, i15, i11)) {
                        zzh = zzdn.zzw(i17, (zzfm) unsafe.getObject(obj2, j11), zzfpVar.zzv(i14));
                        i16 += zzh;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 18:
                    zzh = zzgg.zzd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 19:
                    zzh = zzgg.zzb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j11);
                    int i24 = zzgg.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzdn.zzA(i17 << 3) * list.size()) + zzgg.zzg(list);
                        i16 += zzA4;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA4 = 0;
                    i16 += zzA4;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j11);
                    int i25 = zzgg.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgg.zzl(list2);
                        zzA5 = zzdn.zzA(i17 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i16 += zzA4;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA4 = 0;
                    i16 += zzA4;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j11);
                    int i26 = zzgg.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgg.zzf(list3);
                        zzA5 = zzdn.zzA(i17 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i16 += zzA4;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA4 = 0;
                    i16 += zzA4;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 23:
                    zzd2 = zzgg.zzd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 24:
                    z11 = false;
                    zzb2 = zzgg.zzb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzb2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(obj2, j11);
                    int i27 = zzgg.zza;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        zzA6 = (zzdn.zzA(i17 << 3) + 1) * size4;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(obj2, j11);
                    int i28 = zzgg.zza;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        int zzA13 = zzdn.zzA(i17 << 3) * size5;
                        if (list5 instanceof zzey) {
                            zzey zzeyVar = (zzey) list5;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object zza2 = zzeyVar.zza();
                                if (zza2 instanceof zzdf) {
                                    int zzd3 = ((zzdf) zza2).zzd();
                                    zzA13 = e.b(zzd3, zzd3, zzA13);
                                } else {
                                    zzA13 = zzdn.zzz((String) zza2) + zzA13;
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < size5; i31++) {
                                Object obj3 = list5.get(i31);
                                if (obj3 instanceof zzdf) {
                                    int zzd4 = ((zzdf) obj3).zzd();
                                    zzA13 = e.b(zzd4, zzd4, zzA13);
                                } else {
                                    zzA13 = zzdn.zzz((String) obj3) + zzA13;
                                }
                            }
                        }
                        zzA6 = zzA13;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(obj2, j11);
                    zzge zzv = zzfpVar.zzv(i14);
                    int i32 = zzgg.zza;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        int zzA14 = zzdn.zzA(i17 << 3) * size6;
                        for (int i33 = 0; i33 < size6; i33++) {
                            Object obj4 = list6.get(i33);
                            if (obj4 instanceof zzex) {
                                int zza3 = ((zzex) obj4).zza();
                                zzA14 = e.b(zza3, zza3, zzA14);
                            } else {
                                zzA14 += zzdn.zzy((zzfm) obj4, zzv);
                            }
                        }
                        zzA6 = zzA14;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j11);
                    int i34 = zzgg.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        zzA7 = 0;
                    } else {
                        zzA7 = zzdn.zzA(i17 << 3) * size7;
                        for (int i35 = 0; i35 < list7.size(); i35++) {
                            int zzd5 = ((zzdf) list7.get(i35)).zzd();
                            zzA7 = e.b(zzd5, zzd5, zzA7);
                        }
                    }
                    i16 += zzA7;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j11);
                    int i36 = zzgg.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zzgg.zzk(list8);
                        zzA8 = zzdn.zzA(i17 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i16 += zzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzd2 = 0;
                    i16 += zzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j11);
                    int i37 = zzgg.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zzgg.zza(list9);
                        zzA8 = zzdn.zzA(i17 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i16 += zzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzd2 = 0;
                    i16 += zzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzd2 = zzgg.zzb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 32:
                    z11 = false;
                    zzb2 = zzgg.zzd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zzb2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j11);
                    int i38 = zzgg.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zzi = zzgg.zzi(list10);
                        zzA9 = zzdn.zzA(i17 << 3);
                        zzA6 = (zzA9 * size3) + zzi;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j11);
                    int i39 = zzgg.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        zzi = zzgg.zzj(list11);
                        zzA9 = zzdn.zzA(i17 << 3);
                        zzA6 = (zzA9 * size3) + zzi;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zze = zzgg.zzg((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 38:
                    zze = zzgg.zzl((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zze = zzgg.zzf((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 40:
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 41:
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j11);
                    int i41 = zzgg.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 43:
                    zze = zzgg.zzk((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zze = zzgg.zza((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 46:
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 47:
                    zze = zzgg.zzi((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 48:
                    zze = zzgg.zzj((List) unsafe.getObject(obj2, j11));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i17 << 3);
                        zzA11 = zzdn.zzA(zze);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j11);
                    zzge zzv2 = zzfpVar.zzv(i14);
                    int i42 = zzgg.zza;
                    int size8 = list13.size();
                    if (size8 != 0) {
                        int i43 = 0;
                        for (int i44 = 0; i44 < size8; i44++) {
                            i43 += zzdn.zzw(i17, (zzfm) list13.get(i44), zzv2);
                        }
                        zzA6 = i43;
                        i16 += zzA6;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj2, j11);
                    if (!zzfgVar.isEmpty()) {
                        Iterator it = zzfgVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 51:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 52:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 53:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        long zzt = zzt(obj2, j11);
                        zzA12 = zzdn.zzA(i17 << 3);
                        zzB2 = zzdn.zzB(zzt);
                        i16 += zzB2 + zzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 54:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        long zzt2 = zzt(obj2, j11);
                        zzA12 = zzdn.zzA(i17 << 3);
                        zzB2 = zzdn.zzB(zzt2);
                        i16 += zzB2 + zzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 55:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        long zzo = zzo(obj2, j11);
                        zzA12 = zzdn.zzA(i17 << 3);
                        zzB2 = zzdn.zzB(zzo);
                        i16 += zzB2 + zzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 56:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 57:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 58:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 1, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 59:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        int i45 = i17 << 3;
                        Object object2 = unsafe.getObject(obj2, j11);
                        if (object2 instanceof zzdf) {
                            zze = zzdn.zzA(i45);
                            zzA10 = ((zzdf) object2).zzd();
                            zzA11 = zzdn.zzA(zzA10);
                            i16 += zzA11 + zzA10 + zze;
                        } else {
                            zzA12 = zzdn.zzA(i45);
                            zzB2 = zzdn.zzz((String) object2);
                            i16 += zzB2 + zzA12;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 60:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        zzd2 = zzgg.zzh(i17, unsafe.getObject(obj2, j11), zzfpVar.zzv(i14));
                        i16 += zzd2;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 61:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        zzdf zzdfVar2 = (zzdf) unsafe.getObject(obj2, j11);
                        zze = zzdn.zzA(i17 << 3);
                        zzA10 = zzdfVar2.zzd();
                        zzA11 = zzdn.zzA(zzA10);
                        i16 += zzA11 + zzA10 + zze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 62:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(zzo(obj2, j11), zzdn.zzA(i17 << 3), i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 63:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        long zzo2 = zzo(obj2, j11);
                        zzA12 = zzdn.zzA(i17 << 3);
                        zzB2 = zzdn.zzB(zzo2);
                        i16 += zzB2 + zzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 4, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        i16 = e.b(i17 << 3, 8, i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 66:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        int zzo3 = zzo(obj2, j11);
                        i16 = e.b((zzo3 >> 31) ^ (zzo3 + zzo3), zzdn.zzA(i17 << 3), i16);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 67:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        long zzt3 = zzt(obj2, j11);
                        zzA12 = zzdn.zzA(i17 << 3);
                        zzB2 = zzdn.zzB((zzt3 >> 63) ^ (zzt3 + zzt3));
                        i16 += zzB2 + zzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 68:
                    if (zzfpVar.zzM(obj2, i17, i14)) {
                        zzd2 = zzdn.zzw(i17, (zzfm) unsafe.getObject(obj2, j11), zzfpVar.zzv(i14));
                        i16 += zzd2;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                default:
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
            }
        }
        int i46 = 0;
        int zza4 = ((zzeh) obj).zzc.zza() + i16;
        if (!zzfpVar.zzh) {
            return zza4;
        }
        zzdx zzdxVar = ((zzed) obj).zzb;
        int zzc = zzdxVar.zza.zzc();
        for (int i47 = 0; i47 < zzc; i47++) {
            Map.Entry zzg = zzdxVar.zza.zzg(i47);
            i46 += zzdx.zza((zzdw) ((zzgi) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry2 : zzdxVar.zza.zzd()) {
            i46 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
        }
        return zza4 + i46;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i11;
        long doubleToLongBits;
        int i12;
        int floatToIntBits;
        int zzc;
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzc.length; i15 += 3) {
            int zzs = zzs(i15);
            int[] iArr = this.zzc;
            int i16 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i17 = iArr[i15];
            long j11 = i16;
            int i18 = 37;
            switch (zzr) {
                case 0:
                    i11 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j11));
                    byte[] bArr = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 1:
                    i12 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j11));
                    i14 = floatToIntBits + i12;
                    break;
                case 2:
                    i11 = i14 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr2 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 3:
                    i11 = i14 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr3 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 4:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 5:
                    i11 = i14 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr4 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 6:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 7:
                    i12 = i14 * 53;
                    floatToIntBits = zzep.zza(zzgz.zzw(obj, j11));
                    i14 = floatToIntBits + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    floatToIntBits = ((String) zzgz.zzf(obj, j11)).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 9:
                    i13 = i14 * 53;
                    Object zzf = zzgz.zzf(obj, j11);
                    if (zzf != null) {
                        i18 = zzf.hashCode();
                    }
                    i14 = i13 + i18;
                    break;
                case 10:
                    i12 = i14 * 53;
                    floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 11:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 12:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 13:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 14:
                    i11 = i14 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr5 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 15:
                    i11 = i14 * 53;
                    zzc = zzgz.zzc(obj, j11);
                    i14 = i11 + zzc;
                    break;
                case 16:
                    i11 = i14 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j11);
                    byte[] bArr6 = zzep.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zzc;
                    break;
                case 17:
                    i13 = i14 * 53;
                    Object zzf2 = zzgz.zzf(obj, j11);
                    if (zzf2 != null) {
                        i18 = zzf2.hashCode();
                    }
                    i14 = i13 + i18;
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
                    i12 = i14 * 53;
                    floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 51:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j11));
                        byte[] bArr7 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j11));
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zzt(obj, j11);
                        byte[] bArr8 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zzt(obj, j11);
                        byte[] bArr9 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zzt(obj, j11);
                        byte[] bArr10 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zzep.zza(zzN(obj, j11));
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = ((String) zzgz.zzf(obj, j11)).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zzt(obj, j11);
                        byte[] bArr11 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zzc = zzo(obj, j11);
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zzt(obj, j11);
                        byte[] bArr12 = zzep.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zzgz.zzf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzeh) obj).zzc.hashCode() + (i14 * 53);
        return this.zzh ? (hashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0f99, code lost:
    
        if (r13 == r3) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0f9b, code lost:
    
        r14.putInt(r10, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0f9f, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0fa3, code lost:
    
        if (r2 >= r0.zzk) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0fa5, code lost:
    
        r3 = r0.zzi;
        r5 = r0.zzc;
        r3 = r3[r2];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r10, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0fbb, code lost:
    
        if (r5 != null) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0fc7, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0fc4, code lost:
    
        if (r0.zzu(r3) != null) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0fca, code lost:
    
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg) r5;
        r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0fd2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0fd5, code lost:
    
        if (r11 != 0) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0fd7, code lost:
    
        if (r7 != r4) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0fdf, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0fe4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0fe0, code lost:
    
        if (r7 > r4) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0fe2, code lost:
    
        if (r1 != r11) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0fea, code lost:
    
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0463, code lost:
    
        r3 = r14;
        r14 = r7;
        r7 = r9;
        r9 = r3;
        r4 = r41;
        r3 = r8;
        r6 = r10;
        r8 = r11;
        r15 = r21;
        r13 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c0a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c26 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0ef2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0f0d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0f19 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0f28  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i11, int i12, int i13, zzcu zzcuVar) throws IOException {
        int i14;
        Unsafe unsafe;
        Object obj2;
        int i15;
        int i16;
        int zzq;
        Unsafe unsafe2;
        zzcu zzcuVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        Unsafe unsafe3;
        int zzi;
        int i23;
        int i24;
        Unsafe unsafe4;
        Object obj3;
        zzcu zzcuVar3;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int zzm;
        int i29;
        int zzj;
        Unsafe unsafe5;
        Object obj4;
        zzcu zzcuVar4;
        byte[] bArr3;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        zzcu zzcuVar5;
        byte[] bArr4;
        zzcu zzcuVar6;
        int zzj2;
        int i36;
        int i37;
        int i38;
        byte[] bArr5;
        int i39;
        int i41;
        zzcu zzcuVar7;
        byte[] bArr6;
        int i42;
        int i43;
        int i44;
        zzcu zzcuVar8;
        int i45;
        int zzj3;
        int i46;
        int i47;
        int i48;
        zzcu zzcuVar9;
        int i49;
        int zzj4;
        zzcu zzcuVar10;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int zzl;
        int i56;
        int i57;
        int zzj5;
        byte[] bArr7;
        int i58;
        int i59;
        int i61;
        int i62;
        zzcu zzcuVar11;
        char c11;
        int i63;
        int i64;
        int zzj6;
        zzfp<T> zzfpVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i65 = i12;
        zzcu zzcuVar12 = zzcuVar;
        zzA(obj5);
        Unsafe unsafe6 = zzb;
        int i66 = 0;
        int i67 = -1;
        int i68 = i11;
        int i69 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = -1;
        int i74 = 1048575;
        while (true) {
            int i75 = 1;
            int i76 = 2;
            while (true) {
                if (i68 < i65) {
                    int i77 = i68 + 1;
                    int i78 = bArr8[i68];
                    if (i78 < 0) {
                        i77 = zzcv.zzk(i78, bArr8, i77, zzcuVar12);
                        i78 = zzcuVar12.zza;
                    }
                    i72 = i78;
                    int i79 = i72 >>> 3;
                    if (i79 > i73) {
                        int i81 = i69 / 3;
                        if (i79 >= zzfpVar.zze && i79 <= zzfpVar.zzf) {
                            zzq = zzfpVar.zzq(i79, i81);
                            if (zzq != i67) {
                                unsafe2 = unsafe6;
                                obj2 = obj5;
                                zzcuVar2 = zzcuVar12;
                                i17 = i77;
                                i69 = i66;
                                i18 = i69;
                                i19 = i67;
                                i15 = i72;
                                i21 = 1048575;
                            } else {
                                int i82 = i72 & 7;
                                i19 = i67;
                                int[] iArr = zzfpVar.zzc;
                                int i83 = iArr[zzq + 1];
                                int zzr = zzr(i83);
                                long j11 = i83 & 1048575;
                                if (zzr <= 17) {
                                    int i84 = iArr[zzq + 2];
                                    int i85 = i75 << (i84 >>> 20);
                                    int i86 = i84 & 1048575;
                                    int i87 = i77;
                                    if (i86 != i74) {
                                        if (i74 != 1048575) {
                                            unsafe6.putInt(obj5, i74, i71);
                                        }
                                        i71 = i86 == 1048575 ? 0 : unsafe6.getInt(obj5, i86);
                                        i74 = i86;
                                    }
                                    switch (zzr) {
                                        case 0:
                                            Object obj6 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj6;
                                            i21 = 1048575;
                                            i24 = i79;
                                            zzcuVar3 = zzcuVar;
                                            i23 = zzq;
                                            i27 = i87;
                                            i25 = i71;
                                            i26 = i74;
                                            if (i82 == i75) {
                                                i71 = i25 | i85;
                                                zzgz.zzo(obj3, j11, Double.longBitsToDouble(zzcv.zzq(bArr, i27)));
                                                obj5 = obj3;
                                                unsafe6 = unsafe4;
                                                bArr8 = bArr;
                                                i65 = i12;
                                                i68 = i27 + 8;
                                                zzcuVar12 = zzcuVar3;
                                                i73 = i24;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i66 = 0;
                                                break;
                                            }
                                            unsafe2 = unsafe4;
                                            i17 = i27;
                                            zzcuVar2 = zzcuVar3;
                                            i79 = i24;
                                            i69 = i23;
                                            i74 = i26;
                                            i71 = i25;
                                            i18 = 0;
                                            i14 = i13;
                                            obj2 = obj3;
                                            i15 = i72;
                                            if (i15 != i14 && i14 != 0) {
                                                i65 = i12;
                                                i68 = i17;
                                                unsafe = unsafe2;
                                                i16 = i21;
                                                break;
                                            } else {
                                                if (zzfpVar.zzh) {
                                                    zzds zzdsVar = zzcuVar2.zzd;
                                                    int i88 = zzds.zzb;
                                                    int i89 = zzfu.zza;
                                                    if (zzdsVar != zzds.zza) {
                                                        zzfm zzfmVar = zzfpVar.zzg;
                                                        zzgs zzgsVar = zzfpVar.zzl;
                                                        zzef zzb2 = zzdsVar.zzb(zzfmVar, i79);
                                                        if (zzb2 == null) {
                                                            i65 = i12;
                                                            zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar2);
                                                            i22 = i79;
                                                            unsafe3 = unsafe2;
                                                        } else {
                                                            zzed zzedVar = (zzed) obj2;
                                                            zzedVar.zzc();
                                                            i65 = i12;
                                                            i22 = i79;
                                                            unsafe3 = unsafe2;
                                                            zzi = zzcv.zzb(i15, bArr, i17, i65, zzedVar, zzb2, zzgsVar, zzcuVar);
                                                        }
                                                        i68 = zzi;
                                                        bArr8 = bArr;
                                                        zzcuVar12 = zzcuVar;
                                                        obj5 = obj2;
                                                        i73 = i22;
                                                        i67 = i19;
                                                        i75 = 1;
                                                        i76 = 2;
                                                        i72 = i15;
                                                        unsafe6 = unsafe3;
                                                        i66 = i18;
                                                    }
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                        case 1:
                                            Object obj7 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj7;
                                            i21 = 1048575;
                                            i24 = i79;
                                            zzcuVar3 = zzcuVar;
                                            i23 = zzq;
                                            i27 = i87;
                                            i25 = i71;
                                            i26 = i74;
                                            if (i82 == 5) {
                                                i71 = i25 | i85;
                                                zzgz.zzp(obj3, j11, Float.intBitsToFloat(zzcv.zzc(bArr, i27)));
                                                obj5 = obj3;
                                                unsafe6 = unsafe4;
                                                i65 = i12;
                                                bArr8 = bArr;
                                                i73 = i24;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i75 = 1;
                                                i76 = 2;
                                                i66 = 0;
                                                i68 = i27 + 4;
                                                zzcuVar12 = zzcuVar3;
                                            } else {
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                            i21 = 1048575;
                                            i24 = i79;
                                            zzcuVar3 = zzcuVar;
                                            i23 = zzq;
                                            i27 = i87;
                                            i28 = 0;
                                            bArr2 = bArr;
                                            i25 = i71;
                                            i26 = i74;
                                            if (i82 == 0) {
                                                i71 = i25 | i85;
                                                zzm = zzcv.zzm(bArr2, i27, zzcuVar3);
                                                unsafe6.putLong(obj5, j11, zzcuVar3.zzb);
                                                obj5 = obj5;
                                                unsafe6 = unsafe6;
                                                break;
                                            }
                                            Object obj8 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj8;
                                            unsafe2 = unsafe4;
                                            i17 = i27;
                                            zzcuVar2 = zzcuVar3;
                                            i79 = i24;
                                            i69 = i23;
                                            i74 = i26;
                                            i71 = i25;
                                            i18 = 0;
                                            i14 = i13;
                                            obj2 = obj3;
                                            i15 = i72;
                                            if (i15 != i14) {
                                            }
                                            if (zzfpVar.zzh) {
                                            }
                                            i22 = i79;
                                            unsafe3 = unsafe2;
                                            i65 = i12;
                                            zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                            i68 = zzi;
                                            bArr8 = bArr;
                                            zzcuVar12 = zzcuVar;
                                            obj5 = obj2;
                                            i73 = i22;
                                            i67 = i19;
                                            i75 = 1;
                                            i76 = 2;
                                            i72 = i15;
                                            unsafe6 = unsafe3;
                                            i66 = i18;
                                            break;
                                        case 4:
                                        case 11:
                                            i21 = 1048575;
                                            i24 = i79;
                                            zzcuVar3 = zzcuVar;
                                            i23 = zzq;
                                            i27 = i87;
                                            i29 = 0;
                                            i25 = i71;
                                            i26 = i74;
                                            if (i82 == 0) {
                                                i71 = i25 | i85;
                                                zzj = zzcv.zzj(bArr, i27, zzcuVar3);
                                                unsafe6.putInt(obj5, j11, zzcuVar3.zza);
                                                i65 = i12;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar3;
                                                i73 = i24;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i75 = 1;
                                                i76 = 2;
                                                i66 = i29;
                                                i68 = zzj;
                                            } else {
                                                Object obj82 = obj5;
                                                unsafe4 = unsafe6;
                                                obj3 = obj82;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 5:
                                        case 14:
                                            i21 = 1048575;
                                            i24 = i79;
                                            i23 = zzq;
                                            i27 = i87;
                                            i28 = 0;
                                            Object obj9 = obj5;
                                            i25 = i71;
                                            i26 = i74;
                                            unsafe5 = unsafe6;
                                            if (i82 == i75) {
                                                zzm = i27 + 8;
                                                i71 = i25 | i85;
                                                zzcuVar3 = zzcuVar;
                                                obj5 = obj9;
                                                bArr2 = bArr;
                                                unsafe6 = unsafe5;
                                                unsafe6.putLong(obj5, j11, zzcv.zzq(bArr, i27));
                                                break;
                                            } else {
                                                zzcuVar3 = zzcuVar;
                                                obj3 = obj9;
                                                unsafe4 = unsafe5;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 6:
                                        case 13:
                                            i21 = 1048575;
                                            i24 = i79;
                                            i23 = zzq;
                                            i27 = i87;
                                            obj4 = obj5;
                                            i25 = i71;
                                            i26 = i74;
                                            zzcuVar4 = zzcuVar;
                                            unsafe5 = unsafe6;
                                            if (i82 == 5) {
                                                i71 = i25 | i85;
                                                unsafe5.putInt(obj4, j11, zzcv.zzc(bArr, i27));
                                                i65 = i12;
                                                bArr8 = bArr;
                                                unsafe6 = unsafe5;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i76 = 2;
                                                i66 = 0;
                                                i68 = i27 + 4;
                                                zzcuVar12 = zzcuVar4;
                                                obj5 = obj4;
                                                i73 = i24;
                                            } else {
                                                zzcuVar3 = zzcuVar4;
                                                obj3 = obj4;
                                                unsafe4 = unsafe5;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 7:
                                            i21 = 1048575;
                                            i24 = i79;
                                            i23 = zzq;
                                            i27 = i87;
                                            i29 = 0;
                                            obj4 = obj5;
                                            i25 = i71;
                                            i26 = i74;
                                            zzcuVar4 = zzcuVar;
                                            unsafe5 = unsafe6;
                                            bArr3 = bArr;
                                            if (i82 == 0) {
                                                i71 = i25 | i85;
                                                zzj = zzcv.zzm(bArr3, i27, zzcuVar4);
                                                zzgz.zzm(obj4, j11, zzcuVar4.zzb != 0 ? i75 : 0);
                                                i65 = i12;
                                                bArr8 = bArr3;
                                                zzcuVar12 = zzcuVar4;
                                                obj5 = obj4;
                                                i73 = i24;
                                                unsafe6 = unsafe5;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i76 = 2;
                                                i66 = i29;
                                                i68 = zzj;
                                            } else {
                                                zzcuVar3 = zzcuVar4;
                                                obj3 = obj4;
                                                unsafe4 = unsafe5;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 8:
                                            i21 = 1048575;
                                            i24 = i79;
                                            i23 = zzq;
                                            i27 = i87;
                                            obj4 = obj5;
                                            zzcuVar4 = zzcuVar;
                                            i25 = i71;
                                            i26 = i74;
                                            unsafe5 = unsafe6;
                                            bArr3 = bArr;
                                            if (i82 == i76) {
                                                if ((i83 & 536870912) != 0) {
                                                    zzj = zzcv.zzj(bArr3, i27, zzcuVar4);
                                                    int i91 = zzcuVar4.zza;
                                                    if (i91 < 0) {
                                                        throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    int i92 = i25 | i85;
                                                    if (i91 == 0) {
                                                        zzcuVar4.zzc = "";
                                                        i32 = i92;
                                                        i29 = 0;
                                                    } else {
                                                        int length = bArr3.length;
                                                        int i93 = zzhe.zza;
                                                        if ((zzj | i91 | ((length - zzj) - i91)) < 0) {
                                                            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i91)));
                                                        }
                                                        int i94 = zzj + i91;
                                                        char[] cArr = new char[i91];
                                                        int i95 = 0;
                                                        while (true) {
                                                            i31 = zzj;
                                                            if (zzj < i94) {
                                                                byte b11 = bArr3[i31];
                                                                if (zzha.zzd(b11)) {
                                                                    cArr[i95] = (char) b11;
                                                                    zzj = i31 + 1;
                                                                    i95++;
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            int i96 = i31;
                                                            while (i96 < i94) {
                                                                int i97 = i96;
                                                                i96 = i97 + 1;
                                                                int i98 = i92;
                                                                byte b12 = bArr3[i97];
                                                                if (zzha.zzd(b12)) {
                                                                    int i99 = i95 + 1;
                                                                    cArr[i95] = (char) b12;
                                                                    while (true) {
                                                                        i95 = i99;
                                                                        if (i96 < i94) {
                                                                            byte b13 = bArr3[i96];
                                                                            if (zzha.zzd(b13)) {
                                                                                i96++;
                                                                                i99 = i95 + 1;
                                                                                cArr[i95] = (char) b13;
                                                                            }
                                                                        }
                                                                    }
                                                                    i92 = i98;
                                                                } else if (b12 >= -32) {
                                                                    if (b12 >= -16) {
                                                                        i33 = i94;
                                                                        if (i96 >= i33 - 2) {
                                                                            throw new zzer("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        char[] cArr2 = cArr;
                                                                        int i100 = i95;
                                                                        zzha.zza(b12, bArr3[i96], bArr3[i97 + 2], bArr3[i97 + 3], cArr2, i100);
                                                                        i95 = i100 + 2;
                                                                        i92 = i98;
                                                                        cArr = cArr2;
                                                                        i96 = i97 + 4;
                                                                    } else {
                                                                        if (i96 >= i94 - 1) {
                                                                            throw new zzer("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        i33 = i94;
                                                                        zzha.zzb(b12, bArr3[i96], bArr3[i97 + 2], cArr, i95);
                                                                        i92 = i98;
                                                                        i95++;
                                                                        i96 = i97 + 3;
                                                                    }
                                                                    i94 = i33;
                                                                } else {
                                                                    if (i96 >= i94) {
                                                                        throw new zzer("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    i31 = i97 + 2;
                                                                    zzha.zzc(b12, bArr3[i96], cArr, i95);
                                                                    i92 = i98;
                                                                    i95++;
                                                                }
                                                            }
                                                            i32 = i92;
                                                            i29 = 0;
                                                            zzcuVar4.zzc = new String(cArr, 0, i95);
                                                            zzj = i94;
                                                        }
                                                    }
                                                    i71 = i32;
                                                } else {
                                                    i29 = 0;
                                                    zzj = zzcv.zzh(bArr3, i27, zzcuVar4);
                                                    i71 = i25 | i85;
                                                }
                                                unsafe5.putObject(obj4, j11, zzcuVar4.zzc);
                                                i65 = i12;
                                                bArr8 = bArr3;
                                                zzcuVar12 = zzcuVar4;
                                                obj5 = obj4;
                                                i73 = i24;
                                                unsafe6 = unsafe5;
                                                i69 = i23;
                                                i67 = i19;
                                                i74 = i26;
                                                i76 = 2;
                                                i66 = i29;
                                                i68 = zzj;
                                            } else {
                                                zzcuVar3 = zzcuVar4;
                                                obj3 = obj4;
                                                unsafe4 = unsafe5;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 9:
                                            Object obj10 = obj5;
                                            Unsafe unsafe7 = unsafe6;
                                            i23 = zzq;
                                            i25 = i71;
                                            i26 = i74;
                                            int i101 = i76;
                                            i24 = i79;
                                            if (i82 == i101) {
                                                int i102 = i25 | i85;
                                                Object zzx = zzfpVar.zzx(obj10, i23);
                                                i72 = i72;
                                                zzcuVar12 = zzcuVar;
                                                i68 = zzcv.zzo(zzx, zzfpVar.zzv(i23), bArr, i87, i12, zzcuVar12);
                                                zzfpVar.zzF(obj10, i23, zzx);
                                                i65 = i12;
                                                bArr8 = bArr;
                                                obj5 = obj10;
                                                i73 = i24;
                                                i76 = i101;
                                                unsafe6 = unsafe7;
                                                i67 = i19;
                                                i74 = i26;
                                                i71 = i102;
                                                i69 = i23;
                                                i66 = 0;
                                            } else {
                                                i72 = i72;
                                                i27 = i87;
                                                zzcuVar3 = zzcuVar;
                                                obj3 = obj10;
                                                unsafe4 = unsafe7;
                                                i21 = 1048575;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 10:
                                            Object obj11 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj11;
                                            i23 = zzq;
                                            i34 = i72;
                                            i24 = i79;
                                            i35 = i87;
                                            zzcuVar5 = zzcuVar;
                                            i25 = i71;
                                            i26 = i74;
                                            int i103 = i76;
                                            if (i82 == i103) {
                                                int i104 = i25 | i85;
                                                int zza2 = zzcv.zza(bArr, i35, zzcuVar5);
                                                unsafe4.putObject(obj3, j11, zzcuVar5.zzc);
                                                obj5 = obj3;
                                                unsafe6 = unsafe4;
                                                i65 = i12;
                                                i72 = i34;
                                                bArr8 = bArr;
                                                i76 = i103;
                                                i67 = i19;
                                                i74 = i26;
                                                i68 = zza2;
                                                zzcuVar12 = zzcuVar5;
                                                i71 = i104;
                                                i73 = i24;
                                                i69 = i23;
                                                i66 = 0;
                                            } else {
                                                i72 = i34;
                                                i27 = i35;
                                                zzcuVar3 = zzcuVar5;
                                                i21 = 1048575;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 12:
                                            Object obj12 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj12;
                                            i23 = zzq;
                                            i34 = i72;
                                            i24 = i79;
                                            i35 = i87;
                                            zzcuVar5 = zzcuVar;
                                            if (i82 == 0) {
                                                int zzj7 = zzcv.zzj(bArr, i35, zzcuVar5);
                                                int i105 = zzcuVar5.zza;
                                                zzel zzu = zzfpVar.zzu(i23);
                                                if ((i83 & LinearLayoutManager.INVALID_OFFSET) == 0 || zzu == null || zzu.zza(i105)) {
                                                    int i106 = i74;
                                                    i71 |= i85;
                                                    unsafe4.putInt(obj3, j11, i105);
                                                    obj5 = obj3;
                                                    unsafe6 = unsafe4;
                                                    i65 = i12;
                                                    bArr8 = bArr;
                                                    zzcuVar12 = zzcuVar5;
                                                    i73 = i24;
                                                    i69 = i23;
                                                    i68 = zzj7;
                                                    i67 = i19;
                                                    i74 = i106;
                                                } else {
                                                    zzd(obj3).zzj(i34, Long.valueOf(i105));
                                                    obj5 = obj3;
                                                    unsafe6 = unsafe4;
                                                    i65 = i12;
                                                    bArr8 = bArr;
                                                    zzcuVar12 = zzcuVar5;
                                                    i73 = i24;
                                                    i69 = i23;
                                                    i68 = zzj7;
                                                    i67 = i19;
                                                    i74 = i74;
                                                    i71 = i71;
                                                }
                                                i66 = 0;
                                                i72 = i34;
                                            } else {
                                                i25 = i71;
                                                i26 = i74;
                                                i72 = i34;
                                                i27 = i35;
                                                zzcuVar3 = zzcuVar5;
                                                i21 = 1048575;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 15:
                                            Object obj13 = obj5;
                                            unsafe4 = unsafe6;
                                            obj3 = obj13;
                                            bArr4 = bArr;
                                            i23 = zzq;
                                            i24 = i79;
                                            zzcuVar6 = zzcuVar;
                                            if (i82 == 0) {
                                                i71 |= i85;
                                                zzj2 = zzcv.zzj(bArr4, i87, zzcuVar6);
                                                unsafe4.putInt(obj3, j11, zzdj.zzb(zzcuVar6.zza));
                                                obj5 = obj3;
                                                unsafe6 = unsafe4;
                                                i65 = i12;
                                                i72 = i72;
                                                bArr8 = bArr4;
                                                zzcuVar12 = zzcuVar6;
                                                i68 = zzj2;
                                                i73 = i24;
                                                i69 = i23;
                                                i67 = i19;
                                                i66 = 0;
                                            } else {
                                                i21 = 1048575;
                                                i72 = i72;
                                                zzcuVar3 = zzcuVar6;
                                                i25 = i71;
                                                i26 = i74;
                                                i27 = i87;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        case 16:
                                            bArr4 = bArr;
                                            i23 = zzq;
                                            i24 = i79;
                                            zzcuVar6 = zzcuVar;
                                            if (i82 == 0) {
                                                i71 |= i85;
                                                zzj2 = zzcv.zzm(bArr4, i87, zzcuVar6);
                                                unsafe6.putLong(obj5, j11, zzdj.zzc(zzcuVar6.zzb));
                                                obj5 = obj5;
                                                unsafe6 = unsafe6;
                                                i65 = i12;
                                                bArr8 = bArr4;
                                                zzcuVar12 = zzcuVar6;
                                                i68 = zzj2;
                                                i73 = i24;
                                                i69 = i23;
                                                i67 = i19;
                                                i66 = 0;
                                            } else {
                                                Object obj14 = obj5;
                                                unsafe4 = unsafe6;
                                                obj3 = obj14;
                                                i27 = i87;
                                                zzcuVar3 = zzcuVar6;
                                                i25 = i71;
                                                i26 = i74;
                                                i21 = 1048575;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                        default:
                                            if (i82 == 3) {
                                                i71 |= i85;
                                                Object zzx2 = zzfpVar.zzx(obj5, zzq);
                                                int i107 = zzq;
                                                int zzn = zzcv.zzn(zzx2, zzfpVar.zzv(zzq), bArr, i87, i12, (i79 << 3) | 4, zzcuVar);
                                                zzfpVar.zzF(obj5, i107, zzx2);
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                i73 = i79;
                                                i69 = i107;
                                                i67 = i19;
                                                i66 = 0;
                                                i68 = zzn;
                                                i65 = i12;
                                            } else {
                                                i23 = zzq;
                                                i24 = i79;
                                                Object obj15 = obj5;
                                                unsafe4 = unsafe6;
                                                obj3 = obj15;
                                                zzcuVar3 = zzcuVar;
                                                i25 = i71;
                                                i26 = i74;
                                                i21 = 1048575;
                                                i27 = i87;
                                                unsafe2 = unsafe4;
                                                i17 = i27;
                                                zzcuVar2 = zzcuVar3;
                                                i79 = i24;
                                                i69 = i23;
                                                i74 = i26;
                                                i71 = i25;
                                                i18 = 0;
                                                i14 = i13;
                                                obj2 = obj3;
                                                i15 = i72;
                                                if (i15 != i14) {
                                                }
                                                if (zzfpVar.zzh) {
                                                }
                                                i22 = i79;
                                                unsafe3 = unsafe2;
                                                i65 = i12;
                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                i68 = zzi;
                                                bArr8 = bArr;
                                                zzcuVar12 = zzcuVar;
                                                obj5 = obj2;
                                                i73 = i22;
                                                i67 = i19;
                                                i75 = 1;
                                                i76 = 2;
                                                i72 = i15;
                                                unsafe6 = unsafe3;
                                                i66 = i18;
                                            }
                                            break;
                                    }
                                } else {
                                    Object obj16 = obj5;
                                    Unsafe unsafe8 = unsafe6;
                                    int i108 = i77;
                                    i18 = 0;
                                    i21 = 1048575;
                                    int i109 = zzq;
                                    if (zzr != 27) {
                                        if (zzr > 49) {
                                            bArr5 = bArr;
                                            i36 = i74;
                                            i38 = i108;
                                            unsafe2 = unsafe8;
                                            i41 = i71;
                                            i37 = i72;
                                            i39 = i79;
                                            zzcuVar7 = zzcuVar;
                                            if (zzr != 50) {
                                                obj2 = obj;
                                                Unsafe unsafe9 = zzb;
                                                long j12 = iArr[i109 + 2] & 1048575;
                                                switch (zzr) {
                                                    case 51:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 1) {
                                                            i62 = i59 + 8;
                                                            unsafe9.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzcv.zzq(bArr7, i59))));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                                i14 = i13;
                                                                i17 = i62;
                                                                i15 = i61;
                                                                i69 = i58;
                                                                i74 = i36;
                                                                i71 = i41;
                                                                if (i15 != i14) {
                                                                }
                                                                if (zzfpVar.zzh) {
                                                                }
                                                                i22 = i79;
                                                                unsafe3 = unsafe2;
                                                                i65 = i12;
                                                                zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                                                                i68 = zzi;
                                                                bArr8 = bArr;
                                                                zzcuVar12 = zzcuVar;
                                                                obj5 = obj2;
                                                                i73 = i22;
                                                                i67 = i19;
                                                                i75 = 1;
                                                                i76 = 2;
                                                                i72 = i15;
                                                                unsafe6 = unsafe3;
                                                                i66 = i18;
                                                                break;
                                                            } else {
                                                                i65 = i12;
                                                                bArr8 = bArr7;
                                                                i73 = i79;
                                                                i69 = i58;
                                                                i67 = i19;
                                                                unsafe6 = unsafe2;
                                                                i66 = 0;
                                                                i71 = i41;
                                                                i75 = 1;
                                                                i76 = 2;
                                                                i68 = i62;
                                                                i72 = i61;
                                                                i74 = i36;
                                                                zzcuVar12 = zzcuVar2;
                                                                obj5 = obj2;
                                                                break;
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 52:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 5) {
                                                            i62 = i59 + 4;
                                                            unsafe9.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzcv.zzc(bArr7, i59))));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 53:
                                                    case 54:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 0) {
                                                            i62 = zzcv.zzm(bArr7, i59, zzcuVar2);
                                                            unsafe9.putObject(obj2, j11, Long.valueOf(zzcuVar2.zzb));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 55:
                                                    case 62:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 0) {
                                                            i62 = zzcv.zzj(bArr7, i59, zzcuVar2);
                                                            unsafe9.putObject(obj2, j11, Integer.valueOf(zzcuVar2.zza));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 56:
                                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 1) {
                                                            i62 = i59 + 8;
                                                            unsafe9.putObject(obj2, j11, Long.valueOf(zzcv.zzq(bArr7, i59)));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 57:
                                                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        if (i82 == 5) {
                                                            i62 = i59 + 4;
                                                            unsafe9.putObject(obj2, j11, Integer.valueOf(zzcv.zzc(bArr7, i59)));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 58:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        if (i82 == 0) {
                                                            i62 = zzcv.zzm(bArr7, i59, zzcuVar2);
                                                            i61 = i37;
                                                            unsafe9.putObject(obj2, j11, Boolean.valueOf(zzcuVar2.zzb != 0));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i61 = i37;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 59:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        if (i82 == 2) {
                                                            int zzj8 = zzcv.zzj(bArr7, i59, zzcuVar2);
                                                            int i110 = zzcuVar2.zza;
                                                            if (i110 == 0) {
                                                                unsafe9.putObject(obj2, j11, "");
                                                            } else {
                                                                int i111 = zzj8 + i110;
                                                                if ((i83 & 536870912) != 0 && !zzhe.zzg(bArr7, zzj8, i111)) {
                                                                    throw new zzer("Protocol message had invalid UTF-8.");
                                                                }
                                                                unsafe9.putObject(obj2, j11, new String(bArr7, zzj8, i110, zzep.zza));
                                                                zzj8 = i111;
                                                            }
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            i61 = i37;
                                                            i62 = zzj8;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i61 = i37;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 60:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        if (i82 == 2) {
                                                            Object zzy = zzfpVar.zzy(obj2, i79, i109);
                                                            int zzo = zzcv.zzo(zzy, zzfpVar.zzv(i109), bArr7, i38, i12, zzcuVar);
                                                            bArr7 = bArr7;
                                                            zzfpVar.zzG(obj2, i79, i109, zzy);
                                                            i62 = zzo;
                                                            i61 = i37;
                                                            i58 = i109;
                                                            zzcuVar2 = zzcuVar;
                                                            i59 = i38;
                                                            if (i62 == i59) {
                                                            }
                                                        } else {
                                                            zzcuVar2 = zzcuVar;
                                                            i58 = i109;
                                                            i59 = i38;
                                                            i61 = i37;
                                                            i62 = i59;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        break;
                                                    case 61:
                                                        zzcuVar11 = zzcuVar;
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        c11 = 3;
                                                        if (i82 == 2) {
                                                            int zza3 = zzcv.zza(bArr7, i38, zzcuVar11);
                                                            unsafe9.putObject(obj2, j11, zzcuVar11.zzc);
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            zzcuVar2 = zzcuVar11;
                                                            i62 = zza3;
                                                            i58 = i109;
                                                            i59 = i38;
                                                            i61 = i37;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        zzcuVar2 = zzcuVar11;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 63:
                                                        zzcuVar11 = zzcuVar;
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        c11 = 3;
                                                        i63 = i37;
                                                        if (i82 == 0) {
                                                            int zzj9 = zzcv.zzj(bArr7, i38, zzcuVar11);
                                                            int i112 = zzcuVar11.zza;
                                                            zzel zzu2 = zzfpVar.zzu(i109);
                                                            if (zzu2 == null || zzu2.zza(i112)) {
                                                                i64 = i63;
                                                                unsafe9.putObject(obj2, j11, Integer.valueOf(i112));
                                                                unsafe9.putInt(obj2, j12, i79);
                                                            } else {
                                                                i64 = i63;
                                                                zzd(obj2).zzj(i64, Long.valueOf(i112));
                                                            }
                                                            i62 = zzj9;
                                                            zzcuVar2 = zzcuVar11;
                                                            i58 = i109;
                                                            i59 = i38;
                                                            i61 = i64;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i59 = i38;
                                                        i61 = i63;
                                                        i58 = i109;
                                                        zzcuVar2 = zzcuVar11;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 66:
                                                        zzcuVar11 = zzcuVar;
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        c11 = 3;
                                                        i63 = i37;
                                                        if (i82 == 0) {
                                                            zzj6 = zzcv.zzj(bArr7, i38, zzcuVar11);
                                                            unsafe9.putObject(obj2, j11, Integer.valueOf(zzdj.zzb(zzcuVar11.zza)));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            zzcu zzcuVar13 = zzcuVar11;
                                                            i62 = zzj6;
                                                            zzcuVar2 = zzcuVar13;
                                                            i59 = i38;
                                                            i61 = i63;
                                                            i58 = i109;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        i59 = i38;
                                                        i61 = i63;
                                                        i58 = i109;
                                                        zzcuVar2 = zzcuVar11;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 67:
                                                        zzcuVar11 = zzcuVar;
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        c11 = 3;
                                                        if (i82 == 0) {
                                                            zzj6 = zzcv.zzm(bArr7, i38, zzcuVar11);
                                                            i63 = i37;
                                                            unsafe9.putObject(obj2, j11, Long.valueOf(zzdj.zzc(zzcuVar11.zzb)));
                                                            unsafe9.putInt(obj2, j12, i79);
                                                            zzcu zzcuVar132 = zzcuVar11;
                                                            i62 = zzj6;
                                                            zzcuVar2 = zzcuVar132;
                                                            i59 = i38;
                                                            i61 = i63;
                                                            i58 = i109;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        zzcuVar2 = zzcuVar11;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                    case 68:
                                                        if (i82 == 3) {
                                                            Object zzy2 = zzfpVar.zzy(obj2, i39, i109);
                                                            int zzn2 = zzcv.zzn(zzy2, zzfpVar.zzv(i109), bArr, i38, i12, (i37 & (-8)) | 4, zzcuVar);
                                                            bArr7 = bArr;
                                                            zzfpVar.zzG(obj2, i39, i109, zzy2);
                                                            i62 = zzn2;
                                                            zzcuVar2 = zzcuVar;
                                                            i79 = i39;
                                                            i58 = i109;
                                                            i59 = i38;
                                                            i61 = i37;
                                                            if (i62 == i59) {
                                                            }
                                                        } else {
                                                            bArr7 = bArr5;
                                                            i79 = i39;
                                                            zzcuVar2 = zzcuVar;
                                                            i58 = i109;
                                                            i59 = i38;
                                                            i61 = i37;
                                                            i62 = i59;
                                                            if (i62 == i59) {
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        bArr7 = bArr5;
                                                        i79 = i39;
                                                        zzcuVar2 = zzcuVar;
                                                        i58 = i109;
                                                        i59 = i38;
                                                        i61 = i37;
                                                        i62 = i59;
                                                        if (i62 == i59) {
                                                        }
                                                        break;
                                                }
                                            } else {
                                                if (i82 == 2) {
                                                    Unsafe unsafe10 = zzb;
                                                    Object zzw = zzfpVar.zzw(i109);
                                                    Object object = unsafe10.getObject(obj, j11);
                                                    if (!((zzfg) object).zze()) {
                                                        zzfg zzb3 = zzfg.zza().zzb();
                                                        zzfh.zza(zzb3, object);
                                                        unsafe10.putObject(obj, j11, zzb3);
                                                    }
                                                    throw null;
                                                }
                                                obj2 = obj;
                                            }
                                        } else {
                                            long j13 = i83;
                                            Unsafe unsafe11 = zzb;
                                            zzeo zzeoVar = (zzeo) unsafe11.getObject(obj16, j11);
                                            if (zzeoVar.zzc()) {
                                                unsafe2 = unsafe8;
                                            } else {
                                                int size = zzeoVar.size();
                                                int i113 = size != 0 ? size + size : 10;
                                                unsafe2 = unsafe8;
                                                zzeoVar = zzeoVar.zzd(i113);
                                                unsafe11.putObject(obj16, j11, zzeoVar);
                                            }
                                            zzeo zzeoVar2 = zzeoVar;
                                            switch (zzr) {
                                                case 18:
                                                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                                    bArr6 = bArr;
                                                    i42 = i12;
                                                    i36 = i74;
                                                    i43 = i72;
                                                    i44 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar8 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzdp zzdpVar = (zzdp) zzeoVar2;
                                                        zzj3 = zzcv.zzj(bArr6, i44, zzcuVar8);
                                                        int i114 = zzcuVar8.zza + zzj3;
                                                        while (zzj3 < i114) {
                                                            zzdpVar.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, zzj3)));
                                                            zzj3 += 8;
                                                        }
                                                        if (zzj3 != i114) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i45 = zzj3;
                                                        if (i45 != i44) {
                                                            obj2 = obj;
                                                            i17 = i45;
                                                            i15 = i43;
                                                            zzcuVar2 = zzcuVar8;
                                                            i69 = i109;
                                                            i79 = i39;
                                                            i74 = i36;
                                                            i71 = i41;
                                                            break;
                                                        } else {
                                                            int i115 = i39;
                                                            i72 = i43;
                                                            i73 = i115;
                                                            bArr8 = bArr6;
                                                            i65 = i42;
                                                            zzcuVar12 = zzcuVar8;
                                                            i69 = i109;
                                                            i67 = i19;
                                                            i66 = 0;
                                                            i74 = i36;
                                                            i71 = i41;
                                                            i75 = 1;
                                                            i76 = 2;
                                                            obj5 = obj;
                                                            i68 = i45;
                                                            unsafe6 = unsafe2;
                                                            break;
                                                        }
                                                    } else {
                                                        if (i82 == 1) {
                                                            i45 = i44 + 8;
                                                            zzdp zzdpVar2 = (zzdp) zzeoVar2;
                                                            zzdpVar2.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, i44)));
                                                            while (i45 < i42) {
                                                                int zzj10 = zzcv.zzj(bArr6, i45, zzcuVar8);
                                                                if (i43 == zzcuVar8.zza) {
                                                                    zzdpVar2.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, zzj10)));
                                                                    i45 = zzj10 + 8;
                                                                } else if (i45 != i44) {
                                                                }
                                                            }
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                case 19:
                                                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                    bArr6 = bArr;
                                                    i42 = i12;
                                                    i36 = i74;
                                                    i43 = i72;
                                                    i44 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar8 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzdz zzdzVar = (zzdz) zzeoVar2;
                                                        zzj3 = zzcv.zzj(bArr6, i44, zzcuVar8);
                                                        int i116 = zzcuVar8.zza + zzj3;
                                                        while (zzj3 < i116) {
                                                            zzdzVar.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, zzj3)));
                                                            zzj3 += 4;
                                                        }
                                                        if (zzj3 != i116) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i45 = zzj3;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 5) {
                                                            i45 = i44 + 4;
                                                            zzdz zzdzVar2 = (zzdz) zzeoVar2;
                                                            zzdzVar2.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, i44)));
                                                            while (i45 < i42) {
                                                                int zzj11 = zzcv.zzj(bArr6, i45, zzcuVar8);
                                                                if (i43 == zzcuVar8.zza) {
                                                                    zzdzVar2.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, zzj11)));
                                                                    i45 = zzj11 + 4;
                                                                } else if (i45 != i44) {
                                                                }
                                                            }
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 20:
                                                case 21:
                                                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                case 38:
                                                    bArr6 = bArr;
                                                    i42 = i12;
                                                    i36 = i74;
                                                    i43 = i72;
                                                    i44 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar8 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzfb zzfbVar = (zzfb) zzeoVar2;
                                                        zzj3 = zzcv.zzj(bArr6, i44, zzcuVar8);
                                                        int i117 = zzcuVar8.zza + zzj3;
                                                        while (zzj3 < i117) {
                                                            zzj3 = zzcv.zzm(bArr6, zzj3, zzcuVar8);
                                                            zzfbVar.zzf(zzcuVar8.zzb);
                                                        }
                                                        if (zzj3 != i117) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i45 = zzj3;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 0) {
                                                            zzfb zzfbVar2 = (zzfb) zzeoVar2;
                                                            int zzm2 = zzcv.zzm(bArr6, i44, zzcuVar8);
                                                            zzfbVar2.zzf(zzcuVar8.zzb);
                                                            while (zzm2 < i42) {
                                                                int zzj12 = zzcv.zzj(bArr6, zzm2, zzcuVar8);
                                                                if (i43 == zzcuVar8.zza) {
                                                                    zzm2 = zzcv.zzm(bArr6, zzj12, zzcuVar8);
                                                                    zzfbVar2.zzf(zzcuVar8.zzb);
                                                                } else {
                                                                    i45 = zzm2;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i45 = zzm2;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 22:
                                                case 29:
                                                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                case 43:
                                                    bArr6 = bArr;
                                                    i46 = i12;
                                                    i36 = i74;
                                                    i47 = i72;
                                                    i48 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar9 = zzcuVar;
                                                    if (i82 == 2) {
                                                        i45 = zzcv.zzg(bArr6, i48, zzeoVar2, zzcuVar9);
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 0) {
                                                            int zzl2 = zzcv.zzl(i47, bArr6, i48, i46, zzeoVar2, zzcuVar9);
                                                            i43 = i47;
                                                            i44 = i48;
                                                            i42 = i46;
                                                            zzcuVar8 = zzcuVar9;
                                                            i45 = zzl2;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 23:
                                                case 32:
                                                case 40:
                                                case 46:
                                                    bArr6 = bArr;
                                                    i46 = i12;
                                                    i36 = i74;
                                                    i47 = i72;
                                                    i48 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar9 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzfb zzfbVar3 = (zzfb) zzeoVar2;
                                                        zzj4 = zzcv.zzj(bArr6, i48, zzcuVar9);
                                                        int i118 = zzcuVar9.zza + zzj4;
                                                        while (zzj4 < i118) {
                                                            zzfbVar3.zzf(zzcv.zzq(bArr6, zzj4));
                                                            zzj4 += 8;
                                                        }
                                                        if (zzj4 != i118) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i44 = i48;
                                                        i45 = zzj4;
                                                        zzcuVar8 = zzcuVar9;
                                                        i42 = i46;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 1) {
                                                            i49 = i48 + 8;
                                                            zzfb zzfbVar4 = (zzfb) zzeoVar2;
                                                            zzfbVar4.zzf(zzcv.zzq(bArr6, i48));
                                                            while (i49 < i46) {
                                                                int zzj13 = zzcv.zzj(bArr6, i49, zzcuVar9);
                                                                if (i47 == zzcuVar9.zza) {
                                                                    zzfbVar4.zzf(zzcv.zzq(bArr6, zzj13));
                                                                    i49 = zzj13 + 8;
                                                                } else {
                                                                    i44 = i48;
                                                                    i42 = i46;
                                                                    i45 = i49;
                                                                    zzcuVar8 = zzcuVar9;
                                                                    i43 = i47;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i44 = i48;
                                                            i42 = i46;
                                                            i45 = i49;
                                                            zzcuVar8 = zzcuVar9;
                                                            i43 = i47;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 24:
                                                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                                case 41:
                                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                    bArr6 = bArr;
                                                    i46 = i12;
                                                    i36 = i74;
                                                    i47 = i72;
                                                    i48 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar9 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzei zzeiVar = (zzei) zzeoVar2;
                                                        zzj4 = zzcv.zzj(bArr6, i48, zzcuVar9);
                                                        int i119 = zzcuVar9.zza + zzj4;
                                                        while (zzj4 < i119) {
                                                            zzeiVar.zzg(zzcv.zzc(bArr6, zzj4));
                                                            zzj4 += 4;
                                                        }
                                                        if (zzj4 != i119) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i44 = i48;
                                                        i45 = zzj4;
                                                        zzcuVar8 = zzcuVar9;
                                                        i42 = i46;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 5) {
                                                            i49 = i48 + 4;
                                                            zzei zzeiVar2 = (zzei) zzeoVar2;
                                                            zzeiVar2.zzg(zzcv.zzc(bArr6, i48));
                                                            while (i49 < i46) {
                                                                int zzj14 = zzcv.zzj(bArr6, i49, zzcuVar9);
                                                                if (i47 == zzcuVar9.zza) {
                                                                    zzeiVar2.zzg(zzcv.zzc(bArr6, zzj14));
                                                                    i49 = zzj14 + 4;
                                                                } else {
                                                                    i44 = i48;
                                                                    i42 = i46;
                                                                    i45 = i49;
                                                                    zzcuVar8 = zzcuVar9;
                                                                    i43 = i47;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i44 = i48;
                                                            i42 = i46;
                                                            i45 = i49;
                                                            zzcuVar8 = zzcuVar9;
                                                            i43 = i47;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                                case 42:
                                                    bArr6 = bArr;
                                                    i46 = i12;
                                                    i36 = i74;
                                                    i47 = i72;
                                                    i48 = i108;
                                                    i39 = i79;
                                                    i41 = i71;
                                                    zzcuVar9 = zzcuVar;
                                                    if (i82 == 2) {
                                                        zzcw zzcwVar = (zzcw) zzeoVar2;
                                                        zzj4 = zzcv.zzj(bArr6, i48, zzcuVar9);
                                                        int i120 = zzcuVar9.zza + zzj4;
                                                        while (zzj4 < i120) {
                                                            zzj4 = zzcv.zzm(bArr6, zzj4, zzcuVar9);
                                                            zzcwVar.zze(zzcuVar9.zzb != 0);
                                                        }
                                                        if (zzj4 != i120) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i44 = i48;
                                                        i45 = zzj4;
                                                        zzcuVar8 = zzcuVar9;
                                                        i42 = i46;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 0) {
                                                            zzcw zzcwVar2 = (zzcw) zzeoVar2;
                                                            int zzm3 = zzcv.zzm(bArr6, i48, zzcuVar9);
                                                            zzcwVar2.zze(zzcuVar9.zzb != 0);
                                                            while (zzm3 < i46) {
                                                                int zzj15 = zzcv.zzj(bArr6, zzm3, zzcuVar9);
                                                                if (i47 == zzcuVar9.zza) {
                                                                    zzm3 = zzcv.zzm(bArr6, zzj15, zzcuVar9);
                                                                    zzcwVar2.zze(zzcuVar9.zzb != 0);
                                                                } else {
                                                                    i44 = i48;
                                                                    i42 = i46;
                                                                    i45 = zzm3;
                                                                    zzcuVar8 = zzcuVar9;
                                                                    i43 = i47;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i44 = i48;
                                                            i42 = i46;
                                                            i45 = zzm3;
                                                            zzcuVar8 = zzcuVar9;
                                                            i43 = i47;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                                    bArr6 = bArr;
                                                    i46 = i12;
                                                    i36 = i74;
                                                    i47 = i72;
                                                    i48 = i108;
                                                    i41 = i71;
                                                    zzcuVar9 = zzcuVar;
                                                    if (i82 != 2) {
                                                        i39 = i79;
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    } else if ((j13 & 536870912) == 0) {
                                                        i45 = zzcv.zzj(bArr6, i48, zzcuVar9);
                                                        int i121 = zzcuVar9.zza;
                                                        if (i121 < 0) {
                                                            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i121 == 0) {
                                                            zzeoVar2.add("");
                                                        } else {
                                                            zzeoVar2.add(new String(bArr6, i45, i121, zzep.zza));
                                                            i45 += i121;
                                                        }
                                                        while (i45 < i46) {
                                                            int zzj16 = zzcv.zzj(bArr6, i45, zzcuVar9);
                                                            if (i47 == zzcuVar9.zza) {
                                                                i45 = zzcv.zzj(bArr6, zzj16, zzcuVar9);
                                                                int i122 = zzcuVar9.zza;
                                                                if (i122 < 0) {
                                                                    throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                                if (i122 == 0) {
                                                                    zzeoVar2.add("");
                                                                } else {
                                                                    zzeoVar2.add(new String(bArr6, i45, i122, zzep.zza));
                                                                    i45 += i122;
                                                                }
                                                            } else {
                                                                i44 = i48;
                                                                i42 = i46;
                                                                i39 = i79;
                                                                zzcuVar8 = zzcuVar9;
                                                                i43 = i47;
                                                                if (i45 != i44) {
                                                                }
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        i39 = i79;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        i45 = zzcv.zzj(bArr6, i48, zzcuVar9);
                                                        int i123 = zzcuVar9.zza;
                                                        if (i123 < 0) {
                                                            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i123 == 0) {
                                                            zzeoVar2.add("");
                                                            i39 = i79;
                                                        } else {
                                                            int i124 = i45 + i123;
                                                            if (!zzhe.zzg(bArr6, i45, i124)) {
                                                                throw new zzer("Protocol message had invalid UTF-8.");
                                                            }
                                                            i39 = i79;
                                                            zzeoVar2.add(new String(bArr6, i45, i123, zzep.zza));
                                                            i45 = i124;
                                                        }
                                                        while (i45 < i46) {
                                                            int zzj17 = zzcv.zzj(bArr6, i45, zzcuVar9);
                                                            if (i47 == zzcuVar9.zza) {
                                                                i45 = zzcv.zzj(bArr6, zzj17, zzcuVar9);
                                                                int i125 = zzcuVar9.zza;
                                                                if (i125 < 0) {
                                                                    throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                                if (i125 == 0) {
                                                                    zzeoVar2.add("");
                                                                } else {
                                                                    int i126 = i45 + i125;
                                                                    if (!zzhe.zzg(bArr6, i45, i126)) {
                                                                        throw new zzer("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    zzeoVar2.add(new String(bArr6, i45, i125, zzep.zza));
                                                                    i45 = i126;
                                                                }
                                                            } else {
                                                                i44 = i48;
                                                                i42 = i46;
                                                                zzcuVar8 = zzcuVar9;
                                                                i43 = i47;
                                                                if (i45 != i44) {
                                                                }
                                                            }
                                                        }
                                                        i44 = i48;
                                                        i42 = i46;
                                                        zzcuVar8 = zzcuVar9;
                                                        i43 = i47;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                                    bArr6 = bArr;
                                                    zzcuVar10 = zzcuVar;
                                                    i36 = i74;
                                                    i41 = i71;
                                                    if (i82 == 2) {
                                                        zzfpVar = this;
                                                        i109 = i109;
                                                        i45 = zzcv.zzf(zzfpVar.zzv(i109), i72, bArr6, i108, i12, zzeoVar2, zzcuVar10);
                                                        bArr6 = bArr6;
                                                        i44 = i108;
                                                        i43 = i72;
                                                        i39 = i79;
                                                        zzcuVar8 = zzcuVar10;
                                                        i42 = i12;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        zzfpVar = this;
                                                        i109 = i109;
                                                        i44 = i108;
                                                        i42 = i12;
                                                        i43 = i72;
                                                        i39 = i79;
                                                        zzcuVar8 = zzcuVar10;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 28:
                                                    bArr6 = bArr;
                                                    zzcuVar10 = zzcuVar;
                                                    i36 = i74;
                                                    i41 = i71;
                                                    if (i82 == 2) {
                                                        int zzj18 = zzcv.zzj(bArr6, i108, zzcuVar10);
                                                        int i127 = zzcuVar10.zza;
                                                        if (i127 < 0) {
                                                            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i127 > bArr6.length - zzj18) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i127 == 0) {
                                                            zzeoVar2.add(zzdf.zzb);
                                                        } else {
                                                            zzeoVar2.add(zzdf.zzr(bArr6, zzj18, i127));
                                                            zzj18 += i127;
                                                        }
                                                        while (zzj18 < i12) {
                                                            int zzj19 = zzcv.zzj(bArr6, zzj18, zzcuVar10);
                                                            if (i72 == zzcuVar10.zza) {
                                                                zzj18 = zzcv.zzj(bArr6, zzj19, zzcuVar10);
                                                                int i128 = zzcuVar10.zza;
                                                                if (i128 < 0) {
                                                                    throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                                if (i128 > bArr6.length - zzj18) {
                                                                    throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                }
                                                                if (i128 == 0) {
                                                                    zzeoVar2.add(zzdf.zzb);
                                                                } else {
                                                                    zzeoVar2.add(zzdf.zzr(bArr6, zzj18, i128));
                                                                    zzj18 += i128;
                                                                }
                                                            } else {
                                                                i45 = zzj18;
                                                                i44 = i108;
                                                                i42 = i12;
                                                                i43 = i72;
                                                                i109 = i109;
                                                                zzfpVar = this;
                                                                i39 = i79;
                                                                zzcuVar8 = zzcuVar10;
                                                                if (i45 != i44) {
                                                                }
                                                            }
                                                        }
                                                        i45 = zzj18;
                                                        i44 = i108;
                                                        i42 = i12;
                                                        i43 = i72;
                                                        i109 = i109;
                                                        zzfpVar = this;
                                                        i39 = i79;
                                                        zzcuVar8 = zzcuVar10;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        zzfpVar = this;
                                                        i44 = i108;
                                                        i42 = i12;
                                                        i43 = i72;
                                                        i109 = i109;
                                                        i39 = i79;
                                                        zzcuVar8 = zzcuVar10;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                    bArr6 = bArr;
                                                    i51 = i12;
                                                    zzcuVar10 = zzcuVar;
                                                    i36 = i74;
                                                    i52 = i72;
                                                    i53 = i108;
                                                    i41 = i71;
                                                    if (i82 == 2) {
                                                        zzl = zzcv.zzg(bArr6, i53, zzeoVar2, zzcuVar10);
                                                        i55 = i52;
                                                        i54 = i53;
                                                    } else if (i82 == 0) {
                                                        i54 = i53;
                                                        i55 = i52;
                                                        zzl = zzcv.zzl(i52, bArr6, i54, i51, zzeoVar2, zzcuVar10);
                                                    } else {
                                                        zzfpVar = this;
                                                        i43 = i52;
                                                        i39 = i79;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    zzel zzu3 = zzfpVar.zzu(i109);
                                                    zzgs zzgsVar2 = zzfpVar.zzl;
                                                    int i129 = zzgg.zza;
                                                    if (zzu3 == null) {
                                                        i56 = zzl;
                                                        i57 = i109;
                                                    } else if (zzeoVar2 != null) {
                                                        int size2 = zzeoVar2.size();
                                                        i56 = zzl;
                                                        Object obj17 = null;
                                                        int i130 = 0;
                                                        int i131 = 0;
                                                        while (i130 < size2) {
                                                            Integer num = (Integer) zzeoVar2.get(i130);
                                                            int i132 = i109;
                                                            int intValue = num.intValue();
                                                            if (zzu3.zza(intValue)) {
                                                                if (i130 != i131) {
                                                                    zzeoVar2.set(i131, num);
                                                                }
                                                                i131++;
                                                            } else {
                                                                obj17 = zzgg.zzn(obj16, i79, intValue, obj17, zzgsVar2);
                                                            }
                                                            i130++;
                                                            i109 = i132;
                                                        }
                                                        i57 = i109;
                                                        if (i131 != size2) {
                                                            zzeoVar2.subList(i131, size2).clear();
                                                        }
                                                    } else {
                                                        i56 = zzl;
                                                        i57 = i109;
                                                        Iterator it = zzeoVar2.iterator();
                                                        Object obj18 = null;
                                                        while (it.hasNext()) {
                                                            int intValue2 = ((Integer) it.next()).intValue();
                                                            if (!zzu3.zza(intValue2)) {
                                                                obj18 = zzgg.zzn(obj16, i79, intValue2, obj18, zzgsVar2);
                                                                it.remove();
                                                            }
                                                        }
                                                    }
                                                    zzfpVar = this;
                                                    i45 = i56;
                                                    i44 = i54;
                                                    i42 = i51;
                                                    i43 = i55;
                                                    i109 = i57;
                                                    i39 = i79;
                                                    zzcuVar8 = zzcuVar10;
                                                    if (i45 != i44) {
                                                    }
                                                    break;
                                                case 33:
                                                case 47:
                                                    bArr6 = bArr;
                                                    i51 = i12;
                                                    zzcuVar10 = zzcuVar;
                                                    i36 = i74;
                                                    i52 = i72;
                                                    i53 = i108;
                                                    i41 = i71;
                                                    if (i82 == 2) {
                                                        zzei zzeiVar3 = (zzei) zzeoVar2;
                                                        zzj5 = zzcv.zzj(bArr6, i53, zzcuVar10);
                                                        int i133 = zzcuVar10.zza + zzj5;
                                                        while (zzj5 < i133) {
                                                            zzj5 = zzcv.zzj(bArr6, zzj5, zzcuVar10);
                                                            zzeiVar3.zzg(zzdj.zzb(zzcuVar10.zza));
                                                        }
                                                        if (zzj5 != i133) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i45 = zzj5;
                                                        i43 = i52;
                                                        i39 = i79;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        if (i82 == 0) {
                                                            zzei zzeiVar4 = (zzei) zzeoVar2;
                                                            i45 = zzcv.zzj(bArr6, i53, zzcuVar10);
                                                            zzeiVar4.zzg(zzdj.zzb(zzcuVar10.zza));
                                                            while (i45 < i51) {
                                                                int zzj20 = zzcv.zzj(bArr6, i45, zzcuVar10);
                                                                if (i52 == zzcuVar10.zza) {
                                                                    i45 = zzcv.zzj(bArr6, zzj20, zzcuVar10);
                                                                    zzeiVar4.zzg(zzdj.zzb(zzcuVar10.zza));
                                                                } else {
                                                                    i43 = i52;
                                                                    i39 = i79;
                                                                    i44 = i53;
                                                                    i42 = i51;
                                                                    zzcuVar8 = zzcuVar10;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i43 = i52;
                                                            i39 = i79;
                                                            i44 = i53;
                                                            i42 = i51;
                                                            zzcuVar8 = zzcuVar10;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i43 = i52;
                                                        i39 = i79;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                case 34:
                                                case 48:
                                                    bArr6 = bArr;
                                                    i51 = i12;
                                                    zzcuVar10 = zzcuVar;
                                                    i52 = i72;
                                                    i53 = i108;
                                                    if (i82 == 2) {
                                                        zzfb zzfbVar5 = (zzfb) zzeoVar2;
                                                        zzj5 = zzcv.zzj(bArr6, i53, zzcuVar10);
                                                        int i134 = zzcuVar10.zza + zzj5;
                                                        while (zzj5 < i134) {
                                                            zzj5 = zzcv.zzm(bArr6, zzj5, zzcuVar10);
                                                            zzfbVar5.zzf(zzdj.zzc(zzcuVar10.zzb));
                                                            i74 = i74;
                                                            i71 = i71;
                                                        }
                                                        i41 = i71;
                                                        i36 = i74;
                                                        if (zzj5 != i134) {
                                                            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        i45 = zzj5;
                                                        i43 = i52;
                                                        i39 = i79;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        i41 = i71;
                                                        i36 = i74;
                                                        if (i82 == 0) {
                                                            zzfb zzfbVar6 = (zzfb) zzeoVar2;
                                                            i45 = zzcv.zzm(bArr6, i53, zzcuVar10);
                                                            zzfbVar6.zzf(zzdj.zzc(zzcuVar10.zzb));
                                                            while (i45 < i51) {
                                                                int zzj21 = zzcv.zzj(bArr6, i45, zzcuVar10);
                                                                if (i52 == zzcuVar10.zza) {
                                                                    i45 = zzcv.zzm(bArr6, zzj21, zzcuVar10);
                                                                    zzfbVar6.zzf(zzdj.zzc(zzcuVar10.zzb));
                                                                } else {
                                                                    i43 = i52;
                                                                    i39 = i79;
                                                                    i44 = i53;
                                                                    i42 = i51;
                                                                    zzcuVar8 = zzcuVar10;
                                                                    if (i45 != i44) {
                                                                    }
                                                                }
                                                            }
                                                            i43 = i52;
                                                            i39 = i79;
                                                            i44 = i53;
                                                            i42 = i51;
                                                            zzcuVar8 = zzcuVar10;
                                                            if (i45 != i44) {
                                                            }
                                                        }
                                                        i43 = i52;
                                                        i39 = i79;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (i82 == 3) {
                                                        int i135 = (i72 & (-8)) | 4;
                                                        zzge zzv = zzfpVar.zzv(i109);
                                                        bArr6 = bArr;
                                                        i51 = i12;
                                                        zzcuVar10 = zzcuVar;
                                                        int zzd = zzcv.zzd(zzv, bArr6, i108, i51, i135, zzcuVar10);
                                                        i53 = i108;
                                                        zzeoVar2.add(zzcuVar10.zzc);
                                                        while (zzd < i51) {
                                                            int zzj22 = zzcv.zzj(bArr6, zzd, zzcuVar10);
                                                            zzge zzgeVar = zzv;
                                                            if (i72 == zzcuVar10.zza) {
                                                                zzv = zzgeVar;
                                                                zzd = zzcv.zzd(zzv, bArr6, zzj22, i51, i135, zzcuVar10);
                                                                zzeoVar2.add(zzcuVar10.zzc);
                                                            } else {
                                                                i43 = i72;
                                                                i45 = zzd;
                                                                i39 = i79;
                                                                i41 = i71;
                                                                i36 = i74;
                                                                i44 = i53;
                                                                i42 = i51;
                                                                zzcuVar8 = zzcuVar10;
                                                                if (i45 != i44) {
                                                                }
                                                            }
                                                        }
                                                        i43 = i72;
                                                        i45 = zzd;
                                                        i39 = i79;
                                                        i41 = i71;
                                                        i36 = i74;
                                                        i44 = i53;
                                                        i42 = i51;
                                                        zzcuVar8 = zzcuVar10;
                                                        if (i45 != i44) {
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                        i42 = i12;
                                                        i36 = i74;
                                                        i43 = i72;
                                                        i44 = i108;
                                                        i39 = i79;
                                                        i41 = i71;
                                                        zzcuVar8 = zzcuVar;
                                                        i45 = i44;
                                                        if (i45 != i44) {
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    } else if (i82 == 2) {
                                        zzeo zzeoVar3 = (zzeo) unsafe8.getObject(obj16, j11);
                                        if (!zzeoVar3.zzc()) {
                                            int size3 = zzeoVar3.size();
                                            zzeoVar3 = zzeoVar3.zzd(size3 != 0 ? size3 + size3 : 10);
                                            unsafe8.putObject(obj16, j11, zzeoVar3);
                                        }
                                        bArr8 = bArr;
                                        i65 = i12;
                                        zzcuVar12 = zzcuVar;
                                        i68 = zzcv.zzf(zzfpVar.zzv(i109), i72, bArr8, i108, i12, zzeoVar3, zzcuVar);
                                        unsafe6 = unsafe8;
                                        obj5 = obj;
                                        i73 = i79;
                                        i69 = i109;
                                        i67 = i19;
                                        i66 = 0;
                                    } else {
                                        obj2 = obj16;
                                        unsafe2 = unsafe8;
                                        i36 = i74;
                                        i37 = i72;
                                        i38 = i108;
                                        bArr5 = bArr;
                                        i39 = i79;
                                        i41 = i71;
                                        zzcuVar7 = zzcuVar;
                                    }
                                    i15 = i37;
                                    zzcuVar2 = zzcuVar7;
                                    i17 = i38;
                                    i69 = i109;
                                    i79 = i39;
                                    i74 = i36;
                                    i71 = i41;
                                }
                            }
                            i14 = i13;
                            if (i15 != i14) {
                            }
                            if (zzfpVar.zzh) {
                            }
                            i22 = i79;
                            unsafe3 = unsafe2;
                            i65 = i12;
                            zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                            i68 = zzi;
                            bArr8 = bArr;
                            zzcuVar12 = zzcuVar;
                            obj5 = obj2;
                            i73 = i22;
                            i67 = i19;
                            i75 = 1;
                            i76 = 2;
                            i72 = i15;
                            unsafe6 = unsafe3;
                            i66 = i18;
                        }
                        zzq = i67;
                        if (zzq != i67) {
                        }
                        i14 = i13;
                        if (i15 != i14) {
                        }
                        if (zzfpVar.zzh) {
                        }
                        i22 = i79;
                        unsafe3 = unsafe2;
                        i65 = i12;
                        zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                        i68 = zzi;
                        bArr8 = bArr;
                        zzcuVar12 = zzcuVar;
                        obj5 = obj2;
                        i73 = i22;
                        i67 = i19;
                        i75 = 1;
                        i76 = 2;
                        i72 = i15;
                        unsafe6 = unsafe3;
                        i66 = i18;
                    } else {
                        if (i79 >= zzfpVar.zze && i79 <= zzfpVar.zzf) {
                            zzq = zzfpVar.zzq(i79, i66);
                            if (zzq != i67) {
                            }
                            i14 = i13;
                            if (i15 != i14) {
                            }
                            if (zzfpVar.zzh) {
                            }
                            i22 = i79;
                            unsafe3 = unsafe2;
                            i65 = i12;
                            zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                            i68 = zzi;
                            bArr8 = bArr;
                            zzcuVar12 = zzcuVar;
                            obj5 = obj2;
                            i73 = i22;
                            i67 = i19;
                            i75 = 1;
                            i76 = 2;
                            i72 = i15;
                            unsafe6 = unsafe3;
                            i66 = i18;
                        }
                        zzq = i67;
                        if (zzq != i67) {
                        }
                        i14 = i13;
                        if (i15 != i14) {
                        }
                        if (zzfpVar.zzh) {
                        }
                        i22 = i79;
                        unsafe3 = unsafe2;
                        i65 = i12;
                        zzi = zzcv.zzi(i15, bArr, i17, i65, zzd(obj2), zzcuVar);
                        i68 = zzi;
                        bArr8 = bArr;
                        zzcuVar12 = zzcuVar;
                        obj5 = obj2;
                        i73 = i22;
                        i67 = i19;
                        i75 = 1;
                        i76 = 2;
                        i72 = i15;
                        unsafe6 = unsafe3;
                        i66 = i18;
                    }
                } else {
                    i14 = i13;
                    unsafe = unsafe6;
                    obj2 = obj5;
                    i15 = i72;
                    i16 = 1048575;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzeh) {
                zzeh zzehVar = (zzeh) obj;
                zzehVar.zzW(Integer.MAX_VALUE);
                zzehVar.zza = 0;
                zzehVar.zzU();
            }
            int[] iArr = this.zzc;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int zzs = zzs(i11);
                int i12 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j11 = i12;
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
                                ((zzeo) zzgz.zzf(obj, j11)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzfg) object).zzc();
                                    unsafe.putObject(obj, j11, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i11], i11)) {
                        zzv(i11).zzf(zzb.getObject(obj, j11));
                    }
                }
                if (zzI(obj, i11)) {
                    zzv(i11).zzf(zzb.getObject(obj, j11));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzs = zzs(i11);
            int i12 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i11)) {
                        zzgz.zzo(obj, j11, zzgz.zza(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i11)) {
                        zzgz.zzp(obj, j11, zzgz.zzb(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i11)) {
                        zzgz.zzm(obj, j11, zzgz.zzw(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i11);
                    break;
                case 10:
                    if (zzI(obj2, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i11)) {
                        zzgz.zzq(obj, j11, zzgz.zzc(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i11)) {
                        zzgz.zzr(obj, j11, zzgz.zzd(obj2, j11));
                        zzD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i11);
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
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj, j11);
                    zzeo zzeoVar2 = (zzeo) zzgz.zzf(obj2, j11);
                    int size = zzeoVar.size();
                    int size2 = zzeoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVar.zzc()) {
                            zzeoVar = zzeoVar.zzd(size2 + size);
                        }
                        zzeoVar.addAll(zzeoVar2);
                    }
                    if (size > 0) {
                        zzeoVar2 = zzeoVar;
                    }
                    zzgz.zzs(obj, j11, zzeoVar2);
                    break;
                case 50:
                    int i14 = zzgg.zza;
                    zzgz.zzs(obj, j11, zzfh.zza(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11)));
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
                    if (zzM(obj2, i13, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzE(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzM(obj2, i13, i11)) {
                        zzgz.zzs(obj, j11, zzgz.zzf(obj2, j11));
                        zzE(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i11);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws IOException {
        zzc(obj, bArr, i11, i12, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzhh zzhhVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i11;
        Map.Entry entry2;
        int i12;
        int i13;
        int i14;
        zzfp<T> zzfpVar = this;
        if (zzfpVar.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            if (!zzdxVar.zza.isEmpty()) {
                Iterator zzf = zzdxVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzfpVar.zzc;
                Unsafe unsafe = zzb;
                int i15 = 1048575;
                int i16 = 1048575;
                i11 = 0;
                int i17 = 0;
                while (i11 < iArr.length) {
                    int zzs = zzfpVar.zzs(i11);
                    int[] iArr2 = zzfpVar.zzc;
                    int zzr = zzr(zzs);
                    int i18 = iArr2[i11];
                    if (zzr <= 17) {
                        int i19 = iArr2[i11 + 2];
                        int i21 = i19 & i15;
                        if (i21 != i16) {
                            i17 = i21 == i15 ? 0 : unsafe.getInt(obj, i21);
                            i16 = i21;
                        }
                        int i22 = 1 << (i19 >>> 20);
                        entry2 = entry;
                        i12 = i16;
                        i13 = i17;
                        i14 = i22;
                    } else {
                        entry2 = entry;
                        i12 = i16;
                        i13 = i17;
                        i14 = 0;
                    }
                    while (entry2 != null && ((zzee) entry2.getKey()).zza <= i18) {
                        zzfpVar.zzm.zzb(zzhhVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j11 = zzs & i15;
                    switch (zzr) {
                        case 0:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzf(i18, zzgz.zza(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 1:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzo(i18, zzgz.zzb(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 2:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzt(i18, unsafe.getLong(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 3:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzK(i18, unsafe.getLong(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 4:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzr(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 5:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzm(i18, unsafe.getLong(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 6:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzk(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 7:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzb(i18, zzgz.zzw(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 8:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzO(i18, unsafe.getObject(obj, j11), zzhhVar);
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 9:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzv(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 10:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzd(i18, (zzdf) unsafe.getObject(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 11:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzI(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 12:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzi(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 13:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzx(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 14:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzz(i18, unsafe.getLong(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 15:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzB(i18, unsafe.getInt(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 16:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzD(i18, unsafe.getLong(obj, j11));
                            }
                            zzfpVar = this;
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 17:
                            if (zzfpVar.zzJ(obj, i11, i12, i13, i14)) {
                                zzhhVar.zzq(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 18:
                            zzgg.zzr(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 19:
                            zzgg.zzv(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 20:
                            zzgg.zzx(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 21:
                            zzgg.zzD(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 22:
                            zzgg.zzw(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 23:
                            zzgg.zzu(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 24:
                            zzgg.zzt(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            zzgg.zzq(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int i23 = zzfpVar.zzc[i11];
                            List list = (List) unsafe.getObject(obj, j11);
                            int i24 = zzgg.zza;
                            if (list != null && !list.isEmpty()) {
                                zzhhVar.zzH(i23, list);
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            int i25 = zzfpVar.zzc[i11];
                            List list2 = (List) unsafe.getObject(obj, j11);
                            zzge zzv = zzfpVar.zzv(i11);
                            int i26 = zzgg.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i27 = 0; i27 < list2.size(); i27++) {
                                    ((zzdo) zzhhVar).zzv(i25, list2.get(i27), zzv);
                                }
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                            break;
                        case 28:
                            int i28 = zzfpVar.zzc[i11];
                            List list3 = (List) unsafe.getObject(obj, j11);
                            int i29 = zzgg.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzhhVar.zze(i28, list3);
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                            break;
                        case 29:
                            zzgg.zzC(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            zzgg.zzs(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zzgg.zzy(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 32:
                            zzgg.zzz(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 33:
                            zzgg.zzA(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 34:
                            zzgg.zzB(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, false);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            zzgg.zzr(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            zzgg.zzv(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            zzgg.zzx(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 38:
                            zzgg.zzD(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            zzgg.zzw(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 40:
                            zzgg.zzu(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 41:
                            zzgg.zzt(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 42:
                            zzgg.zzq(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 43:
                            zzgg.zzC(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            zzgg.zzs(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            zzgg.zzy(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 46:
                            zzgg.zzz(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 47:
                            zzgg.zzA(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 48:
                            zzgg.zzB(zzfpVar.zzc[i11], (List) unsafe.getObject(obj, j11), zzhhVar, true);
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 49:
                            int i31 = zzfpVar.zzc[i11];
                            List list4 = (List) unsafe.getObject(obj, j11);
                            zzge zzv2 = zzfpVar.zzv(i11);
                            int i32 = zzgg.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i33 = 0; i33 < list4.size(); i33++) {
                                    ((zzdo) zzhhVar).zzq(i31, list4.get(i33), zzv2);
                                }
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j11) != null) {
                                throw null;
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 51:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzf(i18, zzm(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 52:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzo(i18, zzn(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 53:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzt(i18, zzt(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 54:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzK(i18, zzt(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 55:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzr(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 56:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzm(i18, zzt(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 57:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzk(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 58:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzb(i18, zzN(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 59:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzO(i18, unsafe.getObject(obj, j11), zzhhVar);
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 60:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzv(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 61:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzd(i18, (zzdf) unsafe.getObject(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 62:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzI(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 63:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzi(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzx(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzz(i18, zzt(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 66:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzB(i18, zzo(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 67:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzD(i18, zzt(obj, j11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        case 68:
                            if (zzfpVar.zzM(obj, i18, i11)) {
                                zzhhVar.zzq(i18, unsafe.getObject(obj, j11), zzfpVar.zzv(i11));
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        default:
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzfpVar.zzm.zzb(zzhhVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzeh) obj).zzc.zzl(zzhhVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzfpVar.zzc;
        Unsafe unsafe2 = zzb;
        int i152 = 1048575;
        int i162 = 1048575;
        i11 = 0;
        int i172 = 0;
        while (i11 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzeh) obj).zzc.zzl(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzs = zzs(i11);
            long j11 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i11) && Double.doubleToLongBits(zzgz.zza(obj, j11)) == Double.doubleToLongBits(zzgz.zza(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i11) && Float.floatToIntBits(zzgz.zzb(obj, j11)) == Float.floatToIntBits(zzgz.zzb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i11) && zzgz.zzd(obj, j11) == zzgz.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i11) && zzgz.zzd(obj, j11) == zzgz.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i11) && zzgz.zzd(obj, j11) == zzgz.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i11) && zzgz.zzw(obj, j11) == zzgz.zzw(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i11) && zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i11) && zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i11) && zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i11) && zzgz.zzd(obj, j11) == zzgz.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i11) && zzgz.zzc(obj, j11) == zzgz.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i11) && zzgz.zzd(obj, j11) == zzgz.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i11) && zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
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
                    zzE = zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11));
                    break;
                case 50:
                    zzE = zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11));
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
                    long zzp = zzp(i11) & 1048575;
                    if (zzgz.zzc(obj, zzp) == zzgz.zzc(obj2, zzp) && zzgg.zzE(zzgz.zzf(obj, j11), zzgz.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i13];
            int i17 = iArr2[i16];
            int zzs = zzs(i16);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj2, i16, i11, i12, i21)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i17, i16) && !zzK(obj2, zzs, zzv(i16))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzfg) zzgz.zzf(obj2, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(obj2, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzge zzv = zzv(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzv.zzk(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj2, i16, i11, i12, i21) && !zzK(obj2, zzs, zzv(i16))) {
                return false;
            }
            i13++;
            obj = obj2;
            i15 = i11;
            i14 = i12;
        }
        return !this.zzh || ((zzed) obj).zzb.zzk();
    }
}
