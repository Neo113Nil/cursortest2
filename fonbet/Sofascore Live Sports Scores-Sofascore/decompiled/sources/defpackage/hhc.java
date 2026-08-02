package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hhc implements wsg {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final s5 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final sbd j;
    public final dcb k;
    public final zbk l;
    public final ztb m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(6));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public hhc(int[] iArr, Object[] objArr, int i, int i2, s5 s5Var, int[] iArr2, int i3, int i4, sbd sbdVar, dcb dcbVar, zbk zbkVar, rk6 rk6Var, ztb ztbVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = s5Var instanceof hw8;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = sbdVar;
        this.k = dcbVar;
        this.l = zbkVar;
        this.e = s5Var;
        this.m = ztbVar;
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
        if (obj instanceof hw8) {
            return ((hw8) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hhc w(lnf lnfVar, sbd sbdVar, dcb dcbVar, zbk zbkVar, rk6 rk6Var, ztb ztbVar) {
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
        if (!(lnfVar instanceof lnf)) {
            pvd.j();
            return null;
        }
        String str2 = lnfVar.b;
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
        Object[] objArr2 = lnfVar.c;
        Class<?> cls = lnfVar.a.getClass();
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
                    if (i85 == 12 && (wt3.b(lnfVar.a(), 1) || (charAt24 & a.o) != 0)) {
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
                        if (lnfVar.a() == 1 || (charAt24 & a.o) != 0) {
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
        return new hhc(iArr3, objArr3, i2, i5, lnfVar.a, iArr, i7, i65, sbdVar, dcbVar, zbkVar, rk6Var, ztbVar);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) vck.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) vck.h(obj, j)).longValue();
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

    public final void B(Object obj, long j, zz0 zz0Var, wsg wsgVar, ok6 ok6Var) {
        int z;
        this.k.getClass();
        t7a a = dcb.a(obj, j);
        qo2 qo2Var = (qo2) zz0Var.e;
        int i = zz0Var.b;
        if ((i & 7) != 3) {
            throw naa.g();
        }
        do {
            hw8 d = wsgVar.d();
            zz0Var.k(d, wsgVar, ok6Var);
            wsgVar.b(d);
            ((mff) a).add(d);
            if (qo2Var.c() || zz0Var.d != 0) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == i);
        zz0Var.d = z;
    }

    public final void C(Object obj, int i, zz0 zz0Var, wsg wsgVar, ok6 ok6Var) {
        int z;
        this.k.getClass();
        t7a a = dcb.a(obj, i & 1048575);
        qo2 qo2Var = (qo2) zz0Var.e;
        int i2 = zz0Var.b;
        if ((i2 & 7) != 2) {
            throw naa.g();
        }
        do {
            hw8 d = wsgVar.d();
            zz0Var.m(d, wsgVar, ok6Var);
            wsgVar.b(d);
            ((mff) a).add(d);
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
            vck.o(i & 1048575, obj, ((qo2) zz0Var.e).y());
        } else if (!this.f) {
            vck.o(i & 1048575, obj, zz0Var.q());
        } else {
            zz0Var.Z(2);
            vck.o(i & 1048575, obj, ((qo2) zz0Var.e).x());
        }
    }

    public final void E(int i, zz0 zz0Var, Object obj) {
        boolean z = (536870912 & i) != 0;
        dcb dcbVar = this.k;
        if (z) {
            dcbVar.getClass();
            zz0Var.R(dcb.a(obj, i & 1048575), true);
        } else {
            dcbVar.getClass();
            zz0Var.R(dcb.a(obj, i & 1048575), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        vck.m((1 << (i2 >>> 20)) | vck.f(obj, j), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        vck.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.wsg
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
                atg.k(this.l, obj, obj2);
                return;
            }
            int J = J(i);
            long j = 1048575 & J;
            int i2 = iArr[i];
            switch (I(J)) {
                case 0:
                    if (o(i, obj2)) {
                        sck sckVar = vck.c;
                        obj3 = obj;
                        sckVar.j(obj3, j, sckVar.e(obj2, j));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i, obj2)) {
                        sck sckVar2 = vck.c;
                        sckVar2.k(obj, j, sckVar2.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        vck.n(obj, j, vck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        vck.n(obj, j, vck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i, obj2)) {
                        vck.n(obj, j, vck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i, obj2)) {
                        sck sckVar3 = vck.c;
                        sckVar3.g(obj, j, sckVar3.c(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i, obj2)) {
                        vck.o(j, obj, vck.h(obj2, j));
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
                        vck.o(j, obj, vck.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        vck.n(obj, j, vck.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        vck.m(vck.f(obj2, j), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i, obj2)) {
                        vck.n(obj, j, vck.g(obj2, j));
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
                    t7a t7aVar = (t7a) vck.h(obj, j);
                    t7a t7aVar2 = (t7a) vck.h(obj2, j);
                    int i3 = ((mff) t7aVar).c;
                    int i4 = ((mff) t7aVar2).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((mff) t7aVar).a) {
                            t7aVar = ((mff) t7aVar).e(i4 + i3);
                        }
                        ((mff) t7aVar).addAll(t7aVar2);
                    }
                    if (i3 > 0) {
                        t7aVar2 = t7aVar;
                    }
                    vck.o(j, obj, t7aVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = atg.a;
                    Object h = vck.h(obj, j);
                    Object h2 = vck.h(obj2, j);
                    this.m.getClass();
                    vck.o(j, obj, ztb.a(h, h2));
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
                        vck.o(j, obj, vck.h(obj2, j));
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
                        vck.o(j, obj, vck.h(obj2, j));
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

    @Override // defpackage.wsg
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof hw8) {
                hw8 hw8Var = (hw8) obj;
                hw8Var.k(Integer.MAX_VALUE);
                hw8Var.memoizedHashCode = 0;
                hw8Var.h();
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
                                mff mffVar = (mff) ((t7a) vck.h(obj, j));
                                if (mffVar.a) {
                                    mffVar.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((wtb) object).a = false;
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
            xbk xbkVar = ((hw8) obj).unknownFields;
            if (xbkVar.e) {
                xbkVar.e = false;
            }
        }
    }

    @Override // defpackage.wsg
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
                    if (n(i2, i, i3, i11, obj) && !m(i2).c(vck.h(obj, J & 1048575))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (q(i8, i2, obj) && !m(i2).c(vck.h(obj, J & 1048575))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object h = vck.h(obj, J & 1048575);
                                this.m.getClass();
                                wtb wtbVar = (wtb) h;
                                if (wtbVar.isEmpty()) {
                                    continue;
                                } else {
                                    if (((yal) ((rtb) this.b[(i2 / 3) * 2]).a.b).a != zal.MESSAGE) {
                                        continue;
                                    } else {
                                        wsg wsgVar = null;
                                        for (Object obj2 : wtbVar.values()) {
                                            if (wsgVar == null) {
                                                wsgVar = kff.c.a(obj2.getClass());
                                            }
                                            if (!wsgVar.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) vck.h(obj, J & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        wsg m = m(i2);
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

    @Override // defpackage.wsg
    public final hw8 d() {
        this.j.getClass();
        return ((hw8) this.e).i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.atg.l(defpackage.vck.h(r12, r7), defpackage.vck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.vck.g(r12, r7) == defpackage.vck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.vck.g(r12, r7) == defpackage.vck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (defpackage.atg.l(defpackage.vck.h(r12, r7), defpackage.vck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (defpackage.atg.l(defpackage.vck.h(r12, r7), defpackage.vck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (defpackage.atg.l(defpackage.vck.h(r12, r7), defpackage.vck.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.vck.g(r12, r7) == defpackage.vck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.vck.f(r12, r7) == defpackage.vck.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.vck.g(r12, r7) == defpackage.vck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.vck.g(r12, r7) == defpackage.vck.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (defpackage.atg.l(defpackage.vck.h(r12, r7), defpackage.vck.h(r13, r7)) != false) goto L105;
     */
    @Override // defpackage.wsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(hw8 hw8Var, hw8 hw8Var2) {
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
                        if (j(hw8Var, hw8Var2, i)) {
                            sck sckVar = vck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(hw8Var, hw8Var2, i)) {
                            sck sckVar2 = vck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(hw8Var, hw8Var2, i)) {
                            sck sckVar3 = vck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(hw8Var, hw8Var2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(hw8Var, hw8Var2, i)) {
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
                        z = atg.l(vck.h(hw8Var, j), vck.h(hw8Var2, j));
                        break;
                    case 50:
                        z = atg.l(vck.h(hw8Var, j), vck.h(hw8Var2, j));
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
                        if (vck.f(hw8Var, j2) == vck.f(hw8Var2, j2)) {
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
                if (hw8Var.unknownFields.equals(hw8Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
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
    @Override // defpackage.wsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(hw8 hw8Var) {
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
                    b = w7a.b(Double.doubleToLongBits(vck.c.e(hw8Var, j)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(vck.c.f(hw8Var, j));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = w7a.b(vck.g(hw8Var, j));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = w7a.b(vck.g(hw8Var, j));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = w7a.b(vck.g(hw8Var, j));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = vck.c.c(hw8Var, j);
                    Charset charset = w7a.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) vck.h(hw8Var, j)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = vck.h(hw8Var, j);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = vck.h(hw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = w7a.b(vck.g(hw8Var, j));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = vck.f(hw8Var, j);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = w7a.b(vck.g(hw8Var, j));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = vck.h(hw8Var, j);
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
                    b = vck.h(hw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = vck.h(hw8Var, j).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(Double.doubleToLongBits(((Double) vck.h(hw8Var, j)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) vck.h(hw8Var, j)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(z(hw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(z(hw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(z(hw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i5, i4, hw8Var)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) vck.h(hw8Var, j)).booleanValue();
                        Charset charset2 = w7a.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = ((String) vck.h(hw8Var, j)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = vck.h(hw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = vck.h(hw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(z(hw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = y(hw8Var, j);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = w7a.b(z(hw8Var, j));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i5, i4, hw8Var)) {
                        i = i3 * 53;
                        b = vck.h(hw8Var, j).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return hw8Var.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.wsg
    public final int g(hw8 hw8Var) {
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
        hhc hhcVar = this;
        hw8 hw8Var2 = hw8Var;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = hhcVar.a;
            if (i7 >= iArr.length) {
                hhcVar.l.getClass();
                return hw8Var2.unknownFields.b() + i9;
            }
            int J = hhcVar.J(i7);
            int I = I(J);
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i13 != i10) {
                    i8 = i13 == 1048575 ? 0 : unsafe.getInt(hw8Var2, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            long j5 = J & 1048575;
            if (I >= e08.b.a) {
                int i14 = e08.c.a;
            }
            switch (I) {
                case 0:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h = h03.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h2 = h03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 2:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        long j6 = unsafe.getLong(hw8Var2, j5);
                        h3 = h03.h(i11);
                        j = h03.j(j6);
                        i9 += j + h3;
                    }
                    hhcVar = this;
                    break;
                case 3:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        long j7 = unsafe.getLong(hw8Var2, j5);
                        h3 = h03.h(i11);
                        j = h03.j(j7);
                        i9 += j + h3;
                    }
                    hhcVar = this;
                    break;
                case 4:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        int i15 = unsafe.getInt(hw8Var2, j5);
                        h4 = h03.h(i11);
                        j2 = h03.j(i15);
                        f = j2 + h4;
                        i9 += f;
                    }
                    hhcVar = this;
                    break;
                case 5:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h5 = h03.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 6:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h2 = h03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 7:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h6 = h03.h(i11) + 1;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 8:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        Object object = unsafe.getObject(hw8Var2, j5);
                        i9 = (object instanceof ec2 ? h03.f(i11, (ec2) object) : h03.g((String) object) + h03.h(i11)) + i9;
                    }
                    hhcVar = this;
                    break;
                case 9:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        Object object2 = unsafe.getObject(hw8Var2, j5);
                        wsg m = hhcVar.m(i7);
                        Class cls = atg.a;
                        h7 = h03.h(i11);
                        a = ((s5) object2).a(m);
                        i2 = h03.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        f = h03.f(i11, (ec2) unsafe.getObject(hw8Var2, j5));
                        i9 += f;
                    }
                    hhcVar = this;
                    break;
                case 11:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        int i16 = unsafe.getInt(hw8Var2, j5);
                        h4 = h03.h(i11);
                        j2 = h03.i(i16);
                        f = j2 + h4;
                        i9 += f;
                    }
                    hhcVar = this;
                    break;
                case 12:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        int i17 = unsafe.getInt(hw8Var2, j5);
                        h4 = h03.h(i11);
                        j2 = h03.j(i17);
                        f = j2 + h4;
                        i9 += f;
                    }
                    hhcVar = this;
                    break;
                case 13:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h2 = h03.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 14:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        h5 = h03.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    hhcVar = this;
                    hw8Var2 = hw8Var;
                    break;
                case 15:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        int i18 = unsafe.getInt(hw8Var2, j5);
                        h4 = h03.h(i11);
                        j2 = h03.i((i18 >> 31) ^ (i18 << 1));
                        f = j2 + h4;
                        i9 += f;
                    }
                    hhcVar = this;
                    break;
                case 16:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        long j8 = unsafe.getLong(hw8Var2, j5);
                        h3 = h03.h(i11);
                        j = h03.j((j8 << 1) ^ (j8 >> 63));
                        i9 += j + h3;
                    }
                    hhcVar = this;
                    break;
                case 17:
                    if (hhcVar.n(i7, i10, i8, i, hw8Var2)) {
                        s5 s5Var = (s5) unsafe.getObject(hw8Var2, j5);
                        wsg m2 = hhcVar.m(i7);
                        h8 = h03.h(i11) * 2;
                        a2 = s5Var.a(m2);
                        c = a2 + h8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = atg.c(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 19:
                    c = atg.b(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls2 = atg.a;
                    if (list.size() != 0) {
                        h9 = (h03.h(i11) * list.size()) + atg.e(list);
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 21:
                    List list2 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls3 = atg.a;
                    size = list2.size();
                    if (size != 0) {
                        i3 = atg.i(list2);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 22:
                    List list3 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls4 = atg.a;
                    size = list3.size();
                    if (size != 0) {
                        i3 = atg.d(list3);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 23:
                    c = atg.c(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 24:
                    c = atg.b(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls5 = atg.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (h03.h(i11) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls6 = atg.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        h9 = h03.h(i11) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof ec2) {
                                int size5 = ((ec2) obj).size();
                                h9 = h03.i(size5) + size5 + h9;
                            } else {
                                h9 = h03.g((String) obj) + h9;
                            }
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 27:
                    List list6 = (List) unsafe.getObject(hw8Var2, j5);
                    wsg m3 = hhcVar.m(i7);
                    Class cls7 = atg.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        h11 = 0;
                    } else {
                        h11 = h03.h(i11) * size6;
                        for (int i20 = 0; i20 < size6; i20++) {
                            int a3 = ((s5) list6.get(i20)).a(m3);
                            h11 += h03.i(a3) + a3;
                        }
                    }
                    i9 += h11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls8 = atg.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        h9 = h03.h(i11) * size7;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size8 = ((ec2) list7.get(i21)).size();
                            h9 += h03.i(size8) + size8;
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 29:
                    List list8 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls9 = atg.a;
                    size = list8.size();
                    if (size != 0) {
                        i3 = atg.h(list8);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 30:
                    List list9 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls10 = atg.a;
                    size = list9.size();
                    if (size != 0) {
                        i3 = atg.a(list9);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 31:
                    c = atg.b(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 32:
                    c = atg.c(i11, (List) unsafe.getObject(hw8Var2, j5));
                    i9 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls11 = atg.a;
                    size = list10.size();
                    if (size != 0) {
                        i3 = atg.f(list10);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 34:
                    List list11 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls12 = atg.a;
                    size = list11.size();
                    if (size != 0) {
                        i3 = atg.g(list11);
                        h10 = h03.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 35:
                    List list12 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls13 = atg.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls14 = atg.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = atg.e((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = atg.i((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = atg.d((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls15 = atg.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls16 = atg.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls17 = atg.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = atg.h((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = atg.a((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls18 = atg.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(hw8Var2, j5);
                    Class cls19 = atg.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = atg.f((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = atg.g((List) unsafe.getObject(hw8Var2, j5));
                    if (size2 > 0) {
                        h12 = h03.h(i11);
                        i4 = h03.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(hw8Var2, j5);
                    wsg m4 = hhcVar.m(i7);
                    Class cls20 = atg.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i22 = 0; i22 < size9; i22++) {
                            i5 += ((s5) list19.get(i22)).a(m4) + (h03.h(i11) * 2);
                        }
                    }
                    i9 += i5;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(hw8Var2, j5);
                    Object obj2 = hhcVar.b[(i7 / 3) * 2];
                    hhcVar.m.getClass();
                    wtb wtbVar = (wtb) object3;
                    rtb rtbVar = (rtb) obj2;
                    if (!wtbVar.isEmpty()) {
                        h9 = 0;
                        for (Map.Entry entry : wtbVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            rtbVar.getClass();
                            int h16 = h03.h(i11);
                            int a4 = rtb.a(rtbVar.a, key, value);
                            h9 += h03.i(a4) + a4 + h16;
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 51:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h = h03.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h13 = h03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        long z = z(hw8Var2, j5);
                        h14 = h03.h(i11);
                        j3 = h03.j(z);
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        long z2 = z(hw8Var2, j5);
                        h14 = h03.h(i11);
                        j3 = h03.j(z2);
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        int y = y(hw8Var2, j5);
                        h15 = h03.h(i11);
                        j4 = h03.j(y);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h = h03.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h13 = h03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        c = h03.h(i11) + 1;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        Object object4 = unsafe.getObject(hw8Var2, j5);
                        i9 = (object4 instanceof ec2 ? h03.f(i11, (ec2) object4) : h03.g((String) object4) + h03.h(i11)) + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        Object object5 = unsafe.getObject(hw8Var2, j5);
                        wsg m5 = hhcVar.m(i7);
                        Class cls21 = atg.a;
                        h7 = h03.h(i11);
                        a = ((s5) object5).a(m5);
                        i2 = h03.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        c = h03.f(i11, (ec2) unsafe.getObject(hw8Var2, j5));
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        int y2 = y(hw8Var2, j5);
                        h15 = h03.h(i11);
                        j4 = h03.i(y2);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        int y3 = y(hw8Var2, j5);
                        h15 = h03.h(i11);
                        j4 = h03.j(y3);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h13 = h03.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        h = h03.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        int y4 = y(hw8Var2, j5);
                        h15 = h03.h(i11);
                        j4 = h03.i((y4 >> 31) ^ (y4 << 1));
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        long z3 = z(hw8Var2, j5);
                        h14 = h03.h(i11);
                        j3 = h03.j((z3 << 1) ^ (z3 >> 63));
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (hhcVar.q(i11, i7, hw8Var2)) {
                        s5 s5Var2 = (s5) unsafe.getObject(hw8Var2, j5);
                        wsg m6 = hhcVar.m(i7);
                        h8 = h03.h(i11) * 2;
                        a2 = s5Var2.a(m6);
                        c = a2 + h8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x082a A[Catch: all -> 0x0500, TryCatch #1 {all -> 0x0500, blocks: (B:58:0x0825, B:60:0x082a, B:61:0x082f, B:126:0x04fb, B:129:0x0503, B:130:0x051b, B:131:0x0533, B:132:0x054b, B:133:0x0563, B:134:0x057b, B:135:0x0593, B:136:0x05ab, B:137:0x05c3, B:138:0x05eb, B:139:0x060b, B:140:0x062b, B:141:0x064c, B:142:0x066d, B:143:0x0690, B:144:0x06b0, B:145:0x06c9, B:146:0x06f1, B:147:0x0702, B:148:0x0724, B:149:0x0745, B:150:0x0766, B:151:0x0786, B:152:0x07a6, B:153:0x07c5, B:154:0x07e7, B:162:0x0809), top: B:57:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0850 A[LOOP:3: B:75:0x084e->B:76:0x0850, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x085a  */
    @Override // defpackage.wsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, zz0 zz0Var, ok6 ok6Var) {
        hhc hhcVar;
        int[] iArr;
        int i;
        int i2;
        zz0 zz0Var2;
        ok6 ok6Var2;
        int I;
        Unsafe unsafe;
        dcb dcbVar;
        hhc hhcVar2 = this;
        Object obj2 = obj;
        zz0 zz0Var3 = zz0Var;
        ok6 ok6Var3 = ok6Var;
        ok6Var3.getClass();
        if (!p(obj2)) {
            a70.p(mz1.m(obj2, "Mutating immutable message: "));
            return;
        }
        zbk zbkVar = hhcVar2.l;
        int[] iArr2 = hhcVar2.g;
        int i3 = hhcVar2.i;
        int i4 = hhcVar2.h;
        xbk xbkVar = null;
        while (true) {
            try {
                int f = zz0Var3.f();
                int A = hhcVar2.A(f);
                if (A >= 0) {
                    int J = hhcVar2.J(A);
                    try {
                        try {
                            I = I(J);
                            unsafe = o;
                            dcbVar = hhcVar2.k;
                        } catch (laa unused) {
                            hhcVar = hhcVar2;
                            iArr = iArr2;
                            i2 = i3;
                        }
                        switch (I) {
                            case 0:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x = x(J);
                                zz0Var2.Z(1);
                                try {
                                } catch (laa unused2) {
                                    obj2 = obj;
                                } catch (Throwable th) {
                                    th = th;
                                    obj2 = obj;
                                }
                                try {
                                    vck.c.j(obj, x, ((qo2) zz0Var2.e).m());
                                    obj2 = obj;
                                    hhcVar.G(A, obj2);
                                } catch (laa unused3) {
                                    obj2 = obj;
                                    try {
                                        zbkVar.getClass();
                                        if (xbkVar == null) {
                                        }
                                        if (!zbk.b(0, zz0Var2, xbkVar)) {
                                        }
                                        zz0Var3 = zz0Var2;
                                        ok6Var3 = ok6Var2;
                                        iArr2 = iArr;
                                        i3 = i2;
                                        hhcVar2 = hhcVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i = i2;
                                        while (i4 < i) {
                                            hhcVar.k(iArr[i4], obj2, xbkVar);
                                            i4++;
                                        }
                                        if (xbkVar != null) {
                                            zbkVar.getClass();
                                            ((hw8) obj2).unknownFields = xbkVar;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                    i = i2;
                                    while (i4 < i) {
                                    }
                                    if (xbkVar != null) {
                                    }
                                    throw th;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            case 1:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x2 = x(J);
                                zz0Var2.Z(5);
                                vck.c.k(obj2, x2, ((qo2) zz0Var2.e).q());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 2:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x3 = x(J);
                                zz0Var2.Z(0);
                                vck.n(obj2, x3, ((qo2) zz0Var2.e).s());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 3:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x4 = x(J);
                                zz0Var2.Z(0);
                                vck.n(obj2, x4, ((qo2) zz0Var2.e).B());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 4:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x5 = x(J);
                                zz0Var2.Z(0);
                                vck.m(((qo2) zz0Var2.e).r(), x5, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 5:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x6 = x(J);
                                zz0Var2.Z(1);
                                vck.n(obj2, x6, ((qo2) zz0Var2.e).p());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 6:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x7 = x(J);
                                zz0Var2.Z(5);
                                vck.m(((qo2) zz0Var2.e).o(), x7, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 7:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x8 = x(J);
                                zz0Var2.Z(0);
                                vck.c.g(obj2, x8, ((qo2) zz0Var2.e).j());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 8:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                hhcVar.D(J, zz0Var2, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 9:
                                hhcVar = hhcVar2;
                                iArr = iArr2;
                                i2 = i3;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                s5 s5Var = (s5) hhcVar.u(A, obj2);
                                wsg m = hhcVar.m(A);
                                zz0Var2.Z(2);
                                zz0Var2.m(s5Var, m, ok6Var2);
                                unsafe.putObject(obj2, hhcVar.J(A) & 1048575, s5Var);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 10:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                vck.o(x(J), obj2, zz0Var2.q());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 11:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x9 = x(J);
                                zz0Var2.Z(0);
                                vck.m(((qo2) zz0Var2.e).A(), x9, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 12:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var2.Z(0);
                                int n2 = ((qo2) zz0Var2.e).n();
                                hhcVar.l(A);
                                vck.m(n2, x(J), obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 13:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x10 = x(J);
                                zz0Var2.Z(5);
                                vck.m(((qo2) zz0Var2.e).t(), x10, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 14:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x11 = x(J);
                                zz0Var2.Z(1);
                                vck.n(obj2, x11, ((qo2) zz0Var2.e).u());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 15:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x12 = x(J);
                                zz0Var2.Z(0);
                                vck.m(((qo2) zz0Var2.e).v(), x12, obj2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 16:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x13 = x(J);
                                zz0Var2.Z(0);
                                vck.n(obj2, x13, ((qo2) zz0Var2.e).w());
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 17:
                                hhcVar = hhcVar2;
                                iArr = iArr2;
                                i2 = i3;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                s5 s5Var2 = (s5) hhcVar.u(A, obj2);
                                wsg m2 = hhcVar.m(A);
                                zz0Var2.Z(3);
                                zz0Var2.k(s5Var2, m2, ok6Var2);
                                unsafe.putObject(obj2, hhcVar.J(A) & 1048575, s5Var2);
                                hhcVar.G(A, obj2);
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 18:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x14 = x(J);
                                dcbVar.getClass();
                                zz0Var2.u(dcb.a(obj2, x14));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 19:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x15 = x(J);
                                dcbVar.getClass();
                                zz0Var2.D(dcb.a(obj2, x15));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 20:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x16 = x(J);
                                dcbVar.getClass();
                                zz0Var2.H(dcb.a(obj2, x16));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 21:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x17 = x(J);
                                dcbVar.getClass();
                                zz0Var2.V(dcb.a(obj2, x17));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 22:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x18 = x(J);
                                dcbVar.getClass();
                                zz0Var2.F(dcb.a(obj2, x18));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 23:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x19 = x(J);
                                dcbVar.getClass();
                                zz0Var2.B(dcb.a(obj2, x19));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 24:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x20 = x(J);
                                dcbVar.getClass();
                                zz0Var2.z(dcb.a(obj2, x20));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 25:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                long x21 = x(J);
                                dcbVar.getClass();
                                zz0Var2.o(dcb.a(obj2, x21));
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 26:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                try {
                                    hhcVar.E(J, zz0Var2, obj2);
                                } catch (laa unused4) {
                                    zbkVar.getClass();
                                    if (xbkVar == null) {
                                    }
                                    if (!zbk.b(0, zz0Var2, xbkVar)) {
                                    }
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            case 27:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    hhcVar2.C(obj2, J, zz0Var3, hhcVar2.m(A), ok6Var);
                                    zz0Var2 = zz0Var3;
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                } catch (laa unused5) {
                                    zz0Var2 = zz0Var3;
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zbkVar.getClass();
                                    if (xbkVar == null) {
                                    }
                                    if (!zbk.b(0, zz0Var2, xbkVar)) {
                                    }
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            case 28:
                                iArr = iArr2;
                                i2 = i3;
                                long x22 = x(J);
                                dcbVar.getClass();
                                zz0Var3.s(dcb.a(obj2, x22));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 29:
                                iArr = iArr2;
                                i2 = i3;
                                long x23 = x(J);
                                dcbVar.getClass();
                                zz0Var3.T(dcb.a(obj2, x23));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 30:
                                iArr = iArr2;
                                i2 = i3;
                                long x24 = x(J);
                                dcbVar.getClass();
                                t7a a = dcb.a(obj2, x24);
                                zz0Var3.w(a);
                                hhcVar2.l(A);
                                atg.j(obj2, f, a, xbkVar, zbkVar);
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 31:
                                iArr = iArr2;
                                i2 = i3;
                                long x25 = x(J);
                                dcbVar.getClass();
                                zz0Var3.J(dcb.a(obj2, x25));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 32:
                                iArr = iArr2;
                                i2 = i3;
                                long x26 = x(J);
                                dcbVar.getClass();
                                zz0Var3.L(dcb.a(obj2, x26));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 33:
                                iArr = iArr2;
                                i2 = i3;
                                long x27 = x(J);
                                dcbVar.getClass();
                                zz0Var3.N(dcb.a(obj2, x27));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 34:
                                iArr = iArr2;
                                i2 = i3;
                                long x28 = x(J);
                                dcbVar.getClass();
                                zz0Var3.P(dcb.a(obj2, x28));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 35:
                                iArr = iArr2;
                                i2 = i3;
                                long x29 = x(J);
                                dcbVar.getClass();
                                zz0Var3.u(dcb.a(obj2, x29));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 36:
                                iArr = iArr2;
                                i2 = i3;
                                long x30 = x(J);
                                dcbVar.getClass();
                                zz0Var3.D(dcb.a(obj2, x30));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 37:
                                iArr = iArr2;
                                i2 = i3;
                                long x31 = x(J);
                                dcbVar.getClass();
                                zz0Var3.H(dcb.a(obj2, x31));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 38:
                                iArr = iArr2;
                                i2 = i3;
                                long x32 = x(J);
                                dcbVar.getClass();
                                zz0Var3.V(dcb.a(obj2, x32));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 39:
                                iArr = iArr2;
                                i2 = i3;
                                long x33 = x(J);
                                dcbVar.getClass();
                                zz0Var3.F(dcb.a(obj2, x33));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 40:
                                iArr = iArr2;
                                i2 = i3;
                                long x34 = x(J);
                                dcbVar.getClass();
                                zz0Var3.B(dcb.a(obj2, x34));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 41:
                                iArr = iArr2;
                                i2 = i3;
                                long x35 = x(J);
                                dcbVar.getClass();
                                zz0Var3.z(dcb.a(obj2, x35));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 42:
                                iArr = iArr2;
                                i2 = i3;
                                long x36 = x(J);
                                dcbVar.getClass();
                                zz0Var3.o(dcb.a(obj2, x36));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 43:
                                iArr = iArr2;
                                i2 = i3;
                                long x37 = x(J);
                                dcbVar.getClass();
                                zz0Var3.T(dcb.a(obj2, x37));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 44:
                                iArr = iArr2;
                                i2 = i3;
                                long x38 = x(J);
                                dcbVar.getClass();
                                t7a a2 = dcb.a(obj2, x38);
                                zz0Var3.w(a2);
                                hhcVar2.l(A);
                                atg.j(obj2, f, a2, xbkVar, zbkVar);
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 45:
                                iArr = iArr2;
                                i2 = i3;
                                long x39 = x(J);
                                dcbVar.getClass();
                                zz0Var3.J(dcb.a(obj2, x39));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 46:
                                iArr = iArr2;
                                i2 = i3;
                                long x40 = x(J);
                                dcbVar.getClass();
                                zz0Var3.L(dcb.a(obj2, x40));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 47:
                                iArr = iArr2;
                                i2 = i3;
                                long x41 = x(J);
                                dcbVar.getClass();
                                zz0Var3.N(dcb.a(obj2, x41));
                                ok6Var2 = ok6Var;
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 48:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    long x42 = x(J);
                                    dcbVar.getClass();
                                    zz0Var3.P(dcb.a(obj2, x42));
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zz0Var2 = zz0Var3;
                                } catch (laa unused6) {
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zz0Var2 = zz0Var3;
                                    zbkVar.getClass();
                                    if (xbkVar == null) {
                                        xbkVar = zbk.a(obj2);
                                    }
                                    if (!zbk.b(0, zz0Var2, xbkVar)) {
                                        int i5 = i2;
                                        while (i4 < i5) {
                                            hhcVar.k(iArr[i4], obj2, xbkVar);
                                            i4++;
                                        }
                                        if (xbkVar == null) {
                                            return;
                                        }
                                        ((hw8) obj2).unknownFields = xbkVar;
                                        return;
                                    }
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 49:
                                iArr = iArr2;
                                i2 = i3;
                                obj2 = obj;
                                try {
                                    hhcVar2.B(obj2, x(J), zz0Var, hhcVar2.m(A), ok6Var);
                                    zz0Var3 = zz0Var;
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zz0Var2 = zz0Var3;
                                } catch (laa unused7) {
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zz0Var2 = zz0Var;
                                    zbkVar.getClass();
                                    if (xbkVar == null) {
                                    }
                                    if (!zbk.b(0, zz0Var2, xbkVar)) {
                                    }
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            case 50:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    hhcVar2.r(obj2, A, hhcVar2.b[(A / 3) * 2], ok6Var3, zz0Var3);
                                    obj2 = obj;
                                    zz0Var2 = zz0Var;
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                } catch (laa unused8) {
                                    obj2 = obj;
                                    zz0Var2 = zz0Var;
                                    ok6Var2 = ok6Var;
                                    hhcVar = hhcVar2;
                                    zbkVar.getClass();
                                    if (xbkVar == null) {
                                    }
                                    if (!zbk.b(0, zz0Var2, xbkVar)) {
                                    }
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj;
                                    hhcVar = hhcVar2;
                                    i = i2;
                                    while (i4 < i) {
                                    }
                                    if (xbkVar != null) {
                                    }
                                    throw th;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            case 51:
                                iArr = iArr2;
                                i2 = i3;
                                long x43 = x(J);
                                zz0Var3.Z(1);
                                vck.o(x43, obj2, Double.valueOf(((qo2) zz0Var3.e).m()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 52:
                                iArr = iArr2;
                                i2 = i3;
                                long x44 = x(J);
                                zz0Var3.Z(5);
                                vck.o(x44, obj2, Float.valueOf(((qo2) zz0Var3.e).q()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 53:
                                iArr = iArr2;
                                i2 = i3;
                                long x45 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x45, obj2, Long.valueOf(((qo2) zz0Var3.e).s()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 54:
                                iArr = iArr2;
                                i2 = i3;
                                long x46 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x46, obj2, Long.valueOf(((qo2) zz0Var3.e).B()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 55:
                                iArr = iArr2;
                                i2 = i3;
                                long x47 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x47, obj2, Integer.valueOf(((qo2) zz0Var3.e).r()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 56:
                                iArr = iArr2;
                                i2 = i3;
                                long x48 = x(J);
                                zz0Var3.Z(1);
                                vck.o(x48, obj2, Long.valueOf(((qo2) zz0Var3.e).p()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 57:
                                iArr = iArr2;
                                i2 = i3;
                                long x49 = x(J);
                                zz0Var3.Z(5);
                                vck.o(x49, obj2, Integer.valueOf(((qo2) zz0Var3.e).o()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 58:
                                iArr = iArr2;
                                i2 = i3;
                                long x50 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x50, obj2, Boolean.valueOf(((qo2) zz0Var3.e).j()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 59:
                                iArr = iArr2;
                                i2 = i3;
                                hhcVar2.D(J, zz0Var3, obj2);
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 60:
                                iArr = iArr2;
                                i2 = i3;
                                s5 s5Var3 = (s5) hhcVar2.v(f, A, obj2);
                                wsg m3 = hhcVar2.m(A);
                                zz0Var3.Z(2);
                                zz0Var3.m(s5Var3, m3, ok6Var3);
                                unsafe.putObject(obj2, hhcVar2.J(A) & 1048575, s5Var3);
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 61:
                                iArr = iArr2;
                                i2 = i3;
                                vck.o(x(J), obj2, zz0Var3.q());
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 62:
                                iArr = iArr2;
                                i2 = i3;
                                long x51 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x51, obj2, Integer.valueOf(((qo2) zz0Var3.e).A()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 63:
                                iArr = iArr2;
                                i2 = i3;
                                zz0Var3.Z(0);
                                int n3 = ((qo2) zz0Var3.e).n();
                                hhcVar2.l(A);
                                vck.o(x(J), obj2, Integer.valueOf(n3));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 64:
                                iArr = iArr2;
                                i2 = i3;
                                long x52 = x(J);
                                zz0Var3.Z(5);
                                vck.o(x52, obj2, Integer.valueOf(((qo2) zz0Var3.e).t()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 65:
                                iArr = iArr2;
                                i2 = i3;
                                long x53 = x(J);
                                zz0Var3.Z(1);
                                vck.o(x53, obj2, Long.valueOf(((qo2) zz0Var3.e).u()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 66:
                                iArr = iArr2;
                                i2 = i3;
                                long x54 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x54, obj2, Integer.valueOf(((qo2) zz0Var3.e).v()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 67:
                                iArr = iArr2;
                                i2 = i3;
                                long x55 = x(J);
                                zz0Var3.Z(0);
                                vck.o(x55, obj2, Long.valueOf(((qo2) zz0Var3.e).w()));
                                hhcVar2.H(f, A, obj2);
                                hhcVar = hhcVar2;
                                zz0Var2 = zz0Var3;
                                ok6Var2 = ok6Var3;
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                            case 68:
                                try {
                                    s5 s5Var4 = (s5) hhcVar2.v(f, A, obj2);
                                    wsg m4 = hhcVar2.m(A);
                                    zz0Var3.Z(3);
                                    zz0Var3.k(s5Var4, m4, ok6Var3);
                                    iArr = iArr2;
                                    i2 = i3;
                                    try {
                                        try {
                                            unsafe.putObject(obj2, hhcVar2.J(A) & 1048575, s5Var4);
                                            hhcVar2.H(f, A, obj2);
                                            hhcVar = hhcVar2;
                                            zz0Var2 = zz0Var3;
                                            ok6Var2 = ok6Var3;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            hhcVar = hhcVar2;
                                            i = i2;
                                            while (i4 < i) {
                                            }
                                            if (xbkVar != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (laa unused9) {
                                        hhcVar = hhcVar2;
                                        zz0Var2 = zz0Var3;
                                        ok6Var2 = ok6Var3;
                                        zbkVar.getClass();
                                        if (xbkVar == null) {
                                        }
                                        if (!zbk.b(0, zz0Var2, xbkVar)) {
                                        }
                                        zz0Var3 = zz0Var2;
                                        ok6Var3 = ok6Var2;
                                        iArr2 = iArr;
                                        i3 = i2;
                                        hhcVar2 = hhcVar;
                                    }
                                } catch (laa unused10) {
                                    iArr = iArr2;
                                    i2 = i3;
                                } catch (Throwable th6) {
                                    th = th6;
                                    iArr = iArr2;
                                    i2 = i3;
                                }
                                zz0Var3 = zz0Var2;
                                ok6Var3 = ok6Var2;
                                iArr2 = iArr;
                                i3 = i2;
                                hhcVar2 = hhcVar;
                                break;
                            default:
                                if (xbkVar == null) {
                                    zbkVar.getClass();
                                    xbkVar = zbk.a(obj2);
                                }
                                zbkVar.getClass();
                                if (zbk.b(0, zz0Var3, xbkVar)) {
                                    hhcVar = hhcVar2;
                                    iArr = iArr2;
                                    i2 = i3;
                                    zz0Var2 = zz0Var3;
                                    ok6Var2 = ok6Var3;
                                    zz0Var3 = zz0Var2;
                                    ok6Var3 = ok6Var2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    hhcVar2 = hhcVar;
                                } else {
                                    while (i4 < i3) {
                                        hhcVar2.k(iArr2[i4], obj2, xbkVar);
                                        i4++;
                                    }
                                    if (xbkVar == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        hhcVar = hhcVar2;
                        iArr = iArr2;
                        i2 = i3;
                    }
                } else if (f == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        hhcVar2.k(iArr2[i4], obj2, xbkVar);
                        i4++;
                    }
                    if (xbkVar == null) {
                        return;
                    } else {
                        zbkVar.getClass();
                    }
                } else {
                    zbkVar.getClass();
                    if (xbkVar == null) {
                        xbkVar = zbk.a(obj2);
                    }
                    if (!zbk.b(0, zz0Var3, xbkVar)) {
                        while (i4 < i3) {
                            hhcVar2.k(iArr2[i4], obj2, xbkVar);
                            i4++;
                        }
                        if (xbkVar == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                hhcVar = hhcVar2;
                iArr = iArr2;
                i = i3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.wsg
    public final void i(Object obj, t9d t9dVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        hhc hhcVar = this;
        t9dVar.getClass();
        h03 h03Var = (h03) t9dVar.a;
        int[] iArr = hhcVar.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int J = hhcVar.J(i6);
            int i8 = iArr[i6];
            int I = I(J);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = J;
                i3 = i11;
            } else {
                i = 1;
                i2 = J;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.t(i8, Double.doubleToRawLongBits(vck.c.e(obj, j)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.r(i8, Float.floatToRawIntBits(vck.c.f(obj, j)));
                    }
                    hhcVar = this;
                    break;
                case 2:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.E(i8, unsafe.getLong(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 3:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.E(i8, unsafe.getLong(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 4:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.v(i8, unsafe.getInt(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 5:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.t(i8, unsafe.getLong(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 6:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.r(i8, unsafe.getInt(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 7:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.o(i8, vck.c.c(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 8:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            h03Var.z(i8, (String) object);
                        } else {
                            h03Var.p(i8, (ec2) object);
                        }
                    }
                    hhcVar = this;
                    break;
                case 9:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.y(i8, (s5) unsafe.getObject(obj, j), hhcVar.m(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.p(i8, (ec2) unsafe.getObject(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 11:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.C(i8, unsafe.getInt(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 12:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.v(i8, unsafe.getInt(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 13:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.r(i8, unsafe.getInt(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 14:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        h03Var.t(i8, unsafe.getLong(obj, j));
                    }
                    hhcVar = this;
                    break;
                case 15:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        int i12 = unsafe.getInt(obj, j);
                        h03Var.C(i8, (i12 >> 31) ^ (i12 << 1));
                    }
                    hhcVar = this;
                    break;
                case 16:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        long j2 = unsafe.getLong(obj, j);
                        h03Var.E(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    hhcVar = this;
                    break;
                case 17:
                    if (hhcVar.n(i6, i5, i7, i3, obj)) {
                        t9dVar.m(i8, unsafe.getObject(obj, j), hhcVar.m(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    atg.n(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 19:
                    atg.r(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 20:
                    atg.t(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 21:
                    atg.z(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 22:
                    atg.s(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 23:
                    atg.q(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 24:
                    atg.p(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 25:
                    atg.m(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = atg.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            h03Var.z(i13, (String) list.get(i14));
                        }
                    }
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    wsg m = hhcVar.m(i6);
                    Class cls2 = atg.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            h03Var.y(i15, (s5) list2.get(i16), m);
                        }
                    }
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = atg.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            h03Var.p(i17, (ec2) list3.get(i18));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    atg.y(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 30:
                    z = false;
                    atg.o(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 31:
                    z = false;
                    atg.u(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 32:
                    z = false;
                    atg.v(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 33:
                    z = false;
                    atg.w(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 34:
                    z = false;
                    atg.x(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, false);
                    break;
                case 35:
                    atg.n(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 36:
                    atg.r(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 37:
                    atg.t(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 38:
                    atg.z(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 39:
                    atg.s(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 40:
                    atg.q(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 41:
                    atg.p(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 42:
                    atg.m(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 43:
                    atg.y(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 44:
                    atg.o(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 45:
                    atg.u(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 46:
                    atg.v(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 47:
                    atg.w(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, i == true ? 1 : 0);
                    break;
                case 48:
                    atg.x(iArr[i6], (List) unsafe.getObject(obj, j), t9dVar, true);
                    break;
                case 49:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    wsg m2 = hhcVar.m(i6);
                    Class cls4 = atg.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            t9dVar.m(i19, list4.get(i20), m2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = hhcVar.b[(i6 / 3) * 2];
                        hhcVar.m.getClass();
                        sx2 sx2Var = ((rtb) obj2).a;
                        for (Map.Entry entry : ((wtb) object2).entrySet()) {
                            h03Var.B(i8, i21);
                            h03Var.D(rtb.a(sx2Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            zz7.b(h03Var, (yal) sx2Var.a, i, key);
                            i21 = 2;
                            zz7.b(h03Var, (yal) sx2Var.b, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.t(i8, Double.doubleToRawLongBits(((Double) vck.h(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.r(i8, Float.floatToRawIntBits(((Float) vck.h(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.E(i8, z(obj, j));
                    }
                    break;
                case 54:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.E(i8, z(obj, j));
                    }
                    break;
                case 55:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.v(i8, y(obj, j));
                    }
                    break;
                case 56:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.t(i8, z(obj, j));
                    }
                    break;
                case 57:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.r(i8, y(obj, j));
                    }
                    break;
                case 58:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.o(i8, ((Boolean) vck.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (hhcVar.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            h03Var.z(i8, (String) object3);
                        } else {
                            h03Var.p(i8, (ec2) object3);
                        }
                    }
                    break;
                case 60:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.y(i8, (s5) unsafe.getObject(obj, j), hhcVar.m(i6));
                    }
                    break;
                case 61:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.p(i8, (ec2) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.C(i8, y(obj, j));
                    }
                    break;
                case 63:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.v(i8, y(obj, j));
                    }
                    break;
                case 64:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.r(i8, y(obj, j));
                    }
                    break;
                case 65:
                    if (hhcVar.q(i8, i6, obj)) {
                        h03Var.t(i8, z(obj, j));
                    }
                    break;
                case 66:
                    if (hhcVar.q(i8, i6, obj)) {
                        int y = y(obj, j);
                        h03Var.C(i8, (y >> 31) ^ (y << 1));
                    }
                    break;
                case 67:
                    if (hhcVar.q(i8, i6, obj)) {
                        long z2 = z(obj, j);
                        h03Var.E(i8, (z2 << (i == true ? 1L : 0L)) ^ (z2 >> 63));
                    }
                    break;
                case 68:
                    if (hhcVar.q(i8, i6, obj)) {
                        t9dVar.m(i8, unsafe.getObject(obj, j), hhcVar.m(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        hhcVar.l.getClass();
        ((hw8) obj).unknownFields.d(t9dVar);
    }

    public final boolean j(hw8 hw8Var, hw8 hw8Var2, int i) {
        return o(i, hw8Var) == o(i, hw8Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (vck.h(obj, J(i) & 1048575) == null) {
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

    public final wsg m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        wsg wsgVar = (wsg) objArr[i2];
        if (wsgVar != null) {
            return wsgVar;
        }
        wsg a = kff.c.a((Class) objArr[i2 + 1]);
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
                    return Double.doubleToRawLongBits(vck.c.e(obj, j2)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(vck.c.f(obj, j2)) != 0) {
                    }
                    break;
                case 2:
                    if (vck.g(obj, j2) != 0) {
                    }
                    break;
                case 3:
                    if (vck.g(obj, j2) != 0) {
                    }
                    break;
                case 4:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 5:
                    if (vck.g(obj, j2) != 0) {
                    }
                    break;
                case 6:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 7:
                    return vck.c.c(obj, j2);
                case 8:
                    Object h = vck.h(obj, j2);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof ec2) {
                        return !ec2.c.equals(h);
                    }
                    ilg.c();
                    return false;
                case 9:
                    if (vck.h(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !ec2.c.equals(vck.h(obj, j2));
                case 11:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 12:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 13:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 14:
                    if (vck.g(obj, j2) != 0) {
                    }
                    break;
                case 15:
                    if (vck.f(obj, j2) != 0) {
                    }
                    break;
                case 16:
                    if (vck.g(obj, j2) != 0) {
                    }
                    break;
                case 17:
                    if (vck.h(obj, j2) != null) {
                    }
                    break;
                default:
                    ilg.c();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & vck.f(obj, j)) != 0) {
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return vck.f(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i, Object obj2, ok6 ok6Var, zz0 zz0Var) {
        long J = J(i) & 1048575;
        Object h = vck.h(obj, J);
        ztb ztbVar = this.m;
        if (h == null) {
            ztbVar.getClass();
            h = wtb.b.i();
            vck.o(J, obj, h);
        } else {
            ztbVar.getClass();
            if (!((wtb) h).a) {
                Object i2 = wtb.b.i();
                ztb.a(i2, h);
                vck.o(J, obj, i2);
                h = i2;
            }
        }
        ztbVar.getClass();
        wtb wtbVar = (wtb) h;
        sx2 sx2Var = ((rtb) obj2).a;
        zz0Var.Z(2);
        qo2 qo2Var = (qo2) zz0Var.e;
        int i3 = qo2Var.i(qo2Var.A());
        Object obj3 = sx2Var.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int f = zz0Var.f();
                if (f == Integer.MAX_VALUE || qo2Var.c()) {
                    break;
                }
                if (f == 1) {
                    obj4 = zz0Var.x((yal) sx2Var.a, null, null);
                } else if (f != 2) {
                    try {
                        if (!zz0Var.b0()) {
                            throw new naa("Unable to parse map entry.");
                        }
                    } catch (laa unused) {
                        if (!zz0Var.b0()) {
                            throw new naa("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = zz0Var.x((yal) sx2Var.b, obj3.getClass(), ok6Var);
                }
            } catch (Throwable th) {
                qo2Var.h(i3);
                throw th;
            }
        }
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
            wsg m = m(i);
            if (!o(i, obj)) {
                if (p(object)) {
                    hw8 d = m.d();
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
                hw8 d2 = m.d();
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
            wsg m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    hw8 d = m.d();
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
                hw8 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        wsg m = m(i);
        long J = J(i) & 1048575;
        if (!o(i, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        hw8 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, int i2, Object obj) {
        wsg m = m(i2);
        if (!q(i, i2, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        hw8 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}
