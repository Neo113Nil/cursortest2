package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.y;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzifm;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jqo {
    public static final jqo c = new jqo();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final hpo a = new hpo(3);

    public final nqo a(Class cls) {
        nqo wVar;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        char charAt5;
        int i5;
        int i6;
        char charAt6;
        int i7;
        char charAt7;
        int i8;
        char charAt8;
        int i9;
        char charAt9;
        int i10;
        char charAt10;
        int i11;
        char charAt11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field z;
        int i23;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Field z2;
        Field z3;
        int i30;
        char charAt13;
        int i31;
        int i32;
        char charAt14;
        int i33;
        int i34;
        char charAt15;
        int i35;
        int i36;
        char charAt16;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (nqo) obj;
        }
        wkf wkfVar = fqj.i;
        z zVar = y.a;
        if (!zzifm.class.isAssignableFrom(cls)) {
            int i37 = dpo.a;
        }
        int i38 = dpo.a;
        lqo b = ((d1l) this.a.a).b(cls);
        int i39 = 0;
        if ((b.d & 2) == 2) {
            wVar = new w(y.a, b.a);
        } else {
            int i40 = hqo.a;
            int i41 = bqo.a;
            z zVar2 = y.a;
            wkf wkfVar2 = b.a() + (-1) != 1 ? wkfVar : null;
            int i42 = dqo.a;
            int[] iArr2 = v.m;
            if (!(b instanceof lqo)) {
                pvd.j();
                return null;
            }
            String str2 = b.b;
            int length = str2.length();
            if (str2.charAt(0) >= 55296) {
                int i43 = 1;
                while (true) {
                    i = i43 + 1;
                    if (str2.charAt(i43) < 55296) {
                        break;
                    }
                    i43 = i;
                }
            } else {
                i = 1;
            }
            int i44 = i + 1;
            int charAt17 = str2.charAt(i);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i36 = i44 + 1;
                    charAt16 = str2.charAt(i44);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i45 |= (charAt16 & 8191) << i46;
                    i46 += 13;
                    i44 = i36;
                }
                charAt17 = i45 | (charAt16 << i46);
                i44 = i36;
            }
            if (charAt17 == 0) {
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                i2 = 0;
                iArr = v.m;
                i3 = 0;
            } else {
                int i47 = i44 + 1;
                int charAt18 = str2.charAt(i44);
                if (charAt18 >= 55296) {
                    int i48 = charAt18 & 8191;
                    int i49 = 13;
                    while (true) {
                        i11 = i47 + 1;
                        charAt11 = str2.charAt(i47);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i48 |= (charAt11 & 8191) << i49;
                        i49 += 13;
                        i47 = i11;
                    }
                    charAt18 = i48 | (charAt11 << i49);
                    i47 = i11;
                }
                int i50 = i47 + 1;
                int charAt19 = str2.charAt(i47);
                if (charAt19 >= 55296) {
                    int i51 = charAt19 & 8191;
                    int i52 = 13;
                    while (true) {
                        i10 = i50 + 1;
                        charAt10 = str2.charAt(i50);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i51 |= (charAt10 & 8191) << i52;
                        i52 += 13;
                        i50 = i10;
                    }
                    charAt19 = i51 | (charAt10 << i52);
                    i50 = i10;
                }
                int i53 = i50 + 1;
                charAt = str2.charAt(i50);
                if (charAt >= 55296) {
                    int i54 = charAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i9 = i53 + 1;
                        charAt9 = str2.charAt(i53);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i54 |= (charAt9 & 8191) << i55;
                        i55 += 13;
                        i53 = i9;
                    }
                    charAt = i54 | (charAt9 << i55);
                    i53 = i9;
                }
                int i56 = i53 + 1;
                charAt2 = str2.charAt(i53);
                if (charAt2 >= 55296) {
                    int i57 = charAt2 & 8191;
                    int i58 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt8 = str2.charAt(i56);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i57 |= (charAt8 & 8191) << i58;
                        i58 += 13;
                        i56 = i8;
                    }
                    charAt2 = i57 | (charAt8 << i58);
                    i56 = i8;
                }
                int i59 = i56 + 1;
                charAt3 = str2.charAt(i56);
                if (charAt3 >= 55296) {
                    int i60 = charAt3 & 8191;
                    int i61 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        charAt7 = str2.charAt(i59);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i60 |= (charAt7 & 8191) << i61;
                        i61 += 13;
                        i59 = i7;
                    }
                    charAt3 = i60 | (charAt7 << i61);
                    i59 = i7;
                }
                int i62 = i59 + 1;
                int charAt20 = str2.charAt(i59);
                if (charAt20 >= 55296) {
                    int i63 = charAt20 & 8191;
                    int i64 = 13;
                    while (true) {
                        i6 = i62 + 1;
                        charAt6 = str2.charAt(i62);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i63 |= (charAt6 & 8191) << i64;
                        i64 += 13;
                        i62 = i6;
                    }
                    charAt20 = i63 | (charAt6 << i64);
                    i62 = i6;
                }
                int i65 = i62 + 1;
                if (str2.charAt(i62) >= 55296) {
                    do {
                        i5 = i65;
                        i65 = i5 + 1;
                    } while (str2.charAt(i5) >= 55296);
                }
                int i66 = i65;
                int i67 = i66 + 1;
                charAt4 = str2.charAt(i66);
                if (charAt4 >= 55296) {
                    int i68 = charAt4 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i4 = i69 + 1;
                        charAt5 = str2.charAt(i69);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i68 |= (charAt5 & 8191) << i70;
                        i70 += 13;
                        i69 = i4;
                    }
                    charAt4 = i68 | (charAt5 << i70);
                    i67 = i4;
                }
                i2 = charAt18 + charAt18 + charAt19;
                int i71 = charAt20;
                iArr = new int[charAt4 + charAt20 + charAt18];
                i3 = i71;
                i39 = charAt18;
                i44 = i67;
            }
            Unsafe unsafe = v.n;
            Object[] objArr = b.c;
            Class<?> cls2 = b.a.getClass();
            int i72 = i3 + charAt4;
            int i73 = i44;
            int i74 = charAt3 + charAt3;
            int i75 = i39;
            int[] iArr3 = new int[charAt3 * 3];
            Object[] objArr2 = new Object[i74];
            int i76 = i72;
            int i77 = charAt4;
            int i78 = i73;
            int i79 = 0;
            int i80 = 0;
            while (i78 < length) {
                int i81 = i78 + 1;
                int charAt21 = str2.charAt(i78);
                int i82 = length;
                if (charAt21 >= 55296) {
                    int i83 = charAt21 & 8191;
                    int i84 = i81;
                    int i85 = 13;
                    while (true) {
                        i34 = i84 + 1;
                        charAt15 = str2.charAt(i84);
                        i35 = i83;
                        if (charAt15 < 55296) {
                            break;
                        }
                        i83 = i35 | ((charAt15 & 8191) << i85);
                        i85 += 13;
                        i84 = i34;
                    }
                    charAt21 = i35 | (charAt15 << i85);
                    i12 = i34;
                } else {
                    i12 = i81;
                }
                int i86 = i12 + 1;
                int charAt22 = str2.charAt(i12);
                int i87 = charAt21;
                if (charAt22 >= 55296) {
                    int i88 = charAt22 & 8191;
                    int i89 = i86;
                    int i90 = 13;
                    while (true) {
                        i32 = i89 + 1;
                        charAt14 = str2.charAt(i89);
                        i33 = i88;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i88 = i33 | ((charAt14 & 8191) << i90);
                        i90 += 13;
                        i89 = i32;
                    }
                    charAt22 = i33 | (charAt14 << i90);
                    i13 = i32;
                } else {
                    i13 = i86;
                }
                Object[] objArr3 = objArr;
                if ((charAt22 & 1024) != 0) {
                    iArr[i80] = i79;
                    i80++;
                }
                int i91 = charAt22 & 255;
                int i92 = i72;
                int i93 = charAt22 & a.o;
                if (i91 >= 51) {
                    int i94 = i13 + 1;
                    int charAt23 = str2.charAt(i13);
                    if (charAt23 >= 55296) {
                        int i95 = charAt23 & 8191;
                        int i96 = i94;
                        int i97 = 13;
                        while (true) {
                            i30 = i96 + 1;
                            charAt13 = str2.charAt(i96);
                            i31 = i95;
                            if (charAt13 < 55296) {
                                break;
                            }
                            i95 = i31 | ((charAt13 & 8191) << i97);
                            i97 += 13;
                            i96 = i30;
                        }
                        charAt23 = i31 | (charAt13 << i97);
                        i28 = i30;
                    } else {
                        i28 = i94;
                    }
                    int i98 = charAt23;
                    int i99 = i91 - 51;
                    i19 = i28;
                    if (i99 == 9 || i99 == 17) {
                        objArr2[x5n.z(i79, 3, 1)] = objArr3[i2];
                        i29 = i93;
                        i2++;
                    } else {
                        if (i99 == 12) {
                            if (b.a() == 1 || i93 != 0) {
                                objArr2[x5n.z(i79, 3, 1)] = objArr3[i2];
                                i2++;
                            } else {
                                i29 = 0;
                            }
                        }
                        i29 = i93;
                    }
                    int i100 = i98 + i98;
                    Object obj2 = objArr3[i100];
                    int i101 = i29;
                    if (obj2 instanceof Field) {
                        z2 = (Field) obj2;
                    } else {
                        z2 = v.z(cls2, (String) obj2);
                        objArr3[i100] = z2;
                        iArr[i76] = i79;
                        i76++;
                    }
                    int i102 = charAt;
                    i14 = charAt2;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(z2);
                    int i103 = i100 + 1;
                    Object obj3 = objArr3[i103];
                    if (obj3 instanceof Field) {
                        z3 = (Field) obj3;
                    } else {
                        z3 = v.z(cls2, (String) obj3);
                        objArr3[i103] = z3;
                    }
                    i15 = i102;
                    i21 = i101;
                    str = str2;
                    i18 = i79;
                    i16 = i2;
                    i22 = 0;
                    i17 = (int) unsafe.objectFieldOffset(z3);
                    i20 = objectFieldOffset;
                } else {
                    int i104 = charAt;
                    i14 = charAt2;
                    int i105 = i2 + 1;
                    Field z4 = v.z(cls2, (String) objArr3[i2]);
                    i15 = i104;
                    if (i91 == 9 || i91 == 17) {
                        i16 = i105;
                        objArr2[x5n.z(i79, 3, 1)] = z4.getType();
                    } else {
                        if (i91 == 27) {
                            i24 = i105;
                            i25 = 3;
                            i26 = 1;
                            i27 = i2 + 2;
                        } else if (i91 == 49) {
                            i27 = i2 + 2;
                            i24 = i105;
                            i25 = 3;
                            i26 = 1;
                        } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                            i16 = i105;
                            if (b.a() == 1 || i93 != 0) {
                                i27 = i2 + 2;
                                objArr2[x5n.z(i79, 3, 1)] = objArr3[i16];
                                i16 = i27;
                            } else {
                                i93 = 0;
                            }
                        } else if (i91 == 50) {
                            int i106 = i2 + 2;
                            int i107 = i77 + 1;
                            iArr[i77] = i79;
                            int i108 = i79 / 3;
                            int i109 = i108 + i108;
                            objArr2[i109] = objArr3[i105];
                            if (i93 != 0) {
                                objArr2[i109 + 1] = objArr3[i106];
                                i77 = i107;
                                i16 = i2 + 3;
                            } else {
                                i77 = i107;
                                i93 = 0;
                                i16 = i106;
                            }
                        } else {
                            i16 = i105;
                        }
                        objArr2[x5n.z(i79, i25, i26)] = objArr3[i24];
                        i16 = i27;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(z4);
                    i17 = 1048575;
                    if ((charAt22 & 4096) == 0 || i91 > 17) {
                        str = str2;
                        i18 = i79;
                        i19 = i13;
                        i20 = objectFieldOffset2;
                        i21 = i93;
                        i22 = 0;
                    } else {
                        int i110 = i13 + 1;
                        int charAt24 = str2.charAt(i13);
                        if (charAt24 >= 55296) {
                            int i111 = charAt24 & 8191;
                            int i112 = 13;
                            while (true) {
                                i23 = i110 + 1;
                                charAt12 = str2.charAt(i110);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i111 |= (charAt12 & 8191) << i112;
                                i112 += 13;
                                i110 = i23;
                            }
                            charAt24 = i111 | (charAt12 << i112);
                            i110 = i23;
                        }
                        int i113 = (charAt24 / 32) + i75 + i75;
                        Object obj4 = objArr3[i113];
                        str = str2;
                        if (obj4 instanceof Field) {
                            z = (Field) obj4;
                        } else {
                            z = v.z(cls2, (String) obj4);
                            objArr3[i113] = z;
                        }
                        i18 = i79;
                        i22 = charAt24 % 32;
                        i17 = (int) unsafe.objectFieldOffset(z);
                        i20 = objectFieldOffset2;
                        i19 = i110;
                        i21 = i93;
                    }
                }
                int i114 = i18 + 1;
                iArr3[i18] = i87;
                int i115 = i18 + 2;
                int i116 = i18;
                iArr3[i114] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i91 << 20) | i20;
                iArr3[i115] = (i22 << 20) | i17;
                i79 = i116 + 3;
                objArr = objArr3;
                length = i82;
                i72 = i92;
                charAt = i15;
                i2 = i16;
                str2 = str;
                i78 = i19;
                charAt2 = i14;
            }
            wVar = new v(iArr3, objArr2, charAt, charAt2, b.a, iArr, charAt4, i72, zVar2, wkfVar2);
        }
        nqo nqoVar = (nqo) concurrentHashMap.putIfAbsent(cls, wVar);
        return nqoVar != null ? nqoVar : wVar;
    }
}
