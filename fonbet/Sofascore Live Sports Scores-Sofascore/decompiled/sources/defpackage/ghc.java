package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ghc implements usg {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final r5 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final qbd j;
    public final ccb k;
    public final ybk l;
    public final xtb m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public ghc(int[] iArr, Object[] objArr, int i, int i2, r5 r5Var, int[] iArr2, int i3, int i4, qbd qbdVar, ccb ccbVar, ybk ybkVar, qk6 qk6Var, xtb xtbVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = r5Var instanceof gw8;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = qbdVar;
        this.k = ccbVar;
        this.l = ybkVar;
        this.e = r5Var;
        this.m = xtbVar;
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
            StringBuilder q = wt3.q("Field ", str, " for ");
            q.append(cls.getName());
            q.append(" not found. Known fields are ");
            i3c.n(q, Arrays.toString(declaredFields));
            return null;
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof gw8) {
            return ((gw8) obj).f();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ghc w(jnf jnfVar, qbd qbdVar, ccb ccbVar, ybk ybkVar, qk6 qk6Var, xtb xtbVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
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
        Object[] objArr;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field F;
        int i26;
        char charAt10;
        int i27;
        int i28;
        Field F2;
        Field F3;
        int i29;
        char charAt11;
        int i30;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(jnfVar instanceof jnf)) {
            pvd.j();
            return null;
        }
        String str2 = jnfVar.b;
        int length = str2.length();
        int i34 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str2.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i37 = charAt15 & 8191;
            int i38 = 13;
            while (true) {
                i33 = i36 + 1;
                charAt14 = str2.charAt(i36);
                if (charAt14 < 55296) {
                    break;
                }
                i37 |= (charAt14 & 8191) << i38;
                i38 += 13;
                i36 = i33;
            }
            charAt15 = i37 | (charAt14 << i38);
            i36 = i33;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt16 = str2.charAt(i36);
            if (charAt16 >= 55296) {
                int i40 = charAt16 & 8191;
                int i41 = 13;
                while (true) {
                    i15 = i39 + 1;
                    charAt9 = str2.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i15;
                }
                charAt16 = i40 | (charAt9 << i41);
                i39 = i15;
            }
            int i42 = i39 + 1;
            int charAt17 = str2.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    charAt8 = str2.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                charAt17 = i43 | (charAt8 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int charAt18 = str2.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    charAt7 = str2.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                charAt18 = i46 | (charAt7 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            int charAt19 = str2.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    charAt6 = str2.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                charAt19 = i49 | (charAt6 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            charAt = str2.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    charAt5 = str2.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                charAt = i52 | (charAt5 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            int charAt20 = str2.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    charAt4 = str2.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                charAt20 = i55 | (charAt4 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int charAt21 = str2.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    charAt3 = str2.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                charAt21 = i58 | (charAt3 << i59);
                i57 = i9;
            }
            int i60 = i57 + 1;
            int charAt22 = str2.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt2 = str2.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i8;
                }
                charAt22 = i61 | (charAt2 << i62);
                i60 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = (charAt16 * 2) + charAt17;
            int i64 = charAt20;
            i2 = charAt18;
            i3 = i64;
            i4 = charAt16;
            i36 = i60;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i63;
            i7 = charAt22;
        }
        Object[] objArr2 = jnfVar.c;
        Class<?> cls = jnfVar.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt * 2];
        int i65 = i7 + i3;
        int i66 = i65;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = str2.charAt(i36);
            if (charAt23 >= i34) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = str2.charAt(i72);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                    length = i16;
                }
                charAt23 = i71 | (charAt13 << i73);
                i17 = i32;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int charAt24 = str2.charAt(i17);
            int i75 = charAt23;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i76 = charAt24 & 8191;
                int i77 = 13;
                while (true) {
                    i31 = i74 + 1;
                    charAt12 = str2.charAt(i74);
                    if (charAt12 < c) {
                        break;
                    }
                    i76 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i74 = i31;
                    c = 55296;
                }
                charAt24 = i76 | (charAt12 << i77);
                i74 = i31;
            }
            int i78 = charAt24 & 255;
            int i79 = i4;
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i68;
                i69++;
            }
            Unsafe unsafe = o;
            int[] iArr4 = iArr3;
            if (i78 >= 51) {
                int i80 = i74 + 1;
                int charAt25 = str2.charAt(i74);
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        charAt11 = str2.charAt(i82);
                        i30 = i81;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i81 = i30 | ((charAt11 & 8191) << i83);
                        i83 += 13;
                        i82 = i29;
                    }
                    charAt25 = i30 | (charAt11 << i83);
                    i28 = i29;
                } else {
                    i28 = i80;
                }
                int i84 = charAt25;
                int i85 = i78 - 51;
                int i86 = i28;
                if (i85 == 9 || i85 == 17) {
                    i18 = i65;
                    objArr3[lnb.d(i68, 3, 2, 1)] = objArr2[i6];
                    i6++;
                } else {
                    if (i85 == 12 && (wt3.b(jnfVar.a(), 1) || (charAt24 & a.o) != 0)) {
                        i18 = i65;
                        objArr3[lnb.d(i68, 3, 2, 1)] = objArr2[i6];
                        i6++;
                    }
                    i18 = i65;
                }
                int i87 = i84 * 2;
                Object obj = objArr2[i87];
                if (obj instanceof Field) {
                    F2 = (Field) obj;
                } else {
                    F2 = F(cls, (String) obj);
                    objArr2[i87] = F2;
                }
                i25 = (int) unsafe.objectFieldOffset(F2);
                int i88 = i87 + 1;
                Object obj2 = objArr2[i88];
                if (obj2 instanceof Field) {
                    F3 = (Field) obj2;
                } else {
                    F3 = F(cls, (String) obj2);
                    objArr2[i88] = F3;
                }
                str = str2;
                i20 = i68;
                i21 = (int) unsafe.objectFieldOffset(F3);
                i24 = i6;
                objArr = objArr3;
                i22 = i86;
                i23 = 0;
            } else {
                i18 = i65;
                int i89 = i6 + 1;
                Field F4 = F(cls, (String) objArr2[i6]);
                if (i78 == 9 || i78 == 17) {
                    objArr = objArr3;
                    objArr[lnb.d(i68, 3, 2, 1)] = F4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        objArr = objArr3;
                        i27 = i6 + 2;
                        objArr[lnb.d(i68, 3, 2, 1)] = objArr2[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        int i90 = i6;
                        if (jnfVar.a() == 1 || (charAt24 & a.o) != 0) {
                            objArr = objArr3;
                            i27 = i90 + 2;
                            objArr[lnb.d(i68, 3, 2, 1)] = objArr2[i89];
                        } else {
                            objArr = objArr3;
                        }
                    } else if (i78 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i68;
                        int i92 = (i68 / 3) * 2;
                        int i93 = i6 + 2;
                        objArr3[i92] = objArr2[i89];
                        if ((charAt24 & a.o) != 0) {
                            i19 = i6 + 3;
                            objArr3[i92 + 1] = objArr2[i93];
                            objArr = objArr3;
                        } else {
                            objArr = objArr3;
                            i19 = i93;
                        }
                        i67 = i91;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            str = str2;
                            i20 = i68;
                            i21 = 1048575;
                            i22 = i74;
                            i23 = 0;
                        } else {
                            i22 = i74 + 1;
                            int charAt26 = str2.charAt(i74);
                            if (charAt26 >= 55296) {
                                int i94 = charAt26 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i26 = i22 + 1;
                                    charAt10 = str2.charAt(i22);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i94 |= (charAt10 & 8191) << i95;
                                    i95 += 13;
                                    i22 = i26;
                                }
                                charAt26 = i94 | (charAt10 << i95);
                                i22 = i26;
                            }
                            int i96 = (charAt26 / 32) + (i79 * 2);
                            Object obj3 = objArr2[i96];
                            str = str2;
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr2[i96] = F;
                            }
                            i20 = i68;
                            int i97 = charAt26;
                            i21 = (int) unsafe.objectFieldOffset(F);
                            i23 = i97 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i24 = i19;
                        i25 = objectFieldOffset;
                    } else {
                        objArr = objArr3;
                    }
                    i19 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i20 = i68;
                    i21 = 1048575;
                    i22 = i74;
                    i23 = 0;
                    if (i78 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i24 = i19;
                    i25 = objectFieldOffset;
                }
                i19 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i20 = i68;
                i21 = 1048575;
                i22 = i74;
                i23 = 0;
                if (i78 >= 18) {
                }
                i24 = i19;
                i25 = objectFieldOffset;
            }
            int i98 = i20 + 1;
            iArr4[i20] = i75;
            int i99 = i20 + 2;
            int i100 = i20;
            iArr4[i98] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((charAt24 & a.o) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | i25;
            iArr4[i99] = (i23 << 20) | i21;
            i68 = i100 + 3;
            i36 = i22;
            objArr3 = objArr;
            length = i16;
            str2 = str;
            iArr3 = iArr4;
            i65 = i18;
            i34 = 55296;
            i6 = i24;
            i4 = i79;
        }
        return new ghc(iArr3, objArr3, i2, i5, jnfVar.a, iArr, i7, i65, qbdVar, ccbVar, ybkVar, qk6Var, xtbVar);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) tck.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) tck.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, zz0 zz0Var, usg usgVar, nk6 nk6Var) {
        int z;
        this.k.getClass();
        s7a a = ccb.a(obj, j);
        qo2 qo2Var = (qo2) zz0Var.e;
        int i = zz0Var.b;
        if ((i & 7) != 3) {
            throw maa.g();
        }
        do {
            gw8 d = usgVar.d();
            zz0Var.j(d, usgVar, nk6Var);
            usgVar.b(d);
            ((lff) a).add(d);
            if (qo2Var.c() || zz0Var.d != 0) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == i);
        zz0Var.d = z;
    }

    public final void C(Object obj, int i, zz0 zz0Var, usg usgVar, nk6 nk6Var) {
        int z;
        this.k.getClass();
        s7a a = ccb.a(obj, i & 1048575);
        qo2 qo2Var = (qo2) zz0Var.e;
        int i2 = zz0Var.b;
        if ((i2 & 7) != 2) {
            throw maa.g();
        }
        do {
            gw8 d = usgVar.d();
            zz0Var.l(d, usgVar, nk6Var);
            usgVar.b(d);
            ((lff) a).add(d);
            if (qo2Var.c() || zz0Var.d != 0) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == i2);
        zz0Var.d = z;
    }

    public final void D(int i, zz0 zz0Var, Object obj) {
        if ((536870912 & i) != 0) {
            zz0Var.Z(2);
            tck.o(i & 1048575, obj, ((qo2) zz0Var.e).y());
        } else if (!this.f) {
            tck.o(i & 1048575, obj, zz0Var.p());
        } else {
            zz0Var.Z(2);
            tck.o(i & 1048575, obj, ((qo2) zz0Var.e).x());
        }
    }

    public final void E(int i, zz0 zz0Var, Object obj) {
        boolean z = (536870912 & i) != 0;
        ccb ccbVar = this.k;
        if (z) {
            ccbVar.getClass();
            zz0Var.Q(ccb.a(obj, i & 1048575), true);
        } else {
            ccbVar.getClass();
            zz0Var.Q(ccb.a(obj, i & 1048575), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        tck.m((1 << (i2 >>> 20)) | tck.f(obj, j), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        tck.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.usg
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            a70.p(mz1.m(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                zsg.k(this.l, obj, obj2);
                return;
            }
            int J = J(i);
            long j = 1048575 & J;
            int i2 = iArr[i];
            switch (I(J)) {
                case 0:
                    if (o(i, obj2)) {
                        sck sckVar = tck.c;
                        obj3 = obj;
                        sckVar.j(obj3, j, sckVar.e(obj2, j));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i, obj2)) {
                        sck sckVar2 = tck.c;
                        sckVar2.k(obj, j, sckVar2.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        tck.n(obj, j, tck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        tck.n(obj, j, tck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i, obj2)) {
                        tck.n(obj, j, tck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i, obj2)) {
                        sck sckVar3 = tck.c;
                        sckVar3.g(obj, j, sckVar3.c(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i, obj2)) {
                        tck.o(j, obj, tck.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i, obj2)) {
                        tck.o(j, obj, tck.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        tck.n(obj, j, tck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        tck.m(tck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i, obj2)) {
                        tck.n(obj, j, tck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
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
                    this.k.getClass();
                    s7a s7aVar = (s7a) tck.h(obj, j);
                    s7a s7aVar2 = (s7a) tck.h(obj2, j);
                    int i3 = ((lff) s7aVar).c;
                    int i4 = ((lff) s7aVar2).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((lff) s7aVar).a) {
                            s7aVar = ((lff) s7aVar).e(i4 + i3);
                        }
                        ((lff) s7aVar).addAll(s7aVar2);
                    }
                    if (i3 > 0) {
                        s7aVar2 = s7aVar;
                    }
                    tck.o(j, obj, s7aVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = zsg.a;
                    Object h = tck.h(obj, j);
                    Object h2 = tck.h(obj2, j);
                    this.m.getClass();
                    tck.o(j, obj, xtb.a(h, h2));
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
                    if (q(i2, i, obj2)) {
                        tck.o(j, obj, tck.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        tck.o(j, obj, tck.h(obj2, j));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.usg
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof gw8) {
                gw8 gw8Var = (gw8) obj;
                gw8Var.j(Integer.MAX_VALUE);
                gw8Var.memoizedHashCode = 0;
                gw8Var.g();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int I = I(J);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.k.getClass();
                                lff lffVar = (lff) ((s7a) tck.h(obj, j));
                                if (lffVar.a) {
                                    lffVar.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((vtb) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (o(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            wbk wbkVar = ((gw8) obj).unknownFields;
            if (wbkVar.e) {
                wbkVar.e = false;
            }
        }
    }

    @Override // defpackage.usg
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int J = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & J) == 0 || n(i2, i, i3, i11, obj)) {
                int I = I(J);
                if (I == 9 || I == 17) {
                    if (n(i2, i, i3, i11, obj) && !m(i2).c(tck.h(obj, J & 1048575))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (q(i8, i2, obj) && !m(i2).c(tck.h(obj, J & 1048575))) {
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object h = tck.h(obj, J & 1048575);
                                this.m.getClass();
                                if (!((vtb) h).isEmpty()) {
                                    wt3.z(this.b[(i2 / 3) * 2]);
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) tck.h(obj, J & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        usg m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.c(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.usg
    public final gw8 d() {
        this.j.getClass();
        return ((gw8) this.e).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x074d A[Catch: all -> 0x0485, TryCatch #1 {all -> 0x0485, blocks: (B:35:0x0748, B:37:0x074d, B:38:0x0752, B:133:0x0480, B:136:0x0488, B:137:0x049d, B:138:0x04b2, B:139:0x04c7, B:140:0x04dc, B:141:0x04f1, B:142:0x0506, B:143:0x051b, B:144:0x0530, B:145:0x0555, B:146:0x0571, B:147:0x058e, B:148:0x05ab, B:149:0x05c8, B:150:0x05e8, B:151:0x0605, B:152:0x061a, B:153:0x063f, B:154:0x064c, B:155:0x066b, B:156:0x0688, B:157:0x06a5, B:158:0x06c2, B:159:0x06df, B:160:0x06fc, B:161:0x071a, B:166:0x0738), top: B:34:0x0748 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0776 A[LOOP:3: B:51:0x0774->B:52:0x0776, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0780  */
    @Override // defpackage.usg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, zz0 zz0Var, nk6 nk6Var) {
        ghc ghcVar;
        int i;
        int i2;
        zz0 zz0Var2;
        int I;
        Unsafe unsafe;
        ccb ccbVar;
        ghc ghcVar2 = this;
        Object obj2 = obj;
        zz0 zz0Var3 = zz0Var;
        nk6 nk6Var2 = nk6Var;
        nk6Var2.getClass();
        if (!p(obj2)) {
            a70.p(mz1.m(obj2, "Mutating immutable message: "));
            return;
        }
        ybk ybkVar = ghcVar2.l;
        int[] iArr = ghcVar2.g;
        int i3 = ghcVar2.i;
        int i4 = ghcVar2.h;
        wbk wbkVar = null;
        while (true) {
            try {
                int f = zz0Var3.f();
                int A = ghcVar2.A(f);
                if (A >= 0) {
                    int J = ghcVar2.J(A);
                    try {
                        I = I(J);
                        unsafe = o;
                        ccbVar = ghcVar2.k;
                    } catch (kaa unused) {
                        ghcVar = ghcVar2;
                        i = i4;
                    }
                    switch (I) {
                        case 0:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x = x(J);
                            zz0Var2.Z(1);
                            Object obj3 = obj2;
                            try {
                                tck.c.j(obj3, x, ((qo2) zz0Var2.e).m());
                                obj2 = obj3;
                                ghcVar.G(A, obj2);
                            } catch (kaa unused2) {
                                obj2 = obj3;
                                try {
                                    ybkVar.getClass();
                                    if (wbkVar == null) {
                                    }
                                    if (!ybk.b(0, zz0Var2, wbkVar)) {
                                    }
                                    ghcVar2 = ghcVar;
                                    zz0Var3 = zz0Var2;
                                    i4 = i;
                                    nk6Var2 = nk6Var;
                                } catch (Throwable th) {
                                    th = th;
                                    for (i2 = i; i2 < i3; i2++) {
                                        ghcVar.k(iArr[i2], obj2, wbkVar);
                                    }
                                    if (wbkVar != null) {
                                        ybkVar.getClass();
                                        ((gw8) obj2).unknownFields = wbkVar;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj3;
                                while (i2 < i3) {
                                }
                                if (wbkVar != null) {
                                }
                                throw th;
                            }
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                            break;
                        case 1:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x2 = x(J);
                            zz0Var2.Z(5);
                            tck.c.k(obj2, x2, ((qo2) zz0Var2.e).q());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 2:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x3 = x(J);
                            zz0Var2.Z(0);
                            tck.n(obj2, x3, ((qo2) zz0Var2.e).s());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 3:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x4 = x(J);
                            zz0Var2.Z(0);
                            tck.n(obj2, x4, ((qo2) zz0Var2.e).B());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 4:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x5 = x(J);
                            zz0Var2.Z(0);
                            tck.m(((qo2) zz0Var2.e).r(), x5, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 5:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x6 = x(J);
                            zz0Var2.Z(1);
                            tck.n(obj2, x6, ((qo2) zz0Var2.e).p());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 6:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x7 = x(J);
                            zz0Var2.Z(5);
                            tck.m(((qo2) zz0Var2.e).o(), x7, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 7:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x8 = x(J);
                            zz0Var2.Z(0);
                            tck.c.g(obj2, x8, ((qo2) zz0Var2.e).j());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 8:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar.D(J, zz0Var2, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 9:
                            nk6 nk6Var3 = nk6Var2;
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            r5 r5Var = (r5) ghcVar.u(A, obj2);
                            usg m = ghcVar.m(A);
                            zz0Var2.Z(2);
                            zz0Var2.l(r5Var, m, nk6Var3);
                            unsafe.putObject(obj2, ghcVar.J(A) & 1048575, r5Var);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 10:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            tck.o(x(J), obj2, zz0Var2.p());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 11:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x9 = x(J);
                            zz0Var2.Z(0);
                            tck.m(((qo2) zz0Var2.e).A(), x9, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 12:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            zz0Var2.Z(0);
                            int n2 = ((qo2) zz0Var2.e).n();
                            ghcVar.l(A);
                            tck.m(n2, x(J), obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 13:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x10 = x(J);
                            zz0Var2.Z(5);
                            tck.m(((qo2) zz0Var2.e).t(), x10, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 14:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x11 = x(J);
                            zz0Var2.Z(1);
                            tck.n(obj2, x11, ((qo2) zz0Var2.e).u());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 15:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x12 = x(J);
                            zz0Var2.Z(0);
                            tck.m(((qo2) zz0Var2.e).v(), x12, obj2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 16:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x13 = x(J);
                            zz0Var2.Z(0);
                            tck.n(obj2, x13, ((qo2) zz0Var2.e).w());
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 17:
                            nk6 nk6Var4 = nk6Var2;
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            r5 r5Var2 = (r5) ghcVar.u(A, obj2);
                            usg m2 = ghcVar.m(A);
                            zz0Var2.Z(3);
                            zz0Var2.j(r5Var2, m2, nk6Var4);
                            unsafe.putObject(obj2, ghcVar.J(A) & 1048575, r5Var2);
                            ghcVar.G(A, obj2);
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 18:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x14 = x(J);
                            ccbVar.getClass();
                            zz0Var2.t(ccb.a(obj2, x14));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 19:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x15 = x(J);
                            ccbVar.getClass();
                            zz0Var2.C(ccb.a(obj2, x15));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 20:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x16 = x(J);
                            ccbVar.getClass();
                            zz0Var2.G(ccb.a(obj2, x16));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 21:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x17 = x(J);
                            ccbVar.getClass();
                            zz0Var2.U(ccb.a(obj2, x17));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 22:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x18 = x(J);
                            ccbVar.getClass();
                            zz0Var2.E(ccb.a(obj2, x18));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 23:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x19 = x(J);
                            ccbVar.getClass();
                            zz0Var2.A(ccb.a(obj2, x19));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 24:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x20 = x(J);
                            ccbVar.getClass();
                            zz0Var2.y(ccb.a(obj2, x20));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 25:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            long x21 = x(J);
                            ccbVar.getClass();
                            zz0Var2.n(ccb.a(obj2, x21));
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 26:
                            i = i4;
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            try {
                                ghcVar.E(J, zz0Var2, obj2);
                            } catch (kaa unused3) {
                                ybkVar.getClass();
                                if (wbkVar == null) {
                                }
                                if (!ybk.b(0, zz0Var2, wbkVar)) {
                                }
                                ghcVar2 = ghcVar;
                                zz0Var3 = zz0Var2;
                                i4 = i;
                                nk6Var2 = nk6Var;
                            }
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                            break;
                        case 27:
                            i = i4;
                            try {
                                try {
                                    ghcVar2.C(obj2, J, zz0Var3, ghcVar2.m(A), nk6Var);
                                    zz0Var2 = zz0Var3;
                                    ghcVar = ghcVar2;
                                } catch (kaa unused4) {
                                    zz0Var2 = zz0Var3;
                                    ghcVar = ghcVar2;
                                    ybkVar.getClass();
                                    if (wbkVar == null) {
                                    }
                                    if (!ybk.b(0, zz0Var2, wbkVar)) {
                                    }
                                    ghcVar2 = ghcVar;
                                    zz0Var3 = zz0Var2;
                                    i4 = i;
                                    nk6Var2 = nk6Var;
                                }
                            } catch (kaa unused5) {
                                ghcVar = ghcVar2;
                                zz0Var2 = zz0Var3;
                                ybkVar.getClass();
                                if (wbkVar == null) {
                                }
                                if (!ybk.b(0, zz0Var2, wbkVar)) {
                                }
                                ghcVar2 = ghcVar;
                                zz0Var3 = zz0Var2;
                                i4 = i;
                                nk6Var2 = nk6Var;
                            }
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                            break;
                        case 28:
                            i = i4;
                            long x22 = x(J);
                            ccbVar.getClass();
                            zz0Var3.r(ccb.a(obj2, x22));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 29:
                            i = i4;
                            long x23 = x(J);
                            ccbVar.getClass();
                            zz0Var3.S(ccb.a(obj2, x23));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 30:
                            i = i4;
                            long x24 = x(J);
                            ccbVar.getClass();
                            s7a a = ccb.a(obj2, x24);
                            zz0Var3.v(a);
                            ghcVar2.l(A);
                            zsg.j(obj2, f, a, wbkVar, ybkVar);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 31:
                            i = i4;
                            long x25 = x(J);
                            ccbVar.getClass();
                            zz0Var3.I(ccb.a(obj2, x25));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 32:
                            i = i4;
                            long x26 = x(J);
                            ccbVar.getClass();
                            zz0Var3.K(ccb.a(obj2, x26));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 33:
                            i = i4;
                            long x27 = x(J);
                            ccbVar.getClass();
                            zz0Var3.M(ccb.a(obj2, x27));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 34:
                            i = i4;
                            long x28 = x(J);
                            ccbVar.getClass();
                            zz0Var3.O(ccb.a(obj2, x28));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 35:
                            i = i4;
                            long x29 = x(J);
                            ccbVar.getClass();
                            zz0Var3.t(ccb.a(obj2, x29));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 36:
                            i = i4;
                            long x30 = x(J);
                            ccbVar.getClass();
                            zz0Var3.C(ccb.a(obj2, x30));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 37:
                            i = i4;
                            long x31 = x(J);
                            ccbVar.getClass();
                            zz0Var3.G(ccb.a(obj2, x31));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 38:
                            i = i4;
                            long x32 = x(J);
                            ccbVar.getClass();
                            zz0Var3.U(ccb.a(obj2, x32));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 39:
                            i = i4;
                            long x33 = x(J);
                            ccbVar.getClass();
                            zz0Var3.E(ccb.a(obj2, x33));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 40:
                            i = i4;
                            long x34 = x(J);
                            ccbVar.getClass();
                            zz0Var3.A(ccb.a(obj2, x34));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 41:
                            i = i4;
                            long x35 = x(J);
                            ccbVar.getClass();
                            zz0Var3.y(ccb.a(obj2, x35));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 42:
                            i = i4;
                            long x36 = x(J);
                            ccbVar.getClass();
                            zz0Var3.n(ccb.a(obj2, x36));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 43:
                            i = i4;
                            long x37 = x(J);
                            ccbVar.getClass();
                            zz0Var3.S(ccb.a(obj2, x37));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 44:
                            i = i4;
                            long x38 = x(J);
                            ccbVar.getClass();
                            s7a a2 = ccb.a(obj2, x38);
                            zz0Var3.v(a2);
                            ghcVar2.l(A);
                            zsg.j(obj2, f, a2, wbkVar, ybkVar);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 45:
                            i = i4;
                            long x39 = x(J);
                            ccbVar.getClass();
                            zz0Var3.I(ccb.a(obj2, x39));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 46:
                            i = i4;
                            long x40 = x(J);
                            ccbVar.getClass();
                            zz0Var3.K(ccb.a(obj2, x40));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 47:
                            i = i4;
                            long x41 = x(J);
                            ccbVar.getClass();
                            zz0Var3.M(ccb.a(obj2, x41));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 48:
                            i = i4;
                            long x42 = x(J);
                            ccbVar.getClass();
                            zz0Var3.O(ccb.a(obj2, x42));
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 49:
                            i = i4;
                            try {
                                try {
                                    ghcVar2.B(obj2, x(J), zz0Var, ghcVar2.m(A), nk6Var);
                                    zz0Var3 = zz0Var;
                                    ghcVar = ghcVar2;
                                    zz0Var2 = zz0Var3;
                                } catch (kaa unused6) {
                                    ghcVar = ghcVar2;
                                    zz0Var2 = zz0Var;
                                    ybkVar.getClass();
                                    if (wbkVar == null) {
                                    }
                                    if (!ybk.b(0, zz0Var2, wbkVar)) {
                                    }
                                    ghcVar2 = ghcVar;
                                    zz0Var3 = zz0Var2;
                                    i4 = i;
                                    nk6Var2 = nk6Var;
                                }
                            } catch (kaa unused7) {
                                zz0Var2 = zz0Var;
                                ghcVar = ghcVar2;
                                ybkVar.getClass();
                                if (wbkVar == null) {
                                }
                                if (!ybk.b(0, zz0Var2, wbkVar)) {
                                }
                                ghcVar2 = ghcVar;
                                zz0Var3 = zz0Var2;
                                i4 = i;
                                nk6Var2 = nk6Var;
                            }
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                            break;
                        case 50:
                            i = i4;
                            ghcVar2.r(A, obj2, ghcVar2.b[(A / 3) * 2]);
                            throw null;
                            break;
                        case 51:
                            i = i4;
                            long x43 = x(J);
                            zz0Var3.Z(1);
                            tck.o(x43, obj2, Double.valueOf(((qo2) zz0Var3.e).m()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 52:
                            i = i4;
                            long x44 = x(J);
                            zz0Var3.Z(5);
                            tck.o(x44, obj2, Float.valueOf(((qo2) zz0Var3.e).q()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 53:
                            i = i4;
                            long x45 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x45, obj2, Long.valueOf(((qo2) zz0Var3.e).s()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 54:
                            i = i4;
                            long x46 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x46, obj2, Long.valueOf(((qo2) zz0Var3.e).B()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 55:
                            i = i4;
                            long x47 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x47, obj2, Integer.valueOf(((qo2) zz0Var3.e).r()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 56:
                            i = i4;
                            long x48 = x(J);
                            zz0Var3.Z(1);
                            tck.o(x48, obj2, Long.valueOf(((qo2) zz0Var3.e).p()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 57:
                            i = i4;
                            long x49 = x(J);
                            zz0Var3.Z(5);
                            tck.o(x49, obj2, Integer.valueOf(((qo2) zz0Var3.e).o()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 58:
                            i = i4;
                            long x50 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x50, obj2, Boolean.valueOf(((qo2) zz0Var3.e).j()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 59:
                            i = i4;
                            ghcVar2.D(J, zz0Var3, obj2);
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 60:
                            i = i4;
                            r5 r5Var3 = (r5) ghcVar2.v(f, A, obj2);
                            usg m3 = ghcVar2.m(A);
                            zz0Var3.Z(2);
                            zz0Var3.l(r5Var3, m3, nk6Var2);
                            unsafe.putObject(obj2, ghcVar2.J(A) & 1048575, r5Var3);
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 61:
                            i = i4;
                            tck.o(x(J), obj2, zz0Var3.p());
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 62:
                            i = i4;
                            long x51 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x51, obj2, Integer.valueOf(((qo2) zz0Var3.e).A()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 63:
                            i = i4;
                            zz0Var3.Z(0);
                            int n3 = ((qo2) zz0Var3.e).n();
                            ghcVar2.l(A);
                            tck.o(x(J), obj2, Integer.valueOf(n3));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 64:
                            i = i4;
                            long x52 = x(J);
                            zz0Var3.Z(5);
                            tck.o(x52, obj2, Integer.valueOf(((qo2) zz0Var3.e).t()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 65:
                            i = i4;
                            long x53 = x(J);
                            zz0Var3.Z(1);
                            tck.o(x53, obj2, Long.valueOf(((qo2) zz0Var3.e).u()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 66:
                            i = i4;
                            long x54 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x54, obj2, Integer.valueOf(((qo2) zz0Var3.e).v()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 67:
                            i = i4;
                            long x55 = x(J);
                            zz0Var3.Z(0);
                            tck.o(x55, obj2, Long.valueOf(((qo2) zz0Var3.e).w()));
                            ghcVar2.H(f, A, obj2);
                            ghcVar = ghcVar2;
                            zz0Var2 = zz0Var3;
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                        case 68:
                            try {
                                r5 r5Var4 = (r5) ghcVar2.v(f, A, obj2);
                                usg m4 = ghcVar2.m(A);
                                zz0Var3.Z(3);
                                zz0Var3.j(r5Var4, m4, nk6Var2);
                                i = i4;
                                try {
                                    try {
                                        unsafe.putObject(obj2, ghcVar2.J(A) & 1048575, r5Var4);
                                        ghcVar2.H(f, A, obj2);
                                        ghcVar = ghcVar2;
                                        zz0Var2 = zz0Var3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        ghcVar = ghcVar2;
                                        while (i2 < i3) {
                                        }
                                        if (wbkVar != null) {
                                        }
                                        throw th;
                                    }
                                } catch (kaa unused8) {
                                    ghcVar = ghcVar2;
                                    zz0Var2 = zz0Var3;
                                    ybkVar.getClass();
                                    if (wbkVar == null) {
                                    }
                                    if (!ybk.b(0, zz0Var2, wbkVar)) {
                                    }
                                    ghcVar2 = ghcVar;
                                    zz0Var3 = zz0Var2;
                                    i4 = i;
                                    nk6Var2 = nk6Var;
                                }
                            } catch (kaa unused9) {
                                i = i4;
                                ghcVar = ghcVar2;
                                zz0Var2 = zz0Var3;
                                ybkVar.getClass();
                                if (wbkVar == null) {
                                }
                                if (!ybk.b(0, zz0Var2, wbkVar)) {
                                }
                                ghcVar2 = ghcVar;
                                zz0Var3 = zz0Var2;
                                i4 = i;
                                nk6Var2 = nk6Var;
                            } catch (Throwable th4) {
                                th = th4;
                                i = i4;
                                ghcVar = ghcVar2;
                                while (i2 < i3) {
                                }
                                if (wbkVar != null) {
                                }
                                throw th;
                            }
                            ghcVar2 = ghcVar;
                            zz0Var3 = zz0Var2;
                            i4 = i;
                            nk6Var2 = nk6Var;
                            break;
                        default:
                            if (wbkVar == null) {
                                try {
                                    ybkVar.getClass();
                                    wbkVar = ybk.a(obj2);
                                } catch (kaa unused10) {
                                    ghcVar = ghcVar2;
                                    i = i4;
                                    zz0Var2 = zz0Var3;
                                    ybkVar.getClass();
                                    if (wbkVar == null) {
                                        wbkVar = ybk.a(obj2);
                                    }
                                    if (!ybk.b(0, zz0Var2, wbkVar)) {
                                        for (int i5 = i; i5 < i3; i5++) {
                                            ghcVar.k(iArr[i5], obj2, wbkVar);
                                        }
                                        if (wbkVar == null) {
                                            return;
                                        }
                                        ((gw8) obj2).unknownFields = wbkVar;
                                        return;
                                    }
                                    ghcVar2 = ghcVar;
                                    zz0Var3 = zz0Var2;
                                    i4 = i;
                                    nk6Var2 = nk6Var;
                                }
                            }
                            ybkVar.getClass();
                            if (ybk.b(0, zz0Var3, wbkVar)) {
                                ghcVar = ghcVar2;
                                i = i4;
                                zz0Var2 = zz0Var3;
                                ghcVar2 = ghcVar;
                                zz0Var3 = zz0Var2;
                                i4 = i;
                                nk6Var2 = nk6Var;
                            } else {
                                while (i4 < i3) {
                                    ghcVar2.k(iArr[i4], obj2, wbkVar);
                                    i4++;
                                }
                                if (wbkVar == null) {
                                    return;
                                }
                            }
                    }
                } else if (f == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        ghcVar2.k(iArr[i4], obj2, wbkVar);
                        i4++;
                    }
                    if (wbkVar == null) {
                        return;
                    } else {
                        ybkVar.getClass();
                    }
                } else {
                    ybkVar.getClass();
                    if (wbkVar == null) {
                        wbkVar = ybk.a(obj2);
                    }
                    if (!ybk.b(0, zz0Var3, wbkVar)) {
                        while (i4 < i3) {
                            ghcVar2.k(iArr[i4], obj2, wbkVar);
                            i4++;
                        }
                        if (wbkVar == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                ghcVar = ghcVar2;
                i = i4;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // defpackage.usg
    public final void f(Object obj, sz8 sz8Var) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        ghc ghcVar = this;
        sz8Var.getClass();
        g03 g03Var = (g03) sz8Var.b;
        int[] iArr = ghcVar.a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int J = ghcVar.J(i5);
            int i6 = iArr[i5];
            int I = I(J);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i7 = iArr[i5 + 2];
                z = 1;
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                int i9 = 1 << (i7 >>> 20);
                i = J;
                i2 = i9;
            } else {
                z = 1;
                i = J;
                i2 = 0;
            }
            long j = i & 1048575;
            switch (I) {
                case 0:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.r(i6, Double.doubleToRawLongBits(tck.c.e(obj, j)));
                    }
                case 1:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.p(i6, Float.floatToRawIntBits(tck.c.f(obj, j)));
                    }
                    ghcVar = this;
                case 2:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.B(i6, unsafe.getLong(obj, j));
                    }
                    ghcVar = this;
                case 3:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.B(i6, unsafe.getLong(obj, j));
                    }
                    ghcVar = this;
                case 4:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.t(i6, unsafe.getInt(obj, j));
                    }
                    ghcVar = this;
                case 5:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.r(i6, unsafe.getLong(obj, j));
                    }
                    ghcVar = this;
                case 6:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.p(i6, unsafe.getInt(obj, j));
                    }
                    ghcVar = this;
                case 7:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.n(i6, tck.c.c(obj, j));
                    }
                    ghcVar = this;
                case 8:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            g03Var.x(i6, (String) object);
                        } else {
                            g03Var.o(i6, (cc2) object);
                        }
                    }
                    ghcVar = this;
                case 9:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.w(i6, (r5) unsafe.getObject(obj, j), ghcVar.m(i5));
                    }
                case 10:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.o(i6, (cc2) unsafe.getObject(obj, j));
                    }
                    ghcVar = this;
                case 11:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.z(i6, unsafe.getInt(obj, j));
                    }
                    ghcVar = this;
                case 12:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.t(i6, unsafe.getInt(obj, j));
                    }
                    ghcVar = this;
                case 13:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.p(i6, unsafe.getInt(obj, j));
                    }
                    ghcVar = this;
                case 14:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        g03Var.r(i6, unsafe.getLong(obj, j));
                    }
                    ghcVar = this;
                case 15:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        int i10 = unsafe.getInt(obj, j);
                        g03Var.z(i6, (i10 >> 31) ^ (i10 << 1));
                    }
                    ghcVar = this;
                case 16:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        long j2 = unsafe.getLong(obj, j);
                        g03Var.B(i6, (j2 << 1) ^ (j2 >> 63));
                    }
                    ghcVar = this;
                case 17:
                    if (ghcVar.n(i5, i3, i4, i2, obj)) {
                        sz8Var.C(i6, unsafe.getObject(obj, j), ghcVar.m(i5));
                    }
                case 18:
                    zsg.n(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 19:
                    zsg.r(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 20:
                    zsg.t(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 21:
                    zsg.z(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 22:
                    zsg.s(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 23:
                    zsg.q(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 24:
                    zsg.p(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 25:
                    zsg.m(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = zsg.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            g03Var.x(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    usg m = ghcVar.m(i5);
                    Class cls2 = zsg.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            g03Var.w(i13, (r5) list2.get(i14), m);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = zsg.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            g03Var.o(i15, (cc2) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z2 = false;
                    zsg.y(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 30:
                    z2 = false;
                    zsg.o(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 31:
                    z2 = false;
                    zsg.u(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 32:
                    z2 = false;
                    zsg.v(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 33:
                    z2 = false;
                    zsg.w(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 34:
                    z2 = false;
                    zsg.x(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, false);
                case 35:
                    zsg.n(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 36:
                    zsg.r(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 37:
                    zsg.t(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 38:
                    zsg.z(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 39:
                    zsg.s(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 40:
                    zsg.q(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 41:
                    zsg.p(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 42:
                    zsg.m(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 43:
                    zsg.y(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 44:
                    zsg.o(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 45:
                    zsg.u(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 46:
                    zsg.v(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 47:
                    zsg.w(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 48:
                    zsg.x(iArr[i5], (List) unsafe.getObject(obj, j), sz8Var, z);
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    usg m2 = ghcVar.m(i5);
                    Class cls4 = zsg.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            sz8Var.C(i17, list4.get(i18), m2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object obj2 = ghcVar.b[(i5 / 3) * 2];
                        ghcVar.m.getClass();
                        wt3.z(obj2);
                        throw null;
                    }
                case 51:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.r(i6, Double.doubleToRawLongBits(((Double) tck.h(obj, j)).doubleValue()));
                    }
                case 52:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.p(i6, Float.floatToRawIntBits(((Float) tck.h(obj, j)).floatValue()));
                    }
                case 53:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.B(i6, z(obj, j));
                    }
                case 54:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.B(i6, z(obj, j));
                    }
                case 55:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.t(i6, y(obj, j));
                    }
                case 56:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.r(i6, z(obj, j));
                    }
                case 57:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.p(i6, y(obj, j));
                    }
                case 58:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.n(i6, ((Boolean) tck.h(obj, j)).booleanValue());
                    }
                case 59:
                    if (ghcVar.q(i6, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            g03Var.x(i6, (String) object2);
                        } else {
                            g03Var.o(i6, (cc2) object2);
                        }
                    }
                case 60:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.w(i6, (r5) unsafe.getObject(obj, j), ghcVar.m(i5));
                    }
                case 61:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.o(i6, (cc2) unsafe.getObject(obj, j));
                    }
                case 62:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.z(i6, y(obj, j));
                    }
                case 63:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.t(i6, y(obj, j));
                    }
                case 64:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.p(i6, y(obj, j));
                    }
                case 65:
                    if (ghcVar.q(i6, i5, obj)) {
                        g03Var.r(i6, z(obj, j));
                    }
                case 66:
                    if (ghcVar.q(i6, i5, obj)) {
                        int y = y(obj, j);
                        g03Var.z(i6, (y >> 31) ^ (y << 1));
                    }
                case 67:
                    if (ghcVar.q(i6, i5, obj)) {
                        long z3 = z(obj, j);
                        g03Var.B(i6, (z3 << z) ^ (z3 >> 63));
                    }
                case 68:
                    if (ghcVar.q(i6, i5, obj)) {
                        sz8Var.C(i6, unsafe.getObject(obj, j), ghcVar.m(i5));
                    }
                default:
            }
        }
        ghcVar.l.getClass();
        ((gw8) obj).unknownFields.d(sz8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.zsg.l(defpackage.tck.h(r12, r7), defpackage.tck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.tck.g(r12, r7) == defpackage.tck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.tck.g(r12, r7) == defpackage.tck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (defpackage.zsg.l(defpackage.tck.h(r12, r7), defpackage.tck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (defpackage.zsg.l(defpackage.tck.h(r12, r7), defpackage.tck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (defpackage.zsg.l(defpackage.tck.h(r12, r7), defpackage.tck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.tck.g(r12, r7) == defpackage.tck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.tck.f(r12, r7) == defpackage.tck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.tck.g(r12, r7) == defpackage.tck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.tck.g(r12, r7) == defpackage.tck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (defpackage.zsg.l(defpackage.tck.h(r12, r7), defpackage.tck.h(r13, r7)) != false) goto L105;
     */
    @Override // defpackage.usg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(gw8 gw8Var, gw8 gw8Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int J = J(i);
                long j = J & 1048575;
                switch (I(J)) {
                    case 0:
                        if (j(gw8Var, gw8Var2, i)) {
                            sck sckVar = tck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(gw8Var, gw8Var2, i)) {
                            sck sckVar2 = tck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(gw8Var, gw8Var2, i)) {
                            sck sckVar3 = tck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(gw8Var, gw8Var2, i)) {
                            break;
                        }
                        z = false;
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
                        z = zsg.l(tck.h(gw8Var, j), tck.h(gw8Var2, j));
                        break;
                    case 50:
                        z = zsg.l(tck.h(gw8Var, j), tck.h(gw8Var2, j));
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
                        long j2 = iArr[i + 2] & 1048575;
                        if (tck.f(gw8Var, j2) == tck.f(gw8Var2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (gw8Var.unknownFields.equals(gw8Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.usg
    public final int h(gw8 gw8Var) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int h7;
        int a;
        int i2;
        int f;
        int h8;
        int a2;
        int c;
        int h9;
        int size;
        int i3;
        int h10;
        int h11;
        int size2;
        int h12;
        int i4;
        int i5;
        int h13;
        int h14;
        int j3;
        int h15;
        int j4;
        int i6;
        ghc ghcVar = this;
        gw8 gw8Var2 = gw8Var;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = ghcVar.a;
            if (i7 >= iArr.length) {
                ghcVar.l.getClass();
                return gw8Var2.unknownFields.b() + i9;
            }
            int J = ghcVar.J(i7);
            int I = I(J);
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i13 != i10) {
                    i8 = i13 == 1048575 ? 0 : unsafe.getInt(gw8Var2, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            long j5 = J & 1048575;
            if (I >= d08.b.a) {
                int i14 = d08.c.a;
            }
            switch (I) {
                case 0:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h = g03.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 1:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h2 = g03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 2:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        long j6 = unsafe.getLong(gw8Var2, j5);
                        h3 = g03.h(i11);
                        j = g03.j(j6);
                        i9 += j + h3;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 3:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        long j7 = unsafe.getLong(gw8Var2, j5);
                        h3 = g03.h(i11);
                        j = g03.j(j7);
                        i9 += j + h3;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 4:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        int i15 = unsafe.getInt(gw8Var2, j5);
                        h4 = g03.h(i11);
                        j2 = g03.j(i15);
                        f = j2 + h4;
                        i9 += f;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 5:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h5 = g03.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 6:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h2 = g03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 7:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h6 = g03.h(i11) + 1;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 8:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        Object object = unsafe.getObject(gw8Var2, j5);
                        i9 = (object instanceof cc2 ? g03.f(i11, (cc2) object) : g03.g((String) object) + g03.h(i11)) + i9;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 9:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        Object object2 = unsafe.getObject(gw8Var2, j5);
                        usg m = ghcVar.m(i7);
                        Class cls = zsg.a;
                        h7 = g03.h(i11);
                        a = ((r5) object2).a(m);
                        i2 = g03.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 10:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        f = g03.f(i11, (cc2) unsafe.getObject(gw8Var2, j5));
                        i9 += f;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 11:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        int i16 = unsafe.getInt(gw8Var2, j5);
                        h4 = g03.h(i11);
                        j2 = g03.i(i16);
                        f = j2 + h4;
                        i9 += f;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 12:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        int i17 = unsafe.getInt(gw8Var2, j5);
                        h4 = g03.h(i11);
                        j2 = g03.j(i17);
                        f = j2 + h4;
                        i9 += f;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 13:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h2 = g03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 14:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        h5 = g03.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    ghcVar = this;
                    gw8Var2 = gw8Var;
                    i7 += 3;
                case 15:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        int i18 = unsafe.getInt(gw8Var2, j5);
                        h4 = g03.h(i11);
                        j2 = g03.i((i18 >> 31) ^ (i18 << 1));
                        f = j2 + h4;
                        i9 += f;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 16:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        long j8 = unsafe.getLong(gw8Var2, j5);
                        h3 = g03.h(i11);
                        j = g03.j((j8 << 1) ^ (j8 >> 63));
                        i9 += j + h3;
                    }
                    ghcVar = this;
                    i7 += 3;
                case 17:
                    if (ghcVar.n(i7, i10, i8, i, gw8Var2)) {
                        r5 r5Var = (r5) unsafe.getObject(gw8Var2, j5);
                        usg m2 = ghcVar.m(i7);
                        h8 = g03.h(i11) * 2;
                        a2 = r5Var.a(m2);
                        c = a2 + h8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 18:
                    c = zsg.c(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 19:
                    c = zsg.b(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 20:
                    List list = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls2 = zsg.a;
                    if (list.size() != 0) {
                        h9 = (g03.h(i11) * list.size()) + zsg.e(list);
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls3 = zsg.a;
                    size = list2.size();
                    if (size != 0) {
                        i3 = zsg.i(list2);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls4 = zsg.a;
                    size = list3.size();
                    if (size != 0) {
                        i3 = zsg.d(list3);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 23:
                    c = zsg.c(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 24:
                    c = zsg.b(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 25:
                    List list4 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls5 = zsg.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (g03.h(i11) + 1) * size3;
                    i7 += 3;
                case 26:
                    List list5 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls6 = zsg.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        h9 = g03.h(i11) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof cc2) {
                                int size5 = ((cc2) obj).size();
                                h9 = g03.i(size5) + size5 + h9;
                            } else {
                                h9 = g03.g((String) obj) + h9;
                            }
                        }
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 27:
                    List list6 = (List) unsafe.getObject(gw8Var2, j5);
                    usg m3 = ghcVar.m(i7);
                    Class cls7 = zsg.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        h11 = 0;
                    } else {
                        h11 = g03.h(i11) * size6;
                        for (int i20 = 0; i20 < size6; i20++) {
                            int a3 = ((r5) list6.get(i20)).a(m3);
                            h11 += g03.i(a3) + a3;
                        }
                    }
                    i9 += h11;
                    i7 += 3;
                case 28:
                    List list7 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls8 = zsg.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        h9 = g03.h(i11) * size7;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size8 = ((cc2) list7.get(i21)).size();
                            h9 += g03.i(size8) + size8;
                        }
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 29:
                    List list8 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls9 = zsg.a;
                    size = list8.size();
                    if (size != 0) {
                        i3 = zsg.h(list8);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls10 = zsg.a;
                    size = list9.size();
                    if (size != 0) {
                        i3 = zsg.a(list9);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 31:
                    c = zsg.b(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 32:
                    c = zsg.c(i11, (List) unsafe.getObject(gw8Var2, j5));
                    i9 += c;
                    i7 += 3;
                case 33:
                    List list10 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls11 = zsg.a;
                    size = list10.size();
                    if (size != 0) {
                        i3 = zsg.f(list10);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 34:
                    List list11 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls12 = zsg.a;
                    size = list11.size();
                    if (size != 0) {
                        i3 = zsg.g(list11);
                        h10 = g03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        i7 += 3;
                    }
                    h9 = 0;
                    i9 += h9;
                    i7 += 3;
                case 35:
                    List list12 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls13 = zsg.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls14 = zsg.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 37:
                    size2 = zsg.e((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 38:
                    size2 = zsg.i((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 39:
                    size2 = zsg.d((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls15 = zsg.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls16 = zsg.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls17 = zsg.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 43:
                    size2 = zsg.h((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 44:
                    size2 = zsg.a((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls18 = zsg.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(gw8Var2, j5);
                    Class cls19 = zsg.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 47:
                    size2 = zsg.f((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 48:
                    size2 = zsg.g((List) unsafe.getObject(gw8Var2, j5));
                    if (size2 > 0) {
                        h12 = g03.h(i11);
                        i4 = g03.i(size2);
                        i9 += i4 + h12 + size2;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(gw8Var2, j5);
                    usg m4 = ghcVar.m(i7);
                    Class cls20 = zsg.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i22 = 0; i22 < size9; i22++) {
                            i5 += ((r5) list19.get(i22)).a(m4) + (g03.h(i11) * 2);
                        }
                    }
                    i9 += i5;
                    i7 += 3;
                case 50:
                    Object object3 = unsafe.getObject(gw8Var2, j5);
                    Object obj2 = ghcVar.b[(i7 / 3) * 2];
                    ghcVar.m.getClass();
                    vtb vtbVar = (vtb) object3;
                    if (obj2 != null) {
                        pvd.j();
                        return 0;
                    }
                    if (vtbVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = vtbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                case 51:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h = g03.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 52:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h13 = g03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 53:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        long z = z(gw8Var2, j5);
                        h14 = g03.h(i11);
                        j3 = g03.j(z);
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 54:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        long z2 = z(gw8Var2, j5);
                        h14 = g03.h(i11);
                        j3 = g03.j(z2);
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 55:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        int y = y(gw8Var2, j5);
                        h15 = g03.h(i11);
                        j4 = g03.j(y);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 56:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h = g03.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 57:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h13 = g03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 58:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        c = g03.h(i11) + 1;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 59:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        Object object4 = unsafe.getObject(gw8Var2, j5);
                        i9 = (object4 instanceof cc2 ? g03.f(i11, (cc2) object4) : g03.g((String) object4) + g03.h(i11)) + i9;
                    }
                    i7 += 3;
                case 60:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        Object object5 = unsafe.getObject(gw8Var2, j5);
                        usg m5 = ghcVar.m(i7);
                        Class cls21 = zsg.a;
                        h7 = g03.h(i11);
                        a = ((r5) object5).a(m5);
                        i2 = g03.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 61:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        c = g03.f(i11, (cc2) unsafe.getObject(gw8Var2, j5));
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 62:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        int y2 = y(gw8Var2, j5);
                        h15 = g03.h(i11);
                        j4 = g03.i(y2);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 63:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        int y3 = y(gw8Var2, j5);
                        h15 = g03.h(i11);
                        j4 = g03.j(y3);
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 64:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h13 = g03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 65:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        h = g03.h(i11);
                        c = h + 8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 66:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        int y4 = y(gw8Var2, j5);
                        h15 = g03.h(i11);
                        j4 = g03.i((y4 >> 31) ^ (y4 << 1));
                        c = j4 + h15;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 67:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        long z3 = z(gw8Var2, j5);
                        h14 = g03.h(i11);
                        j3 = g03.j((z3 << 1) ^ (z3 >> 63));
                        i6 = j3 + h14;
                        i9 += i6;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                case 68:
                    if (ghcVar.q(i11, i7, gw8Var2)) {
                        r5 r5Var2 = (r5) unsafe.getObject(gw8Var2, j5);
                        usg m6 = ghcVar.m(i7);
                        h8 = g03.h(i11) * 2;
                        a2 = r5Var2.a(m6);
                        c = a2 + h8;
                        i9 += c;
                        i7 += 3;
                    } else {
                        i7 += 3;
                    }
                default:
                    i7 += 3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.usg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(gw8 gw8Var) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int J = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & J;
            int i6 = 1237;
            int i7 = 37;
            switch (I(J)) {
                case 0:
                    i = i3 * 53;
                    b = u7a.b(Double.doubleToLongBits(tck.c.e(gw8Var, j)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(tck.c.f(gw8Var, j));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = u7a.b(tck.g(gw8Var, j));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = u7a.b(tck.g(gw8Var, j));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = u7a.b(tck.g(gw8Var, j));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = tck.c.c(gw8Var, j);
                    Charset charset = u7a.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) tck.h(gw8Var, j)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = tck.h(gw8Var, j);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = tck.h(gw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = u7a.b(tck.g(gw8Var, j));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = tck.f(gw8Var, j);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = u7a.b(tck.g(gw8Var, j));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = tck.h(gw8Var, j);
                    if (h2 != null) {
                        i7 = h2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                    i = i3 * 53;
                    b = tck.h(gw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = tck.h(gw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(Double.doubleToLongBits(((Double) tck.h(gw8Var, j)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) tck.h(gw8Var, j)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(z(gw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(z(gw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(z(gw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i5, i4, gw8Var)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) tck.h(gw8Var, j)).booleanValue();
                        Charset charset2 = u7a.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = ((String) tck.h(gw8Var, j)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = tck.h(gw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = tck.h(gw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(z(gw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = y(gw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = u7a.b(z(gw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i5, i4, gw8Var)) {
                        i = i3 * 53;
                        b = tck.h(gw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return gw8Var.unknownFields.hashCode() + (i3 * 53);
    }

    public final boolean j(gw8 gw8Var, gw8 gw8Var2, int i) {
        return o(i, gw8Var) == o(i, gw8Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (tck.h(obj, J(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[lnb.d(i, 3, 2, 1)] == null) {
            return;
        }
        pvd.j();
    }

    public final usg m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        usg usgVar = (usg) objArr[i2];
        if (usgVar != null) {
            return usgVar;
        }
        usg a = hff.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int J = J(i);
            long j2 = J & 1048575;
            switch (I(J)) {
                case 0:
                    return Double.doubleToRawLongBits(tck.c.e(obj, j2)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(tck.c.f(obj, j2)) != 0) {
                    }
                    break;
                case 2:
                    if (tck.g(obj, j2) != 0) {
                    }
                    break;
                case 3:
                    if (tck.g(obj, j2) != 0) {
                    }
                    break;
                case 4:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 5:
                    if (tck.g(obj, j2) != 0) {
                    }
                    break;
                case 6:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 7:
                    return tck.c.c(obj, j2);
                case 8:
                    Object h = tck.h(obj, j2);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof cc2) {
                        return !cc2.c.equals(h);
                    }
                    ilg.c();
                    return false;
                case 9:
                    if (tck.h(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !cc2.c.equals(tck.h(obj, j2));
                case 11:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 12:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 13:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 14:
                    if (tck.g(obj, j2) != 0) {
                    }
                    break;
                case 15:
                    if (tck.f(obj, j2) != 0) {
                    }
                    break;
                case 16:
                    if (tck.g(obj, j2) != 0) {
                    }
                    break;
                case 17:
                    if (tck.h(obj, j2) != null) {
                    }
                    break;
                default:
                    ilg.c();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & tck.f(obj, j)) != 0) {
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return tck.f(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void r(int i, Object obj, Object obj2) {
        long J = J(i) & 1048575;
        Object h = tck.h(obj, J);
        xtb xtbVar = this.m;
        if (h != null) {
            xtbVar.getClass();
            if (!((vtb) h).a) {
                Object i2 = vtb.b.i();
                xtb.a(i2, h);
                tck.o(J, obj, i2);
                h = i2;
            }
        } else {
            xtbVar.getClass();
            h = vtb.b.i();
            tck.o(J, obj, h);
        }
        xtbVar.getClass();
        wt3.z(obj2);
        throw null;
    }

    public final void s(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                ilg.d(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            usg m = m(i);
            if (!o(i, obj)) {
                if (p(object)) {
                    gw8 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                gw8 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                ilg.d(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            usg m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    gw8 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                gw8 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        usg m = m(i);
        long J = J(i) & 1048575;
        if (!o(i, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        gw8 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, int i2, Object obj) {
        usg m = m(i2);
        if (!q(i, i2, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        gw8 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}
