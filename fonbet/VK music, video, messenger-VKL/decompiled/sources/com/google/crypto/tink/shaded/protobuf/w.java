package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Writer;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.q;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import sun.misc.Unsafe;
import xsna.dl00;
import xsna.fb20;
import xsna.il00;
import xsna.ka20;
import xsna.kye0;
import xsna.o760;
import xsna.shy;
import xsna.t33;
import xsna.t8e0;
import xsna.u5q0;
import xsna.v7f0;
import xsna.x9;
import xsna.z920;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class w<T> implements a0<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = u5q0.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ka20 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final o760 l;
    public final t m;
    public final e0<?, ?> n;
    public final l<?> o;
    public final il00 p;

    public w(int[] iArr, Object[] objArr, int i, int i2, ka20 ka20Var, boolean z, int[] iArr2, int i3, int i4, o760 o760Var, t tVar, e0 e0Var, l lVar, il00 il00Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = ka20Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = lVar != null && lVar.e(ka20Var);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = o760Var;
        this.m = tVar;
        this.n = e0Var;
        this.o = lVar;
        this.e = ka20Var;
        this.p = il00Var;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) u5q0.d.i(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) u5q0.d.i(j, obj)).longValue();
    }

    public static Field J(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder a = t33.a("Field ", str, " for ");
            a.append(cls.getName());
            a.append(" not found. Known fields are ");
            a.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a.toString());
        }
    }

    public static int N(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void R(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            ((i) writer).a.D(i, (String) obj);
        } else {
            ((i) writer).b(i, (ByteString) obj);
        }
    }

    public static f0 p(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        f0 f0Var = generatedMessageLite.unknownFields;
        if (f0Var != f0.f) {
            return f0Var;
        }
        f0 f0Var2 = new f0();
        generatedMessageLite.unknownFields = f0Var2;
        return f0Var2;
    }

    public static List u(long j, Object obj) {
        return (List) u5q0.d.i(j, obj);
    }

    public static w y(z920 z920Var, o760 o760Var, t tVar, e0 e0Var, l lVar, il00 il00Var) {
        if (z920Var instanceof kye0) {
            return z((kye0) z920Var, o760Var, tVar, e0Var, lVar, il00Var);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> w<T> z(kye0 kye0Var, o760 o760Var, t tVar, e0<?, ?> e0Var, l<?> lVar, il00 il00Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        Object[] objArr;
        int i15;
        int i16;
        int i17;
        boolean z;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field J;
        int i25;
        char charAt11;
        int i26;
        int i27;
        Field J2;
        Field J3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        int i31;
        char charAt14;
        Object[] objArr2;
        int i32;
        char charAt15;
        char charAt16;
        int i33 = 0;
        boolean z2 = kye0Var.getSyntax() == ProtoSyntax.PROTO3;
        String str = kye0Var.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i34 = charAt17 & 8191;
            int i35 = 1;
            int i36 = 13;
            while (true) {
                i = i35 + 1;
                charAt16 = str.charAt(i35);
                if (charAt16 < 55296) {
                    break;
                }
                i34 |= (charAt16 & 8191) << i36;
                i36 += 13;
                i35 = i;
            }
            charAt17 = i34 | (charAt16 << i36);
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int charAt18 = str.charAt(i);
        if (charAt18 >= 55296) {
            int i38 = charAt18 & 8191;
            int i39 = 13;
            while (true) {
                i32 = i37 + 1;
                charAt15 = str.charAt(i37);
                if (charAt15 < 55296) {
                    break;
                }
                i38 |= (charAt15 & 8191) << i39;
                i39 += 13;
                i37 = i32;
            }
            charAt18 = i38 | (charAt15 << i39);
            i37 = i32;
        }
        if (charAt18 == 0) {
            i5 = 0;
            charAt = 0;
            i6 = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = q;
            i4 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt19 = str.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt10 = str.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt19 = i41 | (charAt10 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt20 = str.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt9 = str.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt20 = i44 | (charAt9 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            charAt = str.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt = i47 | (charAt8 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            int charAt21 = str.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt21 = i50 | (charAt7 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt22 = str.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt22 = i53 | (charAt6 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            charAt2 = str.charAt(i52);
            if (charAt2 >= 55296) {
                int i56 = charAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt2 = i56 | (charAt5 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt23 = str.charAt(i55);
            if (charAt23 >= 55296) {
                int i59 = charAt23 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i60 = i8;
                }
                charAt23 = i59 | (charAt4 << i61);
                i2 = i8;
            } else {
                i2 = i58;
            }
            int i62 = i2 + 1;
            int charAt24 = str.charAt(i2);
            if (charAt24 >= 55296) {
                int i63 = charAt24 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i7 = i64 + 1;
                    charAt3 = str.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i64 = i7;
                }
                charAt24 = i63 | (charAt3 << i65);
                i62 = i7;
            }
            int[] iArr2 = new int[charAt24 + charAt2 + charAt23];
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt21;
            iArr = iArr2;
            i5 = charAt22;
            i6 = charAt24;
            i33 = charAt19;
            i37 = i62;
        }
        Unsafe unsafe = r;
        Object[] objArr3 = kye0Var.c;
        int i66 = i33;
        Class<?> cls = kye0Var.a.getClass();
        int i67 = charAt17;
        int[] iArr3 = new int[i5 * 3];
        Object[] objArr4 = new Object[i5 * 2];
        int i68 = charAt2 + i6;
        int i69 = i6;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i37 < length) {
            int i73 = i37 + 1;
            int charAt25 = str.charAt(i37);
            int i74 = length;
            if (charAt25 >= 55296) {
                int i75 = charAt25 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt14 = str.charAt(i76);
                    objArr2 = objArr4;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                    objArr4 = objArr2;
                }
                charAt25 = i75 | (charAt14 << i77);
                i15 = i31;
                objArr = objArr2;
            } else {
                objArr = objArr4;
                i15 = i73;
            }
            int i78 = i15 + 1;
            int charAt26 = str.charAt(i15);
            if (charAt26 >= 55296) {
                int i79 = charAt26 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i29 = i80 + 1;
                    charAt13 = str.charAt(i80);
                    i30 = i79;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i79 = i30 | ((charAt13 & 8191) << i81);
                    i81 += 13;
                    i80 = i29;
                }
                charAt26 = i30 | (charAt13 << i81);
                i16 = i29;
            } else {
                i16 = i78;
            }
            Object[] objArr5 = objArr3;
            int i82 = charAt26 & 255;
            int i83 = charAt25;
            if ((charAt26 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            int i84 = i4;
            if (i82 >= 51) {
                int i85 = i16 + 1;
                int charAt27 = str.charAt(i16);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i86 = charAt27 & 8191;
                    int i87 = 13;
                    while (true) {
                        i28 = i85 + 1;
                        charAt12 = str.charAt(i85);
                        if (charAt12 < c) {
                            break;
                        }
                        i86 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i85 = i28;
                        c = 55296;
                    }
                    charAt27 = i86 | (charAt12 << i87);
                    i85 = i28;
                }
                int i88 = i82 - 51;
                int i89 = charAt27;
                if (i88 == 9 || i88 == 17) {
                    i27 = i85;
                    objArr[fb20.a(i71, 3, 2, 1)] = objArr5[i3];
                    i3++;
                } else if (i88 == 12) {
                    i27 = i85;
                    if ((i67 & 1) == 1) {
                        objArr[fb20.a(i71, 3, 2, 1)] = objArr5[i3];
                        i3++;
                    }
                } else {
                    i27 = i85;
                }
                int i90 = i89 * 2;
                Object obj = objArr5[i90];
                if (obj instanceof Field) {
                    J2 = (Field) obj;
                } else {
                    J2 = J(cls, (String) obj);
                    objArr5[i90] = J2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(J2);
                int i91 = i90 + 1;
                Object obj2 = objArr5[i91];
                if (obj2 instanceof Field) {
                    J3 = (Field) obj2;
                } else {
                    J3 = J(cls, (String) obj2);
                    objArr5[i91] = J3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(J3);
                int i92 = i27;
                i17 = charAt;
                i20 = i92;
                z = z2;
                i23 = i3;
                i19 = i71;
                i21 = objectFieldOffset3;
                i24 = objectFieldOffset2;
                i22 = 0;
            } else {
                int i93 = i3 + 1;
                Field J4 = J(cls, (String) objArr5[i3]);
                if (i82 == 9 || i82 == 17) {
                    i17 = charAt;
                    z = z2;
                    objArr[fb20.a(i71, 3, 2, 1)] = J4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i17 = charAt;
                        z = z2;
                        i26 = i3 + 2;
                        objArr[fb20.a(i71, 3, 2, 1)] = objArr5[i93];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i17 = charAt;
                        z = z2;
                        if ((i67 & 1) == 1) {
                            i26 = i3 + 2;
                            objArr[fb20.a(i71, 3, 2, 1)] = objArr5[i93];
                        }
                    } else if (i82 == 50) {
                        int i94 = i69 + 1;
                        iArr[i69] = i71;
                        int i95 = (i71 / 3) * 2;
                        int i96 = i3 + 2;
                        objArr[i95] = objArr5[i93];
                        if ((charAt26 & 2048) != 0) {
                            i18 = i3 + 3;
                            objArr[i95 + 1] = objArr5[i96];
                            i17 = charAt;
                            z = z2;
                            i69 = i94;
                        } else {
                            z = z2;
                            i18 = i96;
                            i69 = i94;
                            i17 = charAt;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                        if ((i67 & 1) == 1 || i82 > 17) {
                            i19 = i71;
                            i20 = i16;
                            i21 = 0;
                            i22 = 0;
                        } else {
                            i20 = i16 + 1;
                            int charAt28 = str.charAt(i16);
                            if (charAt28 >= 55296) {
                                int i97 = charAt28 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i25 = i20 + 1;
                                    charAt11 = str.charAt(i20);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt11 & 8191) << i98;
                                    i98 += 13;
                                    i20 = i25;
                                }
                                charAt28 = i97 | (charAt11 << i98);
                                i20 = i25;
                            }
                            int i99 = (charAt28 / 32) + (i66 * 2);
                            Object obj3 = objArr5[i99];
                            if (obj3 instanceof Field) {
                                J = (Field) obj3;
                            } else {
                                J = J(cls, (String) obj3);
                                objArr5[i99] = J;
                            }
                            i19 = i71;
                            int i100 = charAt28;
                            i21 = (int) unsafe.objectFieldOffset(J);
                            i22 = i100 % 32;
                        }
                        if (i82 >= 18 || i82 > 49) {
                            i23 = i18;
                            i24 = objectFieldOffset;
                        } else {
                            iArr[i70] = objectFieldOffset;
                            i23 = i18;
                            i24 = objectFieldOffset;
                            i70++;
                        }
                    } else {
                        i17 = charAt;
                        z = z2;
                    }
                    i18 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                    if ((i67 & 1) == 1) {
                    }
                    i19 = i71;
                    i20 = i16;
                    i21 = 0;
                    i22 = 0;
                    if (i82 >= 18) {
                    }
                    i23 = i18;
                    i24 = objectFieldOffset;
                }
                i18 = i93;
                objectFieldOffset = (int) unsafe.objectFieldOffset(J4);
                if ((i67 & 1) == 1) {
                }
                i19 = i71;
                i20 = i16;
                i21 = 0;
                i22 = 0;
                if (i82 >= 18) {
                }
                i23 = i18;
                i24 = objectFieldOffset;
            }
            int i101 = i19 + 1;
            iArr3[i19] = i83;
            int i102 = i19 + 2;
            String str2 = str;
            iArr3[i101] = ((charAt26 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt26 & 256) != 0 ? 268435456 : 0) | (i82 << 20) | i24;
            iArr3[i102] = (i22 << 20) | i21;
            i71 = i19 + 3;
            i3 = i23;
            i37 = i20;
            z2 = z;
            objArr3 = objArr5;
            length = i74;
            objArr4 = objArr;
            charAt = i17;
            str = str2;
            i4 = i84;
        }
        return new w<>(iArr3, objArr4, charAt, i4, kye0Var.a, z2, iArr, i6, i68, o760Var, tVar, e0Var, lVar, il00Var);
    }

    public final void D(Object obj, byte[] bArr, int i, int i2, int i3, long j, d.a aVar) throws IOException {
        Unsafe unsafe = r;
        Object n = n(i3);
        Object object = unsafe.getObject(obj, j);
        il00 il00Var = this.p;
        if (il00Var.h(object)) {
            MapFieldLite f = il00Var.f();
            il00Var.a(f, object);
            unsafe.putObject(obj, j, f);
            object = f;
        }
        il00Var.b(n);
        il00Var.d(object);
        int k = d.k(bArr, i, aVar);
        int i4 = aVar.a;
        if (i4 >= 0 && i4 <= i2 - k) {
            throw null;
        }
        throw InvalidProtocolBufferException.l();
    }

    public final int E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d.a aVar) throws IOException {
        Object object;
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(d.c(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(d.b(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int m = d.m(bArr, i, aVar);
                unsafe.putObject(t, j, Long.valueOf(aVar.b));
                unsafe.putInt(t, j2, i4);
                return m;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int k = d.k(bArr, i, aVar);
                unsafe.putObject(t, j, Integer.valueOf(aVar.a));
                unsafe.putInt(t, j2, i4);
                return k;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(d.c(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(d.b(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int m2 = d.m(bArr, i, aVar);
                unsafe.putObject(t, j, Boolean.valueOf(aVar.b != 0));
                unsafe.putInt(t, j2, i4);
                return m2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int k2 = d.k(bArr, i, aVar);
                int i13 = aVar.a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                        if (!h0.a.c(k2, k2 + i13, bArr)) {
                            throw InvalidProtocolBufferException.d();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, k2, i13, q.a));
                    k2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return k2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int e = d.e(o(i8), bArr, i, i2, aVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, aVar.c);
                } else {
                    unsafe.putObject(t, j, q.c(object, aVar.c));
                }
                unsafe.putInt(t, j2, i4);
                return e;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int a = d.a(bArr, i, aVar);
                unsafe.putObject(t, j, aVar.c);
                unsafe.putInt(t, j2, i4);
                return a;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int k3 = d.k(bArr, i, aVar);
                int i14 = aVar.a;
                q.c m3 = m(i8);
                if (m3 != null && !m3.a()) {
                    p(t).b(i3, Long.valueOf(i14));
                    return k3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return k3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int k4 = d.k(bArr, i, aVar);
                unsafe.putObject(t, j, Integer.valueOf(g.b(aVar.a)));
                unsafe.putInt(t, j2, i4);
                return k4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int m4 = d.m(bArr, i, aVar);
                unsafe.putObject(t, j, Long.valueOf(g.c(aVar.b)));
                unsafe.putInt(t, j2, i4);
                return m4;
            case 68:
                if (i5 == 3) {
                    int d = d.d(o(i8), bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, aVar.c);
                    } else {
                        unsafe.putObject(t, j, q.c(object, aVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return d;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x04d9, code lost:
    
        if (r8 == r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x04db, code lost:
    
        r24.putInt(r10, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04e1, code lost:
    
        r0 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04e5, code lost:
    
        if (r0 >= r9.k) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04e7, code lost:
    
        r9.l(r10, r9.i[r0], r16, r9.n);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04f5, code lost:
    
        if (r11 != 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04f7, code lost:
    
        if (r3 != r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04fe, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0503, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04ff, code lost:
    
        if (r3 > r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0501, code lost:
    
        if (r14 != r11) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0508, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(T t, byte[] bArr, int i, int i2, int i3, d.a aVar) throws IOException {
        int i4;
        w<T> wVar;
        Unsafe unsafe;
        int i5;
        Throwable th;
        T t2;
        int i6;
        int i7;
        k kVar;
        int i8;
        int i9;
        k kVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        int i14;
        int i15;
        d.a aVar2;
        int i16;
        Unsafe unsafe3;
        byte[] bArr2;
        d.a aVar3;
        int k;
        int i17;
        byte[] bArr3;
        int i18;
        d.a aVar4;
        int i19;
        int i20;
        T t3;
        Unsafe unsafe4;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        w<T> wVar2 = this;
        T t4 = t;
        byte[] bArr4 = bArr;
        int i27 = i2;
        d.a aVar5 = aVar;
        k kVar3 = aVar5.d;
        Unsafe unsafe5 = r;
        int i28 = i;
        int i29 = -1;
        int i30 = 0;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            if (i28 < i27) {
                int i34 = i28 + 1;
                int i35 = bArr4[i28];
                if (i35 < 0) {
                    i34 = d.j(i35, bArr4, i34, aVar5);
                    i35 = aVar5.a;
                }
                int i36 = i34;
                int i37 = i35;
                int i38 = i37 >>> 3;
                int i39 = i30;
                int i40 = i37 & 7;
                int i41 = wVar2.d;
                int i42 = wVar2.c;
                if (i38 > i29) {
                    i7 = (i38 < i42 || i38 > i41) ? -1 : wVar2.M(i38, i39 / 3);
                    i6 = 0;
                } else if (i38 < i42 || i38 > i41) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = wVar2.M(i38, 0);
                }
                if (i7 == -1) {
                    i5 = -1;
                    kVar = kVar3;
                    unsafe = unsafe5;
                    i29 = i38;
                    i30 = i6;
                    i8 = i37;
                    th = null;
                    i4 = i3;
                    wVar = wVar2;
                    t2 = t4;
                    i9 = i36;
                } else {
                    int[] iArr = wVar2.a;
                    int i43 = iArr[i7 + 1];
                    int N = N(i43);
                    long j = i43 & 1048575;
                    if (N <= 17) {
                        int i44 = iArr[i7 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        kVar = kVar3;
                        if (i46 != i31) {
                            if (i31 != -1) {
                                unsafe5.putInt(t4, i31, i32);
                            }
                            i13 = i46;
                            i12 = unsafe5.getInt(t4, i46);
                        } else {
                            i12 = i32;
                            i13 = i31;
                        }
                        switch (N) {
                            case 0:
                                unsafe2 = unsafe5;
                                i14 = i36;
                                i15 = i37;
                                aVar2 = aVar;
                                i16 = i7;
                                if (i40 != 1) {
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    u5q0.d.m(t4, j, Double.longBitsToDouble(d.c(i14, bArr)));
                                    i28 = i14 + 8;
                                    t4 = t4;
                                    bArr4 = bArr;
                                    i31 = i13;
                                    i32 = i12 | i45;
                                    i27 = i2;
                                    i30 = i16;
                                    unsafe5 = unsafe2;
                                    aVar5 = aVar2;
                                    i33 = i15;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    break;
                                }
                            case 1:
                                unsafe2 = unsafe5;
                                i14 = i36;
                                i15 = i37;
                                aVar2 = aVar;
                                i16 = i7;
                                if (i40 != 5) {
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    u5q0.d.n(t4, j, Float.intBitsToFloat(d.b(i14, bArr)));
                                    i28 = i14 + 4;
                                    int i47 = i13;
                                    i32 = i12 | i45;
                                    bArr4 = bArr;
                                    i31 = i47;
                                    i27 = i2;
                                    i30 = i16;
                                    unsafe5 = unsafe2;
                                    aVar5 = aVar2;
                                    i33 = i15;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    break;
                                }
                            case 2:
                            case 3:
                                Unsafe unsafe6 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe6;
                                i14 = i36;
                                i15 = i37;
                                aVar2 = aVar;
                                if (i40 != 0) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    int m = d.m(bArr, i14, aVar2);
                                    unsafe3.putLong(t4, j, aVar2.b);
                                    unsafe2 = unsafe3;
                                    int i48 = i13;
                                    i32 = i12 | i45;
                                    bArr4 = bArr;
                                    i31 = i48;
                                    i27 = i2;
                                    i28 = m;
                                    i30 = i16;
                                    unsafe5 = unsafe2;
                                    aVar5 = aVar2;
                                    i33 = i15;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    break;
                                }
                            case 4:
                            case 11:
                                Unsafe unsafe7 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe7;
                                bArr2 = bArr;
                                i14 = i36;
                                i15 = i37;
                                aVar3 = aVar;
                                if (i40 != 0) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = d.k(bArr2, i14, aVar3);
                                    unsafe3.putInt(t4, j, aVar3.a);
                                    i17 = i12 | i45;
                                    i27 = i2;
                                    i30 = i16;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr2;
                                    i31 = i13;
                                    i32 = i17;
                                    i28 = k;
                                    aVar5 = aVar3;
                                    i33 = i15;
                                    break;
                                }
                            case 5:
                            case 14:
                                Unsafe unsafe8 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe8;
                                bArr3 = bArr;
                                i18 = i45;
                                i15 = i37;
                                aVar4 = aVar;
                                if (i40 != 1) {
                                    i14 = i36;
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    unsafe3.putLong(t4, j, d.c(i36, bArr3));
                                    i28 = i36 + 8;
                                    int i49 = i12 | i18;
                                    i30 = i16;
                                    aVar5 = aVar4;
                                    i33 = i15;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr3;
                                    i31 = i13;
                                    i32 = i49;
                                    i27 = i2;
                                    break;
                                }
                            case 6:
                            case 13:
                                Unsafe unsafe9 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe9;
                                bArr3 = bArr;
                                i18 = i45;
                                i19 = i36;
                                i15 = i37;
                                aVar4 = aVar;
                                if (i40 != 5) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    unsafe3.putInt(t4, j, d.b(i19, bArr3));
                                    i28 = i19 + 4;
                                    int i492 = i12 | i18;
                                    i30 = i16;
                                    aVar5 = aVar4;
                                    i33 = i15;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr3;
                                    i31 = i13;
                                    i32 = i492;
                                    i27 = i2;
                                    break;
                                }
                            case 7:
                                Unsafe unsafe10 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe10;
                                bArr2 = bArr;
                                i20 = i2;
                                i19 = i36;
                                i15 = i37;
                                aVar3 = aVar;
                                if (i40 != 0) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = d.m(bArr2, i19, aVar3);
                                    u5q0.d.k(j, t4, aVar3.b != 0);
                                    i17 = i12 | i45;
                                    i30 = i16;
                                    i27 = i20;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr2;
                                    i31 = i13;
                                    i32 = i17;
                                    i28 = k;
                                    aVar5 = aVar3;
                                    i33 = i15;
                                    break;
                                }
                            case 8:
                                Unsafe unsafe11 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe11;
                                bArr2 = bArr;
                                i20 = i2;
                                i19 = i36;
                                i15 = i37;
                                aVar3 = aVar;
                                if (i40 != 2) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = (i43 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 ? d.g(bArr2, i19, aVar3) : d.h(bArr2, i19, aVar3);
                                    unsafe3.putObject(t4, j, aVar3.c);
                                    i17 = i12 | i45;
                                    i30 = i16;
                                    i27 = i20;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr2;
                                    i31 = i13;
                                    i32 = i17;
                                    i28 = k;
                                    aVar5 = aVar3;
                                    i33 = i15;
                                    break;
                                }
                            case 9:
                                Unsafe unsafe12 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe12;
                                bArr2 = bArr;
                                i20 = i2;
                                i19 = i36;
                                i15 = i37;
                                aVar3 = aVar;
                                if (i40 != 2) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = d.e(wVar2.o(i16), bArr2, i19, i20, aVar3);
                                    if ((i12 & i45) == 0) {
                                        unsafe3.putObject(t4, j, aVar3.c);
                                    } else {
                                        unsafe3.putObject(t4, j, q.c(unsafe3.getObject(t4, j), aVar3.c));
                                    }
                                    i17 = i12 | i45;
                                    i30 = i16;
                                    i27 = i20;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr2;
                                    i31 = i13;
                                    i32 = i17;
                                    i28 = k;
                                    aVar5 = aVar3;
                                    i33 = i15;
                                    break;
                                }
                            case 10:
                                Unsafe unsafe13 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe13;
                                bArr2 = bArr;
                                i20 = i2;
                                i19 = i36;
                                i15 = i37;
                                aVar3 = aVar;
                                if (i40 != 2) {
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = d.a(bArr2, i19, aVar3);
                                    unsafe3.putObject(t4, j, aVar3.c);
                                    i17 = i12 | i45;
                                    i30 = i16;
                                    i27 = i20;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe3;
                                    bArr4 = bArr2;
                                    i31 = i13;
                                    i32 = i17;
                                    i28 = k;
                                    aVar5 = aVar3;
                                    i33 = i15;
                                    break;
                                }
                            case 12:
                                Unsafe unsafe14 = unsafe5;
                                i16 = i7;
                                unsafe3 = unsafe14;
                                bArr2 = bArr;
                                i20 = i2;
                                i19 = i36;
                                aVar3 = aVar;
                                if (i40 != 0) {
                                    i15 = i37;
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i14 = i19;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    k = d.k(bArr2, i19, aVar3);
                                    int i50 = aVar3.a;
                                    q.c m2 = wVar2.m(i16);
                                    if (m2 != null && !m2.a()) {
                                        p(t4).b(i37, Long.valueOf(i50));
                                        i28 = k;
                                        i30 = i16;
                                        i27 = i20;
                                        aVar5 = aVar3;
                                        i33 = i37;
                                        i29 = i38;
                                        kVar3 = kVar;
                                        unsafe5 = unsafe3;
                                        bArr4 = bArr2;
                                        i31 = i13;
                                        i32 = i12;
                                        break;
                                    } else {
                                        i15 = i37;
                                        unsafe3.putInt(t4, j, i50);
                                        i17 = i12 | i45;
                                        i30 = i16;
                                        i27 = i20;
                                        i29 = i38;
                                        kVar3 = kVar;
                                        unsafe5 = unsafe3;
                                        bArr4 = bArr2;
                                        i31 = i13;
                                        i32 = i17;
                                        i28 = k;
                                        aVar5 = aVar3;
                                        i33 = i15;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                Unsafe unsafe15 = unsafe5;
                                i16 = i7;
                                unsafe4 = unsafe15;
                                i21 = i36;
                                if (i40 != 0) {
                                    unsafe2 = unsafe4;
                                    t3 = t4;
                                    i14 = i21;
                                    i15 = i37;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    int k2 = d.k(bArr, i21, aVar);
                                    unsafe4.putInt(t4, j, g.b(aVar.a));
                                    i30 = i16;
                                    i27 = i2;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    unsafe5 = unsafe4;
                                    bArr4 = bArr;
                                    i31 = i13;
                                    i32 = i12 | i45;
                                    i28 = k2;
                                    aVar5 = aVar;
                                    i33 = i37;
                                    break;
                                }
                            case 16:
                                i21 = i36;
                                if (i40 != 0) {
                                    Unsafe unsafe16 = unsafe5;
                                    i16 = i7;
                                    unsafe4 = unsafe16;
                                    unsafe2 = unsafe4;
                                    t3 = t4;
                                    i14 = i21;
                                    i15 = i37;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    int m3 = d.m(bArr, i21, aVar);
                                    Unsafe unsafe17 = unsafe5;
                                    int i51 = i7;
                                    unsafe17.putLong(t4, j, g.c(aVar.b));
                                    unsafe5 = unsafe17;
                                    bArr4 = bArr;
                                    i31 = i13;
                                    i32 = i12 | i45;
                                    i28 = m3;
                                    i30 = i51;
                                    i27 = i2;
                                    aVar5 = aVar;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    i33 = i37;
                                    break;
                                }
                            case 17:
                                if (i40 != 3) {
                                    unsafe2 = unsafe5;
                                    i14 = i36;
                                    i15 = i37;
                                    i16 = i7;
                                    t3 = t4;
                                    wVar = wVar2;
                                    i30 = i16;
                                    unsafe = unsafe2;
                                    i9 = i14;
                                    i31 = i13;
                                    i8 = i15;
                                    i29 = i38;
                                    i32 = i12;
                                    i5 = -1;
                                    th = null;
                                    i4 = i3;
                                    t2 = t3;
                                    break;
                                } else {
                                    i28 = d.d(wVar2.o(i7), bArr, i36, i2, (i38 << 3) | 4, aVar);
                                    if ((i12 & i45) == 0) {
                                        unsafe5.putObject(t4, j, aVar.c);
                                    } else {
                                        unsafe5.putObject(t4, j, q.c(unsafe5.getObject(t4, j), aVar.c));
                                    }
                                    i30 = i7;
                                    bArr4 = bArr;
                                    i31 = i13;
                                    i29 = i38;
                                    kVar3 = kVar;
                                    i33 = i37;
                                    i32 = i12 | i45;
                                    aVar5 = aVar;
                                    i27 = i2;
                                    break;
                                }
                            default:
                                unsafe2 = unsafe5;
                                i14 = i36;
                                i15 = i37;
                                i16 = i7;
                                t3 = t4;
                                wVar = wVar2;
                                i30 = i16;
                                unsafe = unsafe2;
                                i9 = i14;
                                i31 = i13;
                                i8 = i15;
                                i29 = i38;
                                i32 = i12;
                                i5 = -1;
                                th = null;
                                i4 = i3;
                                t2 = t3;
                                break;
                        }
                    } else {
                        kVar = kVar3;
                        Unsafe unsafe18 = unsafe5;
                        int i52 = i7;
                        T t5 = t4;
                        d.a aVar6 = aVar5;
                        if (N == 27) {
                            if (i40 == 2) {
                                q.d dVar = (q.d) unsafe18.getObject(t5, j);
                                if (!dVar.isModifiable()) {
                                    int size = dVar.size();
                                    dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                    unsafe18.putObject(t5, j, dVar);
                                }
                                int f = d.f(wVar2.o(i52), i37, bArr, i36, i2, dVar, aVar6);
                                t4 = t;
                                i27 = i2;
                                i28 = f;
                                i33 = i37;
                                i30 = i52;
                                i29 = i38;
                                bArr4 = bArr;
                                aVar5 = aVar;
                                unsafe5 = unsafe18;
                                kVar3 = kVar;
                            } else {
                                i22 = i31;
                                unsafe = unsafe18;
                                i23 = i52;
                                i24 = i36;
                                i25 = i32;
                                i26 = i37;
                                i5 = -1;
                                th = null;
                            }
                        } else if (N <= 49) {
                            int i53 = i31;
                            i23 = i52;
                            unsafe = unsafe18;
                            i22 = i53;
                            i25 = i32;
                            i5 = -1;
                            th = null;
                            int H = wVar2.H(t, bArr, i36, i2, i37, i38, i40, i23, i43, N, j, aVar);
                            i26 = i37;
                            if (H != i36) {
                                wVar2 = this;
                                t4 = t;
                                bArr4 = bArr;
                                i27 = i2;
                                aVar5 = aVar;
                                i28 = H;
                                i30 = i23;
                                i29 = i38;
                                kVar3 = kVar;
                                i33 = i26;
                                i32 = i25;
                                unsafe5 = unsafe;
                                i31 = i22;
                            } else {
                                wVar = this;
                                t2 = t;
                                i4 = i3;
                                i9 = H;
                                i30 = i23;
                                i29 = i38;
                                i8 = i26;
                                i32 = i25;
                                i31 = i22;
                            }
                        } else {
                            i26 = i37;
                            i22 = i31;
                            unsafe = unsafe18;
                            i23 = i52;
                            i25 = i32;
                            i5 = -1;
                            th = null;
                            i24 = i36;
                            if (N != 50) {
                                i8 = i26;
                                i29 = i38;
                                int E = E(t, bArr, i24, i2, i8, i29, i40, i43, N, j, i23, aVar);
                                wVar = this;
                                t2 = t;
                                if (E != i24) {
                                    bArr4 = bArr;
                                    i27 = i2;
                                    i33 = i8;
                                    i28 = E;
                                    i30 = i23;
                                    wVar2 = wVar;
                                    t4 = t2;
                                    kVar3 = kVar;
                                    i32 = i25;
                                    unsafe5 = unsafe;
                                    i31 = i22;
                                    aVar5 = aVar;
                                } else {
                                    i4 = i3;
                                    i9 = E;
                                    i30 = i23;
                                    i32 = i25;
                                    i31 = i22;
                                }
                            } else if (i40 == 2) {
                                D(t, bArr, i24, i2, i23, j, aVar);
                                throw null;
                            }
                        }
                        wVar = this;
                        t2 = t;
                        i4 = i3;
                        i9 = i24;
                        i30 = i23;
                        i29 = i38;
                        i8 = i26;
                        i32 = i25;
                        i31 = i22;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (wVar.f) {
                        kVar2 = kVar;
                        if (kVar2 != k.a()) {
                            if (kVar2.a.get(new k.a(i29, wVar.e)) != null) {
                                ((GeneratedMessageLite.c) t2).p();
                                throw th;
                            }
                            i10 = i8;
                            i11 = d.i(i10, bArr, i9, i2, p(t2), aVar);
                            i27 = i2;
                            i28 = i11;
                            bArr4 = bArr;
                            i33 = i10;
                            wVar2 = wVar;
                            t4 = t2;
                            kVar3 = kVar2;
                            unsafe5 = unsafe;
                            aVar5 = aVar;
                        }
                    } else {
                        kVar2 = kVar;
                    }
                    i10 = i8;
                    i11 = d.i(i10, bArr, i9, i2, p(t2), aVar);
                    i27 = i2;
                    i28 = i11;
                    bArr4 = bArr;
                    i33 = i10;
                    wVar2 = wVar;
                    t4 = t2;
                    kVar3 = kVar2;
                    unsafe5 = unsafe;
                    aVar5 = aVar;
                } else {
                    i27 = i2;
                    i28 = i9;
                    i33 = i8;
                }
            } else {
                i4 = i3;
                wVar = wVar2;
                unsafe = unsafe5;
                i5 = -1;
                th = null;
                t2 = t4;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0064. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, byte[] bArr, int i, int i2, d.a aVar) throws IOException {
        int M;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        int i9;
        int i10;
        int E;
        w<T> wVar = this;
        byte[] bArr2 = bArr;
        int i11 = i2;
        d.a aVar2 = aVar;
        Unsafe unsafe3 = r;
        int i12 = -1;
        int i13 = 0;
        int i14 = i;
        int i15 = 0;
        int i16 = -1;
        while (i14 < i11) {
            int i17 = i14 + 1;
            int i18 = bArr2[i14];
            if (i18 < 0) {
                i17 = d.j(i18, bArr2, i17, aVar2);
                i18 = aVar2.a;
            }
            int i19 = i17;
            int i20 = i18;
            int i21 = i20 >>> 3;
            int i22 = i20 & 7;
            int i23 = wVar.d;
            int i24 = wVar.c;
            if (i21 > i16) {
                int i25 = i15 / 3;
                if (i21 >= i24 && i21 <= i23) {
                    M = wVar.M(i21, i25);
                }
                M = i12;
            } else {
                if (i21 >= i24 && i21 <= i23) {
                    M = wVar.M(i21, i13);
                }
                M = i12;
            }
            int i26 = M;
            if (i26 == i12) {
                unsafe = unsafe3;
                i26 = i13;
                i3 = i26;
                i4 = i19;
                i5 = i21;
            } else {
                int i27 = wVar.a[i26 + 1];
                i5 = i21;
                int N = N(i27);
                long j = 1048575 & i27;
                if (N <= 17) {
                    switch (N) {
                        case 0:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 != 1) {
                                unsafe = unsafe2;
                                i8 = i6;
                                i3 = 0;
                                i10 = i7;
                                i4 = i8;
                                i20 = i10;
                                break;
                            } else {
                                u5q0.d.m(obj, j, Double.longBitsToDouble(d.c(i6, bArr2)));
                                i14 = i6 + 8;
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                        case 1:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 5) {
                                u5q0.d.n(obj, j, Float.intBitsToFloat(d.b(i6, bArr2)));
                                i14 = i6 + 4;
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 2:
                        case 3:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 0) {
                                int m = d.m(bArr2, i6, aVar2);
                                unsafe2.putLong(obj, j, aVar2.b);
                                unsafe3 = unsafe2;
                                i14 = m;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 4:
                        case 11:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 0) {
                                i14 = d.k(bArr2, i6, aVar2);
                                unsafe2.putInt(obj, j, aVar2.a);
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 5:
                        case 14:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 1) {
                                unsafe2.putLong(obj, j, d.c(i6, bArr2));
                                i14 = i6 + 8;
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 6:
                        case 13:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 5) {
                                unsafe2.putInt(obj, j, d.b(i6, bArr2));
                                i14 = i6 + 4;
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 7:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 0) {
                                i14 = d.m(bArr2, i6, aVar2);
                                u5q0.d.k(j, obj, aVar2.b != 0);
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 8:
                            i6 = i19;
                            i7 = i20;
                            unsafe2 = unsafe3;
                            if (i22 == 2) {
                                i14 = (536870912 & i27) == 0 ? d.g(bArr2, i6, aVar2) : d.h(bArr2, i6, aVar2);
                                unsafe2.putObject(obj, j, aVar2.c);
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i6;
                            i3 = 0;
                            i10 = i7;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 9:
                            i9 = i19;
                            unsafe2 = unsafe3;
                            if (i22 == 2) {
                                i14 = d.e(wVar.o(i26), bArr2, i9, i11, aVar2);
                                Object object = unsafe2.getObject(obj, j);
                                if (object == null) {
                                    unsafe2.putObject(obj, j, aVar2.c);
                                } else {
                                    unsafe2.putObject(obj, j, q.c(object, aVar2.c));
                                }
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i9;
                            i3 = 0;
                            i10 = i20;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 10:
                            i9 = i19;
                            unsafe2 = unsafe3;
                            if (i22 == 2) {
                                i14 = d.a(bArr2, i9, aVar2);
                                unsafe2.putObject(obj, j, aVar2.c);
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i9;
                            i3 = 0;
                            i10 = i20;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 12:
                            i9 = i19;
                            unsafe2 = unsafe3;
                            if (i22 == 0) {
                                i14 = d.k(bArr2, i9, aVar2);
                                unsafe2.putInt(obj, j, aVar2.a);
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i9;
                            i3 = 0;
                            i10 = i20;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 15:
                            i9 = i19;
                            unsafe2 = unsafe3;
                            if (i22 == 0) {
                                i14 = d.k(bArr2, i9, aVar2);
                                unsafe2.putInt(obj, j, g.b(aVar2.a));
                                unsafe3 = unsafe2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                            unsafe = unsafe2;
                            i8 = i9;
                            i3 = 0;
                            i10 = i20;
                            i4 = i8;
                            i20 = i10;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i8 = i19;
                                unsafe = unsafe3;
                                i3 = 0;
                                i10 = i20;
                                i4 = i8;
                                i20 = i10;
                                break;
                            } else {
                                int m2 = d.m(bArr2, i19, aVar2);
                                unsafe3.putLong(obj, j, g.c(aVar2.b));
                                unsafe3 = unsafe3;
                                i14 = m2;
                                i15 = i26;
                                i16 = i5;
                                i13 = 0;
                                break;
                            }
                        default:
                            i8 = i19;
                            unsafe = unsafe3;
                            i10 = i20;
                            i3 = 0;
                            i4 = i8;
                            i20 = i10;
                            break;
                    }
                    i12 = -1;
                } else {
                    i8 = i19;
                    i7 = i20;
                    unsafe2 = unsafe3;
                    if (N != 27) {
                        if (N <= 49) {
                            unsafe = unsafe2;
                            i3 = 0;
                            E = wVar.H(obj, bArr, i8, i2, i7, i5, i22, i26, i27, N, j, aVar);
                            i10 = i7;
                            i5 = i5;
                            i26 = i26;
                            if (E == i8) {
                                i4 = E;
                                i20 = i10;
                            }
                        } else {
                            unsafe = unsafe2;
                            i3 = 0;
                            i10 = i7;
                            if (N == 50) {
                                if (i22 == 2) {
                                    D(obj, bArr, i8, i2, i26, j, aVar);
                                    throw null;
                                }
                                i4 = i8;
                                i20 = i10;
                            } else {
                                i20 = i10;
                                E = E(obj, bArr, i8, i2, i20, i5, i22, i27, N, j, i26, aVar);
                                if (E == i8) {
                                    i4 = E;
                                }
                            }
                        }
                        wVar = this;
                        i11 = i2;
                        aVar2 = aVar;
                        i14 = E;
                        i15 = i26;
                        i16 = i5;
                        unsafe3 = unsafe;
                        i13 = i3;
                        i12 = -1;
                        bArr2 = bArr;
                    } else if (i22 == 2) {
                        q.d dVar = (q.d) unsafe2.getObject(obj, j);
                        if (!dVar.isModifiable()) {
                            int size = dVar.size();
                            dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, j, dVar);
                        }
                        i14 = d.f(wVar.o(i26), i7, bArr2, i8, i11, dVar, aVar2);
                        bArr2 = bArr;
                        i11 = i2;
                        aVar2 = aVar;
                        unsafe3 = unsafe2;
                        i15 = i26;
                        i16 = i5;
                        i13 = 0;
                        i12 = -1;
                    } else {
                        unsafe = unsafe2;
                        i3 = 0;
                        i10 = i7;
                        i4 = i8;
                        i20 = i10;
                    }
                }
            }
            i14 = d.i(i20, bArr, i4, i2, p(obj), aVar);
            wVar = this;
            bArr2 = bArr;
            aVar2 = aVar;
            i11 = i2;
            i15 = i26;
            i16 = i5;
            unsafe3 = unsafe;
            i13 = i3;
            i12 = -1;
        }
        if (i14 != i11) {
            throw InvalidProtocolBufferException.j();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int H(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d.a aVar) throws IOException {
        int l;
        Unsafe unsafe = r;
        q.d dVar = (q.d) unsafe.getObject(t, j2);
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, dVar);
        }
        q.d dVar2 = dVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    j jVar = (j) dVar2;
                    int k = d.k(bArr, i, aVar);
                    int i8 = aVar.a + k;
                    while (k < i8) {
                        jVar.addDouble(Double.longBitsToDouble(d.c(k, bArr)));
                        k += 8;
                    }
                    if (k == i8) {
                        return k;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 1) {
                    j jVar2 = (j) dVar2;
                    jVar2.addDouble(Double.longBitsToDouble(d.c(i, bArr)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int k2 = d.k(bArr, i9, aVar);
                        if (i3 != aVar.a) {
                            return i9;
                        }
                        jVar2.addDouble(Double.longBitsToDouble(d.c(k2, bArr)));
                        i9 = k2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    o oVar = (o) dVar2;
                    int k3 = d.k(bArr, i, aVar);
                    int i10 = aVar.a + k3;
                    while (k3 < i10) {
                        oVar.addFloat(Float.intBitsToFloat(d.b(k3, bArr)));
                        k3 += 4;
                    }
                    if (k3 == i10) {
                        return k3;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 5) {
                    o oVar2 = (o) dVar2;
                    oVar2.addFloat(Float.intBitsToFloat(d.b(i, bArr)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int k4 = d.k(bArr, i11, aVar);
                        if (i3 != aVar.a) {
                            return i11;
                        }
                        oVar2.addFloat(Float.intBitsToFloat(d.b(k4, bArr)));
                        i11 = k4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    u uVar = (u) dVar2;
                    int k5 = d.k(bArr, i, aVar);
                    int i12 = aVar.a + k5;
                    while (k5 < i12) {
                        k5 = d.m(bArr, k5, aVar);
                        uVar.addLong(aVar.b);
                    }
                    if (k5 == i12) {
                        return k5;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    u uVar2 = (u) dVar2;
                    int m = d.m(bArr, i, aVar);
                    uVar2.addLong(aVar.b);
                    while (m < i2) {
                        int k6 = d.k(bArr, m, aVar);
                        if (i3 != aVar.a) {
                            return m;
                        }
                        m = d.m(bArr, k6, aVar);
                        uVar2.addLong(aVar.b);
                    }
                    return m;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return d.l(i3, bArr, i, i2, dVar2, aVar);
                    }
                    return i;
                }
                p pVar = (p) dVar2;
                int k7 = d.k(bArr, i, aVar);
                int i13 = aVar.a + k7;
                while (k7 < i13) {
                    k7 = d.k(bArr, k7, aVar);
                    pVar.addInt(aVar.a);
                }
                if (k7 == i13) {
                    return k7;
                }
                throw InvalidProtocolBufferException.l();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    u uVar3 = (u) dVar2;
                    int k8 = d.k(bArr, i, aVar);
                    int i14 = aVar.a + k8;
                    while (k8 < i14) {
                        uVar3.addLong(d.c(k8, bArr));
                        k8 += 8;
                    }
                    if (k8 == i14) {
                        return k8;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 1) {
                    u uVar4 = (u) dVar2;
                    uVar4.addLong(d.c(i, bArr));
                    int i15 = i + 8;
                    while (i15 < i2) {
                        int k9 = d.k(bArr, i15, aVar);
                        if (i3 != aVar.a) {
                            return i15;
                        }
                        uVar4.addLong(d.c(k9, bArr));
                        i15 = k9 + 8;
                    }
                    return i15;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    p pVar2 = (p) dVar2;
                    int k10 = d.k(bArr, i, aVar);
                    int i16 = aVar.a + k10;
                    while (k10 < i16) {
                        pVar2.addInt(d.b(k10, bArr));
                        k10 += 4;
                    }
                    if (k10 == i16) {
                        return k10;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 5) {
                    p pVar3 = (p) dVar2;
                    pVar3.addInt(d.b(i, bArr));
                    int i17 = i + 4;
                    while (i17 < i2) {
                        int k11 = d.k(bArr, i17, aVar);
                        if (i3 != aVar.a) {
                            return i17;
                        }
                        pVar3.addInt(d.b(k11, bArr));
                        i17 = k11 + 4;
                    }
                    return i17;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    e eVar = (e) dVar2;
                    int k12 = d.k(bArr, i, aVar);
                    int i18 = aVar.a + k12;
                    while (k12 < i18) {
                        k12 = d.m(bArr, k12, aVar);
                        eVar.addBoolean(aVar.b != 0);
                    }
                    if (k12 == i18) {
                        return k12;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    e eVar2 = (e) dVar2;
                    int m2 = d.m(bArr, i, aVar);
                    eVar2.addBoolean(aVar.b != 0);
                    while (m2 < i2) {
                        int k13 = d.k(bArr, m2, aVar);
                        if (i3 != aVar.a) {
                            return m2;
                        }
                        m2 = d.m(bArr, k13, aVar);
                        eVar2.addBoolean(aVar.b != 0);
                    }
                    return m2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int k14 = d.k(bArr, i, aVar);
                        int i19 = aVar.a;
                        if (i19 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i19 == 0) {
                            dVar2.add("");
                        } else {
                            dVar2.add(new String(bArr, k14, i19, q.a));
                            k14 += i19;
                        }
                        while (k14 < i2) {
                            int k15 = d.k(bArr, k14, aVar);
                            if (i3 != aVar.a) {
                                return k14;
                            }
                            k14 = d.k(bArr, k15, aVar);
                            int i20 = aVar.a;
                            if (i20 < 0) {
                                throw InvalidProtocolBufferException.i();
                            }
                            if (i20 == 0) {
                                dVar2.add("");
                            } else {
                                dVar2.add(new String(bArr, k14, i20, q.a));
                                k14 += i20;
                            }
                        }
                        return k14;
                    }
                    int k16 = d.k(bArr, i, aVar);
                    int i21 = aVar.a;
                    if (i21 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i21 == 0) {
                        dVar2.add("");
                    } else {
                        int i22 = k16 + i21;
                        if (!h0.a.c(k16, i22, bArr)) {
                            throw InvalidProtocolBufferException.d();
                        }
                        dVar2.add(new String(bArr, k16, i21, q.a));
                        k16 = i22;
                    }
                    while (k16 < i2) {
                        int k17 = d.k(bArr, k16, aVar);
                        if (i3 != aVar.a) {
                            return k16;
                        }
                        k16 = d.k(bArr, k17, aVar);
                        int i23 = aVar.a;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i23 == 0) {
                            dVar2.add("");
                        } else {
                            int i24 = k16 + i23;
                            if (!h0.a.c(k16, i24, bArr)) {
                                throw InvalidProtocolBufferException.d();
                            }
                            dVar2.add(new String(bArr, k16, i23, q.a));
                            k16 = i24;
                        }
                    }
                    return k16;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return d.f(o(i6), i3, bArr, i, i2, dVar2, aVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int k18 = d.k(bArr, i, aVar);
                    int i25 = aVar.a;
                    if (i25 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i25 > bArr.length - k18) {
                        throw InvalidProtocolBufferException.l();
                    }
                    if (i25 == 0) {
                        dVar2.add(ByteString.b);
                    } else {
                        dVar2.add(ByteString.e(k18, i25, bArr));
                        k18 += i25;
                    }
                    while (k18 < i2) {
                        int k19 = d.k(bArr, k18, aVar);
                        if (i3 != aVar.a) {
                            return k18;
                        }
                        k18 = d.k(bArr, k19, aVar);
                        int i26 = aVar.a;
                        if (i26 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i26 > bArr.length - k18) {
                            throw InvalidProtocolBufferException.l();
                        }
                        if (i26 == 0) {
                            dVar2.add(ByteString.b);
                        } else {
                            dVar2.add(ByteString.e(k18, i26, bArr));
                            k18 += i26;
                        }
                    }
                    return k18;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        l = d.l(i3, bArr, i, i2, dVar2, aVar);
                    }
                    return i;
                }
                p pVar4 = (p) dVar2;
                l = d.k(bArr, i, aVar);
                int i27 = aVar.a + l;
                while (l < i27) {
                    l = d.k(bArr, l, aVar);
                    pVar4.addInt(aVar.a);
                }
                if (l != i27) {
                    throw InvalidProtocolBufferException.l();
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                f0 f0Var = generatedMessageLite.unknownFields;
                if (f0Var == f0.f) {
                    f0Var = null;
                }
                f0 f0Var2 = (f0) b0.w(i4, dVar2, m(i6), f0Var, this.n);
                if (f0Var2 != null) {
                    generatedMessageLite.unknownFields = f0Var2;
                }
                return l;
            case 33:
            case 47:
                if (i5 == 2) {
                    p pVar5 = (p) dVar2;
                    int k20 = d.k(bArr, i, aVar);
                    int i28 = aVar.a + k20;
                    while (k20 < i28) {
                        k20 = d.k(bArr, k20, aVar);
                        pVar5.addInt(g.b(aVar.a));
                    }
                    if (k20 == i28) {
                        return k20;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    p pVar6 = (p) dVar2;
                    int k21 = d.k(bArr, i, aVar);
                    pVar6.addInt(g.b(aVar.a));
                    while (k21 < i2) {
                        int k22 = d.k(bArr, k21, aVar);
                        if (i3 != aVar.a) {
                            return k21;
                        }
                        k21 = d.k(bArr, k22, aVar);
                        pVar6.addInt(g.b(aVar.a));
                    }
                    return k21;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    u uVar5 = (u) dVar2;
                    int k23 = d.k(bArr, i, aVar);
                    int i29 = aVar.a + k23;
                    while (k23 < i29) {
                        k23 = d.m(bArr, k23, aVar);
                        uVar5.addLong(g.c(aVar.b));
                    }
                    if (k23 == i29) {
                        return k23;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    u uVar6 = (u) dVar2;
                    int m3 = d.m(bArr, i, aVar);
                    uVar6.addLong(g.c(aVar.b));
                    while (m3 < i2) {
                        int k24 = d.k(bArr, m3, aVar);
                        if (i3 != aVar.a) {
                            return m3;
                        }
                        m3 = d.m(bArr, k24, aVar);
                        uVar6.addLong(g.c(aVar.b));
                    }
                    return m3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    a0 o = o(i6);
                    int i30 = (i3 & (-8)) | 4;
                    int d = d.d(o, bArr, i, i2, i30, aVar);
                    a0 a0Var = o;
                    dVar2.add(aVar.c);
                    while (d < i2) {
                        int k25 = d.k(bArr, d, aVar);
                        if (i3 != aVar.a) {
                            return d;
                        }
                        a0 a0Var2 = a0Var;
                        d = d.d(a0Var2, bArr, k25, i2, i30, aVar);
                        dVar2.add(aVar.c);
                        a0Var = a0Var2;
                    }
                    return d;
                }
                return i;
            default:
                return i;
        }
    }

    public final void I(Object obj, int i, v7f0 v7f0Var) throws IOException {
        if ((536870912 & i) != 0) {
            u5q0.o(i & 1048575, obj, v7f0Var.M());
        } else if (this.g) {
            u5q0.o(i & 1048575, obj, v7f0Var.q());
        } else {
            u5q0.o(i & 1048575, obj, v7f0Var.v());
        }
    }

    public final void K(int i, Object obj) {
        if (this.h) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        u5q0.m(u5q0.d.g(j, obj) | (1 << (i2 >>> 20)), j, obj);
    }

    public final void L(int i, int i2, Object obj) {
        u5q0.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int M(int i, int i2) {
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

    public final int O(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(T t, Writer writer) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int[] iArr;
        boolean z;
        int i2;
        boolean z2 = this.f;
        l<?> lVar = this.o;
        if (z2) {
            n<?> c = lVar.c(t);
            if (!c.f()) {
                entry = c.i().next();
                int[] iArr2 = this.a;
                length = iArr2.length;
                Unsafe unsafe = r;
                int i3 = -1;
                i = 0;
                int i4 = 0;
                while (i < length) {
                    int O = O(i);
                    int i5 = iArr2[i];
                    int N = N(O);
                    if (this.h || N > 17) {
                        iArr = iArr2;
                        z = true;
                        i2 = 0;
                    } else {
                        int i6 = iArr2[i + 2];
                        z = true;
                        int i7 = i6 & 1048575;
                        iArr = iArr2;
                        if (i7 != i3) {
                            i4 = unsafe.getInt(t, i7);
                            i3 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    }
                    if (entry != null) {
                        lVar.a(entry);
                        if (i5 >= 0) {
                            lVar.j(entry);
                            throw null;
                        }
                    }
                    int i8 = i2;
                    long j = O & 1048575;
                    switch (N) {
                        case 0:
                            if ((i8 & i4) == 0) {
                                break;
                            } else {
                                ((i) writer).c(i5, u5q0.d.e(j, t));
                                continue;
                            }
                        case 1:
                            if ((i8 & i4) != 0) {
                                ((i) writer).g(i5, u5q0.d.f(j, t));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i8 & i4) != 0) {
                                ((i) writer).j(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i8 & i4) != 0) {
                                ((i) writer).r(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i8 & i4) != 0) {
                                ((i) writer).i(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i8 & i4) != 0) {
                                ((i) writer).f(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i8 & i4) != 0) {
                                ((i) writer).e(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i8 & i4) != 0) {
                                ((i) writer).a(i5, u5q0.d.c(j, t));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i8 & i4) != 0) {
                                R(i5, unsafe.getObject(t, j), writer);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i8 & i4) != 0) {
                                ((i) writer).k(i5, unsafe.getObject(t, j), o(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i8 & i4) != 0) {
                                ((i) writer).b(i5, (ByteString) unsafe.getObject(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i8 & i4) != 0) {
                                ((i) writer).q(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i8 & i4) != 0) {
                                ((i) writer).d(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i8 & i4) != 0) {
                                ((i) writer).m(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i8 & i4) != 0) {
                                ((i) writer).n(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i8 & i4) != 0) {
                                ((i) writer).o(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i8 & i4) != 0) {
                                ((i) writer).p(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i8 & i4) != 0) {
                                ((i) writer).h(i5, unsafe.getObject(t, j), o(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            b0.C(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 19:
                            b0.G(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 20:
                            b0.J(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 21:
                            b0.R(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 22:
                            b0.I(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 23:
                            b0.F(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 24:
                            b0.E(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 25:
                            b0.A(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 26:
                            b0.P(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 27:
                            b0.K(iArr[i], (List) unsafe.getObject(t, j), writer, o(i));
                            break;
                        case 28:
                            b0.B(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 29:
                            b0.Q(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 30:
                            b0.D(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 31:
                            b0.L(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 32:
                            b0.M(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 33:
                            b0.N(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 34:
                            b0.O(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            continue;
                        case 35:
                            b0.C(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 36:
                            b0.G(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 37:
                            b0.J(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 38:
                            b0.R(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 39:
                            b0.I(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 40:
                            b0.F(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 41:
                            b0.E(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 42:
                            b0.A(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 43:
                            b0.Q(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 44:
                            b0.D(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 45:
                            b0.L(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 46:
                            b0.M(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 47:
                            b0.N(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 48:
                            b0.O(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 49:
                            b0.H(iArr[i], (List) unsafe.getObject(t, j), writer, o(i));
                            break;
                        case 50:
                            Q(writer, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (t(i5, i, t)) {
                                ((i) writer).c(i5, ((Double) u5q0.d.i(j, t)).doubleValue());
                                break;
                            }
                            break;
                        case 52:
                            if (t(i5, i, t)) {
                                ((i) writer).g(i5, ((Float) u5q0.d.i(j, t)).floatValue());
                                break;
                            }
                            break;
                        case 53:
                            if (t(i5, i, t)) {
                                ((i) writer).j(i5, C(j, t));
                                break;
                            }
                            break;
                        case 54:
                            if (t(i5, i, t)) {
                                ((i) writer).r(i5, C(j, t));
                                break;
                            }
                            break;
                        case 55:
                            if (t(i5, i, t)) {
                                ((i) writer).i(i5, B(j, t));
                                break;
                            }
                            break;
                        case 56:
                            if (t(i5, i, t)) {
                                ((i) writer).f(i5, C(j, t));
                                break;
                            }
                            break;
                        case 57:
                            if (t(i5, i, t)) {
                                ((i) writer).e(i5, B(j, t));
                                break;
                            }
                            break;
                        case 58:
                            if (t(i5, i, t)) {
                                ((i) writer).a(i5, ((Boolean) u5q0.d.i(j, t)).booleanValue());
                                break;
                            }
                            break;
                        case 59:
                            if (t(i5, i, t)) {
                                R(i5, unsafe.getObject(t, j), writer);
                                break;
                            }
                            break;
                        case 60:
                            if (t(i5, i, t)) {
                                ((i) writer).k(i5, unsafe.getObject(t, j), o(i));
                                break;
                            }
                            break;
                        case 61:
                            if (t(i5, i, t)) {
                                ((i) writer).b(i5, (ByteString) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (t(i5, i, t)) {
                                ((i) writer).q(i5, B(j, t));
                                break;
                            }
                            break;
                        case 63:
                            if (t(i5, i, t)) {
                                ((i) writer).d(i5, B(j, t));
                                break;
                            }
                            break;
                        case 64:
                            if (t(i5, i, t)) {
                                ((i) writer).m(i5, B(j, t));
                                break;
                            }
                            break;
                        case 65:
                            if (t(i5, i, t)) {
                                ((i) writer).n(i5, C(j, t));
                                break;
                            }
                            break;
                        case 66:
                            if (t(i5, i, t)) {
                                ((i) writer).o(i5, B(j, t));
                                break;
                            }
                            break;
                        case 67:
                            if (t(i5, i, t)) {
                                ((i) writer).p(i5, C(j, t));
                                break;
                            }
                            break;
                        case 68:
                            if (t(i5, i, t)) {
                                ((i) writer).h(i5, unsafe.getObject(t, j), o(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    iArr2 = iArr;
                }
                if (entry == null) {
                    lVar.j(entry);
                    throw null;
                }
                e0<?, ?> e0Var = this.n;
                e0Var.r(e0Var.g(t), writer);
                return;
            }
        }
        entry = null;
        int[] iArr22 = this.a;
        length = iArr22.length;
        Unsafe unsafe2 = r;
        int i32 = -1;
        i = 0;
        int i42 = 0;
        while (i < length) {
        }
        if (entry == null) {
        }
    }

    public final <K, V> void Q(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object n = n(i2);
            il00 il00Var = this.p;
            il00Var.b(n);
            MapFieldLite e = il00Var.e(obj);
            CodedOutputStream codedOutputStream = ((i) writer).a;
            codedOutputStream.getClass();
            Iterator<Map.Entry<K, V>> it = e.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                codedOutputStream.E(i, 2);
                next.getKey();
                next.getValue();
                dl00.b();
                throw null;
            }
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
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int O = O(i4);
            int i5 = iArr[i4];
            long j = 1048575 & O;
            int i6 = 1237;
            int i7 = 37;
            switch (N(O)) {
                case 0:
                    i = i3 * 53;
                    b = q.b(Double.doubleToLongBits(u5q0.d.e(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(u5q0.d.f(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = q.b(u5q0.d.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = q.b(u5q0.d.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = q.b(u5q0.d.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = u5q0.d.c(j, generatedMessageLite);
                    Charset charset = q.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) u5q0.d.i(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = u5q0.d.i(j, generatedMessageLite);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = u5q0.d.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = q.b(u5q0.d.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = u5q0.d.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = q.b(u5q0.d.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = u5q0.d.i(j, generatedMessageLite);
                    if (i9 != null) {
                        i7 = i9.hashCode();
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
                    b = u5q0.d.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = u5q0.d.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(Double.doubleToLongBits(((Double) u5q0.d.i(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) u5q0.d.i(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(C(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(C(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(C(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) u5q0.d.i(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = q.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) u5q0.d.i(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = u5q0.d.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = u5q0.d.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(C(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = B(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = q.b(C(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = u5q0.d.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.n.g(generatedMessageLite).hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        return this.o.c(generatedMessageLite).hashCode() + (hashCode * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final T b() {
        return (T) this.l.a(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f1, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i3 >= this.j) {
                if (this.f) {
                    this.o.c(t).g();
                }
                return true;
            }
            int i5 = this.i[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int O = O(i5);
            boolean z2 = this.h;
            if (z2) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = r.getInt(t, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & O) != 0) {
                if (!(z2 ? s(i5, t) : (i4 & i) != 0)) {
                    break;
                }
            }
            int N = N(O);
            if (N == 9 || N == 17) {
                if (z2) {
                    z = s(i5, t);
                } else if ((i & i4) == 0) {
                    z = false;
                }
                if (z) {
                    if (!o(i5).c(u5q0.d.i(O & 1048575, t))) {
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                if (N != 27) {
                    if (N == 60 || N == 68) {
                        if (t(i6, i5, t)) {
                            if (!o(i5).c(u5q0.d.i(O & 1048575, t))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (N != 49) {
                        if (N != 50) {
                            continue;
                        } else {
                            Object i9 = u5q0.d.i(O & 1048575, t);
                            il00 il00Var = this.p;
                            if (!il00Var.e(i9).isEmpty()) {
                                il00Var.b(n(i5));
                                throw null;
                            }
                        }
                    }
                    i3++;
                }
                List list = (List) u5q0.d.i(O & 1048575, t);
                if (list.isEmpty()) {
                    continue;
                } else {
                    a0 o = o(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!o.c(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i3++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void d(T t) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long O = O(iArr[i2]) & 1048575;
            Object i3 = u5q0.d.i(O, t);
            if (i3 != null) {
                u5q0.o(O, t, this.p.c(i3));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.a(iArr[i], t);
            i++;
        }
        this.n.j(t);
        if (this.f) {
            this.o.f(t);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x006b, code lost:
    
        if (r12 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0039, code lost:
    
        if (r12 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0615 A[Catch: all -> 0x0210, TryCatch #1 {all -> 0x0210, blocks: (B:167:0x020f, B:134:0x0610, B:136:0x0615, B:137:0x061a, B:161:0x021c, B:60:0x022f, B:61:0x023e, B:62:0x024d, B:63:0x025c, B:64:0x026c, B:65:0x0284, B:66:0x0294, B:67:0x02a4, B:68:0x02b4, B:69:0x02c4, B:70:0x02d4, B:71:0x02e4, B:72:0x02f4, B:73:0x0304, B:74:0x0314, B:75:0x0324, B:76:0x0334, B:77:0x0344, B:78:0x0354, B:79:0x036c, B:80:0x037c, B:81:0x038c, B:82:0x03a3, B:84:0x03b0, B:85:0x03bc, B:86:0x03c8, B:87:0x03d8, B:88:0x03e8, B:89:0x03f8, B:90:0x0408, B:91:0x0418, B:92:0x0428, B:93:0x0438, B:94:0x0448, B:96:0x0451, B:97:0x0470, B:98:0x0484, B:99:0x0497, B:100:0x04aa, B:101:0x04bd, B:102:0x04d0, B:104:0x04dd, B:107:0x04e4, B:108:0x04ea, B:109:0x04f6, B:110:0x0509, B:111:0x051c, B:113:0x0525, B:114:0x0544, B:115:0x0558, B:116:0x0563, B:117:0x0578, B:118:0x058b, B:119:0x059e, B:120:0x05b1, B:121:0x05c4, B:122:0x05d7, B:123:0x05eb, B:131:0x0601), top: B:166:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0638 A[LOOP:3: B:150:0x0636->B:151:0x0638, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0642  */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.crypto.tink.shaded.protobuf.t] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [xsna.v7f0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8, types: [xsna.v7f0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.crypto.tink.shaded.protobuf.t] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xsna.v7f0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.google.crypto.tink.shaded.protobuf.w] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.crypto.tink.shaded.protobuf.w] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(T t, v7f0 v7f0Var, k kVar) throws IOException {
        w<T> wVar;
        ?? r13;
        boolean l;
        v7f0 v7f0Var2;
        w<T> wVar2;
        t tVar;
        w<T> wVar3 = this;
        T t2 = t;
        ?? r6 = v7f0Var;
        k kVar2 = kVar;
        kVar2.getClass();
        e0<?, ?> e0Var = wVar3.n;
        int[] iArr = wVar3.i;
        int i = wVar3.k;
        int i2 = wVar3.j;
        Object obj = null;
        while (true) {
            try {
                int z = r6.z();
                int M = (z < wVar3.c || z > wVar3.d) ? -1 : wVar3.M(z, 0);
                if (M >= 0) {
                    int O = wVar3.O(M);
                    try {
                        r13 = N(O);
                        tVar = wVar3.m;
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        r13 = r6;
                        r6 = wVar3;
                    }
                    switch (r13) {
                        case 0:
                            r13 = r6;
                            r6 = wVar3;
                            int i3 = M;
                            try {
                                try {
                                    u5q0.d.m(t, A(O), r13.readDouble());
                                    t2 = t;
                                    r6.K(i3, t2);
                                    wVar2 = r6;
                                    v7f0Var2 = r13;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    t2 = t;
                                    e0Var.getClass();
                                    if (obj == null) {
                                    }
                                    l = e0Var.l(obj, r13);
                                    wVar2 = r6;
                                    v7f0Var2 = r13;
                                    if (!l) {
                                    }
                                    kVar2 = kVar;
                                    wVar3 = wVar2;
                                    r6 = v7f0Var2;
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t;
                                    wVar = r6;
                                    while (i2 < i) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                t2 = t;
                            } catch (Throwable th2) {
                                th = th2;
                                t2 = t;
                                wVar = r6;
                            }
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                            break;
                        case 1:
                            v7f0 v7f0Var3 = r6;
                            w<T> wVar4 = wVar3;
                            u5q0.d.n(t2, A(O), v7f0Var3.readFloat());
                            wVar4.K(M, t2);
                            wVar2 = wVar4;
                            v7f0Var2 = v7f0Var3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 2:
                            v7f0 v7f0Var4 = r6;
                            w<T> wVar5 = wVar3;
                            u5q0.n(t2, A(O), v7f0Var4.j());
                            wVar5.K(M, t2);
                            wVar2 = wVar5;
                            v7f0Var2 = v7f0Var4;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 3:
                            v7f0 v7f0Var5 = r6;
                            w<T> wVar6 = wVar3;
                            u5q0.n(t2, A(O), v7f0Var5.w());
                            wVar6.K(M, t2);
                            wVar2 = wVar6;
                            v7f0Var2 = v7f0Var5;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 4:
                            v7f0 v7f0Var6 = r6;
                            w<T> wVar7 = wVar3;
                            u5q0.m(v7f0Var6.n(), A(O), t2);
                            wVar7.K(M, t2);
                            wVar2 = wVar7;
                            v7f0Var2 = v7f0Var6;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 5:
                            v7f0 v7f0Var7 = r6;
                            w<T> wVar8 = wVar3;
                            u5q0.n(t2, A(O), v7f0Var7.E());
                            wVar8.K(M, t2);
                            wVar2 = wVar8;
                            v7f0Var2 = v7f0Var7;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 6:
                            v7f0 v7f0Var8 = r6;
                            w<T> wVar9 = wVar3;
                            u5q0.m(v7f0Var8.p(), A(O), t2);
                            wVar9.K(M, t2);
                            wVar2 = wVar9;
                            v7f0Var2 = v7f0Var8;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 7:
                            v7f0 v7f0Var9 = r6;
                            w<T> wVar10 = wVar3;
                            u5q0.d.k(A(O), t2, v7f0Var9.k());
                            wVar10.K(M, t2);
                            wVar2 = wVar10;
                            v7f0Var2 = v7f0Var9;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 8:
                            v7f0 v7f0Var10 = r6;
                            w<T> wVar11 = wVar3;
                            wVar11.I(t2, O, v7f0Var10);
                            wVar11.K(M, t2);
                            wVar2 = wVar11;
                            v7f0Var2 = v7f0Var10;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 9:
                            v7f0 v7f0Var11 = r6;
                            w<T> wVar12 = wVar3;
                            k kVar3 = kVar2;
                            if (wVar12.s(M, t2)) {
                                u5q0.o(A(O), t2, q.c(u5q0.d.i(A(O), t2), v7f0Var11.h(wVar12.o(M), kVar3)));
                                wVar2 = wVar12;
                                v7f0Var2 = v7f0Var11;
                            } else {
                                u5q0.o(A(O), t2, v7f0Var11.h(wVar12.o(M), kVar3));
                                wVar12.K(M, t2);
                                wVar2 = wVar12;
                                v7f0Var2 = v7f0Var11;
                            }
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 10:
                            v7f0 v7f0Var12 = r6;
                            w<T> wVar13 = wVar3;
                            u5q0.o(A(O), t2, v7f0Var12.v());
                            wVar13.K(M, t2);
                            wVar2 = wVar13;
                            v7f0Var2 = v7f0Var12;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 11:
                            v7f0 v7f0Var13 = r6;
                            w<T> wVar14 = wVar3;
                            u5q0.m(v7f0Var13.a(), A(O), t2);
                            wVar14.K(M, t2);
                            wVar2 = wVar14;
                            v7f0Var2 = v7f0Var13;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 12:
                            v7f0 v7f0Var14 = r6;
                            w<T> wVar15 = wVar3;
                            int c = v7f0Var14.c();
                            q.c m = wVar15.m(M);
                            if (m != null && !m.a()) {
                                obj = b0.z(z, c, obj, e0Var);
                                wVar2 = wVar15;
                                v7f0Var2 = v7f0Var14;
                                kVar2 = kVar;
                                wVar3 = wVar2;
                                r6 = v7f0Var2;
                            }
                            u5q0.m(c, A(O), t2);
                            wVar15.K(M, t2);
                            wVar2 = wVar15;
                            v7f0Var2 = v7f0Var14;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                            break;
                        case 13:
                            v7f0 v7f0Var15 = r6;
                            w<T> wVar16 = wVar3;
                            u5q0.m(v7f0Var15.L(), A(O), t2);
                            wVar16.K(M, t2);
                            wVar2 = wVar16;
                            v7f0Var2 = v7f0Var15;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 14:
                            v7f0 v7f0Var16 = r6;
                            w<T> wVar17 = wVar3;
                            u5q0.n(t2, A(O), v7f0Var16.t());
                            wVar17.K(M, t2);
                            wVar2 = wVar17;
                            v7f0Var2 = v7f0Var16;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 15:
                            v7f0 v7f0Var17 = r6;
                            w<T> wVar18 = wVar3;
                            u5q0.m(v7f0Var17.u(), A(O), t2);
                            wVar18.K(M, t2);
                            wVar2 = wVar18;
                            v7f0Var2 = v7f0Var17;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 16:
                            v7f0 v7f0Var18 = r6;
                            w<T> wVar19 = wVar3;
                            u5q0.n(t2, A(O), v7f0Var18.K());
                            wVar19.K(M, t2);
                            wVar2 = wVar19;
                            v7f0Var2 = v7f0Var18;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 17:
                            v7f0 v7f0Var19 = r6;
                            w<T> wVar20 = wVar3;
                            k kVar4 = kVar2;
                            if (wVar20.s(M, t2)) {
                                u5q0.o(A(O), t2, q.c(u5q0.d.i(A(O), t2), v7f0Var19.b(wVar20.o(M), kVar4)));
                                wVar2 = wVar20;
                                v7f0Var2 = v7f0Var19;
                            } else {
                                u5q0.o(A(O), t2, v7f0Var19.b(wVar20.o(M), kVar4));
                                wVar20.K(M, t2);
                                wVar2 = wVar20;
                                v7f0Var2 = v7f0Var19;
                            }
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 18:
                            v7f0 v7f0Var20 = r6;
                            wVar2 = wVar3;
                            v7f0Var20.D(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var20;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 19:
                            v7f0 v7f0Var21 = r6;
                            wVar2 = wVar3;
                            v7f0Var21.B(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var21;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 20:
                            v7f0 v7f0Var22 = r6;
                            wVar2 = wVar3;
                            v7f0Var22.H(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var22;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 21:
                            v7f0 v7f0Var23 = r6;
                            wVar2 = wVar3;
                            v7f0Var23.l(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var23;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 22:
                            v7f0 v7f0Var24 = r6;
                            wVar2 = wVar3;
                            v7f0Var24.g(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var24;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 23:
                            v7f0 v7f0Var25 = r6;
                            wVar2 = wVar3;
                            v7f0Var25.o(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var25;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 24:
                            v7f0 v7f0Var26 = r6;
                            wVar2 = wVar3;
                            v7f0Var26.y(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var26;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 25:
                            v7f0 v7f0Var27 = r6;
                            wVar2 = wVar3;
                            v7f0Var27.d(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var27;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 26:
                            v7f0 v7f0Var28 = r6;
                            w<T> wVar21 = wVar3;
                            ?? r0 = wVar21.m;
                            if ((536870912 & O) != 0) {
                                v7f0Var28.m(r0.c(O & 1048575, t2));
                                wVar2 = wVar21;
                                v7f0Var2 = v7f0Var28;
                            } else {
                                v7f0Var28.A(r0.c(O & 1048575, t2));
                                wVar2 = wVar21;
                                v7f0Var2 = v7f0Var28;
                            }
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 27:
                            v7f0 v7f0Var29 = r6;
                            w<T> wVar22 = wVar3;
                            v7f0Var29.x(wVar22.m.c(1048575 & O, t2), wVar22.o(M), kVar2);
                            wVar2 = wVar22;
                            v7f0Var2 = v7f0Var29;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 28:
                            v7f0 v7f0Var30 = r6;
                            wVar2 = wVar3;
                            v7f0Var30.C(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var30;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 29:
                            v7f0 v7f0Var31 = r6;
                            wVar2 = wVar3;
                            v7f0Var31.J(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var31;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 30:
                            v7f0 v7f0Var32 = r6;
                            w<T> wVar23 = wVar3;
                            List<Integer> c2 = tVar.c(A(O), t2);
                            v7f0Var32.I(c2);
                            obj = b0.w(z, c2, wVar23.m(M), obj, e0Var);
                            wVar2 = wVar23;
                            v7f0Var2 = v7f0Var32;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 31:
                            v7f0 v7f0Var33 = r6;
                            wVar2 = wVar3;
                            v7f0Var33.F(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var33;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 32:
                            v7f0 v7f0Var34 = r6;
                            wVar2 = wVar3;
                            v7f0Var34.f(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var34;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 33:
                            v7f0 v7f0Var35 = r6;
                            wVar2 = wVar3;
                            v7f0Var35.e(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var35;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 34:
                            v7f0 v7f0Var36 = r6;
                            wVar2 = wVar3;
                            v7f0Var36.s(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var36;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 35:
                            v7f0 v7f0Var37 = r6;
                            wVar2 = wVar3;
                            v7f0Var37.D(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var37;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 36:
                            v7f0 v7f0Var38 = r6;
                            wVar2 = wVar3;
                            v7f0Var38.B(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var38;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 37:
                            v7f0 v7f0Var39 = r6;
                            wVar2 = wVar3;
                            v7f0Var39.H(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var39;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 38:
                            v7f0 v7f0Var40 = r6;
                            wVar2 = wVar3;
                            v7f0Var40.l(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var40;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 39:
                            v7f0 v7f0Var41 = r6;
                            wVar2 = wVar3;
                            v7f0Var41.g(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var41;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 40:
                            v7f0 v7f0Var42 = r6;
                            wVar2 = wVar3;
                            v7f0Var42.o(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var42;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 41:
                            v7f0 v7f0Var43 = r6;
                            wVar2 = wVar3;
                            v7f0Var43.y(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var43;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 42:
                            v7f0 v7f0Var44 = r6;
                            wVar2 = wVar3;
                            v7f0Var44.d(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var44;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 43:
                            v7f0 v7f0Var45 = r6;
                            wVar2 = wVar3;
                            v7f0Var45.J(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var45;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 44:
                            v7f0 v7f0Var46 = r6;
                            w<T> wVar24 = wVar3;
                            List<Integer> c3 = tVar.c(A(O), t2);
                            v7f0Var46.I(c3);
                            obj = b0.w(z, c3, wVar24.m(M), obj, e0Var);
                            wVar2 = wVar24;
                            v7f0Var2 = v7f0Var46;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 45:
                            v7f0 v7f0Var47 = r6;
                            wVar2 = wVar3;
                            v7f0Var47.F(tVar.c(A(O), t2));
                            v7f0Var2 = v7f0Var47;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 46:
                            v7f0 v7f0Var48 = r6;
                            wVar2 = wVar3;
                            v7f0Var48.f(tVar.c(O & 1048575, t2));
                            v7f0Var2 = v7f0Var48;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 47:
                            v7f0 v7f0Var49 = r6;
                            wVar2 = wVar3;
                            v7f0Var49.e(tVar.c(O & 1048575, t2));
                            v7f0Var2 = v7f0Var49;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 48:
                            v7f0 v7f0Var50 = r6;
                            wVar2 = wVar3;
                            v7f0Var50.s(tVar.c(O & 1048575, t2));
                            v7f0Var2 = v7f0Var50;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 49:
                            try {
                                v7f0 v7f0Var51 = r6;
                                w<T> wVar25 = wVar3;
                                v7f0Var51.r(tVar.c(O & 1048575, t2), wVar25.o(M), kVar2);
                                wVar2 = wVar25;
                                v7f0Var2 = v7f0Var51;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                e0Var.getClass();
                                if (obj == null) {
                                    obj = e0Var.f(t2);
                                }
                                l = e0Var.l(obj, r13);
                                wVar2 = r6;
                                v7f0Var2 = r13;
                                if (!l) {
                                    while (i2 < i) {
                                        r6.l(t2, iArr[i2], obj, e0Var);
                                        i2++;
                                    }
                                    if (obj != null) {
                                        e0Var.n(t2, obj);
                                        return;
                                    }
                                    return;
                                }
                                kVar2 = kVar;
                                wVar3 = wVar2;
                                r6 = v7f0Var2;
                            }
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 50:
                            try {
                                wVar3.v(t2, M, wVar3.n(M), kVar2, r6);
                                r13 = r6;
                                r6 = wVar3;
                                try {
                                    throw null;
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    wVar = r6;
                                    while (i2 < i) {
                                        wVar.l(t2, iArr[i2], obj, e0Var);
                                        i2++;
                                    }
                                    if (obj != null) {
                                        e0Var.n(t2, obj);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                r13 = r6;
                                r6 = wVar3;
                                e0Var.getClass();
                                if (obj == null) {
                                }
                                l = e0Var.l(obj, r13);
                                wVar2 = r6;
                                v7f0Var2 = r13;
                                if (!l) {
                                }
                                kVar2 = kVar;
                                wVar3 = wVar2;
                                r6 = v7f0Var2;
                            }
                            break;
                        case 51:
                            u5q0.o(O & 1048575, t2, Double.valueOf(r6.readDouble()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 52:
                            u5q0.o(O & 1048575, t2, Float.valueOf(r6.readFloat()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 53:
                            u5q0.o(O & 1048575, t2, Long.valueOf(r6.j()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 54:
                            u5q0.o(O & 1048575, t2, Long.valueOf(r6.w()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 55:
                            u5q0.o(O & 1048575, t2, Integer.valueOf(r6.n()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 56:
                            u5q0.o(O & 1048575, t2, Long.valueOf(r6.E()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 57:
                            u5q0.o(O & 1048575, t2, Integer.valueOf(r6.p()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 58:
                            u5q0.o(O & 1048575, t2, Boolean.valueOf(r6.k()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 59:
                            wVar3.I(t2, O, r6);
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 60:
                            if (wVar3.t(z, M, t2)) {
                                long j = O & 1048575;
                                u5q0.o(j, t2, q.c(u5q0.d.i(j, t2), r6.h(wVar3.o(M), kVar2)));
                            } else {
                                u5q0.o(O & 1048575, t2, r6.h(wVar3.o(M), kVar2));
                                wVar3.K(M, t2);
                            }
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 61:
                            u5q0.o(O & 1048575, t2, r6.v());
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 62:
                            u5q0.o(O & 1048575, t2, Integer.valueOf(r6.a()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 63:
                            int c4 = r6.c();
                            q.c m2 = wVar3.m(M);
                            if (m2 != null && !m2.a()) {
                                obj = b0.z(z, c4, obj, e0Var);
                                v7f0Var2 = r6;
                                wVar2 = wVar3;
                                kVar2 = kVar;
                                wVar3 = wVar2;
                                r6 = v7f0Var2;
                            }
                            u5q0.o(O & 1048575, t2, Integer.valueOf(c4));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                            break;
                        case 64:
                            u5q0.o(O & 1048575, t2, Integer.valueOf(r6.L()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 65:
                            u5q0.o(O & 1048575, t2, Long.valueOf(r6.t()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 66:
                            u5q0.o(O & 1048575, t2, Integer.valueOf(r6.u()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 67:
                            u5q0.o(O & 1048575, t2, Long.valueOf(r6.K()));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        case 68:
                            u5q0.o(O & 1048575, t2, r6.b(wVar3.o(M), kVar2));
                            wVar3.L(z, M, t2);
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                        default:
                            if (obj == null) {
                                obj = e0Var.m();
                            }
                            if (!e0Var.l(obj, r6)) {
                                while (i2 < i) {
                                    wVar3.l(t2, iArr[i2], obj, e0Var);
                                    i2++;
                                }
                                break;
                            }
                            v7f0Var2 = r6;
                            wVar2 = wVar3;
                            kVar2 = kVar;
                            wVar3 = wVar2;
                            r6 = v7f0Var2;
                    }
                } else if (z == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        wVar3.l(t2, iArr[i2], obj, e0Var);
                        i2++;
                    }
                } else {
                    boolean z2 = wVar3.f;
                    l<?> lVar = wVar3.o;
                    GeneratedMessageLite.e b = !z2 ? null : lVar.b(kVar2, wVar3.e, z);
                    if (b != null) {
                        lVar.d(t2);
                        lVar.g(b);
                        throw null;
                    }
                    e0Var.getClass();
                    if (obj == null) {
                        obj = e0Var.f(t2);
                    }
                    if (!e0Var.l(obj, r6)) {
                        while (i2 < i) {
                            wVar3.l(t2, iArr[i2], obj, e0Var);
                            i2++;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                wVar = wVar3;
            }
        }
        e0Var.n(t2, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        GeneratedMessageLite generatedMessageLite3;
        generatedMessageLite2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                GeneratedMessageLite generatedMessageLite4 = generatedMessageLite;
                Class<?> cls = b0.a;
                e0<?, ?> e0Var = this.n;
                e0Var.o(generatedMessageLite4, e0Var.k(e0Var.g(generatedMessageLite4), e0Var.g(generatedMessageLite2)));
                if (this.f) {
                    l<?> lVar = this.o;
                    n<?> c = lVar.c(generatedMessageLite2);
                    if (c.f()) {
                        return;
                    }
                    lVar.d(generatedMessageLite4).j(c);
                    return;
                }
                return;
            }
            int O = O(i);
            long j = 1048575 & O;
            int i2 = iArr[i];
            switch (N(O)) {
                case 0:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.e eVar = u5q0.d;
                        generatedMessageLite3 = generatedMessageLite;
                        eVar.m(generatedMessageLite3, j, eVar.e(j, generatedMessageLite2));
                        K(i, generatedMessageLite3);
                        break;
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 1:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.e eVar2 = u5q0.d;
                        eVar2.n(generatedMessageLite, j, eVar2.f(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 2:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.n(generatedMessageLite, j, u5q0.d.h(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 3:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.n(generatedMessageLite, j, u5q0.d.h(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 4:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 5:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.n(generatedMessageLite, j, u5q0.d.h(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 6:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 7:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.e eVar3 = u5q0.d;
                        eVar3.k(j, generatedMessageLite, eVar3.c(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 8:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.o(j, generatedMessageLite, u5q0.d.i(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 9:
                    w(i, generatedMessageLite, generatedMessageLite2);
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 10:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.o(j, generatedMessageLite, u5q0.d.i(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 11:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 12:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 13:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 14:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.n(generatedMessageLite, j, u5q0.d.h(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 15:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.m(u5q0.d.g(j, generatedMessageLite2), j, generatedMessageLite);
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 16:
                    if (s(i, generatedMessageLite2)) {
                        u5q0.n(generatedMessageLite, j, u5q0.d.h(j, generatedMessageLite2));
                        K(i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 17:
                    w(i, generatedMessageLite, generatedMessageLite2);
                    generatedMessageLite3 = generatedMessageLite;
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
                    this.m.b(j, generatedMessageLite, generatedMessageLite2);
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 50:
                    Class<?> cls2 = b0.a;
                    u5q0.e eVar4 = u5q0.d;
                    u5q0.o(j, generatedMessageLite, this.p.a(eVar4.i(j, generatedMessageLite), eVar4.i(j, generatedMessageLite2)));
                    generatedMessageLite3 = generatedMessageLite;
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
                    if (t(i2, i, generatedMessageLite2)) {
                        u5q0.o(j, generatedMessageLite, u5q0.d.i(j, generatedMessageLite2));
                        L(i2, i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 60:
                    x(i, generatedMessageLite, generatedMessageLite2);
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i2, i, generatedMessageLite2)) {
                        u5q0.o(j, generatedMessageLite, u5q0.d.i(j, generatedMessageLite2));
                        L(i2, i, generatedMessageLite);
                    }
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                case 68:
                    x(i, generatedMessageLite, generatedMessageLite2);
                    generatedMessageLite3 = generatedMessageLite;
                    break;
                default:
                    generatedMessageLite3 = generatedMessageLite;
                    break;
            }
            i += 3;
            generatedMessageLite = generatedMessageLite3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void g(T t, byte[] bArr, int i, int i2, d.a aVar) throws IOException {
        if (this.h) {
            G(t, bArr, i, i2, aVar);
        } else {
            F(t, bArr, i, i2, 0, aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int O = O(i);
                long j = O & 1048575;
                switch (N(O)) {
                    case 0:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar2 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar3 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar4 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar5 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar6 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar7 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar8 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar9 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar10 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar11 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar12 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar13 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar14 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar15 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar16 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar17 = u5q0.d;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            u5q0.e eVar18 = u5q0.d;
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
                        u5q0.e eVar19 = u5q0.d;
                        z = b0.y(eVar19.i(j, generatedMessageLite), eVar19.i(j, generatedMessageLite2));
                        break;
                    case 50:
                        u5q0.e eVar20 = u5q0.d;
                        z = b0.y(eVar20.i(j, generatedMessageLite), eVar20.i(j, generatedMessageLite2));
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
                        u5q0.e eVar21 = u5q0.d;
                        if (eVar21.g(j2, generatedMessageLite) == eVar21.g(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                e0<?, ?> e0Var = this.n;
                if (e0Var.g(generatedMessageLite).equals(e0Var.g(generatedMessageLite2))) {
                    if (!this.f) {
                        return true;
                    }
                    l<?> lVar = this.o;
                    return lVar.c(generatedMessageLite).equals(lVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int i(a aVar) {
        return this.h ? r(aVar) : q(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x054e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0be7  */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(T t, Writer writer) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        int[] iArr;
        Map.Entry<?, Object> entry2;
        int length2;
        i iVar = (i) writer;
        iVar.getClass();
        Writer.FieldOrder fieldOrder = Writer.FieldOrder.ASCENDING;
        Writer.FieldOrder fieldOrder2 = Writer.FieldOrder.DESCENDING;
        boolean z = this.f;
        e0<?, ?> e0Var = this.n;
        int i3 = 1048575;
        int[] iArr2 = this.a;
        l<?> lVar = this.o;
        if (fieldOrder == fieldOrder2) {
            e0Var.r(e0Var.g(t), writer);
            if (z) {
                n<?> c = lVar.c(t);
                if (!c.f()) {
                    entry2 = c.c().next();
                    for (length2 = iArr2.length - 3; length2 >= 0; length2 -= 3) {
                        int O = O(length2);
                        int i4 = iArr2[length2];
                        if (entry2 != null) {
                            lVar.a(entry2);
                            if (i4 < 0) {
                                lVar.j(entry2);
                                throw null;
                            }
                        }
                        switch (N(O)) {
                            case 0:
                                if (s(length2, t)) {
                                    iVar.c(i4, u5q0.d.e(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (s(length2, t)) {
                                    iVar.g(i4, u5q0.d.f(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (s(length2, t)) {
                                    iVar.j(i4, u5q0.d.h(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (s(length2, t)) {
                                    iVar.r(i4, u5q0.d.h(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (s(length2, t)) {
                                    iVar.i(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (s(length2, t)) {
                                    iVar.f(i4, u5q0.d.h(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (s(length2, t)) {
                                    iVar.e(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (s(length2, t)) {
                                    iVar.a(i4, u5q0.d.c(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (s(length2, t)) {
                                    R(i4, u5q0.d.i(O & 1048575, t), writer);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (s(length2, t)) {
                                    iVar.k(i4, u5q0.d.i(O & 1048575, t), o(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (s(length2, t)) {
                                    iVar.b(i4, (ByteString) u5q0.d.i(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (s(length2, t)) {
                                    iVar.q(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (s(length2, t)) {
                                    iVar.d(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (s(length2, t)) {
                                    iVar.m(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (s(length2, t)) {
                                    iVar.n(i4, u5q0.d.h(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (s(length2, t)) {
                                    iVar.o(i4, u5q0.d.g(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (s(length2, t)) {
                                    iVar.p(i4, u5q0.d.h(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (s(length2, t)) {
                                    iVar.h(i4, u5q0.d.i(O & 1048575, t), o(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                b0.C(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 19:
                                b0.G(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 20:
                                b0.J(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 21:
                                b0.R(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 22:
                                b0.I(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 23:
                                b0.F(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 24:
                                b0.E(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 25:
                                b0.A(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 26:
                                b0.P(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer);
                                break;
                            case 27:
                                b0.K(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, o(length2));
                                break;
                            case 28:
                                b0.B(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer);
                                break;
                            case 29:
                                b0.Q(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 30:
                                b0.D(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 31:
                                b0.L(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 32:
                                b0.M(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 33:
                                b0.N(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 34:
                                b0.O(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, false);
                                break;
                            case 35:
                                b0.C(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 36:
                                b0.G(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 37:
                                b0.J(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 38:
                                b0.R(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 39:
                                b0.I(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 40:
                                b0.F(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 41:
                                b0.E(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 42:
                                b0.A(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 43:
                                b0.Q(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 44:
                                b0.D(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 45:
                                b0.L(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 46:
                                b0.M(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 47:
                                b0.N(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 48:
                                b0.O(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, true);
                                break;
                            case 49:
                                b0.H(iArr2[length2], (List) u5q0.d.i(O & 1048575, t), writer, o(length2));
                                break;
                            case 50:
                                Q(writer, i4, u5q0.d.i(O & 1048575, t), length2);
                                break;
                            case 51:
                                if (t(i4, length2, t)) {
                                    iVar.c(i4, ((Double) u5q0.d.i(O & 1048575, t)).doubleValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (t(i4, length2, t)) {
                                    iVar.g(i4, ((Float) u5q0.d.i(O & 1048575, t)).floatValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (t(i4, length2, t)) {
                                    iVar.j(i4, C(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (t(i4, length2, t)) {
                                    iVar.r(i4, C(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (t(i4, length2, t)) {
                                    iVar.i(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (t(i4, length2, t)) {
                                    iVar.f(i4, C(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (t(i4, length2, t)) {
                                    iVar.e(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (t(i4, length2, t)) {
                                    iVar.a(i4, ((Boolean) u5q0.d.i(O & 1048575, t)).booleanValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (t(i4, length2, t)) {
                                    R(i4, u5q0.d.i(O & 1048575, t), writer);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (t(i4, length2, t)) {
                                    iVar.k(i4, u5q0.d.i(O & 1048575, t), o(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (t(i4, length2, t)) {
                                    iVar.b(i4, (ByteString) u5q0.d.i(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (t(i4, length2, t)) {
                                    iVar.q(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (t(i4, length2, t)) {
                                    iVar.d(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (t(i4, length2, t)) {
                                    iVar.m(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (t(i4, length2, t)) {
                                    iVar.n(i4, C(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (t(i4, length2, t)) {
                                    iVar.o(i4, B(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (t(i4, length2, t)) {
                                    iVar.p(i4, C(O & 1048575, t));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (t(i4, length2, t)) {
                                    iVar.h(i4, u5q0.d.i(O & 1048575, t), o(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    if (entry2 != null) {
                        return;
                    }
                    lVar.j(entry2);
                    throw null;
                }
            }
            entry2 = null;
            while (length2 >= 0) {
            }
            if (entry2 != null) {
            }
        } else {
            if (!this.h) {
                P(t, writer);
                return;
            }
            if (z) {
                n<?> c2 = lVar.c(t);
                if (!c2.f()) {
                    entry = c2.i().next();
                    length = iArr2.length;
                    i = 0;
                    while (i < length) {
                        int O2 = O(i);
                        int i5 = iArr2[i];
                        if (entry != null) {
                            lVar.a(entry);
                            if (i5 >= 0) {
                                lVar.j(entry);
                                throw null;
                            }
                        }
                        switch (N(O2)) {
                            case 0:
                                i2 = i3;
                                iArr = iArr2;
                                if (!s(i, t)) {
                                    break;
                                } else {
                                    iVar.c(i5, u5q0.d.e(O2 & i2, t));
                                    continue;
                                }
                            case 1:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.g(i5, u5q0.d.f(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 2:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.j(i5, u5q0.d.h(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 3:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.r(i5, u5q0.d.h(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 4:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.i(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 5:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.f(i5, u5q0.d.h(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 6:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.e(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 7:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.a(i5, u5q0.d.c(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 8:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    R(i5, u5q0.d.i(O2 & i2, t), writer);
                                    break;
                                } else {
                                    continue;
                                }
                            case 9:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.k(i5, u5q0.d.i(O2 & i2, t), o(i));
                                    break;
                                } else {
                                    continue;
                                }
                            case 10:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.b(i5, (ByteString) u5q0.d.i(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 11:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.q(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 12:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.d(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 13:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.m(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 14:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.n(i5, u5q0.d.h(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 15:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.o(i5, u5q0.d.g(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 16:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.p(i5, u5q0.d.h(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 17:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, t)) {
                                    iVar.h(i5, u5q0.d.i(O2 & i2, t), o(i));
                                    break;
                                } else {
                                    continue;
                                }
                            case 18:
                                i2 = i3;
                                iArr = iArr2;
                                b0.C(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 19:
                                i2 = i3;
                                iArr = iArr2;
                                b0.G(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 20:
                                i2 = i3;
                                iArr = iArr2;
                                b0.J(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 21:
                                i2 = i3;
                                iArr = iArr2;
                                b0.R(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 22:
                                i2 = i3;
                                iArr = iArr2;
                                b0.I(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 23:
                                i2 = i3;
                                iArr = iArr2;
                                b0.F(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 24:
                                i2 = i3;
                                iArr = iArr2;
                                b0.E(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 25:
                                i2 = i3;
                                iArr = iArr2;
                                b0.A(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 26:
                                i2 = i3;
                                iArr = iArr2;
                                b0.P(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer);
                                continue;
                            case 27:
                                i2 = i3;
                                iArr = iArr2;
                                b0.K(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, o(i));
                                continue;
                            case 28:
                                i2 = i3;
                                iArr = iArr2;
                                b0.B(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer);
                                continue;
                            case 29:
                                i2 = i3;
                                iArr = iArr2;
                                b0.Q(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 30:
                                i2 = i3;
                                iArr = iArr2;
                                b0.D(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 31:
                                i2 = i3;
                                iArr = iArr2;
                                b0.L(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 32:
                                i2 = i3;
                                iArr = iArr2;
                                b0.M(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 33:
                                i2 = i3;
                                iArr = iArr2;
                                b0.N(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 34:
                                i2 = i3;
                                iArr = iArr2;
                                b0.O(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, false);
                                continue;
                            case 35:
                                i2 = i3;
                                iArr = iArr2;
                                b0.C(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 36:
                                i2 = i3;
                                iArr = iArr2;
                                b0.G(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 37:
                                i2 = i3;
                                iArr = iArr2;
                                b0.J(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 38:
                                i2 = i3;
                                iArr = iArr2;
                                b0.R(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 39:
                                i2 = i3;
                                iArr = iArr2;
                                b0.I(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 40:
                                i2 = i3;
                                iArr = iArr2;
                                b0.F(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 41:
                                i2 = i3;
                                iArr = iArr2;
                                b0.E(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 42:
                                i2 = i3;
                                iArr = iArr2;
                                b0.A(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 43:
                                i2 = i3;
                                iArr = iArr2;
                                b0.Q(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 44:
                                i2 = i3;
                                iArr = iArr2;
                                b0.D(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 45:
                                i2 = i3;
                                iArr = iArr2;
                                b0.L(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 46:
                                i2 = i3;
                                iArr = iArr2;
                                b0.M(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 47:
                                i2 = i3;
                                iArr = iArr2;
                                b0.N(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 48:
                                i2 = i3;
                                iArr = iArr2;
                                b0.O(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, true);
                                continue;
                            case 49:
                                i2 = i3;
                                iArr = iArr2;
                                b0.H(iArr[i], (List) u5q0.d.i(O2 & i2, t), writer, o(i));
                                continue;
                            case 50:
                                i2 = i3;
                                iArr = iArr2;
                                Q(writer, i5, u5q0.d.i(O2 & i2, t), i);
                                continue;
                            case 51:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.c(i5, ((Double) u5q0.d.i(O2 & i2, t)).doubleValue());
                                    break;
                                } else {
                                    continue;
                                }
                            case 52:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.g(i5, ((Float) u5q0.d.i(O2 & i2, t)).floatValue());
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.j(i5, C(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.r(i5, C(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 55:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.i(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 56:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.f(i5, C(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 57:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.e(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 58:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.a(i5, ((Boolean) u5q0.d.i(O2 & i2, t)).booleanValue());
                                    break;
                                } else {
                                    continue;
                                }
                            case 59:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    R(i5, u5q0.d.i(O2 & i2, t), writer);
                                    break;
                                } else {
                                    continue;
                                }
                            case 60:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.k(i5, u5q0.d.i(O2 & i2, t), o(i));
                                    break;
                                } else {
                                    continue;
                                }
                            case 61:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.b(i5, (ByteString) u5q0.d.i(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 62:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.q(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 63:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.d(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 64:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.m(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 65:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.n(i5, C(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 66:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.o(i5, B(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 67:
                                i2 = i3;
                                iArr = iArr2;
                                if (t(i5, i, t)) {
                                    iVar.p(i5, C(O2 & i2, t));
                                    break;
                                } else {
                                    continue;
                                }
                            case 68:
                                if (t(i5, i, t)) {
                                    i2 = i3;
                                    iArr = iArr2;
                                    iVar.h(i5, u5q0.d.i(O2 & i3, t), o(i));
                                    break;
                                }
                                break;
                        }
                        i2 = i3;
                        iArr = iArr2;
                        i += 3;
                        i3 = i2;
                        iArr2 = iArr;
                    }
                    if (entry != null) {
                        e0Var.r(e0Var.g(t), writer);
                        return;
                    } else {
                        lVar.j(entry);
                        throw null;
                    }
                }
            }
            entry = null;
            length = iArr2.length;
            i = 0;
            while (i < length) {
            }
            if (entry != null) {
            }
        }
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, Object obj, int i) {
        return s(i, generatedMessageLite) == s(i, obj);
    }

    public final void l(Object obj, int i, Object obj2, e0 e0Var) {
        q.c m;
        int i2 = this.a[i];
        Object i3 = u5q0.d.i(O(i) & 1048575, obj);
        if (i3 == null || (m = m(i)) == null) {
            return;
        }
        il00 il00Var = this.p;
        MapFieldLite d = il00Var.d(i3);
        il00Var.b(n(i));
        for (Map.Entry entry : d.entrySet()) {
            ((Integer) entry.getValue()).getClass();
            if (!m.a()) {
                if (obj2 == null) {
                    e0Var.m();
                }
                entry.getKey();
                entry.getValue();
                dl00.b();
                throw null;
            }
        }
    }

    public final q.c m(int i) {
        return (q.c) this.b[fb20.a(i, 3, 2, 1)];
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final a0 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        a0 a0Var = (a0) objArr[i2];
        if (a0Var != null) {
            return a0Var;
        }
        a0<T> a = t8e0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int q(T t) {
        int i;
        int n;
        int q2;
        int n2;
        int l;
        int j;
        int n3;
        int m;
        int g;
        int n4;
        int i2;
        Unsafe unsafe = r;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                e0<?, ?> e0Var = this.n;
                int h = e0Var.h(e0Var.g(t)) + i5;
                return this.f ? this.o.c(t).e() + h : h;
            }
            int O = O(i4);
            int i7 = iArr[i4];
            int N = N(O);
            if (N <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i6 = unsafe.getInt(t, i9);
                    i3 = i9;
                }
            } else {
                i = 0;
            }
            long j2 = O & 1048575;
            switch (N) {
                case 0:
                    if ((i & i6) != 0) {
                        i5 = x9.a(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i6 & i) != 0) {
                        i5 = x9.a(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i6 & i) != 0) {
                        long j3 = unsafe.getLong(t, j2);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q(j3);
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i6 & i) != 0) {
                        long j4 = unsafe.getLong(t, j2);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q(j4);
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i6 & i) != 0) {
                        int i10 = unsafe.getInt(t, j2);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.l(i10);
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i6 & i) != 0) {
                        j = CodedOutputStream.j(i7);
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i6 & i) != 0) {
                        j = CodedOutputStream.i(i7);
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i6 & i) != 0) {
                        i5 = x9.a(i7, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t, j2);
                        if (object instanceof ByteString) {
                            g = CodedOutputStream.g(i7, (ByteString) object);
                            i5 = g + i5;
                            break;
                        } else {
                            n3 = CodedOutputStream.n(i7);
                            m = CodedOutputStream.m((String) object);
                            g = m + n3;
                            i5 = g + i5;
                        }
                    }
                case 9:
                    if ((i6 & i) != 0) {
                        j = b0.l(i7, unsafe.getObject(t, j2), o(i4));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i6 & i) != 0) {
                        j = CodedOutputStream.g(i7, (ByteString) unsafe.getObject(t, j2));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i6 & i) != 0) {
                        j = CodedOutputStream.o(i7, unsafe.getInt(t, j2));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i6 & i) != 0) {
                        int i11 = unsafe.getInt(t, j2);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.l(i11);
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i6 & i) != 0) {
                        i5 = x9.a(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i & i6) != 0) {
                        i5 = x9.a(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i6 & i) != 0) {
                        int i12 = unsafe.getInt(t, j2);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.p((i12 >> 31) ^ (i12 << 1));
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i6 & i) != 0) {
                        long j5 = unsafe.getLong(t, j2);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q((j5 << 1) ^ (j5 >> 63));
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i6 & i) != 0) {
                        j = CodedOutputStream.k(i7, (ka20) unsafe.getObject(t, j2), o(i4));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = b0.f(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 19:
                    j = b0.d(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 20:
                    j = b0.j(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 21:
                    j = b0.u(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 22:
                    j = b0.h(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 23:
                    j = b0.f(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 24:
                    j = b0.d(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(t, j2);
                    Class<?> cls = b0.a;
                    int size = list.size();
                    n4 = size == 0 ? 0 : (CodedOutputStream.n(i7) + 1) * size;
                    i5 += n4;
                    break;
                case 26:
                    j = b0.r(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 27:
                    j = b0.m(i7, (List) unsafe.getObject(t, j2), o(i4));
                    i5 += j;
                    break;
                case 28:
                    j = b0.a(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 29:
                    j = b0.s(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 30:
                    j = b0.b(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 31:
                    j = b0.d(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 32:
                    j = b0.f(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 33:
                    j = b0.n(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 34:
                    j = b0.p(i7, (List) unsafe.getObject(t, j2));
                    i5 += j;
                    break;
                case 35:
                    int g2 = b0.g((List) unsafe.getObject(t, j2));
                    if (g2 > 0) {
                        i5 = shy.b(g2, CodedOutputStream.n(i7), g2, i5);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = b0.e((List) unsafe.getObject(t, j2));
                    if (e > 0) {
                        i5 = shy.b(e, CodedOutputStream.n(i7), e, i5);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k = b0.k((List) unsafe.getObject(t, j2));
                    if (k > 0) {
                        i5 = shy.b(k, CodedOutputStream.n(i7), k, i5);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int v = b0.v((List) unsafe.getObject(t, j2));
                    if (v > 0) {
                        i5 = shy.b(v, CodedOutputStream.n(i7), v, i5);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i13 = b0.i((List) unsafe.getObject(t, j2));
                    if (i13 > 0) {
                        i5 = shy.b(i13, CodedOutputStream.n(i7), i13, i5);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g3 = b0.g((List) unsafe.getObject(t, j2));
                    if (g3 > 0) {
                        i5 = shy.b(g3, CodedOutputStream.n(i7), g3, i5);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = b0.e((List) unsafe.getObject(t, j2));
                    if (e2 > 0) {
                        i5 = shy.b(e2, CodedOutputStream.n(i7), e2, i5);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(t, j2);
                    Class<?> cls2 = b0.a;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        i5 = shy.b(size2, CodedOutputStream.n(i7), size2, i5);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int t2 = b0.t((List) unsafe.getObject(t, j2));
                    if (t2 > 0) {
                        i5 = shy.b(t2, CodedOutputStream.n(i7), t2, i5);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c = b0.c((List) unsafe.getObject(t, j2));
                    if (c > 0) {
                        i5 = shy.b(c, CodedOutputStream.n(i7), c, i5);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e3 = b0.e((List) unsafe.getObject(t, j2));
                    if (e3 > 0) {
                        i5 = shy.b(e3, CodedOutputStream.n(i7), e3, i5);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g4 = b0.g((List) unsafe.getObject(t, j2));
                    if (g4 > 0) {
                        i5 = shy.b(g4, CodedOutputStream.n(i7), g4, i5);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int o = b0.o((List) unsafe.getObject(t, j2));
                    if (o > 0) {
                        i5 = shy.b(o, CodedOutputStream.n(i7), o, i5);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int q3 = b0.q((List) unsafe.getObject(t, j2));
                    if (q3 > 0) {
                        i5 = shy.b(q3, CodedOutputStream.n(i7), q3, i5);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(t, j2);
                    a0 o2 = o(i4);
                    Class<?> cls3 = b0.a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            i2 += CodedOutputStream.k(i7, (ka20) list3.get(i14), o2);
                        }
                    }
                    i5 += i2;
                    break;
                case 50:
                    j = this.p.g(i7, unsafe.getObject(t, j2), n(i4));
                    i5 += j;
                    break;
                case 51:
                    if (t(i7, i4, t)) {
                        i5 = x9.a(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(i7, i4, t)) {
                        i5 = x9.a(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(i7, i4, t)) {
                        long C = C(j2, t);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q(C);
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(i7, i4, t)) {
                        long C2 = C(j2, t);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q(C2);
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(i7, i4, t)) {
                        int B = B(j2, t);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.l(B);
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(i7, i4, t)) {
                        j = CodedOutputStream.j(i7);
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(i7, i4, t)) {
                        j = CodedOutputStream.i(i7);
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(i7, i4, t)) {
                        i5 = x9.a(i7, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!t(i7, i4, t)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, j2);
                        if (object2 instanceof ByteString) {
                            g = CodedOutputStream.g(i7, (ByteString) object2);
                            i5 = g + i5;
                            break;
                        } else {
                            n3 = CodedOutputStream.n(i7);
                            m = CodedOutputStream.m((String) object2);
                            g = m + n3;
                            i5 = g + i5;
                        }
                    }
                case 60:
                    if (t(i7, i4, t)) {
                        j = b0.l(i7, unsafe.getObject(t, j2), o(i4));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(i7, i4, t)) {
                        j = CodedOutputStream.g(i7, (ByteString) unsafe.getObject(t, j2));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(i7, i4, t)) {
                        j = CodedOutputStream.o(i7, B(j2, t));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(i7, i4, t)) {
                        int B2 = B(j2, t);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.l(B2);
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(i7, i4, t)) {
                        i5 = x9.a(i7, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(i7, i4, t)) {
                        i5 = x9.a(i7, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(i7, i4, t)) {
                        int B3 = B(j2, t);
                        n2 = CodedOutputStream.n(i7);
                        l = CodedOutputStream.p((B3 >> 31) ^ (B3 << 1));
                        j = l + n2;
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(i7, i4, t)) {
                        long C3 = C(j2, t);
                        n = CodedOutputStream.n(i7);
                        q2 = CodedOutputStream.q((C3 << 1) ^ (C3 >> 63));
                        n4 = q2 + n;
                        i5 += n4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(i7, i4, t)) {
                        j = CodedOutputStream.k(i7, (ka20) unsafe.getObject(t, j2), o(i4));
                        i5 += j;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final int r(T t) {
        int n;
        int q2;
        int n2;
        int l;
        int j;
        int n3;
        int m;
        int g;
        int n4;
        int q3;
        int i;
        Unsafe unsafe = r;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                e0<?, ?> e0Var = this.n;
                return e0Var.h(e0Var.g(t)) + i3;
            }
            int O = O(i2);
            int N = N(O);
            int i4 = iArr[i2];
            long j2 = O & 1048575;
            if (N >= FieldType.DOUBLE_LIST_PACKED.h() && N <= FieldType.SINT64_LIST_PACKED.h()) {
                int i5 = iArr[i2 + 2];
            }
            switch (N) {
                case 0:
                    if (s(i2, t)) {
                        i3 = x9.a(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i2, t)) {
                        i3 = x9.a(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(i2, t)) {
                        long h = u5q0.d.h(j2, t);
                        n = CodedOutputStream.n(i4);
                        q2 = CodedOutputStream.q(h);
                        j = q2 + n;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(i2, t)) {
                        long h2 = u5q0.d.h(j2, t);
                        n = CodedOutputStream.n(i4);
                        q2 = CodedOutputStream.q(h2);
                        j = q2 + n;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(i2, t)) {
                        int g2 = u5q0.d.g(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.l(g2);
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(i2, t)) {
                        j = CodedOutputStream.j(i4);
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(i2, t)) {
                        j = CodedOutputStream.i(i4);
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(i2, t)) {
                        i3 = x9.a(i4, 1, i3);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!s(i2, t)) {
                        break;
                    } else {
                        Object i6 = u5q0.d.i(j2, t);
                        if (i6 instanceof ByteString) {
                            g = CodedOutputStream.g(i4, (ByteString) i6);
                            i3 = g + i3;
                            break;
                        } else {
                            n3 = CodedOutputStream.n(i4);
                            m = CodedOutputStream.m((String) i6);
                            g = m + n3;
                            i3 = g + i3;
                        }
                    }
                case 9:
                    if (s(i2, t)) {
                        j = b0.l(i4, u5q0.d.i(j2, t), o(i2));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(i2, t)) {
                        j = CodedOutputStream.g(i4, (ByteString) u5q0.d.i(j2, t));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(i2, t)) {
                        j = CodedOutputStream.o(i4, u5q0.d.g(j2, t));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(i2, t)) {
                        int g3 = u5q0.d.g(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.l(g3);
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(i2, t)) {
                        i3 = x9.a(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(i2, t)) {
                        i3 = x9.a(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(i2, t)) {
                        int g4 = u5q0.d.g(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.p((g4 >> 31) ^ (g4 << 1));
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(i2, t)) {
                        long h3 = u5q0.d.h(j2, t);
                        n4 = CodedOutputStream.n(i4);
                        q3 = CodedOutputStream.q((h3 >> 63) ^ (h3 << 1));
                        j = q3 + n4;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(i2, t)) {
                        j = CodedOutputStream.k(i4, (ka20) u5q0.d.i(j2, t), o(i2));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    j = b0.f(i4, u(j2, t));
                    i3 += j;
                    break;
                case 19:
                    j = b0.d(i4, u(j2, t));
                    i3 += j;
                    break;
                case 20:
                    j = b0.j(i4, u(j2, t));
                    i3 += j;
                    break;
                case 21:
                    j = b0.u(i4, u(j2, t));
                    i3 += j;
                    break;
                case 22:
                    j = b0.h(i4, u(j2, t));
                    i3 += j;
                    break;
                case 23:
                    j = b0.f(i4, u(j2, t));
                    i3 += j;
                    break;
                case 24:
                    j = b0.d(i4, u(j2, t));
                    i3 += j;
                    break;
                case 25:
                    List u = u(j2, t);
                    Class<?> cls = b0.a;
                    int size = u.size();
                    i3 += size == 0 ? 0 : (CodedOutputStream.n(i4) + 1) * size;
                    break;
                case 26:
                    j = b0.r(i4, u(j2, t));
                    i3 += j;
                    break;
                case 27:
                    j = b0.m(i4, u(j2, t), o(i2));
                    i3 += j;
                    break;
                case 28:
                    j = b0.a(i4, u(j2, t));
                    i3 += j;
                    break;
                case 29:
                    j = b0.s(i4, u(j2, t));
                    i3 += j;
                    break;
                case 30:
                    j = b0.b(i4, u(j2, t));
                    i3 += j;
                    break;
                case 31:
                    j = b0.d(i4, u(j2, t));
                    i3 += j;
                    break;
                case 32:
                    j = b0.f(i4, u(j2, t));
                    i3 += j;
                    break;
                case 33:
                    j = b0.n(i4, u(j2, t));
                    i3 += j;
                    break;
                case 34:
                    j = b0.p(i4, u(j2, t));
                    i3 += j;
                    break;
                case 35:
                    int g5 = b0.g((List) unsafe.getObject(t, j2));
                    if (g5 > 0) {
                        i3 = shy.b(g5, CodedOutputStream.n(i4), g5, i3);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = b0.e((List) unsafe.getObject(t, j2));
                    if (e > 0) {
                        i3 = shy.b(e, CodedOutputStream.n(i4), e, i3);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k = b0.k((List) unsafe.getObject(t, j2));
                    if (k > 0) {
                        i3 = shy.b(k, CodedOutputStream.n(i4), k, i3);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int v = b0.v((List) unsafe.getObject(t, j2));
                    if (v > 0) {
                        i3 = shy.b(v, CodedOutputStream.n(i4), v, i3);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i7 = b0.i((List) unsafe.getObject(t, j2));
                    if (i7 > 0) {
                        i3 = shy.b(i7, CodedOutputStream.n(i4), i7, i3);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g6 = b0.g((List) unsafe.getObject(t, j2));
                    if (g6 > 0) {
                        i3 = shy.b(g6, CodedOutputStream.n(i4), g6, i3);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = b0.e((List) unsafe.getObject(t, j2));
                    if (e2 > 0) {
                        i3 = shy.b(e2, CodedOutputStream.n(i4), e2, i3);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(t, j2);
                    Class<?> cls2 = b0.a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        i3 = shy.b(size2, CodedOutputStream.n(i4), size2, i3);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int t2 = b0.t((List) unsafe.getObject(t, j2));
                    if (t2 > 0) {
                        i3 = shy.b(t2, CodedOutputStream.n(i4), t2, i3);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c = b0.c((List) unsafe.getObject(t, j2));
                    if (c > 0) {
                        i3 = shy.b(c, CodedOutputStream.n(i4), c, i3);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e3 = b0.e((List) unsafe.getObject(t, j2));
                    if (e3 > 0) {
                        i3 = shy.b(e3, CodedOutputStream.n(i4), e3, i3);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g7 = b0.g((List) unsafe.getObject(t, j2));
                    if (g7 > 0) {
                        i3 = shy.b(g7, CodedOutputStream.n(i4), g7, i3);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int o = b0.o((List) unsafe.getObject(t, j2));
                    if (o > 0) {
                        i3 = shy.b(o, CodedOutputStream.n(i4), o, i3);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int q4 = b0.q((List) unsafe.getObject(t, j2));
                    if (q4 > 0) {
                        i3 = shy.b(q4, CodedOutputStream.n(i4), q4, i3);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List u2 = u(j2, t);
                    a0 o2 = o(i2);
                    Class<?> cls3 = b0.a;
                    int size3 = u2.size();
                    if (size3 == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i8 = 0; i8 < size3; i8++) {
                            i += CodedOutputStream.k(i4, (ka20) u2.get(i8), o2);
                        }
                    }
                    i3 += i;
                    break;
                case 50:
                    j = this.p.g(i4, u5q0.d.i(j2, t), n(i2));
                    i3 += j;
                    break;
                case 51:
                    if (t(i4, i2, t)) {
                        i3 = x9.a(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(i4, i2, t)) {
                        i3 = x9.a(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(i4, i2, t)) {
                        long C = C(j2, t);
                        n = CodedOutputStream.n(i4);
                        q2 = CodedOutputStream.q(C);
                        j = q2 + n;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(i4, i2, t)) {
                        long C2 = C(j2, t);
                        n = CodedOutputStream.n(i4);
                        q2 = CodedOutputStream.q(C2);
                        j = q2 + n;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(i4, i2, t)) {
                        int B = B(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.l(B);
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(i4, i2, t)) {
                        j = CodedOutputStream.j(i4);
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(i4, i2, t)) {
                        j = CodedOutputStream.i(i4);
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(i4, i2, t)) {
                        i3 = x9.a(i4, 1, i3);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!t(i4, i2, t)) {
                        break;
                    } else {
                        Object i9 = u5q0.d.i(j2, t);
                        if (i9 instanceof ByteString) {
                            g = CodedOutputStream.g(i4, (ByteString) i9);
                            i3 = g + i3;
                            break;
                        } else {
                            n3 = CodedOutputStream.n(i4);
                            m = CodedOutputStream.m((String) i9);
                            g = m + n3;
                            i3 = g + i3;
                        }
                    }
                case 60:
                    if (t(i4, i2, t)) {
                        j = b0.l(i4, u5q0.d.i(j2, t), o(i2));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(i4, i2, t)) {
                        j = CodedOutputStream.g(i4, (ByteString) u5q0.d.i(j2, t));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(i4, i2, t)) {
                        j = CodedOutputStream.o(i4, B(j2, t));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(i4, i2, t)) {
                        int B2 = B(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.l(B2);
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(i4, i2, t)) {
                        i3 = x9.a(i4, 4, i3);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(i4, i2, t)) {
                        i3 = x9.a(i4, 8, i3);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(i4, i2, t)) {
                        int B3 = B(j2, t);
                        n2 = CodedOutputStream.n(i4);
                        l = CodedOutputStream.p((B3 >> 31) ^ (B3 << 1));
                        j = l + n2;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(i4, i2, t)) {
                        long C3 = C(j2, t);
                        n4 = CodedOutputStream.n(i4);
                        q3 = CodedOutputStream.q((C3 >> 63) ^ (C3 << 1));
                        j = q3 + n4;
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(i4, i2, t)) {
                        j = CodedOutputStream.k(i4, (ka20) u5q0.d.i(j2, t), o(i2));
                        i3 += j;
                        break;
                    } else {
                        break;
                    }
            }
            i2 += 3;
        }
    }

    public final boolean s(int i, Object obj) {
        if (this.h) {
            int O = O(i);
            long j = O & 1048575;
            switch (N(O)) {
                case 0:
                    if (u5q0.d.e(j, obj) == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        return false;
                    }
                    break;
                case 1:
                    if (u5q0.d.f(j, obj) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return false;
                    }
                    break;
                case 2:
                    if (u5q0.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (u5q0.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (u5q0.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return u5q0.d.c(j, obj);
                case 8:
                    Object i2 = u5q0.d.i(j, obj);
                    if (i2 instanceof String) {
                        return !((String) i2).isEmpty();
                    }
                    if (i2 instanceof ByteString) {
                        return !ByteString.b.equals(i2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (u5q0.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.b.equals(u5q0.d.i(j, obj));
                case 11:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (u5q0.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (u5q0.d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (u5q0.d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (u5q0.d.i(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((u5q0.d.g(r6 & 1048575, obj) & (1 << (this.a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean t(int i, int i2, Object obj) {
        return u5q0.d.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final <K, V> void v(Object obj, int i, Object obj2, k kVar, v7f0 v7f0Var) throws IOException {
        long O = O(i) & 1048575;
        Object i2 = u5q0.d.i(O, obj);
        il00 il00Var = this.p;
        if (i2 == null) {
            i2 = il00Var.f();
            u5q0.o(O, obj, i2);
        } else if (il00Var.h(i2)) {
            MapFieldLite f = il00Var.f();
            il00Var.a(f, i2);
            u5q0.o(O, obj, f);
            i2 = f;
        }
        il00Var.d(i2);
        il00Var.b(obj2);
        v7f0Var.G();
        throw null;
    }

    public final void w(int i, Object obj, Object obj2) {
        long O = O(i) & 1048575;
        if (s(i, obj2)) {
            u5q0.e eVar = u5q0.d;
            Object i2 = eVar.i(O, obj);
            Object i3 = eVar.i(O, obj2);
            if (i2 != null && i3 != null) {
                u5q0.o(O, obj, q.c(i2, i3));
                K(i, obj);
            } else if (i3 != null) {
                u5q0.o(O, obj, i3);
                K(i, obj);
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int O = O(i);
        int i2 = this.a[i];
        long j = O & 1048575;
        if (t(i2, i, obj2)) {
            u5q0.e eVar = u5q0.d;
            Object i3 = eVar.i(j, obj);
            Object i4 = eVar.i(j, obj2);
            if (i3 != null && i4 != null) {
                u5q0.o(j, obj, q.c(i3, i4));
                L(i2, i, obj);
            } else if (i4 != null) {
                u5q0.o(j, obj, i4);
                L(i2, i, obj);
            }
        }
    }
}
