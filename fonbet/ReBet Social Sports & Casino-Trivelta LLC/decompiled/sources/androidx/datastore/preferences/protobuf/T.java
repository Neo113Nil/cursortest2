package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2149y;
import androidx.datastore.preferences.protobuf.C2150z;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class T implements f0 {
    private static final int[] EMPTY_INT_ARRAY = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f19436o = p0.A();

    /* renamed from: a, reason: collision with root package name */
    public final int f19437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19438b;
    private final int[] buffer;

    /* renamed from: c, reason: collision with root package name */
    public final P f19439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19441e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f19442f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19443g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19444h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19445i;
    private final int[] intArray;

    /* renamed from: j, reason: collision with root package name */
    public final V f19446j;

    /* renamed from: k, reason: collision with root package name */
    public final D f19447k;

    /* renamed from: l, reason: collision with root package name */
    public final m0 f19448l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC2141p f19449m;

    /* renamed from: n, reason: collision with root package name */
    public final K f19450n;
    private final Object[] objects;

    public T(int[] iArr, Object[] objArr, int i10, int i11, P p10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, V v10, D d10, m0 m0Var, AbstractC2141p abstractC2141p, K k10) {
        this.buffer = iArr;
        this.objects = objArr;
        this.f19437a = i10;
        this.f19438b = i11;
        this.f19441e = p10 instanceof AbstractC2147w;
        this.f19442f = a0Var;
        this.f19440d = abstractC2141p != null && abstractC2141p.e(p10);
        this.f19443g = z10;
        this.intArray = iArr2;
        this.f19444h = i12;
        this.f19445i = i13;
        this.f19446j = v10;
        this.f19447k = d10;
        this.f19448l = m0Var;
        this.f19449m = abstractC2141p;
        this.f19439c = p10;
        this.f19450n = k10;
    }

    public static T G(Class cls, N n10, V v10, D d10, m0 m0Var, AbstractC2141p abstractC2141p, K k10) {
        if (n10 instanceof d0) {
            return I((d0) n10, v10, d10, m0Var, abstractC2141p, k10);
        }
        android.support.v4.media.session.b.a(n10);
        return H(null, v10, d10, m0Var, abstractC2141p, k10);
    }

    public static T H(j0 j0Var, V v10, D d10, m0 m0Var, AbstractC2141p abstractC2141p, K k10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static T I(d0 d0Var, V v10, D d10, m0 m0Var, AbstractC2141p abstractC2141p, K k10) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
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
        int objectFieldOffset;
        String str;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Field W10;
        char charAt10;
        int i35;
        int i36;
        Object obj;
        Field W11;
        Object obj2;
        Field W12;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        String b10 = d0Var.b();
        int length = b10.length();
        char c10 = 55296;
        if (b10.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (b10.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int charAt15 = b10.charAt(i10);
        if (charAt15 >= 55296) {
            int i43 = charAt15 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                charAt14 = b10.charAt(i42);
                if (charAt14 < 55296) {
                    break;
                }
                i43 |= (charAt14 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            charAt15 = i43 | (charAt14 << i44);
            i42 = i40;
        }
        if (charAt15 == 0) {
            i13 = 0;
            charAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = EMPTY_INT_ARRAY;
            i14 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt16 = b10.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    charAt9 = b10.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                charAt16 = i46 | (charAt9 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int charAt17 = b10.charAt(i45);
            if (charAt17 >= 55296) {
                int i49 = charAt17 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    charAt8 = b10.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                charAt17 = i49 | (charAt8 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int charAt18 = b10.charAt(i48);
            if (charAt18 >= 55296) {
                int i52 = charAt18 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    charAt7 = b10.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                charAt18 = i52 | (charAt7 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int charAt19 = b10.charAt(i51);
            if (charAt19 >= 55296) {
                int i55 = charAt19 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    charAt6 = b10.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                charAt19 = i55 | (charAt6 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            charAt = b10.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    charAt5 = b10.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                charAt = i58 | (charAt5 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int charAt20 = b10.charAt(i57);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    charAt4 = b10.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                charAt20 = i61 | (charAt4 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int charAt21 = b10.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    charAt3 = b10.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                charAt21 = i64 | (charAt3 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int charAt22 = b10.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    charAt2 = b10.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                charAt22 = i67 | (charAt2 << i68);
                i66 = i17;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            i11 = (charAt16 * 2) + charAt17;
            int i69 = charAt20;
            i12 = charAt18;
            i13 = i69;
            i14 = charAt16;
            iArr = iArr2;
            i15 = charAt22;
            i42 = i66;
            i16 = charAt19;
        }
        Unsafe unsafe = f19436o;
        Object[] a10 = d0Var.a();
        Class<?> cls = d0Var.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i70 = i15 + i13;
        int i71 = i70;
        int i72 = i15;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int charAt23 = b10.charAt(i42);
            if (charAt23 >= c10) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    charAt13 = b10.charAt(i77);
                    if (charAt13 < c10) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i39;
            } else {
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = b10.charAt(i25);
            if (charAt24 >= c10) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i38 = i81 + 1;
                    charAt12 = b10.charAt(i81);
                    if (charAt12 < c10) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i38;
                }
                charAt24 = i80 | (charAt12 << i82);
                i26 = i38;
            } else {
                i26 = i79;
            }
            int i83 = charAt24 & 255;
            int i84 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int[] iArr4 = iArr3;
            if (i83 >= 51) {
                int i85 = i26 + 1;
                int charAt25 = b10.charAt(i26);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i86 = charAt25 & 8191;
                    int i87 = 13;
                    while (true) {
                        i37 = i85 + 1;
                        charAt11 = b10.charAt(i85);
                        if (charAt11 < c11) {
                            break;
                        }
                        i86 |= (charAt11 & 8191) << i87;
                        i87 += 13;
                        i85 = i37;
                        c11 = 55296;
                    }
                    charAt25 = i86 | (charAt11 << i87);
                    i85 = i37;
                }
                int i88 = i83 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i36 = i11 + 1;
                    objArr[((i74 / 3) * 2) + 1] = a10[i11];
                } else {
                    if (i88 == 12 && (d0Var.getSyntax().equals(a0.PROTO2) || (charAt24 & 2048) != 0)) {
                        i36 = i11 + 1;
                        objArr[((i74 / 3) * 2) + 1] = a10[i11];
                    }
                    int i90 = charAt25 * 2;
                    obj = a10[i90];
                    if (obj instanceof Field) {
                        W11 = W(cls, (String) obj);
                        a10[i90] = W11;
                    } else {
                        W11 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(W11);
                    int i91 = i90 + 1;
                    obj2 = a10[i91];
                    if (obj2 instanceof Field) {
                        W12 = W(cls, (String) obj2);
                        a10[i91] = W12;
                    } else {
                        W12 = (Field) obj2;
                    }
                    str = b10;
                    i33 = (int) unsafe.objectFieldOffset(W12);
                    i34 = objectFieldOffset2;
                    i32 = 0;
                    i27 = charAt23;
                    i42 = i89;
                }
                i11 = i36;
                int i902 = charAt25 * 2;
                obj = a10[i902];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(W11);
                int i912 = i902 + 1;
                obj2 = a10[i912];
                if (obj2 instanceof Field) {
                }
                str = b10;
                i33 = (int) unsafe.objectFieldOffset(W12);
                i34 = objectFieldOffset22;
                i32 = 0;
                i27 = charAt23;
                i42 = i89;
            } else {
                int i92 = i11 + 1;
                Field W13 = W(cls, (String) a10[i11]);
                if (i83 == 9 || i83 == 17) {
                    i27 = charAt23;
                    objArr[((i74 / 3) * 2) + 1] = W13.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = charAt23;
                        i35 = i11 + 2;
                        objArr[((i74 / 3) * 2) + 1] = a10[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = charAt23;
                        if (d0Var.getSyntax() == a0.PROTO2 || (charAt24 & 2048) != 0) {
                            i35 = i11 + 2;
                            objArr[((i74 / 3) * 2) + 1] = a10[i92];
                        }
                    } else if (i83 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i74;
                        int i94 = (i74 / 3) * 2;
                        int i95 = i11 + 2;
                        objArr[i94] = a10[i92];
                        if ((charAt24 & 2048) != 0) {
                            i28 = i11 + 3;
                            objArr[i94 + 1] = a10[i95];
                            i27 = charAt23;
                            i72 = i93;
                        } else {
                            i28 = i95;
                            i72 = i93;
                            i27 = charAt23;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(W13);
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            str = b10;
                            i29 = i28;
                            i30 = 1048575;
                            i31 = i26;
                            i32 = 0;
                        } else {
                            int i96 = i26 + 1;
                            int charAt26 = b10.charAt(i26);
                            if (charAt26 >= 55296) {
                                int i97 = charAt26 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i31 = i96 + 1;
                                    charAt10 = b10.charAt(i96);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt10 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i31;
                                }
                                charAt26 = i97 | (charAt10 << i98);
                            } else {
                                i31 = i96;
                            }
                            int i99 = (i14 * 2) + (charAt26 / 32);
                            Object obj3 = a10[i99];
                            str = b10;
                            if (obj3 instanceof Field) {
                                W10 = (Field) obj3;
                            } else {
                                W10 = W(cls, (String) obj3);
                                a10[i99] = W10;
                            }
                            i29 = i28;
                            i30 = (int) unsafe.objectFieldOffset(W10);
                            i32 = charAt26 % 32;
                        }
                        int i100 = i30;
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i71] = objectFieldOffset;
                            i71++;
                        }
                        i33 = i100;
                        i34 = objectFieldOffset;
                        i11 = i29;
                        i42 = i31;
                    } else {
                        i27 = charAt23;
                    }
                    i28 = i35;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(W13);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = b10;
                    i29 = i28;
                    i30 = 1048575;
                    i31 = i26;
                    i32 = 0;
                    int i1002 = i30;
                    if (i83 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                    i33 = i1002;
                    i34 = objectFieldOffset;
                    i11 = i29;
                    i42 = i31;
                }
                i28 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(W13);
                if ((charAt24 & 4096) != 0) {
                }
                str = b10;
                i29 = i28;
                i30 = 1048575;
                i31 = i26;
                i32 = 0;
                int i10022 = i30;
                if (i83 >= 18) {
                }
                i33 = i10022;
                i34 = objectFieldOffset;
                i11 = i29;
                i42 = i31;
            }
            int i101 = i74 + 1;
            iArr4[i74] = i27;
            int i102 = i74 + 2;
            int i103 = i33;
            iArr4[i101] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i34;
            i74 += 3;
            iArr4[i102] = (i32 << 20) | i103;
            length = i84;
            iArr3 = iArr4;
            b10 = str;
            c10 = 55296;
        }
        return new T(iArr3, objArr, i12, i16, d0Var.getDefaultInstance(), d0Var.getSyntax(), false, iArr, i15, i70, v10, d10, m0Var, abstractC2141p, k10);
    }

    public static long K(int i10) {
        return i10 & 1048575;
    }

    public static boolean L(Object obj, long j10) {
        return ((Boolean) p0.z(obj, j10)).booleanValue();
    }

    public static double M(Object obj, long j10) {
        return ((Double) p0.z(obj, j10)).doubleValue();
    }

    public static float N(Object obj, long j10) {
        return ((Float) p0.z(obj, j10)).floatValue();
    }

    public static int O(Object obj, long j10) {
        return ((Integer) p0.z(obj, j10)).intValue();
    }

    public static long P(Object obj, long j10) {
        return ((Long) p0.z(obj, j10)).longValue();
    }

    public static Field W(Class cls, String str) {
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

    public static int c0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean d(Object obj, long j10) {
        return p0.p(obj, j10);
    }

    public static void e(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double f(Object obj, long j10) {
        return p0.u(obj, j10);
    }

    public static float i(Object obj, long j10) {
        return p0.v(obj, j10);
    }

    public static int n(Object obj, long j10) {
        return p0.w(obj, j10);
    }

    public static boolean o(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public static boolean r(Object obj, int i10, f0 f0Var) {
        return f0Var.isInitialized(p0.z(obj, K(i10)));
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2147w) {
            return ((AbstractC2147w) obj).y();
        }
        return true;
    }

    public static boolean x(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static long y(Object obj, long j10) {
        return p0.x(obj, j10);
    }

    public final void A(Object obj, int i10, Object obj2, C2140o c2140o, e0 e0Var) {
        long K10 = K(d0(i10));
        Object z10 = p0.z(obj, K10);
        if (z10 == null) {
            z10 = this.f19450n.newMapField(obj2);
            p0.O(obj, K10, z10);
        } else if (this.f19450n.isImmutable(z10)) {
            Object newMapField = this.f19450n.newMapField(obj2);
            this.f19450n.mergeFrom(newMapField, z10);
            p0.O(obj, K10, newMapField);
            z10 = newMapField;
        }
        e0Var.c(this.f19450n.forMutableMapData(z10), this.f19450n.forMapMetadata(obj2), c2140o);
    }

    public final void B(Object obj, Object obj2, int i10) {
        if (p(obj2, i10)) {
            long K10 = K(d0(i10));
            Unsafe unsafe = f19436o;
            Object object = unsafe.getObject(obj2, K10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + J(i10) + " is present but null: " + obj2);
            }
            f0 l10 = l(i10);
            if (!p(obj, i10)) {
                if (u(object)) {
                    Object newInstance = l10.newInstance();
                    l10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, K10, newInstance);
                } else {
                    unsafe.putObject(obj, K10, object);
                }
                X(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, K10);
            if (!u(object2)) {
                Object newInstance2 = l10.newInstance();
                l10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, K10, newInstance2);
                object2 = newInstance2;
            }
            l10.mergeFrom(object2, object);
        }
    }

    public final void C(Object obj, Object obj2, int i10) {
        int J10 = J(i10);
        if (w(obj2, J10, i10)) {
            long K10 = K(d0(i10));
            Unsafe unsafe = f19436o;
            Object object = unsafe.getObject(obj2, K10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + J(i10) + " is present but null: " + obj2);
            }
            f0 l10 = l(i10);
            if (!w(obj, J10, i10)) {
                if (u(object)) {
                    Object newInstance = l10.newInstance();
                    l10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, K10, newInstance);
                } else {
                    unsafe.putObject(obj, K10, object);
                }
                Y(obj, J10, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, K10);
            if (!u(object2)) {
                Object newInstance2 = l10.newInstance();
                l10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, K10, newInstance2);
                object2 = newInstance2;
            }
            l10.mergeFrom(object2, object);
        }
    }

    public final void D(Object obj, Object obj2, int i10) {
        int d02 = d0(i10);
        long K10 = K(d02);
        int J10 = J(i10);
        switch (c0(d02)) {
            case 0:
                if (p(obj2, i10)) {
                    p0.K(obj, K10, p0.u(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 1:
                if (p(obj2, i10)) {
                    p0.L(obj, K10, p0.v(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 2:
                if (p(obj2, i10)) {
                    p0.N(obj, K10, p0.x(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 3:
                if (p(obj2, i10)) {
                    p0.N(obj, K10, p0.x(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 4:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 5:
                if (p(obj2, i10)) {
                    p0.N(obj, K10, p0.x(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 6:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 7:
                if (p(obj2, i10)) {
                    p0.E(obj, K10, p0.p(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 8:
                if (p(obj2, i10)) {
                    p0.O(obj, K10, p0.z(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 9:
                B(obj, obj2, i10);
                break;
            case 10:
                if (p(obj2, i10)) {
                    p0.O(obj, K10, p0.z(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 11:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 12:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 13:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 14:
                if (p(obj2, i10)) {
                    p0.N(obj, K10, p0.x(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 15:
                if (p(obj2, i10)) {
                    p0.M(obj, K10, p0.w(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 16:
                if (p(obj2, i10)) {
                    p0.N(obj, K10, p0.x(obj2, K10));
                    X(obj, i10);
                    break;
                }
                break;
            case 17:
                B(obj, obj2, i10);
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
                this.f19447k.b(obj, obj2, K10);
                break;
            case 50:
                h0.E(this.f19450n, obj, obj2, K10);
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
                if (w(obj2, J10, i10)) {
                    p0.O(obj, K10, p0.z(obj2, K10));
                    Y(obj, J10, i10);
                    break;
                }
                break;
            case 60:
                C(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (w(obj2, J10, i10)) {
                    p0.O(obj, K10, p0.z(obj2, K10));
                    Y(obj, J10, i10);
                    break;
                }
                break;
            case 68:
                C(obj, obj2, i10);
                break;
        }
    }

    public final Object E(Object obj, int i10) {
        f0 l10 = l(i10);
        long K10 = K(d0(i10));
        if (!p(obj, i10)) {
            return l10.newInstance();
        }
        Object object = f19436o.getObject(obj, K10);
        if (u(object)) {
            return object;
        }
        Object newInstance = l10.newInstance();
        if (object != null) {
            l10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final Object F(Object obj, int i10, int i11) {
        f0 l10 = l(i11);
        if (!w(obj, i10, i11)) {
            return l10.newInstance();
        }
        Object object = f19436o.getObject(obj, K(d0(i11)));
        if (u(object)) {
            return object;
        }
        Object newInstance = l10.newInstance();
        if (object != null) {
            l10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final int J(int i10) {
        return this.buffer[i10];
    }

    public final int Q(int i10) {
        if (i10 < this.f19437a || i10 > this.f19438b) {
            return -1;
        }
        return Z(i10, 0);
    }

    public final int R(int i10) {
        return this.buffer[i10 + 2];
    }

    public final void S(Object obj, long j10, e0 e0Var, f0 f0Var, C2140o c2140o) {
        e0Var.e(this.f19447k.c(obj, j10), f0Var, c2140o);
    }

    public final void T(Object obj, int i10, e0 e0Var, f0 f0Var, C2140o c2140o) {
        e0Var.b(this.f19447k.c(obj, K(i10)), f0Var, c2140o);
    }

    public final void U(Object obj, int i10, e0 e0Var) {
        if (o(i10)) {
            p0.O(obj, K(i10), e0Var.readStringRequireUtf8());
        } else if (this.f19441e) {
            p0.O(obj, K(i10), e0Var.readString());
        } else {
            p0.O(obj, K(i10), e0Var.readBytes());
        }
    }

    public final void V(Object obj, int i10, e0 e0Var) {
        if (o(i10)) {
            e0Var.readStringListRequireUtf8(this.f19447k.c(obj, K(i10)));
        } else {
            e0Var.readStringList(this.f19447k.c(obj, K(i10)));
        }
    }

    public final void X(Object obj, int i10) {
        int R10 = R(i10);
        long j10 = 1048575 & R10;
        if (j10 == 1048575) {
            return;
        }
        p0.M(obj, j10, (1 << (R10 >>> 20)) | p0.w(obj, j10));
    }

    public final void Y(Object obj, int i10, int i11) {
        p0.M(obj, R(i11) & 1048575, i10);
    }

    public final int Z(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int J10 = J(i13);
            if (i10 == J10) {
                return i13;
            }
            if (i10 < J10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, e0 e0Var, C2140o c2140o) {
        c2140o.getClass();
        e(obj);
        z(this.f19448l, this.f19449m, obj, e0Var, c2140o);
    }

    public final void a0(Object obj, int i10, Object obj2) {
        f19436o.putObject(obj, K(d0(i10)), obj2);
        X(obj, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(Object obj, s0 s0Var) {
        if (s0Var.fieldOrder() == s0.a.DESCENDING) {
            f0(obj, s0Var);
        } else {
            e0(obj, s0Var);
        }
    }

    public final void b0(Object obj, int i10, int i11, Object obj2) {
        f19436o.putObject(obj, K(d0(i11)), obj2);
        Y(obj, i10, i11);
    }

    public final boolean c(Object obj, Object obj2, int i10) {
        return p(obj, i10) == p(obj2, i10);
    }

    public final int d0(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(Object obj, s0 s0Var) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i10;
        boolean z10;
        Map.Entry entry2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        T t10 = this;
        if (t10.f19440d) {
            C2143s c10 = t10.f19449m.c(obj);
            if (!c10.j()) {
                Iterator n10 = c10.n();
                entry = (Map.Entry) n10.next();
                it = n10;
                length = t10.buffer.length;
                Unsafe unsafe = f19436o;
                int i14 = 1048575;
                i10 = 0;
                int i15 = 0;
                while (i10 < length) {
                    int d02 = t10.d0(i10);
                    int J10 = t10.J(i10);
                    int c02 = c0(d02);
                    if (c02 <= 17) {
                        int i16 = t10.buffer[i10 + 2];
                        z10 = true;
                        int i17 = i16 & 1048575;
                        if (i17 != i14) {
                            i15 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                            i14 = i17;
                        }
                        int i18 = 1 << (i16 >>> 20);
                        entry2 = entry;
                        i11 = i14;
                        i12 = i15;
                        i13 = i18;
                    } else {
                        z10 = true;
                        entry2 = entry;
                        i11 = i14;
                        i12 = i15;
                        i13 = 0;
                    }
                    while (entry2 != null && t10.f19449m.a(entry2) <= J10) {
                        t10.f19449m.j(s0Var, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long K10 = K(d02);
                    switch (c02) {
                        case 0:
                            if (!t10.q(obj, i10, i11, i12, i13)) {
                                break;
                            } else {
                                s0Var.writeDouble(J10, f(obj, K10));
                                break;
                            }
                        case 1:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeFloat(J10, i(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 2:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeInt64(J10, unsafe.getLong(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 3:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeUInt64(J10, unsafe.getLong(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 4:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeInt32(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 5:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeFixed64(J10, unsafe.getLong(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 6:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeFixed32(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 7:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeBool(J10, d(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 8:
                            if (!t10.q(obj, i10, i11, i12, i13)) {
                                break;
                            } else {
                                t10.h0(J10, unsafe.getObject(obj, K10), s0Var);
                                break;
                            }
                        case 9:
                            if (!t10.q(obj, i10, i11, i12, i13)) {
                                break;
                            } else {
                                s0Var.c(J10, unsafe.getObject(obj, K10), t10.l(i10));
                                break;
                            }
                        case 10:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.b(J10, (AbstractC2132g) unsafe.getObject(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 11:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeUInt32(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 12:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeEnum(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 13:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeSFixed32(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 14:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeSFixed64(J10, unsafe.getLong(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 15:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeSInt32(J10, unsafe.getInt(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 16:
                            if (t10.q(obj, i10, i11, i12, i13)) {
                                s0Var.writeSInt64(J10, unsafe.getLong(obj, K10));
                            }
                            t10 = this;
                            break;
                        case 17:
                            if (!t10.q(obj, i10, i11, i12, i13)) {
                                break;
                            } else {
                                s0Var.e(J10, unsafe.getObject(obj, K10), t10.l(i10));
                                break;
                            }
                        case 18:
                            h0.N(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 19:
                            h0.R(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 20:
                            h0.U(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 21:
                            h0.c0(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 22:
                            h0.T(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 23:
                            h0.Q(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 24:
                            h0.P(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 25:
                            h0.L(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 26:
                            h0.a0(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var);
                            break;
                        case 27:
                            h0.V(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, t10.l(i10));
                            break;
                        case 28:
                            h0.M(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var);
                            break;
                        case 29:
                            z11 = false;
                            h0.b0(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 30:
                            z11 = false;
                            h0.O(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 31:
                            z11 = false;
                            h0.W(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 32:
                            z11 = false;
                            h0.X(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 33:
                            z11 = false;
                            h0.Y(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 34:
                            z11 = false;
                            h0.Z(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, false);
                            break;
                        case 35:
                            h0.N(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 36:
                            h0.R(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 37:
                            h0.U(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 38:
                            h0.c0(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 39:
                            h0.T(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 40:
                            h0.Q(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 41:
                            h0.P(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 42:
                            h0.L(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 43:
                            h0.b0(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 44:
                            h0.O(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 45:
                            h0.W(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 46:
                            h0.X(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 47:
                            h0.Y(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 48:
                            h0.Z(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, z10);
                            break;
                        case 49:
                            h0.S(t10.J(i10), (List) unsafe.getObject(obj, K10), s0Var, t10.l(i10));
                            break;
                        case 50:
                            t10.g0(s0Var, J10, unsafe.getObject(obj, K10), i10);
                            break;
                        case 51:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeDouble(J10, M(obj, K10));
                            }
                            break;
                        case 52:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeFloat(J10, N(obj, K10));
                            }
                            break;
                        case 53:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeInt64(J10, P(obj, K10));
                            }
                            break;
                        case 54:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeUInt64(J10, P(obj, K10));
                            }
                            break;
                        case 55:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeInt32(J10, O(obj, K10));
                            }
                            break;
                        case 56:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeFixed64(J10, P(obj, K10));
                            }
                            break;
                        case 57:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeFixed32(J10, O(obj, K10));
                            }
                            break;
                        case 58:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeBool(J10, L(obj, K10));
                            }
                            break;
                        case 59:
                            if (t10.w(obj, J10, i10)) {
                                t10.h0(J10, unsafe.getObject(obj, K10), s0Var);
                            }
                            break;
                        case 60:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.c(J10, unsafe.getObject(obj, K10), t10.l(i10));
                            }
                            break;
                        case 61:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.b(J10, (AbstractC2132g) unsafe.getObject(obj, K10));
                            }
                            break;
                        case 62:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeUInt32(J10, O(obj, K10));
                            }
                            break;
                        case 63:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeEnum(J10, O(obj, K10));
                            }
                            break;
                        case 64:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeSFixed32(J10, O(obj, K10));
                            }
                            break;
                        case 65:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeSFixed64(J10, P(obj, K10));
                            }
                            break;
                        case 66:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeSInt32(J10, O(obj, K10));
                            }
                            break;
                        case 67:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.writeSInt64(J10, P(obj, K10));
                            }
                            break;
                        case 68:
                            if (t10.w(obj, J10, i10)) {
                                s0Var.e(J10, unsafe.getObject(obj, K10), t10.l(i10));
                            }
                            break;
                    }
                    i10 += 3;
                    i15 = i12;
                    i14 = i11;
                    entry = entry2;
                }
                while (entry != null) {
                    t10.f19449m.j(s0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                t10.i0(t10.f19448l, obj, s0Var);
            }
        }
        entry = null;
        it = null;
        length = t10.buffer.length;
        Unsafe unsafe2 = f19436o;
        int i142 = 1048575;
        i10 = 0;
        int i152 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        t10.i0(t10.f19448l, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!g(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f19448l.g(obj).equals(this.f19448l.g(obj2))) {
            return false;
        }
        if (this.f19440d) {
            return this.f19449m.c(obj).equals(this.f19449m.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(Object obj, s0 s0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        i0(this.f19448l, obj, s0Var);
        if (this.f19440d) {
            C2143s c10 = this.f19449m.c(obj);
            if (!c10.j()) {
                it = c10.e();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int d02 = d0(length);
                    int J10 = J(length);
                    while (entry != null && this.f19449m.a(entry) > J10) {
                        this.f19449m.j(s0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (c0(d02)) {
                        case 0:
                            if (p(obj, length)) {
                                s0Var.writeDouble(J10, f(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (p(obj, length)) {
                                s0Var.writeFloat(J10, i(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (p(obj, length)) {
                                s0Var.writeInt64(J10, y(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (p(obj, length)) {
                                s0Var.writeUInt64(J10, y(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (p(obj, length)) {
                                s0Var.writeInt32(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (p(obj, length)) {
                                s0Var.writeFixed64(J10, y(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (p(obj, length)) {
                                s0Var.writeFixed32(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (p(obj, length)) {
                                s0Var.writeBool(J10, d(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (p(obj, length)) {
                                h0(J10, p0.z(obj, K(d02)), s0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (p(obj, length)) {
                                s0Var.c(J10, p0.z(obj, K(d02)), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (p(obj, length)) {
                                s0Var.b(J10, (AbstractC2132g) p0.z(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (p(obj, length)) {
                                s0Var.writeUInt32(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (p(obj, length)) {
                                s0Var.writeEnum(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (p(obj, length)) {
                                s0Var.writeSFixed32(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (p(obj, length)) {
                                s0Var.writeSFixed64(J10, y(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (p(obj, length)) {
                                s0Var.writeSInt32(J10, n(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (p(obj, length)) {
                                s0Var.writeSInt64(J10, y(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (p(obj, length)) {
                                s0Var.e(J10, p0.z(obj, K(d02)), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            h0.N(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 19:
                            h0.R(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 20:
                            h0.U(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 21:
                            h0.c0(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 22:
                            h0.T(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 23:
                            h0.Q(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 24:
                            h0.P(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 25:
                            h0.L(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 26:
                            h0.a0(J(length), (List) p0.z(obj, K(d02)), s0Var);
                            break;
                        case 27:
                            h0.V(J(length), (List) p0.z(obj, K(d02)), s0Var, l(length));
                            break;
                        case 28:
                            h0.M(J(length), (List) p0.z(obj, K(d02)), s0Var);
                            break;
                        case 29:
                            h0.b0(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 30:
                            h0.O(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 31:
                            h0.W(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 32:
                            h0.X(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 33:
                            h0.Y(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 34:
                            h0.Z(J(length), (List) p0.z(obj, K(d02)), s0Var, false);
                            break;
                        case 35:
                            h0.N(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 36:
                            h0.R(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 37:
                            h0.U(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 38:
                            h0.c0(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 39:
                            h0.T(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 40:
                            h0.Q(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 41:
                            h0.P(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 42:
                            h0.L(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 43:
                            h0.b0(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 44:
                            h0.O(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 45:
                            h0.W(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 46:
                            h0.X(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 47:
                            h0.Y(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 48:
                            h0.Z(J(length), (List) p0.z(obj, K(d02)), s0Var, true);
                            break;
                        case 49:
                            h0.S(J(length), (List) p0.z(obj, K(d02)), s0Var, l(length));
                            break;
                        case 50:
                            g0(s0Var, J10, p0.z(obj, K(d02)), length);
                            break;
                        case 51:
                            if (w(obj, J10, length)) {
                                s0Var.writeDouble(J10, M(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (w(obj, J10, length)) {
                                s0Var.writeFloat(J10, N(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (w(obj, J10, length)) {
                                s0Var.writeInt64(J10, P(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (w(obj, J10, length)) {
                                s0Var.writeUInt64(J10, P(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (w(obj, J10, length)) {
                                s0Var.writeInt32(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (w(obj, J10, length)) {
                                s0Var.writeFixed64(J10, P(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (w(obj, J10, length)) {
                                s0Var.writeFixed32(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (w(obj, J10, length)) {
                                s0Var.writeBool(J10, L(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (w(obj, J10, length)) {
                                h0(J10, p0.z(obj, K(d02)), s0Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (w(obj, J10, length)) {
                                s0Var.c(J10, p0.z(obj, K(d02)), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (w(obj, J10, length)) {
                                s0Var.b(J10, (AbstractC2132g) p0.z(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (w(obj, J10, length)) {
                                s0Var.writeUInt32(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (w(obj, J10, length)) {
                                s0Var.writeEnum(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (w(obj, J10, length)) {
                                s0Var.writeSFixed32(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (w(obj, J10, length)) {
                                s0Var.writeSFixed64(J10, P(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (w(obj, J10, length)) {
                                s0Var.writeSInt32(J10, O(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (w(obj, J10, length)) {
                                s0Var.writeSInt64(J10, P(obj, K(d02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (w(obj, J10, length)) {
                                s0Var.e(J10, p0.z(obj, K(d02)), l(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f19449m.j(s0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    public final boolean g(Object obj, Object obj2, int i10) {
        int d02 = d0(i10);
        long K10 = K(d02);
        switch (c0(d02)) {
            case 0:
                if (!c(obj, obj2, i10) || Double.doubleToLongBits(p0.u(obj, K10)) != Double.doubleToLongBits(p0.u(obj2, K10))) {
                }
                break;
            case 1:
                if (!c(obj, obj2, i10) || Float.floatToIntBits(p0.v(obj, K10)) != Float.floatToIntBits(p0.v(obj2, K10))) {
                }
                break;
            case 2:
                if (!c(obj, obj2, i10) || p0.x(obj, K10) != p0.x(obj2, K10)) {
                }
                break;
            case 3:
                if (!c(obj, obj2, i10) || p0.x(obj, K10) != p0.x(obj2, K10)) {
                }
                break;
            case 4:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 5:
                if (!c(obj, obj2, i10) || p0.x(obj, K10) != p0.x(obj2, K10)) {
                }
                break;
            case 6:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 7:
                if (!c(obj, obj2, i10) || p0.p(obj, K10) != p0.p(obj2, K10)) {
                }
                break;
            case 8:
                if (!c(obj, obj2, i10) || !h0.H(p0.z(obj, K10), p0.z(obj2, K10))) {
                }
                break;
            case 9:
                if (!c(obj, obj2, i10) || !h0.H(p0.z(obj, K10), p0.z(obj2, K10))) {
                }
                break;
            case 10:
                if (!c(obj, obj2, i10) || !h0.H(p0.z(obj, K10), p0.z(obj2, K10))) {
                }
                break;
            case 11:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 12:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 13:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 14:
                if (!c(obj, obj2, i10) || p0.x(obj, K10) != p0.x(obj2, K10)) {
                }
                break;
            case 15:
                if (!c(obj, obj2, i10) || p0.w(obj, K10) != p0.w(obj2, K10)) {
                }
                break;
            case 16:
                if (!c(obj, obj2, i10) || p0.x(obj, K10) != p0.x(obj2, K10)) {
                }
                break;
            case 17:
                if (!c(obj, obj2, i10) || !h0.H(p0.z(obj, K10), p0.z(obj2, K10))) {
                }
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
                if (!v(obj, obj2, i10) || !h0.H(p0.z(obj, K10), p0.z(obj2, K10))) {
                }
                break;
        }
        return true;
    }

    public final void g0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.d(i10, this.f19450n.forMapMetadata(k(i11)), this.f19450n.forMapData(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.f0
    public int getSerializedSize(Object obj) {
        int i10;
        int h10;
        int p10;
        int w10;
        int i11;
        int O10;
        int Q10;
        T t10 = this;
        Object obj2 = obj;
        Unsafe unsafe = f19436o;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < t10.buffer.length) {
            int d02 = t10.d0(i13);
            int c02 = c0(d02);
            int J10 = t10.J(i13);
            int i17 = t10.buffer[i13 + 2];
            int i18 = i17 & i12;
            if (c02 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long K10 = K(d02);
            if (c02 < EnumC2144t.f19632R.a() || c02 > EnumC2144t.f19636V1.a()) {
                i18 = 0;
            }
            switch (c02) {
                case 0:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        h10 = AbstractC2135j.h(J10, 0.0d);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 1:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.p(J10, 0.0f);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 2:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.w(J10, unsafe.getLong(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 3:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.R(J10, unsafe.getLong(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 4:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.u(J10, unsafe.getInt(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 5:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.n(J10, 0L);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 6:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.l(J10, 0);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 7:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.c(J10, true);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 8:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(obj2, K10);
                        w10 = object instanceof AbstractC2132g ? AbstractC2135j.f(J10, (AbstractC2132g) object) : AbstractC2135j.M(J10, (String) object);
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 9:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        h10 = h0.o(J10, unsafe.getObject(obj2, K10), t10.l(i13));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 10:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.f(J10, (AbstractC2132g) unsafe.getObject(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 11:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.P(J10, unsafe.getInt(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 12:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.j(J10, unsafe.getInt(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 13:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.E(J10, 0);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 14:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        p10 = AbstractC2135j.G(J10, 0L);
                        i15 = i19 + p10;
                        t10 = this;
                        obj2 = obj;
                        break;
                    }
                    t10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 15:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.I(J10, unsafe.getInt(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 16:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        w10 = AbstractC2135j.K(J10, unsafe.getLong(obj2, K10));
                        i15 = i19 + w10;
                        t10 = this;
                        break;
                    }
                    t10 = this;
                    i15 = i19;
                    break;
                case 17:
                    if (t10.q(obj2, i13, i16, i14, i10)) {
                        h10 = AbstractC2135j.r(J10, (P) unsafe.getObject(obj2, K10), t10.l(i13));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 18:
                    h10 = h0.h(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 19:
                    h10 = h0.f(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 20:
                    h10 = h0.m(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 21:
                    h10 = h0.x(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 22:
                    h10 = h0.k(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 23:
                    h10 = h0.h(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 24:
                    h10 = h0.f(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 25:
                    h10 = h0.a(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 26:
                    h10 = h0.u(J10, (List) unsafe.getObject(obj2, K10));
                    i15 = i19 + h10;
                    break;
                case 27:
                    h10 = h0.p(J10, (List) unsafe.getObject(obj2, K10), t10.l(i13));
                    i15 = i19 + h10;
                    break;
                case 28:
                    h10 = h0.c(J10, (List) unsafe.getObject(obj2, K10));
                    i15 = i19 + h10;
                    break;
                case 29:
                    h10 = h0.v(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 30:
                    h10 = h0.d(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 31:
                    h10 = h0.f(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 32:
                    h10 = h0.h(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 33:
                    h10 = h0.q(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 34:
                    h10 = h0.s(J10, (List) unsafe.getObject(obj2, K10), false);
                    i15 = i19 + h10;
                    break;
                case 35:
                    i11 = h0.i((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 36:
                    i11 = h0.g((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 37:
                    i11 = h0.n((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 38:
                    i11 = h0.y((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 39:
                    i11 = h0.l((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 40:
                    i11 = h0.i((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 41:
                    i11 = h0.g((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 42:
                    i11 = h0.b((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 43:
                    i11 = h0.w((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 44:
                    i11 = h0.e((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 45:
                    i11 = h0.g((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 46:
                    i11 = h0.i((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 47:
                    i11 = h0.r((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 48:
                    i11 = h0.t((List) unsafe.getObject(obj2, K10));
                    if (i11 > 0) {
                        if (t10.f19443g) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        O10 = AbstractC2135j.O(J10);
                        Q10 = AbstractC2135j.Q(i11);
                        i15 = i19 + O10 + Q10 + i11;
                        break;
                    }
                    i15 = i19;
                    break;
                case 49:
                    h10 = h0.j(J10, (List) unsafe.getObject(obj2, K10), t10.l(i13));
                    i15 = i19 + h10;
                    break;
                case 50:
                    h10 = t10.f19450n.getSerializedSize(J10, unsafe.getObject(obj2, K10), t10.k(i13));
                    i15 = i19 + h10;
                    break;
                case 51:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.h(J10, 0.0d);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 52:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.p(J10, 0.0f);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 53:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.w(J10, P(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 54:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.R(J10, P(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 55:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.u(J10, O(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 56:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.n(J10, 0L);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 57:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.l(J10, 0);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 58:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.c(J10, true);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 59:
                    if (t10.w(obj2, J10, i13)) {
                        Object object2 = unsafe.getObject(obj2, K10);
                        h10 = object2 instanceof AbstractC2132g ? AbstractC2135j.f(J10, (AbstractC2132g) object2) : AbstractC2135j.M(J10, (String) object2);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 60:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = h0.o(J10, unsafe.getObject(obj2, K10), t10.l(i13));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 61:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.f(J10, (AbstractC2132g) unsafe.getObject(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 62:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.P(J10, O(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 63:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.j(J10, O(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 64:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.E(J10, 0);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 65:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.G(J10, 0L);
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 66:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.I(J10, O(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 67:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.K(J10, P(obj2, K10));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                case 68:
                    if (t10.w(obj2, J10, i13)) {
                        h10 = AbstractC2135j.r(J10, (P) unsafe.getObject(obj2, K10), t10.l(i13));
                        i15 = i19 + h10;
                        break;
                    }
                    i15 = i19;
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int m10 = i15 + t10.m(t10.f19448l, obj2);
        return t10.f19440d ? m10 + t10.f19449m.c(obj2).h() : m10;
    }

    public final Object h(Object obj, int i10, Object obj2, m0 m0Var, Object obj3) {
        J(i10);
        if (p0.z(obj, K(d0(i10))) == null) {
            return obj2;
        }
        j(i10);
        return obj2;
    }

    public final void h0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.writeString(i10, (String) obj);
        } else {
            s0Var.b(i10, (AbstractC2132g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int hashCode(Object obj) {
        int i10;
        int f10;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int d02 = d0(i12);
            int J10 = J(i12);
            long K10 = K(d02);
            int i13 = 37;
            switch (c0(d02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(Double.doubleToLongBits(p0.u(obj, K10)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(p0.v(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(p0.x(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(p0.x(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(p0.x(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.c(p0.p(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) p0.z(obj, K10)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object z10 = p0.z(obj, K10);
                    if (z10 != null) {
                        i13 = z10.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = p0.z(obj, K10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(p0.x(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, K10);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = AbstractC2149y.f(p0.x(obj, K10));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object z11 = p0.z(obj, K10);
                    if (z11 != null) {
                        i13 = z11.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
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
                    i10 = i11 * 53;
                    f10 = p0.z(obj, K10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = p0.z(obj, K10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(Double.doubleToLongBits(M(obj, K10)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(N(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(P(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(P(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(P(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.c(L(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) p0.z(obj, K10)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, K10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, K10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(P(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = O(obj, K10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC2149y.f(P(obj, K10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(obj, J10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, K10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f19448l.g(obj).hashCode();
        return this.f19440d ? (hashCode * 53) + this.f19449m.c(obj).hashCode() : hashCode;
    }

    public final void i0(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.t(m0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f19444h) {
            int i15 = this.intArray[i13];
            int J10 = J(i15);
            int d02 = d0(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f19436o.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            Object obj2 = obj;
            if (x(d02) && !q(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int c02 = c0(d02);
            if (c02 != 9 && c02 != 17) {
                if (c02 != 27) {
                    if (c02 == 60 || c02 == 68) {
                        if (w(obj2, J10, i15) && !r(obj2, d02, l(i15))) {
                            return false;
                        }
                    } else if (c02 != 49) {
                        if (c02 == 50 && !t(obj2, d02, i15)) {
                            return false;
                        }
                    }
                }
                if (!s(obj2, d02, i15)) {
                    return false;
                }
            } else if (q(obj2, i15, i10, i11, i18) && !r(obj2, d02, l(i15))) {
                return false;
            }
            i13++;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        return !this.f19440d || this.f19449m.c(obj).k();
    }

    public final AbstractC2149y.a j(int i10) {
        android.support.v4.media.session.b.a(this.objects[((i10 / 3) * 2) + 1]);
        return null;
    }

    public final Object k(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    public final f0 l(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.objects[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0 c10 = b0.a().c((Class) this.objects[i11 + 1]);
        this.objects[i11] = c10;
        return c10;
    }

    public final int m(m0 m0Var, Object obj) {
        return m0Var.h(m0Var.g(obj));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void makeImmutable(Object obj) {
        if (u(obj)) {
            if (obj instanceof AbstractC2147w) {
                AbstractC2147w abstractC2147w = (AbstractC2147w) obj;
                abstractC2147w.i();
                abstractC2147w.h();
                abstractC2147w.A();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int d02 = d0(i10);
                long K10 = K(d02);
                int c02 = c0(d02);
                if (c02 != 9) {
                    if (c02 != 60 && c02 != 68) {
                        switch (c02) {
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
                                this.f19447k.a(obj, K10);
                                break;
                            case 50:
                                Unsafe unsafe = f19436o;
                                Object object = unsafe.getObject(obj, K10);
                                if (object != null) {
                                    unsafe.putObject(obj, K10, this.f19450n.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (w(obj, J(i10), i10)) {
                        l(i10).makeImmutable(f19436o.getObject(obj, K10));
                    }
                }
                if (p(obj, i10)) {
                    l(i10).makeImmutable(f19436o.getObject(obj, K10));
                }
            }
            this.f19448l.j(obj);
            if (this.f19440d) {
                this.f19449m.f(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void mergeFrom(Object obj, Object obj2) {
        e(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            D(obj, obj2, i10);
        }
        h0.F(this.f19448l, obj, obj2);
        if (this.f19440d) {
            h0.D(this.f19449m, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object newInstance() {
        return this.f19446j.newInstance(this.f19439c);
    }

    public final boolean p(Object obj, int i10) {
        boolean equals;
        int R10 = R(i10);
        long j10 = 1048575 & R10;
        if (j10 != 1048575) {
            return (p0.w(obj, j10) & (1 << (R10 >>> 20))) != 0;
        }
        int d02 = d0(i10);
        long K10 = K(d02);
        switch (c0(d02)) {
            case 0:
                return Double.doubleToRawLongBits(p0.u(obj, K10)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.v(obj, K10)) != 0;
            case 2:
                return p0.x(obj, K10) != 0;
            case 3:
                return p0.x(obj, K10) != 0;
            case 4:
                return p0.w(obj, K10) != 0;
            case 5:
                return p0.x(obj, K10) != 0;
            case 6:
                return p0.w(obj, K10) != 0;
            case 7:
                return p0.p(obj, K10);
            case 8:
                Object z10 = p0.z(obj, K10);
                if (z10 instanceof String) {
                    equals = ((String) z10).isEmpty();
                    break;
                } else {
                    if (!(z10 instanceof AbstractC2132g)) {
                        throw new IllegalArgumentException();
                    }
                    equals = AbstractC2132g.f19474b.equals(z10);
                    break;
                }
            case 9:
                return p0.z(obj, K10) != null;
            case 10:
                equals = AbstractC2132g.f19474b.equals(p0.z(obj, K10));
                break;
            case 11:
                return p0.w(obj, K10) != 0;
            case 12:
                return p0.w(obj, K10) != 0;
            case 13:
                return p0.w(obj, K10) != 0;
            case 14:
                return p0.x(obj, K10) != 0;
            case 15:
                return p0.w(obj, K10) != 0;
            case 16:
                return p0.x(obj, K10) != 0;
            case 17:
                return p0.z(obj, K10) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean q(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? p(obj, i10) : (i12 & i13) != 0;
    }

    public final boolean s(Object obj, int i10, int i11) {
        List list = (List) p0.z(obj, K(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 l10 = l(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!l10.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final boolean t(Object obj, int i10, int i11) {
        Map forMapData = this.f19450n.forMapData(p0.z(obj, K(i10)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.f19450n.forMapMetadata(k(i11)).f19430c.a() != r0.c.MESSAGE) {
            return true;
        }
        f0 f0Var = null;
        for (Object obj2 : forMapData.values()) {
            if (f0Var == null) {
                f0Var = b0.a().c(obj2.getClass());
            }
            if (!f0Var.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean v(Object obj, Object obj2, int i10) {
        long R10 = R(i10) & 1048575;
        return p0.w(obj, R10) == p0.w(obj2, R10);
    }

    public final boolean w(Object obj, int i10, int i11) {
        return p0.w(obj, (long) (R(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x00a8, code lost:
    
        r0 = r10.f19444h;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00ad, code lost:
    
        if (r0 >= r10.f19445i) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00af, code lost:
    
        r4 = r10.h(r2, r10.intArray[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00c0, code lost:
    
        if (r4 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06d2 A[Catch: all -> 0x06f3, TRY_LEAVE, TryCatch #7 {all -> 0x06f3, blocks: (B:43:0x06cc, B:45:0x06d2, B:58:0x06f7, B:59:0x06fc), top: B:42:0x06cc }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x072d A[LOOP:4: B:72:0x0729->B:74:0x072d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0740  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(m0 m0Var, AbstractC2141p abstractC2141p, Object obj, e0 e0Var, C2140o c2140o) {
        m0 m0Var2;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        Object obj5;
        m0 m0Var3;
        AbstractC2141p abstractC2141p2;
        Object b10;
        m0 m0Var4;
        Object obj6;
        e0 e0Var2;
        T t10;
        Object obj7;
        Object obj8;
        T t11 = this;
        C2140o c2140o2 = c2140o;
        C2143s c2143s = null;
        Object obj9 = null;
        while (true) {
            try {
                int fieldNumber = e0Var.getFieldNumber();
                int Q10 = t11.Q(fieldNumber);
                if (Q10 >= 0) {
                    obj4 = obj;
                    C2140o c2140o3 = c2140o2;
                    obj5 = obj9;
                    m0Var3 = m0Var;
                    e0 e0Var3 = e0Var;
                    try {
                        int d02 = t11.d0(Q10);
                        try {
                        } catch (C2150z.a unused) {
                            m0Var2 = m0Var3;
                        }
                        switch (c0(d02)) {
                            case 0:
                                p0.K(obj4, K(d02), e0Var3.readDouble());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 1:
                                p0.L(obj4, K(d02), e0Var3.readFloat());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 2:
                                p0.N(obj4, K(d02), e0Var3.readInt64());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 3:
                                p0.N(obj4, K(d02), e0Var3.readUInt64());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 4:
                                p0.M(obj4, K(d02), e0Var3.readInt32());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 5:
                                p0.N(obj4, K(d02), e0Var3.readFixed64());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 6:
                                p0.M(obj4, K(d02), e0Var3.readFixed32());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 7:
                                p0.E(obj4, K(d02), e0Var3.readBool());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 8:
                                t11.U(obj4, d02, e0Var3);
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 9:
                                P p10 = (P) t11.E(obj4, Q10);
                                e0Var3.a(p10, t11.l(Q10), c2140o3);
                                t11.a0(obj4, Q10, p10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 10:
                                p0.O(obj4, K(d02), e0Var3.readBytes());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 11:
                                p0.M(obj4, K(d02), e0Var3.readUInt32());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 12:
                                int readEnum = e0Var3.readEnum();
                                t11.j(Q10);
                                p0.M(obj4, K(d02), readEnum);
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 13:
                                p0.M(obj4, K(d02), e0Var3.readSFixed32());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 14:
                                p0.N(obj4, K(d02), e0Var3.readSFixed64());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 15:
                                p0.M(obj4, K(d02), e0Var3.readSInt32());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 16:
                                p0.N(obj4, K(d02), e0Var3.readSInt64());
                                t11.X(obj4, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 17:
                                P p11 = (P) t11.E(obj4, Q10);
                                e0Var3.d(p11, t11.l(Q10), c2140o3);
                                t11.a0(obj4, Q10, p11);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 18:
                                e0Var3.readDoubleList(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 19:
                                e0Var3.readFloatList(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 20:
                                e0Var3.readInt64List(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 21:
                                e0Var3.readUInt64List(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 22:
                                e0Var3.readInt32List(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 23:
                                e0Var3.readFixed64List(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 24:
                                e0Var3.readFixed32List(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 25:
                                e0Var3.readBoolList(t11.f19447k.c(obj4, K(d02)));
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 26:
                                t11.V(obj4, d02, e0Var3);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 27:
                                m0Var2 = m0Var3;
                                obj2 = obj4;
                                T t12 = t11;
                                try {
                                    c2140o3 = c2140o;
                                } catch (C2150z.a unused2) {
                                    c2140o3 = c2140o;
                                    t11 = t12;
                                    e0Var3 = e0Var3;
                                }
                                try {
                                    t11.T(obj2, d02, e0Var3, t12.l(Q10), c2140o3);
                                    obj9 = obj5;
                                } catch (C2150z.a unused3) {
                                    obj9 = obj5;
                                    try {
                                        if (m0Var2.q(e0Var3)) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i10 = t11.f19444h;
                                        obj3 = obj9;
                                        while (i10 < t11.f19445i) {
                                        }
                                        m0 m0Var5 = m0Var2;
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var52 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 28:
                                e0Var2 = e0Var3;
                                t10 = t11;
                                e0Var2.readBytesList(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 29:
                                e0Var2 = e0Var3;
                                m0Var2 = m0Var3;
                                obj2 = obj4;
                                t10 = t11;
                                try {
                                    try {
                                        e0Var2.readUInt32List(t10.f19447k.c(obj2, K(d02)));
                                        c2140o3 = c2140o;
                                        t11 = t10;
                                        obj9 = obj5;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        t11 = t10;
                                        obj9 = obj5;
                                        i10 = t11.f19444h;
                                        obj3 = obj9;
                                        while (i10 < t11.f19445i) {
                                        }
                                        m0 m0Var522 = m0Var2;
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (C2150z.a unused4) {
                                    c2140o3 = c2140o;
                                    t11 = t10;
                                    obj9 = obj5;
                                    e0Var3 = e0Var2;
                                    if (m0Var2.q(e0Var3)) {
                                        if (obj9 == null) {
                                            obj9 = m0Var2.f(obj2);
                                        }
                                        if (!m0Var2.m(obj9, e0Var3, 0)) {
                                            obj6 = obj9;
                                            for (int i11 = t11.f19444h; i11 < t11.f19445i; i11++) {
                                                obj6 = t11.h(obj2, t11.intArray[i11], obj6, m0Var2, obj);
                                            }
                                            if (obj6 == null) {
                                                return;
                                            }
                                            m0Var2.o(obj2, obj6);
                                        }
                                        c2140o2 = c2140o3;
                                    } else {
                                        if (!e0Var3.skipField()) {
                                            obj6 = obj9;
                                            for (int i12 = t11.f19444h; i12 < t11.f19445i; i12++) {
                                                obj6 = t11.h(obj2, t11.intArray[i12], obj6, m0Var2, obj);
                                            }
                                            if (obj6 == null) {
                                                return;
                                            }
                                            m0Var2.o(obj2, obj6);
                                        }
                                        c2140o2 = c2140o3;
                                    }
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 30:
                                t10 = t11;
                                obj2 = obj4;
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                try {
                                    List c10 = t10.f19447k.c(obj2, K(d02));
                                    e0Var2.readEnumList(c10);
                                    t10.j(Q10);
                                    obj7 = obj2;
                                    try {
                                        obj9 = h0.z(obj7, fieldNumber, c10, null, obj9, m0Var);
                                        c2140o3 = c2140o;
                                        t11 = t10;
                                    } catch (C2150z.a unused5) {
                                        m0Var2 = m0Var;
                                        c2140o3 = c2140o;
                                        obj2 = obj7;
                                        t11 = t10;
                                        e0Var3 = e0Var2;
                                        if (m0Var2.q(e0Var3)) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj7;
                                        m0Var2 = m0Var;
                                        t11 = t10;
                                        i10 = t11.f19444h;
                                        obj3 = obj9;
                                        while (i10 < t11.f19445i) {
                                        }
                                        m0 m0Var5222 = m0Var2;
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (C2150z.a unused6) {
                                    m0Var2 = m0Var;
                                    c2140o3 = c2140o;
                                    t11 = t10;
                                    e0Var3 = e0Var2;
                                    if (m0Var2.q(e0Var3)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    m0Var2 = m0Var;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 31:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readSFixed32List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 32:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readSFixed64List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 33:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readSInt32List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 34:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readSInt64List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 35:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readDoubleList(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 36:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readFloatList(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 37:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readInt64List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 38:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readUInt64List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 39:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readInt32List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 40:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readFixed64List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 41:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readFixed32List(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 42:
                                e0Var2 = e0Var3;
                                obj9 = obj5;
                                t10 = t11;
                                e0Var2.readBoolList(t10.f19447k.c(obj4, K(d02)));
                                c2140o3 = c2140o;
                                obj5 = obj9;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 43:
                                e0Var2 = e0Var3;
                                obj2 = obj4;
                                obj9 = obj5;
                                t10 = t11;
                                try {
                                    e0Var2.readUInt32List(t10.f19447k.c(obj2, K(d02)));
                                    c2140o3 = c2140o;
                                    obj5 = obj9;
                                    t11 = t10;
                                    obj9 = obj5;
                                } catch (C2150z.a unused7) {
                                    m0Var2 = m0Var;
                                    c2140o3 = c2140o;
                                    t11 = t10;
                                    e0Var3 = e0Var2;
                                    if (m0Var2.q(e0Var3)) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    m0Var2 = m0Var;
                                    t11 = t10;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var52222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 44:
                                t10 = t11;
                                obj7 = obj4;
                                e0Var2 = e0Var3;
                                try {
                                    List c11 = t10.f19447k.c(obj7, K(d02));
                                    e0Var2.readEnumList(c11);
                                    t10.j(Q10);
                                    obj9 = obj5;
                                    try {
                                        obj9 = h0.z(obj7, fieldNumber, c11, null, obj9, m0Var3);
                                        c2140o3 = c2140o;
                                        t11 = t10;
                                    } catch (C2150z.a unused8) {
                                        m0Var2 = m0Var;
                                        c2140o3 = c2140o;
                                        obj2 = obj7;
                                        t11 = t10;
                                        e0Var3 = e0Var2;
                                        if (m0Var2.q(e0Var3)) {
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = obj7;
                                        m0Var2 = m0Var;
                                        t11 = t10;
                                        i10 = t11.f19444h;
                                        obj3 = obj9;
                                        while (i10 < t11.f19445i) {
                                        }
                                        m0 m0Var522222 = m0Var2;
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (C2150z.a unused9) {
                                    obj9 = obj5;
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj2 = obj7;
                                    obj9 = obj5;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 45:
                                t10 = t11;
                                obj8 = obj4;
                                e0Var2 = e0Var3;
                                e0Var2.readSFixed32List(t10.f19447k.c(obj8, K(d02)));
                                c2140o3 = c2140o;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 46:
                                t10 = t11;
                                obj8 = obj4;
                                e0Var2 = e0Var3;
                                e0Var2.readSFixed64List(t10.f19447k.c(obj8, K(d02)));
                                c2140o3 = c2140o;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 47:
                                t10 = t11;
                                obj8 = obj4;
                                e0Var2 = e0Var3;
                                e0Var2.readSInt32List(t10.f19447k.c(obj8, K(d02)));
                                c2140o3 = c2140o;
                                t11 = t10;
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 48:
                                t10 = t11;
                                obj8 = obj4;
                                e0Var2 = e0Var3;
                                m0Var2 = m0Var3;
                                try {
                                    e0Var2.readSInt64List(t10.f19447k.c(obj8, K(d02)));
                                    c2140o3 = c2140o;
                                    t11 = t10;
                                    obj9 = obj5;
                                } catch (C2150z.a unused10) {
                                    c2140o3 = c2140o;
                                    obj2 = obj8;
                                    t11 = t10;
                                    obj9 = obj5;
                                    e0Var3 = e0Var2;
                                    if (m0Var2.q(e0Var3)) {
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj2 = obj8;
                                    t11 = t10;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var5222222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 49:
                                m0Var2 = m0Var3;
                                try {
                                    obj2 = obj;
                                } catch (Throwable th11) {
                                    th = th11;
                                    t10 = t11;
                                    obj8 = obj;
                                    obj2 = obj8;
                                    t11 = t10;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var52222222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    t11.S(obj2, K(d02), e0Var, t11.l(Q10), c2140o);
                                    t10 = t11;
                                    obj8 = obj2;
                                    e0Var2 = e0Var;
                                    c2140o3 = c2140o;
                                    t11 = t10;
                                    obj9 = obj5;
                                } catch (C2150z.a unused11) {
                                    c2140o3 = c2140o;
                                    e0Var3 = e0Var;
                                    obj9 = obj5;
                                    if (m0Var2.q(e0Var3)) {
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    t10 = t11;
                                    t11 = t10;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var522222222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c2140o2 = c2140o3;
                                break;
                            case 50:
                                m0Var2 = m0Var3;
                                try {
                                    try {
                                        t11.A(obj4, Q10, t11.k(Q10), c2140o3, e0Var);
                                        c2140o3 = c2140o;
                                        obj9 = obj5;
                                    } catch (C2150z.a unused12) {
                                        obj2 = obj;
                                        e0Var3 = e0Var;
                                        c2140o3 = c2140o;
                                        obj9 = obj5;
                                        if (m0Var2.q(e0Var3)) {
                                        }
                                    }
                                    c2140o2 = c2140o3;
                                } catch (Throwable th13) {
                                    th = th13;
                                    obj2 = obj;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var5222222222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 51:
                                p0.O(obj4, K(d02), Double.valueOf(e0Var3.readDouble()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 52:
                                p0.O(obj4, K(d02), Float.valueOf(e0Var3.readFloat()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 53:
                                p0.O(obj4, K(d02), Long.valueOf(e0Var3.readInt64()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 54:
                                p0.O(obj4, K(d02), Long.valueOf(e0Var3.readUInt64()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 55:
                                p0.O(obj4, K(d02), Integer.valueOf(e0Var3.readInt32()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 56:
                                p0.O(obj4, K(d02), Long.valueOf(e0Var3.readFixed64()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 57:
                                p0.O(obj4, K(d02), Integer.valueOf(e0Var3.readFixed32()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 58:
                                p0.O(obj4, K(d02), Boolean.valueOf(e0Var3.readBool()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 59:
                                t11.U(obj4, d02, e0Var3);
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 60:
                                P p12 = (P) t11.F(obj4, fieldNumber, Q10);
                                e0Var3.a(p12, t11.l(Q10), c2140o3);
                                t11.b0(obj4, fieldNumber, Q10, p12);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 61:
                                p0.O(obj4, K(d02), e0Var3.readBytes());
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 62:
                                p0.O(obj4, K(d02), Integer.valueOf(e0Var3.readUInt32()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 63:
                                int readEnum2 = e0Var3.readEnum();
                                t11.j(Q10);
                                p0.O(obj4, K(d02), Integer.valueOf(readEnum2));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 64:
                                p0.O(obj4, K(d02), Integer.valueOf(e0Var3.readSFixed32()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 65:
                                p0.O(obj4, K(d02), Long.valueOf(e0Var3.readSFixed64()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 66:
                                p0.O(obj4, K(d02), Integer.valueOf(e0Var3.readSInt32()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 67:
                                p0.O(obj4, K(d02), Long.valueOf(e0Var3.readSInt64()));
                                t11.Y(obj4, fieldNumber, Q10);
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                            case 68:
                                m0Var2 = m0Var3;
                                try {
                                    P p13 = (P) t11.F(obj4, fieldNumber, Q10);
                                    e0Var3.d(p13, t11.l(Q10), c2140o3);
                                    t11.b0(obj4, fieldNumber, Q10, p13);
                                    obj9 = obj5;
                                } catch (C2150z.a unused13) {
                                    obj2 = obj4;
                                    obj9 = obj5;
                                    if (m0Var2.q(e0Var3)) {
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    obj2 = obj4;
                                    obj9 = obj5;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                    }
                                    m0 m0Var52222222222 = m0Var2;
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c2140o2 = c2140o3;
                                break;
                            default:
                                if (obj5 == null) {
                                    obj5 = m0Var3.f(obj4);
                                }
                                if (!m0Var3.m(obj5, e0Var3, 0)) {
                                    Object obj10 = obj5;
                                    for (int i13 = t11.f19444h; i13 < t11.f19445i; i13++) {
                                        obj10 = t11.h(obj4, t11.intArray[i13], obj10, m0Var3, obj);
                                    }
                                    if (obj10 != null) {
                                        m0Var3.o(obj4, obj10);
                                        return;
                                    }
                                    return;
                                }
                                obj9 = obj5;
                                c2140o2 = c2140o3;
                                break;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        m0Var2 = m0Var3;
                        obj2 = obj4;
                        obj9 = obj5;
                        i10 = t11.f19444h;
                        obj3 = obj9;
                        while (i10 < t11.f19445i) {
                        }
                        m0 m0Var522222222222 = m0Var2;
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        int i14 = t11.f19444h;
                        Object obj11 = obj9;
                        while (i14 < t11.f19445i) {
                            obj11 = t11.h(obj, t11.intArray[i14], obj11, m0Var, obj);
                            i14++;
                            t11 = t11;
                        }
                        if (obj11 != null) {
                            m0Var.o(obj, obj11);
                        }
                        return;
                    }
                    T t13 = t11;
                    try {
                        if (t13.f19440d) {
                            abstractC2141p2 = abstractC2141p;
                            b10 = abstractC2141p2.b(c2140o2, t13.f19439c, fieldNumber);
                        } else {
                            abstractC2141p2 = abstractC2141p;
                            b10 = null;
                        }
                        if (b10 != null) {
                            if (c2143s == null) {
                                try {
                                    c2143s = abstractC2141p.d(obj);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj;
                                    m0Var2 = m0Var;
                                    t11 = t13;
                                    i10 = t11.f19444h;
                                    obj3 = obj9;
                                    while (i10 < t11.f19445i) {
                                        obj3 = t11.h(obj2, t11.intArray[i10], obj3, m0Var2, obj);
                                        i10++;
                                        t11 = this;
                                    }
                                    m0 m0Var5222222222222 = m0Var2;
                                    if (obj3 != null) {
                                        m0Var5222222222222.o(obj2, obj3);
                                    }
                                    throw th;
                                }
                            }
                            Object obj12 = obj9;
                            C2143s c2143s2 = c2143s;
                            try {
                                c2143s = c2143s2;
                                obj9 = abstractC2141p2.g(obj, e0Var, b10, c2140o2, c2143s2, obj12, m0Var);
                                c2140o2 = c2140o2;
                                t11 = t13;
                            } catch (Throwable th17) {
                                th = th17;
                                obj2 = obj;
                                obj5 = obj12;
                                m0Var4 = m0Var;
                                m0Var2 = m0Var4;
                                t11 = t13;
                                obj9 = obj5;
                                i10 = t11.f19444h;
                                obj3 = obj9;
                                while (i10 < t11.f19445i) {
                                }
                                m0 m0Var52222222222222 = m0Var2;
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            obj5 = obj9;
                            m0Var4 = m0Var;
                            C2140o c2140o4 = c2140o2;
                            try {
                                if (m0Var4.q(e0Var)) {
                                    try {
                                        if (!e0Var.skipField()) {
                                        }
                                        c2140o2 = c2140o4;
                                        t11 = t13;
                                        obj9 = obj5;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        m0Var2 = m0Var4;
                                        t11 = t13;
                                        obj9 = obj5;
                                        i10 = t11.f19444h;
                                        obj3 = obj9;
                                        while (i10 < t11.f19445i) {
                                        }
                                        m0 m0Var522222222222222 = m0Var2;
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (obj5 == null) {
                                        obj5 = m0Var4.f(obj2);
                                    }
                                    if (!m0Var4.m(obj5, e0Var, 0)) {
                                    }
                                    c2140o2 = c2140o4;
                                    t11 = t13;
                                    obj9 = obj5;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                t11 = t13;
                                m0Var2 = m0Var4;
                                obj9 = obj5;
                                i10 = t11.f19444h;
                                obj3 = obj9;
                                while (i10 < t11.f19445i) {
                                }
                                m0 m0Var5222222222222222 = m0Var2;
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        obj4 = obj;
                        obj5 = obj9;
                        m0Var3 = m0Var;
                        t11 = t13;
                        m0Var2 = m0Var3;
                        obj2 = obj4;
                        obj9 = obj5;
                        i10 = t11.f19444h;
                        obj3 = obj9;
                        while (i10 < t11.f19445i) {
                        }
                        m0 m0Var52222222222222222 = m0Var2;
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th21) {
                th = th21;
                m0Var2 = m0Var;
                obj2 = obj;
            }
        }
        m0Var2.o(obj2, obj6);
    }
}
