package com.google.android.gms.internal.play_billing;

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
public final class w3 implements d4 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f5617k = m4.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5620c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5621d;

    /* renamed from: e, reason: collision with root package name */
    public final t2 f5622e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5623f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5624g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5625h;

    /* renamed from: i, reason: collision with root package name */
    public final e3 f5626i;

    public w3(int[] iArr, Object[] objArr, int i5, int i10, t2 t2Var, int[] iArr2, int i11, int i12, e3 e3Var, e3 e3Var2) {
        this.f5618a = iArr;
        this.f5619b = objArr;
        this.f5620c = i5;
        this.f5621d = i10;
        this.f5623f = iArr2;
        this.f5624g = i11;
        this.f5625h = i12;
        this.f5626i = e3Var;
        this.f5622e = t2Var;
    }

    public static Field E(Class cls, String str) {
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
            StringBuilder q = r4.k.q("Field ", str, " for ", name, " not found. Known fields are ");
            q.append(arrays);
            throw new RuntimeException(q.toString());
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g3) {
            return ((g3) obj).c();
        }
        return true;
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
    public static w3 u(c4 c4Var, e3 e3Var, e3 e3Var2) {
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
        Field E;
        char charAt10;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field E2;
        Object obj2;
        Field E3;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (!(c4Var instanceof c4)) {
            c4Var.getClass();
            throw new ClassCastException();
        }
        String str = c4Var.f5417b;
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
        Unsafe unsafe = f5617k;
        Object[] objArr2 = c4Var.f5418c;
        Class<?> cls2 = c4Var.f5416a.getClass();
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
                        if (c4Var.a() == 1 || i87 != 0) {
                            i35 = i14 + 1;
                            int i96 = i76 / 3;
                            objArr3[i96 + i96 + 1] = objArr4[i14];
                        } else {
                            i36 = 0;
                            int i97 = i94 + i94;
                            i87 = i36;
                            obj = objArr4[i97];
                            if (obj instanceof Field) {
                                E2 = (Field) obj;
                            } else {
                                E2 = E(cls2, (String) obj);
                                objArr4[i97] = E2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E2);
                            int i98 = i97 + 1;
                            obj2 = objArr4[i98];
                            if (obj2 instanceof Field) {
                                E3 = (Field) obj2;
                            } else {
                                E3 = E(cls2, (String) obj2);
                                objArr4[i98] = E3;
                            }
                            i29 = i92;
                            i32 = objectFieldOffset2;
                            i28 = 55296;
                            objArr = objArr3;
                            i26 = i10;
                            cls = cls2;
                            i31 = 0;
                            i27 = (int) unsafe.objectFieldOffset(E3);
                        }
                    }
                    i36 = i87;
                    int i972 = i94 + i94;
                    i87 = i36;
                    obj = objArr4[i972];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E2);
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
                    i27 = (int) unsafe.objectFieldOffset(E3);
                }
                i14 = i35;
                i36 = i87;
                int i9722 = i94 + i94;
                i87 = i36;
                obj = objArr4[i9722];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E2);
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
                i27 = (int) unsafe.objectFieldOffset(E3);
            } else {
                int i99 = i14 + 1;
                Field E4 = E(cls2, (String) objArr4[i14]);
                objArr = objArr3;
                if (i85 == 9 || i85 == 17) {
                    i26 = i10;
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = E4.getType();
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
                            if (c4Var.a() == 1 || i87 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                                E = (Field) obj3;
                            } else {
                                E = E(cls, (String) obj3);
                                objArr4[i109] = E;
                            }
                            i30 = charAt26 % 32;
                            i27 = (int) unsafe.objectFieldOffset(E);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
        return new w3(iArr2, objArr3, i11, i13, c4Var.f5416a, iArr, i15, i72, e3Var, e3Var2);
    }

    public static int v(long j6, Object obj) {
        return ((Integer) m4.h(j6, obj)).intValue();
    }

    public static int x(int i5) {
        return (i5 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j6, Object obj) {
        return ((Long) m4.h(j6, obj)).longValue();
    }

    public final i3 A(int i5) {
        int i10 = i5 / 3;
        return (i3) this.f5619b[i10 + i10 + 1];
    }

    public final d4 B(int i5) {
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f5619b;
        d4 d4Var = (d4) objArr[i11];
        if (d4Var != null) {
            return d4Var;
        }
        d4 a7 = a4.f5397c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a7;
        return a7;
    }

    public final Object C(int i5, Object obj) {
        d4 B = B(i5);
        int y5 = y(i5) & 1048575;
        if (!p(i5, obj)) {
            return B.c();
        }
        Object object = f5617k.getObject(obj, y5);
        if (r(object)) {
            return object;
        }
        g3 c2 = B.c();
        if (object != null) {
            B.e(c2, object);
        }
        return c2;
    }

    public final Object D(int i5, int i10, Object obj) {
        d4 B = B(i10);
        if (!s(i5, i10, obj)) {
            return B.c();
        }
        Object object = f5617k.getObject(obj, y(i10) & 1048575);
        if (r(object)) {
            return object;
        }
        g3 c2 = B.c();
        if (object != null) {
            B.e(c2, object);
        }
        return c2;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof g3) {
            g3 g3Var = (g3) obj;
            g3Var.l();
            g3Var.zza = 0;
            g3Var.j();
        }
        int i5 = 0;
        while (true) {
            int[] iArr = this.f5618a;
            if (i5 >= iArr.length) {
                this.f5626i.getClass();
                h4 h4Var = ((g3) obj).zzc;
                if (h4Var.f5479e) {
                    h4Var.f5479e = false;
                    return;
                }
                return;
            }
            int y5 = y(i5);
            int i10 = 1048575 & y5;
            int x10 = x(y5);
            long j6 = i10;
            if (x10 != 9) {
                if (x10 != 60 && x10 != 68) {
                    switch (x10) {
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
                            u2 u2Var = (u2) ((k3) m4.h(j6, obj));
                            if (!u2Var.f5599a) {
                                break;
                            } else {
                                u2Var.f5599a = false;
                                break;
                            }
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = f5617k;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((s3) object).f5582a = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (s(iArr[i5], i5, obj)) {
                    B(i5).a(f5617k.getObject(obj, j6));
                }
                i5 += 3;
            }
            if (p(i5, obj)) {
                B(i5).a(f5617k.getObject(obj, j6));
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final boolean b(Object obj) {
        int i5;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f5624g) {
            int i15 = this.f5623f[i13];
            int[] iArr = this.f5618a;
            int i16 = iArr[i15];
            int y5 = y(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f5617k.getInt(obj, i18);
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
            if ((268435456 & y5) == 0 || q(obj, i10, i5, i11, i19)) {
                int x10 = x(y5);
                if (x10 == 9 || x10 == 17) {
                    if (q(obj, i10, i5, i11, i19) && !B(i10).b(m4.h(y5 & 1048575, obj))) {
                    }
                    i13++;
                    i14 = i5;
                    i12 = i11;
                } else {
                    if (x10 != 27) {
                        if (x10 == 60 || x10 == 68) {
                            if (s(i16, i10, obj) && !B(i10).b(m4.h(y5 & 1048575, obj))) {
                            }
                        } else if (x10 != 49) {
                            if (x10 == 50 && !((s3) m4.h(y5 & 1048575, obj)).isEmpty()) {
                                int i21 = i10 / 3;
                                this.f5619b[i21 + i21].getClass();
                                throw new ClassCastException();
                            }
                        }
                        i13++;
                        i14 = i5;
                        i12 = i11;
                    }
                    List list = (List) m4.h(y5 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        d4 B = B(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (B.b(list.get(i22))) {
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

    @Override // com.google.android.gms.internal.play_billing.d4
    public final g3 c() {
        return (g3) ((g3) this.f5622e).d(4);
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final int d(t2 t2Var) {
        int i5;
        int e0;
        int O;
        int i10;
        int i11;
        int a7;
        int e02;
        int size;
        int n9;
        int e03;
        int e04;
        int e05;
        int i12;
        int e06;
        int O2;
        w3 w3Var = this;
        t2 t2Var2 = t2Var;
        Unsafe unsafe = f5617k;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = w3Var.f5618a;
            if (i15 >= iArr.length) {
                return ((g3) t2Var).zzc.a() + i17;
            }
            int y5 = w3Var.y(i15);
            int x10 = x(y5);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & i13;
            if (x10 <= 17) {
                if (i20 != i14) {
                    i16 = i20 == i13 ? 0 : unsafe.getInt(t2Var2, i20);
                    i14 = i20;
                }
                i5 = 1 << (i19 >>> 20);
            } else {
                i5 = 0;
            }
            int i21 = y5 & i13;
            if (x10 >= c3.f5411b.f5415a) {
                c3.f5412c.getClass();
            }
            long j6 = i21;
            switch (x10) {
                case 0:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 1:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 2:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        long j10 = unsafe.getLong(t2Var2, j6);
                        e0 = z2.e0(i18 << 3);
                        O = z2.O(j10);
                        i10 = O + e0;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 3:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        long j11 = unsafe.getLong(t2Var2, j6);
                        e0 = z2.e0(i18 << 3);
                        O = z2.O(j11);
                        i10 = O + e0;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 4:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        long j12 = unsafe.getInt(t2Var2, j6);
                        e0 = z2.e0(i18 << 3);
                        O = z2.O(j12);
                        i10 = O + e0;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 5:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 6:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 7:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 1, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 8:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        int i22 = i18 << 3;
                        Object object = unsafe.getObject(t2Var2, j6);
                        if (object instanceof y2) {
                            int e07 = z2.e0(i22);
                            int c2 = ((y2) object).c();
                            i17 = androidx.appcompat.widget.c1.x(c2, c2, e07, i17);
                        } else {
                            e0 = z2.e0(i22);
                            O = z2.d0((String) object);
                            i10 = O + e0;
                            i17 += i10;
                        }
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 9:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        Object object2 = unsafe.getObject(t2Var2, j6);
                        d4 B = w3Var.B(i15);
                        e3 e3Var = e4.f5441a;
                        int e08 = z2.e0(i18 << 3);
                        int a10 = ((t2) object2).a(B);
                        i17 = androidx.appcompat.widget.c1.x(a10, a10, e08, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 10:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        y2 y2Var = (y2) unsafe.getObject(t2Var2, j6);
                        int e09 = z2.e0(i18 << 3);
                        int c8 = y2Var.c();
                        i17 = androidx.appcompat.widget.c1.x(c8, c8, e09, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 11:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(unsafe.getInt(t2Var2, j6), z2.e0(i18 << 3), i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 12:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        long j13 = unsafe.getInt(t2Var2, j6);
                        e0 = z2.e0(i18 << 3);
                        O = z2.O(j13);
                        i10 = O + e0;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 13:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 14:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 15:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        int i23 = unsafe.getInt(t2Var2, j6);
                        i17 = androidx.appcompat.widget.c1.w((i23 >> 31) ^ (i23 + i23), z2.e0(i18 << 3), i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 16:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        long j14 = unsafe.getLong(t2Var2, j6);
                        e0 = z2.e0(i18 << 3);
                        O = z2.O((j14 >> 63) ^ (j14 + j14));
                        i10 = O + e0;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 17:
                    if (w3Var.q(t2Var2, i15, i14, i16, i5)) {
                        t2 t2Var3 = (t2) unsafe.getObject(t2Var2, j6);
                        d4 B2 = w3Var.B(i15);
                        int e010 = z2.e0(i18 << 3);
                        i11 = e010 + e010;
                        a7 = t2Var3.a(B2);
                        i10 = a7 + i11;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 18:
                    i10 = e4.h(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 19:
                    i10 = e4.g(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var2 = e4.f5441a;
                    if (list.size() != 0) {
                        e02 = (z2.e0(i18 << 3) * list.size()) + e4.j(list);
                        i17 += e02;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e02 = 0;
                    i17 += e02;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var3 = e4.f5441a;
                    size = list2.size();
                    if (size != 0) {
                        n9 = e4.n(list2);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var4 = e4.f5441a;
                    size = list3.size();
                    if (size != 0) {
                        n9 = e4.i(list3);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    i10 = e4.h(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    i10 = e4.g(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.F /* 25 */:
                    List list4 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var5 = e4.f5441a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        e02 = (z2.e0(i18 << 3) + 1) * size2;
                        i17 += e02;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e02 = 0;
                    i17 += e02;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.G /* 26 */:
                    List list5 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var6 = e4.f5441a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        e04 = z2.e0(i18 << 3) * size3;
                        for (int i24 = 0; i24 < size3; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof y2) {
                                int c10 = ((y2) obj).c();
                                e04 = androidx.appcompat.widget.c1.w(c10, c10, e04);
                            } else {
                                e04 = z2.d0((String) obj) + e04;
                            }
                        }
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.H /* 27 */:
                    List list6 = (List) unsafe.getObject(t2Var2, j6);
                    d4 B3 = w3Var.B(i15);
                    e3 e3Var7 = e4.f5441a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        e05 = 0;
                    } else {
                        e05 = z2.e0(i18 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            int a11 = ((t2) list6.get(i25)).a(B3);
                            e05 = androidx.appcompat.widget.c1.w(a11, a11, e05);
                        }
                    }
                    i17 += e05;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var8 = e4.f5441a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        e04 = z2.e0(i18 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int c11 = ((y2) list7.get(i26)).c();
                            e04 = androidx.appcompat.widget.c1.w(c11, c11, e04);
                        }
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.I /* 29 */:
                    List list8 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var9 = e4.f5441a;
                    size = list8.size();
                    if (size != 0) {
                        n9 = e4.m(list8);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var10 = e4.f5441a;
                    size = list9.size();
                    if (size != 0) {
                        n9 = e4.f(list9);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 31:
                    i10 = e4.g(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 32:
                    i10 = e4.h(i18, (List) unsafe.getObject(t2Var2, j6));
                    i17 += i10;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var11 = e4.f5441a;
                    size = list10.size();
                    if (size != 0) {
                        n9 = e4.k(list10);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var12 = e4.f5441a;
                    size = list11.size();
                    if (size != 0) {
                        n9 = e4.l(list11);
                        e03 = z2.e0(i18 << 3);
                        e04 = (e03 * size) + n9;
                        i17 += e04;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                    e04 = 0;
                    i17 += e04;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.J /* 35 */:
                    List list12 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var13 = e4.f5441a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size6, z2.e0(i18 << 3), size6, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 36:
                    List list13 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var14 = e4.f5441a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size7, z2.e0(i18 << 3), size7, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 37:
                    int j15 = e4.j((List) unsafe.getObject(t2Var2, j6));
                    if (j15 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(j15, z2.e0(i18 << 3), j15, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.K /* 38 */:
                    int n10 = e4.n((List) unsafe.getObject(t2Var2, j6));
                    if (n10 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(n10, z2.e0(i18 << 3), n10, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 39:
                    int i27 = e4.i((List) unsafe.getObject(t2Var2, j6));
                    if (i27 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(i27, z2.e0(i18 << 3), i27, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 40:
                    List list14 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var15 = e4.f5441a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size8, z2.e0(i18 << 3), size8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var16 = e4.f5441a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size9, z2.e0(i18 << 3), size9, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case C0122e9.M /* 42 */:
                    List list16 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var17 = e4.f5441a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size10, z2.e0(i18 << 3), size10, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 43:
                    int m6 = e4.m((List) unsafe.getObject(t2Var2, j6));
                    if (m6 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(m6, z2.e0(i18 << 3), m6, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 44:
                    int f6 = e4.f((List) unsafe.getObject(t2Var2, j6));
                    if (f6 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(f6, z2.e0(i18 << 3), f6, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 45:
                    List list17 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var18 = e4.f5441a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size11, z2.e0(i18 << 3), size11, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 46:
                    List list18 = (List) unsafe.getObject(t2Var2, j6);
                    e3 e3Var19 = e4.f5441a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(size12, z2.e0(i18 << 3), size12, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 47:
                    int k6 = e4.k((List) unsafe.getObject(t2Var2, j6));
                    if (k6 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(k6, z2.e0(i18 << 3), k6, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 48:
                    int l6 = e4.l((List) unsafe.getObject(t2Var2, j6));
                    if (l6 > 0) {
                        i17 = androidx.appcompat.widget.c1.x(l6, z2.e0(i18 << 3), l6, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list19 = (List) unsafe.getObject(t2Var2, j6);
                    d4 B4 = w3Var.B(i15);
                    e3 e3Var20 = e4.f5441a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i28 = 0; i28 < size13; i28++) {
                            t2 t2Var4 = (t2) list19.get(i28);
                            int e011 = z2.e0(i18 << 3);
                            i12 += t2Var4.a(B4) + e011 + e011;
                        }
                    }
                    i17 += i12;
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(t2Var2, j6);
                    int i29 = i15 / 3;
                    s3 s3Var = (s3) object3;
                    if (w3Var.f5619b[i29 + i29] != null) {
                        throw new ClassCastException();
                    }
                    if (s3Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = s3Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 51:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 52:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 53:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        long z5 = z(j6, t2Var2);
                        e06 = z2.e0(i18 << 3);
                        O2 = z2.O(z5);
                        i17 += O2 + e06;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 54:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        long z7 = z(j6, t2Var2);
                        e06 = z2.e0(i18 << 3);
                        O2 = z2.O(z7);
                        i17 += O2 + e06;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 55:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        long v5 = v(j6, t2Var2);
                        e06 = z2.e0(i18 << 3);
                        O2 = z2.O(v5);
                        i17 += O2 + e06;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 56:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 57:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 58:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 1, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 59:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        int i30 = i18 << 3;
                        Object object4 = unsafe.getObject(t2Var2, j6);
                        if (object4 instanceof y2) {
                            int e012 = z2.e0(i30);
                            int c12 = ((y2) object4).c();
                            i17 = androidx.appcompat.widget.c1.x(c12, c12, e012, i17);
                        } else {
                            e06 = z2.e0(i30);
                            O2 = z2.d0((String) object4);
                            i17 += O2 + e06;
                        }
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 60:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        Object object5 = unsafe.getObject(t2Var2, j6);
                        d4 B5 = w3Var.B(i15);
                        e3 e3Var21 = e4.f5441a;
                        int e013 = z2.e0(i18 << 3);
                        int a12 = ((t2) object5).a(B5);
                        i17 = androidx.appcompat.widget.c1.x(a12, a12, e013, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 61:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        y2 y2Var2 = (y2) unsafe.getObject(t2Var2, j6);
                        int e014 = z2.e0(i18 << 3);
                        int c13 = y2Var2.c();
                        i17 = androidx.appcompat.widget.c1.x(c13, c13, e014, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 62:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(v(j6, t2Var2), z2.e0(i18 << 3), i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 63:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        long v10 = v(j6, t2Var2);
                        e06 = z2.e0(i18 << 3);
                        O2 = z2.O(v10);
                        i17 += O2 + e06;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 64:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 4, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 65:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        i17 = androidx.appcompat.widget.c1.w(i18 << 3, 8, i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 66:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        int v11 = v(j6, t2Var2);
                        i17 = androidx.appcompat.widget.c1.w((v11 >> 31) ^ (v11 + v11), z2.e0(i18 << 3), i17);
                    }
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
                case 67:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        long z10 = z(j6, t2Var2);
                        e06 = z2.e0(i18 << 3);
                        O2 = z2.O((z10 >> 63) ^ (z10 + z10));
                        i17 += O2 + e06;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                case 68:
                    if (w3Var.s(i18, i15, t2Var2)) {
                        t2 t2Var5 = (t2) unsafe.getObject(t2Var2, j6);
                        d4 B6 = w3Var.B(i15);
                        int e015 = z2.e0(i18 << 3);
                        i11 = e015 + e015;
                        a7 = t2Var5.a(B6);
                        i10 = a7 + i11;
                        i17 += i10;
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    } else {
                        i15 += 3;
                        w3Var = this;
                        t2Var2 = t2Var;
                        i13 = 1048575;
                    }
                default:
                    i15 += 3;
                    w3Var = this;
                    t2Var2 = t2Var;
                    i13 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.d4
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f5618a;
            if (i5 >= iArr.length) {
                e4.p(obj, obj2);
                return;
            }
            int y5 = y(i5);
            int i10 = y5 & 1048575;
            int x10 = x(y5);
            int i11 = iArr[i5];
            long j6 = i10;
            switch (x10) {
                case 0:
                    if (p(i5, obj2)) {
                        l4 l4Var = m4.f5511c;
                        obj3 = obj;
                        l4Var.e(obj3, j6, l4Var.a(j6, obj2));
                        l(i5, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i5, obj2)) {
                        l4 l4Var2 = m4.f5511c;
                        l4Var2.f(obj, j6, l4Var2.b(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i5, obj2)) {
                        m4.k(obj, j6, m4.f(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i5, obj2)) {
                        m4.k(obj, j6, m4.f(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i5, obj2)) {
                        m4.k(obj, j6, m4.f(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i5, obj2)) {
                        l4 l4Var3 = m4.f5511c;
                        l4Var3.c(obj, j6, l4Var3.g(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i5, obj2)) {
                        m4.l(j6, obj, m4.h(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i5, obj2)) {
                        m4.l(j6, obj, m4.h(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i5, obj2)) {
                        m4.k(obj, j6, m4.f(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i5, obj2)) {
                        m4.j(m4.e(j6, obj2), j6, obj);
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i5, obj2)) {
                        m4.k(obj, j6, m4.f(j6, obj2));
                        l(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(i5, obj, obj2);
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
                    k3 k3Var = (k3) m4.h(j6, obj);
                    k3 k3Var2 = (k3) m4.h(j6, obj2);
                    int size = k3Var.size();
                    int size2 = k3Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((u2) k3Var).f5599a) {
                            k3Var = k3Var.k(size2 + size);
                        }
                        k3Var.addAll(k3Var2);
                    }
                    if (size > 0) {
                        k3Var2 = k3Var;
                    }
                    m4.l(j6, obj, k3Var2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    e3 e3Var = e4.f5441a;
                    m4.l(j6, obj, e3.c(m4.h(j6, obj), m4.h(j6, obj2)));
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
                    if (s(i11, i5, obj2)) {
                        m4.l(j6, obj, m4.h(j6, obj2));
                        m4.j(i11, iArr[i5 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i11, i5, obj2)) {
                        m4.l(j6, obj, m4.h(j6, obj2));
                        m4.j(i11, iArr[i5 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(i5, obj, obj2);
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
    @Override // com.google.android.gms.internal.play_billing.d4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(g3 g3Var) {
        int i5;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f5618a;
            if (i13 >= iArr.length) {
                return g3Var.zzc.hashCode() + (i14 * 53);
            }
            int y5 = y(i13);
            int i15 = 1048575 & y5;
            int x10 = x(y5);
            int i16 = iArr[i13];
            long j6 = i15;
            int i17 = 1237;
            int i18 = 37;
            switch (x10) {
                case 0:
                    i5 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(m4.f5511c.a(j6, g3Var));
                    Charset charset = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i10 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(m4.f5511c.b(j6, g3Var));
                    i14 = floatToIntBits + i10;
                    break;
                case 2:
                    i5 = i14 * 53;
                    doubleToLongBits = m4.f(j6, g3Var);
                    Charset charset2 = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i5 = i14 * 53;
                    doubleToLongBits = m4.f(j6, g3Var);
                    Charset charset3 = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 5:
                    i5 = i14 * 53;
                    doubleToLongBits = m4.f(j6, g3Var);
                    Charset charset4 = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i14 * 53;
                    boolean g10 = m4.f5511c.g(j6, g3Var);
                    Charset charset5 = l3.f5497a;
                    break;
                case 8:
                    i10 = i14 * 53;
                    floatToIntBits = ((String) m4.h(j6, g3Var)).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object h10 = m4.h(j6, g3Var);
                    if (h10 != null) {
                        i18 = h10.hashCode();
                    }
                    i14 = i12 + i18;
                    break;
                case 10:
                    i10 = i14 * 53;
                    floatToIntBits = m4.h(j6, g3Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 11:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 12:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 13:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 14:
                    i5 = i14 * 53;
                    doubleToLongBits = m4.f(j6, g3Var);
                    Charset charset6 = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i10 = i14 * 53;
                    floatToIntBits = m4.e(j6, g3Var);
                    i14 = floatToIntBits + i10;
                    break;
                case 16:
                    i5 = i14 * 53;
                    doubleToLongBits = m4.f(j6, g3Var);
                    Charset charset7 = l3.f5497a;
                    i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object h11 = m4.h(j6, g3Var);
                    if (h11 != null) {
                        i18 = h11.hashCode();
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
                    floatToIntBits = m4.h(j6, g3Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i10 = i14 * 53;
                    floatToIntBits = m4.h(j6, g3Var).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 51:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) m4.h(j6, g3Var)).doubleValue());
                        Charset charset8 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) m4.h(j6, g3Var)).floatValue());
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = z(j6, g3Var);
                        Charset charset9 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = z(j6, g3Var);
                        Charset charset10 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 56:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = z(j6, g3Var);
                        Charset charset11 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 58:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        boolean booleanValue = ((Boolean) m4.h(j6, g3Var)).booleanValue();
                        Charset charset12 = l3.f5497a;
                        break;
                    }
                case 59:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = ((String) m4.h(j6, g3Var)).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = m4.h(j6, g3Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = m4.h(j6, g3Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 63:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 64:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 65:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = z(j6, g3Var);
                        Charset charset13 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = v(j6, g3Var);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 67:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i5 = i14 * 53;
                        doubleToLongBits = z(j6, g3Var);
                        Charset charset14 = l3.f5497a;
                        i14 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i16, i13, g3Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = m4.h(j6, g3Var).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final boolean g(g3 g3Var, g3 g3Var2) {
        boolean e7;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f5618a;
            if (i5 < iArr.length) {
                int y5 = y(i5);
                long j6 = y5 & 1048575;
                switch (x(y5)) {
                    case 0:
                        if (!o(g3Var, g3Var2, i5)) {
                            break;
                        } else {
                            l4 l4Var = m4.f5511c;
                            if (Double.doubleToLongBits(l4Var.a(j6, g3Var)) != Double.doubleToLongBits(l4Var.a(j6, g3Var2))) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 1:
                        if (!o(g3Var, g3Var2, i5)) {
                            break;
                        } else {
                            l4 l4Var2 = m4.f5511c;
                            if (Float.floatToIntBits(l4Var2.b(j6, g3Var)) != Float.floatToIntBits(l4Var2.b(j6, g3Var2))) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 2:
                        if (o(g3Var, g3Var2, i5) && m4.f(j6, g3Var) == m4.f(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 3:
                        if (o(g3Var, g3Var2, i5) && m4.f(j6, g3Var) == m4.f(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 4:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 5:
                        if (o(g3Var, g3Var2, i5) && m4.f(j6, g3Var) == m4.f(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 6:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 7:
                        if (!o(g3Var, g3Var2, i5)) {
                            break;
                        } else {
                            l4 l4Var3 = m4.f5511c;
                            if (l4Var3.g(j6, g3Var) != l4Var3.g(j6, g3Var2)) {
                                break;
                            } else {
                                continue;
                                i5 += 3;
                            }
                        }
                    case 8:
                        if (o(g3Var, g3Var2, i5) && e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 9:
                        if (o(g3Var, g3Var2, i5) && e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 10:
                        if (o(g3Var, g3Var2, i5) && e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 11:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 12:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 13:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 14:
                        if (o(g3Var, g3Var2, i5) && m4.f(j6, g3Var) == m4.f(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 15:
                        if (o(g3Var, g3Var2, i5) && m4.e(j6, g3Var) == m4.e(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 16:
                        if (o(g3Var, g3Var2, i5) && m4.f(j6, g3Var) == m4.f(j6, g3Var2)) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    case 17:
                        if (o(g3Var, g3Var2, i5) && e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2))) {
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
                        e7 = e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        e7 = e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2));
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
                        if (m4.e(j10, g3Var) == m4.e(j10, g3Var2) && e4.e(m4.h(j6, g3Var), m4.h(j6, g3Var2))) {
                            continue;
                            i5 += 3;
                        }
                        break;
                    default:
                        i5 += 3;
                }
                if (e7) {
                    i5 += 3;
                }
            } else if (g3Var.zzc.equals(g3Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void h(Object obj, byte[] bArr, int i5, int i10, com.google.android.gms.internal.measurement.t4 t4Var) {
        t(obj, bArr, i5, i10, 0, t4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void i(Object obj, r3 r3Var) {
        int i5;
        int i10;
        int i11;
        w3 w3Var = this;
        Unsafe unsafe = f5617k;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = w3Var.f5618a;
            if (i13 >= iArr.length) {
                ((g3) obj).zzc.d(r3Var);
                return;
            }
            int y5 = w3Var.y(i13);
            int x10 = x(y5);
            int i16 = iArr[i13];
            if (x10 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i12;
                if (i18 != i15) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i15 = i18;
                }
                i5 = 1 << (i17 >>> 20);
            } else {
                i5 = 0;
            }
            long j6 = y5 & i12;
            switch (x10) {
                case 0:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).T(i16, Double.doubleToRawLongBits(m4.f5511c.a(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).R(i16, Float.floatToRawIntBits(m4.f5511c.b(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).b0(i16, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).b0(i16, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).V(i16, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).T(i16, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).R(i16, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        byte g10 = m4.f5511c.g(j6, obj);
                        z2 z2Var = (z2) r3Var.f5558a;
                        z2Var.a0(i16 << 3);
                        int i19 = z2Var.f5665e;
                        try {
                            i10 = i19 + 1;
                        } catch (IndexOutOfBoundsException e7) {
                            e = e7;
                        }
                        try {
                            z2Var.f5663c[i19] = g10;
                            z2Var.f5665e = i10;
                            break;
                        } catch (IndexOutOfBoundsException e9) {
                            e = e9;
                            i19 = i10;
                            throw new com.google.android.gms.internal.measurement.y4(i19, z2Var.f5664d, 1, e, 1);
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            ((z2) r3Var.f5558a).X(i16, (String) object);
                            break;
                        } else {
                            ((z2) r3Var.f5558a).Q(i16, (y2) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        r3Var.d(i16, unsafe.getObject(obj, j6), w3Var.B(i13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).Q(i16, (y2) unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).Z(i16, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).V(i16, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).R(i16, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        ((z2) r3Var.f5558a).T(i16, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        int i20 = unsafe.getInt(obj, j6);
                        ((z2) r3Var.f5558a).Z(i16, (i20 >> 31) ^ (i20 + i20));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        long j10 = unsafe.getLong(obj, j6);
                        ((z2) r3Var.f5558a).b0(i16, (j10 >> 63) ^ (j10 + j10));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (w3Var.q(obj, i13, i15, i14, i5)) {
                        r3Var.c(i16, unsafe.getObject(obj, j6), w3Var.B(i13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    e4.r(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 19:
                    e4.v(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 20:
                    e4.x(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 21:
                    e4.d(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    e4.w(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    e4.u(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    e4.t(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case C0122e9.F /* 25 */:
                    e4.q(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case C0122e9.G /* 26 */:
                    int i21 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j6);
                    e3 e3Var = e4.f5441a;
                    if (list != null && !list.isEmpty()) {
                        r3Var.getClass();
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            ((z2) r3Var.f5558a).X(i21, (String) list.get(i22));
                        }
                        break;
                    }
                    break;
                case C0122e9.H /* 27 */:
                    int i23 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    d4 B = w3Var.B(i13);
                    e3 e3Var2 = e4.f5441a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            r3Var.d(i23, list2.get(i24), B);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i25 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    e3 e3Var3 = e4.f5441a;
                    if (list3 != null && !list3.isEmpty()) {
                        r3Var.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            ((z2) r3Var.f5558a).Q(i25, (y2) list3.get(i26));
                        }
                        break;
                    }
                    break;
                case C0122e9.I /* 29 */:
                    e4.c(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 30:
                    e4.s(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 31:
                    e4.y(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 32:
                    e4.z(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 33:
                    e4.a(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case 34:
                    e4.b(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, false);
                    break;
                case C0122e9.J /* 35 */:
                    e4.r(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 36:
                    e4.v(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 37:
                    e4.x(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case C0122e9.K /* 38 */:
                    e4.d(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 39:
                    e4.w(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 40:
                    e4.u(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    e4.t(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case C0122e9.M /* 42 */:
                    e4.q(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 43:
                    e4.c(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 44:
                    e4.s(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 45:
                    e4.y(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 46:
                    e4.z(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 47:
                    e4.a(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case 48:
                    e4.b(iArr[i13], (List) unsafe.getObject(obj, j6), r3Var, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    int i27 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    d4 B2 = w3Var.B(i13);
                    e3 e3Var4 = e4.f5441a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            r3Var.c(i27, list4.get(i28), B2);
                        }
                        break;
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (unsafe.getObject(obj, j6) != null) {
                        int i29 = i13 / 3;
                        w3Var.f5619b[i29 + i29].getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).T(i16, Double.doubleToRawLongBits(((Double) m4.h(j6, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).R(i16, Float.floatToRawIntBits(((Float) m4.h(j6, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).b0(i16, z(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).b0(i16, z(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).V(i16, v(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).T(i16, z(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).R(i16, v(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w3Var.s(i16, i13, obj)) {
                        byte booleanValue = ((Boolean) m4.h(j6, obj)).booleanValue();
                        z2 z2Var2 = (z2) r3Var.f5558a;
                        z2Var2.a0(i16 << 3);
                        int i30 = z2Var2.f5665e;
                        try {
                            i11 = i30 + 1;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                        }
                        try {
                            z2Var2.f5663c[i30] = booleanValue;
                            z2Var2.f5665e = i11;
                            break;
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                            i30 = i11;
                            throw new com.google.android.gms.internal.measurement.y4(i30, z2Var2.f5664d, 1, e, 1);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (w3Var.s(i16, i13, obj)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        if (object2 instanceof String) {
                            ((z2) r3Var.f5558a).X(i16, (String) object2);
                            break;
                        } else {
                            ((z2) r3Var.f5558a).Q(i16, (y2) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (w3Var.s(i16, i13, obj)) {
                        r3Var.d(i16, unsafe.getObject(obj, j6), w3Var.B(i13));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).Q(i16, (y2) unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).Z(i16, v(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).V(i16, v(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).R(i16, v(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w3Var.s(i16, i13, obj)) {
                        ((z2) r3Var.f5558a).T(i16, z(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w3Var.s(i16, i13, obj)) {
                        int v5 = v(j6, obj);
                        ((z2) r3Var.f5558a).Z(i16, (v5 >> 31) ^ (v5 + v5));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w3Var.s(i16, i13, obj)) {
                        long z5 = z(j6, obj);
                        ((z2) r3Var.f5558a).b0(i16, (z5 >> 63) ^ (z5 + z5));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w3Var.s(i16, i13, obj)) {
                        r3Var.c(i16, unsafe.getObject(obj, j6), w3Var.B(i13));
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i12 = 1048575;
            w3Var = this;
        }
    }

    public final void j(int i5, Object obj, Object obj2) {
        if (p(i5, obj2)) {
            int y5 = y(i5) & 1048575;
            Unsafe unsafe = f5617k;
            long j6 = y5;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5618a[i5] + " is present but null: " + obj2.toString());
            }
            d4 B = B(i5);
            if (!p(i5, obj)) {
                if (r(object)) {
                    g3 c2 = B.c();
                    B.e(c2, object);
                    unsafe.putObject(obj, j6, c2);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                l(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!r(object2)) {
                g3 c8 = B.c();
                B.e(c8, object2);
                unsafe.putObject(obj, j6, c8);
                object2 = c8;
            }
            B.e(object2, object);
        }
    }

    public final void k(int i5, Object obj, Object obj2) {
        int[] iArr = this.f5618a;
        int i10 = iArr[i5];
        if (s(i10, i5, obj2)) {
            int y5 = y(i5) & 1048575;
            Unsafe unsafe = f5617k;
            long j6 = y5;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2.toString());
            }
            d4 B = B(i5);
            if (!s(i10, i5, obj)) {
                if (r(object)) {
                    g3 c2 = B.c();
                    B.e(c2, object);
                    unsafe.putObject(obj, j6, c2);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                m4.j(i10, iArr[i5 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!r(object2)) {
                g3 c8 = B.c();
                B.e(c8, object2);
                unsafe.putObject(obj, j6, c8);
                object2 = c8;
            }
            B.e(object2, object);
        }
    }

    public final void l(int i5, Object obj) {
        int i10 = this.f5618a[i5 + 2];
        long j6 = 1048575 & i10;
        if (j6 == 1048575) {
            return;
        }
        m4.j((1 << (i10 >>> 20)) | m4.e(j6, obj), j6, obj);
    }

    public final void m(int i5, Object obj, Object obj2) {
        f5617k.putObject(obj, y(i5) & 1048575, obj2);
        l(i5, obj);
    }

    public final void n(int i5, int i10, Object obj, Object obj2) {
        f5617k.putObject(obj, y(i10) & 1048575, obj2);
        m4.j(i5, this.f5618a[i10 + 2] & 1048575, obj);
    }

    public final boolean o(g3 g3Var, g3 g3Var2, int i5) {
        return p(i5, g3Var) == p(i5, g3Var2);
    }

    public final boolean p(int i5, Object obj) {
        int i10 = this.f5618a[i5 + 2];
        long j6 = i10 & 1048575;
        if (j6 == 1048575) {
            int y5 = y(i5);
            long j10 = y5 & 1048575;
            switch (x(y5)) {
                case 0:
                    if (Double.doubleToRawLongBits(m4.f5511c.a(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(m4.f5511c.b(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (m4.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (m4.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (m4.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return m4.f5511c.g(j10, obj);
                case 8:
                    Object h10 = m4.h(j10, obj);
                    if (h10 instanceof String) {
                        if (((String) h10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h10 instanceof y2)) {
                            throw new IllegalArgumentException();
                        }
                        if (y2.f5654c.equals(h10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (m4.h(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (y2.f5654c.equals(m4.h(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (m4.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (m4.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (m4.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (m4.h(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & m4.e(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? p(i5, obj) : (i11 & i12) != 0;
    }

    public final boolean s(int i5, int i10, Object obj) {
        return m4.e((long) (this.f5618a[i10 + 2] & 1048575), obj) == i5;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.measurement.t4 r43) {
        /*
            Method dump skipped, instructions count: 3946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.w3.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.t4):int");
    }

    public final int w(int i5, int i10) {
        int[] iArr = this.f5618a;
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

    public final int y(int i5) {
        return this.f5618a[i5 + 1];
    }
}
