package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hk implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hk(xva xvaVar, gv9 gv9Var, boolean z, n52 n52Var, Function1 function1, Context context) {
        this.c = xvaVar;
        this.f = gv9Var;
        this.b = z;
        this.d = n52Var;
        this.e = function1;
        this.g = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [w22] */
    /* JADX WARN: Type inference failed for: r17v2, types: [w22] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jdj jdjVar;
        dma dmaVar;
        dma dmaVar2;
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.c;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj6;
                kk kkVar = (kk) obj4;
                Brand brand = (Brand) obj3;
                gv9 gv9Var = (gv9) obj5;
                gv9 gv9Var2 = (gv9) obj2;
                OddsProvider provider = oddsCountryProvider.getProvider();
                provider.getClass();
                yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
                if (defaultBetSlipLink == null) {
                    defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
                }
                old oldVar = new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink());
                Event t = kkVar.t();
                t.getClass();
                OddsEventUIModel oddsEventUIModel = new OddsEventUIModel(t.getId(), o3a.F(t.getTournament()), t.getStatusType(), ok3.s(t), t.shouldReverseTeams());
                if (brand != null) {
                    Context i4 = kkVar.i();
                    int id = brand.getId();
                    String slug = brand.getSlug();
                    BrandColors color = brand.getColor();
                    r3 = color != null ? tz9.E(color, i4) : null;
                    if (r3 != null) {
                        try {
                            i2 = Color.parseColor(r3);
                        } catch (Exception unused) {
                        }
                    }
                    r3 = new w22(id, slug, hkg.b(i2), brand.getUrl());
                }
                break;
            case 1:
                q5b q5bVar = (q5b) obj6;
                e1d e1dVar = q5bVar.o;
                s8l s8lVar = (s8l) obj4;
                tbj tbjVar = (tbj) obj3;
                wcj wcjVar = (wcj) obj5;
                nnd nndVar = (nnd) obj2;
                dma dmaVar3 = (dma) obj;
                q5bVar.h = dmaVar3;
                bej d = q5bVar.d();
                if (d != null) {
                    d.b = dmaVar3;
                }
                if (this.b) {
                    if (q5bVar.a() == p69.b) {
                        if (((Boolean) ((eoh) q5bVar.l).getValue()).booleanValue() && ((ata) s8lVar).b()) {
                            tbjVar.s();
                        } else {
                            tbjVar.m();
                        }
                        ((eoh) q5bVar.m).setValue(Boolean.valueOf(u0a.E(tbjVar, true)));
                        ((eoh) q5bVar.n).setValue(Boolean.valueOf(u0a.E(tbjVar, false)));
                        ((eoh) e1dVar).setValue(Boolean.valueOf(pej.d(wcjVar.b)));
                    } else if (q5bVar.a() == p69.c) {
                        ((eoh) e1dVar).setValue(Boolean.valueOf(u0a.E(tbjVar, true)));
                    }
                    l98.Z(q5bVar, wcjVar, nndVar);
                    bej d2 = q5bVar.d();
                    if (d2 != null && (jdjVar = q5bVar.e) != null && q5bVar.b() && (dmaVar = d2.b) != null && dmaVar.f() && (dmaVar2 = d2.c) != null) {
                        aej aejVar = d2.a;
                        oi oiVar = new oi(dmaVar, 18);
                        oqf H = pea.H(dmaVar);
                        oqf p = dmaVar.p(dmaVar2, false);
                        if (Intrinsics.c((jdj) jdjVar.a.b.get(), jdjVar)) {
                            jdjVar.b.g(wcjVar, nndVar, aejVar, oiVar, H, p);
                        }
                    }
                }
                break;
            default:
                final xva xvaVar = (xva) obj6;
                gv9 gv9Var3 = (gv9) obj5;
                final Function1 function1 = (Function1) obj3;
                Context context = (Context) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                int i5 = 3;
                esa.b(esaVar, null, new tc3(1449795173, new k4k(1, function1, xvaVar, (n52) obj4, this.b), true), 3);
                yva yvaVar = xvaVar.m;
                gv9 gv9Var4 = xvaVar.g;
                int ordinal = yvaVar.ordinal();
                int i6 = 4;
                if (ordinal != 0) {
                    final int i7 = 2;
                    if (ordinal == 1) {
                        esa.d(esaVar, null, null, new tc3(910776569, new bba(xvaVar, i7), true), 3);
                        gv9 gv9Var5 = xvaVar.a;
                        esaVar.a(gv9Var5.size(), null, new xo(gv9Var5, 16), new tc3(2039820996, new wva(gv9Var5, xvaVar, context, i2), true));
                    } else if (ordinal == 2) {
                        esa.d(esaVar, null, null, new tc3(-812419087, new ct8() { // from class: uva
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i8 = i7;
                                a99 a99Var = nf3.a;
                                utc utcVar = utc.a;
                                Function1 function12 = function1;
                                xva xvaVar2 = xvaVar;
                                switch (i8) {
                                    case 0:
                                        of3 of3Var = (of3) obj8;
                                        int intValue = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                            gv9 gv9Var6 = xvaVar2.j;
                                            Integer valueOf = Integer.valueOf(xvaVar2.n);
                                            boolean g = av8Var.g(function12);
                                            Object O = av8Var.O();
                                            if (g || O == a99Var) {
                                                O = new uj8(9, function12);
                                                av8Var.n0(O);
                                            }
                                            l4a.a(gv9Var6, valueOf, (Function1) O, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var, 0, 48);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    case 1:
                                        of3 of3Var2 = (of3) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var2 = (av8) of3Var2;
                                        if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            gv9 gv9Var7 = xvaVar2.d;
                                            Integer valueOf2 = Integer.valueOf(xvaVar2.c);
                                            boolean g2 = av8Var2.g(function12);
                                            Object O2 = av8Var2.O();
                                            if (g2 || O2 == a99Var) {
                                                O2 = new uj8(8, function12);
                                                av8Var2.n0(O2);
                                            }
                                            l4a.a(gv9Var7, valueOf2, (Function1) O2, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var2, 0, 48);
                                        } else {
                                            av8Var2.W();
                                        }
                                        break;
                                    default:
                                        of3 of3Var3 = (of3) obj8;
                                        int intValue3 = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var3 = (av8) of3Var3;
                                        if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            String str = xvaVar2.k;
                                            long D = lz.D(R.color.surface_2, av8Var3);
                                            xtc b0 = l98.b0(n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var3), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 8.0f);
                                            boolean g3 = av8Var3.g(function12);
                                            Object O3 = av8Var3.O();
                                            if (g3 || O3 == a99Var) {
                                                O3 = new uj8(7, function12);
                                                av8Var3.n0(O3);
                                            }
                                            oea.d(str, (Function1) O3, b0, false, R.string.find_player_or_club, D, av8Var3, 3072, 0);
                                        } else {
                                            av8Var3.W();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        if (gv9Var4.isEmpty()) {
                            esa.d(esaVar, null, null, hkg.n, 3);
                        } else {
                            esaVar.a(gv9Var4.size(), null, new xo(gv9Var4, 18), new tc3(2039820996, new wva(gv9Var4, xvaVar, context, i3), true));
                        }
                    } else if (ordinal != 3 && ordinal != 4) {
                        zzl.b();
                        break;
                    } else {
                        yva yvaVar2 = yva.PICKS;
                        gv9 gv9Var6 = yvaVar == yvaVar2 ? xvaVar.e : xvaVar.f;
                        gv9 gv9Var7 = yvaVar == yvaVar2 ? xvaVar.h : xvaVar.i;
                        esa.d(esaVar, null, null, new tc3(739235442, new ct8() { // from class: uva
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i8 = i2;
                                a99 a99Var = nf3.a;
                                utc utcVar = utc.a;
                                Function1 function12 = function1;
                                xva xvaVar2 = xvaVar;
                                switch (i8) {
                                    case 0:
                                        of3 of3Var = (of3) obj8;
                                        int intValue = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                            gv9 gv9Var62 = xvaVar2.j;
                                            Integer valueOf = Integer.valueOf(xvaVar2.n);
                                            boolean g = av8Var.g(function12);
                                            Object O = av8Var.O();
                                            if (g || O == a99Var) {
                                                O = new uj8(9, function12);
                                                av8Var.n0(O);
                                            }
                                            l4a.a(gv9Var62, valueOf, (Function1) O, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var, 0, 48);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    case 1:
                                        of3 of3Var2 = (of3) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var2 = (av8) of3Var2;
                                        if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            gv9 gv9Var72 = xvaVar2.d;
                                            Integer valueOf2 = Integer.valueOf(xvaVar2.c);
                                            boolean g2 = av8Var2.g(function12);
                                            Object O2 = av8Var2.O();
                                            if (g2 || O2 == a99Var) {
                                                O2 = new uj8(8, function12);
                                                av8Var2.n0(O2);
                                            }
                                            l4a.a(gv9Var72, valueOf2, (Function1) O2, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var2, 0, 48);
                                        } else {
                                            av8Var2.W();
                                        }
                                        break;
                                    default:
                                        of3 of3Var3 = (of3) obj8;
                                        int intValue3 = ((Integer) obj9).intValue();
                                        ((xpa) obj7).getClass();
                                        av8 av8Var3 = (av8) of3Var3;
                                        if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            String str = xvaVar2.k;
                                            long D = lz.D(R.color.surface_2, av8Var3);
                                            xtc b0 = l98.b0(n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var3), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 8.0f);
                                            boolean g3 = av8Var3.g(function12);
                                            Object O3 = av8Var3.O();
                                            if (g3 || O3 == a99Var) {
                                                O3 = new uj8(7, function12);
                                                av8Var3.n0(O3);
                                            }
                                            oea.d(str, (Function1) O3, b0, false, R.string.find_player_or_club, D, av8Var3, 3072, 0);
                                        } else {
                                            av8Var3.W();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        esaVar.a(gv9Var6.size(), null, new uk1(8, gv9Var6), new tc3(2039820996, new l46(gv9Var6, gv9Var6, context, i5), true));
                        esa.d(esaVar, null, null, new tc3(-873182309, new k73(i7, gv9Var7), true), 3);
                    }
                } else {
                    esa.d(esaVar, null, null, new tc3(1930893680, new ct8() { // from class: uva
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i8 = i3;
                            a99 a99Var = nf3.a;
                            utc utcVar = utc.a;
                            Function1 function12 = function1;
                            xva xvaVar2 = xvaVar;
                            switch (i8) {
                                case 0:
                                    of3 of3Var = (of3) obj8;
                                    int intValue = ((Integer) obj9).intValue();
                                    ((xpa) obj7).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        gv9 gv9Var62 = xvaVar2.j;
                                        Integer valueOf = Integer.valueOf(xvaVar2.n);
                                        boolean g = av8Var.g(function12);
                                        Object O = av8Var.O();
                                        if (g || O == a99Var) {
                                            O = new uj8(9, function12);
                                            av8Var.n0(O);
                                        }
                                        l4a.a(gv9Var62, valueOf, (Function1) O, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var, 0, 48);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                case 1:
                                    of3 of3Var2 = (of3) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    ((xpa) obj7).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        gv9 gv9Var72 = xvaVar2.d;
                                        Integer valueOf2 = Integer.valueOf(xvaVar2.c);
                                        boolean g2 = av8Var2.g(function12);
                                        Object O2 = av8Var2.O();
                                        if (g2 || O2 == a99Var) {
                                            O2 = new uj8(8, function12);
                                            av8Var2.n0(O2);
                                        }
                                        l4a.a(gv9Var72, valueOf2, (Function1) O2, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), null, false, av8Var2, 0, 48);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                                default:
                                    of3 of3Var3 = (of3) obj8;
                                    int intValue3 = ((Integer) obj9).intValue();
                                    ((xpa) obj7).getClass();
                                    av8 av8Var3 = (av8) of3Var3;
                                    if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str = xvaVar2.k;
                                        long D = lz.D(R.color.surface_2, av8Var3);
                                        xtc b0 = l98.b0(n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var3), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 8.0f);
                                        boolean g3 = av8Var3.g(function12);
                                        Object O3 = av8Var3.O();
                                        if (g3 || O3 == a99Var) {
                                            O3 = new uj8(7, function12);
                                            av8Var3.n0(O3);
                                        }
                                        oea.d(str, (Function1) O3, b0, false, R.string.find_player_or_club, D, av8Var3, 3072, 0);
                                    } else {
                                        av8Var3.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 3);
                    esa.d(esaVar, null, null, hkg.m, 3);
                    esaVar.a(gv9Var3.size(), null, new xo(gv9Var3, 17), new tc3(2039820996, new l46(gv9Var3, gv9Var3, context, i6), true));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hk(q5b q5bVar, boolean z, s8l s8lVar, tbj tbjVar, wcj wcjVar, nnd nndVar) {
        this.c = q5bVar;
        this.b = z;
        this.d = s8lVar;
        this.e = tbjVar;
        this.f = wcjVar;
        this.g = nndVar;
    }

    public /* synthetic */ hk(OddsCountryProvider oddsCountryProvider, kk kkVar, Brand brand, gv9 gv9Var, gv9 gv9Var2, boolean z) {
        this.c = oddsCountryProvider;
        this.d = kkVar;
        this.e = brand;
        this.f = gv9Var;
        this.g = gv9Var2;
        this.b = z;
    }
}
