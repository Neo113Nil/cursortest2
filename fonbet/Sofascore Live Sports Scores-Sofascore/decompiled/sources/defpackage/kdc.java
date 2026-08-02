package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.inmobi.media.Sj;
import com.inmobi.media.Vj;
import com.ironsource.C4036d8;
import com.ironsource.C4221ne;
import com.ironsource.J9;
import com.ironsource.N9;
import com.ironsource.Q1;
import com.ironsource.R8;
import com.ironsource.Sc;
import com.ironsource.U2;
import com.ironsource.Va;
import com.ironsource.Y2;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryData;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDetails;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.view.EventInfoView;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kdc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kdc(p4d p4dVar, i1 i1Var, zj3 zj3Var, long j, String str) {
        this.a = 6;
        this.b = p4dVar;
        this.c = i1Var;
        this.d = zj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rq3 rq3Var = null;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        switch (this.a) {
            case 0:
                odc odcVar = (odc) this.b;
                Pair pair = (Pair) this.c;
                ((cn4) odcVar.b.j).k(((Integer) pair.first).intValue(), (scc) pair.second, (eja) this.d);
                return;
            case 1:
                odc odcVar2 = (odc) this.b;
                Pair pair2 = (Pair) this.c;
                ((cn4) odcVar2.b.j).a(((Integer) pair2.first).intValue(), (scc) pair2.second, (Exception) this.d);
                return;
            case 2:
                Map<String, String> map = (Map) this.b;
                Context context = (Context) this.c;
                MintegralMediationAdapter.d.init(map, context, new wj9(25, context, (InitializationCompleteCallback) this.d));
                return;
            case 3:
                MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails = (MmaPostMatchVotingMotionViewDetails) this.b;
                MmaPostMatchVote mmaPostMatchVote = (MmaPostMatchVote) this.c;
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) this.d;
                int i = MmaPostMatchVotingMotionViewDetails.p;
                mmaPostMatchVotingMotionViewDetails.s(mmaPostMatchVote, mmaPostMatchVotingOptions, true);
                return;
            case 4:
                N9.a((InitRequest) this.b, (Context) this.c, (InitListener) this.d);
                return;
            case 5:
                N9.a((C4221ne) this.b, (InitListener) this.c, (C4221ne) this.d);
                return;
            case 6:
                ((i1) this.c).a((p4d) this.b, (zj3) this.d);
                return;
            case 7:
                rfe rfeVar = (rfe) this.b;
                p03 p03Var = (p03) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                ViewPropertyAnimator animate = rfeVar.d.animate();
                animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                animate.setDuration(200L);
                animate.setInterpolator(new AccelerateDecelerateInterpolator());
                animate.withEndAction(new gjc(12, p03Var, frameLayout));
                animate.start();
                return;
            case 8:
                tug tugVar = (tug) this.b;
                dt5 dt5Var = (dt5) this.c;
                dt5 dt5Var2 = (dt5) this.d;
                ConstraintLayout constraintLayout = dt5Var.a;
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                tugVar.e(context2);
                Integer c4 = tugVar.c();
                if (c4 != null) {
                    r2 = c4.intValue();
                } else {
                    Context context3 = constraintLayout.getContext();
                    context3.getClass();
                    if (hkg.c0(context3)) {
                        r2 = dt5Var.b.getWidth();
                    }
                }
                dt5Var.f.setScrollX(r2);
                i9a.F(dt5Var2, r2);
                return;
            case 9:
                tue tueVar = (tue) this.b;
                PlayerPenaltyHistoryData playerPenaltyHistoryData = (PlayerPenaltyHistoryData) this.c;
                PlayerPenaltyHistoryData playerPenaltyHistoryData2 = (PlayerPenaltyHistoryData) this.d;
                js2 js2Var = tueVar.j;
                ((PlayerPenaltyShotView) js2Var.m).b(playerPenaltyHistoryData);
                TextView textView = (TextView) js2Var.o;
                Context context4 = tueVar.getContext();
                context4.getClass();
                PlayerPenaltyHistoryData playerPenaltyHistoryData3 = tueVar.k;
                if (playerPenaltyHistoryData3 == null) {
                    Intrinsics.i("selectedShot");
                    throw null;
                }
                textView.setText(tgj.L(context4, playerPenaltyHistoryData3.getOutcome(), null));
                TextView textView2 = js2Var.d;
                Context context5 = tueVar.getContext();
                context5.getClass();
                PlayerPenaltyHistoryData playerPenaltyHistoryData4 = tueVar.k;
                if (playerPenaltyHistoryData4 == null) {
                    Intrinsics.i("selectedShot");
                    throw null;
                }
                textView2.setText(tgj.K(context5, playerPenaltyHistoryData4.getZone(), false));
                EventInfoView eventInfoView = (EventInfoView) js2Var.k;
                final Event event = playerPenaltyHistoryData2.getEvent();
                event.getClass();
                final nr1 nr1Var = eventInfoView.d;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) nr1Var.c;
                constraintLayout2.setClickable(true);
                aba.y(constraintLayout2, 0, 3);
                constraintLayout2.setOnClickListener(new cn(28, constraintLayout2, event));
                TextView textView3 = (TextView) nr1Var.g;
                long startTimestamp = event.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
                format.getClass();
                textView3.setText(format);
                textView3.setVisibility(0);
                as9.o((ImageView) nr1Var.f, Event.getHomeTeam$default(event, null, 1, null).getId());
                as9.o((ImageView) nr1Var.e, Event.getAwayTeam$default(event, null, 1, null).getId());
                if (Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_POSTPONED) || me4.t(StatusKt.STATUS_CANCELED, event)) {
                    TextView textView4 = (TextView) nr1Var.i;
                    textView4.setVisibility(0);
                    Context context6 = textView4.getContext();
                    context6.getClass();
                    textView4.setText(afi.c(context6, event.getStatusDescription(), ok3.s(event), true));
                    ((TextView) nr1Var.d).setVisibility(4);
                    return;
                }
                Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
                if (display != null) {
                    final int intValue = display.intValue();
                    Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
                    if (display2 != null) {
                        final int intValue2 = display2.intValue();
                        ((TextView) nr1Var.h).post(new Runnable() { // from class: p16
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = r4;
                                Event event2 = event;
                                int i3 = intValue;
                                nr1 nr1Var2 = nr1Var;
                                switch (i2) {
                                    case 0:
                                        int i4 = EventInfoView.e;
                                        TextView textView5 = (TextView) nr1Var2.h;
                                        textView5.setVisibility(0);
                                        String valueOf = String.valueOf(i3);
                                        Integer winnerCode$default = Event.getWinnerCode$default(event2, null, 1, null);
                                        if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                                            haa.C(textView5);
                                        } else {
                                            haa.D(textView5);
                                        }
                                        textView5.setText(valueOf);
                                        break;
                                    default:
                                        int i5 = EventInfoView.e;
                                        TextView textView6 = nr1Var2.b;
                                        textView6.setVisibility(0);
                                        String valueOf2 = String.valueOf(i3);
                                        Integer winnerCode$default2 = Event.getWinnerCode$default(event2, null, 1, null);
                                        if (winnerCode$default2 != null && winnerCode$default2.intValue() == 2) {
                                            haa.C(textView6);
                                        } else {
                                            haa.D(textView6);
                                        }
                                        textView6.setText(valueOf2);
                                        break;
                                }
                            }
                        });
                        TextView textView5 = nr1Var.b;
                        final char c5 = c == true ? 1 : 0;
                        textView5.post(new Runnable() { // from class: p16
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = c5;
                                Event event2 = event;
                                int i3 = intValue2;
                                nr1 nr1Var2 = nr1Var;
                                switch (i2) {
                                    case 0:
                                        int i4 = EventInfoView.e;
                                        TextView textView52 = (TextView) nr1Var2.h;
                                        textView52.setVisibility(0);
                                        String valueOf = String.valueOf(i3);
                                        Integer winnerCode$default = Event.getWinnerCode$default(event2, null, 1, null);
                                        if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                                            haa.C(textView52);
                                        } else {
                                            haa.D(textView52);
                                        }
                                        textView52.setText(valueOf);
                                        break;
                                    default:
                                        int i5 = EventInfoView.e;
                                        TextView textView6 = nr1Var2.b;
                                        textView6.setVisibility(0);
                                        String valueOf2 = String.valueOf(i3);
                                        Integer winnerCode$default2 = Event.getWinnerCode$default(event2, null, 1, null);
                                        if (winnerCode$default2 != null && winnerCode$default2.intValue() == 2) {
                                            haa.C(textView6);
                                        } else {
                                            haa.D(textView6);
                                        }
                                        textView6.setText(valueOf2);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((txe) this.b).a((SurfaceView) this.c, (yp8) this.d);
                return;
            case 11:
                g8f g8fVar = (g8f) this.b;
                xh2 xh2Var = (xh2) this.c;
                gdl gdlVar = (gdl) this.d;
                g8fVar.getClass();
                try {
                    z = ((Boolean) xh2Var.b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (g8fVar.k) {
                    try {
                        qbl p = rha.p(gdlVar.a);
                        String str = p.a;
                        if (g8fVar.c(str) == gdlVar) {
                            g8fVar.b(str);
                        }
                        rik.o().getClass();
                        Iterator it = g8fVar.j.iterator();
                        while (it.hasNext()) {
                            ((qe6) it.next()).a(p, z);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                Q1.c.a((Q1) this.b, (String) this.c, (Q1.d) this.d);
                return;
            case 13:
                R8.a((R8) this.b, (String) this.c, (LevelPlayImpressionDataListener) this.d);
                return;
            case 14:
                ((IUnityAdsInitializationListener) this.b).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.c, (String) this.d);
                return;
            case 15:
                ((SessionManager) this.b).lambda$setApplicationContext$0((Context) this.c, (PerfSession) this.d);
                return;
            case 16:
                Sj.a((Vj) this.b, (ImageView) this.c, (kotlin.Pair) this.d);
                return;
            case 17:
                fyj fyjVar = (fyj) this.b;
                qv8 qv8Var = (qv8) this.c;
                of0 of0Var = (of0) this.d;
                lde j = mde.j();
                j.h(qv8Var);
                fyjVar.d(j, of0Var);
                return;
            case 18:
                fyj fyjVar2 = (fyj) this.b;
                fsj fsjVar = (fsj) this.c;
                of0 of0Var2 = (of0) this.d;
                lde j2 = mde.j();
                j2.j(fsjVar);
                fyjVar2.d(j2, of0Var2);
                return;
            case 19:
                fyj fyjVar3 = (fyj) this.b;
                wad wadVar = (wad) this.c;
                of0 of0Var3 = (of0) this.d;
                fyjVar3.getClass();
                lde j3 = mde.j();
                j3.i(wadVar);
                fyjVar3.d(j3, of0Var3);
                return;
            case 20:
                U2.a.a((U2) this.b, (View) this.c, (View) this.d);
                return;
            case 21:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) this.b, (String) this.c, (Throwable) this.d);
                return;
            case 22:
                UnityAds.load$lambda$22$lambda$21$lambda$20((IUnityAdsLoadListener) this.b, (String) this.c, (Throwable) this.d);
                return;
            case 23:
                Va.a((Activity) this.b, (Va) this.c, (String) this.d);
                return;
            case 24:
                Va.a((Sc) this.b, (LevelPlayReward) this.c, (String) this.d);
                return;
            case 25:
                Va.a((Va) this.b, (LevelPlayReward) this.c, (LevelPlayAdInfo) this.d);
                return;
            case 26:
                Va.a((Va) this.b, (LevelPlayAdError) this.c, (LevelPlayAdInfo) this.d);
                return;
            case 27:
                c0l c0lVar = (c0l) this.b;
                cci cciVar = (cci) this.c;
                l2a l2aVar = (l2a) this.d;
                g8f g8fVar2 = (g8f) c0lVar.b;
                g8fVar2.getClass();
                qbl qblVar = cciVar.a;
                String str2 = qblVar.a;
                ArrayList arrayList = new ArrayList();
                lcl lclVar = (lcl) g8fVar2.e.runInTransaction(new hw4(c3 == true ? 1 : 0, g8fVar2, arrayList, str2));
                if (lclVar == null) {
                    rik o = rik.o();
                    qblVar.toString();
                    o.getClass();
                    g8fVar2.e(qblVar);
                    return;
                }
                synchronized (g8fVar2.k) {
                    try {
                        synchronized (g8fVar2.k) {
                            r2 = g8fVar2.c(str2) != null ? 1 : 0;
                        }
                        if (r2 != 0) {
                            Set set = (Set) g8fVar2.h.get(str2);
                            if (((cci) set.iterator().next()).a.b == qblVar.b) {
                                set.add(cciVar);
                                rik o2 = rik.o();
                                qblVar.toString();
                                o2.getClass();
                            } else {
                                g8fVar2.e(qblVar);
                            }
                            return;
                        }
                        if (lclVar.t != qblVar.b) {
                            g8fVar2.e(qblVar);
                            return;
                        }
                        ng2 ng2Var = new ng2(g8fVar2.b, g8fVar2.c, g8fVar2.d, g8fVar2, g8fVar2.e, lclVar, arrayList);
                        if (l2aVar != null) {
                            ng2Var.h = l2aVar;
                        }
                        gdl gdlVar2 = new gdl(ng2Var);
                        xh2 D = x2a.D(gdlVar2.e.b.plus(bea.a()), new ddl(gdlVar2, rq3Var, c2 == true ? 1 : 0));
                        D.b.addListener(new kdc(11, g8fVar2, D, gdlVar2), g8fVar2.d.d);
                        g8fVar2.g.put(str2, gdlVar2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(cciVar);
                        g8fVar2.h.put(str2, hashSet);
                        rik o3 = rik.o();
                        qblVar.toString();
                        o3.getClass();
                        return;
                    } finally {
                    }
                }
            case 28:
                Y2.a((Y2) this.b, (J9) this.c, (C4036d8) this.d);
                return;
            default:
                ((k1l) this.b).loadUrl("javascript:" + ((String) this.c) + '(' + CollectionsKt.f0((ArrayList) this.d, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62) + ')');
                return;
        }
    }

    public /* synthetic */ kdc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ kdc(MintegralMediationAdapter mintegralMediationAdapter, Map map, Context context, InitializationCompleteCallback initializationCompleteCallback) {
        this.a = 2;
        this.b = map;
        this.c = context;
        this.d = initializationCompleteCallback;
    }
}
