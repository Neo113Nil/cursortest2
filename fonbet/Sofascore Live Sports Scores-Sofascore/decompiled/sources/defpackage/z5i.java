package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class z5i {
    public static dld a(Context context, OddsChoice oddsChoice, String str, r9k r9kVar) {
        int i;
        zmd zmdVar;
        boolean winning = oddsChoice.getWinning();
        int change = oddsChoice.getChange();
        Integer valueOf = Integer.valueOf(change);
        if (change == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            String fractionalValue = oddsChoice.getFractionalValue();
            Double c = fractionalValue != null ? rld.c(fractionalValue) : null;
            String initialFractionalValue = oddsChoice.getInitialFractionalValue();
            Double c2 = initialFractionalValue != null ? rld.c(initialFractionalValue) : null;
            if (c != null && c2 != null) {
                if (c.doubleValue() > c2.doubleValue()) {
                    i = 1;
                } else if (c.doubleValue() < c2.doubleValue()) {
                    i = -1;
                }
            }
            i = 0;
        }
        String fractionalValue2 = oddsChoice.getFractionalValue();
        Team team = oddsChoice.getTeam();
        if (team != null) {
            int id = team.getId();
            String p = tba.p(context, team);
            Team parentTeam = team.getParentTeam();
            zmd A = parentTeam != null ? l4a.A(context, parentTeam) : null;
            Country country = team.getCountry();
            zmdVar = new zmd(id, p, A, country != null ? country.getAlpha2() : null, team.getType() == 1 ? ymd.b : ymd.a);
        } else {
            zmdVar = null;
        }
        return new dld(winning, r9kVar, i, fractionalValue2, str, zmdVar);
    }

    public static dld b(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds, List list, String str) {
        Object obj;
        zmd zmdVar;
        zmd zmdVar2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(OddsChoice.getReversibleName$default((OddsChoice) obj, null, 1, null), str)) {
                break;
            }
        }
        OddsChoice oddsChoice = (OddsChoice) obj;
        if (oddsChoice != null) {
            return a(context, oddsChoice, rld.k(context, oddsCountryProvider, providerOdds, oddsChoice), null);
        }
        Team team = ((OddsChoice) CollectionsKt.Y(list)).getTeam();
        if (team != null) {
            int id = team.getId();
            String p = tba.p(context, team);
            Team parentTeam = team.getParentTeam();
            if (parentTeam != null) {
                int id2 = parentTeam.getId();
                String p2 = tba.p(context, parentTeam);
                Team parentTeam2 = parentTeam.getParentTeam();
                zmd A = parentTeam2 != null ? l4a.A(context, parentTeam2) : null;
                Country country = parentTeam.getCountry();
                zmdVar2 = new zmd(id2, p2, A, country != null ? country.getAlpha2() : null, parentTeam.getType() == 1 ? ymd.b : ymd.a);
            } else {
                zmdVar2 = null;
            }
            Country country2 = team.getCountry();
            zmdVar = new zmd(id, p, zmdVar2, country2 != null ? country2.getAlpha2() : null, team.getType() == 1 ? ymd.b : ymd.a);
        } else {
            zmdVar = null;
        }
        return new dld(false, null, 0, null, null, zmdVar);
    }

    public static g6i c(Context context, ProviderOdds providerOdds, OddsCountryProvider oddsCountryProvider, Stage stage, d6i d6iVar) {
        boolean z;
        int marketId;
        Iterator it;
        fgf fgfVar;
        List list;
        List<OddsChoice> choices;
        if (b.j(Integer.valueOf(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), 112).contains(Integer.valueOf(providerOdds.getMarketId())) && ((choices = providerOdds.getChoices()) == null || !choices.isEmpty())) {
            Iterator<T> it2 = choices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                z = true;
                if (Intrinsics.c(OddsChoice.getReversibleName$default((OddsChoice) it2.next(), null, 1, null), "Yes")) {
                    List<OddsChoice> choices2 = providerOdds.getChoices();
                    if (choices2 == null || !choices2.isEmpty()) {
                        Iterator<T> it3 = choices2.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.c(OddsChoice.getReversibleName$default((OddsChoice) it3.next(), null, 1, null), "No")) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        z = false;
        if (providerOdds.getMarketId() == 129) {
            int marketId2 = providerOdds.getMarketId();
            Stage stage2 = providerOdds.getStage();
            marketId = yid.m(stage2 != null ? Integer.valueOf(stage2.getId()) : null) + marketId2;
        } else {
            marketId = providerOdds.getMarketId();
        }
        int i = marketId;
        r9k l = Intrinsics.c(stage.getSportSlug(), Sports.CYCLING) ? ug5.l(providerOdds) : ug5.r(2, Integer.valueOf(providerOdds.getMarketId()), false);
        gv9 W = z ? l6g.W(b.j(new q9k(R.string.yes), new q9k(R.string.no))) : null;
        List<OddsChoice> choices3 = providerOdds.getChoices();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : choices3) {
            Team team = ((OddsChoice) obj).getTeam();
            Object obj2 = linkedHashMap.get(team);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(team, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = linkedHashMap.entrySet().iterator();
        while (it4.hasNext()) {
            Object value = ((Map.Entry) it4.next()).getValue();
            if (((List) value).isEmpty()) {
                value = null;
            }
            List<OddsChoice> list2 = (List) value;
            if (list2 != null) {
                m9k m9kVar = new m9k(providerOdds.getMarketName());
                int marketId3 = providerOdds.getMarketId();
                boolean isLive = providerOdds.isLive();
                if (z) {
                    list = b.j(b(context, oddsCountryProvider, providerOdds, list2, "Yes"), b(context, oddsCountryProvider, providerOdds, list2, "No"));
                } else {
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    for (OddsChoice oddsChoice : list2) {
                        arrayList2.add(a(context, oddsChoice, rld.k(context, oddsCountryProvider, providerOdds, oddsChoice), null));
                        it4 = it4;
                    }
                    list = arrayList2;
                }
                it = it4;
                fgfVar = new fgf(-1, m9kVar, marketId3, isLive, l6g.W(list), (ProviderOdds.Type) null, (String) null, 224);
            } else {
                it = it4;
                fgfVar = null;
            }
            if (fgfVar != null) {
                arrayList.add(fgfVar);
            }
            it4 = it;
        }
        gv9 W2 = l6g.W(arrayList);
        wmd D = w3a.D(context, stage);
        OddsProvider provider = oddsCountryProvider.getProvider();
        provider.getClass();
        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
        String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
        if (defaultBetSlipLink == null) {
            defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
        }
        return new g6i(i, l, d6iVar, W, W2, D, new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()));
    }
}
