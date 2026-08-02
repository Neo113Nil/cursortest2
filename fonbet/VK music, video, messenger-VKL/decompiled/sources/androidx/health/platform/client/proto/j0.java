package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.Writer;
import androidx.health.platform.client.proto.b0;
import androidx.health.platform.client.proto.c0;
import androidx.health.platform.client.proto.d;
import androidx.health.platform.client.proto.f0;
import androidx.health.platform.client.proto.v;
import androidx.health.platform.client.proto.y;
import androidx.health.platform.client.proto.z0;
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
import xsna.cqi;
import xsna.fb20;
import xsna.ja20;
import xsna.jye0;
import xsna.kez;
import xsna.n760;
import xsna.nqy;
import xsna.s8e0;
import xsna.t33;
import xsna.t5q0;
import xsna.zxy;

/* compiled from: MessageSchema.java */
/* loaded from: classes12.dex */
public final class j0<T> implements w0<T> {
    public static final int[] o = new int[0];
    public static final Unsafe p = t5q0.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ja20 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final n760 j;
    public final kez k;
    public final c1<?, ?> l;
    public final w<?> m;
    public final g0 n;

    /* compiled from: MessageSchema.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat$FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat$FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat$FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat$FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat$FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat$FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat$FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat$FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat$FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat$FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat$FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat$FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat$FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat$FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat$FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public j0(int[] iArr, Object[] objArr, int i, int i2, ja20 ja20Var, int[] iArr2, int i3, int i4, n760 n760Var, kez kezVar, c1 c1Var, w wVar, g0 g0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = wVar != null && wVar.e(ja20Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = n760Var;
        this.k = kezVar;
        this.l = c1Var;
        this.m = wVar;
        this.e = ja20Var;
        this.n = g0Var;
    }

    public static long A(long j, Object obj) {
        return ((Long) t5q0.c.i(j, obj)).longValue();
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
            StringBuilder a2 = t33.a("Field ", str, " for ");
            a2.append(cls.getName());
            a2.append(" not found. Known fields are ");
            a2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a2.toString());
        }
    }

    public static int L(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void P(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            ((h) writer).a.Q(i, (String) obj);
        } else {
            ((h) writer).a(i, (ByteString) obj);
        }
    }

    public static void k(Object obj) {
        if (!s(obj)) {
            throw new IllegalArgumentException(cqi.c(obj, "Mutating immutable message: "));
        }
    }

    public static int l(byte[] bArr, int i, int i2, WireFormat$FieldType wireFormat$FieldType, Class cls, d.a aVar) throws IOException {
        switch (a.a[wireFormat$FieldType.ordinal()]) {
            case 1:
                int i3 = d.i(bArr, i, aVar);
                aVar.c = Boolean.valueOf(aVar.b != 0);
                return i3;
            case 2:
                return d.a(bArr, i, aVar);
            case 3:
                aVar.c = Double.valueOf(Double.longBitsToDouble(d.c(i, bArr)));
                return i + 8;
            case 4:
            case 5:
                aVar.c = Integer.valueOf(d.b(i, bArr));
                return i + 4;
            case 6:
            case 7:
                aVar.c = Long.valueOf(d.c(i, bArr));
                return i + 8;
            case 8:
                aVar.c = Float.valueOf(Float.intBitsToFloat(d.b(i, bArr)));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int g = d.g(bArr, i, aVar);
                aVar.c = Integer.valueOf(aVar.a);
                return g;
            case 12:
            case 13:
                int i4 = d.i(bArr, i, aVar);
                aVar.c = Long.valueOf(aVar.b);
                return i4;
            case 14:
                w0<T> a2 = s8e0.c.a(cls);
                T b = a2.b();
                int k = d.k(b, a2, bArr, i, i2, aVar);
                a2.d(b);
                aVar.c = b;
                return k;
            case 15:
                int g2 = d.g(bArr, i, aVar);
                aVar.c = Integer.valueOf(g.a(aVar.a));
                return g2;
            case 16:
                int i5 = d.i(bArr, i, aVar);
                aVar.c = Long.valueOf(g.b(aVar.b));
                return i5;
            case 17:
                int g3 = d.g(bArr, i, aVar);
                int i6 = aVar.a;
                if (i6 < 0) {
                    throw InvalidProtocolBufferException.i();
                }
                if (i6 == 0) {
                    aVar.c = "";
                    return g3;
                }
                aVar.c = f1.a.a(g3, i6, bArr);
                return g3 + i6;
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static d1 p(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var != d1.f) {
            return d1Var;
        }
        d1 d1Var2 = new d1();
        generatedMessageLite.unknownFields = d1Var2;
        return d1Var2;
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).m();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> j0<T> y(jye0 jye0Var, n760 n760Var, kez kezVar, c1<?, ?> c1Var, w<?> wVar, g0 g0Var) {
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
        String str2 = jye0Var.b;
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
            iArr = o;
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
        Unsafe unsafe = p;
        Object[] objArr3 = jye0Var.c;
        Class<?> cls = jye0Var.a.getClass();
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
                } else if (i83 != 12 || (!jye0Var.getSyntax().equals(ProtoSyntax.PROTO2) && (charAt24 & 2048) == 0)) {
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
                        if (jye0Var.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
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
        ja20 ja20Var = jye0Var.a;
        jye0Var.getSyntax();
        return new j0<>(iArr3, objArr4, i2, i5, ja20Var, iArr, i7, i63, n760Var, kezVar, c1Var, wVar, g0Var);
    }

    public static int z(long j, Object obj) {
        return ((Integer) t5q0.c.i(j, obj)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int B(T t, byte[] bArr, int i, int i2, int i3, long j, d.a aVar) throws IOException {
        int l;
        Unsafe unsafe = p;
        Object n = n(i3);
        Object object = unsafe.getObject(t, j);
        g0 g0Var = this.n;
        if (g0Var.h(object)) {
            MapFieldLite f = g0Var.f();
            g0Var.a(f, object);
            unsafe.putObject(t, j, f);
            object = f;
        }
        f0.a<?, ?> b = g0Var.b(n);
        MapFieldLite d = g0Var.d(object);
        int g = d.g(bArr, i, aVar);
        int i4 = aVar.a;
        if (i4 < 0 || i4 > i2 - g) {
            throw InvalidProtocolBufferException.l();
        }
        int i5 = g + i4;
        b.getClass();
        V v = b.c;
        Object obj = "";
        Object obj2 = v;
        while (g < i5) {
            int i6 = g + 1;
            int i7 = bArr[g];
            if (i7 < 0) {
                i6 = d.f(i7, bArr, i6, aVar);
                i7 = aVar.a;
            }
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == b.b.i()) {
                    l = l(bArr, i6, i2, b.b, v.getClass(), aVar);
                    obj2 = aVar.c;
                    g = l;
                }
                g = d.l(i7, bArr, i6, i2, aVar);
            } else if (i9 == b.a.i()) {
                l = l(bArr, i6, i2, b.a, null, aVar);
                obj = aVar.c;
                g = l;
            } else {
                g = d.l(i7, bArr, i6, i2, aVar);
            }
        }
        if (g != i5) {
            throw InvalidProtocolBufferException.j();
        }
        d.put(obj, obj2);
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0518, code lost:
    
        r12 = r0;
        r0 = r18;
        r1 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0592, code lost:
    
        if (r0 == 1048575) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0594, code lost:
    
        r28.putInt(r11, r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x059a, code lost:
    
        r0 = r10.h;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x059e, code lost:
    
        r3 = r10.i;
        r4 = r10.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x05a2, code lost:
    
        if (r0 >= r3) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x05a4, code lost:
    
        r3 = r10.g[r0];
        r7 = r19[r3];
        r8 = xsna.t5q0.c.i(r10.M(r3) & r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x05b6, code lost:
    
        if (r8 != null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x05b9, code lost:
    
        r9 = r10.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x05bd, code lost:
    
        if (r9 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x05c3, code lost:
    
        r13 = r10.n;
        r8 = r13.d(r8);
        r3 = r13.b(r10.n(r3));
        r8 = r8.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x05dd, code lost:
    
        if (r8.hasNext() == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x05df, code lost:
    
        r13 = (java.util.Map.Entry) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x05f3, code lost:
    
        if (r9.isInRange(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x05f5, code lost:
    
        if (r2 != null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x05f7, code lost:
    
        r2 = r4.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x05fb, code lost:
    
        r1 = androidx.health.platform.client.proto.f0.a(r3, r13.getKey(), r13.getValue());
        r15 = new byte[r1];
        r16 = androidx.health.platform.client.proto.CodedOutputStream.b;
        r16 = r0;
        r0 = new androidx.health.platform.client.proto.CodedOutputStream.a(r15, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0612, code lost:
    
        androidx.health.platform.client.proto.f0.b(r0, r3, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0621, code lost:
    
        if (r0.X() != 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0623, code lost:
    
        r4.a(r2, r7, new androidx.health.platform.client.proto.ByteString.f(r15));
        r8.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0640, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0636, code lost:
    
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0637, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x063d, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x063e, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0646, code lost:
    
        r0 = r0 + 1;
        r1 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x064d, code lost:
    
        if (r2 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x064f, code lost:
    
        r4.i(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0652, code lost:
    
        if (r12 != 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0654, code lost:
    
        if (r6 != r5) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x065b, code lost:
    
        throw androidx.health.platform.client.proto.InvalidProtocolBufferException.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0660, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x065c, code lost:
    
        if (r6 > r5) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x065e, code lost:
    
        if (r14 != r12) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0665, code lost:
    
        throw androidx.health.platform.client.proto.InvalidProtocolBufferException.j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(T t, byte[] bArr, int i, int i2, int i3, d.a aVar) throws IOException {
        Unsafe unsafe;
        T t2;
        int i4;
        int[] iArr;
        j0<T> j0Var;
        int i5;
        int i6;
        int i7;
        v vVar;
        int i8;
        v vVar2;
        int i9;
        int e;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe2;
        int i15;
        d.a aVar2;
        char c;
        byte[] bArr2;
        T t3;
        int i16;
        int g;
        int i17;
        T t4;
        Unsafe unsafe3;
        d.a aVar3;
        int i18;
        byte[] bArr3;
        int a2;
        byte[] bArr4;
        int g2;
        int i19;
        Unsafe unsafe4;
        int i20;
        d.a aVar4;
        byte[] bArr5;
        int i21;
        j0<T> j0Var2 = this;
        T t5 = t;
        byte[] bArr6 = bArr;
        int i22 = i2;
        int i23 = i3;
        d.a aVar5 = aVar;
        v vVar3 = aVar5.d;
        k(t5);
        Unsafe unsafe5 = p;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 1048575;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int[] iArr2 = j0Var2.a;
            if (i24 < i22) {
                int i30 = i24 + 1;
                int i31 = bArr6[i24];
                if (i31 < 0) {
                    i30 = d.f(i31, bArr6, i30, aVar5);
                    i31 = aVar5.a;
                }
                int i32 = i31 >>> 3;
                int i33 = i26;
                int i34 = i31 & 7;
                int i35 = j0Var2.d;
                int i36 = j0Var2.c;
                int i37 = i31;
                if (i32 > i25) {
                    i7 = (i32 < i36 || i32 > i35) ? -1 : j0Var2.I(i32, i33 / 3);
                    i6 = 0;
                } else if (i32 < i36 || i32 > i35) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = j0Var2.I(i32, 0);
                }
                if (i7 == -1) {
                    unsafe = unsafe5;
                    i26 = i6;
                    i4 = i27;
                    vVar = vVar3;
                    iArr = iArr2;
                    i25 = i32;
                    i8 = i30;
                    i5 = i37;
                    j0Var = j0Var2;
                    t2 = t5;
                } else {
                    int i38 = iArr2[i7 + 1];
                    int L = L(i38);
                    long j = i38 & 1048575;
                    if (L <= 17) {
                        int i39 = iArr2[i7 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        v vVar4 = vVar3;
                        if (i41 != i27) {
                            if (i27 != 1048575) {
                                unsafe5.putInt(t5, i27, i28);
                            }
                            i14 = i41;
                            i13 = i41 == 1048575 ? 0 : unsafe5.getInt(t5, i41);
                        } else {
                            i13 = i28;
                            i14 = i27;
                        }
                        switch (L) {
                            case 0:
                                i15 = i7;
                                d.a aVar6 = aVar5;
                                i20 = i30;
                                c = 65535;
                                i5 = i37;
                                if (i34 != 1) {
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    t5q0.c.m(t5, j, Double.longBitsToDouble(d.c(i20, bArr)));
                                    i24 = i20 + 8;
                                    i22 = i2;
                                    bArr6 = bArr;
                                    aVar5 = aVar6;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    vVar3 = vVar4;
                                    i28 = i13 | i40;
                                    t5 = t5;
                                    unsafe5 = unsafe5;
                                    i26 = i15;
                                }
                            case 1:
                                i15 = i7;
                                aVar4 = aVar5;
                                i20 = i30;
                                c = 65535;
                                bArr5 = bArr;
                                i5 = i37;
                                if (i34 != 5) {
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    t5q0.c.n(t5, j, Float.intBitsToFloat(d.b(i20, bArr5)));
                                    i24 = i20 + 4;
                                    i21 = i13 | i40;
                                    i22 = i2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    i28 = i21;
                                    bArr6 = bArr5;
                                    aVar5 = aVar4;
                                    vVar3 = vVar4;
                                }
                            case 2:
                            case 3:
                                i15 = i7;
                                aVar4 = aVar5;
                                i20 = i30;
                                c = 65535;
                                bArr5 = bArr;
                                i5 = i37;
                                if (i34 != 0) {
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    int i42 = d.i(bArr5, i20, aVar4);
                                    unsafe5.putLong(t5, j, aVar4.b);
                                    i21 = i13 | i40;
                                    i22 = i2;
                                    i24 = i42;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    i28 = i21;
                                    bArr6 = bArr5;
                                    aVar5 = aVar4;
                                    vVar3 = vVar4;
                                }
                            case 4:
                            case 11:
                                i15 = i7;
                                aVar4 = aVar5;
                                i20 = i30;
                                c = 65535;
                                bArr5 = bArr;
                                i5 = i37;
                                if (i34 != 0) {
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    i24 = d.g(bArr5, i20, aVar4);
                                    unsafe5.putInt(t5, j, aVar4.a);
                                    i21 = i13 | i40;
                                    i22 = i2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    i28 = i21;
                                    bArr6 = bArr5;
                                    aVar5 = aVar4;
                                    vVar3 = vVar4;
                                }
                            case 5:
                            case 14:
                                Unsafe unsafe6 = unsafe5;
                                T t6 = t5;
                                i15 = i7;
                                int i43 = i30;
                                c = 65535;
                                i5 = i37;
                                if (i34 != 1) {
                                    unsafe5 = unsafe6;
                                    i20 = i43;
                                    t5 = t6;
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    long c2 = d.c(i43, bArr);
                                    bArr5 = bArr;
                                    unsafe5 = unsafe6;
                                    t5 = t6;
                                    aVar4 = aVar;
                                    unsafe5.putLong(t5, j, c2);
                                    i24 = i43 + 8;
                                    i21 = i13 | i40;
                                    i22 = i2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    i28 = i21;
                                    bArr6 = bArr5;
                                    aVar5 = aVar4;
                                    vVar3 = vVar4;
                                }
                            case 6:
                            case 13:
                                unsafe2 = unsafe5;
                                T t7 = t5;
                                i15 = i7;
                                i16 = i30;
                                c = 65535;
                                i5 = i37;
                                if (i34 != 5) {
                                    t4 = t7;
                                    unsafe4 = unsafe2;
                                    i20 = i16;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    unsafe2.putInt(t7, j, d.b(i16, bArr));
                                    i24 = i16 + 4;
                                    i22 = i2;
                                    bArr6 = bArr;
                                    unsafe5 = unsafe2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    vVar3 = vVar4;
                                    i28 = i13 | i40;
                                    t5 = t7;
                                    aVar5 = aVar;
                                }
                            case 7:
                                unsafe2 = unsafe5;
                                i15 = i7;
                                aVar2 = aVar5;
                                c = 65535;
                                bArr2 = bArr;
                                t3 = t5;
                                i16 = i30;
                                i5 = i37;
                                if (i34 != 0) {
                                    t4 = t3;
                                    unsafe4 = unsafe2;
                                    i20 = i16;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    int i44 = d.i(bArr2, i16, aVar2);
                                    t5q0.c.k(j, t3, aVar2.b != 0);
                                    i24 = i44;
                                    bArr6 = bArr2;
                                    unsafe5 = unsafe2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    vVar3 = vVar4;
                                    i28 = i13 | i40;
                                    t5 = t3;
                                    aVar5 = aVar2;
                                    i22 = i2;
                                }
                            case 8:
                                unsafe2 = unsafe5;
                                i15 = i7;
                                aVar2 = aVar5;
                                c = 65535;
                                bArr2 = bArr;
                                t3 = t5;
                                i16 = i30;
                                i5 = i37;
                                if (i34 != 2) {
                                    t4 = t3;
                                    unsafe4 = unsafe2;
                                    i20 = i16;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    if ((i38 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                                        g = d.g(bArr2, i16, aVar2);
                                        i17 = aVar2.a;
                                        if (i17 < 0) {
                                            throw InvalidProtocolBufferException.i();
                                        }
                                        if (i17 == 0) {
                                            aVar2.c = "";
                                            unsafe2.putObject(t3, j, aVar2.c);
                                            bArr6 = bArr2;
                                            unsafe5 = unsafe2;
                                            i27 = i14;
                                            i28 = i13 | i40;
                                            i24 = g;
                                            t5 = t3;
                                            i26 = i15;
                                            i25 = i32;
                                            i29 = i5;
                                            vVar3 = vVar4;
                                            aVar5 = aVar2;
                                        } else {
                                            aVar2.c = f1.a.a(g, i17, bArr2);
                                            g += i17;
                                            unsafe2.putObject(t3, j, aVar2.c);
                                            bArr6 = bArr2;
                                            unsafe5 = unsafe2;
                                            i27 = i14;
                                            i28 = i13 | i40;
                                            i24 = g;
                                            t5 = t3;
                                            i26 = i15;
                                            i25 = i32;
                                            i29 = i5;
                                            vVar3 = vVar4;
                                            aVar5 = aVar2;
                                        }
                                    } else {
                                        g = d.g(bArr2, i16, aVar2);
                                        i17 = aVar2.a;
                                        if (i17 < 0) {
                                            throw InvalidProtocolBufferException.i();
                                        }
                                        if (i17 == 0) {
                                            aVar2.c = "";
                                            unsafe2.putObject(t3, j, aVar2.c);
                                            bArr6 = bArr2;
                                            unsafe5 = unsafe2;
                                            i27 = i14;
                                            i28 = i13 | i40;
                                            i24 = g;
                                            t5 = t3;
                                            i26 = i15;
                                            i25 = i32;
                                            i29 = i5;
                                            vVar3 = vVar4;
                                            aVar5 = aVar2;
                                        } else {
                                            aVar2.c = new String(bArr2, g, i17, b0.a);
                                            g += i17;
                                            unsafe2.putObject(t3, j, aVar2.c);
                                            bArr6 = bArr2;
                                            unsafe5 = unsafe2;
                                            i27 = i14;
                                            i28 = i13 | i40;
                                            i24 = g;
                                            t5 = t3;
                                            i26 = i15;
                                            i25 = i32;
                                            i29 = i5;
                                            vVar3 = vVar4;
                                            aVar5 = aVar2;
                                        }
                                    }
                                    i22 = i2;
                                }
                            case 9:
                                T t8 = t5;
                                Unsafe unsafe7 = unsafe5;
                                i15 = i7;
                                d.a aVar7 = aVar5;
                                int i45 = i30;
                                c = 65535;
                                i5 = i37;
                                if (i34 != 2) {
                                    t3 = t8;
                                    bArr2 = bArr;
                                    unsafe2 = unsafe7;
                                    i16 = i45;
                                    aVar2 = aVar7;
                                    t4 = t3;
                                    unsafe4 = unsafe2;
                                    i20 = i16;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    Object w = j0Var2.w(i15, t8);
                                    t3 = t8;
                                    unsafe2 = unsafe7;
                                    g = d.k(w, j0Var2.o(i15), bArr, i45, i2, aVar7);
                                    bArr2 = bArr;
                                    aVar2 = aVar7;
                                    j0Var2.J(i15, t3, w);
                                    bArr6 = bArr2;
                                    unsafe5 = unsafe2;
                                    i27 = i14;
                                    i28 = i13 | i40;
                                    i24 = g;
                                    t5 = t3;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    vVar3 = vVar4;
                                    aVar5 = aVar2;
                                    i22 = i2;
                                }
                            case 10:
                                T t9 = t5;
                                unsafe3 = unsafe5;
                                t4 = t9;
                                i15 = i7;
                                aVar3 = aVar5;
                                i18 = i30;
                                c = 65535;
                                bArr3 = bArr;
                                i5 = i37;
                                if (i34 != 2) {
                                    unsafe4 = unsafe3;
                                    i20 = i18;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    a2 = d.a(bArr3, i18, aVar3);
                                    unsafe3.putObject(t4, j, aVar3.c);
                                    Unsafe unsafe8 = unsafe3;
                                    t5 = t4;
                                    unsafe5 = unsafe8;
                                    i24 = a2;
                                    bArr6 = bArr3;
                                    aVar5 = aVar3;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    vVar3 = vVar4;
                                    i28 = i13 | i40;
                                    i22 = i2;
                                }
                            case 12:
                                T t10 = t5;
                                unsafe3 = unsafe5;
                                t4 = t10;
                                i15 = i7;
                                aVar3 = aVar5;
                                i18 = i30;
                                c = 65535;
                                bArr4 = bArr;
                                i5 = i37;
                                if (i34 != 0) {
                                    unsafe4 = unsafe3;
                                    i20 = i18;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    g2 = d.g(bArr4, i18, aVar3);
                                    int i46 = aVar3.a;
                                    b0.c m = j0Var2.m(i15);
                                    if ((i38 & Integer.MIN_VALUE) == 0 || m == null || m.isInRange(i46)) {
                                        unsafe3.putInt(t4, j, i46);
                                        i19 = i13 | i40;
                                        t5 = t4;
                                        unsafe5 = unsafe3;
                                        int i47 = i14;
                                        i28 = i19;
                                        bArr6 = bArr4;
                                        aVar5 = aVar3;
                                        i27 = i47;
                                        i24 = g2;
                                        i26 = i15;
                                        i25 = i32;
                                        i29 = i5;
                                        vVar3 = vVar4;
                                        i22 = i2;
                                    } else {
                                        p(t4).c(i5, Long.valueOf(i46));
                                        t5 = t4;
                                        unsafe5 = unsafe3;
                                        i24 = g2;
                                        bArr6 = bArr4;
                                        aVar5 = aVar3;
                                        i26 = i15;
                                        i25 = i32;
                                        i29 = i5;
                                        i27 = i14;
                                        vVar3 = vVar4;
                                        i28 = i13;
                                        i22 = i2;
                                    }
                                }
                            case 15:
                                T t11 = t5;
                                unsafe3 = unsafe5;
                                t4 = t11;
                                i15 = i7;
                                aVar3 = aVar5;
                                i18 = i30;
                                c = 65535;
                                bArr3 = bArr;
                                i5 = i37;
                                if (i34 != 0) {
                                    unsafe4 = unsafe3;
                                    i20 = i18;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    a2 = d.g(bArr3, i18, aVar3);
                                    unsafe3.putInt(t4, j, g.a(aVar3.a));
                                    Unsafe unsafe82 = unsafe3;
                                    t5 = t4;
                                    unsafe5 = unsafe82;
                                    i24 = a2;
                                    bArr6 = bArr3;
                                    aVar5 = aVar3;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    i27 = i14;
                                    vVar3 = vVar4;
                                    i28 = i13 | i40;
                                    i22 = i2;
                                }
                            case 16:
                                i15 = i7;
                                aVar3 = aVar5;
                                i18 = i30;
                                c = 65535;
                                i5 = i37;
                                if (i34 != 0) {
                                    T t12 = t5;
                                    unsafe3 = unsafe5;
                                    t4 = t12;
                                    unsafe4 = unsafe3;
                                    i20 = i18;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    int i48 = d.i(bArr, i18, aVar3);
                                    unsafe5.putLong(t5, j, g.b(aVar3.b));
                                    t5 = t5;
                                    unsafe5 = unsafe5;
                                    int i49 = i14;
                                    i28 = i13 | i40;
                                    bArr6 = bArr;
                                    aVar5 = aVar3;
                                    i27 = i49;
                                    i22 = i2;
                                    i24 = i48;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    vVar3 = vVar4;
                                }
                            case 17:
                                if (i34 != 3) {
                                    i15 = i7;
                                    int i50 = i30;
                                    c = 65535;
                                    i5 = i37;
                                    unsafe4 = unsafe5;
                                    t4 = t5;
                                    i20 = i50;
                                    t2 = t4;
                                    unsafe = unsafe4;
                                    i8 = i20;
                                    i26 = i15;
                                    i25 = i32;
                                    i4 = i14;
                                    vVar = vVar4;
                                    i28 = i13;
                                    j0Var = j0Var2;
                                    iArr = iArr2;
                                    break;
                                } else {
                                    Object w2 = j0Var2.w(i7, t5);
                                    int i51 = i7;
                                    w0 o2 = j0Var2.o(i51);
                                    i15 = i51;
                                    aVar3 = aVar5;
                                    int i52 = i30;
                                    i5 = i37;
                                    g2 = d.j(w2, o2, bArr, i52, i2, (i32 << 3) | 4, aVar3);
                                    bArr4 = bArr;
                                    j0Var2.J(i15, t5, w2);
                                    i19 = i13 | i40;
                                    int i472 = i14;
                                    i28 = i19;
                                    bArr6 = bArr4;
                                    aVar5 = aVar3;
                                    i27 = i472;
                                    i24 = g2;
                                    i26 = i15;
                                    i25 = i32;
                                    i29 = i5;
                                    vVar3 = vVar4;
                                    i22 = i2;
                                }
                            default:
                                unsafe4 = unsafe5;
                                t4 = t5;
                                i15 = i7;
                                i20 = i30;
                                c = 65535;
                                i5 = i37;
                                t2 = t4;
                                unsafe = unsafe4;
                                i8 = i20;
                                i26 = i15;
                                i25 = i32;
                                i4 = i14;
                                vVar = vVar4;
                                i28 = i13;
                                j0Var = j0Var2;
                                iArr = iArr2;
                                break;
                        }
                    } else {
                        int i53 = i30;
                        i5 = i37;
                        T t13 = t5;
                        Unsafe unsafe9 = unsafe5;
                        v vVar5 = vVar3;
                        d.a aVar8 = aVar5;
                        int i54 = i7;
                        if (L != 27) {
                            i10 = i53;
                            if (L <= 49) {
                                unsafe = unsafe9;
                                i4 = i27;
                                i12 = i28;
                                vVar = vVar5;
                                iArr = iArr2;
                                int E = j0Var2.E(t, bArr, i10, i2, i5, i32, i34, i54, i38, L, j, aVar);
                                i5 = i5;
                                i11 = i32;
                                if (E != i10) {
                                    j0Var2 = this;
                                    t5 = t;
                                    bArr6 = bArr;
                                    i22 = i2;
                                    i24 = E;
                                    i26 = i54;
                                    i25 = i11;
                                    i29 = i5;
                                    i27 = i4;
                                    i28 = i12;
                                    vVar3 = vVar;
                                    unsafe5 = unsafe;
                                    aVar5 = aVar;
                                } else {
                                    t2 = t;
                                    i8 = E;
                                    i26 = i54;
                                    i25 = i11;
                                    i28 = i12;
                                    j0Var = this;
                                }
                            } else {
                                i4 = i27;
                                unsafe = unsafe9;
                                i11 = i32;
                                i12 = i28;
                                vVar = vVar5;
                                iArr = iArr2;
                                if (L == 50) {
                                    if (i34 == 2) {
                                        int B = B(t, bArr, i10, i2, i54, j, aVar);
                                        i54 = i54;
                                        if (B != i10) {
                                            j0Var2 = this;
                                            t5 = t;
                                            bArr6 = bArr;
                                            i22 = i2;
                                            i24 = B;
                                            i26 = i54;
                                            i25 = i11;
                                            i29 = i5;
                                            i27 = i4;
                                            i28 = i12;
                                            vVar3 = vVar;
                                            unsafe5 = unsafe;
                                            aVar5 = aVar;
                                        } else {
                                            t2 = t;
                                            i8 = B;
                                            i26 = i54;
                                            i25 = i11;
                                            i28 = i12;
                                            j0Var = this;
                                        }
                                    }
                                    t2 = t;
                                    i8 = i10;
                                    i26 = i54;
                                    i25 = i11;
                                    i28 = i12;
                                    j0Var = this;
                                } else {
                                    i25 = i11;
                                    int D = D(t, bArr, i10, i2, i5, i25, i34, i38, L, j, i54, aVar);
                                    j0Var = this;
                                    t2 = t;
                                    i5 = i5;
                                    if (D != i10) {
                                        bArr6 = bArr;
                                        i22 = i2;
                                        i24 = D;
                                        i26 = i54;
                                        j0Var2 = j0Var;
                                        t5 = t2;
                                        i29 = i5;
                                        i27 = i4;
                                        i28 = i12;
                                        vVar3 = vVar;
                                        unsafe5 = unsafe;
                                        aVar5 = aVar;
                                    } else {
                                        i8 = D;
                                        i26 = i54;
                                        i28 = i12;
                                    }
                                }
                            }
                        } else if (i34 == 2) {
                            b0.d dVar = (b0.d) unsafe9.getObject(t13, j);
                            if (!dVar.isModifiable()) {
                                int size = dVar.size();
                                dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe9.putObject(t13, j, dVar);
                            }
                            b0.d dVar2 = dVar;
                            bArr6 = bArr;
                            t5 = t;
                            i22 = i2;
                            i24 = d.d(j0Var2.o(i54), i5, bArr6, i53, i2, dVar2, aVar8);
                            i26 = i54;
                            unsafe5 = unsafe9;
                            i25 = i32;
                            i29 = i5;
                            vVar3 = vVar5;
                            aVar5 = aVar;
                        } else {
                            i10 = i53;
                            unsafe = unsafe9;
                            i4 = i27;
                            i11 = i32;
                            i12 = i28;
                            vVar = vVar5;
                            iArr = iArr2;
                            t2 = t;
                            i8 = i10;
                            i26 = i54;
                            i25 = i11;
                            i28 = i12;
                            j0Var = this;
                        }
                    }
                }
                if (i5 != i23 || i23 == 0) {
                    if (j0Var.f) {
                        vVar2 = vVar;
                        if (vVar2 != v.a()) {
                            if (vVar2.a.get(new v.a(i25, j0Var.e)) != null) {
                                GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) t2;
                                y<GeneratedMessageLite.d> yVar = cVar.extensions;
                                if (!yVar.b) {
                                    throw null;
                                }
                                cVar.extensions = yVar.clone();
                                throw null;
                            }
                            i9 = i23;
                            e = d.e(i5, bArr, i8, i2, p(t2), aVar);
                            i22 = i2;
                            i24 = e;
                            bArr6 = bArr;
                            j0Var2 = j0Var;
                            t5 = t2;
                            i23 = i9;
                            i29 = i5;
                            i27 = i4;
                            unsafe5 = unsafe;
                            vVar3 = vVar2;
                            aVar5 = aVar;
                        }
                    } else {
                        vVar2 = vVar;
                    }
                    i9 = i23;
                    e = d.e(i5, bArr, i8, i2, p(t2), aVar);
                    i22 = i2;
                    i24 = e;
                    bArr6 = bArr;
                    j0Var2 = j0Var;
                    t5 = t2;
                    i23 = i9;
                    i29 = i5;
                    i27 = i4;
                    unsafe5 = unsafe;
                    vVar3 = vVar2;
                    aVar5 = aVar;
                } else {
                    i22 = i2;
                    i24 = i8;
                }
            } else {
                unsafe = unsafe5;
                t2 = t5;
                i4 = i27;
                iArr = iArr2;
                j0Var = j0Var2;
                i5 = i29;
            }
        }
    }

    public final int D(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d.a aVar) throws IOException {
        Unsafe unsafe = p;
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
                int i11 = d.i(bArr, i, aVar);
                unsafe.putObject(t, j, Long.valueOf(aVar.b));
                unsafe.putInt(t, j2, i4);
                return i11;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int g = d.g(bArr, i, aVar);
                unsafe.putObject(t, j, Integer.valueOf(aVar.a));
                unsafe.putInt(t, j2, i4);
                return g;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(d.c(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(d.b(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int i14 = d.i(bArr, i, aVar);
                unsafe.putObject(t, j, Boolean.valueOf(aVar.b != 0));
                unsafe.putInt(t, j2, i4);
                return i14;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int g2 = d.g(bArr, i, aVar);
                int i15 = aVar.a;
                if (i15 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                        if (f1.a.c(g2, g2 + i15, bArr) != 0) {
                            throw InvalidProtocolBufferException.g();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, g2, i15, b0.a));
                    g2 += i15;
                }
                unsafe.putInt(t, j2, i4);
                return g2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object x = x(i4, i8, t);
                int k = d.k(x, o(i8), bArr, i, i2, aVar);
                K(t, i4, i8, x);
                return k;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int a2 = d.a(bArr, i, aVar);
                unsafe.putObject(t, j, aVar.c);
                unsafe.putInt(t, j2, i4);
                return a2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int g3 = d.g(bArr, i, aVar);
                int i16 = aVar.a;
                b0.c m = m(i8);
                if (m != null && !m.isInRange(i16)) {
                    p(t).c(i3, Long.valueOf(i16));
                    return g3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i16));
                unsafe.putInt(t, j2, i4);
                return g3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int g4 = d.g(bArr, i, aVar);
                unsafe.putObject(t, j, Integer.valueOf(g.a(aVar.a)));
                unsafe.putInt(t, j2, i4);
                return g4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int i17 = d.i(bArr, i, aVar);
                unsafe.putObject(t, j, Long.valueOf(g.b(aVar.b)));
                unsafe.putInt(t, j2, i4);
                return i17;
            case 68:
                if (i5 == 3) {
                    Object x2 = x(i4, i8, t);
                    int j3 = d.j(x2, o(i8), bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    K(t, i4, i8, x2);
                    return j3;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d.a aVar) throws IOException {
        int h;
        Unsafe unsafe = p;
        b0.d dVar = (b0.d) unsafe.getObject(t, j2);
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, dVar);
        }
        b0.d dVar2 = dVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    s sVar = (s) dVar2;
                    int g = d.g(bArr, i, aVar);
                    int i8 = aVar.a + g;
                    while (g < i8) {
                        sVar.addDouble(Double.longBitsToDouble(d.c(g, bArr)));
                        g += 8;
                    }
                    if (g == i8) {
                        return g;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 1) {
                    s sVar2 = (s) dVar2;
                    sVar2.addDouble(Double.longBitsToDouble(d.c(i, bArr)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int g2 = d.g(bArr, i9, aVar);
                        if (i3 != aVar.a) {
                            return i9;
                        }
                        sVar2.addDouble(Double.longBitsToDouble(d.c(g2, bArr)));
                        i9 = g2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    z zVar = (z) dVar2;
                    int g3 = d.g(bArr, i, aVar);
                    int i10 = aVar.a + g3;
                    while (g3 < i10) {
                        zVar.addFloat(Float.intBitsToFloat(d.b(g3, bArr)));
                        g3 += 4;
                    }
                    if (g3 == i10) {
                        return g3;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 5) {
                    z zVar2 = (z) dVar2;
                    zVar2.addFloat(Float.intBitsToFloat(d.b(i, bArr)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int g4 = d.g(bArr, i11, aVar);
                        if (i3 != aVar.a) {
                            return i11;
                        }
                        zVar2.addFloat(Float.intBitsToFloat(d.b(g4, bArr)));
                        i11 = g4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    e0 e0Var = (e0) dVar2;
                    int g5 = d.g(bArr, i, aVar);
                    int i12 = aVar.a + g5;
                    while (g5 < i12) {
                        g5 = d.i(bArr, g5, aVar);
                        e0Var.addLong(aVar.b);
                    }
                    if (g5 == i12) {
                        return g5;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    e0 e0Var2 = (e0) dVar2;
                    int i13 = d.i(bArr, i, aVar);
                    e0Var2.addLong(aVar.b);
                    while (i13 < i2) {
                        int g6 = d.g(bArr, i13, aVar);
                        if (i3 != aVar.a) {
                            return i13;
                        }
                        i13 = d.i(bArr, g6, aVar);
                        e0Var2.addLong(aVar.b);
                    }
                    return i13;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return d.h(i3, bArr, i, i2, dVar2, aVar);
                    }
                    return i;
                }
                a0 a0Var = (a0) dVar2;
                int g7 = d.g(bArr, i, aVar);
                int i14 = aVar.a + g7;
                while (g7 < i14) {
                    g7 = d.g(bArr, g7, aVar);
                    a0Var.addInt(aVar.a);
                }
                if (g7 == i14) {
                    return g7;
                }
                throw InvalidProtocolBufferException.l();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    e0 e0Var3 = (e0) dVar2;
                    int g8 = d.g(bArr, i, aVar);
                    int i15 = aVar.a + g8;
                    while (g8 < i15) {
                        e0Var3.addLong(d.c(g8, bArr));
                        g8 += 8;
                    }
                    if (g8 == i15) {
                        return g8;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 1) {
                    e0 e0Var4 = (e0) dVar2;
                    e0Var4.addLong(d.c(i, bArr));
                    int i16 = i + 8;
                    while (i16 < i2) {
                        int g9 = d.g(bArr, i16, aVar);
                        if (i3 != aVar.a) {
                            return i16;
                        }
                        e0Var4.addLong(d.c(g9, bArr));
                        i16 = g9 + 8;
                    }
                    return i16;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    a0 a0Var2 = (a0) dVar2;
                    int g10 = d.g(bArr, i, aVar);
                    int i17 = aVar.a + g10;
                    while (g10 < i17) {
                        a0Var2.addInt(d.b(g10, bArr));
                        g10 += 4;
                    }
                    if (g10 == i17) {
                        return g10;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 5) {
                    a0 a0Var3 = (a0) dVar2;
                    a0Var3.addInt(d.b(i, bArr));
                    int i18 = i + 4;
                    while (i18 < i2) {
                        int g11 = d.g(bArr, i18, aVar);
                        if (i3 != aVar.a) {
                            return i18;
                        }
                        a0Var3.addInt(d.b(g11, bArr));
                        i18 = g11 + 4;
                    }
                    return i18;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    e eVar = (e) dVar2;
                    int g12 = d.g(bArr, i, aVar);
                    int i19 = aVar.a + g12;
                    while (g12 < i19) {
                        g12 = d.i(bArr, g12, aVar);
                        eVar.addBoolean(aVar.b != 0);
                    }
                    if (g12 == i19) {
                        return g12;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    e eVar2 = (e) dVar2;
                    int i20 = d.i(bArr, i, aVar);
                    eVar2.addBoolean(aVar.b != 0);
                    while (i20 < i2) {
                        int g13 = d.g(bArr, i20, aVar);
                        if (i3 != aVar.a) {
                            return i20;
                        }
                        i20 = d.i(bArr, g13, aVar);
                        eVar2.addBoolean(aVar.b != 0);
                    }
                    return i20;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int g14 = d.g(bArr, i, aVar);
                        int i21 = aVar.a;
                        if (i21 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i21 == 0) {
                            dVar2.add("");
                        } else {
                            dVar2.add(new String(bArr, g14, i21, b0.a));
                            g14 += i21;
                        }
                        while (g14 < i2) {
                            int g15 = d.g(bArr, g14, aVar);
                            if (i3 != aVar.a) {
                                return g14;
                            }
                            g14 = d.g(bArr, g15, aVar);
                            int i22 = aVar.a;
                            if (i22 < 0) {
                                throw InvalidProtocolBufferException.i();
                            }
                            if (i22 == 0) {
                                dVar2.add("");
                            } else {
                                dVar2.add(new String(bArr, g14, i22, b0.a));
                                g14 += i22;
                            }
                        }
                        return g14;
                    }
                    int g16 = d.g(bArr, i, aVar);
                    int i23 = aVar.a;
                    if (i23 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i23 == 0) {
                        dVar2.add("");
                    } else {
                        int i24 = g16 + i23;
                        if (f1.a.c(g16, i24, bArr) != 0) {
                            throw InvalidProtocolBufferException.g();
                        }
                        dVar2.add(new String(bArr, g16, i23, b0.a));
                        g16 = i24;
                    }
                    while (g16 < i2) {
                        int g17 = d.g(bArr, g16, aVar);
                        if (i3 != aVar.a) {
                            return g16;
                        }
                        g16 = d.g(bArr, g17, aVar);
                        int i25 = aVar.a;
                        if (i25 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i25 == 0) {
                            dVar2.add("");
                        } else {
                            int i26 = g16 + i25;
                            if (f1.a.c(g16, i26, bArr) != 0) {
                                throw InvalidProtocolBufferException.g();
                            }
                            dVar2.add(new String(bArr, g16, i25, b0.a));
                            g16 = i26;
                        }
                    }
                    return g16;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return d.d(o(i6), i3, bArr, i, i2, dVar2, aVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int g18 = d.g(bArr, i, aVar);
                    int i27 = aVar.a;
                    if (i27 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i27 > bArr.length - g18) {
                        throw InvalidProtocolBufferException.l();
                    }
                    if (i27 == 0) {
                        dVar2.add(ByteString.b);
                    } else {
                        dVar2.add(ByteString.e(g18, i27, bArr));
                        g18 += i27;
                    }
                    while (g18 < i2) {
                        int g19 = d.g(bArr, g18, aVar);
                        if (i3 != aVar.a) {
                            return g18;
                        }
                        g18 = d.g(bArr, g19, aVar);
                        int i28 = aVar.a;
                        if (i28 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i28 > bArr.length - g18) {
                            throw InvalidProtocolBufferException.l();
                        }
                        if (i28 == 0) {
                            dVar2.add(ByteString.b);
                        } else {
                            dVar2.add(ByteString.e(g18, i28, bArr));
                            g18 += i28;
                        }
                    }
                    return g18;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        h = d.h(i3, bArr, i, i2, dVar2, aVar);
                    }
                    return i;
                }
                a0 a0Var4 = (a0) dVar2;
                h = d.g(bArr, i, aVar);
                int i29 = aVar.a + h;
                while (h < i29) {
                    h = d.g(bArr, h, aVar);
                    a0Var4.addInt(aVar.a);
                }
                if (h != i29) {
                    throw InvalidProtocolBufferException.l();
                }
                x0.j(t, i4, dVar2, m(i6), null, this.l);
                return h;
            case 33:
            case 47:
                if (i5 == 2) {
                    a0 a0Var5 = (a0) dVar2;
                    int g20 = d.g(bArr, i, aVar);
                    int i30 = aVar.a + g20;
                    while (g20 < i30) {
                        g20 = d.g(bArr, g20, aVar);
                        a0Var5.addInt(g.a(aVar.a));
                    }
                    if (g20 == i30) {
                        return g20;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    a0 a0Var6 = (a0) dVar2;
                    int g21 = d.g(bArr, i, aVar);
                    a0Var6.addInt(g.a(aVar.a));
                    while (g21 < i2) {
                        int g22 = d.g(bArr, g21, aVar);
                        if (i3 != aVar.a) {
                            return g21;
                        }
                        g21 = d.g(bArr, g22, aVar);
                        a0Var6.addInt(g.a(aVar.a));
                    }
                    return g21;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    e0 e0Var5 = (e0) dVar2;
                    int g23 = d.g(bArr, i, aVar);
                    int i31 = aVar.a + g23;
                    while (g23 < i31) {
                        g23 = d.i(bArr, g23, aVar);
                        e0Var5.addLong(g.b(aVar.b));
                    }
                    if (g23 == i31) {
                        return g23;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i5 == 0) {
                    e0 e0Var6 = (e0) dVar2;
                    int i32 = d.i(bArr, i, aVar);
                    e0Var6.addLong(g.b(aVar.b));
                    while (i32 < i2) {
                        int g24 = d.g(bArr, i32, aVar);
                        if (i3 != aVar.a) {
                            return i32;
                        }
                        i32 = d.i(bArr, g24, aVar);
                        e0Var6.addLong(g.b(aVar.b));
                    }
                    return i32;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    w0 o2 = o(i6);
                    int i33 = (i3 & (-8)) | 4;
                    Object b = o2.b();
                    int j3 = d.j(b, o2, bArr, i, i2, i33, aVar);
                    w0 w0Var = o2;
                    w0Var.d(b);
                    aVar.c = b;
                    dVar2.add(b);
                    w0 w0Var2 = w0Var;
                    while (j3 < i2) {
                        int g25 = d.g(bArr, j3, aVar);
                        if (i3 != aVar.a) {
                            return j3;
                        }
                        Object b2 = w0Var2.b();
                        w0 w0Var3 = w0Var2;
                        j3 = d.j(b2, w0Var3, bArr, g25, i2, i33, aVar);
                        w0Var3.d(b2);
                        aVar.c = b2;
                        dVar2.add(b2);
                        w0Var2 = w0Var3;
                    }
                    return j3;
                }
                return i;
            default:
                return i;
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return;
        }
        t5q0.n((1 << (i2 >>> 20)) | t5q0.c.g(j, obj), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        t5q0.n(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int I(int i, int i2) {
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

    public final void J(int i, Object obj, Object obj2) {
        p.putObject(obj, M(i) & 1048575, obj2);
        G(i, obj);
    }

    public final void K(T t, int i, int i2, Object obj) {
        p.putObject(t, M(i2) & 1048575, obj);
        H(i, i2, t);
    }

    public final int M(int i) {
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
    public final void N(T t, Writer writer) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        j0<T> j0Var = this;
        boolean z3 = j0Var.f;
        w<?> wVar = j0Var.m;
        if (z3) {
            y<?> c = wVar.c(t);
            if (!c.a.isEmpty()) {
                entry = c.g().next();
                int[] iArr = j0Var.a;
                length = iArr.length;
                Unsafe unsafe = p;
                int i4 = 1048575;
                int i5 = 0;
                for (i = 0; i < length; i += 3) {
                    int M = j0Var.M(i);
                    int i6 = iArr[i];
                    int L = L(M);
                    if (L <= 17) {
                        int i7 = iArr[i + 2];
                        z = 1;
                        int i8 = i7 & 1048575;
                        if (i8 != i4) {
                            i5 = i8 == 1048575 ? 0 : unsafe.getInt(t, i8);
                            i4 = i8;
                        }
                        i2 = M;
                        i3 = 1 << (i7 >>> 20);
                    } else {
                        z = 1;
                        i2 = M;
                        i3 = 0;
                    }
                    if (entry != null) {
                        wVar.a(entry);
                        if (i6 >= 0) {
                            wVar.g(entry);
                            throw null;
                        }
                    }
                    long j = i2 & 1048575;
                    switch (L) {
                        case 0:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                double e = t5q0.c.e(j, t);
                                CodedOutputStream codedOutputStream = ((h) writer).a;
                                codedOutputStream.getClass();
                                codedOutputStream.I(i6, Double.doubleToRawLongBits(e));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                float f = t5q0.c.f(j, t);
                                CodedOutputStream codedOutputStream2 = ((h) writer).a;
                                codedOutputStream2.getClass();
                                codedOutputStream2.G(i6, Float.floatToRawIntBits(f));
                            }
                            j0Var = this;
                            break;
                        case 2:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.V(i6, unsafe.getLong(t, j));
                            }
                            j0Var = this;
                            break;
                        case 3:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.V(i6, unsafe.getLong(t, j));
                            }
                            j0Var = this;
                            break;
                        case 4:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.K(i6, unsafe.getInt(t, j));
                            }
                            j0Var = this;
                            break;
                        case 5:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.I(i6, unsafe.getLong(t, j));
                            }
                            j0Var = this;
                            break;
                        case 6:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.G(i6, unsafe.getInt(t, j));
                            }
                            j0Var = this;
                            break;
                        case 7:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.C(i6, t5q0.c.c(j, t));
                            }
                            j0Var = this;
                            break;
                        case 8:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                P(i6, unsafe.getObject(t, j), writer);
                            }
                            j0Var = this;
                            break;
                        case 9:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.M(i6, (ja20) unsafe.getObject(t, j), j0Var.o(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a(i6, (ByteString) unsafe.getObject(t, j));
                            }
                            j0Var = this;
                            break;
                        case 11:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.T(i6, unsafe.getInt(t, j));
                            }
                            j0Var = this;
                            break;
                        case 12:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.K(i6, unsafe.getInt(t, j));
                            }
                            j0Var = this;
                            break;
                        case 13:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.G(i6, unsafe.getInt(t, j));
                            }
                            j0Var = this;
                            break;
                        case 14:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).a.I(i6, unsafe.getLong(t, j));
                            }
                            j0Var = this;
                            break;
                        case 15:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                int i9 = unsafe.getInt(t, j);
                                ((h) writer).a.T(i6, (i9 >> 31) ^ (i9 << 1));
                            }
                            j0Var = this;
                            break;
                        case 16:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                long j2 = unsafe.getLong(t, j);
                                ((h) writer).a.V(i6, (j2 << 1) ^ (j2 >> 63));
                            }
                            j0Var = this;
                            break;
                        case 17:
                            if (j0Var.r(t, i, i4, i5, i3)) {
                                ((h) writer).b(i6, unsafe.getObject(t, j), j0Var.o(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z2 = false;
                            x0.p(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 19:
                            z2 = false;
                            x0.t(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 20:
                            z2 = false;
                            x0.w(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 21:
                            z2 = false;
                            x0.E(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 22:
                            z2 = false;
                            x0.v(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 23:
                            z2 = false;
                            x0.s(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 24:
                            z2 = false;
                            x0.r(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 25:
                            z2 = false;
                            x0.n(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 26:
                            x0.C(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 27:
                            x0.x(iArr[i], (List) unsafe.getObject(t, j), writer, j0Var.o(i));
                            break;
                        case 28:
                            x0.o(iArr[i], (List) unsafe.getObject(t, j), writer);
                            break;
                        case 29:
                            z2 = false;
                            x0.D(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 30:
                            z2 = false;
                            x0.q(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 31:
                            z2 = false;
                            x0.y(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 32:
                            z2 = false;
                            x0.z(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 33:
                            z2 = false;
                            x0.A(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 34:
                            z2 = false;
                            x0.B(iArr[i], (List) unsafe.getObject(t, j), writer, false);
                            break;
                        case 35:
                            x0.p(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 36:
                            x0.t(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 37:
                            x0.w(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 38:
                            x0.E(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 39:
                            x0.v(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 40:
                            x0.s(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 41:
                            x0.r(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 42:
                            x0.n(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 43:
                            x0.D(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 44:
                            x0.q(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 45:
                            x0.y(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 46:
                            x0.z(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 47:
                            x0.A(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 48:
                            x0.B(iArr[i], (List) unsafe.getObject(t, j), writer, z);
                            break;
                        case 49:
                            x0.u(iArr[i], (List) unsafe.getObject(t, j), writer, j0Var.o(i));
                            break;
                        case 50:
                            j0Var.O(writer, i6, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (j0Var.t(i6, i, t)) {
                                double doubleValue = ((Double) t5q0.c.i(j, t)).doubleValue();
                                CodedOutputStream codedOutputStream3 = ((h) writer).a;
                                codedOutputStream3.getClass();
                                codedOutputStream3.I(i6, Double.doubleToRawLongBits(doubleValue));
                            }
                            break;
                        case 52:
                            if (j0Var.t(i6, i, t)) {
                                float floatValue = ((Float) t5q0.c.i(j, t)).floatValue();
                                CodedOutputStream codedOutputStream4 = ((h) writer).a;
                                codedOutputStream4.getClass();
                                codedOutputStream4.G(i6, Float.floatToRawIntBits(floatValue));
                            }
                            break;
                        case 53:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.V(i6, A(j, t));
                            }
                            break;
                        case 54:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.V(i6, A(j, t));
                            }
                            break;
                        case 55:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.K(i6, z(j, t));
                            }
                            break;
                        case 56:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.I(i6, A(j, t));
                            }
                            break;
                        case 57:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.G(i6, z(j, t));
                            }
                            break;
                        case 58:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.C(i6, ((Boolean) t5q0.c.i(j, t)).booleanValue());
                            }
                            break;
                        case 59:
                            if (j0Var.t(i6, i, t)) {
                                P(i6, unsafe.getObject(t, j), writer);
                            }
                            break;
                        case 60:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.M(i6, (ja20) unsafe.getObject(t, j), j0Var.o(i));
                            }
                            break;
                        case 61:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a(i6, (ByteString) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.T(i6, z(j, t));
                            }
                            break;
                        case 63:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.K(i6, z(j, t));
                            }
                            break;
                        case 64:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.G(i6, z(j, t));
                            }
                            break;
                        case 65:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).a.I(i6, A(j, t));
                            }
                            break;
                        case 66:
                            if (j0Var.t(i6, i, t)) {
                                int z4 = z(j, t);
                                ((h) writer).a.T(i6, (z4 >> 31) ^ (z4 << 1));
                            }
                            break;
                        case 67:
                            if (j0Var.t(i6, i, t)) {
                                long A = A(j, t);
                                ((h) writer).a.V(i6, (A << z) ^ (A >> 63));
                            }
                            break;
                        case 68:
                            if (j0Var.t(i6, i, t)) {
                                ((h) writer).b(i6, unsafe.getObject(t, j), j0Var.o(i));
                            }
                            break;
                    }
                }
                if (entry == null) {
                    wVar.g(entry);
                    throw null;
                }
                c1<?, ?> c1Var = j0Var.l;
                c1Var.l(c1Var.d(t), writer);
                return;
            }
        }
        entry = null;
        int[] iArr2 = j0Var.a;
        length = iArr2.length;
        Unsafe unsafe2 = p;
        int i42 = 1048575;
        int i52 = 0;
        while (i < length) {
        }
        if (entry == null) {
        }
    }

    public final <K, V> void O(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object n = n(i2);
            g0 g0Var = this.n;
            f0.a<?, ?> b = g0Var.b(n);
            MapFieldLite e = g0Var.e(obj);
            CodedOutputStream codedOutputStream = ((h) writer).a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : e.entrySet()) {
                codedOutputStream.S(i, 2);
                codedOutputStream.U(f0.a(b, entry.getKey(), entry.getValue()));
                f0.b(codedOutputStream, b, entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.health.platform.client.proto.w0
    public final void a(T t, T t2) {
        T t3;
        k(t);
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = x0.a;
                c1<?, ?> c1Var = this.l;
                c1Var.j(t4, c1Var.h(c1Var.d(t4), c1Var.d(t2)));
                if (this.f) {
                    x0.k(this.m, t4, t2);
                    return;
                }
                return;
            }
            int M = M(i);
            long j = 1048575 & M;
            int i2 = iArr[i];
            switch (L(M)) {
                case 0:
                    if (q(i, t2)) {
                        t5q0.e eVar = t5q0.c;
                        t3 = t;
                        eVar.m(t3, j, eVar.e(j, t2));
                        G(i, t3);
                        break;
                    }
                    t3 = t;
                    break;
                case 1:
                    if (q(i, t2)) {
                        t5q0.e eVar2 = t5q0.c;
                        eVar2.n(t, j, eVar2.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (q(i, t2)) {
                        t5q0.o(t, j, t5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (q(i, t2)) {
                        t5q0.o(t, j, t5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (q(i, t2)) {
                        t5q0.o(t, j, t5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (q(i, t2)) {
                        t5q0.e eVar3 = t5q0.c;
                        eVar3.k(j, t, eVar3.c(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (q(i, t2)) {
                        t5q0.p(j, t, t5q0.c.i(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    u(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (q(i, t2)) {
                        t5q0.p(j, t, t5q0.c.i(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (q(i, t2)) {
                        t5q0.o(t, j, t5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (q(i, t2)) {
                        t5q0.n(t5q0.c.g(j, t2), j, t);
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (q(i, t2)) {
                        t5q0.o(t, j, t5q0.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    u(i, t, t2);
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
                    this.k.b(j, t, t2);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = x0.a;
                    t5q0.e eVar4 = t5q0.c;
                    t5q0.p(j, t, this.n.a(eVar4.i(j, t), eVar4.i(j, t2)));
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
                    if (t(i2, i, t2)) {
                        t5q0.p(j, t, t5q0.c.i(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 60:
                    v(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i2, i, t2)) {
                        t5q0.p(j, t, t5q0.c.i(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 68:
                    v(i, t, t2);
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

    @Override // androidx.health.platform.client.proto.w0
    public final T b() {
        return (T) this.j.a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.health.platform.client.proto.w0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.health.platform.client.proto.w0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.health.platform.client.proto.w0] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.health.platform.client.proto.w0] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // androidx.health.platform.client.proto.w0
    public final boolean c(T t) {
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
            int M = M(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = p.getInt(t, i10);
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
            if ((268435456 & M) == 0 || r(t, i2, i, i3, i11)) {
                int L = L(M);
                if (L == 9 || L == 17) {
                    if (r(t, i2, i, i3, i11)) {
                        if (!o(i2).c(t5q0.c.i(M & 1048575, t))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (L != 27) {
                        if (L == 60 || L == 68) {
                            if (t(i8, i2, t)) {
                                if (!o(i2).c(t5q0.c.i(M & 1048575, t))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (L != 49) {
                            if (L != 50) {
                                continue;
                            } else {
                                Object i13 = t5q0.c.i(M & 1048575, t);
                                g0 g0Var = this.n;
                                MapFieldLite e = g0Var.e(i13);
                                if (!e.isEmpty() && g0Var.b(n(i2)).b.h() == WireFormat$JavaType.MESSAGE) {
                                    ?? r5 = 0;
                                    for (Object obj : e.values()) {
                                        r5 = r5;
                                        if (r5 == 0) {
                                            r5 = s8e0.c.a(obj.getClass());
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
                    List list = (List) t5q0.c.i(M & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? o2 = o(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o2.c(list.get(i14))) {
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
            this.m.c(t).e();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w0
    public final void d(T t) {
        if (s(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.g(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.o();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int M = M(i);
                long j = 1048575 & M;
                int L = L(M);
                if (L != 9) {
                    if (L != 60 && L != 68) {
                        switch (L) {
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
                                this.k.a(j, t);
                                break;
                            case 50:
                                Unsafe unsafe = p;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.n.c(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (t(iArr[i], i, t)) {
                        o(i).d(p.getObject(t, j));
                    }
                }
                if (q(i, t)) {
                    o(i).d(p.getObject(t, j));
                }
            }
            this.l.g(t);
            if (this.f) {
                this.m.f(t);
            }
        }
    }

    @Override // androidx.health.platform.client.proto.w0
    public final void e(T t, byte[] bArr, int i, int i2, d.a aVar) throws IOException {
        C(t, bArr, i, i2, 0, aVar);
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
    @Override // androidx.health.platform.client.proto.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int M = M(i4);
            int i5 = iArr[i4];
            long j = 1048575 & M;
            int i6 = 1237;
            int i7 = 37;
            switch (L(M)) {
                case 0:
                    i = i3 * 53;
                    b = b0.b(Double.doubleToLongBits(t5q0.c.e(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(t5q0.c.f(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = b0.b(t5q0.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = b0.b(t5q0.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = b0.b(t5q0.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = t5q0.c.c(j, generatedMessageLite);
                    Charset charset = b0.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) t5q0.c.i(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = t5q0.c.i(j, generatedMessageLite);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = t5q0.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = b0.b(t5q0.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = t5q0.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = b0.b(t5q0.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = t5q0.c.i(j, generatedMessageLite);
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
                    b = t5q0.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = t5q0.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(Double.doubleToLongBits(((Double) t5q0.c.i(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) t5q0.c.i(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) t5q0.c.i(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = b0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) t5q0.c.i(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = t5q0.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = t5q0.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = b0.b(A(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = t5q0.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.l.d(generatedMessageLite).hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        return this.m.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fc  */
    @Override // androidx.health.platform.client.proto.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(T t, Writer writer) throws IOException {
        Map.Entry entry;
        int length;
        Iterator it;
        h hVar = (h) writer;
        hVar.getClass();
        if (Writer.FieldOrder.ASCENDING != Writer.FieldOrder.DESCENDING) {
            N(t, writer);
            return;
        }
        w<?> wVar = this.m;
        int[] iArr = this.a;
        c1<?, ?> c1Var = this.l;
        c1Var.l(c1Var.d(t), writer);
        if (this.f) {
            y<?> c = wVar.c(t);
            if (!c.a.isEmpty()) {
                y0 y0Var = c.a;
                if (y0Var.isEmpty()) {
                    it = Collections.emptyIterator();
                } else if (c.c) {
                    if (y0Var.g == null) {
                        y0Var.g = new z0.b();
                    }
                    it = new c0.b(y0Var.g.iterator());
                } else {
                    if (y0Var.g == null) {
                        y0Var.g = new z0.b();
                    }
                    it = y0Var.g.iterator();
                }
                entry = (Map.Entry) it.next();
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int M = M(length);
                    int i = iArr[length];
                    if (entry != null) {
                        wVar.a(entry);
                        if (i < 0) {
                            wVar.g(entry);
                            throw null;
                        }
                    }
                    switch (L(M)) {
                        case 0:
                            if (q(length, t)) {
                                double e = t5q0.c.e(M & 1048575, t);
                                CodedOutputStream codedOutputStream = hVar.a;
                                codedOutputStream.getClass();
                                codedOutputStream.I(i, Double.doubleToRawLongBits(e));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (q(length, t)) {
                                float f = t5q0.c.f(M & 1048575, t);
                                CodedOutputStream codedOutputStream2 = hVar.a;
                                codedOutputStream2.getClass();
                                codedOutputStream2.G(i, Float.floatToRawIntBits(f));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (q(length, t)) {
                                hVar.a.V(i, t5q0.c.h(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (q(length, t)) {
                                hVar.a.V(i, t5q0.c.h(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (q(length, t)) {
                                hVar.a.K(i, t5q0.c.g(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (q(length, t)) {
                                hVar.a.I(i, t5q0.c.h(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (q(length, t)) {
                                hVar.a.G(i, t5q0.c.g(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (q(length, t)) {
                                hVar.a.C(i, t5q0.c.c(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (q(length, t)) {
                                P(i, t5q0.c.i(M & 1048575, t), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (q(length, t)) {
                                hVar.a.M(i, (ja20) t5q0.c.i(M & 1048575, t), o(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (q(length, t)) {
                                hVar.a(i, (ByteString) t5q0.c.i(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (q(length, t)) {
                                hVar.a.T(i, t5q0.c.g(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (q(length, t)) {
                                hVar.a.K(i, t5q0.c.g(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (q(length, t)) {
                                hVar.a.G(i, t5q0.c.g(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (q(length, t)) {
                                hVar.a.I(i, t5q0.c.h(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (q(length, t)) {
                                int g = t5q0.c.g(M & 1048575, t);
                                hVar.a.T(i, (g >> 31) ^ (g << 1));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (q(length, t)) {
                                long h = t5q0.c.h(M & 1048575, t);
                                hVar.a.V(i, (h << 1) ^ (h >> 63));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (q(length, t)) {
                                hVar.b(i, t5q0.c.i(M & 1048575, t), o(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            x0.p(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 19:
                            x0.t(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 20:
                            x0.w(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 21:
                            x0.E(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 22:
                            x0.v(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 23:
                            x0.s(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 24:
                            x0.r(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 25:
                            x0.n(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 26:
                            x0.C(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer);
                            break;
                        case 27:
                            x0.x(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, o(length));
                            break;
                        case 28:
                            x0.o(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer);
                            break;
                        case 29:
                            x0.D(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 30:
                            x0.q(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 31:
                            x0.y(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 32:
                            x0.z(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 33:
                            x0.A(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 34:
                            x0.B(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, false);
                            break;
                        case 35:
                            x0.p(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 36:
                            x0.t(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 37:
                            x0.w(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 38:
                            x0.E(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 39:
                            x0.v(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 40:
                            x0.s(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 41:
                            x0.r(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 42:
                            x0.n(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 43:
                            x0.D(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 44:
                            x0.q(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 45:
                            x0.y(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 46:
                            x0.z(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 47:
                            x0.A(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 48:
                            x0.B(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, true);
                            break;
                        case 49:
                            x0.u(iArr[length], (List) t5q0.c.i(M & 1048575, t), writer, o(length));
                            break;
                        case 50:
                            O(writer, i, t5q0.c.i(M & 1048575, t), length);
                            break;
                        case 51:
                            if (t(i, length, t)) {
                                double doubleValue = ((Double) t5q0.c.i(M & 1048575, t)).doubleValue();
                                CodedOutputStream codedOutputStream3 = hVar.a;
                                codedOutputStream3.getClass();
                                codedOutputStream3.I(i, Double.doubleToRawLongBits(doubleValue));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (t(i, length, t)) {
                                float floatValue = ((Float) t5q0.c.i(M & 1048575, t)).floatValue();
                                CodedOutputStream codedOutputStream4 = hVar.a;
                                codedOutputStream4.getClass();
                                codedOutputStream4.G(i, Float.floatToRawIntBits(floatValue));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (t(i, length, t)) {
                                hVar.a.V(i, A(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (t(i, length, t)) {
                                hVar.a.V(i, A(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (t(i, length, t)) {
                                hVar.a.K(i, z(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (t(i, length, t)) {
                                hVar.a.I(i, A(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (t(i, length, t)) {
                                hVar.a.G(i, z(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (t(i, length, t)) {
                                hVar.a.C(i, ((Boolean) t5q0.c.i(M & 1048575, t)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (t(i, length, t)) {
                                P(i, t5q0.c.i(M & 1048575, t), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (t(i, length, t)) {
                                hVar.a.M(i, (ja20) t5q0.c.i(M & 1048575, t), o(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (t(i, length, t)) {
                                hVar.a(i, (ByteString) t5q0.c.i(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (t(i, length, t)) {
                                hVar.a.T(i, z(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (t(i, length, t)) {
                                hVar.a.K(i, z(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (t(i, length, t)) {
                                hVar.a.G(i, z(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (t(i, length, t)) {
                                hVar.a.I(i, A(M & 1048575, t));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (t(i, length, t)) {
                                int z = z(M & 1048575, t);
                                hVar.a.T(i, (z >> 31) ^ (z << 1));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (t(i, length, t)) {
                                long A = A(M & 1048575, t);
                                hVar.a.V(i, (A << 1) ^ (A >> 63));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (t(i, length, t)) {
                                hVar.b(i, t5q0.c.i(M & 1048575, t), o(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (entry != null) {
                    return;
                }
                wVar.g(entry);
                throw null;
            }
        }
        entry = null;
        while (length >= 0) {
        }
        if (entry != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w0
    public final int h(androidx.health.platform.client.proto.a aVar) {
        int i;
        int y;
        int y2;
        int y3;
        int A;
        int y4;
        int A2;
        int y5;
        int y6;
        int y7;
        int e;
        int z;
        int y8;
        int u;
        int s;
        int y9;
        int e2;
        int c;
        int y10;
        int size;
        int i2;
        int y11;
        int y12;
        int size2;
        int y13;
        int z2;
        int i3;
        int y14;
        int y15;
        int A3;
        j0<T> j0Var = this;
        T t = aVar;
        Unsafe unsafe = p;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = j0Var.a;
            if (i4 >= iArr.length) {
                c1<?, ?> c1Var = j0Var.l;
                int e3 = c1Var.e(c1Var.d(t)) + i6;
                if (!j0Var.f) {
                    return e3;
                }
                y0 y0Var = j0Var.m.c(t).a;
                int size3 = y0Var.b.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    Map.Entry<y.b<Object>, Object> c2 = y0Var.c(i9);
                    i8 += y.c(c2.getKey(), c2.getValue());
                }
                for (Map.Entry entry : y0Var.d()) {
                    i8 += y.c((y.b) entry.getKey(), entry.getValue());
                }
                return e3 + i8;
            }
            int M = j0Var.M(i4);
            int L = L(M);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (L <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(t, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            long j = M & 1048575;
            if (L >= FieldType.DOUBLE_LIST_PACKED.h()) {
                FieldType.SINT64_LIST_PACKED.h();
            }
            switch (L) {
                case 0:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y = CodedOutputStream.y(i10);
                        c = y + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y2 = CodedOutputStream.y(i10);
                        y6 = y2 + 4;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 2:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(t, j);
                        y3 = CodedOutputStream.y(i10);
                        A = CodedOutputStream.A(j2);
                        i6 += A + y3;
                    }
                    j0Var = this;
                    break;
                case 3:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(t, j);
                        y3 = CodedOutputStream.y(i10);
                        A = CodedOutputStream.A(j3);
                        i6 += A + y3;
                    }
                    j0Var = this;
                    break;
                case 4:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(t, j);
                        y4 = CodedOutputStream.y(i10);
                        A2 = CodedOutputStream.A(i13);
                        s = A2 + y4;
                        i6 += s;
                    }
                    j0Var = this;
                    break;
                case 5:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y5 = CodedOutputStream.y(i10);
                        y6 = y5 + 8;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 6:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y2 = CodedOutputStream.y(i10);
                        y6 = y2 + 4;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 7:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y6 = CodedOutputStream.y(i10) + 1;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 8:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(t, j);
                        i6 = (object instanceof ByteString ? CodedOutputStream.s(i10, (ByteString) object) : CodedOutputStream.x((String) object) + CodedOutputStream.y(i10)) + i6;
                    }
                    j0Var = this;
                    break;
                case 9:
                    if (!j0Var.r(t, i4, i7, i5, i)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, j);
                        w0 o2 = j0Var.o(i4);
                        Class<?> cls = x0.a;
                        if (object2 instanceof nqy) {
                            y8 = CodedOutputStream.y(i10);
                            u = CodedOutputStream.u((nqy) object2);
                            c = u + y8;
                            i6 += c;
                            break;
                        } else {
                            y7 = CodedOutputStream.y(i10);
                            e = ((androidx.health.platform.client.proto.a) ((ja20) object2)).e(o2);
                            z = CodedOutputStream.z(e);
                            c = z + e + y7;
                            i6 += c;
                        }
                    }
                case 10:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        s = CodedOutputStream.s(i10, (ByteString) unsafe.getObject(t, j));
                        i6 += s;
                    }
                    j0Var = this;
                    break;
                case 11:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(t, j);
                        y4 = CodedOutputStream.y(i10);
                        A2 = CodedOutputStream.z(i14);
                        s = A2 + y4;
                        i6 += s;
                    }
                    j0Var = this;
                    break;
                case 12:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(t, j);
                        y4 = CodedOutputStream.y(i10);
                        A2 = CodedOutputStream.A(i15);
                        s = A2 + y4;
                        i6 += s;
                    }
                    j0Var = this;
                    break;
                case 13:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y2 = CodedOutputStream.y(i10);
                        y6 = y2 + 4;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 14:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        y5 = CodedOutputStream.y(i10);
                        y6 = y5 + 8;
                        i6 += y6;
                    }
                    j0Var = this;
                    t = aVar;
                    break;
                case 15:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(t, j);
                        y4 = CodedOutputStream.y(i10);
                        A2 = CodedOutputStream.v(i16);
                        s = A2 + y4;
                        i6 += s;
                    }
                    j0Var = this;
                    break;
                case 16:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(t, j);
                        y3 = CodedOutputStream.y(i10);
                        A = CodedOutputStream.w(j4);
                        i6 += A + y3;
                    }
                    j0Var = this;
                    break;
                case 17:
                    if (j0Var.r(t, i4, i7, i5, i)) {
                        ja20 ja20Var = (ja20) unsafe.getObject(t, j);
                        w0 o3 = j0Var.o(i4);
                        y9 = CodedOutputStream.y(i10) * 2;
                        e2 = ((androidx.health.platform.client.proto.a) ja20Var).e(o3);
                        c = e2 + y9;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = x0.c(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 19:
                    c = x0.b(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls2 = x0.a;
                    if (list.size() != 0) {
                        y10 = (CodedOutputStream.y(i10) * list.size()) + x0.e(list);
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 21:
                    List list2 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = x0.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = x0.i(list2);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 22:
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls4 = x0.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = x0.d(list3);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 23:
                    c = x0.c(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 24:
                    c = x0.b(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t, j);
                    Class<?> cls5 = x0.a;
                    int size4 = list4.size();
                    i6 += size4 == 0 ? 0 : (CodedOutputStream.y(i10) + 1) * size4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t, j);
                    Class<?> cls6 = x0.a;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        y10 = CodedOutputStream.y(i10) * size5;
                        if (list5 instanceof zxy) {
                            zxy zxyVar = (zxy) list5;
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object D0 = zxyVar.D0();
                                y10 = (D0 instanceof ByteString ? CodedOutputStream.t((ByteString) D0) : CodedOutputStream.x((String) D0)) + y10;
                            }
                        } else {
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object obj = list5.get(i18);
                                y10 = (obj instanceof ByteString ? CodedOutputStream.t((ByteString) obj) : CodedOutputStream.x((String) obj)) + y10;
                            }
                        }
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 27:
                    List list6 = (List) unsafe.getObject(t, j);
                    w0 o4 = j0Var.o(i4);
                    Class<?> cls7 = x0.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        y12 = 0;
                    } else {
                        y12 = CodedOutputStream.y(i10) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            Object obj2 = list6.get(i19);
                            if (obj2 instanceof nqy) {
                                y12 = CodedOutputStream.u((nqy) obj2) + y12;
                            } else {
                                int e4 = ((androidx.health.platform.client.proto.a) ((ja20) obj2)).e(o4);
                                y12 = CodedOutputStream.z(e4) + e4 + y12;
                            }
                        }
                    }
                    i6 += y12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t, j);
                    Class<?> cls8 = x0.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        y10 = CodedOutputStream.y(i10) * size7;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            y10 += CodedOutputStream.t((ByteString) list7.get(i20));
                        }
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 29:
                    List list8 = (List) unsafe.getObject(t, j);
                    Class<?> cls9 = x0.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = x0.h(list8);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 30:
                    List list9 = (List) unsafe.getObject(t, j);
                    Class<?> cls10 = x0.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = x0.a(list9);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 31:
                    c = x0.b(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 32:
                    c = x0.c(i10, (List) unsafe.getObject(t, j));
                    i6 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t, j);
                    Class<?> cls11 = x0.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = x0.f(list10);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 34:
                    List list11 = (List) unsafe.getObject(t, j);
                    Class<?> cls12 = x0.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = x0.g(list11);
                        y11 = CodedOutputStream.y(i10);
                        y10 = (y11 * size) + i2;
                        i6 += y10;
                        break;
                    }
                    y10 = 0;
                    i6 += y10;
                case 35:
                    List list12 = (List) unsafe.getObject(t, j);
                    Class<?> cls13 = x0.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t, j);
                    Class<?> cls14 = x0.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = x0.e((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = x0.i((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = x0.d((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(t, j);
                    Class<?> cls15 = x0.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(t, j);
                    Class<?> cls16 = x0.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(t, j);
                    Class<?> cls17 = x0.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = x0.h((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = x0.a((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(t, j);
                    Class<?> cls18 = x0.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(t, j);
                    Class<?> cls19 = x0.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = x0.f((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = x0.g((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        y13 = CodedOutputStream.y(i10);
                        z2 = CodedOutputStream.z(size2);
                        i6 += z2 + y13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t, j);
                    w0 o5 = j0Var.o(i4);
                    Class<?> cls20 = x0.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i21 = 0; i21 < size8; i21++) {
                            i3 += ((androidx.health.platform.client.proto.a) ((ja20) list19.get(i21))).e(o5) + (CodedOutputStream.y(i10) * 2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    c = j0Var.n.g(i10, unsafe.getObject(t, j), j0Var.n(i4));
                    i6 += c;
                    break;
                case 51:
                    if (j0Var.t(i10, i4, t)) {
                        y = CodedOutputStream.y(i10);
                        c = y + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (j0Var.t(i10, i4, t)) {
                        y14 = CodedOutputStream.y(i10);
                        c = y14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (j0Var.t(i10, i4, t)) {
                        long A4 = A(j, t);
                        y15 = CodedOutputStream.y(i10);
                        A3 = CodedOutputStream.A(A4);
                        i6 += A3 + y15;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (j0Var.t(i10, i4, t)) {
                        long A5 = A(j, t);
                        y15 = CodedOutputStream.y(i10);
                        A3 = CodedOutputStream.A(A5);
                        i6 += A3 + y15;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (j0Var.t(i10, i4, t)) {
                        int z3 = z(j, t);
                        y8 = CodedOutputStream.y(i10);
                        u = CodedOutputStream.A(z3);
                        c = u + y8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (j0Var.t(i10, i4, t)) {
                        y = CodedOutputStream.y(i10);
                        c = y + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (j0Var.t(i10, i4, t)) {
                        y14 = CodedOutputStream.y(i10);
                        c = y14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (j0Var.t(i10, i4, t)) {
                        c = CodedOutputStream.y(i10) + 1;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (j0Var.t(i10, i4, t)) {
                        Object object3 = unsafe.getObject(t, j);
                        i6 = (object3 instanceof ByteString ? CodedOutputStream.s(i10, (ByteString) object3) : CodedOutputStream.x((String) object3) + CodedOutputStream.y(i10)) + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!j0Var.t(i10, i4, t)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(t, j);
                        w0 o6 = j0Var.o(i4);
                        Class<?> cls21 = x0.a;
                        if (object4 instanceof nqy) {
                            y8 = CodedOutputStream.y(i10);
                            u = CodedOutputStream.u((nqy) object4);
                            c = u + y8;
                            i6 += c;
                            break;
                        } else {
                            y7 = CodedOutputStream.y(i10);
                            e = ((androidx.health.platform.client.proto.a) ((ja20) object4)).e(o6);
                            z = CodedOutputStream.z(e);
                            c = z + e + y7;
                            i6 += c;
                        }
                    }
                case 61:
                    if (j0Var.t(i10, i4, t)) {
                        c = CodedOutputStream.s(i10, (ByteString) unsafe.getObject(t, j));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (j0Var.t(i10, i4, t)) {
                        int z4 = z(j, t);
                        y8 = CodedOutputStream.y(i10);
                        u = CodedOutputStream.z(z4);
                        c = u + y8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (j0Var.t(i10, i4, t)) {
                        int z5 = z(j, t);
                        y8 = CodedOutputStream.y(i10);
                        u = CodedOutputStream.A(z5);
                        c = u + y8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (j0Var.t(i10, i4, t)) {
                        y14 = CodedOutputStream.y(i10);
                        c = y14 + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (j0Var.t(i10, i4, t)) {
                        y = CodedOutputStream.y(i10);
                        c = y + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (j0Var.t(i10, i4, t)) {
                        int z6 = z(j, t);
                        y8 = CodedOutputStream.y(i10);
                        u = CodedOutputStream.v(z6);
                        c = u + y8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (j0Var.t(i10, i4, t)) {
                        long A6 = A(j, t);
                        y15 = CodedOutputStream.y(i10);
                        A3 = CodedOutputStream.w(A6);
                        i6 += A3 + y15;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (j0Var.t(i10, i4, t)) {
                        ja20 ja20Var2 = (ja20) unsafe.getObject(t, j);
                        w0 o7 = j0Var.o(i4);
                        y9 = CodedOutputStream.y(i10) * 2;
                        e2 = ((androidx.health.platform.client.proto.a) ja20Var2).e(o7);
                        c = e2 + y9;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.health.platform.client.proto.x0.l(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.health.platform.client.proto.x0.l(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.health.platform.client.proto.x0.l(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.health.platform.client.proto.x0.l(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.health.platform.client.proto.x0.l(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // androidx.health.platform.client.proto.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int M = M(i);
                long j = M & 1048575;
                switch (L(M)) {
                    case 0:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar2 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar3 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar4 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar5 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar6 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar7 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar8 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar9 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar10 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar11 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar12 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar13 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar14 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar15 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar16 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar17 = t5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            t5q0.e eVar18 = t5q0.c;
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
                        t5q0.e eVar19 = t5q0.c;
                        z = x0.l(eVar19.i(j, generatedMessageLite), eVar19.i(j, generatedMessageLite2));
                        break;
                    case 50:
                        t5q0.e eVar20 = t5q0.c;
                        z = x0.l(eVar20.i(j, generatedMessageLite), eVar20.i(j, generatedMessageLite2));
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
                        t5q0.e eVar21 = t5q0.c;
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
                c1<?, ?> c1Var = this.l;
                if (c1Var.d(generatedMessageLite).equals(c1Var.d(generatedMessageLite2))) {
                    if (!this.f) {
                        return true;
                    }
                    w<?> wVar = this.m;
                    return wVar.c(generatedMessageLite).equals(wVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return q(i, generatedMessageLite) == q(i, generatedMessageLite2);
    }

    public final b0.c m(int i) {
        return (b0.c) this.b[fb20.a(i, 3, 2, 1)];
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final w0 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        w0 w0Var = (w0) objArr[i2];
        if (w0Var != null) {
            return w0Var;
        }
        w0<T> a2 = s8e0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a2;
        return a2;
    }

    public final boolean q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            int M = M(i);
            long j2 = M & 1048575;
            switch (L(M)) {
                case 0:
                    if (Double.doubleToRawLongBits(t5q0.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(t5q0.c.f(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (t5q0.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (t5q0.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (t5q0.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return t5q0.c.c(j2, obj);
                case 8:
                    Object i3 = t5q0.c.i(j2, obj);
                    if (i3 instanceof String) {
                        return !((String) i3).isEmpty();
                    }
                    if (i3 instanceof ByteString) {
                        return !ByteString.b.equals(i3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (t5q0.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.b.equals(t5q0.c.i(j2, obj));
                case 11:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (t5q0.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (t5q0.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (t5q0.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (t5q0.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & t5q0.c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean r(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? q(i, t) : (i3 & i4) != 0;
    }

    public final boolean t(int i, int i2, Object obj) {
        return t5q0.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            long M = M(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, M);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            w0 o2 = o(i);
            if (!q(i, obj)) {
                if (s(object)) {
                    Object b = o2.b();
                    o2.a(b, object);
                    unsafe.putObject(obj, M, b);
                } else {
                    unsafe.putObject(obj, M, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M);
            if (!s(object2)) {
                Object b2 = o2.b();
                o2.a(b2, object2);
                unsafe.putObject(obj, M, b2);
                object2 = b2;
            }
            o2.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (t(i2, i, obj2)) {
            long M = M(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, M);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            w0 o2 = o(i);
            if (!t(i2, i, obj)) {
                if (s(object)) {
                    Object b = o2.b();
                    o2.a(b, object);
                    unsafe.putObject(obj, M, b);
                } else {
                    unsafe.putObject(obj, M, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M);
            if (!s(object2)) {
                Object b2 = o2.b();
                o2.a(b2, object2);
                unsafe.putObject(obj, M, b2);
                object2 = b2;
            }
            o2.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(int i, Object obj) {
        w0 o2 = o(i);
        long M = M(i) & 1048575;
        if (!q(i, obj)) {
            return o2.b();
        }
        Object object = p.getObject(obj, M);
        if (s(object)) {
            return object;
        }
        Object b = o2.b();
        if (object != null) {
            o2.a(b, object);
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(int i, int i2, Object obj) {
        w0 o2 = o(i2);
        if (!t(i, i2, obj)) {
            return o2.b();
        }
        Object object = p.getObject(obj, M(i2) & 1048575);
        if (s(object)) {
            return object;
        }
        Object b = o2.b();
        if (object != null) {
            o2.a(b, object);
        }
        return b;
    }
}
