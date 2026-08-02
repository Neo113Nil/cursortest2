package defpackage;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopStatsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qaj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qaj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        iej a;
        pwh pwhVar;
        switch (this.a) {
            case 0:
                hbj hbjVar = (hbj) obj;
                Integer b = hbjVar.b();
                if (b == null) {
                    return null;
                }
                int intValue = b.intValue();
                long j = hbjVar.f;
                int i = pej.c;
                return new zw4(0, intValue - ((int) (j & 4294967295L)));
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ewd ewdVar = ((Boolean) obj2).booleanValue() ? ewd.a : ewd.b;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new mbj(ewdVar, ((Float) obj3).floatValue());
            case 2:
                return Unit.a;
            case 3:
                return Boolean.valueOf(((oqf) obj) == null);
            case 4:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                y3g y3gVar = yqg.a;
                Boolean bool = Boolean.FALSE;
                q80 q80Var = (Intrinsics.c(obj4, bool) || obj4 == null) ? null : (q80) ((Function1) y3gVar.c).invoke(obj4);
                q80Var.getClass();
                Object obj5 = list2.get(1);
                int i2 = pej.c;
                pej pejVar = (Intrinsics.c(obj5, bool) || obj5 == null) ? null : (pej) ((Function1) yqg.p.c).invoke(obj5);
                pejVar.getClass();
                return new wcj(q80Var, pejVar.a, (pej) null);
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                p80 p80Var = (p80) obj;
                Object obj6 = p80Var.a;
                if (!(obj6 instanceof gbb) || (a = ((gbb) obj6).a()) == null || (a.a == null && a.b == null && a.c == null && a.d == null)) {
                    return b.e(p80Var);
                }
                Object obj7 = p80Var.a;
                obj7.getClass();
                iej a2 = ((gbb) obj7).a();
                if (a2 == null || (pwhVar = a2.a) == null) {
                    pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65535);
                }
                return b.e(p80Var, new p80(pwhVar, p80Var.b, p80Var.c));
            case 8:
                a4h a4hVar = w3h.B;
                Unit unit = Unit.a;
                ((b4h) obj).a(a4hVar, unit);
                return unit;
            case 9:
                ((aej) obj).getClass();
                return Unit.a;
            case 10:
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj));
            case 11:
                return Unit.a;
            case 12:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                ha5.g0(ymaVar, wxf.D(new Pair[]{new Pair(Float.valueOf(0.75f), new r13(r13.h)), new Pair(Float.valueOf(1.0f), new r13(r13.b))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), 0L, ymaVar.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 13:
                List<TopStatsItem> list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                for (TopStatsItem topStatsItem : list3) {
                    arrayList.add(new TopStatsItem(rei.c(Double.valueOf(Double.parseDouble(topStatsItem.getStatistic()) * 100.0d), 2, true), topStatsItem.getPlayer(), topStatsItem.getEvent()));
                }
                return arrayList;
            case 14:
                List<TopStatsItem> list4 = (List) obj;
                list4.getClass();
                ArrayList arrayList2 = new ArrayList(k13.r(list4, 10));
                for (TopStatsItem topStatsItem2 : list4) {
                    arrayList2.add(new TopStatsItem(rei.j(Integer.valueOf(Integer.parseInt(topStatsItem2.getStatistic())), 1), topStatsItem2.getPlayer(), topStatsItem2.getEvent()));
                }
                return arrayList2;
            case 15:
                ((Integer) obj).getClass();
                return Unit.a;
            case 16:
                ((Integer) obj).getClass();
                return Unit.a;
            case 17:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics.getClass();
                return basketballTopTeamsStatistics.getAssists();
            case 18:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem, basketballTopTeamsStatisticsItem.getAssists());
            case 19:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem2 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem2.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem2, basketballTopTeamsStatisticsItem2.getPoints());
            case 20:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics2 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics2.getClass();
                return basketballTopTeamsStatistics2.getRebounds();
            case 21:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem3 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem3.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem3, basketballTopTeamsStatisticsItem3.getRebounds());
            case 22:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics3 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics3.getClass();
                return basketballTopTeamsStatistics3.getDefensiveRebounds();
            case 23:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem4 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem4.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem4, basketballTopTeamsStatisticsItem4.getDefensiveRebounds());
            case 24:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics4 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics4.getClass();
                return basketballTopTeamsStatistics4.getOffensiveRebounds();
            case 25:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem5 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem5.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem5, basketballTopTeamsStatisticsItem5.getOffensiveRebounds());
            case 26:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics5 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics5.getClass();
                return basketballTopTeamsStatistics5.getSteals();
            case 27:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics6 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics6.getClass();
                return basketballTopTeamsStatistics6.getPoints();
            case 28:
                BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem6 = (BasketballTopTeamsStatisticsItem) obj;
                basketballTopTeamsStatisticsItem6.getClass();
                return dmi.n(basketballTopTeamsStatisticsItem6, basketballTopTeamsStatisticsItem6.getSteals());
            default:
                BasketballTopTeamsStatistics basketballTopTeamsStatistics7 = (BasketballTopTeamsStatistics) obj;
                basketballTopTeamsStatistics7.getClass();
                return basketballTopTeamsStatistics7.getTurnovers();
        }
    }
}
