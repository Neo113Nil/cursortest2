package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.b;
import com.google.protobuf.e;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.proto.PublisherConfiguration;
import sun.misc.Unsafe;
import xsna.aa20;
import xsna.cqi;
import xsna.fb20;
import xsna.lye0;
import xsna.p760;
import xsna.t33;
import xsna.u8e0;
import xsna.v5q0;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
public final class p<T> implements v<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = v5q0.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final p760 l;
    public final k m;
    public final z<?, ?> n;
    public final g<?> o;
    public final m p;

    /* compiled from: MessageSchema.java */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public p(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, p760 p760Var, k kVar, z zVar, g gVar, m mVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.f = gVar != null && gVar.e(messageLite);
        this.h = z;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = p760Var;
        this.m = kVar;
        this.n = zVar;
        this.o = gVar;
        this.e = messageLite;
        this.p = mVar;
    }

    public static p B(aa20 aa20Var, p760 p760Var, k kVar, z zVar, g gVar, m mVar) {
        int j;
        int j2;
        int i;
        int i2;
        int l;
        int i3;
        if (aa20Var instanceof lye0) {
            return C((lye0) aa20Var, p760Var, kVar, zVar, gVar, mVar);
        }
        StructuralMessageInfo structuralMessageInfo = (StructuralMessageInfo) aa20Var;
        FieldInfo[] d = structuralMessageInfo.d();
        if (d.length == 0) {
            j = 0;
            j2 = 0;
        } else {
            j = d[0].j();
            j2 = d[d.length - 1].j();
        }
        int length = d.length;
        int[] iArr = new int[length * 3];
        int i4 = 2;
        Object[] objArr = new Object[length * 2];
        int i5 = 0;
        int i6 = 0;
        for (FieldInfo fieldInfo : d) {
            if (fieldInfo.o() == FieldType.MAP) {
                i5++;
            } else if (fieldInfo.o().id() >= 18 && fieldInfo.o().id() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = i5 > 0 ? new int[i5] : null;
        int[] iArr3 = i6 > 0 ? new int[i6] : null;
        int[] c = structuralMessageInfo.c();
        int[] iArr4 = q;
        if (c == null) {
            c = iArr4;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < d.length) {
            FieldInfo fieldInfo2 = d[i7];
            int j3 = fieldInfo2.j();
            FieldType o = fieldInfo2.o();
            int i12 = i4;
            java.lang.reflect.Field i13 = fieldInfo2.i();
            StructuralMessageInfo structuralMessageInfo2 = structuralMessageInfo;
            v5q0.d dVar = v5q0.c;
            FieldInfo[] fieldInfoArr = d;
            int i14 = j;
            int l2 = (int) dVar.l(i13);
            int id = o.id();
            if (o.isList() || o.isMap()) {
                i = l2;
                i2 = id;
                if (fieldInfo2.c() == null) {
                    i3 = 0;
                    l = 0;
                } else {
                    l = (int) dVar.l(fieldInfo2.c());
                    i3 = 0;
                }
            } else {
                java.lang.reflect.Field m = fieldInfo2.m();
                if (m == null) {
                    l = 1048575;
                    i = l2;
                    i2 = id;
                } else {
                    i = l2;
                    i2 = id;
                    l = (int) dVar.l(m);
                }
                i3 = Integer.numberOfTrailingZeros(fieldInfo2.n());
            }
            iArr[i8] = fieldInfo2.j();
            iArr[i8 + 1] = (fieldInfo2.p() ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | (fieldInfo2.q() ? 268435456 : 0) | (i2 << 20) | i;
            iArr[i8 + 2] = (i3 << 20) | l;
            Class<?> l3 = fieldInfo2.l();
            if (fieldInfo2.k() != null) {
                int i15 = (i8 / 3) * 2;
                objArr[i15] = fieldInfo2.k();
                if (l3 != null) {
                    objArr[i15 + 1] = l3;
                } else if (fieldInfo2.h() != null) {
                    objArr[i15 + 1] = fieldInfo2.h();
                }
                i4 = i12;
            } else if (l3 != null) {
                i4 = i12;
                objArr[fb20.a(i8, 3, i4, 1)] = l3;
            } else {
                i4 = i12;
                if (fieldInfo2.h() != null) {
                    objArr[fb20.a(i8, 3, i4, 1)] = fieldInfo2.h();
                }
            }
            if (i9 < c.length && c[i9] == j3) {
                c[i9] = i8;
                i9++;
            }
            if (fieldInfo2.o() == FieldType.MAP) {
                iArr2[i10] = i8;
                i10++;
            } else if (fieldInfo2.o().id() >= 18 && fieldInfo2.o().id() <= 49) {
                iArr3[i11] = (int) dVar.l(fieldInfo2.i());
                i11++;
            }
            i7++;
            i8 += 3;
            structuralMessageInfo = structuralMessageInfo2;
            d = fieldInfoArr;
            j = i14;
        }
        StructuralMessageInfo structuralMessageInfo3 = structuralMessageInfo;
        int i16 = j;
        if (iArr2 == null) {
            iArr2 = iArr4;
        }
        if (iArr3 == null) {
            iArr3 = iArr4;
        }
        int[] iArr5 = new int[c.length + iArr2.length + iArr3.length];
        System.arraycopy(c, 0, iArr5, 0, c.length);
        System.arraycopy(iArr2, 0, iArr5, c.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr5, c.length + iArr2.length, iArr3.length);
        return new p(iArr, objArr, i16, j2, structuralMessageInfo3.b(), true, iArr5, c.length, c.length + iArr2.length, p760Var, kVar, zVar, gVar, mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> p<T> C(lye0 lye0Var, p760 p760Var, k kVar, z<?, ?> zVar, g<?> gVar, m mVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
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
        int i21;
        int i22;
        int i23;
        java.lang.reflect.Field L;
        char charAt10;
        int i24;
        int i25;
        java.lang.reflect.Field L2;
        java.lang.reflect.Field L3;
        int i26;
        char charAt11;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        String str = lye0Var.b;
        int length = str.length();
        int i30 = 55296;
        if (str.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (str.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i33 = charAt15 & 8191;
            int i34 = 13;
            while (true) {
                i29 = i32 + 1;
                charAt14 = str.charAt(i32);
                if (charAt14 < 55296) {
                    break;
                }
                i33 |= (charAt14 & 8191) << i34;
                i34 += 13;
                i32 = i29;
            }
            charAt15 = i33 | (charAt14 << i34);
            i32 = i29;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i5 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i7 = 0;
            iArr = q;
            i6 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt16 = str.charAt(i32);
            if (charAt16 >= 55296) {
                int i36 = charAt16 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    charAt9 = str.charAt(i35);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i36 |= (charAt9 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                charAt16 = i36 | (charAt9 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int charAt17 = str.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt8 = str.charAt(i38);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i39 |= (charAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt8 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = str.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt7 = str.charAt(i41);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i42 |= (charAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt7 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = str.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt6 = str.charAt(i44);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i45 |= (charAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt6 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            charAt = str.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt5 = str.charAt(i47);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i48 |= (charAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt = i48 | (charAt5 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int charAt20 = str.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt4 = str.charAt(i50);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i51 |= (charAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt20 = i51 | (charAt4 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int charAt21 = str.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt3 = str.charAt(i53);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i54 |= (charAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt21 = i54 | (charAt3 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt22 = str.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt2 = str.charAt(i56);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i57 |= (charAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt22 = i57 | (charAt2 << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i59 = (charAt16 * 2) + charAt17;
            int i60 = charAt20;
            i2 = charAt18;
            i3 = i60;
            i4 = charAt19;
            i5 = i59;
            iArr = iArr2;
            i6 = charAt16;
            i7 = charAt22;
            i32 = i56;
        }
        Unsafe unsafe = r;
        Object[] objArr = lye0Var.c;
        Class<?> cls = lye0Var.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i61 = i7 + i3;
        int i62 = i61;
        int i63 = i7;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int charAt23 = str.charAt(i32);
            if (charAt23 >= i30) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i28 = i68 + 1;
                    charAt13 = str.charAt(i68);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i28;
                    length = i16;
                }
                charAt23 = i67 | (charAt13 << i69);
                i17 = i28;
            } else {
                i16 = length;
                i17 = i66;
            }
            int i70 = i17 + 1;
            int charAt24 = str.charAt(i17);
            int i71 = charAt23;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt12 = str.charAt(i70);
                    if (charAt12 < c) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i70 = i27;
                    c = 55296;
                }
                charAt24 = i72 | (charAt12 << i73);
                i70 = i27;
            }
            int i74 = charAt24 & 255;
            int i75 = i6;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i70 + 1;
                int charAt25 = str.charAt(i70);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        charAt11 = str.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i26;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i26;
                }
                int i79 = i74 - 51;
                int i80 = charAt25;
                if (i79 == 9 || i79 == 17) {
                    i25 = i76;
                    objArr2[fb20.a(i64, 3, 2, 1)] = objArr[i5];
                    i5++;
                } else if (i79 != 12 || (!lye0Var.getSyntax().equals(ProtoSyntax.PROTO2) && (charAt24 & 2048) == 0)) {
                    i25 = i76;
                } else {
                    i25 = i76;
                    objArr2[fb20.a(i64, 3, 2, 1)] = objArr[i5];
                    i5++;
                }
                int i81 = i80 * 2;
                Object obj = objArr[i81];
                if (obj instanceof java.lang.reflect.Field) {
                    L2 = (java.lang.reflect.Field) obj;
                } else {
                    L2 = L(cls, (String) obj);
                    objArr[i81] = L2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(L2);
                int i82 = i81 + 1;
                Object obj2 = objArr[i82];
                if (obj2 instanceof java.lang.reflect.Field) {
                    L3 = (java.lang.reflect.Field) obj2;
                } else {
                    L3 = L(cls, (String) obj2);
                    objArr[i82] = L3;
                }
                i23 = objectFieldOffset2;
                i21 = i25;
                i18 = i61;
                i20 = (int) unsafe.objectFieldOffset(L3);
                i22 = 0;
            } else {
                int i83 = i5 + 1;
                java.lang.reflect.Field L4 = L(cls, (String) objArr[i5]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i61;
                    objArr2[fb20.a(i64, 3, 2, 1)] = L4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i61;
                        i24 = i5 + 2;
                        objArr2[fb20.a(i64, 3, 2, 1)] = objArr[i83];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i61;
                        if (lye0Var.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i24 = i5 + 2;
                            objArr2[fb20.a(i64, 3, 2, 1)] = objArr[i83];
                        }
                    } else if (i74 == 50) {
                        int i84 = i63 + 1;
                        iArr[i63] = i64;
                        int i85 = (i64 / 3) * 2;
                        int i86 = i5 + 2;
                        objArr2[i85] = objArr[i83];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i5 + 3;
                            objArr2[i85 + 1] = objArr[i86];
                            i18 = i61;
                            i63 = i84;
                        } else {
                            i19 = i86;
                            i63 = i84;
                            i18 = i61;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            i20 = 1048575;
                            i21 = i70;
                            i22 = 0;
                        } else {
                            int i87 = i70 + 1;
                            int charAt26 = str.charAt(i70);
                            if (charAt26 >= 55296) {
                                int i88 = charAt26 & 8191;
                                int i89 = 13;
                                while (true) {
                                    i21 = i87 + 1;
                                    charAt10 = str.charAt(i87);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i88 |= (charAt10 & 8191) << i89;
                                    i89 += 13;
                                    i87 = i21;
                                }
                                charAt26 = i88 | (charAt10 << i89);
                            } else {
                                i21 = i87;
                            }
                            int i90 = (charAt26 / 32) + (i75 * 2);
                            Object obj3 = objArr[i90];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                L = (java.lang.reflect.Field) obj3;
                            } else {
                                L = L(cls, (String) obj3);
                                objArr[i90] = L;
                            }
                            i20 = (int) unsafe.objectFieldOffset(L);
                            i22 = charAt26 % 32;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i62] = objectFieldOffset;
                            i62++;
                        }
                        i5 = i19;
                        i23 = objectFieldOffset;
                    } else {
                        i18 = i61;
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 1048575;
                    i21 = i70;
                    i22 = 0;
                    if (i74 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                    i5 = i19;
                    i23 = objectFieldOffset;
                }
                i19 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 1048575;
                i21 = i70;
                i22 = 0;
                if (i74 >= 18) {
                }
                i5 = i19;
                i23 = objectFieldOffset;
            }
            int i91 = i64 + 1;
            iArr4[i64] = i71;
            int i92 = i64 + 2;
            String str2 = str;
            iArr4[i91] = ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i23;
            i64 += 3;
            iArr4[i92] = (i22 << 20) | i20;
            str = str2;
            i6 = i75;
            length = i16;
            i61 = i18;
            i32 = i21;
            iArr3 = iArr4;
            i30 = 55296;
        }
        MessageLite messageLite = lye0Var.a;
        lye0Var.getSyntax();
        return new p<>(iArr3, objArr2, i2, i4, messageLite, false, iArr, i7, i61, p760Var, kVar, zVar, gVar, mVar);
    }

    public static long D(int i) {
        return i & 1048575;
    }

    public static int E(long j, Object obj) {
        return ((Integer) v5q0.c.k(j, obj)).intValue();
    }

    public static long F(long j, Object obj) {
        return ((Long) v5q0.c.k(j, obj)).longValue();
    }

    public static java.lang.reflect.Field L(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
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

    public static int R(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void V(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            ((e) writer).a.writeString(i, (String) obj);
        } else {
            ((e) writer).a(i, (ByteString) obj);
        }
    }

    public static void l(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException(cqi.c(obj, "Mutating immutable message: "));
        }
    }

    public static int m(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, b.C0151b c0151b) throws IOException {
        switch (a.a[fieldType.ordinal()]) {
            case 1:
                int J = b.J(bArr, i, c0151b);
                c0151b.c = Boolean.valueOf(c0151b.b != 0);
                return J;
            case 2:
                return b.b(bArr, i, c0151b);
            case 3:
                c0151b.c = Double.valueOf(b.d(i, bArr));
                return i + 8;
            case 4:
            case 5:
                c0151b.c = Integer.valueOf(b.g(i, bArr));
                return i + 4;
            case 6:
            case 7:
                c0151b.c = Long.valueOf(b.i(i, bArr));
                return i + 8;
            case 8:
                c0151b.c = Float.valueOf(b.k(i, bArr));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int H = b.H(bArr, i, c0151b);
                c0151b.c = Integer.valueOf(c0151b.a);
                return H;
            case 12:
            case 13:
                int J2 = b.J(bArr, i, c0151b);
                c0151b.c = Long.valueOf(c0151b.b);
                return J2;
            case 14:
                return b.o(u8e0.c.a(cls), bArr, i, i2, c0151b);
            case 15:
                int H2 = b.H(bArr, i, c0151b);
                c0151b.c = Integer.valueOf(CodedInputStream.decodeZigZag32(c0151b.a));
                return H2;
            case 16:
                int J3 = b.J(bArr, i, c0151b);
                c0151b.c = Long.valueOf(CodedInputStream.decodeZigZag64(c0151b.b));
                return J3;
            case 17:
                return b.E(bArr, i, c0151b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite r(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A(int i, int i2, Object obj) {
        v q2 = q(i2);
        if (!v(i, i2, obj)) {
            return q2.b();
        }
        Object object = r.getObject(obj, S(i2) & 1048575);
        if (u(object)) {
            return object;
        }
        Object b = q2.b();
        if (object != null) {
            q2.a(b, object);
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int G(T t, byte[] bArr, int i, int i2, int i3, long j, b.C0151b c0151b) throws IOException {
        int m;
        Unsafe unsafe = r;
        Object p = p(i3);
        Object object = unsafe.getObject(t, j);
        m mVar = this.p;
        if (mVar.h(object)) {
            MapFieldLite f = mVar.f();
            mVar.a(f, object);
            unsafe.putObject(t, j, f);
            object = f;
        }
        MapEntryLite.b<?, ?> b = mVar.b(p);
        MapFieldLite d = mVar.d(object);
        int H = b.H(bArr, i, c0151b);
        int i4 = c0151b.a;
        if (i4 < 0 || i4 > i2 - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = H + i4;
        K k = b.b;
        V v = b.d;
        Object obj = k;
        Object obj2 = v;
        while (H < i5) {
            int i6 = H + 1;
            int i7 = bArr[H];
            if (i7 < 0) {
                i6 = b.G(i7, bArr, i6, c0151b);
                i7 = c0151b.a;
            }
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == b.c.getWireType()) {
                    m = m(bArr, i6, i2, b.c, v.getClass(), c0151b);
                    obj2 = c0151b.c;
                    H = m;
                }
                H = b.N(i7, bArr, i6, i2, c0151b);
            } else if (i9 == b.a.getWireType()) {
                m = m(bArr, i6, i2, b.a, null, c0151b);
                obj = c0151b.c;
                H = m;
            } else {
                H = b.N(i7, bArr, i6, i2, c0151b);
            }
        }
        if (H != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        d.put(obj, obj2);
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x00a8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H(T t, byte[] bArr, int i, int i2, int i3, b.C0151b c0151b) throws IOException {
        int i4;
        int i5;
        Unsafe unsafe;
        p<T> pVar;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        b.C0151b c0151b2;
        int i10;
        int i11;
        Object obj2;
        int F;
        int i12;
        int i13;
        int i14;
        Object obj3;
        Unsafe unsafe2;
        byte[] bArr2;
        b.C0151b c0151b3;
        int i15;
        char c;
        int i16;
        Unsafe unsafe3;
        int i17;
        byte[] bArr3;
        Unsafe unsafe4;
        int i18;
        byte[] bArr4;
        Unsafe unsafe5;
        Unsafe unsafe6;
        Object obj4;
        b.C0151b c0151b4;
        int i19;
        int i20;
        int i21;
        p<T> pVar2 = this;
        Object obj5 = t;
        byte[] bArr5 = bArr;
        int i22 = i2;
        b.C0151b c0151b5 = c0151b;
        l(obj5);
        Unsafe unsafe7 = r;
        int i23 = i;
        int i24 = -1;
        int i25 = 0;
        int i26 = 1048575;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i23 < i22) {
                int i29 = i23 + 1;
                int i30 = bArr5[i23];
                if (i30 < 0) {
                    i29 = b.G(i30, bArr5, i29, c0151b5);
                    i30 = c0151b5.a;
                }
                int i31 = i29;
                i28 = i30;
                int i32 = i28 >>> 3;
                int i33 = i28 & 7;
                int i34 = pVar2.d;
                int i35 = pVar2.c;
                if (i32 > i24) {
                    i8 = (i32 < i35 || i32 > i34) ? -1 : pVar2.O(i32, i25 / 3);
                    i7 = 0;
                } else if (i32 < i35 || i32 > i34) {
                    i7 = 0;
                    i8 = -1;
                } else {
                    i7 = 0;
                    i8 = pVar2.O(i32, 0);
                }
                int i36 = i8;
                if (i36 == -1) {
                    i9 = i31;
                    i5 = i26;
                    unsafe = unsafe7;
                    i36 = i7;
                    c0151b2 = c0151b;
                } else {
                    int[] iArr = pVar2.a;
                    int i37 = iArr[i36 + 1];
                    int i38 = i7;
                    int R = R(i37);
                    long j = i37 & 1048575;
                    if (R <= 17) {
                        int i39 = iArr[i36 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i26) {
                            if (i26 != 1048575) {
                                unsafe7.putInt(obj5, i26, i27);
                            }
                            i14 = i41;
                            i13 = i41 == 1048575 ? i38 : unsafe7.getInt(obj5, i41);
                        } else {
                            i13 = i27;
                            i14 = i26;
                        }
                        switch (R) {
                            case 0:
                                bArr3 = bArr;
                                unsafe4 = unsafe7;
                                i17 = i31;
                                c = 65535;
                                c0151b2 = c0151b;
                                if (i33 == 1) {
                                    v5q0.c.p(t, j, b.d(i17, bArr3));
                                    obj5 = t;
                                    i23 = i17 + 8;
                                    i18 = i13 | i40;
                                    unsafe7 = unsafe4;
                                    c0151b5 = c0151b2;
                                    i22 = i2;
                                    i24 = i32;
                                    i25 = i36;
                                    i26 = i14;
                                    i27 = i18;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 1:
                                bArr3 = bArr;
                                unsafe4 = unsafe7;
                                i17 = i31;
                                c = 65535;
                                c0151b2 = c0151b;
                                if (i33 == 5) {
                                    v5q0.c.q(obj5, j, b.k(i17, bArr3));
                                    i23 = i17 + 4;
                                    i22 = i2;
                                    c0151b5 = c0151b2;
                                    i25 = i36;
                                    i26 = i14;
                                    i27 = i13 | i40;
                                    unsafe7 = unsafe4;
                                    i24 = i32;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr4 = bArr;
                                unsafe5 = unsafe7;
                                i17 = i31;
                                c = 65535;
                                c0151b2 = c0151b;
                                if (i33 == 0) {
                                    int J = b.J(bArr4, i17, c0151b2);
                                    Object obj6 = obj5;
                                    unsafe5.putLong(obj6, j, c0151b2.b);
                                    obj5 = obj6;
                                    i23 = J;
                                    c0151b5 = c0151b2;
                                    i24 = i32;
                                    i25 = i36;
                                    i26 = i14;
                                    i27 = i13 | i40;
                                    unsafe7 = unsafe5;
                                    bArr5 = bArr4;
                                    i22 = i2;
                                    break;
                                } else {
                                    unsafe3 = unsafe5;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                unsafe5 = unsafe7;
                                i17 = i31;
                                c = 65535;
                                c0151b2 = c0151b;
                                if (i33 == 0) {
                                    int H = b.H(bArr3, i17, c0151b2);
                                    unsafe5.putInt(obj5, j, c0151b2.a);
                                    i22 = i2;
                                    c0151b5 = c0151b2;
                                    i25 = i36;
                                    i26 = i14;
                                    unsafe7 = unsafe5;
                                    i27 = i13 | i40;
                                    i23 = H;
                                    i24 = i32;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    unsafe3 = unsafe5;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr4 = bArr;
                                Unsafe unsafe8 = unsafe7;
                                c = 65535;
                                Object obj7 = obj5;
                                if (i33 == 1) {
                                    unsafe8.putLong(obj7, j, b.i(i31, bArr4));
                                    obj5 = obj7;
                                    i23 = i31 + 8;
                                    c0151b5 = c0151b;
                                    i24 = i32;
                                    i25 = i36;
                                    i26 = i14;
                                    unsafe7 = unsafe8;
                                    i27 = i13 | i40;
                                    bArr5 = bArr4;
                                    i22 = i2;
                                    break;
                                } else {
                                    c0151b2 = c0151b;
                                    unsafe5 = unsafe8;
                                    i17 = i31;
                                    unsafe3 = unsafe5;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                unsafe6 = unsafe7;
                                i15 = i31;
                                c = 65535;
                                obj4 = obj5;
                                c0151b4 = c0151b;
                                if (i33 == 5) {
                                    unsafe6.putInt(obj4, j, b.g(i15, bArr3));
                                    i23 = i15 + 4;
                                    i18 = i13 | i40;
                                    i22 = i2;
                                    c0151b5 = c0151b4;
                                    obj5 = obj4;
                                    i24 = i32;
                                    i25 = i36;
                                    unsafe7 = unsafe6;
                                    i26 = i14;
                                    i27 = i18;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    c0151b2 = c0151b4;
                                    unsafe3 = unsafe6;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 7:
                                bArr3 = bArr;
                                unsafe6 = unsafe7;
                                i15 = i31;
                                c = 65535;
                                obj4 = obj5;
                                c0151b4 = c0151b;
                                if (i33 == 0) {
                                    i23 = b.J(bArr3, i15, c0151b4);
                                    v5q0.c.m(j, obj4, c0151b4.b != 0 ? 1 : i38);
                                    i18 = i13 | i40;
                                    i22 = i2;
                                    c0151b5 = c0151b4;
                                    obj5 = obj4;
                                    i24 = i32;
                                    i25 = i36;
                                    unsafe7 = unsafe6;
                                    i26 = i14;
                                    i27 = i18;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    c0151b2 = c0151b4;
                                    unsafe3 = unsafe6;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 8:
                                bArr3 = bArr;
                                unsafe6 = unsafe7;
                                i15 = i31;
                                c = 65535;
                                obj4 = obj5;
                                c0151b4 = c0151b;
                                if (i33 == 2) {
                                    i23 = (536870912 & i37) != 0 ? b.E(bArr3, i15, c0151b4) : b.B(bArr3, i15, c0151b4);
                                    unsafe6.putObject(obj4, j, c0151b4.c);
                                    i18 = i13 | i40;
                                    i22 = i2;
                                    c0151b5 = c0151b4;
                                    obj5 = obj4;
                                    i24 = i32;
                                    i25 = i36;
                                    unsafe7 = unsafe6;
                                    i26 = i14;
                                    i27 = i18;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    c0151b2 = c0151b4;
                                    unsafe3 = unsafe6;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 9:
                                Unsafe unsafe9 = unsafe7;
                                obj4 = obj5;
                                i15 = i31;
                                c = 65535;
                                if (i33 == 2) {
                                    Object z = pVar2.z(i36, obj4);
                                    int M = b.M(z, pVar2.q(i36), bArr, i15, i2, c0151b);
                                    bArr3 = bArr;
                                    pVar2.P(i36, obj4, z);
                                    i22 = i2;
                                    c0151b5 = c0151b;
                                    obj5 = obj4;
                                    i24 = i32;
                                    i25 = i36;
                                    unsafe7 = unsafe9;
                                    i26 = i14;
                                    i27 = i13 | i40;
                                    i23 = M;
                                    bArr5 = bArr3;
                                    break;
                                } else {
                                    unsafe6 = unsafe9;
                                    c0151b4 = c0151b;
                                    c0151b2 = c0151b4;
                                    unsafe3 = unsafe6;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 10:
                                Unsafe unsafe10 = unsafe7;
                                obj3 = obj5;
                                unsafe2 = unsafe10;
                                bArr2 = bArr;
                                c0151b3 = c0151b;
                                i15 = i31;
                                c = 65535;
                                if (i33 == 2) {
                                    i23 = b.b(bArr2, i15, c0151b3);
                                    unsafe2.putObject(obj3, j, c0151b3.c);
                                    i16 = i13 | i40;
                                    Object obj8 = obj3;
                                    unsafe7 = unsafe2;
                                    obj5 = obj8;
                                    int i42 = i14;
                                    i27 = i16;
                                    bArr5 = bArr2;
                                    i26 = i42;
                                    i22 = i2;
                                    i24 = i32;
                                    c0151b5 = c0151b3;
                                    i25 = i36;
                                    break;
                                } else {
                                    unsafe3 = unsafe2;
                                    c0151b2 = c0151b3;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 12:
                                Unsafe unsafe11 = unsafe7;
                                obj3 = obj5;
                                unsafe2 = unsafe11;
                                bArr2 = bArr;
                                c0151b3 = c0151b;
                                i15 = i31;
                                c = 65535;
                                if (i33 == 0) {
                                    i23 = b.H(bArr2, i15, c0151b3);
                                    int i43 = c0151b3.a;
                                    Internal.EnumVerifier o = pVar2.o(i36);
                                    if ((i37 & Integer.MIN_VALUE) != 0 && o != null && !o.isInRange(i43)) {
                                        r(obj3).storeField(i28, Long.valueOf(i43));
                                        unsafe7 = unsafe2;
                                        obj5 = obj3;
                                        i22 = i2;
                                        bArr5 = bArr2;
                                        i24 = i32;
                                        c0151b5 = c0151b3;
                                        i25 = i36;
                                        i26 = i14;
                                        i27 = i13;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj3, j, i43);
                                        i16 = i13 | i40;
                                        Object obj82 = obj3;
                                        unsafe7 = unsafe2;
                                        obj5 = obj82;
                                        int i422 = i14;
                                        i27 = i16;
                                        bArr5 = bArr2;
                                        i26 = i422;
                                        i22 = i2;
                                        i24 = i32;
                                        c0151b5 = c0151b3;
                                        i25 = i36;
                                        break;
                                    }
                                } else {
                                    unsafe3 = unsafe2;
                                    c0151b2 = c0151b3;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                Unsafe unsafe12 = unsafe7;
                                obj3 = obj5;
                                unsafe2 = unsafe12;
                                bArr2 = bArr;
                                c0151b3 = c0151b;
                                i15 = i31;
                                c = 65535;
                                if (i33 == 0) {
                                    i23 = b.H(bArr2, i15, c0151b3);
                                    unsafe2.putInt(obj3, j, CodedInputStream.decodeZigZag32(c0151b3.a));
                                    i16 = i13 | i40;
                                    Object obj822 = obj3;
                                    unsafe7 = unsafe2;
                                    obj5 = obj822;
                                    int i4222 = i14;
                                    i27 = i16;
                                    bArr5 = bArr2;
                                    i26 = i4222;
                                    i22 = i2;
                                    i24 = i32;
                                    c0151b5 = c0151b3;
                                    i25 = i36;
                                    break;
                                } else {
                                    unsafe3 = unsafe2;
                                    c0151b2 = c0151b3;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 16:
                                bArr2 = bArr;
                                c0151b3 = c0151b;
                                i15 = i31;
                                c = 65535;
                                if (i33 == 0) {
                                    int J2 = b.J(bArr2, i15, c0151b3);
                                    Object obj9 = obj5;
                                    Unsafe unsafe13 = unsafe7;
                                    unsafe13.putLong(obj9, j, CodedInputStream.decodeZigZag64(c0151b3.b));
                                    unsafe7 = unsafe13;
                                    obj5 = obj9;
                                    int i44 = i14;
                                    i27 = i13 | i40;
                                    bArr5 = bArr2;
                                    i26 = i44;
                                    i22 = i2;
                                    i23 = J2;
                                    i24 = i32;
                                    c0151b5 = c0151b3;
                                    i25 = i36;
                                    break;
                                } else {
                                    Unsafe unsafe14 = unsafe7;
                                    obj3 = obj5;
                                    unsafe2 = unsafe14;
                                    unsafe3 = unsafe2;
                                    c0151b2 = c0151b3;
                                    i17 = i15;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            case 17:
                                if (i33 == 3) {
                                    Object z2 = pVar2.z(i36, obj5);
                                    i23 = b.L(z2, pVar2.q(i36), bArr, i31, i2, (i32 << 3) | 4, c0151b);
                                    c0151b3 = c0151b;
                                    bArr2 = bArr;
                                    pVar2.P(i36, obj5, z2);
                                    i16 = i13 | i40;
                                    int i42222 = i14;
                                    i27 = i16;
                                    bArr5 = bArr2;
                                    i26 = i42222;
                                    i22 = i2;
                                    i24 = i32;
                                    c0151b5 = c0151b3;
                                    i25 = i36;
                                    break;
                                } else {
                                    c = 65535;
                                    i17 = i31;
                                    unsafe3 = unsafe7;
                                    c0151b2 = c0151b;
                                    unsafe = unsafe3;
                                    i9 = i17;
                                    i5 = i14;
                                    i27 = i13;
                                    break;
                                }
                            default:
                                unsafe3 = unsafe7;
                                i17 = i31;
                                c = 65535;
                                c0151b2 = c0151b;
                                unsafe = unsafe3;
                                i9 = i17;
                                i5 = i14;
                                i27 = i13;
                                break;
                        }
                    } else {
                        Unsafe unsafe15 = unsafe7;
                        if (R != 27) {
                            i19 = i31;
                            if (R <= 49) {
                                unsafe = unsafe15;
                                i5 = i26;
                                i20 = i27;
                                int J3 = pVar2.J(t, bArr, i19, i2, i28, i32, i33, i36, i37, R, j, c0151b);
                                i21 = i28;
                                i11 = i32;
                                i36 = i36;
                                if (J3 != i19) {
                                    pVar2 = this;
                                    obj5 = t;
                                    bArr5 = bArr;
                                    i22 = i2;
                                    i23 = J3;
                                    i25 = i36;
                                    i24 = i11;
                                    i26 = i5;
                                    i27 = i20;
                                    c0151b5 = c0151b;
                                    i28 = i21;
                                    unsafe7 = unsafe;
                                } else {
                                    pVar = this;
                                    i9 = J3;
                                }
                            } else {
                                i5 = i26;
                                unsafe = unsafe15;
                                i11 = i32;
                                i20 = i27;
                                i21 = i28;
                                if (R != 50) {
                                    int I = I(t, bArr, i19, i2, i21, i11, i33, i37, R, j, i36, c0151b);
                                    pVar = this;
                                    i10 = i21;
                                    c0151b2 = c0151b;
                                    if (I != i19) {
                                        obj5 = t;
                                        bArr5 = bArr;
                                        i22 = i2;
                                        i23 = I;
                                        c0151b5 = c0151b2;
                                        i25 = i36;
                                        i24 = i11;
                                        i27 = i20;
                                        unsafe7 = unsafe;
                                        i28 = i10;
                                        pVar2 = pVar;
                                        i26 = i5;
                                    } else {
                                        i9 = I;
                                        i27 = i20;
                                        if (i10 == i3 || i3 == 0) {
                                            if (pVar.f || c0151b2.d == ExtensionRegistryLite.getEmptyRegistry()) {
                                                obj2 = t;
                                                F = b.F(i10, bArr, i9, i2, r(obj2), c0151b);
                                                i12 = i2;
                                            } else {
                                                F = b.f(i10, bArr, i9, i2, t, pVar.e, pVar.n, c0151b2);
                                                obj2 = t;
                                                i12 = i2;
                                            }
                                            i23 = F;
                                            bArr5 = bArr;
                                            c0151b5 = c0151b;
                                            i22 = i12;
                                            obj5 = obj2;
                                            i25 = i36;
                                            i24 = i11;
                                            unsafe7 = unsafe;
                                            i28 = i10;
                                            pVar2 = pVar;
                                            i26 = i5;
                                        } else {
                                            obj = t;
                                            i4 = i2;
                                            i28 = i10;
                                            i6 = i9;
                                        }
                                    }
                                } else if (i33 == 2) {
                                    int G = G(t, bArr, i19, i2, i36, j, c0151b);
                                    if (G != i19) {
                                        pVar2 = this;
                                        obj5 = t;
                                        bArr5 = bArr;
                                        i22 = i2;
                                        c0151b5 = c0151b;
                                        i23 = G;
                                        i25 = i36;
                                        i24 = i11;
                                        i26 = i5;
                                        i27 = i20;
                                        i28 = i21;
                                        unsafe7 = unsafe;
                                    } else {
                                        pVar = this;
                                        i9 = G;
                                    }
                                } else {
                                    pVar = this;
                                    i9 = i19;
                                }
                            }
                        } else if (i33 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe15.getObject(obj5, j);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe15.putObject(obj5, j, protobufList);
                            }
                            unsafe7 = unsafe15;
                            i22 = i2;
                            c0151b5 = c0151b;
                            i23 = b.p(pVar2.q(i36), i28, bArr, i31, i2, protobufList, c0151b);
                            i24 = i32;
                            i25 = i36;
                            obj5 = t;
                            bArr5 = bArr;
                        } else {
                            i19 = i31;
                            i5 = i26;
                            unsafe = unsafe15;
                            i20 = i27;
                            i21 = i28;
                            i11 = i32;
                            pVar = this;
                            i9 = i19;
                        }
                        i10 = i21;
                        i27 = i20;
                        c0151b2 = c0151b;
                        if (i10 == i3) {
                        }
                        if (pVar.f) {
                        }
                        obj2 = t;
                        F = b.F(i10, bArr, i9, i2, r(obj2), c0151b);
                        i12 = i2;
                        i23 = F;
                        bArr5 = bArr;
                        c0151b5 = c0151b;
                        i22 = i12;
                        obj5 = obj2;
                        i25 = i36;
                        i24 = i11;
                        unsafe7 = unsafe;
                        i28 = i10;
                        pVar2 = pVar;
                        i26 = i5;
                    }
                }
                pVar = pVar2;
                i10 = i28;
                i11 = i32;
                if (i10 == i3) {
                }
                if (pVar.f) {
                }
                obj2 = t;
                F = b.F(i10, bArr, i9, i2, r(obj2), c0151b);
                i12 = i2;
                i23 = F;
                bArr5 = bArr;
                c0151b5 = c0151b;
                i22 = i12;
                obj5 = obj2;
                i25 = i36;
                i24 = i11;
                unsafe7 = unsafe;
                i28 = i10;
                pVar2 = pVar;
                i26 = i5;
            } else {
                i4 = i22;
                i5 = i26;
                unsafe = unsafe7;
                pVar = pVar2;
                obj = obj5;
                i6 = i23;
            }
        }
        int i45 = i5;
        if (i45 != 1048575) {
            unsafe.putInt(obj, i45, i27);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i46 = pVar.j; i46 < pVar.k; i46++) {
            unknownFieldSetLite = (UnknownFieldSetLite) pVar.n(obj, pVar.i[i46], unknownFieldSetLite, pVar.n, t);
        }
        p<T> pVar3 = pVar;
        Object obj10 = obj;
        if (unknownFieldSetLite != null) {
            pVar3.n.n(obj10, unknownFieldSetLite);
        }
        if (i3 == 0) {
            if (i6 != i4) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i6 > i4 || i28 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i6;
    }

    public final int I(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, b.C0151b c0151b) throws IOException {
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(b.d(i, bArr)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(b.k(i, bArr)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int J = b.J(bArr, i, c0151b);
                unsafe.putObject(t, j, Long.valueOf(c0151b.b));
                unsafe.putInt(t, j2, i4);
                return J;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int H = b.H(bArr, i, c0151b);
                unsafe.putObject(t, j, Integer.valueOf(c0151b.a));
                unsafe.putInt(t, j2, i4);
                return H;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(b.i(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(b.g(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int J2 = b.J(bArr, i, c0151b);
                unsafe.putObject(t, j, Boolean.valueOf(c0151b.b != 0));
                unsafe.putInt(t, j2, i4);
                return J2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int H2 = b.H(bArr, i, c0151b);
                int i13 = c0151b.a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
                        if (!b0.a.c(H2, H2 + i13, bArr)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, H2, i13, Internal.UTF_8));
                    H2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return H2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object A = A(i4, i8, t);
                int M = b.M(A, q(i8), bArr, i, i2, c0151b);
                Q(t, i4, i8, A);
                return M;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int b = b.b(bArr, i, c0151b);
                unsafe.putObject(t, j, c0151b.c);
                unsafe.putInt(t, j2, i4);
                return b;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int H3 = b.H(bArr, i, c0151b);
                int i14 = c0151b.a;
                Internal.EnumVerifier o = o(i8);
                if (o != null && !o.isInRange(i14)) {
                    r(t).storeField(i3, Long.valueOf(i14));
                    return H3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return H3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int H4 = b.H(bArr, i, c0151b);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(c0151b.a)));
                unsafe.putInt(t, j2, i4);
                return H4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int J3 = b.J(bArr, i, c0151b);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(c0151b.b)));
                unsafe.putInt(t, j2, i4);
                return J3;
            case 68:
                if (i5 == 3) {
                    Object A2 = A(i4, i8, t);
                    int L = b.L(A2, q(i8), bArr, i, i2, (i3 & (-8)) | 4, c0151b);
                    Q(t, i4, i8, A2);
                    return L;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int J(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, b.C0151b c0151b) throws IOException {
        int I;
        Unsafe unsafe = r;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return b.r(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 1) {
                    return b.e(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return b.u(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 5) {
                    return b.l(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return b.y(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 0) {
                    return b.K(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return b.x(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 0) {
                    return b.I(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return b.t(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 1) {
                    return b.j(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return b.s(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 5) {
                    return b.h(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return b.q(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 0) {
                    return b.a(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? b.C(i3, bArr, i, i2, protobufList2, c0151b) : b.D(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return b.p(q(i6), i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return b.c(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        I = b.I(i3, bArr, i, i2, protobufList2, c0151b);
                    }
                    return i;
                }
                I = b.x(bArr, i, protobufList2, c0151b);
                w.k(t, i4, protobufList2, o(i6), null, this.n);
                return I;
            case 33:
            case 47:
                if (i5 == 2) {
                    return b.v(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 0) {
                    return b.z(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return b.w(bArr, i, protobufList2, c0151b);
                }
                if (i5 == 0) {
                    return b.A(i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return b.n(q(i6), i3, bArr, i, i2, protobufList2, c0151b);
                }
                return i;
            default:
                return i;
        }
    }

    public final void K(Object obj, int i, d dVar) throws IOException {
        if ((536870912 & i) != 0) {
            v5q0.q(i & 1048575, obj, dVar.R());
        } else if (this.g) {
            v5q0.q(i & 1048575, obj, dVar.N());
        } else {
            v5q0.q(i & 1048575, obj, dVar.j());
        }
    }

    public final void M(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return;
        }
        v5q0.o((1 << (i2 >>> 20)) | v5q0.c.i(j, obj), j, obj);
    }

    public final void N(int i, int i2, Object obj) {
        v5q0.o(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int O(int i, int i2) {
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

    public final void P(int i, Object obj, Object obj2) {
        r.putObject(obj, S(i) & 1048575, obj2);
        M(i, obj);
    }

    public final void Q(T t, int i, int i2, Object obj) {
        r.putObject(t, S(i2) & 1048575, obj);
        N(i, i2, t);
    }

    public final int S(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(T t, Writer writer) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        boolean z;
        int i2;
        Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        p<T> pVar = this;
        boolean z3 = pVar.f;
        g<?> gVar = pVar.o;
        if (z3) {
            FieldSet<?> c = gVar.c(t);
            if (!c.p()) {
                Iterator<Map.Entry<?, Object>> t2 = c.t();
                entry = t2.next();
                it = t2;
                int[] iArr = pVar.a;
                length = iArr.length;
                Unsafe unsafe = r;
                i = 0;
                int i7 = 1048575;
                int i8 = 0;
                while (i < length) {
                    int S = pVar.S(i);
                    int i9 = iArr[i];
                    int R = R(S);
                    Map.Entry<?, ?> entry3 = entry;
                    if (R <= 17) {
                        int i10 = iArr[i + 2];
                        z = true;
                        int i11 = i10 & 1048575;
                        if (i11 != i7) {
                            i8 = i11 == 1048575 ? 0 : unsafe.getInt(t, i11);
                            i7 = i11;
                        }
                        int i12 = 1 << (i10 >>> 20);
                        int i13 = i8;
                        i4 = i12;
                        i3 = i7;
                        i2 = i13;
                        entry2 = entry3;
                    } else {
                        int i14 = i7;
                        z = true;
                        i2 = i8;
                        entry2 = entry3;
                        i3 = i14;
                        i4 = 0;
                    }
                    while (true) {
                        i5 = i3;
                        if (entry2 != null && gVar.a(entry2) <= i9) {
                            gVar.j(writer, entry2);
                            entry2 = it.hasNext() ? it.next() : null;
                            i3 = i5;
                        }
                    }
                    int i15 = S & 1048575;
                    Iterator<Map.Entry<?, Object>> it2 = it;
                    int[] iArr2 = iArr;
                    long j = i15;
                    switch (R) {
                        case 0:
                            i6 = i5;
                            if (!pVar.t(t, i, i6, i2, i4)) {
                                break;
                            } else {
                                ((e) writer).a.writeDouble(i9, v5q0.c.g(j, t));
                                break;
                            }
                        case 1:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeFloat(i9, v5q0.c.h(j, t));
                            }
                            pVar = this;
                            break;
                        case 2:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).f(i9, unsafe.getLong(t, j));
                            }
                            pVar = this;
                            break;
                        case 3:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeUInt64(i9, unsafe.getLong(t, j));
                            }
                            pVar = this;
                            break;
                        case 4:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).e(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 5:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).c(i9, unsafe.getLong(t, j));
                            }
                            pVar = this;
                            break;
                        case 6:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).b(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 7:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeBool(i9, v5q0.c.e(j, t));
                            }
                            pVar = this;
                            break;
                        case 8:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                V(i9, unsafe.getObject(t, j), writer);
                            }
                            pVar = this;
                            break;
                        case 9:
                            i6 = i5;
                            if (!pVar.t(t, i, i6, i2, i4)) {
                                break;
                            } else {
                                ((e) writer).g(i9, unsafe.getObject(t, j), pVar.q(i));
                                break;
                            }
                        case 10:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a(i9, (ByteString) unsafe.getObject(t, j));
                            }
                            pVar = this;
                            break;
                        case 11:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeUInt32(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 12:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeEnum(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 13:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeSFixed32(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 14:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeSFixed64(i9, unsafe.getLong(t, j));
                            }
                            pVar = this;
                            break;
                        case 15:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeSInt32(i9, unsafe.getInt(t, j));
                            }
                            pVar = this;
                            break;
                        case 16:
                            i6 = i5;
                            if (pVar.t(t, i, i6, i2, i4)) {
                                ((e) writer).a.writeSInt64(i9, unsafe.getLong(t, j));
                            }
                            pVar = this;
                            break;
                        case 17:
                            i6 = i5;
                            if (!pVar.t(t, i, i6, i2, i4)) {
                                break;
                            } else {
                                ((e) writer).d(i9, unsafe.getObject(t, j), pVar.q(i));
                                break;
                            }
                        case 18:
                            w.p(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 19:
                            w.t(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 20:
                            w.w(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 21:
                            w.E(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 22:
                            w.v(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 23:
                            w.s(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 24:
                            w.r(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 25:
                            w.n(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 26:
                            w.C(iArr2[i], (List) unsafe.getObject(t, j), writer);
                            i6 = i5;
                            break;
                        case 27:
                            w.x(iArr2[i], (List) unsafe.getObject(t, j), writer, pVar.q(i));
                            i6 = i5;
                            break;
                        case 28:
                            w.o(iArr2[i], (List) unsafe.getObject(t, j), writer);
                            i6 = i5;
                            break;
                        case 29:
                            z2 = false;
                            w.D(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 30:
                            z2 = false;
                            w.q(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 31:
                            z2 = false;
                            w.y(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 32:
                            z2 = false;
                            w.z(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 33:
                            z2 = false;
                            w.A(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 34:
                            z2 = false;
                            w.B(iArr2[i], (List) unsafe.getObject(t, j), writer, false);
                            i6 = i5;
                            break;
                        case 35:
                            w.p(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 36:
                            w.t(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 37:
                            w.w(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 38:
                            w.E(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 39:
                            w.v(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 40:
                            w.s(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 41:
                            w.r(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 42:
                            w.n(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 43:
                            w.D(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 44:
                            w.q(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 45:
                            w.y(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 46:
                            w.z(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 47:
                            w.A(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 48:
                            w.B(iArr2[i], (List) unsafe.getObject(t, j), writer, z);
                            i6 = i5;
                            break;
                        case 49:
                            w.u(iArr2[i], (List) unsafe.getObject(t, j), writer, pVar.q(i));
                            i6 = i5;
                            break;
                        case 50:
                            pVar.U(writer, i9, unsafe.getObject(t, j), i);
                            i6 = i5;
                            break;
                        case 51:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeDouble(i9, ((Double) v5q0.c.k(j, t)).doubleValue());
                            }
                            i6 = i5;
                            break;
                        case 52:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeFloat(i9, ((Float) v5q0.c.k(j, t)).floatValue());
                            }
                            i6 = i5;
                            break;
                        case 53:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).f(i9, F(j, t));
                            }
                            i6 = i5;
                            break;
                        case 54:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeUInt64(i9, F(j, t));
                            }
                            i6 = i5;
                            break;
                        case 55:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).e(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 56:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).c(i9, F(j, t));
                            }
                            i6 = i5;
                            break;
                        case 57:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).b(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 58:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeBool(i9, ((Boolean) v5q0.c.k(j, t)).booleanValue());
                            }
                            i6 = i5;
                            break;
                        case 59:
                            if (pVar.v(i9, i, t)) {
                                V(i9, unsafe.getObject(t, j), writer);
                            }
                            i6 = i5;
                            break;
                        case 60:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).g(i9, unsafe.getObject(t, j), pVar.q(i));
                            }
                            i6 = i5;
                            break;
                        case 61:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a(i9, (ByteString) unsafe.getObject(t, j));
                            }
                            i6 = i5;
                            break;
                        case 62:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeUInt32(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 63:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeEnum(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 64:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeSFixed32(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 65:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeSFixed64(i9, F(j, t));
                            }
                            i6 = i5;
                            break;
                        case 66:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeSInt32(i9, E(j, t));
                            }
                            i6 = i5;
                            break;
                        case 67:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).a.writeSInt64(i9, F(j, t));
                            }
                            i6 = i5;
                            break;
                        case 68:
                            if (pVar.v(i9, i, t)) {
                                ((e) writer).d(i9, unsafe.getObject(t, j), pVar.q(i));
                            }
                            i6 = i5;
                            break;
                        default:
                            i6 = i5;
                            break;
                    }
                    i += 3;
                    i8 = i2;
                    it = it2;
                    iArr = iArr2;
                    i7 = i6;
                    entry = entry2;
                }
                Iterator<Map.Entry<?, Object>> it3 = it;
                while (entry != null) {
                    gVar.j(writer, entry);
                    entry = it3.hasNext() ? it3.next() : null;
                }
                z<?, ?> zVar = pVar.n;
                zVar.r(zVar.g(t), writer);
            }
        }
        entry = null;
        it = null;
        int[] iArr3 = pVar.a;
        length = iArr3.length;
        Unsafe unsafe2 = r;
        i = 0;
        int i72 = 1048575;
        int i82 = 0;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it32 = it;
        while (entry != null) {
        }
        z<?, ?> zVar2 = pVar.n;
        zVar2.r(zVar2.g(t), writer);
    }

    public final <K, V> void U(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object p = p(i2);
            m mVar = this.p;
            MapEntryLite.b<?, ?> b = mVar.b(p);
            MapFieldLite e = mVar.e(obj);
            e eVar = (e) writer;
            CodedOutputStream codedOutputStream = eVar.a;
            CodedOutputStream codedOutputStream2 = eVar.a;
            if (!codedOutputStream.isSerializationDeterministic()) {
                for (Map.Entry<K, V> entry : e.entrySet()) {
                    codedOutputStream.writeTag(i, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, entry.getKey(), entry.getValue()));
                    MapEntryLite.writeTo(codedOutputStream, b, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i3 = 0;
            switch (e.a.a[b.a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v = e.get(bool);
                    if (v != null) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, bool, v));
                        MapEntryLite.writeTo(codedOutputStream2, b, bool, v);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v2 = e.get(bool2);
                    if (v2 != null) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, bool2, v2));
                        MapEntryLite.writeTo(codedOutputStream2, b, bool2, v2);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = e.size();
                    int[] iArr = new int[size];
                    Iterator<K> it = e.keySet().iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        iArr[i4] = ((Integer) it.next()).intValue();
                        i4++;
                    }
                    Arrays.sort(iArr);
                    while (i3 < size) {
                        int i5 = iArr[i3];
                        V v3 = e.get(Integer.valueOf(i5));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, Integer.valueOf(i5), v3));
                        MapEntryLite.writeTo(codedOutputStream, b, Integer.valueOf(i5), v3);
                        i3++;
                    }
                    return;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = e.size();
                    long[] jArr = new long[size2];
                    Iterator<K> it2 = e.keySet().iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        jArr[i6] = ((Long) it2.next()).longValue();
                        i6++;
                    }
                    Arrays.sort(jArr);
                    while (i3 < size2) {
                        long j = jArr[i3];
                        V v4 = e.get(Long.valueOf(j));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, Long.valueOf(j), v4));
                        MapEntryLite.writeTo(codedOutputStream, b, Long.valueOf(j), v4);
                        i3++;
                    }
                    return;
                case 12:
                    int size3 = e.size();
                    String[] strArr = new String[size3];
                    Iterator<K> it3 = e.keySet().iterator();
                    int i7 = 0;
                    while (it3.hasNext()) {
                        strArr[i7] = (String) it3.next();
                        i7++;
                    }
                    Arrays.sort(strArr);
                    while (i3 < size3) {
                        String str = strArr[i3];
                        V v5 = e.get(str);
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(b, str, v5));
                        MapEntryLite.writeTo(codedOutputStream, b, str, v5);
                        i3++;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("does not support key type: " + b.a);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.v
    public final void a(T t, T t2) {
        T t3;
        l(t);
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = w.a;
                z<?, ?> zVar = this.n;
                zVar.o(t4, zVar.k(zVar.g(t4), zVar.g(t2)));
                if (this.f) {
                    g<?> gVar = this.o;
                    FieldSet<?> c = gVar.c(t2);
                    if (c.p()) {
                        return;
                    }
                    gVar.d(t4).v(c);
                    return;
                }
                return;
            }
            int S = S(i);
            long j = 1048575 & S;
            int i2 = iArr[i];
            switch (R(S)) {
                case 0:
                    if (s(i, t2)) {
                        v5q0.d dVar = v5q0.c;
                        t3 = t;
                        dVar.p(t3, j, dVar.g(j, t2));
                        M(i, t3);
                        break;
                    }
                    t3 = t;
                    break;
                case 1:
                    if (s(i, t2)) {
                        v5q0.d dVar2 = v5q0.c;
                        dVar2.q(t, j, dVar2.h(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (s(i, t2)) {
                        v5q0.p(t, j, v5q0.c.j(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (s(i, t2)) {
                        v5q0.p(t, j, v5q0.c.j(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (s(i, t2)) {
                        v5q0.p(t, j, v5q0.c.j(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (s(i, t2)) {
                        v5q0.d dVar3 = v5q0.c;
                        dVar3.m(j, t, dVar3.e(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (s(i, t2)) {
                        v5q0.q(j, t, v5q0.c.k(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    x(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (s(i, t2)) {
                        v5q0.q(j, t, v5q0.c.k(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (s(i, t2)) {
                        v5q0.p(t, j, v5q0.c.j(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (s(i, t2)) {
                        v5q0.o(v5q0.c.i(j, t2), j, t);
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (s(i, t2)) {
                        v5q0.p(t, j, v5q0.c.j(j, t2));
                        M(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    x(i, t, t2);
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
                    this.m.b(j, t, t2);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = w.a;
                    v5q0.d dVar4 = v5q0.c;
                    v5q0.q(j, t, this.p.a(dVar4.k(j, t), dVar4.k(j, t2)));
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
                    if (v(i2, i, t2)) {
                        v5q0.q(j, t, v5q0.c.k(j, t2));
                        N(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 60:
                    y(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, t2)) {
                        v5q0.q(j, t, v5q0.c.k(j, t2));
                        N(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 68:
                    y(i, t, t2);
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

    @Override // com.google.protobuf.v
    public final T b() {
        return (T) this.l.a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.protobuf.v] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.protobuf.v] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.protobuf.v] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.google.protobuf.v] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // com.google.protobuf.v
    public final boolean c(T t) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 < this.j) {
                int i7 = this.i[i6];
                int[] iArr = this.a;
                int i8 = iArr[i7];
                int S = S(i7);
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    if (i10 != 1048575) {
                        i5 = r.getInt(t, i10);
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
                if ((268435456 & S) != 0 && !t(t, i2, i, i3, i11)) {
                    break;
                }
                int R = R(S);
                if (R == 9 || R == 17) {
                    if (t(t, i2, i, i3, i11)) {
                        if (!q(i2).c(v5q0.c.k(S & 1048575, t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (R != 27) {
                        if (R == 60 || R == 68) {
                            if (v(i8, i2, t)) {
                                if (!q(i2).c(v5q0.c.k(S & 1048575, t))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (R != 49) {
                            if (R == 50) {
                                Object k = v5q0.c.k(S & 1048575, t);
                                m mVar = this.p;
                                MapFieldLite e = mVar.e(k);
                                if (!e.isEmpty() && mVar.b(p(i2)).c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                    ?? r5 = 0;
                                    for (Object obj : e.values()) {
                                        r5 = r5;
                                        if (r5 == 0) {
                                            r5 = u8e0.c.a(obj.getClass());
                                        }
                                        if (!r5.c(obj)) {
                                            break loop0;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) v5q0.c.k(S & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? q2 = q(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (!q2.c(list.get(i13))) {
                                break loop0;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            } else if (!this.f || this.o.c(t).r()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.v
    public final void d(T t) {
        if (u(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int S = S(i);
                long j = 1048575 & S;
                int R = R(S);
                if (R != 9) {
                    if (R != 60 && R != 68) {
                        switch (R) {
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
                                this.m.a(j, t);
                                break;
                            case 50:
                                Unsafe unsafe = r;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.p.c(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(iArr[i], i, t)) {
                        q(i).d(r.getObject(t, j));
                    }
                }
                if (s(i, t)) {
                    q(i).d(r.getObject(t, j));
                }
            }
            this.n.j(t);
            if (this.f) {
                this.o.f(t);
            }
        }
    }

    @Override // com.google.protobuf.v
    public final int e(GeneratedMessageLite generatedMessageLite) {
        int i;
        int hashLong;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int S = S(i3);
            int i4 = iArr[i3];
            long j = 1048575 & S;
            int i5 = 37;
            switch (R(S)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(v5q0.c.g(j, generatedMessageLite)));
                    i2 = hashLong + i;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(v5q0.c.h(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(v5q0.c.j(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(v5q0.c.j(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(v5q0.c.j(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(v5q0.c.e(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) v5q0.c.k(j, generatedMessageLite)).hashCode();
                    i2 = hashLong + i;
                    break;
                case 9:
                    Object k = v5q0.c.k(j, generatedMessageLite);
                    if (k != null) {
                        i5 = k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(v5q0.c.j(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = v5q0.c.i(j, generatedMessageLite);
                    i2 = hashLong + i;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(v5q0.c.j(j, generatedMessageLite));
                    i2 = hashLong + i;
                    break;
                case 17:
                    Object k2 = v5q0.c.k(j, generatedMessageLite);
                    if (k2 != null) {
                        i5 = k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                    i2 = hashLong + i;
                    break;
                case 51:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(((Double) v5q0.c.k(j, generatedMessageLite)).doubleValue()));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(((Float) v5q0.c.k(j, generatedMessageLite)).floatValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(((Boolean) v5q0.c.k(j, generatedMessageLite)).booleanValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ((String) v5q0.c.k(j, generatedMessageLite)).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = v5q0.c.k(j, generatedMessageLite).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.n.g(generatedMessageLite).hashCode() + (i2 * 53);
        if (!this.f) {
            return hashCode;
        }
        return this.o.c(generatedMessageLite).hashCode() + (hashCode * 53);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0580  */
    @Override // com.google.protobuf.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MessageLite messageLite, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        e eVar = (e) writer;
        eVar.getClass();
        if (Writer.FieldOrder.ASCENDING != Writer.FieldOrder.DESCENDING) {
            T(messageLite, writer);
            return;
        }
        z<?, ?> zVar = this.n;
        zVar.r(zVar.g(messageLite), writer);
        boolean z = this.f;
        g<?> gVar = this.o;
        if (z) {
            FieldSet<?> c = gVar.c(messageLite);
            if (!c.p()) {
                it = c.f();
                entry = it.next();
                int[] iArr = this.a;
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int S = S(length);
                    int i = iArr[length];
                    while (entry != null && gVar.a(entry) > i) {
                        gVar.j(writer, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    switch (R(S)) {
                        case 0:
                            if (s(length, messageLite)) {
                                eVar.a.writeDouble(i, v5q0.c.g(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (s(length, messageLite)) {
                                eVar.a.writeFloat(i, v5q0.c.h(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (s(length, messageLite)) {
                                eVar.f(i, v5q0.c.j(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (s(length, messageLite)) {
                                eVar.a.writeUInt64(i, v5q0.c.j(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (s(length, messageLite)) {
                                eVar.e(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (s(length, messageLite)) {
                                eVar.c(i, v5q0.c.j(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (s(length, messageLite)) {
                                eVar.b(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (s(length, messageLite)) {
                                eVar.a.writeBool(i, v5q0.c.e(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (s(length, messageLite)) {
                                V(i, v5q0.c.k(S & 1048575, messageLite), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (s(length, messageLite)) {
                                eVar.g(i, v5q0.c.k(S & 1048575, messageLite), q(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (s(length, messageLite)) {
                                eVar.a(i, (ByteString) v5q0.c.k(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (s(length, messageLite)) {
                                eVar.a.writeUInt32(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (s(length, messageLite)) {
                                eVar.a.writeEnum(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (s(length, messageLite)) {
                                eVar.a.writeSFixed32(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (s(length, messageLite)) {
                                eVar.a.writeSFixed64(i, v5q0.c.j(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (s(length, messageLite)) {
                                eVar.a.writeSInt32(i, v5q0.c.i(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (s(length, messageLite)) {
                                eVar.a.writeSInt64(i, v5q0.c.j(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (s(length, messageLite)) {
                                eVar.d(i, v5q0.c.k(S & 1048575, messageLite), q(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            w.p(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 19:
                            w.t(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 20:
                            w.w(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 21:
                            w.E(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 22:
                            w.v(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 23:
                            w.s(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 24:
                            w.r(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 25:
                            w.n(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 26:
                            w.C(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer);
                            break;
                        case 27:
                            w.x(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, q(length));
                            break;
                        case 28:
                            w.o(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer);
                            break;
                        case 29:
                            w.D(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 30:
                            w.q(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 31:
                            w.y(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 32:
                            w.z(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 33:
                            w.A(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 34:
                            w.B(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, false);
                            break;
                        case 35:
                            w.p(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 36:
                            w.t(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 37:
                            w.w(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 38:
                            w.E(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 39:
                            w.v(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 40:
                            w.s(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 41:
                            w.r(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 42:
                            w.n(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 43:
                            w.D(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 44:
                            w.q(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 45:
                            w.y(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 46:
                            w.z(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 47:
                            w.A(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 48:
                            w.B(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, true);
                            break;
                        case 49:
                            w.u(iArr[length], (List) v5q0.c.k(S & 1048575, messageLite), writer, q(length));
                            break;
                        case 50:
                            U(writer, i, v5q0.c.k(S & 1048575, messageLite), length);
                            break;
                        case 51:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeDouble(i, ((Double) v5q0.c.k(S & 1048575, messageLite)).doubleValue());
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeFloat(i, ((Float) v5q0.c.k(S & 1048575, messageLite)).floatValue());
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (v(i, length, messageLite)) {
                                eVar.f(i, F(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeUInt64(i, F(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (v(i, length, messageLite)) {
                                eVar.e(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (v(i, length, messageLite)) {
                                eVar.c(i, F(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (v(i, length, messageLite)) {
                                eVar.b(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeBool(i, ((Boolean) v5q0.c.k(S & 1048575, messageLite)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (v(i, length, messageLite)) {
                                V(i, v5q0.c.k(S & 1048575, messageLite), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (v(i, length, messageLite)) {
                                eVar.g(i, v5q0.c.k(S & 1048575, messageLite), q(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (v(i, length, messageLite)) {
                                eVar.a(i, (ByteString) v5q0.c.k(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeUInt32(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeEnum(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeSFixed32(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeSFixed64(i, F(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeSInt32(i, E(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (v(i, length, messageLite)) {
                                eVar.a.writeSInt64(i, F(S & 1048575, messageLite));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (v(i, length, messageLite)) {
                                eVar.d(i, v5q0.c.k(S & 1048575, messageLite), q(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    gVar.j(writer, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        int[] iArr2 = this.a;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.v
    public final int g(AbstractMessageLite abstractMessageLite) {
        int i;
        int computeDoubleSize;
        int computeFloatSize;
        int computeInt64Size;
        int computeTagSize;
        int size;
        int i2;
        int computeTagSize2;
        int computeTagSize3;
        int size2;
        int computeTagSize4;
        int computeUInt32SizeNoTag;
        int i3;
        p<T> pVar = this;
        T t = abstractMessageLite;
        Unsafe unsafe = r;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = pVar.a;
            if (i5 >= iArr.length) {
                z<?, ?> zVar = pVar.n;
                int h = zVar.h(zVar.g(t)) + i7;
                return pVar.f ? pVar.o.c(t).m() + h : h;
            }
            int S = pVar.S(i5);
            int R = R(S);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (R <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(t, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = i7;
            long j = S & i4;
            if (R < FieldType.DOUBLE_LIST_PACKED.id() || R > FieldType.SINT64_LIST_PACKED.id()) {
                i11 = 0;
            }
            boolean z = pVar.h;
            switch (R) {
                case 0:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(i9, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 1:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(i9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 2:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(i9, unsafe.getLong(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 3:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(i9, unsafe.getLong(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 4:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(i9, unsafe.getInt(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 5:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 6:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(i9, 0);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 7:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(i9, true);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 8:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        Object object = unsafe.getObject(t, j);
                        i7 = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(i9, (ByteString) object) : CodedOutputStream.computeStringSize(i9, (String) object)) + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 9:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        Object object2 = unsafe.getObject(t, j);
                        v q2 = pVar.q(i5);
                        Class<?> cls = w.a;
                        computeDoubleSize = object2 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object2) : CodedOutputStream.computeMessageSize(i9, (MessageLite) object2, q2);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 10:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 11:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt32Size(i9, unsafe.getInt(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 12:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeEnumSize(i9, unsafe.getInt(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 13:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 14:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                        i7 = computeFloatSize + i12;
                        pVar = this;
                        t = abstractMessageLite;
                        break;
                    }
                    pVar = this;
                    t = abstractMessageLite;
                    i7 = i12;
                    break;
                case 15:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt32Size(i9, unsafe.getInt(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 16:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt64Size(i9, unsafe.getLong(t, j));
                        i7 = computeInt64Size + i12;
                        pVar = this;
                        break;
                    }
                    pVar = this;
                    i7 = i12;
                    break;
                case 17:
                    if (pVar.t(t, i5, i8, i6, i)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(t, j), pVar.q(i5));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 18:
                    computeDoubleSize = w.c(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 19:
                    computeDoubleSize = w.b(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls2 = w.a;
                    if (list.size() != 0) {
                        computeTagSize = (CodedOutputStream.computeTagSize(i9) * list.size()) + w.e(list);
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 21:
                    List list2 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = w.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = w.i(list2);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 22:
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls4 = w.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = w.d(list3);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 23:
                    computeDoubleSize = w.c(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 24:
                    computeDoubleSize = w.b(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t, j);
                    Class<?> cls5 = w.a;
                    int size3 = list4.size();
                    i7 = i12 + (size3 == 0 ? 0 : CodedOutputStream.computeBoolSize(i9, true) * size3);
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t, j);
                    Class<?> cls6 = w.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        computeTagSize = CodedOutputStream.computeTagSize(i9) * size4;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object raw = lazyStringList.getRaw(i13);
                                computeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + computeTagSize;
                            }
                        } else {
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object obj = list5.get(i14);
                                computeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + computeTagSize;
                            }
                        }
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 27:
                    List list6 = (List) unsafe.getObject(t, j);
                    v q3 = pVar.q(i5);
                    Class<?> cls7 = w.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        computeTagSize3 = 0;
                    } else {
                        computeTagSize3 = CodedOutputStream.computeTagSize(i9) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            Object obj2 = list6.get(i15);
                            computeTagSize3 = (obj2 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj2) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2, q3)) + computeTagSize3;
                        }
                    }
                    i7 = i12 + computeTagSize3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t, j);
                    Class<?> cls8 = w.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        computeTagSize = CodedOutputStream.computeTagSize(i9) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            computeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list7.get(i16));
                        }
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 29:
                    List list8 = (List) unsafe.getObject(t, j);
                    Class<?> cls9 = w.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = w.h(list8);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 30:
                    List list9 = (List) unsafe.getObject(t, j);
                    Class<?> cls10 = w.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = w.a(list9);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 31:
                    computeDoubleSize = w.b(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 32:
                    computeDoubleSize = w.c(i9, (List) unsafe.getObject(t, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t, j);
                    Class<?> cls11 = w.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = w.f(list10);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 34:
                    List list11 = (List) unsafe.getObject(t, j);
                    Class<?> cls12 = w.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = w.g(list11);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 35:
                    List list12 = (List) unsafe.getObject(t, j);
                    Class<?> cls13 = w.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(t, j);
                    Class<?> cls14 = w.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 37:
                    size2 = w.e((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 38:
                    size2 = w.i((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 39:
                    size2 = w.d((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(t, j);
                    Class<?> cls15 = w.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(t, j);
                    Class<?> cls16 = w.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(t, j);
                    Class<?> cls17 = w.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 43:
                    size2 = w.h((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 44:
                    size2 = w.a((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(t, j);
                    Class<?> cls18 = w.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(t, j);
                    Class<?> cls19 = w.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 47:
                    size2 = w.f((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 48:
                    size2 = w.g((List) unsafe.getObject(t, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(t, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(t, j);
                    v q4 = pVar.q(i5);
                    Class<?> cls20 = w.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i17 = 0; i17 < size7; i17++) {
                            i3 += CodedOutputStream.computeGroupSize(i9, (MessageLite) list19.get(i17), q4);
                        }
                    }
                    i7 = i12 + i3;
                    break;
                case 50:
                    computeDoubleSize = pVar.p.g(i9, unsafe.getObject(t, j), pVar.p(i5));
                    i7 = computeDoubleSize + i12;
                    break;
                case 51:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(i9, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 52:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(i9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 53:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(i9, F(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 54:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(i9, F(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 55:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(i9, E(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 56:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 57:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(i9, 0);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 58:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(i9, true);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 59:
                    if (pVar.v(i9, i5, t)) {
                        Object object3 = unsafe.getObject(t, j);
                        i7 = (object3 instanceof ByteString ? CodedOutputStream.computeBytesSize(i9, (ByteString) object3) : CodedOutputStream.computeStringSize(i9, (String) object3)) + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 60:
                    if (pVar.v(i9, i5, t)) {
                        Object object4 = unsafe.getObject(t, j);
                        v q5 = pVar.q(i5);
                        Class<?> cls21 = w.a;
                        computeDoubleSize = object4 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object4) : CodedOutputStream.computeMessageSize(i9, (MessageLite) object4, q5);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 61:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(t, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 62:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(i9, E(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 63:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(i9, E(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 64:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 65:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 66:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(i9, E(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 67:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(i9, F(j, t));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 68:
                    if (pVar.v(i9, i5, t)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(t, j), pVar.q(i5));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                default:
                    i7 = i12;
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
    }

    @Override // com.google.protobuf.v
    public final void h(T t, byte[] bArr, int i, int i2, b.C0151b c0151b) throws IOException {
        H(t, bArr, i, i2, 0, c0151b);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.protobuf.v
    public final void i(java.lang.Object r20, com.google.protobuf.d r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.p.i(java.lang.Object, com.google.protobuf.d, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.w.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.w.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.w.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.w.l(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.e(r7, r12) == r5.e(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.h(r7, r12)) == java.lang.Float.floatToIntBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.g(r7, r12)) == java.lang.Double.doubleToLongBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.w.l(r9.k(r7, r12), r9.k(r7, r13)) != false) goto L105;
     */
    @Override // com.google.protobuf.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int S = S(i);
                long j = S & 1048575;
                switch (R(S)) {
                    case 0:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar2 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar3 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar4 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar5 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar6 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar7 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar8 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar9 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar10 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar11 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar12 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar13 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar14 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar15 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar16 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar17 = v5q0.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v5q0.d dVar18 = v5q0.c;
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
                        v5q0.d dVar19 = v5q0.c;
                        z = w.l(dVar19.k(j, generatedMessageLite), dVar19.k(j, generatedMessageLite2));
                        break;
                    case 50:
                        v5q0.d dVar20 = v5q0.c;
                        z = w.l(dVar20.k(j, generatedMessageLite), dVar20.k(j, generatedMessageLite2));
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
                        v5q0.d dVar21 = v5q0.c;
                        if (dVar21.i(j2, generatedMessageLite) == dVar21.i(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                z<?, ?> zVar = this.n;
                if (zVar.g(generatedMessageLite).equals(zVar.g(generatedMessageLite2))) {
                    if (!this.f) {
                        return true;
                    }
                    g<?> gVar = this.o;
                    return gVar.c(generatedMessageLite).equals(gVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return s(i, generatedMessageLite) == s(i, generatedMessageLite2);
    }

    public final <UT, UB> UB n(Object obj, int i, UB ub, z<UT, UB> zVar, Object obj2) {
        Internal.EnumVerifier o;
        int i2 = this.a[i];
        Object k = v5q0.c.k(S(i) & 1048575, obj);
        if (k == null || (o = o(i)) == null) {
            return ub;
        }
        m mVar = this.p;
        MapFieldLite d = mVar.d(k);
        MapEntryLite.b<?, ?> b = mVar.b(p(i));
        Iterator it = d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) zVar.f(obj2);
                }
                ByteString.f newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(b, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.b(), b, entry.getKey(), entry.getValue());
                    zVar.d(ub, i2, newCodedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final Internal.EnumVerifier o(int i) {
        return (Internal.EnumVerifier) this.b[fb20.a(i, 3, 2, 1)];
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final v q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        v vVar = (v) objArr[i2];
        if (vVar != null) {
            return vVar;
        }
        v<T> a2 = u8e0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a2;
        return a2;
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            int S = S(i);
            long j2 = S & 1048575;
            switch (R(S)) {
                case 0:
                    if (Double.doubleToRawLongBits(v5q0.c.g(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(v5q0.c.h(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (v5q0.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (v5q0.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (v5q0.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return v5q0.c.e(j2, obj);
                case 8:
                    Object k = v5q0.c.k(j2, obj);
                    if (k instanceof String) {
                        return !((String) k).isEmpty();
                    }
                    if (k instanceof ByteString) {
                        return !ByteString.EMPTY.equals(k);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (v5q0.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(v5q0.c.k(j2, obj));
                case 11:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (v5q0.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (v5q0.c.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (v5q0.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (v5q0.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & v5q0.c.i(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean t(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? s(i, t) : (i3 & i4) != 0;
    }

    public final boolean v(int i, int i2, Object obj) {
        return v5q0.c.i((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void w(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, d dVar) throws IOException {
        long S = S(i) & 1048575;
        Object k = v5q0.c.k(S, obj);
        m mVar = this.p;
        if (k == null) {
            k = mVar.f();
            v5q0.q(S, obj, k);
        } else if (mVar.h(k)) {
            MapFieldLite f = mVar.f();
            mVar.a(f, k);
            v5q0.q(S, obj, f);
            k = f;
        }
        dVar.C(mVar.d(k), mVar.b(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            long S = S(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            v q2 = q(i);
            if (!s(i, obj)) {
                if (u(object)) {
                    Object b = q2.b();
                    q2.a(b, object);
                    unsafe.putObject(obj, S, b);
                } else {
                    unsafe.putObject(obj, S, object);
                }
                M(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, S);
            if (!u(object2)) {
                Object b2 = q2.b();
                q2.a(b2, object2);
                unsafe.putObject(obj, S, b2);
                object2 = b2;
            }
            q2.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (v(i2, i, obj2)) {
            long S = S(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            v q2 = q(i);
            if (!v(i2, i, obj)) {
                if (u(object)) {
                    Object b = q2.b();
                    q2.a(b, object);
                    unsafe.putObject(obj, S, b);
                } else {
                    unsafe.putObject(obj, S, object);
                }
                N(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, S);
            if (!u(object2)) {
                Object b2 = q2.b();
                q2.a(b2, object2);
                unsafe.putObject(obj, S, b2);
                object2 = b2;
            }
            q2.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(int i, Object obj) {
        v q2 = q(i);
        long S = S(i) & 1048575;
        if (!s(i, obj)) {
            return q2.b();
        }
        Object object = r.getObject(obj, S);
        if (u(object)) {
            return object;
        }
        Object b = q2.b();
        if (object != null) {
            q2.a(b, object);
        }
        return b;
    }
}
