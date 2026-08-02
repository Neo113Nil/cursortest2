package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzavx implements zzaws {
    public static final /* synthetic */ zzavx b;
    public static final /* synthetic */ zzavx c;
    public static final /* synthetic */ zzavx d;
    public static final /* synthetic */ zzavx e;
    public static final /* synthetic */ zzavx f;
    public static final /* synthetic */ zzavx g;
    public static final /* synthetic */ zzavx h;
    public static final /* synthetic */ zzavx i;
    public static final /* synthetic */ zzavx j;
    public static final /* synthetic */ zzavx k;
    public static final /* synthetic */ zzavx l;
    public static final /* synthetic */ zzavx m;
    public static final /* synthetic */ zzavx n;
    public static final /* synthetic */ zzavx o;
    public static final /* synthetic */ zzavx p;
    public static final /* synthetic */ zzavx q;
    public static final /* synthetic */ zzavx r;
    public static final /* synthetic */ zzavx s;
    public static final /* synthetic */ zzavx t;
    public static final /* synthetic */ zzavx u;
    public static final /* synthetic */ zzavx v;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i3 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i4 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i5 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i6 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i7 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i8 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        v = new zzavx((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        u = new zzavx((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        t = new zzavx((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        s = new zzavx(i8);
        r = new zzavx(i5);
        q = new zzavx(i6);
        zzavx zzavxVar = new zzavx(i7);
        int i9 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i10 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i11 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i12 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i13 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i14 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i15 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i16 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i17 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        p = zzavxVar;
        o = new zzavx(i4);
        n = new zzavx(i9);
        m = new zzavx(i10);
        l = new zzavx(i11);
        k = new zzavx(i3);
        j = new zzavx(i12);
        i = new zzavx(i13);
        h = new zzavx(i14);
        g = new zzavx(i2);
        f = new zzavx(i15);
        e = new zzavx(i16);
        d = new zzavx(i17);
        c = new zzavx(1);
        b = new zzavx(0);
    }

    public /* synthetic */ zzavx(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        if (r1.equals("void") != false) goto L97;
     */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        zzavk zzavkVar;
        Object obj2;
        zzavk zzavkVar2;
        int i2 = this.a;
        long j2 = 1;
        Class<?> cls = Void.TYPE;
        Object obj3 = null;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        switch (i2) {
                            case 0:
                                zzawr zzawrVar = ((zzawv) obj).b;
                                zzawrVar.b(zzaxa.b(zzawrVar.c().m() + zzawrVar.c().m()));
                                return Optional.empty();
                            case 1:
                                zzawr zzawrVar2 = ((zzawv) obj).b;
                                zzawrVar2.b(zzaxa.c(zzawrVar2.c().q() + zzawrVar2.c().q()));
                                return Optional.empty();
                            case 2:
                                zzawr zzawrVar3 = ((zzawv) obj).b;
                                zzawrVar3.b(zzaxa.d(zzawrVar3.c().n().d(zzawrVar3.c().n())));
                                return Optional.empty();
                            case 3:
                                zzawv zzawvVar = (zzawv) obj;
                                try {
                                    long f2 = zzawvVar.d.f();
                                    for (long j3 = 0; j3 < f2; j3++) {
                                        zzawvVar.b.b(zzaxa.a(null));
                                    }
                                    return Optional.empty();
                                } catch (zzawq unused) {
                                    zzavkVar = zzavk.b;
                                    return Optional.of(zzavkVar);
                                }
                            case 4:
                                zzawr zzawrVar4 = ((zzawv) obj).b;
                                zzawrVar4.b(zzaxa.b(zzawrVar4.c().m() & zzawrVar4.c().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j4 = jArr[0];
                                long j5 = jArr[1];
                                long j6 = jArr[2];
                                long j7 = jArr[3];
                                long j8 = jArr[4];
                                long j9 = jArr[5];
                                long j10 = jArr[6];
                                long j11 = jArr[7];
                                long j12 = (((((~j4) & j5) | j6) + ((j4 & j7) | j8)) - j9) + j10;
                                long j13 = j11 % 102194872;
                                zzawr zzawrVar5 = ((zzawv) obj).b;
                                zzawrVar5.b(zzaxa.b(zzawrVar5.c().m() ^ (j12 ^ j13)));
                                return Optional.empty();
                            case 6:
                                zzawr zzawrVar6 = ((zzawv) obj).b;
                                zzawrVar6.b(zzaxa.b(zzawrVar6.c().m() | zzawrVar6.c().m()));
                                return Optional.empty();
                            case 7:
                                zzawr zzawrVar7 = ((zzawv) obj).b;
                                zzawrVar7.b(zzaxa.b(zzawrVar7.c().m() ^ zzawrVar7.c().m()));
                                return Optional.empty();
                            case 8:
                                zzawv zzawvVar2 = (zzawv) obj;
                                try {
                                    long m2 = zzawvVar2.b.c().m();
                                    zzawo zzawoVar = zzawvVar2.c;
                                    zzawj zzawjVar = zzawvVar2.d;
                                    zzawoVar.a(zzawjVar.b(), 0L, r1.b);
                                    zzawjVar.a(m2);
                                    return Optional.empty();
                                } catch (zzawh | zzawi unused2) {
                                    zzavkVar = zzavk.s;
                                    return Optional.of(zzavkVar);
                                } catch (zzawm unused3) {
                                    zzavkVar = zzavk.C;
                                    return Optional.of(zzavkVar);
                                }
                            case 9:
                                try {
                                    zzawr zzawrVar8 = ((zzawv) obj).b;
                                    long m3 = zzawrVar8.c().m();
                                    ArrayList arrayList = (ArrayList) zzawrVar8.c().o();
                                    int size = arrayList.size();
                                    Object h2 = zzawrVar8.c().h();
                                    Object l2 = zzawrVar8.c().l();
                                    if (l2 instanceof Method) {
                                        Method method = (Method) l2;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (h2 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) h2).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((zzaxa) arrayList.get(0)).o();
                                                if (arrayList2.size() == length) {
                                                    int i4 = 0;
                                                    while (i4 < arrayList2.size()) {
                                                        objArr2[i4] = ((zzaxa) arrayList2.get(i4)).i(parameterTypes2[i4]);
                                                        i4++;
                                                        obj3 = obj3;
                                                    }
                                                    obj2 = obj3;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                obj2 = null;
                                                while (i3 < size) {
                                                    objArr[i3] = ((zzaxa) arrayList.get(i3)).i(parameterTypes[i3]);
                                                    i3++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(h2, objArr);
                                                zzawrVar8.b((method.getReturnType() == Void.class || method.getReturnType() == cls) ? zzaxa.a(obj2) : m3 != 0 ? zzaxa.g(invoke) : zzaxa.a(invoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzavkVar = zzavk.r;
                                                return Optional.of(zzavkVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzavk.q);
                                } catch (zzawx unused5) {
                                    zzavkVar = zzavk.q;
                                }
                                break;
                            case 10:
                                zzawv zzawvVar3 = (zzawv) obj;
                                zzawr zzawrVar9 = zzawvVar3.b;
                                int intExact = Math.toIntExact(zzawrVar9.c().m());
                                zzawe n2 = zzawrVar9.c().n();
                                zzawe n3 = zzawrVar9.c().n();
                                if (n2.a.length != 16) {
                                    return Optional.of(zzavk.I);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(n2.a()).asIntBuffer().get(iArr);
                                zzavw zzavwVar = new zzavw(intExact, iArr);
                                byte[] a = n3.a();
                                byte[] bArr = new byte[8];
                                int i5 = 0;
                                while (i5 < a.length) {
                                    if (i5 % 8 != 0) {
                                        if (i5 == 0) {
                                            i5 = 0;
                                        } else {
                                            a[i5] = (byte) (((a[i5] ^ bArr[i5 % 8]) << 24) >> 24);
                                            i5++;
                                        }
                                    }
                                    zzavwVar.a(i5 >>> 3, bArr);
                                    a[i5] = (byte) (((a[i5] ^ bArr[i5 % 8]) << 24) >> 24);
                                    i5++;
                                }
                                zzawvVar3.b.b(zzaxa.d(zzawe.e(a)));
                                return Optional.empty();
                            case 11:
                                zzawr zzawrVar10 = ((zzawv) obj).b;
                                double q2 = zzawrVar10.c().q();
                                double q3 = zzawrVar10.c().q();
                                if (q2 == 0.0d) {
                                    zzavkVar2 = zzavk.G;
                                    return Optional.of(zzavkVar2);
                                }
                                zzawrVar10.b(zzaxa.c(q3 / q2));
                                return Optional.empty();
                            case 12:
                                zzawr zzawrVar11 = ((zzawv) obj).b;
                                long m4 = zzawrVar11.c().m();
                                long m5 = zzawrVar11.c().m();
                                if (m4 == 0) {
                                    zzavkVar2 = zzavk.G;
                                    return Optional.of(zzavkVar2);
                                }
                                zzawrVar11.b(zzaxa.b(m5 / m4));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawv) obj).b.c();
                                    return Optional.empty();
                                } catch (zzawp unused6) {
                                    zzavkVar = zzavk.B;
                                    return Optional.of(zzavkVar);
                                }
                            case 14:
                                zzawv zzawvVar4 = (zzawv) obj;
                                long m6 = zzawvVar4.b.c().m();
                                zzawr zzawrVar12 = zzawvVar4.b;
                                zzawrVar12.b(zzaxa.j(zzawrVar12.d(m6)));
                                return Optional.empty();
                            case 15:
                                zzawv zzawvVar5 = (zzawv) obj;
                                long m7 = zzawvVar5.c.b().b + zzawvVar5.b.c().m();
                                zzawr zzawrVar13 = zzawvVar5.b;
                                zzawrVar13.b(zzaxa.j(zzawrVar13.d(-m7)));
                                return Optional.empty();
                            case 16:
                                zzawv zzawvVar6 = (zzawv) obj;
                                long f3 = zzawvVar6.c.b().b + zzawvVar6.d.f();
                                zzawr zzawrVar14 = zzawvVar6.b;
                                zzawrVar14.b(zzaxa.j(zzawrVar14.d(-f3)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzawr zzawrVar15 = ((zzawv) obj).b;
                                    if (new zzaww(true).compare(zzawrVar15.c(), zzawrVar15.c()) != 0) {
                                        j2 = 0;
                                    }
                                    zzawrVar15.b(zzaxa.b(j2));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzavkVar = zzavk.e;
                                    return Optional.of(zzavkVar);
                                }
                            case 18:
                                try {
                                    zzawr zzawrVar16 = ((zzawv) obj).b;
                                    String c2 = zzawrVar16.c().n().c();
                                    switch (c2.hashCode()) {
                                        case -1325958191:
                                            if (c2.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 104431:
                                            if (c2.equals("int")) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 3039496:
                                            if (c2.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 3052374:
                                            if (c2.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 3327612:
                                            if (c2.equals("long")) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 3625364:
                                            break;
                                        case 64711720:
                                            if (c2.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 97526364:
                                            if (c2.equals("float")) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        case 109413500:
                                            if (c2.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c2);
                                            break;
                                        default:
                                            cls = Class.forName(c2);
                                            break;
                                    }
                                    zzawrVar16.b(zzaxa.a(cls));
                                    return Optional.empty();
                                } catch (zzawx unused8) {
                                    zzavkVar = zzavk.m;
                                    return Optional.of(zzavkVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzavkVar = zzavk.n;
                                    return Optional.of(zzavkVar);
                                }
                            case 19:
                                try {
                                    zzawr zzawrVar17 = ((zzawv) obj).b;
                                    ArrayList arrayList3 = (ArrayList) zzawrVar17.c().o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (true) {
                                        if (i3 < arrayList3.size()) {
                                            Object l3 = ((zzaxa) arrayList3.get(i3)).l();
                                            if (l3 instanceof Class) {
                                                clsArr[i3] = (Class) l3;
                                                i3++;
                                            }
                                        } else {
                                            String c3 = zzawrVar17.c().n().c();
                                            Object l4 = zzawrVar17.c().l();
                                            if (l4 instanceof Class) {
                                                zzawrVar17.b(zzaxa.a(((Class) l4).getMethod(c3, clsArr)));
                                                return Optional.empty();
                                            }
                                        }
                                    }
                                    return Optional.of(zzavk.o);
                                } catch (zzawx unused10) {
                                    zzavkVar = zzavk.o;
                                    return Optional.of(zzavkVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzavkVar = zzavk.p;
                                    return Optional.of(zzavkVar);
                                } catch (SecurityException unused12) {
                                    zzavkVar = zzavk.D;
                                    return Optional.of(zzavkVar);
                                }
                            default:
                                zzawr zzawrVar18 = ((zzawv) obj).b;
                                long m8 = zzawrVar18.c().m();
                                zzaxa c4 = zzawrVar18.c();
                                zzaxa c5 = zzawrVar18.c();
                                int i6 = c5.g;
                                int i7 = i6 - 1;
                                if (i6 == 0) {
                                    throw null;
                                }
                                if (i7 == 3) {
                                    zzawe n4 = c5.n();
                                    if (m8 < 0) {
                                        m8 += n4.a.length;
                                    }
                                    if (c4.g != 4) {
                                        throw new zzawx();
                                    }
                                    if (m8 >= 0 && m8 < n4.a.length) {
                                        char charAt = n4.c().charAt((int) m8);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        c4 = zzaxa.d(zzawe.e(sb.toString().getBytes(Charset.forName(zzawc.a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i7 != 4) {
                                        throw new zzawx();
                                    }
                                    List o2 = c5.o();
                                    if (m8 < 0) {
                                        m8 += ((ArrayList) o2).size();
                                    }
                                    if (m8 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) o2;
                                        if (m8 < arrayList4.size()) {
                                            c4 = (zzaxa) arrayList4.get((int) m8);
                                        }
                                    }
                                }
                                zzawrVar18.b(c4);
                                return Optional.empty();
                        }
                    } catch (zzawq e2) {
                        throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e2);
                    }
                } catch (zzawn | zzawp unused13) {
                    zzavkVar = zzavk.y;
                }
            } catch (zzawg | zzawi | zzawx unused14) {
                zzavkVar = zzavk.z;
            }
        } catch (zzawp unused15) {
            zzavkVar = zzavk.g;
        }
    }
}
