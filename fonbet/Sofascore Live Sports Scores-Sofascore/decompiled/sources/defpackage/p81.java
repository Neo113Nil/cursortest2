package defpackage;

import android.content.Context;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class p81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p81(BrandingEvent brandingEvent, w3f w3fVar, g4f g4fVar, boolean z) {
        this.a = 17;
        this.c = brandingEvent;
        this.d = w3fVar;
        this.e = g4fVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r13 r13Var;
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u6h.a((pl0) obj5, (BaseballActionOutcome) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fqj.b(this.b, (gv9) obj5, (gv9) obj4, (gv9) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gr1.b((String) obj5, (gv9) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ml4.k((l83) obj5, (Function1) obj4, (xtc) obj3, this.b, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                wnn.h(this.b, (ev6) obj5, (BrandingFantasyCompetition) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                un0.j((ev6) obj5, (Function1) obj4, (xtc) obj3, this.b, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                tol.f((il8) obj5, this.b, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pd0.e((fo7) obj5, (xtc) obj3, this.b, (Function0) obj4, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                j72.i((t77) obj5, this.b, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                fkf.i((FantasyPlayerPriceChanges) obj5, (Function1) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                fkf.k((oz6) obj5, this.b, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                aik.e((nua) obj5, this.b, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                s6a.e((Integer) obj5, (gv9) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                v7a.a((o8d) obj5, this.b, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ufd.d((ghd) obj5, this.b, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                nrd.a((OnboardingItemUiModel) obj5, this.b, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(3073));
                break;
            case 16:
                ((Integer) obj2).getClass();
                qea.f((Player) obj5, (Integer) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                BrandingEvent brandingEvent = (BrandingEvent) obj5;
                w3f w3fVar = (w3f) obj4;
                g4f g4fVar = (g4f) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Context context = (Context) av8Var.k(nz.b);
                    if (brandingEvent != null) {
                        av8Var.d0(1992782338);
                        Brand brand = brandingEvent.getBrand();
                        BrandColors color = brand != null ? brand.getColor() : null;
                        if (color == null) {
                            av8Var.d0(1992829736);
                            av8Var.s(false);
                            r13Var = null;
                        } else {
                            av8Var.d0(-1182641159);
                            long D = tz9.D(color, av8Var);
                            av8Var.s(false);
                            r13Var = new r13(D);
                        }
                        s02.b(r13Var, brand != null ? Integer.valueOf(brand.getId()) : null, brand != null ? brand.getUrl() : null, brand != null ? brand.getSlug() : null, BrandLocation.WhoWillWin, w3fVar.q, null, null, null, lz.D(R.color.surface_1, av8Var), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, yqo.H(411310822, av8Var, new a93(g4fVar, w3fVar, this.b, context, 8)), av8Var, 1597440, 3078, 6528);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1995950941);
                        r4a.g(w3fVar, g4fVar.l, g4fVar.m, g4fVar.n, g4fVar.o, g4fVar.p, g4fVar.q, g4fVar.r, g4fVar.s, g4fVar.t, null, av8Var, 0);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                ufa.d(this.b, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                fz8.z((sz1) obj5, this.b, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                aba.m((String) obj5, (svi) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 21:
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) obj5;
                w1i w1iVar = (w1i) obj4;
                List<UniqueTournament> list = (List) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    av8Var2.d0(-222037168);
                    xbb b = a.b();
                    b.add(new oxh(null, teamEventsFragment.getString(R.string.all_competitions), null, null, null, false, 252));
                    av8Var2.d0(-222028706);
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (UniqueTournament uniqueTournament : list) {
                        arrayList.add(new oxh(uniqueTournament, tba.x(uniqueTournament), yqo.H(-932385040, av8Var2, new fwe(uniqueTournament, i2)), null, null, false, 248));
                    }
                    av8Var2.s(false);
                    b.addAll(arrayList);
                    xbb a = a.a(b);
                    av8Var2.s(false);
                    gv9 W = l6g.W(a);
                    Iterator<E> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            UniqueTournament uniqueTournament2 = (UniqueTournament) ((oxh) next).a;
                            Integer valueOf = uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null;
                            UniqueTournament uniqueTournament3 = (UniqueTournament) ((eoh) teamEventsFragment.E().q).getValue();
                            if (Intrinsics.c(valueOf, uniqueTournament3 != null ? Integer.valueOf(uniqueTournament3.getId()) : null)) {
                                r4 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) r4;
                    uxh uxhVar = this.b ? rxh.i : sxh.i;
                    boolean i3 = av8Var2.i(teamEventsFragment) | av8Var2.g(w1iVar);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new dvi(4, teamEventsFragment, w1iVar);
                        av8Var2.n0(O);
                    }
                    r4a.j(W, oxhVar, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                } else {
                    av8Var2.W();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                rrj.c((prj) obj5, (String) obj4, this.b, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                x2a.o((gv9) obj5, this.b, (ct8) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                k53.V((xdk) obj5, (gv9) obj4, (xtc) obj3, this.b, (of3) obj, aba.K(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                pd0.h((String) obj5, (String) obj4, this.b, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                b0a.x((efl) obj5, this.b, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                d7a.n((yil) obj5, (Function1) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                sha.n((tlf) obj5, (Function0) obj4, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p81(fo7 fo7Var, xtc xtcVar, boolean z, Function0 function0, int i) {
        this.a = 7;
        this.c = fo7Var;
        this.e = xtcVar;
        this.b = z;
        this.d = function0;
    }

    public /* synthetic */ p81(Object obj, Object obj2, xtc xtcVar, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = xtcVar;
        this.b = z;
    }

    public /* synthetic */ p81(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ p81(Object obj, boolean z, dt8 dt8Var, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.d = dt8Var;
        this.e = obj2;
    }

    public /* synthetic */ p81(Object obj, boolean z, xtc xtcVar, Function1 function1, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.e = xtcVar;
        this.d = function1;
    }

    public /* synthetic */ p81(boolean z, TeamEventsFragment teamEventsFragment, w1i w1iVar, List list) {
        this.a = 21;
        this.b = z;
        this.c = teamEventsFragment;
        this.d = w1iVar;
        this.e = list;
    }

    public /* synthetic */ p81(boolean z, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
