package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzavy implements zzaws {
    public static final /* synthetic */ zzavy b;
    public static final /* synthetic */ zzavy c;
    public static final /* synthetic */ zzavy d;
    public static final /* synthetic */ zzavy e;
    public static final /* synthetic */ zzavy f;
    public static final /* synthetic */ zzavy g;
    public static final /* synthetic */ zzavy h;
    public static final /* synthetic */ zzavy i;
    public static final /* synthetic */ zzavy j;
    public static final /* synthetic */ zzavy k;
    public static final /* synthetic */ zzavy l;
    public static final /* synthetic */ zzavy m;
    public static final /* synthetic */ zzavy n;
    public static final /* synthetic */ zzavy o;
    public static final /* synthetic */ zzavy p;
    public static final /* synthetic */ zzavy q;
    public static final /* synthetic */ zzavy r;
    public static final /* synthetic */ zzavy s;
    public static final /* synthetic */ zzavy t;
    public static final /* synthetic */ zzavy u;
    public static final /* synthetic */ zzavy v;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i3 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i4 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i5 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i6 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i7 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i8 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        v = new zzavy((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        u = new zzavy((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        t = new zzavy((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        s = new zzavy(i8);
        r = new zzavy(i5);
        q = new zzavy(i6);
        zzavy zzavyVar = new zzavy(i7);
        int i9 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i10 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i11 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i12 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i13 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i14 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i15 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i16 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i17 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        p = zzavyVar;
        o = new zzavy(i4);
        n = new zzavy(i9);
        m = new zzavy(i10);
        l = new zzavy(i11);
        k = new zzavy(i3);
        j = new zzavy(i12);
        i = new zzavy(i13);
        h = new zzavy(i14);
        g = new zzavy(i2);
        f = new zzavy(i15);
        e = new zzavy(i16);
        d = new zzavy(i17);
        c = new zzavy(1);
        b = new zzavy(0);
    }

    public /* synthetic */ zzavy(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzavk zzavkVar;
        zzavk zzavkVar2;
        long j2 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.a) {
                                            case 0:
                                                zzawv zzawvVar = (zzawv) obj;
                                                zzawr zzawrVar = zzawvVar.b;
                                                long m2 = zzawrVar.c().m();
                                                if (zzawrVar.c().m() != 0) {
                                                    zzawvVar.d.a(m2);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzawr zzawrVar2 = ((zzawv) obj).b;
                                                    long m3 = zzawrVar2.c().m();
                                                    zzaxa c2 = zzawrVar2.c();
                                                    zzaxa c3 = zzawrVar2.c();
                                                    List o2 = c3.o();
                                                    if (m3 < 0) {
                                                        m3 += ((ArrayList) o2).size() + 1;
                                                    }
                                                    if (m3 >= 0) {
                                                        ArrayList arrayList = (ArrayList) o2;
                                                        if (m3 < arrayList.size() + 1) {
                                                            arrayList.add((int) m3, c2);
                                                            zzawrVar2.b(c3);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new zzawy();
                                                } catch (zzawy unused) {
                                                    zzavkVar = zzavk.J;
                                                    break;
                                                }
                                            case 2:
                                                zzawv zzawvVar2 = (zzawv) obj;
                                                zzawr zzawrVar3 = zzawvVar2.b;
                                                long m4 = zzawrVar3.c().m();
                                                if (zzawrVar3.c().m() == 0) {
                                                    zzawvVar2.d.a(m4);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((zzawv) obj).b.b(zzaxa.b(((ArrayList) r10.c().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((zzawv) obj).b.b(zzaxa.b(r10.c().n().a.length));
                                                return Optional.empty();
                                            case 5:
                                                zzawr zzawrVar4 = ((zzawv) obj).b;
                                                zzawrVar4.b(zzaxa.c(Math.log(zzawrVar4.c().q())));
                                                return Optional.empty();
                                            case 6:
                                                zzawr zzawrVar5 = ((zzawv) obj).b;
                                                long m5 = zzawrVar5.c().m();
                                                long m6 = zzawrVar5.c().m();
                                                if (m5 == 0 || m6 == 0) {
                                                    j2 = 0;
                                                }
                                                zzawrVar5.b(zzaxa.b(j2));
                                                return Optional.empty();
                                            case 7:
                                                zzawr zzawrVar6 = ((zzawv) obj).b;
                                                if (zzawrVar6.c().m() != 0) {
                                                    j2 = 0;
                                                }
                                                zzawrVar6.b(zzaxa.b(j2));
                                                return Optional.empty();
                                            case 8:
                                                zzawr zzawrVar7 = ((zzawv) obj).b;
                                                long m7 = zzawrVar7.c().m();
                                                long m8 = zzawrVar7.c().m();
                                                if (m7 == 0 && m8 == 0) {
                                                    j2 = 0;
                                                }
                                                zzawrVar7.b(zzaxa.b(j2));
                                                return Optional.empty();
                                            case 9:
                                                zzawv zzawvVar3 = (zzawv) obj;
                                                zzawr zzawrVar8 = zzawvVar3.b;
                                                try {
                                                    int compare = new zzaww(false).compare(zzawrVar8.c(), zzawrVar8.c());
                                                    zzawr zzawrVar9 = zzawvVar3.b;
                                                    if (compare >= 0) {
                                                        j2 = 0;
                                                    }
                                                    zzawrVar9.b(zzaxa.b(j2));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzavk.e);
                                                }
                                            case 10:
                                                zzawv zzawvVar4 = (zzawv) obj;
                                                try {
                                                    zzawr zzawrVar10 = zzawvVar4.b;
                                                    long m9 = zzawrVar10.c().m();
                                                    zzavq zzavqVar = zzawvVar4.a;
                                                    zzawr zzawrVar11 = new zzawr();
                                                    for (int i2 = 0; i2 < zzawrVar10.b; i2++) {
                                                        try {
                                                            zzawrVar11.b(zzaxa.j((zzaxa) zzawrVar10.a.get(i2)));
                                                        } catch (zzawq e2) {
                                                            throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e2);
                                                        }
                                                    }
                                                    zzawj zzawjVar = zzawvVar4.d;
                                                    zzawe zzaweVar = zzawjVar.b;
                                                    int i3 = zzawjVar.a;
                                                    zzavs zzc = zzawjVar.c.zzc();
                                                    zzavv zzavvVar = zzawjVar.d;
                                                    zzawj zzawjVar2 = new zzawj(zzaweVar, i3, zzc);
                                                    zzawjVar2.d = zzavvVar;
                                                    new zzawv(zzavqVar, zzawrVar11, zzawjVar2);
                                                    zzawjVar2.a(m9);
                                                    zzawrVar10.b(zzaxa.a(new zzawa()));
                                                    return Optional.empty();
                                                } catch (zzawh | zzawi unused3) {
                                                    zzavkVar = zzavk.u;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    zzawr zzawrVar12 = ((zzawv) obj).b;
                                                    zzawrVar12.b(zzaxa.a(zzawrVar12.c().i((Class) zzawrVar12.c().l())));
                                                    return Optional.empty();
                                                } catch (zzawx unused4) {
                                                    zzavkVar = zzavk.q;
                                                    break;
                                                }
                                            case 12:
                                                zzawr zzawrVar13 = ((zzawv) obj).b;
                                                long m10 = zzawrVar13.c().m();
                                                long m11 = zzawrVar13.c().m();
                                                if (m10 == 0) {
                                                    return Optional.of(zzavk.G);
                                                }
                                                zzawrVar13.b(zzaxa.b(m11 % m10));
                                                return Optional.empty();
                                            case 13:
                                                zzawr zzawrVar14 = ((zzawv) obj).b;
                                                zzawrVar14.b(zzaxa.c(zzawrVar14.c().q() * zzawrVar14.c().q()));
                                                return Optional.empty();
                                            case 14:
                                                zzawr zzawrVar15 = ((zzawv) obj).b;
                                                zzawrVar15.b(zzaxa.b(zzawrVar15.c().m() * zzawrVar15.c().m()));
                                                return Optional.empty();
                                            case 15:
                                                zzawr zzawrVar16 = ((zzawv) obj).b;
                                                long m12 = zzawrVar16.c().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j3 = 0; j3 < m12; j3++) {
                                                    arrayList2.add(zzawrVar16.c());
                                                }
                                                Collections.reverse(arrayList2);
                                                zzawrVar16.b(zzaxa.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                zzawr zzawrVar17 = ((zzawv) obj).b;
                                                zzawrVar17.b(zzaxa.c(Math.pow(zzawrVar17.c().q(), zzawrVar17.c().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzawv) obj).b.b(zzaxa.a(null));
                                                return Optional.empty();
                                            case 18:
                                                zzawv zzawvVar5 = (zzawv) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(zzawvVar5.d.e(64L).a());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzawvVar5.b.b(zzaxa.c(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzawv zzawvVar6 = (zzawv) obj;
                                                zzawvVar6.b.b(zzaxa.b(zzawvVar6.d.f()));
                                                return Optional.empty();
                                            default:
                                                zzawv zzawvVar7 = (zzawv) obj;
                                                zzawj zzawjVar3 = zzawvVar7.d;
                                                long f2 = zzawjVar3.f();
                                                if (f2 >= 0 && f2 <= 2147483647L) {
                                                    if ((7 & f2) != 0) {
                                                        zzavkVar2 = zzavk.f;
                                                        return Optional.of(zzavkVar2);
                                                    }
                                                    zzawvVar7.b.b(zzaxa.d(zzawjVar3.e(f2)));
                                                    return Optional.empty();
                                                }
                                                zzavkVar2 = zzavk.A;
                                                return Optional.of(zzavkVar2);
                                        }
                                    } catch (zzawx unused5) {
                                        zzavkVar = zzavk.z;
                                    }
                                } catch (zzawq e3) {
                                    e = e3;
                                    throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (zzawq unused6) {
                                zzavkVar = zzavk.b;
                            }
                        } catch (zzawi unused7) {
                            zzavkVar = zzavk.A;
                        }
                    } catch (zzawp unused8) {
                        zzavkVar = zzavk.y;
                    }
                } catch (zzawh e4) {
                    e = e4;
                    throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzawg unused9) {
                zzavkVar = zzavk.E;
            }
        } catch (zzawh | zzawi unused10) {
            zzavkVar = zzavk.j;
        }
        return Optional.of(zzavkVar);
    }
}
