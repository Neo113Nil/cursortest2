package androidx.datastore.preferences.protobuf;

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
public final class p0 implements x0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1669n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1670o = k1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1674d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1675e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1676f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1677g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1678h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1679i;
    public final r0 j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f1680k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f1681l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f1682m;

    public p0(int[] iArr, Object[] objArr, int i5, int i10, a aVar, int[] iArr2, int i11, int i12, r0 r0Var, e0 e0Var, f1 f1Var, r rVar, l0 l0Var) {
        this.f1671a = iArr;
        this.f1672b = objArr;
        this.f1673c = i5;
        this.f1674d = i10;
        this.f1676f = aVar instanceof y;
        this.f1677g = iArr2;
        this.f1678h = i11;
        this.f1679i = i12;
        this.j = r0Var;
        this.f1680k = e0Var;
        this.f1681l = f1Var;
        this.f1675e = aVar;
        this.f1682m = l0Var;
    }

    public static Field F(Class cls, String str) {
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

    public static int K(int i5) {
        return (i5 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0 w(w0 w0Var, r0 r0Var, e0 e0Var, f1 f1Var, r rVar, l0 l0Var) {
        int i5;
        int charAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
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
        int i26;
        Class<?> cls;
        int i27;
        int objectFieldOffset;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field F;
        char charAt10;
        int i33;
        int i34;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i35;
        char charAt11;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        String str = w0Var.f1726b;
        int length = str.length();
        int i39 = 55296;
        if (str.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i5 = i40 + 1;
                if (str.charAt(i40) < 55296) {
                    break;
                }
                i40 = i5;
            }
        } else {
            i5 = 1;
        }
        int i41 = i5 + 1;
        int charAt15 = str.charAt(i5);
        if (charAt15 >= 55296) {
            int i42 = charAt15 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt14 = str.charAt(i41);
                if (charAt14 < 55296) {
                    break;
                }
                i42 |= (charAt14 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt15 = i42 | (charAt14 << i43);
            i41 = i38;
        }
        if (charAt15 == 0) {
            i11 = 0;
            i14 = 0;
            charAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = f1669n;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt16 = str.charAt(i41);
            if (charAt16 >= 55296) {
                int i45 = charAt16 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                charAt16 = i45 | (charAt9 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int charAt17 = str.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt17 = i48 | (charAt8 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt18 = str.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt18 = i51 | (charAt7 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt19 = str.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt19 = i54 | (charAt6 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            charAt = str.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt = i57 | (charAt5 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            int charAt20 = str.charAt(i56);
            if (charAt20 >= 55296) {
                int i60 = charAt20 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt4 = str.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt20 = i60 | (charAt4 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int charAt21 = str.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt3 = str.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt21 = i63 | (charAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt22 = str.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt2 = str.charAt(i65);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i66 |= (charAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt22 = i66 | (charAt2 << i67);
                i65 = i16;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = (charAt16 * 2) + charAt17;
            int i69 = charAt20;
            i10 = charAt18;
            i11 = i69;
            i12 = charAt16;
            i41 = i65;
            iArr = iArr2;
            i13 = charAt19;
            i14 = i68;
            i15 = charAt22;
        }
        Unsafe unsafe = f1670o;
        Object[] objArr = w0Var.f1727c;
        Class<?> cls2 = w0Var.f1725a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i70 = i15 + i11;
        int i71 = i70;
        int i72 = i15;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = str.charAt(i41);
            if (charAt23 >= i39) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    charAt13 = str.charAt(i77);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                    length = i24;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = str.charAt(i25);
            Object[] objArr3 = objArr;
            char c2 = 55296;
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt12 = str.charAt(i79);
                    if (charAt12 < c2) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i79 = i36;
                    c2 = 55296;
                }
                charAt24 = i80 | (charAt12 << i81);
                i79 = i36;
            }
            int i82 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i83 = charAt23;
            if ((charAt24 & Segment.SHARE_MINIMUM) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i79 + 1;
                int charAt25 = str.charAt(i79);
                char c8 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i35 = i84 + 1;
                        charAt11 = str.charAt(i84);
                        if (charAt11 < c8) {
                            break;
                        }
                        i85 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i84 = i35;
                        c8 = 55296;
                    }
                    charAt25 = i85 | (charAt11 << i86);
                    i84 = i35;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i34 = i14 + 1;
                    objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                } else {
                    if (i87 == 12 && (v.f.a(w0Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i34 = i14 + 1;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                    }
                    int i89 = charAt25 * 2;
                    obj = objArr3[i89];
                    if (obj instanceof Field) {
                        F2 = F(cls2, (String) obj);
                        objArr3[i89] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                    int i90 = i89 + 1;
                    obj2 = objArr3[i90];
                    if (obj2 instanceof Field) {
                        F3 = F(cls2, (String) obj2);
                        objArr3[i90] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                    int i91 = i12;
                    i28 = objectFieldOffset3;
                    i32 = objectFieldOffset2;
                    i26 = i91;
                    i31 = i14;
                    i29 = i88;
                    i30 = 0;
                    cls = cls2;
                }
                i14 = i34;
                int i892 = charAt25 * 2;
                obj = objArr3[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F2);
                int i902 = i892 + 1;
                obj2 = objArr3[i902];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F3);
                int i912 = i12;
                i28 = objectFieldOffset32;
                i32 = objectFieldOffset22;
                i26 = i912;
                i31 = i14;
                i29 = i88;
                i30 = 0;
                cls = cls2;
            } else {
                int i92 = i14 + 1;
                Field F4 = F(cls2, (String) objArr3[i14]);
                if (i82 == 9 || i82 == 17) {
                    i26 = i12;
                    objArr2[((i74 / 3) * 2) + 1] = F4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i26 = i12;
                        i33 = i14 + 2;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i26 = i12;
                        if (w0Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i33 = i14 + 2;
                            objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                        }
                    } else if (i82 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i74;
                        int i94 = (i74 / 3) * 2;
                        int i95 = i14 + 2;
                        objArr2[i94] = objArr3[i92];
                        if ((charAt24 & 2048) != 0) {
                            i27 = i14 + 3;
                            objArr2[i94 + 1] = objArr3[i95];
                            i26 = i12;
                            cls = cls2;
                            i72 = i93;
                        } else {
                            cls = cls2;
                            i27 = i95;
                            i72 = i93;
                            i26 = i12;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i82 > 17) {
                            i28 = 1048575;
                            i29 = i79;
                            i30 = 0;
                        } else {
                            int i96 = i79 + 1;
                            int charAt26 = str.charAt(i79);
                            if (charAt26 >= 55296) {
                                int i97 = charAt26 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i29 = i96 + 1;
                                    charAt10 = str.charAt(i96);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt10 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i29;
                                }
                                charAt26 = i97 | (charAt10 << i98);
                            } else {
                                i29 = i96;
                            }
                            int i99 = (charAt26 / 32) + (i26 * 2);
                            Object obj3 = objArr3[i99];
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr3[i99] = F;
                            }
                            i28 = (int) unsafe.objectFieldOffset(F);
                            i30 = charAt26 % 32;
                        }
                        if (i82 >= 18 || i82 > 49) {
                            i31 = i27;
                            i32 = objectFieldOffset;
                        } else {
                            iArr[i71] = objectFieldOffset;
                            i31 = i27;
                            i32 = objectFieldOffset;
                            i71++;
                        }
                    } else {
                        i26 = i12;
                    }
                    i27 = i33;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i28 = 1048575;
                    i29 = i79;
                    i30 = 0;
                    if (i82 >= 18) {
                    }
                    i31 = i27;
                    i32 = objectFieldOffset;
                }
                cls = cls2;
                i27 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                i28 = 1048575;
                i29 = i79;
                i30 = 0;
                if (i82 >= 18) {
                }
                i31 = i27;
                i32 = objectFieldOffset;
            }
            int i100 = i74 + 1;
            iArr4[i74] = i83;
            int i101 = i74 + 2;
            String str2 = str;
            iArr4[i100] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i32;
            i74 += 3;
            iArr4[i101] = (i30 << 20) | i28;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i24;
            i12 = i26;
            i41 = i29;
            i39 = 55296;
            i14 = i31;
            iArr3 = iArr4;
        }
        return new p0(iArr3, objArr2, i10, i13, w0Var.f1725a, iArr, i15, i70, r0Var, e0Var, f1Var, rVar, l0Var);
    }

    public static long x(int i5) {
        return i5 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) k1.f1644c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) k1.f1644c.h(j, obj)).longValue();
    }

    public final int A(int i5) {
        if (i5 >= this.f1673c && i5 <= this.f1674d) {
            int[] iArr = this.f1671a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
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
        }
        return -1;
    }

    public final void B(Object obj, long j, m mVar, x0 x0Var, q qVar) {
        int u10;
        this.f1680k.getClass();
        z a7 = e0.a(j, obj);
        l lVar = (l) mVar.f1656e;
        int i5 = mVar.f1653b;
        if ((i5 & 7) != 3) {
            throw c0.b();
        }
        do {
            y d10 = x0Var.d();
            mVar.c(d10, x0Var, qVar);
            x0Var.b(d10);
            ((v0) a7).add(d10);
            if (lVar.c() || mVar.f1655d != 0) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == i5);
        mVar.f1655d = u10;
    }

    public final void C(Object obj, int i5, m mVar, x0 x0Var, q qVar) {
        int u10;
        this.f1680k.getClass();
        z a7 = e0.a(i5 & 1048575, obj);
        l lVar = (l) mVar.f1656e;
        int i10 = mVar.f1653b;
        if ((i10 & 7) != 2) {
            throw c0.b();
        }
        do {
            y d10 = x0Var.d();
            mVar.e(d10, x0Var, qVar);
            x0Var.b(d10);
            ((v0) a7).add(d10);
            if (lVar.c() || mVar.f1655d != 0) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == i10);
        mVar.f1655d = u10;
    }

    public final void D(int i5, m mVar, Object obj) {
        if ((536870912 & i5) != 0) {
            mVar.R(2);
            k1.o(i5 & 1048575, obj, ((l) mVar.f1656e).t());
        } else if (!this.f1676f) {
            k1.o(i5 & 1048575, obj, mVar.i());
        } else {
            mVar.R(2);
            k1.o(i5 & 1048575, obj, ((l) mVar.f1656e).s());
        }
    }

    public final void E(int i5, m mVar, Object obj) {
        int i10 = 536870912 & i5;
        e0 e0Var = this.f1680k;
        if (i10 != 0) {
            e0Var.getClass();
            mVar.K(e0.a(i5 & 1048575, obj), true);
        } else {
            e0Var.getClass();
            mVar.K(e0.a(i5 & 1048575, obj), false);
        }
    }

    public final void G(int i5, Object obj) {
        int i10 = this.f1671a[i5 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        k1.m((1 << (i10 >>> 20)) | k1.f1644c.f(j, obj), j, obj);
    }

    public final void H(int i5, int i10, Object obj) {
        k1.m(i5, this.f1671a[i10 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i5, a aVar) {
        f1670o.putObject(obj, L(i5) & 1048575, aVar);
        G(i5, obj);
    }

    public final void J(Object obj, int i5, int i10, a aVar) {
        f1670o.putObject(obj, L(i10) & 1048575, aVar);
        H(i5, i10, obj);
    }

    public final int L(int i5) {
        return this.f1671a[i5 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, h0 h0Var) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z5;
        p0 p0Var = this;
        int[] iArr = p0Var.f1671a;
        int length = iArr.length;
        Unsafe unsafe = f1670o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int L = p0Var.L(i15);
            int i17 = iArr[i15];
            int K = K(L);
            if (K <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i5 = L;
                i10 = 1 << (i18 >>> 20);
            } else {
                i5 = L;
                i10 = 0;
            }
            long j = i5 & i13;
            switch (K) {
                case 0:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        double d10 = k1.f1644c.d(j, obj);
                        o oVar = (o) h0Var.f1616a;
                        oVar.getClass();
                        oVar.q0(i17, Double.doubleToRawLongBits(d10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        float e7 = k1.f1644c.e(j, obj);
                        o oVar2 = (o) h0Var.f1616a;
                        oVar2.getClass();
                        oVar2.o0(i17, Float.floatToRawIntBits(e7));
                    }
                    p0Var = this;
                    break;
                case 2:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).A0(i17, unsafe.getLong(obj, j));
                    }
                    p0Var = this;
                    break;
                case 3:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).A0(i17, unsafe.getLong(obj, j));
                    }
                    p0Var = this;
                    break;
                case 4:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).s0(i17, unsafe.getInt(obj, j));
                    }
                    p0Var = this;
                    break;
                case 5:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).q0(i17, unsafe.getLong(obj, j));
                    }
                    p0Var = this;
                    break;
                case 6:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).o0(i17, unsafe.getInt(obj, j));
                    }
                    p0Var = this;
                    break;
                case 7:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).l0(i17, k1.f1644c.c(j, obj));
                    }
                    p0Var = this;
                    break;
                case 8:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((o) h0Var.f1616a).v0(i17, (String) object);
                        } else {
                            ((o) h0Var.f1616a).m0(i17, (i) object);
                        }
                    }
                    p0Var = this;
                    break;
                case 9:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).u0(i17, (a) unsafe.getObject(obj, j), p0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).m0(i17, (i) unsafe.getObject(obj, j));
                    }
                    p0Var = this;
                    break;
                case 11:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).y0(i17, unsafe.getInt(obj, j));
                    }
                    p0Var = this;
                    break;
                case 12:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).s0(i17, unsafe.getInt(obj, j));
                    }
                    p0Var = this;
                    break;
                case 13:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).o0(i17, unsafe.getInt(obj, j));
                    }
                    p0Var = this;
                    break;
                case 14:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        ((o) h0Var.f1616a).q0(i17, unsafe.getLong(obj, j));
                    }
                    p0Var = this;
                    break;
                case 15:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        int i20 = unsafe.getInt(obj, j);
                        ((o) h0Var.f1616a).y0(i17, (i20 >> 31) ^ (i20 << 1));
                    }
                    p0Var = this;
                    break;
                case 16:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        long j6 = unsafe.getLong(obj, j);
                        ((o) h0Var.f1616a).A0(i17, (j6 >> 63) ^ (j6 << 1));
                    }
                    p0Var = this;
                    break;
                case 17:
                    if (p0Var.o(obj, i15, i14, i16, i10)) {
                        h0Var.a(i17, unsafe.getObject(obj, j), p0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i11 = i14;
                    y0.n(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 19:
                    i11 = i14;
                    y0.r(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 20:
                    i11 = i14;
                    y0.t(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 21:
                    i11 = i14;
                    y0.z(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    i11 = i14;
                    y0.s(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    i11 = i14;
                    y0.q(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    i11 = i14;
                    y0.p(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case C0122e9.F /* 25 */:
                    i11 = i14;
                    y0.m(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case C0122e9.G /* 26 */:
                    i12 = i14;
                    int i21 = iArr[i15];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = y0.f1729a;
                    if (list != null && !list.isEmpty()) {
                        h0Var.getClass();
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            ((o) h0Var.f1616a).v0(i21, (String) list.get(i22));
                        }
                    }
                    i14 = i12;
                    break;
                case C0122e9.H /* 27 */:
                    i12 = i14;
                    int i23 = iArr[i15];
                    List list2 = (List) unsafe.getObject(obj, j);
                    x0 m6 = p0Var.m(i15);
                    Class cls2 = y0.f1729a;
                    if (list2 != null && !list2.isEmpty()) {
                        h0Var.getClass();
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((o) h0Var.f1616a).u0(i23, (a) list2.get(i24), m6);
                        }
                    }
                    i14 = i12;
                    break;
                case 28:
                    i12 = i14;
                    int i25 = iArr[i15];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = y0.f1729a;
                    if (list3 != null && !list3.isEmpty()) {
                        h0Var.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            ((o) h0Var.f1616a).m0(i25, (i) list3.get(i26));
                        }
                    }
                    i14 = i12;
                    break;
                case C0122e9.I /* 29 */:
                    i11 = i14;
                    z5 = false;
                    y0.y(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 30:
                    i11 = i14;
                    z5 = false;
                    y0.o(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 31:
                    i11 = i14;
                    z5 = false;
                    y0.u(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 32:
                    i11 = i14;
                    z5 = false;
                    y0.v(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 33:
                    i11 = i14;
                    z5 = false;
                    y0.w(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case 34:
                    i11 = i14;
                    z5 = false;
                    y0.x(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, false);
                    i14 = i11;
                    break;
                case C0122e9.J /* 35 */:
                    i12 = i14;
                    y0.n(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 36:
                    i12 = i14;
                    y0.r(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 37:
                    i12 = i14;
                    y0.t(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case C0122e9.K /* 38 */:
                    i12 = i14;
                    y0.z(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 39:
                    i12 = i14;
                    y0.s(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 40:
                    i12 = i14;
                    y0.q(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i12 = i14;
                    y0.p(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case C0122e9.M /* 42 */:
                    i12 = i14;
                    y0.m(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 43:
                    i12 = i14;
                    y0.y(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 44:
                    i12 = i14;
                    y0.o(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 45:
                    i12 = i14;
                    y0.u(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 46:
                    i12 = i14;
                    y0.v(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 47:
                    i12 = i14;
                    y0.w(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case 48:
                    i12 = i14;
                    y0.x(iArr[i15], (List) unsafe.getObject(obj, j), h0Var, true);
                    i14 = i12;
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    i12 = i14;
                    int i27 = iArr[i15];
                    List list4 = (List) unsafe.getObject(obj, j);
                    x0 m10 = p0Var.m(i15);
                    Class cls4 = y0.f1729a;
                    if (list4 != null && !list4.isEmpty()) {
                        h0Var.getClass();
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            h0Var.a(i27, list4.get(i28), m10);
                        }
                    }
                    i14 = i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i29 = 2;
                        Object obj2 = p0Var.f1672b[(i15 / 3) * 2];
                        p0Var.f1682m.getClass();
                        i0 i0Var = ((j0) obj2).f1631a;
                        o oVar3 = (o) h0Var.f1616a;
                        oVar3.getClass();
                        for (Map.Entry entry : ((k0) object2).entrySet()) {
                            oVar3.x0(i17, i29);
                            oVar3.z0(j0.a(i0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            t.b(oVar3, i0Var.f1621a, 1, key);
                            i29 = 2;
                            t.b(oVar3, i0Var.f1622b, 2, value);
                            i14 = i14;
                        }
                    }
                    i12 = i14;
                    i14 = i12;
                    break;
                case 51:
                    if (p0Var.q(i17, i15, obj)) {
                        double doubleValue = ((Double) k1.f1644c.h(j, obj)).doubleValue();
                        o oVar4 = (o) h0Var.f1616a;
                        oVar4.getClass();
                        oVar4.q0(i17, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (p0Var.q(i17, i15, obj)) {
                        float floatValue = ((Float) k1.f1644c.h(j, obj)).floatValue();
                        o oVar5 = (o) h0Var.f1616a;
                        oVar5.getClass();
                        oVar5.o0(i17, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).A0(i17, z(j, obj));
                    }
                    break;
                case 54:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).A0(i17, z(j, obj));
                    }
                    break;
                case 55:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).s0(i17, y(j, obj));
                    }
                    break;
                case 56:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).q0(i17, z(j, obj));
                    }
                    break;
                case 57:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).o0(i17, y(j, obj));
                    }
                    break;
                case 58:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).l0(i17, ((Boolean) k1.f1644c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (p0Var.q(i17, i15, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((o) h0Var.f1616a).v0(i17, (String) object3);
                        } else {
                            ((o) h0Var.f1616a).m0(i17, (i) object3);
                        }
                    }
                    break;
                case 60:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).u0(i17, (a) unsafe.getObject(obj, j), p0Var.m(i15));
                    }
                    break;
                case 61:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).m0(i17, (i) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).y0(i17, y(j, obj));
                    }
                    break;
                case 63:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).s0(i17, y(j, obj));
                    }
                    break;
                case 64:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).o0(i17, y(j, obj));
                    }
                    break;
                case 65:
                    if (p0Var.q(i17, i15, obj)) {
                        ((o) h0Var.f1616a).q0(i17, z(j, obj));
                    }
                    break;
                case 66:
                    if (p0Var.q(i17, i15, obj)) {
                        int y5 = y(j, obj);
                        ((o) h0Var.f1616a).y0(i17, (y5 >> 31) ^ (y5 << 1));
                    }
                    break;
                case 67:
                    if (p0Var.q(i17, i15, obj)) {
                        long z7 = z(j, obj);
                        ((o) h0Var.f1616a).A0(i17, (z7 << 1) ^ (z7 >> 63));
                    }
                    break;
                case 68:
                    if (p0Var.q(i17, i15, obj)) {
                        h0Var.a(i17, unsafe.getObject(obj, j), p0Var.m(i15));
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        p0Var.f1681l.getClass();
        ((y) obj).unknownFields.d(h0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f1671a;
            if (i5 >= iArr.length) {
                y0.k(this.f1681l, obj, obj2);
                return;
            }
            int L = L(i5);
            long j = 1048575 & L;
            int i10 = iArr[i5];
            switch (K(L)) {
                case 0:
                    if (n(i5, obj2)) {
                        j1 j1Var = k1.f1644c;
                        obj3 = obj;
                        j1Var.l(obj3, j, j1Var.d(j, obj2));
                        G(i5, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i5, obj2)) {
                        j1 j1Var2 = k1.f1644c;
                        j1Var2.m(obj, j, j1Var2.e(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i5, obj2)) {
                        k1.n(obj, j, k1.f1644c.g(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i5, obj2)) {
                        k1.n(obj, j, k1.f1644c.g(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i5, obj2)) {
                        k1.n(obj, j, k1.f1644c.g(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i5, obj2)) {
                        j1 j1Var3 = k1.f1644c;
                        j1Var3.j(obj, j, j1Var3.c(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i5, obj2)) {
                        k1.o(j, obj, k1.f1644c.h(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i5, obj2)) {
                        k1.o(j, obj, k1.f1644c.h(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i5, obj2)) {
                        k1.n(obj, j, k1.f1644c.g(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i5, obj2)) {
                        k1.m(k1.f1644c.f(j, obj2), j, obj);
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i5, obj2)) {
                        k1.n(obj, j, k1.f1644c.g(j, obj2));
                        G(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i5, obj, obj2);
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
                    this.f1680k.getClass();
                    j1 j1Var4 = k1.f1644c;
                    z zVar = (z) j1Var4.h(j, obj);
                    z zVar2 = (z) j1Var4.h(j, obj2);
                    v0 v0Var = (v0) zVar;
                    int i11 = v0Var.f1722c;
                    int i12 = ((v0) zVar2).f1722c;
                    if (i11 > 0 && i12 > 0) {
                        if (!((b) zVar).f1577a) {
                            zVar = v0Var.c(i12 + i11);
                        }
                        ((b) zVar).addAll(zVar2);
                    }
                    if (i11 > 0) {
                        zVar2 = zVar;
                    }
                    k1.o(j, obj, zVar2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = y0.f1729a;
                    j1 j1Var5 = k1.f1644c;
                    Object h10 = j1Var5.h(j, obj);
                    Object h11 = j1Var5.h(j, obj2);
                    this.f1682m.getClass();
                    k1.o(j, obj, l0.a(h10, h11));
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
                    if (q(i10, i5, obj2)) {
                        k1.o(j, obj, k1.f1644c.h(j, obj2));
                        H(i10, i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i10, i5, obj2)) {
                        k1.o(j, obj, k1.f1644c.h(j, obj2));
                        H(i10, i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i5, obj, obj2);
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

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                yVar.k(Integer.MAX_VALUE);
                yVar.memoizedHashCode = 0;
                yVar.h();
            }
            int[] iArr = this.f1671a;
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int L = L(i5);
                long j = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
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
                                this.f1680k.getClass();
                                b bVar = (b) ((z) k1.f1644c.h(j, obj));
                                if (bVar.f1577a) {
                                    bVar.f1577a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f1670o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f1682m.getClass();
                                    ((k0) object).f1641a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i5], i5, obj)) {
                        m(i5).b(f1670o.getObject(obj, j));
                    }
                }
                if (n(i5, obj)) {
                    m(i5).b(f1670o.getObject(obj, j));
                }
            }
            this.f1681l.getClass();
            e1 e1Var = ((y) obj).unknownFields;
            if (e1Var.f1608e) {
                e1Var.f1608e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(Object obj) {
        int i5;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f1678h) {
            int i15 = this.f1677g[i14];
            int[] iArr = this.f1671a;
            int i16 = iArr[i15];
            int L = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f1670o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i5 = i18;
            } else {
                int i20 = i13;
                i5 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & L) == 0 || o(obj, i10, i5, i11, i19)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i10, i5, i11, i19)) {
                        if (!m(i10).c(k1.f1644c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i5;
                    i13 = i11;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).c(k1.f1644c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i5;
                            i13 = i11;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h10 = k1.f1644c.h(L & 1048575, obj);
                                this.f1682m.getClass();
                                k0 k0Var = (k0) h10;
                                if (k0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((j0) this.f1672b[(i10 / 3) * 2]).f1631a.f1622b.f1696a != t1.f1709i) {
                                        continue;
                                    } else {
                                        x0 x0Var = null;
                                        for (Object obj2 : k0Var.values()) {
                                            if (x0Var == null) {
                                                x0Var = u0.f1715c.a(obj2.getClass());
                                            }
                                            if (!x0Var.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i5;
                            i13 = i11;
                        }
                    }
                    List list = (List) k1.f1644c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x0 m6 = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (m6.c(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i5;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final y d() {
        this.j.getClass();
        return ((y) this.f1675e).i();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void e(Object obj, h0 h0Var) {
        h0Var.getClass();
        M(obj, h0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int f(y yVar) {
        int i5;
        int e0;
        int e02;
        int e03;
        int g02;
        int e04;
        int g03;
        int e05;
        int e06;
        int c02;
        int e07;
        int a7;
        int c2;
        int e08;
        int size;
        int i10;
        int e09;
        int e010;
        int size2;
        int e011;
        int f02;
        int i11;
        int i12;
        int e012;
        int f03;
        p0 p0Var = this;
        y yVar2 = yVar;
        Unsafe unsafe = f1670o;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = p0Var.f1671a;
            if (i14 >= iArr.length) {
                p0Var.f1681l.getClass();
                return yVar2.unknownFields.b() + i16;
            }
            int L = p0Var.L(i14);
            int K = K(L);
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & 1048575;
            if (K <= 17) {
                if (i19 != i13) {
                    i15 = i19 == 1048575 ? 0 : unsafe.getInt(yVar2, i19);
                    i13 = i19;
                }
                i5 = 1 << (i18 >>> 20);
            } else {
                i5 = 0;
            }
            long j = L & 1048575;
            if (K >= u.f1710b.f1714a) {
                int i20 = u.f1711c.f1714a;
            }
            switch (K) {
                case 0:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e0 = o.e0(i17);
                        c2 = e0 + 8;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e02 = o.e0(i17);
                        e06 = e02 + 4;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 2:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        long j6 = unsafe.getLong(yVar2, j);
                        e03 = o.e0(i17);
                        g02 = o.g0(j6);
                        i16 += g02 + e03;
                    }
                    p0Var = this;
                    break;
                case 3:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        long j10 = unsafe.getLong(yVar2, j);
                        e03 = o.e0(i17);
                        g02 = o.g0(j10);
                        i16 += g02 + e03;
                    }
                    p0Var = this;
                    break;
                case 4:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        int i21 = unsafe.getInt(yVar2, j);
                        e04 = o.e0(i17);
                        g03 = o.g0(i21);
                        c02 = g03 + e04;
                        i16 += c02;
                    }
                    p0Var = this;
                    break;
                case 5:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e05 = o.e0(i17);
                        e06 = e05 + 8;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 6:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e02 = o.e0(i17);
                        e06 = e02 + 4;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 7:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e06 = o.e0(i17) + 1;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 8:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        Object object = unsafe.getObject(yVar2, j);
                        i16 = (object instanceof i ? o.c0(i17, (i) object) : o.d0((String) object) + o.e0(i17)) + i16;
                    }
                    p0Var = this;
                    break;
                case 9:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        Object object2 = unsafe.getObject(yVar2, j);
                        x0 m6 = p0Var.m(i14);
                        Class cls = y0.f1729a;
                        int e013 = o.e0(i17);
                        int a10 = ((a) object2).a(m6);
                        i16 += o.f0(a10) + a10 + e013;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        c02 = o.c0(i17, (i) unsafe.getObject(yVar2, j));
                        i16 += c02;
                    }
                    p0Var = this;
                    break;
                case 11:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        int i22 = unsafe.getInt(yVar2, j);
                        e04 = o.e0(i17);
                        g03 = o.f0(i22);
                        c02 = g03 + e04;
                        i16 += c02;
                    }
                    p0Var = this;
                    break;
                case 12:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        int i23 = unsafe.getInt(yVar2, j);
                        e04 = o.e0(i17);
                        g03 = o.g0(i23);
                        c02 = g03 + e04;
                        i16 += c02;
                    }
                    p0Var = this;
                    break;
                case 13:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e02 = o.e0(i17);
                        e06 = e02 + 4;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 14:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        e05 = o.e0(i17);
                        e06 = e05 + 8;
                        i16 += e06;
                    }
                    p0Var = this;
                    yVar2 = yVar;
                    break;
                case 15:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        int i24 = unsafe.getInt(yVar2, j);
                        e04 = o.e0(i17);
                        g03 = o.f0((i24 >> 31) ^ (i24 << 1));
                        c02 = g03 + e04;
                        i16 += c02;
                    }
                    p0Var = this;
                    break;
                case 16:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        long j11 = unsafe.getLong(yVar2, j);
                        e03 = o.e0(i17);
                        g02 = o.g0((j11 << 1) ^ (j11 >> 63));
                        i16 += g02 + e03;
                    }
                    p0Var = this;
                    break;
                case 17:
                    if (p0Var.o(yVar2, i14, i13, i15, i5)) {
                        a aVar = (a) unsafe.getObject(yVar2, j);
                        x0 m10 = p0Var.m(i14);
                        e07 = o.e0(i17) * 2;
                        a7 = aVar.a(m10);
                        c2 = a7 + e07;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c2 = y0.c(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case 19:
                    c2 = y0.b(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(yVar2, j);
                    Class cls2 = y0.f1729a;
                    if (list.size() != 0) {
                        e08 = (o.e0(i17) * list.size()) + y0.e(list);
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case 21:
                    List list2 = (List) unsafe.getObject(yVar2, j);
                    Class cls3 = y0.f1729a;
                    size = list2.size();
                    if (size != 0) {
                        i10 = y0.i(list2);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(yVar2, j);
                    Class cls4 = y0.f1729a;
                    size = list3.size();
                    if (size != 0) {
                        i10 = y0.d(list3);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                    c2 = y0.c(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    c2 = y0.b(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case C0122e9.F /* 25 */:
                    List list4 = (List) unsafe.getObject(yVar2, j);
                    Class cls5 = y0.f1729a;
                    int size3 = list4.size();
                    i16 += size3 == 0 ? 0 : (o.e0(i17) + 1) * size3;
                    break;
                case C0122e9.G /* 26 */:
                    List list5 = (List) unsafe.getObject(yVar2, j);
                    Class cls6 = y0.f1729a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        e08 = o.e0(i17) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj = list5.get(i25);
                            if (obj instanceof i) {
                                int size5 = ((i) obj).size();
                                e08 = o.f0(size5) + size5 + e08;
                            } else {
                                e08 = o.d0((String) obj) + e08;
                            }
                        }
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case C0122e9.H /* 27 */:
                    List list6 = (List) unsafe.getObject(yVar2, j);
                    x0 m11 = p0Var.m(i14);
                    Class cls7 = y0.f1729a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        e010 = o.e0(i17) * size6;
                        for (int i26 = 0; i26 < size6; i26++) {
                            int a11 = ((a) list6.get(i26)).a(m11);
                            e010 += o.f0(a11) + a11;
                        }
                        i16 += e010;
                        break;
                    }
                    e010 = 0;
                    i16 += e010;
                case 28:
                    List list7 = (List) unsafe.getObject(yVar2, j);
                    Class cls8 = y0.f1729a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        e08 = o.e0(i17) * size7;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int size8 = ((i) list7.get(i27)).size();
                            e08 += o.f0(size8) + size8;
                        }
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case C0122e9.I /* 29 */:
                    List list8 = (List) unsafe.getObject(yVar2, j);
                    Class cls9 = y0.f1729a;
                    size = list8.size();
                    if (size != 0) {
                        i10 = y0.h(list8);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case 30:
                    List list9 = (List) unsafe.getObject(yVar2, j);
                    Class cls10 = y0.f1729a;
                    size = list9.size();
                    if (size != 0) {
                        i10 = y0.a(list9);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case 31:
                    c2 = y0.b(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case 32:
                    c2 = y0.c(i17, (List) unsafe.getObject(yVar2, j));
                    i16 += c2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(yVar2, j);
                    Class cls11 = y0.f1729a;
                    size = list10.size();
                    if (size != 0) {
                        i10 = y0.f(list10);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case 34:
                    List list11 = (List) unsafe.getObject(yVar2, j);
                    Class cls12 = y0.f1729a;
                    size = list11.size();
                    if (size != 0) {
                        i10 = y0.g(list11);
                        e09 = o.e0(i17);
                        e08 = (e09 * size) + i10;
                        i16 += e08;
                        break;
                    }
                    e08 = 0;
                    i16 += e08;
                case C0122e9.J /* 35 */:
                    List list12 = (List) unsafe.getObject(yVar2, j);
                    Class cls13 = y0.f1729a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(yVar2, j);
                    Class cls14 = y0.f1729a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = y0.e((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case C0122e9.K /* 38 */:
                    size2 = y0.i((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = y0.d((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(yVar2, j);
                    Class cls15 = y0.f1729a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(yVar2, j);
                    Class cls16 = y0.f1729a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case C0122e9.M /* 42 */:
                    List list16 = (List) unsafe.getObject(yVar2, j);
                    Class cls17 = y0.f1729a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = y0.h((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = y0.a((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(yVar2, j);
                    Class cls18 = y0.f1729a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(yVar2, j);
                    Class cls19 = y0.f1729a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = y0.f((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = y0.g((List) unsafe.getObject(yVar2, j));
                    if (size2 > 0) {
                        e011 = o.e0(i17);
                        f02 = o.f0(size2);
                        i11 = f02 + e011;
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list19 = (List) unsafe.getObject(yVar2, j);
                    x0 m12 = p0Var.m(i14);
                    Class cls20 = y0.f1729a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i28 = 0; i28 < size9; i28++) {
                            i12 += ((a) list19.get(i28)).a(m12) + (o.e0(i17) * 2);
                        }
                    }
                    i16 += i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(yVar2, j);
                    Object obj2 = p0Var.f1672b[(i14 / 3) * 2];
                    p0Var.f1682m.getClass();
                    k0 k0Var = (k0) object3;
                    j0 j0Var = (j0) obj2;
                    if (!k0Var.isEmpty()) {
                        e010 = 0;
                        for (Map.Entry entry : k0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            j0Var.getClass();
                            int e014 = o.e0(i17);
                            int a12 = j0.a(j0Var.f1631a, key, value);
                            e010 += o.f0(a12) + a12 + e014;
                        }
                        i16 += e010;
                        break;
                    }
                    e010 = 0;
                    i16 += e010;
                case 51:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e0 = o.e0(i17);
                        c2 = e0 + 8;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e012 = o.e0(i17);
                        c2 = e012 + 4;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (p0Var.q(i17, i14, yVar2)) {
                        long z5 = z(j, yVar2);
                        size2 = o.e0(i17);
                        i11 = o.g0(z5);
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p0Var.q(i17, i14, yVar2)) {
                        long z7 = z(j, yVar2);
                        size2 = o.e0(i17);
                        i11 = o.g0(z7);
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p0Var.q(i17, i14, yVar2)) {
                        int y5 = y(j, yVar2);
                        e07 = o.e0(i17);
                        a7 = o.g0(y5);
                        c2 = a7 + e07;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e0 = o.e0(i17);
                        c2 = e0 + 8;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e012 = o.e0(i17);
                        c2 = e012 + 4;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p0Var.q(i17, i14, yVar2)) {
                        c2 = o.e0(i17) + 1;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p0Var.q(i17, i14, yVar2)) {
                        Object object4 = unsafe.getObject(yVar2, j);
                        i16 = (object4 instanceof i ? o.c0(i17, (i) object4) : o.d0((String) object4) + o.e0(i17)) + i16;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (p0Var.q(i17, i14, yVar2)) {
                        Object object5 = unsafe.getObject(yVar2, j);
                        x0 m13 = p0Var.m(i14);
                        Class cls21 = y0.f1729a;
                        int e015 = o.e0(i17);
                        int a13 = ((a) object5).a(m13);
                        f03 = o.f0(a13) + a13 + e015;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p0Var.q(i17, i14, yVar2)) {
                        c2 = o.c0(i17, (i) unsafe.getObject(yVar2, j));
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p0Var.q(i17, i14, yVar2)) {
                        int y10 = y(j, yVar2);
                        e07 = o.e0(i17);
                        a7 = o.f0(y10);
                        c2 = a7 + e07;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p0Var.q(i17, i14, yVar2)) {
                        int y11 = y(j, yVar2);
                        e07 = o.e0(i17);
                        a7 = o.g0(y11);
                        c2 = a7 + e07;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e012 = o.e0(i17);
                        c2 = e012 + 4;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p0Var.q(i17, i14, yVar2)) {
                        e0 = o.e0(i17);
                        c2 = e0 + 8;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p0Var.q(i17, i14, yVar2)) {
                        int y12 = y(j, yVar2);
                        e07 = o.e0(i17);
                        a7 = o.f0((y12 >> 31) ^ (y12 << 1));
                        c2 = a7 + e07;
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p0Var.q(i17, i14, yVar2)) {
                        long z10 = z(j, yVar2);
                        size2 = o.e0(i17);
                        i11 = o.g0((z10 << 1) ^ (z10 >> 63));
                        f03 = i11 + size2;
                        i16 += f03;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p0Var.q(i17, i14, yVar2)) {
                        c2 = ((a) unsafe.getObject(yVar2, j)).a(p0Var.m(i14)) + (o.e0(i17) * 2);
                        i16 += c2;
                        break;
                    } else {
                        break;
                    }
            }
            i14 += 3;
        }
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
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(y yVar) {
        int i5;
        int b10;
        int i10;
        int[] iArr = this.f1671a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int L = L(i12);
            int i13 = iArr[i12];
            long j = 1048575 & L;
            int i14 = 1237;
            int i15 = 37;
            switch (K(L)) {
                case 0:
                    i5 = i11 * 53;
                    b10 = a0.b(Double.doubleToLongBits(k1.f1644c.d(j, yVar)));
                    i11 = b10 + i5;
                    break;
                case 1:
                    i5 = i11 * 53;
                    b10 = Float.floatToIntBits(k1.f1644c.e(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 2:
                    i5 = i11 * 53;
                    b10 = a0.b(k1.f1644c.g(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 3:
                    i5 = i11 * 53;
                    b10 = a0.b(k1.f1644c.g(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 4:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 5:
                    i5 = i11 * 53;
                    b10 = a0.b(k1.f1644c.g(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 6:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c2 = k1.f1644c.c(j, yVar);
                    Charset charset = a0.f1572a;
                    break;
                case 8:
                    i5 = i11 * 53;
                    b10 = ((String) k1.f1644c.h(j, yVar)).hashCode();
                    i11 = b10 + i5;
                    break;
                case 9:
                    Object h10 = k1.f1644c.h(j, yVar);
                    if (h10 != null) {
                        i15 = h10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.h(j, yVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case 11:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 12:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 13:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 14:
                    i5 = i11 * 53;
                    b10 = a0.b(k1.f1644c.g(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 15:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.f(j, yVar);
                    i11 = b10 + i5;
                    break;
                case 16:
                    i5 = i11 * 53;
                    b10 = a0.b(k1.f1644c.g(j, yVar));
                    i11 = b10 + i5;
                    break;
                case 17:
                    Object h11 = k1.f1644c.h(j, yVar);
                    if (h11 != null) {
                        i15 = h11.hashCode();
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
                    b10 = k1.f1644c.h(j, yVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i5 = i11 * 53;
                    b10 = k1.f1644c.h(j, yVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case 51:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(Double.doubleToLongBits(((Double) k1.f1644c.h(j, yVar)).doubleValue()));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = Float.floatToIntBits(((Float) k1.f1644c.h(j, yVar)).floatValue());
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(z(j, yVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(z(j, yVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(z(j, yVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i13, i12, yVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) k1.f1644c.h(j, yVar)).booleanValue();
                        Charset charset2 = a0.f1572a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = ((String) k1.f1644c.h(j, yVar)).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = k1.f1644c.h(j, yVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = k1.f1644c.h(j, yVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(z(j, yVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = y(j, yVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = a0.b(z(j, yVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i13, i12, yVar)) {
                        i5 = i11 * 53;
                        b10 = k1.f1644c.h(j, yVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f1681l.getClass();
        return yVar.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(y yVar, y yVar2) {
        int[] iArr = this.f1671a;
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 < length) {
                int L = L(i5);
                long j = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 1:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var2 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 2:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var3 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 3:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var4 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 4:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var5 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 5:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var6 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 6:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var7 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 7:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var8 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 8:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var9 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 9:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var10 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 10:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var11 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 11:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var12 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 12:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var13 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 13:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var14 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 14:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var15 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 15:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var16 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 16:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var17 = k1.f1644c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 17:
                        if (j(yVar, yVar2, i5)) {
                            j1 j1Var18 = k1.f1644c;
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
                        j1 j1Var19 = k1.f1644c;
                        z5 = y0.l(j1Var19.h(j, yVar), j1Var19.h(j, yVar2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        j1 j1Var20 = k1.f1644c;
                        z5 = y0.l(j1Var20.h(j, yVar), j1Var20.h(j, yVar2));
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
                        j1 j1Var21 = k1.f1644c;
                        if (j1Var21.f(j6, yVar) == j1Var21.f(j6, yVar2)) {
                            break;
                        }
                        z5 = false;
                        break;
                }
                if (z5) {
                    i5 += 3;
                }
            } else {
                this.f1681l.getClass();
                if (yVar.unknownFields.equals(yVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void i(java.lang.Object r19, androidx.datastore.preferences.protobuf.m r20, androidx.datastore.preferences.protobuf.q r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.i(java.lang.Object, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.q):void");
    }

    public final boolean j(y yVar, y yVar2, int i5) {
        return n(i5, yVar) == n(i5, yVar2);
    }

    public final void k(int i5, Object obj, Object obj2) {
        int i10 = this.f1671a[i5];
        if (k1.f1644c.h(L(i5) & 1048575, obj) == null) {
            return;
        }
        l(i5);
    }

    public final void l(int i5) {
        if (this.f1672b[((i5 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final x0 m(int i5) {
        int i10 = (i5 / 3) * 2;
        Object[] objArr = this.f1672b;
        x0 x0Var = (x0) objArr[i10];
        if (x0Var != null) {
            return x0Var;
        }
        x0 a7 = u0.f1715c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a7;
        return a7;
    }

    public final boolean n(int i5, Object obj) {
        int i10 = this.f1671a[i5 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int L = L(i5);
            long j6 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(k1.f1644c.d(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(k1.f1644c.e(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (k1.f1644c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (k1.f1644c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (k1.f1644c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return k1.f1644c.c(j6, obj);
                case 8:
                    Object h10 = k1.f1644c.h(j6, obj);
                    if (h10 instanceof String) {
                        return !((String) h10).isEmpty();
                    }
                    if (h10 instanceof i) {
                        return !i.f1618b.equals(h10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (k1.f1644c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.f1618b.equals(k1.f1644c.h(j6, obj));
                case 11:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (k1.f1644c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (k1.f1644c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (k1.f1644c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (k1.f1644c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & k1.f1644c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i5, obj) : (i11 & i12) != 0;
    }

    public final boolean q(int i5, int i10, Object obj) {
        return k1.f1644c.f((long) (this.f1671a[i10 + 2] & 1048575), obj) == i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i5, Object obj2, q qVar, m mVar) {
        long L = L(i5) & 1048575;
        Object h10 = k1.f1644c.h(L, obj);
        l0 l0Var = this.f1682m;
        if (h10 == null) {
            l0Var.getClass();
            h10 = k0.f1640b.d();
            k1.o(L, obj, h10);
        } else {
            l0Var.getClass();
            if (!((k0) h10).f1641a) {
                k0 d10 = k0.f1640b.d();
                l0.a(d10, h10);
                k1.o(L, obj, d10);
                h10 = d10;
            }
        }
        l0Var.getClass();
        k0 k0Var = (k0) h10;
        i0 i0Var = ((j0) obj2).f1631a;
        mVar.R(2);
        l lVar = (l) mVar.f1656e;
        int e7 = lVar.e(lVar.v());
        Object obj3 = i0Var.f1623c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a7 = mVar.a();
                if (a7 == Integer.MAX_VALUE || lVar.c()) {
                    break;
                }
                if (a7 == 1) {
                    obj4 = mVar.q(i0Var.f1621a, null, null);
                } else if (a7 != 2) {
                    try {
                        if (!mVar.S()) {
                            throw new c0("Unable to parse map entry.");
                        }
                    } catch (b0 unused) {
                        if (!mVar.S()) {
                            throw new c0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = mVar.q(i0Var.f1622b, obj3.getClass(), qVar);
                }
            } catch (Throwable th2) {
                lVar.d(e7);
                throw th2;
            }
        }
    }

    public final void s(int i5, Object obj, Object obj2) {
        if (n(i5, obj2)) {
            long L = L(i5) & 1048575;
            Unsafe unsafe = f1670o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1671a[i5] + " is present but null: " + obj2);
            }
            x0 m6 = m(i5);
            if (!n(i5, obj)) {
                if (p(object)) {
                    y d10 = m6.d();
                    m6.a(d10, object);
                    unsafe.putObject(obj, L, d10);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                y d11 = m6.d();
                m6.a(d11, object2);
                unsafe.putObject(obj, L, d11);
                object2 = d11;
            }
            m6.a(object2, object);
        }
    }

    public final void t(int i5, Object obj, Object obj2) {
        int[] iArr = this.f1671a;
        int i10 = iArr[i5];
        if (q(i10, i5, obj2)) {
            long L = L(i5) & 1048575;
            Unsafe unsafe = f1670o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2);
            }
            x0 m6 = m(i5);
            if (!q(i10, i5, obj)) {
                if (p(object)) {
                    y d10 = m6.d();
                    m6.a(d10, object);
                    unsafe.putObject(obj, L, d10);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i10, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                y d11 = m6.d();
                m6.a(d11, object2);
                unsafe.putObject(obj, L, d11);
                object2 = d11;
            }
            m6.a(object2, object);
        }
    }

    public final Object u(int i5, Object obj) {
        x0 m6 = m(i5);
        long L = L(i5) & 1048575;
        if (!n(i5, obj)) {
            return m6.d();
        }
        Object object = f1670o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        y d10 = m6.d();
        if (object != null) {
            m6.a(d10, object);
        }
        return d10;
    }

    public final Object v(int i5, int i10, Object obj) {
        x0 m6 = m(i10);
        if (!q(i5, i10, obj)) {
            return m6.d();
        }
        Object object = f1670o.getObject(obj, L(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        y d10 = m6.d();
        if (object != null) {
            m6.a(d10, object);
        }
        return d10;
    }
}
