package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.odds.AllOddsWithProvider;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lij;", "Lynb;", "Lcj;", "Lli;", "Lpld;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ij extends ynb {
    public final ddi l;
    public final umd m;
    public final amd n;
    public Map o;
    public final int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(Application application, ddi ddiVar, umd umdVar, amd amdVar) {
        super(application, tnb.a);
        ddiVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.l = ddiVar;
        this.m = umdVar;
        this.n = amdVar;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.o = lm5Var;
        this.p = ke0.c;
    }

    public static LinkedHashMap u(ArrayList arrayList, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String marketPeriod = ((FeaturedOddsWithProvider) next).getFeaturedOdds().getMarketPeriod();
            Object obj = linkedHashMap.get(marketPeriod);
            if (obj == null) {
                obj = wv8.n(linkedHashMap, marketPeriod);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() >= i) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.values().isEmpty()) {
            return null;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [eld] */
    public final gv9 t(String str, String str2) {
        List<qld> list = (List) this.o.get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (qld qldVar : list) {
                Map map = qldVar.c;
                if (map == null) {
                    map = qldVar.b;
                }
                if (map != null) {
                    List<FeaturedOddsWithProvider> list2 = (List) map.get(str2 == null ? "" : str2);
                    if (list2 != null) {
                        String str3 = qldVar.a;
                        r3 = str3 != null ? new m9k(str3) : null;
                        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                        for (FeaturedOddsWithProvider featuredOddsWithProvider : list2) {
                            arrayList2.add(r4a.B(i(), featuredOddsWithProvider.getCountryProvider(), featuredOddsWithProvider.getFeaturedOdds()));
                        }
                        r3 = new eld(r3, l6g.W(arrayList2));
                    }
                }
                if (r3 != null) {
                    arrayList.add(r3);
                }
            }
            gv9 W = l6g.W(arrayList);
            if (W != null) {
                return W;
            }
        }
        return rlh.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable v(Event event, OddsCountryProvider oddsCountryProvider, sq3 sq3Var) {
        fj fjVar;
        int i;
        OddsCountryProvider oddsCountryProvider2;
        AllOddsResponse allOddsResponse;
        if (sq3Var instanceof fj) {
            fjVar = (fj) sq3Var;
            int i2 = fjVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fjVar.u = i2 - Integer.MIN_VALUE;
                Object obj = fjVar.s;
                lu3 lu3Var = lu3.a;
                i = fjVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    int id = event.getId();
                    String statusType = event.getStatusType();
                    boolean shouldReverseTeams = event.shouldReverseTeams();
                    fjVar.r = oddsCountryProvider;
                    fjVar.u = 1;
                    umd umdVar = this.m;
                    umdVar.getClass();
                    obj = yaa.P(new gmd(umdVar, oddsCountryProvider, statusType, id, shouldReverseTeams, null), fjVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    oddsCountryProvider2 = oddsCountryProvider;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oddsCountryProvider2 = fjVar.r;
                    y6a.M(obj);
                }
                allOddsResponse = (AllOddsResponse) yaa.x((x2g) obj);
                if (allOddsResponse != null || (r9 = allOddsResponse.getMarkets()) == null) {
                    List<ProviderOdds> list = km5.a;
                }
                return new AllOddsWithProvider(oddsCountryProvider2, list);
            }
        }
        fjVar = new fj(this, sq3Var);
        Object obj2 = fjVar.s;
        lu3 lu3Var2 = lu3.a;
        i = fjVar.u;
        if (i != 0) {
        }
        allOddsResponse = (AllOddsResponse) yaa.x((x2g) obj2);
        if (allOddsResponse != null) {
        }
        List<ProviderOdds> list2 = km5.a;
        return new AllOddsWithProvider(oddsCountryProvider2, list2);
    }
}
