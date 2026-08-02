package com.logrocket.protobuf;

import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import okio.Segment;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 implements g1 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6792k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f6793l = x1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6794a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6795b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6797d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f6798e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6799f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f6800g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f6801h;

    /* renamed from: i, reason: collision with root package name */
    public final p1 f6802i;
    public final q0 j;

    public u0(int[] iArr, Object[] objArr, a aVar, boolean z5, int[] iArr2, int i5, w0 w0Var, l0 l0Var, p1 p1Var, s sVar, q0 q0Var) {
        this.f6794a = iArr;
        this.f6795b = objArr;
        this.f6797d = z5;
        this.f6798e = iArr2;
        this.f6799f = i5;
        this.f6800g = w0Var;
        this.f6801h = l0Var;
        this.f6802i = p1Var;
        this.f6796c = aVar;
        this.j = q0Var;
    }

    public static void C(int i5, Object obj, n0 n0Var) {
        if (!(obj instanceof String)) {
            n0Var.b(i5, (j) obj);
        } else {
            ((p) n0Var.f6757a).I(i5, (String) obj);
        }
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).j();
        }
        return true;
    }

    public static List p(z zVar, long j) {
        return (List) x1.f6821c.j(j, zVar);
    }

    public static u0 s(c1 c1Var, w0 w0Var, l0 l0Var, p1 p1Var, s sVar, q0 q0Var) {
        if (c1Var instanceof c1) {
            return t(c1Var, w0Var, l0Var, p1Var, sVar, q0Var);
        }
        c1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u0 t(c1 c1Var, w0 w0Var, l0 l0Var, p1 p1Var, s sVar, q0 q0Var) {
        int i5;
        int charAt;
        int charAt2;
        int charAt3;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        int i17;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        Object[] objArr;
        int i20;
        boolean z5;
        int i21;
        int objectFieldOffset;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field w10;
        char charAt10;
        int i29;
        int i30;
        Object obj;
        Field w11;
        Object obj2;
        Field w12;
        int i31;
        char charAt11;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        boolean z7 = (c1Var.f6677d & 1) != 1;
        String str = c1Var.f6675b;
        int length = str.length();
        int i35 = 55296;
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i5 = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i5;
            }
        } else {
            i5 = 1;
        }
        int i37 = i5 + 1;
        int charAt15 = str.charAt(i5);
        if (charAt15 >= 55296) {
            int i38 = charAt15 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                charAt14 = str.charAt(i37);
                if (charAt14 < 55296) {
                    break;
                }
                i38 |= (charAt14 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            charAt15 = i38 | (charAt14 << i39);
            i37 = i34;
        }
        if (charAt15 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i10 = 0;
            iArr = f6792k;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt16 = str.charAt(i37);
            if (charAt16 >= 55296) {
                int i41 = charAt16 & 8191;
                int i42 = 13;
                while (true) {
                    i19 = i40 + 1;
                    charAt9 = str.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i19;
                }
                charAt16 = i41 | (charAt9 << i42);
                i40 = i19;
            }
            int i43 = i40 + 1;
            int charAt17 = str.charAt(i40);
            if (charAt17 >= 55296) {
                int i44 = charAt17 & 8191;
                int i45 = 13;
                while (true) {
                    i18 = i43 + 1;
                    charAt8 = str.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i18;
                }
                charAt17 = i44 | (charAt8 << i45);
                i43 = i18;
            }
            int i46 = i43 + 1;
            if (str.charAt(i43) >= 55296) {
                while (true) {
                    i17 = i46 + 1;
                    if (str.charAt(i46) < 55296) {
                        break;
                    }
                    i46 = i17;
                }
                i46 = i17;
            }
            int i47 = i46 + 1;
            if (str.charAt(i46) >= 55296) {
                while (true) {
                    i16 = i47 + 1;
                    if (str.charAt(i47) < 55296) {
                        break;
                    }
                    i47 = i16;
                }
                i47 = i16;
            }
            int i48 = i47 + 1;
            charAt = str.charAt(i47);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i15 = i48 + 1;
                    charAt7 = str.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i15;
                }
                charAt = i49 | (charAt7 << i50);
                i48 = i15;
            }
            int i51 = i48 + 1;
            charAt2 = str.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i14 = i51 + 1;
                    charAt6 = str.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i14;
                }
                charAt2 = i52 | (charAt6 << i53);
                i51 = i14;
            }
            int i54 = i51 + 1;
            int charAt18 = str.charAt(i51);
            if (charAt18 >= 55296) {
                int i55 = charAt18 & 8191;
                int i56 = 13;
                while (true) {
                    i13 = i54 + 1;
                    charAt5 = str.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i13;
                }
                charAt18 = i55 | (charAt5 << i56);
                i54 = i13;
            }
            int i57 = i54 + 1;
            charAt3 = str.charAt(i54);
            if (charAt3 >= 55296) {
                int i58 = charAt3 & 8191;
                int i59 = 13;
                while (true) {
                    i12 = i57 + 1;
                    charAt4 = str.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i12;
                }
                charAt3 = i58 | (charAt4 << i59);
                i57 = i12;
            }
            i10 = (charAt16 * 2) + charAt17;
            iArr = new int[charAt3 + charAt2 + charAt18];
            i11 = charAt16;
            i37 = i57;
        }
        Unsafe unsafe = f6793l;
        Object[] objArr2 = c1Var.f6676c;
        Class<?> cls = c1Var.f6674a.getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt * 2];
        int i60 = charAt2 + charAt3;
        int i61 = charAt3;
        int i62 = 0;
        int i63 = 0;
        while (i37 < length) {
            int i64 = i37 + 1;
            int charAt19 = str.charAt(i37);
            if (charAt19 >= i35) {
                int i65 = charAt19 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i33 = i66 + 1;
                    charAt13 = str.charAt(i66);
                    objArr = objArr2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i65 |= (charAt13 & 8191) << i67;
                    i67 += 13;
                    i66 = i33;
                    objArr2 = objArr;
                }
                charAt19 = i65 | (charAt13 << i67);
                i20 = i33;
            } else {
                objArr = objArr2;
                i20 = i64;
            }
            int i68 = i20 + 1;
            int charAt20 = str.charAt(i20);
            int i69 = length;
            char c2 = 55296;
            if (charAt20 >= 55296) {
                int i70 = charAt20 & 8191;
                int i71 = 13;
                while (true) {
                    i32 = i68 + 1;
                    charAt12 = str.charAt(i68);
                    if (charAt12 < c2) {
                        break;
                    }
                    i70 |= (charAt12 & 8191) << i71;
                    i71 += 13;
                    i68 = i32;
                    c2 = 55296;
                }
                charAt20 = i70 | (charAt12 << i71);
                i68 = i32;
            }
            int i72 = charAt20 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i73 = charAt19;
            if ((charAt20 & Segment.SHARE_MINIMUM) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = i11;
            if (i72 >= 51) {
                int i75 = i68 + 1;
                int charAt21 = str.charAt(i68);
                char c8 = 55296;
                if (charAt21 >= 55296) {
                    int i76 = charAt21 & 8191;
                    int i77 = 13;
                    while (true) {
                        i31 = i75 + 1;
                        charAt11 = str.charAt(i75);
                        if (charAt11 < c8) {
                            break;
                        }
                        i76 |= (charAt11 & 8191) << i77;
                        i77 += 13;
                        i75 = i31;
                        c8 = 55296;
                    }
                    charAt21 = i76 | (charAt11 << i77);
                    i75 = i31;
                }
                int i78 = i72 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i30 = i10 + 1;
                    objArr3[((i63 / 3) * 2) + 1] = objArr[i10];
                } else {
                    if (i78 == 12 && !z7) {
                        i30 = i10 + 1;
                        objArr3[((i63 / 3) * 2) + 1] = objArr[i10];
                    }
                    int i80 = charAt21 * 2;
                    obj = objArr[i80];
                    if (obj instanceof Field) {
                        w11 = w(cls, (String) obj);
                        objArr[i80] = w11;
                    } else {
                        w11 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(w11);
                    int i81 = i80 + 1;
                    obj2 = objArr[i81];
                    if (obj2 instanceof Field) {
                        w12 = w(cls, (String) obj2);
                        objArr[i81] = w12;
                    } else {
                        w12 = (Field) obj2;
                    }
                    i26 = (int) unsafe.objectFieldOffset(w12);
                    i27 = objectFieldOffset2;
                    i24 = i79;
                    i28 = 0;
                    i22 = i10;
                    z5 = z7;
                }
                i10 = i30;
                int i802 = charAt21 * 2;
                obj = objArr[i802];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(w11);
                int i812 = i802 + 1;
                obj2 = objArr[i812];
                if (obj2 instanceof Field) {
                }
                i26 = (int) unsafe.objectFieldOffset(w12);
                i27 = objectFieldOffset22;
                i24 = i79;
                i28 = 0;
                i22 = i10;
                z5 = z7;
            } else {
                int i82 = i10 + 1;
                Field w13 = w(cls, (String) objArr[i10]);
                if (i72 == 9 || i72 == 17) {
                    objArr3[((i63 / 3) * 2) + 1] = w13.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i29 = i10 + 2;
                        objArr3[((i63 / 3) * 2) + 1] = objArr[i82];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z7) {
                            i29 = i10 + 2;
                            objArr3[((i63 / 3) * 2) + 1] = objArr[i82];
                        }
                    } else if (i72 == 50) {
                        int i83 = i61 + 1;
                        iArr[i61] = i63;
                        int i84 = (i63 / 3) * 2;
                        int i85 = i10 + 2;
                        objArr3[i84] = objArr[i82];
                        if ((charAt20 & 2048) != 0) {
                            i21 = i10 + 3;
                            objArr3[i84 + 1] = objArr[i85];
                            z5 = z7;
                        } else {
                            z5 = z7;
                            i21 = i85;
                        }
                        i61 = i83;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(w13);
                        i22 = i21;
                        if ((charAt20 & 4096) == 4096 || i72 > 17) {
                            i23 = 1048575;
                            i24 = i68;
                            i25 = 0;
                        } else {
                            int i86 = i68 + 1;
                            int charAt22 = str.charAt(i68);
                            if (charAt22 >= 55296) {
                                int i87 = charAt22 & 8191;
                                int i88 = 13;
                                while (true) {
                                    i24 = i86 + 1;
                                    charAt10 = str.charAt(i86);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i87 |= (charAt10 & 8191) << i88;
                                    i88 += 13;
                                    i86 = i24;
                                }
                                charAt22 = i87 | (charAt10 << i88);
                            } else {
                                i24 = i86;
                            }
                            int i89 = (charAt22 / 32) + (i74 * 2);
                            Object obj3 = objArr[i89];
                            if (obj3 instanceof Field) {
                                w10 = (Field) obj3;
                            } else {
                                w10 = w(cls, (String) obj3);
                                objArr[i89] = w10;
                            }
                            int i90 = charAt22;
                            i23 = (int) unsafe.objectFieldOffset(w10);
                            i25 = i90 % 32;
                        }
                        if (i72 >= 18 || i72 > 49) {
                            int i91 = i25;
                            i26 = i23;
                            i27 = objectFieldOffset;
                            i28 = i91;
                        } else {
                            int i92 = i60 + 1;
                            iArr[i60] = objectFieldOffset;
                            int i93 = i25;
                            i26 = i23;
                            i27 = objectFieldOffset;
                            i28 = i93;
                            i60 = i92;
                        }
                    }
                    i21 = i29;
                    z5 = z7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(w13);
                    i22 = i21;
                    if ((charAt20 & 4096) == 4096) {
                    }
                    i23 = 1048575;
                    i24 = i68;
                    i25 = 0;
                    if (i72 >= 18) {
                    }
                    int i912 = i25;
                    i26 = i23;
                    i27 = objectFieldOffset;
                    i28 = i912;
                }
                z5 = z7;
                i21 = i82;
                objectFieldOffset = (int) unsafe.objectFieldOffset(w13);
                i22 = i21;
                if ((charAt20 & 4096) == 4096) {
                }
                i23 = 1048575;
                i24 = i68;
                i25 = 0;
                if (i72 >= 18) {
                }
                int i9122 = i25;
                i26 = i23;
                i27 = objectFieldOffset;
                i28 = i9122;
            }
            int i94 = i63 + 1;
            iArr2[i63] = i73;
            int i95 = i63 + 2;
            String str2 = str;
            iArr2[i94] = ((charAt20 & 512) != 0 ? 536870912 : 0) | ((charAt20 & 256) != 0 ? 268435456 : 0) | (i72 << 20) | i27;
            i63 += 3;
            iArr2[i95] = (i28 << 20) | i26;
            z7 = z5;
            length = i69;
            str = str2;
            objArr2 = objArr;
            i10 = i22;
            i37 = i24;
            i11 = i74;
            i35 = 55296;
        }
        return new u0(iArr2, objArr3, c1Var.f6674a, z7, iArr, charAt3, w0Var, l0Var, p1Var, sVar, q0Var);
    }

    public static int u(long j, Object obj) {
        return ((Integer) x1.f6821c.j(j, obj)).intValue();
    }

    public static long v(long j, Object obj) {
        return ((Long) x1.f6821c.j(j, obj)).longValue();
    }

    public static Field w(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder p10 = d9.e.p("Field ", str, " for ");
            p10.append(cls.getName());
            p10.append(" not found. Known fields are ");
            p10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(p10.toString());
        }
    }

    public static int y(int i5) {
        return (i5 & 267386880) >>> 20;
    }

    public final void A(Object obj, n0 n0Var) {
        int i5;
        int i10;
        int i11;
        int[] iArr = this.f6794a;
        int length = iArr.length;
        Unsafe unsafe = f6793l;
        int i12 = 1048575;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11 + 3) {
            int z5 = z(i14);
            int i15 = iArr[i14];
            int y5 = y(z5);
            if (y5 <= 17) {
                int i16 = iArr[i14 + 2];
                i5 = 1048575;
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i5 = 1048575;
                i10 = 0;
            }
            int i18 = i14;
            long j = z5 & i5;
            switch (y5) {
                case 0:
                    i11 = i18;
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        double f6 = x1.f6821c.f(j, obj);
                        p pVar = (p) n0Var.f6757a;
                        pVar.getClass();
                        pVar.C(i15, Double.doubleToRawLongBits(f6));
                        continue;
                    }
                case 1:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        float g10 = x1.f6821c.g(j, obj);
                        p pVar2 = (p) n0Var.f6757a;
                        pVar2.getClass();
                        pVar2.A(i15, Float.floatToRawIntBits(g10));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).N(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).N(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).E(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).C(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).A(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).w(i15, x1.f6821c.d(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        C(i15, unsafe.getObject(obj, j), n0Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).G(i15, (a) unsafe.getObject(obj, j), j(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        n0Var.b(i15, (j) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).L(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).E(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).A(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        ((p) n0Var.f6757a).C(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        ((p) n0Var.f6757a).L(i15, (i19 >> 31) ^ (i19 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        ((p) n0Var.f6757a).N(i15, (j6 << 1) ^ (j6 >> 63));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i11 = i18;
                    if ((i10 & i13) != 0) {
                        n0Var.c(i15, unsafe.getObject(obj, j), j(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i11 = i18;
                    h1.z(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 19:
                    i11 = i18;
                    h1.D(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 20:
                    i11 = i18;
                    h1.G(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 21:
                    i11 = i18;
                    h1.O(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    i11 = i18;
                    h1.F(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    i11 = i18;
                    h1.C(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    i11 = i18;
                    h1.B(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case C0122e9.F /* 25 */:
                    i11 = i18;
                    h1.x(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case C0122e9.G /* 26 */:
                    i11 = i18;
                    h1.M(iArr[i11], (List) unsafe.getObject(obj, j), n0Var);
                    break;
                case C0122e9.H /* 27 */:
                    i11 = i18;
                    h1.H(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, j(i11));
                    break;
                case 28:
                    i11 = i18;
                    h1.y(iArr[i11], (List) unsafe.getObject(obj, j), n0Var);
                    break;
                case C0122e9.I /* 29 */:
                    i11 = i18;
                    h1.N(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    break;
                case 30:
                    i11 = i18;
                    h1.A(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 31:
                    i11 = i18;
                    h1.I(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 32:
                    i11 = i18;
                    h1.J(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 33:
                    i11 = i18;
                    h1.K(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case 34:
                    i11 = i18;
                    h1.L(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, false);
                    continue;
                case C0122e9.J /* 35 */:
                    i11 = i18;
                    h1.z(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 36:
                    i11 = i18;
                    h1.D(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 37:
                    i11 = i18;
                    h1.G(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case C0122e9.K /* 38 */:
                    i11 = i18;
                    h1.O(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 39:
                    i11 = i18;
                    h1.F(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 40:
                    i11 = i18;
                    h1.C(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i11 = i18;
                    h1.B(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case C0122e9.M /* 42 */:
                    i11 = i18;
                    h1.x(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 43:
                    i11 = i18;
                    h1.N(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 44:
                    i11 = i18;
                    h1.A(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 45:
                    i11 = i18;
                    h1.I(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 46:
                    i11 = i18;
                    h1.J(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 47:
                    i11 = i18;
                    h1.K(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case 48:
                    i11 = i18;
                    h1.L(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    i11 = i18;
                    h1.E(iArr[i11], (List) unsafe.getObject(obj, j), n0Var, j(i11));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i11 = i18;
                    B(n0Var, i15, unsafe.getObject(obj, j), i11);
                    break;
                case 51:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        double doubleValue = ((Double) x1.f6821c.j(j, obj)).doubleValue();
                        p pVar3 = (p) n0Var.f6757a;
                        pVar3.getClass();
                        pVar3.C(i15, Double.doubleToRawLongBits(doubleValue));
                        break;
                    }
                    break;
                case 52:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        float floatValue = ((Float) x1.f6821c.j(j, obj)).floatValue();
                        p pVar4 = (p) n0Var.f6757a;
                        pVar4.getClass();
                        pVar4.A(i15, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).N(i15, v(j, obj));
                        break;
                    }
                    break;
                case 54:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).N(i15, v(j, obj));
                        break;
                    }
                    break;
                case 55:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).E(i15, u(j, obj));
                        break;
                    }
                    break;
                case 56:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).C(i15, v(j, obj));
                        break;
                    }
                    break;
                case 57:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).A(i15, u(j, obj));
                        break;
                    }
                    break;
                case 58:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).w(i15, ((Boolean) x1.f6821c.j(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        C(i15, unsafe.getObject(obj, j), n0Var);
                        break;
                    }
                    break;
                case 60:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).G(i15, (a) unsafe.getObject(obj, j), j(i11));
                        break;
                    }
                    break;
                case 61:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        n0Var.b(i15, (j) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).L(i15, u(j, obj));
                        break;
                    }
                    break;
                case 63:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).E(i15, u(j, obj));
                        break;
                    }
                    break;
                case 64:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).A(i15, u(j, obj));
                        break;
                    }
                    break;
                case 65:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        ((p) n0Var.f6757a).C(i15, v(j, obj));
                        break;
                    }
                    break;
                case 66:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        int u10 = u(j, obj);
                        ((p) n0Var.f6757a).L(i15, (u10 >> 31) ^ (u10 << 1));
                        break;
                    }
                    break;
                case 67:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        long v5 = v(j, obj);
                        ((p) n0Var.f6757a).N(i15, (v5 << 1) ^ (v5 >> 63));
                        break;
                    }
                    break;
                case 68:
                    i11 = i18;
                    if (o(i15, i11, obj)) {
                        n0Var.c(i15, unsafe.getObject(obj, j), j(i11));
                        break;
                    }
                    break;
                default:
                    i11 = i18;
                    break;
            }
        }
        this.f6802i.getClass();
        ((z) obj).unknownFields.b(n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(n0 n0Var, int i5, Object obj, int i10) {
        int q;
        int size;
        int p10;
        int size2;
        int p11;
        if (obj != null) {
            Object obj2 = this.f6795b[(i10 / 3) * 2];
            this.j.getClass();
            com.google.firebase.messaging.x xVar = ((o0) obj2).f6764a;
            f2 f2Var = (f2) xVar.f6184c;
            f2 f2Var2 = (f2) xVar.f6182a;
            p pVar = (p) n0Var.f6757a;
            pVar.getClass();
            for (Map.Entry entry : ((p0) obj).entrySet()) {
                pVar.K(i5, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i11 = u.f6789c;
                int o3 = p.o(1);
                c2 c2Var = f2.f6697d;
                if (f2Var2 == c2Var) {
                    o3 *= 2;
                }
                int i12 = 8;
                switch (f2Var2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        q = 8;
                        int i13 = q + o3;
                        int o4 = p.o(2);
                        if (f2Var == c2Var) {
                            o4 *= 2;
                        }
                        switch (f2Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                pVar.M(i12 + o4 + i13);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2);
                                u.b(pVar, f2Var, 2, value2);
                            case 1:
                                ((Float) value).getClass();
                                i12 = 4;
                                pVar.M(i12 + o4 + i13);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22);
                                u.b(pVar, f2Var, 2, value22);
                            case 2:
                                i12 = p.q(((Long) value).longValue());
                                pVar.M(i12 + o4 + i13);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key222);
                                u.b(pVar, f2Var, 2, value222);
                            case 3:
                                i12 = p.q(((Long) value).longValue());
                                pVar.M(i12 + o4 + i13);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2222);
                                u.b(pVar, f2Var, 2, value2222);
                            case 4:
                                i12 = p.l(((Integer) value).intValue());
                                pVar.M(i12 + o4 + i13);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22222);
                                u.b(pVar, f2Var, 2, value22222);
                            case 5:
                                ((Long) value).getClass();
                                pVar.M(i12 + o4 + i13);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key222222);
                                u.b(pVar, f2Var, 2, value222222);
                            case 6:
                                ((Integer) value).getClass();
                                i12 = 4;
                                pVar.M(i12 + o4 + i13);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2222222);
                                u.b(pVar, f2Var, 2, value2222222);
                            case 7:
                                ((Boolean) value).getClass();
                                i12 = 1;
                                pVar.M(i12 + o4 + i13);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22222222);
                                u.b(pVar, f2Var, 2, value22222222);
                            case 8:
                                if (value instanceof j) {
                                    size2 = ((j) value).size();
                                    p11 = p.p(size2);
                                    i12 = p11 + size2;
                                    pVar.M(i12 + o4 + i13);
                                    Object key222222222 = entry.getKey();
                                    Object value222222222 = entry.getValue();
                                    u.b(pVar, f2Var2, 1, key222222222);
                                    u.b(pVar, f2Var, 2, value222222222);
                                } else {
                                    i12 = p.n((String) value);
                                    pVar.M(i12 + o4 + i13);
                                    Object key2222222222 = entry.getKey();
                                    Object value2222222222 = entry.getValue();
                                    u.b(pVar, f2Var2, 1, key2222222222);
                                    u.b(pVar, f2Var, 2, value2222222222);
                                }
                            case 9:
                                i12 = ((z) ((a) value)).b(null);
                                pVar.M(i12 + o4 + i13);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22222222222);
                                u.b(pVar, f2Var, 2, value22222222222);
                            case 10:
                                size2 = ((z) ((a) value)).b(null);
                                p11 = p.p(size2);
                                i12 = p11 + size2;
                                pVar.M(i12 + o4 + i13);
                                Object key222222222222 = entry.getKey();
                                Object value222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key222222222222);
                                u.b(pVar, f2Var, 2, value222222222222);
                            case 11:
                                if (value instanceof j) {
                                    size2 = ((j) value).size();
                                    p11 = p.p(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    p11 = p.p(size2);
                                }
                                i12 = p11 + size2;
                                pVar.M(i12 + o4 + i13);
                                Object key2222222222222 = entry.getKey();
                                Object value2222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2222222222222);
                                u.b(pVar, f2Var, 2, value2222222222222);
                            case 12:
                                i12 = p.p(((Integer) value).intValue());
                                pVar.M(i12 + o4 + i13);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22222222222222);
                                u.b(pVar, f2Var, 2, value22222222222222);
                            case 13:
                                i12 = value instanceof eh.d ? p.l(((eh.d) value).a()) : p.l(((Integer) value).intValue());
                                pVar.M(i12 + o4 + i13);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key222222222222222);
                                u.b(pVar, f2Var, 2, value222222222222222);
                            case 14:
                                ((Integer) value).getClass();
                                i12 = 4;
                                pVar.M(i12 + o4 + i13);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2222222222222222);
                                u.b(pVar, f2Var, 2, value2222222222222222);
                            case 15:
                                ((Long) value).getClass();
                                pVar.M(i12 + o4 + i13);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key22222222222222222);
                                u.b(pVar, f2Var, 2, value22222222222222222);
                            case 16:
                                i12 = p.m(((Integer) value).intValue());
                                pVar.M(i12 + o4 + i13);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key222222222222222222);
                                u.b(pVar, f2Var, 2, value222222222222222222);
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i12 = p.q((longValue >> 63) ^ (longValue << 1));
                                pVar.M(i12 + o4 + i13);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                u.b(pVar, f2Var2, 1, key2222222222222222222);
                                u.b(pVar, f2Var, 2, value2222222222222222222);
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        q = 4;
                        int i132 = q + o3;
                        int o42 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 2:
                        q = p.q(((Long) key).longValue());
                        int i1322 = q + o3;
                        int o422 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 3:
                        q = p.q(((Long) key).longValue());
                        int i13222 = q + o3;
                        int o4222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 4:
                        q = p.l(((Integer) key).intValue());
                        int i132222 = q + o3;
                        int o42222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        q = 8;
                        int i1322222 = q + o3;
                        int o422222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        q = 4;
                        int i13222222 = q + o3;
                        int o4222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 7:
                        ((Boolean) key).getClass();
                        q = 1;
                        int i132222222 = q + o3;
                        int o42222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 8:
                        if (key instanceof j) {
                            size = ((j) key).size();
                            p10 = p.p(size);
                            q = size + p10;
                            int i1322222222 = q + o3;
                            int o422222222 = p.o(2);
                            if (f2Var == c2Var) {
                            }
                            switch (f2Var.ordinal()) {
                            }
                        } else {
                            q = p.n((String) key);
                            int i13222222222 = q + o3;
                            int o4222222222 = p.o(2);
                            if (f2Var == c2Var) {
                            }
                            switch (f2Var.ordinal()) {
                            }
                        }
                    case 9:
                        q = ((z) ((a) key)).b(null);
                        int i132222222222 = q + o3;
                        int o42222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 10:
                        size = ((z) ((a) key)).b(null);
                        p10 = p.p(size);
                        q = size + p10;
                        int i1322222222222 = q + o3;
                        int o422222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof j) {
                            size = ((j) key).size();
                            p10 = p.p(size);
                        } else {
                            size = ((byte[]) key).length;
                            p10 = p.p(size);
                        }
                        q = size + p10;
                        int i13222222222222 = q + o3;
                        int o4222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 12:
                        q = p.p(((Integer) key).intValue());
                        int i132222222222222 = q + o3;
                        int o42222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 13:
                        q = key instanceof eh.d ? p.l(((eh.d) key).a()) : p.l(((Integer) key).intValue());
                        int i1322222222222222 = q + o3;
                        int o422222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        q = 4;
                        int i13222222222222222 = q + o3;
                        int o4222222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        q = 8;
                        int i132222222222222222 = q + o3;
                        int o42222222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 16:
                        q = p.m(((Integer) key).intValue());
                        int i1322222222222222222 = q + o3;
                        int o422222222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        q = p.q((longValue2 << 1) ^ (longValue2 >> 63));
                        int i13222222222222222222 = q + o3;
                        int o4222222222222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // com.logrocket.protobuf.g1
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!n(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f6794a;
            if (i5 >= iArr.length) {
                h1.v(this.f6802i, obj, obj2);
                return;
            }
            int z5 = z(i5);
            long j = z5 & 1048575;
            int i10 = iArr[i5];
            switch (y(z5)) {
                case 0:
                    obj3 = obj;
                    if (!m(i5, obj2)) {
                        break;
                    } else {
                        w1 w1Var = x1.f6821c;
                        w1Var.o(obj3, j, w1Var.f(j, obj2));
                        x(i5, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var2 = x1.f6821c;
                        w1Var2.p(obj3, j, w1Var2.g(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var3 = x1.f6821c;
                        w1Var3.r(obj3, j, w1Var3.i(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var4 = x1.f6821c;
                        w1Var4.r(obj3, j, w1Var4.i(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var5 = x1.f6821c;
                        w1Var5.r(obj3, j, w1Var5.i(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var6 = x1.f6821c;
                        w1Var6.l(obj3, j, w1Var6.d(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.p(j, obj3, x1.f6821c.j(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    q(i5, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.p(j, obj3, x1.f6821c.j(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        w1 w1Var7 = x1.f6821c;
                        w1Var7.r(obj3, j, w1Var7.i(j, obj2));
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (m(i5, obj2)) {
                        x1.o(x1.f6821c.h(j, obj2), j, obj3);
                        x(i5, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m(i5, obj2)) {
                        w1 w1Var8 = x1.f6821c;
                        obj3 = obj;
                        w1Var8.r(obj3, j, w1Var8.i(j, obj2));
                        x(i5, obj3);
                        break;
                    }
                    break;
                case 17:
                    q(i5, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                case C0122e9.F /* 25 */:
                case C0122e9.G /* 26 */:
                case C0122e9.H /* 27 */:
                case 28:
                case C0122e9.I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0122e9.J /* 35 */:
                case 36:
                case 37:
                case C0122e9.K /* 38 */:
                case 39:
                case 40:
                case RequestError.NO_DEV_KEY /* 41 */:
                case C0122e9.M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    this.f6801h.b(j, obj, obj2);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = h1.f6725a;
                    w1 w1Var9 = x1.f6821c;
                    Object j6 = w1Var9.j(j, obj);
                    Object j10 = w1Var9.j(j, obj2);
                    this.j.getClass();
                    p0 p0Var = (p0) j6;
                    p0 p0Var2 = (p0) j10;
                    if (!p0Var2.isEmpty()) {
                        if (!p0Var.f6777a) {
                            p0Var = p0Var.e();
                        }
                        p0Var.d();
                        if (!p0Var2.isEmpty()) {
                            p0Var.putAll(p0Var2);
                        }
                    }
                    x1.p(j, obj, p0Var);
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
                    if (o(i10, i5, obj2)) {
                        x1.p(j, obj, x1.f6821c.j(j, obj2));
                        x1.o(i10, iArr[i5 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 60:
                    r(i5, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(i10, i5, obj2)) {
                        x1.p(j, obj, x1.f6821c.j(j, obj2));
                        x1.o(i10, iArr[i5 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 68:
                    r(i5, obj, obj2);
                    break;
            }
            obj3 = obj;
            i5 += 3;
            obj = obj3;
        }
    }

    @Override // com.logrocket.protobuf.g1
    public final void b(Object obj) {
        if (n(obj)) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                zVar.o(Integer.MAX_VALUE);
                zVar.memoizedHashCode = 0;
                zVar.l();
            }
            int[] iArr = this.f6794a;
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int z5 = z(i5);
                long j = 1048575 & z5;
                int y5 = y(z5);
                if (y5 != 9) {
                    if (y5 != 60 && y5 != 68) {
                        switch (y5) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                            case C0122e9.F /* 25 */:
                            case C0122e9.G /* 26 */:
                            case C0122e9.H /* 27 */:
                            case 28:
                            case C0122e9.I /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case C0122e9.J /* 35 */:
                            case 36:
                            case 37:
                            case C0122e9.K /* 38 */:
                            case 39:
                            case 40:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case C0122e9.M /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                this.f6801h.a(j, obj);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f6793l;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.j.getClass();
                                    ((p0) object).f6777a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (o(iArr[i5], i5, obj)) {
                        j(i5).b(f6793l.getObject(obj, j));
                    }
                }
                if (m(i5, obj)) {
                    j(i5).b(f6793l.getObject(obj, j));
                }
            }
            this.f6802i.getClass();
            o1 o1Var = ((z) obj).unknownFields;
            if (o1Var.f6772e) {
                o1Var.f6772e = false;
            }
        }
    }

    @Override // com.logrocket.protobuf.g1
    public final boolean c(Object obj) {
        int i5 = 1048575;
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            boolean z5 = true;
            if (i10 >= this.f6799f) {
                return true;
            }
            int i12 = this.f6798e[i10];
            int[] iArr = this.f6794a;
            int i13 = iArr[i12];
            int z7 = z(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i5) {
                if (i15 != 1048575) {
                    i11 = f6793l.getInt(obj, i15);
                }
                i5 = i15;
            }
            if ((268435456 & z7) != 0) {
                if (!(i5 == 1048575 ? m(i12, obj) : (i11 & i16) != 0)) {
                    break;
                }
            }
            int y5 = y(z7);
            if (y5 == 9 || y5 == 17) {
                if (i5 == 1048575) {
                    z5 = m(i12, obj);
                } else if ((i16 & i11) == 0) {
                    z5 = false;
                }
                if (z5) {
                    if (!j(i12).c(x1.f6821c.j(z7 & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (y5 != 27) {
                    if (y5 == 60 || y5 == 68) {
                        if (o(i13, i12, obj)) {
                            if (!j(i12).c(x1.f6821c.j(z7 & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (y5 != 49) {
                        if (y5 == 50) {
                            Object j = x1.f6821c.j(z7 & 1048575, obj);
                            this.j.getClass();
                            p0 p0Var = (p0) j;
                            if (!p0Var.isEmpty()) {
                                if (((f2) ((o0) this.f6795b[(i12 / 3) * 2]).f6764a.f6184c).f6701a == g2.f6723i) {
                                    g1 g1Var = null;
                                    for (Object obj2 : p0Var.values()) {
                                        if (g1Var == null) {
                                            g1Var = a1.f6664c.a(obj2.getClass());
                                        }
                                        if (!g1Var.c(obj2)) {
                                            break loop0;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i10++;
                    }
                }
                List list = (List) x1.f6821c.j(z7 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    g1 j6 = j(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!j6.c(list.get(i17))) {
                            break loop0;
                        }
                    }
                }
                i10++;
            }
        }
        return false;
    }

    @Override // com.logrocket.protobuf.g1
    public final z d() {
        this.f6800g.getClass();
        return (z) ((z) this.f6796c).g(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.logrocket.protobuf.h1.w(r5.j(r7, r12), r5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.logrocket.protobuf.h1.w(r5.j(r7, r12), r5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.logrocket.protobuf.h1.w(r5.j(r7, r12), r5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.logrocket.protobuf.h1.w(r5.j(r7, r12), r5.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.d(r7, r12) == r5.d(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.g(r7, r12)) == java.lang.Float.floatToIntBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.f(r7, r12)) == java.lang.Double.doubleToLongBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.logrocket.protobuf.h1.w(r9.j(r7, r12), r9.j(r7, r13)) != false) goto L105;
     */
    @Override // com.logrocket.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(z zVar, z zVar2) {
        int[] iArr = this.f6794a;
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 < length) {
                int z7 = z(i5);
                long j = z7 & 1048575;
                switch (y(z7)) {
                    case 0:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 1:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var2 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 2:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var3 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 3:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var4 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 4:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var5 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 5:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var6 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 6:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var7 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 7:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var8 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 8:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var9 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 9:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var10 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 10:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var11 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 11:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var12 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 12:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var13 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 13:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var14 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 14:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var15 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 15:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var16 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 16:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var17 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 17:
                        if (i(zVar, zVar2, i5)) {
                            w1 w1Var18 = x1.f6821c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    case C0122e9.F /* 25 */:
                    case C0122e9.G /* 26 */:
                    case C0122e9.H /* 27 */:
                    case 28:
                    case C0122e9.I /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case C0122e9.J /* 35 */:
                    case 36:
                    case 37:
                    case C0122e9.K /* 38 */:
                    case 39:
                    case 40:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case C0122e9.M /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        w1 w1Var19 = x1.f6821c;
                        z5 = h1.w(w1Var19.j(j, zVar), w1Var19.j(j, zVar2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        w1 w1Var20 = x1.f6821c;
                        z5 = h1.w(w1Var20.j(j, zVar), w1Var20.j(j, zVar2));
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
                        long j6 = iArr[i5 + 2] & 1048575;
                        w1 w1Var21 = x1.f6821c;
                        if (w1Var21.h(j6, zVar) == w1Var21.h(j6, zVar2)) {
                            break;
                        }
                        z5 = false;
                        break;
                }
                if (z5) {
                    i5 += 3;
                }
            } else {
                this.f6802i.getClass();
                if (zVar.unknownFields.equals(zVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.logrocket.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(z zVar) {
        int i5;
        int a7;
        int i10;
        int[] iArr = this.f6794a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int z5 = z(i12);
            int i13 = iArr[i12];
            long j = 1048575 & z5;
            int i14 = 1237;
            int i15 = 37;
            switch (y(z5)) {
                case 0:
                    i5 = i11 * 53;
                    a7 = d0.a(Double.doubleToLongBits(x1.f6821c.f(j, zVar)));
                    i11 = a7 + i5;
                    break;
                case 1:
                    i5 = i11 * 53;
                    a7 = Float.floatToIntBits(x1.f6821c.g(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 2:
                    i5 = i11 * 53;
                    a7 = d0.a(x1.f6821c.i(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 3:
                    i5 = i11 * 53;
                    a7 = d0.a(x1.f6821c.i(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 4:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 5:
                    i5 = i11 * 53;
                    a7 = d0.a(x1.f6821c.i(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 6:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean d10 = x1.f6821c.d(j, zVar);
                    Charset charset = d0.f6681a;
                    break;
                case 8:
                    i5 = i11 * 53;
                    a7 = ((String) x1.f6821c.j(j, zVar)).hashCode();
                    i11 = a7 + i5;
                    break;
                case 9:
                    Object j6 = x1.f6821c.j(j, zVar);
                    if (j6 != null) {
                        i15 = j6.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.j(j, zVar).hashCode();
                    i11 = a7 + i5;
                    break;
                case 11:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 12:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 13:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 14:
                    i5 = i11 * 53;
                    a7 = d0.a(x1.f6821c.i(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 15:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.h(j, zVar);
                    i11 = a7 + i5;
                    break;
                case 16:
                    i5 = i11 * 53;
                    a7 = d0.a(x1.f6821c.i(j, zVar));
                    i11 = a7 + i5;
                    break;
                case 17:
                    Object j10 = x1.f6821c.j(j, zVar);
                    if (j10 != null) {
                        i15 = j10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                case C0122e9.F /* 25 */:
                case C0122e9.G /* 26 */:
                case C0122e9.H /* 27 */:
                case 28:
                case C0122e9.I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0122e9.J /* 35 */:
                case 36:
                case 37:
                case C0122e9.K /* 38 */:
                case 39:
                case 40:
                case RequestError.NO_DEV_KEY /* 41 */:
                case C0122e9.M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.j(j, zVar).hashCode();
                    i11 = a7 + i5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i5 = i11 * 53;
                    a7 = x1.f6821c.j(j, zVar).hashCode();
                    i11 = a7 + i5;
                    break;
                case 51:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(Double.doubleToLongBits(((Double) x1.f6821c.j(j, zVar)).doubleValue()));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = Float.floatToIntBits(((Float) x1.f6821c.j(j, zVar)).floatValue());
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(v(j, zVar));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(v(j, zVar));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(v(j, zVar));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(i13, i12, zVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) x1.f6821c.j(j, zVar)).booleanValue();
                        Charset charset2 = d0.f6681a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = ((String) x1.f6821c.j(j, zVar)).hashCode();
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = x1.f6821c.j(j, zVar).hashCode();
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = x1.f6821c.j(j, zVar).hashCode();
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(v(j, zVar));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = u(j, zVar);
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = d0.a(v(j, zVar));
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(i13, i12, zVar)) {
                        i5 = i11 * 53;
                        a7 = x1.f6821c.j(j, zVar).hashCode();
                        i11 = a7 + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f6802i.getClass();
        return zVar.unknownFields.hashCode() + (i11 * 53);
    }

    @Override // com.logrocket.protobuf.g1
    public final void g(Object obj, n0 n0Var) {
        n0Var.getClass();
        p pVar = (p) n0Var.f6757a;
        if (!this.f6797d) {
            A(obj, n0Var);
            return;
        }
        int[] iArr = this.f6794a;
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int z5 = z(i5);
            int i10 = iArr[i5];
            switch (y(z5)) {
                case 0:
                    if (m(i5, obj)) {
                        double f6 = x1.f6821c.f(z5 & 1048575, obj);
                        pVar.getClass();
                        pVar.C(i10, Double.doubleToRawLongBits(f6));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m(i5, obj)) {
                        float g10 = x1.f6821c.g(z5 & 1048575, obj);
                        pVar.getClass();
                        pVar.A(i10, Float.floatToRawIntBits(g10));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m(i5, obj)) {
                        pVar.N(i10, x1.f6821c.i(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m(i5, obj)) {
                        pVar.N(i10, x1.f6821c.i(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m(i5, obj)) {
                        pVar.E(i10, x1.f6821c.h(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m(i5, obj)) {
                        pVar.C(i10, x1.f6821c.i(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m(i5, obj)) {
                        pVar.A(i10, x1.f6821c.h(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m(i5, obj)) {
                        pVar.w(i10, x1.f6821c.d(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m(i5, obj)) {
                        C(i10, x1.f6821c.j(z5 & 1048575, obj), n0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m(i5, obj)) {
                        pVar.G(i10, (a) x1.f6821c.j(z5 & 1048575, obj), j(i5));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m(i5, obj)) {
                        n0Var.b(i10, (j) x1.f6821c.j(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m(i5, obj)) {
                        pVar.L(i10, x1.f6821c.h(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m(i5, obj)) {
                        pVar.E(i10, x1.f6821c.h(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m(i5, obj)) {
                        pVar.A(i10, x1.f6821c.h(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m(i5, obj)) {
                        pVar.C(i10, x1.f6821c.i(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m(i5, obj)) {
                        int h10 = x1.f6821c.h(z5 & 1048575, obj);
                        pVar.L(i10, (h10 >> 31) ^ (h10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m(i5, obj)) {
                        long i11 = x1.f6821c.i(z5 & 1048575, obj);
                        pVar.N(i10, (i11 >> 63) ^ (i11 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m(i5, obj)) {
                        n0Var.c(i10, x1.f6821c.j(z5 & 1048575, obj), j(i5));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h1.z(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 19:
                    h1.D(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 20:
                    h1.G(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 21:
                    h1.O(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    h1.F(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    h1.C(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    h1.B(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case C0122e9.F /* 25 */:
                    h1.x(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case C0122e9.G /* 26 */:
                    h1.M(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var);
                    break;
                case C0122e9.H /* 27 */:
                    h1.H(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, j(i5));
                    break;
                case 28:
                    h1.y(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var);
                    break;
                case C0122e9.I /* 29 */:
                    h1.N(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 30:
                    h1.A(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 31:
                    h1.I(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 32:
                    h1.J(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 33:
                    h1.K(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case 34:
                    h1.L(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, false);
                    break;
                case C0122e9.J /* 35 */:
                    h1.z(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 36:
                    h1.D(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 37:
                    h1.G(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case C0122e9.K /* 38 */:
                    h1.O(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 39:
                    h1.F(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 40:
                    h1.C(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    h1.B(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case C0122e9.M /* 42 */:
                    h1.x(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 43:
                    h1.N(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 44:
                    h1.A(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 45:
                    h1.I(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 46:
                    h1.J(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 47:
                    h1.K(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case 48:
                    h1.L(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    h1.E(iArr[i5], (List) x1.f6821c.j(z5 & 1048575, obj), n0Var, j(i5));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    B(n0Var, i10, x1.f6821c.j(z5 & 1048575, obj), i5);
                    break;
                case 51:
                    if (o(i10, i5, obj)) {
                        double doubleValue = ((Double) x1.f6821c.j(z5 & 1048575, obj)).doubleValue();
                        pVar.getClass();
                        pVar.C(i10, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(i10, i5, obj)) {
                        float floatValue = ((Float) x1.f6821c.j(z5 & 1048575, obj)).floatValue();
                        pVar.getClass();
                        pVar.A(i10, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(i10, i5, obj)) {
                        pVar.N(i10, v(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(i10, i5, obj)) {
                        pVar.N(i10, v(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(i10, i5, obj)) {
                        pVar.E(i10, u(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(i10, i5, obj)) {
                        pVar.C(i10, v(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(i10, i5, obj)) {
                        pVar.A(i10, u(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(i10, i5, obj)) {
                        pVar.w(i10, ((Boolean) x1.f6821c.j(z5 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(i10, i5, obj)) {
                        C(i10, x1.f6821c.j(z5 & 1048575, obj), n0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o(i10, i5, obj)) {
                        pVar.G(i10, (a) x1.f6821c.j(z5 & 1048575, obj), j(i5));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(i10, i5, obj)) {
                        n0Var.b(i10, (j) x1.f6821c.j(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(i10, i5, obj)) {
                        pVar.L(i10, u(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(i10, i5, obj)) {
                        pVar.E(i10, u(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(i10, i5, obj)) {
                        pVar.A(i10, u(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(i10, i5, obj)) {
                        pVar.C(i10, v(z5 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(i10, i5, obj)) {
                        int u10 = u(z5 & 1048575, obj);
                        pVar.L(i10, (u10 >> 31) ^ (u10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(i10, i5, obj)) {
                        long v5 = v(z5 & 1048575, obj);
                        pVar.N(i10, (v5 >> 63) ^ (v5 << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(i10, i5, obj)) {
                        n0Var.c(i10, x1.f6821c.j(z5 & 1048575, obj), j(i5));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f6802i.getClass();
        ((z) obj).unknownFields.b(n0Var);
    }

    @Override // com.logrocket.protobuf.g1
    public final int h(z zVar) {
        return this.f6797d ? l(zVar) : k(zVar);
    }

    public final boolean i(z zVar, z zVar2, int i5) {
        return m(i5, zVar) == m(i5, zVar2);
    }

    public final g1 j(int i5) {
        int i10 = (i5 / 3) * 2;
        Object[] objArr = this.f6795b;
        g1 g1Var = (g1) objArr[i10];
        if (g1Var != null) {
            return g1Var;
        }
        g1 a7 = a1.f6664c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a7;
        return a7;
    }

    public final int k(z zVar) {
        int i5;
        int o3;
        int q;
        int o4;
        int l6;
        int j;
        int o7;
        int n9;
        int z5;
        int i10;
        Unsafe unsafe = f6793l;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f6794a;
            if (i13 >= iArr.length) {
                this.f6802i.getClass();
                return zVar.unknownFields.a() + i14;
            }
            int z7 = z(i13);
            int i16 = iArr[i13];
            int y5 = y(z7);
            if (y5 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                i5 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i15 = unsafe.getInt(zVar, i18);
                    i12 = i18;
                }
            } else {
                i5 = 0;
            }
            long j6 = z7 & i11;
            switch (y5) {
                case 0:
                    if ((i15 & i5) != 0) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i15 & i5) != 0) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i5 & i15) != 0) {
                        long j10 = unsafe.getLong(zVar, j6);
                        o3 = p.o(i16);
                        q = p.q(j10);
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i5 & i15) != 0) {
                        long j11 = unsafe.getLong(zVar, j6);
                        o3 = p.o(i16);
                        q = p.q(j11);
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i5 & i15) != 0) {
                        int i19 = unsafe.getInt(zVar, j6);
                        o4 = p.o(i16);
                        l6 = p.l(i19);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i15 & i5) != 0) {
                        j = p.j(i16);
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i15 & i5) != 0) {
                        j = p.i(i16);
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i15 & i5) != 0) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i5 & i15) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(zVar, j6);
                        if (object instanceof j) {
                            int o10 = p.o(i16);
                            int size = ((j) object).size();
                            z5 = androidx.appcompat.widget.c1.z(size, size, o10, i14);
                            i14 = z5;
                            break;
                        } else {
                            o7 = p.o(i16);
                            n9 = p.n((String) object);
                            z5 = n9 + o7 + i14;
                            i14 = z5;
                        }
                    }
                case 9:
                    if ((i5 & i15) != 0) {
                        Object object2 = unsafe.getObject(zVar, j6);
                        g1 j12 = j(i13);
                        Class cls = h1.f6725a;
                        int o11 = p.o(i16);
                        int b10 = ((a) object2).b(j12);
                        i14 = androidx.appcompat.widget.c1.z(b10, b10, o11, i14);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i5 & i15) != 0) {
                        j = p.g(i16, (j) unsafe.getObject(zVar, j6));
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i5 & i15) != 0) {
                        int i20 = unsafe.getInt(zVar, j6);
                        o4 = p.o(i16);
                        l6 = p.p(i20);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i5 & i15) != 0) {
                        int i21 = unsafe.getInt(zVar, j6);
                        o4 = p.o(i16);
                        l6 = p.l(i21);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i15 & i5) != 0) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i15 & i5) != 0) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i5 & i15) != 0) {
                        int i22 = unsafe.getInt(zVar, j6);
                        o4 = p.o(i16);
                        l6 = p.m(i22);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i5 & i15) != 0) {
                        long j13 = unsafe.getLong(zVar, j6);
                        o3 = p.o(i16);
                        q = p.q((j13 >> 63) ^ (j13 << 1));
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i5 & i15) != 0) {
                        j = p.k(i16, (a) unsafe.getObject(zVar, j6), j(i13));
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = h1.f(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 19:
                    j = h1.d(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 20:
                    j = h1.j(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 21:
                    j = h1.t(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    j = h1.h(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    j = h1.f(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    j = h1.d(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case C0122e9.F /* 25 */:
                    List list = (List) unsafe.getObject(zVar, j6);
                    Class cls2 = h1.f6725a;
                    int size2 = list.size();
                    i14 += size2 == 0 ? 0 : (p.o(i16) + 1) * size2;
                    break;
                case C0122e9.G /* 26 */:
                    j = h1.q(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case C0122e9.H /* 27 */:
                    j = h1.l(i16, (List) unsafe.getObject(zVar, j6), j(i13));
                    i14 += j;
                    break;
                case 28:
                    j = h1.a(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case C0122e9.I /* 29 */:
                    j = h1.r(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 30:
                    j = h1.b(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 31:
                    j = h1.d(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 32:
                    j = h1.f(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 33:
                    j = h1.m(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case 34:
                    j = h1.o(i16, (List) unsafe.getObject(zVar, j6));
                    i14 += j;
                    break;
                case C0122e9.J /* 35 */:
                    int g10 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g10 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(g10, p.o(i16), g10, i14);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e7 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e7 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(e7, p.o(i16), e7, i14);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k6 = h1.k((List) unsafe.getObject(zVar, j6));
                    if (k6 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(k6, p.o(i16), k6, i14);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.K /* 38 */:
                    int u10 = h1.u((List) unsafe.getObject(zVar, j6));
                    if (u10 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(u10, p.o(i16), u10, i14);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i23 = h1.i((List) unsafe.getObject(zVar, j6));
                    if (i23 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(i23, p.o(i16), i23, i14);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g11 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g11 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(g11, p.o(i16), g11, i14);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    int e9 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e9 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(e9, p.o(i16), e9, i14);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.M /* 42 */:
                    List list2 = (List) unsafe.getObject(zVar, j6);
                    Class cls3 = h1.f6725a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(size3, p.o(i16), size3, i14);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s8 = h1.s((List) unsafe.getObject(zVar, j6));
                    if (s8 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(s8, p.o(i16), s8, i14);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c2 = h1.c((List) unsafe.getObject(zVar, j6));
                    if (c2 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(c2, p.o(i16), c2, i14);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e10 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e10 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(e10, p.o(i16), e10, i14);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g12 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g12 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(g12, p.o(i16), g12, i14);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n10 = h1.n((List) unsafe.getObject(zVar, j6));
                    if (n10 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(n10, p.o(i16), n10, i14);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p10 = h1.p((List) unsafe.getObject(zVar, j6));
                    if (p10 > 0) {
                        i14 = androidx.appcompat.widget.c1.z(p10, p.o(i16), p10, i14);
                        break;
                    } else {
                        break;
                    }
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list3 = (List) unsafe.getObject(zVar, j6);
                    g1 j14 = j(i13);
                    Class cls4 = h1.f6725a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (int i24 = 0; i24 < size4; i24++) {
                            i10 += p.k(i16, (a) list3.get(i24), j14);
                        }
                    }
                    i14 += i10;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(zVar, j6);
                    Object obj = this.f6795b[(i13 / 3) * 2];
                    this.j.getClass();
                    j = q0.a(i16, object3, obj);
                    i14 += j;
                    break;
                case 51:
                    if (o(i16, i13, zVar)) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(i16, i13, zVar)) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(i16, i13, zVar)) {
                        long v5 = v(j6, zVar);
                        o3 = p.o(i16);
                        q = p.q(v5);
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(i16, i13, zVar)) {
                        long v10 = v(j6, zVar);
                        o3 = p.o(i16);
                        q = p.q(v10);
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(i16, i13, zVar)) {
                        int u11 = u(j6, zVar);
                        o4 = p.o(i16);
                        l6 = p.l(u11);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(i16, i13, zVar)) {
                        j = p.j(i16);
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(i16, i13, zVar)) {
                        j = p.i(i16);
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(i16, i13, zVar)) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!o(i16, i13, zVar)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(zVar, j6);
                        if (object4 instanceof j) {
                            int o12 = p.o(i16);
                            int size5 = ((j) object4).size();
                            z5 = androidx.appcompat.widget.c1.z(size5, size5, o12, i14);
                            i14 = z5;
                            break;
                        } else {
                            o7 = p.o(i16);
                            n9 = p.n((String) object4);
                            z5 = n9 + o7 + i14;
                            i14 = z5;
                        }
                    }
                case 60:
                    if (o(i16, i13, zVar)) {
                        Object object5 = unsafe.getObject(zVar, j6);
                        g1 j15 = j(i13);
                        Class cls5 = h1.f6725a;
                        int o13 = p.o(i16);
                        int b11 = ((a) object5).b(j15);
                        i14 = androidx.appcompat.widget.c1.z(b11, b11, o13, i14);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(i16, i13, zVar)) {
                        j = p.g(i16, (j) unsafe.getObject(zVar, j6));
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(i16, i13, zVar)) {
                        int u12 = u(j6, zVar);
                        o4 = p.o(i16);
                        l6 = p.p(u12);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(i16, i13, zVar)) {
                        int u13 = u(j6, zVar);
                        o4 = p.o(i16);
                        l6 = p.l(u13);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(i16, i13, zVar)) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(i16, i13, zVar)) {
                        i14 = androidx.appcompat.widget.c1.y(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(i16, i13, zVar)) {
                        int u14 = u(j6, zVar);
                        o4 = p.o(i16);
                        l6 = p.m(u14);
                        j = l6 + o4;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(i16, i13, zVar)) {
                        long v11 = v(j6, zVar);
                        o3 = p.o(i16);
                        q = p.q((v11 >> 63) ^ (v11 << 1));
                        j = q + o3;
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(i16, i13, zVar)) {
                        j = p.k(i16, (a) unsafe.getObject(zVar, j6), j(i13));
                        i14 += j;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    public final int l(z zVar) {
        int o3;
        int q;
        int o4;
        int l6;
        int j;
        int o7;
        int n9;
        int o10;
        int q3;
        int i5;
        Unsafe unsafe = f6793l;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f6794a;
            if (i10 >= iArr.length) {
                this.f6802i.getClass();
                return zVar.unknownFields.a() + i11;
            }
            int z5 = z(i10);
            int y5 = y(z5);
            int i12 = iArr[i10];
            long j6 = z5 & 1048575;
            if (y5 >= v.f6804b.f6808a && y5 <= v.f6805c.f6808a) {
                int i13 = iArr[i10 + 2];
            }
            switch (y5) {
                case 0:
                    if (m(i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m(i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m(i10, zVar)) {
                        long i14 = x1.f6821c.i(j6, zVar);
                        o3 = p.o(i12);
                        q = p.q(i14);
                        j = q + o3;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m(i10, zVar)) {
                        long i15 = x1.f6821c.i(j6, zVar);
                        o3 = p.o(i12);
                        q = p.q(i15);
                        j = q + o3;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m(i10, zVar)) {
                        int h10 = x1.f6821c.h(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.l(h10);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m(i10, zVar)) {
                        j = p.j(i12);
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m(i10, zVar)) {
                        j = p.i(i12);
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m(i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 1, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m(i10, zVar)) {
                        Object j10 = x1.f6821c.j(j6, zVar);
                        if (j10 instanceof j) {
                            int o11 = p.o(i12);
                            int size = ((j) j10).size();
                            i11 = androidx.appcompat.widget.c1.z(size, size, o11, i11);
                            break;
                        } else {
                            o7 = p.o(i12);
                            n9 = p.n((String) j10);
                            i11 = n9 + o7 + i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m(i10, zVar)) {
                        Object j11 = x1.f6821c.j(j6, zVar);
                        g1 j12 = j(i10);
                        Class cls = h1.f6725a;
                        int o12 = p.o(i12);
                        int b10 = ((a) j11).b(j12);
                        i11 = androidx.appcompat.widget.c1.z(b10, b10, o12, i11);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m(i10, zVar)) {
                        j = p.g(i12, (j) x1.f6821c.j(j6, zVar));
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m(i10, zVar)) {
                        int h11 = x1.f6821c.h(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.p(h11);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m(i10, zVar)) {
                        int h12 = x1.f6821c.h(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.l(h12);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m(i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m(i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m(i10, zVar)) {
                        int h13 = x1.f6821c.h(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.m(h13);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m(i10, zVar)) {
                        long i16 = x1.f6821c.i(j6, zVar);
                        o10 = p.o(i12);
                        q3 = p.q((i16 >> 63) ^ (i16 << 1));
                        j = q3 + o10;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m(i10, zVar)) {
                        j = p.k(i12, (a) x1.f6821c.j(j6, zVar), j(i10));
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = h1.f(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 19:
                    j = h1.d(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 20:
                    j = h1.j(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 21:
                    j = h1.t(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    j = h1.h(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    j = h1.f(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    j = h1.d(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case C0122e9.F /* 25 */:
                    List p10 = p(zVar, j6);
                    Class cls2 = h1.f6725a;
                    int size2 = p10.size();
                    i11 += size2 == 0 ? 0 : (p.o(i12) + 1) * size2;
                    break;
                case C0122e9.G /* 26 */:
                    j = h1.q(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case C0122e9.H /* 27 */:
                    j = h1.l(i12, p(zVar, j6), j(i10));
                    i11 += j;
                    break;
                case 28:
                    j = h1.a(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case C0122e9.I /* 29 */:
                    j = h1.r(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 30:
                    j = h1.b(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 31:
                    j = h1.d(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 32:
                    j = h1.f(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 33:
                    j = h1.m(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case 34:
                    j = h1.o(i12, p(zVar, j6));
                    i11 += j;
                    break;
                case C0122e9.J /* 35 */:
                    int g10 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g10 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(g10, p.o(i12), g10, i11);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e7 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e7 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(e7, p.o(i12), e7, i11);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k6 = h1.k((List) unsafe.getObject(zVar, j6));
                    if (k6 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(k6, p.o(i12), k6, i11);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.K /* 38 */:
                    int u10 = h1.u((List) unsafe.getObject(zVar, j6));
                    if (u10 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(u10, p.o(i12), u10, i11);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i17 = h1.i((List) unsafe.getObject(zVar, j6));
                    if (i17 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(i17, p.o(i12), i17, i11);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g11 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g11 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(g11, p.o(i12), g11, i11);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    int e9 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e9 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(e9, p.o(i12), e9, i11);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.M /* 42 */:
                    List list = (List) unsafe.getObject(zVar, j6);
                    Class cls3 = h1.f6725a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(size3, p.o(i12), size3, i11);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s8 = h1.s((List) unsafe.getObject(zVar, j6));
                    if (s8 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(s8, p.o(i12), s8, i11);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c2 = h1.c((List) unsafe.getObject(zVar, j6));
                    if (c2 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(c2, p.o(i12), c2, i11);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e10 = h1.e((List) unsafe.getObject(zVar, j6));
                    if (e10 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(e10, p.o(i12), e10, i11);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g12 = h1.g((List) unsafe.getObject(zVar, j6));
                    if (g12 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(g12, p.o(i12), g12, i11);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n10 = h1.n((List) unsafe.getObject(zVar, j6));
                    if (n10 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(n10, p.o(i12), n10, i11);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p11 = h1.p((List) unsafe.getObject(zVar, j6));
                    if (p11 > 0) {
                        i11 = androidx.appcompat.widget.c1.z(p11, p.o(i12), p11, i11);
                        break;
                    } else {
                        break;
                    }
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List p12 = p(zVar, j6);
                    g1 j13 = j(i10);
                    Class cls4 = h1.f6725a;
                    int size4 = p12.size();
                    if (size4 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i18 = 0; i18 < size4; i18++) {
                            i5 += p.k(i12, (a) p12.get(i18), j13);
                        }
                    }
                    i11 += i5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object j14 = x1.f6821c.j(j6, zVar);
                    Object obj = this.f6795b[(i10 / 3) * 2];
                    this.j.getClass();
                    j = q0.a(i12, j14, obj);
                    i11 += j;
                    break;
                case 51:
                    if (o(i12, i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(i12, i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(i12, i10, zVar)) {
                        long v5 = v(j6, zVar);
                        o3 = p.o(i12);
                        q = p.q(v5);
                        j = q + o3;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(i12, i10, zVar)) {
                        long v10 = v(j6, zVar);
                        o3 = p.o(i12);
                        q = p.q(v10);
                        j = q + o3;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(i12, i10, zVar)) {
                        int u11 = u(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.l(u11);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(i12, i10, zVar)) {
                        j = p.j(i12);
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(i12, i10, zVar)) {
                        j = p.i(i12);
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(i12, i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 1, i11);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(i12, i10, zVar)) {
                        Object j15 = x1.f6821c.j(j6, zVar);
                        if (j15 instanceof j) {
                            int o13 = p.o(i12);
                            int size5 = ((j) j15).size();
                            i11 = androidx.appcompat.widget.c1.z(size5, size5, o13, i11);
                            break;
                        } else {
                            o7 = p.o(i12);
                            n9 = p.n((String) j15);
                            i11 = n9 + o7 + i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (o(i12, i10, zVar)) {
                        Object j16 = x1.f6821c.j(j6, zVar);
                        g1 j17 = j(i10);
                        Class cls5 = h1.f6725a;
                        int o14 = p.o(i12);
                        int b11 = ((a) j16).b(j17);
                        i11 = androidx.appcompat.widget.c1.z(b11, b11, o14, i11);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(i12, i10, zVar)) {
                        j = p.g(i12, (j) x1.f6821c.j(j6, zVar));
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(i12, i10, zVar)) {
                        int u12 = u(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.p(u12);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(i12, i10, zVar)) {
                        int u13 = u(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.l(u13);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(i12, i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(i12, i10, zVar)) {
                        i11 = androidx.appcompat.widget.c1.y(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(i12, i10, zVar)) {
                        int u14 = u(j6, zVar);
                        o4 = p.o(i12);
                        l6 = p.m(u14);
                        j = l6 + o4;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(i12, i10, zVar)) {
                        long v11 = v(j6, zVar);
                        o10 = p.o(i12);
                        q3 = p.q((v11 >> 63) ^ (v11 << 1));
                        j = q3 + o10;
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(i12, i10, zVar)) {
                        j = p.k(i12, (a) x1.f6821c.j(j6, zVar), j(i10));
                        i11 += j;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    public final boolean m(int i5, Object obj) {
        int i10 = this.f6794a[i5 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int z5 = z(i5);
            long j6 = z5 & 1048575;
            switch (y(z5)) {
                case 0:
                    if (Double.doubleToRawLongBits(x1.f6821c.f(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x1.f6821c.g(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x1.f6821c.i(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x1.f6821c.i(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x1.f6821c.i(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x1.f6821c.d(j6, obj);
                case 8:
                    Object j10 = x1.f6821c.j(j6, obj);
                    if (j10 instanceof String) {
                        return !((String) j10).isEmpty();
                    }
                    if (j10 instanceof j) {
                        return !j.f6736b.equals(j10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (x1.f6821c.j(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !j.f6736b.equals(x1.f6821c.j(j6, obj));
                case 11:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x1.f6821c.i(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x1.f6821c.h(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x1.f6821c.i(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x1.f6821c.j(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & x1.f6821c.h(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(int i5, int i10, Object obj) {
        return x1.f6821c.h((long) (this.f6794a[i10 + 2] & 1048575), obj) == i5;
    }

    public final void q(int i5, Object obj, Object obj2) {
        if (m(i5, obj2)) {
            long z5 = z(i5) & 1048575;
            Unsafe unsafe = f6793l;
            Object object = unsafe.getObject(obj2, z5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6794a[i5] + " is present but null: " + obj2);
            }
            g1 j = j(i5);
            if (!m(i5, obj)) {
                if (n(object)) {
                    z d10 = j.d();
                    j.a(d10, object);
                    unsafe.putObject(obj, z5, d10);
                } else {
                    unsafe.putObject(obj, z5, object);
                }
                x(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, z5);
            if (!n(object2)) {
                z d11 = j.d();
                j.a(d11, object2);
                unsafe.putObject(obj, z5, d11);
                object2 = d11;
            }
            j.a(object2, object);
        }
    }

    public final void r(int i5, Object obj, Object obj2) {
        int[] iArr = this.f6794a;
        int i10 = iArr[i5];
        if (o(i10, i5, obj2)) {
            long z5 = z(i5) & 1048575;
            Unsafe unsafe = f6793l;
            Object object = unsafe.getObject(obj2, z5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2);
            }
            g1 j = j(i5);
            if (!o(i10, i5, obj)) {
                if (n(object)) {
                    z d10 = j.d();
                    j.a(d10, object);
                    unsafe.putObject(obj, z5, d10);
                } else {
                    unsafe.putObject(obj, z5, object);
                }
                x1.o(i10, iArr[i5 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, z5);
            if (!n(object2)) {
                z d11 = j.d();
                j.a(d11, object2);
                unsafe.putObject(obj, z5, d11);
                object2 = d11;
            }
            j.a(object2, object);
        }
    }

    public final void x(int i5, Object obj) {
        int i10 = this.f6794a[i5 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        x1.o((1 << (i10 >>> 20)) | x1.f6821c.h(j, obj), j, obj);
    }

    public final int z(int i5) {
        return this.f6794a[i5 + 1];
    }
}
