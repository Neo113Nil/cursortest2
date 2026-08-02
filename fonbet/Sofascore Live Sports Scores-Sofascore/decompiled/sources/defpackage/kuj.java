package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.blaze.gam.custom_native.BlazeGamCustomNativeAdRequestInformation;
import com.blaze.ima.BlazeIMAAdRequestInformation;
import com.blaze.ima.ImaHandler;
import com.google.android.gms.internal.ads.zzgtm;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.a;
import com.moloco.sdk.internal.m0;
import com.moloco.sdk.internal.publisher.q0;
import com.moloco.sdk.internal.publisher.z0;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.CategoryUniqueTournamentResponse;
import com.sofascore.model.newNetwork.LastDancePost;
import com.sofascore.model.newNetwork.SportCategoriesResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.TvChannelScheduleResponse;
import com.sofascore.model.newNetwork.UniqueTournamentGroupResponse;
import com.sofascore.model.newNetwork.UniqueTournamentLastDanceResponse;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.wc26.WorldCupFragment;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kuj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(u6b u6bVar, b1d b1dVar, VenueMatchesFragment venueMatchesFragment, rq3 rq3Var, VenueMatchesFragment venueMatchesFragment2) {
        super(2, rq3Var);
        this.r = 8;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.v = b1dVar;
        this.u = venueMatchesFragment;
        this.w = venueMatchesFragment2;
    }

    private final Object e(Object obj) {
        Object u;
        Object m9kVar;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            List list = (List) this.t;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Pair pair = (Pair) obj2;
                Object obj3 = pair.b;
                Object obj4 = pair.a;
                ZonedDateTime atStartOfDay = LocalDate.parse((CharSequence) obj3, DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault());
                Event event = (Event) obj4;
                long startTimestamp = event.getStartTimestamp();
                Long endTimestamp = event.getEndTimestamp();
                if (aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, atStartOfDay.toEpochSecond())) {
                    arrayList.add(obj2);
                }
            }
            OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.u;
            qkl qklVar = (qkl) this.w;
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(xw3.t(ku3Var, null, new ajj(oddsCountryProvider, (Event) ((Pair) it.next()).a, qklVar, rq3Var, 11), 3));
            }
            this.v = null;
            this.s = 1;
            u = m6k.u(arrayList2, this);
            if (u == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            u = obj;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : (Iterable) u) {
            wn1 wn1Var = ((xel) obj5).a;
            if (ug5.u(wn1Var.p)) {
                m9kVar = new q9k(R.string.today);
            } else {
                long j = wn1Var.p;
                long j2 = wn1Var.p;
                if (ug5.w(j)) {
                    m9kVar = new q9k(R.string.yesterday);
                } else if (ug5.v(j2)) {
                    m9kVar = new q9k(R.string.tomorrow);
                } else {
                    bi4 bi4Var = bi4.PATTERN_DMM;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    m9kVar = new m9k(fc6.i(j2, hk4.a(bi4Var.d())));
                }
            }
            Object obj6 = linkedHashMap.get(m9kVar);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap.put(m9kVar, obj6);
            }
            ((List) obj6).add(obj5);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List H0 = CollectionsKt.H0((Iterable) entry.getValue(), new q6i(18));
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj7 : H0) {
                if (hashSet.add(new Integer(((xel) obj7).a.a))) {
                    arrayList3.add(obj7);
                }
            }
            ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                xel xelVar = (xel) next;
                r9k r9kVar = i2 == 0 ? (r9k) entry.getKey() : null;
                wn1 wn1Var2 = xelVar.a;
                r9k r9kVar2 = xelVar.b;
                r9k r9kVar3 = xelVar.c;
                String str = xelVar.d;
                boolean z = xelVar.f;
                boolean z2 = xelVar.g;
                and andVar = xelVar.h;
                wn1Var2.getClass();
                arrayList4.add(new xel(wn1Var2, r9kVar2, r9kVar3, str, r9kVar, z, z2, andVar));
                i2 = i3;
            }
            linkedHashMap2.put(key, l6g.W(arrayList4));
        }
        return l6g.X(linkedHashMap2);
    }

    private final Object f(Object obj) {
        av4 av4Var;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List<RankingRow> rankingRows;
        StandingsResponse standingsResponse;
        List<StandingsTable> standings;
        qkl qklVar = (qkl) this.w;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 10;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t = xw3.t(ku3Var, null, new njl(qklVar, rq3Var, 11), 3);
            av4 t2 = xw3.t(ku3Var, null, new njl(qklVar, rq3Var, i2), 3);
            this.u = null;
            this.t = t;
            this.s = 1;
            Object w = t2.w(this);
            if (w != lu3Var) {
                av4Var = t;
                obj = w;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.v;
            y6a.M(obj);
            linkedHashMap2 = linkedHashMap3;
            standingsResponse = (StandingsResponse) obj;
            if (standingsResponse != null || (standings = standingsResponse.getStandings()) == null) {
                return null;
            }
            hs4 hs4Var = z45.a;
            ccj ccjVar = new ccj(standings, qklVar, linkedHashMap2, rq3Var, 3);
            this.u = null;
            this.t = null;
            this.v = null;
            this.s = 3;
            Object R = xw3.R(hs4Var, ccjVar, this);
            return R == lu3Var ? lu3Var : R;
        }
        av4Var = (av4) this.t;
        y6a.M(obj);
        Ranking ranking = (Ranking) obj;
        if (ranking == null || (rankingRows = ranking.getRankingRows()) == null) {
            linkedHashMap = null;
        } else {
            int c = sub.c(k13.r(rankingRows, 10));
            if (c < 16) {
                c = 16;
            }
            linkedHashMap = new LinkedHashMap(c);
            for (Object obj2 : rankingRows) {
                Team team = ((RankingRow) obj2).getTeam();
                linkedHashMap.put(team != null ? new Integer(team.getId()) : null, obj2);
            }
        }
        this.u = null;
        this.t = null;
        this.v = linkedHashMap;
        this.s = 2;
        obj = av4Var.T(this);
        if (obj != lu3Var) {
            linkedHashMap2 = linkedHashMap;
            standingsResponse = (StandingsResponse) obj;
            if (standingsResponse != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r0 == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            MotionEvent motionEvent = (MotionEvent) this.t;
            if (motionEvent != null) {
                ib ibVar = (ib) this.v;
                q0 q0Var = (q0) this.u;
                aeh aehVar = (aeh) this.w;
                z zVar = q0Var.l;
                ux4 ux4Var = q0Var.t;
                String str = (String) ux4Var.i;
                String str2 = (String) ux4Var.h;
                n nVar = q0Var.u;
                this.s = 1;
                int i2 = ib.b;
                m0 m0Var = (m0) a.a.getValue();
                if (motionEvent.getAction() == 0) {
                    int[] iArr = new int[2];
                    ibVar.getLocationOnScreen(iArr);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ph0.y(iArr), ph0.L(iArr), ibVar.getHeight(), ibVar.getWidth(), (int) (motionEvent.getX() + ph0.y(iArr)), (int) (motionEvent.getY() + ph0.L(iArr)));
                    if (str != null) {
                        m0Var.a(str, System.currentTimeMillis(), null);
                    }
                    if (str2 != null) {
                        obj2 = zVar.a(str2, aVar, nVar, aehVar, this);
                    }
                }
                obj2 = Unit.a;
                if (obj2 == lu3Var) {
                    return lu3Var;
                }
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

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Async fetching init response", null, false, 12, null);
            com.moloco.sdk.internal.services.init.n nVar = (com.moloco.sdk.internal.services.init.n) this.t;
            String str = (String) this.u;
            MediationInfo mediationInfo = (MediationInfo) this.v;
            com.moloco.sdk.acm.recorder.b bVar = (com.moloco.sdk.acm.recorder.b) this.w;
            this.s = 1;
            if (nVar.b(str, mediationInfo, bVar, true, this) == lu3Var) {
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r8.e(r7) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        j2d j2dVar;
        Function1 function1;
        Throwable th;
        h2d h2dVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                j2dVar = (j2d) this.u;
                ?? r1 = (Function1) this.w;
                this.t = j2dVar;
                this.v = (hoi) r1;
                this.s = 1;
                function1 = r1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h2dVar = (h2d) this.t;
                    try {
                        y6a.M(obj);
                        h2dVar.f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        h2dVar.f(null);
                        throw th;
                    }
                }
                Function1 function12 = (Function1) ((hoi) this.v);
                ?? r3 = (h2d) this.t;
                y6a.M(obj);
                j2dVar = r3;
                function1 = function12;
            }
            this.t = j2dVar;
            this.v = null;
            this.s = 2;
            Object invoke = function1.invoke(this);
            if (invoke != lu3Var) {
                j2d j2dVar2 = j2dVar;
                obj = invoke;
                h2dVar = j2dVar2;
                h2dVar.f(null);
                return obj;
            }
            return lu3Var;
        } catch (Throwable th3) {
            j2d j2dVar3 = j2dVar;
            th = th3;
            h2dVar = j2dVar3;
            h2dVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc A[LOOP:1: B:20:0x00d6->B:22:0x00dc, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        fdi fdiVar;
        List list;
        CancellationException cancellationException;
        List list2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b bVar;
        Context context;
        c cVar;
        com.moloco.sdk.internal.publisher.nativead.b bVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a aVar;
        kn4 kn4Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar3;
        com.moloco.sdk.acm.recorder.c cVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b bVar4;
        Iterator it;
        z0 z0Var = (z0) this.w;
        h hVar = (h) this.v;
        fdi fdiVar2 = hVar.h;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.t;
            List j = b.j(xw3.L(ku3Var, null, null, new g(hVar, z0Var, rq3Var, 0), 3), xw3.L(ku3Var, null, null, new g(hVar, z0Var, rq3Var, i2), 3));
            try {
                Boolean bool = Boolean.TRUE;
                fdiVar2.getClass();
                fdiVar2.m(null, bool);
                bVar = StaticAdActivity.b;
                try {
                    context = hVar.a;
                    cVar = hVar.f;
                    try {
                        bVar2 = new com.moloco.sdk.internal.publisher.nativead.b(0, hVar, h.class, "onClose", "onClose()V", 0, 4);
                        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a(z0Var, 2);
                        kn4Var = (kn4) this.u;
                        bVar3 = hVar.b;
                        cVar2 = hVar.c;
                        cancellationException = null;
                        try {
                            bVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b(z0Var, 1);
                            this.t = j;
                            this.s = 1;
                            list = j;
                            fdiVar = fdiVar2;
                        } catch (Throwable th) {
                            th = th;
                            list = j;
                            fdiVar = fdiVar2;
                            list2 = list;
                            it = list2.iterator();
                            while (it.hasNext()) {
                                ((yda) it.next()).e(cancellationException);
                            }
                            Boolean bool2 = Boolean.FALSE;
                            fdiVar.getClass();
                            fdiVar.m(cancellationException, bool2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list = j;
                        cancellationException = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    list = j;
                    cancellationException = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fdiVar = fdiVar2;
                list = j;
                cancellationException = null;
            }
            try {
                if (bVar.a(context, cVar, bVar2, aVar, kn4Var, bVar3, cVar2, bVar4, this) == lu3Var) {
                    return lu3Var;
                }
                list2 = list;
            } catch (Throwable th5) {
                th = th5;
                list2 = list;
                it = list2.iterator();
                while (it.hasNext()) {
                }
                Boolean bool22 = Boolean.FALSE;
                fdiVar.getClass();
                fdiVar.m(cancellationException, bool22);
                throw th;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = (List) this.t;
            try {
                y6a.M(obj);
                fdiVar = fdiVar2;
                cancellationException = null;
            } catch (Throwable th6) {
                th = th6;
                fdiVar = fdiVar2;
                cancellationException = null;
                it = list2.iterator();
                while (it.hasNext()) {
                }
                Boolean bool222 = Boolean.FALSE;
                fdiVar.getClass();
                fdiVar.m(cancellationException, bool222);
                throw th;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((yda) it2.next()).e(cancellationException);
        }
        Boolean bool3 = Boolean.FALSE;
        fdiVar.getClass();
        fdiVar.m(cancellationException, bool3);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (defpackage.fcp.c0(r7, r2, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (((defpackage.j8f) r0).e.q(r6, r2) == r1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        k8f k8fVar = (k8f) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            Boolean bool = (Boolean) this.t;
            Boolean bool2 = Boolean.FALSE;
            if (Intrinsics.c(bool, bool2)) {
                this.s = 2;
            } else {
                z88 a = ((q) this.v).a((View) this.u);
                j92 j92Var = new j92(k8fVar, null);
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
        fsf fsfVar = (fsf) this.v;
        dsf dsfVar = (dsf) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                pog pogVar = new pog(new du1(dsfVar.a, null));
                k0 k0Var = new k0(0, dsfVar, (dsf) this.u, (k8f) this.w);
                this.s = 1;
                if (pogVar.collect(k0Var, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            fsfVar.a = null;
            return Unit.a;
        } catch (Throwable th) {
            fsfVar.a = null;
            throw th;
        }
    }

    private final Object n(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            r69 r69Var = f.m;
            t53 t53Var = new t53((j) this.t, (String) this.u, (u) this.v, (u) this.w, null, 16);
            this.s = 1;
            if (xw3.R(r69Var, t53Var, this) == lu3Var) {
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
        Object k;
        ng2 ng2Var = (ng2) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        s sVar = null;
        try {
        } catch (Exception unused) {
            if (sVar != null) {
                sVar.destroy();
            }
            ng2Var.destroy();
        }
        if (i == 0) {
            y6a.M(obj);
            i0 i0Var = (i0) ng2Var.a;
            if (i0Var != null) {
                Context context = (Context) this.v;
                com.moloco.sdk.internal.services.events.c cVar = (com.moloco.sdk.internal.services.events.c) ng2Var.c;
                t0 t0Var = (t0) ng2Var.d;
                Integer num = (Integer) this.u;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) this.w;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                com.moloco.sdk.service_locator.h hVar = new com.moloco.sdk.service_locator.h(26);
                com.appsflyer.internal.a aVar = new com.appsflyer.internal.a(27);
                this.s = 1;
                k = f1.k(i0Var, context, cVar, t0Var, intValue, intValue2, hVar, aVar, false, null, this);
                if (k == lu3Var) {
                    return lu3Var;
                }
            }
            ((fdi) ng2Var.g).l(sVar);
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        k = obj;
        sVar = (s) k;
        ((fdi) ng2Var.g).l(sVar);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r1 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        zu4 zu4Var;
        zu4 zu4Var2;
        Map map;
        Object T;
        Map map2;
        String str;
        BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = (BlazeGamCustomNativeAdRequestInformation) this.w;
        BlazeCustomNativeAdsProvider blazeCustomNativeAdsProvider = (BlazeCustomNativeAdsProvider) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        int i3 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.v;
            hs4 hs4Var = z45.a;
            hq4 hq4Var = hq4.c;
            av4 t = xw3.t(ku3Var, hq4Var, new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, 0), 2);
            av4 t2 = xw3.t(ku3Var, hq4Var, new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, i2), 2);
            av4 t3 = xw3.t(ku3Var, hq4Var, new n8m(blazeCustomNativeAdsProvider, blazeGamCustomNativeAdRequestInformation, rq3Var, i3), 2);
            this.v = t2;
            this.t = t3;
            this.s = 1;
            Object w = t.w(this);
            if (w != lu3Var) {
                zu4Var = t3;
                obj = w;
                zu4Var2 = t2;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.t;
                map2 = (Map) this.v;
                y6a.M(obj);
                return new mul(map2, str, (Bundle) obj);
            }
            Map map3 = (Map) this.t;
            zu4 zu4Var3 = (zu4) this.v;
            y6a.M(obj);
            T = obj;
            map = map3;
            zu4Var = zu4Var3;
            String str2 = (String) T;
            this.v = map;
            this.t = str2;
            this.s = 3;
            Object T2 = zu4Var.T(this);
            if (T2 != lu3Var) {
                Map map4 = map;
                obj = T2;
                map2 = map4;
                str = str2;
                return new mul(map2, str, (Bundle) obj);
            }
            return lu3Var;
        }
        zu4Var = (zu4) this.t;
        zu4Var2 = (zu4) this.v;
        y6a.M(obj);
        map = (Map) obj;
        this.v = zu4Var;
        this.t = map;
        this.s = 2;
        T = zu4Var2.T(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r1 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        zu4 zu4Var;
        zu4 zu4Var2;
        Map map;
        Object T;
        Map map2;
        String str;
        BlazeIMAAdRequestInformation blazeIMAAdRequestInformation = (BlazeIMAAdRequestInformation) this.w;
        ImaHandler imaHandler = (ImaHandler) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        int i3 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.v;
            hs4 hs4Var = z45.a;
            hq4 hq4Var = hq4.c;
            av4 t = xw3.t(ku3Var, hq4Var, new vum(imaHandler, blazeIMAAdRequestInformation, rq3Var, 0), 2);
            av4 t2 = xw3.t(ku3Var, hq4Var, new vum(imaHandler, blazeIMAAdRequestInformation, rq3Var, i2), 2);
            av4 t3 = xw3.t(ku3Var, hq4Var, new vum(imaHandler, blazeIMAAdRequestInformation, rq3Var, i3), 2);
            this.v = t2;
            this.t = t3;
            this.s = 1;
            Object w = t.w(this);
            if (w != lu3Var) {
                zu4Var = t3;
                obj = w;
                zu4Var2 = t2;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.t;
                map2 = (Map) this.v;
                y6a.M(obj);
                return new tnm(map2, str, (mr9) obj);
            }
            Map map3 = (Map) this.t;
            zu4 zu4Var3 = (zu4) this.v;
            y6a.M(obj);
            T = obj;
            map = map3;
            zu4Var = zu4Var3;
            String str2 = (String) T;
            this.v = map;
            this.t = str2;
            this.s = 3;
            Object T2 = zu4Var.T(this);
            if (T2 != lu3Var) {
                Map map4 = map;
                obj = T2;
                map2 = map4;
                str = str2;
                return new tnm(map2, str, (mr9) obj);
            }
            return lu3Var;
        }
        zu4Var = (zu4) this.t;
        zu4Var2 = (zu4) this.v;
        y6a.M(obj);
        map = (Map) obj;
        this.v = zu4Var;
        this.t = map;
        this.s = 2;
        T = zu4Var2.T(this);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new kuj((muj) obj2, rq3Var, 0);
            case 1:
                return new kuj((List) this.t, (Map) this.v, (ct8) obj2, (String) this.u, rq3Var);
            case 2:
                kuj kujVar = new kuj((quj) obj2, rq3Var, 2);
                kujVar.u = obj;
                return kujVar;
            case 3:
                kuj kujVar2 = new kuj((uvj) this.v, (Context) obj2, (String) this.u, rq3Var);
                kujVar2.t = obj;
                return kujVar2;
            case 4:
                kuj kujVar3 = new kuj((i1k) this.v, (int[]) this.u, (String[]) obj2, rq3Var, 4);
                kujVar3.t = obj;
                return kujVar3;
            case 5:
                kuj kujVar4 = new kuj((Collection) this.u, (g4k) obj2, rq3Var, 5);
                kujVar4.v = obj;
                return kujVar4;
            case 6:
                kuj kujVar5 = new kuj((agk) obj2, rq3Var, 6);
                kujVar5.u = obj;
                return kujVar5;
            case 7:
                return new kuj((String) this.t, (fkk) this.v, (String) obj2, rq3Var);
            case 8:
                u6b u6bVar = (u6b) this.t;
                e6b e6bVar = e6b.a;
                return new kuj(u6bVar, (b1d) this.v, (VenueMatchesFragment) this.u, rq3Var, (VenueMatchesFragment) obj2);
            case 9:
                return new kuj((Function0) this.t, (imh) this.v, (WeeklyChallengeViewModel) this.u, (e1d) obj2, rq3Var, 9);
            case 10:
                return new kuj((fsf) this.t, (kqf) this.v, (u6b) this.u, (yo8) obj2, rq3Var, 10);
            case 11:
                return new kuj((kdb) this.t, (lcl) this.v, (pbl) this.u, (Context) obj2, rq3Var, 11);
            case 12:
                u6b u6bVar2 = (u6b) this.t;
                e6b e6bVar2 = e6b.a;
                return new kuj(u6bVar2, (b1d) this.v, (WorldCupFragment) this.u, rq3Var, (WorldCupFragment) obj2);
            case 13:
                kuj kujVar6 = new kuj((kgl) obj2, rq3Var, 13);
                kujVar6.u = obj;
                return kujVar6;
            case 14:
                kuj kujVar7 = new kuj((kgl) obj2, rq3Var, 14);
                kujVar7.u = obj;
                return kujVar7;
            case 15:
                kuj kujVar8 = new kuj((List) this.t, (OddsCountryProvider) this.u, (qkl) obj2, rq3Var);
                kujVar8.v = obj;
                return kujVar8;
            case 16:
                kuj kujVar9 = new kuj((qkl) obj2, rq3Var, 16);
                kujVar9.u = obj;
                return kujVar9;
            case 17:
                kuj kujVar10 = new kuj((qkl) obj2, rq3Var, 17);
                kujVar10.u = obj;
                return kujVar10;
            case 18:
                return new kuj((MotionEvent) this.t, (ib) this.v, (q0) this.u, (aeh) obj2, rq3Var, 18);
            case 19:
                return new kuj(this.t, (String) this.u, this.v, obj2, rq3Var, 19);
            case 20:
                return new kuj((j2d) this.u, (Function1) obj2, rq3Var, 20);
            case 21:
                kuj kujVar11 = new kuj((h) this.v, (kn4) this.u, (z0) obj2, rq3Var, 21);
                kujVar11.t = obj;
                return kujVar11;
            case 22:
                kuj kujVar12 = new kuj((q) this.v, (View) this.u, (k8f) obj2, rq3Var, 22);
                kujVar12.t = obj;
                return kujVar12;
            case 23:
                return new kuj((dsf) this.t, (fsf) this.v, (dsf) this.u, (k8f) obj2, rq3Var, 23);
            case 24:
                return new kuj(this.t, (String) this.u, this.v, obj2, rq3Var, 24);
            case 25:
                return new kuj((ng2) this.t, (Context) this.v, (Integer) this.u, (Integer) obj2, rq3Var, 25);
            case 26:
                kuj kujVar13 = new kuj((BlazeCustomNativeAdsProvider) this.u, (BlazeGamCustomNativeAdRequestInformation) obj2, rq3Var, 26);
                kujVar13.v = obj;
                return kujVar13;
            case 27:
                kuj kujVar14 = new kuj((ImaHandler) this.u, (BlazeIMAAdRequestInformation) obj2, rq3Var, 27);
                kujVar14.v = obj;
                return kujVar14;
            default:
                kuj kujVar15 = new kuj((zzgtm) this.u, (Function2) obj2, rq3Var, 28);
                kujVar15.v = obj;
                return kujVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 4:
                ((kuj) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((kuj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0219, code lost:
    
        if (r0 == r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0208, code lost:
    
        if (r3 == r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0322, code lost:
    
        if (r1 == r2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03c2, code lost:
    
        if (r3 == r2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05d1, code lost:
    
        if (r0 == r4) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x058f, code lost:
    
        if (r2 == r4) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07c1, code lost:
    
        if (defpackage.xw3.R((kotlin.coroutines.CoroutineContext) r4, r8, r28) == r0) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x07af, code lost:
    
        if (r4 == r0) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x08df, code lost:
    
        if (r0 == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0821, code lost:
    
        if (r8 == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0b6d, code lost:
    
        if (r4 == r7) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0a7a, code lost:
    
        if (r8 == r7) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011e, code lost:
    
        if (r4 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0106, code lost:
    
        if (r0 == r1) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x09a3  */
    /* JADX WARN: Type inference failed for: r1v97, types: [hoi] */
    /* JADX WARN: Type inference failed for: r3v38, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v16, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:395:0x09a3 -> B:385:0x096d). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g;
        List list;
        String str;
        Object obj2;
        List j;
        Object r;
        Object value;
        Object e;
        String str2;
        List list2;
        ku3 ku3Var;
        quj qujVar;
        Object obj3;
        ku3 ku3Var2;
        svg svgVar;
        Object P;
        List<Category> categories;
        Object u;
        ?? r3;
        List<UniqueTournamentGroupResponse> groups;
        b98 b98Var;
        Object I;
        HashMap hashMap;
        Object u2;
        Object value2;
        av4 t;
        Object w;
        ProfileData profileData;
        Object P2;
        String str3;
        Object a;
        Object w2;
        av4 av4Var;
        Set set;
        Object T;
        av4 t2;
        Object w3;
        List list3;
        Object T2;
        av4 t3;
        Object w4;
        UniqueTournament uniqueTournament;
        Object T3;
        List<LastDancePost> lastDancePosts;
        String string;
        h2d h2dVar;
        h2d h2dVar2;
        Object r2;
        int i = this.r;
        r4 = false;
        boolean z = false;
        r4 = false;
        boolean z2 = false;
        int i2 = 3;
        int i3 = 2;
        Object obj4 = this.w;
        int i4 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                muj mujVar = (muj) obj4;
                LinkedHashMap linkedHashMap = mujVar.t;
                int i5 = mujVar.n;
                int i6 = mujVar.m;
                vtj vtjVar = mujVar.l;
                lu3 lu3Var = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Context i8 = mujVar.i();
                    this.s = 1;
                    g = vtjVar.g(i6, i5, i8, this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list4 = (List) this.v;
                            String str4 = (String) this.u;
                            list2 = (List) this.t;
                            y6a.M(obj);
                            j = list4;
                            str2 = str4;
                            e = obj;
                            List list5 = (List) e;
                            int size = list5.size();
                            mujVar.o(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b(str2, mujVar, list5, size, (auj) CollectionsKt.a0(size - 1, list5), list2, j, mujVar.t(j, new Integer(size), size, list2)));
                            return Unit.a;
                        }
                        j = (List) this.v;
                        String str5 = (String) this.u;
                        List list6 = (List) this.t;
                        y6a.M(obj);
                        list = list6;
                        str = str5;
                        r = obj;
                        for (Pair pair : (List) r) {
                            linkedHashMap.put(new Integer(((Number) pair.a).intValue()), (xtj) pair.b);
                        }
                        xtj xtjVar = (xtj) CollectionsKt.Z(linkedHashMap.values());
                        this.t = list;
                        this.u = str;
                        this.v = j;
                        this.s = 3;
                        e = vtjVar.e(i6, i5, xtjVar, this);
                        if (e != lu3Var) {
                            str2 = str;
                            list2 = list;
                            List list52 = (List) e;
                            int size2 = list52.size();
                            mujVar.o(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b(str2, mujVar, list52, size2, (auj) CollectionsKt.a0(size2 - 1, list52), list2, j, mujVar.t(j, new Integer(size2), size2, list2)));
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    y6a.M(obj);
                    g = obj;
                }
                iuj iujVar = (iuj) g;
                list = iujVar.a;
                if (list.isEmpty()) {
                    fdi fdiVar = mujVar.e;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, new snb()));
                    return Unit.a;
                }
                str = iujVar.b;
                if (str == null) {
                    str = mujVar.p;
                }
                Integer num = mujVar.s;
                Integer num2 = mujVar.r;
                r4 = (num2 == null && num == null) ? 0 : 1;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((huj) it.next()).a));
                }
                Set W0 = CollectionsKt.W0(arrayList);
                if (r4 == 0) {
                    huj hujVar = (huj) CollectionsKt.firstOrNull(list);
                    Integer valueOf = hujVar != null ? Integer.valueOf(hujVar.a) : null;
                    huj hujVar2 = (huj) CollectionsKt.a0(1, list);
                    j = b.j(valueOf, hujVar2 != null ? Integer.valueOf(hujVar2.a) : null);
                } else {
                    if (num2 == null || !W0.contains(num2)) {
                        huj hujVar3 = (huj) CollectionsKt.firstOrNull(list);
                        num2 = hujVar3 != null ? Integer.valueOf(hujVar3.a) : null;
                    }
                    if (num == null || !W0.contains(num)) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                int i9 = ((huj) obj2).a;
                                if (num2 != null && i9 == num2.intValue()) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        huj hujVar4 = (huj) obj2;
                        num = hujVar4 != null ? Integer.valueOf(hujVar4.a) : null;
                    }
                    j = b.j(num2, num);
                }
                this.t = list;
                this.u = str;
                this.v = j;
                this.s = 2;
                r = s9a.r(new h4i(j, mujVar, (rq3) null, 21), this);
                break;
                break;
            case 1:
                List<String> list7 = (List) this.t;
                lu3 lu3Var2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    if (list7.isEmpty()) {
                        return Unit.a;
                    }
                    LinkedHashMap k = tub.k(bob.a(), (Map) this.v);
                    ArrayList arrayList2 = new ArrayList(k13.r(list7, 10));
                    for (String str6 : list7) {
                        str6.getClass();
                        arrayList2.add(new k38(str6));
                    }
                    aob aobVar = new aob(k, i4);
                    q3h q3hVar = new q3h((String) this.u, i4);
                    this.s = 1;
                    if (ztj.a(arrayList2, null, (ct8) obj4, aobVar, q3hVar, this, 1) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                quj qujVar2 = (quj) obj4;
                lu3 lu3Var3 = lu3.a;
                int i11 = this.s;
                try {
                    if (i11 == 0) {
                        y6a.M(obj);
                        ku3Var = (ku3) this.u;
                    } else {
                        if (i11 == 1) {
                            svgVar = (svg) this.v;
                            quj qujVar3 = (quj) this.t;
                            ku3 ku3Var3 = (ku3) this.u;
                            y6a.M(obj);
                            qujVar = qujVar3;
                            ku3Var2 = ku3Var3;
                            obj3 = obj;
                            this.u = ku3Var2;
                            this.t = null;
                            this.v = null;
                            this.s = 2;
                            if (qujVar.k(svgVar, (ouj) obj3, this) != lu3Var3) {
                                ku3Var = ku3Var2;
                            }
                            return lu3Var3;
                        }
                        if (i11 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ku3Var = (ku3) this.u;
                        y6a.M(obj);
                    }
                    if (!bea.B(ku3Var.getCoroutineContext())) {
                        qujVar2.g = null;
                        return Unit.a;
                    }
                    svg svgVar2 = (svg) qujVar2.b;
                    g62 g62Var = qujVar2.f;
                    this.u = ku3Var;
                    this.t = qujVar2;
                    this.v = svgVar2;
                    this.s = 1;
                    obj3 = g62Var.f(this);
                    if (obj3 == lu3Var3) {
                        return lu3Var3;
                    }
                    ku3Var2 = ku3Var;
                    svgVar = svgVar2;
                    qujVar = qujVar2;
                    this.u = ku3Var2;
                    this.t = null;
                    this.v = null;
                    this.s = 2;
                    if (qujVar.k(svgVar, (ouj) obj3, this) != lu3Var3) {
                    }
                    return lu3Var3;
                } catch (Throwable th) {
                    qujVar2.g = null;
                    throw th;
                }
            case 3:
                uvj uvjVar = (uvj) this.v;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = uvjVar.b;
                    this.t = ku3Var4;
                    this.s = 1;
                    vyhVar.getClass();
                    P = yaa.P(new uyh(vyhVar, Sports.FOOTBALL, rq3Var, i3), this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u = obj;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = ((Iterable) u).iterator();
                        while (it3.hasNext()) {
                            CategoryUniqueTournamentResponse categoryUniqueTournamentResponse = (CategoryUniqueTournamentResponse) yaa.x((x2g) it3.next());
                            if (categoryUniqueTournamentResponse == null || (groups = categoryUniqueTournamentResponse.getGroups()) == null) {
                                r3 = km5.a;
                            } else {
                                r3 = new ArrayList();
                                Iterator it4 = groups.iterator();
                                while (it4.hasNext()) {
                                    o13.v(((UniqueTournamentGroupResponse) it4.next()).getUniqueTournaments(), r3);
                                }
                            }
                            o13.v(r3, arrayList3);
                        }
                        return CollectionsKt.H0(arrayList3, new q6i(11));
                    }
                    y6a.M(obj);
                    P = obj;
                }
                SportCategoriesResponse sportCategoriesResponse = (SportCategoriesResponse) yaa.x((x2g) P);
                if (sportCategoriesResponse != null && (categories = sportCategoriesResponse.getCategories()) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : categories) {
                        if (!t62.J((Category) obj5)) {
                            arrayList4.add(obj5);
                        }
                    }
                    Context context = (Context) obj4;
                    String str7 = (String) this.u;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        Category category = (Category) next;
                        String name = category.getName();
                        String q = tba.q(category, context);
                        Locale locale = Locale.ROOT;
                        String lowerCase = name.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = str7.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!StringsKt.J(lowerCase, lowerCase2, false)) {
                            String lowerCase3 = q.toLowerCase(locale);
                            lowerCase3.getClass();
                            String lowerCase4 = str7.toLowerCase(locale);
                            lowerCase4.getClass();
                            if (!StringsKt.J(lowerCase3, lowerCase4, false)) {
                            }
                        }
                        arrayList5.add(next);
                    }
                    ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(xw3.t(ku3Var4, null, new vki(uvjVar, (Category) it6.next(), rq3Var, 18), 3));
                    }
                    this.t = null;
                    this.s = 2;
                    u = m6k.u(arrayList6, this);
                    break;
                } else {
                    return null;
                }
                break;
            case 4:
                int[] iArr = (int[]) this.u;
                i1k i1kVar = (i1k) this.v;
                lu3 lu3Var5 = lu3.a;
                int i13 = this.s;
                try {
                    if (i13 == 0) {
                        y6a.M(obj);
                        b98Var = (b98) this.t;
                        if (((pkd) i1kVar.h).a(iArr)) {
                            k6g k6gVar = (k6g) i1kVar.b;
                            this.t = b98Var;
                            this.s = 1;
                            I = gz8.I(k6gVar, false, this);
                            break;
                        }
                        fsf fsfVar = new fsf();
                        yia yiaVar = (yia) i1kVar.i;
                        yn2 yn2Var = new yn2(fsfVar, b98Var, (String[]) obj4, iArr);
                        this.t = null;
                        this.s = 3;
                        yiaVar.e(yn2Var, this);
                        return lu3Var5;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            throw new fka();
                        }
                        b98Var = (b98) this.t;
                        y6a.M(obj);
                        fsf fsfVar2 = new fsf();
                        yia yiaVar2 = (yia) i1kVar.i;
                        yn2 yn2Var2 = new yn2(fsfVar2, b98Var, (String[]) obj4, iArr);
                        this.t = null;
                        this.s = 3;
                        yiaVar2.e(yn2Var2, this);
                        return lu3Var5;
                    }
                    b98Var = (b98) this.t;
                    y6a.M(obj);
                    I = obj;
                    luj lujVar = new luj(i1kVar, rq3Var, i2);
                    this.t = b98Var;
                    this.s = 2;
                    break;
                } catch (Throwable th2) {
                    ((pkd) i1kVar.h).b(iArr);
                    throw th2;
                }
            case 5:
                ku3 ku3Var5 = (ku3) this.v;
                lu3 lu3Var6 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    hashMap = new HashMap();
                    for (TvChannel tvChannel : (Collection) this.u) {
                        ?? r8 = hashMap.get(new Integer(tvChannel.getId()));
                        if (r8 == null) {
                            r8 = new ArrayList();
                        }
                        List list8 = (List) r8;
                        list8.add(tvChannel.getCountryCode());
                        hashMap.put(new Integer(tvChannel.getId()), list8);
                    }
                    Set keySet = hashMap.keySet();
                    keySet.getClass();
                    Set set2 = keySet;
                    g4k g4kVar = (g4k) obj4;
                    ArrayList arrayList7 = new ArrayList(k13.r(set2, 10));
                    Iterator it7 = set2.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(xw3.t(ku3Var5, null, new vki(g4kVar, (Integer) it7.next(), rq3Var, 23), 3));
                    }
                    this.v = null;
                    this.t = hashMap;
                    this.s = 1;
                    u2 = m6k.u(arrayList7, this);
                    if (u2 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    HashMap hashMap2 = (HashMap) this.t;
                    y6a.M(obj);
                    hashMap = hashMap2;
                    u2 = obj;
                }
                ArrayList U0 = CollectionsKt.U0((Collection) u2);
                ArrayList arrayList8 = new ArrayList();
                Iterator it8 = U0.iterator();
                while (it8.hasNext()) {
                    x2g x2gVar = (x2g) it8.next();
                    if (x2gVar instanceof v2g) {
                        TvChannelScheduleResponse tvChannelScheduleResponse = (TvChannelScheduleResponse) ((v2g) x2gVar).a;
                        TvChannel channel = tvChannelScheduleResponse.getChannel();
                        String h = me4.h("\\s+", channel.getName(), " ");
                        for (Event event : tvChannelScheduleResponse.getEvents()) {
                            List list9 = (List) hashMap.get(new Integer(channel.getId()));
                            if (list9 != null) {
                                Iterator it9 = list9.iterator();
                                while (it9.hasNext()) {
                                    arrayList8.add(new Pair(TvChannel.copy$default(channel, 0, h, (String) it9.next(), null, 9, null), event));
                                }
                            }
                        }
                        for (Stage stage : tvChannelScheduleResponse.getStages()) {
                            List list10 = (List) hashMap.get(new Integer(channel.getId()));
                            if (list10 != null) {
                                Iterator it10 = list10.iterator();
                                while (it10.hasNext()) {
                                    arrayList8.add(new Pair(TvChannel.copy$default(channel, 0, h, (String) it10.next(), null, 9, null), stage));
                                }
                            }
                        }
                    }
                }
                return arrayList8;
            case 6:
                agk agkVar = (agk) obj4;
                yzc yzcVar = agkVar.l;
                bfk bfkVar = agkVar.e;
                ku3 ku3Var6 = (ku3) this.u;
                lu3 lu3Var7 = lu3.a;
                int i15 = this.s;
                rq3 rq3Var2 = null;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (bfkVar.b().getIsLoggedIn()) {
                        av4 t4 = xw3.t(ku3Var6, null, new yfk(agkVar, rq3Var2, i3), 3);
                        t = xw3.t(ku3Var6, null, new yfk(agkVar, rq3Var2, i4), 3);
                        this.u = null;
                        this.t = t;
                        this.s = 1;
                        w = t4.w(this);
                        break;
                    } else {
                        agkVar.t = "";
                        fdi fdiVar2 = agkVar.n;
                        do {
                            value2 = fdiVar2.getValue();
                        } while (!fdiVar2.k(value2, null));
                        yzcVar.j(null);
                    }
                } else {
                    if (i15 == 1) {
                        av4 av4Var2 = (av4) this.t;
                        y6a.M(obj);
                        t = av4Var2;
                        w = obj;
                        ProfileData profileData2 = (ProfileData) yaa.x((x2g) w);
                        yzcVar.j(profileData2);
                        this.u = null;
                        this.t = null;
                        this.v = profileData2;
                        this.s = 2;
                        if (t.T(this) != lu3Var7) {
                            profileData = profileData2;
                            if (profileData != null) {
                            }
                        }
                        return lu3Var7;
                    }
                    if (i15 == 2) {
                        ProfileData profileData3 = (ProfileData) this.v;
                        y6a.M(obj);
                        profileData = profileData3;
                        if (profileData != null) {
                            this.u = null;
                            this.t = null;
                            this.v = null;
                            this.s = 3;
                            Object a2 = rf4.a(bfkVar.a).a(new t53(profileData, rq3Var2, rq3Var2, rq3Var2, 12), this);
                            if (a2 != lu3Var7) {
                                a2 = Unit.a;
                                break;
                            }
                        }
                    } else {
                        if (i15 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    String str8 = (String) this.t;
                    dhk dhkVar = ((fkk) this.v).b;
                    this.u = str8;
                    this.s = 1;
                    dhkVar.getClass();
                    P2 = yaa.P(new yw(dhkVar, str8, (String) obj4, null, 19), this);
                    if (P2 == lu3Var8) {
                        return lu3Var8;
                    }
                    str3 = str8;
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) this.u;
                    y6a.M(obj);
                    P2 = obj;
                }
                return new Pair(str3, P2);
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.c;
                    h4i h4iVar = new h4i((b1d) this.v, (VenueMatchesFragment) this.u, (rq3) null, (VenueMatchesFragment) obj4, 24);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, h4iVar, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                e1d e1dVar = (e1d) obj4;
                lu3 lu3Var10 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    if (((Integer) e1dVar.getValue()) != null) {
                        ((Function0) this.t).invoke();
                        imh imhVar = (imh) this.v;
                        Integer num3 = (Integer) e1dVar.getValue();
                        num3.getClass();
                        efi efiVar = new efi(num3.intValue(), R.drawable.ic_weekly_streak);
                        this.s = 1;
                        if (imhVar.a(efiVar, this) == lu3Var10) {
                            return lu3Var10;
                        }
                    }
                    return Unit.a;
                }
                if (i18 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ((WeeklyChallengeViewModel) this.u).v.l(null);
                return Unit.a;
            case 10:
                yo8 yo8Var = (yo8) obj4;
                u6b u6bVar2 = (u6b) this.u;
                kqf kqfVar = (kqf) this.v;
                lu3 lu3Var11 = lu3.a;
                int i19 = this.s;
                try {
                    if (i19 == 0) {
                        y6a.M(obj);
                        qvc qvcVar = (qvc) ((fsf) this.t).a;
                        if (qvcVar != null) {
                            qvcVar.b = s9a.c(kqfVar.y);
                        }
                        this.s = 1;
                        if (kqfVar.Q(this) == lu3Var11) {
                            return lu3Var11;
                        }
                    } else {
                        if (i19 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    u6bVar2.getLifecycle().d(yo8Var);
                    return Unit.a;
                } catch (Throwable th3) {
                    u6bVar2.getLifecycle().d(yo8Var);
                    throw th3;
                }
            case 11:
                lcl lclVar = (lcl) this.v;
                kdb kdbVar = (kdb) this.t;
                lu3 lu3Var12 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ddb foregroundInfoAsync = kdbVar.getForegroundInfoAsync();
                    foregroundInfoAsync.getClass();
                    this.s = 1;
                    a = hdl.a(foregroundInfoAsync, kdbVar, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                gm8 gm8Var = (gm8) a;
                if (gm8Var == null) {
                    a70.r(mz1.o(new StringBuilder("Worker was marked important ("), lclVar.c, ") but did not provide ForegroundInfo"));
                    return null;
                }
                int i21 = obl.a;
                rik.o().getClass();
                pbl pblVar = (pbl) this.u;
                xh2 z3 = x2a.z(pblVar.a.a, "setForegroundAsync", new m61(pblVar, kdbVar.getId(), gm8Var, (Context) obj4, 28));
                this.s = 2;
                Object o = o3a.o(z3, this);
                if (o != lu3Var12) {
                    return o;
                }
                return lu3Var12;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    u6b u6bVar3 = (u6b) this.t;
                    e6b e6bVar2 = e6b.c;
                    fdl fdlVar = new fdl((b1d) this.v, (WorldCupFragment) this.u, (rq3) null, (WorldCupFragment) obj4);
                    this.s = 1;
                    if (b6a.A(u6bVar3, e6bVar2, fdlVar, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                kgl kglVar = (kgl) obj4;
                ku3 ku3Var7 = (ku3) this.u;
                lu3 lu3Var14 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    av4 t5 = xw3.t(ku3Var7, null, new ggl(kglVar, rq3Var, r4), 3);
                    av4 t6 = xw3.t(ku3Var7, null, new ggl(kglVar, rq3Var, i4), 3);
                    vel velVar = vel.a;
                    Set W02 = CollectionsKt.W0(vel.a().values());
                    this.u = null;
                    this.t = t6;
                    this.v = W02;
                    this.s = 1;
                    w2 = t5.w(this);
                    if (w2 != lu3Var14) {
                        av4Var = t6;
                        set = W02;
                    }
                    return lu3Var14;
                }
                if (i23 != 1) {
                    if (i23 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) this.v;
                    y6a.M(obj);
                    T = obj;
                    Iterable iterable = (Iterable) T;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it11 = iterable.iterator();
                        while (it11.hasNext()) {
                            if (set.contains(new Integer(((Team) it11.next()).getId()))) {
                                z2 = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                set = (Set) this.v;
                av4 av4Var3 = (av4) this.t;
                y6a.M(obj);
                av4Var = av4Var3;
                w2 = obj;
                Iterable iterable2 = (Iterable) w2;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it12 = iterable2.iterator();
                    while (it12.hasNext()) {
                        if (((UniqueTournament) it12.next()).getId() == 16) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                this.u = null;
                this.t = null;
                this.v = set;
                this.s = 2;
                T = av4Var.T(this);
                break;
            case 14:
                kgl kglVar2 = (kgl) obj4;
                ku3 ku3Var8 = (ku3) this.u;
                lu3 lu3Var15 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    av4 t7 = xw3.t(ku3Var8, null, new ggl(kglVar2, rq3Var, 7), 3);
                    t2 = xw3.t(ku3Var8, null, new ggl(kglVar2, rq3Var, 6), 3);
                    this.u = null;
                    this.v = t2;
                    this.s = 1;
                    w3 = t7.w(this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list11 = (List) this.t;
                        y6a.M(obj);
                        list3 = list11;
                        T2 = obj;
                        List list12 = (List) T2;
                        vel velVar2 = vel.a;
                        Set W03 = CollectionsKt.W0(vel.a().values());
                        if (list12 == null || !list12.isEmpty()) {
                            Iterator it13 = list12.iterator();
                            while (it13.hasNext()) {
                                if (((UniqueTournament) it13.next()).getId() == 16) {
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it14 = list3.iterator();
                            while (it14.hasNext()) {
                                if (W03.contains(new Integer(((Team) it14.next()).getId()))) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    t2 = (av4) this.v;
                    y6a.M(obj);
                    w3 = obj;
                }
                list3 = (List) w3;
                this.u = null;
                this.v = null;
                this.t = list3;
                this.s = 2;
                T2 = t2.T(this);
                break;
            case 15:
                return e(obj);
            case 16:
                qkl qklVar = (qkl) obj4;
                ku3 ku3Var9 = (ku3) this.u;
                lu3 lu3Var16 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    t3 = xw3.t(ku3Var9, null, new njl(qklVar, rq3Var, i2), 3);
                    av4 p = yaa.p(ku3Var9, qklVar.Q == null, new njl(qklVar, rq3Var, 4));
                    if (p != null) {
                        this.u = null;
                        this.t = t3;
                        this.s = 1;
                        w4 = p.w(this);
                        break;
                    }
                    uniqueTournament = qklVar.Q;
                    this.u = null;
                    this.t = null;
                    this.v = uniqueTournament;
                    this.s = 2;
                    T3 = t3.T(this);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uniqueTournament = (UniqueTournament) this.v;
                        y6a.M(obj);
                        T3 = obj;
                        UniqueTournamentLastDanceResponse uniqueTournamentLastDanceResponse = (UniqueTournamentLastDanceResponse) yaa.x((x2g) T3);
                        if (uniqueTournamentLastDanceResponse == null || (lastDancePosts = uniqueTournamentLastDanceResponse.getLastDancePosts()) == null) {
                            return null;
                        }
                        ArrayList arrayList9 = new ArrayList(k13.r(lastDancePosts, 10));
                        for (LastDancePost lastDancePost : lastDancePosts) {
                            arrayList9.add(new WorldCupLastDanceUiModel(lastDancePost.getPlayer().getId(), tba.t(lastDancePost.getPlayer()), lastDancePost.getImageUrl(), lastDancePost.getTitle(), lastDancePost.getDescription(), (uniqueTournament == null || (string = qklVar.i().getString(R.string.share_screen_preview_text, lastDancePost.getTitle(), Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{qklVar.i().getString(R.string.share_link), uniqueTournament.getWebUrl(), ""}, 3))).toString())) == null) ? "" : string));
                        }
                        return l6g.W(arrayList9);
                    }
                    av4 av4Var4 = (av4) this.t;
                    y6a.M(obj);
                    t3 = av4Var4;
                    w4 = obj;
                }
                uniqueTournament = (UniqueTournament) w4;
                if (uniqueTournament != null) {
                    qklVar.Q = uniqueTournament;
                    this.u = null;
                    this.t = null;
                    this.v = uniqueTournament;
                    this.s = 2;
                    T3 = t3.T(this);
                }
                uniqueTournament = qklVar.Q;
                this.u = null;
                this.t = null;
                this.v = uniqueTournament;
                this.s = 2;
                T3 = t3.T(this);
                break;
            case 17:
                return f(obj);
            case 18:
                return g(obj);
            case 19:
                return h(obj);
            case 20:
                return j(obj);
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return m(obj);
            case 24:
                return n(obj);
            case 25:
                return o(obj);
            case 26:
                return p(obj);
            case 27:
                return q(obj);
            default:
                lu3 lu3Var17 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.v);
                    j2d j2dVar = ((zzgtm) this.u).a;
                    this.v = j2dVar;
                    this.t = (hoi) ((Function2) obj4);
                    this.s = 1;
                    if (z9a.c(pgo.b, j2dVar, this) == lu3Var17) {
                        return lu3Var17;
                    }
                    rq3 b = z9a.b(this);
                    Unit unit = Unit.a;
                    p2g p2gVar = w2g.b;
                    b.resumeWith(unit);
                    return lu3Var17;
                }
                if (i26 != 1) {
                    h2dVar2 = (h2d) this.v;
                    try {
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                        r2 = obj;
                    } catch (Throwable th4) {
                        th = th4;
                        h2dVar2.f(null);
                        throw th;
                    }
                } else {
                    Function2 function2 = (Function2) ((hoi) this.t);
                    h2dVar = (h2d) this.v;
                    y6a.M(obj);
                    try {
                        this.v = h2dVar;
                        this.t = null;
                        this.s = 2;
                        r2 = s9a.r(function2, this);
                        if (r2 == lu3Var17) {
                            return lu3Var17;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        h2dVar2 = h2dVar;
                        h2dVar2.f(null);
                        throw th;
                    }
                }
                h2dVar.f(null);
                return r2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(u6b u6bVar, b1d b1dVar, WorldCupFragment worldCupFragment, rq3 rq3Var, WorldCupFragment worldCupFragment2) {
        super(2, rq3Var);
        this.r = 12;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.v = b1dVar;
        this.u = worldCupFragment;
        this.w = worldCupFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(uvj uvjVar, Context context, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.v = uvjVar;
        this.w = context;
        this.u = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.u = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.v = obj2;
        this.u = obj3;
        this.w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(Object obj, String str, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = str;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(String str, fkk fkkVar, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        this.t = str;
        this.v = fkkVar;
        this.w = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(List list, OddsCountryProvider oddsCountryProvider, qkl qklVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 15;
        this.t = list;
        this.u = oddsCountryProvider;
        this.w = qklVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuj(List list, Map map, ct8 ct8Var, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.t = list;
        this.v = map;
        this.w = ct8Var;
        this.u = str;
    }
}
