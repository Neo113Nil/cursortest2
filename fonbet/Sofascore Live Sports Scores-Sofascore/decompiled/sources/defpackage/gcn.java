package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gcn {
    public static final gcn c = new gcn();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ibn a = new ibn();

    private gcn() {
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pcn a(Class cls) {
        pcn zbnVar;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int objectFieldOffset;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field y;
        char charAt12;
        int i23;
        int i24;
        int i25;
        int i26;
        Field y2;
        Field y3;
        int i27;
        char charAt13;
        int i28;
        int i29;
        char charAt14;
        int i30;
        int i31;
        char charAt15;
        Object[] objArr2;
        int i32;
        char charAt16;
        Charset charset = jan.a;
        if (cls == null) {
            yhk.s("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        pcn pcnVar = (pcn) concurrentHashMap.get(cls);
        if (pcnVar != null) {
            return pcnVar;
        }
        ibn ibnVar = this.a;
        ibnVar.getClass();
        idn idnVar = tcn.a;
        if (!y9n.class.isAssignableFrom(cls)) {
            int i33 = o7n.a;
        }
        lcn b = ibnVar.a.b(cls);
        int i34 = 0;
        if ((b.d & 2) == 2) {
            int i35 = o7n.a;
            zbnVar = new zbn(tcn.a, e9n.a, b.a);
        } else {
            int i36 = o7n.a;
            int i37 = dcn.a;
            int i38 = xan.a;
            idn idnVar2 = tcn.a;
            d9n d9nVar = b.a() + (-1) != 1 ? e9n.a : null;
            int i39 = nbn.a;
            int[] iArr2 = xbn.m;
            if (!(b instanceof lcn)) {
                pvd.j();
                return null;
            }
            String str = b.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i40 = 1;
                while (true) {
                    i = i40 + 1;
                    if (str.charAt(i40) < 55296) {
                        break;
                    }
                    i40 = i;
                }
            } else {
                i = 1;
            }
            int i41 = i + 1;
            int charAt17 = str.charAt(i);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i32 = i41 + 1;
                    charAt16 = str.charAt(i41);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i42 |= (charAt16 & 8191) << i43;
                    i43 += 13;
                    i41 = i32;
                }
                charAt17 = i42 | (charAt16 << i43);
                i41 = i32;
            }
            if (charAt17 == 0) {
                i4 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                i5 = 0;
                iArr = xbn.m;
                i3 = 0;
            } else {
                int i44 = i41 + 1;
                int charAt18 = str.charAt(i41);
                if (charAt18 >= 55296) {
                    int i45 = charAt18 & 8191;
                    int i46 = 13;
                    while (true) {
                        i13 = i44 + 1;
                        charAt11 = str.charAt(i44);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i45 |= (charAt11 & 8191) << i46;
                        i46 += 13;
                        i44 = i13;
                    }
                    charAt18 = i45 | (charAt11 << i46);
                    i44 = i13;
                }
                int i47 = i44 + 1;
                int charAt19 = str.charAt(i44);
                if (charAt19 >= 55296) {
                    int i48 = charAt19 & 8191;
                    int i49 = 13;
                    while (true) {
                        i12 = i47 + 1;
                        charAt10 = str.charAt(i47);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i48 |= (charAt10 & 8191) << i49;
                        i49 += 13;
                        i47 = i12;
                    }
                    charAt19 = i48 | (charAt10 << i49);
                    i47 = i12;
                }
                int i50 = i47 + 1;
                charAt = str.charAt(i47);
                if (charAt >= 55296) {
                    int i51 = charAt & 8191;
                    int i52 = 13;
                    while (true) {
                        i11 = i50 + 1;
                        charAt9 = str.charAt(i50);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i51 |= (charAt9 & 8191) << i52;
                        i52 += 13;
                        i50 = i11;
                    }
                    charAt = i51 | (charAt9 << i52);
                    i50 = i11;
                }
                int i53 = i50 + 1;
                charAt2 = str.charAt(i50);
                if (charAt2 >= 55296) {
                    int i54 = charAt2 & 8191;
                    int i55 = 13;
                    while (true) {
                        i10 = i53 + 1;
                        charAt8 = str.charAt(i53);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i54 |= (charAt8 & 8191) << i55;
                        i55 += 13;
                        i53 = i10;
                    }
                    charAt2 = i54 | (charAt8 << i55);
                    i53 = i10;
                }
                int i56 = i53 + 1;
                charAt3 = str.charAt(i53);
                if (charAt3 >= 55296) {
                    int i57 = charAt3 & 8191;
                    int i58 = 13;
                    while (true) {
                        i9 = i56 + 1;
                        charAt7 = str.charAt(i56);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i57 |= (charAt7 & 8191) << i58;
                        i58 += 13;
                        i56 = i9;
                    }
                    charAt3 = i57 | (charAt7 << i58);
                    i56 = i9;
                }
                int i59 = i56 + 1;
                int charAt20 = str.charAt(i56);
                if (charAt20 >= 55296) {
                    int i60 = charAt20 & 8191;
                    int i61 = 13;
                    while (true) {
                        i8 = i59 + 1;
                        charAt6 = str.charAt(i59);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i60 |= (charAt6 & 8191) << i61;
                        i61 += 13;
                        i59 = i8;
                    }
                    charAt20 = i60 | (charAt6 << i61);
                    i59 = i8;
                }
                int i62 = i59 + 1;
                int charAt21 = str.charAt(i59);
                if (charAt21 >= 55296) {
                    int i63 = charAt21 & 8191;
                    int i64 = i62;
                    int i65 = 13;
                    while (true) {
                        i7 = i64 + 1;
                        charAt5 = str.charAt(i64);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i63 |= (charAt5 & 8191) << i65;
                        i65 += 13;
                        i64 = i7;
                    }
                    charAt21 = i63 | (charAt5 << i65);
                    i2 = i7;
                } else {
                    i2 = i62;
                }
                int i66 = i2 + 1;
                int charAt22 = str.charAt(i2);
                if (charAt22 >= 55296) {
                    int i67 = charAt22 & 8191;
                    int i68 = i66;
                    int i69 = 13;
                    while (true) {
                        i6 = i68 + 1;
                        charAt4 = str.charAt(i68);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i67 |= (charAt4 & 8191) << i69;
                        i69 += 13;
                        i68 = i6;
                    }
                    charAt22 = i67 | (charAt4 << i69);
                    i66 = i6;
                }
                int i70 = charAt22 + charAt20 + charAt21;
                int i71 = charAt18 + charAt18 + charAt19;
                int[] iArr3 = new int[i70];
                int i72 = charAt20;
                iArr = iArr3;
                i3 = i72;
                i4 = i71;
                i5 = charAt22;
                i34 = charAt18;
                i41 = i66;
            }
            Unsafe unsafe = xbn.n;
            Object[] objArr3 = b.c;
            int i73 = i41;
            Class<?> cls2 = b.a.getClass();
            int i74 = i3 + i5;
            int i75 = i34;
            int i76 = charAt3 + charAt3;
            int[] iArr4 = new int[charAt3 * 3];
            Object[] objArr4 = new Object[i76];
            int i77 = i4;
            int i78 = i73;
            int i79 = i74;
            int i80 = i5;
            int i81 = 0;
            int i82 = 0;
            while (i78 < length) {
                int i83 = i78 + 1;
                int charAt23 = str.charAt(i78);
                int i84 = length;
                if (charAt23 >= 55296) {
                    int i85 = charAt23 & 8191;
                    int i86 = i83;
                    int i87 = 13;
                    while (true) {
                        i31 = i86 + 1;
                        charAt15 = str.charAt(i86);
                        objArr2 = objArr4;
                        if (charAt15 < 55296) {
                            break;
                        }
                        i85 |= (charAt15 & 8191) << i87;
                        i87 += 13;
                        i86 = i31;
                        objArr4 = objArr2;
                    }
                    charAt23 = i85 | (charAt15 << i87);
                    i14 = i31;
                    objArr = objArr2;
                } else {
                    objArr = objArr4;
                    i14 = i83;
                }
                int i88 = i14 + 1;
                int charAt24 = str.charAt(i14);
                if (charAt24 >= 55296) {
                    int i89 = charAt24 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i29 = i90 + 1;
                        charAt14 = str.charAt(i90);
                        i30 = i89;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i89 = i30 | ((charAt14 & 8191) << i91);
                        i91 += 13;
                        i90 = i29;
                    }
                    charAt24 = i30 | (charAt14 << i91);
                    i15 = i29;
                } else {
                    i15 = i88;
                }
                int i92 = i74;
                if ((charAt24 & 1024) != 0) {
                    iArr[i82] = i81;
                    i82++;
                }
                int i93 = charAt24 & 255;
                int i94 = charAt23;
                int i95 = charAt24 & a.o;
                if (i93 >= 51) {
                    int i96 = i15 + 1;
                    int charAt25 = str.charAt(i15);
                    if (charAt25 >= 55296) {
                        int i97 = charAt25 & 8191;
                        int i98 = i96;
                        int i99 = 13;
                        while (true) {
                            i27 = i98 + 1;
                            charAt13 = str.charAt(i98);
                            i28 = i97;
                            if (charAt13 < 55296) {
                                break;
                            }
                            i97 = i28 | ((charAt13 & 8191) << i99);
                            i99 += 13;
                            i98 = i27;
                        }
                        charAt25 = i28 | (charAt13 << i99);
                        i25 = i27;
                    } else {
                        i25 = i96;
                    }
                    int i100 = charAt25;
                    int i101 = i93 - 51;
                    int i102 = i25;
                    if (i101 == 9 || i101 == 17) {
                        objArr[x5n.z(i81, 3, 1)] = objArr3[i77];
                        i26 = i95;
                        i77++;
                    } else {
                        if (i101 == 12) {
                            if (b.a() == 1 || i95 != 0) {
                                objArr[x5n.z(i81, 3, 1)] = objArr3[i77];
                                i77++;
                            } else {
                                i26 = 0;
                            }
                        }
                        i26 = i95;
                    }
                    int i103 = i100 + i100;
                    Object obj = objArr3[i103];
                    int i104 = i26;
                    if (obj instanceof Field) {
                        y2 = (Field) obj;
                    } else {
                        y2 = xbn.y(cls2, (String) obj);
                        objArr3[i103] = y2;
                    }
                    i16 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(y2);
                    int i105 = i103 + 1;
                    Object obj2 = objArr3[i105];
                    if (obj2 instanceof Field) {
                        y3 = (Field) obj2;
                    } else {
                        y3 = xbn.y(cls2, (String) obj2);
                        objArr3[i105] = y3;
                    }
                    i18 = (int) unsafe.objectFieldOffset(y3);
                    i17 = charAt2;
                    i22 = objectFieldOffset2;
                    i95 = i104;
                    i19 = i102;
                    i21 = 0;
                } else {
                    i16 = charAt;
                    int i106 = i77 + 1;
                    Field y4 = xbn.y(cls2, (String) objArr3[i77]);
                    if (i93 == 9 || i93 == 17) {
                        i17 = charAt2;
                        objArr[x5n.z(i81, 3, 1)] = y4.getType();
                    } else {
                        if (i93 == 27) {
                            i17 = charAt2;
                            i23 = 3;
                            i24 = 1;
                            i77 += 2;
                        } else if (i93 == 49) {
                            i77 += 2;
                            i17 = charAt2;
                            i23 = 3;
                            i24 = 1;
                        } else {
                            if (i93 == 12 || i93 == 30 || i93 == 44) {
                                i17 = charAt2;
                                if (b.a() == 1 || i95 != 0) {
                                    i77 += 2;
                                    objArr[x5n.z(i81, 3, 1)] = objArr3[i106];
                                } else {
                                    i77 = i106;
                                    i95 = 0;
                                }
                            } else if (i93 == 50) {
                                int i107 = i77 + 2;
                                int i108 = i80 + 1;
                                iArr[i80] = i81;
                                int i109 = i81 / 3;
                                int i110 = i109 + i109;
                                objArr[i110] = objArr3[i106];
                                if (i95 != 0) {
                                    i77 += 3;
                                    objArr[i110 + 1] = objArr3[i107];
                                    i80 = i108;
                                } else {
                                    i77 = i107;
                                    i80 = i108;
                                    i95 = 0;
                                }
                                i17 = charAt2;
                            } else {
                                i17 = charAt2;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                            i18 = 1048575;
                            if ((charAt24 & 4096) != 0 || i93 > 17) {
                                i19 = i15;
                                i20 = 0;
                            } else {
                                int i111 = i15 + 1;
                                int charAt26 = str.charAt(i15);
                                if (charAt26 >= 55296) {
                                    int i112 = charAt26 & 8191;
                                    int i113 = 13;
                                    while (true) {
                                        i19 = i111 + 1;
                                        charAt12 = str.charAt(i111);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i112 |= (charAt12 & 8191) << i113;
                                        i113 += 13;
                                        i111 = i19;
                                    }
                                    charAt26 = i112 | (charAt12 << i113);
                                } else {
                                    i19 = i111;
                                }
                                int i114 = (charAt26 / 32) + i75 + i75;
                                Object obj3 = objArr3[i114];
                                if (obj3 instanceof Field) {
                                    y = (Field) obj3;
                                } else {
                                    y = xbn.y(cls2, (String) obj3);
                                    objArr3[i114] = y;
                                }
                                i20 = charAt26 % 32;
                                i18 = (int) unsafe.objectFieldOffset(y);
                            }
                            if (i93 >= 18 || i93 > 49) {
                                i21 = i20;
                                i22 = objectFieldOffset;
                            } else {
                                iArr[i79] = objectFieldOffset;
                                i21 = i20;
                                i22 = objectFieldOffset;
                                i79++;
                            }
                        }
                        objArr[x5n.z(i81, i23, i24)] = objArr3[i106];
                        objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                        i18 = 1048575;
                        if ((charAt24 & 4096) != 0) {
                        }
                        i19 = i15;
                        i20 = 0;
                        if (i93 >= 18) {
                        }
                        i21 = i20;
                        i22 = objectFieldOffset;
                    }
                    i77 = i106;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                    i18 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i19 = i15;
                    i20 = 0;
                    if (i93 >= 18) {
                    }
                    i21 = i20;
                    i22 = objectFieldOffset;
                }
                int i115 = i81 + 1;
                iArr4[i81] = i94;
                int i116 = i81 + 2;
                String str2 = str;
                iArr4[i115] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i95 != 0 ? Integer.MIN_VALUE : 0) | (i93 << 20) | i22;
                i81 += 3;
                iArr4[i116] = (i21 << 20) | i18;
                i78 = i19;
                i74 = i92;
                length = i84;
                str = str2;
                objArr4 = objArr;
                charAt2 = i17;
                charAt = i16;
            }
            zbnVar = new xbn(iArr4, objArr4, charAt, charAt2, b.a, iArr, i5, i74, idnVar2, d9nVar);
        }
        pcn pcnVar2 = (pcn) concurrentHashMap.putIfAbsent(cls, zbnVar);
        return pcnVar2 != null ? pcnVar2 : zbnVar;
    }
}
