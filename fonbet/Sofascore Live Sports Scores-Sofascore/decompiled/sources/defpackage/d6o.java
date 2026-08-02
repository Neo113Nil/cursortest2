package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.wearable.b;
import com.google.android.gms.internal.wearable.c;
import com.google.android.gms.internal.wearable.d;
import com.google.android.gms.internal.wearable.e;
import com.google.android.gms.internal.wearable.zzdg;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d6o {
    public static final d6o c = new d6o();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final dad a = new dad(2);

    public final s6o a(Class cls) {
        s6o cVar;
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
        Object[] objArr;
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
        Field u;
        int i23;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Field u2;
        Field u3;
        int i30;
        char charAt13;
        int i31;
        int i32;
        char charAt14;
        int i33;
        int i34;
        char charAt15;
        Object[] objArr2;
        int i35;
        char charAt16;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (s6o) obj;
        }
        e eVar = d.a;
        if (!zzdg.class.isAssignableFrom(cls)) {
            int i36 = opn.a;
        }
        m6o mo783b = ((d1l) this.a.b).mo783b(cls);
        int i37 = 0;
        if ((mo783b.d & 2) == 2) {
            int i38 = opn.a;
            e eVar2 = d.a;
            igf igfVar = uwn.a;
            cVar = new c(eVar2, mo783b.a);
        } else {
            int i39 = opn.a;
            int i40 = t5o.a;
            int i41 = v1o.a;
            e eVar3 = d.a;
            igf igfVar2 = mo783b.a() + (-1) != 1 ? uwn.a : null;
            int i42 = v3o.a;
            int[] iArr2 = b.m;
            if (!(mo783b instanceof m6o)) {
                pvd.j();
                return null;
            }
            String str2 = mo783b.b;
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
                    i35 = i44 + 1;
                    charAt16 = str2.charAt(i44);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i45 |= (charAt16 & 8191) << i46;
                    i46 += 13;
                    i44 = i35;
                }
                charAt17 = i45 | (charAt16 << i46);
                i44 = i35;
            }
            if (charAt17 == 0) {
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                i2 = 0;
                iArr = b.m;
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
                int charAt20 = str2.charAt(i56);
                if (charAt20 >= 55296) {
                    int i60 = charAt20 & 8191;
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
                    charAt20 = i60 | (charAt7 << i61);
                    i59 = i7;
                }
                int i62 = i59 + 1;
                charAt3 = str2.charAt(i59);
                if (charAt3 >= 55296) {
                    int i63 = charAt3 & 8191;
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
                    charAt3 = i63 | (charAt6 << i64);
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
                iArr = new int[charAt4 + charAt3 + charAt18];
                i3 = i71;
                i37 = charAt18;
                i44 = i67;
            }
            Unsafe unsafe = b.n;
            Object[] objArr3 = mo783b.c;
            Class<?> cls2 = mo783b.a.getClass();
            int i72 = charAt3 + charAt4;
            int i73 = i37;
            int i74 = i3 + i3;
            int[] iArr3 = new int[i3 * 3];
            Object[] objArr4 = new Object[i74];
            int i75 = i72;
            int i76 = charAt4;
            int i77 = 0;
            int i78 = 0;
            while (i44 < length) {
                int i79 = i44 + 1;
                int charAt21 = str2.charAt(i44);
                int i80 = length;
                if (charAt21 >= 55296) {
                    int i81 = charAt21 & 8191;
                    int i82 = i79;
                    int i83 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        charAt15 = str2.charAt(i82);
                        objArr2 = objArr4;
                        if (charAt15 < 55296) {
                            break;
                        }
                        i81 |= (charAt15 & 8191) << i83;
                        i83 += 13;
                        i82 = i34;
                        objArr4 = objArr2;
                    }
                    charAt21 = i81 | (charAt15 << i83);
                    i12 = i34;
                    objArr = objArr2;
                } else {
                    objArr = objArr4;
                    i12 = i79;
                }
                int i84 = i12 + 1;
                int charAt22 = str2.charAt(i12);
                if (charAt22 >= 55296) {
                    int i85 = charAt22 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i32 = i86 + 1;
                        charAt14 = str2.charAt(i86);
                        i33 = i85;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i85 = i33 | ((charAt14 & 8191) << i87);
                        i87 += 13;
                        i86 = i32;
                    }
                    charAt22 = i33 | (charAt14 << i87);
                    i13 = i32;
                } else {
                    i13 = i84;
                }
                int i88 = charAt21;
                if ((charAt22 & 1024) != 0) {
                    iArr[i78] = i77;
                    i78++;
                }
                int i89 = charAt22 & 255;
                int[] iArr4 = iArr3;
                int i90 = charAt22 & a.o;
                if (i89 >= 51) {
                    int i91 = i13 + 1;
                    int charAt23 = str2.charAt(i13);
                    if (charAt23 >= 55296) {
                        int i92 = charAt23 & 8191;
                        int i93 = i91;
                        int i94 = 13;
                        while (true) {
                            i30 = i93 + 1;
                            charAt13 = str2.charAt(i93);
                            i31 = i92;
                            if (charAt13 < 55296) {
                                break;
                            }
                            i92 = i31 | ((charAt13 & 8191) << i94);
                            i94 += 13;
                            i93 = i30;
                        }
                        charAt23 = i31 | (charAt13 << i94);
                        i28 = i30;
                    } else {
                        i28 = i91;
                    }
                    int i95 = charAt23;
                    int i96 = i89 - 51;
                    i19 = i28;
                    if (i96 == 9 || i96 == 17) {
                        objArr[x5n.z(i77, 3, 1)] = objArr3[i2];
                        i29 = i90;
                        i2++;
                    } else {
                        if (i96 == 12) {
                            if (mo783b.a() == 1 || i90 != 0) {
                                objArr[x5n.z(i77, 3, 1)] = objArr3[i2];
                                i2++;
                            } else {
                                i29 = 0;
                            }
                        }
                        i29 = i90;
                    }
                    int i97 = i95 + i95;
                    Object obj2 = objArr3[i97];
                    int i98 = i29;
                    if (obj2 instanceof Field) {
                        u2 = (Field) obj2;
                    } else {
                        u2 = b.u(cls2, (String) obj2);
                        objArr3[i97] = u2;
                        iArr[i75] = i77;
                        i75++;
                    }
                    int i99 = charAt;
                    i14 = charAt2;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(u2);
                    int i100 = i97 + 1;
                    Object obj3 = objArr3[i100];
                    if (obj3 instanceof Field) {
                        u3 = (Field) obj3;
                    } else {
                        u3 = b.u(cls2, (String) obj3);
                        objArr3[i100] = u3;
                    }
                    i15 = i99;
                    i21 = i98;
                    str = str2;
                    i18 = i77;
                    i16 = i2;
                    i22 = 0;
                    i17 = (int) unsafe.objectFieldOffset(u3);
                    i20 = objectFieldOffset;
                } else {
                    int i101 = charAt;
                    i14 = charAt2;
                    int i102 = i2 + 1;
                    Field u4 = b.u(cls2, (String) objArr3[i2]);
                    i15 = i101;
                    if (i89 == 9 || i89 == 17) {
                        i16 = i102;
                        objArr[x5n.z(i77, 3, 1)] = u4.getType();
                    } else {
                        if (i89 == 27) {
                            i24 = i102;
                            i25 = 3;
                            i26 = 1;
                            i27 = i2 + 2;
                        } else if (i89 == 49) {
                            i27 = i2 + 2;
                            i24 = i102;
                            i25 = 3;
                            i26 = 1;
                        } else if (i89 == 12 || i89 == 30 || i89 == 44) {
                            i16 = i102;
                            if (mo783b.a() == 1 || i90 != 0) {
                                i27 = i2 + 2;
                                objArr[x5n.z(i77, 3, 1)] = objArr3[i16];
                                i16 = i27;
                            } else {
                                i90 = 0;
                            }
                        } else if (i89 == 50) {
                            int i103 = i2 + 2;
                            int i104 = i76 + 1;
                            iArr[i76] = i77;
                            int i105 = i77 / 3;
                            int i106 = i105 + i105;
                            objArr[i106] = objArr3[i102];
                            if (i90 != 0) {
                                objArr[i106 + 1] = objArr3[i103];
                                i76 = i104;
                                i16 = i2 + 3;
                            } else {
                                i76 = i104;
                                i90 = 0;
                                i16 = i103;
                            }
                        } else {
                            i16 = i102;
                        }
                        objArr[x5n.z(i77, i25, i26)] = objArr3[i24];
                        i16 = i27;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(u4);
                    i17 = 1048575;
                    if ((charAt22 & 4096) == 0 || i89 > 17) {
                        str = str2;
                        i18 = i77;
                        i19 = i13;
                        i20 = objectFieldOffset2;
                        i21 = i90;
                        i22 = 0;
                    } else {
                        int i107 = i13 + 1;
                        int charAt24 = str2.charAt(i13);
                        if (charAt24 >= 55296) {
                            int i108 = charAt24 & 8191;
                            int i109 = 13;
                            while (true) {
                                i23 = i107 + 1;
                                charAt12 = str2.charAt(i107);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i108 |= (charAt12 & 8191) << i109;
                                i109 += 13;
                                i107 = i23;
                            }
                            charAt24 = i108 | (charAt12 << i109);
                            i107 = i23;
                        }
                        int i110 = (charAt24 / 32) + i73 + i73;
                        Object obj4 = objArr3[i110];
                        str = str2;
                        if (obj4 instanceof Field) {
                            u = (Field) obj4;
                        } else {
                            u = b.u(cls2, (String) obj4);
                            objArr3[i110] = u;
                        }
                        i18 = i77;
                        i22 = charAt24 % 32;
                        i17 = (int) unsafe.objectFieldOffset(u);
                        i20 = objectFieldOffset2;
                        i19 = i107;
                        i21 = i90;
                    }
                }
                int i111 = i18 + 1;
                iArr4[i18] = i88;
                int i112 = i18 + 2;
                int i113 = i18;
                iArr4[i111] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i89 << 20) | i20;
                iArr4[i112] = (i22 << 20) | i17;
                i77 = i113 + 3;
                length = i80;
                iArr3 = iArr4;
                objArr4 = objArr;
                charAt = i15;
                i2 = i16;
                str2 = str;
                i44 = i19;
                charAt2 = i14;
            }
            cVar = new b(iArr3, objArr4, charAt, charAt2, mo783b.a, iArr, charAt4, i72, eVar3, igfVar2);
        }
        s6o s6oVar = (s6o) concurrentHashMap.putIfAbsent(cls, cVar);
        return s6oVar != null ? s6oVar : cVar;
    }
}
