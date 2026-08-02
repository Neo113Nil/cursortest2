package com.google.android.gms.internal.auth;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.bdo;
import defpackage.bm2;
import defpackage.cga;
import defpackage.cno;
import defpackage.d4;
import defpackage.h5a;
import defpackage.hbo;
import defpackage.i3c;
import defpackage.ido;
import defpackage.ilg;
import defpackage.mz1;
import defpackage.nco;
import defpackage.nko;
import defpackage.omo;
import defpackage.pvd;
import defpackage.q8o;
import defpackage.sck;
import defpackage.u8f;
import defpackage.u9o;
import defpackage.x5n;
import defpackage.yhk;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements ido {
    public static final int[] k = new int[0];
    public static final Unsafe l;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzfx e;
    public final int[] f;
    public final int g;
    public final int h;
    public final q8o i;
    public final nko j;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(13));
        } catch (Throwable unused) {
            unsafe = null;
        }
        l = unsafe;
    }

    public b(int[] iArr, Object[] objArr, int i, int i2, zzfx zzfxVar, int[] iArr2, int i3, int i4, q8o q8oVar, nko nkoVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = q8oVar;
        this.j = nkoVar;
        this.e = zzfxVar;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).f();
        }
        return true;
    }

    public static b l(bdo bdoVar, q8o q8oVar, nko nkoVar) {
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        int i19;
        int objectFieldOffset;
        int i20;
        String str;
        Class<?> cls;
        int i21;
        int i22;
        int i23;
        int i24;
        Field u;
        int i25;
        char charAt10;
        int i26;
        Field u2;
        Field u3;
        int i27;
        char charAt11;
        int i28;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (!(bdoVar instanceof bdo)) {
            pvd.j();
            return null;
        }
        int i32 = bdoVar.c;
        String str2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt15 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                charAt14 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i31;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = k;
            i2 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt16 = i38 | (charAt9 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt17 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt17 = i41 | (charAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt18 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt18 = i44 | (charAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt19 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt19 = i47 | (charAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt20 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt20 = i53 | (charAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt21 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt21 = i56 | (charAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt22 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt22 = i59 | (charAt2 << i60);
                i58 = i8;
            }
            int i61 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i34 = i58;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i62 = charAt20;
            i3 = charAt18;
            i4 = i62;
            i5 = charAt19;
            i6 = i61;
            i7 = charAt22;
        }
        Object[] objArr = bdoVar.b;
        Class<?> cls2 = bdoVar.a.getClass();
        int i63 = i7 + i4;
        int i64 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i64];
        int i65 = i63;
        int i66 = i7;
        int i67 = 0;
        int i68 = 0;
        while (i34 < 12) {
            int i69 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i30 = i71 + 1;
                    charAt13 = str2.charAt(i71);
                    i16 = i32;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i30;
                    i32 = i16;
                }
                charAt23 = i70 | (charAt13 << i72);
                i17 = i30;
            } else {
                i16 = i32;
                i17 = i69;
            }
            int i73 = i17 + 1;
            int charAt24 = str2.charAt(i17);
            int i74 = charAt23;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i29 = i73 + 1;
                    charAt12 = str2.charAt(i73);
                    if (charAt12 < c) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i73 = i29;
                    c = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i73 = i29;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i67;
                i68++;
            }
            int i77 = charAt24 & 255;
            int i78 = i2;
            Unsafe unsafe = l;
            Object[] objArr3 = objArr2;
            if (i77 >= 51) {
                int i79 = i73 + 1;
                int charAt25 = str2.charAt(i73);
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i27 = i81 + 1;
                        charAt11 = str2.charAt(i81);
                        i28 = i80;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i80 = i28 | ((charAt11 & 8191) << i82);
                        i82 += 13;
                        i81 = i27;
                    }
                    charAt25 = i28 | (charAt11 << i82);
                    i26 = i27;
                } else {
                    i26 = i79;
                }
                int i83 = charAt25;
                int i84 = i77 - 51;
                int i85 = i26;
                if (i84 == 9 || i84 == 17) {
                    objArr3[x5n.z(i67, 3, 1)] = objArr[i6];
                    i6++;
                } else if (i84 == 12 && ((i16 & 1) != 0 || (charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0)) {
                    objArr3[x5n.z(i67, 3, 1)] = objArr[i6];
                    i6++;
                }
                int i86 = i83 + i83;
                Object obj = objArr[i86];
                if (obj instanceof Field) {
                    u2 = (Field) obj;
                } else {
                    u2 = u(cls2, (String) obj);
                    objArr[i86] = u2;
                }
                i18 = i63;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(u2);
                int i87 = i86 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    u3 = (Field) obj2;
                } else {
                    u3 = u(cls2, (String) obj2);
                    objArr[i87] = u3;
                }
                i20 = (int) unsafe.objectFieldOffset(u3);
                i24 = objectFieldOffset2;
                str = str2;
                i21 = i85;
                i23 = 0;
                cls = cls2;
            } else {
                i18 = i63;
                int i88 = i6 + 1;
                Field u4 = u(cls2, (String) objArr[i6]);
                if (i77 == 9 || i77 == 17) {
                    objArr3[x5n.z(i67, 3, 1)] = u4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i19 = i6 + 2;
                        objArr3[x5n.z(i67, 3, 1)] = objArr[i88];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if ((i16 & 1) != 0 || (charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                            i19 = i6 + 2;
                            objArr3[x5n.z(i67, 3, 1)] = objArr[i88];
                        }
                    } else if (i77 == 50) {
                        int i89 = i66 + 1;
                        iArr[i66] = i67;
                        int i90 = i67 / 3;
                        int i91 = i6 + 2;
                        int i92 = i90 + i90;
                        objArr3[i92] = objArr[i88];
                        if ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                            objArr3[i92 + 1] = objArr[i91];
                            i19 = i6 + 3;
                        } else {
                            i19 = i91;
                        }
                        i66 = i89;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0 || i77 > 17) {
                        str = str2;
                        cls = cls2;
                        i21 = i73;
                        i22 = 0;
                    } else {
                        i21 = i73 + 1;
                        int charAt26 = str2.charAt(i73);
                        if (charAt26 >= 55296) {
                            int i93 = charAt26 & 8191;
                            int i94 = 13;
                            while (true) {
                                i25 = i21 + 1;
                                charAt10 = str2.charAt(i21);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i93 |= (charAt10 & 8191) << i94;
                                i94 += 13;
                                i21 = i25;
                            }
                            charAt26 = i93 | (charAt10 << i94);
                            i21 = i25;
                        }
                        int i95 = (charAt26 / 32) + i78 + i78;
                        Object obj3 = objArr[i95];
                        str = str2;
                        if (obj3 instanceof Field) {
                            u = (Field) obj3;
                        } else {
                            u = u(cls2, (String) obj3);
                            objArr[i95] = u;
                        }
                        cls = cls2;
                        i22 = charAt26 % 32;
                        i20 = (int) unsafe.objectFieldOffset(u);
                    }
                    if (i77 >= 18 && i77 <= 49) {
                        iArr[i65] = objectFieldOffset;
                        i65++;
                    }
                    i23 = i22;
                    i24 = objectFieldOffset;
                    i6 = i19;
                }
                i19 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                cls = cls2;
                i21 = i73;
                i22 = 0;
                if (i77 >= 18) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
                i23 = i22;
                i24 = objectFieldOffset;
                i6 = i19;
            }
            int i96 = i67 + 1;
            iArr2[i67] = i74;
            int i97 = i67 + 2;
            int i98 = i23;
            iArr2[i96] = ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i77 << 20) | i24;
            i67 += 3;
            iArr2[i97] = (i98 << 20) | i20;
            i34 = i21;
            i2 = i78;
            i32 = i16;
            i63 = i18;
            str2 = str;
            objArr2 = objArr3;
            cls2 = cls;
        }
        return new b(iArr2, objArr2, i3, i5, bdoVar.a, iArr, i7, i63, q8oVar, nkoVar);
    }

    public static int m(zzev zzevVar, long j) {
        return ((Integer) omo.c(zzevVar, j)).intValue();
    }

    public static int o(int i) {
        return (i >>> 20) & 255;
    }

    public static Field u(Class cls, String str) {
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

    @Override // defpackage.ido
    public final void a(Object obj) {
        if (i(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.e();
                zzevVar.zza = 0;
                zzevVar.c();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int p = p(i);
                int i2 = 1048575 & p;
                int o = o(p);
                long j = i2;
                Unsafe unsafe = l;
                if (o != 9) {
                    if (o != 60 && o != 68) {
                        switch (o) {
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
                                this.i.a(obj, j);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfr) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (j(iArr[i], i, obj)) {
                        r(i).a(unsafe.getObject(obj, j));
                    }
                }
                if (h(i, obj)) {
                    r(i).a(unsafe.getObject(obj, j));
                }
            }
            this.j.getClass();
            zzha zzhaVar = ((zzev) obj).zzc;
            if (zzhaVar.d) {
                zzhaVar.d = false;
            }
        }
    }

    @Override // defpackage.ido
    public final void b(Object obj, byte[] bArr, int i, int i2, bm2 bm2Var) {
        k(obj, bArr, i, i2, 0, bm2Var);
    }

    @Override // defpackage.ido
    public final boolean c(zzev zzevVar, zzev zzevVar2) {
        boolean b;
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                int p = p(i);
                long j = p & 1048575;
                switch (o(p)) {
                    case 0:
                        if (!g(zzevVar, zzevVar2, i)) {
                            break;
                        } else {
                            sck sckVar = omo.c;
                            if (Double.doubleToLongBits(sckVar.n(zzevVar, j)) != Double.doubleToLongBits(sckVar.n(zzevVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!g(zzevVar, zzevVar2, i)) {
                            break;
                        } else {
                            sck sckVar2 = omo.c;
                            if (Float.floatToIntBits(sckVar2.q(zzevVar, j)) != Float.floatToIntBits(sckVar2.q(zzevVar2, j))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (g(zzevVar, zzevVar2, i) && omo.b(zzevVar, j) == omo.b(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (g(zzevVar, zzevVar2, i) && omo.b(zzevVar, j) == omo.b(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (g(zzevVar, zzevVar2, i) && omo.b(zzevVar, j) == omo.b(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!g(zzevVar, zzevVar2, i)) {
                            break;
                        } else {
                            sck sckVar3 = omo.c;
                            if (sckVar3.F(zzevVar, j) != sckVar3.F(zzevVar2, j)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (g(zzevVar, zzevVar2, i) && d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (g(zzevVar, zzevVar2, i) && d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (g(zzevVar, zzevVar2, i) && d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (g(zzevVar, zzevVar2, i) && omo.b(zzevVar, j) == omo.b(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (g(zzevVar, zzevVar2, i) && omo.a(zzevVar, j) == omo.a(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (g(zzevVar, zzevVar2, i) && omo.b(zzevVar, j) == omo.b(zzevVar2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (g(zzevVar, zzevVar2, i) && d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j))) {
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
                        b = d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j));
                        break;
                    case 50:
                        b = d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j));
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
                        if (omo.a(zzevVar, j2) == omo.a(zzevVar2, j2) && d.b(omo.c(zzevVar, j), omo.c(zzevVar2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (b) {
                    i += 3;
                }
            } else {
                this.j.getClass();
                if (zzevVar.zzc.equals(zzevVar2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0207, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.ido
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(zzev zzevVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int p = p(i5);
            int i6 = iArr[i5];
            long j = 1048575 & p;
            int i7 = 1237;
            int i8 = 37;
            switch (o(p)) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(omo.c.n(zzevVar, j));
                    Charset charset = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(omo.c.q(zzevVar, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = omo.b(zzevVar, j);
                    Charset charset2 = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = omo.b(zzevVar, j);
                    Charset charset3 = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = omo.b(zzevVar, j);
                    Charset charset4 = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean F = omo.c.F(zzevVar, j);
                    Charset charset5 = zzfa.a;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) omo.c(zzevVar, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    Object c = omo.c(zzevVar, j);
                    if (c != null) {
                        i8 = c.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = omo.c(zzevVar, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = omo.b(zzevVar, j);
                    Charset charset6 = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = omo.a(zzevVar, j);
                    i4 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = omo.b(zzevVar, j);
                    Charset charset7 = zzfa.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object c2 = omo.c(zzevVar, j);
                    if (c2 != null) {
                        i8 = c2.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
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
                    i2 = i4 * 53;
                    floatToIntBits = omo.c(zzevVar, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = omo.c(zzevVar, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 51:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) omo.c(zzevVar, j)).doubleValue());
                        Charset charset8 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) omo.c(zzevVar, j)).floatValue());
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = ((Long) omo.c(zzevVar, j)).longValue();
                        Charset charset9 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = ((Long) omo.c(zzevVar, j)).longValue();
                        Charset charset10 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = ((Long) omo.c(zzevVar, j)).longValue();
                        Charset charset11 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (j(i6, i5, zzevVar)) {
                        i3 = i4 * 53;
                        boolean booleanValue = ((Boolean) omo.c(zzevVar, j)).booleanValue();
                        Charset charset12 = zzfa.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) omo.c(zzevVar, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = omo.c(zzevVar, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = omo.c(zzevVar, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = ((Long) omo.c(zzevVar, j)).longValue();
                        Charset charset13 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = m(zzevVar, j);
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (j(i6, i5, zzevVar)) {
                        i = i4 * 53;
                        doubleToLongBits = ((Long) omo.c(zzevVar, j)).longValue();
                        Charset charset14 = zzfa.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (j(i6, i5, zzevVar)) {
                        i2 = i4 * 53;
                        floatToIntBits = omo.c(zzevVar, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.j.getClass();
        return zzevVar.zzc.hashCode() + (i4 * 53);
    }

    @Override // defpackage.ido
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                d.a(this.j, obj, obj2);
                return;
            }
            int p = p(i);
            int i2 = iArr[i];
            long j = p & 1048575;
            switch (o(p)) {
                case 0:
                    obj3 = obj;
                    if (!h(i, obj2)) {
                        break;
                    } else {
                        sck sckVar = omo.c;
                        sckVar.x(obj3, j, sckVar.n(obj2, j));
                        x(i, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        sck sckVar2 = omo.c;
                        sckVar2.B(obj3, j, sckVar2.q(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.c.b.putLong(obj3, j, omo.b(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.c.b.putLong(obj3, j, omo.b(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.c.b.putLong(obj3, j, omo.b(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        sck sckVar3 = omo.c;
                        sckVar3.u(obj3, j, sckVar3.F(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.g(j, obj3, omo.c(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    v(i, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.g(j, obj3, omo.c(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.c.b.putLong(obj3, j, omo.b(obj2, j));
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        omo.f(omo.a(obj2, j), j, obj3);
                        x(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (h(i, obj2)) {
                        obj3 = obj;
                        omo.c.b.putLong(obj3, j, omo.b(obj2, j));
                        x(i, obj3);
                        break;
                    }
                    break;
                case 17:
                    v(i, obj, obj2);
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
                    this.i.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls = d.a;
                    omo.g(j, obj, u9o.a(omo.c(obj, j), omo.c(obj2, j)));
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
                    if (j(i2, i, obj2)) {
                        omo.g(j, obj, omo.c(obj2, j));
                        omo.f(i2, iArr[i + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 60:
                    w(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(i2, i, obj2)) {
                        omo.g(j, obj, omo.c(obj2, j));
                        omo.f(i2, iArr[i + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 68:
                    w(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e0, code lost:
    
        return false;
     */
    @Override // defpackage.ido
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        loop0: while (true) {
            boolean z = true;
            if (i >= this.g) {
                return true;
            }
            int i4 = this.f[i];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int p = p(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i3) {
                if (i7 != 1048575) {
                    i2 = l.getInt(obj, i7);
                }
                i3 = i7;
            }
            if ((268435456 & p) != 0) {
                if (!(i3 == 1048575 ? h(i4, obj) : (i2 & i8) != 0)) {
                    break;
                }
            }
            int o = o(p);
            if (o == 9 || o == 17) {
                if (i3 == 1048575) {
                    z = h(i4, obj);
                } else if ((i8 & i2) == 0) {
                    z = false;
                }
                if (z && !r(i4).f(omo.c(obj, p & 1048575))) {
                    break;
                }
                i++;
            } else {
                if (o != 27) {
                    if (o == 60 || o == 68) {
                        if (j(i5, i4, obj) && !r(i4).f(omo.c(obj, p & 1048575))) {
                            break;
                        }
                    } else if (o != 49) {
                        if (o == 50 && !((zzfr) omo.c(obj, p & 1048575)).isEmpty()) {
                            int i9 = i4 / 3;
                            throw null;
                        }
                    }
                    i++;
                }
                List list = (List) omo.c(obj, p & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ido r = r(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!r.f(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
        }
    }

    public final boolean g(zzev zzevVar, zzev zzevVar2, int i) {
        return h(i, zzevVar) == h(i, zzevVar2);
    }

    public final boolean h(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & omo.a(obj, j)) != 0;
        }
        int p = p(i);
        long j2 = p & 1048575;
        switch (o(p)) {
            case 0:
                if (Double.doubleToRawLongBits(omo.c.n(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(omo.c.q(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (omo.b(obj, j2) != 0) {
                }
                break;
            case 3:
                if (omo.b(obj, j2) != 0) {
                }
                break;
            case 4:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 5:
                if (omo.b(obj, j2) != 0) {
                }
                break;
            case 6:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object c = omo.c(obj, j2);
                if (!(c instanceof String)) {
                    if (!(c instanceof zzef)) {
                        ilg.c();
                        break;
                    } else if (!zzef.b.equals(c)) {
                    }
                } else if (!((String) c).isEmpty()) {
                }
                break;
            case 9:
                if (omo.c(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzef.b.equals(omo.c(obj, j2))) {
                }
                break;
            case 11:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 12:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 13:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 14:
                if (omo.b(obj, j2) != 0) {
                }
                break;
            case 15:
                if (omo.a(obj, j2) != 0) {
                }
                break;
            case 16:
                if (omo.b(obj, j2) != 0) {
                }
                break;
            case 17:
                if (omo.c(obj, j2) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final boolean j(int i, int i2, Object obj) {
        return omo.a(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0c76, code lost:
    
        if (r2 == 1048575) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0c78, code lost:
    
        r12.putInt(r8, r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0c7c, code lost:
    
        r3 = r37.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c82, code lost:
    
        if (r3 >= r37.h) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c84, code lost:
    
        r4 = r37.f[r3];
        r6 = r32[r4];
        r6 = defpackage.omo.c(r8, p(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x030a, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0c98, code lost:
    
        if (r6 != null) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x035a, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c9f, code lost:
    
        if (q(r4) != null) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ca4, code lost:
    
        r6 = (com.google.android.gms.internal.auth.zzfr) r6;
        r4 = r4 / 3;
        r0 = (com.google.android.gms.internal.auth.zzfq) r33[r4 + r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x03bd, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0cad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0ca1, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0cb0, code lost:
    
        if (r0 != 0) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0cb2, code lost:
    
        if (r1 != r5) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0cba, code lost:
    
        throw new com.google.android.gms.internal.auth.zzfb("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0cbf, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0cbb, code lost:
    
        if (r1 > r5) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0cbd, code lost:
    
        if (r14 != r0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cc5, code lost:
    
        throw new com.google.android.gms.internal.auth.zzfb("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0915 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0922 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0c15 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0c26 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(Object obj, byte[] bArr, int i, int i2, int i3, bm2 bm2Var) {
        int i4;
        int[] iArr;
        Unsafe unsafe;
        Object[] objArr;
        Object obj2;
        int i5;
        int n;
        byte[] bArr2;
        int i6;
        int i7;
        int i8;
        int i9;
        bm2 bm2Var2;
        int i10;
        zzha zzhaVar;
        int i11;
        int i12;
        int i13;
        byte[] bArr3;
        int i14;
        int i15;
        zzha zzhaVar2;
        bm2 bm2Var3;
        Unsafe unsafe2;
        byte[] bArr4;
        Object obj3;
        bm2 bm2Var4;
        Unsafe unsafe3;
        int i16;
        int i17;
        int i18;
        int b0;
        byte b;
        byte[] bArr5;
        bm2 bm2Var5;
        Object obj4;
        Unsafe unsafe4;
        int i19;
        int W;
        zzha zzhaVar3;
        long j;
        byte[] bArr6;
        int i20;
        bm2 bm2Var6;
        int i21;
        byte[] bArr7;
        int i22;
        bm2 bm2Var7;
        int i23;
        bm2 bm2Var8;
        int i24;
        int i25;
        int i26;
        int i27;
        int d0;
        byte[] bArr8;
        bm2 bm2Var9;
        int i28;
        int W2;
        byte[] bArr9;
        bm2 bm2Var10;
        int i29;
        int b02;
        b bVar = this;
        Object obj5 = obj;
        byte[] bArr10 = bArr;
        int i30 = i2;
        bm2 bm2Var11 = bm2Var;
        if (!i(obj5)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int i31 = i;
        int i32 = -1;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            Object[] objArr2 = bVar.b;
            int[] iArr2 = bVar.a;
            Unsafe unsafe5 = l;
            if (i31 < i30) {
                int i37 = i31 + 1;
                int i38 = bArr10[i31];
                if (i38 < 0) {
                    i37 = cga.c0(i38, i37, bm2Var11, bArr10);
                    i38 = bm2Var11.c;
                }
                int i39 = i37;
                int i40 = i38;
                int i41 = i40 >>> 3;
                int i42 = bVar.d;
                int i43 = bVar.c;
                if (i41 > i32) {
                    n = (i41 < i43 || i41 > i42) ? -1 : bVar.n(i41, i33 / 3);
                } else {
                    n = (i41 < i43 || i41 > i42) ? -1 : bVar.n(i41, 0);
                }
                zzha zzhaVar4 = zzha.e;
                if (n == -1) {
                    bArr2 = bArr;
                    i4 = i3;
                    i6 = i39;
                    i7 = i34;
                    i8 = i35;
                    iArr = iArr2;
                    unsafe = unsafe5;
                    i9 = i40;
                    objArr = objArr2;
                    bm2Var2 = bm2Var;
                    i10 = i41;
                    obj2 = obj5;
                    zzhaVar = zzhaVar4;
                    i33 = 0;
                } else {
                    int i44 = i40 & 7;
                    int i45 = iArr2[n + 1];
                    int o = o(i45);
                    long j2 = i45 & 1048575;
                    Unsafe unsafe6 = l;
                    String str = "";
                    if (o <= 17) {
                        int i46 = iArr2[n + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        iArr = iArr2;
                        if (i48 != i34) {
                            i11 = i40;
                            objArr = objArr2;
                            if (i34 != 1048575) {
                                unsafe5.putInt(obj5, i34, i35);
                            }
                            i12 = i48;
                            i13 = i48 == 1048575 ? 0 : unsafe5.getInt(obj5, i48);
                        } else {
                            i11 = i40;
                            objArr = objArr2;
                            i12 = i34;
                            i13 = i35;
                        }
                        switch (o) {
                            case 0:
                                bArr3 = bArr;
                                i10 = i41;
                                i7 = i12;
                                unsafe = unsafe5;
                                i14 = i13;
                                i15 = i39;
                                zzhaVar2 = zzhaVar4;
                                bm2Var3 = bm2Var;
                                if (i44 != 1) {
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    omo.c.x(obj5, j2, Double.longBitsToDouble(cga.g0(i15, bArr3)));
                                    i31 = i15 + 8;
                                    bArr4 = bArr3;
                                    i35 = i14 | i47;
                                    bArr10 = bArr4;
                                    i30 = i2;
                                    bm2Var11 = bm2Var3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 1:
                                bArr3 = bArr;
                                i10 = i41;
                                i7 = i12;
                                unsafe = unsafe5;
                                i14 = i13;
                                i15 = i39;
                                zzhaVar2 = zzhaVar4;
                                bm2Var3 = bm2Var;
                                if (i44 != 5) {
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    omo.c.B(obj5, j2, Float.intBitsToFloat(cga.X(i15, bArr3)));
                                    i31 = i15 + 4;
                                    bArr4 = bArr3;
                                    i35 = i14 | i47;
                                    bArr10 = bArr4;
                                    i30 = i2;
                                    bm2Var11 = bm2Var3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i10 = i41;
                                i7 = i12;
                                i14 = i13;
                                i15 = i39;
                                zzhaVar2 = zzhaVar4;
                                bm2Var3 = bm2Var;
                                if (i44 != 0) {
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    int d02 = cga.d0(bArr3, i15, bm2Var3);
                                    unsafe2.putLong(obj5, j2, bm2Var3.b);
                                    i30 = i2;
                                    bm2Var11 = bm2Var3;
                                    bArr10 = bArr3;
                                    i33 = n;
                                    i32 = i10;
                                    i36 = i11;
                                    i35 = i14 | i47;
                                    i31 = d02;
                                    i34 = i7;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                unsafe2 = unsafe5;
                                i10 = i41;
                                i7 = i12;
                                i14 = i13;
                                i15 = i39;
                                zzhaVar2 = zzhaVar4;
                                bm2Var3 = bm2Var;
                                if (i44 != 0) {
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    int b03 = cga.b0(bArr3, i15, bm2Var3);
                                    unsafe2.putInt(obj5, j2, bm2Var3.c);
                                    bArr4 = bArr3;
                                    i35 = i14 | i47;
                                    i31 = b03;
                                    bArr10 = bArr4;
                                    i30 = i2;
                                    bm2Var11 = bm2Var3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                obj3 = obj5;
                                i10 = i41;
                                zzhaVar2 = zzhaVar4;
                                i7 = i12;
                                i14 = i13;
                                if (i44 != 1) {
                                    bm2Var3 = bm2Var;
                                    i15 = i39;
                                    unsafe = unsafe5;
                                    obj5 = obj3;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    bm2Var3 = bm2Var;
                                    i15 = i39;
                                    obj5 = obj3;
                                    unsafe5.putLong(obj5, j2, cga.g0(i39, bArr3));
                                    i31 = i15 + 8;
                                    bArr4 = bArr3;
                                    i35 = i14 | i47;
                                    bArr10 = bArr4;
                                    i30 = i2;
                                    bm2Var11 = bm2Var3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                bm2Var4 = bm2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i10 = i41;
                                i16 = i39;
                                zzhaVar2 = zzhaVar4;
                                i7 = i12;
                                i14 = i13;
                                if (i44 != 5) {
                                    bm2Var3 = bm2Var4;
                                    unsafe = unsafe3;
                                    i15 = i16;
                                    obj5 = obj3;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    unsafe3.putInt(obj3, j2, cga.X(i16, bArr3));
                                    i17 = i16 + 4;
                                    byte[] bArr11 = bArr3;
                                    i35 = i14 | i47;
                                    bArr10 = bArr11;
                                    i30 = i2;
                                    bm2Var11 = bm2Var4;
                                    i31 = i17;
                                    obj5 = obj3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 7:
                                bArr3 = bArr;
                                bm2Var4 = bm2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i10 = i41;
                                i16 = i39;
                                zzhaVar2 = zzhaVar4;
                                i7 = i12;
                                i14 = i13;
                                if (i44 != 0) {
                                    bm2Var3 = bm2Var4;
                                    unsafe = unsafe3;
                                    i15 = i16;
                                    obj5 = obj3;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    i17 = cga.d0(bArr3, i16, bm2Var4);
                                    omo.c.u(obj3, j2, bm2Var4.b != 0);
                                    byte[] bArr112 = bArr3;
                                    i35 = i14 | i47;
                                    bArr10 = bArr112;
                                    i30 = i2;
                                    bm2Var11 = bm2Var4;
                                    i31 = i17;
                                    obj5 = obj3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 8:
                                bArr3 = bArr;
                                bm2Var4 = bm2Var;
                                obj3 = obj5;
                                unsafe3 = unsafe5;
                                i10 = i41;
                                i16 = i39;
                                zzhaVar2 = zzhaVar4;
                                i7 = i12;
                                if (i44 != 2) {
                                    i14 = i13;
                                    bm2Var3 = bm2Var4;
                                    unsafe = unsafe3;
                                    i15 = i16;
                                    obj5 = obj3;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    if ((i45 & 536870912) != 0) {
                                        b0 = cga.b0(bArr3, i16, bm2Var4);
                                        int i49 = bm2Var4.c;
                                        if (i49 < 0) {
                                            throw zzfb.g();
                                        }
                                        if (i49 == 0) {
                                            bm2Var4.d = "";
                                            i18 = i13;
                                        } else {
                                            u8f u8fVar = cno.a;
                                            int length = bArr3.length;
                                            if ((((length - b0) - i49) | b0 | i49) < 0) {
                                                yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(b0), Integer.valueOf(i49)});
                                                return 0;
                                            }
                                            int i50 = b0 + i49;
                                            char[] cArr = new char[i49];
                                            int i51 = 0;
                                            while (b0 < i50) {
                                                byte b2 = bArr3[b0];
                                                if (b2 >= 0) {
                                                    b0++;
                                                    cArr[i51] = (char) b2;
                                                    i51++;
                                                } else {
                                                    while (b0 < i50) {
                                                        int i52 = b0 + 1;
                                                        int i53 = b0;
                                                        byte b3 = bArr3[i53];
                                                        if (b3 >= 0) {
                                                            int i54 = i51 + 1;
                                                            cArr[i51] = (char) b3;
                                                            b0 = i52;
                                                            while (true) {
                                                                i51 = i54;
                                                                if (b0 < i50 && (b = bArr3[b0]) >= 0) {
                                                                    b0++;
                                                                    i54 = i51 + 1;
                                                                    cArr[i51] = (char) b;
                                                                }
                                                            }
                                                        } else {
                                                            int i55 = i13;
                                                            if (b3 >= -32) {
                                                                int i56 = i50;
                                                                if (b3 < -16) {
                                                                    if (i52 >= i56 - 1) {
                                                                        throw zzfb.d();
                                                                    }
                                                                    int i57 = i53 + 2;
                                                                    byte b4 = bArr3[i52];
                                                                    int i58 = i53 + 3;
                                                                    byte b5 = bArr3[i57];
                                                                    int i59 = i51 + 1;
                                                                    if (!h5a.W(b4)) {
                                                                        if (b3 == -32) {
                                                                            if (b4 < -96) {
                                                                                break;
                                                                            } else {
                                                                                b3 = -32;
                                                                            }
                                                                        }
                                                                        if (b3 == -19) {
                                                                            if (b4 >= -96) {
                                                                                break;
                                                                            } else {
                                                                                b3 = -19;
                                                                            }
                                                                        }
                                                                        if (h5a.W(b5)) {
                                                                            break;
                                                                        } else {
                                                                            cArr[i51] = (char) (((b3 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                            i50 = i56;
                                                                            b0 = i58;
                                                                            i51 = i59;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (i52 >= i56 - 2) {
                                                                        throw zzfb.d();
                                                                    }
                                                                    byte b6 = bArr3[i52];
                                                                    int i60 = i53 + 3;
                                                                    byte b7 = bArr3[i53 + 2];
                                                                    int i61 = i53 + 4;
                                                                    byte b8 = bArr3[i60];
                                                                    if (h5a.W(b6)) {
                                                                        break;
                                                                    } else if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !h5a.W(b7) && !h5a.W(b8)) {
                                                                        int i62 = ((b3 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                        cArr[i51] = (char) ((i62 >>> 10) + 55232);
                                                                        cArr[i51 + 1] = (char) ((i62 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                                                        i51 += 2;
                                                                        i50 = i56;
                                                                        b0 = i61;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i52 >= i50) {
                                                                    throw zzfb.d();
                                                                }
                                                                int i63 = i53 + 2;
                                                                byte b9 = bArr3[i52];
                                                                int i64 = i51 + 1;
                                                                int i65 = i50;
                                                                if (b3 >= -62 && !h5a.W(b9)) {
                                                                    cArr[i51] = (char) (((b3 & 31) << 6) | (b9 & 63));
                                                                    i50 = i65;
                                                                    b0 = i63;
                                                                    i51 = i64;
                                                                }
                                                            }
                                                            i13 = i55;
                                                        }
                                                    }
                                                    int i66 = i50;
                                                    i18 = i13;
                                                    str = new String(cArr, 0, i51);
                                                    bm2Var4.d = str;
                                                    b0 = i66;
                                                }
                                            }
                                            while (b0 < i50) {
                                            }
                                            int i662 = i50;
                                            i18 = i13;
                                            str = new String(cArr, 0, i51);
                                            bm2Var4.d = str;
                                            b0 = i662;
                                        }
                                    } else {
                                        i18 = i13;
                                        b0 = cga.b0(bArr3, i16, bm2Var4);
                                        int i67 = bm2Var4.c;
                                        if (i67 < 0) {
                                            throw zzfb.g();
                                        }
                                        if (i67 == 0) {
                                            bm2Var4.d = "";
                                        } else {
                                            str = new String(bArr3, b0, i67, zzfa.a);
                                            bm2Var4.d = str;
                                            b0 += i67;
                                        }
                                    }
                                    unsafe3.putObject(obj3, j2, str);
                                    i30 = i2;
                                    bm2Var11 = bm2Var4;
                                    i31 = b0;
                                    bArr10 = bArr3;
                                    i33 = n;
                                    i32 = i10;
                                    i36 = i11;
                                    i35 = i18 | i47;
                                    obj5 = obj3;
                                    i34 = i7;
                                    break;
                                }
                            case 9:
                                Object obj6 = obj5;
                                i10 = i41;
                                i7 = i12;
                                if (i44 != 2) {
                                    bArr3 = bArr;
                                    unsafe = unsafe5;
                                    zzhaVar2 = zzhaVar4;
                                    obj5 = obj6;
                                    i14 = i13;
                                    bm2Var3 = bm2Var;
                                    i15 = i39;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    Object s = bVar.s(n, obj6);
                                    obj3 = obj6;
                                    bm2Var11 = bm2Var;
                                    i17 = cga.f0(s, bVar.r(n), bArr, i39, i2, bm2Var11);
                                    unsafe6.putObject(obj3, bVar.p(n) & 1048575, s);
                                    bVar.x(n, obj3);
                                    i35 = i13 | i47;
                                    bArr10 = bArr;
                                    i30 = i2;
                                    i31 = i17;
                                    obj5 = obj3;
                                    i33 = n;
                                    i32 = i10;
                                    i34 = i7;
                                    i36 = i11;
                                    break;
                                }
                            case 10:
                                bArr5 = bArr;
                                bm2Var5 = bm2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe5;
                                i10 = i41;
                                i19 = i39;
                                i7 = i12;
                                if (i44 != 2) {
                                    unsafe = unsafe4;
                                    zzhaVar2 = zzhaVar4;
                                    bm2Var3 = bm2Var5;
                                    i14 = i13;
                                    obj5 = obj4;
                                    i15 = i19;
                                    bArr3 = bArr5;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    W = cga.W(bArr5, i19, bm2Var5);
                                    unsafe4.putObject(obj4, j2, bm2Var5.d);
                                    int i68 = i13 | i47;
                                    i30 = i2;
                                    bm2Var11 = bm2Var5;
                                    i33 = n;
                                    i32 = i10;
                                    i36 = i11;
                                    i35 = i68;
                                    obj5 = obj4;
                                    i31 = W;
                                    bArr10 = bArr5;
                                    i34 = i7;
                                    break;
                                }
                            case 12:
                                bArr5 = bArr;
                                bm2Var5 = bm2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe5;
                                i10 = i41;
                                i19 = i39;
                                i7 = i12;
                                if (i44 != 0) {
                                    unsafe = unsafe4;
                                    zzhaVar2 = zzhaVar4;
                                    bm2Var3 = bm2Var5;
                                    i14 = i13;
                                    obj5 = obj4;
                                    i15 = i19;
                                    bArr3 = bArr5;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    int b04 = cga.b0(bArr5, i19, bm2Var5);
                                    int i69 = bm2Var5.c;
                                    zzey q = bVar.q(n);
                                    if ((i45 & Integer.MIN_VALUE) != 0 && q != null && !q.zza()) {
                                        zzev zzevVar = (zzev) obj4;
                                        zzha zzhaVar5 = zzevVar.zzc;
                                        if (zzhaVar5 == zzhaVar4) {
                                            zzhaVar5 = zzha.a();
                                            zzevVar.zzc = zzhaVar5;
                                        }
                                        int i70 = i11;
                                        zzhaVar5.b(i70, Long.valueOf(i69));
                                        int i71 = i13;
                                        i36 = i70;
                                        bm2Var11 = bm2Var5;
                                        i35 = i71;
                                        i30 = i2;
                                        obj5 = obj4;
                                        i31 = b04;
                                        bArr10 = bArr5;
                                        i33 = n;
                                        i32 = i10;
                                        i34 = i7;
                                        break;
                                    } else {
                                        int i72 = i11;
                                        unsafe4.putInt(obj4, j2, i69);
                                        int i73 = i13 | i47;
                                        i30 = i2;
                                        i36 = i72;
                                        bArr10 = bArr5;
                                        bm2Var11 = bm2Var5;
                                        i33 = n;
                                        i34 = i7;
                                        i35 = i73;
                                        obj5 = obj4;
                                        i31 = b04;
                                        i32 = i10;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                bArr5 = bArr;
                                bm2Var5 = bm2Var;
                                obj4 = obj5;
                                unsafe4 = unsafe5;
                                i10 = i41;
                                i19 = i39;
                                i7 = i12;
                                if (i44 != 0) {
                                    unsafe = unsafe4;
                                    zzhaVar2 = zzhaVar4;
                                    bm2Var3 = bm2Var5;
                                    i14 = i13;
                                    obj5 = obj4;
                                    i15 = i19;
                                    bArr3 = bArr5;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    W = cga.b0(bArr5, i19, bm2Var5);
                                    int i74 = bm2Var5.c;
                                    unsafe4.putInt(obj4, j2, (i74 >>> 1) ^ (-(i74 & 1)));
                                    int i682 = i13 | i47;
                                    i30 = i2;
                                    bm2Var11 = bm2Var5;
                                    i33 = n;
                                    i32 = i10;
                                    i36 = i11;
                                    i35 = i682;
                                    obj5 = obj4;
                                    i31 = W;
                                    bArr10 = bArr5;
                                    i34 = i7;
                                    break;
                                }
                            case 16:
                                bArr5 = bArr;
                                i19 = i39;
                                if (i44 != 0) {
                                    i10 = i41;
                                    zzhaVar2 = zzhaVar4;
                                    bm2Var3 = bm2Var;
                                    i7 = i12;
                                    unsafe = unsafe5;
                                    i14 = i13;
                                    i15 = i19;
                                    bArr3 = bArr5;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    int d03 = cga.d0(bArr5, i19, bm2Var);
                                    long j3 = bm2Var.b;
                                    unsafe5.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    Object obj7 = obj5;
                                    int i75 = i13 | i47;
                                    i30 = i2;
                                    bArr10 = bArr5;
                                    bm2Var11 = bm2Var;
                                    i34 = i12;
                                    i32 = i41;
                                    i36 = i11;
                                    i35 = i75;
                                    obj5 = obj7;
                                    i31 = d03;
                                    i33 = n;
                                    break;
                                }
                            default:
                                if (i44 != 3) {
                                    bArr3 = bArr;
                                    i14 = i13;
                                    i10 = i41;
                                    i15 = i39;
                                    zzhaVar2 = zzhaVar4;
                                    i7 = i12;
                                    unsafe = unsafe5;
                                    bm2Var3 = bm2Var;
                                    i4 = i3;
                                    obj2 = obj5;
                                    bArr2 = bArr3;
                                    i6 = i15;
                                    zzhaVar = zzhaVar2;
                                    i8 = i14;
                                    i9 = i11;
                                    bm2Var2 = bm2Var3;
                                    i33 = n;
                                    break;
                                } else {
                                    Object s2 = bVar.s(n, obj5);
                                    i31 = cga.e0(s2, bVar.r(n), bArr, i39, i2, (i41 << 3) | 4, bm2Var);
                                    unsafe6.putObject(obj5, bVar.p(n) & 1048575, s2);
                                    bVar.x(n, obj5);
                                    int i76 = i13 | i47;
                                    i30 = i2;
                                    bm2Var11 = bm2Var;
                                    i33 = n;
                                    i32 = i41;
                                    i36 = i11;
                                    i35 = i76;
                                    bArr10 = bArr;
                                    i34 = i12;
                                    break;
                                }
                        }
                    } else {
                        iArr = iArr2;
                        unsafe = unsafe5;
                        i11 = i40;
                        objArr = objArr2;
                        i10 = i41;
                        int i77 = i39;
                        i7 = i34;
                        if (o != 27) {
                            obj2 = obj5;
                            if (o > 49) {
                                i11 = i11;
                                zzhaVar3 = zzhaVar4;
                                i77 = i77;
                                i8 = i35;
                                if (o != 50) {
                                    long j4 = iArr[n + 2] & 1048575;
                                    switch (o) {
                                        case 51:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 1) {
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(cga.g0(i26, bArr2))));
                                                i27 = i26 + 8;
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = i27;
                                                if (i31 != i26) {
                                                    i4 = i3;
                                                    i6 = i31;
                                                    i33 = i25;
                                                    break;
                                                } else {
                                                    bVar = this;
                                                    i30 = i2;
                                                    obj5 = obj2;
                                                    bm2Var11 = bm2Var2;
                                                    bArr10 = bArr2;
                                                    i36 = i9;
                                                    i32 = i10;
                                                    i34 = i7;
                                                    i35 = i8;
                                                    i33 = i25;
                                                    break;
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                        case 52:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 5) {
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(cga.X(i26, bArr2))));
                                                i27 = i26 + 4;
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = i27;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 0) {
                                                d0 = cga.d0(bArr2, i26, bm2Var2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(bm2Var2.b));
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = d0;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 0) {
                                                d0 = cga.b0(bArr2, i26, bm2Var2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(bm2Var2.c));
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = d0;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 1) {
                                                unsafe.putObject(obj2, j2, Long.valueOf(cga.g0(i26, bArr2)));
                                                i27 = i26 + 8;
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = i27;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 5) {
                                                unsafe.putObject(obj2, j2, Integer.valueOf(cga.X(i26, bArr2)));
                                                i27 = i26 + 4;
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = i27;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 58:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 0) {
                                                d0 = cga.d0(bArr2, i26, bm2Var2);
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(bm2Var2.b != 0));
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = d0;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 59:
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i9 = i11;
                                            if (i44 == 2) {
                                                int b05 = cga.b0(bArr2, i26, bm2Var2);
                                                int i78 = bm2Var2.c;
                                                if (i78 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    if ((i45 & 536870912) != 0) {
                                                        cno.a.getClass();
                                                        if (!u8f.q(b05, b05 + i78, bArr2)) {
                                                            throw zzfb.d();
                                                        }
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, b05, i78, zzfa.a));
                                                    b05 += i78;
                                                }
                                                unsafe.putInt(obj2, j4, i10);
                                                i31 = b05;
                                                if (i31 != i26) {
                                                }
                                            }
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                        case 60:
                                            zzhaVar = zzhaVar3;
                                            if (i44 == 2) {
                                                Object t = bVar.t(i10, n, obj2);
                                                int f0 = cga.f0(t, bVar.r(n), bArr, i77, i2, bm2Var);
                                                bArr2 = bArr;
                                                unsafe6.putObject(obj2, bVar.p(n) & 1048575, t);
                                                omo.f(i10, iArr[r9] & 1048575, obj2);
                                                bm2Var2 = bm2Var;
                                                i31 = f0;
                                                i26 = i77;
                                                i25 = n;
                                                i9 = i11;
                                                if (i31 != i26) {
                                                }
                                            } else {
                                                bArr2 = bArr;
                                                bm2Var2 = bm2Var;
                                                i26 = i77;
                                                i25 = n;
                                                i9 = i11;
                                                i31 = i26;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            bArr8 = bArr;
                                            bm2Var9 = bm2Var;
                                            i28 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            if (i44 == 2) {
                                                W2 = cga.W(bArr8, i28, bm2Var9);
                                                unsafe.putObject(obj2, j2, bm2Var9.d);
                                                unsafe.putInt(obj2, j4, i10);
                                                int i79 = i28;
                                                bArr2 = bArr8;
                                                i26 = i79;
                                                i31 = W2;
                                                bm2Var2 = bm2Var9;
                                                i25 = n;
                                                if (i31 != i26) {
                                                }
                                            } else {
                                                bArr2 = bArr8;
                                                i26 = i28;
                                                bm2Var2 = bm2Var9;
                                                i25 = n;
                                                i31 = i26;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr8 = bArr;
                                            bm2Var9 = bm2Var;
                                            i28 = i77;
                                            if (i44 == 0) {
                                                W2 = cga.b0(bArr8, i28, bm2Var9);
                                                int i80 = bm2Var9.c;
                                                zzey q2 = bVar.q(n);
                                                if (q2 == null || q2.zza()) {
                                                    zzhaVar = zzhaVar3;
                                                    i9 = i11;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i80));
                                                    unsafe.putInt(obj2, j4, i10);
                                                } else {
                                                    zzev zzevVar2 = (zzev) obj2;
                                                    zzha zzhaVar6 = zzevVar2.zzc;
                                                    zzhaVar = zzhaVar3;
                                                    if (zzhaVar6 == zzhaVar) {
                                                        zzhaVar6 = zzha.a();
                                                        zzevVar2.zzc = zzhaVar6;
                                                    }
                                                    i9 = i11;
                                                    zzhaVar6.b(i9, Long.valueOf(i80));
                                                }
                                                int i792 = i28;
                                                bArr2 = bArr8;
                                                i26 = i792;
                                                i31 = W2;
                                                bm2Var2 = bm2Var9;
                                                i25 = n;
                                                if (i31 != i26) {
                                                }
                                            } else {
                                                zzhaVar = zzhaVar3;
                                                bArr2 = bArr8;
                                                i26 = i28;
                                                bm2Var2 = bm2Var9;
                                                i25 = n;
                                                i9 = i11;
                                                i31 = i26;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        case 66:
                                            bArr9 = bArr;
                                            bm2Var10 = bm2Var;
                                            i29 = i77;
                                            if (i44 == 0) {
                                                b02 = cga.b0(bArr9, i29, bm2Var10);
                                                int i81 = bm2Var10.c;
                                                unsafe.putObject(obj2, j2, Integer.valueOf((i81 >>> 1) ^ (-(i81 & 1))));
                                                unsafe.putInt(obj2, j4, i10);
                                                int i82 = i29;
                                                bArr2 = bArr9;
                                                i26 = i82;
                                                i31 = b02;
                                                bm2Var2 = bm2Var10;
                                                i25 = n;
                                                zzhaVar = zzhaVar3;
                                                i9 = i11;
                                                if (i31 != i26) {
                                                }
                                            } else {
                                                bArr2 = bArr9;
                                                i26 = i29;
                                                bm2Var2 = bm2Var10;
                                                i25 = n;
                                                zzhaVar = zzhaVar3;
                                                i9 = i11;
                                                i31 = i26;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        case 67:
                                            bArr9 = bArr;
                                            bm2Var10 = bm2Var;
                                            i29 = i77;
                                            if (i44 == 0) {
                                                b02 = cga.d0(bArr9, i29, bm2Var10);
                                                i11 = i11;
                                                long j5 = bm2Var10.b;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j5 >>> 1) ^ (-(j5 & 1))));
                                                unsafe.putInt(obj2, j4, i10);
                                                int i822 = i29;
                                                bArr2 = bArr9;
                                                i26 = i822;
                                                i31 = b02;
                                                bm2Var2 = bm2Var10;
                                                i25 = n;
                                                zzhaVar = zzhaVar3;
                                                i9 = i11;
                                                if (i31 != i26) {
                                                }
                                            } else {
                                                bArr2 = bArr9;
                                                i26 = i29;
                                                bm2Var2 = bm2Var10;
                                                i25 = n;
                                                i9 = i11;
                                                zzhaVar = zzhaVar3;
                                                i31 = i26;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i44 == 3) {
                                                Object t2 = bVar.t(i10, n, obj2);
                                                int e0 = cga.e0(t2, bVar.r(n), bArr, i77, i2, (i11 & (-8)) | 4, bm2Var);
                                                unsafe6.putObject(obj2, bVar.p(n) & 1048575, t2);
                                                omo.f(i10, iArr[r9] & 1048575, obj2);
                                                bArr2 = bArr;
                                                i26 = i77;
                                                i31 = e0;
                                                bm2Var2 = bm2Var;
                                                i25 = n;
                                                i9 = i11;
                                                zzhaVar = zzhaVar3;
                                                if (i31 != i26) {
                                                }
                                            }
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            bm2Var2 = bm2Var;
                                            i25 = n;
                                            i26 = i77;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            i31 = i26;
                                            if (i31 != i26) {
                                            }
                                            break;
                                    }
                                } else if (i44 == 2) {
                                    int i83 = n / 3;
                                    Object obj8 = objArr[i83 + i83];
                                    Object object = unsafe.getObject(obj2, j2);
                                    if (!((zzfr) object).a) {
                                        zzfr g = zzfr.b.g();
                                        u9o.a(g, object);
                                        unsafe.putObject(obj2, j2, g);
                                    }
                                    throw null;
                                }
                            } else {
                                long j6 = i45;
                                zzez zzezVar = (zzez) unsafe.getObject(obj2, j2);
                                if (zzezVar.zzc()) {
                                    j = j6;
                                } else {
                                    int size = zzezVar.size();
                                    int i84 = size != 0 ? size + size : 10;
                                    j = j6;
                                    zzezVar = zzezVar.i(i84);
                                    unsafe.putObject(obj2, j2, zzezVar);
                                }
                                switch (o) {
                                    case 18:
                                    case 35:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 1) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                            i4 = i3;
                                            bArr2 = bArr6;
                                            i33 = n;
                                            bm2Var2 = bm2Var6;
                                            zzhaVar = zzhaVar3;
                                            i9 = i11;
                                            break;
                                        } else {
                                            i31 = i6;
                                            bArr10 = bArr6;
                                            i30 = i20;
                                            obj5 = obj2;
                                            i33 = n;
                                            bm2Var11 = bm2Var6;
                                            i32 = i10;
                                            i34 = i7;
                                            i35 = i8;
                                            i36 = i11;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 5) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 1) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 5) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        bm2Var6 = bm2Var;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        i21 = i77;
                                        i8 = i35;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 26:
                                        bArr6 = bArr;
                                        i20 = i2;
                                        int i85 = i11;
                                        i21 = i77;
                                        i8 = i35;
                                        zzez zzezVar2 = zzezVar;
                                        bm2Var6 = bm2Var;
                                        if (i44 == 2) {
                                            if ((j & 536870912) == 0) {
                                                i6 = cga.b0(bArr6, i21, bm2Var6);
                                                int i86 = bm2Var6.c;
                                                if (i86 < 0) {
                                                    throw zzfb.g();
                                                }
                                                if (i86 == 0) {
                                                    zzezVar2.add("");
                                                    zzhaVar3 = zzhaVar4;
                                                } else {
                                                    zzhaVar3 = zzhaVar4;
                                                    zzezVar2.add(new String(bArr6, i6, i86, zzfa.a));
                                                    i6 += i86;
                                                }
                                                while (i6 < i20) {
                                                    int b06 = cga.b0(bArr6, i6, bm2Var6);
                                                    if (i85 == bm2Var6.c) {
                                                        i6 = cga.b0(bArr6, b06, bm2Var6);
                                                        int i87 = bm2Var6.c;
                                                        if (i87 < 0) {
                                                            throw zzfb.g();
                                                        }
                                                        if (i87 == 0) {
                                                            zzezVar2.add("");
                                                        } else {
                                                            zzezVar2.add(new String(bArr6, i6, i87, zzfa.a));
                                                            i6 += i87;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzhaVar3 = zzhaVar4;
                                                i6 = cga.b0(bArr6, i21, bm2Var6);
                                                int i88 = bm2Var6.c;
                                                if (i88 < 0) {
                                                    throw zzfb.g();
                                                }
                                                if (i88 == 0) {
                                                    zzezVar2.add("");
                                                } else {
                                                    int i89 = i6 + i88;
                                                    cno.a.getClass();
                                                    if (!u8f.q(i6, i89, bArr6)) {
                                                        throw zzfb.d();
                                                    }
                                                    zzezVar2.add(new String(bArr6, i6, i88, zzfa.a));
                                                    i6 = i89;
                                                }
                                                while (i6 < i20) {
                                                    int b07 = cga.b0(bArr6, i6, bm2Var6);
                                                    if (i85 == bm2Var6.c) {
                                                        i6 = cga.b0(bArr6, b07, bm2Var6);
                                                        int i90 = bm2Var6.c;
                                                        if (i90 < 0) {
                                                            throw zzfb.g();
                                                        }
                                                        if (i90 == 0) {
                                                            zzezVar2.add("");
                                                        } else {
                                                            int i91 = i6 + i90;
                                                            cno.a.getClass();
                                                            if (!u8f.q(i6, i91, bArr6)) {
                                                                throw zzfb.d();
                                                            }
                                                            zzezVar2.add(new String(bArr6, i6, i90, zzfa.a));
                                                            i6 = i91;
                                                            i85 = i85;
                                                        }
                                                    }
                                                }
                                            }
                                            i11 = i85;
                                            if (i6 == i21) {
                                            }
                                        } else {
                                            i11 = i85;
                                            zzhaVar3 = zzhaVar4;
                                            i6 = i21;
                                            if (i6 == i21) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        if (i44 == 2) {
                                            int Z = cga.Z(bVar.r(n), i11, bArr, i77, i2, zzezVar, bm2Var);
                                            bArr6 = bArr;
                                            bm2Var6 = bm2Var;
                                            i20 = i2;
                                            i6 = Z;
                                            i11 = i11;
                                            i21 = i77;
                                            i8 = i35;
                                            zzhaVar3 = zzhaVar4;
                                            if (i6 == i21) {
                                            }
                                        } else {
                                            bm2Var6 = bm2Var;
                                            bArr6 = bArr;
                                            i20 = i2;
                                            i11 = i11;
                                            i21 = i77;
                                            zzhaVar3 = zzhaVar4;
                                            i8 = i35;
                                            i6 = i21;
                                            if (i6 == i21) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        bArr7 = bArr;
                                        i22 = i2;
                                        bm2Var7 = bm2Var;
                                        i23 = i77;
                                        if (i44 == 2) {
                                            int b08 = cga.b0(bArr7, i23, bm2Var7);
                                            int i92 = bm2Var7.c;
                                            if (i92 < 0) {
                                                throw zzfb.g();
                                            }
                                            if (i92 > bArr7.length - b08) {
                                                throw zzfb.h();
                                            }
                                            if (i92 == 0) {
                                                zzezVar.add(zzef.b);
                                            } else {
                                                zzezVar.add(zzef.s(b08, i92, bArr7));
                                                b08 += i92;
                                            }
                                            while (b08 < i22) {
                                                int b09 = cga.b0(bArr7, b08, bm2Var7);
                                                if (i11 == bm2Var7.c) {
                                                    b08 = cga.b0(bArr7, b09, bm2Var7);
                                                    int i93 = bm2Var7.c;
                                                    if (i93 < 0) {
                                                        throw zzfb.g();
                                                    }
                                                    if (i93 > bArr7.length - b08) {
                                                        throw zzfb.h();
                                                    }
                                                    if (i93 == 0) {
                                                        zzezVar.add(zzef.b);
                                                    } else {
                                                        zzezVar.add(zzef.s(b08, i93, bArr7));
                                                        b08 += i93;
                                                    }
                                                } else {
                                                    i6 = b08;
                                                    bm2Var6 = bm2Var7;
                                                    i21 = i23;
                                                    i11 = i11;
                                                    zzhaVar3 = zzhaVar4;
                                                    bArr6 = bArr7;
                                                    i20 = i22;
                                                    i8 = i35;
                                                    if (i6 == i21) {
                                                    }
                                                }
                                            }
                                            i6 = b08;
                                            bm2Var6 = bm2Var7;
                                            i21 = i23;
                                            i11 = i11;
                                            zzhaVar3 = zzhaVar4;
                                            bArr6 = bArr7;
                                            i20 = i22;
                                            i8 = i35;
                                            if (i6 == i21) {
                                            }
                                        }
                                        bm2Var6 = bm2Var7;
                                        i21 = i23;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        bArr6 = bArr7;
                                        i20 = i22;
                                        i8 = i35;
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        bArr7 = bArr;
                                        i22 = i2;
                                        bm2Var8 = bm2Var;
                                        i24 = i77;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        bm2Var6 = bm2Var8;
                                        i21 = i24;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        bArr6 = bArr7;
                                        i20 = i22;
                                        i8 = i35;
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr7 = bArr;
                                        i22 = i2;
                                        bm2Var8 = bm2Var;
                                        i24 = i77;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        bm2Var6 = bm2Var8;
                                        i21 = i24;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        bArr6 = bArr7;
                                        i20 = i22;
                                        i8 = i35;
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        bArr7 = bArr;
                                        i22 = i2;
                                        bm2Var7 = bm2Var;
                                        i23 = i77;
                                        if (i44 == 2) {
                                            pvd.j();
                                            return 0;
                                        }
                                        if (i44 == 0) {
                                            pvd.j();
                                            return 0;
                                        }
                                        bm2Var6 = bm2Var7;
                                        i21 = i23;
                                        i11 = i11;
                                        zzhaVar3 = zzhaVar4;
                                        bArr6 = bArr7;
                                        i20 = i22;
                                        i8 = i35;
                                        i6 = i21;
                                        if (i6 == i21) {
                                        }
                                        break;
                                    default:
                                        if (i44 == 3) {
                                            ido r = bVar.r(n);
                                            int i94 = (i11 & (-8)) | 4;
                                            int Y = cga.Y(r, bArr, i77, i2, i94, bm2Var);
                                            ido idoVar = r;
                                            int i95 = i94;
                                            i22 = i2;
                                            int i96 = i77;
                                            zzezVar.add(bm2Var.d);
                                            while (true) {
                                                if (Y < i22) {
                                                    int i97 = i95;
                                                    bArr7 = bArr;
                                                    int b010 = cga.b0(bArr7, Y, bm2Var);
                                                    if (i11 == bm2Var.c) {
                                                        ido idoVar2 = idoVar;
                                                        int Y2 = cga.Y(idoVar2, bArr7, b010, i2, i97, bm2Var);
                                                        i22 = i2;
                                                        idoVar = idoVar2;
                                                        zzezVar.add(bm2Var.d);
                                                        i95 = i97;
                                                        i96 = i96;
                                                        Y = Y2;
                                                    } else {
                                                        i22 = i2;
                                                    }
                                                } else {
                                                    bArr7 = bArr;
                                                }
                                            }
                                            bm2Var6 = bm2Var;
                                            i21 = i96;
                                            i11 = i11;
                                            zzhaVar3 = zzhaVar4;
                                            i6 = Y;
                                            bArr6 = bArr7;
                                            i20 = i22;
                                            i8 = i35;
                                            if (i6 == i21) {
                                            }
                                        } else {
                                            bArr6 = bArr;
                                            i20 = i2;
                                            bm2Var6 = bm2Var;
                                            i11 = i11;
                                            zzhaVar3 = zzhaVar4;
                                            i21 = i77;
                                            i8 = i35;
                                            i6 = i21;
                                            if (i6 == i21) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i44 == 2) {
                            zzez zzezVar3 = (zzez) unsafe.getObject(obj5, j2);
                            if (!zzezVar3.zzc()) {
                                int size2 = zzezVar3.size();
                                zzezVar3 = zzezVar3.i(size2 != 0 ? size2 + size2 : 10);
                                unsafe.putObject(obj5, j2, zzezVar3);
                            }
                            bArr10 = bArr;
                            i30 = i2;
                            i31 = cga.Z(bVar.r(n), i11, bArr10, i77, i30, zzezVar3, bm2Var);
                            i36 = i11;
                            bm2Var11 = bm2Var;
                            obj5 = obj5;
                            i33 = n;
                            i32 = i10;
                            i34 = i7;
                        } else {
                            obj2 = obj5;
                            zzhaVar3 = zzhaVar4;
                            i8 = i35;
                        }
                        bArr2 = bArr;
                        i4 = i3;
                        bm2Var2 = bm2Var;
                        i33 = n;
                        i6 = i77;
                        zzhaVar = zzhaVar3;
                        i9 = i11;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    zzev zzevVar3 = (zzev) obj2;
                    zzha zzhaVar7 = zzevVar3.zzc;
                    if (zzhaVar7 == zzhaVar) {
                        zzhaVar7 = zzha.a();
                        zzevVar3.zzc = zzhaVar7;
                    }
                    int i98 = i9;
                    bVar = this;
                    bm2Var11 = bm2Var;
                    i31 = cga.a0(i98, bArr2, i6, i2, zzhaVar7, bm2Var2);
                    i30 = i2;
                    obj5 = obj2;
                    i32 = i10;
                    i34 = i7;
                    i35 = i8;
                    i36 = i98;
                    bArr10 = bArr;
                } else {
                    i30 = i2;
                    i31 = i6;
                    i36 = i9;
                    i5 = i7;
                    i35 = i8;
                }
            } else {
                i4 = i3;
                int i99 = i34;
                iArr = iArr2;
                unsafe = unsafe5;
                objArr = objArr2;
                obj2 = obj5;
                i5 = i99;
            }
        }
    }

    public final int n(int i, int i2) {
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

    public final int p(int i) {
        return this.a[i + 1];
    }

    public final zzey q(int i) {
        int i2 = i / 3;
        return (zzey) this.b[i2 + i2 + 1];
    }

    public final ido r(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        ido idoVar = (ido) objArr[i3];
        if (idoVar != null) {
            return idoVar;
        }
        ido a = nco.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object s(int i, Object obj) {
        ido r = r(i);
        int p = p(i) & 1048575;
        if (!h(i, obj)) {
            return r.zzd();
        }
        Object object = l.getObject(obj, p);
        if (i(object)) {
            return object;
        }
        zzev zzd = r.zzd();
        if (object != null) {
            r.e(zzd, object);
        }
        return zzd;
    }

    public final Object t(int i, int i2, Object obj) {
        ido r = r(i2);
        if (!j(i, i2, obj)) {
            return r.zzd();
        }
        Object object = l.getObject(obj, p(i2) & 1048575);
        if (i(object)) {
            return object;
        }
        zzev zzd = r.zzd();
        if (object != null) {
            r.e(zzd, object);
        }
        return zzd;
    }

    public final void v(int i, Object obj, Object obj2) {
        if (h(i, obj2)) {
            long p = p(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, p);
            if (object == null) {
                hbo.h(this.a[i], obj2);
                return;
            }
            ido r = r(i);
            if (!h(i, obj)) {
                if (i(object)) {
                    zzev zzd = r.zzd();
                    r.e(zzd, object);
                    unsafe.putObject(obj, p, zzd);
                } else {
                    unsafe.putObject(obj, p, object);
                }
                x(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, p);
            if (!i(object2)) {
                zzev zzd2 = r.zzd();
                r.e(zzd2, object2);
                unsafe.putObject(obj, p, zzd2);
                object2 = zzd2;
            }
            r.e(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (j(i2, i, obj2)) {
            long p = p(i) & 1048575;
            Unsafe unsafe = l;
            Object object = unsafe.getObject(obj2, p);
            if (object == null) {
                hbo.h(iArr[i], obj2);
                return;
            }
            ido r = r(i);
            if (!j(i2, i, obj)) {
                if (i(object)) {
                    zzev zzd = r.zzd();
                    r.e(zzd, object);
                    unsafe.putObject(obj, p, zzd);
                } else {
                    unsafe.putObject(obj, p, object);
                }
                omo.f(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, p);
            if (!i(object2)) {
                zzev zzd2 = r.zzd();
                r.e(zzd2, object2);
                unsafe.putObject(obj, p, zzd2);
                object2 = zzd2;
            }
            r.e(object2, object);
        }
    }

    public final void x(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        omo.f((1 << (i2 >>> 20)) | omo.a(obj, j), j, obj);
    }

    @Override // defpackage.ido
    public final zzev zzd() {
        return (zzev) ((zzev) this.e).g(4);
    }
}
