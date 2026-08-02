package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.Writer;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.t;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.proto.PublisherConfiguration;
import sun.misc.Unsafe;
import xsna.byy;
import xsna.cqi;
import xsna.fb20;
import xsna.la20;
import xsna.lez;
import xsna.m8h0;
import xsna.mye0;
import xsna.pqy;
import xsna.q760;
import xsna.t33;
import xsna.v8e0;
import xsna.w5q0;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class x<T> implements m8h0<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = w5q0.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final la20 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final q760 k;
    public final lez l;
    public final e0<?, ?> m;
    public final k<?> n;
    public final u o;

    public x(int[] iArr, Object[] objArr, int i, int i2, la20 la20Var, int[] iArr2, int i3, int i4, q760 q760Var, lez lezVar, e0 e0Var, k kVar, u uVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = la20Var instanceof GeneratedMessageLite;
        this.f = kVar != null && kVar.e(la20Var);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = q760Var;
        this.l = lezVar;
        this.m = e0Var;
        this.n = kVar;
        this.e = la20Var;
        this.o = uVar;
    }

    public static long A(long j, Object obj) {
        return ((Long) w5q0.c.h(j, obj)).longValue();
    }

    public static Field F(Class<?> cls, String str) {
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

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void O(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            ((h) writer).a.G(i, (String) obj);
        } else {
            ((h) writer).a(i, (ByteString) obj);
        }
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).j();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> x<T> x(mye0 mye0Var, q760 q760Var, lez lezVar, e0<?, ?> e0Var, k<?> kVar, u uVar) {
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
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        Object[] objArr2;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field F;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field F2;
        Field F3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = mye0Var.b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str2.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt14 = str2.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i32;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = p;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = str2.charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = str2.charAt(i37);
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
            int charAt17 = str2.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = str2.charAt(i40);
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
            int charAt18 = str2.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = str2.charAt(i43);
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
            int charAt19 = str2.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = str2.charAt(i46);
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
            charAt = str2.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = str2.charAt(i49);
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
            int charAt20 = str2.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = str2.charAt(i52);
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
            int charAt21 = str2.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = str2.charAt(i55);
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
            int charAt22 = str2.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = str2.charAt(i58);
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
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i61 = (charAt16 * 2) + charAt17;
            int i62 = charAt20;
            i2 = charAt18;
            i3 = i62;
            i4 = charAt16;
            i34 = i58;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i61;
            i7 = charAt22;
        }
        Unsafe unsafe = q;
        Object[] objArr3 = mye0Var.c;
        Class<?> cls = mye0Var.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr4 = new Object[charAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            int i69 = length;
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    charAt13 = str2.charAt(i71);
                    objArr = objArr3;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                    objArr3 = objArr;
                }
                charAt23 = i70 | (charAt13 << i72);
                i16 = i31;
            } else {
                objArr = objArr3;
                i16 = i68;
            }
            int i73 = i16 + 1;
            int charAt24 = str2.charAt(i16);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i29 = i75 + 1;
                    charAt12 = str2.charAt(i75);
                    i30 = i74;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i74 = i30 | ((charAt12 & 8191) << i76);
                    i76 += 13;
                    i75 = i29;
                }
                charAt24 = i30 | (charAt12 << i76);
                i17 = i29;
            } else {
                i17 = i73;
            }
            int i77 = charAt23;
            int i78 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i79 = i4;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        charAt11 = str2.charAt(i80);
                        if (charAt11 < c) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i80 = i28;
                        c = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i82);
                    i80 = i28;
                }
                int i83 = i78 - 51;
                int i84 = charAt25;
                if (i83 == 9 || i83 == 17) {
                    i27 = i80;
                    objArr4[fb20.a(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i83 != 12 || (!mye0Var.getSyntax().equals(ProtoSyntax.PROTO2) && (charAt24 & 2048) == 0)) {
                    i27 = i80;
                } else {
                    i27 = i80;
                    objArr4[fb20.a(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    F2 = (Field) obj;
                } else {
                    F2 = F(cls, (String) obj);
                    objArr[i85] = F2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    F3 = (Field) obj2;
                } else {
                    F3 = F(cls, (String) obj2);
                    objArr[i87] = F3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                str = str2;
                objectFieldOffset = objectFieldOffset2;
                i21 = i66;
                i23 = i27;
                i22 = objectFieldOffset3;
                i18 = i86;
                objArr2 = objArr4;
                i24 = 0;
            } else {
                int i88 = i63;
                int i89 = i6 + 1;
                Field F4 = F(cls, (String) objArr[i6]);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr4[fb20.a(i66, 3, 2, 1)] = F4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr4[fb20.a(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (mye0Var.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i26 = i6 + 2;
                            objArr4[fb20.a(i66, 3, 2, 1)] = objArr[i89];
                        }
                    } else if (i78 == 50) {
                        int i90 = i65 + 1;
                        iArr[i65] = i66;
                        int i91 = (i66 / 3) * 2;
                        int i92 = i6 + 2;
                        objArr4[i91] = objArr[i89];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr4[i91 + 1] = objArr[i92];
                            i18 = i88;
                            objArr2 = objArr4;
                            i65 = i90;
                        } else {
                            i19 = i92;
                            i65 = i90;
                            i18 = i88;
                            objArr2 = objArr4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            str = str2;
                            i20 = i19;
                            i21 = i66;
                            i22 = 1048575;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            i23 = i17 + 1;
                            int charAt26 = str2.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i93 = charAt26 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i25 = i23 + 1;
                                    charAt10 = str2.charAt(i23);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i93 |= (charAt10 & 8191) << i94;
                                    i94 += 13;
                                    i23 = i25;
                                }
                                charAt26 = i93 | (charAt10 << i94);
                                i23 = i25;
                            }
                            int i95 = (charAt26 / 32) + (i79 * 2);
                            Object obj3 = objArr[i95];
                            str = str2;
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr[i95] = F;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(F);
                            i24 = charAt26 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                    } else {
                        i18 = i88;
                    }
                    objArr2 = objArr4;
                    i19 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i20 = i19;
                    i21 = i66;
                    i22 = 1048575;
                    i23 = i17;
                    i24 = 0;
                    if (i78 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                }
                objArr2 = objArr4;
                i19 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i20 = i19;
                i21 = i66;
                i22 = 1048575;
                i23 = i17;
                i24 = 0;
                if (i78 >= 18) {
                }
            }
            int i96 = i21 + 1;
            iArr4[i21] = i77;
            int i97 = i21 + 2;
            int i98 = i21;
            iArr4[i96] = ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i66 = i98 + 3;
            iArr4[i97] = (i24 << 20) | i22;
            objArr4 = objArr2;
            i34 = i23;
            length = i69;
            iArr3 = iArr4;
            objArr3 = objArr;
            i63 = i18;
            i6 = i20;
            i4 = i79;
            str2 = str;
        }
        la20 la20Var = mye0Var.a;
        mye0Var.getSyntax();
        return new x<>(iArr3, objArr4, i2, i5, la20Var, iArr, i7, i63, q760Var, lezVar, e0Var, kVar, uVar);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) w5q0.c.h(j, obj)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Object obj, long j, g gVar, m8h0 m8h0Var, j jVar) throws IOException {
        int v;
        p.c c = this.l.c(j, obj);
        f fVar = gVar.a;
        int i = gVar.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            Object b = m8h0Var.b();
            gVar.b(b, m8h0Var, jVar);
            m8h0Var.d(b);
            c.add(b);
            if (fVar.c() || gVar.d != 0) {
                return;
            } else {
                v = fVar.v();
            }
        } while (v == i);
        gVar.d = v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Object obj, int i, g gVar, m8h0 m8h0Var, j jVar) throws IOException {
        int v;
        p.c c = this.l.c(i & 1048575, obj);
        f fVar = gVar.a;
        int i2 = gVar.b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            Object b = m8h0Var.b();
            gVar.c(b, m8h0Var, jVar);
            m8h0Var.d(b);
            c.add(b);
            if (fVar.c() || gVar.d != 0) {
                return;
            } else {
                v = fVar.v();
            }
        } while (v == i2);
        gVar.d = v;
    }

    public final void D(Object obj, int i, g gVar) throws IOException {
        if ((536870912 & i) != 0) {
            gVar.w(2);
            w5q0.o(i & 1048575, obj, gVar.a.u());
        } else if (!this.g) {
            w5q0.o(i & 1048575, obj, gVar.e());
        } else {
            gVar.w(2);
            w5q0.o(i & 1048575, obj, gVar.a.t());
        }
    }

    public final void E(Object obj, int i, g gVar) throws IOException {
        int i2 = 536870912 & i;
        lez lezVar = this.l;
        if (i2 != 0) {
            gVar.s(lezVar.c(i & 1048575, obj), true);
        } else {
            gVar.s(lezVar.c(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return;
        }
        w5q0.m((1 << (i2 >>> 20)) | w5q0.c.f(j, obj), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        w5q0.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i, la20 la20Var) {
        q.putObject(obj, L(i) & 1048575, la20Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, la20 la20Var) {
        q.putObject(obj, L(i2) & 1048575, la20Var);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(T t, Writer writer) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        x<T> xVar = this;
        boolean z3 = xVar.f;
        k<?> kVar = xVar.n;
        if (z3) {
            m<?> c = kVar.c(t);
            if (!c.a.isEmpty()) {
                entry = c.g().next();
                int[] iArr = xVar.a;
                length = iArr.length;
                Unsafe unsafe = q;
                int i4 = 1048575;
                int i5 = 0;
                for (i = 0; i < length; i += 3) {
                    int L = xVar.L(i);
                    int i6 = iArr[i];
                    int K = K(L);
                    if (K <= 17) {
                        int i7 = iArr[i + 2];
                        z = 1;
                        int i8 = i7 & 1048575;
                        if (i8 != i4) {
                            i5 = i8 == 1048575 ? 0 : unsafe.getInt(t, i8);
                            i4 = i8;
                        }
                        i2 = L;
                        i3 = 1 << (i7 >>> 20);
                    } else {
                        z = 1;
                        i2 = L;
                        i3 = 0;
                    }
                    if (entry != null) {
                        kVar.a(entry);
                        if (i6 >= 0) {
                            kVar.j(entry);
                            throw null;
                        }
                    }
                    long j = i2 & 1048575;
                    switch (K) {
                        case 0:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                double d = w5q0.c.d(j, t);
                                CodedOutputStream codedOutputStream = ((h) writer).a;
                                codedOutputStream.getClass();
                                codedOutputStream.y(i6, Double.doubleToRawLongBits(d));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                float e = w5q0.c.e(j, t);
                                CodedOutputStream codedOutputStream2 = ((h) writer).a;
                                codedOutputStream2.getClass();
                                codedOutputStream2.w(i6, Float.floatToRawIntBits(e));
                            }
                            xVar = this;
                            break;
                        case 2:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.L(i6, unsafe.getLong(t, j));
                            }
                            xVar = this;
                            break;
                        case 3:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.L(i6, unsafe.getLong(t, j));
                            }
                            xVar = this;
                            break;
                        case 4:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.A(i6, unsafe.getInt(t, j));
                            }
                            xVar = this;
                            break;
                        case 5:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.y(i6, unsafe.getLong(t, j));
                            }
                            xVar = this;
                            break;
                        case 6:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.w(i6, unsafe.getInt(t, j));
                            }
                            xVar = this;
                            break;
                        case 7:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.s(i6, w5q0.c.c(j, t));
                            }
                            xVar = this;
                            break;
                        case 8:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                O(i6, unsafe.getObject(t, j), writer);
                            }
                            xVar = this;
                            break;
                        case 9:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.C(i6, (la20) unsafe.getObject(t, j), xVar.n(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a(i6, (ByteString) unsafe.getObject(t, j));
                            }
                            xVar = this;
                            break;
                        case 11:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.J(i6, unsafe.getInt(t, j));
                            }
                            xVar = this;
                            break;
                        case 12:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.A(i6, unsafe.getInt(t, j));
                            }
                            xVar = this;
                            break;
                        case 13:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.w(i6, unsafe.getInt(t, j));
                            }
                            xVar = this;
                            break;
                        case 14:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).a.y(i6, unsafe.getLong(t, j));
                            }
                            xVar = this;
                            break;
                        case 15:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                int i9 = unsafe.getInt(t, j);
                                ((h) writer).a.J(i6, (i9 >> 31) ^ (i9 << 1));
                            }
                            xVar = this;
                            break;
                        case 16:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                long j2 = unsafe.getLong(t, j);
                                ((h) writer).a.L(i6, (j2 << 1) ^ (j2 >> 63));
                            }
                            xVar = this;
                            break;
                        case 17:
                            if (xVar.p(t, i, i4, i5, i3)) {
                                ((h) writer).b(i6, unsafe.getObject(t, j), xVar.n(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z2 = false;
                            b0.o(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 19:
                            z2 = false;
                            b0.s(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 20:
                            z2 = false;
                            b0.v(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 21:
                            z2 = false;
                            b0.D(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 22:
                            z2 = false;
                            b0.u(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 23:
                            z2 = false;
                            b0.r(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 24:
                            z2 = false;
                            b0.q(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 25:
                            z2 = false;
                            b0.m(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 26:
                            b0.B(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 27:
                            b0.w(iArr[i], (List) unsafe.getObject(t, j), writer, xVar.n(i));
                            break;
                        case 28:
                            b0.n(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 29:
                            z2 = false;
                            b0.C(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 30:
                            z2 = false;
                            b0.p(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 31:
                            z2 = false;
                            b0.x(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 32:
                            z2 = false;
                            b0.y(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 33:
                            z2 = false;
                            b0.z(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 34:
                            z2 = false;
                            b0.A(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 35:
                            b0.o(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 36:
                            b0.s(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 37:
                            b0.v(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 38:
                            b0.D(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 39:
                            b0.u(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 40:
                            b0.r(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 41:
                            b0.q(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 42:
                            b0.m(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 43:
                            b0.C(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 44:
                            b0.p(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 45:
                            b0.x(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 46:
                            b0.y(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 47:
                            b0.z(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 48:
                            b0.A(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 49:
                            b0.t(iArr[i], (List) unsafe.getObject(t, j), writer, xVar.n(i));
                            break;
                        case 50:
                            xVar.N(writer, i6, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (xVar.r(i6, i, t)) {
                                double doubleValue = ((Double) w5q0.c.h(j, t)).doubleValue();
                                CodedOutputStream codedOutputStream3 = ((h) writer).a;
                                codedOutputStream3.getClass();
                                codedOutputStream3.y(i6, Double.doubleToRawLongBits(doubleValue));
                            }
                            break;
                        case 52:
                            if (xVar.r(i6, i, t)) {
                                float floatValue = ((Float) w5q0.c.h(j, t)).floatValue();
                                CodedOutputStream codedOutputStream4 = ((h) writer).a;
                                codedOutputStream4.getClass();
                                codedOutputStream4.w(i6, Float.floatToRawIntBits(floatValue));
                            }
                            break;
                        case 53:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.L(i6, A(j, t));
                            }
                            break;
                        case 54:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.L(i6, A(j, t));
                            }
                            break;
                        case 55:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.A(i6, z(j, t));
                            }
                            break;
                        case 56:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.y(i6, A(j, t));
                            }
                            break;
                        case 57:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.w(i6, z(j, t));
                            }
                            break;
                        case 58:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.s(i6, ((Boolean) w5q0.c.h(j, t)).booleanValue());
                            }
                            break;
                        case 59:
                            if (xVar.r(i6, i, t)) {
                                O(i6, unsafe.getObject(t, j), writer);
                            }
                            break;
                        case 60:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.C(i6, (la20) unsafe.getObject(t, j), xVar.n(i));
                            }
                            break;
                        case 61:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a(i6, (ByteString) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.J(i6, z(j, t));
                            }
                            break;
                        case 63:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.A(i6, z(j, t));
                            }
                            break;
                        case 64:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.w(i6, z(j, t));
                            }
                            break;
                        case 65:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).a.y(i6, A(j, t));
                            }
                            break;
                        case 66:
                            if (xVar.r(i6, i, t)) {
                                int z4 = z(j, t);
                                ((h) writer).a.J(i6, (z4 >> 31) ^ (z4 << 1));
                            }
                            break;
                        case 67:
                            if (xVar.r(i6, i, t)) {
                                long A = A(j, t);
                                ((h) writer).a.L(i6, (A << z) ^ (A >> 63));
                            }
                            break;
                        case 68:
                            if (xVar.r(i6, i, t)) {
                                ((h) writer).b(i6, unsafe.getObject(t, j), xVar.n(i));
                            }
                            break;
                    }
                }
                if (entry == null) {
                    kVar.j(entry);
                    throw null;
                }
                e0<?, ?> e0Var = xVar.m;
                e0Var.r(e0Var.g(t), writer);
                return;
            }
        }
        entry = null;
        int[] iArr2 = xVar.a;
        length = iArr2.length;
        Unsafe unsafe2 = q;
        int i42 = 1048575;
        int i52 = 0;
        while (i < length) {
        }
        if (entry == null) {
        }
    }

    public final <K, V> void N(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object m = m(i2);
            u uVar = this.o;
            t.a<?, ?> b = uVar.b(m);
            MapFieldLite e = uVar.e(obj);
            CodedOutputStream codedOutputStream = ((h) writer).a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : e.entrySet()) {
                codedOutputStream.I(i, 2);
                codedOutputStream.K(t.a(b, entry.getKey(), entry.getValue()));
                t.b(codedOutputStream, b, entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.m8h0
    public final void a(T t, T t2) {
        T t3;
        if (!q(t)) {
            throw new IllegalArgumentException(cqi.c(t, "Mutating immutable message: "));
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = b0.a;
                e0<?, ?> e0Var = this.m;
                e0Var.o(t4, e0Var.k(e0Var.g(t4), e0Var.g(t2)));
                if (this.f) {
                    b0.k(this.n, t4, t2);
                    return;
                }
                return;
            }
            int L = L(i);
            long j = 1048575 & L;
            int i2 = iArr[i];
            switch (K(L)) {
                case 0:
                    if (o(i, t2)) {
                        w5q0.e eVar = w5q0.c;
                        t3 = t;
                        eVar.l(t3, j, eVar.d(j, t2));
                        G(i, t3);
                        break;
                    }
                    t3 = t;
                    break;
                case 1:
                    if (o(i, t2)) {
                        w5q0.e eVar2 = w5q0.c;
                        eVar2.m(t, j, eVar2.e(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (o(i, t2)) {
                        w5q0.n(t, j, w5q0.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (o(i, t2)) {
                        w5q0.n(t, j, w5q0.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (o(i, t2)) {
                        w5q0.n(t, j, w5q0.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (o(i, t2)) {
                        w5q0.e eVar3 = w5q0.c;
                        eVar3.j(j, t, eVar3.c(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (o(i, t2)) {
                        w5q0.o(j, t, w5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    t(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (o(i, t2)) {
                        w5q0.o(j, t, w5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (o(i, t2)) {
                        w5q0.n(t, j, w5q0.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (o(i, t2)) {
                        w5q0.m(w5q0.c.f(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (o(i, t2)) {
                        w5q0.n(t, j, w5q0.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    t(i, t, t2);
                    t3 = t;
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
                    this.l.b(j, t, t2);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = b0.a;
                    w5q0.e eVar4 = w5q0.c;
                    w5q0.o(j, t, this.o.a(eVar4.h(j, t), eVar4.h(j, t2)));
                    t3 = t;
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
                    if (r(i2, i, t2)) {
                        w5q0.o(j, t, w5q0.c.h(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 60:
                    u(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i2, i, t2)) {
                        w5q0.o(j, t, w5q0.c.h(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 68:
                    u(i, t, t2);
                    t3 = t;
                    break;
                default:
                    t3 = t;
                    break;
            }
            i += 3;
            t = t3;
        }
    }

    @Override // xsna.m8h0
    public final T b() {
        return (T) this.k.a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.m8h0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.m8h0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [xsna.m8h0] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [xsna.m8h0] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // xsna.m8h0
    public final boolean c(T t) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.i) {
            int i7 = this.h[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int L = L(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(t, i10);
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
            if ((268435456 & L) == 0 || p(t, i2, i, i3, i11)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (p(t, i2, i, i3, i11)) {
                        if (!n(i2).c(w5q0.c.h(L & 1048575, t))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (r(i8, i2, t)) {
                                if (!n(i2).c(w5q0.c.h(L & 1048575, t))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h = w5q0.c.h(L & 1048575, t);
                                u uVar = this.o;
                                MapFieldLite e = uVar.e(h);
                                if (!e.isEmpty() && uVar.b(m(i2)).b.h() == WireFormat$JavaType.MESSAGE) {
                                    ?? r5 = 0;
                                    for (Object obj : e.values()) {
                                        r5 = r5;
                                        if (r5 == 0) {
                                            r5 = v8e0.c.a(obj.getClass());
                                        }
                                        if (!r5.c(obj)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) w5q0.c.h(L & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? n = n(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (n.c(list.get(i13))) {
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
        if (this.f) {
            this.n.c(t).e();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m8h0
    public final void d(T t) {
        if (q(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.e(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.k();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
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
                                this.l.a(j, t);
                                break;
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.o.c(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (r(iArr[i], i, t)) {
                        n(i).d(q.getObject(t, j));
                    }
                }
                if (o(i, t)) {
                    n(i).d(q.getObject(t, j));
                }
            }
            this.m.j(t);
            if (this.f) {
                this.n.f(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m8h0
    public final int e(a aVar) {
        int i;
        int n;
        int n2;
        int n3;
        int p2;
        int n4;
        int p3;
        int n5;
        int n6;
        int n7;
        int d;
        int o;
        int n8;
        int j;
        int h;
        int n9;
        int d2;
        int c;
        int n10;
        int size;
        int i2;
        int n11;
        int n12;
        int size2;
        int n13;
        int o2;
        int i3;
        int n14;
        int n15;
        int p4;
        x<T> xVar = this;
        T t = aVar;
        Unsafe unsafe = q;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = xVar.a;
            if (i4 >= iArr.length) {
                e0<?, ?> e0Var = xVar.m;
                int h2 = e0Var.h(e0Var.g(t)) + i6;
                if (!xVar.f) {
                    return h2;
                }
                c0 c0Var = xVar.n.c(t).a;
                int size3 = c0Var.b.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    Map.Entry<m.b<Object>, Object> c2 = c0Var.c(i9);
                    i8 += m.c(c2.getKey(), c2.getValue());
                }
                for (Map.Entry entry : c0Var.d()) {
                    i8 += m.c((m.b) entry.getKey(), entry.getValue());
                }
                return h2 + i8;
            }
            int L = xVar.L(i4);
            int K = K(L);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (K <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(t, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            long j2 = L & 1048575;
            if (K >= FieldType.DOUBLE_LIST_PACKED.h()) {
                FieldType.SINT64_LIST_PACKED.h();
            }
            switch (K) {
                case 0:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n = CodedOutputStream.n(i10);
                        c = n + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n2 = CodedOutputStream.n(i10);
                        n6 = n2 + 4;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 2:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(t, j2);
                        n3 = CodedOutputStream.n(i10);
                        p2 = CodedOutputStream.p(j3);
                        i6 += p2 + n3;
                    }
                    xVar = this;
                    break;
                case 3:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(t, j2);
                        n3 = CodedOutputStream.n(i10);
                        p2 = CodedOutputStream.p(j4);
                        i6 += p2 + n3;
                    }
                    xVar = this;
                    break;
                case 4:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(t, j2);
                        n4 = CodedOutputStream.n(i10);
                        p3 = CodedOutputStream.p(i13);
                        h = p3 + n4;
                        i6 += h;
                    }
                    xVar = this;
                    break;
                case 5:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n5 = CodedOutputStream.n(i10);
                        n6 = n5 + 8;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 6:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n2 = CodedOutputStream.n(i10);
                        n6 = n2 + 4;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 7:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n6 = CodedOutputStream.n(i10) + 1;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 8:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(t, j2);
                        i6 = (object instanceof ByteString ? CodedOutputStream.h(i10, (ByteString) object) : CodedOutputStream.m((String) object) + CodedOutputStream.n(i10)) + i6;
                    }
                    xVar = this;
                    break;
                case 9:
                    if (!xVar.p(t, i4, i7, i5, i)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, j2);
                        m8h0 n16 = xVar.n(i4);
                        Class<?> cls = b0.a;
                        if (object2 instanceof pqy) {
                            n8 = CodedOutputStream.n(i10);
                            j = CodedOutputStream.j((pqy) object2);
                            c = j + n8;
                            i6 += c;
                            break;
                        } else {
                            n7 = CodedOutputStream.n(i10);
                            d = ((a) ((la20) object2)).d(n16);
                            o = CodedOutputStream.o(d);
                            c = o + d + n7;
                            i6 += c;
                        }
                    }
                case 10:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        h = CodedOutputStream.h(i10, (ByteString) unsafe.getObject(t, j2));
                        i6 += h;
                    }
                    xVar = this;
                    break;
                case 11:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(t, j2);
                        n4 = CodedOutputStream.n(i10);
                        p3 = CodedOutputStream.o(i14);
                        h = p3 + n4;
                        i6 += h;
                    }
                    xVar = this;
                    break;
                case 12:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(t, j2);
                        n4 = CodedOutputStream.n(i10);
                        p3 = CodedOutputStream.p(i15);
                        h = p3 + n4;
                        i6 += h;
                    }
                    xVar = this;
                    break;
                case 13:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n2 = CodedOutputStream.n(i10);
                        n6 = n2 + 4;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 14:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        n5 = CodedOutputStream.n(i10);
                        n6 = n5 + 8;
                        i6 += n6;
                    }
                    xVar = this;
                    t = aVar;
                    break;
                case 15:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(t, j2);
                        n4 = CodedOutputStream.n(i10);
                        p3 = CodedOutputStream.k(i16);
                        h = p3 + n4;
                        i6 += h;
                    }
                    xVar = this;
                    break;
                case 16:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        long j5 = unsafe.getLong(t, j2);
                        n3 = CodedOutputStream.n(i10);
                        p2 = CodedOutputStream.l(j5);
                        i6 += p2 + n3;
                    }
                    xVar = this;
                    break;
                case 17:
                    if (xVar.p(t, i4, i7, i5, i)) {
                        la20 la20Var = (la20) unsafe.getObject(t, j2);
                        m8h0 n17 = xVar.n(i4);
                        n9 = CodedOutputStream.n(i10) * 2;
                        d2 = ((a) la20Var).d(n17);
                        c = d2 + n9;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = b0.c(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 19:
                    c = b0.b(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t, j2);
                    Class<?> cls2 = b0.a;
                    if (list.size() != 0) {
                        n10 = (CodedOutputStream.n(i10) * list.size()) + b0.e(list);
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 21:
                    List list2 = (List) unsafe.getObject(t, j2);
                    Class<?> cls3 = b0.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = b0.i(list2);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 22:
                    List list3 = (List) unsafe.getObject(t, j2);
                    Class<?> cls4 = b0.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = b0.d(list3);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 23:
                    c = b0.c(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 24:
                    c = b0.b(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t, j2);
                    Class<?> cls5 = b0.a;
                    int size4 = list4.size();
                    i6 += size4 == 0 ? 0 : (CodedOutputStream.n(i10) + 1) * size4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t, j2);
                    Class<?> cls6 = b0.a;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        n10 = CodedOutputStream.n(i10) * size5;
                        if (list5 instanceof byy) {
                            byy byyVar = (byy) list5;
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object D0 = byyVar.D0();
                                n10 = (D0 instanceof ByteString ? CodedOutputStream.i((ByteString) D0) : CodedOutputStream.m((String) D0)) + n10;
                            }
                        } else {
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object obj = list5.get(i18);
                                n10 = (obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.m((String) obj)) + n10;
                            }
                        }
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 27:
                    List list6 = (List) unsafe.getObject(t, j2);
                    m8h0 n18 = xVar.n(i4);
                    Class<?> cls7 = b0.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        n12 = 0;
                    } else {
                        n12 = CodedOutputStream.n(i10) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            Object obj2 = list6.get(i19);
                            if (obj2 instanceof pqy) {
                                n12 = CodedOutputStream.j((pqy) obj2) + n12;
                            } else {
                                int d3 = ((a) ((la20) obj2)).d(n18);
                                n12 = CodedOutputStream.o(d3) + d3 + n12;
                            }
                        }
                    }
                    i6 += n12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t, j2);
                    Class<?> cls8 = b0.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        n10 = CodedOutputStream.n(i10) * size7;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            n10 += CodedOutputStream.i((ByteString) list7.get(i20));
                        }
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 29:
                    List list8 = (List) unsafe.getObject(t, j2);
                    Class<?> cls9 = b0.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = b0.h(list8);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 30:
                    List list9 = (List) unsafe.getObject(t, j2);
                    Class<?> cls10 = b0.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = b0.a(list9);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 31:
                    c = b0.b(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 32:
                    c = b0.c(i10, (List) unsafe.getObject(t, j2));
                    i6 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t, j2);
                    Class<?> cls11 = b0.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = b0.f(list10);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 34:
                    List list11 = (List) unsafe.getObject(t, j2);
                    Class<?> cls12 = b0.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = b0.g(list11);
                        n11 = CodedOutputStream.n(i10);
                        n10 = (n11 * size) + i2;
                        i6 += n10;
                        break;
                    }
                    n10 = 0;
                    i6 += n10;
                case 35:
                    List list12 = (List) unsafe.getObject(t, j2);
                    Class<?> cls13 = b0.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t, j2);
                    Class<?> cls14 = b0.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = b0.e((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = b0.i((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = b0.d((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(t, j2);
                    Class<?> cls15 = b0.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(t, j2);
                    Class<?> cls16 = b0.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(t, j2);
                    Class<?> cls17 = b0.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = b0.h((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = b0.a((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(t, j2);
                    Class<?> cls18 = b0.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(t, j2);
                    Class<?> cls19 = b0.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = b0.f((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = b0.g((List) unsafe.getObject(t, j2));
                    if (size2 > 0) {
                        n13 = CodedOutputStream.n(i10);
                        o2 = CodedOutputStream.o(size2);
                        i6 += o2 + n13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t, j2);
                    m8h0 n19 = xVar.n(i4);
                    Class<?> cls20 = b0.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i21 = 0; i21 < size8; i21++) {
                            i3 += ((a) ((la20) list19.get(i21))).d(n19) + (CodedOutputStream.n(i10) * 2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    c = xVar.o.g(i10, unsafe.getObject(t, j2), xVar.m(i4));
                    i6 += c;
                    break;
                case 51:
                    if (xVar.r(i10, i4, t)) {
                        n = CodedOutputStream.n(i10);
                        c = n + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (xVar.r(i10, i4, t)) {
                        n14 = CodedOutputStream.n(i10);
                        c = n14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (xVar.r(i10, i4, t)) {
                        long A = A(j2, t);
                        n15 = CodedOutputStream.n(i10);
                        p4 = CodedOutputStream.p(A);
                        i6 += p4 + n15;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (xVar.r(i10, i4, t)) {
                        long A2 = A(j2, t);
                        n15 = CodedOutputStream.n(i10);
                        p4 = CodedOutputStream.p(A2);
                        i6 += p4 + n15;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (xVar.r(i10, i4, t)) {
                        int z = z(j2, t);
                        n8 = CodedOutputStream.n(i10);
                        j = CodedOutputStream.p(z);
                        c = j + n8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (xVar.r(i10, i4, t)) {
                        n = CodedOutputStream.n(i10);
                        c = n + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (xVar.r(i10, i4, t)) {
                        n14 = CodedOutputStream.n(i10);
                        c = n14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (xVar.r(i10, i4, t)) {
                        c = CodedOutputStream.n(i10) + 1;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (xVar.r(i10, i4, t)) {
                        Object object3 = unsafe.getObject(t, j2);
                        i6 = (object3 instanceof ByteString ? CodedOutputStream.h(i10, (ByteString) object3) : CodedOutputStream.m((String) object3) + CodedOutputStream.n(i10)) + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!xVar.r(i10, i4, t)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(t, j2);
                        m8h0 n20 = xVar.n(i4);
                        Class<?> cls21 = b0.a;
                        if (object4 instanceof pqy) {
                            n8 = CodedOutputStream.n(i10);
                            j = CodedOutputStream.j((pqy) object4);
                            c = j + n8;
                            i6 += c;
                            break;
                        } else {
                            n7 = CodedOutputStream.n(i10);
                            d = ((a) ((la20) object4)).d(n20);
                            o = CodedOutputStream.o(d);
                            c = o + d + n7;
                            i6 += c;
                        }
                    }
                case 61:
                    if (xVar.r(i10, i4, t)) {
                        c = CodedOutputStream.h(i10, (ByteString) unsafe.getObject(t, j2));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (xVar.r(i10, i4, t)) {
                        int z2 = z(j2, t);
                        n8 = CodedOutputStream.n(i10);
                        j = CodedOutputStream.o(z2);
                        c = j + n8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (xVar.r(i10, i4, t)) {
                        int z3 = z(j2, t);
                        n8 = CodedOutputStream.n(i10);
                        j = CodedOutputStream.p(z3);
                        c = j + n8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (xVar.r(i10, i4, t)) {
                        n14 = CodedOutputStream.n(i10);
                        c = n14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (xVar.r(i10, i4, t)) {
                        n = CodedOutputStream.n(i10);
                        c = n + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (xVar.r(i10, i4, t)) {
                        int z4 = z(j2, t);
                        n8 = CodedOutputStream.n(i10);
                        j = CodedOutputStream.k(z4);
                        c = j + n8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (xVar.r(i10, i4, t)) {
                        long A3 = A(j2, t);
                        n15 = CodedOutputStream.n(i10);
                        p4 = CodedOutputStream.l(A3);
                        i6 += p4 + n15;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (xVar.r(i10, i4, t)) {
                        la20 la20Var2 = (la20) unsafe.getObject(t, j2);
                        m8h0 n21 = xVar.n(i4);
                        n9 = CodedOutputStream.n(i10) * 2;
                        d2 = ((a) la20Var2).d(n21);
                        c = d2 + n9;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xsna.m8h0
    public final void f(java.lang.Object r21, androidx.datastore.preferences.protobuf.g r22, androidx.datastore.preferences.protobuf.j r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.x.f(java.lang.Object, androidx.datastore.preferences.protobuf.g, androidx.datastore.preferences.protobuf.j):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.b0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.b0.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // xsna.m8h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int L = L(i);
                long j = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar2 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar3 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar4 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar5 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar6 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar7 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar8 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar9 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar10 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar11 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar12 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar13 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar14 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar15 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar16 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar17 = w5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            w5q0.e eVar18 = w5q0.c;
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
                        w5q0.e eVar19 = w5q0.c;
                        z = b0.l(eVar19.h(j, generatedMessageLite), eVar19.h(j, generatedMessageLite2));
                        break;
                    case 50:
                        w5q0.e eVar20 = w5q0.c;
                        z = b0.l(eVar20.h(j, generatedMessageLite), eVar20.h(j, generatedMessageLite2));
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
                        w5q0.e eVar21 = w5q0.c;
                        if (eVar21.f(j2, generatedMessageLite) == eVar21.f(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                e0<?, ?> e0Var = this.m;
                if (e0Var.g(generatedMessageLite).equals(e0Var.g(generatedMessageLite2))) {
                    if (!this.f) {
                        return true;
                    }
                    k<?> kVar = this.n;
                    return kVar.c(generatedMessageLite).equals(kVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fc  */
    @Override // xsna.m8h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(T t, Writer writer) throws IOException {
        Map.Entry entry;
        int length;
        Iterator it;
        h hVar = (h) writer;
        hVar.getClass();
        if (Writer.FieldOrder.ASCENDING != Writer.FieldOrder.DESCENDING) {
            M(t, writer);
            return;
        }
        k<?> kVar = this.n;
        int[] iArr = this.a;
        e0<?, ?> e0Var = this.m;
        e0Var.r(e0Var.g(t), writer);
        if (this.f) {
            m<?> c = kVar.c(t);
            if (!c.a.isEmpty()) {
                c0 c0Var = c.a;
                if (c0Var.isEmpty()) {
                    it = Collections.emptyIterator();
                } else if (c.c) {
                    if (c0Var.g == null) {
                        c0Var.g = new d0.b();
                    }
                    it = new q.b(c0Var.g.iterator());
                } else {
                    if (c0Var.g == null) {
                        c0Var.g = new d0.b();
                    }
                    it = c0Var.g.iterator();
                }
                entry = (Map.Entry) it.next();
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int L = L(length);
                    int i = iArr[length];
                    if (entry != null) {
                        kVar.a(entry);
                        if (i < 0) {
                            kVar.j(entry);
                            throw null;
                        }
                    }
                    switch (K(L)) {
                        case 0:
                            if (o(length, t)) {
                                double d = w5q0.c.d(L & 1048575, t);
                                CodedOutputStream codedOutputStream = hVar.a;
                                codedOutputStream.getClass();
                                codedOutputStream.y(i, Double.doubleToRawLongBits(d));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (o(length, t)) {
                                float e = w5q0.c.e(L & 1048575, t);
                                CodedOutputStream codedOutputStream2 = hVar.a;
                                codedOutputStream2.getClass();
                                codedOutputStream2.w(i, Float.floatToRawIntBits(e));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (o(length, t)) {
                                hVar.a.L(i, w5q0.c.g(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (o(length, t)) {
                                hVar.a.L(i, w5q0.c.g(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (o(length, t)) {
                                hVar.a.A(i, w5q0.c.f(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (o(length, t)) {
                                hVar.a.y(i, w5q0.c.g(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (o(length, t)) {
                                hVar.a.w(i, w5q0.c.f(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (o(length, t)) {
                                hVar.a.s(i, w5q0.c.c(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (o(length, t)) {
                                O(i, w5q0.c.h(L & 1048575, t), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (o(length, t)) {
                                hVar.a.C(i, (la20) w5q0.c.h(L & 1048575, t), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (o(length, t)) {
                                hVar.a(i, (ByteString) w5q0.c.h(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (o(length, t)) {
                                hVar.a.J(i, w5q0.c.f(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (o(length, t)) {
                                hVar.a.A(i, w5q0.c.f(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (o(length, t)) {
                                hVar.a.w(i, w5q0.c.f(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (o(length, t)) {
                                hVar.a.y(i, w5q0.c.g(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (o(length, t)) {
                                int f = w5q0.c.f(L & 1048575, t);
                                hVar.a.J(i, (f >> 31) ^ (f << 1));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (o(length, t)) {
                                long g = w5q0.c.g(L & 1048575, t);
                                hVar.a.L(i, (g << 1) ^ (g >> 63));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (o(length, t)) {
                                hVar.b(i, w5q0.c.h(L & 1048575, t), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            b0.o(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 19:
                            b0.s(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 20:
                            b0.v(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 21:
                            b0.D(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 22:
                            b0.u(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 23:
                            b0.r(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 24:
                            b0.q(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 25:
                            b0.m(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 26:
                            b0.B(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer);
                            break;
                        case 27:
                            b0.w(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, n(length));
                            break;
                        case 28:
                            b0.n(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer);
                            break;
                        case 29:
                            b0.C(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 30:
                            b0.p(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 31:
                            b0.x(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 32:
                            b0.y(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 33:
                            b0.z(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 34:
                            b0.A(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, false);
                            break;
                        case 35:
                            b0.o(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 36:
                            b0.s(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 37:
                            b0.v(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 38:
                            b0.D(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 39:
                            b0.u(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 40:
                            b0.r(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 41:
                            b0.q(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 42:
                            b0.m(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 43:
                            b0.C(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 44:
                            b0.p(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 45:
                            b0.x(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 46:
                            b0.y(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 47:
                            b0.z(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 48:
                            b0.A(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, true);
                            break;
                        case 49:
                            b0.t(iArr[length], (List) w5q0.c.h(L & 1048575, t), writer, n(length));
                            break;
                        case 50:
                            N(writer, i, w5q0.c.h(L & 1048575, t), length);
                            break;
                        case 51:
                            if (r(i, length, t)) {
                                double doubleValue = ((Double) w5q0.c.h(L & 1048575, t)).doubleValue();
                                CodedOutputStream codedOutputStream3 = hVar.a;
                                codedOutputStream3.getClass();
                                codedOutputStream3.y(i, Double.doubleToRawLongBits(doubleValue));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (r(i, length, t)) {
                                float floatValue = ((Float) w5q0.c.h(L & 1048575, t)).floatValue();
                                CodedOutputStream codedOutputStream4 = hVar.a;
                                codedOutputStream4.getClass();
                                codedOutputStream4.w(i, Float.floatToRawIntBits(floatValue));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (r(i, length, t)) {
                                hVar.a.L(i, A(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (r(i, length, t)) {
                                hVar.a.L(i, A(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (r(i, length, t)) {
                                hVar.a.A(i, z(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (r(i, length, t)) {
                                hVar.a.y(i, A(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (r(i, length, t)) {
                                hVar.a.w(i, z(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (r(i, length, t)) {
                                hVar.a.s(i, ((Boolean) w5q0.c.h(L & 1048575, t)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (r(i, length, t)) {
                                O(i, w5q0.c.h(L & 1048575, t), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (r(i, length, t)) {
                                hVar.a.C(i, (la20) w5q0.c.h(L & 1048575, t), n(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (r(i, length, t)) {
                                hVar.a(i, (ByteString) w5q0.c.h(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (r(i, length, t)) {
                                hVar.a.J(i, z(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (r(i, length, t)) {
                                hVar.a.A(i, z(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (r(i, length, t)) {
                                hVar.a.w(i, z(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (r(i, length, t)) {
                                hVar.a.y(i, A(L & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (r(i, length, t)) {
                                int z = z(L & 1048575, t);
                                hVar.a.J(i, (z >> 31) ^ (z << 1));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (r(i, length, t)) {
                                long A = A(L & 1048575, t);
                                hVar.a.L(i, (A << 1) ^ (A >> 63));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (r(i, length, t)) {
                                hVar.b(i, w5q0.c.h(L & 1048575, t), n(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (entry != null) {
                    return;
                }
                kVar.j(entry);
                throw null;
            }
        }
        entry = null;
        while (length >= 0) {
        }
        if (entry != null) {
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
    @Override // xsna.m8h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int L = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & L;
            int i6 = 1237;
            int i7 = 37;
            switch (K(L)) {
                case 0:
                    i = i3 * 53;
                    b = p.b(Double.doubleToLongBits(w5q0.c.d(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(w5q0.c.e(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = p.b(w5q0.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = p.b(w5q0.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = p.b(w5q0.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = w5q0.c.c(j, generatedMessageLite);
                    Charset charset = p.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) w5q0.c.h(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = w5q0.c.h(j, generatedMessageLite);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = w5q0.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = p.b(w5q0.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = w5q0.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = p.b(w5q0.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = w5q0.c.h(j, generatedMessageLite);
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
                    b = w5q0.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = w5q0.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(Double.doubleToLongBits(((Double) w5q0.c.h(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) w5q0.c.h(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) w5q0.c.h(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = p.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) w5q0.c.h(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = w5q0.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = w5q0.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = p.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = w5q0.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.m.g(generatedMessageLite).hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        return this.n.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return o(i, generatedMessageLite) == o(i, generatedMessageLite2);
    }

    public final <UT, UB> UB k(Object obj, int i, UB ub, e0<UT, UB> e0Var, Object obj2) {
        p.b l;
        int i2 = this.a[i];
        Object h = w5q0.c.h(L(i) & 1048575, obj);
        if (h == null || (l = l(i)) == null) {
            return ub;
        }
        u uVar = this.o;
        MapFieldLite d = uVar.d(h);
        t.a<?, ?> b = uVar.b(m(i));
        Iterator it = d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!l.a()) {
                if (ub == null) {
                    ub = (UB) e0Var.f(obj2);
                }
                ByteString.e eVar = new ByteString.e(t.a(b, entry.getKey(), entry.getValue()));
                try {
                    t.b(eVar.b(), b, entry.getKey(), entry.getValue());
                    e0Var.d(ub, i2, eVar.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final p.b l(int i) {
        return (p.b) this.b[fb20.a(i, 3, 2, 1)];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final m8h0 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        m8h0 m8h0Var = (m8h0) objArr[i2];
        if (m8h0Var != null) {
            return m8h0Var;
        }
        m8h0<T> a = v8e0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            int L = L(i);
            long j2 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(w5q0.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(w5q0.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (w5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (w5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (w5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return w5q0.c.c(j2, obj);
                case 8:
                    Object h = w5q0.c.h(j2, obj);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof ByteString) {
                        return !ByteString.b.equals(h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (w5q0.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.b.equals(w5q0.c.h(j2, obj));
                case 11:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (w5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (w5q0.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (w5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (w5q0.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & w5q0.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean p(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, t) : (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return w5q0.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        r9.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r0.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Object obj, int i, Object obj2, j jVar, g gVar) throws IOException {
        long L = L(i) & 1048575;
        Object h = w5q0.c.h(L, obj);
        u uVar = this.o;
        if (h == null) {
            h = uVar.f();
            w5q0.o(L, obj, h);
        } else if (uVar.h(h)) {
            MapFieldLite f = uVar.f();
            uVar.a(f, h);
            w5q0.o(L, obj, f);
            h = f;
        }
        MapFieldLite d = uVar.d(h);
        t.a<?, ?> b = uVar.b(obj2);
        gVar.w(2);
        f fVar = gVar.a;
        int f2 = fVar.f(fVar.w());
        b.getClass();
        Object obj3 = b.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a = gVar.a();
                if (a == Integer.MAX_VALUE || fVar.c()) {
                    break;
                }
                if (a == 1) {
                    obj4 = gVar.i(b.a, null, null);
                } else if (a != 2) {
                    try {
                        if (!gVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!gVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = gVar.i(b.b, obj3.getClass(), jVar);
                }
            } catch (Throwable th) {
                fVar.e(f2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            m8h0 n = n(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object b = n.b();
                    n.a(b, object);
                    unsafe.putObject(obj, L, b);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!q(object2)) {
                Object b2 = n.b();
                n.a(b2, object2);
                unsafe.putObject(obj, L, b2);
                object2 = b2;
            }
            n.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            m8h0 n = n(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    Object b = n.b();
                    n.a(b, object);
                    unsafe.putObject(obj, L, b);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!q(object2)) {
                Object b2 = n.b();
                n.a(b2, object2);
                unsafe.putObject(obj, L, b2);
                object2 = b2;
            }
            n.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(int i, Object obj) {
        m8h0 n = n(i);
        long L = L(i) & 1048575;
        if (!o(i, obj)) {
            return n.b();
        }
        Object object = q.getObject(obj, L);
        if (q(object)) {
            return object;
        }
        Object b = n.b();
        if (object != null) {
            n.a(b, object);
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(int i, int i2, Object obj) {
        m8h0 n = n(i2);
        if (!r(i, i2, obj)) {
            return n.b();
        }
        Object object = q.getObject(obj, L(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object b = n.b();
        if (object != null) {
            n.a(b, object);
        }
        return b;
    }
}
