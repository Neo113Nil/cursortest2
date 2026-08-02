package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC3473e;
import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class S implements e0 {
    private static final int[] EMPTY_INT_ARRAY = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f37246o = o0.D();

    /* renamed from: a, reason: collision with root package name */
    public final int f37247a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37248b;
    private final int[] buffer;

    /* renamed from: c, reason: collision with root package name */
    public final O f37249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37250d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37252f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37253g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37254h;

    /* renamed from: i, reason: collision with root package name */
    public final int f37255i;
    private final int[] intArray;

    /* renamed from: j, reason: collision with root package name */
    public final U f37256j;

    /* renamed from: k, reason: collision with root package name */
    public final E f37257k;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f37258l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3485q f37259m;

    /* renamed from: n, reason: collision with root package name */
    public final J f37260n;
    private final Object[] objects;

    public S(int[] iArr, Object[] objArr, int i10, int i11, O o10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, U u10, E e10, k0 k0Var, AbstractC3485q abstractC3485q, J j10) {
        this.buffer = iArr;
        this.objects = objArr;
        this.f37247a = i10;
        this.f37248b = i11;
        this.f37251e = o10 instanceof AbstractC3491x;
        this.f37252f = z10;
        this.f37250d = abstractC3485q != null && abstractC3485q.e(o10);
        this.f37253g = z11;
        this.intArray = iArr2;
        this.f37254h = i12;
        this.f37255i = i13;
        this.f37256j = u10;
        this.f37257k = e10;
        this.f37258l = k0Var;
        this.f37259m = abstractC3485q;
        this.f37249c = o10;
        this.f37260n = j10;
    }

    public static boolean C(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static List D(Object obj, long j10) {
        return (List) o0.C(obj, j10);
    }

    public static long E(Object obj, long j10) {
        return o0.A(obj, j10);
    }

    public static S M(Class cls, M m10, U u10, E e10, k0 k0Var, AbstractC3485q abstractC3485q, J j10) {
        if (m10 instanceof c0) {
            return O((c0) m10, u10, e10, k0Var, abstractC3485q, j10);
        }
        android.support.v4.media.session.b.a(m10);
        return N(null, u10, e10, k0Var, abstractC3485q, j10);
    }

    public static S N(h0 h0Var, U u10, E e10, k0 k0Var, AbstractC3485q abstractC3485q, J j10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static S O(c0 c0Var, U u10, E e10, k0 k0Var, AbstractC3485q abstractC3485q, J j10) {
        int i10;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        char charAt10;
        int i20;
        char charAt11;
        int i21;
        char charAt12;
        int i22;
        int i23;
        int i24;
        int objectFieldOffset;
        String str;
        int i25;
        int i26;
        int i27;
        int i28;
        Field i02;
        char charAt13;
        int i29;
        Object obj;
        Field i03;
        Object obj2;
        Field i04;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        int i33;
        char charAt17;
        boolean z10 = c0Var.getSyntax() == Z.PROTO3;
        String b10 = c0Var.b();
        int length = b10.length();
        char c10 = 55296;
        if (b10.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i10 = i34 + 1;
                if (b10.charAt(i34) < 55296) {
                    break;
                }
                i34 = i10;
            }
        } else {
            i10 = 1;
        }
        int i35 = i10 + 1;
        int charAt18 = b10.charAt(i10);
        if (charAt18 >= 55296) {
            int i36 = charAt18 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt17 = b10.charAt(i35);
                if (charAt17 < 55296) {
                    break;
                }
                i36 |= (charAt17 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt18 = i36 | (charAt17 << i37);
            i35 = i33;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i12 = 0;
            charAt4 = 0;
            i11 = 0;
            iArr = EMPTY_INT_ARRAY;
            i13 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt19 = b10.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i21 = i38 + 1;
                    charAt12 = b10.charAt(i38);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i39 |= (charAt12 & 8191) << i40;
                    i40 += 13;
                    i38 = i21;
                }
                charAt19 = i39 | (charAt12 << i40);
                i38 = i21;
            }
            int i41 = i38 + 1;
            int charAt20 = b10.charAt(i38);
            if (charAt20 >= 55296) {
                int i42 = charAt20 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    charAt11 = b10.charAt(i41);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i42 |= (charAt11 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                charAt20 = i42 | (charAt11 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            charAt = b10.charAt(i41);
            if (charAt >= 55296) {
                int i45 = charAt & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    charAt10 = b10.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                charAt = i45 | (charAt10 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            charAt2 = b10.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    charAt9 = b10.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                charAt2 = i48 | (charAt9 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            charAt3 = b10.charAt(i47);
            if (charAt3 >= 55296) {
                int i51 = charAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    charAt8 = b10.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                charAt3 = i51 | (charAt8 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            int charAt21 = b10.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    charAt7 = b10.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                charAt21 = i54 | (charAt7 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            int charAt22 = b10.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    charAt6 = b10.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                charAt22 = i57 | (charAt6 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            charAt4 = b10.charAt(i56);
            if (charAt4 >= 55296) {
                int i60 = charAt4 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    charAt5 = b10.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                charAt4 = i60 | (charAt5 << i61);
                i59 = i14;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i11 = (charAt19 * 2) + charAt20;
            i12 = charAt21;
            iArr = iArr2;
            i13 = charAt19;
            i35 = i59;
        }
        Unsafe unsafe = f37246o;
        Object[] a10 = c0Var.a();
        Class<?> cls = c0Var.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i62 = i12 + charAt4;
        int i63 = i62;
        int i64 = charAt4;
        int i65 = 0;
        int i66 = 0;
        while (i35 < length) {
            int i67 = i35 + 1;
            int charAt23 = b10.charAt(i35);
            if (charAt23 >= c10) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i32 = i69 + 1;
                    charAt16 = b10.charAt(i69);
                    if (charAt16 < c10) {
                        break;
                    }
                    i68 |= (charAt16 & 8191) << i70;
                    i70 += 13;
                    i69 = i32;
                }
                charAt23 = i68 | (charAt16 << i70);
                i22 = i32;
            } else {
                i22 = i67;
            }
            int i71 = i22 + 1;
            int charAt24 = b10.charAt(i22);
            if (charAt24 >= c10) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i31 = i73 + 1;
                    charAt15 = b10.charAt(i73);
                    i23 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i72 |= (charAt15 & 8191) << i74;
                    i74 += 13;
                    i73 = i31;
                    length = i23;
                }
                charAt24 = i72 | (charAt15 << i74);
                i24 = i31;
            } else {
                i23 = length;
                i24 = i71;
            }
            int i75 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i76 = charAt23;
            if (i75 >= 51) {
                int i77 = i24 + 1;
                int charAt25 = b10.charAt(i24);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = 13;
                    while (true) {
                        i30 = i77 + 1;
                        charAt14 = b10.charAt(i77);
                        if (charAt14 < c11) {
                            break;
                        }
                        i78 |= (charAt14 & 8191) << i79;
                        i79 += 13;
                        i77 = i30;
                        c11 = 55296;
                    }
                    charAt25 = i78 | (charAt14 << i79);
                    i77 = i30;
                }
                int i80 = i75 - 51;
                int i81 = charAt25;
                if (i80 == 9 || i80 == 17) {
                    i29 = i11 + 1;
                    objArr[((i66 / 3) * 2) + 1] = a10[i11];
                } else {
                    if (i80 == 12 && !z10) {
                        i29 = i11 + 1;
                        objArr[((i66 / 3) * 2) + 1] = a10[i11];
                    }
                    int i82 = i81 * 2;
                    obj = a10[i82];
                    if (obj instanceof Field) {
                        i03 = i0(cls, (String) obj);
                        a10[i82] = i03;
                    } else {
                        i03 = (Field) obj;
                    }
                    int i83 = i77;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(i03);
                    int i84 = i82 + 1;
                    obj2 = a10[i84];
                    if (obj2 instanceof Field) {
                        i04 = i0(cls, (String) obj2);
                        a10[i84] = i04;
                    } else {
                        i04 = (Field) obj2;
                    }
                    str = b10;
                    i25 = (int) unsafe.objectFieldOffset(i04);
                    i35 = i83;
                    i28 = objectFieldOffset2;
                    i27 = 0;
                }
                i11 = i29;
                int i822 = i81 * 2;
                obj = a10[i822];
                if (obj instanceof Field) {
                }
                int i832 = i77;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(i03);
                int i842 = i822 + 1;
                obj2 = a10[i842];
                if (obj2 instanceof Field) {
                }
                str = b10;
                i25 = (int) unsafe.objectFieldOffset(i04);
                i35 = i832;
                i28 = objectFieldOffset22;
                i27 = 0;
            } else {
                int i85 = i11 + 1;
                Field i05 = i0(cls, (String) a10[i11]);
                if (i75 == 9 || i75 == 17) {
                    objArr[((i66 / 3) * 2) + 1] = i05.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i11 += 2;
                        objArr[((i66 / 3) * 2) + 1] = a10[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        if (!z10) {
                            i11 += 2;
                            objArr[((i66 / 3) * 2) + 1] = a10[i85];
                        }
                    } else if (i75 == 50) {
                        int i86 = i64 + 1;
                        iArr[i64] = i66;
                        int i87 = (i66 / 3) * 2;
                        int i88 = i11 + 2;
                        objArr[i87] = a10[i85];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i87 + 1] = a10[i88];
                            i11 += 3;
                        } else {
                            i11 = i88;
                        }
                        i64 = i86;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(i05);
                    if ((charAt24 & 4096) == 4096 || i75 > 17) {
                        str = b10;
                        i25 = 1048575;
                        i26 = i24;
                        i27 = 0;
                    } else {
                        int i89 = i24 + 1;
                        int charAt26 = b10.charAt(i24);
                        if (charAt26 >= 55296) {
                            int i90 = charAt26 & 8191;
                            int i91 = 13;
                            while (true) {
                                i26 = i89 + 1;
                                charAt13 = b10.charAt(i89);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i90 |= (charAt13 & 8191) << i91;
                                i91 += 13;
                                i89 = i26;
                            }
                            charAt26 = i90 | (charAt13 << i91);
                        } else {
                            i26 = i89;
                        }
                        int i92 = (i13 * 2) + (charAt26 / 32);
                        Object obj3 = a10[i92];
                        str = b10;
                        if (obj3 instanceof Field) {
                            i02 = (Field) obj3;
                        } else {
                            i02 = i0(cls, (String) obj3);
                            a10[i92] = i02;
                        }
                        i25 = (int) unsafe.objectFieldOffset(i02);
                        i27 = charAt26 % 32;
                    }
                    if (i75 >= 18 && i75 <= 49) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                    i28 = objectFieldOffset;
                    i35 = i26;
                }
                i11 = i85;
                objectFieldOffset = (int) unsafe.objectFieldOffset(i05);
                if ((charAt24 & 4096) == 4096) {
                }
                str = b10;
                i25 = 1048575;
                i26 = i24;
                i27 = 0;
                if (i75 >= 18) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i28 = objectFieldOffset;
                i35 = i26;
            }
            int i93 = i66 + 1;
            iArr4[i66] = i76;
            int i94 = i66 + 2;
            int i95 = i25;
            iArr4[i93] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i75 << 20) | i28;
            i66 += 3;
            iArr4[i94] = (i27 << 20) | i95;
            iArr3 = iArr4;
            length = i23;
            b10 = str;
            c10 = 55296;
        }
        return new S(iArr3, objArr, charAt, charAt2, c0Var.getDefaultInstance(), z10, false, iArr, charAt4, i62, u10, e10, k0Var, abstractC3485q, j10);
    }

    public static long Q(int i10) {
        return i10 & 1048575;
    }

    public static boolean R(Object obj, long j10) {
        return ((Boolean) o0.C(obj, j10)).booleanValue();
    }

    public static double S(Object obj, long j10) {
        return ((Double) o0.C(obj, j10)).doubleValue();
    }

    public static float T(Object obj, long j10) {
        return ((Float) o0.C(obj, j10)).floatValue();
    }

    public static int U(Object obj, long j10) {
        return ((Integer) o0.C(obj, j10)).intValue();
    }

    public static long V(Object obj, long j10) {
        return ((Long) o0.C(obj, j10)).longValue();
    }

    public static boolean e(Object obj, long j10) {
        return o0.r(obj, j10);
    }

    public static void f(Object obj) {
        if (z(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double h(Object obj, long j10) {
        return o0.x(obj, j10);
    }

    public static Field i0(Class cls, String str) {
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

    public static float k(Object obj, long j10) {
        return o0.y(obj, j10);
    }

    public static l0 o(Object obj) {
        AbstractC3491x abstractC3491x = (AbstractC3491x) obj;
        l0 l0Var = abstractC3491x.unknownFields;
        if (l0Var != l0.c()) {
            return l0Var;
        }
        l0 k10 = l0.k();
        abstractC3491x.unknownFields = k10;
        return k10;
    }

    public static int o0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static int s(Object obj, long j10) {
        return o0.z(obj, j10);
    }

    public static boolean t(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public static boolean w(Object obj, int i10, e0 e0Var) {
        return e0Var.isInitialized(o0.C(obj, Q(i10)));
    }

    public static boolean z(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC3491x) {
            return ((AbstractC3491x) obj).x();
        }
        return true;
    }

    public final boolean A(Object obj, Object obj2, int i10) {
        long d02 = d0(i10) & 1048575;
        return o0.z(obj, d02) == o0.z(obj2, d02);
    }

    public final boolean B(Object obj, int i10, int i11) {
        return o0.z(obj, (long) (d0(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x00a4, code lost:
    
        r0 = r9.f37254h;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x00a9, code lost:
    
        if (r0 >= r9.f37255i) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x00ab, code lost:
    
        r1 = r9;
        r4 = r1.j(r2, r9.intArray[r0], r4, r17, r19);
        r6 = r17;
        r0 = r0 + 1;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x00c0, code lost:
    
        if (r4 == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x00c2, code lost:
    
        r6.o(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06f9 A[Catch: all -> 0x071d, TRY_LEAVE, TryCatch #37 {all -> 0x071d, blocks: (B:38:0x06f3, B:40:0x06f9), top: B:37:0x06f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x075d A[LOOP:4: B:69:0x0759->B:71:0x075d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0771  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(k0 k0Var, AbstractC3485q abstractC3485q, Object obj, d0 d0Var, C3484p c3484p) {
        k0 k0Var2;
        Object obj2;
        int i10;
        Object obj3;
        AbstractC3485q abstractC3485q2;
        Object b10;
        Object obj4;
        C3484p c3484p2;
        k0 k0Var3;
        Object obj5;
        S s10;
        d0 d0Var2;
        Object obj6;
        Object obj7;
        Object obj8;
        S s11 = this;
        C3484p c3484p3 = c3484p;
        Object obj9 = null;
        while (true) {
            try {
                int fieldNumber = d0Var.getFieldNumber();
                int b02 = s11.b0(fieldNumber);
                if (b02 >= 0) {
                    k0Var2 = k0Var;
                    Object obj10 = obj;
                    C3484p c3484p4 = c3484p3;
                    obj4 = obj9;
                    d0 d0Var3 = d0Var;
                    try {
                        int p02 = s11.p0(b02);
                        try {
                        } catch (A.a unused) {
                            obj2 = obj10;
                            k0Var3 = k0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj10;
                        }
                        switch (o0(p02)) {
                            case 0:
                                k0Var3 = k0Var2;
                                o0.N(obj10, Q(p02), d0Var3.readDouble());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 1:
                                k0Var3 = k0Var2;
                                o0.O(obj10, Q(p02), d0Var3.readFloat());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 2:
                                k0Var3 = k0Var2;
                                o0.Q(obj10, Q(p02), d0Var3.readInt64());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 3:
                                k0Var3 = k0Var2;
                                o0.Q(obj10, Q(p02), d0Var3.readUInt64());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 4:
                                k0Var3 = k0Var2;
                                o0.P(obj10, Q(p02), d0Var3.readInt32());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 5:
                                k0Var3 = k0Var2;
                                o0.Q(obj10, Q(p02), d0Var3.readFixed64());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 6:
                                k0Var3 = k0Var2;
                                o0.P(obj10, Q(p02), d0Var3.readFixed32());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 7:
                                k0Var3 = k0Var2;
                                o0.H(obj10, Q(p02), d0Var3.readBool());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 8:
                                k0Var3 = k0Var2;
                                s11.g0(obj10, p02, d0Var3);
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 9:
                                k0Var3 = k0Var2;
                                O o10 = (O) s11.K(obj10, b02);
                                d0Var3.c(o10, s11.n(b02), c3484p4);
                                s11.m0(obj10, b02, o10);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 10:
                                k0Var3 = k0Var2;
                                o0.R(obj10, Q(p02), d0Var3.readBytes());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 11:
                                k0Var3 = k0Var2;
                                o0.P(obj10, Q(p02), d0Var3.readUInt32());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 12:
                                k0Var3 = k0Var2;
                                int readEnum = d0Var3.readEnum();
                                s11.l(b02);
                                o0.P(obj10, Q(p02), readEnum);
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 13:
                                k0Var3 = k0Var2;
                                o0.P(obj10, Q(p02), d0Var3.readSFixed32());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 14:
                                k0Var3 = k0Var2;
                                o0.Q(obj10, Q(p02), d0Var3.readSFixed64());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 15:
                                k0Var3 = k0Var2;
                                o0.P(obj10, Q(p02), d0Var3.readSInt32());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 16:
                                k0Var3 = k0Var2;
                                o0.Q(obj10, Q(p02), d0Var3.readSInt64());
                                s11.j0(obj10, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 17:
                                k0Var3 = k0Var2;
                                O o11 = (O) s11.K(obj10, b02);
                                d0Var3.a(o11, s11.n(b02), c3484p4);
                                s11.m0(obj10, b02, o11);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 18:
                                k0Var3 = k0Var2;
                                d0Var3.readDoubleList(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 19:
                                k0Var3 = k0Var2;
                                d0Var3.readFloatList(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 20:
                                k0Var3 = k0Var2;
                                d0Var3.readInt64List(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 21:
                                k0Var3 = k0Var2;
                                d0Var3.readUInt64List(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 22:
                                k0Var3 = k0Var2;
                                d0Var3.readInt32List(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 23:
                                k0Var3 = k0Var2;
                                d0Var3.readFixed64List(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 24:
                                k0Var3 = k0Var2;
                                d0Var3.readFixed32List(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 25:
                                k0Var3 = k0Var2;
                                d0Var3.readBoolList(s11.f37257k.e(obj10, Q(p02)));
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 26:
                                obj2 = obj10;
                                k0Var3 = k0Var2;
                                try {
                                    s11.h0(obj2, p02, d0Var3);
                                    obj9 = obj4;
                                } catch (A.a unused2) {
                                    obj9 = obj4;
                                    try {
                                        if (k0Var3.q(d0Var3)) {
                                        }
                                        k0Var2.o(obj2, obj5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        k0Var2 = k0Var3;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 27:
                                S s12 = s11;
                                obj2 = obj10;
                                k0Var3 = k0Var2;
                                try {
                                } catch (A.a unused3) {
                                    s11 = s12;
                                    d0Var3 = d0Var3;
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                }
                                try {
                                    try {
                                        s11.f0(obj2, p02, d0Var3, s12.n(b02), c3484p);
                                        c3484p4 = c3484p;
                                        obj9 = obj4;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        k0Var2 = k0Var3;
                                        obj9 = obj4;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (A.a unused4) {
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 28:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                k0Var3 = k0Var2;
                                d0Var2.readBytesList(s10.f37257k.e(obj10, Q(p02)));
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 29:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj2 = obj10;
                                k0Var3 = k0Var2;
                                try {
                                    try {
                                        d0Var2.readUInt32List(s10.f37257k.e(obj2, Q(p02)));
                                        s11 = s10;
                                        c3484p4 = c3484p;
                                        obj9 = obj4;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        s11 = s10;
                                        k0Var2 = k0Var3;
                                        obj9 = obj4;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (A.a unused5) {
                                    s11 = s10;
                                    obj9 = obj4;
                                    d0Var3 = d0Var2;
                                    c3484p4 = c3484p;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 30:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj2 = obj10;
                                obj9 = obj4;
                                try {
                                    List e10 = s10.f37257k.e(obj2, Q(p02));
                                    d0Var2.readEnumList(e10);
                                    s10.l(b02);
                                    obj6 = obj2;
                                    k0Var2 = k0Var;
                                    try {
                                        obj9 = g0.z(obj6, fieldNumber, e10, null, obj9, k0Var2);
                                        k0Var3 = k0Var2;
                                        s11 = s10;
                                        c3484p4 = c3484p;
                                    } catch (A.a unused6) {
                                        k0Var3 = k0Var2;
                                        obj2 = obj6;
                                        s11 = s10;
                                        d0Var3 = d0Var2;
                                        c3484p4 = c3484p;
                                        if (k0Var3.q(d0Var3)) {
                                        }
                                        k0Var2.o(obj2, obj5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj2 = obj6;
                                        s11 = s10;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (A.a unused7) {
                                    k0Var3 = k0Var;
                                    s11 = s10;
                                    d0Var3 = d0Var2;
                                    c3484p4 = c3484p;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th7) {
                                    th = th7;
                                    k0Var3 = k0Var;
                                    s11 = s10;
                                    k0Var2 = k0Var3;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 31:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readSFixed32List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 32:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readSFixed64List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 33:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readSInt32List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 34:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readSInt64List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 35:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readDoubleList(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 36:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readFloatList(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 37:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readInt64List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 38:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readUInt64List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 39:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readInt32List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 40:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readFixed64List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 41:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readFixed32List(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 42:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj9 = obj4;
                                d0Var2.readBoolList(s10.f37257k.e(obj10, Q(p02)));
                                k0Var3 = k0Var;
                                obj4 = obj9;
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 43:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj2 = obj10;
                                obj9 = obj4;
                                try {
                                    d0Var2.readUInt32List(s10.f37257k.e(obj2, Q(p02)));
                                    k0Var3 = k0Var;
                                    obj4 = obj9;
                                    s11 = s10;
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                } catch (A.a unused8) {
                                    k0Var3 = k0Var;
                                    s11 = s10;
                                    d0Var3 = d0Var2;
                                    c3484p4 = c3484p;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th8) {
                                    th = th8;
                                    k0Var2 = k0Var;
                                    s11 = s10;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 44:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj6 = obj10;
                                try {
                                    List e11 = s10.f37257k.e(obj6, Q(p02));
                                    d0Var2.readEnumList(e11);
                                    s10.l(b02);
                                    obj9 = obj4;
                                    try {
                                        obj9 = g0.z(obj6, fieldNumber, e11, null, obj9, k0Var2);
                                        k0Var3 = k0Var;
                                        s11 = s10;
                                        c3484p4 = c3484p;
                                    } catch (A.a unused9) {
                                        k0Var3 = k0Var;
                                        obj2 = obj6;
                                        s11 = s10;
                                        d0Var3 = d0Var2;
                                        c3484p4 = c3484p;
                                        if (k0Var3.q(d0Var3)) {
                                        }
                                        k0Var2.o(obj2, obj5);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj6;
                                        k0Var2 = k0Var;
                                        s11 = s10;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (A.a unused10) {
                                    obj9 = obj4;
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj2 = obj6;
                                    obj9 = obj4;
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 45:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj7 = obj10;
                                k0Var3 = k0Var2;
                                d0Var2.readSFixed32List(s10.f37257k.e(obj7, Q(p02)));
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 46:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj7 = obj10;
                                k0Var3 = k0Var2;
                                d0Var2.readSFixed64List(s10.f37257k.e(obj7, Q(p02)));
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 47:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj7 = obj10;
                                k0Var3 = k0Var2;
                                d0Var2.readSInt32List(s10.f37257k.e(obj7, Q(p02)));
                                s11 = s10;
                                c3484p4 = c3484p;
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 48:
                                s10 = s11;
                                d0Var2 = d0Var3;
                                obj7 = obj10;
                                k0Var3 = k0Var2;
                                try {
                                    d0Var2.readSInt64List(s10.f37257k.e(obj7, Q(p02)));
                                    s11 = s10;
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                } catch (A.a unused11) {
                                    obj2 = obj7;
                                    s11 = s10;
                                    obj9 = obj4;
                                    d0Var3 = d0Var2;
                                    c3484p4 = c3484p;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th11) {
                                    th = th11;
                                    obj2 = obj7;
                                    s11 = s10;
                                    k0Var2 = k0Var3;
                                    obj9 = obj4;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 49:
                                k0Var3 = k0Var2;
                                try {
                                    obj2 = obj;
                                } catch (Throwable th12) {
                                    th = th12;
                                    s10 = s11;
                                    obj7 = obj;
                                    obj2 = obj7;
                                    s11 = s10;
                                    k0Var2 = k0Var3;
                                    obj9 = obj4;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    s11.e0(obj2, Q(p02), d0Var, s11.n(b02), c3484p);
                                    s10 = s11;
                                    obj7 = obj2;
                                    d0Var2 = d0Var;
                                    s11 = s10;
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                } catch (A.a unused12) {
                                    c3484p4 = c3484p;
                                    d0Var3 = d0Var;
                                    obj9 = obj4;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th13) {
                                    th = th13;
                                    s10 = s11;
                                    s11 = s10;
                                    k0Var2 = k0Var3;
                                    obj9 = obj4;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c3484p3 = c3484p4;
                                break;
                            case 50:
                                k0Var3 = k0Var2;
                                try {
                                    try {
                                        s11.G(obj10, b02, s11.m(b02), c3484p4, d0Var);
                                        c3484p4 = c3484p;
                                        obj9 = obj4;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj2 = obj;
                                        k0Var2 = k0Var3;
                                        obj9 = obj4;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                            obj3 = s11.j(obj2, s11.intArray[i10], obj3, k0Var, obj);
                                            k0Var2 = k0Var;
                                            i10++;
                                            s11 = this;
                                        }
                                        if (obj3 != null) {
                                            k0Var2.o(obj2, obj3);
                                        }
                                        throw th;
                                    }
                                } catch (A.a unused13) {
                                    obj2 = obj;
                                    d0Var3 = d0Var;
                                    c3484p4 = c3484p;
                                    obj9 = obj4;
                                    if (k0Var3.q(d0Var3)) {
                                        k0Var2 = k0Var3;
                                        if (obj9 == null) {
                                            try {
                                                obj9 = k0Var2.f(obj2);
                                            } catch (Throwable th15) {
                                                th = th15;
                                                i10 = s11.f37254h;
                                                obj3 = obj9;
                                                while (i10 < s11.f37255i) {
                                                }
                                                if (obj3 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!k0Var2.m(obj9, d0Var3)) {
                                            obj5 = obj9;
                                            for (int i11 = s11.f37254h; i11 < s11.f37255i; i11++) {
                                                obj5 = s11.j(obj2, s11.intArray[i11], obj5, k0Var, obj);
                                                k0Var2 = k0Var;
                                            }
                                            if (obj5 == null) {
                                                return;
                                            }
                                        }
                                        c3484p3 = c3484p4;
                                    } else {
                                        if (!d0Var3.skipField()) {
                                            int i12 = s11.f37254h;
                                            obj5 = obj9;
                                            while (i12 < s11.f37255i) {
                                                k0 k0Var4 = k0Var3;
                                                obj5 = s11.j(obj2, s11.intArray[i12], obj5, k0Var4, obj);
                                                i12++;
                                                k0Var3 = k0Var4;
                                            }
                                            k0Var2 = k0Var3;
                                            if (obj5 == null) {
                                                return;
                                            }
                                        }
                                        c3484p3 = c3484p4;
                                    }
                                    k0Var2.o(obj2, obj5);
                                }
                                c3484p3 = c3484p4;
                            case 51:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Double.valueOf(d0Var3.readDouble()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 52:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Float.valueOf(d0Var3.readFloat()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 53:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Long.valueOf(d0Var3.readInt64()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 54:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Long.valueOf(d0Var3.readUInt64()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 55:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Integer.valueOf(d0Var3.readInt32()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 56:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Long.valueOf(d0Var3.readFixed64()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 57:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Integer.valueOf(d0Var3.readFixed32()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 58:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Boolean.valueOf(d0Var3.readBool()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 59:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                s11.g0(obj8, p02, d0Var3);
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 60:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                O o12 = (O) s11.L(obj8, fieldNumber, b02);
                                d0Var3.c(o12, s11.n(b02), c3484p4);
                                s11.n0(obj8, fieldNumber, b02, o12);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 61:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), d0Var3.readBytes());
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 62:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Integer.valueOf(d0Var3.readUInt32()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 63:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                int readEnum2 = d0Var3.readEnum();
                                s11.l(b02);
                                o0.R(obj8, Q(p02), Integer.valueOf(readEnum2));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 64:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Integer.valueOf(d0Var3.readSFixed32()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 65:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Long.valueOf(d0Var3.readSFixed64()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 66:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Integer.valueOf(d0Var3.readSInt32()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 67:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                o0.R(obj8, Q(p02), Long.valueOf(d0Var3.readSInt64()));
                                s11.k0(obj8, fieldNumber, b02);
                                obj9 = obj4;
                                c3484p3 = c3484p4;
                                break;
                            case 68:
                                k0Var3 = k0Var2;
                                obj8 = obj10;
                                try {
                                    O o13 = (O) s11.L(obj8, fieldNumber, b02);
                                    d0Var3.a(o13, s11.n(b02), c3484p4);
                                    s11.n0(obj8, fieldNumber, b02, o13);
                                    obj9 = obj4;
                                } catch (A.a unused14) {
                                    obj2 = obj8;
                                    obj9 = obj4;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj8;
                                    k0Var2 = k0Var3;
                                    obj9 = obj4;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                c3484p3 = c3484p4;
                                break;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj9 = k0Var2.f(obj10);
                                    } catch (A.a unused15) {
                                        obj2 = obj10;
                                        obj9 = obj4;
                                        k0Var3 = k0Var2;
                                        if (k0Var3.q(d0Var3)) {
                                        }
                                        k0Var2.o(obj2, obj5);
                                    }
                                } else {
                                    obj9 = obj4;
                                }
                                try {
                                } catch (A.a unused16) {
                                    k0Var3 = k0Var2;
                                    obj2 = obj10;
                                    if (k0Var3.q(d0Var3)) {
                                    }
                                    k0Var2.o(obj2, obj5);
                                } catch (Throwable th17) {
                                    th = th17;
                                    k0Var3 = k0Var2;
                                    obj2 = obj10;
                                    k0Var2 = k0Var3;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                if (!k0Var2.m(obj9, d0Var3)) {
                                    int i13 = s11.f37254h;
                                    Object obj11 = obj9;
                                    while (i13 < s11.f37255i) {
                                        Object obj12 = obj10;
                                        obj11 = s11.j(obj12, s11.intArray[i13], obj11, k0Var, obj);
                                        i13++;
                                        obj10 = obj12;
                                        k0Var2 = k0Var;
                                    }
                                    Object obj13 = obj10;
                                    k0 k0Var5 = k0Var2;
                                    if (obj11 != null) {
                                        k0Var5.o(obj13, obj11);
                                        return;
                                    }
                                    return;
                                }
                                k0Var3 = k0Var2;
                                c3484p3 = c3484p4;
                                break;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        obj2 = obj10;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        int i14 = s11.f37254h;
                        Object obj14 = obj9;
                        while (i14 < s11.f37255i) {
                            obj14 = s11.j(obj, s11.intArray[i14], obj14, k0Var, obj);
                            i14++;
                            s11 = s11;
                        }
                        if (obj14 != null) {
                            k0Var.o(obj, obj14);
                        }
                        return;
                    }
                    k0Var2 = k0Var;
                    S s13 = s11;
                    try {
                        if (s13.f37250d) {
                            abstractC3485q2 = abstractC3485q;
                            b10 = abstractC3485q2.b(c3484p3, s13.f37249c, fieldNumber);
                        } else {
                            abstractC3485q2 = abstractC3485q;
                            b10 = null;
                        }
                        if (b10 != null) {
                            Object obj15 = obj9;
                            try {
                                try {
                                    obj9 = abstractC3485q2.g(obj, d0Var, b10, c3484p3, abstractC3485q.d(obj), obj15, k0Var);
                                    c3484p2 = c3484p3;
                                } catch (Throwable th19) {
                                    th = th19;
                                    obj2 = obj;
                                    obj4 = obj15;
                                    k0Var2 = k0Var;
                                    s11 = s13;
                                    obj9 = obj4;
                                    i10 = s11.f37254h;
                                    obj3 = obj9;
                                    while (i10 < s11.f37255i) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                obj2 = obj;
                                obj4 = obj15;
                                k0Var2 = k0Var;
                            }
                        } else {
                            obj2 = obj;
                            c3484p2 = c3484p3;
                            obj4 = obj9;
                            try {
                                if (k0Var2.q(d0Var)) {
                                    try {
                                        if (d0Var.skipField()) {
                                            c3484p3 = c3484p2;
                                            s11 = s13;
                                            obj9 = obj4;
                                        } else {
                                            obj9 = obj4;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        s11 = s13;
                                        obj9 = obj4;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj9 = obj4 == null ? k0Var2.f(obj2) : obj4;
                                    try {
                                        if (!k0Var2.m(obj9, d0Var)) {
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        s11 = s13;
                                        i10 = s11.f37254h;
                                        obj3 = obj9;
                                        while (i10 < s11.f37255i) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th23) {
                                th = th23;
                                s11 = s13;
                                obj9 = obj4;
                                i10 = s11.f37254h;
                                obj3 = obj9;
                                while (i10 < s11.f37255i) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        }
                        c3484p3 = c3484p2;
                        s11 = s13;
                    } catch (Throwable th24) {
                        th = th24;
                        s11 = s13;
                        obj2 = obj;
                    }
                }
            } catch (Throwable th25) {
                th = th25;
                k0Var2 = k0Var;
                obj2 = obj;
            }
        }
        k0Var2.o(obj2, obj5);
    }

    public final void G(Object obj, int i10, Object obj2, C3484p c3484p, d0 d0Var) {
        long Q10 = Q(p0(i10));
        Object C10 = o0.C(obj, Q10);
        if (C10 == null) {
            C10 = this.f37260n.newMapField(obj2);
            o0.R(obj, Q10, C10);
        } else if (this.f37260n.isImmutable(C10)) {
            Object newMapField = this.f37260n.newMapField(obj2);
            this.f37260n.mergeFrom(newMapField, C10);
            o0.R(obj, Q10, newMapField);
            C10 = newMapField;
        }
        Map forMutableMapData = this.f37260n.forMutableMapData(C10);
        this.f37260n.forMapMetadata(obj2);
        d0Var.b(forMutableMapData, null, c3484p);
    }

    public final void H(Object obj, Object obj2, int i10) {
        if (u(obj2, i10)) {
            long Q10 = Q(p0(i10));
            Unsafe unsafe = f37246o;
            Object object = unsafe.getObject(obj2, Q10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            e0 n10 = n(i10);
            if (!u(obj, i10)) {
                if (z(object)) {
                    Object newInstance = n10.newInstance();
                    n10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, Q10, newInstance);
                } else {
                    unsafe.putObject(obj, Q10, object);
                }
                j0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, Q10);
            if (!z(object2)) {
                Object newInstance2 = n10.newInstance();
                n10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, Q10, newInstance2);
                object2 = newInstance2;
            }
            n10.mergeFrom(object2, object);
        }
    }

    public final void I(Object obj, Object obj2, int i10) {
        int P10 = P(i10);
        if (B(obj2, P10, i10)) {
            long Q10 = Q(p0(i10));
            Unsafe unsafe = f37246o;
            Object object = unsafe.getObject(obj2, Q10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            e0 n10 = n(i10);
            if (!B(obj, P10, i10)) {
                if (z(object)) {
                    Object newInstance = n10.newInstance();
                    n10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, Q10, newInstance);
                } else {
                    unsafe.putObject(obj, Q10, object);
                }
                k0(obj, P10, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, Q10);
            if (!z(object2)) {
                Object newInstance2 = n10.newInstance();
                n10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, Q10, newInstance2);
                object2 = newInstance2;
            }
            n10.mergeFrom(object2, object);
        }
    }

    public final void J(Object obj, Object obj2, int i10) {
        int p02 = p0(i10);
        long Q10 = Q(p02);
        int P10 = P(i10);
        switch (o0(p02)) {
            case 0:
                if (u(obj2, i10)) {
                    o0.N(obj, Q10, o0.x(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 1:
                if (u(obj2, i10)) {
                    o0.O(obj, Q10, o0.y(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 2:
                if (u(obj2, i10)) {
                    o0.Q(obj, Q10, o0.A(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 3:
                if (u(obj2, i10)) {
                    o0.Q(obj, Q10, o0.A(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 4:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 5:
                if (u(obj2, i10)) {
                    o0.Q(obj, Q10, o0.A(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 6:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 7:
                if (u(obj2, i10)) {
                    o0.H(obj, Q10, o0.r(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 8:
                if (u(obj2, i10)) {
                    o0.R(obj, Q10, o0.C(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 9:
                H(obj, obj2, i10);
                break;
            case 10:
                if (u(obj2, i10)) {
                    o0.R(obj, Q10, o0.C(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 11:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 12:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 13:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 14:
                if (u(obj2, i10)) {
                    o0.Q(obj, Q10, o0.A(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 15:
                if (u(obj2, i10)) {
                    o0.P(obj, Q10, o0.z(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 16:
                if (u(obj2, i10)) {
                    o0.Q(obj, Q10, o0.A(obj2, Q10));
                    j0(obj, i10);
                    break;
                }
                break;
            case 17:
                H(obj, obj2, i10);
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
                this.f37257k.d(obj, obj2, Q10);
                break;
            case 50:
                g0.E(this.f37260n, obj, obj2, Q10);
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
                if (B(obj2, P10, i10)) {
                    o0.R(obj, Q10, o0.C(obj2, Q10));
                    k0(obj, P10, i10);
                    break;
                }
                break;
            case 60:
                I(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (B(obj2, P10, i10)) {
                    o0.R(obj, Q10, o0.C(obj2, Q10));
                    k0(obj, P10, i10);
                    break;
                }
                break;
            case 68:
                I(obj, obj2, i10);
                break;
        }
    }

    public final Object K(Object obj, int i10) {
        e0 n10 = n(i10);
        long Q10 = Q(p0(i10));
        if (!u(obj, i10)) {
            return n10.newInstance();
        }
        Object object = f37246o.getObject(obj, Q10);
        if (z(object)) {
            return object;
        }
        Object newInstance = n10.newInstance();
        if (object != null) {
            n10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final Object L(Object obj, int i10, int i11) {
        e0 n10 = n(i11);
        if (!B(obj, i10, i11)) {
            return n10.newInstance();
        }
        Object object = f37246o.getObject(obj, Q(p0(i11)));
        if (z(object)) {
            return object;
        }
        Object newInstance = n10.newInstance();
        if (object != null) {
            n10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final int P(int i10) {
        return this.buffer[i10];
    }

    public final int W(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, AbstractC3473e.a aVar) {
        Unsafe unsafe = f37246o;
        Object m10 = m(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f37260n.isImmutable(object)) {
            Object newMapField = this.f37260n.newMapField(m10);
            this.f37260n.mergeFrom(newMapField, object);
            unsafe.putObject(obj, j10, newMapField);
            object = newMapField;
        }
        this.f37260n.forMapMetadata(m10);
        return g(bArr, i10, i11, null, this.f37260n.forMutableMapData(object), aVar);
    }

    public final int X(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, AbstractC3473e.a aVar) {
        int i18;
        Unsafe unsafe = f37246o;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(AbstractC3473e.d(bArr, i10)));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(AbstractC3473e.k(bArr, i10)));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int K10 = AbstractC3473e.K(bArr, i10, aVar);
                unsafe.putObject(obj, j10, Long.valueOf(aVar.f37283b));
                unsafe.putInt(obj, j11, i13);
                return K10;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int H10 = AbstractC3473e.H(bArr, i10, aVar);
                unsafe.putObject(obj, j10, Integer.valueOf(aVar.f37282a));
                unsafe.putInt(obj, j11, i13);
                return H10;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(AbstractC3473e.i(bArr, i10)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(AbstractC3473e.g(bArr, i10)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i22;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int K11 = AbstractC3473e.K(bArr, i10, aVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(aVar.f37283b != 0));
                unsafe.putInt(obj, j11, i13);
                return K11;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int H11 = AbstractC3473e.H(bArr, i10, aVar);
                int i23 = aVar.f37282a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0 && !p0.n(bArr, H11, H11 + i23)) {
                        throw A.d();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, H11, i23, AbstractC3493z.f37488b));
                    H11 += i23;
                }
                unsafe.putInt(obj, j11, i13);
                return H11;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object L10 = L(obj, i13, i17);
                    int N10 = AbstractC3473e.N(L10, n(i17), bArr, i18, i11, aVar);
                    n0(obj, i13, i17, L10);
                    return N10;
                }
                break;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int b10 = AbstractC3473e.b(bArr, i18, aVar);
                    unsafe.putObject(obj, j10, aVar.f37284c);
                    unsafe.putInt(obj, j11, i13);
                    return b10;
                }
                break;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int H12 = AbstractC3473e.H(bArr, i18, aVar);
                    int i24 = aVar.f37282a;
                    l(i17);
                    unsafe.putObject(obj, j10, Integer.valueOf(i24));
                    unsafe.putInt(obj, j11, i13);
                    return H12;
                }
                break;
            case 66:
                i18 = i10;
                if (i14 == 0) {
                    int H13 = AbstractC3473e.H(bArr, i18, aVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC3477i.b(aVar.f37282a)));
                    unsafe.putInt(obj, j11, i13);
                    return H13;
                }
                break;
            case 67:
                i18 = i10;
                if (i14 == 0) {
                    int K12 = AbstractC3473e.K(bArr, i18, aVar);
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC3477i.c(aVar.f37283b)));
                    unsafe.putInt(obj, j11, i13);
                    return K12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object L11 = L(obj, i13, i17);
                    int M10 = AbstractC3473e.M(L11, n(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    n0(obj, i13, i17, L11);
                    return M10;
                }
            default:
                return i10;
        }
        return i18;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0094. Please report as an issue. */
    public int Y(Object obj, byte[] bArr, int i10, int i11, int i12, AbstractC3473e.a aVar) {
        Object obj2;
        int i13;
        Unsafe unsafe;
        S s10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC3473e.a aVar2;
        int i22;
        Object obj3;
        int F10;
        int i23;
        int i24;
        byte[] bArr2;
        int i25;
        Unsafe unsafe2;
        int i26;
        AbstractC3473e.a aVar3;
        Unsafe unsafe3;
        AbstractC3473e.a aVar4;
        Object obj4;
        Unsafe unsafe4;
        int i27;
        int K10;
        byte[] bArr3;
        AbstractC3473e.a aVar5;
        Unsafe unsafe5;
        int i28;
        Object obj5;
        int b10;
        byte[] bArr4;
        int i29;
        int i30;
        S s11 = this;
        Object obj6 = obj;
        byte[] bArr5 = bArr;
        int i31 = i11;
        AbstractC3473e.a aVar6 = aVar;
        f(obj6);
        Unsafe unsafe6 = f37246o;
        int i32 = -1;
        int i33 = i10;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                int i40 = bArr5[i33];
                if (i40 < 0) {
                    i39 = AbstractC3473e.G(i40, bArr5, i39, aVar6);
                    i40 = aVar6.f37282a;
                }
                int i41 = i39;
                int i42 = i40;
                int i43 = i42 >>> 3;
                int i44 = i42 & 7;
                int c02 = i43 > i34 ? s11.c0(i43, i35 / 3) : s11.b0(i43);
                if (c02 == i32) {
                    i16 = i41;
                    i17 = i38;
                    unsafe = unsafe6;
                    i18 = i32;
                    i19 = i36;
                    i20 = i43;
                    i21 = 0;
                    aVar2 = aVar;
                    s10 = s11;
                    i22 = i42;
                } else {
                    int i45 = s11.buffer[c02 + 1];
                    int i46 = i32;
                    int o02 = o0(i45);
                    long Q10 = Q(i45);
                    if (o02 <= 17) {
                        int i47 = s11.buffer[c02 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i38) {
                            i24 = i43;
                            if (i38 != 1048575) {
                                unsafe6.putInt(obj6, i38, i36);
                            }
                            i36 = unsafe6.getInt(obj6, i49);
                        } else {
                            i24 = i43;
                            i49 = i38;
                        }
                        switch (o02) {
                            case 0:
                                bArr4 = bArr;
                                i25 = c02;
                                i26 = i41;
                                unsafe4 = unsafe6;
                                aVar3 = aVar;
                                if (i44 == 1) {
                                    o0.N(obj6, Q10, AbstractC3473e.d(bArr4, i26));
                                    i29 = i26 + 8;
                                    i36 |= i48;
                                    i31 = i11;
                                    aVar6 = aVar3;
                                    i38 = i49;
                                    i35 = i25;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    unsafe6 = unsafe4;
                                    i33 = i29;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 1:
                                bArr4 = bArr;
                                i25 = c02;
                                i26 = i41;
                                unsafe4 = unsafe6;
                                aVar3 = aVar;
                                if (i44 == 5) {
                                    o0.O(obj6, Q10, AbstractC3473e.k(bArr4, i26));
                                    i29 = i26 + 4;
                                    i36 |= i48;
                                    i31 = i11;
                                    aVar6 = aVar3;
                                    i38 = i49;
                                    i35 = i25;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    unsafe6 = unsafe4;
                                    i33 = i29;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i25 = c02;
                                unsafe2 = unsafe6;
                                i26 = i41;
                                aVar3 = aVar;
                                if (i44 == 0) {
                                    int K11 = AbstractC3473e.K(bArr2, i26, aVar3);
                                    Object obj7 = obj6;
                                    unsafe2.putLong(obj7, Q10, aVar3.f37283b);
                                    obj6 = obj7;
                                    i36 |= i48;
                                    unsafe6 = unsafe2;
                                    i33 = K11;
                                    aVar6 = aVar3;
                                    i31 = i11;
                                    i38 = i49;
                                    i35 = i25;
                                    bArr5 = bArr2;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr4 = bArr;
                                i25 = c02;
                                unsafe2 = unsafe6;
                                i26 = i41;
                                aVar3 = aVar;
                                if (i44 == 0) {
                                    int H10 = AbstractC3473e.H(bArr4, i26, aVar3);
                                    unsafe2.putInt(obj6, Q10, aVar3.f37282a);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = H10;
                                    aVar6 = aVar3;
                                    i38 = i49;
                                    i35 = i25;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    unsafe6 = unsafe2;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr4 = bArr;
                                i25 = c02;
                                Unsafe unsafe7 = unsafe6;
                                Object obj8 = obj6;
                                if (i44 == 1) {
                                    aVar3 = aVar;
                                    unsafe7.putLong(obj8, Q10, AbstractC3473e.i(bArr4, i41));
                                    unsafe2 = unsafe7;
                                    obj6 = obj8;
                                    i33 = i41 + 8;
                                    i36 |= i48;
                                    i31 = i11;
                                    aVar6 = aVar3;
                                    i38 = i49;
                                    i35 = i25;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    unsafe6 = unsafe2;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    unsafe2 = unsafe7;
                                    i26 = i41;
                                    aVar3 = aVar;
                                    unsafe4 = unsafe2;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i25 = c02;
                                unsafe3 = unsafe6;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i44 == 5) {
                                    unsafe3.putInt(obj4, Q10, AbstractC3473e.g(bArr2, i41));
                                    i33 = i41 + 4;
                                    i36 |= i48;
                                    i31 = i11;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i38 = i49;
                                    unsafe6 = unsafe3;
                                    i35 = i25;
                                    bArr5 = bArr2;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    i26 = i41;
                                    aVar3 = aVar4;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i25 = c02;
                                unsafe3 = unsafe6;
                                i27 = i41;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i44 == 0) {
                                    K10 = AbstractC3473e.K(bArr2, i27, aVar4);
                                    o0.H(obj4, Q10, aVar4.f37283b != 0);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = K10;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i38 = i49;
                                    unsafe6 = unsafe3;
                                    i35 = i25;
                                    bArr5 = bArr2;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i26 = i27;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i25 = c02;
                                unsafe3 = unsafe6;
                                i27 = i41;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i44 == 2) {
                                    K10 = (536870912 & i45) == 0 ? AbstractC3473e.B(bArr2, i27, aVar4) : AbstractC3473e.E(bArr2, i27, aVar4);
                                    unsafe3.putObject(obj4, Q10, aVar4.f37284c);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = K10;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i38 = i49;
                                    unsafe6 = unsafe3;
                                    i35 = i25;
                                    bArr5 = bArr2;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i26 = i27;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 9:
                                i25 = c02;
                                unsafe3 = unsafe6;
                                obj4 = obj6;
                                if (i44 == 2) {
                                    Object K12 = s11.K(obj4, i25);
                                    int N10 = AbstractC3473e.N(K12, s11.n(i25), bArr, i41, i11, aVar);
                                    bArr2 = bArr;
                                    aVar4 = aVar;
                                    s11.m0(obj4, i25, K12);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = N10;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i38 = i49;
                                    unsafe6 = unsafe3;
                                    i35 = i25;
                                    bArr5 = bArr2;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    i27 = i41;
                                    aVar4 = aVar;
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i26 = i27;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 10:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i25 = c02;
                                unsafe5 = unsafe6;
                                i28 = i41;
                                obj5 = obj6;
                                if (i44 == 2) {
                                    b10 = AbstractC3473e.b(bArr3, i28, aVar5);
                                    unsafe5.putObject(obj5, Q10, aVar5.f37284c);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = b10;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i38 = i49;
                                    unsafe6 = unsafe5;
                                    i35 = i25;
                                    aVar6 = aVar5;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i26 = i28;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 12:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i25 = c02;
                                unsafe5 = unsafe6;
                                i28 = i41;
                                obj5 = obj6;
                                if (i44 == 0) {
                                    b10 = AbstractC3473e.H(bArr3, i28, aVar5);
                                    int i50 = aVar5.f37282a;
                                    s11.l(i25);
                                    unsafe5.putInt(obj5, Q10, i50);
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = b10;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i38 = i49;
                                    unsafe6 = unsafe5;
                                    i35 = i25;
                                    aVar6 = aVar5;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i26 = i28;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 15:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i25 = c02;
                                unsafe5 = unsafe6;
                                i28 = i41;
                                obj5 = obj6;
                                if (i44 == 0) {
                                    b10 = AbstractC3473e.H(bArr3, i28, aVar5);
                                    unsafe5.putInt(obj5, Q10, AbstractC3477i.b(aVar5.f37282a));
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = b10;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i38 = i49;
                                    unsafe6 = unsafe5;
                                    i35 = i25;
                                    aVar6 = aVar5;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i26 = i28;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 16:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i25 = c02;
                                if (i44 == 0) {
                                    int K13 = AbstractC3473e.K(bArr3, i41, aVar5);
                                    Object obj9 = obj6;
                                    Unsafe unsafe8 = unsafe6;
                                    unsafe8.putLong(obj9, Q10, AbstractC3477i.c(aVar5.f37283b));
                                    unsafe5 = unsafe8;
                                    obj5 = obj9;
                                    i36 |= i48;
                                    i31 = i11;
                                    i33 = K13;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i38 = i49;
                                    unsafe6 = unsafe5;
                                    i35 = i25;
                                    aVar6 = aVar5;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    i26 = i41;
                                    unsafe4 = unsafe6;
                                    aVar3 = aVar5;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            case 17:
                                if (i44 == 3) {
                                    Object K14 = s11.K(obj6, c02);
                                    i25 = c02;
                                    i33 = AbstractC3473e.M(K14, s11.n(c02), bArr, i41, i11, (i24 << 3) | 4, aVar);
                                    aVar5 = aVar;
                                    s11.m0(obj6, i25, K14);
                                    i36 |= i48;
                                    i31 = i11;
                                    bArr5 = bArr;
                                    i38 = i49;
                                    i35 = i25;
                                    aVar6 = aVar5;
                                    i34 = i24;
                                    i32 = i46;
                                    i37 = i42;
                                    break;
                                } else {
                                    i25 = c02;
                                    unsafe4 = unsafe6;
                                    i26 = i41;
                                    aVar3 = aVar;
                                    s10 = s11;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i16 = i26;
                                    i20 = i24;
                                    i18 = i46;
                                    i22 = i42;
                                    i17 = i49;
                                    i19 = i36;
                                    i21 = i25;
                                    break;
                                }
                            default:
                                i25 = c02;
                                unsafe4 = unsafe6;
                                i26 = i41;
                                aVar3 = aVar;
                                s10 = s11;
                                unsafe = unsafe4;
                                aVar2 = aVar3;
                                i16 = i26;
                                i20 = i24;
                                i18 = i46;
                                i22 = i42;
                                i17 = i49;
                                i19 = i36;
                                i21 = i25;
                                break;
                        }
                    } else {
                        int i51 = i42;
                        int i52 = c02;
                        Unsafe unsafe9 = unsafe6;
                        if (o02 != 27) {
                            i30 = i41;
                            if (o02 <= 49) {
                                unsafe = unsafe9;
                                i18 = i46;
                                i17 = i38;
                                i19 = i36;
                                int a02 = s11.a0(obj, bArr, i30, i11, i51, i43, i44, i52, i45, o02, Q10, aVar);
                                i51 = i51;
                                i20 = i43;
                                i21 = i52;
                                if (a02 != i30) {
                                    s11 = this;
                                    obj6 = obj;
                                    bArr5 = bArr;
                                    i31 = i11;
                                    i33 = a02;
                                    i34 = i20;
                                    i35 = i21;
                                    i38 = i17;
                                    i36 = i19;
                                    i32 = i18;
                                    i37 = i51;
                                    unsafe6 = unsafe;
                                    aVar6 = aVar;
                                } else {
                                    s10 = this;
                                    aVar2 = aVar;
                                    i16 = a02;
                                }
                            } else {
                                i51 = i51;
                                unsafe = unsafe9;
                                i20 = i43;
                                i18 = i46;
                                i17 = i38;
                                i19 = i36;
                                i21 = i52;
                                if (o02 != 50) {
                                    int X10 = X(obj, bArr, i30, i11, i51, i20, i44, i45, o02, Q10, i21, aVar);
                                    s10 = this;
                                    i22 = i51;
                                    i20 = i20;
                                    aVar2 = aVar;
                                    if (X10 != i30) {
                                        obj6 = obj;
                                        bArr5 = bArr;
                                        i31 = i11;
                                        i37 = i22;
                                        i33 = X10;
                                        s11 = s10;
                                        i34 = i20;
                                        i35 = i21;
                                        aVar6 = aVar2;
                                        i38 = i17;
                                        i36 = i19;
                                        i32 = i18;
                                    } else {
                                        i16 = X10;
                                    }
                                } else if (i44 == 2) {
                                    int W10 = W(obj, bArr, i30, i11, i21, Q10, aVar);
                                    if (W10 != i30) {
                                        s11 = this;
                                        obj6 = obj;
                                        bArr5 = bArr;
                                        i31 = i11;
                                        aVar6 = aVar;
                                        i33 = W10;
                                        i34 = i20;
                                        i35 = i21;
                                        i38 = i17;
                                        i36 = i19;
                                        i32 = i18;
                                        i37 = i51;
                                    } else {
                                        s10 = this;
                                        aVar2 = aVar;
                                        i16 = W10;
                                    }
                                } else {
                                    s10 = this;
                                    aVar2 = aVar;
                                    i16 = i30;
                                }
                                unsafe6 = unsafe;
                            }
                        } else if (i44 == 2) {
                            AbstractC3493z.d dVar = (AbstractC3493z.d) unsafe9.getObject(obj6, Q10);
                            if (!dVar.isModifiable()) {
                                int size = dVar.size();
                                dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe9.putObject(obj6, Q10, dVar);
                            }
                            unsafe6 = unsafe9;
                            i31 = i11;
                            aVar6 = aVar;
                            i33 = AbstractC3473e.p(s11.n(i52), i51, bArr, i41, i11, dVar, aVar);
                            i35 = i52;
                            i34 = i43;
                            i32 = i46;
                            obj6 = obj;
                            i37 = i51;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe9;
                            i20 = i43;
                            i30 = i41;
                            i17 = i38;
                            i18 = i46;
                            i19 = i36;
                            i21 = i52;
                            s10 = this;
                            aVar2 = aVar;
                            i16 = i30;
                        }
                        i22 = i51;
                    }
                }
                if (i22 != i12 || i12 == 0) {
                    if (!s10.f37250d || aVar2.f37285d == C3484p.b()) {
                        obj3 = obj;
                        F10 = AbstractC3473e.F(i22, bArr, i16, i11, o(obj3), aVar);
                        i23 = i11;
                    } else {
                        F10 = AbstractC3473e.f(i22, bArr, i16, i11, obj, s10.f37249c, s10.f37258l, aVar2);
                        obj3 = obj;
                        i23 = i11;
                    }
                    i33 = F10;
                    bArr5 = bArr;
                    i37 = i22;
                    obj6 = obj3;
                    i31 = i23;
                    s11 = s10;
                    i34 = i20;
                    i35 = i21;
                    i38 = i17;
                    i36 = i19;
                    i32 = i18;
                    unsafe6 = unsafe;
                    aVar6 = aVar;
                } else {
                    obj2 = obj;
                    i13 = i11;
                    i37 = i22;
                    i14 = i16;
                    i15 = i17;
                    i36 = i19;
                }
            } else {
                obj2 = obj6;
                i13 = i31;
                int i53 = i38;
                unsafe = unsafe6;
                s10 = s11;
                i14 = i33;
                i15 = i53;
            }
        }
        if (i15 != 1048575) {
            unsafe.putInt(obj2, i15, i36);
        }
        l0 l0Var = null;
        for (int i54 = s10.f37254h; i54 < s10.f37255i; i54++) {
            l0Var = (l0) s10.j(obj2, s10.intArray[i54], l0Var, s10.f37258l, obj);
        }
        Object obj10 = obj2;
        S s12 = s10;
        if (l0Var != null) {
            s12.f37258l.o(obj10, l0Var);
        }
        if (i12 == 0) {
            if (i14 != i13) {
                throw A.h();
            }
        } else if (i14 > i13 || i37 != i12) {
            throw A.h();
        }
        return i14;
    }

    public final int Z(Object obj, byte[] bArr, int i10, int i11, AbstractC3473e.a aVar) {
        Object obj2;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        AbstractC3473e.a aVar2;
        int i17;
        int i18;
        int H10;
        Object obj3;
        Unsafe unsafe2;
        int i19;
        AbstractC3473e.a aVar3;
        byte[] bArr3;
        int K10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        S s10 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i26 = i11;
        AbstractC3473e.a aVar4 = aVar;
        f(obj4);
        Unsafe unsafe3 = f37246o;
        int i27 = -1;
        int i28 = i10;
        int i29 = -1;
        int i30 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (i28 < i26) {
            int i33 = i28 + 1;
            int i34 = bArr4[i28];
            if (i34 < 0) {
                i33 = AbstractC3473e.G(i34, bArr4, i33, aVar4);
                i34 = aVar4.f37282a;
            }
            int i35 = i34 >>> 3;
            int i36 = i34 & 7;
            int c02 = i35 > i29 ? s10.c0(i35, i30 / 3) : s10.b0(i35);
            if (c02 == i27) {
                obj2 = obj4;
                unsafe = unsafe3;
                i12 = i34;
                i13 = i33;
                i14 = i27;
                i15 = i35;
                i16 = 0;
            } else {
                int i37 = s10.buffer[c02 + 1];
                int o02 = o0(i37);
                i12 = i34;
                int i38 = c02;
                long Q10 = Q(i37);
                if (o02 <= 17) {
                    int i39 = s10.buffer[i38 + 2];
                    int i40 = 1 << (i39 >>> 20);
                    int i41 = i39 & 1048575;
                    if (i41 != i32) {
                        if (i32 != 1048575) {
                            unsafe3.putInt(obj4, i32, i31);
                            i21 = i41;
                            i20 = 1048575;
                        } else {
                            i20 = 1048575;
                            i21 = i41;
                        }
                        if (i21 != i20) {
                            i31 = unsafe3.getInt(obj4, i21);
                        }
                        i32 = i21;
                    }
                    switch (o02) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i17 = i33;
                            i18 = i38;
                            if (i36 != 1) {
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                o0.N(obj4, Q10, AbstractC3473e.d(bArr5, i17));
                                i28 = i17 + 8;
                                i31 |= i40;
                                i26 = i11;
                                i30 = i18;
                                i29 = i35;
                                bArr4 = bArr5;
                                i27 = -1;
                                aVar4 = aVar;
                                break;
                            }
                        case 1:
                            AbstractC3473e.a aVar5 = aVar4;
                            bArr2 = bArr4;
                            aVar2 = aVar5;
                            i17 = i33;
                            i18 = i38;
                            if (i36 != 5) {
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                o0.O(obj4, Q10, AbstractC3473e.k(bArr2, i17));
                                i28 = i17 + 4;
                                i31 |= i40;
                                byte[] bArr6 = bArr2;
                                aVar4 = aVar2;
                                bArr4 = bArr6;
                                i26 = i11;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            AbstractC3473e.a aVar6 = aVar4;
                            byte[] bArr7 = bArr4;
                            i17 = i33;
                            i18 = i38;
                            if (i36 != 0) {
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int K11 = AbstractC3473e.K(bArr7, i17, aVar6);
                                Unsafe unsafe4 = unsafe3;
                                Object obj5 = obj4;
                                unsafe4.putLong(obj5, Q10, aVar6.f37283b);
                                unsafe3 = unsafe4;
                                obj4 = obj5;
                                i31 |= i40;
                                aVar4 = aVar6;
                                bArr4 = bArr7;
                                i28 = K11;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                i26 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            AbstractC3473e.a aVar7 = aVar4;
                            byte[] bArr8 = bArr4;
                            i17 = i33;
                            i18 = i38;
                            if (i36 != 0) {
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H10 = AbstractC3473e.H(bArr8, i17, aVar7);
                                unsafe3.putInt(obj4, Q10, aVar7.f37282a);
                                i31 |= i40;
                                aVar4 = aVar7;
                                bArr4 = bArr8;
                                i26 = i11;
                                i28 = H10;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            Object obj6 = obj4;
                            AbstractC3473e.a aVar8 = aVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i42 = i33;
                            i18 = i38;
                            if (i36 != 1) {
                                obj4 = obj6;
                                i17 = i42;
                                unsafe3 = unsafe5;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                aVar2 = aVar8;
                                unsafe5.putLong(obj6, Q10, AbstractC3473e.i(bArr2, i42));
                                unsafe3 = unsafe5;
                                obj4 = obj6;
                                i28 = i42 + 8;
                                i31 |= i40;
                                byte[] bArr62 = bArr2;
                                aVar4 = aVar2;
                                bArr4 = bArr62;
                                i26 = i11;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            byte[] bArr10 = bArr4;
                            obj3 = obj4;
                            AbstractC3473e.a aVar9 = aVar4;
                            unsafe2 = unsafe3;
                            i19 = i33;
                            i18 = i38;
                            if (i36 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i17 = i19;
                                unsafe3 = unsafe6;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                unsafe2.putInt(obj3, Q10, AbstractC3473e.g(bArr10, i19));
                                i28 = i19 + 4;
                                i31 |= i40;
                                aVar4 = aVar9;
                                obj4 = obj3;
                                bArr4 = bArr10;
                                unsafe3 = unsafe2;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                i26 = i11;
                                break;
                            }
                        case 7:
                            byte[] bArr11 = bArr4;
                            obj3 = obj4;
                            aVar3 = aVar4;
                            bArr3 = bArr11;
                            unsafe2 = unsafe3;
                            i19 = i33;
                            i18 = i38;
                            if (i36 != 0) {
                                Unsafe unsafe62 = unsafe2;
                                i17 = i19;
                                unsafe3 = unsafe62;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                K10 = AbstractC3473e.K(bArr3, i19, aVar3);
                                o0.H(obj3, Q10, aVar3.f37283b != 0);
                                i31 |= i40;
                                byte[] bArr12 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr12;
                                i28 = K10;
                                unsafe3 = unsafe2;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                i26 = i11;
                                break;
                            }
                        case 8:
                            byte[] bArr13 = bArr4;
                            obj3 = obj4;
                            aVar3 = aVar4;
                            bArr3 = bArr13;
                            unsafe2 = unsafe3;
                            i19 = i33;
                            i18 = i38;
                            if (i36 != 2) {
                                Unsafe unsafe622 = unsafe2;
                                i17 = i19;
                                unsafe3 = unsafe622;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                K10 = (i37 & PKIFailureInfo.duplicateCertReq) == 0 ? AbstractC3473e.B(bArr3, i19, aVar3) : AbstractC3473e.E(bArr3, i19, aVar3);
                                unsafe2.putObject(obj3, Q10, aVar3.f37284c);
                                i31 |= i40;
                                byte[] bArr122 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr122;
                                i28 = K10;
                                unsafe3 = unsafe2;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                i26 = i11;
                                break;
                            }
                        case 9:
                            i18 = i38;
                            if (i36 != 2) {
                                obj4 = obj4;
                                i17 = i33;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                Object obj7 = obj4;
                                Object K12 = s10.K(obj7, i18);
                                byte[] bArr14 = bArr4;
                                obj3 = obj7;
                                int i43 = i26;
                                unsafe2 = unsafe3;
                                int i44 = i33;
                                AbstractC3473e.a aVar10 = aVar4;
                                K10 = AbstractC3473e.N(K12, s10.n(i18), bArr14, i44, i43, aVar10);
                                bArr3 = bArr14;
                                aVar3 = aVar10;
                                s10.m0(obj3, i18, K12);
                                i31 |= i40;
                                byte[] bArr1222 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr1222;
                                i28 = K10;
                                unsafe3 = unsafe2;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                i26 = i11;
                                break;
                            }
                        case 10:
                            i18 = i38;
                            if (i36 != 2) {
                                i17 = i33;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H10 = AbstractC3473e.b(bArr4, i33, aVar4);
                                unsafe3.putObject(obj4, Q10, aVar4.f37284c);
                                i31 |= i40;
                                i28 = H10;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 12:
                            i18 = i38;
                            if (i36 != 0) {
                                i17 = i33;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H10 = AbstractC3473e.H(bArr4, i33, aVar4);
                                unsafe3.putInt(obj4, Q10, aVar4.f37282a);
                                i31 |= i40;
                                i28 = H10;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 15:
                            i18 = i38;
                            if (i36 != 0) {
                                i17 = i33;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H10 = AbstractC3473e.H(bArr4, i33, aVar4);
                                unsafe3.putInt(obj4, Q10, AbstractC3477i.b(aVar4.f37282a));
                                i31 |= i40;
                                i28 = H10;
                                i30 = i18;
                                i29 = i35;
                                i27 = -1;
                                break;
                            }
                        case 16:
                            if (i36 != 0) {
                                i17 = i33;
                                i18 = i38;
                                unsafe = unsafe3;
                                i13 = i17;
                                i16 = i18;
                                i15 = i35;
                                i14 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int K13 = AbstractC3473e.K(bArr4, i33, aVar4);
                                Unsafe unsafe7 = unsafe3;
                                Object obj8 = obj4;
                                unsafe7.putLong(obj8, Q10, AbstractC3477i.c(aVar4.f37283b));
                                unsafe3 = unsafe7;
                                obj4 = obj8;
                                i31 |= i40;
                                i28 = K13;
                                i29 = i35;
                                i30 = i38;
                                i27 = -1;
                                break;
                            }
                        default:
                            i17 = i33;
                            i18 = i38;
                            unsafe = unsafe3;
                            i13 = i17;
                            i16 = i18;
                            i15 = i35;
                            i14 = -1;
                            obj2 = obj4;
                            break;
                    }
                } else {
                    int i45 = i33;
                    byte[] bArr15 = bArr4;
                    if (o02 != 27) {
                        Unsafe unsafe8 = unsafe3;
                        if (o02 <= 49) {
                            i23 = i31;
                            unsafe = unsafe8;
                            i14 = -1;
                            i25 = i32;
                            int a02 = s10.a0(obj, bArr, i45, i11, i12, i35, i36, i38, i37, o02, Q10, aVar);
                            i24 = i35;
                            i16 = i38;
                            if (a02 != i45) {
                                s10 = this;
                                obj4 = obj;
                                i26 = i11;
                                aVar4 = aVar;
                                i28 = a02;
                                i29 = i24;
                                i32 = i25;
                                i27 = -1;
                                i30 = i16;
                                i31 = i23;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                obj2 = obj;
                                i13 = a02;
                                i15 = i24;
                            }
                        } else {
                            unsafe = unsafe8;
                            i23 = i31;
                            i16 = i38;
                            i14 = -1;
                            i25 = i32;
                            i24 = i35;
                            i22 = i45;
                            if (o02 != 50) {
                                i15 = i24;
                                int X10 = X(obj, bArr, i22, i11, i12, i15, i36, i37, o02, Q10, i16, aVar);
                                obj2 = obj;
                                if (X10 != i22) {
                                    s10 = this;
                                    aVar4 = aVar;
                                    i29 = i15;
                                    i28 = X10;
                                    obj4 = obj2;
                                    i32 = i25;
                                    i27 = -1;
                                    i30 = i16;
                                    i31 = i23;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i26 = i11;
                                } else {
                                    i13 = X10;
                                }
                            } else if (i36 == 2) {
                                int W10 = W(obj, bArr, i22, i11, i16, Q10, aVar);
                                if (W10 != i22) {
                                    s10 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i26 = i11;
                                    aVar4 = aVar;
                                    i28 = W10;
                                    i29 = i24;
                                    i32 = i25;
                                    i27 = -1;
                                    i30 = i16;
                                    i31 = i23;
                                    unsafe3 = unsafe;
                                } else {
                                    obj2 = obj;
                                    i13 = W10;
                                    i15 = i24;
                                }
                            } else {
                                obj2 = obj;
                                i13 = i22;
                                i15 = i24;
                            }
                        }
                    } else if (i36 == 2) {
                        AbstractC3493z.d dVar = (AbstractC3493z.d) unsafe3.getObject(obj4, Q10);
                        if (!dVar.isModifiable()) {
                            int size = dVar.size();
                            dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(obj4, Q10, dVar);
                        }
                        int p10 = AbstractC3473e.p(s10.n(i38), i12, bArr15, i45, i11, dVar, aVar);
                        bArr4 = bArr;
                        aVar4 = aVar;
                        i28 = p10;
                        unsafe3 = unsafe3;
                        i29 = i35;
                        i30 = i38;
                        i27 = -1;
                        obj4 = obj;
                        i26 = i11;
                    } else {
                        i22 = i45;
                        unsafe = unsafe3;
                        i23 = i31;
                        i24 = i35;
                        i16 = i38;
                        i14 = -1;
                        i25 = i32;
                        obj2 = obj;
                        i13 = i22;
                        i15 = i24;
                    }
                    i32 = i25;
                    i31 = i23;
                }
            }
            int F10 = AbstractC3473e.F(i12, bArr, i13, i11, o(obj2), aVar);
            bArr4 = bArr;
            aVar4 = aVar;
            i29 = i15;
            obj4 = obj2;
            i27 = i14;
            i30 = i16;
            unsafe3 = unsafe;
            i26 = i11;
            i28 = F10;
            s10 = this;
        }
        Unsafe unsafe9 = unsafe3;
        int i46 = i26;
        int i47 = i32;
        int i48 = i31;
        Object obj9 = obj4;
        if (i47 != 1048575) {
            unsafe9.putInt(obj9, i47, i48);
        }
        if (i28 == i46) {
            return i28;
        }
        throw A.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, byte[] bArr, int i10, int i11, AbstractC3473e.a aVar) {
        if (this.f37252f) {
            Z(obj, bArr, i10, i11, aVar);
        } else {
            Y(obj, bArr, i10, i11, 0, aVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, AbstractC3473e.a aVar) {
        int I10;
        Unsafe unsafe = f37246o;
        AbstractC3493z.d dVar = (AbstractC3493z.d) unsafe.getObject(obj, j11);
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, dVar);
        }
        AbstractC3493z.d dVar2 = dVar;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return AbstractC3473e.r(bArr, i10, dVar2, aVar);
                }
                if (i14 == 1) {
                    return AbstractC3473e.e(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return AbstractC3473e.u(bArr, i10, dVar2, aVar);
                }
                if (i14 == 5) {
                    return AbstractC3473e.l(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return AbstractC3473e.y(bArr, i10, dVar2, aVar);
                }
                if (i14 == 0) {
                    return AbstractC3473e.L(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return AbstractC3473e.x(bArr, i10, dVar2, aVar);
                }
                if (i14 == 0) {
                    return AbstractC3473e.I(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return AbstractC3473e.t(bArr, i10, dVar2, aVar);
                }
                if (i14 == 1) {
                    return AbstractC3473e.j(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return AbstractC3473e.s(bArr, i10, dVar2, aVar);
                }
                if (i14 == 5) {
                    return AbstractC3473e.h(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return AbstractC3473e.q(bArr, i10, dVar2, aVar);
                }
                if (i14 == 0) {
                    return AbstractC3473e.a(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? AbstractC3473e.C(i12, bArr, i10, i11, dVar2, aVar) : AbstractC3473e.D(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return AbstractC3473e.p(n(i15), i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return AbstractC3473e.c(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        I10 = AbstractC3473e.I(i12, bArr, i10, i11, dVar2, aVar);
                    }
                    return i10;
                }
                I10 = AbstractC3473e.x(bArr, i10, dVar2, aVar);
                l(i15);
                g0.z(obj, i13, dVar2, null, null, this.f37258l);
                return I10;
            case 33:
            case 47:
                if (i14 == 2) {
                    return AbstractC3473e.v(bArr, i10, dVar2, aVar);
                }
                if (i14 == 0) {
                    return AbstractC3473e.z(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return AbstractC3473e.w(bArr, i10, dVar2, aVar);
                }
                if (i14 == 0) {
                    return AbstractC3473e.A(i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return AbstractC3473e.n(n(i15), i12, bArr, i10, i11, dVar2, aVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(Object obj, d0 d0Var, C3484p c3484p) {
        c3484p.getClass();
        f(obj);
        F(this.f37258l, this.f37259m, obj, d0Var, c3484p);
    }

    public final int b0(int i10) {
        if (i10 < this.f37247a || i10 > this.f37248b) {
            return -1;
        }
        return l0(i10, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void c(Object obj, r0 r0Var) {
        if (r0Var.fieldOrder() == r0.a.DESCENDING) {
            s0(obj, r0Var);
        } else if (this.f37252f) {
            r0(obj, r0Var);
        } else {
            q0(obj, r0Var);
        }
    }

    public final int c0(int i10, int i11) {
        if (i10 < this.f37247a || i10 > this.f37248b) {
            return -1;
        }
        return l0(i10, i11);
    }

    public final boolean d(Object obj, Object obj2, int i10) {
        return u(obj, i10) == u(obj2, i10);
    }

    public final int d0(int i10) {
        return this.buffer[i10 + 2];
    }

    public final void e0(Object obj, long j10, d0 d0Var, e0 e0Var, C3484p c3484p) {
        d0Var.e(this.f37257k.e(obj, j10), e0Var, c3484p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!i(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f37258l.g(obj).equals(this.f37258l.g(obj2))) {
            return false;
        }
        if (this.f37250d) {
            return this.f37259m.c(obj).equals(this.f37259m.c(obj2));
        }
        return true;
    }

    public final void f0(Object obj, int i10, d0 d0Var, e0 e0Var, C3484p c3484p) {
        d0Var.d(this.f37257k.e(obj, Q(i10)), e0Var, c3484p);
    }

    public final int g(byte[] bArr, int i10, int i11, H.a aVar, Map map, AbstractC3473e.a aVar2) {
        int H10 = AbstractC3473e.H(bArr, i10, aVar2);
        int i12 = aVar2.f37282a;
        if (i12 < 0 || i12 > i11 - H10) {
            throw A.m();
        }
        throw null;
    }

    public final void g0(Object obj, int i10, d0 d0Var) {
        if (t(i10)) {
            o0.R(obj, Q(i10), d0Var.readStringRequireUtf8());
        } else if (this.f37251e) {
            o0.R(obj, Q(i10), d0Var.readString());
        } else {
            o0.R(obj, Q(i10), d0Var.readBytes());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int getSerializedSize(Object obj) {
        return this.f37252f ? q(obj) : p(obj);
    }

    public final void h0(Object obj, int i10, d0 d0Var) {
        if (t(i10)) {
            d0Var.readStringListRequireUtf8(this.f37257k.e(obj, Q(i10)));
        } else {
            d0Var.readStringList(this.f37257k.e(obj, Q(i10)));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int hashCode(Object obj) {
        int i10;
        int f10;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int p02 = p0(i12);
            int P10 = P(i12);
            long Q10 = Q(p02);
            int i13 = 37;
            switch (o0(p02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(Double.doubleToLongBits(o0.x(obj, Q10)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(o0.y(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(o0.A(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(o0.A(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(o0.A(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.c(o0.r(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) o0.C(obj, Q10)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object C10 = o0.C(obj, Q10);
                    if (C10 != null) {
                        i13 = C10.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = o0.C(obj, Q10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(o0.A(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = o0.z(obj, Q10);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = AbstractC3493z.f(o0.A(obj, Q10));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object C11 = o0.C(obj, Q10);
                    if (C11 != null) {
                        i13 = C11.hashCode();
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
                    f10 = o0.C(obj, Q10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = o0.C(obj, Q10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(Double.doubleToLongBits(S(obj, Q10)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(T(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(V(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(V(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(V(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.c(R(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) o0.C(obj, Q10)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = o0.C(obj, Q10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = o0.C(obj, Q10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(V(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = U(obj, Q10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC3493z.f(V(obj, Q10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (B(obj, P10, i12)) {
                        i10 = i11 * 53;
                        f10 = o0.C(obj, Q10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f37258l.g(obj).hashCode();
        return this.f37250d ? (hashCode * 53) + this.f37259m.c(obj).hashCode() : hashCode;
    }

    public final boolean i(Object obj, Object obj2, int i10) {
        int p02 = p0(i10);
        long Q10 = Q(p02);
        switch (o0(p02)) {
            case 0:
                if (!d(obj, obj2, i10) || Double.doubleToLongBits(o0.x(obj, Q10)) != Double.doubleToLongBits(o0.x(obj2, Q10))) {
                }
                break;
            case 1:
                if (!d(obj, obj2, i10) || Float.floatToIntBits(o0.y(obj, Q10)) != Float.floatToIntBits(o0.y(obj2, Q10))) {
                }
                break;
            case 2:
                if (!d(obj, obj2, i10) || o0.A(obj, Q10) != o0.A(obj2, Q10)) {
                }
                break;
            case 3:
                if (!d(obj, obj2, i10) || o0.A(obj, Q10) != o0.A(obj2, Q10)) {
                }
                break;
            case 4:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 5:
                if (!d(obj, obj2, i10) || o0.A(obj, Q10) != o0.A(obj2, Q10)) {
                }
                break;
            case 6:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 7:
                if (!d(obj, obj2, i10) || o0.r(obj, Q10) != o0.r(obj2, Q10)) {
                }
                break;
            case 8:
                if (!d(obj, obj2, i10) || !g0.J(o0.C(obj, Q10), o0.C(obj2, Q10))) {
                }
                break;
            case 9:
                if (!d(obj, obj2, i10) || !g0.J(o0.C(obj, Q10), o0.C(obj2, Q10))) {
                }
                break;
            case 10:
                if (!d(obj, obj2, i10) || !g0.J(o0.C(obj, Q10), o0.C(obj2, Q10))) {
                }
                break;
            case 11:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 12:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 13:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 14:
                if (!d(obj, obj2, i10) || o0.A(obj, Q10) != o0.A(obj2, Q10)) {
                }
                break;
            case 15:
                if (!d(obj, obj2, i10) || o0.z(obj, Q10) != o0.z(obj2, Q10)) {
                }
                break;
            case 16:
                if (!d(obj, obj2, i10) || o0.A(obj, Q10) != o0.A(obj2, Q10)) {
                }
                break;
            case 17:
                if (!d(obj, obj2, i10) || !g0.J(o0.C(obj, Q10), o0.C(obj2, Q10))) {
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
                if (!A(obj, obj2, i10) || !g0.J(o0.C(obj, Q10), o0.C(obj2, Q10))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f37254h) {
            int i15 = this.intArray[i13];
            int P10 = P(i15);
            int p02 = p0(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f37246o.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            Object obj2 = obj;
            if (C(p02) && !v(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int o02 = o0(p02);
            if (o02 != 9 && o02 != 17) {
                if (o02 != 27) {
                    if (o02 == 60 || o02 == 68) {
                        if (B(obj2, P10, i15) && !w(obj2, p02, n(i15))) {
                            return false;
                        }
                    } else if (o02 != 49) {
                        if (o02 == 50 && !y(obj2, p02, i15)) {
                            return false;
                        }
                    }
                }
                if (!x(obj2, p02, i15)) {
                    return false;
                }
            } else if (v(obj2, i15, i10, i11, i18) && !w(obj2, p02, n(i15))) {
                return false;
            }
            i13++;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        return !this.f37250d || this.f37259m.c(obj).e();
    }

    public final Object j(Object obj, int i10, Object obj2, k0 k0Var, Object obj3) {
        P(i10);
        if (o0.C(obj, Q(p0(i10))) == null) {
            return obj2;
        }
        l(i10);
        return obj2;
    }

    public final void j0(Object obj, int i10) {
        int d02 = d0(i10);
        long j10 = 1048575 & d02;
        if (j10 == 1048575) {
            return;
        }
        o0.P(obj, j10, (1 << (d02 >>> 20)) | o0.z(obj, j10));
    }

    public final void k0(Object obj, int i10, int i11) {
        o0.P(obj, d0(i11) & 1048575, i10);
    }

    public final AbstractC3493z.c l(int i10) {
        android.support.v4.media.session.b.a(this.objects[((i10 / 3) * 2) + 1]);
        return null;
    }

    public final int l0(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int P10 = P(i13);
            if (i10 == P10) {
                return i13;
            }
            if (i10 < P10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final Object m(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    public final void m0(Object obj, int i10, Object obj2) {
        f37246o.putObject(obj, Q(p0(i10)), obj2);
        j0(obj, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void makeImmutable(Object obj) {
        if (z(obj)) {
            if (obj instanceof AbstractC3491x) {
                AbstractC3491x abstractC3491x = (AbstractC3491x) obj;
                abstractC3491x.h();
                abstractC3491x.g();
                abstractC3491x.z();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int p02 = p0(i10);
                long Q10 = Q(p02);
                int o02 = o0(p02);
                if (o02 != 9) {
                    switch (o02) {
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
                            this.f37257k.c(obj, Q10);
                            break;
                        case 50:
                            Unsafe unsafe = f37246o;
                            Object object = unsafe.getObject(obj, Q10);
                            if (object != null) {
                                unsafe.putObject(obj, Q10, this.f37260n.toImmutable(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (u(obj, i10)) {
                    n(i10).makeImmutable(f37246o.getObject(obj, Q10));
                }
            }
            this.f37258l.j(obj);
            if (this.f37250d) {
                this.f37259m.f(obj);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void mergeFrom(Object obj, Object obj2) {
        f(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            J(obj, obj2, i10);
        }
        g0.F(this.f37258l, obj, obj2);
        if (this.f37250d) {
            g0.D(this.f37259m, obj, obj2);
        }
    }

    public final e0 n(int i10) {
        int i11 = (i10 / 3) * 2;
        e0 e0Var = (e0) this.objects[i11];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c10 = a0.a().c((Class) this.objects[i11 + 1]);
        this.objects[i11] = c10;
        return c10;
    }

    public final void n0(Object obj, int i10, int i11, Object obj2) {
        f37246o.putObject(obj, Q(p0(i11)), obj2);
        k0(obj, i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object newInstance() {
        return this.f37256j.newInstance(this.f37249c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int p(Object obj) {
        int i10;
        int i11;
        int h10;
        int d10;
        boolean z10;
        int f10;
        int i12;
        int L10;
        int N10;
        Unsafe unsafe = f37246o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.buffer.length) {
            int p02 = p0(i15);
            int P10 = P(i15);
            int o02 = o0(p02);
            if (o02 <= 17) {
                i10 = this.buffer[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f37253g || o02 < EnumC3488u.f37429R.a() || o02 > EnumC3488u.f37433V1.a()) ? 0 : this.buffer[i15 + 2] & i13;
                i11 = 0;
            }
            long Q10 = Q(p02);
            switch (o02) {
                case 0:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.h(P10, 0.0d);
                        i16 += h10;
                        break;
                    }
                case 1:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.p(P10, 0.0f);
                        i16 += h10;
                        break;
                    }
                case 2:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.v(P10, unsafe.getLong(obj, Q10));
                        i16 += h10;
                        break;
                    }
                case 3:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.O(P10, unsafe.getLong(obj, Q10));
                        i16 += h10;
                        break;
                    }
                case 4:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.t(P10, unsafe.getInt(obj, Q10));
                        i16 += h10;
                        break;
                    }
                case 5:
                    if ((i17 & i11) == 0) {
                        break;
                    } else {
                        h10 = AbstractC3479k.n(P10, 0L);
                        i16 += h10;
                        break;
                    }
                case 6:
                    if ((i17 & i11) != 0) {
                        h10 = AbstractC3479k.l(P10, 0);
                        i16 += h10;
                        break;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.d(P10, true);
                        i16 += d10;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(obj, Q10);
                        d10 = object instanceof AbstractC3476h ? AbstractC3479k.f(P10, (AbstractC3476h) object) : AbstractC3479k.J(P10, (String) object);
                        i16 += d10;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        d10 = g0.o(P10, unsafe.getObject(obj, Q10), n(i15));
                        i16 += d10;
                    }
                    break;
                case 10:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.f(P10, (AbstractC3476h) unsafe.getObject(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.M(P10, unsafe.getInt(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.j(P10, unsafe.getInt(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.B(P10, 0);
                        i16 += d10;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.D(P10, 0L);
                        i16 += d10;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.F(P10, unsafe.getInt(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.H(P10, unsafe.getLong(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        d10 = AbstractC3479k.r(P10, (O) unsafe.getObject(obj, Q10), n(i15));
                        i16 += d10;
                    }
                    break;
                case 18:
                    d10 = g0.h(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += d10;
                    break;
                case 19:
                    z10 = false;
                    f10 = g0.f(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 20:
                    z10 = false;
                    f10 = g0.m(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 21:
                    z10 = false;
                    f10 = g0.x(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 22:
                    z10 = false;
                    f10 = g0.k(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 23:
                    z10 = false;
                    f10 = g0.h(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 24:
                    z10 = false;
                    f10 = g0.f(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 25:
                    z10 = false;
                    f10 = g0.a(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 26:
                    d10 = g0.u(P10, (List) unsafe.getObject(obj, Q10));
                    i16 += d10;
                    break;
                case 27:
                    d10 = g0.p(P10, (List) unsafe.getObject(obj, Q10), n(i15));
                    i16 += d10;
                    break;
                case 28:
                    d10 = g0.c(P10, (List) unsafe.getObject(obj, Q10));
                    i16 += d10;
                    break;
                case 29:
                    d10 = g0.v(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += d10;
                    break;
                case 30:
                    z10 = false;
                    f10 = g0.d(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 31:
                    z10 = false;
                    f10 = g0.f(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 32:
                    z10 = false;
                    f10 = g0.h(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 33:
                    z10 = false;
                    f10 = g0.q(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 34:
                    z10 = false;
                    f10 = g0.s(P10, (List) unsafe.getObject(obj, Q10), false);
                    i16 += f10;
                    break;
                case 35:
                    i12 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 36:
                    i12 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 37:
                    i12 = g0.n((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 38:
                    i12 = g0.y((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 39:
                    i12 = g0.l((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 40:
                    i12 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 41:
                    i12 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 42:
                    i12 = g0.b((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 43:
                    i12 = g0.w((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 44:
                    i12 = g0.e((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 45:
                    i12 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 46:
                    i12 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 47:
                    i12 = g0.r((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 48:
                    i12 = g0.t((List) unsafe.getObject(obj, Q10));
                    if (i12 > 0) {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i12);
                        i16 += L10 + N10 + i12;
                    }
                    break;
                case 49:
                    d10 = g0.j(P10, (List) unsafe.getObject(obj, Q10), n(i15));
                    i16 += d10;
                    break;
                case 50:
                    d10 = this.f37260n.getSerializedSize(P10, unsafe.getObject(obj, Q10), m(i15));
                    i16 += d10;
                    break;
                case 51:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.h(P10, 0.0d);
                        i16 += d10;
                    }
                    break;
                case 52:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.p(P10, 0.0f);
                        i16 += d10;
                    }
                    break;
                case 53:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.v(P10, V(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 54:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.O(P10, V(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 55:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.t(P10, U(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 56:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.n(P10, 0L);
                        i16 += d10;
                    }
                    break;
                case 57:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.l(P10, 0);
                        i16 += d10;
                    }
                    break;
                case 58:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.d(P10, true);
                        i16 += d10;
                    }
                    break;
                case 59:
                    if (B(obj, P10, i15)) {
                        Object object2 = unsafe.getObject(obj, Q10);
                        d10 = object2 instanceof AbstractC3476h ? AbstractC3479k.f(P10, (AbstractC3476h) object2) : AbstractC3479k.J(P10, (String) object2);
                        i16 += d10;
                    }
                    break;
                case 60:
                    if (B(obj, P10, i15)) {
                        d10 = g0.o(P10, unsafe.getObject(obj, Q10), n(i15));
                        i16 += d10;
                    }
                    break;
                case 61:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.f(P10, (AbstractC3476h) unsafe.getObject(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 62:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.M(P10, U(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 63:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.j(P10, U(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 64:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.B(P10, 0);
                        i16 += d10;
                    }
                    break;
                case 65:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.D(P10, 0L);
                        i16 += d10;
                    }
                    break;
                case 66:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.F(P10, U(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 67:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.H(P10, V(obj, Q10));
                        i16 += d10;
                    }
                    break;
                case 68:
                    if (B(obj, P10, i15)) {
                        d10 = AbstractC3479k.r(P10, (O) unsafe.getObject(obj, Q10), n(i15));
                        i16 += d10;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int r10 = i16 + r(this.f37258l, obj);
        return this.f37250d ? r10 + this.f37259m.c(obj).c() : r10;
    }

    public final int p0(int i10) {
        return this.buffer[i10 + 1];
    }

    public final int q(Object obj) {
        int h10;
        int i10;
        int L10;
        int N10;
        Unsafe unsafe = f37246o;
        int i11 = 0;
        for (int i12 = 0; i12 < this.buffer.length; i12 += 3) {
            int p02 = p0(i12);
            int o02 = o0(p02);
            int P10 = P(i12);
            long Q10 = Q(p02);
            int i13 = (o02 < EnumC3488u.f37429R.a() || o02 > EnumC3488u.f37433V1.a()) ? 0 : this.buffer[i12 + 2] & 1048575;
            switch (o02) {
                case 0:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.h(P10, 0.0d);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.p(P10, 0.0f);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.v(P10, o0.A(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.O(P10, o0.A(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.t(P10, o0.z(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.n(P10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.l(P10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.d(P10, true);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (u(obj, i12)) {
                        Object C10 = o0.C(obj, Q10);
                        h10 = C10 instanceof AbstractC3476h ? AbstractC3479k.f(P10, (AbstractC3476h) C10) : AbstractC3479k.J(P10, (String) C10);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (u(obj, i12)) {
                        h10 = g0.o(P10, o0.C(obj, Q10), n(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.f(P10, (AbstractC3476h) o0.C(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.M(P10, o0.z(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.j(P10, o0.z(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.B(P10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.D(P10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.F(P10, o0.z(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.H(P10, o0.A(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (u(obj, i12)) {
                        h10 = AbstractC3479k.r(P10, (O) o0.C(obj, Q10), n(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h10 = g0.h(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 19:
                    h10 = g0.f(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 20:
                    h10 = g0.m(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 21:
                    h10 = g0.x(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 22:
                    h10 = g0.k(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 23:
                    h10 = g0.h(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 24:
                    h10 = g0.f(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 25:
                    h10 = g0.a(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 26:
                    h10 = g0.u(P10, D(obj, Q10));
                    i11 += h10;
                    break;
                case 27:
                    h10 = g0.p(P10, D(obj, Q10), n(i12));
                    i11 += h10;
                    break;
                case 28:
                    h10 = g0.c(P10, D(obj, Q10));
                    i11 += h10;
                    break;
                case 29:
                    h10 = g0.v(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 30:
                    h10 = g0.d(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 31:
                    h10 = g0.f(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 32:
                    h10 = g0.h(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 33:
                    h10 = g0.q(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 34:
                    h10 = g0.s(P10, D(obj, Q10), false);
                    i11 += h10;
                    break;
                case 35:
                    i10 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 36:
                    i10 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 37:
                    i10 = g0.n((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 38:
                    i10 = g0.y((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 39:
                    i10 = g0.l((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 40:
                    i10 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 41:
                    i10 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 42:
                    i10 = g0.b((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 43:
                    i10 = g0.w((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 44:
                    i10 = g0.e((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 45:
                    i10 = g0.g((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 46:
                    i10 = g0.i((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 47:
                    i10 = g0.r((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 48:
                    i10 = g0.t((List) unsafe.getObject(obj, Q10));
                    if (i10 <= 0) {
                        break;
                    } else {
                        if (this.f37253g) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        L10 = AbstractC3479k.L(P10);
                        N10 = AbstractC3479k.N(i10);
                        h10 = L10 + N10 + i10;
                        i11 += h10;
                        break;
                    }
                case 49:
                    h10 = g0.j(P10, D(obj, Q10), n(i12));
                    i11 += h10;
                    break;
                case 50:
                    h10 = this.f37260n.getSerializedSize(P10, o0.C(obj, Q10), m(i12));
                    i11 += h10;
                    break;
                case 51:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.h(P10, 0.0d);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.p(P10, 0.0f);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.v(P10, V(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.O(P10, V(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.t(P10, U(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.n(P10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.l(P10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.d(P10, true);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (B(obj, P10, i12)) {
                        Object C11 = o0.C(obj, Q10);
                        h10 = C11 instanceof AbstractC3476h ? AbstractC3479k.f(P10, (AbstractC3476h) C11) : AbstractC3479k.J(P10, (String) C11);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (B(obj, P10, i12)) {
                        h10 = g0.o(P10, o0.C(obj, Q10), n(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.f(P10, (AbstractC3476h) o0.C(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.M(P10, U(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.j(P10, U(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.B(P10, 0);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.D(P10, 0L);
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.F(P10, U(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.H(P10, V(obj, Q10));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (B(obj, P10, i12)) {
                        h10 = AbstractC3479k.r(P10, (O) o0.C(obj, Q10), n(i12));
                        i11 += h10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + r(this.f37258l, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(Object obj, r0 r0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        int i11;
        if (this.f37250d) {
            AbstractC3487t c10 = this.f37259m.c(obj);
            if (!c10.d()) {
                it = c10.f();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                Unsafe unsafe = f37246o;
                int i12 = 1048575;
                int i13 = 0;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int p02 = p0(i10);
                    int P10 = P(i10);
                    int o02 = o0(p02);
                    if (o02 <= 17) {
                        int i14 = this.buffer[i10 + 2];
                        int i15 = i14 & 1048575;
                        if (i15 != i12) {
                            i13 = unsafe.getInt(obj, i15);
                            i12 = i15;
                        }
                        i11 = 1 << (i14 >>> 20);
                    } else {
                        i11 = 0;
                    }
                    while (entry != null && this.f37259m.a(entry) <= P10) {
                        this.f37259m.j(r0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long Q10 = Q(p02);
                    switch (o02) {
                        case 0:
                            if ((i11 & i13) == 0) {
                                break;
                            } else {
                                r0Var.writeDouble(P10, h(obj, Q10));
                                continue;
                            }
                        case 1:
                            if ((i11 & i13) != 0) {
                                r0Var.writeFloat(P10, k(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i11 & i13) != 0) {
                                r0Var.writeInt64(P10, unsafe.getLong(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i11 & i13) != 0) {
                                r0Var.writeUInt64(P10, unsafe.getLong(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i11 & i13) != 0) {
                                r0Var.writeInt32(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i11 & i13) != 0) {
                                r0Var.writeFixed64(P10, unsafe.getLong(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i11 & i13) != 0) {
                                r0Var.writeFixed32(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i11 & i13) != 0) {
                                r0Var.writeBool(P10, e(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i11 & i13) != 0) {
                                u0(P10, unsafe.getObject(obj, Q10), r0Var);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i11 & i13) != 0) {
                                r0Var.e(P10, unsafe.getObject(obj, Q10), n(i10));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i11 & i13) != 0) {
                                r0Var.d(P10, (AbstractC3476h) unsafe.getObject(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i11 & i13) != 0) {
                                r0Var.writeUInt32(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i11 & i13) != 0) {
                                r0Var.writeEnum(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i11 & i13) != 0) {
                                r0Var.writeSFixed32(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i11 & i13) != 0) {
                                r0Var.writeSFixed64(P10, unsafe.getLong(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i11 & i13) != 0) {
                                r0Var.writeSInt32(P10, unsafe.getInt(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i11 & i13) != 0) {
                                r0Var.writeSInt64(P10, unsafe.getLong(obj, Q10));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i11 & i13) != 0) {
                                r0Var.b(P10, unsafe.getObject(obj, Q10), n(i10));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            g0.O(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 19:
                            g0.S(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 20:
                            g0.V(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 21:
                            g0.d0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 22:
                            g0.U(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 23:
                            g0.R(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 24:
                            g0.Q(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 25:
                            g0.M(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 26:
                            g0.b0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var);
                            break;
                        case 27:
                            g0.W(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, n(i10));
                            break;
                        case 28:
                            g0.N(P(i10), (List) unsafe.getObject(obj, Q10), r0Var);
                            break;
                        case 29:
                            g0.c0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 30:
                            g0.P(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 31:
                            g0.X(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 32:
                            g0.Y(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 33:
                            g0.Z(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 34:
                            g0.a0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, false);
                            continue;
                        case 35:
                            g0.O(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 36:
                            g0.S(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 37:
                            g0.V(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 38:
                            g0.d0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 39:
                            g0.U(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 40:
                            g0.R(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 41:
                            g0.Q(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 42:
                            g0.M(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 43:
                            g0.c0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 44:
                            g0.P(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 45:
                            g0.X(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 46:
                            g0.Y(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 47:
                            g0.Z(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 48:
                            g0.a0(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, true);
                            break;
                        case 49:
                            g0.T(P(i10), (List) unsafe.getObject(obj, Q10), r0Var, n(i10));
                            break;
                        case 50:
                            t0(r0Var, P10, unsafe.getObject(obj, Q10), i10);
                            break;
                        case 51:
                            if (B(obj, P10, i10)) {
                                r0Var.writeDouble(P10, S(obj, Q10));
                                break;
                            }
                            break;
                        case 52:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFloat(P10, T(obj, Q10));
                                break;
                            }
                            break;
                        case 53:
                            if (B(obj, P10, i10)) {
                                r0Var.writeInt64(P10, V(obj, Q10));
                                break;
                            }
                            break;
                        case 54:
                            if (B(obj, P10, i10)) {
                                r0Var.writeUInt64(P10, V(obj, Q10));
                                break;
                            }
                            break;
                        case 55:
                            if (B(obj, P10, i10)) {
                                r0Var.writeInt32(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 56:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFixed64(P10, V(obj, Q10));
                                break;
                            }
                            break;
                        case 57:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFixed32(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 58:
                            if (B(obj, P10, i10)) {
                                r0Var.writeBool(P10, R(obj, Q10));
                                break;
                            }
                            break;
                        case 59:
                            if (B(obj, P10, i10)) {
                                u0(P10, unsafe.getObject(obj, Q10), r0Var);
                                break;
                            }
                            break;
                        case 60:
                            if (B(obj, P10, i10)) {
                                r0Var.e(P10, unsafe.getObject(obj, Q10), n(i10));
                                break;
                            }
                            break;
                        case 61:
                            if (B(obj, P10, i10)) {
                                r0Var.d(P10, (AbstractC3476h) unsafe.getObject(obj, Q10));
                                break;
                            }
                            break;
                        case 62:
                            if (B(obj, P10, i10)) {
                                r0Var.writeUInt32(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 63:
                            if (B(obj, P10, i10)) {
                                r0Var.writeEnum(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 64:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSFixed32(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 65:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSFixed64(P10, V(obj, Q10));
                                break;
                            }
                            break;
                        case 66:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSInt32(P10, U(obj, Q10));
                                break;
                            }
                            break;
                        case 67:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSInt64(P10, V(obj, Q10));
                                break;
                            }
                            break;
                        case 68:
                            if (B(obj, P10, i10)) {
                                r0Var.b(P10, unsafe.getObject(obj, Q10), n(i10));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f37259m.j(r0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v0(this.f37258l, obj, r0Var);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
        Unsafe unsafe2 = f37246o;
        int i122 = 1048575;
        int i132 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v0(this.f37258l, obj, r0Var);
    }

    public final int r(k0 k0Var, Object obj) {
        return k0Var.h(k0Var.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(Object obj, r0 r0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i10;
        if (this.f37250d) {
            AbstractC3487t c10 = this.f37259m.c(obj);
            if (!c10.d()) {
                it = c10.f();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                for (i10 = 0; i10 < length; i10 += 3) {
                    int p02 = p0(i10);
                    int P10 = P(i10);
                    while (entry != null && this.f37259m.a(entry) <= P10) {
                        this.f37259m.j(r0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (o0(p02)) {
                        case 0:
                            if (u(obj, i10)) {
                                r0Var.writeDouble(P10, h(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (u(obj, i10)) {
                                r0Var.writeFloat(P10, k(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (u(obj, i10)) {
                                r0Var.writeInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (u(obj, i10)) {
                                r0Var.writeUInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (u(obj, i10)) {
                                r0Var.writeInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (u(obj, i10)) {
                                r0Var.writeFixed64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (u(obj, i10)) {
                                r0Var.writeFixed32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (u(obj, i10)) {
                                r0Var.writeBool(P10, e(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (u(obj, i10)) {
                                u0(P10, o0.C(obj, Q(p02)), r0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (u(obj, i10)) {
                                r0Var.e(P10, o0.C(obj, Q(p02)), n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (u(obj, i10)) {
                                r0Var.d(P10, (AbstractC3476h) o0.C(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (u(obj, i10)) {
                                r0Var.writeUInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (u(obj, i10)) {
                                r0Var.writeEnum(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (u(obj, i10)) {
                                r0Var.writeSFixed32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (u(obj, i10)) {
                                r0Var.writeSFixed64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (u(obj, i10)) {
                                r0Var.writeSInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (u(obj, i10)) {
                                r0Var.writeSInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (u(obj, i10)) {
                                r0Var.b(P10, o0.C(obj, Q(p02)), n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            g0.O(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 19:
                            g0.S(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 20:
                            g0.V(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 21:
                            g0.d0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 22:
                            g0.U(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 23:
                            g0.R(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 24:
                            g0.Q(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 25:
                            g0.M(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 26:
                            g0.b0(P(i10), (List) o0.C(obj, Q(p02)), r0Var);
                            break;
                        case 27:
                            g0.W(P(i10), (List) o0.C(obj, Q(p02)), r0Var, n(i10));
                            break;
                        case 28:
                            g0.N(P(i10), (List) o0.C(obj, Q(p02)), r0Var);
                            break;
                        case 29:
                            g0.c0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 30:
                            g0.P(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 31:
                            g0.X(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 32:
                            g0.Y(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 33:
                            g0.Z(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 34:
                            g0.a0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 35:
                            g0.O(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 36:
                            g0.S(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 37:
                            g0.V(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 38:
                            g0.d0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 39:
                            g0.U(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 40:
                            g0.R(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 41:
                            g0.Q(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 42:
                            g0.M(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 43:
                            g0.c0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 44:
                            g0.P(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 45:
                            g0.X(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 46:
                            g0.Y(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 47:
                            g0.Z(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 48:
                            g0.a0(P(i10), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 49:
                            g0.T(P(i10), (List) o0.C(obj, Q(p02)), r0Var, n(i10));
                            break;
                        case 50:
                            t0(r0Var, P10, o0.C(obj, Q(p02)), i10);
                            break;
                        case 51:
                            if (B(obj, P10, i10)) {
                                r0Var.writeDouble(P10, S(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFloat(P10, T(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (B(obj, P10, i10)) {
                                r0Var.writeInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (B(obj, P10, i10)) {
                                r0Var.writeUInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (B(obj, P10, i10)) {
                                r0Var.writeInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFixed64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (B(obj, P10, i10)) {
                                r0Var.writeFixed32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (B(obj, P10, i10)) {
                                r0Var.writeBool(P10, R(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (B(obj, P10, i10)) {
                                u0(P10, o0.C(obj, Q(p02)), r0Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (B(obj, P10, i10)) {
                                r0Var.e(P10, o0.C(obj, Q(p02)), n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (B(obj, P10, i10)) {
                                r0Var.d(P10, (AbstractC3476h) o0.C(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (B(obj, P10, i10)) {
                                r0Var.writeUInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (B(obj, P10, i10)) {
                                r0Var.writeEnum(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSFixed32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSFixed64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (B(obj, P10, i10)) {
                                r0Var.writeSInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (B(obj, P10, i10)) {
                                r0Var.b(P10, o0.C(obj, Q(p02)), n(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f37259m.j(r0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                v0(this.f37258l, obj, r0Var);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        v0(this.f37258l, obj, r0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(Object obj, r0 r0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        v0(this.f37258l, obj, r0Var);
        if (this.f37250d) {
            AbstractC3487t c10 = this.f37259m.c(obj);
            if (!c10.d()) {
                it = c10.a();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int p02 = p0(length);
                    int P10 = P(length);
                    while (entry != null && this.f37259m.a(entry) > P10) {
                        this.f37259m.j(r0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (o0(p02)) {
                        case 0:
                            if (u(obj, length)) {
                                r0Var.writeDouble(P10, h(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (u(obj, length)) {
                                r0Var.writeFloat(P10, k(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (u(obj, length)) {
                                r0Var.writeInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (u(obj, length)) {
                                r0Var.writeUInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (u(obj, length)) {
                                r0Var.writeInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (u(obj, length)) {
                                r0Var.writeFixed64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (u(obj, length)) {
                                r0Var.writeFixed32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (u(obj, length)) {
                                r0Var.writeBool(P10, e(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (u(obj, length)) {
                                u0(P10, o0.C(obj, Q(p02)), r0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (u(obj, length)) {
                                r0Var.e(P10, o0.C(obj, Q(p02)), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (u(obj, length)) {
                                r0Var.d(P10, (AbstractC3476h) o0.C(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (u(obj, length)) {
                                r0Var.writeUInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (u(obj, length)) {
                                r0Var.writeEnum(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (u(obj, length)) {
                                r0Var.writeSFixed32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (u(obj, length)) {
                                r0Var.writeSFixed64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (u(obj, length)) {
                                r0Var.writeSInt32(P10, s(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (u(obj, length)) {
                                r0Var.writeSInt64(P10, E(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (u(obj, length)) {
                                r0Var.b(P10, o0.C(obj, Q(p02)), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            g0.O(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 19:
                            g0.S(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 20:
                            g0.V(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 21:
                            g0.d0(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 22:
                            g0.U(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 23:
                            g0.R(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 24:
                            g0.Q(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 25:
                            g0.M(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 26:
                            g0.b0(P(length), (List) o0.C(obj, Q(p02)), r0Var);
                            break;
                        case 27:
                            g0.W(P(length), (List) o0.C(obj, Q(p02)), r0Var, n(length));
                            break;
                        case 28:
                            g0.N(P(length), (List) o0.C(obj, Q(p02)), r0Var);
                            break;
                        case 29:
                            g0.c0(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 30:
                            g0.P(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 31:
                            g0.X(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 32:
                            g0.Y(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 33:
                            g0.Z(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 34:
                            g0.a0(P(length), (List) o0.C(obj, Q(p02)), r0Var, false);
                            break;
                        case 35:
                            g0.O(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 36:
                            g0.S(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 37:
                            g0.V(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 38:
                            g0.d0(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 39:
                            g0.U(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 40:
                            g0.R(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 41:
                            g0.Q(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 42:
                            g0.M(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 43:
                            g0.c0(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 44:
                            g0.P(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 45:
                            g0.X(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 46:
                            g0.Y(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 47:
                            g0.Z(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 48:
                            g0.a0(P(length), (List) o0.C(obj, Q(p02)), r0Var, true);
                            break;
                        case 49:
                            g0.T(P(length), (List) o0.C(obj, Q(p02)), r0Var, n(length));
                            break;
                        case 50:
                            t0(r0Var, P10, o0.C(obj, Q(p02)), length);
                            break;
                        case 51:
                            if (B(obj, P10, length)) {
                                r0Var.writeDouble(P10, S(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (B(obj, P10, length)) {
                                r0Var.writeFloat(P10, T(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (B(obj, P10, length)) {
                                r0Var.writeInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (B(obj, P10, length)) {
                                r0Var.writeUInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (B(obj, P10, length)) {
                                r0Var.writeInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (B(obj, P10, length)) {
                                r0Var.writeFixed64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (B(obj, P10, length)) {
                                r0Var.writeFixed32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (B(obj, P10, length)) {
                                r0Var.writeBool(P10, R(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (B(obj, P10, length)) {
                                u0(P10, o0.C(obj, Q(p02)), r0Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (B(obj, P10, length)) {
                                r0Var.e(P10, o0.C(obj, Q(p02)), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (B(obj, P10, length)) {
                                r0Var.d(P10, (AbstractC3476h) o0.C(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (B(obj, P10, length)) {
                                r0Var.writeUInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (B(obj, P10, length)) {
                                r0Var.writeEnum(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (B(obj, P10, length)) {
                                r0Var.writeSFixed32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (B(obj, P10, length)) {
                                r0Var.writeSFixed64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (B(obj, P10, length)) {
                                r0Var.writeSInt32(P10, U(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (B(obj, P10, length)) {
                                r0Var.writeSInt64(P10, V(obj, Q(p02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (B(obj, P10, length)) {
                                r0Var.b(P10, o0.C(obj, Q(p02)), n(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f37259m.j(r0Var, entry);
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

    public final void t0(r0 r0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f37260n.forMapMetadata(m(i11));
            r0Var.a(i10, null, this.f37260n.forMapData(obj));
        }
    }

    public final boolean u(Object obj, int i10) {
        boolean equals;
        int d02 = d0(i10);
        long j10 = 1048575 & d02;
        if (j10 != 1048575) {
            return (o0.z(obj, j10) & (1 << (d02 >>> 20))) != 0;
        }
        int p02 = p0(i10);
        long Q10 = Q(p02);
        switch (o0(p02)) {
            case 0:
                return Double.doubleToRawLongBits(o0.x(obj, Q10)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0.y(obj, Q10)) != 0;
            case 2:
                return o0.A(obj, Q10) != 0;
            case 3:
                return o0.A(obj, Q10) != 0;
            case 4:
                return o0.z(obj, Q10) != 0;
            case 5:
                return o0.A(obj, Q10) != 0;
            case 6:
                return o0.z(obj, Q10) != 0;
            case 7:
                return o0.r(obj, Q10);
            case 8:
                Object C10 = o0.C(obj, Q10);
                if (C10 instanceof String) {
                    equals = ((String) C10).isEmpty();
                    break;
                } else {
                    if (!(C10 instanceof AbstractC3476h)) {
                        throw new IllegalArgumentException();
                    }
                    equals = AbstractC3476h.f37290b.equals(C10);
                    break;
                }
            case 9:
                return o0.C(obj, Q10) != null;
            case 10:
                equals = AbstractC3476h.f37290b.equals(o0.C(obj, Q10));
                break;
            case 11:
                return o0.z(obj, Q10) != 0;
            case 12:
                return o0.z(obj, Q10) != 0;
            case 13:
                return o0.z(obj, Q10) != 0;
            case 14:
                return o0.A(obj, Q10) != 0;
            case 15:
                return o0.z(obj, Q10) != 0;
            case 16:
                return o0.A(obj, Q10) != 0;
            case 17:
                return o0.C(obj, Q10) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final void u0(int i10, Object obj, r0 r0Var) {
        if (obj instanceof String) {
            r0Var.writeString(i10, (String) obj);
        } else {
            r0Var.d(i10, (AbstractC3476h) obj);
        }
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? u(obj, i10) : (i12 & i13) != 0;
    }

    public final void v0(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.t(k0Var.g(obj), r0Var);
    }

    public final boolean x(Object obj, int i10, int i11) {
        List list = (List) o0.C(obj, Q(i10));
        if (list.isEmpty()) {
            return true;
        }
        e0 n10 = n(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!n10.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final boolean y(Object obj, int i10, int i11) {
        if (this.f37260n.forMapData(o0.C(obj, Q(i10))).isEmpty()) {
            return true;
        }
        this.f37260n.forMapMetadata(m(i11));
        throw null;
    }
}
