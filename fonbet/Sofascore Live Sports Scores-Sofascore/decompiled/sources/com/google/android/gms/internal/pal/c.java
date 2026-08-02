package com.google.android.gms.internal.pal;

import androidx.core.app.NotificationCompat;
import defpackage.acn;
import defpackage.c9n;
import defpackage.d4;
import defpackage.d7n;
import defpackage.e3c;
import defpackage.fcn;
import defpackage.h8n;
import defpackage.hbn;
import defpackage.hdn;
import defpackage.i3c;
import defpackage.ilg;
import defpackage.kcn;
import defpackage.mz1;
import defpackage.pvd;
import defpackage.ran;
import defpackage.s8n;
import defpackage.sck;
import defpackage.sdn;
import defpackage.tz9;
import defpackage.v9n;
import defpackage.wje;
import defpackage.x5n;
import defpackage.xdn;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements kcn {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzaef e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final ran k;
    public final hdn l;
    public final a m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(8));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public c(int[] iArr, Object[] objArr, int i, int i2, zzaef zzaefVar, boolean z, int[] iArr2, int i3, int i4, ran ranVar, hdn hdnVar, a aVar, hbn hbnVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        boolean z2 = false;
        if (aVar != null && (zzaefVar instanceof zzacw)) {
            z2 = true;
        }
        this.f = z2;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = ranVar;
        this.l = hdnVar;
        this.m = aVar;
        this.e = zzaefVar;
    }

    public static int A(Object obj, long j) {
        return ((Integer) sdn.g(obj, j)).intValue();
    }

    public static int i(int i) {
        return (i >>> 20) & 255;
    }

    public static long k(Object obj, long j) {
        return ((Long) sdn.g(obj, j)).longValue();
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            i3c.n(mz1.s("Field ", str, " for ", cls.getName(), " not found. Known fields are "), Arrays.toString(declaredFields));
            return null;
        }
    }

    public static final void w(int i, Object obj, e3c e3cVar) {
        if (!(obj instanceof String)) {
            e3cVar.r(i, (zzaby) obj);
        } else {
            ((h8n) e3cVar.b).q(i, (String) obj);
        }
    }

    public static zzafj y(Object obj) {
        zzacz zzaczVar = (zzacz) obj;
        zzafj zzafjVar = zzaczVar.zzc;
        if (zzafjVar != zzafj.f) {
            return zzafjVar;
        }
        zzafj b = zzafj.b();
        zzaczVar.zzc = b;
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c z(fcn fcnVar, ran ranVar, hdn hdnVar, a aVar, hbn hbnVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char charAt5;
        int i5;
        char charAt6;
        int i6;
        char charAt7;
        int i7;
        char charAt8;
        int i8;
        char charAt9;
        int i9;
        char charAt10;
        int i10;
        char charAt11;
        int i11;
        char charAt12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field o2;
        char charAt13;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field o3;
        Object obj2;
        Field o4;
        int i27;
        char charAt14;
        int i28;
        int i29;
        char charAt15;
        int i30;
        int i31;
        char charAt16;
        int i32;
        int i33;
        char charAt17;
        if (!(fcnVar instanceof fcn)) {
            pvd.j();
            return null;
        }
        int i34 = 0;
        boolean z = ((fcnVar.d & 1) == 1 ? (char) 1 : (char) 2) == 2;
        String str = fcnVar.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt18 = str.charAt(i);
        if (charAt18 >= 55296) {
            int i37 = charAt18 & 8191;
            int i38 = 13;
            while (true) {
                i33 = i36 + 1;
                charAt17 = str.charAt(i36);
                if (charAt17 < 55296) {
                    break;
                }
                i37 |= (charAt17 & 8191) << i38;
                i38 += 13;
                i36 = i33;
            }
            charAt18 = i37 | (charAt17 << i38);
            i36 = i33;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i2 = 0;
            charAt4 = 0;
            iArr = n;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt19 = str.charAt(i36);
            if (charAt19 >= 55296) {
                int i40 = charAt19 & 8191;
                int i41 = 13;
                while (true) {
                    i11 = i39 + 1;
                    charAt12 = str.charAt(i39);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i40 |= (charAt12 & 8191) << i41;
                    i41 += 13;
                    i39 = i11;
                }
                charAt19 = i40 | (charAt12 << i41);
                i39 = i11;
            }
            int i42 = i39 + 1;
            int charAt20 = str.charAt(i39);
            if (charAt20 >= 55296) {
                int i43 = charAt20 & 8191;
                int i44 = 13;
                while (true) {
                    i10 = i42 + 1;
                    charAt11 = str.charAt(i42);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i43 |= (charAt11 & 8191) << i44;
                    i44 += 13;
                    i42 = i10;
                }
                charAt20 = i43 | (charAt11 << i44);
                i42 = i10;
            }
            int i45 = i42 + 1;
            charAt = str.charAt(i42);
            if (charAt >= 55296) {
                int i46 = charAt & 8191;
                int i47 = 13;
                while (true) {
                    i9 = i45 + 1;
                    charAt10 = str.charAt(i45);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i46 |= (charAt10 & 8191) << i47;
                    i47 += 13;
                    i45 = i9;
                }
                charAt = i46 | (charAt10 << i47);
                i45 = i9;
            }
            int i48 = i45 + 1;
            charAt2 = str.charAt(i45);
            if (charAt2 >= 55296) {
                int i49 = charAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i8 = i48 + 1;
                    charAt9 = str.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i50;
                    i50 += 13;
                    i48 = i8;
                }
                charAt2 = i49 | (charAt9 << i50);
                i48 = i8;
            }
            int i51 = i48 + 1;
            int charAt21 = str.charAt(i48);
            if (charAt21 >= 55296) {
                int i52 = charAt21 & 8191;
                int i53 = 13;
                while (true) {
                    i7 = i51 + 1;
                    charAt8 = str.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i52 |= (charAt8 & 8191) << i53;
                    i53 += 13;
                    i51 = i7;
                }
                charAt21 = i52 | (charAt8 << i53);
                i51 = i7;
            }
            int i54 = i51 + 1;
            charAt3 = str.charAt(i51);
            if (charAt3 >= 55296) {
                int i55 = charAt3 & 8191;
                int i56 = 13;
                while (true) {
                    i6 = i54 + 1;
                    charAt7 = str.charAt(i54);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i55 |= (charAt7 & 8191) << i56;
                    i56 += 13;
                    i54 = i6;
                }
                charAt3 = i55 | (charAt7 << i56);
                i54 = i6;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i5 = i57 + 1;
                    charAt6 = str.charAt(i57);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i58 |= (charAt6 & 8191) << i59;
                    i59 += 13;
                    i57 = i5;
                }
                charAt22 = i58 | (charAt6 << i59);
                i57 = i5;
            }
            int i60 = i57 + 1;
            charAt4 = str.charAt(i57);
            if (charAt4 >= 55296) {
                int i61 = charAt4 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i4 = i62 + 1;
                    charAt5 = str.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i61 |= (charAt5 & 8191) << i63;
                    i63 += 13;
                    i62 = i4;
                }
                charAt4 = i61 | (charAt5 << i63);
                i60 = i4;
            }
            int[] iArr2 = new int[charAt4 + charAt3 + charAt22];
            i2 = charAt19 + charAt19 + charAt20;
            i3 = charAt21;
            iArr = iArr2;
            i34 = charAt19;
            i36 = i60;
        }
        Object[] objArr = fcnVar.c;
        int i64 = 1;
        Class<?> cls = fcnVar.a.getClass();
        int[] iArr3 = new int[i3 * 3];
        Object[] objArr2 = new Object[i3 + i3];
        int i65 = charAt3 + charAt4;
        int i66 = i34;
        int i67 = i65;
        int i68 = charAt4;
        int i69 = 0;
        int i70 = 0;
        while (i36 < length) {
            int i71 = i36 + 1;
            int charAt23 = str.charAt(i36);
            int i72 = length;
            if (charAt23 >= 55296) {
                int i73 = charAt23 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i31 = i74 + 1;
                    charAt16 = str.charAt(i74);
                    i32 = i73;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i73 = i32 | ((charAt16 & 8191) << i75);
                    i75 += 13;
                    i74 = i31;
                }
                charAt23 = i32 | (charAt16 << i75);
                i12 = i31;
            } else {
                i12 = i71;
            }
            int i76 = i12 + 1;
            int charAt24 = str.charAt(i12);
            int i77 = charAt23;
            if (charAt24 >= 55296) {
                int i78 = charAt24 & 8191;
                int i79 = i76;
                int i80 = 13;
                while (true) {
                    i29 = i79 + 1;
                    charAt15 = str.charAt(i79);
                    i30 = i78;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i78 = i30 | ((charAt15 & 8191) << i80);
                    i80 += 13;
                    i79 = i29;
                }
                charAt24 = i30 | (charAt15 << i80);
                i13 = i29;
            } else {
                i13 = i76;
            }
            int[] iArr4 = iArr3;
            int i81 = charAt24 & 255;
            Object[] objArr3 = objArr2;
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            Unsafe unsafe = o;
            Object[] objArr4 = objArr;
            if (i81 >= 51) {
                int i82 = i13 + 1;
                int charAt25 = str.charAt(i13);
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i27 = i84 + 1;
                        charAt14 = str.charAt(i84);
                        i28 = i83;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i83 = i28 | ((charAt14 & 8191) << i85);
                        i85 += 13;
                        i84 = i27;
                    }
                    charAt25 = i28 | (charAt14 << i85);
                    i25 = i27;
                } else {
                    i25 = i82;
                }
                int i86 = charAt25;
                int i87 = i81 - 51;
                i20 = i25;
                if (i87 == 9 || i87 == 17) {
                    int i88 = i69 / 3;
                    i26 = i2 + 1;
                    objArr3[i88 + i88 + 1] = objArr4[i2];
                } else {
                    if (i87 == 12 && !z) {
                        int i89 = i69 / 3;
                        i26 = i2 + 1;
                        objArr3[i89 + i89 + 1] = objArr4[i2];
                    }
                    int i90 = i86 + i86;
                    obj = objArr4[i90];
                    if (obj instanceof Field) {
                        o3 = o(cls, (String) obj);
                        objArr4[i90] = o3;
                    } else {
                        o3 = (Field) obj;
                    }
                    i14 = charAt;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(o3);
                    int i91 = i90 + 1;
                    obj2 = objArr4[i91];
                    if (obj2 instanceof Field) {
                        o4 = o(cls, (String) obj2);
                        objArr4[i91] = o4;
                    } else {
                        o4 = (Field) obj2;
                    }
                    i19 = (int) unsafe.objectFieldOffset(o4);
                    i15 = charAt4;
                    i22 = objectFieldOffset;
                    i21 = 0;
                }
                i2 = i26;
                int i902 = i86 + i86;
                obj = objArr4[i902];
                if (obj instanceof Field) {
                }
                i14 = charAt;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(o3);
                int i912 = i902 + 1;
                obj2 = objArr4[i912];
                if (obj2 instanceof Field) {
                }
                i19 = (int) unsafe.objectFieldOffset(o4);
                i15 = charAt4;
                i22 = objectFieldOffset2;
                i21 = 0;
            } else {
                i14 = charAt;
                int i92 = i2 + 1;
                Field o5 = o(cls, (String) objArr4[i2]);
                if (i81 == 9 || i81 == 17) {
                    objArr3[x5n.z(i69, 3, i64)] = o5.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i93 = i69 / 3;
                        i24 = i2 + 2;
                        objArr3[i93 + i93 + 1] = objArr4[i92];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if (!z) {
                            int i94 = i69 / 3;
                            i24 = i2 + 2;
                            objArr3[i94 + i94 + 1] = objArr4[i92];
                        }
                    } else if (i81 == 50) {
                        int i95 = i68 + 1;
                        iArr[i68] = i69;
                        int i96 = i69 / 3;
                        int i97 = i96 + i96;
                        int i98 = i2 + 2;
                        objArr3[i97] = objArr4[i92];
                        if ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                            i16 = i2 + 3;
                            objArr3[i97 + 1] = objArr4[i98];
                            i15 = charAt4;
                        } else {
                            i15 = charAt4;
                            i16 = i98;
                        }
                        i68 = i95;
                        int objectFieldOffset3 = (int) unsafe.objectFieldOffset(o5);
                        if ((charAt24 & 4096) == 4096 || i81 > 17) {
                            i17 = i13;
                            i18 = 0;
                            i19 = 1048575;
                        } else {
                            int i99 = i13 + 1;
                            int charAt26 = str.charAt(i13);
                            if (charAt26 >= 55296) {
                                int i100 = charAt26 & 8191;
                                int i101 = 13;
                                while (true) {
                                    i23 = i99 + 1;
                                    charAt13 = str.charAt(i99);
                                    if (charAt13 < 55296) {
                                        break;
                                    }
                                    i100 |= (charAt13 & 8191) << i101;
                                    i101 += 13;
                                    i99 = i23;
                                }
                                charAt26 = i100 | (charAt13 << i101);
                            } else {
                                i23 = i99;
                            }
                            int i102 = (charAt26 / 32) + i66 + i66;
                            Object obj3 = objArr4[i102];
                            if (obj3 instanceof Field) {
                                o2 = (Field) obj3;
                            } else {
                                o2 = o(cls, (String) obj3);
                                objArr4[i102] = o2;
                            }
                            i18 = charAt26 % 32;
                            int i103 = i23;
                            i19 = (int) unsafe.objectFieldOffset(o2);
                            i17 = i103;
                        }
                        if (i81 >= 18 || i81 > 49) {
                            i20 = i17;
                            i2 = i16;
                            i21 = i18;
                        } else {
                            iArr[i67] = objectFieldOffset3;
                            i20 = i17;
                            i67++;
                            i21 = i18;
                            i2 = i16;
                        }
                        i22 = objectFieldOffset3;
                    }
                    i16 = i24;
                    i15 = charAt4;
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(o5);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    i17 = i13;
                    i18 = 0;
                    i19 = 1048575;
                    if (i81 >= 18) {
                    }
                    i20 = i17;
                    i2 = i16;
                    i21 = i18;
                    i22 = objectFieldOffset32;
                }
                i15 = charAt4;
                i16 = i92;
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(o5);
                if ((charAt24 & 4096) == 4096) {
                }
                i17 = i13;
                i18 = 0;
                i19 = 1048575;
                if (i81 >= 18) {
                }
                i20 = i17;
                i2 = i16;
                i21 = i18;
                i22 = objectFieldOffset322;
            }
            int i104 = i69 + 1;
            iArr4[i69] = i77;
            int i105 = i69 + 2;
            iArr4[i104] = ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | i22;
            i69 += 3;
            iArr4[i105] = (i21 << 20) | i19;
            charAt4 = i15;
            iArr3 = iArr4;
            length = i72;
            objArr2 = objArr3;
            objArr = objArr4;
            i36 = i20;
            charAt = i14;
            i64 = 1;
        }
        return new c(iArr3, objArr2, charAt, charAt2, fcnVar.a, z, iArr, charAt4, i65, ranVar, hdnVar, aVar, hbnVar);
    }

    public final void B(int i, long j, Object obj) {
        Object n2 = n(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        if (!((zzadz) object).a) {
            zzadz g = zzadz.b.g();
            hbn.b(g, object);
            unsafe.putObject(obj, j, g);
        }
        throw null;
    }

    public final int C(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d7n d7nVar) {
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(tz9.n0(i, bArr))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(tz9.c0(i, bArr))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int m0 = tz9.m0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, Long.valueOf(d7nVar.a));
                unsafe.putInt(obj, j2, i4);
                return m0;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int j0 = tz9.j0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, Integer.valueOf(d7nVar.b));
                unsafe.putInt(obj, j2, i4);
                return j0;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(tz9.n0(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(tz9.c0(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int m02 = tz9.m0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, Boolean.valueOf(d7nVar.a != 0));
                unsafe.putInt(obj, j2, i4);
                return m02;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int j02 = tz9.j0(bArr, i, d7nVar);
                int i9 = d7nVar.b;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        xdn.a.getClass();
                        if (!wje.o(j02, j02 + i9, bArr)) {
                            throw zzadi.g();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, j02, i9, zzadg.a));
                    j02 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return j02;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int f0 = tz9.f0(m(i8), bArr, i, i2, d7nVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = d7nVar.c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, zzadg.b(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return f0;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int a0 = tz9.a0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, d7nVar.c);
                unsafe.putInt(obj, j2, i4);
                return a0;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int j03 = tz9.j0(bArr, i, d7nVar);
                int i10 = d7nVar.b;
                zzadd l = l(i8);
                if (l != null && !l.a(i10)) {
                    y(obj).c(i3, Long.valueOf(i10));
                    return j03;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i10));
                unsafe.putInt(obj, j2, i4);
                return j03;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int j04 = tz9.j0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzacc.a(d7nVar.b)));
                unsafe.putInt(obj, j2, i4);
                return j04;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int m03 = tz9.m0(bArr, i, d7nVar);
                unsafe.putObject(obj, j, Long.valueOf(zzacc.b(d7nVar.a)));
                unsafe.putInt(obj, j2, i4);
                return m03;
            case 68:
                if (i5 == 3) {
                    int d0 = tz9.d0(m(i8), bArr, i, i2, (i3 & (-8)) | 4, d7nVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = d7nVar.c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, zzadg.b(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return d0;
                }
                break;
        }
        return i;
    }

    public final int D(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d7n d7nVar) {
        int l0;
        Unsafe unsafe = o;
        zzadf zzadfVar = (zzadf) unsafe.getObject(obj, j2);
        if (!zzadfVar.zzc()) {
            int size = zzadfVar.size();
            zzadfVar = zzadfVar.i(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzadfVar);
        }
        zzadf zzadfVar2 = zzadfVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 1) {
                    pvd.j();
                    return 0;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 5) {
                    pvd.j();
                    return 0;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 0) {
                    pvd.j();
                    return 0;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return tz9.l0(i3, bArr, i, i2, zzadfVar2, d7nVar);
                    }
                    return i;
                }
                v9n v9nVar = (v9n) zzadfVar2;
                int j0 = tz9.j0(bArr, i, d7nVar);
                int i8 = d7nVar.b + j0;
                while (j0 < i8) {
                    j0 = tz9.j0(bArr, j0, d7nVar);
                    v9nVar.d(d7nVar.b);
                }
                if (j0 == i8) {
                    return j0;
                }
                throw zzadi.j();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 1) {
                    pvd.j();
                    return 0;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    v9n v9nVar2 = (v9n) zzadfVar2;
                    int j02 = tz9.j0(bArr, i, d7nVar);
                    int i9 = d7nVar.b + j02;
                    while (j02 < i9) {
                        v9nVar2.d(tz9.c0(j02, bArr));
                        j02 += 4;
                    }
                    if (j02 == i9) {
                        return j02;
                    }
                    throw zzadi.j();
                }
                if (i5 == 5) {
                    v9n v9nVar3 = (v9n) zzadfVar2;
                    v9nVar3.d(tz9.c0(i, bArr));
                    int i10 = i + 4;
                    while (i10 < i2) {
                        int j03 = tz9.j0(bArr, i10, d7nVar);
                        if (i3 != d7nVar.b) {
                            return i10;
                        }
                        v9nVar3.d(tz9.c0(j03, bArr));
                        i10 = j03 + 4;
                    }
                    return i10;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 0) {
                    pvd.j();
                    return 0;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int j04 = tz9.j0(bArr, i, d7nVar);
                        int i11 = d7nVar.b;
                        if (i11 < 0) {
                            throw zzadi.h();
                        }
                        if (i11 == 0) {
                            zzadfVar2.add("");
                        } else {
                            zzadfVar2.add(new String(bArr, j04, i11, zzadg.a));
                            j04 += i11;
                        }
                        while (j04 < i2) {
                            int j05 = tz9.j0(bArr, j04, d7nVar);
                            if (i3 != d7nVar.b) {
                                return j04;
                            }
                            j04 = tz9.j0(bArr, j05, d7nVar);
                            int i12 = d7nVar.b;
                            if (i12 < 0) {
                                throw zzadi.h();
                            }
                            if (i12 == 0) {
                                zzadfVar2.add("");
                            } else {
                                zzadfVar2.add(new String(bArr, j04, i12, zzadg.a));
                                j04 += i12;
                            }
                        }
                        return j04;
                    }
                    int j06 = tz9.j0(bArr, i, d7nVar);
                    int i13 = d7nVar.b;
                    if (i13 < 0) {
                        throw zzadi.h();
                    }
                    if (i13 == 0) {
                        zzadfVar2.add("");
                    } else {
                        int i14 = j06 + i13;
                        xdn.a.getClass();
                        if (!wje.o(j06, i14, bArr)) {
                            throw zzadi.g();
                        }
                        zzadfVar2.add(new String(bArr, j06, i13, zzadg.a));
                        j06 = i14;
                    }
                    while (j06 < i2) {
                        int j07 = tz9.j0(bArr, j06, d7nVar);
                        if (i3 != d7nVar.b) {
                            return j06;
                        }
                        j06 = tz9.j0(bArr, j07, d7nVar);
                        int i15 = d7nVar.b;
                        if (i15 < 0) {
                            throw zzadi.h();
                        }
                        if (i15 == 0) {
                            zzadfVar2.add("");
                        } else {
                            int i16 = j06 + i15;
                            xdn.a.getClass();
                            if (!wje.o(j06, i16, bArr)) {
                                throw zzadi.g();
                            }
                            zzadfVar2.add(new String(bArr, j06, i15, zzadg.a));
                            j06 = i16;
                        }
                    }
                    return j06;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return tz9.g0(m(i6), i3, bArr, i, i2, zzadfVar2, d7nVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int j08 = tz9.j0(bArr, i, d7nVar);
                    int i17 = d7nVar.b;
                    if (i17 < 0) {
                        throw zzadi.h();
                    }
                    if (i17 > bArr.length - j08) {
                        throw zzadi.j();
                    }
                    if (i17 == 0) {
                        zzadfVar2.add(zzaby.b);
                    } else {
                        zzadfVar2.add(zzaby.u(j08, i17, bArr));
                        j08 += i17;
                    }
                    while (j08 < i2) {
                        int j09 = tz9.j0(bArr, j08, d7nVar);
                        if (i3 != d7nVar.b) {
                            return j08;
                        }
                        j08 = tz9.j0(bArr, j09, d7nVar);
                        int i18 = d7nVar.b;
                        if (i18 < 0) {
                            throw zzadi.h();
                        }
                        if (i18 > bArr.length - j08) {
                            throw zzadi.j();
                        }
                        if (i18 == 0) {
                            zzadfVar2.add(zzaby.b);
                        } else {
                            zzadfVar2.add(zzaby.u(j08, i18, bArr));
                            j08 += i18;
                        }
                    }
                    return j08;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        l0 = tz9.l0(i3, bArr, i, i2, zzadfVar2, d7nVar);
                    }
                    return i;
                }
                v9n v9nVar4 = (v9n) zzadfVar2;
                l0 = tz9.j0(bArr, i, d7nVar);
                int i19 = d7nVar.b + l0;
                while (l0 < i19) {
                    l0 = tz9.j0(bArr, l0, d7nVar);
                    v9nVar4.d(d7nVar.b);
                }
                if (l0 != i19) {
                    throw zzadi.j();
                }
                zzacz zzaczVar = (zzacz) obj;
                zzafj zzafjVar = zzaczVar.zzc;
                if (zzafjVar == zzafj.f) {
                    zzafjVar = null;
                }
                Object a = e.a(i4, zzadfVar2, l(i6), zzafjVar, this.l);
                if (a == null) {
                    return l0;
                }
                zzaczVar.zzc = (zzafj) a;
                return l0;
            case 33:
            case 47:
                if (i5 == 2) {
                    v9n v9nVar5 = (v9n) zzadfVar2;
                    int j010 = tz9.j0(bArr, i, d7nVar);
                    int i20 = d7nVar.b + j010;
                    while (j010 < i20) {
                        j010 = tz9.j0(bArr, j010, d7nVar);
                        v9nVar5.d(zzacc.a(d7nVar.b));
                    }
                    if (j010 == i20) {
                        return j010;
                    }
                    throw zzadi.j();
                }
                if (i5 == 0) {
                    v9n v9nVar6 = (v9n) zzadfVar2;
                    int j011 = tz9.j0(bArr, i, d7nVar);
                    v9nVar6.d(zzacc.a(d7nVar.b));
                    while (j011 < i2) {
                        int j012 = tz9.j0(bArr, j011, d7nVar);
                        if (i3 != d7nVar.b) {
                            return j011;
                        }
                        j011 = tz9.j0(bArr, j012, d7nVar);
                        v9nVar6.d(zzacc.a(d7nVar.b));
                    }
                    return j011;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    pvd.j();
                    return 0;
                }
                if (i5 == 0) {
                    pvd.j();
                    return 0;
                }
                return i;
            default:
                if (i5 == 3) {
                    kcn m = m(i6);
                    int i21 = (i3 & (-8)) | 4;
                    int d0 = tz9.d0(m, bArr, i, i2, i21, d7nVar);
                    zzadfVar2.add(d7nVar.c);
                    while (d0 < i2) {
                        int j013 = tz9.j0(bArr, d0, d7nVar);
                        if (i3 != d7nVar.b) {
                            return d0;
                        }
                        d0 = tz9.d0(m, bArr, j013, i2, i21, d7nVar);
                        zzadfVar2.add(d7nVar.c);
                    }
                    return d0;
                }
                return i;
        }
    }

    @Override // defpackage.kcn
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long j = j(iArr[i2]) & 1048575;
            Object g = sdn.g(obj, j);
            if (g != null) {
                ((zzadz) g).a = false;
                sdn.j(j, obj, g);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.a(obj, iArr[i]);
            i++;
        }
        this.l.getClass();
        ((zzacz) obj).zzc.e = false;
        if (this.f) {
            this.m.getClass();
            c9n c9nVar = ((zzacw) obj).zzb;
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00de, code lost:
    
        return false;
     */
    @Override // defpackage.kcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.i) {
                if (!this.f) {
                    return true;
                }
                this.m.getClass();
                a.a(obj);
                throw null;
            }
            int i4 = this.h[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int j = j(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = o.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & j) != 0) {
                if (!(i == 1048575 ? u(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int i9 = i(j);
            if (i9 == 9 || i9 == 17) {
                if (i == 1048575) {
                    z = u(i4, obj);
                } else if ((i3 & i8) == 0) {
                    z = false;
                }
                if (z && !m(i4).b(sdn.g(obj, j & 1048575))) {
                    break;
                }
                i2++;
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (v(i5, i4, obj) && !m(i4).b(sdn.g(obj, j & 1048575))) {
                            break;
                        }
                    } else if (i9 != 49) {
                        if (i9 == 50 && !((zzadz) sdn.g(obj, j & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                    i2++;
                }
                List list = (List) sdn.g(obj, j & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    kcn m = m(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!m.b(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
        }
    }

    @Override // defpackage.kcn
    public final void c(Object obj, byte[] bArr, int i, int i2, d7n d7nVar) {
        int i3;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        char c;
        int m0;
        Object obj4;
        int i11;
        int i12;
        int D;
        c cVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        d7n d7nVar2 = d7nVar;
        if (!cVar.g) {
            x(obj5, bArr, i, i13, 0, d7nVar);
            return;
        }
        int i14 = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 1048575;
        int i18 = 0;
        while (true) {
            Unsafe unsafe = o;
            if (i14 >= i13) {
                int i19 = i13;
                int i20 = i17;
                int i21 = i18;
                Object obj6 = obj5;
                if (i20 != 1048575) {
                    unsafe.putInt(obj6, i20, i21);
                }
                if (i14 != i19) {
                    throw zzadi.i();
                }
                return;
            }
            int i22 = i14 + 1;
            int i23 = bArr2[i14];
            if (i23 < 0) {
                i22 = tz9.k0(i23, bArr2, i22, d7nVar2);
                i23 = d7nVar2.b;
            }
            int i24 = i22;
            int i25 = i23 >>> 3;
            int i26 = i23 & 7;
            int i27 = cVar.d;
            int i28 = cVar.c;
            if (i25 > i15) {
                i4 = (i25 < i28 || i25 > i27) ? -1 : cVar.h(i25, i16 / 3);
                i3 = 0;
            } else if (i25 < i28 || i25 > i27) {
                i3 = 0;
                i4 = -1;
            } else {
                i3 = 0;
                i4 = cVar.h(i25, 0);
            }
            int i29 = i4;
            if (i29 == -1) {
                i5 = i23;
                obj2 = obj5;
                i6 = i18;
                i7 = i24;
                i8 = i3;
            } else {
                int[] iArr = cVar.a;
                int i30 = iArr[i29 + 1];
                int i31 = i(i30);
                int i32 = i23;
                long j = i30 & 1048575;
                if (i31 <= 17) {
                    int i33 = iArr[i29 + 2];
                    int i34 = 1 << (i33 >>> 20);
                    int i35 = i33 & 1048575;
                    if (i35 != i17) {
                        i9 = 1048575;
                        if (i17 != 1048575) {
                            unsafe.putInt(obj5, i17, i18);
                            i9 = 1048575;
                        }
                        if (i35 != i9) {
                            i18 = unsafe.getInt(obj5, i35);
                        }
                        i17 = i35;
                    } else {
                        i9 = 1048575;
                    }
                    switch (i31) {
                        case 0:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 1) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                sdn.c.A(obj5, j, Double.longBitsToDouble(tz9.n0(i24, bArr2)));
                                i18 |= i34;
                                obj5 = obj5;
                                i14 = i24 + 8;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 1:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 5) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                sdn.c.E(obj5, j, Float.intBitsToFloat(tz9.c0(i24, bArr2)));
                                i14 = i24 + 4;
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 2:
                        case 3:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                m0 = tz9.m0(bArr2, i24, d7nVar2);
                                unsafe.putLong(obj5, j, d7nVar2.a);
                                i18 |= i34;
                                i16 = i29;
                                i14 = m0;
                                i15 = i10;
                                break;
                            }
                        case 4:
                        case 11:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                int j0 = tz9.j0(bArr2, i24, d7nVar2);
                                unsafe.putInt(obj5, j, d7nVar2.b);
                                i18 |= i34;
                                i14 = j0;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 5:
                        case 14:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 1) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                unsafe.putLong(obj5, j, tz9.n0(i24, bArr2));
                                i14 = i24 + 8;
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 6:
                        case 13:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 5) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                unsafe.putInt(obj5, j, tz9.c0(i24, bArr2));
                                i14 = i24 + 4;
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 7:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                i14 = tz9.m0(bArr2, i24, d7nVar2);
                                sdn.c.u(obj5, j, d7nVar2.a != 0);
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 8:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                if ((i30 & 536870912) == 0) {
                                    i14 = tz9.h0(bArr2, i24, d7nVar2);
                                } else {
                                    i14 = tz9.j0(bArr2, i24, d7nVar2);
                                    int i36 = d7nVar2.b;
                                    if (i36 < 0) {
                                        throw zzadi.h();
                                    }
                                    if (i36 == 0) {
                                        d7nVar2.c = "";
                                    } else {
                                        d7nVar2.c = xdn.d(i14, i36, bArr2);
                                        i14 += i36;
                                    }
                                }
                                unsafe.putObject(obj5, j, d7nVar2.c);
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 9:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                i14 = tz9.f0(cVar.m(i29), bArr2, i24, i13, d7nVar2);
                                Object object = unsafe.getObject(obj5, j);
                                Object obj7 = d7nVar2.c;
                                if (object == null) {
                                    unsafe.putObject(obj5, j, obj7);
                                } else {
                                    unsafe.putObject(obj5, j, zzadg.b(object, obj7));
                                }
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 10:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                i14 = tz9.a0(bArr2, i24, d7nVar2);
                                unsafe.putObject(obj5, j, d7nVar2.c);
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 12:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                i14 = tz9.j0(bArr2, i24, d7nVar2);
                                unsafe.putInt(obj5, j, d7nVar2.b);
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 15:
                            i10 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                i14 = tz9.j0(bArr2, i24, d7nVar2);
                                unsafe.putInt(obj5, j, zzacc.a(d7nVar2.b));
                                i18 |= i34;
                                i16 = i29;
                                i15 = i10;
                                break;
                            }
                        case 16:
                            if (i26 != 0) {
                                i10 = i25;
                                c = 65535;
                                obj3 = obj5;
                                i5 = i32;
                                obj2 = obj3;
                                i6 = i18;
                                i7 = i24;
                                i25 = i10;
                                i8 = i29;
                                break;
                            } else {
                                m0 = tz9.m0(bArr2, i24, d7nVar2);
                                i10 = i25;
                                unsafe.putLong(obj5, j, zzacc.b(d7nVar2.a));
                                i18 |= i34;
                                i16 = i29;
                                i14 = m0;
                                i15 = i10;
                                break;
                            }
                        default:
                            obj3 = obj5;
                            i10 = i25;
                            c = 65535;
                            i5 = i32;
                            obj2 = obj3;
                            i6 = i18;
                            i7 = i24;
                            i25 = i10;
                            i8 = i29;
                            break;
                    }
                } else {
                    Object obj8 = obj5;
                    i10 = i25;
                    if (i31 != 27) {
                        i5 = i32;
                        if (i31 <= 49) {
                            i11 = i17;
                            i6 = i18;
                            i25 = i10;
                            D = cVar.D(obj, bArr, i24, i2, i5, i25, i26, i29, i30, i31, j, d7nVar);
                            obj5 = obj;
                            i8 = i29;
                            if (D != i24) {
                                i13 = i2;
                                d7nVar2 = d7nVar;
                                i15 = i25;
                                i14 = D;
                                i16 = i8;
                                i17 = i11;
                                i18 = i6;
                                bArr2 = bArr;
                            } else {
                                obj2 = obj5;
                                i7 = D;
                            }
                        } else {
                            i11 = i17;
                            obj4 = obj;
                            i6 = i18;
                            i8 = i29;
                            i12 = i24;
                            i25 = i10;
                            if (i31 != 50) {
                                D = cVar.C(obj4, bArr, i12, i2, i5, i25, i26, i30, i31, j, i8, d7nVar);
                                obj2 = obj4;
                                if (D != i12) {
                                    cVar = this;
                                    d7nVar2 = d7nVar;
                                    i15 = i25;
                                    i14 = D;
                                    obj5 = obj2;
                                    i16 = i8;
                                    i17 = i11;
                                    i18 = i6;
                                    bArr2 = bArr;
                                    i13 = i2;
                                } else {
                                    i7 = D;
                                }
                            } else if (i26 == 2) {
                                cVar.B(i8, j, obj4);
                                throw null;
                            }
                        }
                        i17 = i11;
                    } else if (i26 == 2) {
                        zzadf zzadfVar = (zzadf) unsafe.getObject(obj8, j);
                        if (!zzadfVar.zzc()) {
                            int size = zzadfVar.size();
                            zzadfVar = zzadfVar.i(size == 0 ? 10 : size + size);
                            unsafe.putObject(obj8, j, zzadfVar);
                        }
                        i14 = tz9.g0(cVar.m(i29), i32, bArr2, i24, i13, zzadfVar, d7nVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i13 = i2;
                        d7nVar2 = d7nVar;
                        i16 = i29;
                        i15 = i10;
                    } else {
                        obj4 = obj;
                        i5 = i32;
                        i11 = i17;
                        i6 = i18;
                        i12 = i24;
                        i25 = i10;
                        i8 = i29;
                    }
                    obj2 = obj4;
                    i7 = i12;
                    i17 = i11;
                }
            }
            bArr2 = bArr;
            d7nVar2 = d7nVar;
            i14 = tz9.i0(i5, bArr, i7, i2, y(obj2), d7nVar);
            obj5 = obj2;
            i16 = i8;
            i18 = i6;
            cVar = this;
            i13 = i2;
            i15 = i25;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.kcn
    public final void d(zzacz zzaczVar, zzacz zzaczVar2) {
        zzacz zzaczVar3;
        zzaczVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                e.c(this.l, zzaczVar, zzaczVar2);
                if (this.f) {
                    this.m.getClass();
                    a.a(zzaczVar2);
                    throw null;
                }
                return;
            }
            int j = j(i);
            long j2 = 1048575 & j;
            int i2 = iArr[i];
            switch (i(j)) {
                case 0:
                    if (u(i, zzaczVar2)) {
                        sck sckVar = sdn.c;
                        zzaczVar3 = zzaczVar;
                        sckVar.A(zzaczVar3, j2, sckVar.n(zzaczVar2, j2));
                        r(i, zzaczVar3);
                        break;
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 1:
                    if (u(i, zzaczVar2)) {
                        sck sckVar2 = sdn.c;
                        sckVar2.E(zzaczVar, j2, sckVar2.q(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 2:
                    if (u(i, zzaczVar2)) {
                        sdn.i(zzaczVar, j2, sdn.f(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 3:
                    if (u(i, zzaczVar2)) {
                        sdn.i(zzaczVar, j2, sdn.f(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 4:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 5:
                    if (u(i, zzaczVar2)) {
                        sdn.i(zzaczVar, j2, sdn.f(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 6:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 7:
                    if (u(i, zzaczVar2)) {
                        sck sckVar3 = sdn.c;
                        sckVar3.u(zzaczVar, j2, sckVar3.H(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 8:
                    if (u(i, zzaczVar2)) {
                        sdn.j(j2, zzaczVar, sdn.g(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 9:
                    p(zzaczVar, zzaczVar2, i);
                    zzaczVar3 = zzaczVar;
                    break;
                case 10:
                    if (u(i, zzaczVar2)) {
                        sdn.j(j2, zzaczVar, sdn.g(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 11:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 12:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 13:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 14:
                    if (u(i, zzaczVar2)) {
                        sdn.i(zzaczVar, j2, sdn.f(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 15:
                    if (u(i, zzaczVar2)) {
                        sdn.h(sdn.e(zzaczVar2, j2), j2, zzaczVar);
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 16:
                    if (u(i, zzaczVar2)) {
                        sdn.i(zzaczVar, j2, sdn.f(zzaczVar2, j2));
                        r(i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 17:
                    p(zzaczVar, zzaczVar2, i);
                    zzaczVar3 = zzaczVar;
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
                    this.k.b(zzaczVar, zzaczVar2, j2);
                    zzaczVar3 = zzaczVar;
                    break;
                case 50:
                    Class cls = e.a;
                    sdn.j(j2, zzaczVar, hbn.b(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2)));
                    zzaczVar3 = zzaczVar;
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
                    if (v(i2, i, zzaczVar2)) {
                        sdn.j(j2, zzaczVar, sdn.g(zzaczVar2, j2));
                        s(i2, i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 60:
                    q(zzaczVar, zzaczVar2, i);
                    zzaczVar3 = zzaczVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, zzaczVar2)) {
                        sdn.j(j2, zzaczVar, sdn.g(zzaczVar2, j2));
                        s(i2, i, zzaczVar);
                    }
                    zzaczVar3 = zzaczVar;
                    break;
                case 68:
                    q(zzaczVar, zzaczVar2, i);
                    zzaczVar3 = zzaczVar;
                    break;
                default:
                    zzaczVar3 = zzaczVar;
                    break;
            }
            i += 3;
            zzaczVar = zzaczVar3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.kcn
    public final void e(Object obj, e3c e3cVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3 = this.g;
        Throwable th = null;
        a aVar = this.m;
        hdn hdnVar = this.l;
        boolean z4 = this.f;
        int[] iArr = this.a;
        int i5 = 1;
        int i6 = 1048575;
        if (z3) {
            if (z4) {
                aVar.getClass();
                a.a(obj);
                throw null;
            }
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int j = j(i7);
                int i8 = iArr[i7];
                switch (i(j)) {
                    case 0:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, Double.doubleToRawLongBits(sdn.c.n(obj, j & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, Float.floatToRawIntBits(sdn.c.q(obj, j & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).u(i8, sdn.f(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).u(i8, sdn.f(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).o(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, sdn.f(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).i(i8, sdn.c.H(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (u(i7, obj)) {
                            w(i8, sdn.g(obj, j & 1048575), e3cVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (u(i7, obj)) {
                            e3cVar.w(i8, sdn.g(obj, j & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (u(i7, obj)) {
                            e3cVar.r(i8, (zzaby) sdn.g(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).s(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).o(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, sdn.f(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(i7, obj)) {
                            e3cVar.o(i8, sdn.e(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(i7, obj)) {
                            e3cVar.q(i8, sdn.f(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (u(i7, obj)) {
                            e3cVar.s(i8, sdn.g(obj, j & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        e.f(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 19:
                        e.j(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 20:
                        e.l(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 21:
                        e.s(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 22:
                        e.k(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 23:
                        e.i(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 24:
                        e.h(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 25:
                        e.d(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 26:
                        e.q(i8, (List) sdn.g(obj, j & 1048575), e3cVar);
                        break;
                    case 27:
                        List list = (List) sdn.g(obj, j & 1048575);
                        kcn m = m(i7);
                        Class cls = e.a;
                        if (list != null && !list.isEmpty()) {
                            for (int i9 = 0; i9 < list.size(); i9++) {
                                e3cVar.w(i8, list.get(i9), m);
                            }
                            break;
                        }
                        break;
                    case 28:
                        e.e(i8, (List) sdn.g(obj, j & 1048575), e3cVar);
                        break;
                    case 29:
                        e.r(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 30:
                        e.g(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 31:
                        e.m(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 32:
                        e.n(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 33:
                        e.o(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 34:
                        e.p(i8, (List) sdn.g(obj, j & 1048575), e3cVar, false);
                        break;
                    case 35:
                        e.f(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 36:
                        e.j(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 37:
                        e.l(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 38:
                        e.s(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 39:
                        e.k(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 40:
                        e.i(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 41:
                        e.h(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 42:
                        e.d(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 43:
                        e.r(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 44:
                        e.g(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 45:
                        e.m(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 46:
                        e.n(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 47:
                        e.o(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 48:
                        e.p(i8, (List) sdn.g(obj, j & 1048575), e3cVar, true);
                        break;
                    case 49:
                        List list2 = (List) sdn.g(obj, j & 1048575);
                        kcn m2 = m(i7);
                        Class cls2 = e.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i10 = 0; i10 < list2.size(); i10++) {
                                e3cVar.s(i8, list2.get(i10), m2);
                            }
                            break;
                        }
                        break;
                    case 50:
                        if (sdn.g(obj, j & 1048575) != null) {
                            throw null;
                        }
                        break;
                    case 51:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, Double.doubleToRawLongBits(((Double) sdn.g(obj, j & 1048575)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, Float.floatToRawIntBits(((Float) sdn.g(obj, j & 1048575)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).u(i8, k(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).u(i8, k(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).o(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, k(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).i(i8, ((Boolean) sdn.g(obj, j & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (v(i8, i7, obj)) {
                            w(i8, sdn.g(obj, j & 1048575), e3cVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (v(i8, i7, obj)) {
                            e3cVar.w(i8, sdn.g(obj, j & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (v(i8, i7, obj)) {
                            e3cVar.r(i8, (zzaby) sdn.g(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).s(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).o(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).k(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (v(i8, i7, obj)) {
                            ((h8n) e3cVar.b).m(i8, k(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (v(i8, i7, obj)) {
                            e3cVar.o(i8, A(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (v(i8, i7, obj)) {
                            e3cVar.q(i8, k(obj, j & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (v(i8, i7, obj)) {
                            e3cVar.s(i8, sdn.g(obj, j & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            hdnVar.getClass();
            ((zzacz) obj).zzc.d(e3cVar);
            return;
        }
        if (z4) {
            aVar.getClass();
            a.a(obj);
            throw null;
        }
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < length2) {
            int j2 = j(i11);
            int i14 = iArr[i11];
            int i15 = i(j2);
            Throwable th2 = th;
            int i16 = i6;
            Unsafe unsafe = o;
            if (i15 <= 17) {
                int i17 = iArr[i11 + 2];
                int i18 = i17 & i16;
                if (i18 != i13) {
                    i = length2;
                    i4 = i17;
                    i12 = unsafe.getInt(obj, i18);
                    i13 = i18;
                } else {
                    i = length2;
                    i4 = i17;
                }
                i2 = i5 << (i4 >>> 20);
            } else {
                i = length2;
                i2 = 0;
            }
            long j3 = j2 & i16;
            switch (i15) {
                case 0:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).m(i14, Double.doubleToRawLongBits(sdn.c.n(obj, j3)));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 1:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).k(i14, Float.floatToRawIntBits(sdn.c.q(obj, j3)));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 2:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).u(i14, unsafe.getLong(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 3:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).u(i14, unsafe.getLong(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 4:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).o(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 5:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).m(i14, unsafe.getLong(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 6:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).k(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 7:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).i(i14, sdn.c.H(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 8:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        w(i14, unsafe.getObject(obj, j3), e3cVar);
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 9:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        e3cVar.w(i14, unsafe.getObject(obj, j3), m(i11));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 10:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        e3cVar.r(i14, (zzaby) unsafe.getObject(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 11:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).s(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 12:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).o(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 13:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).k(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 14:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        ((h8n) e3cVar.b).m(i14, unsafe.getLong(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 15:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        e3cVar.o(i14, unsafe.getInt(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 16:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        e3cVar.q(i14, unsafe.getLong(obj, j3));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 17:
                    i3 = 1;
                    z = false;
                    if ((i2 & i12) != 0) {
                        e3cVar.s(i14, unsafe.getObject(obj, j3), m(i11));
                    }
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 18:
                    i3 = 1;
                    z = false;
                    e.f(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 19:
                    i3 = 1;
                    z = false;
                    e.j(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 20:
                    i3 = 1;
                    z = false;
                    e.l(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 21:
                    i3 = 1;
                    z = false;
                    e.s(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 22:
                    i3 = 1;
                    z = false;
                    e.k(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 23:
                    i3 = 1;
                    z = false;
                    e.i(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 24:
                    i3 = 1;
                    z = false;
                    e.h(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 25:
                    i3 = 1;
                    z = false;
                    e.d(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 26:
                    i3 = 1;
                    e.q(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 27:
                    i3 = 1;
                    int i19 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    kcn m3 = m(i11);
                    Class cls3 = e.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            e3cVar.w(i19, list3.get(i20), m3);
                        }
                    }
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                    break;
                case 28:
                    i3 = 1;
                    e.e(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 29:
                    i3 = 1;
                    z2 = false;
                    e.r(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 30:
                    i3 = 1;
                    z2 = false;
                    e.g(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 31:
                    i3 = 1;
                    z2 = false;
                    e.m(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 32:
                    i3 = 1;
                    z2 = false;
                    e.n(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 33:
                    i3 = 1;
                    z2 = false;
                    e.o(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 34:
                    i3 = 1;
                    z2 = false;
                    e.p(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, false);
                    z = z2;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 35:
                    i3 = 1;
                    e.f(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 36:
                    i3 = 1;
                    e.j(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 37:
                    i3 = 1;
                    e.l(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 38:
                    i3 = 1;
                    e.s(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 39:
                    i3 = 1;
                    e.k(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 40:
                    i3 = 1;
                    e.i(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 41:
                    i3 = 1;
                    e.h(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 42:
                    i3 = 1;
                    e.d(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 43:
                    i3 = 1;
                    e.r(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 44:
                    i3 = 1;
                    e.g(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 45:
                    i3 = 1;
                    e.m(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 46:
                    i3 = 1;
                    e.n(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 47:
                    i3 = 1;
                    e.o(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 48:
                    i3 = 1;
                    e.p(iArr[i11], (List) unsafe.getObject(obj, j3), e3cVar, true);
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 49:
                    int i21 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    kcn m4 = m(i11);
                    Class cls4 = e.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            e3cVar.s(i21, list4.get(i22), m4);
                        }
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        throw th2;
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 51:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).m(i14, Double.doubleToRawLongBits(((Double) sdn.g(obj, j3)).doubleValue()));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 52:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).k(i14, Float.floatToRawIntBits(((Float) sdn.g(obj, j3)).floatValue()));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 53:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).u(i14, k(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 54:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).u(i14, k(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 55:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).o(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 56:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).m(i14, k(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 57:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).k(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 58:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).i(i14, ((Boolean) sdn.g(obj, j3)).booleanValue());
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 59:
                    if (v(i14, i11, obj)) {
                        w(i14, unsafe.getObject(obj, j3), e3cVar);
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 60:
                    if (v(i14, i11, obj)) {
                        e3cVar.w(i14, unsafe.getObject(obj, j3), m(i11));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 61:
                    if (v(i14, i11, obj)) {
                        e3cVar.r(i14, (zzaby) unsafe.getObject(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 62:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).s(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 63:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).o(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 64:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).k(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 65:
                    if (v(i14, i11, obj)) {
                        ((h8n) e3cVar.b).m(i14, k(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 66:
                    if (v(i14, i11, obj)) {
                        e3cVar.o(i14, A(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 67:
                    if (v(i14, i11, obj)) {
                        e3cVar.q(i14, k(obj, j3));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                case 68:
                    if (v(i14, i11, obj)) {
                        e3cVar.s(i14, unsafe.getObject(obj, j3), m(i11));
                    }
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
                default:
                    i3 = 1;
                    z = false;
                    i11 += 3;
                    i5 = i3;
                    th = th2;
                    i6 = i16;
                    length2 = i;
            }
        }
        hdnVar.getClass();
        ((zzacz) obj).zzc.d(e3cVar);
    }

    @Override // defpackage.kcn
    public final boolean f(zzacz zzaczVar, zzacz zzaczVar2) {
        boolean t;
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                int j = j(i);
                long j2 = j & 1048575;
                switch (i(j)) {
                    case 0:
                        if (!t(zzaczVar, zzaczVar2, i)) {
                            break;
                        } else {
                            sck sckVar = sdn.c;
                            if (Double.doubleToLongBits(sckVar.n(zzaczVar, j2)) != Double.doubleToLongBits(sckVar.n(zzaczVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!t(zzaczVar, zzaczVar2, i)) {
                            break;
                        } else {
                            sck sckVar2 = sdn.c;
                            if (Float.floatToIntBits(sckVar2.q(zzaczVar, j2)) != Float.floatToIntBits(sckVar2.q(zzaczVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.f(zzaczVar, j2) == sdn.f(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.f(zzaczVar, j2) == sdn.f(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.f(zzaczVar, j2) == sdn.f(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!t(zzaczVar, zzaczVar2, i)) {
                            break;
                        } else {
                            sck sckVar3 = sdn.c;
                            if (sckVar3.H(zzaczVar, j2) != sckVar3.H(zzaczVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (t(zzaczVar, zzaczVar2, i) && e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (t(zzaczVar, zzaczVar2, i) && e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (t(zzaczVar, zzaczVar2, i) && e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.f(zzaczVar, j2) == sdn.f(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.e(zzaczVar, j2) == sdn.e(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (t(zzaczVar, zzaczVar2, i) && sdn.f(zzaczVar, j2) == sdn.f(zzaczVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (t(zzaczVar, zzaczVar2, i) && e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2))) {
                            continue;
                            i += 3;
                        }
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
                        t = e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2));
                        break;
                    case 50:
                        t = e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (sdn.e(zzaczVar, j3) == sdn.e(zzaczVar2, j3) && e.t(sdn.g(zzaczVar, j2), sdn.g(zzaczVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (t) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (zzaczVar.zzc.equals(zzaczVar2.zzc)) {
                    if (!this.f) {
                        return true;
                    }
                    this.m.getClass();
                    a.a(zzaczVar);
                    throw null;
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
    @Override // defpackage.kcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(zzacz zzaczVar) {
        int i;
        int a;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int j = j(i4);
            int i5 = iArr[i4];
            long j2 = 1048575 & j;
            int i6 = 1237;
            int i7 = 37;
            switch (i(j)) {
                case 0:
                    i = i3 * 53;
                    a = zzadg.a(Double.doubleToLongBits(sdn.c.n(zzaczVar, j2)));
                    i3 = a + i;
                    break;
                case 1:
                    i = i3 * 53;
                    a = Float.floatToIntBits(sdn.c.q(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 2:
                    i = i3 * 53;
                    a = zzadg.a(sdn.f(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 3:
                    i = i3 * 53;
                    a = zzadg.a(sdn.f(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 4:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 5:
                    i = i3 * 53;
                    a = zzadg.a(sdn.f(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 6:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean H = sdn.c.H(zzaczVar, j2);
                    Charset charset = zzadg.a;
                    break;
                case 8:
                    i = i3 * 53;
                    a = ((String) sdn.g(zzaczVar, j2)).hashCode();
                    i3 = a + i;
                    break;
                case 9:
                    Object g = sdn.g(zzaczVar, j2);
                    if (g != null) {
                        i7 = g.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    a = sdn.g(zzaczVar, j2).hashCode();
                    i3 = a + i;
                    break;
                case 11:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 12:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 13:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 14:
                    i = i3 * 53;
                    a = zzadg.a(sdn.f(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 15:
                    i = i3 * 53;
                    a = sdn.e(zzaczVar, j2);
                    i3 = a + i;
                    break;
                case 16:
                    i = i3 * 53;
                    a = zzadg.a(sdn.f(zzaczVar, j2));
                    i3 = a + i;
                    break;
                case 17:
                    Object g2 = sdn.g(zzaczVar, j2);
                    if (g2 != null) {
                        i7 = g2.hashCode();
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
                    a = sdn.g(zzaczVar, j2).hashCode();
                    i3 = a + i;
                    break;
                case 50:
                    i = i3 * 53;
                    a = sdn.g(zzaczVar, j2).hashCode();
                    i3 = a + i;
                    break;
                case 51:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(Double.doubleToLongBits(((Double) sdn.g(zzaczVar, j2)).doubleValue()));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = Float.floatToIntBits(((Float) sdn.g(zzaczVar, j2)).floatValue());
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(k(zzaczVar, j2));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(k(zzaczVar, j2));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(k(zzaczVar, j2));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(i5, i4, zzaczVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) sdn.g(zzaczVar, j2)).booleanValue();
                        Charset charset2 = zzadg.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = ((String) sdn.g(zzaczVar, j2)).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = sdn.g(zzaczVar, j2).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = sdn.g(zzaczVar, j2).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(k(zzaczVar, j2));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = A(zzaczVar, j2);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = zzadg.a(k(zzaczVar, j2));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(i5, i4, zzaczVar)) {
                        i = i3 * 53;
                        a = sdn.g(zzaczVar, j2).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        int hashCode = zzaczVar.zzc.hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.m.getClass();
        a.a(zzaczVar);
        throw null;
    }

    public final int h(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    public final int j(int i) {
        return this.a[i + 1];
    }

    public final zzadd l(int i) {
        int i2 = i / 3;
        return (zzadd) this.b[i2 + i2 + 1];
    }

    public final kcn m(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        kcn kcnVar = (kcn) objArr[i3];
        if (kcnVar != null) {
            return kcnVar;
        }
        kcn a = acn.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object n(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final void p(zzacz zzaczVar, Object obj, int i) {
        long j = j(i) & 1048575;
        if (u(i, obj)) {
            Object g = sdn.g(zzaczVar, j);
            Object g2 = sdn.g(obj, j);
            if (g != null && g2 != null) {
                sdn.j(j, zzaczVar, zzadg.b(g, g2));
                r(i, zzaczVar);
            } else if (g2 != null) {
                sdn.j(j, zzaczVar, g2);
                r(i, zzaczVar);
            }
        }
    }

    public final void q(zzacz zzaczVar, Object obj, int i) {
        int j = j(i);
        int i2 = this.a[i];
        long j2 = j & 1048575;
        if (v(i2, i, obj)) {
            Object g = v(i2, i, zzaczVar) ? sdn.g(zzaczVar, j2) : null;
            Object g2 = sdn.g(obj, j2);
            if (g != null && g2 != null) {
                sdn.j(j2, zzaczVar, zzadg.b(g, g2));
                s(i2, i, zzaczVar);
            } else if (g2 != null) {
                sdn.j(j2, zzaczVar, g2);
                s(i2, i, zzaczVar);
            }
        }
    }

    public final void r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        sdn.h((1 << (i2 >>> 20)) | sdn.e(obj, j), j, obj);
    }

    public final void s(int i, int i2, Object obj) {
        sdn.h(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final boolean t(zzacz zzaczVar, zzacz zzaczVar2, int i) {
        return u(i, zzaczVar) == u(i, zzaczVar2);
    }

    public final boolean u(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (sdn.e(obj, j) & (1 << (i2 >>> 20))) != 0;
        }
        int j2 = j(i);
        long j3 = j2 & 1048575;
        switch (i(j2)) {
            case 0:
                if (Double.doubleToRawLongBits(sdn.c.n(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(sdn.c.q(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (sdn.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (sdn.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (sdn.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = sdn.g(obj, j3);
                if (!(g instanceof String)) {
                    if (!(g instanceof zzaby)) {
                        ilg.c();
                        break;
                    } else if (!zzaby.b.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (sdn.g(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zzaby.b.equals(sdn.g(obj, j3))) {
                }
                break;
            case 11:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (sdn.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (sdn.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (sdn.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (sdn.g(obj, j3) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final boolean v(int i, int i2, Object obj) {
        return sdn.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0480, code lost:
    
        if (r8 == 1048575) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0482, code lost:
    
        r19.putInt(r10, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0488, code lost:
    
        r1 = r9.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x048c, code lost:
    
        if (r1 >= r9.j) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x048e, code lost:
    
        r2 = r9.h[r1];
        r5 = r20[r2];
        r5 = defpackage.sdn.g(r10, r9.j(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x049e, code lost:
    
        if (r5 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04a5, code lost:
    
        if (r9.l(r2) != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04aa, code lost:
    
        r5 = (com.google.android.gms.internal.pal.zzadz) r5;
        r0 = (com.google.android.gms.internal.pal.zzady) r9.n(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04a7, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b3, code lost:
    
        if (r7 != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04b5, code lost:
    
        if (r4 != r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04bc, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04c1, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04bd, code lost:
    
        if (r4 > r3) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04bf, code lost:
    
        if (r6 != r7) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x04c6, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(Object obj, byte[] bArr, int i, int i2, int i3, d7n d7nVar) {
        int i4;
        c cVar;
        int[] iArr;
        Unsafe unsafe;
        Object obj2;
        int i5;
        int i6;
        zzacm zzacmVar;
        int i7;
        int i8;
        int i9;
        int i0;
        Object obj3;
        int i10;
        int i11;
        int C;
        zzacm zzacmVar2;
        int[] iArr2;
        int i12;
        int i13;
        int i14;
        char c;
        Unsafe unsafe2;
        int i15;
        byte[] bArr2;
        d7n d7nVar2;
        Unsafe unsafe3;
        int j0;
        Unsafe unsafe4;
        int i16;
        int i17;
        int f0;
        c cVar2 = this;
        Object obj4 = obj;
        byte[] bArr3 = bArr;
        int i18 = i2;
        d7n d7nVar3 = d7nVar;
        zzacm zzacmVar3 = (zzacm) d7nVar3.d;
        int i19 = i;
        int i20 = 0;
        int i21 = -1;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int i25 = 1048575;
            while (true) {
                int[] iArr3 = cVar2.a;
                Unsafe unsafe5 = o;
                if (i19 < i18) {
                    int i26 = i19 + 1;
                    int i27 = bArr3[i19];
                    if (i27 < 0) {
                        i26 = tz9.k0(i27, bArr3, i26, d7nVar3);
                        i27 = d7nVar3.b;
                    }
                    int i28 = i26;
                    int i29 = i27;
                    int i30 = i29 >>> 3;
                    int i31 = i29 & 7;
                    int i32 = cVar2.d;
                    int i33 = cVar2.c;
                    if (i30 > i21) {
                        i5 = (i30 < i33 || i30 > i32) ? -1 : cVar2.h(i30, i24 / 3);
                        i24 = 0;
                    } else if (i30 < i33 || i30 > i32) {
                        i24 = 0;
                        i5 = -1;
                    } else {
                        i24 = 0;
                        i5 = cVar2.h(i30, 0);
                    }
                    if (i5 == -1) {
                        i4 = i3;
                        i6 = i29;
                        zzacmVar = zzacmVar3;
                        iArr = iArr3;
                        i7 = i30;
                        unsafe = unsafe5;
                        cVar = cVar2;
                        obj2 = obj4;
                        i8 = i28;
                    } else {
                        int i34 = iArr3[i5 + 1];
                        int i35 = i(i34);
                        long j = i34 & i25;
                        if (i35 <= 17) {
                            int i36 = iArr3[i5 + 2];
                            int i37 = 1 << (i36 >>> 20);
                            int i38 = i36 & i25;
                            if (i38 != i22) {
                                zzacmVar2 = zzacmVar3;
                                int i39 = i25;
                                iArr2 = iArr3;
                                if (i22 != i39) {
                                    unsafe5.putInt(obj4, i22, i23);
                                }
                                i12 = i38;
                                i23 = unsafe5.getInt(obj4, i38);
                            } else {
                                zzacmVar2 = zzacmVar3;
                                iArr2 = iArr3;
                                i12 = i22;
                            }
                            switch (i35) {
                                case 0:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    c = 65535;
                                    d7nVar2 = d7nVar;
                                    unsafe2 = unsafe5;
                                    i15 = i28;
                                    if (i31 != 1) {
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        sdn.c.A(obj4, j, Double.longBitsToDouble(tz9.n0(i15, bArr2)));
                                        i19 = i15 + 8;
                                        i23 |= i37;
                                        i18 = i2;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 1:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    c = 65535;
                                    d7nVar2 = d7nVar;
                                    unsafe2 = unsafe5;
                                    i15 = i28;
                                    if (i31 != 5) {
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        sdn.c.E(obj4, j, Float.intBitsToFloat(tz9.c0(i15, bArr2)));
                                        i19 = i15 + 4;
                                        i23 |= i37;
                                        i18 = i2;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 2:
                                case 3:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe3 = unsafe5;
                                    c = 65535;
                                    i15 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe3;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        int m0 = tz9.m0(bArr2, i15, d7nVar2);
                                        unsafe3.putLong(obj4, j, d7nVar2.a);
                                        i23 |= i37;
                                        i18 = i2;
                                        i19 = m0;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 4:
                                case 11:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe3 = unsafe5;
                                    c = 65535;
                                    i15 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe3;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        j0 = tz9.j0(bArr2, i15, d7nVar2);
                                        unsafe3.putInt(obj4, j, d7nVar2.b);
                                        i23 |= i37;
                                        i18 = i2;
                                        i19 = j0;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 5:
                                case 14:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe3 = unsafe5;
                                    c = 65535;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 1) {
                                        i15 = i28;
                                        unsafe2 = unsafe3;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        i15 = i28;
                                        unsafe3.putLong(obj4, j, tz9.n0(i28, bArr2));
                                        i19 = i15 + 8;
                                        i23 |= i37;
                                        i18 = i2;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 6:
                                case 13:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 5) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        unsafe4.putInt(obj4, j, tz9.c0(i16, bArr2));
                                        i19 = i16 + 4;
                                        i23 |= i37;
                                        i18 = i2;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 7:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        j0 = tz9.m0(bArr2, i16, d7nVar2);
                                        sdn.c.u(obj4, j, d7nVar2.a != 0);
                                        i23 |= i37;
                                        i18 = i2;
                                        i19 = j0;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 8:
                                    bArr2 = bArr;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 2) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        if ((536870912 & i34) == 0) {
                                            j0 = tz9.h0(bArr2, i16, d7nVar2);
                                        } else {
                                            j0 = tz9.j0(bArr2, i16, d7nVar2);
                                            int i40 = d7nVar2.b;
                                            if (i40 < 0) {
                                                throw zzadi.h();
                                            }
                                            if (i40 == 0) {
                                                d7nVar2.c = "";
                                            } else {
                                                d7nVar2.c = xdn.d(j0, i40, bArr2);
                                                j0 += i40;
                                            }
                                        }
                                        unsafe4.putObject(obj4, j, d7nVar2.c);
                                        i23 |= i37;
                                        i18 = i2;
                                        i19 = j0;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 9:
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 2) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        f0 = tz9.f0(cVar2.m(i13), bArr2, i16, i17, d7nVar2);
                                        if ((i23 & i37) == 0) {
                                            unsafe4.putObject(obj4, j, d7nVar2.c);
                                        } else {
                                            unsafe4.putObject(obj4, j, zzadg.b(unsafe4.getObject(obj4, j), d7nVar2.c));
                                        }
                                        i23 |= i37;
                                        i19 = f0;
                                        i18 = i17;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 10:
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 2) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        f0 = tz9.a0(bArr2, i16, d7nVar2);
                                        unsafe4.putObject(obj4, j, d7nVar2.c);
                                        i23 |= i37;
                                        i19 = f0;
                                        i18 = i17;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 12:
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        f0 = tz9.j0(bArr2, i16, d7nVar2);
                                        int i41 = d7nVar2.b;
                                        zzadd l = cVar2.l(i13);
                                        if (l == null || l.a(i41)) {
                                            unsafe4.putInt(obj4, j, i41);
                                            i23 |= i37;
                                            i19 = f0;
                                            i18 = i17;
                                            bArr3 = bArr2;
                                            i22 = i12;
                                            i20 = i14;
                                            d7nVar3 = d7nVar2;
                                            i21 = i30;
                                            zzacmVar3 = zzacmVar2;
                                            i25 = 1048575;
                                            i24 = i13;
                                        } else {
                                            y(obj4).c(i14, Long.valueOf(i41));
                                            i19 = f0;
                                            i18 = i17;
                                            bArr3 = bArr2;
                                            i22 = i12;
                                            i20 = i14;
                                            d7nVar3 = d7nVar2;
                                            i21 = i30;
                                            zzacmVar3 = zzacmVar2;
                                            i25 = 1048575;
                                            i24 = i13;
                                        }
                                    }
                                    break;
                                case 15:
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i13 = i5;
                                    i14 = i29;
                                    unsafe4 = unsafe5;
                                    c = 65535;
                                    i16 = i28;
                                    d7nVar2 = d7nVar;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe4;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        f0 = tz9.j0(bArr2, i16, d7nVar2);
                                        unsafe4.putInt(obj4, j, zzacc.a(d7nVar2.b));
                                        i23 |= i37;
                                        i19 = f0;
                                        i18 = i17;
                                        bArr3 = bArr2;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar2;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                case 16:
                                    i13 = i5;
                                    i14 = i29;
                                    c = 65535;
                                    i16 = i28;
                                    if (i31 != 0) {
                                        unsafe2 = unsafe5;
                                        i15 = i16;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        int m02 = tz9.m0(bArr, i16, d7nVar);
                                        unsafe5.putLong(obj4, j, zzacc.b(d7nVar.a));
                                        i23 |= i37;
                                        i18 = i2;
                                        bArr3 = bArr;
                                        i22 = i12;
                                        i20 = i14;
                                        d7nVar3 = d7nVar;
                                        i19 = m02;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                        i25 = 1048575;
                                        i24 = i13;
                                    }
                                default:
                                    if (i31 != 3) {
                                        i13 = i5;
                                        i14 = i29;
                                        c = 65535;
                                        unsafe2 = unsafe5;
                                        i15 = i28;
                                        i4 = i3;
                                        i22 = i12;
                                        i6 = i14;
                                        i24 = i13;
                                        iArr = iArr2;
                                        i7 = i30;
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = i15;
                                        unsafe = unsafe2;
                                        zzacmVar = zzacmVar2;
                                        break;
                                    } else {
                                        int i42 = i5;
                                        int d0 = tz9.d0(cVar2.m(i42), bArr, i28, i2, (i30 << 3) | 4, d7nVar);
                                        if ((i23 & i37) == 0) {
                                            unsafe5.putObject(obj4, j, d7nVar.c);
                                        } else {
                                            unsafe5.putObject(obj4, j, zzadg.b(unsafe5.getObject(obj4, j), d7nVar.c));
                                        }
                                        i23 |= i37;
                                        i19 = d0;
                                        d7nVar3 = d7nVar;
                                        i18 = i2;
                                        bArr3 = bArr;
                                        i22 = i12;
                                        i20 = i29;
                                        i24 = i42;
                                        i21 = i30;
                                        zzacmVar3 = zzacmVar2;
                                    }
                            }
                        } else {
                            zzacm zzacmVar4 = zzacmVar3;
                            int i43 = i22;
                            int i44 = i5;
                            if (i35 != 27) {
                                i6 = i29;
                                if (i35 <= 49) {
                                    iArr = iArr3;
                                    i7 = i30;
                                    i10 = i43;
                                    i11 = i23;
                                    unsafe = unsafe5;
                                    zzacmVar = zzacmVar4;
                                    C = cVar2.D(obj, bArr, i28, i2, i6, i7, i31, i44, i34, i35, j, d7nVar);
                                    obj4 = obj;
                                    if (C != i28) {
                                        bArr3 = bArr;
                                        i18 = i2;
                                        i19 = C;
                                        i24 = i44;
                                        zzacmVar3 = zzacmVar;
                                        i22 = i10;
                                        i23 = i11;
                                        i25 = 1048575;
                                        i21 = i7;
                                        i20 = i6;
                                        d7nVar3 = d7nVar;
                                    } else {
                                        cVar = cVar2;
                                        obj2 = obj4;
                                        i8 = C;
                                        i24 = i44;
                                        i22 = i10;
                                        i23 = i11;
                                        i4 = i3;
                                    }
                                } else {
                                    obj3 = obj;
                                    iArr = iArr3;
                                    i7 = i30;
                                    i10 = i43;
                                    i11 = i23;
                                    unsafe = unsafe5;
                                    zzacmVar = zzacmVar4;
                                    if (i35 != 50) {
                                        C = cVar2.C(obj3, bArr, i28, i2, i6, i7, i31, i34, i35, j, i44, d7nVar);
                                        cVar = cVar2;
                                        obj2 = obj3;
                                        i44 = i44;
                                        if (C != i28) {
                                            bArr3 = bArr;
                                            i18 = i2;
                                            i19 = C;
                                            i24 = i44;
                                            cVar2 = cVar;
                                            obj4 = obj2;
                                            zzacmVar3 = zzacmVar;
                                            i22 = i10;
                                            i23 = i11;
                                            i25 = 1048575;
                                            i21 = i7;
                                            i20 = i6;
                                            d7nVar3 = d7nVar;
                                        }
                                        i8 = C;
                                        i24 = i44;
                                        i22 = i10;
                                        i23 = i11;
                                        i4 = i3;
                                    } else if (i31 == 2) {
                                        cVar2.B(i44, j, obj3);
                                        throw null;
                                    }
                                }
                            } else if (i31 == 2) {
                                zzadf zzadfVar = (zzadf) unsafe5.getObject(obj4, j);
                                if (!zzadfVar.zzc()) {
                                    int size = zzadfVar.size();
                                    zzadfVar = zzadfVar.i(size == 0 ? 10 : size + size);
                                    unsafe5.putObject(obj4, j, zzadfVar);
                                }
                                i19 = tz9.g0(cVar2.m(i44), i29, bArr, i28, i2, zzadfVar, d7nVar);
                                obj4 = obj;
                                bArr3 = bArr;
                                i18 = i2;
                                i20 = i29;
                                i24 = i44;
                                i22 = i43;
                                i21 = i30;
                                zzacmVar3 = zzacmVar4;
                                i25 = 1048575;
                                d7nVar3 = d7nVar;
                            } else {
                                obj3 = obj;
                                i6 = i29;
                                iArr = iArr3;
                                i7 = i30;
                                i10 = i43;
                                i11 = i23;
                                unsafe = unsafe5;
                                zzacmVar = zzacmVar4;
                            }
                            i4 = i3;
                            cVar = cVar2;
                            obj2 = obj3;
                            i24 = i44;
                            i8 = i28;
                            i22 = i10;
                            i23 = i11;
                        }
                    }
                    if (i6 != i4 || i4 == 0) {
                        if (!cVar.f || zzacmVar == zzacm.a()) {
                            i18 = i2;
                            i9 = i6;
                            i0 = tz9.i0(i9, bArr, i8, i18, y(obj2), d7nVar);
                        } else {
                            if (((zzacx) zzacmVar.a.get(new s8n(cVar.e, i7))) != null) {
                                throw null;
                            }
                            i18 = i2;
                            i9 = i6;
                            i0 = tz9.i0(i9, bArr, i8, i18, y(obj2), d7nVar);
                        }
                        i6 = i9;
                        i19 = i0;
                        bArr3 = bArr;
                        i21 = i7;
                        cVar2 = cVar;
                        obj4 = obj2;
                        zzacmVar3 = zzacmVar;
                        i25 = 1048575;
                        i20 = i6;
                        d7nVar3 = d7nVar;
                    } else {
                        i18 = i2;
                        i19 = i8;
                        i20 = i6;
                    }
                } else {
                    i4 = i3;
                    cVar = cVar2;
                    iArr = iArr3;
                    unsafe = unsafe5;
                    obj2 = obj4;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.kcn
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        char c;
        int a;
        int b;
        int i4;
        int a2;
        int e;
        int D;
        int i5;
        int a3;
        int b2;
        int a4;
        int e2;
        int D2;
        char c2;
        int a5;
        int b3;
        int a6;
        int d;
        int D3;
        int i6;
        int a7;
        int b4;
        int a8;
        int d2;
        int D4;
        hdn hdnVar = this.l;
        int i7 = 1048575;
        Unsafe unsafe = o;
        char c3 = '?';
        int i8 = 1;
        boolean z = this.g;
        int[] iArr = this.a;
        if (z) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < iArr.length) {
                int j = j(i9);
                int i11 = i(j);
                int i12 = iArr[i9];
                int i13 = i7;
                long j2 = j & i7;
                if (i11 >= zzacs.b.a && i11 <= zzacs.c.a) {
                    int i14 = iArr[i9 + 2];
                }
                switch (i11) {
                    case 0:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        c2 = c3;
                        if (u(i9, obj)) {
                            long f = sdn.f(obj, j2);
                            a5 = zzach.a(i12 << 3);
                            b3 = zzach.b(f);
                            D3 = b3 + a5;
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        c2 = c3;
                        if (u(i9, obj)) {
                            long f2 = sdn.f(obj, j2);
                            a5 = zzach.a(i12 << 3);
                            b3 = zzach.b(f2);
                            D3 = b3 + a5;
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        c2 = c3;
                        if (u(i9, obj)) {
                            int e3 = sdn.e(obj, j2);
                            a6 = zzach.a(i12 << 3);
                            d = zzach.d(e3);
                            D3 = d + a6;
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        c2 = c3;
                        if (u(i9, obj)) {
                            Object g = sdn.g(obj, j2);
                            if (g instanceof zzaby) {
                                int a9 = zzach.a(i12 << 3);
                                int m = ((zzaby) g).m();
                                i10 = x5n.d(m, m, a9, i10);
                                break;
                            } else {
                                a6 = zzach.a(i12 << 3);
                                d = zzach.e((String) g);
                                D3 = d + a6;
                                i10 += D3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        c2 = c3;
                        if (u(i9, obj)) {
                            D3 = e.D(i12, sdn.g(obj, j2), m(i9));
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        c2 = c3;
                        if (u(i9, obj)) {
                            zzaby zzabyVar = (zzaby) sdn.g(obj, j2);
                            int a10 = zzach.a(i12 << 3);
                            int m2 = zzabyVar.m();
                            i10 = x5n.d(m2, m2, a10, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(sdn.e(obj, j2), zzach.a(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        c2 = c3;
                        if (u(i9, obj)) {
                            int e4 = sdn.e(obj, j2);
                            a6 = zzach.a(i12 << 3);
                            d = zzach.d(e4);
                            D3 = d + a6;
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        c2 = c3;
                        if (u(i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        c2 = c3;
                        if (u(i9, obj)) {
                            int e5 = sdn.e(obj, j2);
                            i10 = x5n.t((e5 >> 31) ^ (e5 + e5), zzach.a(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        c2 = c3;
                        if (u(i9, obj)) {
                            long f3 = sdn.f(obj, j2);
                            a5 = zzach.a(i12 << 3);
                            b3 = zzach.b((f3 >> c2) ^ (f3 + f3));
                            D3 = b3 + a5;
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        c2 = c3;
                        if (u(i9, obj)) {
                            D3 = zzach.c(i12, (zzaef) sdn.g(obj, j2), m(i9));
                            i10 += D3;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c2 = c3;
                        D3 = e.z(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 19:
                        c2 = c3;
                        D3 = e.x(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 20:
                        c2 = c3;
                        List list = (List) sdn.g(obj, j2);
                        Class cls = e.a;
                        if (list.size() != 0) {
                            D3 = x5n.v(i12, list.size(), e.C(list));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 21:
                        c2 = c3;
                        List list2 = (List) sdn.g(obj, j2);
                        Class cls2 = e.a;
                        int size = list2.size();
                        if (size != 0) {
                            D3 = x5n.v(i12, size, e.J(list2));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 22:
                        c2 = c3;
                        List list3 = (List) sdn.g(obj, j2);
                        Class cls3 = e.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            D3 = x5n.v(i12, size2, e.B(list3));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 23:
                        c2 = c3;
                        D3 = e.z(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 24:
                        c2 = c3;
                        D3 = e.x(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 25:
                        c2 = c3;
                        List list4 = (List) sdn.g(obj, j2);
                        Class cls4 = e.a;
                        int size3 = list4.size();
                        i10 += size3 == 0 ? 0 : (zzach.a(i12 << 3) + 1) * size3;
                        break;
                    case 26:
                        c2 = c3;
                        D3 = e.H(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 27:
                        c2 = c3;
                        D3 = e.E(i12, (List) sdn.g(obj, j2), m(i9));
                        i10 += D3;
                        break;
                    case 28:
                        c2 = c3;
                        D3 = e.v(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 29:
                        c2 = c3;
                        List list5 = (List) sdn.g(obj, j2);
                        Class cls5 = e.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            D3 = x5n.v(i12, size4, e.I(list5));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 30:
                        c2 = c3;
                        List list6 = (List) sdn.g(obj, j2);
                        Class cls6 = e.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            D3 = x5n.v(i12, size5, e.w(list6));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 31:
                        c2 = c3;
                        D3 = e.x(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 32:
                        c2 = c3;
                        D3 = e.z(i12, (List) sdn.g(obj, j2));
                        i10 += D3;
                        break;
                    case 33:
                        c2 = c3;
                        List list7 = (List) sdn.g(obj, j2);
                        Class cls7 = e.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            D3 = x5n.v(i12, size6, e.F(list7));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 34:
                        c2 = c3;
                        List list8 = (List) sdn.g(obj, j2);
                        Class cls8 = e.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            D3 = x5n.v(i12, size7, e.G(list8));
                            i10 += D3;
                            break;
                        }
                        D3 = 0;
                        i10 += D3;
                    case 35:
                        c2 = c3;
                        int A = e.A((List) unsafe.getObject(obj, j2));
                        if (A > 0) {
                            i10 = x5n.d(A, zzach.f(i12), A, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        c2 = c3;
                        int y = e.y((List) unsafe.getObject(obj, j2));
                        if (y > 0) {
                            i10 = x5n.d(y, zzach.f(i12), y, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        c2 = c3;
                        int C = e.C((List) unsafe.getObject(obj, j2));
                        if (C > 0) {
                            i10 = x5n.d(C, zzach.f(i12), C, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        c2 = c3;
                        int J = e.J((List) unsafe.getObject(obj, j2));
                        if (J > 0) {
                            i10 = x5n.d(J, zzach.f(i12), J, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        c2 = c3;
                        int B = e.B((List) unsafe.getObject(obj, j2));
                        if (B > 0) {
                            i10 = x5n.d(B, zzach.f(i12), B, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        c2 = c3;
                        int A2 = e.A((List) unsafe.getObject(obj, j2));
                        if (A2 > 0) {
                            i10 = x5n.d(A2, zzach.f(i12), A2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        c2 = c3;
                        int y2 = e.y((List) unsafe.getObject(obj, j2));
                        if (y2 > 0) {
                            i10 = x5n.d(y2, zzach.f(i12), y2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        c2 = c3;
                        List list9 = (List) unsafe.getObject(obj, j2);
                        Class cls9 = e.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i10 = x5n.d(size8, zzach.f(i12), size8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        c2 = c3;
                        int I = e.I((List) unsafe.getObject(obj, j2));
                        if (I > 0) {
                            i10 = x5n.d(I, zzach.f(i12), I, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        c2 = c3;
                        int w = e.w((List) unsafe.getObject(obj, j2));
                        if (w > 0) {
                            i10 = x5n.d(w, zzach.f(i12), w, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        c2 = c3;
                        int y3 = e.y((List) unsafe.getObject(obj, j2));
                        if (y3 > 0) {
                            i10 = x5n.d(y3, zzach.f(i12), y3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        c2 = c3;
                        int A3 = e.A((List) unsafe.getObject(obj, j2));
                        if (A3 > 0) {
                            i10 = x5n.d(A3, zzach.f(i12), A3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        c2 = c3;
                        int F = e.F((List) unsafe.getObject(obj, j2));
                        if (F > 0) {
                            i10 = x5n.d(F, zzach.f(i12), F, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        c2 = c3;
                        int G = e.G((List) unsafe.getObject(obj, j2));
                        if (G > 0) {
                            i10 = x5n.d(G, zzach.f(i12), G, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list10 = (List) sdn.g(obj, j2);
                        kcn m3 = m(i9);
                        Class cls10 = e.a;
                        int size9 = list10.size();
                        if (size9 != 0) {
                            int i15 = 0;
                            i6 = 0;
                            while (i15 < size9) {
                                i6 = zzach.c(i12, (zzaef) list10.get(i15), m3) + i6;
                                i15++;
                                c3 = c3;
                            }
                        } else {
                            i6 = 0;
                        }
                        c2 = c3;
                        i10 = i6 + i10;
                        break;
                    case 50:
                        hbn.a(sdn.g(obj, j2), n(i9));
                        c2 = c3;
                        break;
                    case 51:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                        }
                        c2 = c3;
                        break;
                    case 52:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                        }
                        c2 = c3;
                        break;
                    case 53:
                        if (v(i12, i9, obj)) {
                            long k = k(obj, j2);
                            a7 = zzach.a(i12 << 3);
                            b4 = zzach.b(k);
                            D4 = b4 + a7;
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 54:
                        if (v(i12, i9, obj)) {
                            long k2 = k(obj, j2);
                            a7 = zzach.a(i12 << 3);
                            b4 = zzach.b(k2);
                            D4 = b4 + a7;
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 55:
                        if (v(i12, i9, obj)) {
                            int A4 = A(obj, j2);
                            a8 = zzach.a(i12 << 3);
                            d2 = zzach.d(A4);
                            D4 = d2 + a8;
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 56:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                        }
                        c2 = c3;
                        break;
                    case 57:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                        }
                        c2 = c3;
                        break;
                    case 58:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 1, i10);
                        }
                        c2 = c3;
                        break;
                    case 59:
                        if (v(i12, i9, obj)) {
                            Object g2 = sdn.g(obj, j2);
                            if (g2 instanceof zzaby) {
                                int a11 = zzach.a(i12 << 3);
                                int m4 = ((zzaby) g2).m();
                                i10 = x5n.d(m4, m4, a11, i10);
                            } else {
                                a8 = zzach.a(i12 << 3);
                                d2 = zzach.e((String) g2);
                                D4 = d2 + a8;
                                i10 += D4;
                            }
                        }
                        c2 = c3;
                        break;
                    case 60:
                        if (v(i12, i9, obj)) {
                            D4 = e.D(i12, sdn.g(obj, j2), m(i9));
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 61:
                        if (v(i12, i9, obj)) {
                            zzaby zzabyVar2 = (zzaby) sdn.g(obj, j2);
                            int a12 = zzach.a(i12 << 3);
                            int m5 = zzabyVar2.m();
                            i10 = x5n.d(m5, m5, a12, i10);
                        }
                        c2 = c3;
                        break;
                    case 62:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(A(obj, j2), zzach.a(i12 << 3), i10);
                        }
                        c2 = c3;
                        break;
                    case 63:
                        if (v(i12, i9, obj)) {
                            int A5 = A(obj, j2);
                            a8 = zzach.a(i12 << 3);
                            d2 = zzach.d(A5);
                            D4 = d2 + a8;
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 64:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 4, i10);
                        }
                        c2 = c3;
                        break;
                    case 65:
                        if (v(i12, i9, obj)) {
                            i10 = x5n.t(i12 << 3, 8, i10);
                        }
                        c2 = c3;
                        break;
                    case 66:
                        if (v(i12, i9, obj)) {
                            int A6 = A(obj, j2);
                            i10 = x5n.t((A6 >> 31) ^ (A6 + A6), zzach.a(i12 << 3), i10);
                        }
                        c2 = c3;
                        break;
                    case 67:
                        if (v(i12, i9, obj)) {
                            long k3 = k(obj, j2);
                            a7 = zzach.a(i12 << 3);
                            b4 = zzach.b((k3 >> c3) ^ (k3 + k3));
                            D4 = b4 + a7;
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    case 68:
                        if (v(i12, i9, obj)) {
                            D4 = zzach.c(i12, (zzaef) sdn.g(obj, j2), m(i9));
                            i10 += D4;
                        }
                        c2 = c3;
                        break;
                    default:
                        c2 = c3;
                        break;
                }
                i9 += 3;
                i7 = i13;
                c3 = c2;
            }
            hdnVar.getClass();
            return ((zzacz) obj).zzc.a() + i10;
        }
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < iArr.length) {
            int j3 = j(i17);
            int i20 = iArr[i17];
            int i21 = i(j3);
            if (i21 <= 17) {
                int i22 = iArr[i17 + 2];
                i = i8;
                int i23 = i22 & 1048575;
                i2 = i << (i22 >>> 20);
                if (i23 != i16) {
                    i19 = unsafe.getInt(obj, i23);
                    i16 = i23;
                }
            } else {
                i = i8;
                i2 = 0;
            }
            long j4 = j3 & 1048575;
            switch (i21) {
                case 0:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        c = '\b';
                        i18 = x5n.t(i20 << 3, 8, i18);
                        break;
                    }
                    c = '\b';
                    break;
                case 1:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        c = '\b';
                        break;
                    }
                    c = '\b';
                case 2:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        long j5 = unsafe.getLong(obj, j4);
                        a = zzach.a(i20 << 3);
                        b = zzach.b(j5);
                        i4 = b + a;
                        i18 += i4;
                    }
                    c = '\b';
                    break;
                case 3:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        long j6 = unsafe.getLong(obj, j4);
                        a = zzach.a(i20 << 3);
                        b = zzach.b(j6);
                        i4 = b + a;
                        i18 += i4;
                    }
                    c = '\b';
                    break;
                case 4:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        i4 = zzach.d(unsafe.getInt(obj, j4)) + zzach.a(i20 << 3);
                        i18 += i4;
                    }
                    c = '\b';
                    break;
                case 5:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(i20 << 3, 8, i18);
                    }
                    c = '\b';
                    break;
                case 6:
                    i3 = i;
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        c = '\b';
                        break;
                    }
                    c = '\b';
                case 7:
                    if ((i19 & i2) != 0) {
                        i3 = 1;
                        i18 = x5n.t(i20 << 3, 1, i18);
                    } else {
                        i3 = 1;
                    }
                    c = '\b';
                    break;
                case 8:
                    if ((i19 & i2) != 0) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzaby) {
                            int a13 = zzach.a(i20 << 3);
                            int m6 = ((zzaby) object).m();
                            i18 = x5n.d(m6, m6, a13, i18);
                        } else {
                            a2 = zzach.a(i20 << 3);
                            e = zzach.e((String) object);
                            D = e + a2;
                            i18 += D;
                        }
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 9:
                    if ((i19 & i2) != 0) {
                        D = e.D(i20, unsafe.getObject(obj, j4), m(i17));
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 10:
                    if ((i19 & i2) != 0) {
                        zzaby zzabyVar3 = (zzaby) unsafe.getObject(obj, j4);
                        int a14 = zzach.a(i20 << 3);
                        int m7 = zzabyVar3.m();
                        i18 = x5n.d(m7, m7, a14, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 11:
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(unsafe.getInt(obj, j4), zzach.a(i20 << 3), i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 12:
                    if ((i19 & i2) != 0) {
                        int i24 = unsafe.getInt(obj, j4);
                        a2 = zzach.a(i20 << 3);
                        e = zzach.d(i24);
                        D = e + a2;
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 13:
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    c = '\b';
                    i3 = 1;
                case 14:
                    if ((i19 & i2) != 0) {
                        i18 = x5n.t(i20 << 3, 8, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 15:
                    if ((i19 & i2) != 0) {
                        int i25 = unsafe.getInt(obj, j4);
                        i18 = x5n.t((i25 >> 31) ^ (i25 + i25), zzach.a(i20 << 3), i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 16:
                    if ((i19 & i2) != 0) {
                        long j7 = unsafe.getLong(obj, j4);
                        D = zzach.b((j7 >> 63) ^ (j7 + j7)) + zzach.a(i20 << 3);
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 17:
                    if ((i19 & i2) != 0) {
                        D = zzach.c(i20, (zzaef) unsafe.getObject(obj, j4), m(i17));
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 18:
                    D = e.z(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 19:
                    D = e.x(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 20:
                    List list11 = (List) unsafe.getObject(obj, j4);
                    Class cls11 = e.a;
                    if (list11.size() != 0) {
                        D = x5n.v(i20, list11.size(), e.C(list11));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 21:
                    List list12 = (List) unsafe.getObject(obj, j4);
                    Class cls12 = e.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        D = x5n.v(i20, size10, e.J(list12));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 22:
                    List list13 = (List) unsafe.getObject(obj, j4);
                    Class cls13 = e.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        D = x5n.v(i20, size11, e.B(list13));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 23:
                    D = e.z(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 24:
                    D = e.x(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 25:
                    List list14 = (List) unsafe.getObject(obj, j4);
                    Class cls14 = e.a;
                    int size12 = list14.size();
                    i18 += size12 == 0 ? 0 : (zzach.a(i20 << 3) + 1) * size12;
                    c = '\b';
                    i3 = 1;
                    break;
                case 26:
                    D = e.H(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 27:
                    D = e.E(i20, (List) unsafe.getObject(obj, j4), m(i17));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 28:
                    D = e.v(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 29:
                    List list15 = (List) unsafe.getObject(obj, j4);
                    Class cls15 = e.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        D = x5n.v(i20, size13, e.I(list15));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 30:
                    List list16 = (List) unsafe.getObject(obj, j4);
                    Class cls16 = e.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        D = x5n.v(i20, size14, e.w(list16));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 31:
                    D = e.x(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 32:
                    D = e.z(i20, (List) unsafe.getObject(obj, j4));
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                    break;
                case 33:
                    List list17 = (List) unsafe.getObject(obj, j4);
                    Class cls17 = e.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        D = x5n.v(i20, size15, e.F(list17));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 34:
                    List list18 = (List) unsafe.getObject(obj, j4);
                    Class cls18 = e.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        D = x5n.v(i20, size16, e.G(list18));
                        i18 += D;
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    D = 0;
                    i18 += D;
                    c = '\b';
                    i3 = 1;
                case 35:
                    int A7 = e.A((List) unsafe.getObject(obj, j4));
                    if (A7 > 0) {
                        i18 = x5n.d(A7, zzach.f(i20), A7, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 36:
                    int y4 = e.y((List) unsafe.getObject(obj, j4));
                    if (y4 > 0) {
                        i18 = x5n.d(y4, zzach.f(i20), y4, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 37:
                    int C2 = e.C((List) unsafe.getObject(obj, j4));
                    if (C2 > 0) {
                        i18 = x5n.d(C2, zzach.f(i20), C2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 38:
                    int J2 = e.J((List) unsafe.getObject(obj, j4));
                    if (J2 > 0) {
                        i18 = x5n.d(J2, zzach.f(i20), J2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 39:
                    int B2 = e.B((List) unsafe.getObject(obj, j4));
                    if (B2 > 0) {
                        i18 = x5n.d(B2, zzach.f(i20), B2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 40:
                    int A8 = e.A((List) unsafe.getObject(obj, j4));
                    if (A8 > 0) {
                        i18 = x5n.d(A8, zzach.f(i20), A8, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 41:
                    int y5 = e.y((List) unsafe.getObject(obj, j4));
                    if (y5 > 0) {
                        i18 = x5n.d(y5, zzach.f(i20), y5, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 42:
                    List list19 = (List) unsafe.getObject(obj, j4);
                    Class cls19 = e.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i18 = x5n.d(size17, zzach.f(i20), size17, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 43:
                    int I2 = e.I((List) unsafe.getObject(obj, j4));
                    if (I2 > 0) {
                        i18 = x5n.d(I2, zzach.f(i20), I2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 44:
                    int w2 = e.w((List) unsafe.getObject(obj, j4));
                    if (w2 > 0) {
                        i18 = x5n.d(w2, zzach.f(i20), w2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 45:
                    int y6 = e.y((List) unsafe.getObject(obj, j4));
                    if (y6 > 0) {
                        i18 = x5n.d(y6, zzach.f(i20), y6, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 46:
                    int A9 = e.A((List) unsafe.getObject(obj, j4));
                    if (A9 > 0) {
                        i18 = x5n.d(A9, zzach.f(i20), A9, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 47:
                    int F2 = e.F((List) unsafe.getObject(obj, j4));
                    if (F2 > 0) {
                        i18 = x5n.d(F2, zzach.f(i20), F2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 48:
                    int G2 = e.G((List) unsafe.getObject(obj, j4));
                    if (G2 > 0) {
                        i18 = x5n.d(G2, zzach.f(i20), G2, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 49:
                    List list20 = (List) unsafe.getObject(obj, j4);
                    kcn m8 = m(i17);
                    Class cls20 = e.a;
                    int size18 = list20.size();
                    if (size18 != 0) {
                        i5 = 0;
                        for (int i26 = 0; i26 < size18; i26++) {
                            i5 += zzach.c(i20, (zzaef) list20.get(i26), m8);
                        }
                    } else {
                        i5 = 0;
                    }
                    i18 += i5;
                    c = '\b';
                    i3 = 1;
                    break;
                case 50:
                    hbn.a(unsafe.getObject(obj, j4), n(i17));
                    c = '\b';
                    i3 = 1;
                    break;
                case 51:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 8, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 52:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    c = '\b';
                    i3 = 1;
                case 53:
                    if (v(i20, i17, obj)) {
                        long k4 = k(obj, j4);
                        a3 = zzach.a(i20 << 3);
                        b2 = zzach.b(k4);
                        D = b2 + a3;
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 54:
                    if (v(i20, i17, obj)) {
                        long k5 = k(obj, j4);
                        a3 = zzach.a(i20 << 3);
                        b2 = zzach.b(k5);
                        D = b2 + a3;
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 55:
                    if (v(i20, i17, obj)) {
                        int A10 = A(obj, j4);
                        a2 = zzach.a(i20 << 3);
                        e = zzach.d(A10);
                        D = e + a2;
                        i18 += D;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 56:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 8, i18);
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 57:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        c = '\b';
                        i3 = 1;
                        break;
                    }
                    c = '\b';
                    i3 = 1;
                case 58:
                    if (v(i20, i17, obj)) {
                        int i27 = i;
                        i18 = x5n.t(i20 << 3, i27, i18);
                        i3 = i27;
                        c = '\b';
                        break;
                    }
                    c = '\b';
                    i3 = 1;
                    break;
                case 59:
                    if (v(i20, i17, obj)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzaby) {
                            int a15 = zzach.a(i20 << 3);
                            int m9 = ((zzaby) object2).m();
                            i18 = x5n.d(m9, m9, a15, i18);
                        } else {
                            a4 = zzach.a(i20 << 3);
                            e2 = zzach.e((String) object2);
                            D2 = e2 + a4;
                            i18 += D2;
                        }
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 60:
                    if (v(i20, i17, obj)) {
                        D2 = e.D(i20, unsafe.getObject(obj, j4), m(i17));
                        i18 += D2;
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 61:
                    if (v(i20, i17, obj)) {
                        zzaby zzabyVar4 = (zzaby) unsafe.getObject(obj, j4);
                        int a16 = zzach.a(i20 << 3);
                        int m10 = zzabyVar4.m();
                        i18 = x5n.d(m10, m10, a16, i18);
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 62:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(A(obj, j4), zzach.a(i20 << 3), i18);
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 63:
                    if (v(i20, i17, obj)) {
                        int A11 = A(obj, j4);
                        a4 = zzach.a(i20 << 3);
                        e2 = zzach.d(A11);
                        D2 = e2 + a4;
                        i18 += D2;
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 64:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 4, i18);
                        i3 = i;
                        c = '\b';
                        break;
                    }
                    i3 = i;
                    c = '\b';
                case 65:
                    if (v(i20, i17, obj)) {
                        i18 = x5n.t(i20 << 3, 8, i18);
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 66:
                    if (v(i20, i17, obj)) {
                        int A12 = A(obj, j4);
                        i18 = x5n.t((A12 >> 31) ^ (A12 + A12), zzach.a(i20 << 3), i18);
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 67:
                    if (v(i20, i17, obj)) {
                        long k6 = k(obj, j4);
                        D2 = zzach.b((k6 >> 63) ^ (k6 + k6)) + zzach.a(i20 << 3);
                        i18 += D2;
                    }
                    i3 = i;
                    c = '\b';
                    break;
                case 68:
                    if (v(i20, i17, obj)) {
                        D2 = zzach.c(i20, (zzaef) unsafe.getObject(obj, j4), m(i17));
                        i18 += D2;
                    }
                    i3 = i;
                    c = '\b';
                    break;
                default:
                    i3 = i;
                    c = '\b';
                    break;
            }
            i17 += 3;
            i8 = i3;
        }
        hdnVar.getClass();
        int a17 = ((zzacz) obj).zzc.a() + i18;
        if (!this.f) {
            return a17;
        }
        this.m.getClass();
        a.a(obj);
        throw null;
    }

    @Override // defpackage.kcn
    public final Object zze() {
        return ((zzacz) this.e).i(4);
    }
}
