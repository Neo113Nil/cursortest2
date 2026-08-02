package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.sofascore.local_persistance.BrandingBoostedOdds;
import com.sofascore.model.database.DbHomescreenFilter;
import com.sofascore.model.database.DisplayType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.AvailableSportFiltersResponse;
import com.sofascore.model.newNetwork.DateResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.model.newNetwork.FilterValue;
import com.sofascore.model.newNetwork.SportFilterCategory;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.unity3d.services.UnityAdsConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class va8 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;
    public Object v;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, LeagueEventsFragment leagueEventsFragment, rq3 rq3Var, LeagueEventsFragment leagueEventsFragment2) {
        super(2, rq3Var);
        this.r = 8;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = leagueEventsFragment;
        this.t = leagueEventsFragment2;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.v;
            e6b e6bVar = e6b.e;
            j8c j8cVar = new j8c((b1d) this.u, (MmaEventsWeekFragment) this.w, (rq3) null, (MmaEventsWeekFragment) this.t, 3);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, j8cVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.v;
            e6b e6bVar = e6b.c;
            j8c j8cVar = new j8c((b1d) this.u, (MmaFightNightFragment) this.w, (rq3) null, (MmaFightNightFragment) this.t, 5);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, j8cVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        Object q2gVar;
        vnc vncVar = (vnc) this.u;
        Gender gender = (Gender) this.t;
        String str = (String) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            Integer num = (Integer) this.v;
            if (num == null || str == null || gender == null) {
                q2gVar = new q2g(new Throwable());
                yzc yzcVar = vncVar.f;
                q2gVar.getClass();
                yzcVar.j(Boolean.valueOf(q2gVar instanceof v2g));
                return Unit.a;
            }
            pai paiVar = vncVar.e;
            int intValue = num.intValue();
            this.s = 1;
            paiVar.getClass();
            obj = yaa.P(new kai(paiVar, intValue, str, gender, null, 1), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        q2gVar = (x2g) obj;
        yzc yzcVar2 = vncVar.f;
        q2gVar.getClass();
        yzcVar2.j(Boolean.valueOf(q2gVar instanceof v2g));
        return Unit.a;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.v;
            e6b e6bVar = e6b.c;
            j8c j8cVar = new j8c((b1d) this.u, (MmaFighterEventsFragment) this.w, (rq3) null, (MmaFighterEventsFragment) this.t, 6);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, j8cVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object j(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            th2 B = yqo.B(k53.g0(new wf2(yso.q(new j8c((s5d) this.v, (String) this.w, rq3Var, 12)), 8), z45.a), ((u6b) this.t).getLifecycle(), e6b.d);
            f10 f10Var = new f10((h1) this.u, 14);
            this.s = 1;
            if (B.collect(f10Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (defpackage.o0h.S(r2, r1, r13) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        if (defpackage.d2a.m(r9, r0, r5, r8, r13, 4) == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        axj axjVar = (axj) this.u;
        trg trgVar = (trg) this.t;
        o0h o0hVar = (o0h) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.v;
            e1d e1dVar = o0hVar.d;
            xnh xnhVar = o0hVar.j;
            if (Intrinsics.c(((eoh) e1dVar).getValue(), trgVar)) {
                long h = axjVar.h() / 1000000;
                Pair pair = Intrinsics.c(((eoh) axjVar.d).getValue(), trgVar) ? new Pair(new Float(1.0f), new Integer((int) ((1.0f - xnhVar.h()) * h))) : new Pair(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new Integer((int) (xnhVar.h() * h)));
                float floatValue = ((Number) pair.a).floatValue();
                int intValue = ((Number) pair.b).intValue();
                float h2 = xnhVar.h();
                i4k h0 = s02.h0(intValue, 0, null, 6);
                q8b q8bVar = new q8b(ku3Var, floatValue, o0hVar, trgVar);
                this.s = 2;
            } else {
                this.s = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.o0h.S(r1, r0, r12) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (defpackage.d2a.m(r10, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r3, r3, r12, 4) == r6) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        d6d d6dVar = (d6d) this.t;
        o0h o0hVar = (o0h) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.v;
            e1d e1dVar = o0hVar.d;
            xnh xnhVar = o0hVar.j;
            if (Intrinsics.c(((eoh) e1dVar).getValue(), d6dVar)) {
                long h = ((axj) this.u).h() / 1000000;
                float h2 = xnhVar.h();
                i4k h0 = s02.h0((int) (xnhVar.h() * h), 0, null, 6);
                wbc wbcVar = new wbc(i2, ku3Var, o0hVar, d6dVar);
                this.s = 2;
            } else {
                this.s = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object m(Object obj) {
        Object obj2 = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            LinkedHashMap b = jgd.b((List) this.w, (List) this.t);
            Context context = (Context) this.u;
            this.s = 1;
            hs4 hs4Var = z45.a;
            Object R = xw3.R(hq4.c, new gjb(context, b, rq3Var, 20), this);
            if (R != obj2) {
                R = Unit.a;
            }
            if (R == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        int i2 = 1;
        if (i == 0) {
            y6a.M(obj);
            u6b u6bVar = (u6b) this.v;
            e6b e6bVar = (e6b) this.w;
            nkd nkdVar = new nkd((z88) this.t, (Function1) this.u, rq3Var, i2);
            this.s = 1;
            if (b6a.A(u6bVar, e6bVar, nkdVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object o(Object obj) {
        Throwable th;
        d2g d2gVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            d2g d2gVar2 = (d2g) this.w;
            g62 g62Var = (g62) this.t;
            fsf fsfVar = (fsf) this.u;
            try {
                i2g i2gVar = d2gVar2.g;
                if (i2gVar != null) {
                    fsfVar.a = i2gVar.string();
                }
                Unit unit = Unit.a;
                this.v = d2gVar2;
                this.s = 1;
                if (g62Var.q(this, unit) == lu3Var) {
                    return lu3Var;
                }
                d2gVar = d2gVar2;
            } catch (Throwable th2) {
                th = th2;
                d2gVar = d2gVar2;
                throw th;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2gVar = (d2g) this.v;
            try {
                y6a.M(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    n4o.x(d2gVar, th);
                    throw th4;
                }
            }
        }
        Unit unit2 = Unit.a;
        n4o.x(d2gVar, null);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r0.c(r8) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        nhh nhhVar;
        y4e y4eVar;
        nhh nhhVar2;
        j2d j2dVar;
        x4e x4eVar = (x4e) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i == 0) {
            y6a.M(obj);
            nhhVar = (nhh) this.v;
            if (!x4eVar.g.compareAndSet(false, true)) {
                a70.r("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                return null;
            }
            xw3.L(nhhVar, null, null, new gjb(x4eVar, nhhVar, objArr3 == true ? 1 : 0, 27), 3);
            g62 g = ml4.g(0, 6, null);
            xw3.L(nhhVar, null, null, new gjb(x4eVar, g, objArr2 == true ? 1 : 0, 28), 3);
            xw3.L(nhhVar, null, null, new j8c((Object) g, (Object) x4eVar, (rq3) (objArr == true ? 1 : 0), 21), 3);
            this.v = nhhVar;
            this.w = null;
            this.t = null;
            this.s = 2;
        } else {
            if (i == 1) {
                y4e y4eVar2 = (y4e) ((j2d) this.t);
                if (((y4e) this.w) != null) {
                    pvd.j();
                    return null;
                }
                y6a.M(obj);
                y4eVar2.b.a(null);
                throw null;
            }
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2dVar = (j2d) this.t;
                y4eVar = (y4e) this.w;
                nhhVar2 = (nhh) this.v;
                y6a.M(obj);
                try {
                    y4eVar.b.i.h(sfb.a);
                    j2dVar.f(null);
                    x4eVar.l(nhhVar2);
                    return Unit.a;
                } catch (Throwable th2) {
                    j2dVar.f(null);
                    throw th2;
                }
            }
            nhh nhhVar3 = (nhh) this.v;
            y6a.M(obj);
            nhhVar = nhhVar3;
        }
        y4eVar = x4eVar.i;
        j2d j2dVar2 = y4eVar.a;
        this.v = nhhVar;
        this.w = y4eVar;
        this.t = j2dVar2;
        this.s = 3;
        if (j2dVar2.e(this) != lu3Var) {
            nhhVar2 = nhhVar;
            j2dVar = j2dVar2;
            y4eVar.b.i.h(sfb.a);
            j2dVar.f(null);
            x4eVar.l(nhhVar2);
            return Unit.a;
        }
        return lu3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                va8 va8Var = new va8((z88) this.t, (b1d) obj2, this.w, rq3Var);
                va8Var.v = obj;
                return va8Var;
            case 1:
                return new va8((xeh) this.w, (z88) this.t, (b1d) obj2, this.v, rq3Var);
            case 2:
                va8 va8Var2 = new va8((z88) this.t, (qa3) obj2, rq3Var, 2);
                va8Var2.v = obj;
                return va8Var2;
            case 3:
                va8 va8Var3 = new va8((sy8) this.w, (Context) this.t, (int[]) obj2, rq3Var, 3);
                va8Var3.v = obj;
                return va8Var3;
            case 4:
                va8 va8Var4 = new va8((xy8) this.w, (re0) this.t, (t01) obj2, rq3Var, 4);
                va8Var4.v = obj;
                return va8Var4;
            case 5:
                va8 va8Var5 = new va8((Context) this.w, (yw) this.t, (n50) obj2, rq3Var, 5);
                va8Var5.v = obj;
                return va8Var5;
            case 6:
                va8 va8Var6 = new va8((e1d) this.t, (h2a) obj2, rq3Var, 6);
                va8Var6.v = obj;
                return va8Var6;
            case 7:
                return new va8((znh) this.v, (w8l) this.w, (kx4) this.t, (e1d) obj2, rq3Var, 7);
            case 8:
                u6b u6bVar = (u6b) this.v;
                e6b e6bVar = e6b.a;
                return new va8(u6bVar, (b1d) obj2, (LeagueEventsFragment) this.w, rq3Var, (LeagueEventsFragment) this.t);
            case 9:
                va8 va8Var7 = new va8((w3b) obj2, rq3Var, 9);
                va8Var7.v = obj;
                return va8Var7;
            case 10:
                return new va8((LeagueWorker) this.w, (Map.Entry) this.t, (asf) obj2, rq3Var, 10);
            case 11:
                return new va8((byb) this.w, (zqb) this.t, (String) obj2, rq3Var, 11);
            case 12:
                return new va8((zqb) this.t, (String) obj2, rq3Var, 12);
            case 13:
                u6b u6bVar2 = (u6b) this.v;
                e6b e6bVar2 = e6b.a;
                return new va8(u6bVar2, (b1d) obj2, (ManagerEventsFragment) this.w, rq3Var, (ManagerEventsFragment) this.t);
            case 14:
                return new va8((axb) this.v, (Event) this.w, (BrandingBoostedOdds) this.t, (w3f) obj2, rq3Var, 14);
            case 15:
                u6b u6bVar3 = (u6b) this.v;
                e6b e6bVar3 = e6b.a;
                return new va8(u6bVar3, (b1d) obj2, (MatchesRootFragment) this.w, rq3Var, (MatchesRootFragment) this.t);
            case 16:
                return new va8((Event) this.t, (u8c) obj2, rq3Var, 16);
            case 17:
                return new va8((u8c) this.v, (MediaPost) this.w, (Event) this.t, (Set) obj2, rq3Var, 17);
            case 18:
                u6b u6bVar4 = (u6b) this.v;
                e6b e6bVar4 = e6b.a;
                return new va8(u6bVar4, (b1d) obj2, (MmaEventsWeekFragment) this.w, rq3Var, (MmaEventsWeekFragment) this.t);
            case 19:
                u6b u6bVar5 = (u6b) this.v;
                e6b e6bVar5 = e6b.a;
                return new va8(u6bVar5, (b1d) obj2, (MmaFightNightFragment) this.w, rq3Var, (MmaFightNightFragment) this.t);
            case 20:
                return new va8((Integer) this.v, (String) this.w, (Gender) this.t, (vnc) obj2, rq3Var, 20);
            case 21:
                u6b u6bVar6 = (u6b) this.v;
                e6b e6bVar6 = e6b.a;
                return new va8(u6bVar6, (b1d) obj2, (MmaFighterEventsFragment) this.w, rq3Var, (MmaFighterEventsFragment) this.t);
            case 22:
                s5d s5dVar = (s5d) this.v;
                String str = (String) this.w;
                u6b u6bVar7 = (u6b) this.t;
                e6b e6bVar7 = e6b.a;
                return new va8(s5dVar, str, u6bVar7, (h1) obj2, rq3Var);
            case 23:
                va8 va8Var8 = new va8((o0h) this.w, (trg) this.t, (axj) obj2, rq3Var, 23);
                va8Var8.v = obj;
                return va8Var8;
            case 24:
                va8 va8Var9 = new va8((o0h) this.w, (d6d) this.t, (axj) obj2, rq3Var, 24);
                va8Var9.v = obj;
                return va8Var9;
            case 25:
                return new va8((jgd) this.v, (List) this.w, (List) this.t, (Context) obj2, rq3Var, 25);
            case 26:
                return new va8((u6b) this.v, (e6b) this.w, (z88) this.t, (Function1) obj2, rq3Var, 26);
            case 27:
                return new va8((d2g) this.w, (g62) this.t, (fsf) obj2, rq3Var, 27);
            case 28:
                va8 va8Var10 = new va8((x4e) obj2, rq3Var, 28);
                va8Var10.v = obj;
                return va8Var10;
            default:
                va8 va8Var11 = new va8((x4e) obj2, rq3Var, 29);
                va8Var11.v = obj;
                return va8Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((va8) create((veh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((va8) create((k8h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            case 7:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((va8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((va8) create((nhh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((va8) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r1.emit(r2, r29) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0281, code lost:
    
        if (r1 == r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0266, code lost:
    
        if (r3 == r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r2.e(r29) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0750, code lost:
    
        if (r1.h(r0, r3, r29) != r6) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0727, code lost:
    
        if (r0 != r6) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0738, code lost:
    
        if (r0 == r6) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06d3, code lost:
    
        if (r8 == r6) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08b3, code lost:
    
        if (r0 == r2) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x07bb, code lost:
    
        if (r8 == r2) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09da, code lost:
    
        if (defpackage.rd0.z(r3, r4, r29) == r0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0a8b, code lost:
    
        if (r4 == r2) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0bef, code lost:
    
        if (r0.collect(r10, r29) == r1) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0bcb, code lost:
    
        if (r0.collect(r10, r29) == r1) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0be6, code lost:
    
        if (defpackage.rd0.z(r3, r4, r29) == r1) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0c0f, code lost:
    
        if (defpackage.fcp.c0(r2, r3, r29) == r1) goto L508;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0acd  */
    /* JADX WARN: Type inference failed for: r0v9, types: [z88] */
    /* JADX WARN: Type inference failed for: r10v2, types: [b1d, b98] */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.sofascore.model.newNetwork.DateResponse[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v81, types: [com.sofascore.model.odds.FeaturedOddsWithProvider] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:378:0x09bc -> B:373:0x09de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:380:0x09da -> B:373:0x09de). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        k8h k8hVar;
        Object a;
        k8h k8hVar2;
        Object f;
        br9 br9Var;
        BroadcastReceiver broadcastReceiver;
        Object invoke;
        ku3 ku3Var;
        csf csfVar;
        ku3 ku3Var2;
        csf csfVar2;
        l50 l50Var;
        Calendar calendar;
        String i;
        Object P;
        Object u;
        Object q0;
        UniqueTournament uniqueTournament;
        Object N0;
        UniqueTournament uniqueTournament2;
        Object T;
        TreeMap treeMap;
        Object a2;
        AvailableSportFiltersResponse availableSportFiltersResponse;
        Object U;
        Map<String, String> map;
        DisplayType displayType;
        q9k q9kVar;
        int i2;
        b7 K;
        b7 b7Var;
        boolean z;
        v28 v28Var;
        String filterValueId;
        q9k q9kVar2;
        Object u2;
        Object value;
        vnb vnbVar;
        Integer num;
        OddsCountryProvider oddsCountryProvider;
        Object P2;
        Integer num2;
        ProviderOdds providerOdds;
        b98 b98Var;
        y4e y4eVar;
        j2d j2dVar;
        int i3 = this.r;
        int i4 = 5;
        int i5 = 8;
        int i6 = 2;
        Object obj2 = this.u;
        int i7 = 1;
        u28 u28Var = null;
        switch (i3) {
            case 0:
                b1d b1dVar = (b1d) obj2;
                veh vehVar = (veh) this.v;
                lu3 lu3Var = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                int ordinal = vehVar.ordinal();
                if (ordinal == 0) {
                    z88 z88Var = (z88) this.t;
                    this.v = null;
                    this.s = 1;
                    if (z88Var.collect(b1dVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    Object obj3 = this.w;
                    if (obj3 == beh.a) {
                        b1dVar.d();
                    } else {
                        b1dVar.b(obj3);
                    }
                }
                return Unit.a;
            case 1:
                ?? r0 = (z88) this.t;
                ?? r10 = (b1d) obj2;
                lu3 lu3Var2 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            y6a.M(obj);
                            this.s = 3;
                            break;
                        } else if (i9 != 3 && i9 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y6a.M(obj);
                    return Unit.a;
                }
                y6a.M(obj);
                xeh xehVar = (xeh) this.w;
                if (xehVar == weh.a) {
                    this.s = 1;
                    break;
                } else if (xehVar == weh.b) {
                    kki j = ((u7) r10).j();
                    u41 u41Var = new u41(2, null, i4);
                    this.s = 2;
                    break;
                } else {
                    z88 H = hkg.H(xehVar.d(((u7) r10).j()));
                    va8 va8Var = new va8((z88) r0, (b1d) r10, this.v, (rq3) null);
                    this.s = 4;
                    break;
                }
                return lu3Var2;
            case 2:
                qa3 qa3Var = (qa3) obj2;
                ku3 ku3Var3 = (ku3) this.v;
                lu3 lu3Var3 = lu3.a;
                int i10 = this.s;
                try {
                    if (i10 == 0) {
                        y6a.M(obj);
                        fsf fsfVar2 = new fsf();
                        z88 z88Var2 = (z88) this.t;
                        m70 m70Var = new m70(i5, fsfVar2, ku3Var3, qa3Var);
                        this.v = null;
                        this.w = fsfVar2;
                        this.s = 1;
                        if (z88Var2.collect(m70Var, this) == lu3Var3) {
                            return lu3Var3;
                        }
                        fsfVar = fsfVar2;
                    } else {
                        if (i10 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fsfVar = (fsf) this.w;
                        y6a.M(obj);
                    }
                    if (fsfVar.a == null) {
                        p2g p2gVar = w2g.b;
                        qa3Var.V(new w2g(new u2g(new NoSuchElementException("Flow is empty"))));
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    qa3Var.j0(th);
                    throw th;
                }
            case 3:
                Context context = (Context) this.t;
                sy8 sy8Var = (sy8) this.w;
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var4 = (ku3) this.v;
                    int i12 = sy8.b;
                    sy8Var.b(ku3Var4, context);
                    int[] iArr = (int[]) obj2;
                    ArrayList arrayList = new ArrayList(iArr.length);
                    int length = iArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        Context context2 = context;
                        sy8 sy8Var2 = sy8Var;
                        arrayList.add(xw3.t(ku3Var4, null, new ok0(sy8Var2, context2, iArr[i13], (rq3) null, 25), 3));
                        i13++;
                        sy8Var = sy8Var2;
                        context = context2;
                    }
                    this.s = 1;
                    if (m6k.u(arrayList, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                re0 re0Var = (re0) this.t;
                GlanceRemoteViewsService glanceRemoteViewsService = ((xy8) this.w).a;
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    k8hVar = (k8h) this.v;
                    String M = l98.M(re0Var.a);
                    this.v = k8hVar;
                    this.s = 1;
                    a = k8hVar.a(glanceRemoteViewsService, M, this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k8hVar2 = (k8h) this.v;
                        y6a.M(obj);
                        af0 af0Var = (af0) k8hVar2.a.get(l98.M(re0Var.a));
                        af0Var.getClass();
                        this.v = null;
                        this.s = 3;
                        f = af0Var.f(this);
                        if (f != lu3Var5) {
                            return f;
                        }
                        return lu3Var5;
                    }
                    k8hVar = (k8h) this.v;
                    y6a.M(obj);
                    a = obj;
                }
                if (!((Boolean) a).booleanValue()) {
                    af0 af0Var2 = new af0((t01) obj2, re0Var, null, 252);
                    this.v = k8hVar;
                    this.s = 2;
                    if (k8hVar.b(glanceRemoteViewsService, af0Var2, this) != lu3Var5) {
                        k8hVar2 = k8hVar;
                        af0 af0Var3 = (af0) k8hVar2.a.get(l98.M(re0Var.a));
                        af0Var3.getClass();
                        this.v = null;
                        this.s = 3;
                        f = af0Var3.f(this);
                        if (f != lu3Var5) {
                        }
                    }
                    return lu3Var5;
                }
                return null;
            case 5:
                Context context3 = (Context) this.w;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    br9Var = new br9(new z07(25, (ku3) this.v, (n50) obj2));
                    context3.registerReceiver(br9Var, br9.c);
                    try {
                        br9Var.a(context3);
                        yw ywVar = (yw) this.t;
                        this.v = br9Var;
                        this.s = 1;
                        invoke = ywVar.invoke(this);
                        if (invoke == lu3Var6) {
                            return lu3Var6;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        broadcastReceiver = br9Var;
                        context3.unregisterReceiver(broadcastReceiver);
                        throw th;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    broadcastReceiver = (br9) this.v;
                    try {
                        y6a.M(obj);
                        br9Var = broadcastReceiver;
                        invoke = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        context3.unregisterReceiver(broadcastReceiver);
                        throw th;
                    }
                }
                context3.unregisterReceiver(br9Var);
                return invoke;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var5 = (ku3) this.v;
                    csf csfVar3 = new csf();
                    csfVar3.a = 1.0f;
                    ku3Var = ku3Var5;
                    csfVar = csfVar3;
                    l50Var = new l50((e1d) this.t, (h2a) obj2, csfVar, ku3Var, 27);
                    csf csfVar4 = csfVar;
                    ku3 ku3Var6 = ku3Var;
                    this.v = ku3Var6;
                    this.w = csfVar4;
                    this.s = 1;
                    if (d2a.H(l50Var, this) != lu3Var7) {
                    }
                    return lu3Var7;
                }
                if (i16 == 1) {
                    csfVar2 = (csf) this.w;
                    ku3Var2 = (ku3) this.v;
                    y6a.M(obj);
                    if (csfVar2.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    csfVar = csfVar2;
                    ku3Var = ku3Var2;
                    l50Var = new l50((e1d) this.t, (h2a) obj2, csfVar, ku3Var, 27);
                    csf csfVar42 = csfVar;
                    ku3 ku3Var62 = ku3Var;
                    this.v = ku3Var62;
                    this.w = csfVar42;
                    this.s = 1;
                    if (d2a.H(l50Var, this) != lu3Var7) {
                    }
                    return lu3Var7;
                }
                if (i16 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                csfVar2 = (csf) this.w;
                ku3Var2 = (ku3) this.v;
                y6a.M(obj);
                csfVar = csfVar2;
                ku3Var = ku3Var2;
                l50Var = new l50((e1d) this.t, (h2a) obj2, csfVar, ku3Var, 27);
                csf csfVar422 = csfVar;
                ku3 ku3Var622 = ku3Var;
                this.v = ku3Var622;
                this.w = csfVar422;
                this.s = 1;
                if (d2a.H(l50Var, this) != lu3Var7) {
                    ku3Var2 = ku3Var622;
                    csfVar2 = csfVar422;
                    if (csfVar2.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        pog y = sea.y(new sr8(ku3Var2, 11));
                        g2a g2aVar = new g2a(2, null);
                        this.v = ku3Var2;
                        this.w = csfVar2;
                        this.s = 2;
                        break;
                    }
                    csfVar = csfVar2;
                    ku3Var = ku3Var2;
                    l50Var = new l50((e1d) this.t, (h2a) obj2, csfVar, ku3Var, 27);
                    csf csfVar4222 = csfVar;
                    ku3 ku3Var6222 = ku3Var;
                    this.v = ku3Var6222;
                    this.w = csfVar4222;
                    this.s = 1;
                    if (d2a.H(l50Var, this) != lu3Var7) {
                    }
                }
                return lu3Var7;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    dsf dsfVar = new dsf();
                    int h = ((znh) this.v).h() / 4;
                    pog y2 = sea.y(new ij8(21, (w8l) this.w, (kx4) this.t));
                    ca8 ca8Var = new ca8(dsfVar, h, (e1d) obj2, 1);
                    this.s = 1;
                    if (y2.collect(ca8Var, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.v;
                    e6b e6bVar = e6b.c;
                    zi7 zi7Var = new zi7((b1d) obj2, (LeagueEventsFragment) this.w, (rq3) null, (LeagueEventsFragment) this.t, 19);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, zi7Var, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                w3b w3bVar = (w3b) obj2;
                ku3 ku3Var7 = (ku3) this.v;
                lu3 lu3Var10 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    calendar = Calendar.getInstance();
                    Calendar calendar2 = ke0.a;
                    calendar.getClass();
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    long timeInMillis = calendar.getTimeInMillis() / 1000;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                    w0b w0bVar = new w0b(w3bVar, null, i7);
                    this.v = ku3Var7;
                    this.w = calendar;
                    this.t = i;
                    this.s = 1;
                    P = yaa.P(w0bVar, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u = obj;
                        return k13.s(CollectionsKt.W((Iterable) u));
                    }
                    i = (String) this.t;
                    calendar = (Calendar) this.w;
                    y6a.M(obj);
                    P = obj;
                }
                List list = (List) yaa.x((x2g) P);
                if (list == null) {
                    list = km5.a;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                dsf dsfVar2 = new dsf();
                dsfVar2.a = -1;
                int i20 = 0;
                for (Object obj4 : list) {
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        b.q();
                        throw null;
                    }
                    DateResponse dateResponse = (DateResponse) obj4;
                    int i22 = i6;
                    Date parse = simpleDateFormat.parse(dateResponse.getDate());
                    if (parse == null) {
                        parse = new Date();
                    }
                    if (dsfVar2.a == -1) {
                        if (Intrinsics.c(dateResponse.getDate(), i)) {
                            dsfVar2.a = i20 == 0 ? 0 : i20 == list.size() + (-1) ? i20 - 2 : i20 - 1;
                        } else if (parse.getTime() > calendar.getTimeInMillis()) {
                            if (i20 == list.size() - 2) {
                                i20--;
                            }
                            dsfVar2.a = i20;
                        }
                    }
                    i20 = i21;
                    i6 = i22;
                }
                int i23 = i6;
                int i24 = dsfVar2.a;
                if (i24 == -1) {
                    i24 = list.size() - 1;
                    dsfVar2.a = i24;
                }
                ?? r3 = new DateResponse[3];
                r3[0] = CollectionsKt.a0(i24, list);
                r3[1] = CollectionsKt.a0(dsfVar2.a + 1, list);
                r3[i23] = CollectionsKt.a0(dsfVar2.a + 2, list);
                List x = ph0.x(r3);
                ArrayList arrayList2 = new ArrayList(k13.r(x, 10));
                Iterator it = ((ArrayList) x).iterator();
                while (it.hasNext()) {
                    arrayList2.add(xw3.t(ku3Var7, null, new yp7(w3bVar, (DateResponse) it.next(), (rq3) null, 25), 3));
                }
                this.v = null;
                this.w = null;
                this.t = null;
                this.s = i23;
                u = m6k.u(arrayList2, this);
                break;
            case 10:
                asf asfVar = (asf) obj2;
                Map.Entry entry = (Map.Entry) this.t;
                LeagueWorker leagueWorker = (LeagueWorker) this.w;
                w3b w3bVar2 = leagueWorker.b;
                lu3 lu3Var11 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    int intValue = ((Number) entry.getKey()).intValue();
                    this.s = 1;
                    q0 = w3bVar2.q0(intValue, this);
                    break;
                } else if (i25 == 1) {
                    y6a.M(obj);
                    q0 = obj;
                } else if (i25 == 2) {
                    uniqueTournament2 = (UniqueTournament) this.v;
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    this.v = uniqueTournament2;
                    this.s = 3;
                    irj irjVar = w3bVar2.a;
                    T = gz8.T(this, irjVar.a, new hrj(irjVar, uniqueTournament2, booleanValue, null));
                    break;
                } else if (i25 == 3) {
                    UniqueTournament uniqueTournament3 = (UniqueTournament) this.v;
                    y6a.M(obj);
                    uniqueTournament2 = uniqueTournament3;
                    T = obj;
                    ((Boolean) T).getClass();
                    int id = uniqueTournament2.getId();
                    boolean z2 = asfVar.a;
                    this.v = null;
                    this.s = 5;
                } else {
                    if (i25 != 4) {
                        if (i25 == 5) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    UniqueTournament uniqueTournament4 = (UniqueTournament) this.v;
                    y6a.M(obj);
                    uniqueTournament = uniqueTournament4;
                    N0 = obj;
                    ((Boolean) N0).getClass();
                    uniqueTournament2 = uniqueTournament;
                    int id2 = uniqueTournament2.getId();
                    boolean z22 = asfVar.a;
                    this.v = null;
                    this.s = 5;
                    break;
                }
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) q0;
                if (uniqueTournamentResponse == null || (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) == null) {
                    return Unit.a;
                }
                if (uniqueTournament.getId() == ((Number) entry.getKey()).intValue()) {
                    this.v = uniqueTournament;
                    this.s = 4;
                    N0 = w3bVar2.N0(uniqueTournament, this);
                    break;
                } else {
                    asfVar.a = true;
                    int intValue2 = ((Number) entry.getKey()).intValue();
                    this.v = uniqueTournament;
                    this.s = 2;
                    if (w3bVar2.e0(intValue2, this) != lu3Var11) {
                        uniqueTournament2 = uniqueTournament;
                        boolean booleanValue2 = ((Boolean) entry.getValue()).booleanValue();
                        this.v = uniqueTournament2;
                        this.s = 3;
                        irj irjVar2 = w3bVar2.a;
                        T = gz8.T(this, irjVar2.a, new hrj(irjVar2, uniqueTournament2, booleanValue2, null));
                    }
                }
                return lu3Var11;
            case 11:
                zqb zqbVar = (zqb) this.t;
                byb bybVar = (byb) this.w;
                Object obj5 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    gv9<u28> gv9Var = bybVar.b;
                    int c = sub.c(k13.r(gv9Var, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                    for (u28 u28Var2 : gv9Var) {
                        linkedHashMap.put(u28Var2.a, u28Var2.d);
                    }
                    TreeMap treeMap2 = new TreeMap(linkedHashMap);
                    ue9 ue9Var = zqbVar.i;
                    DbHomescreenFilter dbHomescreenFilter = new DbHomescreenFilter((String) obj2, treeMap2, bybVar.a);
                    this.v = treeMap2;
                    this.s = 1;
                    se9 se9Var = ue9Var.b;
                    Object U2 = gz8.U(this, se9Var.a, false, true, new uf8(i5, se9Var, dbHomescreenFilter));
                    Object obj6 = lu3.a;
                    if (U2 != obj6) {
                        U2 = Unit.a;
                    }
                    if (U2 != obj6) {
                        U2 = Unit.a;
                    }
                    if (U2 == obj5) {
                        return obj5;
                    }
                    treeMap = treeMap2;
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    TreeMap treeMap3 = (TreeMap) this.v;
                    y6a.M(obj);
                    treeMap = treeMap3;
                }
                byb bybVar2 = zqbVar.c0;
                Intrinsics.c(bybVar2 != null ? Boolean.valueOf(bybVar2.equals(bybVar)) : null, Boolean.FALSE);
                zqbVar.c0 = bybVar;
                dsf dsfVar3 = new dsf();
                dsf dsfVar4 = new dsf();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                treeMap.forEach(new tqb(new mp9(dsfVar3, sb, dsfVar4, sb2, 4), 0));
                zqbVar.l.k(new qqb(true, new oqb(StringsKt.W(sb.toString(), "/"), StringsKt.W(sb2.toString(), "/"), treeMap, dsfVar3.a, dsfVar4.a), bybVar.a, bybVar.c));
                return Unit.a;
            case 12:
                String str = (String) obj2;
                zqb zqbVar2 = (zqb) this.t;
                ue9 ue9Var2 = zqbVar2.i;
                lu3 lu3Var12 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    a2 = ue9Var2.a(str, this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AvailableSportFiltersResponse availableSportFiltersResponse2 = (AvailableSportFiltersResponse) this.w;
                        zqb zqbVar3 = (zqb) this.v;
                        y6a.M(obj);
                        availableSportFiltersResponse = availableSportFiltersResponse2;
                        zqbVar2 = zqbVar3;
                        U = obj;
                        DbHomescreenFilter dbHomescreenFilter2 = (DbHomescreenFilter) U;
                        if (dbHomescreenFilter2 == null || (map = dbHomescreenFilter2.getSelectedFilters()) == null) {
                            map = lm5.a;
                            map.getClass();
                        }
                        if (!Intrinsics.c(availableSportFiltersResponse.getChronologicalViewSupported(), Boolean.TRUE) || dbHomescreenFilter2 == null || (displayType = dbHomescreenFilter2.getDisplayType()) == null) {
                            displayType = DisplayType.DEFAULT;
                        }
                        displayType.getClass();
                        List<SportFilterCategory> filters = availableSportFiltersResponse.getFilters();
                        ArrayList arrayList3 = new ArrayList();
                        for (SportFilterCategory sportFilterCategory : filters) {
                            FilterCategory name = sportFilterCategory.getName();
                            if (name != null) {
                                List<FilterValue> possibleValues = sportFilterCategory.getPossibleValues();
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = possibleValues.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        FilterValue filterValue = (FilterValue) it2.next();
                                        if (filterValue != null && (filterValueId = filterValue.getFilterValueId()) != null) {
                                            switch (ayb.b[filterValue.ordinal()]) {
                                                case 1:
                                                    q9kVar2 = new q9k(R.string.filter_category_club);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 2:
                                                    q9kVar2 = new q9k(R.string.filter_category_national);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 3:
                                                    q9kVar2 = new q9k(R.string.filter_level_top);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 4:
                                                    q9kVar2 = new q9k(R.string.filter_category_rugby_union);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 5:
                                                    q9kVar2 = new q9k(R.string.filter_category_rugby_league);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 6:
                                                    q9kVar2 = new q9k(R.string.filter_category_rugby_sevens);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 7:
                                                    q9kVar2 = new q9k(R.string.filter_category_rugby_beach);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 8:
                                                    q9kVar2 = new q9k(R.string.filter_category_all);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 9:
                                                    q9kVar2 = new q9k(R.string.filter_category_counter_strike);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 10:
                                                    q9kVar2 = new q9k(R.string.filter_category_dota_2);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 11:
                                                    q9kVar2 = new q9k(R.string.filter_category_league_of_legends_short);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 12:
                                                    q9kVar2 = new q9k(R.string.filter_gender_men);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 13:
                                                    q9kVar2 = new q9k(R.string.filter_gender_women);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 14:
                                                    q9kVar2 = new q9k(R.string.filter_gender_mixed);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 15:
                                                    q9kVar2 = new q9k(R.string.filter_level_contributor);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 16:
                                                    q9kVar2 = new q9k(R.string.filter_level_youth);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 17:
                                                    q9kVar2 = new q9k(R.string.filter_level_college);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 18:
                                                    q9kVar2 = new q9k(R.string.filter_category_racket_sports_singles);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 19:
                                                    q9kVar2 = new q9k(R.string.filter_category_racket_sports_doubles);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 20:
                                                    q9kVar2 = new q9k(R.string.filter_tournament_tennis_grand_slam);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 21:
                                                    q9kVar2 = new q9k(R.string.filter_tournament_tennis_p1000);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 22:
                                                    q9kVar2 = new q9k(R.string.filter_tournament_tennis_p500);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 23:
                                                    q9kVar2 = new q9k(R.string.filter_tournament_tennis_p250);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 24:
                                                    q9kVar2 = new q9k(R.string.filter_tournament_tennis_lower);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 25:
                                                    q9kVar2 = new q9k(R.string.filter_level_baseball_major_league);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 26:
                                                    q9kVar2 = new q9k(R.string.filter_level_baseball_minor_league);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 27:
                                                    q9kVar2 = new q9k(R.string.filter_region_north_america);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 28:
                                                    q9kVar2 = new q9k(R.string.filter_region_europe);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 29:
                                                    q9kVar2 = new q9k(R.string.filter_status_upcoming);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 30:
                                                    q9kVar2 = new q9k(R.string.filter_status_finished);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                case 31:
                                                    q9kVar2 = new q9k(R.string.filter_level_pro);
                                                    v28Var = new v28(filterValueId, q9kVar2);
                                                    break;
                                                default:
                                                    zzl.b();
                                                    break;
                                            }
                                        } else {
                                            v28Var = null;
                                        }
                                        if (v28Var != null) {
                                            arrayList4.add(v28Var);
                                        }
                                    } else if (!arrayList4.isEmpty() && (arrayList4.size() != 1 || !Intrinsics.c(((v28) CollectionsKt.Y(arrayList4)).a, FilterValue.ALL.getFilterValueId()))) {
                                        String str2 = map.get(name.getFilterCategoryId());
                                        if (str2 == null) {
                                            str2 = ((v28) CollectionsKt.Y(arrayList4)).a;
                                        }
                                        String str3 = str2;
                                        String filterCategoryId = name.getFilterCategoryId();
                                        int[] iArr2 = ayb.a;
                                        switch (iArr2[name.ordinal()]) {
                                            case 1:
                                                q9kVar = new q9k(R.string.filter_status);
                                                q9k q9kVar3 = q9kVar;
                                                gv9 W = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                    K = l6g.K(new q9k(R.string.filter_status_disabled));
                                                } else if (i2 != 2) {
                                                    b7Var = null;
                                                    if (name == FilterCategory.LEVEL) {
                                                        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList5.add(((v28) it3.next()).a);
                                                        }
                                                        if (arrayList5.containsAll(b.j(FilterValue.TOP.getFilterValueId(), FilterValue.PRO.getFilterValueId()))) {
                                                            z = true;
                                                            u28Var = new u28(filterCategoryId, q9kVar3, W, str3, b7Var, z, 16);
                                                            break;
                                                        }
                                                    }
                                                    z = false;
                                                    u28Var = new u28(filterCategoryId, q9kVar3, W, str3, b7Var, z, 16);
                                                } else {
                                                    K = l6g.K(new q9k(R.string.filter_level_top_legend), new q9k(R.string.filter_level_pro_legend));
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar3, W, str3, b7Var, z, 16);
                                            case 2:
                                                q9kVar = new q9k(R.string.filter_level);
                                                q9k q9kVar32 = q9kVar;
                                                gv9 W2 = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar32, W2, str3, b7Var, z, 16);
                                                break;
                                            case 3:
                                                q9kVar = new q9k(R.string.filter_category);
                                                q9k q9kVar322 = q9kVar;
                                                gv9 W22 = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar322, W22, str3, b7Var, z, 16);
                                                break;
                                            case 4:
                                                q9kVar = new q9k(R.string.filter_gender);
                                                q9k q9kVar3222 = q9kVar;
                                                gv9 W222 = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar3222, W222, str3, b7Var, z, 16);
                                                break;
                                            case 5:
                                                q9kVar = new q9k(R.string.filter_region);
                                                q9k q9kVar32222 = q9kVar;
                                                gv9 W2222 = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar32222, W2222, str3, b7Var, z, 16);
                                                break;
                                            case 6:
                                                q9kVar = new q9k(R.string.filter_tournament);
                                                q9k q9kVar322222 = q9kVar;
                                                gv9 W22222 = l6g.W(arrayList4);
                                                i2 = iArr2[name.ordinal()];
                                                if (i2 != 1) {
                                                }
                                                b7Var = K;
                                                if (name == FilterCategory.LEVEL) {
                                                }
                                                z = false;
                                                u28Var = new u28(filterCategoryId, q9kVar322222, W22222, str3, b7Var, z, 16);
                                                break;
                                            default:
                                                zzl.b();
                                                break;
                                        }
                                    } else {
                                        u28Var = null;
                                    }
                                }
                                return null;
                            }
                            if (u28Var != null) {
                                arrayList3.add(u28Var);
                            }
                            u28Var = null;
                        }
                        byb bybVar3 = new byb(displayType, l6g.W(arrayList3), Intrinsics.c(availableSportFiltersResponse.getChronologicalViewSupported(), Boolean.TRUE));
                        zqbVar2.k(bybVar3);
                        zqbVar2.c0 = bybVar3;
                        return Unit.a;
                    }
                    y6a.M(obj);
                    a2 = obj;
                }
                availableSportFiltersResponse = (AvailableSportFiltersResponse) a2;
                if (availableSportFiltersResponse == null) {
                    yzc yzcVar = zqbVar2.l;
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    yzcVar.k(new qqb(false, new oqb("", "", lm5Var, 0, 0), DisplayType.DEFAULT, false));
                    return Unit.a;
                }
                this.v = zqbVar2;
                this.w = availableSportFiltersResponse;
                this.s = 2;
                se9 se9Var2 = ue9Var2.b;
                U = gz8.U(this, se9Var2.a, true, false, new uf8(7, str, se9Var2));
                break;
                break;
            case 13:
                lu3 lu3Var13 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    u6b u6bVar2 = (u6b) this.v;
                    e6b e6bVar2 = e6b.c;
                    zi7 zi7Var2 = new zi7((b1d) obj2, (ManagerEventsFragment) this.w, (rq3) null, (ManagerEventsFragment) this.t, 24);
                    this.s = 1;
                    if (b6a.A(u6bVar2, e6bVar2, zi7Var2, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                axb axbVar = (axb) this.v;
                lu3 lu3Var14 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    Event event = (Event) this.w;
                    this.s = 1;
                    u2 = axbVar.u(event, this);
                    if (u2 == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u2 = obj;
                }
                dwb t = axbVar.t((BrandingBoostedOdds) this.t, (w3f) obj2, (ProviderOdds) u2);
                fdi fdiVar = axbVar.e;
                do {
                    value = fdiVar.getValue();
                    vnbVar = (vnb) value;
                    vnbVar.getClass();
                    if (vnbVar instanceof unb) {
                        vnbVar = new unb(rwb.a((rwb) ((unb) vnbVar).a, t));
                    }
                } while (!fdiVar.k(value, vnbVar));
                return Unit.a;
            case 15:
                lu3 lu3Var15 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    u6b u6bVar3 = (u6b) this.v;
                    e6b e6bVar3 = e6b.e;
                    zi7 zi7Var3 = new zi7((b1d) obj2, (MatchesRootFragment) this.w, (rq3) null, (MatchesRootFragment) this.t, 27);
                    this.s = 1;
                    if (b6a.A(u6bVar3, e6bVar3, zi7Var3, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                Event event2 = (Event) this.t;
                lu3 lu3Var16 = lu3.a;
                int i31 = this.s;
                rq3 rq3Var = null;
                if (i31 == 0) {
                    y6a.M(obj);
                    num = new Integer(event2.getId());
                    u8c u8cVar = (u8c) obj2;
                    oddsCountryProvider = u8cVar.n;
                    if (oddsCountryProvider != null) {
                        yw ywVar2 = new yw(u8cVar, event2, oddsCountryProvider, rq3Var, 8);
                        this.v = oddsCountryProvider;
                        this.w = num;
                        this.s = 1;
                        P2 = yaa.P(ywVar2, this);
                        if (P2 == lu3Var16) {
                            return lu3Var16;
                        }
                        num2 = num;
                    }
                    return new Pair(num, rq3Var);
                }
                if (i31 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                num2 = (Integer) this.w;
                oddsCountryProvider = (OddsCountryProvider) this.v;
                y6a.M(obj);
                P2 = obj;
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) yaa.x((x2g) P2);
                if (featuredOddsResponse != null && (providerOdds = featuredOddsResponse.getFeatured().get(oddsCountryProvider.getFeaturedOddsType())) != null) {
                    rq3Var = new FeaturedOddsWithProvider(oddsCountryProvider, providerOdds);
                }
                num = num2;
                return new Pair(num, rq3Var);
            case 17:
                lu3 lu3Var17 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object c2 = ((u8c) this.v).c((MediaPost) this.w, (Event) this.t, true, (Set) obj2, this);
                    return c2 == lu3Var17 ? lu3Var17 : c2;
                }
                if (i32 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                return e(obj);
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return j(obj);
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case 25:
                return m(obj);
            case 26:
                return n(obj);
            case 27:
                return o(obj);
            case 28:
                return p(obj);
            default:
                lu3 lu3Var18 = lu3.a;
                int i33 = this.s;
                try {
                    if (i33 == 0) {
                        y6a.M(obj);
                        b98Var = (b98) this.v;
                        y4eVar = ((x4e) obj2).i;
                        j2dVar = y4eVar.a;
                        this.v = y4eVar;
                        this.w = j2dVar;
                        this.t = b98Var;
                        this.s = 1;
                        break;
                    } else {
                        if (i33 != 1) {
                            if (i33 == 2) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b98Var = (b98) this.t;
                        j2dVar = (j2d) this.w;
                        y4eVar = (y4e) this.v;
                        y6a.M(obj);
                    }
                    rfb F = y4eVar.b.i.F();
                    j2dVar.f(null);
                    a4e a4eVar = new a4e(F, null);
                    this.v = null;
                    this.w = null;
                    this.t = null;
                    this.s = 2;
                    break;
                } catch (Throwable th4) {
                    j2dVar.f(null);
                    throw th4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(z88 z88Var, b1d b1dVar, Object obj, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.t = z88Var;
        this.u = b1dVar;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, MatchesRootFragment matchesRootFragment, rq3 rq3Var, MatchesRootFragment matchesRootFragment2) {
        super(2, rq3Var);
        this.r = 15;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = matchesRootFragment;
        this.t = matchesRootFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, ManagerEventsFragment managerEventsFragment, rq3 rq3Var, ManagerEventsFragment managerEventsFragment2) {
        super(2, rq3Var);
        this.r = 13;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = managerEventsFragment;
        this.t = managerEventsFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, MmaFightNightFragment mmaFightNightFragment, rq3 rq3Var, MmaFightNightFragment mmaFightNightFragment2) {
        super(2, rq3Var);
        this.r = 19;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = mmaFightNightFragment;
        this.t = mmaFightNightFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, MmaFighterEventsFragment mmaFighterEventsFragment, rq3 rq3Var, MmaFighterEventsFragment mmaFighterEventsFragment2) {
        super(2, rq3Var);
        this.r = 21;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = mmaFighterEventsFragment;
        this.t = mmaFighterEventsFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(u6b u6bVar, b1d b1dVar, MmaEventsWeekFragment mmaEventsWeekFragment, rq3 rq3Var, MmaEventsWeekFragment mmaEventsWeekFragment2) {
        super(2, rq3Var);
        this.r = 18;
        e6b e6bVar = e6b.a;
        this.v = u6bVar;
        this.u = b1dVar;
        this.w = mmaEventsWeekFragment;
        this.t = mmaEventsWeekFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(s5d s5dVar, String str, u6b u6bVar, h1 h1Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 22;
        e6b e6bVar = e6b.a;
        this.v = s5dVar;
        this.w = str;
        this.t = u6bVar;
        this.u = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va8(xeh xehVar, z88 z88Var, b1d b1dVar, Object obj, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.w = xehVar;
        this.t = z88Var;
        this.u = b1dVar;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.t = obj2;
        this.u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va8(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.t = obj3;
        this.u = obj4;
    }
}
