package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.play_billing.d;
import com.google.android.gms.internal.play_billing.e;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.zzgp;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zno {
    public static final zno b = new zno();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:101:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x046f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qoo a(Class cls) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt;
        int i15;
        int i16;
        char charAt2;
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
        qoo dVar;
        int i22;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int objectFieldOffset;
        int i26;
        Class<?> cls2;
        String str;
        int i27;
        int i28;
        int i29;
        Field C;
        int i30;
        int i31;
        char charAt8;
        int i32;
        int i33;
        int i34;
        int i35;
        Field C2;
        Field C3;
        int i36;
        char charAt9;
        int i37;
        int i38;
        char charAt10;
        int i39;
        int i40;
        char charAt11;
        int i41;
        char charAt12;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (qoo) obj;
        }
        dff dffVar = v9g.i;
        jpe jpeVar = f.a;
        if (!zzgp.class.isAssignableFrom(cls)) {
            int i42 = o7o.a;
        }
        int i43 = o7o.a;
        if (!zzgp.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            loo looVar = (loo) zzgp.l(cls.asSubclass(zzgp.class)).i(3);
            int i44 = 0;
            if ((looVar.d & 2) == 2) {
                dVar = new e(f.a, looVar.a);
            } else {
                jpe jpeVar2 = f.a;
                dff dffVar2 = looVar.a() + (-1) != 1 ? dffVar : null;
                Unsafe unsafe = d.k;
                if (unsafe == null) {
                    cp4.h("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                    return null;
                }
                if (!(looVar instanceof loo)) {
                    pvd.j();
                    return null;
                }
                String str2 = looVar.b;
                int length = str2.length();
                if (str2.charAt(0) >= 55296) {
                    int i45 = 1;
                    while (true) {
                        i = i45 + 1;
                        if (str2.charAt(i45) < 55296) {
                            break;
                        }
                        i45 = i;
                    }
                } else {
                    i = 1;
                }
                int i46 = i + 1;
                int charAt13 = str2.charAt(i);
                if (charAt13 >= 55296) {
                    int i47 = charAt13 & 8191;
                    int i48 = 13;
                    while (true) {
                        i41 = i46 + 1;
                        charAt12 = str2.charAt(i46);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i47 |= (charAt12 & 8191) << i48;
                        i48 += 13;
                        i46 = i41;
                    }
                    charAt13 = i47 | (charAt12 << i48);
                    i46 = i41;
                }
                if (charAt13 == 0) {
                    iArr = d.j;
                    i4 = 3;
                    i12 = 0;
                    i8 = 0;
                    i11 = 0;
                    i10 = 0;
                    i9 = 0;
                    i13 = 0;
                } else {
                    int i49 = i46 + 1;
                    int charAt14 = str2.charAt(i46);
                    if (charAt14 >= 55296) {
                        int i50 = charAt14 & 8191;
                        int i51 = 13;
                        while (true) {
                            i21 = i49 + 1;
                            charAt7 = str2.charAt(i49);
                            if (charAt7 < 55296) {
                                break;
                            }
                            i50 |= (charAt7 & 8191) << i51;
                            i51 += 13;
                            i49 = i21;
                        }
                        charAt14 = i50 | (charAt7 << i51);
                        i49 = i21;
                    }
                    int i52 = i49 + 1;
                    int charAt15 = str2.charAt(i49);
                    if (charAt15 >= 55296) {
                        int i53 = charAt15 & 8191;
                        int i54 = 13;
                        while (true) {
                            i20 = i52 + 1;
                            charAt6 = str2.charAt(i52);
                            if (charAt6 < 55296) {
                                break;
                            }
                            i53 |= (charAt6 & 8191) << i54;
                            i54 += 13;
                            i52 = i20;
                        }
                        charAt15 = i53 | (charAt6 << i54);
                        i52 = i20;
                    }
                    int i55 = i52 + 1;
                    int charAt16 = str2.charAt(i52);
                    if (charAt16 >= 55296) {
                        int i56 = charAt16 & 8191;
                        int i57 = i55;
                        int i58 = 13;
                        while (true) {
                            i19 = i57 + 1;
                            charAt5 = str2.charAt(i57);
                            if (charAt5 < 55296) {
                                break;
                            }
                            i56 |= (charAt5 & 8191) << i58;
                            i58 += 13;
                            i57 = i19;
                        }
                        charAt16 = i56 | (charAt5 << i58);
                        i2 = i19;
                    } else {
                        i2 = i55;
                    }
                    int i59 = i2 + 1;
                    int charAt17 = str2.charAt(i2);
                    if (charAt17 >= 55296) {
                        int i60 = charAt17 & 8191;
                        int i61 = i59;
                        int i62 = 13;
                        while (true) {
                            i18 = i61 + 1;
                            charAt4 = str2.charAt(i61);
                            if (charAt4 < 55296) {
                                break;
                            }
                            i60 |= (charAt4 & 8191) << i62;
                            i62 += 13;
                            i61 = i18;
                        }
                        charAt17 = i60 | (charAt4 << i62);
                        i3 = i18;
                    } else {
                        i3 = i59;
                    }
                    int i63 = i3 + 1;
                    int charAt18 = str2.charAt(i3);
                    if (charAt18 >= 55296) {
                        int i64 = charAt18 & 8191;
                        i4 = 3;
                        int i65 = i63;
                        int i66 = 13;
                        while (true) {
                            i17 = i65 + 1;
                            charAt3 = str2.charAt(i65);
                            if (charAt3 < 55296) {
                                break;
                            }
                            i64 |= (charAt3 & 8191) << i66;
                            i66 += 13;
                            i65 = i17;
                        }
                        charAt18 = i64 | (charAt3 << i66);
                        i5 = i17;
                    } else {
                        i4 = 3;
                        i5 = i63;
                    }
                    int i67 = i5 + 1;
                    int charAt19 = str2.charAt(i5);
                    if (charAt19 >= 55296) {
                        int i68 = charAt19 & 8191;
                        int i69 = i67;
                        int i70 = 13;
                        while (true) {
                            i16 = i69 + 1;
                            charAt2 = str2.charAt(i69);
                            if (charAt2 < 55296) {
                                break;
                            }
                            i68 |= (charAt2 & 8191) << i70;
                            i70 += 13;
                            i69 = i16;
                        }
                        charAt19 = i68 | (charAt2 << i70);
                        i6 = i16;
                    } else {
                        i6 = i67;
                    }
                    int i71 = i6 + 1;
                    if (str2.charAt(i6) >= 55296) {
                        do {
                            i15 = i71;
                            i71 = i15 + 1;
                        } while (str2.charAt(i15) >= 55296);
                    }
                    int i72 = i71;
                    int i73 = i72 + 1;
                    int charAt20 = str2.charAt(i72);
                    if (charAt20 >= 55296) {
                        int i74 = charAt20 & 8191;
                        int i75 = i73;
                        int i76 = 13;
                        while (true) {
                            i14 = i75 + 1;
                            charAt = str2.charAt(i75);
                            i7 = charAt19;
                            if (charAt < 55296) {
                                break;
                            }
                            i74 |= (charAt & 8191) << i76;
                            i76 += 13;
                            i75 = i14;
                            charAt19 = i7;
                        }
                        charAt20 = i74 | (charAt << i76);
                        i73 = i14;
                    } else {
                        i7 = charAt19;
                    }
                    i8 = charAt14 + charAt14 + charAt15;
                    iArr = new int[charAt20 + i7 + charAt14];
                    int i77 = charAt17;
                    i44 = charAt14;
                    i46 = i73;
                    i9 = charAt16;
                    i10 = charAt18;
                    i11 = charAt20;
                    i12 = i77;
                    i13 = i7;
                }
                Object[] objArr = looVar.c;
                Class<?> cls3 = looVar.a.getClass();
                int i78 = i11 + i13;
                int i79 = i46;
                int i80 = i10 + i10;
                int[] iArr3 = new int[i10 * 3];
                Object[] objArr2 = new Object[i80];
                int i81 = i8;
                int i82 = i79;
                int i83 = i11;
                int i84 = i78;
                int i85 = 0;
                int i86 = 0;
                while (i82 < length) {
                    int i87 = i82 + 1;
                    int charAt21 = str2.charAt(i82);
                    int i88 = length;
                    if (charAt21 >= 55296) {
                        int i89 = charAt21 & 8191;
                        int i90 = i87;
                        int i91 = 13;
                        while (true) {
                            i40 = i90 + 1;
                            charAt11 = str2.charAt(i90);
                            i22 = i44;
                            if (charAt11 < 55296) {
                                break;
                            }
                            i89 |= (charAt11 & 8191) << i91;
                            i91 += 13;
                            i90 = i40;
                            i44 = i22;
                        }
                        charAt21 = i89 | (charAt11 << i91);
                        i23 = i40;
                    } else {
                        i22 = i44;
                        i23 = i87;
                    }
                    int i92 = i23 + 1;
                    int charAt22 = str2.charAt(i23);
                    if (charAt22 >= 55296) {
                        int i93 = charAt22 & 8191;
                        int i94 = i92;
                        int i95 = 13;
                        while (true) {
                            i38 = i94 + 1;
                            charAt10 = str2.charAt(i94);
                            i39 = i93;
                            if (charAt10 < 55296) {
                                break;
                            }
                            i93 = i39 | ((charAt10 & 8191) << i95);
                            i95 += 13;
                            i94 = i38;
                        }
                        charAt22 = i39 | (charAt10 << i95);
                        i24 = i38;
                    } else {
                        i24 = i92;
                    }
                    int i96 = i12;
                    if ((charAt22 & 1024) != 0) {
                        iArr[i86] = i85;
                        i86++;
                    }
                    int i97 = charAt22 & 255;
                    int i98 = charAt21;
                    int i99 = charAt22 & a.o;
                    if (i97 >= 51) {
                        int i100 = i24 + 1;
                        int charAt23 = str2.charAt(i24);
                        if (charAt23 >= 55296) {
                            int i101 = charAt23 & 8191;
                            int i102 = i100;
                            int i103 = 13;
                            while (true) {
                                i36 = i102 + 1;
                                charAt9 = str2.charAt(i102);
                                i37 = i101;
                                if (charAt9 < 55296) {
                                    break;
                                }
                                i101 = i37 | ((charAt9 & 8191) << i103);
                                i103 += 13;
                                i102 = i36;
                            }
                            charAt23 = i37 | (charAt9 << i103);
                            i34 = i36;
                        } else {
                            i34 = i100;
                        }
                        int i104 = charAt23;
                        int i105 = i97 - 51;
                        i27 = i34;
                        if (i105 == 9 || i105 == 17) {
                            objArr2[x5n.z(i85, i4, 1)] = objArr[i81];
                            i35 = i99;
                            i81++;
                        } else {
                            if (i105 == 12) {
                                if (looVar.a() == 1 || i99 != 0) {
                                    objArr2[x5n.z(i85, i4, 1)] = objArr[i81];
                                    i81++;
                                } else {
                                    i35 = 0;
                                }
                            }
                            i35 = i99;
                        }
                        int i106 = i104 + i104;
                        Object obj2 = objArr[i106];
                        int i107 = i35;
                        if (obj2 instanceof Field) {
                            C2 = (Field) obj2;
                        } else {
                            C2 = d.C(cls3, (String) obj2);
                            objArr[i106] = C2;
                            iArr[i84] = i85;
                            i84++;
                        }
                        iArr2 = iArr;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(C2);
                        int i108 = i106 + 1;
                        Object obj3 = objArr[i108];
                        if (obj3 instanceof Field) {
                            C3 = (Field) obj3;
                        } else {
                            C3 = d.C(cls3, (String) obj3);
                            objArr[i108] = C3;
                        }
                        cls2 = cls3;
                        str = str2;
                        i26 = (int) unsafe.objectFieldOffset(C3);
                        i25 = i11;
                        i28 = objectFieldOffset2;
                        i29 = i107;
                    } else {
                        iArr2 = iArr;
                        int i109 = i81 + 1;
                        Field C4 = d.C(cls3, (String) objArr[i81]);
                        if (i97 == 9 || i97 == 17) {
                            i25 = i11;
                            objArr2[x5n.z(i85, 3, 1)] = C4.getType();
                        } else {
                            if (i97 == 27) {
                                i25 = i11;
                                i32 = 3;
                                i33 = 1;
                                i81 += 2;
                            } else if (i97 == 49) {
                                i81 += 2;
                                i25 = i11;
                                i32 = 3;
                                i33 = 1;
                            } else {
                                if (i97 == 12 || i97 == 30 || i97 == 44) {
                                    i25 = i11;
                                    if (looVar.a() == 1 || i99 != 0) {
                                        i81 += 2;
                                        objArr2[x5n.z(i85, 3, 1)] = objArr[i109];
                                    } else {
                                        i81 = i109;
                                        i99 = 0;
                                    }
                                } else if (i97 == 50) {
                                    int i110 = i81 + 2;
                                    int i111 = i83 + 1;
                                    iArr2[i83] = i85;
                                    int i112 = i85 / 3;
                                    int i113 = i112 + i112;
                                    objArr2[i113] = objArr[i109];
                                    if (i99 != 0) {
                                        i81 += 3;
                                        objArr2[i113 + 1] = objArr[i110];
                                        i83 = i111;
                                    } else {
                                        i81 = i110;
                                        i83 = i111;
                                        i99 = 0;
                                    }
                                    i25 = i11;
                                } else {
                                    i25 = i11;
                                }
                                objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                                i26 = 1048575;
                                if ((charAt22 & 4096) != 0 || i97 > 17) {
                                    cls2 = cls3;
                                    str = str2;
                                    i27 = i24;
                                    i28 = objectFieldOffset;
                                    i29 = i99;
                                } else {
                                    int i114 = i24 + 1;
                                    int charAt24 = str2.charAt(i24);
                                    if (charAt24 >= 55296) {
                                        int i115 = charAt24 & 8191;
                                        int i116 = 13;
                                        while (true) {
                                            i31 = i114 + 1;
                                            charAt8 = str2.charAt(i114);
                                            if (charAt8 < 55296) {
                                                break;
                                            }
                                            i115 |= (charAt8 & 8191) << i116;
                                            i116 += 13;
                                            i114 = i31;
                                        }
                                        charAt24 = i115 | (charAt8 << i116);
                                        i114 = i31;
                                    }
                                    int i117 = (charAt24 / 32) + i22 + i22;
                                    Object obj4 = objArr[i117];
                                    str = str2;
                                    if (obj4 instanceof Field) {
                                        C = (Field) obj4;
                                    } else {
                                        C = d.C(cls3, (String) obj4);
                                        objArr[i117] = C;
                                    }
                                    cls2 = cls3;
                                    i26 = (int) unsafe.objectFieldOffset(C);
                                    i30 = charAt24 % 32;
                                    i28 = objectFieldOffset;
                                    i27 = i114;
                                    i29 = i99;
                                    int i118 = i85 + 1;
                                    iArr3[i85] = i98;
                                    int i119 = i85 + 2;
                                    iArr3[i118] = ((charAt22 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? 268435456 : 0) | ((charAt22 & 512) == 0 ? 536870912 : 0) | (i29 == 0 ? Integer.MIN_VALUE : 0) | (i97 << 20) | i28;
                                    i85 += 3;
                                    iArr3[i119] = (i30 << 20) | i26;
                                    cls3 = cls2;
                                    i12 = i96;
                                    length = i88;
                                    i44 = i22;
                                    i11 = i25;
                                    str2 = str;
                                    i82 = i27;
                                    iArr = iArr2;
                                    i4 = 3;
                                }
                            }
                            objArr2[x5n.z(i85, i32, i33)] = objArr[i109];
                            objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                            i26 = 1048575;
                            if ((charAt22 & 4096) != 0) {
                            }
                            cls2 = cls3;
                            str = str2;
                            i27 = i24;
                            i28 = objectFieldOffset;
                            i29 = i99;
                        }
                        i81 = i109;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                        i26 = 1048575;
                        if ((charAt22 & 4096) != 0) {
                        }
                        cls2 = cls3;
                        str = str2;
                        i27 = i24;
                        i28 = objectFieldOffset;
                        i29 = i99;
                    }
                    i30 = 0;
                    int i1182 = i85 + 1;
                    iArr3[i85] = i98;
                    int i1192 = i85 + 2;
                    if ((charAt22 & 512) == 0) {
                    }
                    if ((charAt22 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                    }
                    iArr3[i1182] = ((charAt22 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 ? 268435456 : 0) | ((charAt22 & 512) == 0 ? 536870912 : 0) | (i29 == 0 ? Integer.MIN_VALUE : 0) | (i97 << 20) | i28;
                    i85 += 3;
                    iArr3[i1192] = (i30 << 20) | i26;
                    cls3 = cls2;
                    i12 = i96;
                    length = i88;
                    i44 = i22;
                    i11 = i25;
                    str2 = str;
                    i82 = i27;
                    iArr = iArr2;
                    i4 = 3;
                }
                dVar = new d(iArr3, objArr2, i9, i12, looVar.a, iArr, i11, i78, jpeVar2, dffVar2);
            }
            qoo qooVar = (qoo) concurrentHashMap.putIfAbsent(cls, dVar);
            return qooVar != null ? qooVar : dVar;
        } catch (Exception e) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
