package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerDataExtras;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.network.response.StatisticsForPeriod;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gpe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerEventStatisticsModal b;

    public /* synthetic */ gpe(PlayerEventStatisticsModal playerEventStatisticsModal, int i) {
        this.a = i;
        this.b = playerEventStatisticsModal;
    }

    private final Object a(Object obj) {
        fqe.D(this.b.Q(), null, null, (String) obj, null, Boolean.TRUE, 11);
        return Unit.a;
    }

    private final Object b(Object obj) {
        fqe.D(this.b.Q(), null, null, null, (String) obj, Boolean.FALSE, 7);
        return Unit.a;
    }

    private final Object c(Object obj) {
        PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
        joa joaVar = playerEventStatisticsModal.j0;
        g0e g0eVar = (g0e) obj;
        g0eVar.getClass();
        Context requireContext = playerEventStatisticsModal.requireContext();
        requireContext.getClass();
        int selectedPosition = (g0eVar.a * (hkg.c0(requireContext) ? -1 : 1)) + ((zoe) joaVar.getValue()).getSelectedPosition();
        if (selectedPosition >= 0) {
            hzd hzdVar = playerEventStatisticsModal.N;
            if (hzdVar == null) {
                Intrinsics.i("data");
                throw null;
            }
            if (selectedPosition <= b.i(hzdVar.c)) {
                hzd hzdVar2 = playerEventStatisticsModal.N;
                if (hzdVar2 == null) {
                    Intrinsics.i("data");
                    throw null;
                }
                xoe xoeVar = (xoe) CollectionsKt.a0(selectedPosition, hzdVar2.c);
                if (xoeVar != null) {
                    ((zoe) joaVar.getValue()).l(selectedPosition);
                    playerEventStatisticsModal.U(xoeVar, "swipe");
                }
            }
        }
        return Unit.a;
    }

    private final Object d(Object obj) {
        PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
        joa joaVar = playerEventStatisticsModal.F;
        List list = (List) obj;
        ArrayList k = me4.k(list);
        for (Object obj2 : list) {
            if (obj2 instanceof y21) {
                k.add(obj2);
            }
        }
        boolean isEmpty = k.isEmpty();
        rfe rfeVar = playerEventStatisticsModal.D;
        if (isEmpty) {
            if (rfeVar == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            ((GraphicLarge) rfeVar.c).setVisibility(0);
            ((pwe) joaVar.getValue()).s();
        } else {
            if (rfeVar == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            ((GraphicLarge) rfeVar.c).setVisibility(8);
            rfe rfeVar2 = playerEventStatisticsModal.D;
            if (rfeVar2 == null) {
                Intrinsics.i("modalBinding");
                throw null;
            }
            ((RecyclerView) rfeVar2.e).setVisibility(0);
            ((pwe) joaVar.getValue()).F(list);
        }
        return Unit.a;
    }

    private final Object e(Object obj) {
        Object value;
        yzd yzdVar = (yzd) obj;
        yzdVar.getClass();
        PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
        fqe Q = playerEventStatisticsModal.Q();
        fdi fdiVar = Q.q;
        boolean z = yzdVar == yzd.All;
        do {
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, xzd.a((xzd) value, yzdVar, null, null, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
        Q.E(z ? null : (pzd) CollectionsKt.firstOrNull(((xzd) fdiVar.getValue()).f));
        fqe.B = yzdVar;
        playerEventStatisticsModal.R();
        return Unit.a;
    }

    private final Object f(Object obj) {
        Object value;
        xzd xzdVar;
        gv9 W;
        mzd mzdVar = (mzd) obj;
        PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
        fdi fdiVar = playerEventStatisticsModal.Q().q;
        do {
            value = fdiVar.getValue();
            xzdVar = (xzd) value;
            gv9 gv9Var = xzdVar.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : gv9Var) {
                if (((pzd) obj2).b == mzdVar) {
                    arrayList.add(obj2);
                }
            }
            W = l6g.W(arrayList);
        } while (!fdiVar.k(value, xzd.a(xzdVar, null, mzdVar, W, (pzd) CollectionsKt.firstOrNull(W), 23)));
        playerEventStatisticsModal.R();
        playerEventStatisticsModal.T(false);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ff, code lost:
    
        if (r3 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0315, code lost:
    
        if (r3 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034b, code lost:
    
        if (r2 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x065a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0.d, com.sofascore.model.Sports.ICE_HOCKEY) != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0b80, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(kotlin.collections.CollectionsKt.firstOrNull(r3.j), r5) != false) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0bdd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(kotlin.collections.CollectionsKt.j0(r0.l), r2) == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0cbc, code lost:
    
        r10 = (defpackage.xoe) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0cbe, code lost:
    
        if (r10 == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0cc0, code lost:
    
        r11.O().v(1, r10);
        r11.H = false;
        r11.Y(r4);
        r0 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0176, code lost:
    
        if (defpackage.jwe.a.contains(r4) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0daf  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int intValue;
        hzd hzdVar;
        int intValue2;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int intValue3;
        joa joaVar;
        joa joaVar2;
        hzd hzdVar2;
        List<StatisticsForPeriod> periods;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        PlayerHeatmapResponse playerHeatmapResponse;
        String str;
        ppe ppeVar;
        ppe ppeVar2;
        PlayerShotmapResponse playerShotmapResponse;
        wk8 wk8Var;
        List list;
        Object obj3;
        Object obj4;
        PlayerEventStatisticsResponse playerEventStatisticsResponse2;
        PlayerEventStatistics statistics;
        PlayerEventStatisticsResponse playerEventStatisticsResponse3;
        PlayerEventStatistics statistics2;
        FootballPlayerEventStatistics footballPlayerEventStatistics;
        boolean z;
        Integer minutesPlayed;
        BaseballAdditionalPlayerData baseballAllPositions;
        List<BaseballRole> roles;
        int intValue4;
        int i2;
        boolean z2;
        boolean z3;
        PlayerEventStatisticsResponse playerEventStatisticsResponse4;
        Unit unit;
        List<Point2D> list2;
        List<Point2D> list3;
        int intValue5;
        int i3 = this.a;
        int i4 = 10;
        rq3 rq3Var = null;
        PlayerEventStatisticsModal playerEventStatisticsModal = this.b;
        switch (i3) {
            case 0:
                xoe xoeVar = (xoe) obj;
                xoeVar.getClass();
                playerEventStatisticsModal.U(xoeVar, "click");
                return Unit.a;
            case 1:
                Integer num = (Integer) obj;
                int intValue6 = num.intValue();
                hzd hzdVar3 = playerEventStatisticsModal.N;
                if (hzdVar3 == null) {
                    Intrinsics.i("data");
                    throw null;
                }
                Event event = hzdVar3.e(num).b;
                if (event != null) {
                    intValue = event.getId();
                } else {
                    hzd hzdVar4 = playerEventStatisticsModal.N;
                    if (hzdVar4 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    Integer num2 = hzdVar4.a;
                    if (num2 == null) {
                        i = 0;
                        fqe Q = playerEventStatisticsModal.Q();
                        Integer num3 = playerEventStatisticsModal.R;
                        Integer num4 = playerEventStatisticsModal.Q;
                        hzdVar = playerEventStatisticsModal.N;
                        if (hzdVar == null) {
                            Q.y(i, intValue6, null, num3, num4, hzdVar.d, playerEventStatisticsModal.M);
                            return Unit.a;
                        }
                        Intrinsics.i("data");
                        throw null;
                    }
                    intValue = num2.intValue();
                }
                i = intValue;
                fqe Q2 = playerEventStatisticsModal.Q();
                Integer num32 = playerEventStatisticsModal.R;
                Integer num42 = playerEventStatisticsModal.Q;
                hzdVar = playerEventStatisticsModal.N;
                if (hzdVar == null) {
                }
            case 2:
                Integer num5 = (Integer) obj;
                num5.getClass();
                hzd hzdVar5 = playerEventStatisticsModal.N;
                if (hzdVar5 == null) {
                    Intrinsics.i("data");
                    throw null;
                }
                Event event2 = hzdVar5.e(num5).b;
                if (event2 != null) {
                    intValue2 = event2.getId();
                } else {
                    hzd hzdVar6 = playerEventStatisticsModal.N;
                    if (hzdVar6 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    Integer num6 = hzdVar6.a;
                    intValue2 = num6 != null ? num6.intValue() : 0;
                }
                fqe Q3 = playerEventStatisticsModal.Q();
                int i5 = playerEventStatisticsModal.P;
                int i6 = playerEventStatisticsModal.O;
                Integer valueOf = Integer.valueOf(intValue2);
                hzd hzdVar7 = playerEventStatisticsModal.N;
                if (hzdVar7 != null) {
                    Q3.y(i5, i6, null, valueOf, num5, hzdVar7.d, playerEventStatisticsModal.M);
                    return Unit.a;
                }
                Intrinsics.i("data");
                throw null;
            case 3:
                Player player = (Player) obj;
                player.getClass();
                int i7 = PlayerActivity.Z;
                Context requireContext = playerEventStatisticsModal.requireContext();
                requireContext.getClass();
                int id = player.getId();
                hzd hzdVar8 = playerEventStatisticsModal.N;
                if (hzdVar8 != null) {
                    jle.q(requireContext, id, hzdVar8.i, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    return Unit.a;
                }
                Intrinsics.i("data");
                throw null;
            case 4:
                joa joaVar3 = playerEventStatisticsModal.v0;
                joa joaVar4 = playerEventStatisticsModal.l0;
                joa joaVar5 = playerEventStatisticsModal.k0;
                joa joaVar6 = playerEventStatisticsModal.n0;
                joa joaVar7 = playerEventStatisticsModal.t0;
                joa joaVar8 = playerEventStatisticsModal.o0;
                ppe ppeVar3 = (ppe) obj;
                String str2 = null;
                if (playerEventStatisticsModal.H) {
                    playerEventStatisticsModal.S();
                }
                PlayerEventStatisticsResponse playerEventStatisticsResponse5 = ppeVar3.a;
                PlayerHeatmapResponse playerHeatmapResponse2 = ppeVar3.c;
                playerEventStatisticsModal.T = playerEventStatisticsResponse5;
                playerEventStatisticsModal.V = playerHeatmapResponse2;
                rfe rfeVar = playerEventStatisticsModal.D;
                if (rfeVar == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) rfeVar.d;
                String str3 = "data";
                tgj.G(circularProgressIndicator, 75L, 2);
                playerEventStatisticsModal.f0 = ppeVar3;
                PlayerEventStatisticsResponse playerEventStatisticsResponse6 = ppeVar3.a;
                hzd hzdVar9 = playerEventStatisticsModal.N;
                if (playerEventStatisticsResponse6 != null) {
                    if (hzdVar9 == null) {
                        Intrinsics.i(str3);
                        throw null;
                    }
                    xoe e = hzdVar9.e(Integer.valueOf(playerEventStatisticsResponse6.getPlayer().getId()));
                    PlayerDataExtras extra = playerEventStatisticsResponse6.getExtra();
                    if (extra == null || (baseballAllPositions = extra.getBaseballAllPositions()) == null || (roles = baseballAllPositions.getRoles()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList(k13.r(roles, 10));
                        Iterator<T> it = roles.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((BaseballRole) it.next()).getSerialName());
                        }
                        arrayList = arrayList3;
                    }
                    if (e.a.getId() != playerEventStatisticsResponse6.getPlayer().getId()) {
                        hzd hzdVar10 = playerEventStatisticsModal.N;
                        if (hzdVar10 == null) {
                            Intrinsics.i(str3);
                            throw null;
                        }
                        Player player2 = playerEventStatisticsResponse6.getPlayer();
                        Double rating = playerEventStatisticsResponse6.getStatistics().getRating();
                        String position = playerEventStatisticsResponse6.getPosition();
                        player2.getClass();
                        List list4 = hzdVar10.c;
                        if (list4.size() != 1) {
                            list4 = null;
                        }
                        xoe xoeVar2 = list4 != null ? (xoe) CollectionsKt.Y(list4) : null;
                        if (xoeVar2 != null) {
                            xoe xoeVar3 = new xoe(player2, xoeVar2.b, rating, position, xoeVar2.e, xoeVar2.f, arrayList);
                            arrayList2 = arrayList;
                            hzdVar10.c = a.c(xoeVar3);
                        } else {
                            arrayList2 = arrayList;
                        }
                        hzd hzdVar11 = playerEventStatisticsModal.N;
                        if (hzdVar11 == null) {
                            Intrinsics.i(str3);
                            throw null;
                        }
                        e = hzdVar11.e(Integer.valueOf(playerEventStatisticsResponse6.getPlayer().getId()));
                    } else {
                        arrayList2 = arrayList;
                    }
                    Player player3 = e.a;
                    Event event3 = e.b;
                    player3.setTopRated(playerEventStatisticsResponse6.getPlayer().getIsTopRated());
                    boolean z4 = playerEventStatisticsModal.O != playerEventStatisticsResponse6.getPlayer().getId() || playerEventStatisticsModal.I;
                    e.c = playerEventStatisticsResponse6.getStatistics().getRating();
                    e.g = arrayList2;
                    playerEventStatisticsModal.V(ppeVar3);
                    playerEventStatisticsModal.O = playerEventStatisticsResponse6.getPlayer().getId();
                    if (event3 != null) {
                        intValue3 = event3.getId();
                    } else {
                        hzd hzdVar12 = playerEventStatisticsModal.N;
                        if (hzdVar12 == null) {
                            Intrinsics.i(str3);
                            throw null;
                        }
                        Integer num7 = hzdVar12.a;
                        intValue3 = num7 != null ? num7.intValue() : 0;
                    }
                    playerEventStatisticsModal.P = intValue3;
                    playerEventStatisticsModal.Z(playerEventStatisticsModal.O);
                    playerEventStatisticsModal.O().v(1, e);
                    if (playerEventStatisticsModal.H) {
                        View view = new View(playerEventStatisticsModal.requireContext());
                        joaVar = joaVar3;
                        joaVar2 = joaVar4;
                        view.setLayoutParams(new ViewGroup.LayoutParams(0, 1));
                        r0.p(playerEventStatisticsModal.P().g.size(), view);
                        r0.p(playerEventStatisticsModal.P().g.size(), (izd) joaVar5.getValue());
                        hzd hzdVar13 = playerEventStatisticsModal.N;
                        if (hzdVar13 == null) {
                            Intrinsics.i(str3);
                            throw null;
                        }
                        if (Intrinsics.c(hzdVar13.d, Sports.FOOTBALL)) {
                            r0.p(playerEventStatisticsModal.P().g.size(), (c0e) joaVar2.getValue());
                            woe P = playerEventStatisticsModal.P();
                            LinearLayout linearLayout = ((htc) joaVar7.getValue()).a;
                            linearLayout.getClass();
                            P.p(P.g.size(), linearLayout);
                        }
                        r0.p(playerEventStatisticsModal.P().g.size(), playerEventStatisticsModal.M());
                        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) joaVar.getValue();
                        if (segmentedButtonsView != null) {
                            r1.p(playerEventStatisticsModal.P().g.size(), segmentedButtonsView);
                            Unit unit2 = Unit.a;
                        }
                        woe P2 = playerEventStatisticsModal.P();
                        LinearLayout linearLayout2 = playerEventStatisticsModal.H().a;
                        linearLayout2.getClass();
                        P2.p(P2.g.size(), linearLayout2);
                        playerEventStatisticsModal.H().c.setVisibility(8);
                    } else {
                        joaVar = joaVar3;
                        joaVar2 = joaVar4;
                    }
                    PlayerEventStatistics statistics3 = playerEventStatisticsResponse6.getStatistics();
                    if (!(statistics3 instanceof FootballPlayerEventStatistics)) {
                        statistics3 = null;
                    }
                    FootballPlayerEventStatistics footballPlayerEventStatistics2 = (FootballPlayerEventStatistics) statistics3;
                    if (footballPlayerEventStatistics2 != null && (minutesPlayed = footballPlayerEventStatistics2.getMinutesPlayed()) != null) {
                        if (minutesPlayed.intValue() <= 0) {
                            minutesPlayed = null;
                        }
                        if (minutesPlayed != null) {
                            int intValue7 = minutesPlayed.intValue();
                            LinearLayout linearLayout3 = ((htc) joaVar7.getValue()).a;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            ((htc) joaVar7.getValue()).b.setText(intValue7 + "'");
                            Unit unit3 = Unit.a;
                            hzdVar2 = playerEventStatisticsModal.N;
                            if (hzdVar2 != null) {
                                Intrinsics.i(str3);
                                throw null;
                            }
                            if (!Intrinsics.c(hzdVar2.d, Sports.BASKETBALL)) {
                                hzd hzdVar14 = playerEventStatisticsModal.N;
                                if (hzdVar14 == null) {
                                    Intrinsics.i(str3);
                                    throw null;
                                }
                                break;
                            }
                            SegmentedButtonsView segmentedButtonsView2 = (SegmentedButtonsView) joaVar.getValue();
                            if (segmentedButtonsView2 != null && (periods = playerEventStatisticsResponse6.getPeriods()) != null) {
                                List c = a.c("ALL");
                                playerEventStatisticsResponse = playerEventStatisticsResponse6;
                                playerHeatmapResponse = playerHeatmapResponse2;
                                ArrayList arrayList4 = new ArrayList(k13.r(periods, 10));
                                Iterator<T> it2 = periods.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((StatisticsForPeriod) it2.next()).getPeriod());
                                }
                                ArrayList w0 = CollectionsKt.w0(arrayList4, c);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj5 : periods) {
                                    if (((StatisticsForPeriod) obj5).getStatistics() == null) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(((StatisticsForPeriod) it3.next()).getPeriod());
                                }
                                ArrayList arrayList7 = new ArrayList(k13.r(w0, 10));
                                Iterator it4 = w0.iterator();
                                while (it4.hasNext()) {
                                    String str4 = (String) it4.next();
                                    Set set = f5k.a;
                                    Iterator it5 = it4;
                                    Context context = segmentedButtonsView2.getContext();
                                    context.getClass();
                                    arrayList7.add(new s1h(str4, f5k.a(context, str4, str2), !arrayList6.contains(str4)));
                                    it4 = it5;
                                    arrayList6 = arrayList6;
                                    str3 = str3;
                                    str2 = null;
                                }
                                str = str3;
                                segmentedButtonsView2.s(arrayList7, playerEventStatisticsModal.L, true);
                                Unit unit4 = Unit.a;
                                if (event3 != null) {
                                    izd izdVar = (izd) joaVar5.getValue();
                                    izdVar.getClass();
                                    izdVar.setVisibility(0);
                                    izdVar.setOnClickListener(new eyd(1, izdVar, event3));
                                    Team homeTeam$default = Event.getHomeTeam$default(event3, null, 1, null);
                                    Context context2 = izdVar.getContext();
                                    context2.getClass();
                                    String p = tba.p(context2, homeTeam$default);
                                    Team awayTeam$default = Event.getAwayTeam$default(event3, null, 1, null);
                                    Context context3 = izdVar.getContext();
                                    context3.getClass();
                                    String p2 = tba.p(context3, awayTeam$default);
                                    Integer display = Event.getHomeScore$default(event3, null, 1, null).getDisplay();
                                    Integer display2 = Event.getAwayScore$default(event3, null, 1, null).getDisplay();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(p);
                                    sb.append(" ");
                                    sb.append(display);
                                    sb.append(" - ");
                                    sb.append(display2);
                                    String o = mz1.o(sb, " ", p2);
                                    h04 h04Var = izdVar.d;
                                    h04Var.d.setText(o);
                                    TextView textView = h04Var.c;
                                    long startTimestamp = event3.getStartTimestamp();
                                    bi4 bi4Var = bi4.PATTERN_DMM;
                                    ConcurrentHashMap concurrentHashMap = hk4.a;
                                    fn0.u(startTimestamp, hk4.a(bi4Var.d()), textView);
                                }
                                ppeVar = playerEventStatisticsModal.f0;
                                if (ppeVar != null && (playerEventStatisticsResponse3 = ppeVar.a) != null) {
                                    statistics2 = playerEventStatisticsResponse3.getStatistics();
                                    if (!(statistics2 instanceof FootballPlayerEventStatistics)) {
                                        statistics2 = null;
                                    }
                                    footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics2;
                                    if (footballPlayerEventStatistics != null) {
                                        List j = b.j(footballPlayerEventStatistics.getShotValueNormalized(), footballPlayerEventStatistics.getPassValueNormalized(), footballPlayerEventStatistics.getDribbleValueNormalized(), footballPlayerEventStatistics.getDefensiveValueNormalized(), footballPlayerEventStatistics.getGoalkeeperValueNormalized());
                                        if (j == null || !j.isEmpty()) {
                                            Iterator it6 = j.iterator();
                                            while (it6.hasNext()) {
                                                if (((Double) it6.next()) != null) {
                                                    z = true;
                                                    if (yid.k(e.c) > 0.0d || !z) {
                                                        playerEventStatisticsModal.P().C((ComposeView) joaVar6.getValue());
                                                    } else if (!playerEventStatisticsModal.P().g.contains((ComposeView) joaVar6.getValue())) {
                                                        int indexOf = playerEventStatisticsModal.P().g.indexOf((ComposeView) joaVar8.getValue());
                                                        Integer valueOf2 = Integer.valueOf(indexOf);
                                                        if (indexOf == -1) {
                                                            valueOf2 = null;
                                                        }
                                                        playerEventStatisticsModal.P().p(valueOf2 != null ? valueOf2.intValue() - 1 : playerEventStatisticsModal.P().g.size(), (ComposeView) joaVar6.getValue());
                                                    }
                                                    if (!playerEventStatisticsModal.P().g.contains((ComposeView) joaVar8.getValue())) {
                                                        r3.p(playerEventStatisticsModal.P().g.size(), (ComposeView) joaVar8.getValue());
                                                        r3.p(playerEventStatisticsModal.P().g.size(), (ComposeView) playerEventStatisticsModal.r0.getValue());
                                                    }
                                                    ((ComposeView) joaVar8.getValue()).setVisibility(yid.m(footballPlayerEventStatistics.getMinutesPlayed()) <= 0 ? 0 : 8);
                                                    Unit unit5 = Unit.a;
                                                    ppeVar2 = playerEventStatisticsModal.f0;
                                                    if (ppeVar2 != null && (playerEventStatisticsResponse2 = ppeVar2.a) != null) {
                                                        statistics = playerEventStatisticsResponse2.getStatistics();
                                                        if (!(statistics instanceof BaseballPlayerEventStatistics)) {
                                                            statistics = null;
                                                        }
                                                        if (((BaseballPlayerEventStatistics) statistics) != null) {
                                                            ope opeVar = playerEventStatisticsModal.Q().s;
                                                            SegmentedButtonsView G = playerEventStatisticsModal.G();
                                                            gv9<wj1> gv9Var = opeVar.a;
                                                            ArrayList arrayList8 = new ArrayList(k13.r(gv9Var, 10));
                                                            for (wj1 wj1Var : gv9Var) {
                                                                String name = wj1Var.name();
                                                                String string = playerEventStatisticsModal.requireContext().getString(wj1Var.a);
                                                                string.getClass();
                                                                arrayList8.add(new s1h(name, string, true));
                                                            }
                                                            gv9 W = l6g.W(arrayList8);
                                                            wj1 wj1Var2 = opeVar.b;
                                                            SegmentedButtonsView.t(G, W, wj1Var2 != null ? wj1Var2.name() : null, 4);
                                                            if (opeVar.a.isEmpty()) {
                                                                playerEventStatisticsModal.G().setVisibility(8);
                                                            } else {
                                                                if (!playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.G())) {
                                                                    r0.p(playerEventStatisticsModal.P().g.size(), playerEventStatisticsModal.G());
                                                                    ComposeView composeView = (ComposeView) playerEventStatisticsModal.q0.getValue();
                                                                    if (composeView != null) {
                                                                        r3.p(playerEventStatisticsModal.P().g.size(), composeView);
                                                                        Unit unit6 = Unit.a;
                                                                    }
                                                                }
                                                                playerEventStatisticsModal.G().setVisibility(0);
                                                            }
                                                            Unit unit7 = Unit.a;
                                                            if (playerHeatmapResponse != null) {
                                                                if (z4 || playerEventStatisticsModal.Y != playerHeatmapResponse.getHeatmap().size()) {
                                                                    if (!playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.M())) {
                                                                        r0.p(playerEventStatisticsModal.P().g.size(), playerEventStatisticsModal.M());
                                                                    }
                                                                    boolean z5 = e.f == 1;
                                                                    Context requireContext2 = playerEventStatisticsModal.requireContext();
                                                                    requireContext2.getClass();
                                                                    boolean c0 = z5 ^ hkg.c0(requireContext2);
                                                                    int i8 = c0 ? 1 : 2;
                                                                    i99 i99Var = (i99) playerEventStatisticsModal.z0.getValue();
                                                                    Context requireContext3 = playerEventStatisticsModal.requireContext();
                                                                    requireContext3.getClass();
                                                                    Bitmap a = i99Var.a(requireContext3, playerHeatmapResponse.getHeatmap(), 1, false, i8);
                                                                    sj8 M = playerEventStatisticsModal.M();
                                                                    M.getClass();
                                                                    f99 f99Var = M.j;
                                                                    f99Var.d.setRotation(c0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 180.0f);
                                                                    ImageView imageView = f99Var.c;
                                                                    apf a2 = ajh.a(imageView.getContext());
                                                                    ht9 ht9Var = new ht9(imageView.getContext());
                                                                    ht9Var.c = a;
                                                                    fc6.w(ht9Var, imageView, a2);
                                                                }
                                                                playerEventStatisticsModal.Y = playerHeatmapResponse.getHeatmap().size();
                                                                playerEventStatisticsModal.M().setVisibility(0);
                                                            } else {
                                                                playerEventStatisticsModal.M().setVisibility(8);
                                                            }
                                                            playerShotmapResponse = ppeVar3.e;
                                                            if (playerShotmapResponse != null) {
                                                                List<ShotMapPoint> shotmap = playerShotmapResponse.getShotmap();
                                                                ArrayList arrayList9 = new ArrayList();
                                                                for (Object obj6 : shotmap) {
                                                                    if (Intrinsics.c(((ShotMapPoint) obj6).getPeriod(), playerEventStatisticsModal.L) || Intrinsics.c(playerEventStatisticsModal.L, "ALL")) {
                                                                        arrayList9.add(obj6);
                                                                    }
                                                                }
                                                                if (z4 || playerEventStatisticsModal.b0 != arrayList9.size() || (playerEventStatisticsModal.c0 != null && !Intrinsics.c(CollectionsKt.j0(arrayList9), playerEventStatisticsModal.c0))) {
                                                                    if (playerEventStatisticsModal.H || playerEventStatisticsModal.H().c.getVisibility() == 0) {
                                                                        playerEventStatisticsModal.H().c.setVisibility(0);
                                                                    } else {
                                                                        tgj.o(playerEventStatisticsModal.H().c, 400L, new AccelerateInterpolator());
                                                                    }
                                                                    playerEventStatisticsModal.H().b.setShotmap(arrayList9);
                                                                }
                                                                playerEventStatisticsModal.b0 = arrayList9.size();
                                                                playerEventStatisticsModal.c0 = (ShotMapPoint) CollectionsKt.j0(arrayList9);
                                                                Unit unit8 = Unit.a;
                                                            } else {
                                                                playerEventStatisticsModal.H().c.setVisibility(8);
                                                            }
                                                            c0e c0eVar = (c0e) joaVar2.getValue();
                                                            Incident.SubstitutionIncident substitutionIncident = ppeVar3.i;
                                                            Incident.SubstitutionIncident substitutionIncident2 = ppeVar3.j;
                                                            c0eVar.m(substitutionIncident, substitutionIncident2, (Function1) playerEventStatisticsModal.m0.getValue());
                                                            playerEventStatisticsModal.O().setInjured(Intrinsics.c(substitutionIncident2 != null ? Boolean.valueOf(substitutionIncident2.getInjury()) : null, Boolean.TRUE));
                                                            boolean z6 = playerEventStatisticsModal.H;
                                                            wk8Var = (wk8) playerEventStatisticsModal.s0.getValue();
                                                            if (wk8Var != null) {
                                                                if (z6) {
                                                                    r0.p(playerEventStatisticsModal.P().g.size(), wk8Var);
                                                                }
                                                                hzd hzdVar15 = playerEventStatisticsModal.N;
                                                                if (hzdVar15 == null) {
                                                                    Intrinsics.i(str);
                                                                    throw null;
                                                                }
                                                                Iterator it7 = hzdVar15.c.iterator();
                                                                while (true) {
                                                                    if (it7.hasNext()) {
                                                                        obj4 = it7.next();
                                                                        xoe xoeVar4 = (xoe) obj4;
                                                                        Player player4 = playerEventStatisticsResponse.getPlayer();
                                                                        if (player4 == null || xoeVar4.a.getId() != player4.getId()) {
                                                                        }
                                                                    } else {
                                                                        obj4 = null;
                                                                    }
                                                                }
                                                                xoe xoeVar5 = (xoe) obj4;
                                                                wk8Var.setTeamSide((xoeVar5 != null ? xoeVar5.f : 1) == 1 ? vk8.a : vk8.b);
                                                                if (!z4) {
                                                                    int i9 = playerEventStatisticsModal.Z;
                                                                    FootballShotmapItem footballShotmapItem = playerEventStatisticsModal.a0;
                                                                    if (wk8Var.j.size() == i9) {
                                                                        break;
                                                                    }
                                                                }
                                                                playerEventStatisticsModal.T(z4);
                                                                playerEventStatisticsModal.R();
                                                            }
                                                            list = ppeVar3.h;
                                                            if (list != null) {
                                                                ArrayList arrayList10 = new ArrayList();
                                                                for (Object obj7 : list) {
                                                                    if (Intrinsics.c(((HockeyShotmapItem) obj7).getPeriod(), playerEventStatisticsModal.L) || Intrinsics.c(playerEventStatisticsModal.L, "ALL")) {
                                                                        arrayList10.add(obj7);
                                                                    }
                                                                }
                                                                if (!z4) {
                                                                    fe9 N = playerEventStatisticsModal.N();
                                                                    int i10 = playerEventStatisticsModal.d0;
                                                                    HockeyShotmapItem hockeyShotmapItem = playerEventStatisticsModal.e0;
                                                                    if (N.l.size() != i10) {
                                                                        break;
                                                                    }
                                                                    playerEventStatisticsModal.d0 = arrayList10.size();
                                                                    playerEventStatisticsModal.e0 = (HockeyShotmapItem) CollectionsKt.j0(arrayList10);
                                                                }
                                                                hzd hzdVar16 = playerEventStatisticsModal.N;
                                                                if (hzdVar16 == null) {
                                                                    Intrinsics.i(str);
                                                                    throw null;
                                                                }
                                                                Iterator it8 = hzdVar16.c.iterator();
                                                                while (true) {
                                                                    if (it8.hasNext()) {
                                                                        Object next = it8.next();
                                                                        xoe xoeVar6 = (xoe) next;
                                                                        Player player5 = playerEventStatisticsResponse.getPlayer();
                                                                        if (player5 != null && xoeVar6.a.getId() == player5.getId()) {
                                                                            obj3 = next;
                                                                        }
                                                                    } else {
                                                                        obj3 = null;
                                                                    }
                                                                }
                                                                xoe xoeVar7 = (xoe) obj3;
                                                                TeamSelection teamSelection = (xoeVar7 != null ? xoeVar7.f : 1) == 1 ? TeamSelection.First : TeamSelection.Second;
                                                                if (!playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.N())) {
                                                                    r1.p(playerEventStatisticsModal.P().g.size(), playerEventStatisticsModal.N());
                                                                }
                                                                playerEventStatisticsModal.N().n(arrayList10, teamSelection);
                                                                playerEventStatisticsModal.d0 = arrayList10.size();
                                                                playerEventStatisticsModal.e0 = (HockeyShotmapItem) CollectionsKt.j0(arrayList10);
                                                            } else if (playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.N())) {
                                                                playerEventStatisticsModal.P().C(playerEventStatisticsModal.N());
                                                            }
                                                            playerEventStatisticsModal.H = false;
                                                            playerEventStatisticsModal.I = false;
                                                            playerEventStatisticsModal.Y(ppeVar3);
                                                            Unit unit9 = Unit.a;
                                                        }
                                                    }
                                                    if (playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.G())) {
                                                        playerEventStatisticsModal.P().C(playerEventStatisticsModal.G());
                                                    }
                                                    if (playerHeatmapResponse != null) {
                                                    }
                                                    playerShotmapResponse = ppeVar3.e;
                                                    if (playerShotmapResponse != null) {
                                                    }
                                                    c0e c0eVar2 = (c0e) joaVar2.getValue();
                                                    Incident.SubstitutionIncident substitutionIncident3 = ppeVar3.i;
                                                    Incident.SubstitutionIncident substitutionIncident22 = ppeVar3.j;
                                                    c0eVar2.m(substitutionIncident3, substitutionIncident22, (Function1) playerEventStatisticsModal.m0.getValue());
                                                    playerEventStatisticsModal.O().setInjured(Intrinsics.c(substitutionIncident22 != null ? Boolean.valueOf(substitutionIncident22.getInjury()) : null, Boolean.TRUE));
                                                    boolean z62 = playerEventStatisticsModal.H;
                                                    wk8Var = (wk8) playerEventStatisticsModal.s0.getValue();
                                                    if (wk8Var != null) {
                                                    }
                                                    list = ppeVar3.h;
                                                    if (list != null) {
                                                    }
                                                    playerEventStatisticsModal.H = false;
                                                    playerEventStatisticsModal.I = false;
                                                    playerEventStatisticsModal.Y(ppeVar3);
                                                    Unit unit92 = Unit.a;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (yid.k(e.c) > 0.0d) {
                                        }
                                        playerEventStatisticsModal.P().C((ComposeView) joaVar6.getValue());
                                        if (!playerEventStatisticsModal.P().g.contains((ComposeView) joaVar8.getValue())) {
                                        }
                                        ((ComposeView) joaVar8.getValue()).setVisibility(yid.m(footballPlayerEventStatistics.getMinutesPlayed()) <= 0 ? 0 : 8);
                                        Unit unit52 = Unit.a;
                                        ppeVar2 = playerEventStatisticsModal.f0;
                                        if (ppeVar2 != null) {
                                            statistics = playerEventStatisticsResponse2.getStatistics();
                                            if (!(statistics instanceof BaseballPlayerEventStatistics)) {
                                            }
                                            if (((BaseballPlayerEventStatistics) statistics) != null) {
                                            }
                                        }
                                        if (playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.G())) {
                                        }
                                        if (playerHeatmapResponse != null) {
                                        }
                                        playerShotmapResponse = ppeVar3.e;
                                        if (playerShotmapResponse != null) {
                                        }
                                        c0e c0eVar22 = (c0e) joaVar2.getValue();
                                        Incident.SubstitutionIncident substitutionIncident32 = ppeVar3.i;
                                        Incident.SubstitutionIncident substitutionIncident222 = ppeVar3.j;
                                        c0eVar22.m(substitutionIncident32, substitutionIncident222, (Function1) playerEventStatisticsModal.m0.getValue());
                                        playerEventStatisticsModal.O().setInjured(Intrinsics.c(substitutionIncident222 != null ? Boolean.valueOf(substitutionIncident222.getInjury()) : null, Boolean.TRUE));
                                        boolean z622 = playerEventStatisticsModal.H;
                                        wk8Var = (wk8) playerEventStatisticsModal.s0.getValue();
                                        if (wk8Var != null) {
                                        }
                                        list = ppeVar3.h;
                                        if (list != null) {
                                        }
                                        playerEventStatisticsModal.H = false;
                                        playerEventStatisticsModal.I = false;
                                        playerEventStatisticsModal.Y(ppeVar3);
                                        Unit unit922 = Unit.a;
                                    }
                                }
                                playerEventStatisticsModal.P().C((ComposeView) joaVar6.getValue());
                                ((ComposeView) joaVar8.getValue()).setVisibility(8);
                                ppeVar2 = playerEventStatisticsModal.f0;
                                if (ppeVar2 != null) {
                                }
                                if (playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.G())) {
                                }
                                if (playerHeatmapResponse != null) {
                                }
                                playerShotmapResponse = ppeVar3.e;
                                if (playerShotmapResponse != null) {
                                }
                                c0e c0eVar222 = (c0e) joaVar2.getValue();
                                Incident.SubstitutionIncident substitutionIncident322 = ppeVar3.i;
                                Incident.SubstitutionIncident substitutionIncident2222 = ppeVar3.j;
                                c0eVar222.m(substitutionIncident322, substitutionIncident2222, (Function1) playerEventStatisticsModal.m0.getValue());
                                playerEventStatisticsModal.O().setInjured(Intrinsics.c(substitutionIncident2222 != null ? Boolean.valueOf(substitutionIncident2222.getInjury()) : null, Boolean.TRUE));
                                boolean z6222 = playerEventStatisticsModal.H;
                                wk8Var = (wk8) playerEventStatisticsModal.s0.getValue();
                                if (wk8Var != null) {
                                }
                                list = ppeVar3.h;
                                if (list != null) {
                                }
                                playerEventStatisticsModal.H = false;
                                playerEventStatisticsModal.I = false;
                                playerEventStatisticsModal.Y(ppeVar3);
                                Unit unit9222 = Unit.a;
                            }
                            playerEventStatisticsResponse = playerEventStatisticsResponse6;
                            playerHeatmapResponse = playerHeatmapResponse2;
                            str = str3;
                            if (event3 != null) {
                            }
                            ppeVar = playerEventStatisticsModal.f0;
                            if (ppeVar != null) {
                                statistics2 = playerEventStatisticsResponse3.getStatistics();
                                if (!(statistics2 instanceof FootballPlayerEventStatistics)) {
                                }
                                footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics2;
                                if (footballPlayerEventStatistics != null) {
                                }
                            }
                            playerEventStatisticsModal.P().C((ComposeView) joaVar6.getValue());
                            ((ComposeView) joaVar8.getValue()).setVisibility(8);
                            ppeVar2 = playerEventStatisticsModal.f0;
                            if (ppeVar2 != null) {
                            }
                            if (playerEventStatisticsModal.P().g.contains(playerEventStatisticsModal.G())) {
                            }
                            if (playerHeatmapResponse != null) {
                            }
                            playerShotmapResponse = ppeVar3.e;
                            if (playerShotmapResponse != null) {
                            }
                            c0e c0eVar2222 = (c0e) joaVar2.getValue();
                            Incident.SubstitutionIncident substitutionIncident3222 = ppeVar3.i;
                            Incident.SubstitutionIncident substitutionIncident22222 = ppeVar3.j;
                            c0eVar2222.m(substitutionIncident3222, substitutionIncident22222, (Function1) playerEventStatisticsModal.m0.getValue());
                            playerEventStatisticsModal.O().setInjured(Intrinsics.c(substitutionIncident22222 != null ? Boolean.valueOf(substitutionIncident22222.getInjury()) : null, Boolean.TRUE));
                            boolean z62222 = playerEventStatisticsModal.H;
                            wk8Var = (wk8) playerEventStatisticsModal.s0.getValue();
                            if (wk8Var != null) {
                            }
                            list = ppeVar3.h;
                            if (list != null) {
                            }
                            playerEventStatisticsModal.H = false;
                            playerEventStatisticsModal.I = false;
                            playerEventStatisticsModal.Y(ppeVar3);
                            Unit unit92222 = Unit.a;
                        }
                    }
                    LinearLayout linearLayout4 = ((htc) joaVar7.getValue()).a;
                    linearLayout4.getClass();
                    linearLayout4.setVisibility(8);
                    Unit unit10 = Unit.a;
                    hzdVar2 = playerEventStatisticsModal.N;
                    if (hzdVar2 != null) {
                    }
                } else {
                    if (hzdVar9 == null) {
                        Intrinsics.i(str3);
                        throw null;
                    }
                    Iterator it9 = hzdVar9.c.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            Object next2 = it9.next();
                            int id2 = ((xoe) next2).a.getId();
                            hzd hzdVar17 = playerEventStatisticsModal.N;
                            if (hzdVar17 == null) {
                                Intrinsics.i(str3);
                                throw null;
                            }
                            if (id2 == hzdVar17.g) {
                                obj2 = next2;
                                break;
                            }
                        }
                    }
                }
                return Unit.a;
            case 5:
                ppe ppeVar4 = (ppe) obj;
                ppeVar4.getClass();
                PlayerEventStatisticsModal playerEventStatisticsModal2 = this.b;
                rfe rfeVar2 = playerEventStatisticsModal2.D;
                if (rfeVar2 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((CircularProgressIndicator) rfeVar2.d).setVisibility(8);
                PlayerEventStatisticsResponse playerEventStatisticsResponse7 = ppeVar4.a;
                PlayerHeatmapResponse playerHeatmapResponse3 = ppeVar4.d;
                PlayerHeatmapResponse playerHeatmapResponse4 = ppeVar4.c;
                PlayerEventStatisticsResponse playerEventStatisticsResponse8 = ppeVar4.b;
                if (playerEventStatisticsResponse7 != null) {
                    if (playerEventStatisticsResponse8 != null) {
                        hzd hzdVar18 = playerEventStatisticsModal2.N;
                        if (hzdVar18 == null) {
                            Intrinsics.i("data");
                            throw null;
                        }
                        xoe e2 = hzdVar18.e(Integer.valueOf(playerEventStatisticsResponse7.getPlayer().getId()));
                        hzd hzdVar19 = playerEventStatisticsModal2.N;
                        if (hzdVar19 == null) {
                            Intrinsics.i("data");
                            throw null;
                        }
                        xoe e3 = hzdVar19.e(Integer.valueOf(playerEventStatisticsResponse8.getPlayer().getId()));
                        e2.c = playerEventStatisticsResponse7.getStatistics().getRating();
                        e2.a.setTopRated(playerEventStatisticsResponse7.getPlayer().getIsTopRated());
                        e3.a.setTopRated(playerEventStatisticsResponse8.getPlayer().getIsTopRated());
                        boolean z7 = playerEventStatisticsModal2.O != playerEventStatisticsResponse7.getPlayer().getId();
                        playerEventStatisticsModal2.O = playerEventStatisticsResponse7.getPlayer().getId();
                        playerEventStatisticsModal2.S = playerEventStatisticsResponse7;
                        Event event4 = e2.b;
                        if (event4 != null) {
                            intValue4 = event4.getId();
                        } else {
                            hzd hzdVar20 = playerEventStatisticsModal2.N;
                            if (hzdVar20 == null) {
                                Intrinsics.i("data");
                                throw null;
                            }
                            Integer num8 = hzdVar20.a;
                            intValue4 = num8 != null ? num8.intValue() : 0;
                        }
                        playerEventStatisticsModal2.P = intValue4;
                        List<Point2D> heatmap = playerHeatmapResponse4 != null ? playerHeatmapResponse4.getHeatmap() : null;
                        PlayerHeatmapResponse playerHeatmapResponse5 = playerEventStatisticsModal2.W;
                        boolean c2 = Intrinsics.c(heatmap, playerHeatmapResponse5 != null ? playerHeatmapResponse5.getHeatmap() : null);
                        playerEventStatisticsModal2.W = playerHeatmapResponse4;
                        playerEventStatisticsModal2.Q = Integer.valueOf(playerEventStatisticsResponse8.getPlayer().getId());
                        playerEventStatisticsModal2.U = playerEventStatisticsResponse8;
                        Event event5 = e3.b;
                        if (event5 != null) {
                            i2 = Integer.valueOf(event5.getId());
                        } else {
                            hzd hzdVar21 = playerEventStatisticsModal2.N;
                            if (hzdVar21 == null) {
                                Intrinsics.i("data");
                                throw null;
                            }
                            i2 = hzdVar21.a;
                            if (i2 == null) {
                                i2 = 0;
                            }
                        }
                        playerEventStatisticsModal2.R = i2;
                        List<Point2D> heatmap2 = playerHeatmapResponse3 != null ? playerHeatmapResponse3.getHeatmap() : null;
                        PlayerHeatmapResponse playerHeatmapResponse6 = playerEventStatisticsModal2.X;
                        boolean c3 = Intrinsics.c(heatmap2, playerHeatmapResponse6 != null ? playerHeatmapResponse6.getHeatmap() : null);
                        playerEventStatisticsModal2.X = playerHeatmapResponse3;
                        if (c2) {
                            if (!c3) {
                                PlayerHeatmapResponse playerHeatmapResponse7 = playerEventStatisticsModal2.W;
                                if (playerHeatmapResponse7 != null) {
                                    list3 = playerHeatmapResponse7.getHeatmap();
                                    break;
                                } else {
                                    list3 = null;
                                    break;
                                }
                            }
                            z2 = false;
                            if (c3) {
                                if (!c2) {
                                    PlayerHeatmapResponse playerHeatmapResponse8 = playerEventStatisticsModal2.X;
                                    if (playerHeatmapResponse8 != null) {
                                        list2 = playerHeatmapResponse8.getHeatmap();
                                        break;
                                    } else {
                                        list2 = null;
                                        break;
                                    }
                                }
                                z3 = false;
                                playerEventStatisticsModal2.a0(e2, e3, ppeVar4.c, ppeVar4.d, z2, z3);
                                cpe O = playerEventStatisticsModal2.O();
                                int i11 = z7 ? 1 : 2;
                                if (!z7) {
                                    e2 = e3;
                                }
                                O.v(i11, e2);
                                playerEventStatisticsResponse4 = playerEventStatisticsModal2.S;
                                if (playerEventStatisticsResponse4 != null) {
                                    playerEventStatisticsModal2.P().G(playerEventStatisticsResponse4, playerEventStatisticsModal2.U, playerEventStatisticsModal2.M, null, null);
                                    unit = Unit.a;
                                    break;
                                } else {
                                    unit = null;
                                    break;
                                }
                            }
                            z3 = true;
                            playerEventStatisticsModal2.a0(e2, e3, ppeVar4.c, ppeVar4.d, z2, z3);
                            cpe O2 = playerEventStatisticsModal2.O();
                            if (z7) {
                            }
                            if (!z7) {
                            }
                            O2.v(i11, e2);
                            playerEventStatisticsResponse4 = playerEventStatisticsModal2.S;
                            if (playerEventStatisticsResponse4 != null) {
                            }
                        }
                        z2 = true;
                        if (c3) {
                        }
                        z3 = true;
                        playerEventStatisticsModal2.a0(e2, e3, ppeVar4.c, ppeVar4.d, z2, z3);
                        cpe O22 = playerEventStatisticsModal2.O();
                        if (z7) {
                        }
                        if (!z7) {
                        }
                        O22.v(i11, e2);
                        playerEventStatisticsResponse4 = playerEventStatisticsModal2.S;
                        if (playerEventStatisticsResponse4 != null) {
                        }
                    }
                    hzd hzdVar22 = playerEventStatisticsModal2.N;
                    if (hzdVar22 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    xoe e4 = hzdVar22.e(Integer.valueOf(playerEventStatisticsResponse7.getPlayer().getId()));
                    e4.c = playerEventStatisticsResponse7.getStatistics().getRating();
                    e4.a.setTopRated(playerEventStatisticsResponse7.getPlayer().getIsTopRated());
                    playerEventStatisticsModal2.O = playerEventStatisticsResponse7.getPlayer().getId();
                    playerEventStatisticsModal2.S = playerEventStatisticsResponse7;
                    Event event6 = e4.b;
                    if (event6 != null) {
                        r8 = event6.getId();
                    } else {
                        hzd hzdVar23 = playerEventStatisticsModal2.N;
                        if (hzdVar23 == null) {
                            Intrinsics.i("data");
                            throw null;
                        }
                        Integer num9 = hzdVar23.a;
                        if (num9 != null) {
                            r8 = num9.intValue();
                        }
                    }
                    playerEventStatisticsModal2.P = r8;
                    PlayerHeatmapResponse playerHeatmapResponse9 = ppeVar4.c;
                    playerEventStatisticsModal2.W = playerHeatmapResponse9;
                    playerEventStatisticsModal2.a0(e4, null, playerHeatmapResponse9, null, true, true);
                    playerEventStatisticsModal2.O().v(1, e4);
                    PlayerEventStatisticsResponse playerEventStatisticsResponse9 = playerEventStatisticsModal2.S;
                    if (playerEventStatisticsResponse9 != null) {
                        playerEventStatisticsModal2.P().G(playerEventStatisticsResponse9, playerEventStatisticsModal2.U, playerEventStatisticsModal2.M, null, null);
                        Unit unit11 = Unit.a;
                    }
                }
                return Unit.a;
            case 6:
                qpe qpeVar = (qpe) obj;
                if (playerEventStatisticsModal.H) {
                    playerEventStatisticsModal.S();
                }
                qpeVar.getClass();
                rfe rfeVar3 = playerEventStatisticsModal.D;
                if (rfeVar3 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((CircularProgressIndicator) rfeVar3.d).setVisibility(8);
                int i12 = qpeVar.a;
                PlayerEventsListResponse playerEventsListResponse = qpeVar.b;
                AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = qpeVar.c;
                if (abstractPlayerSeasonStatistics != null) {
                    Set set2 = jwe.a;
                    hzd hzdVar24 = playerEventStatisticsModal.N;
                    if (hzdVar24 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    String str5 = hzdVar24.d;
                    str5.getClass();
                    break;
                }
                abstractPlayerSeasonStatistics = null;
                hzd hzdVar25 = playerEventStatisticsModal.N;
                if (hzdVar25 == null) {
                    Intrinsics.i("data");
                    throw null;
                }
                xoe e5 = hzdVar25.e(Integer.valueOf(i12));
                if (abstractPlayerSeasonStatistics != null) {
                    e5.c = abstractPlayerSeasonStatistics.getRating();
                }
                playerEventStatisticsModal.O = i12;
                Event event7 = e5.b;
                if (event7 != null) {
                    intValue5 = event7.getId();
                } else {
                    hzd hzdVar26 = playerEventStatisticsModal.N;
                    if (hzdVar26 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    Integer num10 = hzdVar26.a;
                    intValue5 = num10 != null ? num10.intValue() : 0;
                }
                playerEventStatisticsModal.P = intValue5;
                playerEventStatisticsModal.Z(playerEventStatisticsModal.O);
                if (playerEventStatisticsModal.H) {
                    playerEventStatisticsModal.H = false;
                }
                pwe pweVar = (pwe) playerEventStatisticsModal.F.getValue();
                Player player6 = e5.a;
                pweVar.getClass();
                player6.getClass();
                playerEventStatisticsModal.O().v(1, e5);
                kda.p(wca.x(playerEventStatisticsModal.getLifecycle()), new n50(playerEventStatisticsModal, playerEventsListResponse, rq3Var, i4), new gpe(playerEventStatisticsModal, 13));
                return Unit.a;
            case 7:
                Player player7 = (Player) obj;
                player7.getClass();
                hzd hzdVar27 = playerEventStatisticsModal.N;
                if (hzdVar27 == null) {
                    Intrinsics.i("data");
                    throw null;
                }
                if (hzdVar27.c.size() > 1) {
                    hzd hzdVar28 = playerEventStatisticsModal.N;
                    if (hzdVar28 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    List list5 = hzdVar28.c;
                    list5.getClass();
                    Iterator it10 = list5.iterator();
                    int i13 = 0;
                    while (true) {
                        if (it10.hasNext()) {
                            xoe xoeVar8 = (xoe) it10.next();
                            xoeVar8.getClass();
                            if (!(xoeVar8.a.getId() == player7.getId())) {
                                i13++;
                            }
                        } else {
                            i13 = -1;
                        }
                    }
                    Integer valueOf3 = i13 == -1 ? null : Integer.valueOf(i13);
                    if (valueOf3 != null) {
                        int intValue8 = valueOf3.intValue();
                        hzd hzdVar29 = playerEventStatisticsModal.N;
                        if (hzdVar29 == null) {
                            Intrinsics.i("data");
                            throw null;
                        }
                        playerEventStatisticsModal.U((xoe) hzdVar29.c.get(intValue8), "substitution_select");
                        ((zoe) playerEventStatisticsModal.j0.getValue()).l(intValue8);
                    } else {
                        int i14 = PlayerActivity.Z;
                        Context requireContext4 = playerEventStatisticsModal.requireContext();
                        requireContext4.getClass();
                        int id3 = player7.getId();
                        hzd hzdVar30 = playerEventStatisticsModal.N;
                        if (hzdVar30 == null) {
                            Intrinsics.i("data");
                            throw null;
                        }
                        jle.q(requireContext4, id3, hzdVar30.i, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    }
                } else {
                    fqe Q4 = playerEventStatisticsModal.Q();
                    hzd hzdVar31 = playerEventStatisticsModal.N;
                    if (hzdVar31 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    Integer num11 = hzdVar31.a;
                    r8 = num11 != null ? num11.intValue() : 0;
                    int id4 = player7.getId();
                    String position2 = player7.getPosition();
                    hzd hzdVar32 = playerEventStatisticsModal.N;
                    if (hzdVar32 == null) {
                        Intrinsics.i("data");
                        throw null;
                    }
                    Q4.y(r8, id4, position2, null, null, hzdVar32.d, false);
                }
                return Unit.a;
            case 8:
                ll1 ll1Var = (ll1) obj;
                ll1Var.getClass();
                fqe.D(playerEventStatisticsModal.Q(), ll1Var, null, null, null, null, 30);
                return Unit.a;
            case 9:
                kl1 kl1Var = (kl1) obj;
                kl1Var.getClass();
                fqe.D(playerEventStatisticsModal.Q(), null, kl1Var, null, null, null, 29);
                return Unit.a;
            case 10:
                return a(obj);
            case 11:
                return b(obj);
            case 12:
                return c(obj);
            case 13:
                return d(obj);
            case 14:
                return e(obj);
            case 15:
                return f(obj);
            default:
                playerEventStatisticsModal.Q().E((pzd) obj);
                return Unit.a;
        }
    }
}
