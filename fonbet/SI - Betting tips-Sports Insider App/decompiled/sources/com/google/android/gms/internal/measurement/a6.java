package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import okio.Segment;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a6 implements h6 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f4911k = q6.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4913b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4914c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4915d;

    /* renamed from: e, reason: collision with root package name */
    public final q4 f4916e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4917f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4918g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4919h;

    /* renamed from: i, reason: collision with root package name */
    public final e5 f4920i;

    public a6(int[] iArr, Object[] objArr, int i5, int i10, q4 q4Var, int[] iArr2, int i11, int i12, e5 e5Var, e5 e5Var2) {
        this.f4912a = iArr;
        this.f4913b = objArr;
        this.f4914c = i5;
        this.f4915d = i10;
        this.f4917f = iArr2;
        this.f4918g = i11;
        this.f4919h = i12;
        this.f4920i = e5Var;
        this.f4916e = q4Var;
    }

    public static int F(int i5) {
        return (i5 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g5) {
            return ((g5) obj).e();
        }
        return true;
    }

    public static int k(long j6, Object obj) {
        return ((Integer) q6.j(j6, obj)).intValue();
    }

    public static long l(long j6, Object obj) {
        return ((Long) q6.j(j6, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i5, int i10, t6 t6Var, Class cls, t4 t4Var) {
        t6 t6Var2 = t6.f5253c;
        switch (t6Var.ordinal()) {
            case 0:
                int i11 = i5 + 8;
                t4Var.f5247c = Double.valueOf(Double.longBitsToDouble(d5.g0(i5, bArr)));
                return i11;
            case 1:
                int i12 = i5 + 4;
                t4Var.f5247c = Float.valueOf(Float.intBitsToFloat(d5.f0(i5, bArr)));
                return i12;
            case 2:
            case 3:
                int e0 = d5.e0(bArr, i5, t4Var);
                t4Var.f5247c = Long.valueOf(t4Var.f5246b);
                return e0;
            case 4:
            case 12:
            case 13:
                int a02 = d5.a0(bArr, i5, t4Var);
                t4Var.f5247c = Integer.valueOf(t4Var.f5245a);
                return a02;
            case 5:
            case 15:
                int i13 = i5 + 8;
                t4Var.f5247c = Long.valueOf(d5.g0(i5, bArr));
                return i13;
            case 6:
            case 14:
                int i14 = i5 + 4;
                t4Var.f5247c = Integer.valueOf(d5.f0(i5, bArr));
                return i14;
            case 7:
                int e02 = d5.e0(bArr, i5, t4Var);
                t4Var.f5247c = Boolean.valueOf(t4Var.f5246b != 0);
                return e02;
            case 8:
                return d5.h0(bArr, i5, t4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                h6 a7 = e6.f5030c.a(cls);
                g5 a10 = a7.a();
                int j0 = d5.j0(a10, a7, bArr, i5, i10, t4Var);
                a7.g(a10);
                t4Var.f5247c = a10;
                return j0;
            case 11:
                return d5.i0(bArr, i5, t4Var);
            case 16:
                int a03 = d5.a0(bArr, i5, t4Var);
                t4Var.f5247c = Integer.valueOf(f3.x.H0(t4Var.f5245a));
                return a03;
            case 17:
                int e03 = d5.e0(bArr, i5, t4Var);
                t4Var.f5247c = Long.valueOf(f3.x.J0(t4Var.f5246b));
                return e03;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a6 u(g6 g6Var, e5 e5Var, e5 e5Var2) {
        int i5;
        int charAt;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt2;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        int i25;
        Object[] objArr;
        int i26;
        Class<?> cls;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field v5;
        char charAt10;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field v10;
        Object obj2;
        Field v11;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (!(g6Var instanceof g6)) {
            g6Var.getClass();
            throw new ClassCastException();
        }
        String str = g6Var.f5061b;
        int length = str.length();
        int i41 = 55296;
        if (str.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i5 = i42 + 1;
                if (str.charAt(i42) < 55296) {
                    break;
                }
                i42 = i5;
            }
        } else {
            i5 = 1;
        }
        int i43 = i5 + 1;
        int charAt15 = str.charAt(i5);
        if (charAt15 >= 55296) {
            int i44 = charAt15 & 8191;
            int i45 = 13;
            while (true) {
                i40 = i43 + 1;
                charAt14 = str.charAt(i43);
                if (charAt14 < 55296) {
                    break;
                }
                i44 |= (charAt14 & 8191) << i45;
                i45 += 13;
                i43 = i40;
            }
            charAt15 = i44 | (charAt14 << i45);
            i43 = i40;
        }
        if (charAt15 == 0) {
            i12 = 0;
            i14 = 0;
            charAt = 0;
            i11 = 0;
            i13 = 0;
            i15 = 0;
            iArr = j;
            i10 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt16 = str.charAt(i43);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    charAt9 = str.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                charAt16 = i47 | (charAt9 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int charAt17 = str.charAt(i46);
            if (charAt17 >= 55296) {
                int i50 = charAt17 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    charAt8 = str.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                charAt17 = i50 | (charAt8 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int charAt18 = str.charAt(i49);
            if (charAt18 >= 55296) {
                int i53 = charAt18 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    charAt7 = str.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                charAt18 = i53 | (charAt7 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            int charAt19 = str.charAt(i52);
            if (charAt19 >= 55296) {
                int i56 = charAt19 & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    charAt6 = str.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                charAt19 = i56 | (charAt6 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            charAt = str.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    charAt5 = str.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                charAt = i59 | (charAt5 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            int charAt20 = str.charAt(i58);
            if (charAt20 >= 55296) {
                int i62 = charAt20 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    charAt4 = str.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                charAt20 = i62 | (charAt4 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int charAt21 = str.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    charAt3 = str.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                charAt21 = i65 | (charAt3 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int charAt22 = str.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    charAt2 = str.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                charAt22 = i68 | (charAt2 << i69);
                i67 = i16;
            }
            int i70 = charAt16 + charAt16 + charAt17;
            i10 = charAt16;
            i43 = i67;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i71 = charAt20;
            i11 = charAt18;
            i12 = i71;
            i13 = charAt19;
            i14 = i70;
            i15 = charAt22;
        }
        Unsafe unsafe = f4911k;
        Object[] objArr2 = g6Var.f5062c;
        Class<?> cls2 = g6Var.f5060a.getClass();
        int i72 = i15 + i12;
        int i73 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i73];
        int i74 = i72;
        int i75 = i15;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int charAt23 = str.charAt(i43);
            if (charAt23 >= i41) {
                int i79 = charAt23 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i39 = i80 + 1;
                    charAt13 = str.charAt(i80);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i39;
                    length = i24;
                }
                charAt23 = i79 | (charAt13 << i81);
                i25 = i39;
            } else {
                i24 = length;
                i25 = i78;
            }
            int i82 = i25 + 1;
            int charAt24 = str.charAt(i25);
            Object[] objArr4 = objArr2;
            char c2 = 55296;
            if (charAt24 >= 55296) {
                int i83 = charAt24 & 8191;
                int i84 = 13;
                while (true) {
                    i38 = i82 + 1;
                    charAt12 = str.charAt(i82);
                    if (charAt12 < c2) {
                        break;
                    }
                    i83 |= (charAt12 & 8191) << i84;
                    i84 += 13;
                    i82 = i38;
                    c2 = 55296;
                }
                charAt24 = i83 | (charAt12 << i84);
                i82 = i38;
            }
            if ((charAt24 & Segment.SHARE_MINIMUM) != 0) {
                iArr[i77] = i76;
                i77++;
            }
            int i85 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i86 = charAt23;
            int i87 = charAt24 & 2048;
            if (i85 >= 51) {
                int i88 = i82 + 1;
                int charAt25 = str.charAt(i82);
                char c8 = 55296;
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i37 = i90 + 1;
                        charAt11 = str.charAt(i90);
                        if (charAt11 < c8) {
                            break;
                        }
                        i89 |= (charAt11 & 8191) << i91;
                        i91 += 13;
                        i90 = i37;
                        c8 = 55296;
                    }
                    charAt25 = i89 | (charAt11 << i91);
                    i34 = i37;
                } else {
                    i34 = i88;
                }
                int i92 = i34;
                int i93 = i85 - 51;
                int i94 = charAt25;
                if (i93 == 9 || i93 == 17) {
                    i35 = i14 + 1;
                    int i95 = i76 / 3;
                    objArr3[i95 + i95 + 1] = objArr4[i14];
                } else {
                    if (i93 == 12) {
                        if (g6Var.a() == 1 || i87 != 0) {
                            i35 = i14 + 1;
                            int i96 = i76 / 3;
                            objArr3[i96 + i96 + 1] = objArr4[i14];
                        } else {
                            i36 = 0;
                            int i97 = i94 + i94;
                            i87 = i36;
                            obj = objArr4[i97];
                            if (obj instanceof Field) {
                                v10 = (Field) obj;
                            } else {
                                v10 = v(cls2, (String) obj);
                                objArr4[i97] = v10;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(v10);
                            int i98 = i97 + 1;
                            obj2 = objArr4[i98];
                            if (obj2 instanceof Field) {
                                v11 = (Field) obj2;
                            } else {
                                v11 = v(cls2, (String) obj2);
                                objArr4[i98] = v11;
                            }
                            i29 = i92;
                            i32 = objectFieldOffset2;
                            i28 = 55296;
                            objArr = objArr3;
                            i26 = i10;
                            cls = cls2;
                            i31 = 0;
                            i27 = (int) unsafe.objectFieldOffset(v11);
                        }
                    }
                    i36 = i87;
                    int i972 = i94 + i94;
                    i87 = i36;
                    obj = objArr4[i972];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(v10);
                    int i982 = i972 + 1;
                    obj2 = objArr4[i982];
                    if (obj2 instanceof Field) {
                    }
                    i29 = i92;
                    i32 = objectFieldOffset22;
                    i28 = 55296;
                    objArr = objArr3;
                    i26 = i10;
                    cls = cls2;
                    i31 = 0;
                    i27 = (int) unsafe.objectFieldOffset(v11);
                }
                i14 = i35;
                i36 = i87;
                int i9722 = i94 + i94;
                i87 = i36;
                obj = objArr4[i9722];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(v10);
                int i9822 = i9722 + 1;
                obj2 = objArr4[i9822];
                if (obj2 instanceof Field) {
                }
                i29 = i92;
                i32 = objectFieldOffset222;
                i28 = 55296;
                objArr = objArr3;
                i26 = i10;
                cls = cls2;
                i31 = 0;
                i27 = (int) unsafe.objectFieldOffset(v11);
            } else {
                int i99 = i14 + 1;
                Field v12 = v(cls2, (String) objArr4[i14]);
                objArr = objArr3;
                if (i85 == 9 || i85 == 17) {
                    i26 = i10;
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = v12.getType();
                } else {
                    if (i85 == 27) {
                        i26 = i10;
                        i33 = 1;
                        i14 += 2;
                    } else if (i85 == 49) {
                        i14 += 2;
                        i26 = i10;
                        i33 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            i26 = i10;
                            if (g6Var.a() == 1 || i87 != 0) {
                                i14 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArr4[i99];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i14 = i99;
                                i87 = 0;
                            }
                        } else if (i85 == 50) {
                            int i102 = i14 + 2;
                            int i103 = i75 + 1;
                            iArr[i75] = i76;
                            int i104 = i76 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArr4[i99];
                            if (i87 != 0) {
                                i14 += 3;
                                objArr[i105 + 1] = objArr4[i102];
                                cls = cls2;
                                i75 = i103;
                            } else {
                                i14 = i102;
                                cls = cls2;
                                i75 = i103;
                                i87 = 0;
                            }
                            i26 = i10;
                        } else {
                            i26 = i10;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(v12);
                        i27 = 1048575;
                        if ((charAt24 & 4096) != 0 || i85 > 17) {
                            i28 = 55296;
                            i29 = i82;
                            i30 = 0;
                        } else {
                            int i106 = i82 + 1;
                            int charAt26 = str.charAt(i82);
                            if (charAt26 >= 55296) {
                                int i107 = charAt26 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i29 = i106 + 1;
                                    charAt10 = str.charAt(i106);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i107 |= (charAt10 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i29;
                                }
                                charAt26 = i107 | (charAt10 << i108);
                            } else {
                                i29 = i106;
                            }
                            int i109 = (charAt26 / 32) + i26 + i26;
                            Object obj3 = objArr4[i109];
                            if (obj3 instanceof Field) {
                                v5 = (Field) obj3;
                            } else {
                                v5 = v(cls, (String) obj3);
                                objArr4[i109] = v5;
                            }
                            i30 = charAt26 % 32;
                            i27 = (int) unsafe.objectFieldOffset(v5);
                            i28 = 55296;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = objectFieldOffset;
                            i74++;
                        }
                        i31 = i30;
                        i32 = objectFieldOffset;
                    }
                    int i110 = i76 / 3;
                    objArr[i110 + i110 + i33] = objArr4[i99];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(v12);
                    i27 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i28 = 55296;
                    i29 = i82;
                    i30 = 0;
                    if (i85 >= 18) {
                        iArr[i74] = objectFieldOffset;
                        i74++;
                    }
                    i31 = i30;
                    i32 = objectFieldOffset;
                }
                cls = cls2;
                i14 = i99;
                objectFieldOffset = (int) unsafe.objectFieldOffset(v12);
                i27 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i28 = 55296;
                i29 = i82;
                i30 = 0;
                if (i85 >= 18) {
                }
                i31 = i30;
                i32 = objectFieldOffset;
            }
            int i111 = i87;
            int i112 = i76 + 1;
            iArr2[i76] = i86;
            int i113 = i76 + 2;
            String str2 = str;
            iArr2[i112] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i111 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i32;
            i76 += 3;
            iArr2[i113] = (i31 << 20) | i27;
            cls2 = cls;
            objArr2 = objArr4;
            i41 = i28;
            length = i24;
            objArr3 = objArr;
            i10 = i26;
            i43 = i29;
            str = str2;
        }
        return new a6(iArr2, objArr3, i11, i13, g6Var.f5060a, iArr, i15, i72, e5Var, e5Var2);
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e7) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            r4.k.s(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(d9.e.l(sb2, " not found. Known fields are ", arrays), e7);
        }
    }

    public final Object A(int i5, Object obj) {
        h6 y5 = y(i5);
        int E = E(i5) & 1048575;
        if (!o(i5, obj)) {
            return y5.a();
        }
        Object object = f4911k.getObject(obj, E);
        if (j(object)) {
            return object;
        }
        g5 a7 = y5.a();
        if (object != null) {
            y5.c(a7, object);
        }
        return a7;
    }

    public final void B(int i5, Object obj, Object obj2) {
        f4911k.putObject(obj, E(i5) & 1048575, obj2);
        p(i5, obj);
    }

    public final Object C(int i5, int i10, Object obj) {
        h6 y5 = y(i10);
        if (!q(i5, i10, obj)) {
            return y5.a();
        }
        Object object = f4911k.getObject(obj, E(i10) & 1048575);
        if (j(object)) {
            return object;
        }
        g5 a7 = y5.a();
        if (object != null) {
            y5.c(a7, object);
        }
        return a7;
    }

    public final void D(int i5, int i10, Object obj, Object obj2) {
        f4911k.putObject(obj, E(i10) & 1048575, obj2);
        q6.g(i5, this.f4912a[i10 + 2] & 1048575, obj);
    }

    public final int E(int i5) {
        return this.f4912a[i5 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final g5 a() {
        return (g5) ((g5) this.f4916e).o(4);
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final boolean b(Object obj) {
        int i5;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f4918g) {
            int i15 = this.f4917f[i13];
            int[] iArr = this.f4912a;
            int i16 = iArr[i15];
            int E = E(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f4911k.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i5 = i18;
            } else {
                int i20 = i12;
                i5 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & E) == 0 || n(obj, i10, i5, i11, i19)) {
                int F = F(E);
                if (F == 9 || F == 17) {
                    if (n(obj, i10, i5, i11, i19) && !y(i10).b(q6.j(E & 1048575, obj))) {
                    }
                    i13++;
                    i14 = i5;
                    i12 = i11;
                } else {
                    if (F != 27) {
                        if (F == 60 || F == 68) {
                            if (q(i16, i10, obj) && !y(i10).b(q6.j(E & 1048575, obj))) {
                            }
                            i13++;
                            i14 = i5;
                            i12 = i11;
                        } else if (F != 49) {
                            if (F != 50) {
                                continue;
                            } else {
                                w5 w5Var = (w5) q6.j(E & 1048575, obj);
                                if (w5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i10 / 3;
                                    if (((t6) ((v5) this.f4913b[i21 + i21]).f5284a.f5244b).f5256a == u6.f5276i) {
                                        h6 h6Var = null;
                                        for (Object obj2 : w5Var.values()) {
                                            if (h6Var == null) {
                                                h6Var = e6.f5030c.a(obj2.getClass());
                                            }
                                            if (!h6Var.b(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i5;
                            i12 = i11;
                        }
                    }
                    List list = (List) q6.j(E & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        h6 y5 = y(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (y5.b(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i5;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.h6
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!j(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f4912a;
            if (i5 >= iArr.length) {
                i6.b(obj, obj2);
                return;
            }
            int E = E(i5);
            int i10 = E & 1048575;
            int F = F(E);
            int i11 = iArr[i5];
            long j6 = i10;
            switch (F) {
                case 0:
                    if (o(i5, obj2)) {
                        p6 p6Var = q6.f5199c;
                        obj3 = obj;
                        p6Var.g(obj3, j6, p6Var.f(j6, obj2));
                        p(i5, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i5, obj2)) {
                        p6 p6Var2 = q6.f5199c;
                        p6Var2.e(obj, j6, p6Var2.d(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i5, obj2)) {
                        q6.i(obj, j6, q6.h(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i5, obj2)) {
                        q6.i(obj, j6, q6.h(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i5, obj2)) {
                        q6.i(obj, j6, q6.h(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i5, obj2)) {
                        p6 p6Var3 = q6.f5199c;
                        p6Var3.c(obj, j6, p6Var3.b(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i5, obj2)) {
                        q6.k(j6, obj, q6.j(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i5, obj2)) {
                        q6.k(j6, obj, q6.j(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i5, obj2)) {
                        q6.i(obj, j6, q6.h(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i5, obj2)) {
                        q6.g(q6.f(j6, obj2), j6, obj);
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i5, obj2)) {
                        q6.i(obj, j6, q6.h(j6, obj2));
                        p(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i5, obj, obj2);
                    obj3 = obj;
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
                    m5 m5Var = (m5) q6.j(j6, obj);
                    m5 m5Var2 = (m5) q6.j(j6, obj2);
                    int size = m5Var.size();
                    int size2 = m5Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((r4) m5Var).f5228a) {
                            m5Var = m5Var.i0(size2 + size);
                        }
                        m5Var.addAll(m5Var2);
                    }
                    if (size > 0) {
                        m5Var2 = m5Var;
                    }
                    q6.k(j6, obj, m5Var2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    e5 e5Var = i6.f5086a;
                    q6.k(j6, obj, e5.c(q6.j(j6, obj), q6.j(j6, obj2)));
                    obj3 = obj;
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
                    if (q(i11, i5, obj2)) {
                        q6.k(j6, obj, q6.j(j6, obj2));
                        q6.g(i11, iArr[i5 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i11, i5, obj2)) {
                        q6.k(j6, obj, q6.j(j6, obj2));
                        q6.g(i11, iArr[i5 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    x(i5, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i5 += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final int d(q4 q4Var) {
        int i5;
        int b02;
        int K;
        int i10;
        int i11;
        int b10;
        int b03;
        int size;
        int r5;
        int b04;
        int b05;
        int b06;
        int i12;
        int b07;
        int K2;
        a6 a6Var = this;
        q4 q4Var2 = q4Var;
        Unsafe unsafe = f4911k;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = a6Var.f4912a;
            if (i15 >= iArr.length) {
                return ((g5) q4Var).zzc.c() + i17;
            }
            int E = a6Var.E(i15);
            int F = F(E);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & i13;
            if (F <= 17) {
                if (i20 != i14) {
                    i16 = i20 == i13 ? 0 : unsafe.getInt(q4Var2, i20);
                    i14 = i20;
                }
                i5 = 1 << (i19 >>> 20);
            } else {
                i5 = 0;
            }
            int i21 = E & i13;
            if (F >= c5.f4948b.f4952a) {
                c5.f4949c.getClass();
            }
            long j6 = i21;
            switch (F) {
                case 0:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        long j10 = unsafe.getLong(q4Var2, j6);
                        b02 = x4.b0(i18 << 3);
                        K = x4.K(j10);
                        i10 = K + b02;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        long j11 = unsafe.getLong(q4Var2, j6);
                        b02 = x4.b0(i18 << 3);
                        K = x4.K(j11);
                        i10 = K + b02;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        long j12 = unsafe.getInt(q4Var2, j6);
                        b02 = x4.b0(i18 << 3);
                        K = x4.K(j12);
                        i10 = K + b02;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 1, i17);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        int i22 = i18 << 3;
                        Object object = unsafe.getObject(q4Var2, j6);
                        if (object instanceof w4) {
                            int b08 = x4.b0(i22);
                            int c2 = ((w4) object).c();
                            i17 = androidx.appcompat.widget.c1.g(c2, c2, b08, i17);
                            break;
                        } else {
                            b02 = x4.b0(i22);
                            K = x4.L((String) object);
                            i10 = K + b02;
                            i17 += i10;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        Object object2 = unsafe.getObject(q4Var2, j6);
                        h6 y5 = a6Var.y(i15);
                        e5 e5Var = i6.f5086a;
                        int b09 = x4.b0(i18 << 3);
                        int b11 = ((q4) object2).b(y5);
                        i17 = androidx.appcompat.widget.c1.g(b11, b11, b09, i17);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        w4 w4Var = (w4) unsafe.getObject(q4Var2, j6);
                        int b010 = x4.b0(i18 << 3);
                        int c8 = w4Var.c();
                        i17 = androidx.appcompat.widget.c1.g(c8, c8, b010, i17);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(unsafe.getInt(q4Var2, j6), x4.b0(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        long j13 = unsafe.getInt(q4Var2, j6);
                        b02 = x4.b0(i18 << 3);
                        K = x4.K(j13);
                        i10 = K + b02;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        int i23 = unsafe.getInt(q4Var2, j6);
                        i17 = androidx.appcompat.widget.c1.f((i23 >> 31) ^ (i23 + i23), x4.b0(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        long j14 = unsafe.getLong(q4Var2, j6);
                        b02 = x4.b0(i18 << 3);
                        K = x4.K((j14 >> 63) ^ (j14 + j14));
                        i10 = K + b02;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (a6Var.n(q4Var2, i15, i14, i16, i5)) {
                        q4 q4Var3 = (q4) unsafe.getObject(q4Var2, j6);
                        h6 y10 = a6Var.y(i15);
                        int b011 = x4.b0(i18 << 3);
                        i11 = b011 + b011;
                        b10 = q4Var3.b(y10);
                        i10 = b10 + i11;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = i6.y(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case 19:
                    i10 = i6.x(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var2 = i6.f5086a;
                    if (list.size() != 0) {
                        b03 = (x4.b0(i18 << 3) * list.size()) + i6.q(list);
                        i17 += b03;
                        break;
                    }
                    b03 = 0;
                    i17 += b03;
                case 21:
                    List list2 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var3 = i6.f5086a;
                    size = list2.size();
                    if (size != 0) {
                        r5 = i6.r(list2);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var4 = i6.f5086a;
                    size = list3.size();
                    if (size != 0) {
                        r5 = i6.u(list3);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    i10 = i6.y(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    i10 = i6.x(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case C0122e9.F /* 25 */:
                    List list4 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var5 = i6.f5086a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        b03 = (x4.b0(i18 << 3) + 1) * size2;
                        i17 += b03;
                        break;
                    }
                    b03 = 0;
                    i17 += b03;
                case C0122e9.G /* 26 */:
                    List list5 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var6 = i6.f5086a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        b05 = x4.b0(i18 << 3) * size3;
                        for (int i24 = 0; i24 < size3; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof w4) {
                                int c10 = ((w4) obj).c();
                                b05 = androidx.appcompat.widget.c1.f(c10, c10, b05);
                            } else {
                                b05 = x4.L((String) obj) + b05;
                            }
                        }
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case C0122e9.H /* 27 */:
                    List list6 = (List) unsafe.getObject(q4Var2, j6);
                    h6 y11 = a6Var.y(i15);
                    e5 e5Var7 = i6.f5086a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        b06 = 0;
                    } else {
                        b06 = x4.b0(i18 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            int b12 = ((q4) list6.get(i25)).b(y11);
                            b06 = androidx.appcompat.widget.c1.f(b12, b12, b06);
                        }
                    }
                    i17 += b06;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var8 = i6.f5086a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        b05 = x4.b0(i18 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int c11 = ((w4) list7.get(i26)).c();
                            b05 = androidx.appcompat.widget.c1.f(c11, c11, b05);
                        }
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case C0122e9.I /* 29 */:
                    List list8 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var9 = i6.f5086a;
                    size = list8.size();
                    if (size != 0) {
                        r5 = i6.v(list8);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case 30:
                    List list9 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var10 = i6.f5086a;
                    size = list9.size();
                    if (size != 0) {
                        r5 = i6.t(list9);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case 31:
                    i10 = i6.x(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case 32:
                    i10 = i6.y(i18, (List) unsafe.getObject(q4Var2, j6));
                    i17 += i10;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var11 = i6.f5086a;
                    size = list10.size();
                    if (size != 0) {
                        r5 = i6.w(list10);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case 34:
                    List list11 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var12 = i6.f5086a;
                    size = list11.size();
                    if (size != 0) {
                        r5 = i6.s(list11);
                        b04 = x4.b0(i18 << 3);
                        b05 = (b04 * size) + r5;
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case C0122e9.J /* 35 */:
                    List list12 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var13 = i6.f5086a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size6, x4.b0(i18 << 3), size6, i17);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var14 = i6.f5086a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size7, x4.b0(i18 << 3), size7, i17);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int q = i6.q((List) unsafe.getObject(q4Var2, j6));
                    if (q > 0) {
                        i17 = androidx.appcompat.widget.c1.g(q, x4.b0(i18 << 3), q, i17);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.K /* 38 */:
                    int r6 = i6.r((List) unsafe.getObject(q4Var2, j6));
                    if (r6 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(r6, x4.b0(i18 << 3), r6, i17);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int u10 = i6.u((List) unsafe.getObject(q4Var2, j6));
                    if (u10 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(u10, x4.b0(i18 << 3), u10, i17);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var15 = i6.f5086a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size8, x4.b0(i18 << 3), size8, i17);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var16 = i6.f5086a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size9, x4.b0(i18 << 3), size9, i17);
                        break;
                    } else {
                        break;
                    }
                case C0122e9.M /* 42 */:
                    List list16 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var17 = i6.f5086a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size10, x4.b0(i18 << 3), size10, i17);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int v5 = i6.v((List) unsafe.getObject(q4Var2, j6));
                    if (v5 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(v5, x4.b0(i18 << 3), v5, i17);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int t3 = i6.t((List) unsafe.getObject(q4Var2, j6));
                    if (t3 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(t3, x4.b0(i18 << 3), t3, i17);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var18 = i6.f5086a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size11, x4.b0(i18 << 3), size11, i17);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(q4Var2, j6);
                    e5 e5Var19 = i6.f5086a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(size12, x4.b0(i18 << 3), size12, i17);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int w10 = i6.w((List) unsafe.getObject(q4Var2, j6));
                    if (w10 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(w10, x4.b0(i18 << 3), w10, i17);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int s8 = i6.s((List) unsafe.getObject(q4Var2, j6));
                    if (s8 > 0) {
                        i17 = androidx.appcompat.widget.c1.g(s8, x4.b0(i18 << 3), s8, i17);
                        break;
                    } else {
                        break;
                    }
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list19 = (List) unsafe.getObject(q4Var2, j6);
                    h6 y12 = a6Var.y(i15);
                    e5 e5Var20 = i6.f5086a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i27 = 0; i27 < size13; i27++) {
                            q4 q4Var4 = (q4) list19.get(i27);
                            int b012 = x4.b0(i18 << 3);
                            i12 += q4Var4.b(y12) + b012 + b012;
                        }
                    }
                    i17 += i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    int i28 = i15 / 3;
                    w5 w5Var = (w5) unsafe.getObject(q4Var2, j6);
                    v5 v5Var = (v5) a6Var.f4913b[i28 + i28];
                    if (!w5Var.isEmpty()) {
                        b05 = 0;
                        for (Map.Entry entry : w5Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            t tVar = v5Var.f5284a;
                            int b013 = x4.b0(i18 << 3);
                            int b13 = v5.b(tVar, key, value);
                            b05 = androidx.appcompat.widget.c1.g(b13, b13, b013, b05);
                        }
                        i17 += b05;
                        break;
                    }
                    b05 = 0;
                    i17 += b05;
                case 51:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        long l6 = l(j6, q4Var2);
                        b07 = x4.b0(i18 << 3);
                        K2 = x4.K(l6);
                        i17 += K2 + b07;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        long l10 = l(j6, q4Var2);
                        b07 = x4.b0(i18 << 3);
                        K2 = x4.K(l10);
                        i17 += K2 + b07;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        long k6 = k(j6, q4Var2);
                        b07 = x4.b0(i18 << 3);
                        K2 = x4.K(k6);
                        i17 += K2 + b07;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 1, i17);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        int i29 = i18 << 3;
                        Object object3 = unsafe.getObject(q4Var2, j6);
                        if (object3 instanceof w4) {
                            int b014 = x4.b0(i29);
                            int c12 = ((w4) object3).c();
                            i17 = androidx.appcompat.widget.c1.g(c12, c12, b014, i17);
                            break;
                        } else {
                            b07 = x4.b0(i29);
                            K2 = x4.L((String) object3);
                            i17 += K2 + b07;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        Object object4 = unsafe.getObject(q4Var2, j6);
                        h6 y13 = a6Var.y(i15);
                        e5 e5Var21 = i6.f5086a;
                        int b015 = x4.b0(i18 << 3);
                        int b14 = ((q4) object4).b(y13);
                        i17 = androidx.appcompat.widget.c1.g(b14, b14, b015, i17);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        w4 w4Var2 = (w4) unsafe.getObject(q4Var2, j6);
                        int b016 = x4.b0(i18 << 3);
                        int c13 = w4Var2.c();
                        i17 = androidx.appcompat.widget.c1.g(c13, c13, b016, i17);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(k(j6, q4Var2), x4.b0(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        long k9 = k(j6, q4Var2);
                        b07 = x4.b0(i18 << 3);
                        K2 = x4.K(k9);
                        i17 += K2 + b07;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        i17 = androidx.appcompat.widget.c1.f(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        int k10 = k(j6, q4Var2);
                        i17 = androidx.appcompat.widget.c1.f((k10 >> 31) ^ (k10 + k10), x4.b0(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        long l11 = l(j6, q4Var2);
                        b07 = x4.b0(i18 << 3);
                        K2 = x4.K((l11 >> 63) ^ (l11 + l11));
                        i17 += K2 + b07;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a6Var.q(i18, i15, q4Var2)) {
                        q4 q4Var5 = (q4) unsafe.getObject(q4Var2, j6);
                        h6 y14 = a6Var.y(i15);
                        int b017 = x4.b0(i18 << 3);
                        i11 = b017 + b017;
                        b10 = q4Var5.b(y14);
                        i10 = b10 + i11;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
            }
            i15 += 3;
            a6Var = this;
            q4Var2 = q4Var;
            i13 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void e(Object obj, u5 u5Var) {
        int i5;
        a6 a6Var = this;
        Unsafe unsafe = f4911k;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = a6Var.f4912a;
            if (i11 >= iArr.length) {
                ((g5) obj).zzc.b(u5Var);
                return;
            }
            int E = a6Var.E(i11);
            int F = F(E);
            int i14 = iArr[i11];
            if (F <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i10;
                if (i16 != i13) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i13 = i16;
                }
                i5 = 1 << (i15 >>> 20);
            } else {
                i5 = 0;
            }
            long j6 = E & i10;
            switch (F) {
                case 0:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).R(i14, Double.doubleToRawLongBits(q6.f5199c.f(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).P(i14, Float.floatToRawIntBits(q6.f5199c.d(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).Q(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).Q(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).N(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).R(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).P(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        boolean b10 = q6.f5199c.b(j6, obj);
                        x4 x4Var = (x4) u5Var.f5267a;
                        x4Var.V(i14 << 3);
                        x4Var.T(b10 ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            x4 x4Var2 = (x4) u5Var.f5267a;
                            x4Var2.V((i14 << 3) | 2);
                            x4Var2.a0((String) object);
                            break;
                        } else {
                            x4 x4Var3 = (x4) u5Var.f5267a;
                            x4Var3.V((i14 << 3) | 2);
                            x4Var3.S((w4) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        u5Var.d(i14, unsafe.getObject(obj, j6), a6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        w4 w4Var = (w4) unsafe.getObject(obj, j6);
                        x4 x4Var4 = (x4) u5Var.f5267a;
                        x4Var4.V((i14 << 3) | 2);
                        x4Var4.S(w4Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).O(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).N(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).P(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        ((x4) u5Var.f5267a).R(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        int i17 = unsafe.getInt(obj, j6);
                        ((x4) u5Var.f5267a).O(i14, (i17 >> 31) ^ (i17 + i17));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        long j10 = unsafe.getLong(obj, j6);
                        ((x4) u5Var.f5267a).Q(i14, (j10 >> 63) ^ (j10 + j10));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (a6Var.n(obj, i11, i13, i12, i5)) {
                        u5Var.e(i14, unsafe.getObject(obj, j6), a6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i6.c(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 19:
                    i6.d(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 20:
                    i6.e(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 21:
                    i6.f(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    i6.j(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    i6.h(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    i6.m(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case C0122e9.F /* 25 */:
                    i6.p(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case C0122e9.G /* 26 */:
                    int i18 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j6);
                    e5 e5Var = i6.f5086a;
                    if (list != null && !list.isEmpty()) {
                        u5Var.getClass();
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            x4 x4Var5 = (x4) u5Var.f5267a;
                            String str = (String) list.get(i19);
                            x4Var5.V((i18 << 3) | 2);
                            x4Var5.a0(str);
                        }
                        break;
                    }
                    break;
                case C0122e9.H /* 27 */:
                    int i20 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    h6 y5 = a6Var.y(i11);
                    e5 e5Var2 = i6.f5086a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            u5Var.d(i20, list2.get(i21), y5);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i22 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    e5 e5Var3 = i6.f5086a;
                    if (list3 != null && !list3.isEmpty()) {
                        u5Var.getClass();
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            x4 x4Var6 = (x4) u5Var.f5267a;
                            w4 w4Var2 = (w4) list3.get(i23);
                            x4Var6.V((i22 << 3) | 2);
                            x4Var6.S(w4Var2);
                        }
                        break;
                    }
                    break;
                case C0122e9.I /* 29 */:
                    i6.k(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 30:
                    i6.o(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 31:
                    i6.n(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 32:
                    i6.i(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 33:
                    i6.l(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case 34:
                    i6.g(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, false);
                    break;
                case C0122e9.J /* 35 */:
                    i6.c(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 36:
                    i6.d(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 37:
                    i6.e(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case C0122e9.K /* 38 */:
                    i6.f(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 39:
                    i6.j(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 40:
                    i6.h(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i6.m(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case C0122e9.M /* 42 */:
                    i6.p(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 43:
                    i6.k(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 44:
                    i6.o(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 45:
                    i6.n(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 46:
                    i6.i(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 47:
                    i6.l(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case 48:
                    i6.g(iArr[i11], (List) unsafe.getObject(obj, j6), u5Var, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    int i24 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    h6 y10 = a6Var.y(i11);
                    e5 e5Var4 = i6.f5086a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i25 = 0; i25 < list4.size(); i25++) {
                            u5Var.e(i24, list4.get(i25), y10);
                        }
                        break;
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j6);
                    if (object2 != null) {
                        int i26 = i11 / 3;
                        t tVar = ((v5) a6Var.f4913b[i26 + i26]).f5284a;
                        u5Var.getClass();
                        for (Map.Entry entry : ((w5) object2).entrySet()) {
                            x4 x4Var7 = (x4) u5Var.f5267a;
                            x4Var7.M(i14, 2);
                            x4Var7.V(v5.b(tVar, entry.getKey(), entry.getValue()));
                            v5.a(x4Var7, tVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).R(i14, Double.doubleToRawLongBits(((Double) q6.j(j6, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).P(i14, Float.floatToRawIntBits(((Float) q6.j(j6, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).Q(i14, l(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).Q(i14, l(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).N(i14, k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).R(i14, l(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).P(i14, k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a6Var.q(i14, i11, obj)) {
                        boolean booleanValue = ((Boolean) q6.j(j6, obj)).booleanValue();
                        x4 x4Var8 = (x4) u5Var.f5267a;
                        x4Var8.V(i14 << 3);
                        x4Var8.T(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a6Var.q(i14, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j6);
                        if (object3 instanceof String) {
                            x4 x4Var9 = (x4) u5Var.f5267a;
                            x4Var9.V((i14 << 3) | 2);
                            x4Var9.a0((String) object3);
                            break;
                        } else {
                            x4 x4Var10 = (x4) u5Var.f5267a;
                            x4Var10.V((i14 << 3) | 2);
                            x4Var10.S((w4) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (a6Var.q(i14, i11, obj)) {
                        u5Var.d(i14, unsafe.getObject(obj, j6), a6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a6Var.q(i14, i11, obj)) {
                        w4 w4Var3 = (w4) unsafe.getObject(obj, j6);
                        x4 x4Var11 = (x4) u5Var.f5267a;
                        x4Var11.V((i14 << 3) | 2);
                        x4Var11.S(w4Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).O(i14, k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).N(i14, k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).P(i14, k(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a6Var.q(i14, i11, obj)) {
                        ((x4) u5Var.f5267a).R(i14, l(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a6Var.q(i14, i11, obj)) {
                        int k6 = k(j6, obj);
                        ((x4) u5Var.f5267a).O(i14, (k6 >> 31) ^ (k6 + k6));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a6Var.q(i14, i11, obj)) {
                        long l6 = l(j6, obj);
                        ((x4) u5Var.f5267a).Q(i14, (l6 >> 63) ^ (l6 + l6));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a6Var.q(i14, i11, obj)) {
                        u5Var.e(i14, unsafe.getObject(obj, j6), a6Var.y(i11));
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
            i10 = 1048575;
            a6Var = this;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final boolean f(g5 g5Var, g5 g5Var2) {
        boolean a7;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f4912a;
            if (i5 < iArr.length) {
                int E = E(i5);
                long j6 = E & 1048575;
                switch (F(E)) {
                    case 0:
                        if (!m(g5Var, g5Var2, i5)) {
                            break;
                        } else {
                            p6 p6Var = q6.f5199c;
                            if (Double.doubleToLongBits(p6Var.f(j6, g5Var)) != Double.doubleToLongBits(p6Var.f(j6, g5Var2))) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 1:
                        if (!m(g5Var, g5Var2, i5)) {
                            break;
                        } else {
                            p6 p6Var2 = q6.f5199c;
                            if (Float.floatToIntBits(p6Var2.d(j6, g5Var)) != Float.floatToIntBits(p6Var2.d(j6, g5Var2))) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 2:
                        if (m(g5Var, g5Var2, i5) && q6.h(j6, g5Var) == q6.h(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 3:
                        if (m(g5Var, g5Var2, i5) && q6.h(j6, g5Var) == q6.h(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 4:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 5:
                        if (m(g5Var, g5Var2, i5) && q6.h(j6, g5Var) == q6.h(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 6:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 7:
                        if (!m(g5Var, g5Var2, i5)) {
                            break;
                        } else {
                            p6 p6Var3 = q6.f5199c;
                            if (p6Var3.b(j6, g5Var) != p6Var3.b(j6, g5Var2)) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 8:
                        if (m(g5Var, g5Var2, i5) && i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 9:
                        if (m(g5Var, g5Var2, i5) && i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 10:
                        if (m(g5Var, g5Var2, i5) && i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 11:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 12:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 13:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 14:
                        if (m(g5Var, g5Var2, i5) && q6.h(j6, g5Var) == q6.h(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 15:
                        if (m(g5Var, g5Var2, i5) && q6.f(j6, g5Var) == q6.f(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 16:
                        if (m(g5Var, g5Var2, i5) && q6.h(j6, g5Var) == q6.h(j6, g5Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 17:
                        if (m(g5Var, g5Var2, i5) && i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2))) {
                            continue;
                            i5 += 3;
                        }
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
                        a7 = i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        a7 = i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2));
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
                        long j10 = iArr[i5 + 2] & 1048575;
                        if (q6.f(j10, g5Var) == q6.f(j10, g5Var2) && i6.a(q6.j(j6, g5Var), q6.j(j6, g5Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    default:
                        i5 += 3;
                }
                if (a7) {
                    i5 += 3;
                }
            } else if (g5Var.zzc.equals(g5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void g(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            g5Var.j();
            g5Var.zza = 0;
            g5Var.f();
        }
        int i5 = 0;
        while (true) {
            int[] iArr = this.f4912a;
            if (i5 >= iArr.length) {
                this.f4920i.getClass();
                l6 l6Var = ((g5) obj).zzc;
                if (l6Var.f5131e) {
                    l6Var.f5131e = false;
                    return;
                }
                return;
            }
            int E = E(i5);
            int i10 = 1048575 & E;
            int F = F(E);
            long j6 = i10;
            if (F != 9) {
                if (F != 60 && F != 68) {
                    switch (F) {
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
                            r4 r4Var = (r4) ((m5) q6.j(j6, obj));
                            if (!r4Var.f5228a) {
                                break;
                            } else {
                                r4Var.f5228a = false;
                                break;
                            }
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = f4911k;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((w5) object).f5338a = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (q(iArr[i5], i5, obj)) {
                    y(i5).g(f4911k.getObject(obj, j6));
                }
                i5 += 3;
            }
            if (o(i5, obj)) {
                y(i5).g(f4911k.getObject(obj, j6));
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void h(Object obj, byte[] bArr, int i5, int i10, t4 t4Var) {
        t(obj, bArr, i5, i10, 0, t4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.measurement.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(g5 g5Var) {
        int i5;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f4912a;
            if (i13 >= iArr.length) {
                return g5Var.zzc.hashCode() + (i14 * 53);
            }
            int E = E(i13);
            int i15 = 1048575 & E;
            int F = F(E);
            int i16 = iArr[i13];
            long j6 = i15;
            int i17 = 1237;
            int i18 = 37;
            switch (F) {
                case 0:
                    i5 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(q6.f5199c.f(j6, g5Var));
                    Charset charset = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i10 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(q6.f5199c.d(j6, g5Var));
                    i14 = floatToIntBits + i10;
                    break;
                case 2:
                    i5 = i14 * 53;
                    doubleToLongBits = q6.h(j6, g5Var);
                    Charset charset2 = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i5 = i14 * 53;
                    doubleToLongBits = q6.h(j6, g5Var);
                    Charset charset3 = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 5:
                    i5 = i14 * 53;
                    doubleToLongBits = q6.h(j6, g5Var);
                    Charset charset4 = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i14 * 53;
                    boolean b10 = q6.f5199c.b(j6, g5Var);
                    Charset charset5 = n5.f5148a;
                    break;
                case 8:
                    i10 = i14 * 53;
                    floatToIntBits = ((String) q6.j(j6, g5Var)).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object j10 = q6.j(j6, g5Var);
                    if (j10 != null) {
                        i18 = j10.hashCode();
                    }
                    i14 = i12 + i18;
                    break;
                case 10:
                    i10 = i14 * 53;
                    floatToIntBits = q6.j(j6, g5Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 11:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 12:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 13:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 14:
                    i5 = i14 * 53;
                    doubleToLongBits = q6.h(j6, g5Var);
                    Charset charset6 = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i10 = i14 * 53;
                    floatToIntBits = q6.f(j6, g5Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 16:
                    i5 = i14 * 53;
                    doubleToLongBits = q6.h(j6, g5Var);
                    Charset charset7 = n5.f5148a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object j11 = q6.j(j6, g5Var);
                    if (j11 != null) {
                        i18 = j11.hashCode();
                    }
                    i14 = i12 + i18;
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
                    i10 = i14 * 53;
                    floatToIntBits = q6.j(j6, g5Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i10 = i14 * 53;
                    floatToIntBits = q6.j(j6, g5Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 51:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) q6.j(j6, g5Var)).doubleValue());
                        Charset charset8 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) q6.j(j6, g5Var)).floatValue());
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = l(j6, g5Var);
                        Charset charset9 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = l(j6, g5Var);
                        Charset charset10 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 56:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = l(j6, g5Var);
                        Charset charset11 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 58:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        boolean booleanValue = ((Boolean) q6.j(j6, g5Var)).booleanValue();
                        Charset charset12 = n5.f5148a;
                        break;
                    }
                case 59:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = ((String) q6.j(j6, g5Var)).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = q6.j(j6, g5Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = q6.j(j6, g5Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 63:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 64:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 65:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = l(j6, g5Var);
                        Charset charset13 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(j6, g5Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 67:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = l(j6, g5Var);
                        Charset charset14 = n5.f5148a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!q(i16, i13, g5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = q6.j(j6, g5Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    public final boolean m(g5 g5Var, g5 g5Var2, int i5) {
        return o(i5, g5Var) == o(i5, g5Var2);
    }

    public final boolean n(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? o(i5, obj) : (i11 & i12) != 0;
    }

    public final boolean o(int i5, Object obj) {
        int i10 = this.f4912a[i5 + 2];
        long j6 = i10 & 1048575;
        if (j6 == 1048575) {
            int E = E(i5);
            long j10 = E & 1048575;
            switch (F(E)) {
                case 0:
                    if (Double.doubleToRawLongBits(q6.f5199c.f(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q6.f5199c.d(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q6.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q6.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q6.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q6.f5199c.b(j10, obj);
                case 8:
                    Object j11 = q6.j(j10, obj);
                    if (j11 instanceof String) {
                        if (((String) j11).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(j11 instanceof w4)) {
                            throw new IllegalArgumentException();
                        }
                        if (w4.f5334c.equals(j11)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (q6.j(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (w4.f5334c.equals(q6.j(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q6.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q6.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q6.h(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q6.j(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & q6.f(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i5, Object obj) {
        int i10 = this.f4912a[i5 + 2];
        long j6 = 1048575 & i10;
        if (j6 == 1048575) {
            return;
        }
        q6.g((1 << (i10 >>> 20)) | q6.f(j6, obj), j6, obj);
    }

    public final boolean q(int i5, int i10, Object obj) {
        return q6.f((long) (this.f4912a[i10 + 2] & 1048575), obj) == i5;
    }

    public final int r(int i5, int i10) {
        int[] iArr = this.f4912a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i5 == i13) {
                return i12;
            }
            if (i5 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1099, code lost:
    
        if (r15 != r11) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x10a1, code lost:
    
        throw new com.google.android.gms.internal.measurement.p5(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0fb2, code lost:
    
        if (r8 == 1048575) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0fb4, code lost:
    
        r0.putInt(r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0fb8, code lost:
    
        r0 = r12.f4918g;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0fbe, code lost:
    
        if (r0 >= r12.f4919h) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0fc0, code lost:
    
        r2 = r12.f4917f[r0];
        r4 = r9[r2];
        r7 = com.google.android.gms.internal.measurement.q6.j(r12.E(r2) & 1048575, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0fd4, code lost:
    
        if (r7 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0fd6, code lost:
    
        r8 = r12.z(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0fda, code lost:
    
        if (r8 == null) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0fdc, code lost:
    
        r2 = r2 / 3;
        r2 = ((com.google.android.gms.internal.measurement.v5) r17[r2 + r2]).f5284a;
        r7 = ((com.google.android.gms.internal.measurement.w5) r7).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ff3, code lost:
    
        if (r7.hasNext() == false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0ff5, code lost:
    
        r9 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x1009, code lost:
    
        if (r8.a(((java.lang.Integer) r9.getValue()).intValue()) != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x106c, code lost:
    
        r3 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x100b, code lost:
    
        if (r1 != null) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x00f8, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x00fb, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x00fd, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x100d, code lost:
    
        r12.getClass();
        r1 = (com.google.android.gms.internal.measurement.g5) r3;
        r13 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x1015, code lost:
    
        if (r13 != r10) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0179, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x1017, code lost:
    
        r13 = com.google.android.gms.internal.measurement.l6.a();
        r1.zzc = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x101d, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x101e, code lost:
    
        r13 = com.google.android.gms.internal.measurement.v5.b(r2, r9.getKey(), r9.getValue());
        r14 = com.google.android.gms.internal.measurement.w4.f5334c;
        r14 = new byte[r13];
        r18 = r0;
        r0 = new com.google.android.gms.internal.measurement.x4(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x1035, code lost:
    
        com.google.android.gms.internal.measurement.v5.a(r0, r2, r9.getKey(), r9.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x1043, code lost:
    
        if ((r13 - r0.f5358e) != 0) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x1045, code lost:
    
        r1.d((r4 << 3) | 2, new com.google.android.gms.internal.measurement.w4(r14));
        r7.remove();
        r3 = r40;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x1064, code lost:
    
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x1065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x106b, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x1074, code lost:
    
        r0 = r0 + 1;
        r3 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1080, code lost:
    
        if (r1 == null) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x1082, code lost:
    
        ((com.google.android.gms.internal.measurement.g5) r40).zzc = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x1088, code lost:
    
        if (r11 != 0) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x108a, code lost:
    
        if (r5 != r6) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x1094, code lost:
    
        throw new com.google.android.gms.internal.measurement.p5(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x109b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1095, code lost:
    
        r10 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1097, code lost:
    
        if (r5 > r6) goto L636;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0f7c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0f4a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0f5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b3e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b51 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0f68 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i5, int i10, int i11, t4 t4Var) {
        a6 a6Var;
        Unsafe unsafe;
        String str;
        l6 l6Var;
        Object[] objArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj2;
        t4 t4Var2;
        byte[] bArr2;
        l6 l6Var2;
        Unsafe unsafe2;
        Object obj3;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr3;
        t4 t4Var3;
        int i25;
        int i26;
        Unsafe unsafe3;
        byte[] bArr4;
        t4 t4Var4;
        Object obj4;
        Unsafe unsafe4;
        byte[] bArr5;
        t4 t4Var5;
        int i27;
        Unsafe unsafe5;
        int i28;
        byte[] bArr6;
        l6 l6Var3;
        t4 t4Var6;
        int i29;
        int e0;
        int i30;
        t4 t4Var7;
        int i31;
        int m02;
        int i32;
        int i33;
        int a02;
        t4 t4Var8;
        int i34;
        int i35;
        int l02;
        int i36;
        int i37;
        m5 m5Var;
        int i38;
        int i39;
        int i40;
        byte[] bArr7;
        t4 t4Var9;
        int i41;
        int i42;
        int a03;
        int i43;
        int i44;
        int i45;
        l6 l6Var4;
        byte[] bArr8;
        t4 t4Var10;
        String str2;
        int i46;
        Object obj5;
        t4 t4Var11;
        Object obj6;
        byte[] bArr9;
        int i47;
        int i48;
        byte[] bArr10;
        t4 t4Var12;
        int i49;
        a6 a6Var2 = this;
        Object obj7 = obj;
        byte[] bArr11 = bArr;
        int i50 = i10;
        t4 t4Var13 = t4Var;
        if (!j(obj7)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        Unsafe unsafe6 = f4911k;
        int i51 = i5;
        int i52 = -1;
        int i53 = 0;
        int i54 = 1048575;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            int i57 = 1048575;
            while (true) {
                Object[] objArr2 = a6Var2.f4913b;
                e5 e5Var = a6Var2.f4920i;
                l6 l6Var5 = l6.f5126f;
                int i58 = i53;
                int[] iArr = a6Var2.f4912a;
                if (i51 < i50) {
                    int i59 = i51 + 1;
                    int i60 = bArr11[i51];
                    if (i60 < 0) {
                        i59 = d5.c0(i60, bArr11, i59, t4Var13);
                        i60 = t4Var13.f5245a;
                    }
                    int i61 = i59;
                    i56 = i60;
                    i14 = i56 >>> 3;
                    int i62 = a6Var2.f4915d;
                    int i63 = a6Var2.f4914c;
                    if (i14 > i52) {
                        i16 = (i14 < i63 || i14 > i62) ? -1 : a6Var2.r(i14, i58 / 3);
                        i15 = 0;
                    } else if (i14 < i63 || i14 > i62) {
                        i15 = 0;
                        i16 = -1;
                    } else {
                        i15 = 0;
                        i16 = a6Var2.r(i14, 0);
                    }
                    if (i16 == -1) {
                        unsafe = unsafe6;
                        i17 = i15;
                        str = "Failed to parse the message.";
                        i18 = i14;
                        objArr = objArr2;
                        i19 = i56;
                        i20 = i61;
                        obj2 = obj7;
                        t4Var2 = t4Var13;
                        i13 = i54;
                        l6Var = l6Var5;
                        bArr2 = bArr;
                    } else {
                        int i64 = i56 & 7;
                        int i65 = iArr[i16 + 1];
                        int F = F(i65);
                        objArr = objArr2;
                        long j6 = i65 & i57;
                        if (F <= 17) {
                            int i66 = iArr[i16 + 2];
                            int i67 = 1 << (i66 >>> 20);
                            int i68 = i66 & i57;
                            if (i68 != i54) {
                                int i69 = i57;
                                if (i54 != i69) {
                                    unsafe6.putInt(obj7, i54, i55);
                                    i69 = 1048575;
                                }
                                i55 = i68 == i69 ? 0 : unsafe6.getInt(obj7, i68);
                            } else {
                                i68 = i54;
                            }
                            switch (F) {
                                case 0:
                                    a6Var2 = this;
                                    unsafe3 = unsafe6;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr4 = bArr;
                                    i25 = i56;
                                    t4Var4 = t4Var;
                                    if (i64 == 1) {
                                        i55 = i23 | i67;
                                        q6.f5199c.g(obj7, j6, Double.longBitsToDouble(d5.g0(i24, bArr4)));
                                        i54 = i22;
                                        i50 = i10;
                                        i53 = i21;
                                        i51 = i24 + 8;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12 && i12 != 0) {
                                        a6Var = this;
                                        i50 = i10;
                                        i51 = i20;
                                        obj7 = obj2;
                                        i56 = i19;
                                        break;
                                    } else {
                                        g5 g5Var = (g5) obj2;
                                        l6Var2 = g5Var.zzc;
                                        if (l6Var2 == l6Var) {
                                            l6Var2 = l6.a();
                                            g5Var.zzc = l6Var2;
                                        }
                                        int i70 = i19;
                                        int o02 = d5.o0(i70, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i70;
                                        i51 = o02;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                case 1:
                                    a6Var2 = this;
                                    unsafe3 = unsafe6;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr4 = bArr;
                                    i25 = i56;
                                    t4Var4 = t4Var;
                                    if (i64 == 5) {
                                        i55 = i23 | i67;
                                        q6.f5199c.e(obj7, j6, Float.intBitsToFloat(d5.f0(i24, bArr4)));
                                        i54 = i22;
                                        i50 = i10;
                                        i53 = i21;
                                        i51 = i24 + 4;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var2 = (g5) obj2;
                                    l6Var2 = g5Var2.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i702 = i19;
                                    int o022 = d5.o0(i702, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i702;
                                    i51 = o022;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 2:
                                case 3:
                                    a6Var2 = this;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr4 = bArr;
                                    i25 = i56;
                                    t4Var4 = t4Var;
                                    if (i64 == 0) {
                                        i55 = i23 | i67;
                                        int e02 = d5.e0(bArr4, i24, t4Var4);
                                        unsafe6.putLong(obj7, j6, t4Var4.f5246b);
                                        i54 = i22;
                                        i50 = i10;
                                        i53 = i21;
                                        i51 = e02;
                                        break;
                                    }
                                    unsafe3 = unsafe6;
                                    obj4 = obj7;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var22 = (g5) obj2;
                                    l6Var2 = g5Var22.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i7022 = i19;
                                    int o0222 = d5.o0(i7022, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i7022;
                                    i51 = o0222;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 4:
                                case 11:
                                    a6Var2 = this;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr4 = bArr;
                                    i25 = i56;
                                    t4Var4 = t4Var;
                                    if (i64 == 0) {
                                        i55 = i23 | i67;
                                        i51 = d5.a0(bArr4, i24, t4Var4);
                                        unsafe6.putInt(obj7, j6, t4Var4.f5245a);
                                        i54 = i22;
                                        i50 = i10;
                                        i53 = i21;
                                        break;
                                    }
                                    unsafe3 = unsafe6;
                                    obj4 = obj7;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var222 = (g5) obj2;
                                    l6Var2 = g5Var222.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i70222 = i19;
                                    int o02222 = d5.o0(i70222, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i70222;
                                    i51 = o02222;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 5:
                                case 14:
                                    a6Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr3 = bArr;
                                    t4Var3 = t4Var;
                                    i25 = i56;
                                    if (i64 == 1) {
                                        long g02 = d5.g0(i24, bArr3);
                                        obj7 = obj3;
                                        unsafe6 = unsafe2;
                                        unsafe6.putLong(obj7, j6, g02);
                                        i54 = i22;
                                        i50 = i10;
                                        i51 = i24 + 8;
                                        i55 = i23 | i67;
                                        bArr11 = bArr3;
                                        t4Var13 = t4Var3;
                                        i52 = i14;
                                        i56 = i25;
                                        i57 = 1048575;
                                        i53 = i21;
                                    } else {
                                        bArr4 = bArr3;
                                        t4Var4 = t4Var3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var2222 = (g5) obj2;
                                        l6Var2 = g5Var2222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i702222 = i19;
                                        int o022222 = d5.o0(i702222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i702222;
                                        i51 = o022222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    a6Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr3 = bArr;
                                    t4Var3 = t4Var;
                                    i25 = i56;
                                    if (i64 == 5) {
                                        unsafe2.putInt(obj3, j6, d5.f0(i24, bArr3));
                                        i53 = i21;
                                        i51 = i24 + 4;
                                        i55 = i23 | i67;
                                        i52 = i14;
                                        i56 = i25;
                                        i57 = 1048575;
                                        bArr11 = bArr3;
                                        t4Var13 = t4Var3;
                                        unsafe6 = unsafe2;
                                        obj7 = obj3;
                                        i54 = i22;
                                        i50 = i10;
                                    } else {
                                        bArr4 = bArr3;
                                        t4Var4 = t4Var3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var22222 = (g5) obj2;
                                        l6Var2 = g5Var22222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i7022222 = i19;
                                        int o0222222 = d5.o0(i7022222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i7022222;
                                        i51 = o0222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 7:
                                    a6Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr3 = bArr;
                                    t4Var3 = t4Var;
                                    i25 = i56;
                                    if (i64 == 0) {
                                        int i71 = i23 | i67;
                                        i51 = d5.e0(bArr3, i24, t4Var3);
                                        q6.f5199c.c(obj3, j6, t4Var3.f5246b != 0);
                                        i53 = i21;
                                        t4Var13 = t4Var3;
                                        i55 = i71;
                                        obj7 = obj3;
                                        i52 = i14;
                                        i56 = i25;
                                        i57 = 1048575;
                                        i54 = i22;
                                        bArr11 = bArr3;
                                        unsafe6 = unsafe2;
                                        i50 = i10;
                                    } else {
                                        bArr4 = bArr3;
                                        t4Var4 = t4Var3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var222222 = (g5) obj2;
                                        l6Var2 = g5Var222222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i70222222 = i19;
                                        int o02222222 = d5.o0(i70222222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i70222222;
                                        i51 = o02222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 8:
                                    a6Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i21 = i16;
                                    i22 = i68;
                                    i23 = i55;
                                    i24 = i61;
                                    bArr3 = bArr;
                                    t4Var3 = t4Var;
                                    i25 = i56;
                                    if (i64 == 2) {
                                        if ((i65 & 536870912) != 0) {
                                            i51 = d5.h0(bArr3, i24, t4Var3);
                                            i26 = i23 | i67;
                                        } else {
                                            int a04 = d5.a0(bArr3, i24, t4Var3);
                                            int i72 = t4Var3.f5245a;
                                            if (i72 < 0) {
                                                throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i26 = i23 | i67;
                                            if (i72 == 0) {
                                                t4Var3.f5247c = "";
                                            } else {
                                                t4Var3.f5247c = new String(bArr3, a04, i72, n5.f5148a);
                                                a04 += i72;
                                            }
                                            i51 = a04;
                                        }
                                        unsafe2.putObject(obj3, j6, t4Var3.f5247c);
                                        i53 = i21;
                                        bArr11 = bArr3;
                                        unsafe6 = unsafe2;
                                        i55 = i26;
                                        i52 = i14;
                                        i56 = i25;
                                        i57 = 1048575;
                                        i50 = i10;
                                        t4Var13 = t4Var3;
                                        obj7 = obj3;
                                        i54 = i22;
                                    } else {
                                        bArr4 = bArr3;
                                        t4Var4 = t4Var3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var2222222 = (g5) obj2;
                                        l6Var2 = g5Var2222222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i702222222 = i19;
                                        int o022222222 = d5.o0(i702222222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i702222222;
                                        i51 = o022222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 9:
                                    Object obj8 = obj7;
                                    Unsafe unsafe7 = unsafe6;
                                    a6Var2 = this;
                                    i21 = i16;
                                    i24 = i61;
                                    if (i64 == 2) {
                                        i55 |= i67;
                                        Object A = a6Var2.A(i21, obj8);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i51 = d5.j0(A, a6Var2.y(i21), bArr, i24, i50, t4Var13);
                                        a6Var2.B(i21, obj8, A);
                                        i53 = i21;
                                        bArr11 = bArr;
                                        obj7 = obj8;
                                        unsafe6 = unsafe7;
                                        break;
                                    } else {
                                        obj3 = obj8;
                                        unsafe3 = unsafe7;
                                        i22 = i68;
                                        i23 = i55;
                                        i25 = i56;
                                        bArr4 = bArr;
                                        t4Var4 = t4Var;
                                        obj4 = obj3;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var22222222 = (g5) obj2;
                                        l6Var2 = g5Var22222222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i7022222222 = i19;
                                        int o0222222222 = d5.o0(i7022222222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i7022222222;
                                        i51 = o0222222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 10:
                                    Object obj9 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj9;
                                    a6Var2 = this;
                                    bArr5 = bArr;
                                    t4Var5 = t4Var;
                                    i21 = i16;
                                    i24 = i61;
                                    if (i64 == 2) {
                                        i55 |= i67;
                                        i51 = d5.i0(bArr5, i24, t4Var5);
                                        unsafe4.putObject(obj4, j6, t4Var5.f5247c);
                                        break;
                                    }
                                    i22 = i68;
                                    i23 = i55;
                                    i25 = i56;
                                    bArr4 = bArr5;
                                    t4Var4 = t4Var5;
                                    unsafe3 = unsafe4;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var222222222 = (g5) obj2;
                                    l6Var2 = g5Var222222222.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i70222222222 = i19;
                                    int o02222222222 = d5.o0(i70222222222, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i70222222222;
                                    i51 = o02222222222;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 12:
                                    Object obj10 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj10;
                                    a6Var2 = this;
                                    bArr5 = bArr;
                                    t4Var5 = t4Var;
                                    i21 = i16;
                                    i24 = i61;
                                    if (i64 == 0) {
                                        i51 = d5.a0(bArr5, i24, t4Var5);
                                        int i73 = t4Var5.f5245a;
                                        j5 z5 = a6Var2.z(i21);
                                        if ((i65 & Integer.MIN_VALUE) != 0 && z5 != null && !z5.a(i73)) {
                                            g5 g5Var3 = (g5) obj4;
                                            l6 l6Var6 = g5Var3.zzc;
                                            if (l6Var6 == l6Var5) {
                                                l6Var6 = l6.a();
                                                g5Var3.zzc = l6Var6;
                                            }
                                            l6Var6.d(i56, Long.valueOf(i73));
                                            break;
                                        } else {
                                            i55 |= i67;
                                            unsafe4.putInt(obj4, j6, i73);
                                            break;
                                        }
                                    }
                                    i22 = i68;
                                    i23 = i55;
                                    i25 = i56;
                                    bArr4 = bArr5;
                                    t4Var4 = t4Var5;
                                    unsafe3 = unsafe4;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var2222222222 = (g5) obj2;
                                    l6Var2 = g5Var2222222222.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i702222222222 = i19;
                                    int o022222222222 = d5.o0(i702222222222, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i702222222222;
                                    i51 = o022222222222;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 15:
                                    Object obj11 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj11;
                                    a6Var2 = this;
                                    bArr5 = bArr;
                                    t4Var5 = t4Var;
                                    i21 = i16;
                                    i24 = i61;
                                    if (i64 == 0) {
                                        i55 |= i67;
                                        i51 = d5.a0(bArr5, i24, t4Var5);
                                        unsafe4.putInt(obj4, j6, f3.x.H0(t4Var5.f5245a));
                                        break;
                                    }
                                    i22 = i68;
                                    i23 = i55;
                                    i25 = i56;
                                    bArr4 = bArr5;
                                    t4Var4 = t4Var5;
                                    unsafe3 = unsafe4;
                                    i13 = i22;
                                    i17 = i21;
                                    i20 = i24;
                                    str = "Failed to parse the message.";
                                    l6Var = l6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    t4Var2 = t4Var4;
                                    i18 = i14;
                                    i55 = i23;
                                    i19 = i25;
                                    i12 = i11;
                                    obj2 = obj4;
                                    if (i19 != i12) {
                                    }
                                    g5 g5Var22222222222 = (g5) obj2;
                                    l6Var2 = g5Var22222222222.zzc;
                                    if (l6Var2 == l6Var) {
                                    }
                                    int i7022222222222 = i19;
                                    int o0222222222222 = d5.o0(i7022222222222, bArr2, i20, i10, l6Var2, t4Var2);
                                    t4Var13 = t4Var;
                                    i50 = i10;
                                    i54 = i13;
                                    obj7 = obj2;
                                    i53 = i17;
                                    i57 = 1048575;
                                    i52 = i18;
                                    i56 = i7022222222222;
                                    i51 = o0222222222222;
                                    a6Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 16:
                                    a6Var2 = this;
                                    bArr5 = bArr;
                                    t4Var5 = t4Var;
                                    i21 = i16;
                                    i24 = i61;
                                    if (i64 == 0) {
                                        i55 |= i67;
                                        int e03 = d5.e0(bArr5, i24, t4Var5);
                                        unsafe6.putLong(obj7, j6, f3.x.J0(t4Var5.f5246b));
                                        obj7 = obj7;
                                        unsafe6 = unsafe6;
                                        i50 = i10;
                                        i53 = i21;
                                        i51 = e03;
                                        break;
                                    } else {
                                        Object obj12 = obj7;
                                        unsafe4 = unsafe6;
                                        obj4 = obj12;
                                        i22 = i68;
                                        i23 = i55;
                                        i25 = i56;
                                        bArr4 = bArr5;
                                        t4Var4 = t4Var5;
                                        unsafe3 = unsafe4;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var222222222222 = (g5) obj2;
                                        l6Var2 = g5Var222222222222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i70222222222222 = i19;
                                        int o02222222222222 = d5.o0(i70222222222222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i70222222222222;
                                        i51 = o02222222222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                default:
                                    if (i64 == 3) {
                                        i55 |= i67;
                                        a6Var2 = this;
                                        Object A2 = a6Var2.A(i16, obj7);
                                        i21 = i16;
                                        i51 = d5.k0(A2, a6Var2.y(i21), bArr, i61, i10, (i14 << 3) | 4, t4Var);
                                        t4Var5 = t4Var;
                                        bArr5 = bArr;
                                        a6Var2.B(i21, obj7, A2);
                                        break;
                                    } else {
                                        i21 = i16;
                                        i24 = i61;
                                        unsafe3 = unsafe6;
                                        obj4 = obj7;
                                        i22 = i68;
                                        i23 = i55;
                                        i25 = i56;
                                        bArr4 = bArr;
                                        t4Var4 = t4Var;
                                        i13 = i22;
                                        i17 = i21;
                                        i20 = i24;
                                        str = "Failed to parse the message.";
                                        l6Var = l6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        t4Var2 = t4Var4;
                                        i18 = i14;
                                        i55 = i23;
                                        i19 = i25;
                                        i12 = i11;
                                        obj2 = obj4;
                                        if (i19 != i12) {
                                        }
                                        g5 g5Var2222222222222 = (g5) obj2;
                                        l6Var2 = g5Var2222222222222.zzc;
                                        if (l6Var2 == l6Var) {
                                        }
                                        int i702222222222222 = i19;
                                        int o022222222222222 = d5.o0(i702222222222222, bArr2, i20, i10, l6Var2, t4Var2);
                                        t4Var13 = t4Var;
                                        i50 = i10;
                                        i54 = i13;
                                        obj7 = obj2;
                                        i53 = i17;
                                        i57 = 1048575;
                                        i52 = i18;
                                        i56 = i702222222222222;
                                        i51 = o022222222222222;
                                        a6Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                            }
                        } else {
                            Object obj13 = obj7;
                            Unsafe unsafe8 = unsafe6;
                            int i74 = i16;
                            int i75 = i55;
                            i22 = i54;
                            if (F != 27) {
                                obj2 = obj13;
                                if (F <= 49) {
                                    String str3 = "Failed to parse the message.";
                                    long j10 = i65;
                                    m5 m5Var2 = (m5) unsafe8.getObject(obj2, j6);
                                    if (!((r4) m5Var2).f5228a) {
                                        int size = m5Var2.size();
                                        m5Var2 = m5Var2.i0(size + size);
                                        unsafe8.putObject(obj2, j6, m5Var2);
                                    }
                                    m5 m5Var3 = m5Var2;
                                    switch (F) {
                                        case 18:
                                        case C0122e9.J /* 35 */:
                                            i27 = i10;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i28 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            t4Var6 = t4Var;
                                            i29 = i74;
                                            if (i64 != 2) {
                                                if (i64 == 1) {
                                                    if (m5Var3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Double.longBitsToDouble(d5.g0(i28, bArr6));
                                                    throw null;
                                                }
                                                i51 = i28;
                                                if (i51 == i28) {
                                                    l6 l6Var7 = l6Var3;
                                                    i17 = i29;
                                                    l6Var = l6Var7;
                                                    i13 = i22;
                                                    bArr2 = bArr6;
                                                    i20 = i51;
                                                    t4Var2 = t4Var6;
                                                    i18 = i14;
                                                    unsafe = unsafe5;
                                                    i55 = i75;
                                                    break;
                                                } else {
                                                    a6Var2 = this;
                                                    bArr11 = bArr6;
                                                    i50 = i27;
                                                    t4Var13 = t4Var6;
                                                    obj7 = obj2;
                                                    i52 = i14;
                                                    unsafe6 = unsafe5;
                                                    i55 = i75;
                                                    i57 = 1048575;
                                                    i56 = i19;
                                                    i53 = i29;
                                                    break;
                                                }
                                            } else {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (d5.a0(bArr6, i28, t4Var6) + t4Var6.f5245a > bArr6.length) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                        case 19:
                                        case 36:
                                            i27 = i10;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i28 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            t4Var6 = t4Var;
                                            i29 = i74;
                                            if (i64 == 2) {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (d5.a0(bArr6, i28, t4Var6) + t4Var6.f5245a > bArr6.length) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i64 == 5) {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                Float.intBitsToFloat(d5.f0(i28, bArr6));
                                                throw null;
                                            }
                                            i51 = i28;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case C0122e9.K /* 38 */:
                                            i27 = i10;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i28 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            t4Var6 = t4Var;
                                            i29 = i74;
                                            if (i64 == 2) {
                                                t5 t5Var = (t5) m5Var3;
                                                e0 = d5.a0(bArr6, i28, t4Var6);
                                                int i76 = t4Var6.f5245a + e0;
                                                while (e0 < i76) {
                                                    e0 = d5.e0(bArr6, e0, t4Var6);
                                                    t5Var.d(t4Var6.f5246b);
                                                }
                                                if (e0 != i76) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    t5 t5Var2 = (t5) m5Var3;
                                                    e0 = d5.e0(bArr6, i28, t4Var6);
                                                    t5Var2.d(t4Var6.f5246b);
                                                    while (e0 < i27) {
                                                        int a05 = d5.a0(bArr6, e0, t4Var6);
                                                        if (i19 == t4Var6.f5245a) {
                                                            e0 = d5.e0(bArr6, a05, t4Var6);
                                                            t5Var2.d(t4Var6.f5246b);
                                                        }
                                                    }
                                                }
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            i51 = e0;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                                        case C0122e9.I /* 29 */:
                                        case 39:
                                        case 43:
                                            i30 = i10;
                                            t4Var7 = t4Var;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i31 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i29 = i74;
                                            if (i64 == 2) {
                                                m02 = d5.m0(bArr6, i31, m5Var3, t4Var7);
                                                i51 = m02;
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    e0 = d5.l0(i19, bArr6, i31, i30, m5Var3, t4Var7);
                                                    i28 = i31;
                                                    t4Var6 = t4Var7;
                                                    i27 = i30;
                                                    i51 = e0;
                                                    if (i51 == i28) {
                                                    }
                                                }
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i30 = i10;
                                            t4Var7 = t4Var;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i31 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i29 = i74;
                                            if (i64 == 2) {
                                                t5 t5Var3 = (t5) m5Var3;
                                                int a06 = d5.a0(bArr6, i31, t4Var7);
                                                int i77 = t4Var7.f5245a;
                                                int i78 = a06 + i77;
                                                if (i78 > bArr6.length) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i79 = (i77 / 8) + t5Var3.f5252c;
                                                int length = t5Var3.f5251b.length;
                                                if (i79 <= length) {
                                                    i32 = a06;
                                                } else if (length != 0) {
                                                    while (length < i79) {
                                                        length = androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10);
                                                        a06 = a06;
                                                    }
                                                    i32 = a06;
                                                    t5Var3.f5251b = Arrays.copyOf(t5Var3.f5251b, length);
                                                } else {
                                                    i32 = a06;
                                                    t5Var3.f5251b = new long[Math.max(i79, 10)];
                                                }
                                                m02 = i32;
                                                while (m02 < i78) {
                                                    t5Var3.d(d5.g0(m02, bArr6));
                                                    m02 += 8;
                                                }
                                                if (m02 != i78) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = m02;
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                if (i64 == 1) {
                                                    i51 = i31 + 8;
                                                    t5 t5Var4 = (t5) m5Var3;
                                                    t5Var4.d(d5.g0(i31, bArr6));
                                                    while (i51 < i30) {
                                                        int a07 = d5.a0(bArr6, i51, t4Var7);
                                                        if (i19 == t4Var7.f5245a) {
                                                            t5Var4.d(d5.g0(a07, bArr6));
                                                            i51 = a07 + 8;
                                                        } else {
                                                            i27 = i30;
                                                            t4Var6 = t4Var7;
                                                            i28 = i31;
                                                            if (i51 == i28) {
                                                            }
                                                        }
                                                    }
                                                    i27 = i30;
                                                    t4Var6 = t4Var7;
                                                    i28 = i31;
                                                    if (i51 == i28) {
                                                    }
                                                }
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                                        case 31:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 45:
                                            i30 = i10;
                                            t4Var7 = t4Var;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i31 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i29 = i74;
                                            if (i64 == 2) {
                                                h5 h5Var = (h5) m5Var3;
                                                int a08 = d5.a0(bArr6, i31, t4Var7);
                                                int i80 = t4Var7.f5245a;
                                                int i81 = a08 + i80;
                                                if (i81 > bArr6.length) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i82 = (i80 / 4) + h5Var.f5076c;
                                                int length2 = h5Var.f5075b.length;
                                                if (i82 <= length2) {
                                                    i33 = a08;
                                                } else if (length2 != 0) {
                                                    while (length2 < i82) {
                                                        length2 = androidx.appcompat.widget.c1.h(length2, 3, 2, 1, 10);
                                                        a08 = a08;
                                                    }
                                                    i33 = a08;
                                                    h5Var.f5075b = Arrays.copyOf(h5Var.f5075b, length2);
                                                } else {
                                                    i33 = a08;
                                                    h5Var.f5075b = new int[Math.max(i82, 10)];
                                                }
                                                int i83 = i33;
                                                while (i83 < i81) {
                                                    h5Var.d(d5.f0(i83, bArr6));
                                                    i83 += 4;
                                                }
                                                if (i83 != i81) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = i83;
                                            } else {
                                                if (i64 == 5) {
                                                    i51 = i31 + 4;
                                                    h5 h5Var2 = (h5) m5Var3;
                                                    h5Var2.d(d5.f0(i31, bArr6));
                                                    while (i51 < i30) {
                                                        int a09 = d5.a0(bArr6, i51, t4Var7);
                                                        if (i19 == t4Var7.f5245a) {
                                                            h5Var2.d(d5.f0(a09, bArr6));
                                                            i51 = a09 + 4;
                                                        }
                                                    }
                                                }
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            i27 = i30;
                                            t4Var6 = t4Var7;
                                            i28 = i31;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        case C0122e9.F /* 25 */:
                                        case C0122e9.M /* 42 */:
                                            i30 = i10;
                                            t4Var7 = t4Var;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i31 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i29 = i74;
                                            if (i64 != 2) {
                                                if (i64 == 0) {
                                                    if (m5Var3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    d5.e0(bArr6, i31, t4Var7);
                                                    throw null;
                                                }
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                a02 = d5.a0(bArr6, i31, t4Var7);
                                                int i84 = t4Var7.f5245a + a02;
                                                if (a02 < i84) {
                                                    d5.e0(bArr6, a02, t4Var7);
                                                    throw null;
                                                }
                                                if (a02 != i84) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = a02;
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case C0122e9.G /* 26 */:
                                            i30 = i10;
                                            t4Var7 = t4Var;
                                            unsafe5 = unsafe8;
                                            i19 = i56;
                                            i31 = i61;
                                            bArr6 = bArr;
                                            str = str3;
                                            i29 = i74;
                                            if (i64 != 2) {
                                                l6Var3 = l6Var5;
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            } else if ((j10 & 536870912) == 0) {
                                                int a010 = d5.a0(bArr6, i31, t4Var7);
                                                int i85 = t4Var7.f5245a;
                                                if (i85 < 0) {
                                                    throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i85 == 0) {
                                                    m5Var3.add("");
                                                } else {
                                                    m5Var3.add(new String(bArr6, a010, i85, n5.f5148a));
                                                    a010 += i85;
                                                }
                                                while (a010 < i30) {
                                                    int a011 = d5.a0(bArr6, a010, t4Var7);
                                                    if (i19 == t4Var7.f5245a) {
                                                        a010 = d5.a0(bArr6, a011, t4Var7);
                                                        int i86 = t4Var7.f5245a;
                                                        if (i86 < 0) {
                                                            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i86 == 0) {
                                                            m5Var3.add("");
                                                        } else {
                                                            m5Var3.add(new String(bArr6, a010, i86, n5.f5148a));
                                                            a010 += i86;
                                                        }
                                                    } else {
                                                        i51 = a010;
                                                        i27 = i30;
                                                        l6Var3 = l6Var5;
                                                        i28 = i31;
                                                        t4Var6 = t4Var7;
                                                        if (i51 == i28) {
                                                        }
                                                    }
                                                }
                                                i51 = a010;
                                                i27 = i30;
                                                l6Var3 = l6Var5;
                                                i28 = i31;
                                                t4Var6 = t4Var7;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                a02 = d5.a0(bArr6, i31, t4Var7);
                                                int i87 = t4Var7.f5245a;
                                                if (i87 < 0) {
                                                    throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i87 == 0) {
                                                    m5Var3.add("");
                                                    l6Var3 = l6Var5;
                                                } else {
                                                    int i88 = a02 + i87;
                                                    if (!s6.a(bArr6, a02, i88)) {
                                                        throw new p5("Protocol message had invalid UTF-8.");
                                                    }
                                                    l6Var3 = l6Var5;
                                                    m5Var3.add(new String(bArr6, a02, i87, n5.f5148a));
                                                    a02 = i88;
                                                }
                                                while (a02 < i30) {
                                                    int a012 = d5.a0(bArr6, a02, t4Var7);
                                                    if (i19 == t4Var7.f5245a) {
                                                        a02 = d5.a0(bArr6, a012, t4Var7);
                                                        int i89 = t4Var7.f5245a;
                                                        if (i89 < 0) {
                                                            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i89 == 0) {
                                                            m5Var3.add("");
                                                        } else {
                                                            int i90 = a02 + i89;
                                                            if (!s6.a(bArr6, a02, i90)) {
                                                                throw new p5("Protocol message had invalid UTF-8.");
                                                            }
                                                            m5Var3.add(new String(bArr6, a02, i89, n5.f5148a));
                                                            a02 = i90;
                                                        }
                                                    } else {
                                                        i51 = a02;
                                                        i27 = i30;
                                                        t4Var6 = t4Var7;
                                                        i28 = i31;
                                                        if (i51 == i28) {
                                                        }
                                                    }
                                                }
                                                i51 = a02;
                                                i27 = i30;
                                                t4Var6 = t4Var7;
                                                i28 = i31;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case C0122e9.H /* 27 */:
                                            unsafe5 = unsafe8;
                                            str = str3;
                                            if (i64 == 2) {
                                                i29 = i74;
                                                t4Var7 = t4Var;
                                                i51 = d5.n0(y(i29), i56, bArr, i61, i10, m5Var3, t4Var7);
                                                i28 = i61;
                                                i19 = i56;
                                                bArr6 = bArr;
                                                i27 = i10;
                                                l6Var3 = l6Var5;
                                                t4Var6 = t4Var7;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                i31 = i61;
                                                i29 = i74;
                                                i19 = i56;
                                                bArr6 = bArr;
                                                i27 = i10;
                                                l6Var3 = l6Var5;
                                                t4Var6 = t4Var;
                                                i28 = i31;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            t4Var8 = t4Var;
                                            unsafe5 = unsafe8;
                                            i34 = i74;
                                            str = str3;
                                            if (i64 == 2) {
                                                int a013 = d5.a0(bArr, i61, t4Var8);
                                                int i91 = t4Var8.f5245a;
                                                if (i91 < 0) {
                                                    throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i91 > bArr.length - a013) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i91 == 0) {
                                                    m5Var3.add(w4.f5334c);
                                                } else {
                                                    m5Var3.add(w4.d(bArr, a013, i91));
                                                    a013 += i91;
                                                }
                                                while (a013 < i10) {
                                                    int a014 = d5.a0(bArr, a013, t4Var8);
                                                    if (i56 == t4Var8.f5245a) {
                                                        a013 = d5.a0(bArr, a014, t4Var8);
                                                        int i92 = t4Var8.f5245a;
                                                        if (i92 < 0) {
                                                            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i92 > bArr.length - a013) {
                                                            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i92 == 0) {
                                                            m5Var3.add(w4.f5334c);
                                                        } else {
                                                            m5Var3.add(w4.d(bArr, a013, i92));
                                                            a013 += i92;
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                        i28 = i61;
                                                        i19 = i56;
                                                        i51 = a013;
                                                        i27 = i10;
                                                        i29 = i34;
                                                        l6Var3 = l6Var5;
                                                        t4Var6 = t4Var8;
                                                        if (i51 == i28) {
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr;
                                                i28 = i61;
                                                i19 = i56;
                                                i51 = a013;
                                                i27 = i10;
                                                i29 = i34;
                                                l6Var3 = l6Var5;
                                                t4Var6 = t4Var8;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                bArr6 = bArr;
                                                i28 = i61;
                                                i19 = i56;
                                                i27 = i10;
                                                i29 = i34;
                                                l6Var3 = l6Var5;
                                                t4Var6 = t4Var8;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            byte[] bArr12 = bArr;
                                            i35 = i10;
                                            unsafe5 = unsafe8;
                                            if (i64 == 2) {
                                                int m03 = d5.m0(bArr12, i61, m5Var3, t4Var);
                                                m5Var = m5Var3;
                                                i37 = i61;
                                                l02 = m03;
                                                i36 = i56;
                                            } else if (i64 == 0) {
                                                l02 = d5.l0(i56, bArr12, i61, i35, m5Var3, t4Var);
                                                i36 = i56;
                                                bArr12 = bArr12;
                                                i37 = i61;
                                                m5Var = m5Var3;
                                                i35 = i35;
                                            } else {
                                                str = str3;
                                                i29 = i74;
                                                i19 = i56;
                                                l6Var3 = l6Var5;
                                                bArr6 = bArr12;
                                                t4Var6 = t4Var;
                                                i28 = i61;
                                                i27 = i35;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            t4Var8 = t4Var;
                                            j5 z7 = a6Var2.z(i74);
                                            e5 e5Var2 = i6.f5086a;
                                            if (z7 == null) {
                                                i34 = i74;
                                                i38 = l02;
                                                str = str3;
                                            } else if (m5Var != null) {
                                                int size2 = m5Var.size();
                                                int i93 = 0;
                                                int i94 = 0;
                                                l6 l6Var8 = null;
                                                while (i93 < size2) {
                                                    int i95 = l02;
                                                    Integer num = (Integer) m5Var.get(i93);
                                                    String str4 = str3;
                                                    int intValue = num.intValue();
                                                    if (z7.a(intValue)) {
                                                        if (i93 != i94) {
                                                            m5Var.set(i94, num);
                                                        }
                                                        i94++;
                                                        i40 = i74;
                                                        i39 = i93;
                                                    } else {
                                                        if (l6Var8 == null) {
                                                            e5Var.getClass();
                                                            g5 g5Var4 = (g5) obj2;
                                                            i39 = i93;
                                                            l6 l6Var9 = g5Var4.zzc;
                                                            if (l6Var9 == l6Var5) {
                                                                l6Var9 = l6.a();
                                                                g5Var4.zzc = l6Var9;
                                                            }
                                                            l6Var8 = l6Var9;
                                                        } else {
                                                            i39 = i93;
                                                        }
                                                        i40 = i74;
                                                        l6 l6Var10 = l6Var8;
                                                        l6Var10.d(i14 << 3, Long.valueOf(intValue));
                                                        l6Var8 = l6Var10;
                                                    }
                                                    i93 = i39 + 1;
                                                    l02 = i95;
                                                    str3 = str4;
                                                    i74 = i40;
                                                }
                                                i34 = i74;
                                                i38 = l02;
                                                str = str3;
                                                if (i94 != size2) {
                                                    m5Var.subList(i94, size2).clear();
                                                }
                                            } else {
                                                i34 = i74;
                                                i38 = l02;
                                                str = str3;
                                                Iterator it = m5Var.iterator();
                                                l6 l6Var11 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!z7.a(intValue2)) {
                                                        if (l6Var11 == null) {
                                                            e5Var.getClass();
                                                            g5 g5Var5 = (g5) obj2;
                                                            l6 l6Var12 = g5Var5.zzc;
                                                            if (l6Var12 == l6Var5) {
                                                                l6Var12 = l6.a();
                                                                g5Var5.zzc = l6Var12;
                                                            }
                                                            l6Var11 = l6Var12;
                                                        }
                                                        l6Var11.d(i14 << 3, Long.valueOf(intValue2));
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            int i96 = i36;
                                            bArr6 = bArr12;
                                            i28 = i37;
                                            i19 = i96;
                                            i27 = i35;
                                            i51 = i38;
                                            i29 = i34;
                                            l6Var3 = l6Var5;
                                            t4Var6 = t4Var8;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr7 = bArr;
                                            i35 = i10;
                                            t4Var9 = t4Var;
                                            unsafe5 = unsafe8;
                                            i41 = i56;
                                            i42 = i61;
                                            if (i64 == 2) {
                                                h5 h5Var3 = (h5) m5Var3;
                                                a03 = d5.a0(bArr7, i42, t4Var9);
                                                int i97 = t4Var9.f5245a + a03;
                                                while (a03 < i97) {
                                                    a03 = d5.a0(bArr7, a03, t4Var9);
                                                    h5Var3.d(f3.x.H0(t4Var9.f5245a));
                                                }
                                                if (a03 != i97) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    h5 h5Var4 = (h5) m5Var3;
                                                    a03 = d5.a0(bArr7, i42, t4Var9);
                                                    h5Var4.d(f3.x.H0(t4Var9.f5245a));
                                                    while (a03 < i35) {
                                                        int a015 = d5.a0(bArr7, a03, t4Var9);
                                                        if (i41 == t4Var9.f5245a) {
                                                            a03 = d5.a0(bArr7, a015, t4Var9);
                                                            h5Var4.d(f3.x.H0(t4Var9.f5245a));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i28 = i42;
                                                str = str3;
                                                l6Var3 = l6Var5;
                                                i19 = i41;
                                                i29 = i74;
                                                t4Var6 = t4Var9;
                                                i27 = i35;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            i51 = a03;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i19 = i41;
                                            i29 = i74;
                                            bArr6 = bArr7;
                                            t4Var6 = t4Var9;
                                            i28 = i42;
                                            i27 = i35;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr7 = bArr;
                                            i35 = i10;
                                            t4Var9 = t4Var;
                                            Unsafe unsafe9 = unsafe8;
                                            i41 = i56;
                                            i42 = i61;
                                            if (i64 == 2) {
                                                t5 t5Var5 = (t5) m5Var3;
                                                a03 = d5.a0(bArr7, i42, t4Var9);
                                                int i98 = t4Var9.f5245a + a03;
                                                while (a03 < i98) {
                                                    a03 = d5.e0(bArr7, a03, t4Var9);
                                                    t5Var5.d(f3.x.J0(t4Var9.f5246b));
                                                    unsafe9 = unsafe9;
                                                }
                                                unsafe5 = unsafe9;
                                                if (a03 != i98) {
                                                    throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                unsafe5 = unsafe9;
                                                if (i64 == 0) {
                                                    t5 t5Var6 = (t5) m5Var3;
                                                    a03 = d5.e0(bArr7, i42, t4Var9);
                                                    t5Var6.d(f3.x.J0(t4Var9.f5246b));
                                                    while (a03 < i35) {
                                                        int a016 = d5.a0(bArr7, a03, t4Var9);
                                                        if (i41 == t4Var9.f5245a) {
                                                            a03 = d5.e0(bArr7, a016, t4Var9);
                                                            t5Var6.d(f3.x.J0(t4Var9.f5246b));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i28 = i42;
                                                str = str3;
                                                l6Var3 = l6Var5;
                                                i19 = i41;
                                                i29 = i74;
                                                t4Var6 = t4Var9;
                                                i27 = i35;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            i51 = a03;
                                            str = str3;
                                            l6Var3 = l6Var5;
                                            i19 = i41;
                                            i29 = i74;
                                            bArr6 = bArr7;
                                            t4Var6 = t4Var9;
                                            i28 = i42;
                                            i27 = i35;
                                            if (i51 == i28) {
                                            }
                                            break;
                                        default:
                                            if (i64 == 3) {
                                                int i99 = (i56 & (-8)) | 4;
                                                h6 y5 = a6Var2.y(i74);
                                                g5 a7 = y5.a();
                                                byte[] bArr13 = bArr;
                                                i35 = i10;
                                                int i100 = i61;
                                                int k0 = d5.k0(a7, y5, bArr13, i100, i35, i99, t4Var);
                                                int i101 = i99;
                                                t4 t4Var14 = t4Var;
                                                y5.g(a7);
                                                t4Var14.f5247c = a7;
                                                m5Var3.add(a7);
                                                while (true) {
                                                    if (k0 < i35) {
                                                        int i102 = i100;
                                                        int a017 = d5.a0(bArr13, k0, t4Var14);
                                                        if (i56 == t4Var14.f5245a) {
                                                            int i103 = i101;
                                                            g5 a10 = y5.a();
                                                            k0 = d5.k0(a10, y5, bArr13, a017, i35, i103, t4Var);
                                                            byte[] bArr14 = bArr13;
                                                            h6 h6Var = y5;
                                                            t4Var14 = t4Var;
                                                            h6Var.g(a10);
                                                            t4Var14.f5247c = a10;
                                                            m5Var3.add(a10);
                                                            bArr13 = bArr14;
                                                            i101 = i103;
                                                            y5 = h6Var;
                                                            i100 = i102;
                                                        } else {
                                                            i43 = i102;
                                                        }
                                                    } else {
                                                        i43 = i100;
                                                    }
                                                }
                                                bArr6 = bArr13;
                                                i28 = i43;
                                                str = str3;
                                                l6Var3 = l6Var5;
                                                i19 = i56;
                                                unsafe5 = unsafe8;
                                                i51 = k0;
                                                i29 = i74;
                                                t4Var6 = t4Var14;
                                                i27 = i35;
                                                if (i51 == i28) {
                                                }
                                            } else {
                                                i27 = i10;
                                                unsafe5 = unsafe8;
                                                i19 = i56;
                                                i28 = i61;
                                                bArr6 = bArr;
                                                str = str3;
                                                l6Var3 = l6Var5;
                                                t4Var6 = t4Var;
                                                i29 = i74;
                                                i51 = i28;
                                                if (i51 == i28) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    str = "Failed to parse the message.";
                                    i19 = i56;
                                    i44 = i74;
                                    unsafe = unsafe8;
                                    i45 = i61;
                                    byte[] bArr15 = bArr;
                                    l6Var4 = l6Var5;
                                    t4 t4Var15 = t4Var;
                                    if (F != 50) {
                                        long j11 = iArr[i44 + 2] & 1048575;
                                        switch (F) {
                                            case 51:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 1) {
                                                    i48 = i47 + 8;
                                                    unsafe.putObject(obj2, j6, Double.valueOf(Double.longBitsToDouble(d5.g0(i47, bArr2))));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                        i13 = i22;
                                                        i12 = i11;
                                                        i20 = i51;
                                                        break;
                                                    } else {
                                                        i54 = i22;
                                                        i50 = i10;
                                                        unsafe6 = unsafe;
                                                        i52 = i18;
                                                        bArr11 = bArr2;
                                                        i55 = i75;
                                                        i57 = 1048575;
                                                        a6Var2 = this;
                                                        t4Var13 = t4Var2;
                                                        obj7 = obj2;
                                                        i56 = i19;
                                                        i53 = i17;
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                            case 52:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 5) {
                                                    i48 = i47 + 4;
                                                    unsafe.putObject(obj2, j6, Float.valueOf(Float.intBitsToFloat(d5.f0(i47, bArr2))));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    i48 = d5.e0(bArr2, i47, t4Var2);
                                                    unsafe.putObject(obj2, j6, Long.valueOf(t4Var2.f5246b));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    i48 = d5.a0(bArr2, i47, t4Var2);
                                                    unsafe.putObject(obj2, j6, Integer.valueOf(t4Var2.f5245a));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 1) {
                                                    i48 = i47 + 8;
                                                    unsafe.putObject(obj2, j6, Long.valueOf(d5.g0(i47, bArr2)));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 5) {
                                                    i48 = i47 + 4;
                                                    unsafe.putObject(obj2, j6, Integer.valueOf(d5.f0(i47, bArr2)));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 58:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    i48 = d5.e0(bArr2, i47, t4Var2);
                                                    unsafe.putObject(obj2, j6, Boolean.valueOf(t4Var2.f5246b != 0));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = i48;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 59:
                                                i47 = i45;
                                                i18 = i14;
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                str = str;
                                                if (i64 == 2) {
                                                    int a018 = d5.a0(bArr2, i47, t4Var2);
                                                    int i104 = t4Var2.f5245a;
                                                    if (i104 == 0) {
                                                        unsafe.putObject(obj2, j6, "");
                                                    } else {
                                                        int i105 = a018 + i104;
                                                        if ((i65 & 536870912) != 0 && !s6.a(bArr2, a018, i105)) {
                                                            throw new p5("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j6, new String(bArr2, a018, i104, n5.f5148a));
                                                        a018 = i105;
                                                    }
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i51 = a018;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 60:
                                                i47 = i45;
                                                i18 = i14;
                                                if (i64 == 2) {
                                                    Object C = C(i18, i44, obj2);
                                                    int j0 = d5.j0(C, y(i44), bArr, i47, i10, t4Var);
                                                    bArr2 = bArr;
                                                    D(i18, i44, obj2, C);
                                                    i17 = i44;
                                                    l6Var = l6Var4;
                                                    i47 = i47;
                                                    str = str;
                                                    i51 = j0;
                                                    t4Var2 = t4Var;
                                                    if (i51 != i47) {
                                                    }
                                                } else {
                                                    bArr2 = bArr;
                                                    i17 = i44;
                                                    l6Var = l6Var4;
                                                    t4Var2 = t4Var;
                                                    str = str;
                                                    i51 = i47;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                bArr10 = bArr;
                                                t4Var12 = t4Var;
                                                i47 = i45;
                                                i18 = i14;
                                                if (i64 == 2) {
                                                    int i02 = d5.i0(bArr10, i47, t4Var12);
                                                    unsafe.putObject(obj2, j6, t4Var12.f5247c);
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i17 = i44;
                                                    l6Var = l6Var4;
                                                    i51 = i02;
                                                    t4Var2 = t4Var12;
                                                    str = str;
                                                    bArr2 = bArr10;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                t4Var2 = t4Var12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 63:
                                                bArr10 = bArr;
                                                t4Var12 = t4Var;
                                                i47 = i45;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    int a019 = d5.a0(bArr10, i47, t4Var12);
                                                    int i106 = t4Var12.f5245a;
                                                    i49 = a019;
                                                    j5 z10 = z(i44);
                                                    if (z10 == null || z10.a(i106)) {
                                                        unsafe.putObject(obj2, j6, Integer.valueOf(i106));
                                                        unsafe.putInt(obj2, j11, i18);
                                                    } else {
                                                        g5 g5Var6 = (g5) obj2;
                                                        l6 l6Var13 = g5Var6.zzc;
                                                        if (l6Var13 == l6Var4) {
                                                            l6Var13 = l6.a();
                                                            g5Var6.zzc = l6Var13;
                                                        }
                                                        l6Var13.d(i19, Long.valueOf(i106));
                                                        l6Var4 = l6Var4;
                                                    }
                                                    l6 l6Var14 = l6Var4;
                                                    i17 = i44;
                                                    l6Var = l6Var14;
                                                    t4Var2 = t4Var12;
                                                    str = str;
                                                    i51 = i49;
                                                    bArr2 = bArr10;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                t4Var2 = t4Var12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 66:
                                                bArr10 = bArr;
                                                t4Var12 = t4Var;
                                                i47 = i45;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    int a020 = d5.a0(bArr10, i47, t4Var12);
                                                    unsafe.putObject(obj2, j6, Integer.valueOf(f3.x.H0(t4Var12.f5245a)));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    i17 = i44;
                                                    l6Var = l6Var4;
                                                    i51 = a020;
                                                    t4Var2 = t4Var12;
                                                    str = str;
                                                    bArr2 = bArr10;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                t4Var2 = t4Var12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 67:
                                                bArr10 = bArr;
                                                t4Var12 = t4Var;
                                                i47 = i45;
                                                i18 = i14;
                                                if (i64 == 0) {
                                                    i49 = d5.e0(bArr10, i47, t4Var12);
                                                    unsafe.putObject(obj2, j6, Long.valueOf(f3.x.J0(t4Var12.f5246b)));
                                                    unsafe.putInt(obj2, j11, i18);
                                                    l6 l6Var142 = l6Var4;
                                                    i17 = i44;
                                                    l6Var = l6Var142;
                                                    t4Var2 = t4Var12;
                                                    str = str;
                                                    i51 = i49;
                                                    bArr2 = bArr10;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                t4Var2 = t4Var12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                            case 68:
                                                if (i64 == 3) {
                                                    Object C2 = C(i14, i44, obj2);
                                                    int k02 = d5.k0(C2, y(i44), bArr, i45, i10, (i19 & (-8)) | 4, t4Var);
                                                    bArr10 = bArr;
                                                    i47 = i45;
                                                    D(i14, i44, obj2, C2);
                                                    i17 = i44;
                                                    l6Var = l6Var4;
                                                    i51 = k02;
                                                    t4Var2 = t4Var;
                                                    str = str;
                                                    i18 = i14;
                                                    bArr2 = bArr10;
                                                    if (i51 != i47) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                bArr2 = bArr;
                                                t4Var2 = t4Var;
                                                i47 = i45;
                                                str = str;
                                                i18 = i14;
                                                i51 = i47;
                                                if (i51 != i47) {
                                                }
                                                break;
                                        }
                                    } else if (i64 == 2) {
                                        int i107 = i44 / 3;
                                        Object obj14 = objArr[i107 + i107];
                                        Object object = unsafe.getObject(obj2, j6);
                                        if (!((w5) object).f5338a) {
                                            w5 a11 = w5.f5337b.a();
                                            e5.c(a11, object);
                                            unsafe.putObject(obj2, j6, a11);
                                            object = a11;
                                        }
                                        t tVar = ((v5) obj14).f5284a;
                                        w5 w5Var = (w5) object;
                                        int a021 = d5.a0(bArr15, i45, t4Var15);
                                        int i108 = t4Var15.f5245a;
                                        if (i108 >= 0 && i108 <= i10 - a021) {
                                            int i109 = a021 + i108;
                                            Object obj15 = "";
                                            Object obj16 = obj15;
                                            while (a021 < i109) {
                                                int i110 = a021 + 1;
                                                int i111 = bArr15[a021];
                                                if (i111 < 0) {
                                                    i110 = d5.c0(i111, bArr15, i110, t4Var15);
                                                    i111 = t4Var15.f5245a;
                                                }
                                                int i112 = i111 >>> 3;
                                                int i113 = i111 & 7;
                                                Object obj17 = obj15;
                                                if (i112 == 1) {
                                                    t4 t4Var16 = t4Var15;
                                                    obj6 = obj17;
                                                    t6 t6Var = (t6) tVar.f5243a;
                                                    Object obj18 = obj16;
                                                    if (i113 == t6Var.f5257b) {
                                                        int s8 = s(bArr, i110, i10, t6Var, null, t4Var16);
                                                        t4Var15 = t4Var16;
                                                        obj15 = t4Var16.f5247c;
                                                        a021 = s8;
                                                        bArr15 = bArr;
                                                        obj16 = obj18;
                                                    } else {
                                                        bArr9 = bArr;
                                                        t4Var11 = t4Var16;
                                                        obj5 = obj18;
                                                        i46 = i10;
                                                    }
                                                } else if (i112 != 2) {
                                                    i46 = i10;
                                                    obj5 = obj16;
                                                    t4Var11 = t4Var15;
                                                    obj6 = obj17;
                                                    bArr9 = bArr;
                                                } else {
                                                    t6 t6Var2 = (t6) tVar.f5244b;
                                                    if (i113 == t6Var2.f5257b) {
                                                        t4 t4Var17 = t4Var15;
                                                        int s10 = s(bArr, i110, i10, t6Var2, "".getClass(), t4Var17);
                                                        obj16 = t4Var17.f5247c;
                                                        a021 = s10;
                                                        obj15 = obj17;
                                                        bArr15 = bArr;
                                                        t4Var15 = t4Var17;
                                                    } else {
                                                        t4 t4Var18 = t4Var15;
                                                        obj6 = obj17;
                                                        obj5 = obj16;
                                                        t4Var11 = t4Var18;
                                                        bArr9 = bArr;
                                                        i46 = i10;
                                                    }
                                                }
                                                a021 = d5.p0(i111, bArr9, i110, i46, t4Var11);
                                                byte[] bArr16 = bArr9;
                                                obj16 = obj5;
                                                bArr15 = bArr16;
                                                Object obj19 = obj6;
                                                t4Var15 = t4Var11;
                                                obj15 = obj19;
                                            }
                                            Object obj20 = obj16;
                                            byte[] bArr17 = bArr15;
                                            t4 t4Var19 = t4Var15;
                                            Object obj21 = obj15;
                                            if (a021 != i109) {
                                                throw new p5(str);
                                            }
                                            w5Var.put(obj21, obj20);
                                            if (i109 != i45) {
                                                a6Var2 = this;
                                                unsafe6 = unsafe;
                                                i50 = i10;
                                                obj7 = obj2;
                                                i52 = i14;
                                                i57 = 1048575;
                                                t4Var13 = t4Var19;
                                                bArr11 = bArr17;
                                                i56 = i19;
                                                i53 = i44;
                                                i51 = i109;
                                                i55 = i75;
                                            } else {
                                                i17 = i44;
                                                l6Var = l6Var4;
                                                i13 = i22;
                                                i12 = i11;
                                                t4Var2 = t4Var19;
                                                bArr2 = bArr17;
                                                i20 = i109;
                                                i18 = i14;
                                            }
                                        }
                                    } else {
                                        bArr8 = bArr15;
                                        t4Var10 = t4Var15;
                                        str2 = str;
                                        l6 l6Var15 = l6Var4;
                                        i17 = i44;
                                        l6Var = l6Var15;
                                        i13 = i22;
                                        t4Var2 = t4Var10;
                                        bArr2 = bArr8;
                                        str = str2;
                                        i55 = i75;
                                        i12 = i11;
                                        i20 = i45;
                                        i18 = i14;
                                    }
                                    i55 = i75;
                                }
                                i54 = i22;
                            } else if (i64 == 2) {
                                m5 m5Var4 = (m5) unsafe8.getObject(obj13, j6);
                                if (!((r4) m5Var4).f5228a) {
                                    int size3 = m5Var4.size();
                                    m5Var4 = m5Var4.i0(size3 == 0 ? 10 : size3 + size3);
                                    unsafe8.putObject(obj13, j6, m5Var4);
                                }
                                m5 m5Var5 = m5Var4;
                                bArr11 = bArr;
                                i50 = i10;
                                i51 = d5.n0(a6Var2.y(i74), i56, bArr11, i61, i50, m5Var5, t4Var);
                                i54 = i22;
                                t4Var13 = t4Var;
                                i53 = i74;
                                obj7 = obj;
                                i52 = i14;
                                i55 = i75;
                                i57 = 1048575;
                                i56 = i56;
                                unsafe6 = unsafe8;
                            } else {
                                obj2 = obj13;
                                bArr8 = bArr;
                                t4Var10 = t4Var;
                                i44 = i74;
                                unsafe = unsafe8;
                                l6Var4 = l6Var5;
                                i45 = i61;
                                str2 = "Failed to parse the message.";
                                i19 = i56;
                                l6 l6Var152 = l6Var4;
                                i17 = i44;
                                l6Var = l6Var152;
                                i13 = i22;
                                t4Var2 = t4Var10;
                                bArr2 = bArr8;
                                str = str2;
                                i55 = i75;
                                i12 = i11;
                                i20 = i45;
                                i18 = i14;
                            }
                            if (i19 != i12) {
                            }
                            g5 g5Var22222222222222 = (g5) obj2;
                            l6Var2 = g5Var22222222222222.zzc;
                            if (l6Var2 == l6Var) {
                            }
                            int i7022222222222222 = i19;
                            int o0222222222222222 = d5.o0(i7022222222222222, bArr2, i20, i10, l6Var2, t4Var2);
                            t4Var13 = t4Var;
                            i50 = i10;
                            i54 = i13;
                            obj7 = obj2;
                            i53 = i17;
                            i57 = 1048575;
                            i52 = i18;
                            i56 = i7022222222222222;
                            i51 = o0222222222222222;
                            a6Var2 = this;
                            bArr11 = bArr;
                            unsafe6 = unsafe;
                        }
                    }
                    i12 = i11;
                    if (i19 != i12) {
                    }
                    g5 g5Var222222222222222 = (g5) obj2;
                    l6Var2 = g5Var222222222222222.zzc;
                    if (l6Var2 == l6Var) {
                    }
                    int i70222222222222222 = i19;
                    int o02222222222222222 = d5.o0(i70222222222222222, bArr2, i20, i10, l6Var2, t4Var2);
                    t4Var13 = t4Var;
                    i50 = i10;
                    i54 = i13;
                    obj7 = obj2;
                    i53 = i17;
                    i57 = 1048575;
                    i52 = i18;
                    i56 = i70222222222222222;
                    i51 = o02222222222222222;
                    a6Var2 = this;
                    bArr11 = bArr;
                    unsafe6 = unsafe;
                } else {
                    a6Var = a6Var2;
                    unsafe = unsafe6;
                    str = "Failed to parse the message.";
                    int i114 = i54;
                    l6Var = l6Var5;
                    objArr = objArr2;
                    i12 = i11;
                    i13 = i114;
                }
            }
            unsafe6 = unsafe3;
            bArr11 = bArr4;
            t4Var13 = t4Var4;
            i52 = i14;
            i56 = i25;
        }
        throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void w(int i5, Object obj, Object obj2) {
        if (o(i5, obj2)) {
            int E = E(i5) & 1048575;
            Unsafe unsafe = f4911k;
            long j6 = E;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i10 = this.f4912a[i5];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            h6 y5 = y(i5);
            if (!o(i5, obj)) {
                if (j(object)) {
                    g5 a7 = y5.a();
                    y5.c(a7, object);
                    unsafe.putObject(obj, j6, a7);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                p(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!j(object2)) {
                g5 a10 = y5.a();
                y5.c(a10, object2);
                unsafe.putObject(obj, j6, a10);
                object2 = a10;
            }
            y5.c(object2, object);
        }
    }

    public final void x(int i5, Object obj, Object obj2) {
        int[] iArr = this.f4912a;
        int i10 = iArr[i5];
        if (q(i10, i5, obj2)) {
            int E = E(i5) & 1048575;
            Unsafe unsafe = f4911k;
            long j6 = E;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i11 = iArr[i5];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            h6 y5 = y(i5);
            if (!q(i10, i5, obj)) {
                if (j(object)) {
                    g5 a7 = y5.a();
                    y5.c(a7, object);
                    unsafe.putObject(obj, j6, a7);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                q6.g(i10, iArr[i5 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!j(object2)) {
                g5 a10 = y5.a();
                y5.c(a10, object2);
                unsafe.putObject(obj, j6, a10);
                object2 = a10;
            }
            y5.c(object2, object);
        }
    }

    public final h6 y(int i5) {
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f4913b;
        h6 h6Var = (h6) objArr[i11];
        if (h6Var != null) {
            return h6Var;
        }
        h6 a7 = e6.f5030c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a7;
        return a7;
    }

    public final j5 z(int i5) {
        int i10 = i5 / 3;
        return (j5) this.f4913b[i10 + i10 + 1];
    }
}
