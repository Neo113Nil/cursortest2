package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.e;
import com.google.android.gms.internal.cast.f;
import com.google.android.gms.internal.cast.zzyd;
import com.google.android.gms.internal.cast.zzym;
import com.ironsource.mediationsdk.metadata.a;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ufp {
    public static final ufp c = new ufp();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final sz8 a = new sz8(3);

    /* JADX WARN: Removed duplicated region for block: B:116:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bgp a(Class cls) {
        bgp eVar;
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt2;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        int i11;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        Object[] objArr;
        int i14;
        int i15;
        int[] iArr2;
        int[] iArr3;
        int objectFieldOffset;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Field k;
        char charAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        Field k2;
        Field k3;
        int i25;
        char charAt9;
        int i26;
        int i27;
        char charAt10;
        int i28;
        int i29;
        char charAt11;
        Object[] objArr2;
        int i30;
        char charAt12;
        Charset charset = zzym.a;
        if (cls == null) {
            yhk.s("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        bgp bgpVar = (bgp) concurrentHashMap.get(cls);
        if (bgpVar != null) {
            return bgpVar;
        }
        ubf ubfVar = f.a;
        if (!zzyd.class.isAssignableFrom(cls)) {
            int i31 = tbp.a;
        }
        zfp b = ((muo) this.a.b).b(cls);
        int i32 = 0;
        if ((b.d & 2) == 2) {
            int i33 = tbp.a;
            ubf ubfVar2 = f.a;
            omf omfVar = rcp.a;
            eVar = new e(ubfVar2, b.a);
        } else {
            int i34 = tbp.a;
            int i35 = sfp.a;
            int i36 = oep.a;
            ubf ubfVar3 = f.a;
            omf omfVar2 = b.a() + (-1) != 1 ? rcp.a : null;
            int i37 = afp.a;
            int[] iArr4 = d.i;
            if (!(b instanceof zfp)) {
                pvd.j();
                return null;
            }
            String str = b.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i38 = 1;
                while (true) {
                    i = i38 + 1;
                    if (str.charAt(i38) < 55296) {
                        break;
                    }
                    i38 = i;
                }
            } else {
                i = 1;
            }
            int i39 = i + 1;
            int charAt13 = str.charAt(i);
            if (charAt13 >= 55296) {
                int i40 = charAt13 & 8191;
                int i41 = 13;
                while (true) {
                    i30 = i39 + 1;
                    charAt12 = str.charAt(i39);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i40 |= (charAt12 & 8191) << i41;
                    i41 += 13;
                    i39 = i30;
                }
                charAt13 = i40 | (charAt12 << i41);
                i39 = i30;
            }
            if (charAt13 == 0) {
                i4 = 0;
                charAt = 0;
                i5 = 0;
                iArr = d.i;
                i3 = 0;
            } else {
                int i42 = i39 + 1;
                int charAt14 = str.charAt(i39);
                if (charAt14 >= 55296) {
                    int i43 = charAt14 & 8191;
                    int i44 = 13;
                    while (true) {
                        i13 = i42 + 1;
                        charAt7 = str.charAt(i42);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i43 |= (charAt7 & 8191) << i44;
                        i44 += 13;
                        i42 = i13;
                    }
                    charAt14 = i43 | (charAt7 << i44);
                    i42 = i13;
                }
                int i45 = i42 + 1;
                int charAt15 = str.charAt(i42);
                if (charAt15 >= 55296) {
                    int i46 = charAt15 & 8191;
                    int i47 = 13;
                    while (true) {
                        i12 = i45 + 1;
                        charAt6 = str.charAt(i45);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i46 |= (charAt6 & 8191) << i47;
                        i47 += 13;
                        i45 = i12;
                    }
                    charAt15 = i46 | (charAt6 << i47);
                    i45 = i12;
                }
                int i48 = i45 + 1;
                if (str.charAt(i45) >= 55296) {
                    while (true) {
                        i11 = i48 + 1;
                        if (str.charAt(i48) < 55296) {
                            break;
                        }
                        i48 = i11;
                    }
                    i48 = i11;
                }
                int i49 = i48 + 1;
                if (str.charAt(i48) >= 55296) {
                    while (true) {
                        i10 = i49 + 1;
                        if (str.charAt(i49) < 55296) {
                            break;
                        }
                        i49 = i10;
                    }
                    i49 = i10;
                }
                int i50 = i49 + 1;
                charAt = str.charAt(i49);
                if (charAt >= 55296) {
                    int i51 = charAt & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        charAt5 = str.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    charAt = i51 | (charAt5 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int charAt16 = str.charAt(i50);
                if (charAt16 >= 55296) {
                    int i54 = charAt16 & 8191;
                    int i55 = 13;
                    while (true) {
                        i8 = i53 + 1;
                        charAt4 = str.charAt(i53);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i55;
                        i55 += 13;
                        i53 = i8;
                    }
                    charAt16 = i54 | (charAt4 << i55);
                    i53 = i8;
                }
                int i56 = i53 + 1;
                int charAt17 = str.charAt(i53);
                if (charAt17 >= 55296) {
                    int i57 = charAt17 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i7 = i58 + 1;
                        charAt3 = str.charAt(i58);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i57 |= (charAt3 & 8191) << i59;
                        i59 += 13;
                        i58 = i7;
                    }
                    charAt17 = i57 | (charAt3 << i59);
                    i2 = i7;
                } else {
                    i2 = i56;
                }
                int i60 = i2 + 1;
                int charAt18 = str.charAt(i2);
                if (charAt18 >= 55296) {
                    int i61 = charAt18 & 8191;
                    int i62 = i60;
                    int i63 = 13;
                    while (true) {
                        i6 = i62 + 1;
                        charAt2 = str.charAt(i62);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i61 |= (charAt2 & 8191) << i63;
                        i63 += 13;
                        i62 = i6;
                    }
                    charAt18 = i61 | (charAt2 << i63);
                    i60 = i6;
                }
                int i64 = charAt18 + charAt16 + charAt17;
                int i65 = charAt14 + charAt14 + charAt15;
                int[] iArr5 = new int[i64];
                int i66 = charAt16;
                iArr = iArr5;
                i3 = i66;
                i4 = i65;
                i5 = charAt18;
                i32 = charAt14;
                i39 = i60;
            }
            Unsafe unsafe = d.j;
            Object[] objArr3 = b.c;
            int i67 = i39;
            Class<?> cls2 = b.a.getClass();
            int i68 = i32;
            int i69 = charAt + charAt;
            int[] iArr6 = new int[charAt * 3];
            Object[] objArr4 = new Object[i69];
            int i70 = i4;
            int i71 = i3 + i5;
            int i72 = i67;
            int i73 = i70;
            int i74 = i5;
            int i75 = 0;
            int i76 = 0;
            while (i72 < length) {
                int i77 = i72 + 1;
                int charAt19 = str.charAt(i72);
                int i78 = length;
                if (charAt19 >= 55296) {
                    int i79 = charAt19 & 8191;
                    int i80 = i77;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        charAt11 = str.charAt(i80);
                        objArr2 = objArr4;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i79 |= (charAt11 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        objArr4 = objArr2;
                    }
                    charAt19 = i79 | (charAt11 << i81);
                    i14 = i29;
                    objArr = objArr2;
                } else {
                    objArr = objArr4;
                    i14 = i77;
                }
                int i82 = i14 + 1;
                int charAt20 = str.charAt(i14);
                if (charAt20 >= 55296) {
                    int i83 = charAt20 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i27 = i84 + 1;
                        charAt10 = str.charAt(i84);
                        i28 = i83;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i83 = i28 | ((charAt10 & 8191) << i85);
                        i85 += 13;
                        i84 = i27;
                    }
                    charAt20 = i28 | (charAt10 << i85);
                    i15 = i27;
                } else {
                    i15 = i82;
                }
                int i86 = charAt19;
                if ((charAt20 & 1024) != 0) {
                    iArr[i76] = i75;
                    i76++;
                }
                int i87 = charAt20 & 255;
                int i88 = i71;
                int i89 = charAt20 & a.o;
                if (i87 >= 51) {
                    int i90 = i15 + 1;
                    int charAt21 = str.charAt(i15);
                    if (charAt21 >= 55296) {
                        int i91 = charAt21 & 8191;
                        int i92 = i90;
                        int i93 = 13;
                        while (true) {
                            i25 = i92 + 1;
                            charAt9 = str.charAt(i92);
                            i26 = i91;
                            if (charAt9 < 55296) {
                                break;
                            }
                            i91 = i26 | ((charAt9 & 8191) << i93);
                            i93 += 13;
                            i92 = i25;
                        }
                        charAt21 = i26 | (charAt9 << i93);
                        i23 = i25;
                    } else {
                        i23 = i90;
                    }
                    int i94 = charAt21;
                    int i95 = i87 - 51;
                    int i96 = i23;
                    if (i95 == 9 || i95 == 17) {
                        objArr[x5n.z(i75, 3, 1)] = objArr3[i73];
                        i24 = i89;
                        i73++;
                    } else {
                        if (i95 == 12) {
                            if (b.a() == 1 || i89 != 0) {
                                objArr[x5n.z(i75, 3, 1)] = objArr3[i73];
                                i73++;
                            } else {
                                i24 = 0;
                            }
                        }
                        i24 = i89;
                    }
                    int i97 = i94 + i94;
                    Object obj = objArr3[i97];
                    int i98 = i24;
                    if (obj instanceof Field) {
                        k2 = (Field) obj;
                    } else {
                        k2 = d.k(cls2, (String) obj);
                        objArr3[i97] = k2;
                    }
                    iArr2 = iArr6;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(k2);
                    int i99 = i97 + 1;
                    Object obj2 = objArr3[i99];
                    if (obj2 instanceof Field) {
                        k3 = (Field) obj2;
                    } else {
                        k3 = d.k(cls2, (String) obj2);
                        objArr3[i99] = k3;
                    }
                    i16 = (int) unsafe.objectFieldOffset(k3);
                    iArr3 = iArr;
                    i20 = objectFieldOffset2;
                    i89 = i98;
                    i17 = i96;
                    i19 = 0;
                } else {
                    iArr2 = iArr6;
                    int i100 = i73 + 1;
                    Field k4 = d.k(cls2, (String) objArr3[i73]);
                    if (i87 == 9 || i87 == 17) {
                        iArr3 = iArr;
                        objArr[x5n.z(i75, 3, 1)] = k4.getType();
                    } else {
                        if (i87 == 27) {
                            iArr3 = iArr;
                            i21 = 3;
                            i22 = 1;
                            i73 += 2;
                        } else if (i87 == 49) {
                            i73 += 2;
                            iArr3 = iArr;
                            i21 = 3;
                            i22 = 1;
                        } else {
                            if (i87 == 12 || i87 == 30 || i87 == 44) {
                                iArr3 = iArr;
                                if (b.a() == 1 || i89 != 0) {
                                    i73 += 2;
                                    objArr[x5n.z(i75, 3, 1)] = objArr3[i100];
                                } else {
                                    i73 = i100;
                                    i89 = 0;
                                }
                            } else if (i87 == 50) {
                                int i101 = i73 + 2;
                                int i102 = i74 + 1;
                                iArr[i74] = i75;
                                int i103 = i75 / 3;
                                int i104 = i103 + i103;
                                objArr[i104] = objArr3[i100];
                                if (i89 != 0) {
                                    i73 += 3;
                                    objArr[i104 + 1] = objArr3[i101];
                                    i74 = i102;
                                } else {
                                    i73 = i101;
                                    i74 = i102;
                                    i89 = 0;
                                }
                                iArr3 = iArr;
                            } else {
                                iArr3 = iArr;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(k4);
                            i16 = 1048575;
                            if ((charAt20 & 4096) != 0 || i87 > 17) {
                                i17 = i15;
                                i18 = 0;
                            } else {
                                int i105 = i15 + 1;
                                int charAt22 = str.charAt(i15);
                                if (charAt22 >= 55296) {
                                    int i106 = charAt22 & 8191;
                                    int i107 = 13;
                                    while (true) {
                                        i17 = i105 + 1;
                                        charAt8 = str.charAt(i105);
                                        if (charAt8 < 55296) {
                                            break;
                                        }
                                        i106 |= (charAt8 & 8191) << i107;
                                        i107 += 13;
                                        i105 = i17;
                                    }
                                    charAt22 = i106 | (charAt8 << i107);
                                } else {
                                    i17 = i105;
                                }
                                int i108 = (charAt22 / 32) + i68 + i68;
                                Object obj3 = objArr3[i108];
                                if (obj3 instanceof Field) {
                                    k = (Field) obj3;
                                } else {
                                    k = d.k(cls2, (String) obj3);
                                    objArr3[i108] = k;
                                }
                                i18 = charAt22 % 32;
                                i16 = (int) unsafe.objectFieldOffset(k);
                            }
                            if (i87 >= 18 || i87 > 49) {
                                i19 = i18;
                                i20 = objectFieldOffset;
                            } else {
                                iArr3[i88] = objectFieldOffset;
                                i19 = i18;
                                i20 = objectFieldOffset;
                                i88++;
                            }
                        }
                        objArr[x5n.z(i75, i21, i22)] = objArr3[i100];
                        objectFieldOffset = (int) unsafe.objectFieldOffset(k4);
                        i16 = 1048575;
                        if ((charAt20 & 4096) != 0) {
                        }
                        i17 = i15;
                        i18 = 0;
                        if (i87 >= 18) {
                        }
                        i19 = i18;
                        i20 = objectFieldOffset;
                    }
                    i73 = i100;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(k4);
                    i16 = 1048575;
                    if ((charAt20 & 4096) != 0) {
                    }
                    i17 = i15;
                    i18 = 0;
                    if (i87 >= 18) {
                    }
                    i19 = i18;
                    i20 = objectFieldOffset;
                }
                int i109 = i75 + 1;
                iArr2[i75] = i86;
                int i110 = i75 + 2;
                String str2 = str;
                iArr2[i109] = ((charAt20 & 512) != 0 ? 536870912 : 0) | ((charAt20 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i89 != 0 ? Integer.MIN_VALUE : 0) | (i87 << 20) | i20;
                i75 += 3;
                iArr2[i110] = (i19 << 20) | i16;
                i72 = i17;
                str = str2;
                length = i78;
                i71 = i88;
                objArr4 = objArr;
                iArr = iArr3;
                iArr6 = iArr2;
            }
            eVar = new d(iArr6, objArr4, b.a, iArr, i5, ubfVar3, omfVar2);
        }
        Charset charset2 = zzym.a;
        bgp bgpVar2 = (bgp) concurrentHashMap.putIfAbsent(cls, eVar);
        return bgpVar2 != null ? bgpVar2 : eVar;
    }
}
