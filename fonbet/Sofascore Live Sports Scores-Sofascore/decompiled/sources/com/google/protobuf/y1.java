package com.google.protobuf;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bc2;
import defpackage.cp4;
import defpackage.d4;
import defpackage.dc2;
import defpackage.fik;
import defpackage.hml;
import defpackage.i3c;
import defpackage.ilg;
import defpackage.is8;
import defpackage.jff;
import defpackage.knf;
import defpackage.lnb;
import defpackage.mii;
import defpackage.mz1;
import defpackage.pk6;
import defpackage.pz7;
import defpackage.rbd;
import defpackage.sck;
import defpackage.tg0;
import defpackage.tlh;
import defpackage.uck;
import defpackage.uoa;
import defpackage.vsg;
import defpackage.wgc;
import defpackage.wlh;
import defpackage.wt3;
import defpackage.ytb;
import defpackage.zzl;
import java.io.IOException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y1 implements vsg {
    public static final int[] q = new int[0];
    public static final Unsafe r;
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
    public final rbd l;
    public final r1 m;
    public final t2 n;
    public final pk6 o;
    public final ytb p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public y1(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, rbd rbdVar, r1 r1Var, t2 t2Var, pk6 pk6Var, ytb ytbVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.f = pk6Var != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage);
        this.h = z;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = rbdVar;
        this.m = r1Var;
        this.n = t2Var;
        this.o = pk6Var;
        this.e = messageLite;
        this.p = ytbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y1 B(wgc wgcVar, rbd rbdVar, r1 r1Var, t2 t2Var, pk6 pk6Var, ytb ytbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int objectFieldOffset;
        int i5;
        int objectFieldOffset2;
        int i6;
        int i7;
        int i8;
        int charAt;
        int i9;
        int charAt2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        char charAt10;
        int i25;
        int i26;
        Object[] objArr;
        int i27;
        int[] iArr2;
        int i28;
        int i29;
        int objectFieldOffset3;
        String str;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        java.lang.reflect.Field K;
        char charAt11;
        int i35;
        int i36;
        java.lang.reflect.Field K2;
        java.lang.reflect.Field K3;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        int i39;
        char charAt14;
        int i40;
        char charAt15;
        boolean z = wgcVar instanceof knf;
        int[] iArr3 = q;
        int i41 = 0;
        if (!z) {
            mii miiVar = (mii) wgcVar;
            a1[] a1VarArr = miiVar.d;
            if (a1VarArr.length == 0) {
                i2 = 0;
                i = 0;
            } else {
                int i42 = a1VarArr[0].c;
                i = a1VarArr[a1VarArr.length - 1].c;
                i2 = i42;
            }
            int length = a1VarArr.length;
            int[] iArr4 = new int[length * 3];
            Object[] objArr2 = new Object[length * 2];
            int i43 = 0;
            int i44 = 0;
            for (a1 a1Var : a1VarArr) {
                FieldType fieldType = a1Var.b;
                if (fieldType == FieldType.MAP) {
                    i43++;
                } else if (fieldType.id() >= 18 && a1Var.b.id() <= 49) {
                    i44++;
                }
            }
            int[] iArr5 = i43 > 0 ? new int[i43] : null;
            int[] iArr6 = i44 > 0 ? new int[i44] : null;
            int[] iArr7 = miiVar.c;
            if (iArr7 == null) {
                iArr7 = iArr3;
            }
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            while (i45 < a1VarArr.length) {
                a1 a1Var2 = a1VarArr[i45];
                a1[] a1VarArr2 = a1VarArr;
                int i50 = a1Var2.c;
                Object[] objArr3 = objArr2;
                java.lang.reflect.Field field = a1Var2.a;
                int i51 = i2;
                FieldType fieldType2 = a1Var2.b;
                int i52 = i;
                Internal.EnumVerifier enumVerifier = a1Var2.j;
                sck sckVar = uck.c;
                int[] iArr8 = iArr4;
                int[] iArr9 = iArr3;
                int objectFieldOffset4 = (int) sckVar.b.objectFieldOffset(field);
                int id = fieldType2.id();
                if (fieldType2.isList() || fieldType2.isMap()) {
                    i3 = objectFieldOffset4;
                    i4 = id;
                    java.lang.reflect.Field field2 = a1Var2.h;
                    if (field2 == null) {
                        i5 = 0;
                        objectFieldOffset = 0;
                    } else {
                        objectFieldOffset = (int) sckVar.b.objectFieldOffset(field2);
                        i5 = 0;
                    }
                } else {
                    i3 = objectFieldOffset4;
                    java.lang.reflect.Field field3 = a1Var2.d;
                    if (field3 == null) {
                        i4 = id;
                        objectFieldOffset2 = 1048575;
                    } else {
                        i4 = id;
                        objectFieldOffset2 = (int) sckVar.b.objectFieldOffset(field3);
                    }
                    i5 = Integer.numberOfTrailingZeros(a1Var2.e);
                    objectFieldOffset = objectFieldOffset2;
                }
                iArr8[i46] = a1Var2.c;
                iArr8[i46 + 1] = (a1Var2.g ? 536870912 : 0) | (a1Var2.f ? 268435456 : 0) | (i4 << 20) | i3;
                iArr8[i46 + 2] = (i5 << 20) | objectFieldOffset;
                int i53 = pz7.a[fieldType2.ordinal()];
                Class<?> type = ((i53 == 1 || i53 == 2) && field != null) ? field.getType() : null;
                Object obj = a1Var2.i;
                if (obj != null) {
                    int i54 = (i46 / 3) * 2;
                    objArr3[i54] = obj;
                    if (type != null) {
                        objArr3[i54 + 1] = type;
                    } else if (enumVerifier != null) {
                        objArr3[i54 + 1] = enumVerifier;
                    }
                } else if (type != null) {
                    objArr3[lnb.d(i46, 3, 2, 1)] = type;
                } else if (enumVerifier != null) {
                    objArr3[lnb.d(i46, 3, 2, 1)] = enumVerifier;
                }
                if (i47 < iArr7.length && iArr7[i47] == i50) {
                    iArr7[i47] = i46;
                    i47++;
                }
                if (fieldType2 == FieldType.MAP) {
                    iArr5[i48] = i46;
                    i48++;
                } else if (fieldType2.id() >= 18 && fieldType2.id() <= 49) {
                    iArr6[i49] = (int) sckVar.b.objectFieldOffset(field);
                    i49++;
                }
                i45++;
                i46 += 3;
                a1VarArr = a1VarArr2;
                objArr2 = objArr3;
                i2 = i51;
                i = i52;
                iArr4 = iArr8;
                iArr3 = iArr9;
            }
            Object[] objArr4 = objArr2;
            int i55 = i2;
            int i56 = i;
            int[] iArr10 = iArr4;
            int[] iArr11 = iArr3;
            if (iArr5 == null) {
                iArr5 = iArr11;
            }
            int[] iArr12 = iArr6 == null ? iArr11 : iArr6;
            int[] iArr13 = new int[iArr7.length + iArr5.length + iArr12.length];
            System.arraycopy(iArr7, 0, iArr13, 0, iArr7.length);
            System.arraycopy(iArr5, 0, iArr13, iArr7.length, iArr5.length);
            System.arraycopy(iArr12, 0, iArr13, iArr7.length + iArr5.length, iArr12.length);
            return new y1(iArr10, objArr4, i55, i56, miiVar.e, true, iArr13, iArr7.length, iArr7.length + iArr5.length, rbdVar, r1Var, t2Var, pk6Var, ytbVar);
        }
        knf knfVar = (knf) wgcVar;
        String str2 = knfVar.b;
        int length2 = str2.length();
        char c = 55296;
        if (str2.charAt(0) >= 55296) {
            int i57 = 1;
            while (true) {
                i6 = i57 + 1;
                if (str2.charAt(i57) < 55296) {
                    break;
                }
                i57 = i6;
            }
        } else {
            i6 = 1;
        }
        int i58 = i6 + 1;
        int charAt16 = str2.charAt(i6);
        if (charAt16 >= 55296) {
            int i59 = charAt16 & 8191;
            int i60 = 13;
            while (true) {
                i40 = i58 + 1;
                charAt15 = str2.charAt(i58);
                if (charAt15 < 55296) {
                    break;
                }
                i59 |= (charAt15 & 8191) << i60;
                i60 += 13;
                i58 = i40;
            }
            charAt16 = i59 | (charAt15 << i60);
            i58 = i40;
        }
        if (charAt16 == 0) {
            iArr = iArr3;
            charAt = 0;
            charAt2 = 0;
            i13 = 0;
            i10 = 0;
            i16 = 0;
            i14 = 0;
            i15 = 0;
        } else {
            int i61 = i58 + 1;
            int charAt17 = str2.charAt(i58);
            if (charAt17 >= 55296) {
                int i62 = charAt17 & 8191;
                int i63 = 13;
                while (true) {
                    i24 = i61 + 1;
                    charAt10 = str2.charAt(i61);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i62 |= (charAt10 & 8191) << i63;
                    i63 += 13;
                    i61 = i24;
                }
                charAt17 = i62 | (charAt10 << i63);
                i61 = i24;
            }
            int i64 = i61 + 1;
            int charAt18 = str2.charAt(i61);
            if (charAt18 >= 55296) {
                int i65 = charAt18 & 8191;
                int i66 = 13;
                while (true) {
                    i23 = i64 + 1;
                    charAt9 = str2.charAt(i64);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i65 |= (charAt9 & 8191) << i66;
                    i66 += 13;
                    i64 = i23;
                }
                charAt18 = i65 | (charAt9 << i66);
                i64 = i23;
            }
            int i67 = i64 + 1;
            int charAt19 = str2.charAt(i64);
            if (charAt19 >= 55296) {
                int i68 = charAt19 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i22 = i69 + 1;
                    charAt8 = str2.charAt(i69);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i68 |= (charAt8 & 8191) << i70;
                    i70 += 13;
                    i69 = i22;
                }
                charAt19 = i68 | (charAt8 << i70);
                i7 = i22;
            } else {
                i7 = i67;
            }
            int i71 = i7 + 1;
            int charAt20 = str2.charAt(i7);
            if (charAt20 >= 55296) {
                int i72 = charAt20 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i21 = i73 + 1;
                    charAt7 = str2.charAt(i73);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i72 |= (charAt7 & 8191) << i74;
                    i74 += 13;
                    i73 = i21;
                }
                charAt20 = i72 | (charAt7 << i74);
                i8 = i21;
            } else {
                i8 = i71;
            }
            int i75 = i8 + 1;
            charAt = str2.charAt(i8);
            if (charAt >= 55296) {
                int i76 = charAt & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i20 = i77 + 1;
                    charAt6 = str2.charAt(i77);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i76 |= (charAt6 & 8191) << i78;
                    i78 += 13;
                    i77 = i20;
                }
                charAt = i76 | (charAt6 << i78);
                i9 = i20;
            } else {
                i9 = i75;
            }
            int i79 = i9 + 1;
            charAt2 = str2.charAt(i9);
            if (charAt2 >= 55296) {
                int i80 = charAt2 & 8191;
                i10 = 0;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i19 = i81 + 1;
                    charAt5 = str2.charAt(i81);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i80 |= (charAt5 & 8191) << i82;
                    i82 += 13;
                    i81 = i19;
                }
                charAt2 = i80 | (charAt5 << i82);
                i11 = i19;
            } else {
                i10 = 0;
                i11 = i79;
            }
            int i83 = i11 + 1;
            int charAt21 = str2.charAt(i11);
            if (charAt21 >= 55296) {
                int i84 = charAt21 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i18 = i85 + 1;
                    charAt4 = str2.charAt(i85);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i84 |= (charAt4 & 8191) << i86;
                    i86 += 13;
                    i85 = i18;
                }
                charAt21 = i84 | (charAt4 << i86);
                i12 = i18;
            } else {
                i12 = i83;
            }
            int i87 = i12 + 1;
            int charAt22 = str2.charAt(i12);
            if (charAt22 >= 55296) {
                int i88 = charAt22 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i17 = i89 + 1;
                    charAt3 = str2.charAt(i89);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i88 |= (charAt3 & 8191) << i90;
                    i90 += 13;
                    i89 = i17;
                }
                charAt22 = i88 | (charAt3 << i90);
                i87 = i17;
            }
            i13 = (charAt17 * 2) + charAt18;
            i14 = charAt20;
            i15 = charAt22;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i41 = charAt17;
            i16 = charAt19;
            i58 = i87;
        }
        Object[] objArr5 = knfVar.c;
        Class<?> cls = knfVar.a.getClass();
        int[] iArr14 = new int[charAt * 3];
        Object[] objArr6 = new Object[charAt * 2];
        int i91 = i15 + charAt2;
        int i92 = i10;
        int i93 = i92;
        int i94 = i15;
        int i95 = i91;
        while (i58 < length2) {
            int i96 = i58 + 1;
            int charAt23 = str2.charAt(i58);
            if (charAt23 >= c) {
                int i97 = charAt23 & 8191;
                int i98 = i96;
                int i99 = 13;
                while (true) {
                    i39 = i98 + 1;
                    charAt14 = str2.charAt(i98);
                    if (charAt14 < c) {
                        break;
                    }
                    i97 |= (charAt14 & 8191) << i99;
                    i99 += 13;
                    i98 = i39;
                }
                charAt23 = i97 | (charAt14 << i99);
                i25 = i39;
            } else {
                i25 = i96;
            }
            int i100 = i25 + 1;
            int charAt24 = str2.charAt(i25);
            if (charAt24 >= c) {
                int i101 = charAt24 & 8191;
                int i102 = i100;
                int i103 = 13;
                while (true) {
                    i38 = i102 + 1;
                    charAt13 = str2.charAt(i102);
                    if (charAt13 < c) {
                        break;
                    }
                    i101 |= (charAt13 & 8191) << i103;
                    i103 += 13;
                    i102 = i38;
                }
                charAt24 = i101 | (charAt13 << i103);
                i26 = i38;
            } else {
                i26 = i100;
            }
            int i104 = charAt24 & 255;
            if ((charAt24 & 1024) != 0) {
                iArr[i92] = i93;
                i92++;
            }
            Object[] objArr7 = objArr5;
            Unsafe unsafe = r;
            if (i104 >= 51) {
                int i105 = i26 + 1;
                int charAt25 = str2.charAt(i26);
                objArr = objArr6;
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i106 = charAt25 & 8191;
                    int i107 = 13;
                    while (true) {
                        i37 = i105 + 1;
                        charAt12 = str2.charAt(i105);
                        if (charAt12 < c2) {
                            break;
                        }
                        i106 |= (charAt12 & 8191) << i107;
                        i107 += 13;
                        i105 = i37;
                        c2 = 55296;
                    }
                    charAt25 = i106 | (charAt12 << i107);
                    i105 = i37;
                }
                int i108 = i104 - 51;
                i27 = i92;
                if (i108 == 9 || i108 == 17) {
                    iArr2 = iArr14;
                    i36 = 2;
                    objArr[lnb.d(i93, 3, 2, 1)] = objArr7[i13];
                    i13++;
                } else if (i108 != 12 || (!knfVar.getSyntax().equals(ProtoSyntax.PROTO2) && (charAt24 & com.ironsource.mediationsdk.metadata.a.o) == 0)) {
                    iArr2 = iArr14;
                    i36 = 2;
                } else {
                    iArr2 = iArr14;
                    i36 = 2;
                    objArr[lnb.d(i93, 3, 2, 1)] = objArr7[i13];
                    i13++;
                }
                int i109 = charAt25 * i36;
                Object obj2 = objArr7[i109];
                if (obj2 instanceof java.lang.reflect.Field) {
                    K2 = (java.lang.reflect.Field) obj2;
                } else {
                    K2 = K(cls, (String) obj2);
                    objArr7[i109] = K2;
                }
                i34 = (int) unsafe.objectFieldOffset(K2);
                int i110 = i109 + 1;
                Object obj3 = objArr7[i110];
                if (obj3 instanceof java.lang.reflect.Field) {
                    K3 = (java.lang.reflect.Field) obj3;
                } else {
                    K3 = K(cls, (String) obj3);
                    objArr7[i110] = K3;
                }
                i32 = (int) unsafe.objectFieldOffset(K3);
                int i111 = i13;
                str = str2;
                i33 = i111;
                i30 = i105;
                i31 = i10;
            } else {
                objArr = objArr6;
                i27 = i92;
                iArr2 = iArr14;
                int i112 = i13 + 1;
                java.lang.reflect.Field K4 = K(cls, (String) objArr7[i13]);
                if (i104 == 9 || i104 == 17) {
                    i28 = i112;
                    objArr[lnb.d(i93, 3, 2, 1)] = K4.getType();
                } else {
                    if (i104 == 27 || i104 == 49) {
                        i35 = i13 + 2;
                        objArr[lnb.d(i93, 3, 2, 1)] = objArr7[i112];
                    } else {
                        if (i104 == 12 || i104 == 30 || i104 == 44) {
                            if (knfVar.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                                i35 = i13 + 2;
                                objArr[lnb.d(i93, 3, 2, 1)] = objArr7[i112];
                            }
                        } else if (i104 == 50) {
                            int i113 = i94 + 1;
                            iArr[i94] = i93;
                            int i114 = (i93 / 3) * 2;
                            int i115 = i13 + 2;
                            objArr[i114] = objArr7[i112];
                            if ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                                i29 = i13 + 3;
                                objArr[i114 + 1] = objArr7[i115];
                            } else {
                                i29 = i115;
                            }
                            i94 = i113;
                            objectFieldOffset3 = (int) unsafe.objectFieldOffset(K4);
                            if ((charAt24 & 4096) != 0 || i104 > 17) {
                                str = str2;
                                i30 = i26;
                                i31 = i10;
                                i32 = 1048575;
                            } else {
                                int i116 = i26 + 1;
                                int charAt26 = str2.charAt(i26);
                                if (charAt26 >= 55296) {
                                    int i117 = charAt26 & 8191;
                                    int i118 = 13;
                                    while (true) {
                                        i30 = i116 + 1;
                                        charAt11 = str2.charAt(i116);
                                        if (charAt11 < 55296) {
                                            break;
                                        }
                                        i117 |= (charAt11 & 8191) << i118;
                                        i118 += 13;
                                        i116 = i30;
                                    }
                                    charAt26 = i117 | (charAt11 << i118);
                                } else {
                                    i30 = i116;
                                }
                                int i119 = (charAt26 / 32) + (i41 * 2);
                                Object obj4 = objArr7[i119];
                                if (obj4 instanceof java.lang.reflect.Field) {
                                    K = (java.lang.reflect.Field) obj4;
                                } else {
                                    K = K(cls, (String) obj4);
                                    objArr7[i119] = K;
                                }
                                str = str2;
                                i31 = charAt26 % 32;
                                i32 = (int) unsafe.objectFieldOffset(K);
                            }
                            if (i104 >= 18 && i104 <= 49) {
                                iArr[i95] = objectFieldOffset3;
                                i95++;
                            }
                            i33 = i29;
                            i34 = objectFieldOffset3;
                        }
                        i28 = i112;
                    }
                    i29 = i35;
                    objectFieldOffset3 = (int) unsafe.objectFieldOffset(K4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i30 = i26;
                    i31 = i10;
                    i32 = 1048575;
                    if (i104 >= 18) {
                        iArr[i95] = objectFieldOffset3;
                        i95++;
                    }
                    i33 = i29;
                    i34 = objectFieldOffset3;
                }
                i29 = i28;
                objectFieldOffset3 = (int) unsafe.objectFieldOffset(K4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i30 = i26;
                i31 = i10;
                i32 = 1048575;
                if (i104 >= 18) {
                }
                i33 = i29;
                i34 = objectFieldOffset3;
            }
            int i120 = i93 + 1;
            iArr2[i93] = charAt23;
            int i121 = i93 + 2;
            iArr2[i120] = i34 | ((charAt24 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? Integer.MIN_VALUE : i10) | ((charAt24 & 512) != 0 ? 536870912 : i10) | ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : i10) | (i104 << 20);
            i93 += 3;
            iArr2[i121] = i32 | (i31 << 20);
            String str3 = str;
            i13 = i33;
            str2 = str3;
            i58 = i30;
            objArr5 = objArr7;
            objArr6 = objArr;
            i92 = i27;
            iArr14 = iArr2;
            c = 55296;
        }
        int[] iArr15 = iArr14;
        MessageLite messageLite = knfVar.a;
        knfVar.getSyntax();
        return new y1(iArr15, objArr6, i16, i14, messageLite, false, iArr, i15, i91, rbdVar, r1Var, t2Var, pk6Var, ytbVar);
    }

    public static long C(int i) {
        return i & 1048575;
    }

    public static int D(Object obj, long j) {
        return ((Integer) uck.j(obj, j)).intValue();
    }

    public static long E(Object obj, long j) {
        return ((Long) uck.j(obj, j)).longValue();
    }

    public static java.lang.reflect.Field K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder q2 = wt3.q("Field ", str, " for ");
            q2.append(cls.getName());
            q2.append(" not found. Known fields are ");
            i3c.n(q2, Arrays.toString(declaredFields));
            return null;
        }
    }

    public static int Q(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void T(int i, Object obj, hml hmlVar) {
        if (obj instanceof String) {
            ((z) hmlVar).a.writeString(i, (String) obj);
        } else {
            ((z) hmlVar).a(i, (ByteString) obj);
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        a70.p(mz1.m(obj, "Mutating immutable message: "));
    }

    public static int m(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, tg0 tg0Var) {
        switch (x1.a[fieldType.ordinal()]) {
            case 1:
                int t = f.t(bArr, i, tg0Var);
                tg0Var.c = Boolean.valueOf(tg0Var.b != 0);
                return t;
            case 2:
                return f.a(bArr, i, tg0Var);
            case 3:
                tg0Var.c = Double.valueOf(Double.longBitsToDouble(f.c(i, bArr)));
                return i + 8;
            case 4:
            case 5:
                tg0Var.c = Integer.valueOf(f.b(i, bArr));
                return i + 4;
            case 6:
            case 7:
                tg0Var.c = Long.valueOf(f.c(i, bArr));
                return i + 8;
            case 8:
                tg0Var.c = Float.valueOf(Float.intBitsToFloat(f.b(i, bArr)));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int r2 = f.r(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(tg0Var.a);
                return r2;
            case 12:
            case 13:
                int t2 = f.t(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(tg0Var.b);
                return t2;
            case 14:
                return f.e(jff.c.a(cls), bArr, i, i2, tg0Var);
            case 15:
                int r3 = f.r(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(CodedInputStream.decodeZigZag32(tg0Var.a));
                return r3;
            case 16:
                int t3 = f.t(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(CodedInputStream.decodeZigZag64(tg0Var.b));
                return t3;
            case 17:
                int r4 = f.r(bArr, i, tg0Var);
                int i3 = tg0Var.a;
                if (i3 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i3 == 0) {
                    tg0Var.c = "";
                    return r4;
                }
                tg0Var.c = fik.a.a(r4, i3, bArr);
                return r4 + i3;
            default:
                cp4.h("unsupported field type.");
                return 0;
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

    public final Object A(int i, int i2, Object obj) {
        vsg q2 = q(i2);
        if (!v(i, i2, obj)) {
            return q2.d();
        }
        Object object = r.getObject(obj, R(i2) & 1048575);
        if (u(object)) {
            return object;
        }
        Object d = q2.d();
        if (object != null) {
            q2.a(d, object);
        }
        return d;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int F(java.lang.Object r41, byte[] r42, int r43, int r44, int r45, defpackage.tg0 r46) {
        /*
            Method dump skipped, instructions count: 4308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y1.F(java.lang.Object, byte[], int, int, int, tg0):int");
    }

    public final void G(Object obj, long j, s sVar, vsg vsgVar, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c = this.m.c(obj, j);
        CodedInputStream codedInputStream = sVar.a;
        if (WireFormat.getTagWireType(sVar.b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = sVar.b;
        do {
            Object d = vsgVar.d();
            sVar.b(d, vsgVar, extensionRegistryLite);
            vsgVar.b(d);
            c.add(d);
            if (codedInputStream.isAtEnd() || sVar.d != 0) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == i);
        sVar.d = readTag;
    }

    public final void H(Object obj, int i, s sVar, vsg vsgVar, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c = this.m.c(obj, i & 1048575);
        CodedInputStream codedInputStream = sVar.a;
        if (WireFormat.getTagWireType(sVar.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i2 = sVar.b;
        do {
            Object d = vsgVar.d();
            sVar.c(d, vsgVar, extensionRegistryLite);
            vsgVar.b(d);
            c.add(d);
            if (codedInputStream.isAtEnd() || sVar.d != 0) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == i2);
        sVar.d = readTag;
    }

    public final void I(int i, s sVar, Object obj) {
        CodedInputStream codedInputStream = sVar.a;
        if ((536870912 & i) != 0) {
            sVar.x(2);
            uck.r(i & 1048575, obj, codedInputStream.readStringRequireUtf8());
        } else if (!this.g) {
            uck.r(i & 1048575, obj, sVar.e());
        } else {
            sVar.x(2);
            uck.r(i & 1048575, obj, codedInputStream.readString());
        }
    }

    public final void J(int i, s sVar, Object obj) {
        boolean z = (536870912 & i) != 0;
        r1 r1Var = this.m;
        if (z) {
            sVar.t(r1Var.c(obj, i & 1048575), true);
        } else {
            sVar.t(r1Var.c(obj, i & 1048575), false);
        }
    }

    public final void L(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        uck.p((1 << (i2 >>> 20)) | uck.h(obj, j), j, obj);
    }

    public final void M(int i, int i2, Object obj) {
        uck.p(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int N(int i, int i2) {
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

    public final void O(int i, Object obj, Object obj2) {
        r.putObject(obj, R(i) & 1048575, obj2);
        L(i, obj);
    }

    public final void P(int i, Object obj, Object obj2, int i2) {
        r.putObject(obj, R(i2) & 1048575, obj2);
        M(i, i2, obj);
    }

    public final int R(int i) {
        return this.a[i + 1];
    }

    public final void S(hml hmlVar, int i, Object obj, int i2) {
        if (obj != null) {
            Object p = p(i2);
            this.p.getClass();
            v1 metadata = ((MapEntryLite) p).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            z zVar = (z) hmlVar;
            CodedOutputStream codedOutputStream = zVar.a;
            CodedOutputStream codedOutputStream2 = zVar.a;
            if (!codedOutputStream.isSerializationDeterministic()) {
                Iterator it = mapFieldLite.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    codedOutputStream.writeTag(i, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                    MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i3 = 0;
            switch (y.a[metadata.a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v = mapFieldLite.get(bool);
                    if (v != 0) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v2 = mapFieldLite.get(bool2);
                    if (v2 != 0) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v2));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v2);
                        break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = mapFieldLite.size();
                    int[] iArr = new int[size];
                    Iterator it2 = mapFieldLite.keySet().iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        iArr[i4] = ((Integer) it2.next()).intValue();
                        i4++;
                    }
                    Arrays.sort(iArr);
                    while (i3 < size) {
                        int i5 = iArr[i3];
                        V v3 = mapFieldLite.get(Integer.valueOf(i5));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i5), v3));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i5), v3);
                        i3++;
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = mapFieldLite.size();
                    long[] jArr = new long[size2];
                    Iterator it3 = mapFieldLite.keySet().iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        jArr[i6] = ((Long) it3.next()).longValue();
                        i6++;
                    }
                    Arrays.sort(jArr);
                    while (i3 < size2) {
                        long j = jArr[i3];
                        V v4 = mapFieldLite.get(Long.valueOf(j));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j), v4));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j), v4);
                        i3++;
                    }
                    break;
                case 12:
                    int size3 = mapFieldLite.size();
                    String[] strArr = new String[size3];
                    Iterator it4 = mapFieldLite.keySet().iterator();
                    int i7 = 0;
                    while (it4.hasNext()) {
                        strArr[i7] = (String) it4.next();
                        i7++;
                    }
                    Arrays.sort(strArr);
                    while (i3 < size3) {
                        String str = strArr[i3];
                        V v5 = mapFieldLite.get(str);
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v5));
                        MapEntryLite.writeTo(codedOutputStream, metadata, str, v5);
                        i3++;
                    }
                    break;
                default:
                    zzl.i(metadata.a, "does not support key type: ");
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.vsg
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                i2.l(this.n, obj4, obj2);
                if (this.f) {
                    ((u0) this.o).getClass();
                    d1 d1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (d1Var.a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite.ExtendableMessage) obj4).ensureExtensionsAreMutable().n(d1Var);
                    return;
                }
                return;
            }
            int R = R(i);
            long j = 1048575 & R;
            int i2 = iArr[i];
            switch (Q(R)) {
                case 0:
                    if (t(i, obj2)) {
                        sck sckVar = uck.c;
                        obj3 = obj;
                        sckVar.j(obj3, j, sckVar.e(obj2, j));
                        L(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (t(i, obj2)) {
                        sck sckVar2 = uck.c;
                        sckVar2.k(obj, j, sckVar2.f(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (t(i, obj2)) {
                        uck.q(obj, j, uck.i(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (t(i, obj2)) {
                        uck.q(obj, j, uck.i(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (t(i, obj2)) {
                        uck.q(obj, j, uck.i(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (t(i, obj2)) {
                        sck sckVar3 = uck.c;
                        sckVar3.g(obj, j, sckVar3.c(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (t(i, obj2)) {
                        uck.r(j, obj, uck.j(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (t(i, obj2)) {
                        uck.r(j, obj, uck.j(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (t(i, obj2)) {
                        uck.q(obj, j, uck.i(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (t(i, obj2)) {
                        uck.p(uck.h(obj2, j), j, obj);
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (t(i, obj2)) {
                        uck.q(obj, j, uck.i(obj2, j));
                        L(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i, obj, obj2);
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
                    this.m.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = i2.a;
                    Object j2 = uck.j(obj, j);
                    Object j3 = uck.j(obj2, j);
                    this.p.getClass();
                    uck.r(j, obj, ytb.a(j2, j3));
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
                    if (v(i2, i, obj2)) {
                        uck.r(j, obj, uck.j(obj2, j));
                        M(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, obj2)) {
                        uck.r(j, obj, uck.j(obj2, j));
                        M(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i, obj, obj2);
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

    @Override // defpackage.vsg
    public final void b(Object obj) {
        if (u(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int R = R(i);
                long j = 1048575 & R;
                int Q = Q(R);
                Unsafe unsafe = r;
                if (Q != 9) {
                    if (Q != 60 && Q != 68) {
                        switch (Q) {
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
                                this.m.a(obj, j);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.p.getClass();
                                    ((MapFieldLite) object).makeImmutable();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(iArr[i], i, obj)) {
                        q(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (t(i, obj)) {
                    q(i).b(unsafe.getObject(obj, j));
                }
            }
            ((u2) this.n).getClass();
            ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
            if (this.f) {
                ((u0) this.o).getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
            }
        }
    }

    @Override // defpackage.vsg
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 >= this.j) {
                if (this.f) {
                    ((u0) this.o).getClass();
                    if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.j()) {
                        break;
                    }
                }
                return true;
            }
            int i7 = this.i[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int R = R(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = r.getInt(obj, i10);
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
            if ((268435456 & R) != 0 && !s(i2, i, i3, i11, obj)) {
                break;
            }
            int Q = Q(R);
            if (Q == 9 || Q == 17) {
                if (s(i2, i, i3, i11, obj) && !q(i2).c(uck.j(obj, R & 1048575))) {
                    break;
                }
                i6++;
                i4 = i;
                i5 = i3;
            } else {
                if (Q != 27) {
                    if (Q == 60 || Q == 68) {
                        if (v(i8, i2, obj) && !q(i2).c(uck.j(obj, R & 1048575))) {
                            break;
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    } else if (Q != 49) {
                        if (Q == 50) {
                            Object j = uck.j(obj, R & 1048575);
                            this.p.getClass();
                            MapFieldLite mapFieldLite = (MapFieldLite) j;
                            if (!mapFieldLite.isEmpty() && ((MapEntryLite) p(i2)).getMetadata().c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                vsg vsgVar = null;
                                for (Object obj2 : mapFieldLite.values()) {
                                    if (vsgVar == null) {
                                        vsgVar = jff.c.a(obj2.getClass());
                                    }
                                    if (!vsgVar.c(obj2)) {
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
                List list = (List) uck.j(obj, R & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    vsg q2 = q(i2);
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
        }
        return false;
    }

    @Override // defpackage.vsg
    public final Object d() {
        this.l.getClass();
        return ((GeneratedMessageLite) this.e).newMutableInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    @Override // defpackage.vsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageLite messageLite, hml hmlVar) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i;
        int i2;
        int i3;
        Map.Entry entry2;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        boolean z;
        int i7;
        Map.Entry entry3;
        Iterator it2;
        int length2;
        y1 y1Var = this;
        boolean z2 = y1Var.f;
        t2 t2Var = y1Var.n;
        int[] iArr = y1Var.a;
        ((z) hmlVar).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        pk6 pk6Var = y1Var.o;
        int i8 = 1048575;
        boolean z3 = true;
        if (writer$FieldOrder == writer$FieldOrder2) {
            ((u2) t2Var).getClass();
            ((GeneratedMessageLite) messageLite).unknownFields.writeTo(hmlVar);
            if (z2) {
                ((u0) pk6Var).getClass();
                d1 d1Var = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions;
                if (!d1Var.a.isEmpty()) {
                    boolean z4 = d1Var.c;
                    tlh tlhVar = d1Var.a;
                    if (z4) {
                        if (tlhVar.g == null) {
                            tlhVar.g = new wlh(tlhVar);
                        }
                        it2 = new uoa(tlhVar.g.iterator(), 0);
                    } else {
                        if (tlhVar.g == null) {
                            tlhVar.g = new wlh(tlhVar);
                        }
                        it2 = tlhVar.g.iterator();
                    }
                    entry3 = (Map.Entry) it2.next();
                    for (length2 = iArr.length - 3; length2 >= 0; length2 -= 3) {
                        int R = y1Var.R(length2);
                        int i9 = iArr[length2];
                        while (entry3 != null) {
                            ((u0) pk6Var).getClass();
                            if (((h1) entry3.getKey()).b > i9) {
                                pk6Var.b(hmlVar, entry3);
                                entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                            } else {
                                switch (Q(R)) {
                                    case 0:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeDouble(i9, uck.c.e(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeFloat(i9, uck.c.f(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).f(i9, uck.i(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeUInt64(i9, uck.i(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).e(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).c(i9, uck.i(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).b(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeBool(i9, uck.c.c(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (y1Var.t(length2, messageLite)) {
                                            T(i9, uck.j(messageLite, R & 1048575), hmlVar);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).g(i9, uck.j(messageLite, R & 1048575), y1Var.q(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a(i9, (ByteString) uck.j(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeUInt32(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeEnum(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeSFixed32(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeSFixed64(i9, uck.i(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeSInt32(i9, uck.h(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).a.writeSInt64(i9, uck.i(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (y1Var.t(length2, messageLite)) {
                                            ((z) hmlVar).d(i9, uck.j(messageLite, R & 1048575), y1Var.q(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        i2.q(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 19:
                                        i2.u(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 20:
                                        i2.x(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 21:
                                        i2.F(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 22:
                                        i2.w(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 23:
                                        i2.t(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 24:
                                        i2.s(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 25:
                                        i2.o(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 26:
                                        i2.D(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar);
                                        break;
                                    case 27:
                                        i2.y(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, y1Var.q(length2));
                                        break;
                                    case 28:
                                        i2.p(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar);
                                        break;
                                    case 29:
                                        i2.E(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 30:
                                        i2.r(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 31:
                                        i2.z(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 32:
                                        i2.A(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 33:
                                        i2.B(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 34:
                                        i2.C(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, false);
                                        break;
                                    case 35:
                                        i2.q(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 36:
                                        i2.u(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 37:
                                        i2.x(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 38:
                                        i2.F(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 39:
                                        i2.w(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 40:
                                        i2.t(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 41:
                                        i2.s(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 42:
                                        i2.o(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 43:
                                        i2.E(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 44:
                                        i2.r(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 45:
                                        i2.z(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 46:
                                        i2.A(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 47:
                                        i2.B(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 48:
                                        i2.C(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, true);
                                        break;
                                    case 49:
                                        i2.v(iArr[length2], (List) uck.j(messageLite, R & 1048575), hmlVar, y1Var.q(length2));
                                        break;
                                    case 50:
                                        y1Var.S(hmlVar, i9, uck.j(messageLite, R & 1048575), length2);
                                        break;
                                    case 51:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeDouble(i9, ((Double) uck.j(messageLite, R & 1048575)).doubleValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeFloat(i9, ((Float) uck.j(messageLite, R & 1048575)).floatValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).f(i9, E(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeUInt64(i9, E(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).e(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).c(i9, E(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).b(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeBool(i9, ((Boolean) uck.j(messageLite, R & 1048575)).booleanValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            T(i9, uck.j(messageLite, R & 1048575), hmlVar);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).g(i9, uck.j(messageLite, R & 1048575), y1Var.q(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a(i9, (ByteString) uck.j(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeUInt32(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeEnum(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeSFixed32(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeSFixed64(i9, E(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeSInt32(i9, D(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).a.writeSInt64(i9, E(messageLite, R & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (y1Var.v(i9, length2, messageLite)) {
                                            ((z) hmlVar).d(i9, uck.j(messageLite, R & 1048575), y1Var.q(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch (Q(R)) {
                        }
                    }
                    while (entry3 != null) {
                        pk6Var.b(hmlVar, entry3);
                        entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            entry3 = null;
            it2 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (z2) {
            ((u0) pk6Var).getClass();
            d1 d1Var2 = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions;
            if (!d1Var2.a.isEmpty()) {
                Iterator l = d1Var2.l();
                entry = (Map.Entry) l.next();
                it = l;
                length = iArr.length;
                Unsafe unsafe2 = r;
                int i10 = 1048575;
                i = 0;
                int i11 = 0;
                while (i < length) {
                    int R2 = y1Var.R(i);
                    int i12 = iArr[i];
                    int Q = Q(R2);
                    boolean z5 = z3;
                    if (Q <= 17) {
                        int i13 = iArr[i + 2];
                        Map.Entry entry4 = entry;
                        int i14 = i13 & i8;
                        if (i14 != i10) {
                            if (i14 == i8) {
                                i2 = i8;
                                i7 = i13;
                                i11 = 0;
                            } else {
                                i2 = i8;
                                i7 = i13;
                                i11 = unsafe2.getInt(messageLite, i14);
                            }
                            i10 = i14;
                        } else {
                            i2 = i8;
                            i7 = i13;
                        }
                        int i15 = i10;
                        i4 = (z5 ? 1 : 0) << (i7 >>> 20);
                        i3 = i15;
                        entry2 = entry4;
                    } else {
                        Map.Entry entry5 = entry;
                        i2 = i8;
                        i3 = i10;
                        entry2 = entry5;
                        i4 = 0;
                    }
                    while (entry2 != null) {
                        ((u0) pk6Var).getClass();
                        if (((h1) entry2.getKey()).b <= i12) {
                            pk6Var.b(hmlVar, entry2);
                            entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            int i16 = R2 & i2;
                            t2 t2Var2 = t2Var;
                            int[] iArr2 = iArr;
                            long j = i16;
                            switch (Q) {
                                case 0:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeDouble(i12, uck.c.e(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeFloat(i12, uck.c.f(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).f(i12, unsafe.getLong(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeUInt64(i12, unsafe.getLong(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).e(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).c(i12, unsafe.getLong(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).b(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeBool(i12, uck.c.c(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        T(i12, unsafe.getObject(messageLite, j), hmlVar);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).g(i12, unsafe.getObject(messageLite, j), y1Var.q(i5));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a(i12, (ByteString) unsafe.getObject(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeUInt32(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeEnum(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeSFixed32(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeSFixed64(i12, unsafe.getLong(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeSInt32(i12, unsafe.getInt(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).a.writeSInt64(i12, unsafe.getLong(messageLite, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    if (y1Var.s(i5, i3, i6, i4, messageLite)) {
                                        ((z) hmlVar).d(i12, unsafe.getObject(messageLite, j), y1Var.q(i5));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    i2.q(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 19:
                                    i2.u(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 20:
                                    i2.x(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 21:
                                    i2.F(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 22:
                                    i2.w(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 23:
                                    i2.t(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 24:
                                    i2.s(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 25:
                                    i2.o(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 26:
                                    i2.D(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 27:
                                    i2.y(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, y1Var.q(i));
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 28:
                                    i2.p(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 29:
                                    z = false;
                                    i2.E(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 30:
                                    z = false;
                                    i2.r(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 31:
                                    z = false;
                                    i2.z(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 32:
                                    z = false;
                                    i2.A(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 33:
                                    z = false;
                                    i2.B(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 34:
                                    z = false;
                                    i2.C(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, false);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 35:
                                    i2.q(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 36:
                                    i2.u(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 37:
                                    i2.x(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 38:
                                    i2.F(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 39:
                                    i2.w(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 40:
                                    i2.t(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 41:
                                    i2.s(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 42:
                                    i2.o(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 43:
                                    i2.E(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 44:
                                    i2.r(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 45:
                                    i2.z(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 46:
                                    i2.A(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 47:
                                    i2.B(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 48:
                                    i2.C(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, z5);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 49:
                                    i2.v(iArr2[i], (List) unsafe2.getObject(messageLite, j), hmlVar, y1Var.q(i));
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 50:
                                    y1Var.S(hmlVar, i12, unsafe2.getObject(messageLite, j), i);
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 51:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeDouble(i12, ((Double) uck.j(messageLite, j)).doubleValue());
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 52:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeFloat(i12, ((Float) uck.j(messageLite, j)).floatValue());
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 53:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).f(i12, E(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 54:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeUInt64(i12, E(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 55:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).e(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 56:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).c(i12, E(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 57:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).b(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 58:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeBool(i12, ((Boolean) uck.j(messageLite, j)).booleanValue());
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 59:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        T(i12, unsafe2.getObject(messageLite, j), hmlVar);
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 60:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).g(i12, unsafe2.getObject(messageLite, j), y1Var.q(i));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 61:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a(i12, (ByteString) unsafe2.getObject(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 62:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeUInt32(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 63:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeEnum(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 64:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeSFixed32(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 65:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeSFixed64(i12, E(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 66:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeSInt32(i12, D(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 67:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).a.writeSInt64(i12, E(messageLite, j));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                case 68:
                                    if (y1Var.v(i12, i, messageLite)) {
                                        ((z) hmlVar).d(i12, unsafe2.getObject(messageLite, j), y1Var.q(i));
                                    }
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                                default:
                                    unsafe = unsafe2;
                                    i5 = i;
                                    i6 = i11;
                                    break;
                            }
                            int i17 = i5 + 3;
                            i10 = i3;
                            i11 = i6;
                            entry = entry2;
                            unsafe2 = unsafe;
                            t2Var = t2Var2;
                            i8 = i2;
                            iArr = iArr2;
                            z3 = true;
                            i = i17;
                            y1Var = this;
                        }
                    }
                    int i162 = R2 & i2;
                    t2 t2Var22 = t2Var;
                    int[] iArr22 = iArr;
                    long j2 = i162;
                    switch (Q) {
                    }
                    int i172 = i5 + 3;
                    i10 = i3;
                    i11 = i6;
                    entry = entry2;
                    unsafe2 = unsafe;
                    t2Var = t2Var22;
                    i8 = i2;
                    iArr = iArr22;
                    z3 = true;
                    i = i172;
                    y1Var = this;
                }
                t2 t2Var3 = t2Var;
                while (entry != null) {
                    pk6Var.b(hmlVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((u2) t2Var3).getClass();
                ((GeneratedMessageLite) messageLite).unknownFields.writeTo(hmlVar);
            }
        }
        entry = null;
        it = null;
        length = iArr.length;
        Unsafe unsafe22 = r;
        int i102 = 1048575;
        i = 0;
        int i112 = 0;
        while (i < length) {
        }
        t2 t2Var32 = t2Var;
        while (entry != null) {
        }
        ((u2) t2Var32).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeTo(hmlVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.vsg
    public final int f(AbstractMessageLite abstractMessageLite) {
        int i;
        int computeDoubleSize;
        int computeFloatSize;
        int computeTagSize;
        int size;
        int i2;
        int computeTagSize2;
        int computeTagSize3;
        int size2;
        int computeTagSize4;
        int computeUInt32SizeNoTag;
        int i3;
        y1 y1Var = this;
        AbstractMessageLite abstractMessageLite2 = abstractMessageLite;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = y1Var.a;
            if (i5 >= iArr.length) {
                ((u2) y1Var.n).getClass();
                int serializedSize = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSize() + i7;
                if (!y1Var.f) {
                    return serializedSize;
                }
                ((u0) y1Var.o).getClass();
                return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.i() + serializedSize;
            }
            int R = y1Var.R(i5);
            int Q = Q(R);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            Unsafe unsafe = r;
            if (Q <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(abstractMessageLite2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = i7;
            long j = R & i4;
            if (Q < FieldType.DOUBLE_LIST_PACKED.id() || Q > FieldType.SINT64_LIST_PACKED.id()) {
                i11 = 0;
            }
            boolean z = y1Var.h;
            switch (Q) {
                case 0:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(i9, 0.0d);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 1:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(i9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 2:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 3:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeUInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 4:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 5:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 6:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(i9, 0);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 7:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(i9, true);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 8:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        Object object = unsafe.getObject(abstractMessageLite2, j);
                        i7 = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(i9, (ByteString) object) : CodedOutputStream.computeStringSize(i9, (String) object)) + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 9:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        Object object2 = unsafe.getObject(abstractMessageLite2, j);
                        vsg q2 = y1Var.q(i5);
                        Class cls = i2.a;
                        computeDoubleSize = object2 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object2) : CodedOutputStream.computeMessageSize(i9, (MessageLite) object2, q2);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 10:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 11:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeUInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 12:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeEnumSize(i9, unsafe.getInt(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 13:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 14:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 15:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeSInt32Size(i9, unsafe.getInt(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 16:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeFloatSize = CodedOutputStream.computeSInt64Size(i9, unsafe.getLong(abstractMessageLite2, j));
                        i7 = computeFloatSize + i12;
                        y1Var = this;
                        break;
                    }
                    y1Var = this;
                    i7 = i12;
                    break;
                case 17:
                    if (y1Var.s(i5, i8, i6, i, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(abstractMessageLite2, j), y1Var.q(i5));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 18:
                    computeDoubleSize = i2.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 19:
                    computeDoubleSize = i2.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls2 = i2.a;
                    if (list.size() != 0) {
                        computeTagSize = (CodedOutputStream.computeTagSize(i9) * list.size()) + i2.e(list);
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls3 = i2.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = i2.i(list2);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls4 = i2.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = i2.d(list3);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 23:
                    computeDoubleSize = i2.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 24:
                    computeDoubleSize = i2.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls5 = i2.a;
                    int size3 = list4.size();
                    i7 = i12 + (size3 == 0 ? 0 : CodedOutputStream.computeBoolSize(i9, true) * size3);
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls6 = i2.a;
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
                    List list6 = (List) unsafe.getObject(abstractMessageLite2, j);
                    vsg q3 = y1Var.q(i5);
                    Class cls7 = i2.a;
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
                    List list7 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls8 = i2.a;
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
                    List list8 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls9 = i2.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = i2.h(list8);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls10 = i2.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = i2.a(list9);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 31:
                    computeDoubleSize = i2.b(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 32:
                    computeDoubleSize = i2.c(i9, (List) unsafe.getObject(abstractMessageLite2, j));
                    i7 = computeDoubleSize + i12;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls11 = i2.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = i2.f(list10);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls12 = i2.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = i2.g(list11);
                        computeTagSize2 = CodedOutputStream.computeTagSize(i9);
                        computeTagSize = (computeTagSize2 * size) + i2;
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls13 = i2.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls14 = i2.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 37:
                    size2 = i2.e((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 38:
                    size2 = i2.i((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 39:
                    size2 = i2.d((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls15 = i2.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls16 = i2.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls17 = i2.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 43:
                    size2 = i2.h((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 44:
                    size2 = i2.a((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls18 = i2.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls19 = i2.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 47:
                    size2 = i2.f((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 48:
                    size2 = i2.g((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(abstractMessageLite2, i11, size2);
                        }
                        computeTagSize4 = CodedOutputStream.computeTagSize(i9);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        i7 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractMessageLite2, j);
                    vsg q4 = y1Var.q(i5);
                    Class cls20 = i2.a;
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
                    Object object3 = unsafe.getObject(abstractMessageLite2, j);
                    Object p = y1Var.p(i5);
                    y1Var.p.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    MapEntryLite mapEntryLite = (MapEntryLite) p;
                    if (!mapFieldLite.isEmpty()) {
                        computeTagSize = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            computeTagSize += mapEntryLite.computeMessageSize(i9, entry.getKey(), entry.getValue());
                        }
                        i7 = i12 + computeTagSize;
                        break;
                    }
                    computeTagSize = 0;
                    i7 = i12 + computeTagSize;
                case 51:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(i9, 0.0d);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 52:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(i9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 53:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(i9, E(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 54:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(i9, E(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 55:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(i9, D(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 56:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(i9, 0L);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 57:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(i9, 0);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 58:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(i9, true);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 59:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        Object object4 = unsafe.getObject(abstractMessageLite2, j);
                        i7 = (object4 instanceof ByteString ? CodedOutputStream.computeBytesSize(i9, (ByteString) object4) : CodedOutputStream.computeStringSize(i9, (String) object4)) + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 60:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        Object object5 = unsafe.getObject(abstractMessageLite2, j);
                        vsg q5 = y1Var.q(i5);
                        Class cls21 = i2.a;
                        computeDoubleSize = object5 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) object5) : CodedOutputStream.computeMessageSize(i9, (MessageLite) object5, q5);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 61:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(i9, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 62:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(i9, D(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 63:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(i9, D(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 64:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(i9, 0);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 65:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(i9, 0L);
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 66:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(i9, D(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 67:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(i9, E(abstractMessageLite2, j));
                        i7 = computeDoubleSize + i12;
                        break;
                    }
                    i7 = i12;
                    break;
                case 68:
                    if (y1Var.v(i9, i5, abstractMessageLite2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(i9, (MessageLite) unsafe.getObject(abstractMessageLite2, j), y1Var.q(i5));
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
            abstractMessageLite2 = abstractMessageLite;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        r14.c(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0868 A[Catch: all -> 0x086f, TryCatch #10 {all -> 0x086f, blocks: (B:45:0x0863, B:47:0x0868, B:49:0x0872), top: B:44:0x0863 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x08aa A[LOOP:3: B:66:0x08a8->B:67:0x08aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x08b9  */
    @Override // defpackage.vsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, s sVar, ExtensionRegistryLite extensionRegistryLite) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        Object obj4;
        Object obj5;
        t2 t2Var;
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber;
        t2 t2Var2;
        ExtensionRegistryLite extensionRegistryLite2;
        Object obj6;
        d1 d1Var;
        y1 y1Var;
        s sVar2;
        int Q;
        r1 r1Var;
        Object obj7;
        int readEnum;
        Internal.EnumVerifier o;
        t2 t2Var3;
        y1 y1Var2 = this;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        extensionRegistryLite3.getClass();
        l(obj);
        t2 t2Var4 = y1Var2.n;
        int[] iArr = y1Var2.i;
        int i3 = y1Var2.k;
        int i4 = y1Var2.j;
        Object obj8 = null;
        d1 d1Var2 = null;
        while (true) {
            try {
                int a = sVar.a();
                try {
                    int N = (a < y1Var2.c || a > y1Var2.d) ? -1 : y1Var2.N(a, 0);
                    if (N >= 0) {
                        obj5 = obj;
                        t2Var = t2Var4;
                        obj4 = obj8;
                        ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite3;
                        try {
                            int R = y1Var2.R(N);
                            try {
                                Q = Q(R);
                                r1Var = y1Var2.m;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                obj2 = obj5;
                                i = i4;
                                d1Var = d1Var2;
                                y1Var = y1Var2;
                                sVar2 = sVar;
                            } catch (Throwable th) {
                                th = th;
                                obj2 = obj5;
                                i = i4;
                            }
                            switch (Q) {
                                case 0:
                                    i = i4;
                                    d1Var = d1Var2;
                                    y1Var = y1Var2;
                                    sVar2 = sVar;
                                    long C = C(R);
                                    sVar2.x(1);
                                    obj7 = obj5;
                                    try {
                                        uck.c.j(obj7, C, sVar2.a.readDouble());
                                        y1Var.L(N, obj7);
                                        obj8 = obj4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        obj2 = obj7;
                                        obj8 = obj4;
                                        try {
                                            t2Var.getClass();
                                            if (obj8 == null) {
                                            }
                                            if (!t2Var.b(0, sVar2, obj8)) {
                                            }
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            t2Var4 = t2Var;
                                            obj3 = obj8;
                                            while (i2 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj7;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 1:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C2 = C(R);
                                    sVar.x(5);
                                    uck.c.k(obj5, C2, sVar.a.readFloat());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 2:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C3 = C(R);
                                    sVar.x(0);
                                    uck.q(obj5, C3, sVar.a.readInt64());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 3:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C4 = C(R);
                                    sVar.x(0);
                                    uck.q(obj5, C4, sVar.a.readUInt64());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 4:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C5 = C(R);
                                    sVar.x(0);
                                    uck.p(sVar.a.readInt32(), C5, obj5);
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 5:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C6 = C(R);
                                    sVar.x(1);
                                    uck.q(obj5, C6, sVar.a.readFixed64());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 6:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C7 = C(R);
                                    sVar.x(5);
                                    uck.p(sVar.a.readFixed32(), C7, obj5);
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 7:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C8 = C(R);
                                    sVar.x(0);
                                    uck.c.g(obj5, C8, sVar.a.readBool());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 8:
                                    i = i4;
                                    d1Var = d1Var2;
                                    y1 y1Var3 = y1Var2;
                                    y1Var3.I(R, sVar, obj5);
                                    y1Var3.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 9:
                                    i = i4;
                                    d1Var = d1Var2;
                                    y1 y1Var4 = y1Var2;
                                    MessageLite messageLite = (MessageLite) y1Var4.z(N, obj5);
                                    vsg q2 = y1Var4.q(N);
                                    sVar.x(2);
                                    sVar.c(messageLite, q2, extensionRegistryLite4);
                                    y1Var4.O(N, obj5, messageLite);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 10:
                                    i = i4;
                                    d1Var = d1Var2;
                                    uck.r(C(R), obj5, sVar.e());
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 11:
                                    i = i4;
                                    d1Var = d1Var2;
                                    long C9 = C(R);
                                    sVar.x(0);
                                    uck.p(sVar.a.readUInt32(), C9, obj5);
                                    y1Var2.L(N, obj5);
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 12:
                                    y1Var = y1Var2;
                                    obj2 = obj5;
                                    i = i4;
                                    sVar2 = sVar;
                                    try {
                                        try {
                                            sVar2.x(0);
                                            readEnum = sVar2.a.readEnum();
                                            o = y1Var.o(N);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            t2Var = t2Var;
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                            t2Var.getClass();
                                            if (obj8 == null) {
                                                obj8 = t2Var.a(obj2);
                                            }
                                            if (!t2Var.b(0, sVar2, obj8)) {
                                                Object obj9 = obj8;
                                                int i5 = i;
                                                while (i5 < i3) {
                                                    obj9 = y1Var.n(obj2, iArr[i5], obj9, t2Var, obj);
                                                    i5++;
                                                    y1Var = this;
                                                }
                                                t2 t2Var5 = t2Var;
                                                if (obj9 != null) {
                                                    t2Var5.c(obj2, obj9);
                                                    return;
                                                }
                                                return;
                                            }
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        }
                                        if (o == null || o.isInRange(readEnum)) {
                                            t2Var = t2Var;
                                            d1Var = d1Var2;
                                            try {
                                                uck.p(readEnum, C(R), obj2);
                                                y1Var.L(N, obj2);
                                                obj8 = obj4;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                                obj8 = obj4;
                                                t2Var.getClass();
                                                if (obj8 == null) {
                                                }
                                                if (!t2Var.b(0, sVar2, obj8)) {
                                                }
                                                t2Var4 = t2Var;
                                                y1Var2 = this;
                                                extensionRegistryLite3 = extensionRegistryLite;
                                                d1Var2 = d1Var;
                                                i4 = i;
                                            }
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        } else {
                                            t2Var = t2Var;
                                            obj8 = i2.n(obj2, a, readEnum, obj4, t2Var);
                                            d1Var = d1Var2;
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        t2Var = t2Var;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 13:
                                    i = i4;
                                    t2Var3 = t2Var;
                                    long C10 = C(R);
                                    sVar.x(5);
                                    uck.p(sVar.a.readSFixed32(), C10, obj5);
                                    y1Var2.L(N, obj5);
                                    t2Var = t2Var3;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 14:
                                    i = i4;
                                    t2Var3 = t2Var;
                                    long C11 = C(R);
                                    sVar.x(1);
                                    uck.q(obj5, C11, sVar.a.readSFixed64());
                                    y1Var2.L(N, obj5);
                                    t2Var = t2Var3;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 15:
                                    i = i4;
                                    t2Var3 = t2Var;
                                    long C12 = C(R);
                                    sVar.x(0);
                                    uck.p(sVar.a.readSInt32(), C12, obj5);
                                    y1Var2.L(N, obj5);
                                    t2Var = t2Var3;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 16:
                                    obj2 = obj5;
                                    i = i4;
                                    y1Var = y1Var2;
                                    sVar2 = sVar;
                                    try {
                                        long C13 = C(R);
                                        try {
                                            sVar2.x(0);
                                            t2Var3 = t2Var;
                                            try {
                                                try {
                                                    uck.q(obj2, C13, sVar2.a.readSInt64());
                                                    y1Var.L(N, obj2);
                                                    t2Var = t2Var3;
                                                    d1Var = d1Var2;
                                                    obj8 = obj4;
                                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                                    t2Var = t2Var3;
                                                    d1Var = d1Var2;
                                                    obj8 = obj4;
                                                    t2Var.getClass();
                                                    if (obj8 == null) {
                                                    }
                                                    if (!t2Var.b(0, sVar2, obj8)) {
                                                    }
                                                    t2Var4 = t2Var;
                                                    y1Var2 = this;
                                                    extensionRegistryLite3 = extensionRegistryLite;
                                                    d1Var2 = d1Var;
                                                    i4 = i;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                t2Var4 = t2Var3;
                                                obj8 = obj4;
                                                obj3 = obj8;
                                                while (i2 < i3) {
                                                }
                                                if (obj3 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                            t2Var3 = t2Var;
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        t2Var3 = t2Var;
                                    }
                                    break;
                                case 17:
                                    i = i4;
                                    y1 y1Var5 = y1Var2;
                                    MessageLite messageLite2 = (MessageLite) y1Var5.z(N, obj5);
                                    vsg q3 = y1Var5.q(N);
                                    sVar.x(3);
                                    sVar.b(messageLite2, q3, extensionRegistryLite4);
                                    y1Var5.O(N, obj5, messageLite2);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 18:
                                    i = i4;
                                    sVar.g(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 19:
                                    i = i4;
                                    sVar.l(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 20:
                                    i = i4;
                                    sVar.n(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 21:
                                    i = i4;
                                    sVar.v(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 22:
                                    i = i4;
                                    sVar.m(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 23:
                                    i = i4;
                                    sVar.k(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 24:
                                    i = i4;
                                    sVar.j(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 25:
                                    i = i4;
                                    sVar.d(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 26:
                                    i = i4;
                                    y1Var2.J(R, sVar, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 27:
                                    obj2 = obj5;
                                    i = i4;
                                    y1Var = y1Var2;
                                    sVar2 = sVar;
                                    try {
                                        y1Var2.H(obj2, R, sVar, y1Var.q(N), extensionRegistryLite);
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        y1Var = y1Var2;
                                        sVar2 = sVar;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 28:
                                    i = i4;
                                    sVar.f(r1Var.c(obj5, C(R)));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 29:
                                    obj2 = obj5;
                                    i = i4;
                                    y1Var = y1Var2;
                                    sVar2 = sVar;
                                    try {
                                        try {
                                            sVar2.u(r1Var.c(obj2, C(R)));
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            t2Var4 = t2Var;
                                            obj8 = obj4;
                                            obj3 = obj8;
                                            for (i2 = i; i2 < i3; i2++) {
                                                obj3 = n(obj2, iArr[i2], obj3, t2Var4, obj);
                                            }
                                            if (obj3 != null) {
                                                t2Var4.c(obj2, obj3);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 30:
                                    y1 y1Var6 = y1Var2;
                                    obj2 = obj5;
                                    i = i4;
                                    t2Var4 = t2Var;
                                    try {
                                        List c = r1Var.c(obj2, C(R));
                                        sVar.h(c);
                                        try {
                                            t2Var = t2Var4;
                                            obj8 = i2.k(obj2, a, c, y1Var6.o(N), obj4, t2Var4);
                                            d1Var = d1Var2;
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            obj2 = obj2;
                                            obj4 = obj4;
                                            t2Var = t2Var4;
                                            t2Var4 = t2Var;
                                            obj8 = obj4;
                                            obj3 = obj8;
                                            while (i2 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 31:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.p(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 32:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.q(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 33:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.r(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 34:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.s(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 35:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.g(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 36:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.l(r1Var.c(obj5, C(R)));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 37:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.n(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 38:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.v(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 39:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.m(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 40:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.k(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 41:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.j(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 42:
                                    i = i4;
                                    t2Var4 = t2Var;
                                    sVar.d(r1Var.c(obj5, R & 1048575));
                                    t2Var = t2Var4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 43:
                                    obj2 = obj5;
                                    i = i4;
                                    t2Var4 = t2Var;
                                    y1Var = y1Var2;
                                    sVar2 = sVar;
                                    try {
                                        try {
                                            sVar2.u(r1Var.c(obj2, R & 1048575));
                                            t2Var = t2Var4;
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                            t2Var = t2Var4;
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                            t2Var.getClass();
                                            if (obj8 == null) {
                                            }
                                            if (!t2Var.b(0, sVar2, obj8)) {
                                            }
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 44:
                                    y1Var = y1Var2;
                                    i = i4;
                                    sVar2 = sVar;
                                    List c2 = r1Var.c(obj5, R & 1048575);
                                    sVar2.h(c2);
                                    try {
                                        try {
                                            obj8 = i2.k(obj5, a, c2, y1Var.o(N), obj4, t2Var);
                                            t2Var = t2Var;
                                            d1Var = d1Var2;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            obj2 = obj5;
                                            obj4 = obj4;
                                            t2Var4 = t2Var;
                                            obj8 = obj4;
                                            obj3 = obj8;
                                            while (i2 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                        obj4 = obj4;
                                        obj2 = obj5;
                                        t2Var = t2Var;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 45:
                                    obj7 = obj5;
                                    i = i4;
                                    sVar.p(r1Var.c(obj7, R & 1048575));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 46:
                                    obj7 = obj5;
                                    i = i4;
                                    sVar.q(r1Var.c(obj7, R & 1048575));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 47:
                                    obj7 = obj5;
                                    i = i4;
                                    sVar.r(r1Var.c(obj7, R & 1048575));
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 48:
                                    y1Var = y1Var2;
                                    obj7 = obj5;
                                    i = i4;
                                    sVar2 = sVar;
                                    try {
                                        sVar2.s(r1Var.c(obj7, R & 1048575));
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                        obj2 = obj7;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj7;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 49:
                                    i = i4;
                                    try {
                                        obj2 = obj;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj7 = obj;
                                        obj2 = obj7;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        y1Var2.G(obj2, R & 1048575, sVar, y1Var2.q(N), extensionRegistryLite);
                                        obj7 = obj2;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                        y1Var = y1Var2;
                                        sVar2 = sVar;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 50:
                                    i = i4;
                                    try {
                                        try {
                                            y1Var2.w(obj5, N, y1Var2.p(N), extensionRegistryLite4, sVar);
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            obj2 = obj;
                                            t2Var4 = t2Var;
                                            obj8 = obj4;
                                            obj3 = obj8;
                                            while (i2 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                                        obj2 = obj;
                                        sVar2 = sVar;
                                        y1Var = y1Var2;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 51:
                                    i = i4;
                                    sVar.x(1);
                                    uck.r(R & 1048575, obj5, Double.valueOf(sVar.a.readDouble()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 52:
                                    i = i4;
                                    sVar.x(5);
                                    uck.r(R & 1048575, obj5, Float.valueOf(sVar.a.readFloat()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 53:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Long.valueOf(sVar.a.readInt64()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 54:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Long.valueOf(sVar.a.readUInt64()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 55:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Integer.valueOf(sVar.a.readInt32()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 56:
                                    i = i4;
                                    sVar.x(1);
                                    uck.r(R & 1048575, obj5, Long.valueOf(sVar.a.readFixed64()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 57:
                                    i = i4;
                                    sVar.x(5);
                                    uck.r(R & 1048575, obj5, Integer.valueOf(sVar.a.readFixed32()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 58:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Boolean.valueOf(sVar.a.readBool()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 59:
                                    i = i4;
                                    y1Var2.I(R, sVar, obj5);
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 60:
                                    i = i4;
                                    MessageLite messageLite3 = (MessageLite) y1Var2.A(a, N, obj5);
                                    vsg q4 = y1Var2.q(N);
                                    sVar.x(2);
                                    sVar.c(messageLite3, q4, extensionRegistryLite4);
                                    y1Var2.P(a, obj5, messageLite3, N);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 61:
                                    i = i4;
                                    uck.r(R & 1048575, obj5, sVar.e());
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 62:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Integer.valueOf(sVar.a.readUInt32()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 63:
                                    i = i4;
                                    sVar.x(0);
                                    int readEnum2 = sVar.a.readEnum();
                                    Internal.EnumVerifier o2 = y1Var2.o(N);
                                    if (o2 != null && !o2.isInRange(readEnum2)) {
                                        obj8 = i2.n(obj5, a, readEnum2, obj4, t2Var);
                                        d1Var = d1Var2;
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    }
                                    uck.r(R & 1048575, obj5, Integer.valueOf(readEnum2));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 64:
                                    i = i4;
                                    sVar.x(5);
                                    uck.r(R & 1048575, obj5, Integer.valueOf(sVar.a.readSFixed32()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 65:
                                    i = i4;
                                    sVar.x(1);
                                    uck.r(R & 1048575, obj5, Long.valueOf(sVar.a.readSFixed64()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 66:
                                    i = i4;
                                    sVar.x(0);
                                    uck.r(R & 1048575, obj5, Integer.valueOf(sVar.a.readSInt32()));
                                    y1Var2.M(a, N, obj5);
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                case 67:
                                    i = i4;
                                    long j = R & 1048575;
                                    try {
                                        sVar.x(0);
                                        uck.r(j, obj5, Long.valueOf(sVar.a.readSInt64()));
                                        y1Var2.M(a, N, obj5);
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused14) {
                                        sVar2 = sVar;
                                        obj2 = obj5;
                                        d1Var = d1Var2;
                                        obj8 = obj4;
                                        y1Var = y1Var2;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        obj2 = obj5;
                                        t2Var4 = t2Var;
                                        obj8 = obj4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                    break;
                                case 68:
                                    MessageLite messageLite4 = (MessageLite) y1Var2.A(a, N, obj5);
                                    vsg q5 = y1Var2.q(N);
                                    sVar.x(3);
                                    sVar.b(messageLite4, q5, extensionRegistryLite4);
                                    y1Var2.P(a, obj5, messageLite4, N);
                                    i = i4;
                                    d1Var = d1Var2;
                                    obj8 = obj4;
                                    t2Var4 = t2Var;
                                    y1Var2 = this;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    d1Var2 = d1Var;
                                    i4 = i;
                                default:
                                    if (obj4 == null) {
                                        try {
                                            obj8 = t2Var.a(obj5);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused15) {
                                            obj2 = obj5;
                                            i = i4;
                                            d1Var = d1Var2;
                                            obj8 = obj4;
                                            y1Var = y1Var2;
                                            sVar2 = sVar;
                                            t2Var.getClass();
                                            if (obj8 == null) {
                                            }
                                            if (!t2Var.b(0, sVar2, obj8)) {
                                            }
                                            t2Var4 = t2Var;
                                            y1Var2 = this;
                                            extensionRegistryLite3 = extensionRegistryLite;
                                            d1Var2 = d1Var;
                                            i4 = i;
                                        }
                                    } else {
                                        obj8 = obj4;
                                    }
                                    try {
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused16) {
                                        obj2 = obj5;
                                        i = i4;
                                        d1Var = d1Var2;
                                        y1Var = y1Var2;
                                        sVar2 = sVar;
                                        t2Var.getClass();
                                        if (obj8 == null) {
                                        }
                                        if (!t2Var.b(0, sVar2, obj8)) {
                                        }
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        obj2 = obj5;
                                        i = i4;
                                        t2Var4 = t2Var;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    if (t2Var.b(0, sVar, obj8)) {
                                        i = i4;
                                        d1Var = d1Var2;
                                        t2Var4 = t2Var;
                                        y1Var2 = this;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        d1Var2 = d1Var;
                                        i4 = i;
                                    } else {
                                        obj6 = obj8;
                                        while (i4 < i3) {
                                            obj6 = y1Var2.n(obj5, iArr[i4], obj6, t2Var, obj);
                                            i4++;
                                        }
                                        if (obj6 == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (Throwable th19) {
                            th = th19;
                            obj2 = obj5;
                            i = i4;
                            t2Var4 = t2Var;
                            obj8 = obj4;
                            obj3 = obj8;
                            while (i2 < i3) {
                            }
                            if (obj3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        if (a == Integer.MAX_VALUE) {
                            Object obj10 = obj8;
                            while (i4 < i3) {
                                obj10 = y1Var2.n(obj, iArr[i4], obj10, t2Var4, obj);
                                i4++;
                                y1Var2 = y1Var2;
                            }
                            if (obj10 != null) {
                                t2Var4.c(obj, obj10);
                                return;
                            }
                            return;
                        }
                        y1 y1Var7 = y1Var2;
                        try {
                            boolean z = y1Var7.f;
                            pk6 pk6Var = y1Var7.o;
                            if (z) {
                                MessageLite messageLite5 = y1Var7.e;
                                try {
                                    ((u0) pk6Var).getClass();
                                    findLiteExtensionByNumber = extensionRegistryLite3.findLiteExtensionByNumber(messageLite5, a);
                                } catch (Throwable th20) {
                                    th = th20;
                                    obj5 = obj;
                                    obj4 = obj8;
                                    t2Var = t2Var4;
                                    obj2 = obj5;
                                    i = i4;
                                    t2Var4 = t2Var;
                                    obj8 = obj4;
                                    obj3 = obj8;
                                    while (i2 < i3) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                findLiteExtensionByNumber = null;
                            }
                            if (findLiteExtensionByNumber != null) {
                                if (d1Var2 == null) {
                                    try {
                                        ((u0) pk6Var).getClass();
                                        d1Var2 = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
                                    } catch (Throwable th21) {
                                        th = th21;
                                        obj2 = obj;
                                        i = i4;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                t2Var2 = t2Var4;
                                d1 d1Var3 = d1Var2;
                                try {
                                    obj8 = pk6Var.a(obj, sVar, findLiteExtensionByNumber, extensionRegistryLite3, d1Var3, obj8, t2Var2);
                                    d1Var2 = d1Var3;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                } catch (Throwable th22) {
                                    th = th22;
                                    obj2 = obj;
                                    t2Var4 = t2Var2;
                                    i = i4;
                                    obj3 = obj8;
                                    while (i2 < i3) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                obj2 = obj;
                                t2Var2 = t2Var4;
                                obj4 = obj8;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                try {
                                    t2Var2.getClass();
                                    if (obj4 == null) {
                                        try {
                                            obj8 = t2Var2.a(obj2);
                                        } catch (Throwable th23) {
                                            th = th23;
                                            t2Var4 = t2Var2;
                                            i = i4;
                                            obj8 = obj4;
                                            obj3 = obj8;
                                            while (i2 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        obj8 = obj4;
                                    }
                                    try {
                                        if (!t2Var2.b(0, sVar, obj8)) {
                                            obj6 = obj8;
                                            while (i4 < i3) {
                                                t2 t2Var6 = t2Var2;
                                                y1 y1Var8 = y1Var7;
                                                obj6 = y1Var8.n(obj2, iArr[i4], obj6, t2Var6, obj);
                                                i4++;
                                                t2Var2 = t2Var6;
                                                y1Var7 = y1Var8;
                                            }
                                            t2Var = t2Var2;
                                            obj5 = obj2;
                                            if (obj6 == null) {
                                                return;
                                            }
                                        }
                                    } catch (Throwable th24) {
                                        th = th24;
                                        t2Var = t2Var2;
                                        i = i4;
                                        t2Var4 = t2Var;
                                        obj3 = obj8;
                                        while (i2 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th25) {
                                    th = th25;
                                    t2Var = t2Var2;
                                    i = i4;
                                    t2Var4 = t2Var;
                                    obj8 = obj4;
                                    obj3 = obj8;
                                    while (i2 < i3) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            }
                            extensionRegistryLite3 = extensionRegistryLite2;
                            t2Var4 = t2Var2;
                            y1Var2 = y1Var7;
                        } catch (Throwable th26) {
                            th = th26;
                            obj2 = obj;
                        }
                    }
                } catch (Throwable th27) {
                    th = th27;
                    obj2 = obj;
                    obj4 = obj8;
                }
            } catch (Throwable th28) {
                th = th28;
                obj2 = obj;
            }
        }
    }

    @Override // defpackage.vsg
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int i;
        int hashLong;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int R = R(i3);
            int i4 = iArr[i3];
            long j = 1048575 & R;
            int i5 = 37;
            switch (Q(R)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(uck.c.e(generatedMessageLite, j)));
                    i2 = hashLong + i;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(uck.c.f(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(uck.i(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(uck.i(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(uck.i(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(uck.c.c(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) uck.j(generatedMessageLite, j)).hashCode();
                    i2 = hashLong + i;
                    break;
                case 9:
                    Object j2 = uck.j(generatedMessageLite, j);
                    if (j2 != null) {
                        i5 = j2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = uck.j(generatedMessageLite, j).hashCode();
                    i2 = hashLong + i;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(uck.i(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = uck.h(generatedMessageLite, j);
                    i2 = hashLong + i;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(uck.i(generatedMessageLite, j));
                    i2 = hashLong + i;
                    break;
                case 17:
                    Object j3 = uck.j(generatedMessageLite, j);
                    if (j3 != null) {
                        i5 = j3.hashCode();
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
                    hashLong = uck.j(generatedMessageLite, j).hashCode();
                    i2 = hashLong + i;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = uck.j(generatedMessageLite, j).hashCode();
                    i2 = hashLong + i;
                    break;
                case 51:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(((Double) uck.j(generatedMessageLite, j)).doubleValue()));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(((Float) uck.j(generatedMessageLite, j)).floatValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(generatedMessageLite, j));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(generatedMessageLite, j));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(generatedMessageLite, j));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(((Boolean) uck.j(generatedMessageLite, j)).booleanValue());
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = ((String) uck.j(generatedMessageLite, j)).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = uck.j(generatedMessageLite, j).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = uck.j(generatedMessageLite, j).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(generatedMessageLite, j));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = D(generatedMessageLite, j);
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(E(generatedMessageLite, j));
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        hashLong = uck.j(generatedMessageLite, j).hashCode();
                        i2 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((u2) this.n).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i2 * 53);
        if (!this.f) {
            return hashCode;
        }
        ((u0) this.o).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.google.protobuf.i2.m(defpackage.uck.j(r12, r7), defpackage.uck.j(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.uck.i(r12, r7) == defpackage.uck.i(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.uck.i(r12, r7) == defpackage.uck.i(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.google.protobuf.i2.m(defpackage.uck.j(r12, r7), defpackage.uck.j(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.google.protobuf.i2.m(defpackage.uck.j(r12, r7), defpackage.uck.j(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.google.protobuf.i2.m(defpackage.uck.j(r12, r7), defpackage.uck.j(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (defpackage.uck.i(r12, r7) == defpackage.uck.i(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (defpackage.uck.h(r12, r7) == defpackage.uck.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (defpackage.uck.i(r12, r7) == defpackage.uck.i(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (defpackage.uck.i(r12, r7) == defpackage.uck.i(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (com.google.protobuf.i2.m(defpackage.uck.j(r12, r7), defpackage.uck.j(r13, r7)) != false) goto L105;
     */
    @Override // defpackage.vsg
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
                int R = R(i);
                long j = R & 1048575;
                switch (Q(R)) {
                    case 0:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            sck sckVar = uck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            sck sckVar2 = uck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            sck sckVar3 = uck.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
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
                        z = i2.m(uck.j(generatedMessageLite, j), uck.j(generatedMessageLite2, j));
                        break;
                    case 50:
                        z = i2.m(uck.j(generatedMessageLite, j), uck.j(generatedMessageLite2, j));
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
                        if (uck.h(generatedMessageLite, j2) == uck.h(generatedMessageLite2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                u2 u2Var = (u2) this.n;
                u2Var.getClass();
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                u2Var.getClass();
                if (unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
                    if (!this.f) {
                        return true;
                    }
                    u0 u0Var = (u0) this.o;
                    u0Var.getClass();
                    d1 d1Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
                    u0Var.getClass();
                    return d1Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
                }
            }
        }
        return false;
    }

    @Override // defpackage.vsg
    public final void j(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        F(obj, bArr, i, i2, 0, tg0Var);
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return t(i, generatedMessageLite) == t(i, generatedMessageLite2);
    }

    public final Object n(Object obj, int i, Object obj2, t2 t2Var, Object obj3) {
        Internal.EnumVerifier o;
        int i2 = this.a[i];
        Object j = uck.j(obj, R(i) & 1048575);
        if (j == null || (o = o(i)) == null) {
            return obj2;
        }
        this.p.getClass();
        v1 metadata = ((MapEntryLite) p(i)).getMetadata();
        Iterator it = ((MapFieldLite) j).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = t2Var.a(obj3);
                }
                bc2 newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.a, metadata, entry.getKey(), entry.getValue());
                    newCodedBuilder.a.checkNoSpaceLeft();
                    dc2 dc2Var = new dc2(newCodedBuilder.b);
                    ((u2) t2Var).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i2, 2), dc2Var);
                    it.remove();
                } catch (IOException e) {
                    is8.h(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier o(int i) {
        return (Internal.EnumVerifier) this.b[lnb.d(i, 3, 2, 1)];
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final vsg q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        vsg vsgVar = (vsg) objArr[i2];
        if (vsgVar != null) {
            return vsgVar;
        }
        vsg a = jff.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean s(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? t(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int R = R(i);
            long j2 = R & 1048575;
            switch (Q(R)) {
                case 0:
                    return Double.doubleToRawLongBits(uck.c.e(obj, j2)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(uck.c.f(obj, j2)) != 0) {
                    }
                    break;
                case 2:
                    if (uck.i(obj, j2) != 0) {
                    }
                    break;
                case 3:
                    if (uck.i(obj, j2) != 0) {
                    }
                    break;
                case 4:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 5:
                    if (uck.i(obj, j2) != 0) {
                    }
                    break;
                case 6:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 7:
                    return uck.c.c(obj, j2);
                case 8:
                    Object j3 = uck.j(obj, j2);
                    if (j3 instanceof String) {
                        return !((String) j3).isEmpty();
                    }
                    if (j3 instanceof ByteString) {
                        return !ByteString.EMPTY.equals(j3);
                    }
                    ilg.c();
                    return false;
                case 9:
                    if (uck.j(obj, j2) != null) {
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(uck.j(obj, j2));
                case 11:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 12:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 13:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 14:
                    if (uck.i(obj, j2) != 0) {
                    }
                    break;
                case 15:
                    if (uck.h(obj, j2) != 0) {
                    }
                    break;
                case 16:
                    if (uck.i(obj, j2) != 0) {
                    }
                    break;
                case 17:
                    if (uck.j(obj, j2) != null) {
                    }
                    break;
                default:
                    ilg.c();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & uck.h(obj, j)) != 0) {
        }
    }

    public final boolean v(int i, int i2, Object obj) {
        return uck.h(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.popLimit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, s sVar) {
        long R = R(i) & 1048575;
        Object j = uck.j(obj, R);
        ytb ytbVar = this.p;
        if (j == null) {
            ytbVar.getClass();
            j = MapFieldLite.emptyMapField().mutableCopy();
            uck.r(R, obj, j);
        } else {
            ytbVar.getClass();
            if (!((MapFieldLite) j).isMutable()) {
                Object mutableCopy = MapFieldLite.emptyMapField().mutableCopy();
                ytb.a(mutableCopy, j);
                uck.r(R, obj, mutableCopy);
                j = mutableCopy;
            }
        }
        ytbVar.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) j;
        v1 metadata = ((MapEntryLite) obj2).getMetadata();
        sVar.x(2);
        CodedInputStream codedInputStream = sVar.a;
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readUInt32());
        Object obj3 = metadata.b;
        Object obj4 = metadata.d;
        Object obj5 = obj4;
        while (true) {
            try {
                int a = sVar.a();
                if (a == Integer.MAX_VALUE || codedInputStream.isAtEnd()) {
                    break;
                }
                if (a == 1) {
                    obj3 = sVar.i(metadata.a, null, null);
                } else if (a != 2) {
                    try {
                        if (!sVar.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!sVar.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = sVar.i(metadata.c, obj4.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                codedInputStream.popLimit(pushLimit);
                throw th;
            }
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        if (t(i, obj2)) {
            long R = R(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, R);
            if (object == null) {
                ilg.d(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            vsg q2 = q(i);
            if (!t(i, obj)) {
                if (u(object)) {
                    Object d = q2.d();
                    q2.a(d, object);
                    unsafe.putObject(obj, R, d);
                } else {
                    unsafe.putObject(obj, R, object);
                }
                L(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, R);
            if (!u(object2)) {
                Object d2 = q2.d();
                q2.a(d2, object2);
                unsafe.putObject(obj, R, d2);
                object2 = d2;
            }
            q2.a(object2, object);
        }
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (v(i2, i, obj2)) {
            long R = R(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, R);
            if (object == null) {
                ilg.d(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            vsg q2 = q(i);
            if (!v(i2, i, obj)) {
                if (u(object)) {
                    Object d = q2.d();
                    q2.a(d, object);
                    unsafe.putObject(obj, R, d);
                } else {
                    unsafe.putObject(obj, R, object);
                }
                M(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, R);
            if (!u(object2)) {
                Object d2 = q2.d();
                q2.a(d2, object2);
                unsafe.putObject(obj, R, d2);
                object2 = d2;
            }
            q2.a(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        vsg q2 = q(i);
        long R = R(i) & 1048575;
        if (!t(i, obj)) {
            return q2.d();
        }
        Object object = r.getObject(obj, R);
        if (u(object)) {
            return object;
        }
        Object d = q2.d();
        if (object != null) {
            q2.a(d, object);
        }
        return d;
    }
}
