package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzawb implements zzaws {
    public static final /* synthetic */ zzawb b;
    public static final /* synthetic */ zzawb c;
    public static final /* synthetic */ zzawb d;
    public static final /* synthetic */ zzawb e;
    public static final /* synthetic */ zzawb f;
    public static final /* synthetic */ zzawb g;
    public static final /* synthetic */ zzawb h;
    public static final /* synthetic */ zzawb i;
    public static final /* synthetic */ zzawb j;
    public static final /* synthetic */ zzawb k;
    public static final /* synthetic */ zzawb l;
    public static final /* synthetic */ zzawb m;
    public static final /* synthetic */ zzawb n;
    public static final /* synthetic */ zzawb o;
    public static final /* synthetic */ zzawb p;
    public static final /* synthetic */ zzawb q;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i4 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i5 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i6 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i7 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i8 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i9 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i10 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i11 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i12 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i13 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        q = new zzawb((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        p = new zzawb((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        o = new zzawb(i13);
        n = new zzawb(i4);
        m = new zzawb(i5);
        l = new zzawb(i6);
        k = new zzawb(i3);
        j = new zzawb(i7);
        i = new zzawb(i8);
        h = new zzawb(i9);
        g = new zzawb(i2);
        f = new zzawb(i10);
        e = new zzawb(i11);
        d = new zzawb(i12);
        c = new zzawb(1);
        b = new zzawb(0);
    }

    public /* synthetic */ zzawb(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzavk zzavkVar;
        zzaxa zzaxaVar;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.a) {
                                case 0:
                                    return ((zzawv) obj).a();
                                case 1:
                                    try {
                                        zzawr zzawrVar = ((zzawv) obj).b;
                                        long m2 = zzawrVar.c().m();
                                        zzaxa c2 = zzawrVar.c();
                                        List o2 = c2.o();
                                        if (m2 < 0) {
                                            m2 += ((ArrayList) o2).size();
                                        }
                                        if (m2 >= 0) {
                                            ArrayList arrayList = (ArrayList) o2;
                                            if (m2 < arrayList.size()) {
                                                arrayList.remove((int) m2);
                                                zzawrVar.b(c2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new zzawy();
                                    } catch (zzawy unused) {
                                        zzavkVar = zzavk.J;
                                        break;
                                    }
                                case 2:
                                    zzawv zzawvVar = (zzawv) obj;
                                    zzawr zzawrVar2 = zzawvVar.b;
                                    zzaxa c3 = zzawrVar2.c();
                                    zzawe n2 = zzawrVar2.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    c3.k(byteArrayOutputStream);
                                    zzawvVar.b.b(zzaxa.d(n2.d(zzawe.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzawv zzawvVar2 = (zzawv) obj;
                                    zzawr zzawrVar3 = zzawvVar2.b;
                                    zzaxa c4 = zzawrVar3.c();
                                    zzawe n3 = zzawrVar3.c().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzawa.b(c4.m(), new zzawz(byteArrayOutputStream2), false);
                                    zzawvVar2.b.b(zzaxa.d(n3.d(zzawe.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzawv zzawvVar3 = (zzawv) obj;
                                    zzawj zzawjVar = zzawvVar3.d;
                                    zzawr zzawrVar4 = zzawvVar3.b;
                                    zzawrVar4.a.set(zzawrVar4.a(-(zzawvVar3.c.b().b + zzawjVar.f())), zzawrVar4.c());
                                    return Optional.empty();
                                case 5:
                                    zzawr zzawrVar5 = ((zzawv) obj).b;
                                    zzawrVar5.b(zzaxa.b(zzawrVar5.c().m() << ((int) zzawrVar5.c().m())));
                                    return Optional.empty();
                                case 6:
                                    zzawr zzawrVar6 = ((zzawv) obj).b;
                                    zzawrVar6.b(zzaxa.b(zzawrVar6.c().m() >>> ((int) zzawrVar6.c().m())));
                                    return Optional.empty();
                                case 7:
                                    zzawr zzawrVar7 = ((zzawv) obj).b;
                                    zzawrVar7.b(zzaxa.c(zzawrVar7.c().q() - zzawrVar7.c().q()));
                                    return Optional.empty();
                                case 8:
                                    zzawr zzawrVar8 = ((zzawv) obj).b;
                                    zzawrVar8.b(zzaxa.b(zzawrVar8.c().m() - zzawrVar8.c().m()));
                                    return Optional.empty();
                                case 9:
                                    zzawv zzawvVar4 = (zzawv) obj;
                                    zzawr zzawrVar9 = zzawvVar4.b;
                                    long m3 = zzawrVar9.c().m();
                                    zzaxa c5 = zzawrVar9.c();
                                    zzawr zzawrVar10 = zzawvVar4.b;
                                    zzaxa d2 = zzawrVar10.d(m3);
                                    zzawrVar10.a.set(zzawrVar10.a(m3), c5);
                                    zzawrVar10.b(d2);
                                    return Optional.empty();
                                case 10:
                                    zzawv zzawvVar5 = (zzawv) obj;
                                    zzawr zzawrVar11 = zzawvVar5.b;
                                    long m4 = zzawvVar5.c.b().b + zzawrVar11.c().m();
                                    zzaxa c6 = zzawrVar11.c();
                                    zzawr zzawrVar12 = zzawvVar5.b;
                                    long j2 = -m4;
                                    zzaxa d3 = zzawrVar12.d(j2);
                                    zzawrVar12.a.set(zzawrVar12.a(j2), c6);
                                    zzawrVar12.b(d3);
                                    return Optional.empty();
                                case 11:
                                    zzawv zzawvVar6 = (zzawv) obj;
                                    zzawj zzawjVar2 = zzawvVar6.d;
                                    zzawr zzawrVar13 = zzawvVar6.b;
                                    long f2 = zzawvVar6.c.b().b + zzawjVar2.f();
                                    zzaxa c7 = zzawrVar13.c();
                                    long j3 = -f2;
                                    zzaxa d4 = zzawrVar13.d(j3);
                                    zzawrVar13.a.set(zzawrVar13.a(j3), c7);
                                    zzawrVar13.b(d4);
                                    return Optional.empty();
                                case 12:
                                    zzawv zzawvVar7 = (zzawv) obj;
                                    long m5 = zzawvVar7.b.c().m();
                                    try {
                                        zzawr zzawrVar14 = zzawvVar7.b;
                                        if (m5 == 0) {
                                            zzaxaVar = zzawrVar14.c();
                                        } else {
                                            zzawrVar14.b--;
                                            zzaxaVar = (zzaxa) zzawrVar14.a.remove(zzawrVar14.a(m5));
                                        }
                                        zzawrVar14.b(zzaxaVar);
                                        return Optional.empty();
                                    } catch (zzawp unused2) {
                                        zzavkVar = zzavk.h;
                                        break;
                                    }
                                case 13:
                                    zzawv zzawvVar8 = (zzawv) obj;
                                    try {
                                        zzawr zzawrVar15 = zzawvVar8.b;
                                        long m6 = zzawrVar15.c().m();
                                        long m7 = zzawrVar15.c().m();
                                        zzawo zzawoVar = zzawvVar8.c;
                                        zzawj zzawjVar3 = zzawvVar8.d;
                                        zzawoVar.a(zzawjVar3.b(), m7, zzawoVar.b().b);
                                        zzawjVar3.a(m6);
                                        return Optional.empty();
                                    } catch (zzawh | zzawi unused3) {
                                        zzavkVar = zzavk.s;
                                        break;
                                    } catch (zzawm unused4) {
                                        zzavkVar = zzavk.C;
                                        break;
                                    } catch (zzawn unused5) {
                                        zzavkVar = zzavk.x;
                                        break;
                                    }
                                case 14:
                                    zzawv zzawvVar9 = (zzawv) obj;
                                    try {
                                        zzawvVar9.b.b(zzaxa.g(zzawvVar9.b.c().l()));
                                        return Optional.empty();
                                    } catch (zzawx unused6) {
                                        zzavkVar = zzavk.q;
                                        break;
                                    }
                                default:
                                    try {
                                        zzawr zzawrVar16 = ((zzawv) obj).b;
                                        Iterator it = ((ArrayList) zzawrVar16.c().o()).iterator();
                                        while (it.hasNext()) {
                                            zzawrVar16.b((zzaxa) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzawq unused7) {
                                        zzavkVar = zzavk.b;
                                        break;
                                    }
                            }
                        } catch (zzawp unused8) {
                            zzavkVar = zzavk.i;
                        }
                    } catch (zzawq e2) {
                        e = e2;
                        throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzawg | zzawi | zzawx unused9) {
                    zzavkVar = zzavk.z;
                }
            } catch (zzawn | zzawp unused10) {
                zzavkVar = zzavk.y;
            }
        } catch (zzawx unused11) {
            zzavkVar = zzavk.l;
        } catch (IOException e3) {
            e = e3;
            throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzavkVar);
    }
}
