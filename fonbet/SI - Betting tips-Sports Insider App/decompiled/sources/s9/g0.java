package s9;

import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import okio.Segment;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements n0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f23308n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f23309o = w0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f23310a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f23311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23312c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23313d;

    /* renamed from: e, reason: collision with root package name */
    public final a f23314e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23315f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f23316g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23317h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23318i;
    public final i0 j;

    /* renamed from: k, reason: collision with root package name */
    public final w f23319k;

    /* renamed from: l, reason: collision with root package name */
    public final r0 f23320l;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f23321m;

    public g0(int[] iArr, Object[] objArr, int i5, int i10, a aVar, int[] iArr2, int i11, int i12, i0 i0Var, w wVar, r0 r0Var, n nVar, c0 c0Var) {
        this.f23310a = iArr;
        this.f23311b = objArr;
        this.f23312c = i5;
        this.f23313d = i10;
        this.f23315f = aVar instanceof r;
        this.f23316g = iArr2;
        this.f23317h = i11;
        this.f23318i = i12;
        this.j = i0Var;
        this.f23319k = wVar;
        this.f23320l = r0Var;
        this.f23314e = aVar;
        this.f23321m = c0Var;
    }

    public static Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e7) {
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
            throw new RuntimeException(p10.toString(), e7);
        }
    }

    public static int I(int i5) {
        return (i5 & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r) {
            return ((r) obj).d();
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
    public static g0 u(m0 m0Var, i0 i0Var, w wVar, r0 r0Var, n nVar, c0 c0Var) {
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
        Field D;
        char charAt10;
        int i33;
        int i34;
        Object obj;
        Field D2;
        Object obj2;
        Field D3;
        int i35;
        char charAt11;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        String str = m0Var.f23357b;
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
            iArr = f23308n;
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
        Unsafe unsafe = f23309o;
        Object[] objArr = m0Var.f23358c;
        Class<?> cls2 = m0Var.f23356a.getClass();
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
                    if (i87 == 12 && (v.f.a(m0Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i34 = i14 + 1;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                    }
                    int i89 = charAt25 * 2;
                    obj = objArr3[i89];
                    if (obj instanceof Field) {
                        D2 = D(cls2, (String) obj);
                        objArr3[i89] = D2;
                    } else {
                        D2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(D2);
                    int i90 = i89 + 1;
                    obj2 = objArr3[i90];
                    if (obj2 instanceof Field) {
                        D3 = D(cls2, (String) obj2);
                        objArr3[i90] = D3;
                    } else {
                        D3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(D3);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(D2);
                int i902 = i892 + 1;
                obj2 = objArr3[i902];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(D3);
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
                Field D4 = D(cls2, (String) objArr3[i14]);
                if (i82 == 9 || i82 == 17) {
                    i26 = i12;
                    objArr2[((i74 / 3) * 2) + 1] = D4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i26 = i12;
                        i33 = i14 + 2;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i26 = i12;
                        if (m0Var.a() == 1 || (charAt24 & 2048) != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
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
                                D = (Field) obj3;
                            } else {
                                D = D(cls, (String) obj3);
                                objArr3[i99] = D;
                            }
                            i28 = (int) unsafe.objectFieldOffset(D);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
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
        return new g0(iArr3, objArr2, i10, i13, m0Var.f23356a, iArr, i15, i70, i0Var, wVar, r0Var, nVar, c0Var);
    }

    public static long v(int i5) {
        return i5 & 1048575;
    }

    public static int w(long j, Object obj) {
        return ((Integer) w0.f23382c.h(j, obj)).intValue();
    }

    public static long x(long j, Object obj) {
        return ((Long) w0.f23382c.h(j, obj)).longValue();
    }

    public final void A(Object obj, int i5, androidx.datastore.preferences.protobuf.m mVar, n0 n0Var, m mVar2) {
        int u10;
        this.f23319k.getClass();
        s a7 = w.a(i5 & 1048575, obj);
        k kVar = (k) mVar.f1656e;
        int i10 = mVar.f1653b;
        if ((i10 & 7) != 2) {
            throw v.b();
        }
        do {
            r d10 = n0Var.d();
            mVar.f(d10, n0Var, mVar2);
            n0Var.b(d10);
            ((l0) a7).add(d10);
            if (kVar.c() || mVar.f1655d != 0) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == i10);
        mVar.f1655d = u10;
    }

    public final void B(int i5, androidx.datastore.preferences.protobuf.m mVar, Object obj) {
        k kVar = (k) mVar.f1656e;
        if ((536870912 & i5) != 0) {
            mVar.R(2);
            w0.n(i5 & 1048575, obj, kVar.t());
        } else if (!this.f23315f) {
            w0.n(i5 & 1048575, obj, mVar.j());
        } else {
            mVar.R(2);
            w0.n(i5 & 1048575, obj, kVar.s());
        }
    }

    public final void C(int i5, androidx.datastore.preferences.protobuf.m mVar, Object obj) {
        int i10 = 536870912 & i5;
        w wVar = this.f23319k;
        if (i10 != 0) {
            wVar.getClass();
            mVar.L(w.a(i5 & 1048575, obj), true);
        } else {
            wVar.getClass();
            mVar.L(w.a(i5 & 1048575, obj), false);
        }
    }

    public final void E(int i5, Object obj) {
        int i10 = this.f23310a[i5 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        w0.l((1 << (i10 >>> 20)) | w0.f23382c.f(j, obj), j, obj);
    }

    public final void F(int i5, int i10, Object obj) {
        w0.l(i5, this.f23310a[i10 + 2] & 1048575, obj);
    }

    public final void G(Object obj, int i5, a aVar) {
        f23309o.putObject(obj, J(i5) & 1048575, aVar);
        E(i5, obj);
    }

    public final void H(Object obj, int i5, int i10, a aVar) {
        f23309o.putObject(obj, J(i10) & 1048575, aVar);
        F(i5, i10, obj);
    }

    public final int J(int i5) {
        return this.f23310a[i5 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // s9.n0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!n(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f23310a;
            if (i5 >= iArr.length) {
                o0.b(this.f23320l, obj, obj2);
                return;
            }
            int J = J(i5);
            long j = 1048575 & J;
            int i10 = iArr[i5];
            switch (I(J)) {
                case 0:
                    if (l(i5, obj2)) {
                        v0 v0Var = w0.f23382c;
                        obj3 = obj;
                        v0Var.k(obj3, j, v0Var.d(j, obj2));
                        E(i5, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (l(i5, obj2)) {
                        v0 v0Var2 = w0.f23382c;
                        v0Var2.l(obj, j, v0Var2.e(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (l(i5, obj2)) {
                        w0.m(obj, j, w0.f23382c.g(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (l(i5, obj2)) {
                        w0.m(obj, j, w0.f23382c.g(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (l(i5, obj2)) {
                        w0.m(obj, j, w0.f23382c.g(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (l(i5, obj2)) {
                        v0 v0Var3 = w0.f23382c;
                        v0Var3.j(obj, j, v0Var3.c(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (l(i5, obj2)) {
                        w0.n(j, obj, w0.f23382c.h(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    q(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (l(i5, obj2)) {
                        w0.n(j, obj, w0.f23382c.h(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (l(i5, obj2)) {
                        w0.m(obj, j, w0.f23382c.g(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (l(i5, obj2)) {
                        w0.l(w0.f23382c.f(j, obj2), j, obj);
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (l(i5, obj2)) {
                        w0.m(obj, j, w0.f23382c.g(j, obj2));
                        E(i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    q(i5, obj, obj2);
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
                    this.f23319k.getClass();
                    v0 v0Var4 = w0.f23382c;
                    s sVar = (s) v0Var4.h(j, obj);
                    s sVar2 = (s) v0Var4.h(j, obj2);
                    l0 l0Var = (l0) sVar;
                    int i11 = l0Var.f23353c;
                    int i12 = ((l0) sVar2).f23353c;
                    if (i11 > 0 && i12 > 0) {
                        if (!((b) sVar).f23283a) {
                            sVar = l0Var.c(i12 + i11);
                        }
                        ((b) sVar).addAll(sVar2);
                    }
                    if (i11 > 0) {
                        sVar2 = sVar;
                    }
                    w0.n(j, obj, sVar2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = o0.f23362a;
                    v0 v0Var5 = w0.f23382c;
                    Object h10 = v0Var5.h(j, obj);
                    Object h11 = v0Var5.h(j, obj2);
                    this.f23321m.getClass();
                    w0.n(j, obj, c0.a(h10, h11));
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
                    if (o(i10, i5, obj2)) {
                        w0.n(j, obj, w0.f23382c.h(j, obj2));
                        F(i10, i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    r(i5, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(i10, i5, obj2)) {
                        w0.n(j, obj, w0.f23382c.h(j, obj2));
                        F(i10, i5, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    r(i5, obj, obj2);
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

    @Override // s9.n0
    public final void b(Object obj) {
        if (n(obj)) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                rVar.f23373b = (rVar.f23373b & Integer.MIN_VALUE) | (Integer.MAX_VALUE & Integer.MAX_VALUE);
                rVar.f23280a = 0;
                rVar.f23373b = Integer.MAX_VALUE & rVar.f23373b;
            }
            int[] iArr = this.f23310a;
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int J = J(i5);
                long j = 1048575 & J;
                int I = I(J);
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.f23319k.getClass();
                                b bVar = (b) ((s) w0.f23382c.h(j, obj));
                                if (bVar.f23283a) {
                                    bVar.f23283a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f23309o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f23321m.getClass();
                                    ((b0) object).f23285a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (o(iArr[i5], i5, obj)) {
                        k(i5).b(f23309o.getObject(obj, j));
                    }
                }
                if (l(i5, obj)) {
                    k(i5).b(f23309o.getObject(obj, j));
                }
            }
            this.f23320l.getClass();
            q0 q0Var = ((r) obj).f23374c;
            if (q0Var.f23371d) {
                q0Var.f23371d = false;
            }
        }
    }

    @Override // s9.n0
    public final boolean c(Object obj) {
        int i5;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f23317h) {
            int i15 = this.f23316g[i14];
            int[] iArr = this.f23310a;
            int i16 = iArr[i15];
            int J = J(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f23309o.getInt(obj, i18);
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
            if ((268435456 & J) == 0 || m(obj, i10, i5, i11, i19)) {
                int I = I(J);
                if (I == 9 || I == 17) {
                    if (m(obj, i10, i5, i11, i19)) {
                        if (!k(i10).c(w0.f23382c.h(J & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i5;
                    i13 = i11;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (o(i16, i10, obj)) {
                                if (!k(i10).c(w0.f23382c.h(J & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i5;
                            i13 = i11;
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object h10 = w0.f23382c.h(J & 1048575, obj);
                                this.f23321m.getClass();
                                b0 b0Var = (b0) h10;
                                if (b0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((d1) ((a0) this.f23311b[(i10 / 3) * 2]).f23281a.f19116c).f23294a != e1.f23305i) {
                                        continue;
                                    } else {
                                        n0 n0Var = null;
                                        for (Object obj2 : b0Var.values()) {
                                            if (n0Var == null) {
                                                n0Var = k0.f23346c.a(obj2.getClass());
                                            }
                                            if (!n0Var.c(obj2)) {
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
                    List list = (List) w0.f23382c.h(J & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        n0 k6 = k(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (k6.c(list.get(i21))) {
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

    @Override // s9.n0
    public final r d() {
        this.j.getClass();
        return ((r) this.f23314e).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (s9.o0.c(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (s9.o0.c(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (s9.o0.c(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (s9.o0.c(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (s9.o0.c(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // s9.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(r rVar, r rVar2) {
        int[] iArr = this.f23310a;
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 < length) {
                int J = J(i5);
                long j = J & 1048575;
                switch (I(J)) {
                    case 0:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 1:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var2 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 2:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var3 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 3:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var4 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 4:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var5 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 5:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var6 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 6:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var7 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 7:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var8 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 8:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var9 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 9:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var10 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 10:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var11 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 11:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var12 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 12:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var13 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 13:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var14 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 14:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var15 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 15:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var16 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 16:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var17 = w0.f23382c;
                            break;
                        }
                        z5 = false;
                        break;
                    case 17:
                        if (h(rVar, rVar2, i5)) {
                            v0 v0Var18 = w0.f23382c;
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
                        v0 v0Var19 = w0.f23382c;
                        z5 = o0.c(v0Var19.h(j, rVar), v0Var19.h(j, rVar2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        v0 v0Var20 = w0.f23382c;
                        z5 = o0.c(v0Var20.h(j, rVar), v0Var20.h(j, rVar2));
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
                        v0 v0Var21 = w0.f23382c;
                        if (v0Var21.f(j6, rVar) == v0Var21.f(j6, rVar2)) {
                            break;
                        }
                        z5 = false;
                        break;
                }
                if (z5) {
                    i5 += 3;
                }
            } else {
                this.f23320l.getClass();
                if (rVar.f23374c.equals(rVar2.f23374c)) {
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
    @Override // s9.n0
    public final void f(java.lang.Object r19, androidx.datastore.preferences.protobuf.m r20, s9.m r21) {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.g0.f(java.lang.Object, androidx.datastore.preferences.protobuf.m, s9.m):void");
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
    @Override // s9.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(r rVar) {
        int i5;
        int b10;
        int i10;
        int[] iArr = this.f23310a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int J = J(i12);
            int i13 = iArr[i12];
            long j = 1048575 & J;
            int i14 = 1237;
            int i15 = 37;
            switch (I(J)) {
                case 0:
                    i5 = i11 * 53;
                    b10 = t.b(Double.doubleToLongBits(w0.f23382c.d(j, rVar)));
                    i11 = b10 + i5;
                    break;
                case 1:
                    i5 = i11 * 53;
                    b10 = Float.floatToIntBits(w0.f23382c.e(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 2:
                    i5 = i11 * 53;
                    b10 = t.b(w0.f23382c.g(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 3:
                    i5 = i11 * 53;
                    b10 = t.b(w0.f23382c.g(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 4:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 5:
                    i5 = i11 * 53;
                    b10 = t.b(w0.f23382c.g(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 6:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c2 = w0.f23382c.c(j, rVar);
                    Charset charset = t.f23375a;
                    break;
                case 8:
                    i5 = i11 * 53;
                    b10 = ((String) w0.f23382c.h(j, rVar)).hashCode();
                    i11 = b10 + i5;
                    break;
                case 9:
                    Object h10 = w0.f23382c.h(j, rVar);
                    if (h10 != null) {
                        i15 = h10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.h(j, rVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case 11:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 12:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 13:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 14:
                    i5 = i11 * 53;
                    b10 = t.b(w0.f23382c.g(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 15:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.f(j, rVar);
                    i11 = b10 + i5;
                    break;
                case 16:
                    i5 = i11 * 53;
                    b10 = t.b(w0.f23382c.g(j, rVar));
                    i11 = b10 + i5;
                    break;
                case 17:
                    Object h11 = w0.f23382c.h(j, rVar);
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
                    b10 = w0.f23382c.h(j, rVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i5 = i11 * 53;
                    b10 = w0.f23382c.h(j, rVar).hashCode();
                    i11 = b10 + i5;
                    break;
                case 51:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(Double.doubleToLongBits(((Double) w0.f23382c.h(j, rVar)).doubleValue()));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = Float.floatToIntBits(((Float) w0.f23382c.h(j, rVar)).floatValue());
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(x(j, rVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(x(j, rVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(x(j, rVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(i13, i12, rVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) w0.f23382c.h(j, rVar)).booleanValue();
                        Charset charset2 = t.f23375a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = ((String) w0.f23382c.h(j, rVar)).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w0.f23382c.h(j, rVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w0.f23382c.h(j, rVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(x(j, rVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w(j, rVar);
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = t.b(x(j, rVar));
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(i13, i12, rVar)) {
                        i5 = i11 * 53;
                        b10 = w0.f23382c.h(j, rVar).hashCode();
                        i11 = b10 + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f23320l.getClass();
        return rVar.f23374c.hashCode() + (i11 * 53);
    }

    public final boolean h(r rVar, r rVar2, int i5) {
        return l(i5, rVar) == l(i5, rVar2);
    }

    public final void i(int i5, Object obj, Object obj2) {
        int i10 = this.f23310a[i5];
        if (w0.f23382c.h(J(i5) & 1048575, obj) == null) {
            return;
        }
        j(i5);
    }

    public final void j(int i5) {
        if (this.f23311b[((i5 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final n0 k(int i5) {
        int i10 = (i5 / 3) * 2;
        Object[] objArr = this.f23311b;
        n0 n0Var = (n0) objArr[i10];
        if (n0Var != null) {
            return n0Var;
        }
        n0 a7 = k0.f23346c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a7;
        return a7;
    }

    public final boolean l(int i5, Object obj) {
        int i10 = this.f23310a[i5 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int J = J(i5);
            long j6 = J & 1048575;
            switch (I(J)) {
                case 0:
                    if (Double.doubleToRawLongBits(w0.f23382c.d(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(w0.f23382c.e(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (w0.f23382c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (w0.f23382c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (w0.f23382c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return w0.f23382c.c(j6, obj);
                case 8:
                    Object h10 = w0.f23382c.h(j6, obj);
                    if (h10 instanceof String) {
                        return !((String) h10).isEmpty();
                    }
                    if (h10 instanceof h) {
                        return !h.f23322b.equals(h10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (w0.f23382c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !h.f23322b.equals(w0.f23382c.h(j6, obj));
                case 11:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (w0.f23382c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (w0.f23382c.f(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (w0.f23382c.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (w0.f23382c.h(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & w0.f23382c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean m(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? l(i5, obj) : (i11 & i12) != 0;
    }

    public final boolean o(int i5, int i10, Object obj) {
        return w0.f23382c.f((long) (this.f23310a[i10 + 2] & 1048575), obj) == i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Object obj, int i5, Object obj2, m mVar, androidx.datastore.preferences.protobuf.m mVar2) {
        long J = J(i5) & 1048575;
        Object h10 = w0.f23382c.h(J, obj);
        c0 c0Var = this.f23321m;
        if (h10 == null) {
            c0Var.getClass();
            h10 = b0.f23284b.d();
            w0.n(J, obj, h10);
        } else {
            c0Var.getClass();
            if (!((b0) h10).f23285a) {
                b0 d10 = b0.f23284b.d();
                c0.a(d10, h10);
                w0.n(J, obj, d10);
                h10 = d10;
            }
        }
        c0Var.getClass();
        b0 b0Var = (b0) h10;
        kh.g gVar = ((a0) obj2).f23281a;
        mVar2.R(2);
        k kVar = (k) mVar2.f1656e;
        int e7 = kVar.e(kVar.v());
        Object obj3 = 0;
        Object obj4 = gVar.f19117d;
        Object obj5 = obj4;
        while (true) {
            try {
                int a7 = mVar2.a();
                if (a7 == Integer.MAX_VALUE || kVar.c()) {
                    break;
                }
                if (a7 == 1) {
                    obj3 = mVar2.r((d1) gVar.f19115b, null, null);
                } else if (a7 != 2) {
                    try {
                        if (!mVar2.S()) {
                            throw new v("Unable to parse map entry.");
                        }
                    } catch (u e9) {
                        if (!mVar2.S()) {
                            throw new v("Unable to parse map entry.", e9);
                        }
                    }
                } else {
                    obj5 = mVar2.r((d1) gVar.f19116c, obj4.getClass(), mVar);
                }
            } catch (Throwable th2) {
                kVar.d(e7);
                throw th2;
            }
        }
    }

    public final void q(int i5, Object obj, Object obj2) {
        if (l(i5, obj2)) {
            long J = J(i5) & 1048575;
            Unsafe unsafe = f23309o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f23310a[i5] + " is present but null: " + obj2);
            }
            n0 k6 = k(i5);
            if (!l(i5, obj)) {
                if (n(object)) {
                    r d10 = k6.d();
                    k6.a(d10, object);
                    unsafe.putObject(obj, J, d10);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                E(i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                r d11 = k6.d();
                k6.a(d11, object2);
                unsafe.putObject(obj, J, d11);
                object2 = d11;
            }
            k6.a(object2, object);
        }
    }

    public final void r(int i5, Object obj, Object obj2) {
        int[] iArr = this.f23310a;
        int i10 = iArr[i5];
        if (o(i10, i5, obj2)) {
            long J = J(i5) & 1048575;
            Unsafe unsafe = f23309o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2);
            }
            n0 k6 = k(i5);
            if (!o(i10, i5, obj)) {
                if (n(object)) {
                    r d10 = k6.d();
                    k6.a(d10, object);
                    unsafe.putObject(obj, J, d10);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                F(i10, i5, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                r d11 = k6.d();
                k6.a(d11, object2);
                unsafe.putObject(obj, J, d11);
                object2 = d11;
            }
            k6.a(object2, object);
        }
    }

    public final Object s(int i5, Object obj) {
        n0 k6 = k(i5);
        long J = J(i5) & 1048575;
        if (!l(i5, obj)) {
            return k6.d();
        }
        Object object = f23309o.getObject(obj, J);
        if (n(object)) {
            return object;
        }
        r d10 = k6.d();
        if (object != null) {
            k6.a(d10, object);
        }
        return d10;
    }

    public final Object t(int i5, int i10, Object obj) {
        n0 k6 = k(i10);
        if (!o(i5, i10, obj)) {
            return k6.d();
        }
        Object object = f23309o.getObject(obj, J(i10) & 1048575);
        if (n(object)) {
            return object;
        }
        r d10 = k6.d();
        if (object != null) {
            k6.a(d10, object);
        }
        return d10;
    }

    public final int y(int i5) {
        if (i5 >= this.f23312c && i5 <= this.f23313d) {
            int[] iArr = this.f23310a;
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

    public final void z(Object obj, long j, androidx.datastore.preferences.protobuf.m mVar, n0 n0Var, m mVar2) {
        int u10;
        this.f23319k.getClass();
        s a7 = w.a(j, obj);
        k kVar = (k) mVar.f1656e;
        int i5 = mVar.f1653b;
        if ((i5 & 7) != 3) {
            throw v.b();
        }
        do {
            r d10 = n0Var.d();
            mVar.d(d10, n0Var, mVar2);
            n0Var.b(d10);
            ((l0) a7).add(d10);
            if (kVar.c() || mVar.f1655d != 0) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == i5);
        mVar.f1655d = u10;
    }
}
