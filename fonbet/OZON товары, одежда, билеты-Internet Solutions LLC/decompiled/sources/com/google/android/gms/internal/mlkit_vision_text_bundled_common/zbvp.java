package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import N3.C3660k;
import TY.a;
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
final class zbvp<T> implements zbvx<T> {
    private static final int[] zba = new int[0];
    private static final Unsafe zbb = zbws.zbg();
    private final int[] zbc;
    private final Object[] zbd;
    private final int zbe;
    private final int zbf;
    private final zbvm zbg;
    private final boolean zbh;
    private final int[] zbi;
    private final int zbj;
    private final int zbk;
    private final zbwl zbl;
    private final zbtq zbm;

    private zbvp(int[] iArr, Object[] objArr, int i11, int i12, zbvm zbvmVar, boolean z11, int[] iArr2, int i13, int i14, zbvs zbvsVar, zbuy zbuyVar, zbwl zbwlVar, zbtq zbtqVar, zbvh zbvhVar) {
        this.zbc = iArr;
        this.zbd = objArr;
        this.zbe = i11;
        this.zbf = i12;
        boolean z12 = false;
        if (zbtqVar != null && (zbvmVar instanceof zbub)) {
            z12 = true;
        }
        this.zbh = z12;
        this.zbi = iArr2;
        this.zbj = i13;
        this.zbk = i14;
        this.zbl = zbwlVar;
        this.zbm = zbtqVar;
        this.zbg = zbvmVar;
    }

    private static void zbA(Object obj) {
        if (!zbL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zbB(Object obj, Object obj2, int i11) {
        if (zbI(obj2, i11)) {
            int zbs = zbs(i11) & 1048575;
            Unsafe unsafe = zbb;
            long j11 = zbs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zbc[i11] + " is present but null: " + obj2.toString());
            }
            zbvx zbv = zbv(i11);
            if (!zbI(obj, i11)) {
                if (zbL(object)) {
                    Object zbe = zbv.zbe();
                    zbv.zbg(zbe, object);
                    unsafe.putObject(obj, j11, zbe);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zbD(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zbL(object2)) {
                Object zbe2 = zbv.zbe();
                zbv.zbg(zbe2, object2);
                unsafe.putObject(obj, j11, zbe2);
                object2 = zbe2;
            }
            zbv.zbg(object2, object);
        }
    }

    private final void zbC(Object obj, Object obj2, int i11) {
        int i12 = this.zbc[i11];
        if (zbM(obj2, i12, i11)) {
            int zbs = zbs(i11) & 1048575;
            Unsafe unsafe = zbb;
            long j11 = zbs;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zbc[i11] + " is present but null: " + obj2.toString());
            }
            zbvx zbv = zbv(i11);
            if (!zbM(obj, i12, i11)) {
                if (zbL(object)) {
                    Object zbe = zbv.zbe();
                    zbv.zbg(zbe, object);
                    unsafe.putObject(obj, j11, zbe);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zbE(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zbL(object2)) {
                Object zbe2 = zbv.zbe();
                zbv.zbg(zbe2, object2);
                unsafe.putObject(obj, j11, zbe2);
                object2 = zbe2;
            }
            zbv.zbg(object2, object);
        }
    }

    private final void zbD(Object obj, int i11) {
        int zbp = zbp(i11);
        long j11 = 1048575 & zbp;
        if (j11 == 1048575) {
            return;
        }
        zbws.zbq(obj, j11, (1 << (zbp >>> 20)) | zbws.zbc(obj, j11));
    }

    private final void zbE(Object obj, int i11, int i12) {
        zbws.zbq(obj, zbp(i12) & 1048575, i11);
    }

    private final void zbF(Object obj, int i11, Object obj2) {
        zbb.putObject(obj, zbs(i11) & 1048575, obj2);
        zbD(obj, i11);
    }

    private final void zbG(Object obj, int i11, int i12, Object obj2) {
        zbb.putObject(obj, zbs(i12) & 1048575, obj2);
        zbE(obj, i11, i12);
    }

    private final boolean zbH(Object obj, Object obj2, int i11) {
        return zbI(obj, i11) == zbI(obj2, i11);
    }

    private final boolean zbI(Object obj, int i11) {
        int zbp = zbp(i11);
        long j11 = zbp & 1048575;
        if (j11 != 1048575) {
            return (zbws.zbc(obj, j11) & (1 << (zbp >>> 20))) != 0;
        }
        int zbs = zbs(i11);
        long j12 = zbs & 1048575;
        switch (zbr(zbs)) {
            case 0:
                return Double.doubleToRawLongBits(zbws.zba(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zbws.zbb(obj, j12)) != 0;
            case 2:
                return zbws.zbd(obj, j12) != 0;
            case 3:
                return zbws.zbd(obj, j12) != 0;
            case 4:
                return zbws.zbc(obj, j12) != 0;
            case 5:
                return zbws.zbd(obj, j12) != 0;
            case 6:
                return zbws.zbc(obj, j12) != 0;
            case 7:
                return zbws.zbw(obj, j12);
            case 8:
                Object zbf = zbws.zbf(obj, j12);
                if (zbf instanceof String) {
                    return !((String) zbf).isEmpty();
                }
                if (zbf instanceof zbtc) {
                    return !zbtc.zbb.equals(zbf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zbws.zbf(obj, j12) != null;
            case 10:
                return !zbtc.zbb.equals(zbws.zbf(obj, j12));
            case 11:
                return zbws.zbc(obj, j12) != 0;
            case 12:
                return zbws.zbc(obj, j12) != 0;
            case 13:
                return zbws.zbc(obj, j12) != 0;
            case 14:
                return zbws.zbd(obj, j12) != 0;
            case 15:
                return zbws.zbc(obj, j12) != 0;
            case 16:
                return zbws.zbd(obj, j12) != 0;
            case 17:
                return zbws.zbf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zbJ(Object obj, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? zbI(obj, i11) : (i13 & i14) != 0;
    }

    private static boolean zbK(Object obj, int i11, zbvx zbvxVar) {
        return zbvxVar.zbk(zbws.zbf(obj, i11 & 1048575));
    }

    private static boolean zbL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zbuf) {
            return ((zbuf) obj).zbG();
        }
        return true;
    }

    private final boolean zbM(Object obj, int i11, int i12) {
        return zbws.zbc(obj, (long) (zbp(i12) & 1048575)) == i11;
    }

    private static boolean zbN(Object obj, long j11) {
        return ((Boolean) zbws.zbf(obj, j11)).booleanValue();
    }

    private static final int zbO(byte[] bArr, int i11, int i12, zbww zbwwVar, Class cls, zbsq zbsqVar) throws IOException {
        zbww zbwwVar2 = zbww.zba;
        switch (zbwwVar.ordinal()) {
            case 0:
                int i13 = i11 + 8;
                zbsqVar.zbc = Double.valueOf(Double.longBitsToDouble(zbsr.zbr(bArr, i11)));
                return i13;
            case 1:
                int i14 = i11 + 4;
                zbsqVar.zbc = Float.valueOf(Float.intBitsToFloat(zbsr.zbc(bArr, i11)));
                return i14;
            case 2:
            case 3:
                int zbn = zbsr.zbn(bArr, i11, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbsqVar.zbb);
                return zbn;
            case 4:
            case 12:
            case 13:
                int zbk = zbsr.zbk(bArr, i11, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbsqVar.zba);
                return zbk;
            case 5:
            case 15:
                int i15 = i11 + 8;
                zbsqVar.zbc = Long.valueOf(zbsr.zbr(bArr, i11));
                return i15;
            case 6:
            case 14:
                int i16 = i11 + 4;
                zbsqVar.zbc = Integer.valueOf(zbsr.zbc(bArr, i11));
                return i16;
            case 7:
                int zbn2 = zbsr.zbn(bArr, i11, zbsqVar);
                zbsqVar.zbc = Boolean.valueOf(zbsqVar.zbb != 0);
                return zbn2;
            case 8:
                return zbsr.zbi(bArr, i11, zbsqVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zbsr.zbe(zbvu.zba().zbb(cls), bArr, i11, i12, zbsqVar);
            case 11:
                return zbsr.zba(bArr, i11, zbsqVar);
            case 16:
                int zbk2 = zbsr.zbk(bArr, i11, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbtg.zbb(zbsqVar.zba));
                return zbk2;
            case 17:
                int zbn3 = zbsr.zbn(bArr, i11, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbtg.zbc(zbsqVar.zbb));
                return zbn3;
        }
    }

    private static final void zbP(int i11, Object obj, zbwy zbwyVar) throws IOException {
        if (obj instanceof String) {
            zbwyVar.zbH(i11, (String) obj);
        } else {
            zbwyVar.zbd(i11, (zbtc) obj);
        }
    }

    static zbwm zbd(Object obj) {
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        if (zbwmVar != zbwm.zbc()) {
            return zbwmVar;
        }
        zbwm zbf = zbwm.zbf();
        zbufVar.zbc = zbf;
        return zbf;
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
    static zbvp zbl(Class cls, zbvj zbvjVar, zbvs zbvsVar, zbuy zbuyVar, zbwl zbwlVar, zbtq zbtqVar, zbvh zbvhVar) {
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
        Field zbz;
        char charAt10;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        Object obj;
        Field zbz2;
        Object obj2;
        Field zbz3;
        int i43;
        char charAt11;
        int i44;
        char charAt12;
        int i45;
        char charAt13;
        int i46;
        char charAt14;
        if (!(zbvjVar instanceof zbvw)) {
            throw null;
        }
        zbvw zbvwVar = (zbvw) zbvjVar;
        String zbd = zbvwVar.zbd();
        int length = zbd.length();
        char c12 = 55296;
        if (zbd.charAt(0) >= 55296) {
            int i47 = 1;
            while (true) {
                i11 = i47 + 1;
                if (zbd.charAt(i47) < 55296) {
                    break;
                }
                i47 = i11;
            }
        } else {
            i11 = 1;
        }
        int i48 = i11 + 1;
        int charAt15 = zbd.charAt(i11);
        if (charAt15 >= 55296) {
            int i49 = charAt15 & 8191;
            int i51 = 13;
            while (true) {
                i46 = i48 + 1;
                charAt14 = zbd.charAt(i48);
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
            iArr = zba;
            i17 = 0;
        } else {
            int i52 = i48 + 1;
            int charAt16 = zbd.charAt(i48);
            if (charAt16 >= 55296) {
                int i53 = charAt16 & 8191;
                int i54 = 13;
                while (true) {
                    i26 = i52 + 1;
                    charAt9 = zbd.charAt(i52);
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
            int charAt17 = zbd.charAt(i52);
            if (charAt17 >= 55296) {
                int i56 = charAt17 & 8191;
                int i57 = 13;
                while (true) {
                    i25 = i55 + 1;
                    charAt8 = zbd.charAt(i55);
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
            int charAt18 = zbd.charAt(i55);
            if (charAt18 >= 55296) {
                int i59 = charAt18 & 8191;
                int i61 = 13;
                while (true) {
                    i24 = i58 + 1;
                    charAt7 = zbd.charAt(i58);
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
            int charAt19 = zbd.charAt(i58);
            if (charAt19 >= 55296) {
                int i63 = charAt19 & 8191;
                int i64 = 13;
                while (true) {
                    i23 = i62 + 1;
                    charAt6 = zbd.charAt(i62);
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
            charAt = zbd.charAt(i62);
            if (charAt >= 55296) {
                int i66 = charAt & 8191;
                int i67 = 13;
                while (true) {
                    i22 = i65 + 1;
                    charAt5 = zbd.charAt(i65);
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
            int charAt20 = zbd.charAt(i65);
            if (charAt20 >= 55296) {
                int i69 = charAt20 & 8191;
                int i71 = 13;
                while (true) {
                    i21 = i68 + 1;
                    charAt4 = zbd.charAt(i68);
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
            int charAt21 = zbd.charAt(i68);
            if (charAt21 >= 55296) {
                int i73 = charAt21 & 8191;
                int i74 = 13;
                while (true) {
                    i19 = i72 + 1;
                    charAt3 = zbd.charAt(i72);
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
            int charAt22 = zbd.charAt(i72);
            if (charAt22 >= 55296) {
                int i76 = charAt22 & 8191;
                int i77 = 13;
                while (true) {
                    i18 = i75 + 1;
                    charAt2 = zbd.charAt(i75);
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
        Unsafe unsafe = zbb;
        Object[] zbe = zbvwVar.zbe();
        Class<?> cls2 = zbvwVar.zba().getClass();
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
            int charAt23 = zbd.charAt(i48);
            if (charAt23 >= c12) {
                int i88 = charAt23 & 8191;
                int i89 = i87;
                int i91 = 13;
                while (true) {
                    i45 = i89 + 1;
                    charAt13 = zbd.charAt(i89);
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
            int charAt24 = zbd.charAt(i27);
            if (charAt24 >= c12) {
                int i93 = charAt24 & 8191;
                int i94 = i92;
                int i95 = 13;
                while (true) {
                    i44 = i94 + 1;
                    charAt12 = zbd.charAt(i94);
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
            zbvw zbvwVar2 = zbvwVar;
            int i97 = charAt24 & 2048;
            if (i96 >= 51) {
                int i98 = i28 + 1;
                int charAt25 = zbd.charAt(i28);
                char c13 = 55296;
                if (charAt25 >= 55296) {
                    int i99 = charAt25 & 8191;
                    int i100 = i98;
                    int i101 = 13;
                    while (true) {
                        i43 = i100 + 1;
                        charAt11 = zbd.charAt(i100);
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
                    objArr[i104 + i104 + 1] = zbe[i16];
                } else {
                    if (i103 == 12) {
                        if (zbvwVar2.zbc() == 1 || i97 != 0) {
                            i41 = i16 + 1;
                            int i105 = i86 / 3;
                            objArr[i105 + i105 + 1] = zbe[i16];
                        } else {
                            i42 = 0;
                            int i106 = charAt25 + charAt25;
                            obj = zbe[i106];
                            int i107 = i42;
                            if (obj instanceof Field) {
                                zbz2 = (Field) obj;
                            } else {
                                zbz2 = zbz(cls2, (String) obj);
                                zbe[i106] = zbz2;
                            }
                            int i108 = i17;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                            int i109 = i106 + 1;
                            obj2 = zbe[i109];
                            i31 = i108;
                            if (obj2 instanceof Field) {
                                zbz3 = (Field) obj2;
                            } else {
                                zbz3 = zbz(cls2, (String) obj2);
                                zbe[i109] = zbz3;
                            }
                            i33 = (int) unsafe.objectFieldOffset(zbz3);
                            str = zbd;
                            i35 = i107;
                            i28 = i102;
                            i34 = 0;
                            c11 = 55296;
                        }
                    }
                    i42 = i97;
                    int i1062 = charAt25 + charAt25;
                    obj = zbe[i1062];
                    int i1072 = i42;
                    if (obj instanceof Field) {
                    }
                    int i1082 = i17;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                    int i1092 = i1062 + 1;
                    obj2 = zbe[i1092];
                    i31 = i1082;
                    if (obj2 instanceof Field) {
                    }
                    i33 = (int) unsafe.objectFieldOffset(zbz3);
                    str = zbd;
                    i35 = i1072;
                    i28 = i102;
                    i34 = 0;
                    c11 = 55296;
                }
                i16 = i41;
                i42 = i97;
                int i10622 = charAt25 + charAt25;
                obj = zbe[i10622];
                int i10722 = i42;
                if (obj instanceof Field) {
                }
                int i10822 = i17;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zbz2);
                int i10922 = i10622 + 1;
                obj2 = zbe[i10922];
                i31 = i10822;
                if (obj2 instanceof Field) {
                }
                i33 = (int) unsafe.objectFieldOffset(zbz3);
                str = zbd;
                i35 = i10722;
                i28 = i102;
                i34 = 0;
                c11 = 55296;
            } else {
                i29 = length;
                i31 = i17;
                int i110 = i16 + 1;
                Field zbz4 = zbz(cls2, (String) zbe[i16]);
                if (i96 == 9 || i96 == 17) {
                    i32 = i110;
                    int i111 = i86 / 3;
                    objArr[i111 + i111 + 1] = zbz4.getType();
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
                        if (zbvwVar2.zbc() == 1 || i97 != 0) {
                            i16 += 2;
                            int i112 = i86 / 3;
                            objArr[i112 + i112 + 1] = zbe[i110];
                            str = zbd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
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
                                Object obj3 = zbe[i116];
                                if (obj3 instanceof Field) {
                                    zbz = (Field) obj3;
                                } else {
                                    zbz = zbz(cls2, (String) obj3);
                                    zbe[i116] = zbz;
                                }
                                i34 = charAt26 % 32;
                                i28 = i36;
                                c11 = 55296;
                                i33 = (int) unsafe.objectFieldOffset(zbz);
                            }
                            if (i96 >= 18 && i96 <= 49) {
                                iArr[i84] = objectFieldOffset;
                                i84++;
                            }
                            i35 = i97;
                        } else {
                            str = zbd;
                            i16 = i110;
                            i97 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
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
                        objArr[i120] = zbe[i110];
                        if (i97 != 0) {
                            objArr[i120 + 1] = zbe[i117];
                            i16 += 3;
                            str = zbd;
                            i83 = i118;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
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
                            str = zbd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
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
                    objArr[i121 + i121 + i38] = zbe[i37];
                    str = zbd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c11 = 55296;
                    i33 = 1048575;
                    i34 = 0;
                    if (i96 >= 18) {
                    }
                    i35 = i97;
                }
                str = zbd;
                i16 = i32;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zbz4);
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
            zbd = str;
            c12 = c11;
            zbvwVar = zbvwVar2;
            length = i29;
            i17 = i31;
        }
        return new zbvp(iArr3, objArr, i12, i14, zbvwVar.zba(), false, iArr, i15, i81, zbvsVar, zbuyVar, zbwlVar, zbtqVar, zbvhVar);
    }

    private static double zbm(Object obj, long j11) {
        return ((Double) zbws.zbf(obj, j11)).doubleValue();
    }

    private static float zbn(Object obj, long j11) {
        return ((Float) zbws.zbf(obj, j11)).floatValue();
    }

    private static int zbo(Object obj, long j11) {
        return ((Integer) zbws.zbf(obj, j11)).intValue();
    }

    private final int zbp(int i11) {
        return this.zbc[i11 + 2];
    }

    private final int zbq(int i11, int i12) {
        int length = (this.zbc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zbc[i14];
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

    private static int zbr(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zbs(int i11) {
        return this.zbc[i11 + 1];
    }

    private static long zbt(Object obj, long j11) {
        return ((Long) zbws.zbf(obj, j11)).longValue();
    }

    private final zbuj zbu(int i11) {
        int i12 = i11 / 3;
        return (zbuj) this.zbd[i12 + i12 + 1];
    }

    private final zbvx zbv(int i11) {
        Object[] objArr = this.zbd;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zbvx zbvxVar = (zbvx) objArr[i13];
        if (zbvxVar != null) {
            return zbvxVar;
        }
        zbvx zbb2 = zbvu.zba().zbb((Class) objArr[i13 + 1]);
        this.zbd[i13] = zbb2;
        return zbb2;
    }

    private final Object zbw(int i11) {
        int i12 = i11 / 3;
        return this.zbd[i12 + i12];
    }

    private final Object zbx(Object obj, int i11) {
        zbvx zbv = zbv(i11);
        int zbs = zbs(i11) & 1048575;
        if (!zbI(obj, i11)) {
            return zbv.zbe();
        }
        Object object = zbb.getObject(obj, zbs);
        if (zbL(object)) {
            return object;
        }
        Object zbe = zbv.zbe();
        if (object != null) {
            zbv.zbg(zbe, object);
        }
        return zbe;
    }

    private final Object zby(Object obj, int i11, int i12) {
        zbvx zbv = zbv(i12);
        if (!zbM(obj, i11, i12)) {
            return zbv.zbe();
        }
        Object object = zbb.getObject(obj, zbs(i12) & 1048575);
        if (zbL(object)) {
            return object;
        }
        Object zbe = zbv.zbe();
        if (object != null) {
            zbv.zbg(zbe, object);
        }
        return zbe;
    }

    private static Field zbz(Class cls, String str) {
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
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(Object obj) {
        int i11;
        int zbD;
        int zbE;
        int zbD2;
        int zbd;
        int zbD3;
        int zbh;
        int zbD4;
        int size;
        int zbl;
        int zbD5;
        int zbd2;
        boolean z11;
        int zbb2;
        int zbD6;
        int zbD7;
        int size2;
        int zbk;
        int zbD8;
        int size3;
        int zbi;
        int zbD9;
        int zbe;
        int zbD10;
        int zbD11;
        int zbD12;
        int zbE2;
        zbvp<T> zbvpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zbb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < zbvpVar.zbc.length) {
            int zbs = zbvpVar.zbs(i14);
            int zbr = zbr(zbs);
            int[] iArr = zbvpVar.zbc;
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i12;
            if (zbr <= 17) {
                if (i19 != i13) {
                    i15 = i19 == i12 ? 0 : unsafe.getInt(obj2, i19);
                    i13 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            int i21 = zbs & i12;
            if (zbr >= zbtv.zbJ.zba()) {
                zbtv.zbW.zba();
            }
            long j11 = i21;
            switch (zbr) {
                case 0:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 8, i16);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    zbvpVar = this;
                    break;
                case 2:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        long j12 = unsafe.getLong(obj2, j11);
                        zbD = zbtk.zbD(i17 << 3);
                        zbE = zbtk.zbE(j12);
                        i16 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 3:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        long j13 = unsafe.getLong(obj2, j11);
                        zbD = zbtk.zbD(i17 << 3);
                        zbE = zbtk.zbE(j13);
                        i16 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 4:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        long j14 = unsafe.getInt(obj2, j11);
                        zbD = zbtk.zbD(i17 << 3);
                        zbE = zbtk.zbE(j14);
                        i16 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 5:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 8, i16);
                    }
                    zbvpVar = this;
                    break;
                case 6:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    zbvpVar = this;
                    break;
                case 7:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 1, i16);
                    }
                    zbvpVar = this;
                    break;
                case 8:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        int i22 = i17 << 3;
                        Object object = unsafe.getObject(obj2, j11);
                        if (object instanceof zbtc) {
                            zbD2 = zbtk.zbD(i22);
                            zbd = ((zbtc) object).zbd();
                            zbD3 = zbtk.zbD(zbd);
                            i16 += zbD3 + zbd + zbD2;
                        } else {
                            zbD = zbtk.zbD(i22);
                            zbE = zbtk.zbC((String) object);
                            i16 += zbE + zbD;
                        }
                    }
                    zbvpVar = this;
                    break;
                case 9:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        zbh = zbvz.zbh(i17, unsafe.getObject(obj2, j11), zbvpVar.zbv(i14));
                        i16 += zbh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        zbtc zbtcVar = (zbtc) unsafe.getObject(obj2, j11);
                        zbD2 = zbtk.zbD(i17 << 3);
                        zbd = zbtcVar.zbd();
                        zbD3 = zbtk.zbD(zbd);
                        i16 += zbD3 + zbd + zbD2;
                    }
                    zbvpVar = this;
                    break;
                case 11:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(unsafe.getInt(obj2, j11), zbtk.zbD(i17 << 3), i16);
                    }
                    zbvpVar = this;
                    break;
                case 12:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        long j15 = unsafe.getInt(obj2, j11);
                        zbD = zbtk.zbD(i17 << 3);
                        zbE = zbtk.zbE(j15);
                        i16 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 13:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    zbvpVar = this;
                    break;
                case 14:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        i16 = a.a(i17 << 3, 8, i16);
                    }
                    zbvpVar = this;
                    break;
                case 15:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        int i23 = unsafe.getInt(obj2, j11);
                        i16 = a.a((i23 >> 31) ^ (i23 + i23), zbtk.zbD(i17 << 3), i16);
                    }
                    zbvpVar = this;
                    break;
                case 16:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        long j16 = unsafe.getLong(obj2, j11);
                        zbD = zbtk.zbD(i17 << 3);
                        zbE = zbtk.zbE((j16 >> 63) ^ (j16 + j16));
                        i16 += zbE + zbD;
                    }
                    zbvpVar = this;
                    break;
                case 17:
                    if (zbvpVar.zbJ(obj2, i14, i13, i15, i11)) {
                        zbh = zbtk.zbz(i17, (zbvm) unsafe.getObject(obj2, j11), zbvpVar.zbv(i14));
                        i16 += zbh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zbh = zbvz.zbd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbh;
                    break;
                case 19:
                    zbh = zbvz.zbb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j11);
                    int i24 = zbvz.zba;
                    if (list.size() != 0) {
                        zbD4 = (zbtk.zbD(i17 << 3) * list.size()) + zbvz.zbg(list);
                        i16 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i16 += zbD4;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j11);
                    int i25 = zbvz.zba;
                    size = list2.size();
                    if (size != 0) {
                        zbl = zbvz.zbl(list2);
                        zbD5 = zbtk.zbD(i17 << 3);
                        zbD4 = (zbD5 * size) + zbl;
                        i16 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i16 += zbD4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j11);
                    int i26 = zbvz.zba;
                    size = list3.size();
                    if (size != 0) {
                        zbl = zbvz.zbf(list3);
                        zbD5 = zbtk.zbD(i17 << 3);
                        zbD4 = (zbD5 * size) + zbl;
                        i16 += zbD4;
                        break;
                    }
                    zbD4 = 0;
                    i16 += zbD4;
                case 23:
                    zbd2 = zbvz.zbd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbd2;
                    break;
                case 24:
                    z11 = false;
                    zbb2 = zbvz.zbb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbb2;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(obj2, j11);
                    int i27 = zbvz.zba;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        zbD6 = (zbtk.zbD(i17 << 3) + 1) * size4;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(obj2, j11);
                    int i28 = zbvz.zba;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        int zbD13 = zbtk.zbD(i17 << 3) * size5;
                        if (list5 instanceof zbux) {
                            zbux zbuxVar = (zbux) list5;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object zba2 = zbuxVar.zba();
                                if (zba2 instanceof zbtc) {
                                    int zbd3 = ((zbtc) zba2).zbd();
                                    zbD13 = a.a(zbd3, zbd3, zbD13);
                                } else {
                                    zbD13 = zbtk.zbC((String) zba2) + zbD13;
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < size5; i31++) {
                                Object obj3 = list5.get(i31);
                                if (obj3 instanceof zbtc) {
                                    int zbd4 = ((zbtc) obj3).zbd();
                                    zbD13 = a.a(zbd4, zbd4, zbD13);
                                } else {
                                    zbD13 = zbtk.zbC((String) obj3) + zbD13;
                                }
                            }
                        }
                        zbD6 = zbD13;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(obj2, j11);
                    zbvx zbv = zbvpVar.zbv(i14);
                    int i32 = zbvz.zba;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        int zbD14 = zbtk.zbD(i17 << 3) * size6;
                        for (int i33 = 0; i33 < size6; i33++) {
                            Object obj4 = list6.get(i33);
                            if (obj4 instanceof zbuw) {
                                int zba3 = ((zbuw) obj4).zba();
                                zbD14 = a.a(zba3, zba3, zbD14);
                            } else {
                                zbD14 += zbtk.zbB((zbvm) obj4, zbv);
                            }
                        }
                        zbD6 = zbD14;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j11);
                    int i34 = zbvz.zba;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        zbD7 = 0;
                    } else {
                        zbD7 = zbtk.zbD(i17 << 3) * size7;
                        for (int i35 = 0; i35 < list7.size(); i35++) {
                            int zbd5 = ((zbtc) list7.get(i35)).zbd();
                            zbD7 = a.a(zbd5, zbd5, zbD7);
                        }
                    }
                    i16 += zbD7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j11);
                    int i36 = zbvz.zba;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zbk = zbvz.zbk(list8);
                        zbD8 = zbtk.zbD(i17 << 3);
                        zbd2 = zbk + (zbD8 * size2);
                        i16 += zbd2;
                        break;
                    }
                    zbd2 = 0;
                    i16 += zbd2;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j11);
                    int i37 = zbvz.zba;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zbk = zbvz.zba(list9);
                        zbD8 = zbtk.zbD(i17 << 3);
                        zbd2 = zbk + (zbD8 * size2);
                        i16 += zbd2;
                        break;
                    }
                    zbd2 = 0;
                    i16 += zbd2;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zbd2 = zbvz.zbb(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbd2;
                    break;
                case 32:
                    z11 = false;
                    zbb2 = zbvz.zbd(i17, (List) unsafe.getObject(obj2, j11), false);
                    i16 += zbb2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j11);
                    int i38 = zbvz.zba;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zbi = zbvz.zbi(list10);
                        zbD9 = zbtk.zbD(i17 << 3);
                        zbD6 = (zbD9 * size3) + zbi;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j11);
                    int i39 = zbvz.zba;
                    size3 = list11.size();
                    if (size3 != 0) {
                        zbi = zbvz.zbj(list11);
                        zbD9 = zbtk.zbD(i17 << 3);
                        zbD6 = (zbD9 * size3) + zbi;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zbe = zbvz.zbg((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 38:
                    zbe = zbvz.zbl((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zbe = zbvz.zbf((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 40:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 41:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j11);
                    int i41 = zbvz.zba;
                    zbe = list12.size();
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 43:
                    zbe = zbvz.zbk((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zbe = zbvz.zba((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zbe = zbvz.zbc((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 46:
                    zbe = zbvz.zbe((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 47:
                    zbe = zbvz.zbi((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 48:
                    zbe = zbvz.zbj((List) unsafe.getObject(obj2, j11));
                    if (zbe > 0) {
                        zbD10 = zbtk.zbD(i17 << 3);
                        zbD11 = zbtk.zbD(zbe);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j11);
                    zbvx zbv2 = zbvpVar.zbv(i14);
                    int i42 = zbvz.zba;
                    int size8 = list13.size();
                    if (size8 != 0) {
                        int i43 = 0;
                        for (int i44 = 0; i44 < size8; i44++) {
                            i43 += zbtk.zbz(i17, (zbvm) list13.get(i44), zbv2);
                        }
                        zbD6 = i43;
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case 50:
                    zbvg zbvgVar = (zbvg) unsafe.getObject(obj2, j11);
                    zbvf zbvfVar = (zbvf) zbvpVar.zbw(i14);
                    if (!zbvgVar.isEmpty()) {
                        zbD6 = 0;
                        for (Map.Entry entry : zbvgVar.entrySet()) {
                            zbD6 += zbvfVar.zba(i17, entry.getKey(), entry.getValue());
                        }
                        i16 += zbD6;
                        break;
                    }
                    zbD6 = 0;
                    i16 += zbD6;
                case 51:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 8, i16);
                    }
                    break;
                case 52:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    break;
                case 53:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        long zbt = zbt(obj2, j11);
                        zbD12 = zbtk.zbD(i17 << 3);
                        zbE2 = zbtk.zbE(zbt);
                        i16 += zbE2 + zbD12;
                    }
                    break;
                case 54:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        long zbt2 = zbt(obj2, j11);
                        zbD12 = zbtk.zbD(i17 << 3);
                        zbE2 = zbtk.zbE(zbt2);
                        i16 += zbE2 + zbD12;
                    }
                    break;
                case 55:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        long zbo = zbo(obj2, j11);
                        zbD12 = zbtk.zbD(i17 << 3);
                        zbE2 = zbtk.zbE(zbo);
                        i16 += zbE2 + zbD12;
                    }
                    break;
                case 56:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 8, i16);
                    }
                    break;
                case 57:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    break;
                case 58:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 1, i16);
                    }
                    break;
                case 59:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        int i45 = i17 << 3;
                        Object object2 = unsafe.getObject(obj2, j11);
                        if (object2 instanceof zbtc) {
                            zbe = zbtk.zbD(i45);
                            zbD10 = ((zbtc) object2).zbd();
                            zbD11 = zbtk.zbD(zbD10);
                            i16 += zbD11 + zbD10 + zbe;
                        } else {
                            zbD12 = zbtk.zbD(i45);
                            zbE2 = zbtk.zbC((String) object2);
                            i16 += zbE2 + zbD12;
                        }
                    }
                    break;
                case 60:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        zbd2 = zbvz.zbh(i17, unsafe.getObject(obj2, j11), zbvpVar.zbv(i14));
                        i16 += zbd2;
                    }
                    break;
                case 61:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        zbtc zbtcVar2 = (zbtc) unsafe.getObject(obj2, j11);
                        zbe = zbtk.zbD(i17 << 3);
                        zbD10 = zbtcVar2.zbd();
                        zbD11 = zbtk.zbD(zbD10);
                        i16 += zbD11 + zbD10 + zbe;
                    }
                    break;
                case 62:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(zbo(obj2, j11), zbtk.zbD(i17 << 3), i16);
                    }
                    break;
                case 63:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        long zbo2 = zbo(obj2, j11);
                        zbD12 = zbtk.zbD(i17 << 3);
                        zbE2 = zbtk.zbE(zbo2);
                        i16 += zbE2 + zbD12;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 4, i16);
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        i16 = a.a(i17 << 3, 8, i16);
                    }
                    break;
                case 66:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        int zbo3 = zbo(obj2, j11);
                        i16 = a.a((zbo3 >> 31) ^ (zbo3 + zbo3), zbtk.zbD(i17 << 3), i16);
                    }
                    break;
                case 67:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        long zbt3 = zbt(obj2, j11);
                        zbD12 = zbtk.zbD(i17 << 3);
                        zbE2 = zbtk.zbE((zbt3 >> 63) ^ (zbt3 + zbt3));
                        i16 += zbE2 + zbD12;
                    }
                    break;
                case 68:
                    if (zbvpVar.zbM(obj2, i17, i14)) {
                        zbd2 = zbtk.zbz(i17, (zbvm) unsafe.getObject(obj2, j11), zbvpVar.zbv(i14));
                        i16 += zbd2;
                    }
                    break;
            }
            i14 += 3;
            obj2 = obj;
            i12 = 1048575;
        }
        int i46 = 0;
        int zba4 = ((zbuf) obj).zbc.zba() + i16;
        if (!zbvpVar.zbh) {
            return zba4;
        }
        zbtu zbtuVar = ((zbub) obj).zbb;
        int zbc = zbtuVar.zba.zbc();
        for (int i47 = 0; i47 < zbc; i47++) {
            Map.Entry zbg = zbtuVar.zba.zbg(i47);
            i46 += zbtu.zbb((zbtt) ((zbwb) zbg).zba(), zbg.getValue());
        }
        for (Map.Entry entry2 : zbtuVar.zba.zbd()) {
            i46 += zbtu.zbb((zbtt) entry2.getKey(), entry2.getValue());
        }
        return zba4 + i46;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int i11;
        long doubleToLongBits;
        int i12;
        int floatToIntBits;
        int zbc;
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < this.zbc.length; i15 += 3) {
            int zbs = zbs(i15);
            int[] iArr = this.zbc;
            int i16 = 1048575 & zbs;
            int zbr = zbr(zbs);
            int i17 = iArr[i15];
            long j11 = i16;
            int i18 = 37;
            switch (zbr) {
                case 0:
                    i11 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zbws.zba(obj, j11));
                    byte[] bArr = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 1:
                    i12 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(zbws.zbb(obj, j11));
                    i14 = floatToIntBits + i12;
                    break;
                case 2:
                    i11 = i14 * 53;
                    doubleToLongBits = zbws.zbd(obj, j11);
                    byte[] bArr2 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 3:
                    i11 = i14 * 53;
                    doubleToLongBits = zbws.zbd(obj, j11);
                    byte[] bArr3 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 4:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 5:
                    i11 = i14 * 53;
                    doubleToLongBits = zbws.zbd(obj, j11);
                    byte[] bArr4 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 6:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 7:
                    i12 = i14 * 53;
                    floatToIntBits = zbuo.zba(zbws.zbw(obj, j11));
                    i14 = floatToIntBits + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    floatToIntBits = ((String) zbws.zbf(obj, j11)).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 9:
                    i13 = i14 * 53;
                    Object zbf = zbws.zbf(obj, j11);
                    if (zbf != null) {
                        i18 = zbf.hashCode();
                    }
                    i14 = i13 + i18;
                    break;
                case 10:
                    i12 = i14 * 53;
                    floatToIntBits = zbws.zbf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 11:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 12:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 13:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 14:
                    i11 = i14 * 53;
                    doubleToLongBits = zbws.zbd(obj, j11);
                    byte[] bArr5 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 15:
                    i11 = i14 * 53;
                    zbc = zbws.zbc(obj, j11);
                    i14 = i11 + zbc;
                    break;
                case 16:
                    i11 = i14 * 53;
                    doubleToLongBits = zbws.zbd(obj, j11);
                    byte[] bArr6 = zbuo.zbb;
                    zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i14 = i11 + zbc;
                    break;
                case 17:
                    i13 = i14 * 53;
                    Object zbf2 = zbws.zbf(obj, j11);
                    if (zbf2 != null) {
                        i18 = zbf2.hashCode();
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
                    floatToIntBits = zbws.zbf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    floatToIntBits = zbws.zbf(obj, j11).hashCode();
                    i14 = floatToIntBits + i12;
                    break;
                case 51:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zbm(obj, j11));
                        byte[] bArr7 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(zbn(obj, j11));
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zbt(obj, j11);
                        byte[] bArr8 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zbt(obj, j11);
                        byte[] bArr9 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zbt(obj, j11);
                        byte[] bArr10 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zbuo.zba(zbN(obj, j11));
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = ((String) zbws.zbf(obj, j11)).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zbws.zbf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zbws.zbf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zbt(obj, j11);
                        byte[] bArr11 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        zbc = zbo(obj, j11);
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zbM(obj, i17, i15)) {
                        i11 = i14 * 53;
                        doubleToLongBits = zbt(obj, j11);
                        byte[] bArr12 = zbuo.zbb;
                        zbc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i14 = i11 + zbc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zbM(obj, i17, i15)) {
                        i12 = i14 * 53;
                        floatToIntBits = zbws.zbf(obj, j11).hashCode();
                        i14 = floatToIntBits + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zbuf) obj).zbc.hashCode() + (i14 * 53);
        return this.zbh ? (hashCode * 53) + ((zbub) obj).zbb.zba.hashCode() : hashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zbc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        return ((zbuf) this.zbg).zbt();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(Object obj) {
        if (zbL(obj)) {
            if (obj instanceof zbuf) {
                zbuf zbufVar = (zbuf) obj;
                zbufVar.zbE(Integer.MAX_VALUE);
                zbufVar.zba = 0;
                zbufVar.zbC();
            }
            int[] iArr = this.zbc;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int zbs = zbs(i11);
                int i12 = 1048575 & zbs;
                int zbr = zbr(zbs);
                long j11 = i12;
                if (zbr != 9) {
                    if (zbr != 60 && zbr != 68) {
                        switch (zbr) {
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
                                ((zbun) zbws.zbf(obj, j11)).zbb();
                                break;
                            case 50:
                                Unsafe unsafe = zbb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zbvg) object).zbc();
                                    unsafe.putObject(obj, j11, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zbM(obj, this.zbc[i11], i11)) {
                        zbv(i11).zbf(zbb.getObject(obj, j11));
                    }
                }
                if (zbI(obj, i11)) {
                    zbv(i11).zbf(zbb.getObject(obj, j11));
                }
            }
            this.zbl.zbb(obj);
            if (this.zbh) {
                this.zbm.zba(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbA(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zbc.length; i11 += 3) {
            int zbs = zbs(i11);
            int i12 = 1048575 & zbs;
            int[] iArr = this.zbc;
            int zbr = zbr(zbs);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (zbr) {
                case 0:
                    if (zbI(obj2, i11)) {
                        zbws.zbo(obj, j11, zbws.zba(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zbI(obj2, i11)) {
                        zbws.zbp(obj, j11, zbws.zbb(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zbI(obj2, i11)) {
                        zbws.zbr(obj, j11, zbws.zbd(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zbI(obj2, i11)) {
                        zbws.zbr(obj, j11, zbws.zbd(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zbI(obj2, i11)) {
                        zbws.zbr(obj, j11, zbws.zbd(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zbI(obj2, i11)) {
                        zbws.zbm(obj, j11, zbws.zbw(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zbI(obj2, i11)) {
                        zbws.zbs(obj, j11, zbws.zbf(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zbB(obj, obj2, i11);
                    break;
                case 10:
                    if (zbI(obj2, i11)) {
                        zbws.zbs(obj, j11, zbws.zbf(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zbI(obj2, i11)) {
                        zbws.zbr(obj, j11, zbws.zbd(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zbI(obj2, i11)) {
                        zbws.zbq(obj, j11, zbws.zbc(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zbI(obj2, i11)) {
                        zbws.zbr(obj, j11, zbws.zbd(obj2, j11));
                        zbD(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zbB(obj, obj2, i11);
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
                    zbun zbunVar = (zbun) zbws.zbf(obj, j11);
                    zbun zbunVar2 = (zbun) zbws.zbf(obj2, j11);
                    int size = zbunVar.size();
                    int size2 = zbunVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zbunVar.zbc()) {
                            zbunVar = zbunVar.zbd(size2 + size);
                        }
                        zbunVar.addAll(zbunVar2);
                    }
                    if (size > 0) {
                        zbunVar2 = zbunVar;
                    }
                    zbws.zbs(obj, j11, zbunVar2);
                    break;
                case 50:
                    int i14 = zbvz.zba;
                    zbws.zbs(obj, j11, zbvh.zba(zbws.zbf(obj, j11), zbws.zbf(obj2, j11)));
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
                    if (zbM(obj2, i13, i11)) {
                        zbws.zbs(obj, j11, zbws.zbf(obj2, j11));
                        zbE(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zbC(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zbM(obj2, i13, i11)) {
                        zbws.zbs(obj, j11, zbws.zbf(obj2, j11));
                        zbE(obj, i13, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zbC(obj, obj2, i11);
                    break;
            }
        }
        zbvz.zbp(this.zbl, obj, obj2);
        if (this.zbh) {
            zbvz.zbo(this.zbm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbh(Object obj, byte[] bArr, int i11, int i12, zbsq zbsqVar) throws IOException {
        zbc(obj, bArr, i11, i12, 0, zbsqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbi(Object obj, zbwy zbwyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i11;
        Map.Entry entry2;
        int i12;
        int i13;
        int i14;
        zbvp<T> zbvpVar = this;
        if (zbvpVar.zbh) {
            zbtu zbtuVar = ((zbub) obj).zbb;
            if (!zbtuVar.zba.isEmpty()) {
                Iterator zbg = zbtuVar.zbg();
                entry = (Map.Entry) zbg.next();
                it = zbg;
                iArr = zbvpVar.zbc;
                Unsafe unsafe = zbb;
                int i15 = 1048575;
                int i16 = 1048575;
                i11 = 0;
                int i17 = 0;
                while (i11 < iArr.length) {
                    int zbs = zbvpVar.zbs(i11);
                    int[] iArr2 = zbvpVar.zbc;
                    int zbr = zbr(zbs);
                    int i18 = iArr2[i11];
                    if (zbr <= 17) {
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
                    while (entry2 != null) {
                        if (i18 >= 32149011) {
                            zbvpVar.zbm.zbb(zbwyVar, entry2);
                            entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            long j11 = zbs & i15;
                            switch (zbr) {
                                case 0:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbf(i18, zbws.zba(obj, j11));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbo(i18, zbws.zbb(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 2:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbt(i18, unsafe.getLong(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 3:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbL(i18, unsafe.getLong(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 4:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbr(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 5:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbm(i18, unsafe.getLong(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 6:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbk(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 7:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbb(i18, zbws.zbw(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 8:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbP(i18, unsafe.getObject(obj, j11), zbwyVar);
                                    }
                                    zbvpVar = this;
                                    break;
                                case 9:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbw(i18, unsafe.getObject(obj, j11), zbvpVar.zbv(i11));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbd(i18, (zbtc) unsafe.getObject(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 11:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbJ(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 12:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbi(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 13:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zby(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 14:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbA(i18, unsafe.getLong(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 15:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbC(i18, unsafe.getInt(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 16:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbE(i18, unsafe.getLong(obj, j11));
                                    }
                                    zbvpVar = this;
                                    break;
                                case 17:
                                    if (zbvpVar.zbJ(obj, i11, i12, i13, i14)) {
                                        zbwyVar.zbq(i18, unsafe.getObject(obj, j11), zbvpVar.zbv(i11));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    zbvz.zbr(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 19:
                                    zbvz.zbv(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 20:
                                    zbvz.zbx(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 21:
                                    zbvz.zbD(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 22:
                                    zbvz.zbw(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 23:
                                    zbvz.zbu(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 24:
                                    zbvz.zbt(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                    zbvz.zbq(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                    int i23 = zbvpVar.zbc[i11];
                                    List list = (List) unsafe.getObject(obj, j11);
                                    int i24 = zbvz.zba;
                                    if (list != null && !list.isEmpty()) {
                                        zbwyVar.zbI(i23, list);
                                    }
                                    break;
                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    int i25 = zbvpVar.zbc[i11];
                                    List list2 = (List) unsafe.getObject(obj, j11);
                                    zbvx zbv = zbvpVar.zbv(i11);
                                    int i26 = zbvz.zba;
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (int i27 = 0; i27 < list2.size(); i27++) {
                                            ((zbtl) zbwyVar).zbw(i25, list2.get(i27), zbv);
                                        }
                                    }
                                    break;
                                case 28:
                                    int i28 = zbvpVar.zbc[i11];
                                    List list3 = (List) unsafe.getObject(obj, j11);
                                    int i29 = zbvz.zba;
                                    if (list3 != null && !list3.isEmpty()) {
                                        zbwyVar.zbe(i28, list3);
                                    }
                                    break;
                                case 29:
                                    zbvz.zbC(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                    zbvz.zbs(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    zbvz.zby(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 32:
                                    zbvz.zbz(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 33:
                                    zbvz.zbA(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case 34:
                                    zbvz.zbB(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, false);
                                    break;
                                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                    zbvz.zbr(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    zbvz.zbv(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    zbvz.zbx(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 38:
                                    zbvz.zbD(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    zbvz.zbw(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 40:
                                    zbvz.zbu(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 41:
                                    zbvz.zbt(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 42:
                                    zbvz.zbq(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 43:
                                    zbvz.zbC(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    zbvz.zbs(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    zbvz.zby(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 46:
                                    zbvz.zbz(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 47:
                                    zbvz.zbA(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 48:
                                    zbvz.zbB(zbvpVar.zbc[i11], (List) unsafe.getObject(obj, j11), zbwyVar, true);
                                    break;
                                case 49:
                                    int i31 = zbvpVar.zbc[i11];
                                    List list4 = (List) unsafe.getObject(obj, j11);
                                    zbvx zbv2 = zbvpVar.zbv(i11);
                                    int i32 = zbvz.zba;
                                    if (list4 != null && !list4.isEmpty()) {
                                        for (int i33 = 0; i33 < list4.size(); i33++) {
                                            ((zbtl) zbwyVar).zbq(i31, list4.get(i33), zbv2);
                                        }
                                    }
                                    break;
                                case 50:
                                    Object object = unsafe.getObject(obj, j11);
                                    if (object != null) {
                                        zbwyVar.zbv(i18, ((zbvf) zbvpVar.zbw(i11)).zbc(), (zbvg) object);
                                    }
                                    break;
                                case 51:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbf(i18, zbm(obj, j11));
                                    }
                                    break;
                                case 52:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbo(i18, zbn(obj, j11));
                                    }
                                    break;
                                case 53:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbt(i18, zbt(obj, j11));
                                    }
                                    break;
                                case 54:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbL(i18, zbt(obj, j11));
                                    }
                                    break;
                                case 55:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbr(i18, zbo(obj, j11));
                                    }
                                    break;
                                case 56:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbm(i18, zbt(obj, j11));
                                    }
                                    break;
                                case 57:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbk(i18, zbo(obj, j11));
                                    }
                                    break;
                                case 58:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbb(i18, zbN(obj, j11));
                                    }
                                    break;
                                case 59:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbP(i18, unsafe.getObject(obj, j11), zbwyVar);
                                    }
                                    break;
                                case 60:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbw(i18, unsafe.getObject(obj, j11), zbvpVar.zbv(i11));
                                    }
                                    break;
                                case 61:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbd(i18, (zbtc) unsafe.getObject(obj, j11));
                                    }
                                    break;
                                case 62:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbJ(i18, zbo(obj, j11));
                                    }
                                    break;
                                case 63:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbi(i18, zbo(obj, j11));
                                    }
                                    break;
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zby(i18, zbo(obj, j11));
                                    }
                                    break;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbA(i18, zbt(obj, j11));
                                    }
                                    break;
                                case 66:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbC(i18, zbo(obj, j11));
                                    }
                                    break;
                                case 67:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbE(i18, zbt(obj, j11));
                                    }
                                    break;
                                case 68:
                                    if (zbvpVar.zbM(obj, i18, i11)) {
                                        zbwyVar.zbq(i18, unsafe.getObject(obj, j11), zbvpVar.zbv(i11));
                                    }
                                    break;
                            }
                            i11 += 3;
                            i17 = i13;
                            i15 = 1048575;
                            i16 = i12;
                            entry = entry2;
                        }
                    }
                    long j112 = zbs & i15;
                    switch (zbr) {
                    }
                    i11 += 3;
                    i17 = i13;
                    i15 = 1048575;
                    i16 = i12;
                    entry = entry2;
                }
                while (entry != null) {
                    zbvpVar.zbm.zbb(zbwyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zbuf) obj).zbc.zbl(zbwyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zbvpVar.zbc;
        Unsafe unsafe2 = zbb;
        int i152 = 1048575;
        int i162 = 1048575;
        i11 = 0;
        int i172 = 0;
        while (i11 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zbuf) obj).zbc.zbl(zbwyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        boolean zbE;
        for (int i11 = 0; i11 < this.zbc.length; i11 += 3) {
            int zbs = zbs(i11);
            long j11 = zbs & 1048575;
            switch (zbr(zbs)) {
                case 0:
                    if (zbH(obj, obj2, i11) && Double.doubleToLongBits(zbws.zba(obj, j11)) == Double.doubleToLongBits(zbws.zba(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zbH(obj, obj2, i11) && Float.floatToIntBits(zbws.zbb(obj, j11)) == Float.floatToIntBits(zbws.zbb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zbH(obj, obj2, i11) && zbws.zbd(obj, j11) == zbws.zbd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zbH(obj, obj2, i11) && zbws.zbd(obj, j11) == zbws.zbd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zbH(obj, obj2, i11) && zbws.zbd(obj, j11) == zbws.zbd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zbH(obj, obj2, i11) && zbws.zbw(obj, j11) == zbws.zbw(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zbH(obj, obj2, i11) && zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zbH(obj, obj2, i11) && zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zbH(obj, obj2, i11) && zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zbH(obj, obj2, i11) && zbws.zbd(obj, j11) == zbws.zbd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zbH(obj, obj2, i11) && zbws.zbc(obj, j11) == zbws.zbc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zbH(obj, obj2, i11) && zbws.zbd(obj, j11) == zbws.zbd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zbH(obj, obj2, i11) && zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11))) {
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
                    zbE = zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11));
                    break;
                case 50:
                    zbE = zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11));
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
                    long zbp = zbp(i11) & 1048575;
                    if (zbws.zbc(obj, zbp) == zbws.zbc(obj2, zbp) && zbvz.zbE(zbws.zbf(obj, j11), zbws.zbf(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zbE) {
                return false;
            }
        }
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbh) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(Object obj) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zbj) {
            int[] iArr = this.zbi;
            int[] iArr2 = this.zbc;
            int i16 = iArr[i13];
            int i17 = iArr2[i16];
            int zbs = zbs(i16);
            int i18 = this.zbc[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = zbb.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i15;
                i12 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & zbs) != 0 && !zbJ(obj2, i16, i11, i12, i21)) {
                return false;
            }
            int zbr = zbr(zbs);
            if (zbr != 9 && zbr != 17) {
                if (zbr != 27) {
                    if (zbr == 60 || zbr == 68) {
                        if (zbM(obj2, i17, i16) && !zbK(obj2, zbs, zbv(i16))) {
                            return false;
                        }
                    } else if (zbr != 49) {
                        if (zbr != 50) {
                            continue;
                        } else {
                            zbvg zbvgVar = (zbvg) zbws.zbf(obj2, zbs & 1048575);
                            if (!zbvgVar.isEmpty() && ((zbvf) zbw(i16)).zbc().zbc.zbb() == zbwx.MESSAGE) {
                                zbvx zbvxVar = null;
                                for (Object obj3 : zbvgVar.values()) {
                                    if (zbvxVar == null) {
                                        zbvxVar = zbvu.zba().zbb(obj3.getClass());
                                    }
                                    if (!zbvxVar.zbk(obj3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zbws.zbf(obj2, zbs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zbvx zbv = zbv(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zbv.zbk(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zbJ(obj2, i16, i11, i12, i21) && !zbK(obj2, zbs, zbv(i16))) {
                return false;
            }
            i13++;
            obj = obj2;
            i15 = i11;
            i14 = i12;
        }
        return !this.zbh || ((zbub) obj).zbb.zbm();
    }
}
